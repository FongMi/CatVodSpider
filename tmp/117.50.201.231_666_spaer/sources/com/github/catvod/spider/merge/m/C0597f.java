package com.github.catvod.spider.merge.m;

import android.os.SystemClock;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.a.C0531c;
import com.github.catvod.spider.merge.b.RunnableC0540d;
import com.github.catvod.spider.merge.k.C0575b;
import com.github.catvod.spider.merge.m.C0597f;
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

/* JADX INFO: renamed from: com.github.catvod.spider.merge.m.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0597f {
    private final Map<String, String> b;
    private final ExecutorService c;
    private final String d;
    private final int f;
    private final int g;
    private int h;
    private boolean m;
    private long i = -1;
    private long j = -1;
    private long k = -1;
    private long l = -1;
    private final ReentrantLock e = new ReentrantLock();
    private final BlockingQueue<a> a = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.m.f$a */
    private static class a {
        private final long a;
        private final long b;
        private byte[] c;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public final byte[] c() {
            return this.c;
        }

        public final void d(byte[] bArr) {
            this.c = bArr;
        }
    }

    public C0597f(String str, Map<String, String> map, int i, int i2) {
        this.d = str;
        this.b = map;
        this.g = i;
        this.c = Executors.newFixedThreadPool(i);
        this.h = i2;
        this.f = (int) Math.ceil(73400320 / i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[LOOP:1: B:18:0x003f->B:22:0x0058, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0104 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(com.github.catvod.spider.merge.m.C0597f r13) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.m.C0597f.a(com.github.catvod.spider.merge.m.f):void");
    }

    public static void b(C0597f c0597f, PipedOutputStream pipedOutputStream) {
        c0597f.getClass();
        while (true) {
            try {
                try {
                    try {
                        byte[] bArrD = c0597f.d();
                        if (bArrD == null || bArrD.length == 0) {
                            break;
                        } else {
                            pipedOutputStream.write(bArrD);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        c0597f.m = false;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            } catch (Throwable th) {
                try {
                    c0597f.m = false;
                    pipedOutputStream.close();
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                throw th;
            }
        }
        c0597f.m = false;
        pipedOutputStream.close();
    }

    private String c() {
        return this.d.contains("/proxy?") ? C0575b.l(this.d, null) : this.d;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.concurrent.BlockingQueue<com.github.catvod.spider.merge.m.f$a>, java.util.concurrent.LinkedBlockingQueue] */
    private byte[] d() throws Exception {
        if (this.k > this.j) {
            this.m = false;
            return null;
        }
        a aVar = (a) this.a.poll(10L, TimeUnit.SECONDS);
        if (aVar == null) {
            this.m = false;
            throw new Exception("read timeout");
        }
        while (this.m) {
            byte[] bArrC = aVar.c();
            if (bArrC != null) {
                this.k += (long) bArrC.length;
                return bArrC;
            }
            SystemClock.sleep(100L);
        }
        return null;
    }

    public final Object[] e() throws Exception {
        int i;
        if (this.b.containsKey("Range")) {
            i = 206;
        } else {
            this.b.put("Range", "bytes=0-");
            i = 200;
        }
        Matcher matcher = Pattern.compile("bytes=(\\d+)-(\\d+)?").matcher(this.b.get("Range"));
        if (!matcher.find()) {
            StringBuilder sbA = C0529a.a("invalid Range: ");
            sbA.append(this.b.get("Range"));
            throw new Exception(sbA.toString());
        }
        final int i2 = 1;
        this.i = Long.parseLong(matcher.group(1));
        if (matcher.group(2) != null) {
            this.j = Long.parseLong(matcher.group(2));
        }
        long j = this.i;
        this.l = j;
        this.k = j;
        Response responseD = C0575b.d(c(), this.b);
        if (responseD.body() != null) {
            responseD.body().close();
        }
        int iCode = responseD.code();
        if (iCode < 200 || iCode >= 300) {
            throw new Exception("response code: " + iCode);
        }
        String str = responseD.headers().get("Content-Length");
        if (str == null) {
            throw new Exception("missing response header: Content-Length");
        }
        Long.parseLong(str);
        if (this.j <= 0) {
            String str2 = responseD.headers().get("Content-Range");
            if (str2 == null) {
                throw new Exception("missing response header: Content-Range");
            }
            Matcher matcher2 = Pattern.compile(".*/(\\d+)").matcher(str2);
            if (!matcher2.find()) {
                throw new Exception(C0531c.a("invalid `Content-Range`: ", str2));
            }
            this.j = Long.parseLong(matcher2.group(1)) - 1;
        }
        long j2 = (((this.j - this.i) + 1) / ((long) this.g)) + 1;
        if (this.h > j2) {
            this.h = (int) j2;
        }
        this.m = true;
        for (int i3 = 0; i3 < this.g; i3++) {
            this.c.execute(new RunnableC0540d(this, 2));
        }
        PipedInputStream pipedInputStream = new PipedInputStream();
        final PipedOutputStream pipedOutputStream = new PipedOutputStream(pipedInputStream);
        Init.execute(new Runnable() { // from class: com.github.catvod.spider.merge.b.o
            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        ((w) this).d((String) pipedOutputStream, true);
                        break;
                    default:
                        C0597f.b((C0597f) this, (PipedOutputStream) pipedOutputStream);
                        break;
                }
            }
        });
        return new Object[]{Integer.valueOf(i), "application/oct-stream", pipedInputStream, this.b};
    }
}
