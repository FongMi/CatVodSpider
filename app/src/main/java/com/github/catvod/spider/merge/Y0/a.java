package com.github.catvod.spider.merge.Y0;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class a {
    private InputStream d;
    private boolean e;
    long f;
    int g;
    private int h;
    private final byte[] a = new byte[4160];
    private final int[] b = new int[1040];
    private final j c = new j();
    private int i = 0;

    a() {
    }

    static void a(a aVar, boolean z) {
        if (aVar.e) {
            int i = ((aVar.h << 2) + ((aVar.g + 7) >> 3)) - 8;
            int i2 = aVar.i;
            if (i > i2) {
                throw new c("Read after end");
            }
            if (z && i != i2) {
                throw new c("Unused bytes after end");
            }
        }
    }

    static void b(a aVar) throws IOException {
        InputStream inputStream = aVar.d;
        aVar.d = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    static void c(a aVar, byte[] bArr, int i, int i2) {
        if ((aVar.g & 7) != 0) {
            throw new c("Unaligned copyBytes");
        }
        while (true) {
            int i3 = aVar.g;
            if (i3 == 64 || i2 == 0) {
                break;
            }
            bArr[i] = (byte) (aVar.f >>> i3);
            aVar.g = i3 + 8;
            i2--;
            i++;
        }
        if (i2 == 0) {
            return;
        }
        int iMin = Math.min(f(aVar), i2 >> 2);
        if (iMin > 0) {
            int i4 = iMin << 2;
            System.arraycopy(aVar.a, aVar.h << 2, bArr, i, i4);
            i += i4;
            i2 -= i4;
            aVar.h += iMin;
        }
        if (i2 == 0) {
            return;
        }
        if (f(aVar) <= 0) {
            while (i2 > 0) {
                try {
                    int i5 = aVar.d.read(bArr, i, i2);
                    if (i5 == -1) {
                        throw new c("Unexpected end of input");
                    }
                    i += i5;
                    i2 -= i5;
                } catch (IOException e) {
                    throw new c(e);
                }
            }
            return;
        }
        d(aVar);
        while (i2 != 0) {
            long j = aVar.f;
            int i6 = aVar.g;
            bArr[i] = (byte) (j >>> i6);
            aVar.g = i6 + 8;
            i2--;
            i++;
        }
        a(aVar, false);
    }

    static void d(a aVar) {
        int i = aVar.g;
        if (i >= 32) {
            int[] iArr = aVar.b;
            int i2 = aVar.h;
            aVar.h = i2 + 1;
            aVar.f = (((long) iArr[i2]) << 32) | (aVar.f >>> 32);
            aVar.g = i - 32;
        }
    }

    static void e(a aVar, InputStream inputStream) {
        if (aVar.d != null) {
            throw new IllegalStateException("Bit reader already has associated input stream");
        }
        j.b(aVar.c, aVar.a, aVar.b);
        aVar.d = inputStream;
        aVar.f = 0L;
        aVar.g = 64;
        aVar.h = 1024;
        aVar.e = false;
        i(aVar);
        a(aVar, false);
        d(aVar);
        d(aVar);
    }

    static int f(a aVar) {
        return (aVar.e ? (aVar.i + 3) >> 2 : 1024) - aVar.h;
    }

    static void g(a aVar) {
        int i = (64 - aVar.g) & 7;
        if (i != 0 && h(aVar, i) != 0) {
            throw new c("Corrupted padding bits");
        }
    }

    static int h(a aVar, int i) {
        d(aVar);
        long j = aVar.f;
        int i2 = aVar.g;
        int i3 = ((int) (j >>> i2)) & ((1 << i) - 1);
        aVar.g = i2 + i;
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        r4.e = true;
        r4.i = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        r1 = r1 + 3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void i(com.github.catvod.spider.merge.Y0.a r4) {
        /*
            int r0 = r4.h
            r1 = 1015(0x3f7, float:1.422E-42)
            if (r0 > r1) goto L7
            return
        L7:
            boolean r1 = r4.e
            if (r1 == 0) goto L1b
            int r4 = f(r4)
            r0 = -2
            if (r4 < r0) goto L13
            return
        L13:
            com.github.catvod.spider.merge.Y0.c r4 = new com.github.catvod.spider.merge.Y0.c
            java.lang.String r0 = "No more input"
            r4.<init>(r0)
            throw r4
        L1b:
            int r0 = r0 << 2
            int r1 = 4096 - r0
            byte[] r2 = r4.a
            r3 = 0
            java.lang.System.arraycopy(r2, r0, r2, r3, r1)
            r4.h = r3
        L27:
            r0 = 4096(0x1000, float:5.74E-42)
            if (r1 >= r0) goto L48
            java.io.InputStream r0 = r4.d     // Catch: java.io.IOException -> L41
            byte[] r2 = r4.a     // Catch: java.io.IOException -> L41
            int r3 = 4096 - r1
            int r0 = r0.read(r2, r1, r3)     // Catch: java.io.IOException -> L41
            if (r0 > 0) goto L3f
            r0 = 1
            r4.e = r0     // Catch: java.io.IOException -> L41
            r4.i = r1     // Catch: java.io.IOException -> L41
            int r1 = r1 + 3
            goto L48
        L3f:
            int r1 = r1 + r0
            goto L27
        L41:
            r4 = move-exception
            com.github.catvod.spider.merge.Y0.c r0 = new com.github.catvod.spider.merge.Y0.c
            r0.<init>(r4)
            throw r0
        L48:
            com.github.catvod.spider.merge.Y0.j r4 = r4.c
            int r0 = r1 >> 2
            com.github.catvod.spider.merge.Y0.j.a(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Y0.a.i(com.github.catvod.spider.merge.Y0.a):void");
    }
}
