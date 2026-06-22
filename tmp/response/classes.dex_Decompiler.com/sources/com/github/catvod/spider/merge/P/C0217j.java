package com.github.catvod.spider.merge.p;

import android.os.SystemClock;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0134u;
import com.github.catvod.spider.merge.b.RunnableC0124j;
import com.github.catvod.spider.merge.n.C0197c;
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

/* JADX INFO: renamed from: com.github.catvod.spider.merge.p.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0217j {
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
    private final BlockingQueue<C0216i> a = new LinkedBlockingQueue();

    public C0217j(String str, Map<String, String> map, int i, int i2) {
        this.d = str;
        this.b = map;
        this.g = i;
        this.c = Executors.newFixedThreadPool(i);
        this.h = i2;
        this.f = (int) Math.ceil(73400320 / i2);
    }

    public static void a(C0217j c0217j, PipedOutputStream pipedOutputStream) {
        c0217j.getClass();
        while (true) {
            try {
                try {
                    try {
                        byte[] bArrE = c0217j.e();
                        if (bArrE == null || bArrE.length == 0) {
                            break;
                        } else {
                            pipedOutputStream.write(bArrE);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        c0217j.m = false;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            } catch (Throwable th) {
                try {
                    c0217j.m = false;
                    pipedOutputStream.close();
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                throw th;
            }
        }
        c0217j.m = false;
        pipedOutputStream.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040 A[LOOP:1: B:18:0x0040->B:22:0x0059, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x023d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(com.github.catvod.spider.merge.p.C0217j r25, int r26) {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p.C0217j.b(com.github.catvod.spider.merge.p.j, int):void");
    }

    private String d() {
        return this.d.contains(C0098a.a(new byte[]{-71, 103, -92, -11, -55, -84, -53}, new byte[]{-106, 23, -42, -102, -79, -43, -12, -39})) ? C0197c.l(this.d, null) : this.d;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.concurrent.BlockingQueue<com.github.catvod.spider.merge.p.i>, java.util.concurrent.LinkedBlockingQueue] */
    private byte[] e() throws Exception {
        if (this.k > this.j) {
            this.m = false;
            return null;
        }
        C0216i c0216i = (C0216i) this.a.poll(10L, TimeUnit.SECONDS);
        if (c0216i == null) {
            this.m = false;
            throw new Exception(C0098a.a(new byte[]{5, -86, -31, 112, 12, -26, -8, -27, 18, -96, -11, 96}, new byte[]{119, -49, -128, 20, 44, -110, -111, -120}));
        }
        while (this.m) {
            byte[] bArrC = c0216i.c();
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
        if (!this.b.containsKey(C0098a.a(new byte[]{104, 49, 50, -17, -121}, new byte[]{58, 80, 92, -120, -30, -16, -102, 16}))) {
            this.b.put(C0098a.a(new byte[]{33, -55, 87, 118, 19}, new byte[]{115, -88, 57, 17, 118, 120, 5, -98}), C0098a.a(new byte[]{-109, 49, 15, -4, -119, 59, -12, 59}, new byte[]{-15, 72, 123, -103, -6, 6, -60, 22}));
        }
        Matcher matcher = Pattern.compile(C0098a.a(new byte[]{-92, -91, -118, 73, 77, 84, -121, 120, -94, -9, -41, 1, 22, 53, -53, 15, -17, -29}, new byte[]{-58, -36, -2, 44, 62, 105, -81, 36})).matcher(this.b.get(C0098a.a(new byte[]{75, 23, 107, -35, -93}, new byte[]{25, 118, 5, -70, -58, -14, 94, 102})));
        if (!matcher.find()) {
            throw new Exception(C0098a.a(new byte[]{-20, -76, 70, 112, -9, -79, -106, -65, -41, -69, 94, 118, -2, -30, -46}, new byte[]{-123, -38, 48, 17, -101, -40, -14, -97}) + this.b.get(C0098a.a(new byte[]{114, 12, -40, -92, -13}, new byte[]{32, 109, -74, -61, -106, 46, 25, 69})));
        }
        this.i = Long.parseLong(matcher.group(1));
        if (matcher.group(2) != null) {
            this.j = Long.parseLong(matcher.group(2));
        }
        long j = this.i;
        this.l = j;
        this.k = j;
        Response responseE = C0197c.e(d(), this.b);
        if (responseE.body() != null) {
            responseE.body().close();
        }
        int iCode = responseE.code();
        if (iCode < 200 || iCode >= 300) {
            throw new Exception(C0098a.a(new byte[]{-65, 35, 57, -66, -93, -31, -4, 112, -19, 37, 37, -86, -87, -75, -81}, new byte[]{-51, 70, 74, -50, -52, -113, -113, 21}) + iCode);
        }
        SpiderDebug.log(C0098a.a(new byte[]{-29, -124, 120, -91, 45, -53, -6, 7, -12, -97, 104, -6, 98, -36, -87, 1, -16, -98, 108, -81, 44, -107, -20, 48, -6, -119, 121}, new byte[]{-107, -19, 28, -64, 66, -26, -119, 115}) + iCode);
        SpiderDebug.log(C0098a.a(new byte[]{111, -85, 65, -80, -43, 97, 25, -70, 120, -80, 81, -17, -102, 36, 15, -81, 125, -89, 87, -90, -128, 108}, new byte[]{25, -62, 37, -43, -70, 76, 106, -50}) + responseE.headers());
        String strA = C0098a.a(new byte[]{53, 4, -71, 4, -106, -94, -13, -37, 61, 27, -89, 71, -112, -94, -26, -126, 39, 0, -69, 13, -98, -84}, new byte[]{84, 116, -55, 104, -1, -63, -110, -81});
        String str = responseE.headers().get(C0098a.a(new byte[]{37, -111, 54, 101, -30, -26, -79, -93, 42, -101, 54, 118, -13, -32}, new byte[]{102, -2, 88, 17, -121, -120, -59, -114}));
        if (str == null) {
            throw new Exception(C0098a.a(new byte[]{116, 63, -7, -76, -73, 63, 124, 112, 107, 51, -7, -73, -79, 63, 104, 53, 57, 62, -17, -90, -70, 52, 105, 106, 57, 21, -27, -87, -86, 52, 117, 36, 52, 26, -17, -87, -71, 37, 115}, new byte[]{25, 86, -118, -57, -34, 81, 27, 80}));
        }
        Long.parseLong(str);
        if (this.j <= 0) {
            String str2 = responseE.headers().get(C0098a.a(new byte[]{67, 4, 81, -93, 74, -73, -1, -88, 82, 10, 81, -80, 74}, new byte[]{0, 107, 63, -41, 47, -39, -117, -123}));
            if (str2 == null) {
                throw new Exception(C0098a.a(new byte[]{-48, -128, 111, 114, -35, 67, -95, 115, -49, -116, 111, 113, -37, 67, -75, 54, -99, -127, 121, 96, -48, 72, -76, 105, -99, -86, 115, 111, -64, 72, -88, 39, -112, -69, 125, 111, -45, 72}, new byte[]{-67, -23, 28, 1, -76, 45, -58, 83}));
            }
            Matcher matcher2 = Pattern.compile(C0098a.a(new byte[]{71, -83, -15, -108, 8, -29, -75, -9}, new byte[]{105, -121, -34, -68, 84, -121, -98, -34})).matcher(str2);
            if (!matcher2.find()) {
                throw new Exception(C0134u.b(new byte[]{2, -42, -73, 52, 55, -23, 57, -79, 11, -5, -82, 59, 47, -27, 51, -27, 70, -22, -96, 59, 60, -27, 61, -85, 75}, new byte[]{107, -72, -63, 85, 91, -128, 93, -111}, new StringBuilder(), str2));
            }
            this.j = Long.parseLong(matcher2.group(1)) - 1;
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
            this.c.execute(new Runnable() { // from class: com.github.catvod.spider.merge.p.h
                @Override // java.lang.Runnable
                public final void run() {
                    C0217j.b(this.a, i2);
                }
            });
        }
        PipedInputStream pipedInputStream = new PipedInputStream();
        Init.execute(new RunnableC0124j(this, new PipedOutputStream(pipedInputStream), 4));
        return new Object[]{206, strA, pipedInputStream, this.b};
    }
}
