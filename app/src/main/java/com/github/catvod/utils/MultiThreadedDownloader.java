package com.github.catvod.utils;

import static java.lang.Thread.sleep;
import static fi.iki.elonen.NanoHTTPD.newFixedLengthResponse;

import com.github.catvod.net.OkHttp;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import fi.iki.elonen.NanoHTTPD;
import okhttp3.Response;

// 多线程内存下载器
public class MultiThreadedDownloader {

    private String url; // 资源URL
    private Map<String, String> headers; // HTTP Headers. 主要关注`Range-Bytes`这个字段.
    private int chunkSize = 1024 * 128; // 每个线程每轮下载的字节数.
    private int maxBufferedChunk = 1024; // 最多缓存多少个未被取走的chunk. 避免内存溢出. 过多chunk未被取走时，下载线程可以暂时休息等待.
    private int numThreads; // 线程数.
    private int timeout = 10; // 读超时（秒）
    private boolean running = false; // 多线程是否在运行中.
    private long startOffset = -1; // 下载起始的偏移量.
    private long endOffset = -1; // 下载结束的偏移量.
    private long currentOffset = -1; // 当前读取的偏移量.
    private long nextChunkStartOffset = -1; // 下一个chunk的起始偏移量.
    private BlockingQueue<Chunk> readyChunkQueue = new LinkedBlockingQueue<>(); // 已开始下载的chunk队列（有序）.
    private Lock lock = new ReentrantLock(); // 锁.

    public MultiThreadedDownloader(String url, Map<String, String> headers, int numThreads) {
        this.url = url;
        this.headers = headers;
        this.numThreads = numThreads;
    }

