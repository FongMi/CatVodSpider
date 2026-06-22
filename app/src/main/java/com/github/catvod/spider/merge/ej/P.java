package com.github.catvod.spider.merge.ej;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class P {
    private static final String[] d = {",", ">", "+", "~", " "};
    private static final String[] e = {"=", "!=", "^=", "$=", "*=", "~="};
    private static final Pattern f = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);
    private static final Pattern g = Pattern.compile("([+-])?(\\d+)");
    private final com.github.catvod.spider.merge.Fs.P a;
    private final String b;
    private final List<N> c = new ArrayList();

    private P(String str) {
        com.github.catvod.spider.merge.Dw.i.i(str);
        String strTrim = str.trim();
        this.b = strTrim;
        this.a = new com.github.catvod.spider.merge.Fs.P(strTrim);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0145  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.ej.N>] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.ej.N>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.ej.N>] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.ej.N>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(char r10) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.ej.P.a(char):void");
    }

    private int b() {
        String strTrim = this.a.b().trim();
        int i = com.github.catvod.spider.merge.Dw.e.d;
        boolean z = false;
        if (strTrim != null && strTrim.length() != 0) {
            int length = strTrim.length();
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = true;
                    break;
                }
                if (!Character.isDigit(strTrim.codePointAt(i2))) {
                    break;
                }
                i2++;
            }
        }
        if (z) {
            return Integer.parseInt(strTrim);
        }
        throw new IllegalArgumentException("Index must be numeric");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    private void c(boolean z) {
        N c1072s;
        ?? r4;
        this.a.d(z ? ":containsOwn" : ":contains");
        String strO = com.github.catvod.spider.merge.Fs.P.o(this.a.a('(', ')'));
        com.github.catvod.spider.merge.Dw.i.j(strO, ":contains(text) query must not be empty");
        if (z) {
            List<N> list = this.c;
            c1072s = new r(strO);
            r4 = list;
        } else {
            List<N> list2 = this.c;
            c1072s = new C1072s(strO);
            r4 = list2;
        }
        r4.add(c1072s);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void d(boolean r9, boolean r10) {
        /*
            r8 = this;
            com.github.catvod.spider.merge.Fs.P r0 = r8.a
            java.lang.String r0 = r0.b()
            java.lang.String r0 = com.github.catvod.spider.merge.Dw.s.d(r0)
            java.util.regex.Pattern r1 = com.github.catvod.spider.merge.ej.P.f
            java.util.regex.Matcher r1 = r1.matcher(r0)
            java.util.regex.Pattern r2 = com.github.catvod.spider.merge.ej.P.g
            java.util.regex.Matcher r2 = r2.matcher(r0)
            java.lang.String r3 = "odd"
            boolean r3 = r3.equals(r0)
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L23
            r0 = 1
        L21:
            r4 = 2
            goto L73
        L23:
            java.lang.String r3 = "even"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L2d
            r0 = 0
            goto L21
        L2d:
            boolean r3 = r1.matches()
            java.lang.String r6 = ""
            java.lang.String r7 = "^\\+"
            if (r3 == 0) goto L61
            r0 = 3
            java.lang.String r0 = r1.group(r0)
            if (r0 == 0) goto L4a
            java.lang.String r0 = r1.group(r5)
            java.lang.String r0 = r0.replaceFirst(r7, r6)
            int r5 = java.lang.Integer.parseInt(r0)
        L4a:
            r0 = 4
            java.lang.String r2 = r1.group(r0)
            if (r2 == 0) goto L5e
            java.lang.String r0 = r1.group(r0)
            java.lang.String r0 = r0.replaceFirst(r7, r6)
            int r0 = java.lang.Integer.parseInt(r0)
            r4 = r0
        L5e:
            r0 = r4
            r4 = r5
            goto L73
        L61:
            boolean r1 = r2.matches()
            if (r1 == 0) goto L9c
            java.lang.String r0 = r2.group()
            java.lang.String r0 = r0.replaceFirst(r7, r6)
            int r0 = java.lang.Integer.parseInt(r0)
        L73:
            if (r10 == 0) goto L87
            if (r9 == 0) goto L7f
            java.util.List<com.github.catvod.spider.merge.ej.N> r9 = r8.c
            com.github.catvod.spider.merge.ej.G r10 = new com.github.catvod.spider.merge.ej.G
            r10.<init>(r4, r0)
            goto L98
        L7f:
            java.util.List<com.github.catvod.spider.merge.ej.N> r9 = r8.c
            com.github.catvod.spider.merge.ej.H r10 = new com.github.catvod.spider.merge.ej.H
            r10.<init>(r4, r0)
            goto L98
        L87:
            if (r9 == 0) goto L91
            java.util.List<com.github.catvod.spider.merge.ej.N> r9 = r8.c
            com.github.catvod.spider.merge.ej.F r10 = new com.github.catvod.spider.merge.ej.F
            r10.<init>(r4, r0)
            goto L98
        L91:
            java.util.List<com.github.catvod.spider.merge.ej.N> r9 = r8.c
            com.github.catvod.spider.merge.ej.E r10 = new com.github.catvod.spider.merge.ej.E
            r10.<init>(r4, r0)
        L98:
            r9.add(r10)
            return
        L9c:
            com.github.catvod.spider.merge.ej.Q r9 = new com.github.catvod.spider.merge.ej.Q
            java.lang.Object[] r10 = new java.lang.Object[r5]
            r10[r4] = r0
            java.lang.String r0 = "Could not parse nth-index '%s': unexpected format"
            r9.<init>(r0, r10)
            goto La9
        La8:
            throw r9
        La9:
            goto La8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.ej.P.d(boolean, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v105, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void e() {
        List<N> list;
        N j;
        List<N> list2;
        N c;
        List<N> list3;
        N c1069o;
        List<N> list4;
        N c1063i;
        if (this.a.j("#")) {
            String strE = this.a.e();
            com.github.catvod.spider.merge.Dw.i.i(strE);
            this.c.add(new C1074u(strE));
            return;
        }
        int i = 1;
        if (this.a.j(".")) {
            String strE2 = this.a.e();
            com.github.catvod.spider.merge.Dw.i.i(strE2);
            this.c.add(new C1063i(strE2.trim(), i));
            return;
        }
        int i2 = 2;
        int i3 = 0;
        if (this.a.m() || this.a.k("*|")) {
            String strD = com.github.catvod.spider.merge.Dw.s.d(this.a.f());
            com.github.catvod.spider.merge.Dw.i.i(strD);
            if (strD.startsWith("*|")) {
                this.c.add(new C1059e(new M(strD), new C1063i(strD.replace("*|", ":"), i2)));
                return;
            }
            if (strD.contains("|")) {
                strD = strD.replace("|", ":");
            }
            this.c.add(new M(strD));
            return;
        }
        if (this.a.k("[")) {
            com.github.catvod.spider.merge.Fs.P p = new com.github.catvod.spider.merge.Fs.P(this.a.a('[', ']'));
            String strG = p.g(e);
            com.github.catvod.spider.merge.Dw.i.i(strG);
            p.h();
            if (p.i()) {
                if (strG.startsWith("^")) {
                    list4 = this.c;
                    c1063i = new C1065k(strG.substring(1), 0);
                } else {
                    list4 = this.c;
                    c1063i = new C1063i(strG, i3);
                }
                list4.add(c1063i);
                return;
            }
            if (p.j("=")) {
                list3 = this.c;
                c1069o = new C1066l(strG, p.n());
            } else if (p.j("!=")) {
                list3 = this.c;
                c1069o = new C1070p(strG, p.n());
            } else if (p.j("^=")) {
                list3 = this.c;
                c1069o = new C1071q(strG, p.n());
            } else if (p.j("$=")) {
                list3 = this.c;
                c1069o = new C1068n(strG, p.n());
            } else if (p.j("*=")) {
                list3 = this.c;
                c1069o = new C1067m(strG, p.n());
            } else {
                if (!p.j("~=")) {
                    throw new Q("Could not parse attribute query '%s': unexpected token at '%s'", this.b, p.n());
                }
                list3 = this.c;
                c1069o = new C1069o(strG, Pattern.compile(p.n()));
            }
            list3.add(c1069o);
            return;
        }
        if (this.a.j("*")) {
            this.c.add(new C1062h());
            return;
        }
        if (this.a.j(":lt(")) {
            this.c.add(new C1078y(b()));
            return;
        }
        if (this.a.j(":gt(")) {
            this.c.add(new C1077x(b()));
            return;
        }
        if (this.a.j(":eq(")) {
            this.c.add(new C1075v(b()));
            return;
        }
        if (this.a.k(":has(")) {
            this.a.d(":has");
            String strA = this.a.a('(', ')');
            com.github.catvod.spider.merge.Dw.i.j(strA, ":has(el) subselect must not be empty");
            this.c.add(new S(h(strA)));
            return;
        }
        if (this.a.k(":contains(")) {
            c(false);
            return;
        }
        if (this.a.k(":containsOwn(")) {
            c(true);
            return;
        }
        if (this.a.k(":containsData(")) {
            this.a.d(":containsData");
            String strO = com.github.catvod.spider.merge.Fs.P.o(this.a.a('(', ')'));
            com.github.catvod.spider.merge.Dw.i.j(strO, ":containsData(text) query must not be empty");
            this.c.add(new C1065k(strO, 1));
            return;
        }
        if (this.a.k(":matches(")) {
            f(false);
            return;
        }
        if (this.a.k(":matchesOwn(")) {
            f(true);
            return;
        }
        if (this.a.k(":not(")) {
            this.a.d(":not");
            String strA2 = this.a.a('(', ')');
            com.github.catvod.spider.merge.Dw.i.j(strA2, ":not(selector) subselect must not be empty");
            this.c.add(new V(h(strA2)));
            return;
        }
        if (this.a.j(":nth-child(")) {
            d(false, false);
            return;
        }
        if (this.a.j(":nth-last-child(")) {
            d(true, false);
            return;
        }
        if (this.a.j(":nth-of-type(")) {
            d(false, true);
            return;
        }
        if (this.a.j(":nth-last-of-type(")) {
            d(true, true);
            return;
        }
        if (this.a.j(":first-child")) {
            list = this.c;
            j = new A(i3);
        } else if (this.a.j(":last-child")) {
            list = this.c;
            j = new C(i3);
        } else if (this.a.j(":first-of-type")) {
            list = this.c;
            j = new B();
        } else {
            if (!this.a.j(":last-of-type")) {
                if (this.a.j(":only-child")) {
                    list2 = this.c;
                    c = new A(i);
                } else if (this.a.j(":only-of-type")) {
                    list = this.c;
                    j = new I();
                } else if (this.a.j(":empty")) {
                    list = this.c;
                    j = new C1079z();
                } else if (this.a.j(":root")) {
                    list2 = this.c;
                    c = new C(i);
                } else {
                    if (!this.a.j(":matchText")) {
                        throw new Q("Could not parse query '%s': unexpected token at '%s'", this.b, this.a.n());
                    }
                    list = this.c;
                    j = new J();
                }
                list2.add(c);
                return;
            }
            list = this.c;
            j = new D();
        }
        list.add(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    private void f(boolean z) {
        N k;
        ?? r4;
        this.a.d(z ? ":matchesOwn" : ":matches");
        String strA = this.a.a('(', ')');
        com.github.catvod.spider.merge.Dw.i.j(strA, ":matches(regex) query must not be empty");
        if (z) {
            List<N> list = this.c;
            k = new L(Pattern.compile(strA));
            r4 = list;
        } else {
            List<N> list2 = this.c;
            k = new K(Pattern.compile(strA));
            r4 = list2;
        }
        r4.add(k);
    }

    public static N h(String str) {
        try {
            return new P(str).g();
        } catch (IllegalArgumentException e2) {
            throw new Q(e2.getMessage(), new Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:11:0x0037). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0040 -> B:14:0x0042). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final com.github.catvod.spider.merge.ej.N g() {
        /*
            r4 = this;
            com.github.catvod.spider.merge.Fs.P r0 = r4.a
            r0.h()
            com.github.catvod.spider.merge.Fs.P r0 = r4.a
            java.lang.String[] r1 = com.github.catvod.spider.merge.ej.P.d
            boolean r0 = r0.l(r1)
            if (r0 == 0) goto L1b
            java.util.List<com.github.catvod.spider.merge.ej.N> r0 = r4.c
            com.github.catvod.spider.merge.ej.Y r1 = new com.github.catvod.spider.merge.ej.Y
            r1.<init>()
            r0.add(r1)
            r0 = r4
            goto L37
        L1b:
            r0 = r4
        L1c:
            r0.e()
        L1f:
            com.github.catvod.spider.merge.Fs.P r1 = r0.a
            boolean r1 = r1.i()
            if (r1 != 0) goto L46
            com.github.catvod.spider.merge.Fs.P r1 = r0.a
            boolean r1 = r1.h()
            com.github.catvod.spider.merge.Fs.P r2 = r0.a
            java.lang.String[] r3 = com.github.catvod.spider.merge.ej.P.d
            boolean r2 = r2.l(r3)
            if (r2 == 0) goto L3e
        L37:
            com.github.catvod.spider.merge.Fs.P r1 = r0.a
            char r1 = r1.c()
            goto L42
        L3e:
            if (r1 == 0) goto L1c
            r1 = 32
        L42:
            r0.a(r1)
            goto L1f
        L46:
            java.util.List<com.github.catvod.spider.merge.ej.N> r1 = r0.c
            int r1 = r1.size()
            r2 = 1
            if (r1 != r2) goto L59
            java.util.List<com.github.catvod.spider.merge.ej.N> r0 = r0.c
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.github.catvod.spider.merge.ej.N r0 = (com.github.catvod.spider.merge.ej.N) r0
            return r0
        L59:
            com.github.catvod.spider.merge.ej.d r1 = new com.github.catvod.spider.merge.ej.d
            java.util.List<com.github.catvod.spider.merge.ej.N> r0 = r0.c
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.ej.P.g():com.github.catvod.spider.merge.ej.N");
    }

    public final String toString() {
        return this.b;
    }
}
