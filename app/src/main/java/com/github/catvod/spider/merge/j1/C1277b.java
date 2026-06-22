package com.github.catvod.spider.merge.j1;

import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.f1.AbstractC1106W;
import com.github.catvod.spider.merge.f1.C1153k2;
import com.github.catvod.spider.merge.f1.C1157l2;
import com.github.catvod.spider.merge.f1.C1185v;
import com.github.catvod.spider.merge.f1.n2;
import com.github.catvod.spider.merge.f1.p2;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.j1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1277b {
    private C1185v a;
    private n2 b;
    private int c;
    private int d;
    private String e;

    public C1277b(C1185v c1185v, n2 n2Var) {
        this.a = c1185v;
        this.b = n2Var;
    }

    private void a() {
        while (true) {
            int i = this.c;
            if (i >= this.d) {
                return;
            }
            char cCharAt = this.e.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                return;
            } else {
                this.c++;
            }
        }
    }

    private static int b(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'A';
        if (c < 'A' || c > 'F') {
            c2 = 'a';
            if (c < 'a' || c > 'f') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    private char c(int i) throws C1276a {
        int i2 = this.c;
        int i3 = this.d;
        if (i2 >= i3) {
            throw d(i, i3);
        }
        String str = this.e;
        this.c = i2 + 1;
        return str.charAt(i2);
    }

    private C1276a d(int i, int i2) {
        StringBuilder sbB = t0.b("Unsupported number format: ");
        sbB.append(this.e.substring(i, i2));
        return new C1276a(sbB.toString());
    }

    private void f() {
        char cCharAt;
        while (true) {
            int i = this.c;
            if (i >= this.d || (cCharAt = this.e.charAt(i)) < '0' || cCharAt > '9') {
                return;
            } else {
                this.c++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0037, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String g() throws com.github.catvod.spider.merge.j1.C1276a {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.j1.C1277b.g():java.lang.String");
    }

    private Object h() throws C1276a {
        char cCharAt;
        a();
        int i = this.c;
        if (i >= this.d) {
            throw new C1276a("Empty JSON string");
        }
        String str = this.e;
        this.c = i + 1;
        char cCharAt2 = str.charAt(i);
        if (cCharAt2 == '\"') {
            return g();
        }
        if (cCharAt2 != '-') {
            if (cCharAt2 == '[') {
                a();
                int i2 = this.c;
                if (i2 < this.d && this.e.charAt(i2) == ']') {
                    this.c++;
                    return this.a.w(this.b, 0);
                }
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                while (true) {
                    int i3 = this.c;
                    if (i3 >= this.d) {
                        throw new C1276a("Unterminated array literal");
                    }
                    char cCharAt3 = this.e.charAt(i3);
                    if (cCharAt3 != ',') {
                        if (cCharAt3 == ']') {
                            if (!z) {
                                throw new C1276a("Unexpected comma in array literal");
                            }
                            this.c++;
                            return this.a.x(this.b, arrayList.toArray());
                        }
                        if (z) {
                            throw new C1276a("Missing comma in array literal");
                        }
                        arrayList.add(h());
                        z = true;
                    } else {
                        if (!z) {
                            throw new C1276a("Unexpected comma in array literal");
                        }
                        this.c++;
                        z = false;
                    }
                    a();
                }
            } else {
                if (cCharAt2 == 'f') {
                    int i4 = this.d;
                    int i5 = this.c;
                    if (i4 - i5 < 4 || this.e.charAt(i5) != 'a' || this.e.charAt(this.c + 1) != 'l' || this.e.charAt(this.c + 2) != 's' || this.e.charAt(this.c + 3) != 'e') {
                        throw new C1276a("Unexpected token: f");
                    }
                    this.c += 4;
                    return Boolean.FALSE;
                }
                if (cCharAt2 == 'n') {
                    int i6 = this.d;
                    int i7 = this.c;
                    if (i6 - i7 < 3 || this.e.charAt(i7) != 'u' || this.e.charAt(this.c + 1) != 'l' || this.e.charAt(this.c + 2) != 'l') {
                        throw new C1276a("Unexpected token: n");
                    }
                    this.c += 3;
                    return null;
                }
                if (cCharAt2 == 't') {
                    int i8 = this.d;
                    int i9 = this.c;
                    if (i8 - i9 < 3 || this.e.charAt(i9) != 'r' || this.e.charAt(this.c + 1) != 'u' || this.e.charAt(this.c + 2) != 'e') {
                        throw new C1276a("Unexpected token: t");
                    }
                    this.c += 3;
                    return Boolean.TRUE;
                }
                if (cCharAt2 == '{') {
                    a();
                    n2 n2VarY = this.a.y(this.b);
                    int i10 = this.c;
                    if (i10 >= this.d || this.e.charAt(i10) != '}') {
                        boolean z2 = false;
                        while (true) {
                            int i11 = this.c;
                            if (i11 >= this.d) {
                                throw new C1276a("Unterminated object literal");
                            }
                            String str2 = this.e;
                            this.c = i11 + 1;
                            char cCharAt4 = str2.charAt(i11);
                            if (cCharAt4 != '\"') {
                                if (cCharAt4 != ',') {
                                    if (cCharAt4 != '}') {
                                        throw new C1276a("Unexpected token in object literal");
                                    }
                                    if (!z2) {
                                        throw new C1276a("Unexpected comma in object literal");
                                    }
                                } else {
                                    if (!z2) {
                                        throw new C1276a("Unexpected comma in object literal");
                                    }
                                    z2 = false;
                                }
                            } else {
                                if (z2) {
                                    throw new C1276a("Missing comma in object literal");
                                }
                                String strG = g();
                                a();
                                int i12 = this.c;
                                if (i12 >= this.d) {
                                    throw new C1276a("Expected : but reached end of stream");
                                }
                                String str3 = this.e;
                                this.c = i12 + 1;
                                char cCharAt5 = str3.charAt(i12);
                                if (cCharAt5 != ':') {
                                    throw new C1276a("Expected : found " + cCharAt5);
                                }
                                Object objH = h();
                                C1153k2 c1153k2Z1 = C1157l2.z1(strG);
                                if (c1153k2Z1.b() == null) {
                                    n2 n2Var = (p2) n2VarY;
                                    n2Var.t(c1153k2Z1.a(), n2Var, objH);
                                } else {
                                    n2 n2Var2 = (AbstractC1106W) n2VarY;
                                    n2Var2.v(c1153k2Z1.b(), n2Var2, objH);
                                }
                                z2 = true;
                            }
                            a();
                        }
                    } else {
                        this.c++;
                    }
                    return n2VarY;
                }
                switch (cCharAt2) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        break;
                    default:
                        throw new C1276a("Unexpected token: " + cCharAt2);
                }
            }
        }
        int i13 = this.c - 1;
        if (cCharAt2 == '-' && ((cCharAt2 = c(i13)) < '0' || cCharAt2 > '9')) {
            throw d(i13, this.c);
        }
        if (cCharAt2 != '0') {
            f();
        }
        int i14 = this.c;
        if (i14 < this.d && this.e.charAt(i14) == '.') {
            this.c++;
            char c = c(i13);
            if (c < '0' || c > '9') {
                throw d(i13, this.c);
            }
            f();
        }
        int i15 = this.c;
        if (i15 < this.d && ((cCharAt = this.e.charAt(i15)) == 'e' || cCharAt == 'E')) {
            this.c++;
            char c2 = c(i13);
            if (c2 == '-' || c2 == '+') {
                c2 = c(i13);
            }
            if (c2 < '0' || c2 > '9') {
                throw d(i13, this.c);
            }
            f();
        }
        double d = Double.parseDouble(this.e.substring(i13, this.c));
        int i16 = (int) d;
        return ((double) i16) == d ? Integer.valueOf(i16) : Double.valueOf(d);
    }

    public final synchronized Object e(String str) {
        Object objH;
        try {
            if (str == null) {
                throw new C1276a("Input string may not be null");
            }
            this.c = 0;
            this.d = str.length();
            this.e = str;
            objH = h();
            a();
            if (this.c < this.d) {
                throw new C1276a("Expected end of stream at char " + this.c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return objH;
    }
}
