package com.github.catvod.utils;

import static fi.iki.elonen.NanoHTTPD.newFixedLengthResponse;

import android.os.SystemClock;

import com.github.catvod.net.OkHttp;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.HashMap;
import java.util.Locale;
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

public class MultiThreadedDownloader {

    //已开始下载的 chunk 队列
    private final BlockingQueue<Chunk> readyChunkQueue;
    private final Map<String, String> headers;
    private final String url;
    private final Lock lock;
    //最多缓存多少个未被取走的chunk
    private final int maxBufferedChunk = 1024;
    //线程数
    private final int numThreads;
    //读超时
    private final int timeout = 10;
    //每个线程每轮下载的字节数
    private int chunkSize = 1024 * 64;
    //下载起始的偏移量
    private long startOffset = -1;
    //下载结束的偏移量
    private long endOffset = -1;
    //当前读取的偏移量
    private long currentOffset = -1;
    //下一个 chunk 的起始偏移量
    private long nextChunkStartOffset = -1;
    //多线程是否在运行中
    private boolean running;

    public MultiThreadedDownloader(String url, Map<String, String> headers, int numThreads) {
        this.url = url;
        this.headers = headers;
        this.numThreads = numThreads;
        this.lock = new ReentrantLock();
        this.readyChunkQueue = new LinkedBlockingQueue<>();
    }

    //开始下载
    public NanoHTTPD.Response start() throws Exception {
        //确保请求header包含Range
        NanoHTTPD.Response.Status status = NanoHTTPD.Response.Status.PARTIAL_CONTENT;
        if (!headers.containsKey("Range")) {
            headers.put("Range", "bytes=0-");
            status = NanoHTTPD.Response.Status.OK;
        }

        //尝试从Range判断下载的起始偏移量和结束偏移量
        Matcher matcher = Pattern.compile("bytes=(\\d+)-(\\d+)?").matcher(headers.get("Range"));
        if (matcher.find()) {
            startOffset = Long.parseLong(matcher.group(1));
            if (matcher.group(2) != null) {
                endOffset = Long.parseLong(matcher.group(2));
            }
        } else {
            throw new Exception("invalid Range: " + headers.get("Range"));
        }

        nextChunkStartOffset = startOffset;
        currentOffset = startOffset;

        //建立连接
        Response response = OkHttp.newCall(getDownloadUrl(), headers);

        //尽早关闭连接，我们不需要body的数据
        if (response.body() != null) response.body().close();

        //检查状态码
        int responseCode = response.code();
        if (responseCode < 200 || responseCode >= 300) {
            throw new Exception("response code: " + responseCode);
        }

        //获取header
        String contentType = response.headers().get("Content-Type");
        String contentDisposition = response.headers().get("Content-Disposition");
        if (contentDisposition != null) contentType = Utils.getMimeType(contentDisposition);
        if (contentType == null) throw new Exception("missing response header: Content-Type");
        String hContentLength = response.headers().get("Content-Length");
        if (hContentLength == null) throw new Exception("missing response header: Content-Length");
        long contentLength = Long.parseLong(hContentLength);

        //尝试从Content-Range获取下载结束的偏移量
        if (endOffset <= 0) {
            String hContentRange = response.headers().get("Content-Range");
            if (hContentRange != null) {
                matcher = Pattern.compile(".*/(\\d+)").matcher(hContentRange);
                if (matcher.find()) {
                    endOffset = Long.parseLong(matcher.group(1)) - 1;
                } else {
                    throw new Exception("invalid `Content-Range`: " + hContentRange);
                }
            } else {
                throw new Exception("missing response header: Content-Range");
            }
        }

        //如果下载的内容过小，那么减少chunkSize，使得每个线程刚好只需要下载一轮
        long downloadSize = endOffset - startOffset + 1;
        long onetimeChunkSize = downloadSize / numThreads + 1;
        if (chunkSize > onetimeChunkSize) {
            chunkSize = (int) onetimeChunkSize;
        }

        //开启多线程下载
        running = true;
        for (int i = 0; i < numThreads; ++i) {
            new Thread(MultiThreadedDownloader.this::worker).start();
        }

        //构造response
        PipedInputStream input = new PipedInputStream();
        PipedOutputStream output = new PipedOutputStream(input);
        NanoHTTPD.Response mResponse = newFixedLengthResponse(status, contentType, input, contentLength);
        for (String key : response.headers().names()) {
            String value = response.headers().get(key);
            if (!key.equalsIgnoreCase("Content-Type") && !key.equalsIgnoreCase("Content-Length")) {
                mResponse.addHeader(key, value);
            }
        }

        //搬运数据流
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

    //读取文件内容
    private byte[] read() throws Exception {
        //判断文件是否下载结束
        if (currentOffset > endOffset) {
            stop();
            return null;
        }

        //获取当前的chunk的数据
        Chunk currentChunk = readyChunkQueue.poll(timeout, TimeUnit.SECONDS);
        if (currentChunk == null) {
            stop();
            throw new Exception("read timeout");
        }

        while (running) {
            byte[] buffer = currentChunk.get();
            if (buffer != null) {
                currentOffset += buffer.length;
                return buffer;
            } else {
                SystemClock.sleep(100);
            }
        }

        return null;
    }

    private void worker() {
        while (running) {
            //生成下一个chunk
            Chunk chunk = null;
            lock.lock();
            long startOffset = nextChunkStartOffset;
            nextChunkStartOffset += chunkSize;
            if (startOffset <= endOffset) {
                long endOffset = startOffset + chunkSize - 1;
                if (endOffset > this.endOffset) {
                    endOffset = this.endOffset;
                }
                chunk = new Chunk(startOffset, endOffset);
                readyChunkQueue.add(chunk);
            }
            lock.unlock();

            //所有chunk已下载完
            if (chunk == null) {
                break;
            }

            while (running) {
                //过多的数据未被取走，先休息一下，避免内存溢出
                if (chunk.startOffset - currentOffset >= (long) chunkSize * maxBufferedChunk) {
                    SystemClock.sleep(1000);
                } else {
                    break;
                }
            }

            while (running) {
                try {
                    //建立连接
                    Map<String, String> mHeaders = new HashMap<>();
                    for (Map.Entry<String, String> entry : headers.entrySet()) {
                        if (entry.getKey().equalsIgnoreCase("Range")) {
                            //设置下载范围
                            mHeaders.put("Range", String.format(Locale.getDefault(), "bytes=%d-%d", chunk.startOffset, chunk.endOffset));
                        } else {
                            mHeaders.put(entry.getKey(), entry.getValue());
                        }
                    }
                    Response response = OkHttp.newCall(getDownloadUrl(), mHeaders);

                    //检查状态码
                    int responseCode = response.code();
                    if (responseCode < 200 || responseCode >= 300) {
                        throw new Exception("response code: " + responseCode);
                    }
                    //接收数据
                    if (response.body() != null) {
                        chunk.put(response.body().bytes());
                    }

                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                    SystemClock.sleep(1000);
                }
            }
        }
    }

    private String getDownloadUrl() {
        if (url.contains("/proxy?")) {
            return OkHttp.string(url);
        } else {
            return url;
        }
    }

    public void stop() {
        running = false;
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