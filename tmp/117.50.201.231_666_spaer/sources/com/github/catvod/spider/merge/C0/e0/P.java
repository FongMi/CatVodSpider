package com.github.catvod.spider.merge.C0.e0;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.slf4j.Marker;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class P {
    private static final String[] d = {",", ">", Marker.ANY_NON_NULL_MARKER, "~", " "};
    private static final String[] e = {"=", "!=", "^=", "$=", "*=", "~="};
    private static final Pattern f = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);
    private static final Pattern g = Pattern.compile("([+-])?(\\d+)");
    private final com.github.catvod.spider.merge.C0.d0.P a;
    private final String b;
    private final List<N> c = new ArrayList();

    private P(String str) {
        com.github.catvod.spider.merge.C0.N.a.i(str);
        String strTrim = str.trim();
        this.b = strTrim;
        this.a = new com.github.catvod.spider.merge.C0.d0.P(strTrim);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0156  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(char r10) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0.e0.P.a(char):void");
    }

    private int b() {
        boolean z = false;
        String strTrim = this.a.b().trim();
        int i = com.github.catvod.spider.merge.C0.b0.b.d;
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
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9 */
    private void c(boolean z) {
        Object c0191s;
        ?? r0;
        this.a.d(z ? ":containsOwn" : ":contains");
        String strO = com.github.catvod.spider.merge.C0.d0.P.o(this.a.a('(', ')'));
        com.github.catvod.spider.merge.C0.N.a.j(strO, ":contains(text) query must not be empty");
        if (z) {
            List<N> list = this.c;
            c0191s = new r(strO);
            r0 = list;
        } else {
            List<N> list2 = this.c;
            c0191s = new C0191s(strO);
            r0 = list2;
        }
        r0.add(c0191s);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    private void d(boolean z, boolean z2) {
        int i;
        int i2;
        Object e2;
        ?? r1;
        String strD = com.github.catvod.spider.merge.C0.x.a.d(this.a.b());
        Matcher matcher = f.matcher(strD);
        Matcher matcher2 = g.matcher(strD);
        if ("odd".equals(strD)) {
            i = 2;
            i2 = i;
        } else if ("even".equals(strD)) {
            i = 0;
            i = 2;
            i2 = i;
        } else if (matcher.matches()) {
            i = matcher.group(3) != null ? Integer.parseInt(matcher.group(1).replaceFirst("^\\+", "")) : 1;
            i2 = matcher.group(4) != null ? Integer.parseInt(matcher.group(4).replaceFirst("^\\+", "")) : 0;
        } else {
            if (!matcher2.matches()) {
                throw new Q("Could not parse nth-index '%s': unexpected format", strD);
            }
            i = 0;
            i2 = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
        }
        if (z2) {
            if (z) {
                List<N> list = this.c;
                e2 = new G(i, i2);
                r1 = list;
            } else {
                List<N> list2 = this.c;
                e2 = new H(i, i2);
                r1 = list2;
            }
        } else if (z) {
            List<N> list3 = this.c;
            e2 = new F(i, i2);
            r1 = list3;
        } else {
            List<N> list4 = this.c;
            e2 = new E(i, i2);
            r1 = list4;
        }
        r1.add(e2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v119, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v67, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void e() {
        List<N> list;
        Object j;
        List<N> list2;
        Object c;
        List<N> list3;
        Object c0188o;
        List<N> list4;
        Object c0182i;
        int i = 2;
        int i2 = 0;
        int i3 = 1;
        if (this.a.j("#")) {
            String strE = this.a.e();
            com.github.catvod.spider.merge.C0.N.a.i(strE);
            this.c.add(new C0193u(strE));
            return;
        }
        if (this.a.j(".")) {
            String strE2 = this.a.e();
            com.github.catvod.spider.merge.C0.N.a.i(strE2);
            this.c.add(new C0182i(strE2.trim(), i3));
            return;
        }
        if (this.a.m() || this.a.k("*|")) {
            String strD = com.github.catvod.spider.merge.C0.x.a.d(this.a.f());
            com.github.catvod.spider.merge.C0.N.a.i(strD);
            if (strD.startsWith("*|")) {
                this.c.add(new C0178e(new M(strD), new C0182i(strD.replace("*|", ":"), i)));
                return;
            }
            if (strD.contains("|")) {
                strD = strD.replace("|", ":");
            }
            this.c.add(new M(strD));
            return;
        }
        if (this.a.k("[")) {
            com.github.catvod.spider.merge.C0.d0.P p = new com.github.catvod.spider.merge.C0.d0.P(this.a.a('[', ']'));
            String strG = p.g(e);
            com.github.catvod.spider.merge.C0.N.a.i(strG);
            p.h();
            if (p.i()) {
                if (strG.startsWith("^")) {
                    list4 = this.c;
                    c0182i = new C0184k(strG.substring(1), 0);
                } else {
                    list4 = this.c;
                    c0182i = new C0182i(strG, i2);
                }
                list4.add(c0182i);
                return;
            }
            if (p.j("=")) {
                list3 = this.c;
                c0188o = new C0185l(strG, p.n());
            } else if (p.j("!=")) {
                list3 = this.c;
                c0188o = new C0189p(strG, p.n());
            } else if (p.j("^=")) {
                list3 = this.c;
                c0188o = new C0190q(strG, p.n());
            } else if (p.j("$=")) {
                list3 = this.c;
                c0188o = new C0187n(strG, p.n());
            } else if (p.j("*=")) {
                list3 = this.c;
                c0188o = new C0186m(strG, p.n());
            } else {
                if (!p.j("~=")) {
                    throw new Q("Could not parse attribute query '%s': unexpected token at '%s'", this.b, p.n());
                }
                list3 = this.c;
                c0188o = new C0188o(strG, Pattern.compile(p.n()));
            }
            list3.add(c0188o);
            return;
        }
        if (this.a.j(Marker.ANY_MARKER)) {
            this.c.add(new C0181h());
            return;
        }
        if (this.a.j(":lt(")) {
            this.c.add(new C0197y(b()));
            return;
        }
        if (this.a.j(":gt(")) {
            this.c.add(new C0196x(b()));
            return;
        }
        if (this.a.j(":eq(")) {
            this.c.add(new C0194v(b()));
            return;
        }
        if (this.a.k(":has(")) {
            this.a.d(":has");
            String strA = this.a.a('(', ')');
            com.github.catvod.spider.merge.C0.N.a.j(strA, ":has(el) subselect must not be empty");
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
            String strO = com.github.catvod.spider.merge.C0.d0.P.o(this.a.a('(', ')'));
            com.github.catvod.spider.merge.C0.N.a.j(strO, ":containsData(text) query must not be empty");
            this.c.add(new C0184k(strO, 1));
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
            com.github.catvod.spider.merge.C0.N.a.j(strA2, ":not(selector) subselect must not be empty");
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
            j = new A(i2);
        } else if (this.a.j(":last-child")) {
            list = this.c;
            j = new C(i2);
        } else if (this.a.j(":first-of-type")) {
            list = this.c;
            j = new B();
        } else {
            if (!this.a.j(":last-of-type")) {
                if (this.a.j(":only-child")) {
                    list2 = this.c;
                    c = new A(i3);
                } else if (this.a.j(":only-of-type")) {
                    list = this.c;
                    j = new I();
                } else if (this.a.j(":empty")) {
                    list = this.c;
                    j = new C0198z();
                } else if (this.a.j(":root")) {
                    list2 = this.c;
                    c = new C(i3);
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
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    private void f(boolean z) {
        Object k;
        ?? r0;
        this.a.d(z ? ":matchesOwn" : ":matches");
        String strA = this.a.a('(', ')');
        com.github.catvod.spider.merge.C0.N.a.j(strA, ":matches(regex) query must not be empty");
        if (z) {
            List<N> list = this.c;
            k = new L(Pattern.compile(strA));
            r0 = list;
        } else {
            List<N> list2 = this.c;
            k = new K(Pattern.compile(strA));
            r0 = list2;
        }
        r0.add(k);
    }

    public static N h(String str) {
        try {
            return new P(str).g();
        } catch (IllegalArgumentException e2) {
            throw new Q(e2.getMessage(), new Object[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0022, code lost:
    
        e();
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0038 -> B:5:0x0019). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003c -> B:6:0x001f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final com.github.catvod.spider.merge.C0.e0.N g() {
        /*
            r3 = this;
            com.github.catvod.spider.merge.C0.d0.P r0 = r3.a
            r0.h()
            com.github.catvod.spider.merge.C0.d0.P r0 = r3.a
            java.lang.String[] r1 = com.github.catvod.spider.merge.C0.e0.P.d
            boolean r0 = r0.l(r1)
            if (r0 == 0) goto L3f
            java.util.List<com.github.catvod.spider.merge.C0.e0.N> r0 = r3.c
            com.github.catvod.spider.merge.C0.e0.Y r1 = new com.github.catvod.spider.merge.C0.e0.Y
            r1.<init>()
            r0.add(r1)
        L19:
            com.github.catvod.spider.merge.C0.d0.P r0 = r3.a
            char r0 = r0.c()
        L1f:
            r3.a(r0)
        L22:
            com.github.catvod.spider.merge.C0.d0.P r0 = r3.a
            boolean r0 = r0.i()
            if (r0 != 0) goto L43
            com.github.catvod.spider.merge.C0.d0.P r0 = r3.a
            boolean r0 = r0.h()
            com.github.catvod.spider.merge.C0.d0.P r1 = r3.a
            java.lang.String[] r2 = com.github.catvod.spider.merge.C0.e0.P.d
            boolean r1 = r1.l(r2)
            if (r1 != 0) goto L19
            if (r0 == 0) goto L3f
            r0 = 32
            goto L1f
        L3f:
            r3.e()
            goto L22
        L43:
            java.util.List<com.github.catvod.spider.merge.C0.e0.N> r0 = r3.c
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L56
            java.util.List<com.github.catvod.spider.merge.C0.e0.N> r0 = r3.c
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.github.catvod.spider.merge.C0.e0.N r0 = (com.github.catvod.spider.merge.C0.e0.N) r0
        L55:
            return r0
        L56:
            com.github.catvod.spider.merge.C0.e0.d r0 = new com.github.catvod.spider.merge.C0.e0.d
            java.util.List<com.github.catvod.spider.merge.C0.e0.N> r1 = r3.c
            r0.<init>(r1)
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0.e0.P.g():com.github.catvod.spider.merge.C0.e0.N");
    }

    public final String toString() {
        return this.b;
    }
}
