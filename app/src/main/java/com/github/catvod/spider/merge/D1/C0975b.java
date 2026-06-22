package com.github.catvod.spider.merge.d1;

import com.github.catvod.spider.merge.a1.C0899d;
import com.github.catvod.spider.merge.b1.C0906c;
import com.github.catvod.spider.merge.c1.C0947c;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0975b extends j1 {
    private com.github.catvod.spider.merge.d1.EnumC0969B l;
    private com.github.catvod.spider.merge.d1.EnumC0969B m;
    private boolean n;
    private com.github.catvod.spider.merge.c1.m o;
    private com.github.catvod.spider.merge.c1.p p;
    private ArrayList<com.github.catvod.spider.merge.c1.m> q;
    private ArrayList<com.github.catvod.spider.merge.d1.EnumC0969B> r;
    private List<String> s;
    private M t;
    private boolean u;
    private boolean v;
    private String[] w = {null};
    static final String[] x = {"applet", "caption", "html", "marquee", "object", "table", "td", "th"};
    static final String[] y = {"ol", "ul"};
    static final String[] z = {"button"};
    static final String[] A = {"html", "table"};
    static final String[] B = {"optgroup", "option"};
    static final String[] C = {"dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc"};
    static final String[] D = {"caption", "colgroup", "dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};
    static final String[] E = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};

    private boolean F(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.e.size() - 1;
        int i = size > 100 ? size - 100 : 0;
        while (size >= i) {
            String strF0 = this.e.get(size).f0();
            if (C0906c.c(strF0, strArr)) {
                return true;
            }
            if (C0906c.c(strF0, strArr2)) {
                return false;
            }
            if (strArr3 != null && C0906c.c(strF0, strArr3)) {
                return false;
            }
            size--;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void O(com.github.catvod.spider.merge.c1.s r3) {
        /*
            r2 = this;
            java.util.ArrayList<com.github.catvod.spider.merge.c1.m> r0 = r2.e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            com.github.catvod.spider.merge.c1.h r0 = r2.d
            goto L27
        Lb:
            boolean r0 = r2.v
            if (r0 == 0) goto L23
            com.github.catvod.spider.merge.c1.m r0 = r2.a()
            java.lang.String r0 = r0.f0()
            java.lang.String[] r1 = com.github.catvod.spider.merge.d1.C0968A.A
            boolean r0 = com.github.catvod.spider.merge.b1.C0906c.c(r0, r1)
            if (r0 == 0) goto L23
            r2.M(r3)
            goto L2a
        L23:
            com.github.catvod.spider.merge.c1.m r0 = r2.a()
        L27:
            r0.K(r3)
        L2a:
            boolean r0 = r3 instanceof com.github.catvod.spider.merge.c1.m
            if (r0 == 0) goto L41
            com.github.catvod.spider.merge.c1.m r3 = (com.github.catvod.spider.merge.c1.m) r3
            com.github.catvod.spider.merge.d1.G r0 = r3.q0()
            boolean r0 = r0.e()
            if (r0 == 0) goto L41
            com.github.catvod.spider.merge.c1.p r0 = r2.p
            if (r0 == 0) goto L41
            r0.v0(r3)
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.d1.C0975b.O(com.github.catvod.spider.merge.c1.s):void");
    }

    private static boolean X(ArrayList<com.github.catvod.spider.merge.c1.m> arrayList, com.github.catvod.spider.merge.c1.m mVar) {
        int size = arrayList.size() - 1;
        int i = size >= 256 ? size - 256 : 0;
        while (size >= i) {
            if (arrayList.get(size) == mVar) {
                return true;
            }
            size--;
        }
        return false;
    }

    private void m(String... strArr) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            com.github.catvod.spider.merge.c1.m mVar = this.e.get(size);
            String strF0 = mVar.f0();
            int i = C0906c.f;
            int length = strArr.length;
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (strArr[i2].equals(strF0)) {
                    z2 = true;
                    break;
                }
                i2++;
            }
            if (z2 || mVar.f0().equals("html")) {
                return;
            }
            this.e.remove(size);
        }
    }

    final List<String> A() {
        return this.s;
    }

    final boolean B(String str) {
        return C(str, z);
    }

    final boolean C(String str, String[] strArr) {
        String[] strArr2 = x;
        String[] strArr3 = this.w;
        strArr3[0] = str;
        return F(strArr3, strArr2, strArr);
    }

    final boolean D(String[] strArr) {
        return F(strArr, x, null);
    }

    final boolean E(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            String strF0 = this.e.get(size).f0();
            if (strF0.equals(str)) {
                return true;
            }
            if (!C0906c.c(strF0, B)) {
                return false;
            }
        }
        C0899d.a("Should not be reachable");
        throw null;
    }

    final boolean G(String str) {
        String[] strArr = A;
        String[] strArr2 = this.w;
        strArr2[0] = str;
        return F(strArr2, strArr, null);
    }

    final com.github.catvod.spider.merge.c1.m H(N n) {
        if (n.u() && !n.n.isEmpty() && n.n.m(this.h) > 0) {
            Object[] objArr = {n.e};
            C0971D c0971dA = this.a.a();
            if (c0971dA.a()) {
                c0971dA.add(new C0970C(this.b, "Dropped duplicate attribute(s) in tag [%s]", objArr));
            }
        }
        if (!n.m) {
            G gI = i(n.w(), this.h);
            C0972E c0972e = this.h;
            C0947c c0947c = n.n;
            c0972e.c(c0947c);
            com.github.catvod.spider.merge.c1.m mVar = new com.github.catvod.spider.merge.c1.m(gI, null, c0947c);
            O(mVar);
            this.e.add(mVar);
            return mVar;
        }
        com.github.catvod.spider.merge.c1.m mVarK = K(n);
        this.e.add(mVarK);
        this.c.v(i1.b);
        S s = this.c;
        M m = this.t;
        m.h();
        m.v(mVarK.r0());
        s.k(m);
        return mVarK;
    }

    final void I(I i) {
        com.github.catvod.spider.merge.c1.s fVar;
        com.github.catvod.spider.merge.c1.m mVarA = a();
        String strF0 = mVarA.f0();
        String strL = i.l();
        if (i instanceof H) {
            fVar = new com.github.catvod.spider.merge.c1.d(strL);
        } else {
            fVar = strF0.equals("script") || strF0.equals("style") ? new com.github.catvod.spider.merge.c1.f(strL) : new com.github.catvod.spider.merge.c1.v(strL);
        }
        mVarA.K(fVar);
    }

    final void J(J j) {
        O(new com.github.catvod.spider.merge.c1.e(j.m()));
    }

    final com.github.catvod.spider.merge.c1.m K(N n) {
        G gI = i(n.w(), this.h);
        C0972E c0972e = this.h;
        C0947c c0947c = n.n;
        c0972e.c(c0947c);
        com.github.catvod.spider.merge.c1.m mVar = new com.github.catvod.spider.merge.c1.m(gI, null, c0947c);
        O(mVar);
        if (n.m) {
            if (!gI.g()) {
                gI.l();
            } else if (!gI.d()) {
                this.c.s("Tag [%s] cannot be self closing; not a void tag", gI.j());
            }
        }
        return mVar;
    }

    final com.github.catvod.spider.merge.c1.p L(N n, boolean z2, boolean z3) {
        G gI = i(n.w(), this.h);
        C0972E c0972e = this.h;
        C0947c c0947c = n.n;
        c0972e.c(c0947c);
        com.github.catvod.spider.merge.c1.p pVar = new com.github.catvod.spider.merge.c1.p(gI, c0947c);
        if (!z3 || !W("template")) {
            this.p = pVar;
        }
        O(pVar);
        if (z2) {
            this.e.add(pVar);
        }
        return pVar;
    }

    final void M(com.github.catvod.spider.merge.c1.s sVar) {
        com.github.catvod.spider.merge.c1.m mVarJ;
        com.github.catvod.spider.merge.c1.m mVarY = y("table");
        boolean z2 = false;
        if (mVarY == null) {
            mVarJ = this.e.get(0);
        } else if (mVarY.h0() != null) {
            mVarJ = mVarY.h0();
            z2 = true;
        } else {
            mVarJ = j(mVarY);
        }
        if (!z2) {
            mVarJ.K(sVar);
        } else {
            C0899d.h(mVarY);
            mVarY.Q(sVar);
        }
    }

    final void N() {
        this.q.add(null);
    }

    final com.github.catvod.spider.merge.c1.m P() {
        com.github.catvod.spider.merge.c1.m mVar = new com.github.catvod.spider.merge.c1.m(i("html", this.h), null, null);
        O(mVar);
        this.e.add(mVar);
        return mVar;
    }

    final boolean Q(com.github.catvod.spider.merge.c1.m mVar) {
        return X(this.q, mVar);
    }

    final boolean R(com.github.catvod.spider.merge.c1.m mVar) {
        return C0906c.c(mVar.f0(), E);
    }

    final void S() {
        this.m = this.l;
    }

    final void T(com.github.catvod.spider.merge.c1.m mVar) {
        if (this.n) {
            return;
        }
        String strA = mVar.a("href");
        if (strA.length() != 0) {
            this.f = strA;
            this.n = true;
            this.d.F(strA);
        }
    }

    final void U() {
        this.s = new ArrayList();
    }

    final boolean V(com.github.catvod.spider.merge.c1.m mVar) {
        return X(this.e, mVar);
    }

    final boolean W(String str) {
        return y(str) != null;
    }

    final EnumC0969B Y() {
        return this.m;
    }

    final com.github.catvod.spider.merge.c1.m Z() {
        return this.e.remove(this.e.size() - 1);
    }

    final com.github.catvod.spider.merge.c1.m a0(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            com.github.catvod.spider.merge.c1.m mVar = this.e.get(size);
            this.e.remove(size);
            if (mVar.f0().equals(str)) {
                boolean z2 = this.g instanceof M;
                return mVar;
            }
        }
        return null;
    }

    final EnumC0969B b0() {
        if (this.r.size() <= 0) {
            return null;
        }
        return this.r.remove(r0.size() - 1);
    }

    @Override // com.github.catvod.spider.merge.d1.j1
    protected final void c(Reader reader, String str, F f) {
        super.c(reader, str, f);
        this.l = EnumC0969B.b;
        this.m = null;
        this.n = false;
        this.o = null;
        this.p = null;
        this.q = new ArrayList<>();
        this.r = new ArrayList<>();
        this.s = new ArrayList();
        this.t = new M();
        this.u = true;
        this.v = false;
    }

    final int c0(com.github.catvod.spider.merge.c1.m mVar) {
        for (int i = 0; i < this.q.size(); i++) {
            if (mVar == this.q.get(i)) {
                return i;
            }
        }
        return -1;
    }

    final boolean d0(P p, EnumC0969B enumC0969B) {
        this.g = p;
        return enumC0969B.d(p, this);
    }

    @Override // com.github.catvod.spider.merge.d1.j1
    protected final boolean e(P p) {
        this.g = p;
        return this.l.d(p, this);
    }

    final void e0(com.github.catvod.spider.merge.c1.m mVar) {
        k(mVar);
        this.q.add(mVar);
    }

    final void f0(EnumC0969B enumC0969B) {
        this.r.add(enumC0969B);
    }

    final void g0(com.github.catvod.spider.merge.c1.m mVar, int i) {
        k(mVar);
        try {
            this.q.add(i, mVar);
        } catch (IndexOutOfBoundsException unused) {
            this.q.add(mVar);
        }
    }

    final void h0() {
        com.github.catvod.spider.merge.c1.m mVar;
        C0975b c0975b;
        if (this.e.size() > 256) {
            return;
        }
        if (this.q.size() > 0) {
            mVar = this.q.get(r0.size() - 1);
        } else {
            mVar = null;
        }
        if (mVar == null || V(mVar)) {
            return;
        }
        int size = this.q.size();
        int i = size - 12;
        if (i < 0) {
            i = 0;
        }
        boolean z2 = true;
        int i2 = size - 1;
        int i3 = i2;
        while (i3 != i) {
            i3--;
            mVar = this.q.get(i3);
            if (mVar == null || V(mVar)) {
                c0975b = this;
                z2 = false;
                break;
            }
        }
        c0975b = this;
        while (true) {
            if (!z2) {
                i3++;
                mVar = c0975b.q.get(i3);
            }
            C0899d.h(mVar);
            com.github.catvod.spider.merge.c1.m mVar2 = new com.github.catvod.spider.merge.c1.m(c0975b.i(mVar.f0(), c0975b.h), null, mVar.d().clone());
            c0975b.O(mVar2);
            c0975b.e.add(mVar2);
            c0975b.q.set(i3, mVar2);
            if (i3 == i2) {
                return;
            } else {
                z2 = false;
            }
        }
    }

    final void i0(com.github.catvod.spider.merge.c1.m mVar) {
        int size = this.q.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
        } while (this.q.get(size) != mVar);
        this.q.remove(size);
    }

    final com.github.catvod.spider.merge.c1.m j(com.github.catvod.spider.merge.c1.m mVar) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (this.e.get(size) == mVar) {
                return this.e.get(size - 1);
            }
        }
        return null;
    }

    final boolean j0(com.github.catvod.spider.merge.c1.m mVar) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (this.e.get(size) == mVar) {
                this.e.remove(size);
                return true;
            }
        }
        return false;
    }

    final void k(com.github.catvod.spider.merge.c1.m mVar) {
        int size = this.q.size() - 1;
        int i = size - 12;
        if (i < 0) {
            i = 0;
        }
        int i2 = 0;
        while (size >= i) {
            com.github.catvod.spider.merge.c1.m mVar2 = this.q.get(size);
            if (mVar2 == null) {
                return;
            }
            if (mVar.f0().equals(mVar2.f0()) && mVar.d().equals(mVar2.d())) {
                i2++;
            }
            if (i2 == 3) {
                this.q.remove(size);
                return;
            }
            size--;
        }
    }

    final void k0(com.github.catvod.spider.merge.c1.m mVar, com.github.catvod.spider.merge.c1.m mVar2) {
        ArrayList<com.github.catvod.spider.merge.c1.m> arrayList = this.q;
        int iLastIndexOf = arrayList.lastIndexOf(mVar);
        C0899d.d(iLastIndexOf != -1);
        arrayList.set(iLastIndexOf, mVar2);
    }

    final void l() {
        while (!this.q.isEmpty()) {
            int size = this.q.size();
            if ((size > 0 ? this.q.remove(size - 1) : null) == null) {
                return;
            }
        }
    }

    final void l0() {
        if (!W("body")) {
            this.e.add(this.d.v0());
        }
        this.l = EnumC0969B.h;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x003e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0154 A[LOOP:0: B:10:0x0020->B:109:0x0154, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x014f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean m0() {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.d1.C0975b.m0():boolean");
    }

    final void n() {
        m("tbody", "tfoot", "thead", "template");
    }

    final void n0() {
        this.p = null;
    }

    final void o() {
        m("table", "template");
    }

    final void o0(boolean z2) {
        this.v = z2;
    }

    final void p() {
        m("tr", "template");
    }

    final void p0(com.github.catvod.spider.merge.c1.m mVar) {
        this.o = mVar;
    }

    final void q() {
        u("p");
        if (!"p".equals(a().f0())) {
            r(this.l);
        }
        a0("p");
    }

    final EnumC0969B q0() {
        return this.l;
    }

    final void r(EnumC0969B enumC0969B) {
        if (this.a.a().a()) {
            this.a.a().add(new C0970C(this.b, "Unexpected %s token [%s] when in state [%s]", this.g.getClass().getSimpleName(), this.g, enumC0969B));
        }
    }

    final int r0() {
        return this.r.size();
    }

    final void s(boolean z2) {
        this.u = z2;
    }

    final void s0(EnumC0969B enumC0969B) {
        this.l = enumC0969B;
    }

    final boolean t() {
        return this.u;
    }

    public final String toString() {
        StringBuilder sbB = com.github.catvod.spider.merge.I.t0.b("TreeBuilder{currentToken=");
        sbB.append(this.g);
        sbB.append(", state=");
        sbB.append(this.l);
        sbB.append(", currentElement=");
        sbB.append(a());
        sbB.append('}');
        return sbB.toString();
    }

    final void u(String str) {
        while (C0906c.c(a().f0(), C)) {
            if (str != null && b(str)) {
                return;
            } else {
                Z();
            }
        }
    }

    final void v(boolean z2) {
        String[] strArr = z2 ? D : C;
        while (C0906c.c(a().f0(), strArr)) {
            Z();
        }
    }

    final com.github.catvod.spider.merge.c1.m w(String str) {
        for (int size = this.q.size() - 1; size >= 0; size--) {
            com.github.catvod.spider.merge.c1.m mVar = this.q.get(size);
            if (mVar == null) {
                return null;
            }
            if (mVar.f0().equals(str)) {
                return mVar;
            }
        }
        return null;
    }

    final com.github.catvod.spider.merge.c1.p x() {
        return this.p;
    }

    final com.github.catvod.spider.merge.c1.m y(String str) {
        int size = this.e.size() - 1;
        int i = size >= 256 ? size - 256 : 0;
        while (size >= i) {
            com.github.catvod.spider.merge.c1.m mVar = this.e.get(size);
            if (mVar.f0().equals(str)) {
                return mVar;
            }
            size--;
        }
        return null;
    }

    final com.github.catvod.spider.merge.c1.m z() {
        return this.o;
    }
}
