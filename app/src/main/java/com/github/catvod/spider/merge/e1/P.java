package com.github.catvod.spider.merge.e1;

import com.github.catvod.spider.merge.a1.C0899d;
import com.github.catvod.spider.merge.b1.C0906c;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class P {
    private static final String[] d = {",", ">", "+", "~", " "};
    private static final String[] e = {"=", "!=", "^=", "$=", "*=", "~="};
    private static final Pattern f = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);
    private static final Pattern g = Pattern.compile("([+-])?(\\d+)");
    private final com.github.catvod.spider.merge.d1.Q a;
    private final String b;
    private final List<N> c = new ArrayList();

    private P(String str) {
        C0899d.f(str);
        String strTrim = str.trim();
        this.b = strTrim;
        this.a = new com.github.catvod.spider.merge.d1.Q(strTrim);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0148  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.e1.N>] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.e1.N>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.e1.N>] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.e1.N>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(char r10) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.e1.P.a(char):void");
    }

    private int b() {
        String strTrim = this.a.b().trim();
        int i = C0906c.f;
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
        C0899d.e(z, "Index must be numeric");
        return Integer.parseInt(strTrim);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void c(boolean z) {
        String str = z ? ":containsOwn" : ":contains";
        this.a.d(str);
        String strO = com.github.catvod.spider.merge.d1.Q.o(this.a.a('(', ')'));
        C0899d.g(strO, str + "(text) query must not be empty");
        this.c.add(z ? new C1038i(strO, 1) : new C1040k(strO, 1));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void d(boolean z) {
        String str = z ? ":containsWholeOwnText" : ":containsWholeText";
        this.a.d(str);
        String strO = com.github.catvod.spider.merge.d1.Q.o(this.a.a('(', ')'));
        C0899d.g(strO, str + "(text) query must not be empty");
        int i = 0;
        this.c.add(z ? new C1048t(strO, i) : new C1049u(strO, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void e(boolean r9, boolean r10) {
        /*
            r8 = this;
            com.github.catvod.spider.merge.d1.Q r0 = r8.a
            java.lang.String r0 = r0.b()
            java.lang.String r0 = com.github.catvod.spider.merge.g.b.c(r0)
            java.util.regex.Pattern r1 = com.github.catvod.spider.merge.e1.P.f
            java.util.regex.Matcher r1 = r1.matcher(r0)
            java.util.regex.Pattern r2 = com.github.catvod.spider.merge.e1.P.g
            java.util.regex.Matcher r2 = r2.matcher(r0)
            java.lang.String r3 = "odd"
            boolean r3 = r3.equals(r0)
            r4 = 0
            r5 = 1
            r6 = 2
            if (r3 == 0) goto L24
            r0 = 1
        L22:
            r4 = 2
            goto L74
        L24:
            java.lang.String r3 = "even"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L2e
            r0 = 0
            goto L22
        L2e:
            boolean r3 = r1.matches()
            java.lang.String r6 = ""
            java.lang.String r7 = "^\\+"
            if (r3 == 0) goto L62
            r0 = 3
            java.lang.String r0 = r1.group(r0)
            if (r0 == 0) goto L4b
            java.lang.String r0 = r1.group(r5)
            java.lang.String r0 = r0.replaceFirst(r7, r6)
            int r5 = java.lang.Integer.parseInt(r0)
        L4b:
            r0 = 4
            java.lang.String r2 = r1.group(r0)
            if (r2 == 0) goto L5f
            java.lang.String r0 = r1.group(r0)
            java.lang.String r0 = r0.replaceFirst(r7, r6)
            int r0 = java.lang.Integer.parseInt(r0)
            r4 = r0
        L5f:
            r0 = r4
            r4 = r5
            goto L74
        L62:
            boolean r1 = r2.matches()
            if (r1 == 0) goto L9d
            java.lang.String r0 = r2.group()
            java.lang.String r0 = r0.replaceFirst(r7, r6)
            int r0 = java.lang.Integer.parseInt(r0)
        L74:
            if (r10 == 0) goto L88
            if (r9 == 0) goto L80
            java.util.List<com.github.catvod.spider.merge.e1.N> r9 = r8.c
            com.github.catvod.spider.merge.e1.H r10 = new com.github.catvod.spider.merge.e1.H
            r10.<init>(r4, r0)
            goto L99
        L80:
            java.util.List<com.github.catvod.spider.merge.e1.N> r9 = r8.c
            com.github.catvod.spider.merge.e1.I r10 = new com.github.catvod.spider.merge.e1.I
            r10.<init>(r4, r0)
            goto L99
        L88:
            if (r9 == 0) goto L92
            java.util.List<com.github.catvod.spider.merge.e1.N> r9 = r8.c
            com.github.catvod.spider.merge.e1.G r10 = new com.github.catvod.spider.merge.e1.G
            r10.<init>(r4, r0)
            goto L99
        L92:
            java.util.List<com.github.catvod.spider.merge.e1.N> r9 = r8.c
            com.github.catvod.spider.merge.e1.F r10 = new com.github.catvod.spider.merge.e1.F
            r10.<init>(r4, r0)
        L99:
            r9.add(r10)
            return
        L9d:
            com.github.catvod.spider.merge.e1.Q r9 = new com.github.catvod.spider.merge.e1.Q
            java.lang.Object[] r10 = new java.lang.Object[r5]
            r10[r4] = r0
            java.lang.String r0 = "Could not parse nth-index '%s': unexpected format"
            r9.<init>(r0, r10)
            goto Laa
        La9:
            throw r9
        Laa:
            goto La9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.e1.P.e(boolean, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v112, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v81, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void f() {
        List<N> list;
        N k;
        List<N> list2;
        N c1044o;
        List<N> list3;
        N c1038i;
        int i = 0;
        if (this.a.j("#")) {
            String strE = this.a.e();
            C0899d.f(strE);
            this.c.add(new C1051w(strE, i));
            return;
        }
        if (this.a.j(".")) {
            String strE2 = this.a.e();
            C0899d.f(strE2);
            this.c.add(new r(strE2.trim()));
            return;
        }
        int i2 = 2;
        int i3 = 1;
        if (this.a.m() || this.a.k("*|")) {
            String strC = com.github.catvod.spider.merge.g.b.c(this.a.f());
            C0899d.f(strC);
            if (strC.startsWith("*|")) {
                this.c.add(new C1034e(new L(strC.substring(2)), new M(strC.replace("*|", ":"))));
                return;
            } else {
                if (strC.contains("|")) {
                    strC = strC.replace("|", ":");
                }
                this.c.add(new L(strC));
                return;
            }
        }
        if (this.a.k("[")) {
            com.github.catvod.spider.merge.d1.Q q = new com.github.catvod.spider.merge.d1.Q(this.a.a('[', ']'));
            String strG = q.g(e);
            C0899d.f(strG);
            q.h();
            if (q.i()) {
                if (strG.startsWith("^")) {
                    list3 = this.c;
                    c1038i = new C1040k(strG.substring(1), 0);
                } else {
                    list3 = this.c;
                    c1038i = new C1038i(strG, 0);
                }
                list3.add(c1038i);
                return;
            }
            if (q.j("=")) {
                list2 = this.c;
                c1044o = new C1041l(strG, q.n());
            } else if (q.j("!=")) {
                list2 = this.c;
                c1044o = new C1045p(strG, q.n());
            } else if (q.j("^=")) {
                list2 = this.c;
                c1044o = new C1046q(strG, q.n());
            } else if (q.j("$=")) {
                list2 = this.c;
                c1044o = new C1043n(strG, q.n());
            } else if (q.j("*=")) {
                list2 = this.c;
                c1044o = new C1042m(strG, q.n());
            } else {
                if (!q.j("~=")) {
                    throw new Q("Could not parse attribute query '%s': unexpected token at '%s'", this.b, q.n());
                }
                list2 = this.c;
                c1044o = new C1044o(strG, Pattern.compile(q.n()));
            }
            list2.add(c1044o);
            return;
        }
        if (this.a.j("*")) {
            this.c.add(new C1037h(i));
            return;
        }
        if (this.a.j(":lt(")) {
            this.c.add(new C1027A(b()));
            return;
        }
        if (this.a.j(":gt(")) {
            this.c.add(new C1054z(b()));
            return;
        }
        if (this.a.j(":eq(")) {
            this.c.add(new C1052x(b()));
            return;
        }
        if (this.a.k(":has(")) {
            this.a.d(":has");
            String strA = this.a.a('(', ')');
            C0899d.g(strA, ":has(selector) sub-select must not be empty");
            this.c.add(new S(j(strA)));
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
        if (this.a.k(":containsWholeText(")) {
            d(false);
            return;
        }
        if (this.a.k(":containsWholeOwnText(")) {
            d(true);
            return;
        }
        if (this.a.k(":containsData(")) {
            this.a.d(":containsData");
            String strO = com.github.catvod.spider.merge.d1.Q.o(this.a.a('(', ')'));
            C0899d.g(strO, ":containsData(text) query must not be empty");
            this.c.add(new C1047s(strO));
            return;
        }
        if (this.a.k(":matches(")) {
            g(false);
            return;
        }
        if (this.a.k(":matchesOwn(")) {
            g(true);
            return;
        }
        if (this.a.k(":matchesWholeText(")) {
            h(false);
            return;
        }
        if (this.a.k(":matchesWholeOwnText(")) {
            h(true);
            return;
        }
        if (this.a.k(":not(")) {
            this.a.d(":not");
            String strA2 = this.a.a('(', ')');
            C0899d.g(strA2, ":not(selector) subselect must not be empty");
            this.c.add(new V(j(strA2)));
            return;
        }
        if (this.a.j(":nth-child(")) {
            e(false, false);
            return;
        }
        if (this.a.j(":nth-last-child(")) {
            e(true, false);
            return;
        }
        if (this.a.j(":nth-of-type(")) {
            e(false, true);
            return;
        }
        if (this.a.j(":nth-last-of-type(")) {
            e(true, true);
            return;
        }
        if (this.a.j(":first-child")) {
            list = this.c;
            k = new C1037h(i3);
        } else if (this.a.j(":last-child")) {
            list = this.c;
            k = new D();
        } else if (this.a.j(":first-of-type")) {
            list = this.c;
            k = new C1029C();
        } else if (this.a.j(":last-of-type")) {
            list = this.c;
            k = new E();
        } else if (this.a.j(":only-child")) {
            list = this.c;
            k = new J();
        } else if (this.a.j(":only-of-type")) {
            list = this.c;
            k = new C1028B(i3);
        } else if (this.a.j(":empty")) {
            this.c.add(new C1028B(i));
            return;
        } else if (this.a.j(":root")) {
            list = this.c;
            k = new C1037h(i2);
        } else {
            if (!this.a.j(":matchText")) {
                throw new Q("Could not parse query '%s': unexpected token at '%s'", this.b, this.a.n());
            }
            list = this.c;
            k = new K();
        }
        list.add(k);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void g(boolean z) {
        String str = z ? ":matchesOwn" : ":matches";
        this.a.d(str);
        String strA = this.a.a('(', ')');
        C0899d.g(strA, str + "(regex) query must not be empty");
        this.c.add(z ? new C1048t(Pattern.compile(strA), 1) : new C1040k(Pattern.compile(strA)));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void h(boolean z) {
        String str = z ? ":matchesWholeOwnText" : ":matchesWholeText";
        this.a.d(str);
        String strA = this.a.a('(', ')');
        C0899d.g(strA, str + "(regex) query must not be empty");
        int i = 1;
        this.c.add(z ? new C1049u(Pattern.compile(strA), i) : new C1051w(Pattern.compile(strA), i));
    }

    public static N j(String str) {
        try {
            return new P(str).i();
        } catch (IllegalArgumentException e2) {
            throw new Q(e2.getMessage());
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
    final com.github.catvod.spider.merge.e1.N i() {
        /*
            r4 = this;
            com.github.catvod.spider.merge.d1.Q r0 = r4.a
            r0.h()
            com.github.catvod.spider.merge.d1.Q r0 = r4.a
            java.lang.String[] r1 = com.github.catvod.spider.merge.e1.P.d
            boolean r0 = r0.l(r1)
            if (r0 == 0) goto L1b
            java.util.List<com.github.catvod.spider.merge.e1.N> r0 = r4.c
            com.github.catvod.spider.merge.e1.Y r1 = new com.github.catvod.spider.merge.e1.Y
            r1.<init>()
            r0.add(r1)
            r0 = r4
            goto L37
        L1b:
            r0 = r4
        L1c:
            r0.f()
        L1f:
            com.github.catvod.spider.merge.d1.Q r1 = r0.a
            boolean r1 = r1.i()
            if (r1 != 0) goto L46
            com.github.catvod.spider.merge.d1.Q r1 = r0.a
            boolean r1 = r1.h()
            com.github.catvod.spider.merge.d1.Q r2 = r0.a
            java.lang.String[] r3 = com.github.catvod.spider.merge.e1.P.d
            boolean r2 = r2.l(r3)
            if (r2 == 0) goto L3e
        L37:
            com.github.catvod.spider.merge.d1.Q r1 = r0.a
            char r1 = r1.c()
            goto L42
        L3e:
            if (r1 == 0) goto L1c
            r1 = 32
        L42:
            r0.a(r1)
            goto L1f
        L46:
            java.util.List<com.github.catvod.spider.merge.e1.N> r1 = r0.c
            int r1 = r1.size()
            r2 = 1
            if (r1 != r2) goto L59
            java.util.List<com.github.catvod.spider.merge.e1.N> r0 = r0.c
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.github.catvod.spider.merge.e1.N r0 = (com.github.catvod.spider.merge.e1.N) r0
            return r0
        L59:
            com.github.catvod.spider.merge.e1.d r1 = new com.github.catvod.spider.merge.e1.d
            java.util.List<com.github.catvod.spider.merge.e1.N> r0 = r0.c
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.e1.P.i():com.github.catvod.spider.merge.e1.N");
    }

    public final String toString() {
        return this.b;
    }
}
