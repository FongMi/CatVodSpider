package com.github.catvod.spider.merge.FM.o;

import android.os.SystemClock;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.FM.b.RunnableC0312g;
import com.github.catvod.spider.merge.FM.m.C0378c;
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

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.o.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0392h {
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
    private final BlockingQueue<C0391g> a = new LinkedBlockingQueue();

    public C0392h(String str, Map<String, String> map, int i, int i2) {
        this.d = str;
        this.b = map;
        this.g = i;
        this.c = Executors.newFixedThreadPool(i);
        this.h = i2;
        this.f = (int) Math.ceil(73400320 / i2);
    }

    public static void a(C0392h c0392h, PipedOutputStream pipedOutputStream) {
        c0392h.getClass();
        while (true) {
            try {
                try {
                    try {
                        byte[] bArrE = c0392h.e();
                        if (bArrE == null || bArrE.length == 0) {
                            break;
                        } else {
                            pipedOutputStream.write(bArrE);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        c0392h.m = false;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            } catch (Throwable th) {
                try {
                    c0392h.m = false;
                    pipedOutputStream.close();
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                throw th;
            }
        }
        c0392h.m = false;
        pipedOutputStream.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040 A[LOOP:1: B:18:0x0040->B:22:0x0059, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(com.github.catvod.spider.merge.FM.o.C0392h r28, int r29) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.FM.o.C0392h.b(com.github.catvod.spider.merge.FM.o.h, int):void");
    }

    private String d() {
        return this.d.contains("/proxy?") ? C0378c.n(this.d, null) : this.d;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.concurrent.BlockingQueue<com.github.catvod.spider.merge.FM.o.g>, java.util.concurrent.LinkedBlockingQueue] */
    private byte[] e() throws Exception {
        if (this.k > this.j) {
            this.m = false;
            return null;
        }
        C0391g c0391g = (C0391g) this.a.poll(10L, TimeUnit.SECONDS);
        if (c0391g == null) {
            this.m = false;
            throw new Exception("read timeout");
        }
        while (this.m) {
            byte[] bArrC = c0391g.c();
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
        Response responseE = C0378c.e(d(), this.b);
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
            Matcher matcherA = com.github.catvod.spider.merge.FM.b.s.a(new byte[]{96, 61, 58, -15, 11, -120, 110, 66}, new byte[]{78, 23, 21, -39, 87, -20, 69, 107}, str2);
            if (!matcherA.find()) {
                throw new Exception(com.github.catvod.spider.merge.FM.b.r.b(new byte[]{-106, -21, -34, -21, 2, 10, -15, -50, -97, -58, -57, -28, 26, 6, -5, -102, -46, -41, -55, -28, 9, 6, -11, -44, -33}, new byte[]{-1, -123, -88, -118, 110, 99, -107, -18}, new StringBuilder(), str2));
            }
            this.j = Long.parseLong(matcherA.group(1)) - 1;
        }
        final int i2 = this.h;
        int i3 = this.g;
        long j2 = this.i;
        if (j2 == 0 || this.j - j2 <= 1048576) {
            i3 = 3;
            i = 66560;
        } else {
            i = i2;
        }
        long j3 = (((this.j - j2) + 1) / ((long) i3)) + 1;
        if (i > j3) {
            i2 = (int) j3;
        }
        this.m = true;
        for (int i4 = 0; i4 < i3; i4++) {
            this.c.execute(new Runnable() { // from class: com.github.catvod.spider.merge.FM.o.f
                @Override // java.lang.Runnable
                public final void run() {
                    C0392h.b(this.a, i2);
                }
            });
        }
        PipedInputStream pipedInputStream = new PipedInputStream();
        Init.execute(new RunnableC0312g(this, new PipedOutputStream(pipedInputStream), 1));
        return new Object[]{206, "application/oct-stream", pipedInputStream, this.b};
    }
}