    // 开始下载
    public NanoHTTPD.Response start() throws Exception {
        // 确保请求header包含Range
        NanoHTTPD.Response.Status status = NanoHTTPD.Response.Status.PARTIAL_CONTENT;
        if (!this.headers.containsKey("Range")) {
            this.headers.put("Range", "bytes=0-");
            status = NanoHTTPD.Response.Status.OK;
        }

        // 尝试从Range判断下载的起始偏移量和结束偏移量
        Matcher matcher = Pattern.compile("bytes=(\\d+)-(\\d+)?").matcher(this.headers.get("Range"));
        if (matcher.find()) {
            this.startOffset = Long.parseLong(matcher.group(1));
            if (matcher.group(2) != null) {
                this.endOffset = Long.parseLong(matcher.group(2));
            }
        } else {
            throw new Exception("invalid Range: " + this.headers.get("Range"));
        }

        this.nextChunkStartOffset = this.startOffset;
        this.currentOffset = this.startOffset;

        // 建立连接
        Map<String, String> mHeaders = new HashMap<>();
        for (Map.Entry<String, String> entry : this.headers.entrySet()) {
            if (!shouldFilterRequestHeaderKey(entry.getKey())) {
                mHeaders.put(entry.getKey(), entry.getValue());
            }
        }
        Response response = OkHttp.newCall(getDownloadUrl(), mHeaders);

        // 尽早关闭连接，我们不需要body的数据
        response.body().close();

        // 检查状态码
        int responseCode = response.code();
        if (responseCode < 200 || responseCode >= 300) {
            throw new Exception("response code: " + responseCode);
        }

        // 获取header
        String contentType = response.headers().get("Content-Type");
        String contentDisposition = response.headers().get("Content-Disposition");
        if (contentDisposition != null) {
            if (contentDisposition.endsWith(".mp4")) {
                contentType = "video/mp4";
            } else if (contentDisposition.endsWith(".webm")) {
                contentType = "video/webm";
            } else if (contentDisposition.endsWith(".avi")) {
                contentType = "video/x-msvideo";
            } else if (contentDisposition.endsWith(".wmv")) {
                contentType = "video/x-ms-wmv";
            } else if (contentDisposition.endsWith(".flv")) {
                contentType = "video/x-flv";
            } else if (contentDisposition.endsWith(".mov")) {
                contentType = "video/quicktime";
            } else if (contentDisposition.endsWith(".mkv")) {
                contentType = "video/x-matroska";
            } else if (contentDisposition.endsWith(".mpeg")) {
                contentType = "video/mpeg";
            } else if (contentDisposition.endsWith(".3gp")) {
                contentType = "video/3gpp";
            }
        }
        if (contentType == null) {
            throw new Exception("missing response header: Content-Type");
        }

        String hContentLength = response.headers().get("Content-Length");
        if (hContentLength == null) {
            throw new Exception("missing response header: Content-Length");
        }
        long contentLength = Long.parseLong(hContentLength);

        // 尝试从Content-Range获取下载结束的偏移量
        if (this.endOffset <= 0) {
            String hContentRange = response.headers().get("Content-Range");
            if (hContentRange != null) {
                matcher = Pattern.compile(".*/(\\d+)").matcher(hContentRange);
                if (matcher.find()) {
                    this.endOffset = Long.parseLong(matcher.group(1)) - 1;
                } else {
                    throw new Exception("invalid `Content-Range`: " + hContentRange);
                }
            } else {
                throw new Exception("missing response header: Content-Range");
            }
        }

        // 如果下载的内容过小，那么减少chunkSize，使得每个线程刚好只需要下载一轮
        long downloadSize = this.endOffset - this.startOffset + 1;
        long onetimeChunkSize = downloadSize / this.numThreads + 1;
        if (this.chunkSize > onetimeChunkSize) {
            this.chunkSize = (int) onetimeChunkSize;
        }

        // 开启多线程下载
        this.running = true;
        for (int i = 0; i < this.numThreads; ++i) {
            new Thread(MultiThreadedDownloader.this::worker).start();
        }

        // 构造response
        PipedInputStream input = new PipedInputStream();
        PipedOutputStream output = new PipedOutputStream(input);
        NanoHTTPD.Response mResponse = newFixedLengthResponse(status, contentType, input, contentLength);
        for (String key : response.headers().names()) {
            String value = response.headers().get(key);
            if (!key.equalsIgnoreCase("Content-Type") && !key.equalsIgnoreCase("Content-Length")) {
                mResponse.addHeader(key, value);
            }
        }

        // 搬运数据流
        new Thread(() -> {
            try {
                while (true) {
                    byte[] buffer = read();
                    if (buffer == null || buffer.length == 0) {
                        break;
                    }
                    output.write(buffer);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    stop();
                    output.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();

        return mResponse;
    }

    // 读取文件内容
    private byte[] read() throws Exception {
        // 判断文件是否下载结束
        if (this.currentOffset > this.endOffset) {
            this.stop();
            return null;
        }

        // 获取当前的chunk的数据
        Chunk currentChunk = this.readyChunkQueue.poll(this.timeout, TimeUnit.SECONDS);
        if (currentChunk == null) {
            this.stop();
            throw new Exception("read timeout");
        }

        while (this.running) {
            byte[] buffer = currentChunk.get();
            if (buffer != null) {
                this.currentOffset += buffer.length;
                return buffer;
            } else {
                try {
                    sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        return null;
    }

    private void worker() {
        while (this.running) {
            // 生成下一个chunk
            Chunk chunk = null;
            this.lock.lock();
            long startOffset = this.nextChunkStartOffset;
            this.nextChunkStartOffset += this.chunkSize;
            if (startOffset <= this.endOffset) {
                long endOffset = startOffset + this.chunkSize - 1;
                if (endOffset > this.endOffset) {
                    endOffset = this.endOffset;
                }
                chunk = new Chunk(startOffset, endOffset);
                this.readyChunkQueue.add(chunk);
            }
            this.lock.unlock();

            // 所有chunk已下载完
            if (chunk == null) {
                break;
            }

            while (this.running) {
                // 过多的数据未被取走，先休息一下，避免内存溢出
                if (chunk.startOffset - this.currentOffset >= this.chunkSize * this.maxBufferedChunk) {
                    try {
                        sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }

            while (this.running) {
                try {
                    // 建立连接
                    Map<String, String> mHeaders = new HashMap<>();
                    for (Map.Entry<String, String> entry : this.headers.entrySet()) {
                        if (!shouldFilterRequestHeaderKey(entry.getKey())) {
                            if (entry.getKey().equalsIgnoreCase("Range")) {
                                // 设置下载范围
                                mHeaders.put("Range", String.format("bytes=%d-%d", chunk.startOffset, chunk.endOffset));
                            } else {
                                mHeaders.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    Response response = OkHttp.newCall(getDownloadUrl(), mHeaders);

                    // 检查状态码
                    int responseCode = response.code();
                    if (responseCode < 200 || responseCode >= 300) {
                        throw new Exception("response code: " + responseCode);
                    }

                    // 接收数据
                    byte[] buffer = response.body().bytes();
                    chunk.put(buffer);
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                    try {
                        sleep(1000);
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
                }
            }
        }
    }

    private String getDownloadUrl() {
        if (this.url.contains("/proxy?")) {
            return OkHttp.string(this.url);
        } else {
            return this.url;
        }
    }

    private boolean shouldFilterRequestHeaderKey(String key) {
        if (key == null) return true;
        key = key.toLowerCase();
        return key.equals("host") || key.equals("http-client-ip") || key.equals("remote-addr");
    }

    public void stop() {
        this.running = false;
    }

    private static class Chunk {

        private final long startOffset;
        private final long endOffset;
        private byte[] buffer;

        public Chunk(long startOffset, long endOffset) {
            this.startOffset = startOffset;
            this.endOffset = endOffset;
        }

        public byte[] get() {
            return buffer;
        }

        public void put(byte[] buffer) throws InterruptedException {
            this.buffer = buffer;
        }
    }
}