package com.github.catvod.spider.merge.f1;

import java.io.IOException;
import java.io.Reader;
import java.math.BigInteger;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class A2 {
    int A;
    private boolean B;
    private boolean C;
    private int D;
    private Y1 E;
    private boolean b;
    String c;
    private double e;
    private BigInteger f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private int k;
    private int m;
    private int p;
    int s;
    private String t;
    private Reader u;
    private char[] v;
    private int w;
    int x;
    int y;
    int z;
    private StringBuilder a = new StringBuilder();
    private String d = "";
    private char[] l = new char[128];
    private U1 n = new U1(50);
    private final int[] o = new int[3];
    private int q = 0;
    private int r = -1;
    private String F = "";
    private int G = -1;

    A2(Y1 y1, String str, int i) {
        this.E = y1;
        this.s = i;
        if (str == null) {
            C1162n0.c();
            throw null;
        }
        this.t = str;
        this.w = str.length();
        this.y = 0;
        this.x = 0;
    }

    private boolean C(int i) {
        int iF = f(true, true);
        if (iF == i) {
            this.A = this.y;
            return true;
        }
        M(iF);
        return false;
    }

    private boolean D() {
        int iR = r();
        if (iR == 123) {
            return true;
        }
        M(iR);
        this.a.setLength(r0.length() - 1);
        return false;
    }

    private int E() {
        int iE = e();
        L(iE);
        return iE;
    }

    private int F() {
        int iR = r();
        M(iR);
        this.a.setLength(r1.length() - 1);
        return iR;
    }

    private int G(int i, int i2) {
        if (u(i, i2)) {
            a(i2);
            i2 = e();
            if (i2 != -1) {
                while (true) {
                    if (i2 != 95) {
                        if (!u(i, i2)) {
                            break;
                        }
                        a(i2);
                        i2 = e();
                        if (i2 == -1) {
                            return -1;
                        }
                    } else {
                        i2 = e();
                        if (i2 == 10 || i2 == -1) {
                            return -2;
                        }
                        if (!u(i, i2)) {
                            L(i2);
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

    private void J() {
        int iE;
        do {
            iE = e();
            if (iE == -1) {
                break;
            }
        } while (iE != 10);
        L(iE);
        this.A = this.y;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x06cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int K(java.lang.String r23, int r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 2404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.A2.K(java.lang.String, int, boolean):int");
    }

    private void L(int i) {
        int i2 = this.p;
        if (i2 != 0 && this.o[i2 - 1] == 10) {
            C1162n0.c();
            throw null;
        }
        int[] iArr = this.o;
        this.p = i2 + 1;
        iArr[i2] = i;
        this.y--;
    }

    private void M(int i) {
        int[] iArr = this.o;
        int i2 = this.p;
        this.p = i2 + 1;
        iArr[i2] = i;
        this.y--;
    }

    private void a(int i) {
        int i2 = this.m;
        int iCharCount = Character.charCount(i);
        int i3 = i2 + iCharCount;
        char[] cArr = this.l;
        if (i3 >= cArr.length) {
            char[] cArr2 = new char[cArr.length * 2];
            System.arraycopy(cArr, 0, cArr2, 0, i2);
            this.l = cArr2;
        }
        if (iCharCount == 1) {
            this.l[i2] = (char) i;
        } else {
            this.l[i2] = Character.highSurrogate(i);
            this.l[i2 + 1] = Character.lowSurrogate(i);
        }
        this.m = i3;
    }

    private final int b(int i) {
        if (i < 0) {
            return -1;
        }
        String str = this.t;
        if (str != null) {
            if (i >= this.w) {
                return -1;
            }
            return str.charAt(i);
        }
        if (i >= this.w) {
            int i2 = this.x;
            try {
                if (!c()) {
                    return -1;
                }
                i -= i2 - this.x;
            } catch (IOException unused) {
                return -1;
            }
        }
        return this.v[i];
    }

    private boolean c() throws IOException {
        if (this.t != null) {
            C1162n0.c();
            throw null;
        }
        if (this.w == this.v.length) {
            if (this.q == 0 || w()) {
                char[] cArr = this.v;
                char[] cArr2 = new char[cArr.length * 2];
                System.arraycopy(cArr, 0, cArr2, 0, this.w);
                this.v = cArr2;
            } else {
                char[] cArr3 = this.v;
                int i = this.q;
                System.arraycopy(cArr3, i, cArr3, 0, this.w - i);
                int i2 = this.w;
                int i3 = this.q;
                this.w = i2 - i3;
                this.x -= i3;
                this.q = 0;
            }
        }
        Reader reader = this.u;
        char[] cArr4 = this.v;
        int i4 = this.w;
        int i5 = reader.read(cArr4, i4, cArr4.length - i4);
        if (i5 < 0) {
            return false;
        }
        this.w += i5;
        return true;
    }

    private int e() {
        return f(true, false);
    }

    private int f(boolean z, boolean z2) {
        int i;
        int i2;
        int i3 = this.p;
        if (i3 != 0) {
            this.y++;
            int[] iArr = this.o;
            int i4 = i3 - 1;
            this.p = i4;
            return iArr[i4];
        }
        while (true) {
            String str = this.t;
            if (str != null) {
                int i5 = this.x;
                if (i5 == this.w) {
                    return -1;
                }
                this.y++;
                int iCodePointAt = str.codePointAt(i5);
                this.x = Character.charCount(iCodePointAt) + this.x;
                i = iCodePointAt;
            } else {
                if (this.x == this.w && !c()) {
                    return -1;
                }
                this.y++;
                char[] cArr = this.v;
                int i6 = this.x;
                this.x = i6 + 1;
                i = cArr[i6];
            }
            if (!z2 && (i2 = this.r) >= 0) {
                if (i2 == 13 && i == 10) {
                    this.r = 10;
                } else {
                    this.r = -1;
                    this.q = this.x - 1;
                    this.s++;
                }
            }
            if (i > 127) {
                if (i != 65279) {
                    if (!z) {
                        break;
                    }
                    if (!(i > 127 && Character.getType((char) i) == 16)) {
                        break;
                    }
                } else {
                    return i;
                }
            } else if (i != 10 && i != 13) {
                return i;
            }
        }
        if (!C1157l2.c0(i)) {
            return i;
        }
        this.r = i;
        return 10;
    }

    private int g() {
        return f(false, true);
    }

    private String q() {
        this.A = this.y;
        return new String(this.l, 0, this.m);
    }

    private int r() {
        int iF = f(false, true);
        if (iF == 10) {
            int i = this.r;
            if (i != 13) {
                if (i == 8232 || i == 8233) {
                    iF = i;
                }
            } else if (b(this.y) == 10) {
                g();
            }
            this.r = -1;
            this.q = this.x - 1;
            this.s++;
        }
        this.a.append((char) iF);
        return iF;
    }

    private static boolean t(int i) {
        return 48 <= i && i <= 57;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean u(int r4, int r5) {
        /*
            r0 = 0
            r1 = 1
            r2 = 10
            if (r4 != r2) goto Lc
            boolean r2 = t(r5)
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
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.A2.u(int, int):boolean");
    }

    static boolean v(String str, int i, boolean z) {
        return K(str, i, z) != 0;
    }

    private boolean w() {
        return this.G != -1;
    }

    final boolean A() {
        return this.h;
    }

    final boolean B() {
        return this.B;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e9, code lost:
    
        L(r6);
        r10.A = r10.y - 1;
        r10.d = new java.lang.String(r10.l, 0, r10.m);
        r10.E.E0("msg.unterminated.re.lit", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0101, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void H(int r11) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.A2.H(int):void");
    }

    final int I(boolean z) {
        this.a.setLength(0);
        this.m = 0;
        boolean z2 = false;
        while (true) {
            int iR = r();
            int i = -1;
            if (iR == -1) {
                this.d = z2 ? null : q();
                this.A = this.y - 1;
                this.E.E0("msg.unexpected.eof", null);
                throw null;
            }
            if (iR != 36) {
                if (iR == 92) {
                    iR = r();
                    if (iR == 10) {
                        continue;
                    } else if (iR == 98) {
                        iR = 8;
                    } else if (iR == 102) {
                        iR = 12;
                    } else if (iR == 110) {
                        iR = 10;
                    } else if (iR == 114) {
                        iR = 13;
                    } else if (iR == 120) {
                        int i2 = 0;
                        int iJ = 0;
                        while (true) {
                            if (i2 >= 2) {
                                i = iJ;
                            } else if (F() != 96) {
                                iJ = C1162n0.j(r(), iJ);
                                i2++;
                            }
                        }
                        if (i < 0) {
                            if (!z) {
                                this.E.E0("msg.syntax", null);
                                throw null;
                            }
                            z2 = true;
                        } else {
                            iR = i;
                        }
                    } else if (iR != 8232 && iR != 8233) {
                        switch (iR) {
                            case 48:
                                int iF = F();
                                if (iF >= 48 && iF <= 57) {
                                    if (!z) {
                                        this.E.E0("msg.syntax", null);
                                        throw null;
                                    }
                                    z2 = true;
                                } else {
                                    iR = 0;
                                }
                                break;
                            case 49:
                            case 50:
                            case 51:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
                            case 56:
                            case 57:
                                if (!z) {
                                    this.E.E0("msg.syntax", null);
                                    throw null;
                                }
                                z2 = true;
                                break;
                            default:
                                switch (iR) {
                                    case 116:
                                        iR = 9;
                                        break;
                                    case 117:
                                        if (!D()) {
                                            int i3 = 0;
                                            int iJ2 = 0;
                                            while (true) {
                                                if (i3 >= 4) {
                                                    i = iJ2;
                                                } else if (F() != 96) {
                                                    iJ2 = C1162n0.j(r(), iJ2);
                                                    i3++;
                                                }
                                            }
                                            if (i >= 0) {
                                                iR = i;
                                            } else {
                                                if (!z) {
                                                    this.E.E0("msg.syntax", null);
                                                    throw null;
                                                }
                                                z2 = true;
                                            }
                                        } else {
                                            int iJ3 = 0;
                                            while (true) {
                                                if (F() != 96) {
                                                    int iR2 = r();
                                                    if (iR2 == -1) {
                                                        this.E.E0("msg.syntax", null);
                                                        throw null;
                                                    }
                                                    if (iR2 == 125) {
                                                        i = iJ3;
                                                    } else {
                                                        iJ3 = C1162n0.j(iR2, iJ3);
                                                    }
                                                }
                                            }
                                            if (i < 0 || i > 1114111) {
                                                if (!z) {
                                                    this.E.E0("msg.syntax", null);
                                                    throw null;
                                                }
                                                z2 = true;
                                            } else if (i <= 65535) {
                                                iR = i;
                                            } else {
                                                a(Character.highSurrogate(i));
                                                iR = Character.lowSurrogate(i);
                                            }
                                        }
                                        break;
                                    case 118:
                                        iR = 11;
                                        break;
                                }
                                break;
                        }
                    }
                } else if (iR == 96) {
                    StringBuilder sb = this.a;
                    sb.setLength(sb.length() - 1);
                    this.d = z2 ? null : q();
                    return 170;
                }
            } else if (D()) {
                StringBuilder sb2 = this.a;
                sb2.setLength(sb2.length() - 2);
                this.d = z2 ? null : q();
                this.A = this.y - 1;
                return 172;
            }
            a(iR);
        }
    }

    final BigInteger d() {
        return this.f;
    }

    final int h() {
        this.D = 0;
        this.B = false;
        this.C = false;
        int i = this.p;
        if (!(i == 0 || this.o[i - 1] != 10)) {
            return -1;
        }
        L(60);
        return k();
    }

    final String i() {
        int i;
        int i2 = this.x;
        int i3 = this.r;
        if (i3 >= 0) {
            i = i2 - 1;
            if (i3 == 10 && b(i - 1) == 13) {
                i--;
            }
        } else {
            int i4 = i2 - this.q;
            while (true) {
                int iB = b(this.q + i4);
                if (iB == -1 || C1157l2.c0(iB)) {
                    break;
                }
                i4++;
            }
            i = i4 + this.q;
        }
        int i5 = this.q;
        String str = this.t;
        if (str != null) {
            return str.substring(i5, i);
        }
        return new String(this.v, i5, i - i5);
    }

    final String j(int i, int[] iArr) {
        int i2 = (this.y + this.p) - i;
        int i3 = this.x;
        if (i2 > i3) {
            return null;
        }
        int i4 = 0;
        int i5 = 0;
        while (i2 > 0) {
            int i6 = i3 - 1;
            int iB = b(i6);
            if (C1157l2.c0(iB)) {
                if (iB == 10 && b(i3 - 2) == 13) {
                    i2--;
                    i3 = i6;
                }
                i4++;
                i5 = i3 - 1;
            }
            i2--;
            i3--;
        }
        int i7 = 0;
        while (true) {
            if (i3 <= 0) {
                i3 = 0;
                break;
            }
            int i8 = i3 - 1;
            if (C1157l2.c0(b(i8))) {
                break;
            }
            i7++;
            i3 = i8;
        }
        iArr[0] = (this.s - i4) + (this.r >= 0 ? 1 : 0);
        iArr[1] = i7;
        if (i4 == 0) {
            return i();
        }
        String str = this.t;
        if (str != null) {
            return str.substring(i3, i5);
        }
        return new String(this.v, i3, i5 - i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
    
        L(r1);
        r12.d = q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
    
        return 149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00fb, code lost:
    
        r12.m = 0;
        r12.d = null;
        r12.E.k("msg.XML.bad.form");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0104, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int k() {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.A2.k():int");
    }

    final double l() {
        return this.e;
    }

    final int m() {
        int i = this.x - this.q;
        return this.r >= 0 ? i - 1 : i;
    }

    final char n() {
        return (char) this.k;
    }

    final String o() {
        return this.a.length() == 0 ? "" : this.a.toString();
    }

    final String p() {
        return this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0149, code lost:
    
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x014b, code lost:
    
        if (r17 == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x014d, code lost:
    
        r6 = r5.length() - 1;
        r2 = new java.lang.StringBuilder(r5.substring(0, r6));
        r2.append("\\u");
        r5 = java.lang.Integer.toHexString(r5.charAt(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x016e, code lost:
    
        if (r3 >= (4 - r5.length())) goto L580;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0170, code lost:
    
        r2.append('0');
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0176, code lost:
    
        r2.append(r5);
        r5 = r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x017e, code lost:
    
        r19.E.a.getClass();
        r2 = K(r5, 0, r19.E.o);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x018d, code lost:
    
        if (r2 == 0) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0191, code lost:
    
        if (r2 == 157) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0195, code lost:
    
        if (r2 != 73) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0197, code lost:
    
        r19.E.a.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01a0, code lost:
    
        if (r2 != 157) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01a2, code lost:
    
        r2 = "let";
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01a5, code lost:
    
        r2 = "yield";
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01a7, code lost:
    
        r19.d = r2;
        r2 = 39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01ab, code lost:
    
        r19.d = (java.lang.String) r19.n.h(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01b7, code lost:
    
        if (r2 == 131) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01b9, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01ba, code lost:
    
        r19.E.a.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01c9, code lost:
    
        if (r19.E.a.g() != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01cb, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01cc, code lost:
    
        if (r1 == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01ce, code lost:
    
        r19.E.a.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01d5, code lost:
    
        r19.d = (java.lang.String) r19.n.h(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01df, code lost:
    
        return 39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0125, code lost:
    
        L(r5);
        r5 = q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x012c, code lost:
    
        if (r1 == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x012e, code lost:
    
        r19.E.a.getClass();
        r19.E.a.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0144, code lost:
    
        if (K(r5, 0, r19.E.o) == 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0146, code lost:
    
        r17 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0636 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x06bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:552:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x0290 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:183:0x029e -> B:184:0x02a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int s() {
        /*
            Method dump skipped, instruction units count: 1808
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.A2.s():int");
    }

    final boolean x() {
        return this.g;
    }

    final boolean y() {
        return this.j;
    }

    final boolean z() {
        return this.i;
    }
}
