package com.github.catvod.spider.merge.FM.M;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.slf4j.Marker;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class P {
    private static final String[] d = {",", ">", Marker.ANY_NON_NULL_MARKER, "~", " "};
    private static final String[] e = {"=", "!=", "^=", "$=", "*=", "~="};
    private static final Pattern f = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);
    private static final Pattern g = Pattern.compile("([+-])?(\\d+)");
    private final com.github.catvod.spider.merge.FM.L.S a;
    private final String b;
    private final List<N> c = new ArrayList();

    private P(String str) {
        com.github.catvod.spider.merge.FM.I.c.e(str);
        String strTrim = str.trim();
        this.b = strTrim;
        this.a = new com.github.catvod.spider.merge.FM.L.S(strTrim);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0148  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.M.N>] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.M.N>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.M.N>] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.M.N>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(char r10) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.FM.M.P.a(char):void");
    }

    private int b() {
        String strTrim = this.a.b().trim();
        int i = com.github.catvod.spider.merge.FM.J.b.f;
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
        com.github.catvod.spider.merge.FM.I.c.d(z, "Index must be numeric");
        return Integer.parseInt(strTrim);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void c(boolean z) {
        String str = z ? ":containsOwn" : ":contains";
        this.a.d(str);
        String strO = com.github.catvod.spider.merge.FM.L.S.o(this.a.a('(', ')'));
        com.github.catvod.spider.merge.FM.I.c.f(strO, str + "(text) query must not be empty");
        this.c.add(z ? new r(strO) : new C0285s(strO, 0));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void d(boolean z) {
        String str = z ? ":containsWholeOwnText" : ":containsWholeText";
        this.a.d(str);
        String strO = com.github.catvod.spider.merge.FM.L.S.o(this.a.a('(', ')'));
        com.github.catvod.spider.merge.FM.I.c.f(strO, str + "(text) query must not be empty");
        this.c.add(z ? new C0286t(strO, 0) : new C0287u(strO));
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
    private void e(boolean r9, boolean r10) {
        /*
            r8 = this;
            com.github.catvod.spider.merge.FM.L.S r0 = r8.a
            java.lang.String r0 = r0.b()
            java.lang.String r0 = com.github.catvod.spider.merge.FM.A.l.e(r0)
            java.util.regex.Pattern r1 = com.github.catvod.spider.merge.FM.M.P.f
            java.util.regex.Matcher r1 = r1.matcher(r0)
            java.util.regex.Pattern r2 = com.github.catvod.spider.merge.FM.M.P.g
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
            java.util.List<com.github.catvod.spider.merge.FM.M.N> r9 = r8.c
            com.github.catvod.spider.merge.FM.M.I r10 = new com.github.catvod.spider.merge.FM.M.I
            r10.<init>(r4, r0)
            goto L98
        L7f:
            java.util.List<com.github.catvod.spider.merge.FM.M.N> r9 = r8.c
            com.github.catvod.spider.merge.FM.M.J r10 = new com.github.catvod.spider.merge.FM.M.J
            r10.<init>(r4, r0)
            goto L98
        L87:
            if (r9 == 0) goto L91
            java.util.List<com.github.catvod.spider.merge.FM.M.N> r9 = r8.c
            com.github.catvod.spider.merge.FM.M.H r10 = new com.github.catvod.spider.merge.FM.M.H
            r10.<init>(r4, r0)
            goto L98
        L91:
            java.util.List<com.github.catvod.spider.merge.FM.M.N> r9 = r8.c
            com.github.catvod.spider.merge.FM.M.G r10 = new com.github.catvod.spider.merge.FM.M.G
            r10.<init>(r4, r0)
        L98:
            r9.add(r10)
            return
        L9c:
            com.github.catvod.spider.merge.FM.M.Q r9 = new com.github.catvod.spider.merge.FM.M.Q
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
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.FM.M.P.e(boolean, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v113, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void f() {
        List<N> list;
        N l;
        List<N> list2;
        N e2;
        List<N> list3;
        N c0282o;
        List<N> list4;
        N c0276i;
        if (this.a.j("#")) {
            String strE = this.a.e();
            com.github.catvod.spider.merge.FM.I.c.e(strE);
            this.c.add(new C0289w(strE));
            return;
        }
        int i = 1;
        if (this.a.j(".")) {
            String strE2 = this.a.e();
            com.github.catvod.spider.merge.FM.I.c.e(strE2);
            this.c.add(new C0276i(strE2.trim(), i));
            return;
        }
        int i2 = 0;
        if (this.a.m() || this.a.k("*|")) {
            String strE3 = com.github.catvod.spider.merge.FM.A.l.e(this.a.f());
            com.github.catvod.spider.merge.FM.I.c.e(strE3);
            if (strE3.startsWith("*|")) {
                this.c.add(new C0272e(new C0285s(strE3.substring(2), 1), new C0286t(strE3.replace("*|", ":"), i)));
                return;
            } else {
                if (strE3.contains("|")) {
                    strE3 = strE3.replace("|", ":");
                }
                this.c.add(new C0285s(strE3, 1));
                return;
            }
        }
        if (this.a.k("[")) {
            com.github.catvod.spider.merge.FM.L.S s = new com.github.catvod.spider.merge.FM.L.S(this.a.a('[', ']'));
            String strG = s.g(e);
            com.github.catvod.spider.merge.FM.I.c.e(strG);
            s.h();
            if (s.i()) {
                if (strG.startsWith("^")) {
                    list4 = this.c;
                    c0276i = new C0278k(strG.substring(1), 0);
                } else {
                    list4 = this.c;
                    c0276i = new C0276i(strG, i2);
                }
                list4.add(c0276i);
                return;
            }
            if (s.j("=")) {
                list3 = this.c;
                c0282o = new C0279l(strG, s.n());
            } else if (s.j("!=")) {
                list3 = this.c;
                c0282o = new C0283p(strG, s.n());
            } else if (s.j("^=")) {
                list3 = this.c;
                c0282o = new C0284q(strG, s.n());
            } else if (s.j("$=")) {
                list3 = this.c;
                c0282o = new C0281n(strG, s.n());
            } else if (s.j("*=")) {
                list3 = this.c;
                c0282o = new C0280m(strG, s.n());
            } else {
                if (!s.j("~=")) {
                    throw new Q("Could not parse attribute query '%s': unexpected token at '%s'", this.b, s.n());
                }
                list3 = this.c;
                c0282o = new C0282o(strG, Pattern.compile(s.n()));
            }
            list3.add(c0282o);
            return;
        }
        if (this.a.j(Marker.ANY_MARKER)) {
            this.c.add(new C0275h());
            return;
        }
        if (this.a.j(":lt(")) {
            this.c.add(new A(b()));
            return;
        }
        if (this.a.j(":gt(")) {
            this.c.add(new C0292z(b()));
            return;
        }
        if (this.a.j(":eq(")) {
            this.c.add(new C0290x(b()));
            return;
        }
        if (this.a.k(":has(")) {
            this.a.d(":has");
            String strA = this.a.a('(', ')');
            com.github.catvod.spider.merge.FM.I.c.f(strA, ":has(selector) sub-select must not be empty");
            this.c.add(new T(j(strA)));
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
            String strO = com.github.catvod.spider.merge.FM.L.S.o(this.a.a('(', ')'));
            com.github.catvod.spider.merge.FM.I.c.f(strO, ":containsData(text) query must not be empty");
            this.c.add(new C0278k(strO, 1));
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
            com.github.catvod.spider.merge.FM.I.c.f(strA2, ":not(selector) subselect must not be empty");
            this.c.add(new W(j(strA2)));
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
            l = new C(i2);
        } else if (this.a.j(":last-child")) {
            list = this.c;
            l = new E(i2);
        } else if (this.a.j(":first-of-type")) {
            list = this.c;
            l = new D();
        } else {
            if (!this.a.j(":last-of-type")) {
                if (this.a.j(":only-child")) {
                    list2 = this.c;
                    e2 = new C(i);
                } else if (this.a.j(":only-of-type")) {
                    list = this.c;
                    l = new K();
                } else if (this.a.j(":empty")) {
                    list = this.c;
                    l = new B();
                } else if (this.a.j(":root")) {
                    list2 = this.c;
                    e2 = new E(i);
                } else {
                    if (!this.a.j(":matchText")) {
                        throw new Q("Could not parse query '%s': unexpected token at '%s'", this.b, this.a.n());
                    }
                    list = this.c;
                    l = new L();
                }
                list2.add(e2);
                return;
            }
            list = this.c;
            l = new F();
        }
        list.add(l);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void g(boolean z) {
        String str = z ? ":matchesOwn" : ":matches";
        this.a.d(str);
        String strA = this.a.a('(', ')');
        com.github.catvod.spider.merge.FM.I.c.f(strA, str + "(regex) query must not be empty");
        this.c.add(z ? new C0276i(Pattern.compile(strA), 2) : new M(Pattern.compile(strA)));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void h(boolean z) {
        String str = z ? ":matchesWholeOwnText" : ":matchesWholeText";
        this.a.d(str);
        String strA = this.a.a('(', ')');
        com.github.catvod.spider.merge.FM.I.c.f(strA, str + "(regex) query must not be empty");
        this.c.add(z ? new C0278k(Pattern.compile(strA)) : new r(Pattern.compile(strA)));
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
    final com.github.catvod.spider.merge.FM.M.N i() {
        /*
            r4 = this;
            com.github.catvod.spider.merge.FM.L.S r0 = r4.a
            r0.h()
            com.github.catvod.spider.merge.FM.L.S r0 = r4.a
            java.lang.String[] r1 = com.github.catvod.spider.merge.FM.M.P.d
            boolean r0 = r0.l(r1)
            if (r0 == 0) goto L1b
            java.util.List<com.github.catvod.spider.merge.FM.M.N> r0 = r4.c
            com.github.catvod.spider.merge.FM.M.Z r1 = new com.github.catvod.spider.merge.FM.M.Z
            r1.<init>()
            r0.add(r1)
            r0 = r4
            goto L37
        L1b:
            r0 = r4
        L1c:
            r0.f()
        L1f:
            com.github.catvod.spider.merge.FM.L.S r1 = r0.a
            boolean r1 = r1.i()
            if (r1 != 0) goto L46
            com.github.catvod.spider.merge.FM.L.S r1 = r0.a
            boolean r1 = r1.h()
            com.github.catvod.spider.merge.FM.L.S r2 = r0.a
            java.lang.String[] r3 = com.github.catvod.spider.merge.FM.M.P.d
            boolean r2 = r2.l(r3)
            if (r2 == 0) goto L3e
        L37:
            com.github.catvod.spider.merge.FM.L.S r1 = r0.a
            char r1 = r1.c()
            goto L42
        L3e:
            if (r1 == 0) goto L1c
            r1 = 32
        L42:
            r0.a(r1)
            goto L1f
        L46:
            java.util.List<com.github.catvod.spider.merge.FM.M.N> r1 = r0.c
            int r1 = r1.size()
            r2 = 1
            if (r1 != r2) goto L59
            java.util.List<com.github.catvod.spider.merge.FM.M.N> r0 = r0.c
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.github.catvod.spider.merge.FM.M.N r0 = (com.github.catvod.spider.merge.FM.M.N) r0
            return r0
        L59:
            com.github.catvod.spider.merge.FM.M.d r1 = new com.github.catvod.spider.merge.FM.M.d
            java.util.List<com.github.catvod.spider.merge.FM.M.N> r0 = r0.c
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.FM.M.P.i():com.github.catvod.spider.merge.FM.M.N");
    }

    public final String toString() {
        return this.b;
    }
}
