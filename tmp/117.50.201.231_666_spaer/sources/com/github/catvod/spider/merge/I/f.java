package com.github.catvod.spider.merge.I;

import com.github.catvod.spider.merge.H.j;
import com.github.catvod.spider.merge.I.b;
import com.github.catvod.spider.merge.I.d;
import com.github.catvod.spider.merge.I.h;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.slf4j.Marker;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class f {
    private static final String[] d = {",", ">", Marker.ANY_NON_NULL_MARKER, "~", " "};
    private static final String[] e = {"=", "!=", "^=", "$=", "*=", "~="};
    private static final Pattern f = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);
    private static final Pattern g = Pattern.compile("([+-])?(\\d+)");
    private final j a;
    private final String b;
    private final List<d> c = new ArrayList();

    private f(String str) {
        com.github.catvod.spider.merge.E.c.e(str);
        String strTrim = str.trim();
        this.b = strTrim;
        this.a = new j(strTrim);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0148  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.I.d>] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.I.d>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.I.d>] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.I.d>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(char r10) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.I.f.a(char):void");
    }

    private int b() {
        String strTrim = this.a.b().trim();
        int i = com.github.catvod.spider.merge.F.b.f;
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
        com.github.catvod.spider.merge.E.c.d(z, "Index must be numeric");
        return Integer.parseInt(strTrim);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void c(boolean z) {
        String str = z ? ":containsOwn" : ":contains";
        this.a.d(str);
        String strO = j.o(this.a.a('(', ')'));
        com.github.catvod.spider.merge.E.c.f(strO, str + "(text) query must not be empty");
        this.c.add(z ? new d.C0525m(strO) : new d.C0526n(strO));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void d(boolean z) {
        String str = z ? ":containsWholeOwnText" : ":containsWholeText";
        this.a.d(str);
        String strO = j.o(this.a.a('(', ')'));
        com.github.catvod.spider.merge.E.c.f(strO, str + "(text) query must not be empty");
        this.c.add(z ? new d.C0527o(strO) : new d.p(strO));
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
            com.github.catvod.spider.merge.H.j r0 = r8.a
            java.lang.String r0 = r0.b()
            java.lang.String r0 = com.github.catvod.spider.merge.F.a.f(r0)
            java.util.regex.Pattern r1 = com.github.catvod.spider.merge.I.f.f
            java.util.regex.Matcher r1 = r1.matcher(r0)
            java.util.regex.Pattern r2 = com.github.catvod.spider.merge.I.f.g
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
            java.util.List<com.github.catvod.spider.merge.I.d> r9 = r8.c
            com.github.catvod.spider.merge.I.d$D r10 = new com.github.catvod.spider.merge.I.d$D
            r10.<init>(r4, r0)
            goto L98
        L7f:
            java.util.List<com.github.catvod.spider.merge.I.d> r9 = r8.c
            com.github.catvod.spider.merge.I.d$E r10 = new com.github.catvod.spider.merge.I.d$E
            r10.<init>(r4, r0)
            goto L98
        L87:
            if (r9 == 0) goto L91
            java.util.List<com.github.catvod.spider.merge.I.d> r9 = r8.c
            com.github.catvod.spider.merge.I.d$C r10 = new com.github.catvod.spider.merge.I.d$C
            r10.<init>(r4, r0)
            goto L98
        L91:
            java.util.List<com.github.catvod.spider.merge.I.d> r9 = r8.c
            com.github.catvod.spider.merge.I.d$B r10 = new com.github.catvod.spider.merge.I.d$B
            r10.<init>(r4, r0)
        L98:
            r9.add(r10)
            return
        L9c:
            com.github.catvod.spider.merge.I.g r9 = new com.github.catvod.spider.merge.I.g
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
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.I.f.e(boolean, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v112, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v81, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void f() {
        List<d> list;
        Object i;
        List<d> list2;
        Object c0520h;
        List<d> list3;
        Object c0515b;
        if (this.a.j("#")) {
            String strE = this.a.e();
            com.github.catvod.spider.merge.E.c.e(strE);
            this.c.add(new d.r(strE));
            return;
        }
        if (this.a.j(".")) {
            String strE2 = this.a.e();
            com.github.catvod.spider.merge.E.c.e(strE2);
            this.c.add(new d.C0523k(strE2.trim()));
            return;
        }
        if (this.a.m() || this.a.k("*|")) {
            String strF = com.github.catvod.spider.merge.F.a.f(this.a.f());
            com.github.catvod.spider.merge.E.c.e(strF);
            if (strF.startsWith("*|")) {
                this.c.add(new b.C0013b(new d.N(strF.substring(2)), new d.O(strF.replace("*|", ":"))));
                return;
            } else {
                if (strF.contains("|")) {
                    strF = strF.replace("|", ":");
                }
                this.c.add(new d.N(strF));
                return;
            }
        }
        if (this.a.k("[")) {
            j jVar = new j(this.a.a('[', ']'));
            String strG = jVar.g(e);
            com.github.catvod.spider.merge.E.c.e(strG);
            jVar.h();
            if (jVar.i()) {
                if (strG.startsWith("^")) {
                    list3 = this.c;
                    c0515b = new d.C0014d(strG.substring(1));
                } else {
                    list3 = this.c;
                    c0515b = new d.C0515b(strG);
                }
                list3.add(c0515b);
                return;
            }
            if (jVar.j("=")) {
                list2 = this.c;
                c0520h = new d.C0517e(strG, jVar.n());
            } else if (jVar.j("!=")) {
                list2 = this.c;
                c0520h = new d.C0521i(strG, jVar.n());
            } else if (jVar.j("^=")) {
                list2 = this.c;
                c0520h = new d.C0522j(strG, jVar.n());
            } else if (jVar.j("$=")) {
                list2 = this.c;
                c0520h = new d.C0519g(strG, jVar.n());
            } else if (jVar.j("*=")) {
                list2 = this.c;
                c0520h = new d.C0518f(strG, jVar.n());
            } else {
                if (!jVar.j("~=")) {
                    throw new g("Could not parse attribute query '%s': unexpected token at '%s'", this.b, jVar.n());
                }
                list2 = this.c;
                c0520h = new d.C0520h(strG, Pattern.compile(jVar.n()));
            }
            list2.add(c0520h);
            return;
        }
        if (this.a.j(Marker.ANY_MARKER)) {
            this.c.add(new d.C0514a());
            return;
        }
        if (this.a.j(":lt(")) {
            this.c.add(new d.v(b()));
            return;
        }
        if (this.a.j(":gt(")) {
            this.c.add(new d.u(b()));
            return;
        }
        if (this.a.j(":eq(")) {
            this.c.add(new d.s(b()));
            return;
        }
        if (this.a.k(":has(")) {
            this.a.d(":has");
            String strA = this.a.a('(', ')');
            com.github.catvod.spider.merge.E.c.f(strA, ":has(selector) sub-select must not be empty");
            this.c.add(new h.a(j(strA)));
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
            String strO = j.o(this.a.a('(', ')'));
            com.github.catvod.spider.merge.E.c.f(strO, ":containsData(text) query must not be empty");
            this.c.add(new d.C0524l(strO));
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
            com.github.catvod.spider.merge.E.c.f(strA2, ":not(selector) subselect must not be empty");
            this.c.add(new h.d(j(strA2)));
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
            i = new d.x();
        } else if (this.a.j(":last-child")) {
            list = this.c;
            i = new d.z();
        } else if (this.a.j(":first-of-type")) {
            list = this.c;
            i = new d.y();
        } else if (this.a.j(":last-of-type")) {
            list = this.c;
            i = new d.A();
        } else if (this.a.j(":only-child")) {
            list = this.c;
            i = new d.F();
        } else if (this.a.j(":only-of-type")) {
            list = this.c;
            i = new d.G();
        } else if (this.a.j(":empty")) {
            list = this.c;
            i = new d.w();
        } else if (this.a.j(":root")) {
            list = this.c;
            i = new d.H();
        } else {
            if (!this.a.j(":matchText")) {
                throw new g("Could not parse query '%s': unexpected token at '%s'", this.b, this.a.n());
            }
            list = this.c;
            i = new d.I();
        }
        list.add(i);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void g(boolean z) {
        String str = z ? ":matchesOwn" : ":matches";
        this.a.d(str);
        String strA = this.a.a('(', ')');
        com.github.catvod.spider.merge.E.c.f(strA, str + "(regex) query must not be empty");
        this.c.add(z ? new d.K(Pattern.compile(strA)) : new d.J(Pattern.compile(strA)));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void h(boolean z) {
        String str = z ? ":matchesWholeOwnText" : ":matchesWholeText";
        this.a.d(str);
        String strA = this.a.a('(', ')');
        com.github.catvod.spider.merge.E.c.f(strA, str + "(regex) query must not be empty");
        this.c.add(z ? new d.L(Pattern.compile(strA)) : new d.M(Pattern.compile(strA)));
    }

    public static d j(String str) {
        try {
            return new f(str).i();
        } catch (IllegalArgumentException e2) {
            throw new g(e2.getMessage());
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
    final com.github.catvod.spider.merge.I.d i() {
        /*
            r4 = this;
            com.github.catvod.spider.merge.H.j r0 = r4.a
            r0.h()
            com.github.catvod.spider.merge.H.j r0 = r4.a
            java.lang.String[] r1 = com.github.catvod.spider.merge.I.f.d
            boolean r0 = r0.l(r1)
            if (r0 == 0) goto L1b
            java.util.List<com.github.catvod.spider.merge.I.d> r0 = r4.c
            com.github.catvod.spider.merge.I.h$g r1 = new com.github.catvod.spider.merge.I.h$g
            r1.<init>()
            r0.add(r1)
            r0 = r4
            goto L37
        L1b:
            r0 = r4
        L1c:
            r0.f()
        L1f:
            com.github.catvod.spider.merge.H.j r1 = r0.a
            boolean r1 = r1.i()
            if (r1 != 0) goto L46
            com.github.catvod.spider.merge.H.j r1 = r0.a
            boolean r1 = r1.h()
            com.github.catvod.spider.merge.H.j r2 = r0.a
            java.lang.String[] r3 = com.github.catvod.spider.merge.I.f.d
            boolean r2 = r2.l(r3)
            if (r2 == 0) goto L3e
        L37:
            com.github.catvod.spider.merge.H.j r1 = r0.a
            char r1 = r1.c()
            goto L42
        L3e:
            if (r1 == 0) goto L1c
            r1 = 32
        L42:
            r0.a(r1)
            goto L1f
        L46:
            java.util.List<com.github.catvod.spider.merge.I.d> r1 = r0.c
            int r1 = r1.size()
            r2 = 1
            if (r1 != r2) goto L59
            java.util.List<com.github.catvod.spider.merge.I.d> r0 = r0.c
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.github.catvod.spider.merge.I.d r0 = (com.github.catvod.spider.merge.I.d) r0
            return r0
        L59:
            com.github.catvod.spider.merge.I.b$a r1 = new com.github.catvod.spider.merge.I.b$a
            java.util.List<com.github.catvod.spider.merge.I.d> r0 = r0.c
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.I.f.i():com.github.catvod.spider.merge.I.d");
    }

    public final String toString() {
        return this.b;
    }
}
