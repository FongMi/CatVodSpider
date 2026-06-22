package com.github.catvod.spider.merge.Fs;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Fs.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0633b extends i1 {
    private A k;
    private A l;
    private boolean m;
    private com.github.catvod.spider.merge.Em.l n;
    private com.github.catvod.spider.merge.Em.o o;
    private ArrayList<com.github.catvod.spider.merge.Em.l> p;
    private List<String> q;
    private L r;
    private boolean s;
    private boolean t;
    private String[] u = {null};
    static final String[] v = {"applet", "caption", "html", "marquee", "object", "table", "td", "th"};
    static final String[] w = {"ol", "ul"};
    static final String[] x = {"button"};
    static final String[] y = {"html", "table"};
    static final String[] z = {"optgroup", "option"};
    static final String[] A = {"dd", "dt", "li", "optgroup", "option", "p", "rp", "rt"};
    static final String[] B = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};

    private boolean A(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.e.size() - 1;
        int i = size > 100 ? size - 100 : 0;
        while (size >= i) {
            String strD0 = this.e.get(size).d0();
            if (com.github.catvod.spider.merge.Dw.e.b(strD0, strArr)) {
                return true;
            }
            if (com.github.catvod.spider.merge.Dw.e.b(strD0, strArr2)) {
                return false;
            }
            if (strArr3 != null && com.github.catvod.spider.merge.Dw.e.b(strD0, strArr3)) {
                return false;
            }
            size--;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void K(com.github.catvod.spider.merge.Em.r r2) {
        /*
            r1 = this;
            java.util.ArrayList<com.github.catvod.spider.merge.Em.l> r0 = r1.e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            com.github.catvod.spider.merge.Em.h r0 = r1.d
            goto L17
        Lb:
            boolean r0 = r1.t
            if (r0 == 0) goto L13
            r1.I(r2)
            goto L1a
        L13:
            com.github.catvod.spider.merge.Em.l r0 = r1.a()
        L17:
            r0.L(r2)
        L1a:
            boolean r0 = r2 instanceof com.github.catvod.spider.merge.Em.l
            if (r0 == 0) goto L31
            com.github.catvod.spider.merge.Em.l r2 = (com.github.catvod.spider.merge.Em.l) r2
            com.github.catvod.spider.merge.Fs.F r0 = r2.m0()
            boolean r0 = r0.e()
            if (r0 == 0) goto L31
            com.github.catvod.spider.merge.Em.o r0 = r1.o
            if (r0 == 0) goto L31
            r0.r0(r2)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Fs.C0633b.K(com.github.catvod.spider.merge.Em.r):void");
    }

    private boolean M(ArrayList<com.github.catvod.spider.merge.Em.l> arrayList, com.github.catvod.spider.merge.Em.l lVar) {
        int size = arrayList.size() - 1;
        int i = size >= 256 ? size - 256 : 0;
        while (size >= i) {
            if (arrayList.get(size) == lVar) {
                return true;
            }
            size--;
        }
        return false;
    }

    private void j(String... strArr) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            com.github.catvod.spider.merge.Em.l lVar = this.e.get(size);
            String strD0 = lVar.d0();
            int i = com.github.catvod.spider.merge.Dw.e.d;
            int length = strArr.length;
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (strArr[i2].equals(strD0)) {
                    z2 = true;
                    break;
                }
                i2++;
            }
            if (z2 || lVar.d0().equals("html")) {
                return;
            }
            this.e.remove(size);
        }
    }

    final boolean B(String str) {
        String[] strArr = y;
        String[] strArr2 = this.u;
        strArr2[0] = str;
        return A(strArr2, strArr, null);
    }

    protected final void C(Reader reader, E e) {
        com.github.catvod.spider.merge.Em.h hVar = new com.github.catvod.spider.merge.Em.h();
        this.d = hVar;
        hVar.t0(e);
        this.a = e;
        this.h = D.c;
        this.b = new C0631a(reader, 32768);
        this.g = null;
        this.c = new Q(this.b, e.a());
        this.e = new ArrayList<>(32);
        this.f = "";
        this.k = A.c;
        this.l = null;
        this.m = false;
        this.n = null;
        this.o = null;
        this.p = new ArrayList<>();
        this.q = new ArrayList();
        this.r = new L();
        this.s = true;
        this.t = false;
    }

    final com.github.catvod.spider.merge.Em.l D(M m) {
        if (m.r() && !m.j.isEmpty() && m.j.i(this.h) > 0) {
            C cA = this.a.a();
            if (cA.a()) {
                cA.add(new B(this.b.E(), "Duplicate attribute"));
            }
        }
        if (!m.i) {
            F fL = F.l(m.t(), this.h);
            D d = this.h;
            com.github.catvod.spider.merge.Em.c cVar = m.j;
            d.b(cVar);
            com.github.catvod.spider.merge.Em.l lVar = new com.github.catvod.spider.merge.Em.l(fL, null, cVar);
            K(lVar);
            this.e.add(lVar);
            return lVar;
        }
        com.github.catvod.spider.merge.Em.l lVarG = G(m);
        this.e.add(lVarG);
        this.c.u(h1.c);
        Q q = this.c;
        L l = this.r;
        l.g();
        l.s(lVarG.n0());
        q.j(l);
        return lVarG;
    }

    final void E(H h) {
        com.github.catvod.spider.merge.Em.l lVarA = a();
        if (lVarA == null) {
            lVarA = this.d;
        }
        String strD0 = lVarA.d0();
        String strJ = h.j();
        lVarA.L(h instanceof G ? new com.github.catvod.spider.merge.Em.d(strJ) : b(strD0) ? new com.github.catvod.spider.merge.Em.f(strJ) : new com.github.catvod.spider.merge.Em.u(strJ));
    }

    final void F(I i) {
        K(new com.github.catvod.spider.merge.Em.e(i.k()));
    }

    final com.github.catvod.spider.merge.Em.l G(M m) {
        F fL = F.l(m.t(), this.h);
        D d = this.h;
        com.github.catvod.spider.merge.Em.c cVar = m.j;
        d.b(cVar);
        com.github.catvod.spider.merge.Em.l lVar = new com.github.catvod.spider.merge.Em.l(fL, null, cVar);
        K(lVar);
        if (m.i) {
            if (!fL.g()) {
                fL.k();
            } else if (!fL.d()) {
                this.c.r("Tag cannot be self closing; not a void tag");
            }
        }
        return lVar;
    }

    final com.github.catvod.spider.merge.Em.o H(M m, boolean z2) {
        F fL = F.l(m.t(), this.h);
        D d = this.h;
        com.github.catvod.spider.merge.Em.c cVar = m.j;
        d.b(cVar);
        com.github.catvod.spider.merge.Em.o oVar = new com.github.catvod.spider.merge.Em.o(fL, cVar);
        this.o = oVar;
        K(oVar);
        if (z2) {
            this.e.add(oVar);
        }
        return oVar;
    }

    final void I(com.github.catvod.spider.merge.Em.r rVar) {
        com.github.catvod.spider.merge.Em.l lVarG;
        com.github.catvod.spider.merge.Em.l lVarT = t("table");
        boolean z2 = false;
        if (lVarT == null) {
            lVarG = this.e.get(0);
        } else if (lVarT.f0() != null) {
            lVarG = lVarT.f0();
            z2 = true;
        } else {
            lVarG = g(lVarT);
        }
        if (!z2) {
            lVarG.L(rVar);
        } else {
            com.github.catvod.spider.merge.Dw.i.k(lVarT);
            lVarT.f(rVar);
        }
    }

    final void J() {
        this.p.add(null);
    }

    final com.github.catvod.spider.merge.Em.l L(String str) {
        com.github.catvod.spider.merge.Em.l lVar = new com.github.catvod.spider.merge.Em.l(F.l(str, this.h), null, null);
        K(lVar);
        this.e.add(lVar);
        return lVar;
    }

    final boolean N(com.github.catvod.spider.merge.Em.l lVar) {
        return M(this.p, lVar);
    }

    final boolean O(com.github.catvod.spider.merge.Em.l lVar) {
        return com.github.catvod.spider.merge.Dw.e.b(lVar.d0(), B);
    }

    final void P() {
        this.l = this.k;
    }

    final void Q(com.github.catvod.spider.merge.Em.l lVar) {
        if (this.m) {
            return;
        }
        String strA = lVar.a("href");
        if (strA.length() != 0) {
            this.f = strA;
            this.m = true;
            this.d.G(strA);
        }
    }

    final void R() {
        this.q = new ArrayList();
    }

    final boolean S(com.github.catvod.spider.merge.Em.l lVar) {
        return M(this.e, lVar);
    }

    final A T() {
        return this.l;
    }

    final com.github.catvod.spider.merge.Em.l U() {
        return this.e.remove(this.e.size() - 1);
    }

    final com.github.catvod.spider.merge.Em.l V(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            com.github.catvod.spider.merge.Em.l lVar = this.e.get(size);
            this.e.remove(size);
            if (lVar.d0().equals(str)) {
                return lVar;
            }
        }
        return null;
    }

    final int W(com.github.catvod.spider.merge.Em.l lVar) {
        for (int i = 0; i < this.p.size(); i++) {
            if (lVar == this.p.get(i)) {
                return i;
            }
        }
        return -1;
    }

    final boolean X(O o, A a) {
        this.g = o;
        return a.d(o, this);
    }

    final void Y(com.github.catvod.spider.merge.Em.l lVar) {
        h(lVar);
        this.p.add(lVar);
    }

    final void Z(com.github.catvod.spider.merge.Em.l lVar, int i) {
        h(lVar);
        this.p.add(i, lVar);
    }

    final void a0() {
        com.github.catvod.spider.merge.Em.l lVar;
        if (this.p.size() > 0) {
            lVar = this.p.get(r0.size() - 1);
        } else {
            lVar = null;
        }
        if (lVar == null || S(lVar)) {
            return;
        }
        boolean z2 = true;
        int size = this.p.size() - 1;
        int i = size;
        while (i != 0) {
            i--;
            lVar = this.p.get(i);
            if (lVar == null || S(lVar)) {
                z2 = false;
                break;
            }
        }
        while (true) {
            if (!z2) {
                i++;
                lVar = this.p.get(i);
            }
            com.github.catvod.spider.merge.Dw.i.k(lVar);
            com.github.catvod.spider.merge.Em.l lVarL = L(lVar.d0());
            lVarL.d().e(lVar.d());
            this.p.set(i, lVarL);
            if (i == size) {
                return;
            } else {
                z2 = false;
            }
        }
    }

    @Override // com.github.catvod.spider.merge.Fs.i1
    protected final boolean b(String str) {
        return str.equals("script") || str.equals("style");
    }

    final void b0(com.github.catvod.spider.merge.Em.l lVar) {
        int size = this.p.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
        } while (this.p.get(size) != lVar);
        this.p.remove(size);
    }

    @Override // com.github.catvod.spider.merge.Fs.i1
    protected final boolean c(O o) {
        this.g = o;
        return this.k.d(o, this);
    }

    final boolean c0(com.github.catvod.spider.merge.Em.l lVar) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (this.e.get(size) == lVar) {
                this.e.remove(size);
                return true;
            }
        }
        return false;
    }

    final void d0(com.github.catvod.spider.merge.Em.l lVar, com.github.catvod.spider.merge.Em.l lVar2) {
        ArrayList<com.github.catvod.spider.merge.Em.l> arrayList = this.p;
        int iLastIndexOf = arrayList.lastIndexOf(lVar);
        com.github.catvod.spider.merge.Dw.i.f(iLastIndexOf != -1);
        arrayList.set(iLastIndexOf, lVar2);
    }

    final void e0() {
        A a;
        boolean z2 = false;
        for (int size = this.e.size() - 1; size >= 0; size--) {
            com.github.catvod.spider.merge.Em.l lVar = this.e.get(size);
            if (size == 0) {
                lVar = null;
                z2 = true;
            }
            String strD0 = lVar != null ? lVar.d0() : "";
            if ("select".equals(strD0)) {
                a = A.r;
            } else if ("td".equals(strD0) || ("th".equals(strD0) && !z2)) {
                a = A.q;
            } else if ("tr".equals(strD0)) {
                a = A.p;
            } else if ("tbody".equals(strD0) || "thead".equals(strD0) || "tfoot".equals(strD0)) {
                a = A.o;
            } else if ("caption".equals(strD0)) {
                a = A.m;
            } else if ("colgroup".equals(strD0)) {
                a = A.n;
            } else if ("table".equals(strD0)) {
                a = A.k;
            } else {
                if (!"head".equals(strD0) && !"body".equals(strD0)) {
                    if ("frameset".equals(strD0)) {
                        a = A.u;
                    } else if ("html".equals(strD0)) {
                        a = A.e;
                    } else if (!z2) {
                    }
                }
                a = A.i;
            }
            this.k = a;
            return;
        }
    }

    final void f0() {
        this.o = null;
    }

    final com.github.catvod.spider.merge.Em.l g(com.github.catvod.spider.merge.Em.l lVar) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (this.e.get(size) == lVar) {
                return this.e.get(size - 1);
            }
        }
        return null;
    }

    final void g0(boolean z2) {
        this.t = z2;
    }

    final void h(com.github.catvod.spider.merge.Em.l lVar) {
        int i = 0;
        for (int size = this.p.size() - 1; size >= 0; size--) {
            com.github.catvod.spider.merge.Em.l lVar2 = this.p.get(size);
            if (lVar2 == null) {
                return;
            }
            if (lVar.d0().equals(lVar2.d0()) && lVar.d().equals(lVar2.d())) {
                i++;
            }
            if (i == 3) {
                this.p.remove(size);
                return;
            }
        }
    }

    final void h0(com.github.catvod.spider.merge.Em.l lVar) {
        this.n = lVar;
    }

    final void i() {
        while (!this.p.isEmpty()) {
            int size = this.p.size();
            if ((size > 0 ? this.p.remove(size - 1) : null) == null) {
                return;
            }
        }
    }

    final A i0() {
        return this.k;
    }

    final void j0(A a) {
        this.k = a;
    }

    final void k() {
        j("tbody", "tfoot", "thead", "template");
    }

    final void l() {
        j("table");
    }

    final void m() {
        j("tr", "template");
    }

    final void n(A a) {
        if (this.a.a().a()) {
            this.a.a().add(new B(this.b.E(), "Unexpected token [%s] when in state [%s]", this.g.getClass().getSimpleName(), a));
        }
    }

    final void o(boolean z2) {
        this.s = z2;
    }

    final boolean p() {
        return this.s;
    }

    final void q(String str) {
        while (str != null && !a().d0().equals(str) && com.github.catvod.spider.merge.Dw.e.b(a().d0(), A)) {
            U();
        }
    }

    final com.github.catvod.spider.merge.Em.l r(String str) {
        for (int size = this.p.size() - 1; size >= 0; size--) {
            com.github.catvod.spider.merge.Em.l lVar = this.p.get(size);
            if (lVar == null) {
                return null;
            }
            if (lVar.d0().equals(str)) {
                return lVar;
            }
        }
        return null;
    }

    final com.github.catvod.spider.merge.Em.o s() {
        return this.o;
    }

    final com.github.catvod.spider.merge.Em.l t(String str) {
        com.github.catvod.spider.merge.Em.l lVar;
        int size = this.e.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            lVar = this.e.get(size);
        } while (!lVar.d0().equals(str));
        return lVar;
    }

    public final String toString() {
        StringBuilder sbB = com.github.catvod.spider.merge.ka.d.b("TreeBuilder{currentToken=");
        sbB.append(this.g);
        sbB.append(", state=");
        sbB.append(this.k);
        sbB.append(", currentElement=");
        sbB.append(a());
        sbB.append('}');
        return sbB.toString();
    }

    final com.github.catvod.spider.merge.Em.l u() {
        return this.n;
    }

    final List<String> v() {
        return this.q;
    }

    final boolean w(String str) {
        return x(str, x);
    }

    final boolean x(String str, String[] strArr) {
        String[] strArr2 = v;
        String[] strArr3 = this.u;
        strArr3[0] = str;
        return A(strArr3, strArr2, strArr);
    }

    final boolean y(String[] strArr) {
        return A(strArr, v, null);
    }

    final boolean z(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            String strD0 = this.e.get(size).d0();
            if (strD0.equals(str)) {
                return true;
            }
            if (!com.github.catvod.spider.merge.Dw.e.b(strD0, z)) {
                return false;
            }
        }
        com.github.catvod.spider.merge.Dw.i.a("Should not be reachable");
        throw null;
    }
}
