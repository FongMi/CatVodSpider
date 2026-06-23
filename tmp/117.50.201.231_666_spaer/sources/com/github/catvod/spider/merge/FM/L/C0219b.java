package com.github.catvod.spider.merge.FM.L;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.L.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0219b extends k1 {
    private B l;
    private B m;
    private boolean n;

    @Nullable
    private com.github.catvod.spider.merge.FM.K.m o;

    @Nullable
    private com.github.catvod.spider.merge.FM.K.p p;
    private ArrayList<com.github.catvod.spider.merge.FM.K.m> q;
    private ArrayList<B> r;
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

    private boolean H(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.e.size() - 1;
        int i = size > 100 ? size - 100 : 0;
        while (size >= i) {
            String strI0 = this.e.get(size).i0();
            if (com.github.catvod.spider.merge.FM.J.b.c(strI0, strArr)) {
                return true;
            }
            if (com.github.catvod.spider.merge.FM.J.b.c(strI0, strArr2)) {
                return false;
            }
            if (strArr3 != null && com.github.catvod.spider.merge.FM.J.b.c(strI0, strArr3)) {
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
    private void Q(com.github.catvod.spider.merge.FM.K.s r3) {
        /*
            r2 = this;
            java.util.ArrayList<com.github.catvod.spider.merge.FM.K.m> r0 = r2.e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            com.github.catvod.spider.merge.FM.K.h r0 = r2.d
            goto L27
        Lb:
            boolean r0 = r2.v
            if (r0 == 0) goto L23
            com.github.catvod.spider.merge.FM.K.m r0 = r2.a()
            java.lang.String r0 = r0.i0()
            java.lang.String[] r1 = com.github.catvod.spider.merge.FM.L.A.A
            boolean r0 = com.github.catvod.spider.merge.FM.J.b.c(r0, r1)
            if (r0 == 0) goto L23
            r2.O(r3)
            goto L2a
        L23:
            com.github.catvod.spider.merge.FM.K.m r0 = r2.a()
        L27:
            r0.L(r3)
        L2a:
            boolean r0 = r3 instanceof com.github.catvod.spider.merge.FM.K.m
            if (r0 == 0) goto L41
            com.github.catvod.spider.merge.FM.K.m r3 = (com.github.catvod.spider.merge.FM.K.m) r3
            com.github.catvod.spider.merge.FM.L.G r0 = r3.s0()
            boolean r0 = r0.e()
            if (r0 == 0) goto L41
            com.github.catvod.spider.merge.FM.K.p r0 = r2.p
            if (r0 == 0) goto L41
            r0.y0(r3)
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.FM.L.C0219b.Q(com.github.catvod.spider.merge.FM.K.s):void");
    }

    private static boolean Z(ArrayList<com.github.catvod.spider.merge.FM.K.m> arrayList, com.github.catvod.spider.merge.FM.K.m mVar) {
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

    private void o(String... strArr) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            com.github.catvod.spider.merge.FM.K.m mVar = this.e.get(size);
            String strI0 = mVar.i0();
            int i = com.github.catvod.spider.merge.FM.J.b.f;
            int length = strArr.length;
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (strArr[i2].equals(strI0)) {
                    z2 = true;
                    break;
                }
                i2++;
            }
            if (z2 || mVar.i0().equals("html")) {
                return;
            }
            this.e.remove(size);
        }
    }

    @Nullable
    final com.github.catvod.spider.merge.FM.K.m A(String str) {
        int size = this.e.size() - 1;
        int i = size >= 256 ? size - 256 : 0;
        while (size >= i) {
            com.github.catvod.spider.merge.FM.K.m mVar = this.e.get(size);
            if (mVar.i0().equals(str)) {
                return mVar;
            }
            size--;
        }
        return null;
    }

    final com.github.catvod.spider.merge.FM.K.m B() {
        return this.o;
    }

    final List<String> C() {
        return this.s;
    }

    final boolean D(String str) {
        return E(str, z);
    }

    final boolean E(String str, String[] strArr) {
        String[] strArr2 = x;
        String[] strArr3 = this.w;
        strArr3[0] = str;
        return H(strArr3, strArr2, strArr);
    }

    final boolean F(String[] strArr) {
        return H(strArr, x, null);
    }

    final boolean G(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            String strI0 = this.e.get(size).i0();
            if (strI0.equals(str)) {
                return true;
            }
            if (!com.github.catvod.spider.merge.FM.J.b.c(strI0, B)) {
                return false;
            }
        }
        com.github.catvod.spider.merge.FM.I.c.a("Should not be reachable");
        throw null;
    }

    final boolean I(String str) {
        String[] strArr = A;
        String[] strArr2 = this.w;
        strArr2[0] = str;
        return H(strArr2, strArr, null);
    }

    final com.github.catvod.spider.merge.FM.K.m J(N n) {
        if (n.u() && !n.n.isEmpty() && n.n.k(this.h) > 0) {
            Object[] objArr = {n.e};
            D dA = this.a.a();
            if (dA.a()) {
                dA.add(new C(this.b, "Dropped duplicate attribute(s) in tag [%s]", objArr));
            }
        }
        if (!n.m) {
            G gK = k(n.w(), this.h);
            E e = this.h;
            com.github.catvod.spider.merge.FM.K.c cVar = n.n;
            e.c(cVar);
            com.github.catvod.spider.merge.FM.K.m mVar = new com.github.catvod.spider.merge.FM.K.m(gK, null, cVar);
            Q(mVar);
            this.e.add(mVar);
            return mVar;
        }
        com.github.catvod.spider.merge.FM.K.m mVarM = M(n);
        this.e.add(mVarM);
        this.c.v(j1.a);
        T t = this.c;
        M m = this.t;
        m.h();
        m.v(mVarM.t0());
        t.k(m);
        return mVarM;
    }

    final void K(I i) {
        com.github.catvod.spider.merge.FM.K.m mVarA = a();
        String strI0 = mVarA.i0();
        String strL = i.l();
        mVarA.L(i instanceof H ? new com.github.catvod.spider.merge.FM.K.d(strL) : e(strI0) ? new com.github.catvod.spider.merge.FM.K.f(strL) : new com.github.catvod.spider.merge.FM.K.v(strL));
    }

    final void L(J j) {
        Q(new com.github.catvod.spider.merge.FM.K.e(j.m()));
    }

    final com.github.catvod.spider.merge.FM.K.m M(N n) {
        G gK = k(n.w(), this.h);
        E e = this.h;
        com.github.catvod.spider.merge.FM.K.c cVar = n.n;
        e.c(cVar);
        com.github.catvod.spider.merge.FM.K.m mVar = new com.github.catvod.spider.merge.FM.K.m(gK, null, cVar);
        Q(mVar);
        if (n.m) {
            if (!gK.g()) {
                gK.l();
            } else if (!gK.d()) {
                this.c.s("Tag [%s] cannot be self closing; not a void tag", gK.j());
            }
        }
        return mVar;
    }

    final com.github.catvod.spider.merge.FM.K.p N(N n, boolean z2, boolean z3) {
        G gK = k(n.w(), this.h);
        E e = this.h;
        com.github.catvod.spider.merge.FM.K.c cVar = n.n;
        e.c(cVar);
        com.github.catvod.spider.merge.FM.K.p pVar = new com.github.catvod.spider.merge.FM.K.p(gK, cVar);
        if (!z3 || !Y("template")) {
            this.p = pVar;
        }
        Q(pVar);
        if (z2) {
            this.e.add(pVar);
        }
        return pVar;
    }

    final void O(com.github.catvod.spider.merge.FM.K.s sVar) {
        com.github.catvod.spider.merge.FM.K.m mVarL;
        com.github.catvod.spider.merge.FM.K.m mVarA = A("table");
        boolean z2 = false;
        if (mVarA == null) {
            mVarL = this.e.get(0);
        } else if (mVarA.k0() != null) {
            mVarL = mVarA.k0();
            z2 = true;
        } else {
            mVarL = l(mVarA);
        }
        if (!z2) {
            mVarL.L(sVar);
        } else {
            com.github.catvod.spider.merge.FM.I.c.g(mVarA);
            mVarA.S(sVar);
        }
    }

    final void P() {
        this.q.add(null);
    }

    final com.github.catvod.spider.merge.FM.K.m R() {
        com.github.catvod.spider.merge.FM.K.m mVar = new com.github.catvod.spider.merge.FM.K.m(k("html", this.h), null, null);
        Q(mVar);
        this.e.add(mVar);
        return mVar;
    }

    final boolean S(com.github.catvod.spider.merge.FM.K.m mVar) {
        return Z(this.q, mVar);
    }

    final boolean T(com.github.catvod.spider.merge.FM.K.m mVar) {
        return com.github.catvod.spider.merge.FM.J.b.c(mVar.i0(), E);
    }

    final void U() {
        this.m = this.l;
    }

    final void V(com.github.catvod.spider.merge.FM.K.m mVar) {
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

    final void W() {
        this.s = new ArrayList();
    }

    final boolean X(com.github.catvod.spider.merge.FM.K.m mVar) {
        return Z(this.e, mVar);
    }

    final boolean Y(String str) {
        return A(str) != null;
    }

    final B a0() {
        return this.m;
    }

    final com.github.catvod.spider.merge.FM.K.m b0() {
        return this.e.remove(this.e.size() - 1);
    }

    @Override // com.github.catvod.spider.merge.FM.L.k1
    final E c() {
        return E.c;
    }

    @Nullable
    final com.github.catvod.spider.merge.FM.K.m c0(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            com.github.catvod.spider.merge.FM.K.m mVar = this.e.get(size);
            this.e.remove(size);
            if (mVar.i0().equals(str)) {
                boolean z2 = this.g instanceof M;
                return mVar;
            }
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.FM.L.k1
    @ParametersAreNonnullByDefault
    protected final void d(Reader reader, String str, F f) {
        super.d(reader, str, f);
        this.l = B.a;
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

    @Nullable
    final B d0() {
        if (this.r.size() <= 0) {
            return null;
        }
        return this.r.remove(r0.size() - 1);
    }

    @Override // com.github.catvod.spider.merge.FM.L.k1
    protected final boolean e(String str) {
        return str.equals("script") || str.equals("style");
    }

    final int e0(com.github.catvod.spider.merge.FM.K.m mVar) {
        for (int i = 0; i < this.q.size(); i++) {
            if (mVar == this.q.get(i)) {
                return i;
            }
        }
        return -1;
    }

    final boolean f0(Q q, B b) {
        this.g = q;
        return b.d(q, this);
    }

    @Override // com.github.catvod.spider.merge.FM.L.k1
    protected final boolean g(Q q) {
        this.g = q;
        return this.l.d(q, this);
    }

    final void g0(com.github.catvod.spider.merge.FM.K.m mVar) {
        m(mVar);
        this.q.add(mVar);
    }

    final void h0(B b) {
        this.r.add(b);
    }

    final void i0(com.github.catvod.spider.merge.FM.K.m mVar, int i) {
        m(mVar);
        try {
            this.q.add(i, mVar);
        } catch (IndexOutOfBoundsException unused) {
            this.q.add(mVar);
        }
    }

    final void j0() {
        com.github.catvod.spider.merge.FM.K.m mVar;
        C0219b c0219b;
        if (this.e.size() > 256) {
            return;
        }
        if (this.q.size() > 0) {
            mVar = this.q.get(r0.size() - 1);
        } else {
            mVar = null;
        }
        if (mVar == null || X(mVar)) {
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
            if (mVar == null || X(mVar)) {
                c0219b = this;
                z2 = false;
                break;
            }
        }
        c0219b = this;
        while (true) {
            if (!z2) {
                i3++;
                mVar = c0219b.q.get(i3);
            }
            com.github.catvod.spider.merge.FM.I.c.g(mVar);
            com.github.catvod.spider.merge.FM.K.m mVar2 = new com.github.catvod.spider.merge.FM.K.m(c0219b.k(mVar.i0(), c0219b.h), null, mVar.d().clone());
            c0219b.Q(mVar2);
            c0219b.e.add(mVar2);
            c0219b.q.set(i3, mVar2);
            if (i3 == i2) {
                return;
            } else {
                z2 = false;
            }
        }
    }

    final void k0(com.github.catvod.spider.merge.FM.K.m mVar) {
        int size = this.q.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
        } while (this.q.get(size) != mVar);
        this.q.remove(size);
    }

    @Nullable
    final com.github.catvod.spider.merge.FM.K.m l(com.github.catvod.spider.merge.FM.K.m mVar) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (this.e.get(size) == mVar) {
                return this.e.get(size - 1);
            }
        }
        return null;
    }

    final boolean l0(com.github.catvod.spider.merge.FM.K.m mVar) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (this.e.get(size) == mVar) {
                this.e.remove(size);
                return true;
            }
        }
        return false;
    }

    final void m(com.github.catvod.spider.merge.FM.K.m mVar) {
        int size = this.q.size() - 1;
        int i = size - 12;
        if (i < 0) {
            i = 0;
        }
        int i2 = 0;
        while (size >= i) {
            com.github.catvod.spider.merge.FM.K.m mVar2 = this.q.get(size);
            if (mVar2 == null) {
                return;
            }
            if (mVar.i0().equals(mVar2.i0()) && mVar.d().equals(mVar2.d())) {
                i2++;
            }
            if (i2 == 3) {
                this.q.remove(size);
                return;
            }
            size--;
        }
    }

    final void m0(com.github.catvod.spider.merge.FM.K.m mVar, com.github.catvod.spider.merge.FM.K.m mVar2) {
        ArrayList<com.github.catvod.spider.merge.FM.K.m> arrayList = this.q;
        int iLastIndexOf = arrayList.lastIndexOf(mVar);
        com.github.catvod.spider.merge.FM.I.c.c(iLastIndexOf != -1);
        arrayList.set(iLastIndexOf, mVar2);
    }

    final void n() {
        while (!this.q.isEmpty()) {
            int size = this.q.size();
            if ((size > 0 ? this.q.remove(size - 1) : null) == null) {
                return;
            }
        }
    }

    final void n0() {
        if (!Y("body")) {
            this.e.add(this.d.y0());
        }
        this.l = B.g;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x003d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0153 A[LOOP:0: B:10:0x001f->B:109:0x0153, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x014e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean o0() {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.FM.L.C0219b.o0():boolean");
    }

    final void p() {
        o("tbody", "tfoot", "thead", "template");
    }

    final void p0() {
        this.p = null;
    }

    final void q() {
        o("table", "template");
    }

    final void q0(boolean z2) {
        this.v = z2;
    }

    final void r() {
        o("tr", "template");
    }

    final void r0(com.github.catvod.spider.merge.FM.K.m mVar) {
        this.o = mVar;
    }

    final void s() {
        w("p");
        if (!"p".equals(a().i0())) {
            t(this.l);
        }
        c0("p");
    }

    final B s0() {
        return this.l;
    }

    final void t(B b) {
        if (this.a.a().a()) {
            this.a.a().add(new C(this.b, "Unexpected %s token [%s] when in state [%s]", this.g.getClass().getSimpleName(), this.g, b));
        }
    }

    final int t0() {
        return this.r.size();
    }

    public final String toString() {
        StringBuilder sbB = P.b("TreeBuilder{currentToken=");
        sbB.append(this.g);
        sbB.append(", state=");
        sbB.append(this.l);
        sbB.append(", currentElement=");
        sbB.append(a());
        sbB.append('}');
        return sbB.toString();
    }

    final void u(boolean z2) {
        this.u = z2;
    }

    final void u0(B b) {
        this.l = b;
    }

    final boolean v() {
        return this.u;
    }

    final void w(String str) {
        while (com.github.catvod.spider.merge.FM.J.b.c(a().i0(), C)) {
            if (str != null && b(str)) {
                return;
            } else {
                b0();
            }
        }
    }

    final void x(boolean z2) {
        String[] strArr = z2 ? D : C;
        while (com.github.catvod.spider.merge.FM.J.b.c(a().i0(), strArr)) {
            b0();
        }
    }

    final com.github.catvod.spider.merge.FM.K.m y(String str) {
        for (int size = this.q.size() - 1; size >= 0; size--) {
            com.github.catvod.spider.merge.FM.K.m mVar = this.q.get(size);
            if (mVar == null) {
                return null;
            }
            if (mVar.i0().equals(str)) {
                return mVar;
            }
        }
        return null;
    }

    @Nullable
    final com.github.catvod.spider.merge.FM.K.p z() {
        return this.p;
    }
}
