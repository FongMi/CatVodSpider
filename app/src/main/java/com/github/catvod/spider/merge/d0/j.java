package com.github.catvod.spider.merge.D0;

import com.github.catvod.spider.merge.I.t0;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class j {
    static final char[] n = {'r', 'u', 'e'};
    static final char[] o = {'a', 'l', 's', 'e'};
    static final char[] p = {'u', 'l', 'l'};
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private boolean g;
    protected int h;
    private final Reader i;
    private int k;
    protected boolean m;
    private int a = 1;
    private final char[] j = new char[32768];
    protected StringBuilder l = new StringBuilder();

    j(Reader reader) throws h {
        int iG;
        this.i = reader;
        this.g = j();
        do {
            iG = g(256);
            for (int i = 0; i < iG; i++) {
                char c = this.j[this.h];
                if (!i(c)) {
                    h();
                    return;
                }
                if (c == '\n') {
                    this.a++;
                    this.b = this.h + 1 + this.c;
                    this.d = 0;
                }
                this.h++;
            }
        } while (iG > 0);
        this.g = true;
    }

    private int a() {
        if (this.g) {
            return -1;
        }
        char[] cArr = this.j;
        int i = this.h;
        char c = cArr[i];
        if (c == '\n') {
            this.a++;
            this.b = i + 1 + this.c;
            this.d = 0;
        }
        int i2 = i + 1;
        this.h = i2;
        if (i2 >= this.k) {
            this.g = j();
        }
        return c;
    }

    private boolean j() throws h {
        try {
            Reader reader = this.i;
            char[] cArr = this.j;
            int i = reader.read(cArr, 0, cArr.length);
            if (i <= 0) {
                return true;
            }
            this.c += this.k;
            this.h = 0;
            this.k = i;
            return false;
        } catch (IOException e) {
            throw f(e, "IOException", true);
        }
    }

    private char k() throws h {
        char[] cArr = this.j;
        int i = this.h;
        int i2 = i + 1;
        this.h = i2;
        char c = cArr[i];
        if (c >= ' ') {
            return c;
        }
        if (c == '\n') {
            this.a++;
            this.b = i2 + 1 + this.c;
            this.d = 0;
        }
        StringBuilder sbB = t0.b("Strings may not contain control characters: 0x");
        sbB.append(Integer.toString(c, 16));
        throw f(null, sbB.toString(), false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x02be, code lost:
    
        r0 = com.github.catvod.spider.merge.I.t0.b("Expected unicode hex escape character: ");
        r0.append(r11);
        r0.append(" (");
        r0.append((int) r11);
        r0.append(")");
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x02df, code lost:
    
        throw f(null, r0.toString(), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x033e, code lost:
    
        r3 = r18.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0342, code lost:
    
        if (r2 > r3) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x034c, code lost:
    
        r18.h = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0354, code lost:
    
        throw f(null, "EOF encountered in the middle of a string escape", false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:?, code lost:
    
        return 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bc, code lost:
    
        if (r2 == 2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00be, code lost:
    
        if (r2 == 3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c1, code lost:
    
        if (r2 == 5) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c5, code lost:
    
        if (r2 != 8) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c8, code lost:
    
        r0 = com.github.catvod.spider.merge.I.t0.b("Malformed number: ");
        r0.append((java.lang.Object) r18.l);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00db, code lost:
    
        throw f(null, r0.toString(), true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00dd, code lost:
    
        if (r2 != 3) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00df, code lost:
    
        if (r3 != r0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e1, code lost:
    
        r18.m = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e3, code lost:
    
        h();
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int b(boolean r19) throws com.github.catvod.spider.merge.D0.h {
        /*
            Method dump skipped, instruction units count: 948
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.D0.j.b(boolean):int");
    }

    final void c(char c, char[] cArr) throws h {
        if (g(cArr.length) < cArr.length) {
            throw e(c, cArr, 0);
        }
        for (int i = 0; i < cArr.length; i++) {
            char[] cArr2 = this.j;
            int i2 = this.h;
            this.h = i2 + 1;
            if (cArr2[i2] != cArr[i]) {
                throw e(c, cArr, i);
            }
        }
        h();
        byte b = this.g ? (byte) -1 : this.j[this.h];
        if (b != 9 && b != 10 && b != 13 && b != 32 && b != 44 && b != 58 && b != 91 && b != 93 && b != 123 && b != 125) {
            throw e(c, cArr, cArr.length);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0195, code lost:
    
        throw f(null, "Invalid character in semi-string: " + r1, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0196, code lost:
    
        h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0199, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01b5, code lost:
    
        r17.l.append(r17.j, (r17.h - r6) - 1, r6);
        h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01c4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x011b, code lost:
    
        r1 = com.github.catvod.spider.merge.I.t0.b("Expected unicode hex escape character: ");
        r1.append(r8);
        r1.append(" (");
        r1.append((int) r8);
        r1.append(")");
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x013a, code lost:
    
        throw f(null, r1.toString(), false);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void d() throws com.github.catvod.spider.merge.D0.h {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.D0.j.d():void");
    }

    final h e(char c, char[] cArr, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        String str = "";
        sb.append(cArr == null ? "" : new String(cArr, 0, i));
        StringBuilder sb2 = new StringBuilder(sb.toString());
        while (true) {
            byte b = this.g ? (byte) -1 : this.j[this.h];
            if (!((b >= 65 && b <= 90) || (b >= 97 && b <= 122)) || sb2.length() >= 15) {
                break;
            }
            sb2.append((char) a());
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Unexpected token '");
        sb3.append((Object) sb2);
        sb3.append("'");
        if (cArr != null) {
            str = ". Did you mean '" + c + new String(cArr) + "'?";
        }
        sb3.append(str);
        return f(null, sb3.toString(), true);
    }

    final h f(Exception exc, String str, boolean z) {
        if (z) {
            StringBuilder sbA = com.github.catvod.spider.merge.C1.a.a(str, " on line ");
            sbA.append(this.a);
            sbA.append(", char ");
            sbA.append(this.e);
            return new h(exc, sbA.toString());
        }
        int iMax = Math.max(1, ((this.h + this.c) - this.b) - this.d);
        StringBuilder sbA2 = com.github.catvod.spider.merge.C1.a.a(str, " on line ");
        sbA2.append(this.a);
        sbA2.append(", char ");
        sbA2.append(iMax);
        return new h(exc, sbA2.toString());
    }

    final int g(int i) throws h {
        int i2;
        int i3 = this.k;
        int i4 = i3 - i;
        int i5 = this.h;
        if (i4 >= i5) {
            return i;
        }
        if (i5 > 0) {
            this.c += i5;
            int i6 = i3 - i5;
            this.k = i6;
            char[] cArr = this.j;
            System.arraycopy(cArr, i5, cArr, 0, i6);
            this.h = 0;
        }
        do {
            try {
                char[] cArr2 = this.j;
                int length = cArr2.length;
                int i7 = this.k;
                if (length <= i7) {
                    throw new IOException("Unexpected internal error");
                }
                int i8 = this.i.read(cArr2, i7, cArr2.length - i7);
                if (i8 <= 0) {
                    return this.k - this.h;
                }
                i2 = this.k + i8;
                this.k = i2;
            } catch (IOException e) {
                throw f(e, "IOException", true);
            }
        } while (i2 <= i);
        return i2 - this.h;
    }

    final void h() {
        if (this.h >= this.k) {
            this.g = j();
        }
    }

    final boolean i(int i) {
        return i == 32 || i == 10 || i == 13 || i == 9;
    }
}
