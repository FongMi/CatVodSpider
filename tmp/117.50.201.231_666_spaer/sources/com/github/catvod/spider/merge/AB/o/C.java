package com.github.catvod.spider.merge.AB.o;

import android.os.SystemClock;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.AB.b.RunnableC0088i;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Response;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C {
    private final Map<String, String> b;
    private final ExecutorService c;
    private final String d;
    private final int f;
    private final int g;
    private final int h;
    private boolean m;
    private long i = -1;
    private long j = -1;
    private long k = -1;
    private long l = -1;
    private final ReentrantLock e = new ReentrantLock();
    private final BlockingQueue<B> a = new LinkedBlockingQueue();

    public C(String str, Map<String, String> map, int i, int i2) {
        this.d = str;
        this.b = map;
        this.g = i;
        this.c = Executors.newFixedThreadPool(i);
        this.h = i2;
        this.f = (int) Math.ceil(73400320 / i2);
    }

    public static void a(C c, PipedOutputStream pipedOutputStream) {
        c.getClass();
        while (true) {
            try {
                try {
                    byte[] bArrE = c.e();
                    if (bArrE != null && bArrE.length != 0) {
                        pipedOutputStream.write(bArrE);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Throwable th) {
                try {
                    c.m = false;
                    pipedOutputStream.close();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                throw th;
            }
        }
        try {
            c.m = false;
            pipedOutputStream.close();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d A[LOOP:1: B:19:0x003d->B:23:0x0055, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0102 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(com.github.catvod.spider.merge.AB.o.C r11, int r12) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.AB.o.C.b(com.github.catvod.spider.merge.AB.o.C, int):void");
    }

    private String d() {
        boolean zContains = this.d.contains("/proxy?");
        String str = this.d;
        return zContains ? com.github.catvod.spider.merge.AB.m.c.l(str, null) : str;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.concurrent.BlockingQueue<com.github.catvod.spider.merge.AB.o.B>, java.util.concurrent.LinkedBlockingQueue] */
    private byte[] e() throws Exception {
        if (this.k > this.j) {
            this.m = false;
            return null;
        }
        B b = (B) this.a.poll(10L, TimeUnit.SECONDS);
        if (b == null) {
            this.m = false;
            throw new Exception("read timeout");
        }
        while (this.m) {
            byte[] bArrC = b.c();
            if (bArrC != null) {
                this.k += (long) bArrC.length;
                return bArrC;
            }
            SystemClock.sleep(100L);
        }
        return null;
    }

    public final void c() {
        this.m = false;
        this.c.shutdownNow();
    }

    public final Object[] f() throws Exception {
        int i;
        if (!this.b.containsKey("Range")) {
            this.b.put("Range", "bytes=0-");
        }
        Matcher matcher = Pattern.compile("bytes=(\\d+)-(\\d+)?").matcher(this.b.get("Range"));
        if (!matcher.find()) {
            throw new Exception("invalid Range: " + this.b.get("Range"));
        }
        this.i = Long.parseLong(matcher.group(1));
        if (matcher.group(2) != null) {
            this.j = Long.parseLong(matcher.group(2));
        }
        long j = this.i;
        this.l = j;
        this.k = j;
        Response responseE = com.github.catvod.spider.merge.AB.m.c.e(d(), this.b);
        if (responseE.body() != null) {
            responseE.body().close();
        }
        int iCode = responseE.code();
        if (iCode < 200 || iCode >= 300) {
            throw new Exception("response code: " + iCode);
        }
        SpiderDebug.log("video-start: : responseCode" + iCode);
        SpiderDebug.log("video-start: headers: " + responseE.headers());
        String str = responseE.headers().get("Content-Length");
        if (str == null) {
            throw new Exception("missing response header: Content-Length");
        }
        Long.parseLong(str);
        if (this.j <= 0) {
            String str2 = responseE.headers().get("Content-Range");
            if (str2 == null) {
                throw new Exception("missing response header: Content-Range");
            }
            Matcher matcher2 = Pattern.compile(".*/(\\d+)").matcher(str2);
            if (!matcher2.find()) {
                throw new Exception(com.github.catvod.spider.merge.AB.b.u.b(new byte[]{-92, -60, 65, -113, 77, -99, -79, 18, -83, -23, 88, -128, 85, -111, -69, 70, -32, -8, 86, -128, 70, -111, -75, 8, -19}, new byte[]{-51, -86, 55, -18, 33, -12, -43, 50}, new StringBuilder(), str2));
            }
            this.j = Long.parseLong(matcher2.group(1)) - 1;
        }
        final int i2 = this.h;
        int i3 = this.g;
        long j2 = this.i;
        if (j2 == 0 || this.j - j2 <= 1048576) {
            i = 66560;
            i3 = 3;
        } else {
            i = i2;
        }
        long j3 = (((this.j - j2) + 1) / ((long) i3)) + 1;
        if (i > j3) {
            i2 = (int) j3;
        }
        this.m = true;
        for (int i4 = 0; i4 < i3; i4++) {
            this.c.execute(new Runnable(this, i2) { // from class: com.github.catvod.spider.merge.AB.o.A
                public final C a;
                public final int b;

                {
                    this.a = this;
                    this.b = i2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C.b(this.a, this.b);
                }
            });
        }
        PipedInputStream pipedInputStream = new PipedInputStream();
        Init.execute(new RunnableC0088i(this, new PipedOutputStream(pipedInputStream), 3));
        return new Object[]{206, "application/oct-stream", pipedInputStream, this.b};
    }
}
