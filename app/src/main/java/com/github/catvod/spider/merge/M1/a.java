package com.github.catvod.spider.merge.M1;

import com.github.catvod.spider.merge.f1.C1157l2;
import com.github.catvod.spider.merge.f1.C1162n0;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class a {
    private boolean a;
    private int c;
    private int e;
    private final String h;
    int k;
    int l;
    private char[] b = new char[128];
    private final int[] d = new int[3];
    private int f = -1;
    private int i = 0;
    private int j = 0;
    int g = 0;

    a(String str) {
        this.h = str;
    }

    private void a(int i) {
        int i2 = this.c;
        char[] cArr = this.b;
        if (i2 == cArr.length) {
            char[] cArr2 = new char[cArr.length * 2];
            System.arraycopy(cArr, 0, cArr2, 0, i2);
            this.b = cArr2;
        }
        this.b[i2] = (char) i;
        this.c = i2 + 1;
    }

    private int b() {
        return c(true, false);
    }

    private int c(boolean z, boolean z2) {
        int i;
        int i2 = this.e;
        if (i2 != 0) {
            this.j++;
            int[] iArr = this.d;
            int i3 = i2 - 1;
            this.e = i3;
            return iArr[i3];
        }
        while (this.i != this.h.length()) {
            this.j++;
            String str = this.h;
            int i4 = this.i;
            this.i = i4 + 1;
            char cCharAt = str.charAt(i4);
            if (!z2 && (i = this.f) >= 0) {
                if (i == 13 && cCharAt == '\n') {
                    this.f = 10;
                } else {
                    this.f = -1;
                    this.g++;
                }
            }
            if (cCharAt <= 127) {
                if (cCharAt != '\n' && cCharAt != '\r') {
                    return cCharAt;
                }
            } else {
                if (cCharAt == 65279) {
                    return cCharAt;
                }
                if (z) {
                    if (cCharAt > 127 && Character.getType((char) cCharAt) == 16) {
                    }
                }
                if (!C1157l2.c0(cCharAt)) {
                    return cCharAt;
                }
            }
            this.f = cCharAt;
            return 10;
        }
        return -1;
    }

    private static boolean e(int i) {
        return 48 <= i && i <= 57;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean f(int r4, int r5) {
        /*
            r0 = 0
            r1 = 1
            r2 = 10
            if (r4 != r2) goto Lc
            boolean r2 = e(r5)
            if (r2 != 0) goto L4b
        Lc:
            r2 = 16
            r3 = 48
            if (r4 != r2) goto L2d
            if (r3 > r5) goto L18
            r2 = 57
            if (r5 <= r2) goto L28
        L18:
            r2 = 97
            if (r2 > r5) goto L20
            r2 = 102(0x66, float:1.43E-43)
            if (r5 <= r2) goto L28
        L20:
            r2 = 65
            if (r2 > r5) goto L2a
            r2 = 70
            if (r5 > r2) goto L2a
        L28:
            r2 = 1
            goto L2b
        L2a:
            r2 = 0
        L2b:
            if (r2 != 0) goto L4b
        L2d:
            r2 = 8
            if (r4 != r2) goto L3c
            if (r3 > r5) goto L39
            r2 = 55
            if (r5 > r2) goto L39
            r2 = 1
            goto L3a
        L39:
            r2 = 0
        L3a:
            if (r2 != 0) goto L4b
        L3c:
            r2 = 2
            if (r4 != r2) goto L4c
            if (r3 == r5) goto L48
            r4 = 49
            if (r5 != r4) goto L46
            goto L48
        L46:
            r4 = 0
            goto L49
        L48:
            r4 = 1
        L49:
            if (r4 == 0) goto L4c
        L4b:
            r0 = 1
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.M1.a.f(int, int):boolean");
    }

    private boolean g(int i) {
        int iC = c(true, true);
        if (iC == i) {
            this.l = this.j;
            return true;
        }
        l(iC);
        return false;
    }

    private int h(int i, int i2) {
        if (f(i, i2)) {
            a(i2);
            i2 = b();
            if (i2 != -1) {
                while (true) {
                    if (i2 != 95) {
                        if (!f(i, i2)) {
                            break;
                        }
                        a(i2);
                        i2 = b();
                        if (i2 == -1) {
                            return -1;
                        }
                    } else {
                        i2 = b();
                        if (i2 == 10 || i2 == -1) {
                            return -2;
                        }
                        if (!f(i, i2)) {
                            k(i2);
                            return 95;
                        }
                        a(95);
                    }
                }
            } else {
                return -1;
            }
        }
        return i2;
    }

    private void j() {
        int iB;
        do {
            iB = b();
            if (iB == -1) {
                break;
            }
        } while (iB != 10);
        k(iB);
        this.l = this.j;
    }

    private void k(int i) {
        int i2 = this.e;
        if (i2 != 0 && this.d[i2 - 1] == 10) {
            C1162n0.c();
            throw null;
        }
        int[] iArr = this.d;
        this.e = i2 + 1;
        iArr[i2] = i;
        this.j--;
    }

    private void l(int i) {
        int[] iArr = this.d;
        int i2 = this.e;
        this.e = i2 + 1;
        iArr[i2] = i;
        this.j--;
    }

    /* JADX WARN: Code restructure failed: missing block: B:274:0x03a3, code lost:
    
        if (e(r4) != false) goto L561;
     */
    /* JADX WARN: Removed duplicated region for block: B:270:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0640 A[PHI: r8 r14
      0x0640: PHI (r8v26 int) = (r8v25 int), (r8v25 int), (r8v30 int), (r8v30 int) binds: [B:520:0x05f8, B:521:0x05fa, B:523:0x0604, B:524:0x0606] A[DONT_GENERATE, DONT_INLINE]
      0x0640: PHI (r14v12 int) = (r14v11 int), (r14v11 int), (r14v14 int), (r14v14 int) binds: [B:520:0x05f8, B:521:0x05fa, B:523:0x0604, B:524:0x0606] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0685 A[PHI: r8
      0x0685: PHI (r8v8 int) = (r8v7 int), (r8v21 int), (r8v24 int), (r8v12 int), (r8v12 int) binds: [B:502:0x05cb, B:536:0x063d, B:528:0x0615, B:516:0x05ec, B:518:0x05f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:674:0x042c A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:311:0x0418 -> B:312:0x041a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int d() throws com.github.catvod.spider.merge.p1.i {
        /*
            Method dump skipped, instruction units count: 2276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.M1.a.d():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0080, code lost:
    
        throw new com.github.catvod.spider.merge.p1.i("msg.unterminated.re.lit");
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0095, code lost:
    
        throw new com.github.catvod.spider.merge.p1.i("msg.unterminated.re.lit");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void i(int r9) throws com.github.catvod.spider.merge.p1.i {
        /*
            r8 = this;
            int r0 = r8.k
            r1 = 0
            r8.c = r1
            r2 = 1
            r3 = 62
            java.lang.String r4 = "msg.unterminated.re.lit"
            if (r9 != r3) goto L12
            r9 = 61
            r8.a(r9)
            goto L21
        L12:
            r3 = 20
            if (r9 != r3) goto La1
            int r9 = r8.b()
            r8.k(r9)
            r3 = 42
            if (r9 == r3) goto L96
        L21:
            r9 = 0
        L22:
            int r3 = r8.b()
            r5 = 47
            r6 = -1
            if (r3 != r5) goto L65
            if (r9 == 0) goto L2e
            goto L65
        L2e:
            int r9 = r8.c(r2, r2)
            java.lang.String r3 = "gimysu"
            int r3 = r3.indexOf(r9)
            if (r3 == r6) goto L3e
            r8.a(r9)
            goto L2e
        L3e:
            r3 = 90
            if (r9 > r3) goto L47
            r3 = 65
            if (r3 > r9) goto L50
            goto L4f
        L47:
            r3 = 97
            if (r3 > r9) goto L50
            r3 = 122(0x7a, float:1.71E-43)
            if (r9 > r3) goto L50
        L4f:
            r1 = 1
        L50:
            if (r1 != 0) goto L5d
            r8.l(r9)
            int r9 = r8.c
            int r0 = r0 + r9
            int r0 = r0 + 2
            r8.l = r0
            return
        L5d:
            com.github.catvod.spider.merge.p1.i r9 = new com.github.catvod.spider.merge.p1.i
            java.lang.String r0 = "msg.invalid.re.flag"
            r9.<init>(r0)
            throw r9
        L65:
            r5 = 10
            if (r3 == r5) goto L90
            if (r3 == r6) goto L90
            r7 = 92
            if (r3 != r7) goto L81
            r8.a(r3)
            int r3 = r8.b()
            if (r3 == r5) goto L7b
            if (r3 == r6) goto L7b
            goto L8c
        L7b:
            com.github.catvod.spider.merge.p1.i r9 = new com.github.catvod.spider.merge.p1.i
            r9.<init>(r4)
            throw r9
        L81:
            r5 = 91
            if (r3 != r5) goto L87
            r9 = 1
            goto L8c
        L87:
            r5 = 93
            if (r3 != r5) goto L8c
            r9 = 0
        L8c:
            r8.a(r3)
            goto L22
        L90:
            com.github.catvod.spider.merge.p1.i r9 = new com.github.catvod.spider.merge.p1.i
            r9.<init>(r4)
            throw r9
        L96:
            int r9 = r8.j
            int r9 = r9 - r2
            r8.l = r9
            com.github.catvod.spider.merge.p1.i r9 = new com.github.catvod.spider.merge.p1.i
            r9.<init>(r4)
            throw r9
        La1:
            com.github.catvod.spider.merge.f1.C1162n0.c()
            r9 = 0
            goto La7
        La6:
            throw r9
        La7:
            goto La6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.M1.a.i(int):void");
    }
}
