package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.M.O;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class q {
    public static final String[] d = {",", ">", "+", "~", " "};
    public static final String[] e = {"=", "!=", "^=", "$=", "*=", "~="};
    public static final Pattern f = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);
    public static final Pattern g = Pattern.compile("([+-])?(\\d+)");
    public final O a;
    public final String b;
    public final ArrayList c = new ArrayList();

    public q(String str) {
        com.github.catvod.spider.merge.J.b.d(str);
        String strTrim = str.trim();
        this.b = strTrim;
        this.a = new O(strTrim);
    }

    public static o j(String str) {
        try {
            return new q(str).i();
        } catch (IllegalArgumentException e2) {
            throw new r(e2.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(char r12) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.N.q.a(char):void");
    }

    public final int b() {
        boolean z = true;
        String strTrim = this.a.b().trim();
        String[] strArr = com.github.catvod.bean.b.a;
        if (strTrim == null || strTrim.length() == 0) {
            z = false;
            break;
        }
        int length = strTrim.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(strTrim.codePointAt(i))) {
                z = false;
                break;
            }
        }
        if (z) {
            return Integer.parseInt(strTrim);
        }
        throw new com.github.catvod.spider.merge.J.c("Index must be numeric");
    }

    public final void c(boolean z) {
        String str = z ? ":containsOwn" : ":contains";
        O o = this.a;
        o.d(str);
        String strN = O.n(o.a('(', ')'));
        com.github.catvod.spider.merge.J.b.e(strN, str.concat("(text) query must not be empty"));
        this.c.add(z ? new g(strN, 4) : new g(strN, 5));
    }

    public final void d(boolean z) {
        String str = z ? ":containsWholeOwnText" : ":containsWholeText";
        O o = this.a;
        o.d(str);
        String strN = O.n(o.a('(', ')'));
        com.github.catvod.spider.merge.J.b.e(strN, str.concat("(text) query must not be empty"));
        this.c.add(z ? new g(strN, 6, false) : new g(strN, 7, false));
    }

    public final void e(boolean z, boolean z2) {
        int i;
        int i2;
        String strB = com.github.catvod.spider.merge.R.f.b(this.a.b());
        Matcher matcher = f.matcher(strB);
        Matcher matcher2 = g.matcher(strB);
        if ("odd".equals(strB)) {
            i2 = 2;
            i = 1;
        } else {
            if ("even".equals(strB)) {
                i2 = 2;
            } else if (matcher.matches()) {
                i2 = matcher.group(3) != null ? Integer.parseInt(matcher.group(1).replaceFirst("^\\+", "")) : 1;
                if (matcher.group(4) != null) {
                    i = Integer.parseInt(matcher.group(4).replaceFirst("^\\+", ""));
                }
            } else {
                if (!matcher2.matches()) {
                    throw new r("Could not parse nth-index '%s': unexpected format", strB);
                }
                i = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
                i2 = 0;
            }
            i = 0;
        }
        this.c.add(z2 ? z ? new m(i2, i, 2) : new m(i2, i, 3) : z ? new m(i2, i, 1) : new m(i2, i, 0));
    }

    public final void f() {
        Object fVar;
        Object iVar;
        int i = 9;
        int i2 = 4;
        int i3 = 3;
        int i4 = 1;
        int i5 = 2;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        O o = this.a;
        boolean zI = o.i("#");
        ArrayList arrayList = this.c;
        if (zI) {
            String strE = o.e();
            com.github.catvod.spider.merge.J.b.d(strE);
            arrayList.add(new g(strE, 8, z));
            return;
        }
        if (o.i(".")) {
            String strE2 = o.e();
            com.github.catvod.spider.merge.J.b.d(strE2);
            arrayList.add(new g(strE2.trim(), i5, z11 ? 1 : 0));
            return;
        }
        if (o.l() || o.j("*|")) {
            int i6 = o.b;
            while (!o.h() && (o.l() || o.k("*|", "|", "_", "-"))) {
                o.b++;
            }
            String strB = com.github.catvod.spider.merge.R.f.b(o.c.substring(i6, o.b));
            com.github.catvod.spider.merge.J.b.d(strB);
            if (strB.startsWith("*|")) {
                arrayList.add(new c(new g(strB.substring(2), i, z4 ? 1 : 0), new g(strB.replace("*|", ":"), 10, z3 ? 1 : 0)));
                return;
            }
            if (strB.contains("|")) {
                strB = strB.replace("|", ":");
            }
            arrayList.add(new g(strB, i, z2 ? 1 : 0));
            return;
        }
        boolean zJ = o.j("[");
        String str = this.b;
        if (zJ) {
            O o2 = new O(o.a('[', ']'));
            String[] strArr = e;
            int i7 = o2.b;
            while (!o2.h() && !o2.k(strArr)) {
                o2.b++;
            }
            String strSubstring = o2.c.substring(i7, o2.b);
            com.github.catvod.spider.merge.J.b.d(strSubstring);
            o2.f();
            if (o2.h()) {
                arrayList.add(strSubstring.startsWith("^") ? new g(strSubstring.substring(1), 1) : new g(strSubstring, z10 ? 1 : 0, z9 ? 1 : 0));
                return;
            }
            if (o2.i("=")) {
                iVar = new h(strSubstring, o2.m(), (int) (z8 ? 1 : 0));
            } else if (o2.i("!=")) {
                iVar = new h(strSubstring, o2.m(), i3);
            } else if (o2.i("^=")) {
                arrayList.add(new h(strSubstring, i2, o2.m(), z7 ? 1 : 0));
                return;
            } else if (o2.i("$=")) {
                iVar = new h(strSubstring, i5, o2.m(), z6 ? 1 : 0);
            } else if (o2.i("*=")) {
                iVar = new h(strSubstring, o2.m(), i4);
            } else {
                if (!o2.i("~=")) {
                    throw new r("Could not parse attribute query '%s': unexpected token at '%s'", str, o2.m());
                }
                iVar = new i(strSubstring, Pattern.compile(o2.m()));
            }
            arrayList.add(iVar);
            return;
        }
        if (o.i("*")) {
            arrayList.add(new f(z5 ? 1 : 0));
            return;
        }
        if (o.i(":lt(")) {
            arrayList.add(new j(b(), 2));
            return;
        }
        if (o.i(":gt(")) {
            arrayList.add(new j(b(), 1));
            return;
        }
        if (o.i(":eq(")) {
            arrayList.add(new j(b(), 0));
            return;
        }
        if (o.j(":has(")) {
            o.d(":has");
            String strA = o.a('(', ')');
            com.github.catvod.spider.merge.J.b.e(strA, ":has(selector) sub-select must not be empty");
            arrayList.add(new s(j(strA)));
            return;
        }
        if (o.j(":contains(")) {
            c(false);
            return;
        }
        if (o.j(":containsOwn(")) {
            c(true);
            return;
        }
        if (o.j(":containsWholeText(")) {
            d(false);
            return;
        }
        if (o.j(":containsWholeOwnText(")) {
            d(true);
            return;
        }
        if (o.j(":containsData(")) {
            o.d(":containsData");
            String strN = O.n(o.a('(', ')'));
            com.github.catvod.spider.merge.J.b.e(strN, ":containsData(text) query must not be empty");
            arrayList.add(new g(strN, 3));
            return;
        }
        if (o.j(":matches(")) {
            g(false);
            return;
        }
        if (o.j(":matchesOwn(")) {
            g(true);
            return;
        }
        if (o.j(":matchesWholeText(")) {
            h(false);
            return;
        }
        if (o.j(":matchesWholeOwnText(")) {
            h(true);
            return;
        }
        if (o.j(":not(")) {
            o.d(":not");
            String strA2 = o.a('(', ')');
            com.github.catvod.spider.merge.J.b.e(strA2, ":not(selector) subselect must not be empty");
            arrayList.add(new t(j(strA2), 2));
            return;
        }
        if (o.i(":nth-child(")) {
            e(false, false);
            return;
        }
        if (o.i(":nth-last-child(")) {
            e(true, false);
            return;
        }
        if (o.i(":nth-of-type(")) {
            e(false, true);
            return;
        }
        if (o.i(":nth-last-of-type(")) {
            e(true, true);
            return;
        }
        if (o.i(":first-child")) {
            fVar = new f(i5);
        } else if (o.i(":last-child")) {
            fVar = new f(i3);
        } else if (o.i(":first-of-type")) {
            fVar = new k();
        } else if (o.i(":last-of-type")) {
            fVar = new l();
        } else if (o.i(":only-child")) {
            fVar = new f(i2);
        } else if (o.i(":only-of-type")) {
            fVar = new f(5);
        } else if (o.i(":empty")) {
            fVar = new f(i4);
        } else if (o.i(":root")) {
            fVar = new f(6);
        } else {
            if (!o.i(":matchText")) {
                throw new r("Could not parse query '%s': unexpected token at '%s'", str, o.m());
            }
            fVar = new f(7);
        }
        arrayList.add(fVar);
    }

    public final void g(boolean z) {
        String str = z ? ":matchesOwn" : ":matches";
        O o = this.a;
        o.d(str);
        String strA = o.a('(', ')');
        com.github.catvod.spider.merge.J.b.e(strA, str.concat("(regex) query must not be empty"));
        this.c.add(z ? new n(Pattern.compile(strA), 1) : new n(Pattern.compile(strA), 0));
    }

    public final void h(boolean z) {
        String str = z ? ":matchesWholeOwnText" : ":matchesWholeText";
        O o = this.a;
        o.d(str);
        String strA = o.a('(', ')');
        com.github.catvod.spider.merge.J.b.e(strA, str.concat("(regex) query must not be empty"));
        this.c.add(z ? new n(Pattern.compile(strA), 2) : new n(Pattern.compile(strA), 3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0024, code lost:
    
        f();
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0032 -> B:5:0x0019). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0037 -> B:6:0x001d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.github.catvod.spider.merge.N.o i() {
        /*
            r5 = this;
            com.github.catvod.spider.merge.M.O r0 = r5.a
            r0.f()
            java.lang.String[] r1 = com.github.catvod.spider.merge.N.q.d
            boolean r2 = r0.k(r1)
            java.util.ArrayList r3 = r5.c
            if (r2 == 0) goto L21
            com.github.catvod.spider.merge.N.f r2 = new com.github.catvod.spider.merge.N.f
            r4 = 8
            r2.<init>(r4)
            r3.add(r2)
        L19:
            char r2 = r0.c()
        L1d:
            r5.a(r2)
            goto L24
        L21:
            r5.f()
        L24:
            boolean r2 = r0.h()
            if (r2 != 0) goto L3a
            boolean r2 = r0.f()
            boolean r4 = r0.k(r1)
            if (r4 == 0) goto L35
            goto L19
        L35:
            if (r2 == 0) goto L21
            r2 = 32
            goto L1d
        L3a:
            int r0 = r3.size()
            r1 = 1
            if (r0 != r1) goto L49
            r0 = 0
            java.lang.Object r0 = r3.get(r0)
            com.github.catvod.spider.merge.N.o r0 = (com.github.catvod.spider.merge.N.o) r0
            return r0
        L49:
            com.github.catvod.spider.merge.N.b r0 = new com.github.catvod.spider.merge.N.b
            r0.<init>(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.N.q.i():com.github.catvod.spider.merge.N.o");
    }

    public final String toString() {
        return this.b;
    }
}
