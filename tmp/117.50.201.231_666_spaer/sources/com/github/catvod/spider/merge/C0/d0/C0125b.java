package com.github.catvod.spider.merge.C0.d0;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.d0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0125b extends i1 {
    private A k;
    private A l;
    private boolean m;
    private com.github.catvod.spider.merge.C0.c0.l n;
    private com.github.catvod.spider.merge.C0.c0.o o;
    private ArrayList<com.github.catvod.spider.merge.C0.c0.l> p;
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
        int i;
        int i2;
        int size = this.e.size() - 1;
        if (size > 100) {
            i2 = size - 100;
            i = size;
        } else {
            i = size;
            i2 = 0;
        }
        while (i >= i2) {
            String strD0 = this.e.get(i).d0();
            if (com.github.catvod.spider.merge.C0.b0.b.b(strD0, strArr)) {
                return true;
            }
            if (com.github.catvod.spider.merge.C0.b0.b.b(strD0, strArr2)) {
                return false;
            }
            if (strArr3 != null && com.github.catvod.spider.merge.C0.b0.b.b(strD0, strArr3)) {
                return false;
            }
            i--;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void K(com.github.catvod.spider.merge.C0.c0.r r2) {
        /*
            r1 = this;
            java.util.ArrayList<com.github.catvod.spider.merge.C0.c0.l> r0 = r1.e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L25
            com.github.catvod.spider.merge.C0.c0.h r0 = r1.d
        La:
            r0.L(r2)
        Ld:
            boolean r0 = r2 instanceof com.github.catvod.spider.merge.C0.c0.l
            if (r0 == 0) goto L24
            com.github.catvod.spider.merge.C0.c0.l r2 = (com.github.catvod.spider.merge.C0.c0.l) r2
            com.github.catvod.spider.merge.C0.d0.F r0 = r2.m0()
            boolean r0 = r0.e()
            if (r0 == 0) goto L24
            com.github.catvod.spider.merge.C0.c0.o r0 = r1.o
            if (r0 == 0) goto L24
            r0.r0(r2)
        L24:
            return
        L25:
            boolean r0 = r1.t
            if (r0 == 0) goto L2d
            r1.I(r2)
            goto Ld
        L2d:
            com.github.catvod.spider.merge.C0.c0.l r0 = r1.a()
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0.d0.C0125b.K(com.github.catvod.spider.merge.C0.c0.r):void");
    }

    private boolean M(ArrayList<com.github.catvod.spider.merge.C0.c0.l> arrayList, com.github.catvod.spider.merge.C0.c0.l lVar) {
        int i;
        int i2;
        int size = arrayList.size() - 1;
        if (size >= 256) {
            i2 = size - 256;
            i = size;
        } else {
            i = size;
            i2 = 0;
        }
        while (i >= i2) {
            if (arrayList.get(i) == lVar) {
                return true;
            }
            i--;
        }
        return false;
    }

    private void j(String... strArr) {
        boolean z2;
        for (int size = this.e.size() - 1; size >= 0; size--) {
            com.github.catvod.spider.merge.C0.c0.l lVar = this.e.get(size);
            String strD0 = lVar.d0();
            int i = com.github.catvod.spider.merge.C0.b0.b.d;
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z2 = false;
                    break;
                } else {
                    if (strArr[i2].equals(strD0)) {
                        z2 = true;
                        break;
                    }
                    i2++;
                }
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
        com.github.catvod.spider.merge.C0.c0.h hVar = new com.github.catvod.spider.merge.C0.c0.h();
        this.d = hVar;
        hVar.t0(e);
        this.a = e;
        this.h = D.c;
        this.b = new C0123a(reader, 32768);
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

    final com.github.catvod.spider.merge.C0.c0.l D(M m) {
        if (m.r() && !m.j.isEmpty() && m.j.i(this.h) > 0) {
            C cA = this.a.a();
            if (cA.a()) {
                cA.add(new B(this.b.E(), "Duplicate attribute"));
            }
        }
        if (!m.i) {
            F fL = F.l(m.t(), this.h);
            D d = this.h;
            com.github.catvod.spider.merge.C0.c0.c cVar = m.j;
            d.b(cVar);
            com.github.catvod.spider.merge.C0.c0.l lVar = new com.github.catvod.spider.merge.C0.c0.l(fL, null, cVar);
            K(lVar);
            this.e.add(lVar);
            return lVar;
        }
        com.github.catvod.spider.merge.C0.c0.l lVarG = G(m);
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
        com.github.catvod.spider.merge.C0.c0.l lVarA = a();
        if (lVarA == null) {
            lVarA = this.d;
        }
        String strD0 = lVarA.d0();
        String strJ = h.j();
        lVarA.L(h instanceof G ? new com.github.catvod.spider.merge.C0.c0.d(strJ) : b(strD0) ? new com.github.catvod.spider.merge.C0.c0.f(strJ) : new com.github.catvod.spider.merge.C0.c0.u(strJ));
    }

    final void F(I i) {
        K(new com.github.catvod.spider.merge.C0.c0.e(i.k()));
    }

    final com.github.catvod.spider.merge.C0.c0.l G(M m) {
        F fL = F.l(m.t(), this.h);
        D d = this.h;
        com.github.catvod.spider.merge.C0.c0.c cVar = m.j;
        d.b(cVar);
        com.github.catvod.spider.merge.C0.c0.l lVar = new com.github.catvod.spider.merge.C0.c0.l(fL, null, cVar);
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

    final com.github.catvod.spider.merge.C0.c0.o H(M m, boolean z2) {
        F fL = F.l(m.t(), this.h);
        D d = this.h;
        com.github.catvod.spider.merge.C0.c0.c cVar = m.j;
        d.b(cVar);
        com.github.catvod.spider.merge.C0.c0.o oVar = new com.github.catvod.spider.merge.C0.c0.o(fL, cVar);
        this.o = oVar;
        K(oVar);
        if (z2) {
            this.e.add(oVar);
        }
        return oVar;
    }

    final void I(com.github.catvod.spider.merge.C0.c0.r rVar) {
        com.github.catvod.spider.merge.C0.c0.l lVarG;
        boolean z2 = false;
        com.github.catvod.spider.merge.C0.c0.l lVarT = t("table");
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
            com.github.catvod.spider.merge.C0.N.a.k(lVarT);
            lVarT.f(rVar);
        }
    }

    final void J() {
        this.p.add(null);
    }

    final com.github.catvod.spider.merge.C0.c0.l L(String str) {
        com.github.catvod.spider.merge.C0.c0.l lVar = new com.github.catvod.spider.merge.C0.c0.l(F.l(str, this.h), null, null);
        K(lVar);
        this.e.add(lVar);
        return lVar;
    }

    final boolean N(com.github.catvod.spider.merge.C0.c0.l lVar) {
        return M(this.p, lVar);
    }

    final boolean O(com.github.catvod.spider.merge.C0.c0.l lVar) {
        return com.github.catvod.spider.merge.C0.b0.b.b(lVar.d0(), B);
    }

    final void P() {
        this.l = this.k;
    }

    final void Q(com.github.catvod.spider.merge.C0.c0.l lVar) {
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

    final boolean S(com.github.catvod.spider.merge.C0.c0.l lVar) {
        return M(this.e, lVar);
    }

    final A T() {
        return this.l;
    }

    final com.github.catvod.spider.merge.C0.c0.l U() {
        return this.e.remove(this.e.size() - 1);
    }

    final com.github.catvod.spider.merge.C0.c0.l V(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            com.github.catvod.spider.merge.C0.c0.l lVar = this.e.get(size);
            this.e.remove(size);
            if (lVar.d0().equals(str)) {
                return lVar;
            }
        }
        return null;
    }

    final int W(com.github.catvod.spider.merge.C0.c0.l lVar) {
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

    final void Y(com.github.catvod.spider.merge.C0.c0.l lVar) {
        h(lVar);
        this.p.add(lVar);
    }

    final void Z(com.github.catvod.spider.merge.C0.c0.l lVar, int i) {
        h(lVar);
        this.p.add(i, lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0056 -> B:12:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void a0() {
        /*
            r6 = this;
            java.util.ArrayList<com.github.catvod.spider.merge.C0.c0.l> r0 = r6.p
            int r0 = r0.size()
            if (r0 <= 0) goto L1f
            java.util.ArrayList<com.github.catvod.spider.merge.C0.c0.l> r0 = r6.p
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            com.github.catvod.spider.merge.C0.c0.l r0 = (com.github.catvod.spider.merge.C0.c0.l) r0
        L16:
            if (r0 == 0) goto L1e
            boolean r1 = r6.S(r0)
            if (r1 == 0) goto L21
        L1e:
            return
        L1f:
            r0 = 0
            goto L16
        L21:
            java.util.ArrayList<com.github.catvod.spider.merge.C0.c0.l> r1 = r6.p
            int r1 = r1.size()
            r2 = 1
            int r3 = r1 + (-1)
            r1 = r3
        L2b:
            if (r1 != 0) goto L58
        L2d:
            if (r2 != 0) goto L39
            java.util.ArrayList<com.github.catvod.spider.merge.C0.c0.l> r0 = r6.p
            int r1 = r1 + 1
            java.lang.Object r0 = r0.get(r1)
            com.github.catvod.spider.merge.C0.c0.l r0 = (com.github.catvod.spider.merge.C0.c0.l) r0
        L39:
            com.github.catvod.spider.merge.C0.N.a.k(r0)
            java.lang.String r2 = r0.d0()
            com.github.catvod.spider.merge.C0.c0.l r2 = r6.L(r2)
            com.github.catvod.spider.merge.C0.c0.c r4 = r2.d()
            com.github.catvod.spider.merge.C0.c0.c r5 = r0.d()
            r4.e(r5)
            java.util.ArrayList<com.github.catvod.spider.merge.C0.c0.l> r4 = r6.p
            r4.set(r1, r2)
            if (r1 == r3) goto L1e
        L56:
            r2 = 0
            goto L2d
        L58:
            java.util.ArrayList<com.github.catvod.spider.merge.C0.c0.l> r0 = r6.p
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            com.github.catvod.spider.merge.C0.c0.l r0 = (com.github.catvod.spider.merge.C0.c0.l) r0
            if (r0 == 0) goto L56
            boolean r4 = r6.S(r0)
            if (r4 == 0) goto L2b
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0.d0.C0125b.a0():void");
    }

    @Override // com.github.catvod.spider.merge.C0.d0.i1
    protected final boolean b(String str) {
        return str.equals("script") || str.equals("style");
    }

    final void b0(com.github.catvod.spider.merge.C0.c0.l lVar) {
        int size = this.p.size();
        while (true) {
            int i = size - 1;
            if (i < 0) {
                return;
            }
            if (this.p.get(i) == lVar) {
                this.p.remove(i);
                return;
            }
            size = i;
        }
    }

    @Override // com.github.catvod.spider.merge.C0.d0.i1
    protected final boolean c(O o) {
        this.g = o;
        return this.k.d(o, this);
    }

    final boolean c0(com.github.catvod.spider.merge.C0.c0.l lVar) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (this.e.get(size) == lVar) {
                this.e.remove(size);
                return true;
            }
        }
        return false;
    }

    final void d0(com.github.catvod.spider.merge.C0.c0.l lVar, com.github.catvod.spider.merge.C0.c0.l lVar2) {
        ArrayList<com.github.catvod.spider.merge.C0.c0.l> arrayList = this.p;
        int iLastIndexOf = arrayList.lastIndexOf(lVar);
        com.github.catvod.spider.merge.C0.N.a.f(iLastIndexOf != -1);
        arrayList.set(iLastIndexOf, lVar2);
    }

    final void e0() {
        A a;
        boolean z2 = false;
        for (int size = this.e.size() - 1; size >= 0; size--) {
            com.github.catvod.spider.merge.C0.c0.l lVar = this.e.get(size);
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

    final com.github.catvod.spider.merge.C0.c0.l g(com.github.catvod.spider.merge.C0.c0.l lVar) {
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

    final void h(com.github.catvod.spider.merge.C0.c0.l lVar) {
        int i = 0;
        int size = this.p.size() - 1;
        while (size >= 0) {
            com.github.catvod.spider.merge.C0.c0.l lVar2 = this.p.get(size);
            if (lVar2 == null) {
                return;
            }
            int i2 = lVar.d0().equals(lVar2.d0()) && lVar.d().equals(lVar2.d()) ? i + 1 : i;
            if (i2 == 3) {
                this.p.remove(size);
                return;
            } else {
                size--;
                i = i2;
            }
        }
    }

    final void h0(com.github.catvod.spider.merge.C0.c0.l lVar) {
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
        while (str != null && !a().d0().equals(str) && com.github.catvod.spider.merge.C0.b0.b.b(a().d0(), A)) {
            U();
        }
    }

    final com.github.catvod.spider.merge.C0.c0.l r(String str) {
        for (int size = this.p.size() - 1; size >= 0; size--) {
            com.github.catvod.spider.merge.C0.c0.l lVar = this.p.get(size);
            if (lVar == null) {
                break;
            }
            if (lVar.d0().equals(str)) {
                return lVar;
            }
        }
        return null;
    }

    final com.github.catvod.spider.merge.C0.c0.o s() {
        return this.o;
    }

    final com.github.catvod.spider.merge.C0.c0.l t(String str) {
        int size = this.e.size();
        while (true) {
            int i = size - 1;
            if (i < 0) {
                return null;
            }
            com.github.catvod.spider.merge.C0.c0.l lVar = this.e.get(i);
            if (lVar.d0().equals(str)) {
                return lVar;
            }
            size = i;
        }
    }

    public final String toString() {
        StringBuilder sbB = com.github.catvod.spider.merge.C0.d.d.b("TreeBuilder{currentToken=");
        sbB.append(this.g);
        sbB.append(", state=");
        sbB.append(this.k);
        sbB.append(", currentElement=");
        sbB.append(a());
        sbB.append('}');
        return sbB.toString();
    }

    final com.github.catvod.spider.merge.C0.c0.l u() {
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
            if (!com.github.catvod.spider.merge.C0.b0.b.b(strD0, z)) {
                return false;
            }
        }
        com.github.catvod.spider.merge.C0.N.a.a("Should not be reachable");
        throw null;
    }
}
