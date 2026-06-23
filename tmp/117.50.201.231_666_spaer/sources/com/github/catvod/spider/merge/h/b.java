package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.G.p;
import com.github.catvod.spider.merge.H.i;
import com.github.catvod.spider.merge.a.C0529a;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class b extends m {
    private c l;
    private c m;
    private boolean n;

    @Nullable
    private com.github.catvod.spider.merge.G.i o;

    @Nullable
    private com.github.catvod.spider.merge.G.k p;
    private ArrayList<com.github.catvod.spider.merge.G.i> q;
    private ArrayList<c> r;
    private List<String> s;
    private i.f t;
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
            String strH0 = this.e.get(size).h0();
            if (com.github.catvod.spider.merge.F.b.c(strH0, strArr)) {
                return true;
            }
            if (com.github.catvod.spider.merge.F.b.c(strH0, strArr2)) {
                return false;
            }
            if (strArr3 != null && com.github.catvod.spider.merge.F.b.c(strH0, strArr3)) {
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
    private void O(com.github.catvod.spider.merge.G.m r3) {
        /*
            r2 = this;
            java.util.ArrayList<com.github.catvod.spider.merge.G.i> r0 = r2.e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            com.github.catvod.spider.merge.G.f r0 = r2.d
            goto L27
        Lb:
            boolean r0 = r2.v
            if (r0 == 0) goto L23
            com.github.catvod.spider.merge.G.i r0 = r2.a()
            java.lang.String r0 = r0.h0()
            java.lang.String[] r1 = com.github.catvod.spider.merge.H.c.y.A
            boolean r0 = com.github.catvod.spider.merge.F.b.c(r0, r1)
            if (r0 == 0) goto L23
            r2.M(r3)
            goto L2a
        L23:
            com.github.catvod.spider.merge.G.i r0 = r2.a()
        L27:
            r0.M(r3)
        L2a:
            boolean r0 = r3 instanceof com.github.catvod.spider.merge.G.i
            if (r0 == 0) goto L41
            com.github.catvod.spider.merge.G.i r3 = (com.github.catvod.spider.merge.G.i) r3
            com.github.catvod.spider.merge.H.h r0 = r3.q0()
            boolean r0 = r0.e()
            if (r0 == 0) goto L41
            com.github.catvod.spider.merge.G.k r0 = r2.p
            if (r0 == 0) goto L41
            r0.w0(r3)
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.H.b.O(com.github.catvod.spider.merge.G.m):void");
    }

    private static boolean X(ArrayList<com.github.catvod.spider.merge.G.i> arrayList, com.github.catvod.spider.merge.G.i iVar) {
        int size = arrayList.size() - 1;
        int i = size >= 256 ? size - 256 : 0;
        while (size >= i) {
            if (arrayList.get(size) == iVar) {
                return true;
            }
            size--;
        }
        return false;
    }

    private void m(String... strArr) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            com.github.catvod.spider.merge.G.i iVar = this.e.get(size);
            String strH0 = iVar.h0();
            int i = com.github.catvod.spider.merge.F.b.f;
            int length = strArr.length;
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (strArr[i2].equals(strH0)) {
                    z2 = true;
                    break;
                }
                i2++;
            }
            if (z2 || iVar.h0().equals("html")) {
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
            String strH0 = this.e.get(size).h0();
            if (strH0.equals(str)) {
                return true;
            }
            if (!com.github.catvod.spider.merge.F.b.c(strH0, B)) {
                return false;
            }
        }
        com.github.catvod.spider.merge.E.c.a("Should not be reachable");
        throw null;
    }

    final boolean G(String str) {
        String[] strArr = A;
        String[] strArr2 = this.w;
        strArr2[0] = str;
        return F(strArr2, strArr, null);
    }

    final com.github.catvod.spider.merge.G.i H(i.g gVar) {
        if (gVar.u() && !gVar.n.isEmpty() && gVar.n.k(this.h) > 0) {
            Object[] objArr = {gVar.e};
            e eVarA = this.a.a();
            if (eVarA.a()) {
                eVarA.add(new d(this.b, "Dropped duplicate attribute(s) in tag [%s]", objArr));
            }
        }
        if (!gVar.m) {
            h hVarI = i(gVar.w(), this.h);
            f fVar = this.h;
            com.github.catvod.spider.merge.G.b bVar = gVar.n;
            fVar.c(bVar);
            com.github.catvod.spider.merge.G.i iVar = new com.github.catvod.spider.merge.G.i(hVarI, null, bVar);
            O(iVar);
            this.e.add(iVar);
            return iVar;
        }
        com.github.catvod.spider.merge.G.i iVarK = K(gVar);
        this.e.add(iVarK);
        this.c.v(l.a);
        k kVar = this.c;
        i.f fVar2 = this.t;
        fVar2.h();
        fVar2.v(iVarK.r0());
        kVar.k(fVar2);
        return iVarK;
    }

    final void I(i.b bVar) {
        com.github.catvod.spider.merge.G.i iVarA = a();
        String strH0 = iVarA.h0();
        String strL = bVar.l();
        iVarA.M(bVar instanceof i.a ? new com.github.catvod.spider.merge.G.c(strL) : d(strH0) ? new com.github.catvod.spider.merge.G.e(strL) : new p(strL));
    }

    final void J(i.c cVar) {
        O(new com.github.catvod.spider.merge.G.d(cVar.m()));
    }

    final com.github.catvod.spider.merge.G.i K(i.g gVar) {
        h hVarI = i(gVar.w(), this.h);
        f fVar = this.h;
        com.github.catvod.spider.merge.G.b bVar = gVar.n;
        fVar.c(bVar);
        com.github.catvod.spider.merge.G.i iVar = new com.github.catvod.spider.merge.G.i(hVarI, null, bVar);
        O(iVar);
        if (gVar.m) {
            if (!hVarI.g()) {
                hVarI.l();
            } else if (!hVarI.d()) {
                this.c.s("Tag [%s] cannot be self closing; not a void tag", hVarI.j());
            }
        }
        return iVar;
    }

    final com.github.catvod.spider.merge.G.k L(i.g gVar, boolean z2, boolean z3) {
        h hVarI = i(gVar.w(), this.h);
        f fVar = this.h;
        com.github.catvod.spider.merge.G.b bVar = gVar.n;
        fVar.c(bVar);
        com.github.catvod.spider.merge.G.k kVar = new com.github.catvod.spider.merge.G.k(hVarI, bVar);
        if (!z3 || !W("template")) {
            this.p = kVar;
        }
        O(kVar);
        if (z2) {
            this.e.add(kVar);
        }
        return kVar;
    }

    final void M(com.github.catvod.spider.merge.G.m mVar) {
        com.github.catvod.spider.merge.G.i iVarJ;
        com.github.catvod.spider.merge.G.i iVarY = y("table");
        boolean z2 = false;
        if (iVarY == null) {
            iVarJ = this.e.get(0);
        } else if (iVarY.j0() != null) {
            iVarJ = iVarY.j0();
            z2 = true;
        } else {
            iVarJ = j(iVarY);
        }
        if (!z2) {
            iVarJ.M(mVar);
        } else {
            com.github.catvod.spider.merge.E.c.g(iVarY);
            iVarY.S(mVar);
        }
    }

    final void N() {
        this.q.add(null);
    }

    final com.github.catvod.spider.merge.G.i P() {
        com.github.catvod.spider.merge.G.i iVar = new com.github.catvod.spider.merge.G.i(i("html", this.h), null, null);
        O(iVar);
        this.e.add(iVar);
        return iVar;
    }

    final boolean Q(com.github.catvod.spider.merge.G.i iVar) {
        return X(this.q, iVar);
    }

    final boolean R(com.github.catvod.spider.merge.G.i iVar) {
        return com.github.catvod.spider.merge.F.b.c(iVar.h0(), E);
    }

    final void S() {
        this.m = this.l;
    }

    final void T(com.github.catvod.spider.merge.G.i iVar) {
        if (this.n) {
            return;
        }
        String strA = iVar.a("href");
        if (strA.length() != 0) {
            this.f = strA;
            this.n = true;
            this.d.G(strA);
        }
    }

    final void U() {
        this.s = new ArrayList();
    }

    final boolean V(com.github.catvod.spider.merge.G.i iVar) {
        return X(this.e, iVar);
    }

    final boolean W(String str) {
        return y(str) != null;
    }

    final c Y() {
        return this.m;
    }

    final com.github.catvod.spider.merge.G.i Z() {
        return this.e.remove(this.e.size() - 1);
    }

    @Nullable
    final com.github.catvod.spider.merge.G.i a0(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            com.github.catvod.spider.merge.G.i iVar = this.e.get(size);
            this.e.remove(size);
            if (iVar.h0().equals(str)) {
                boolean z2 = this.g instanceof i.f;
                return iVar;
            }
        }
        return null;
    }

    @Nullable
    final c b0() {
        if (this.r.size() <= 0) {
            return null;
        }
        return this.r.remove(r0.size() - 1);
    }

    @Override // com.github.catvod.spider.merge.H.m
    @ParametersAreNonnullByDefault
    protected final void c(Reader reader, g gVar) {
        super.c(reader, gVar);
        this.l = c.a;
        this.m = null;
        this.n = false;
        this.o = null;
        this.p = null;
        this.q = new ArrayList<>();
        this.r = new ArrayList<>();
        this.s = new ArrayList();
        this.t = new i.f();
        this.u = true;
        this.v = false;
    }

    final int c0(com.github.catvod.spider.merge.G.i iVar) {
        for (int i = 0; i < this.q.size(); i++) {
            if (iVar == this.q.get(i)) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.github.catvod.spider.merge.H.m
    protected final boolean d(String str) {
        return str.equals("script") || str.equals("style");
    }

    final boolean d0(i iVar, c cVar) {
        this.g = iVar;
        return cVar.d(iVar, this);
    }

    @Override // com.github.catvod.spider.merge.H.m
    protected final boolean e(i iVar) {
        this.g = iVar;
        return this.l.d(iVar, this);
    }

    final void e0(com.github.catvod.spider.merge.G.i iVar) {
        k(iVar);
        this.q.add(iVar);
    }

    final void f0(c cVar) {
        this.r.add(cVar);
    }

    final void g0(com.github.catvod.spider.merge.G.i iVar, int i) {
        k(iVar);
        try {
            this.q.add(i, iVar);
        } catch (IndexOutOfBoundsException unused) {
            this.q.add(iVar);
        }
    }

    final void h0() {
        com.github.catvod.spider.merge.G.i iVar;
        b bVar;
        if (this.e.size() > 256) {
            return;
        }
        if (this.q.size() > 0) {
            iVar = this.q.get(r0.size() - 1);
        } else {
            iVar = null;
        }
        if (iVar == null || V(iVar)) {
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
            iVar = this.q.get(i3);
            if (iVar == null || V(iVar)) {
                bVar = this;
                z2 = false;
                break;
            }
        }
        bVar = this;
        while (true) {
            if (!z2) {
                i3++;
                iVar = bVar.q.get(i3);
            }
            com.github.catvod.spider.merge.E.c.g(iVar);
            com.github.catvod.spider.merge.G.i iVar2 = new com.github.catvod.spider.merge.G.i(bVar.i(iVar.h0(), bVar.h), null, iVar.e().clone());
            bVar.O(iVar2);
            bVar.e.add(iVar2);
            bVar.q.set(i3, iVar2);
            if (i3 == i2) {
                return;
            } else {
                z2 = false;
            }
        }
    }

    final void i0(com.github.catvod.spider.merge.G.i iVar) {
        int size = this.q.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
        } while (this.q.get(size) != iVar);
        this.q.remove(size);
    }

    @Nullable
    final com.github.catvod.spider.merge.G.i j(com.github.catvod.spider.merge.G.i iVar) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (this.e.get(size) == iVar) {
                return this.e.get(size - 1);
            }
        }
        return null;
    }

    final boolean j0(com.github.catvod.spider.merge.G.i iVar) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (this.e.get(size) == iVar) {
                this.e.remove(size);
                return true;
            }
        }
        return false;
    }

    final void k(com.github.catvod.spider.merge.G.i iVar) {
        int size = this.q.size() - 1;
        int i = size - 12;
        if (i < 0) {
            i = 0;
        }
        int i2 = 0;
        while (size >= i) {
            com.github.catvod.spider.merge.G.i iVar2 = this.q.get(size);
            if (iVar2 == null) {
                return;
            }
            if (iVar.h0().equals(iVar2.h0()) && iVar.e().equals(iVar2.e())) {
                i2++;
            }
            if (i2 == 3) {
                this.q.remove(size);
                return;
            }
            size--;
        }
    }

    final void k0(com.github.catvod.spider.merge.G.i iVar, com.github.catvod.spider.merge.G.i iVar2) {
        ArrayList<com.github.catvod.spider.merge.G.i> arrayList = this.q;
        int iLastIndexOf = arrayList.lastIndexOf(iVar);
        com.github.catvod.spider.merge.E.c.c(iLastIndexOf != -1);
        arrayList.set(iLastIndexOf, iVar2);
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
            this.e.add(this.d.w0());
        }
        this.l = c.g;
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
    final boolean m0() {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.H.b.m0():boolean");
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

    final void p0(com.github.catvod.spider.merge.G.i iVar) {
        this.o = iVar;
    }

    final void q() {
        u("p");
        if (!"p".equals(a().h0())) {
            r(this.l);
        }
        a0("p");
    }

    final c q0() {
        return this.l;
    }

    final void r(c cVar) {
        if (this.a.a().a()) {
            this.a.a().add(new d(this.b, "Unexpected %s token [%s] when in state [%s]", this.g.getClass().getSimpleName(), this.g, cVar));
        }
    }

    final int r0() {
        return this.r.size();
    }

    final void s(boolean z2) {
        this.u = z2;
    }

    final void s0(c cVar) {
        this.l = cVar;
    }

    final boolean t() {
        return this.u;
    }

    public final String toString() {
        StringBuilder sbA = C0529a.a("TreeBuilder{currentToken=");
        sbA.append(this.g);
        sbA.append(", state=");
        sbA.append(this.l);
        sbA.append(", currentElement=");
        sbA.append(a());
        sbA.append('}');
        return sbA.toString();
    }

    final void u(String str) {
        while (com.github.catvod.spider.merge.F.b.c(a().h0(), C)) {
            if (str != null && b(str)) {
                return;
            } else {
                Z();
            }
        }
    }

    final void v(boolean z2) {
        String[] strArr = z2 ? D : C;
        while (com.github.catvod.spider.merge.F.b.c(a().h0(), strArr)) {
            Z();
        }
    }

    final com.github.catvod.spider.merge.G.i w(String str) {
        for (int size = this.q.size() - 1; size >= 0; size--) {
            com.github.catvod.spider.merge.G.i iVar = this.q.get(size);
            if (iVar == null) {
                return null;
            }
            if (iVar.h0().equals(str)) {
                return iVar;
            }
        }
        return null;
    }

    @Nullable
    final com.github.catvod.spider.merge.G.k x() {
        return this.p;
    }

    @Nullable
    final com.github.catvod.spider.merge.G.i y(String str) {
        int size = this.e.size() - 1;
        int i = size >= 256 ? size - 256 : 0;
        while (size >= i) {
            com.github.catvod.spider.merge.G.i iVar = this.e.get(size);
            if (iVar.h0().equals(str)) {
                return iVar;
            }
            size--;
        }
        return null;
    }

    final com.github.catvod.spider.merge.G.i z() {
        return this.o;
    }
}
