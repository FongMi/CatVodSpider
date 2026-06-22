package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.A.C0019u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class C0032b {
    public C0019u a;
    public C0030a b;
    public P c;
    public com.github.catvod.spider.merge.L.h d;
    public ArrayList e;
    public String f;
    public N g;
    public D h;
    public HashMap i;
    public B l;
    public B m;
    public boolean n;
    public com.github.catvod.spider.merge.L.l o;
    public com.github.catvod.spider.merge.L.o p;
    public ArrayList q;
    public ArrayList r;
    public ArrayList s;
    public K t;
    public boolean u;
    public boolean v;
    public static final String[] x = {"applet", "caption", "html", "marquee", "object", "table", "td", "th"};
    public static final String[] y = {"ol", "ul"};
    public static final String[] z = {"button"};
    public static final String[] A = {"html", "table"};
    public static final String[] B = {"optgroup", "option"};
    public static final String[] C = {"dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc"};
    public static final String[] D = {"caption", "colgroup", "dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] E = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};
    public final L j = new L();
    public final K k = new K();
    public final String[] w = {null};

    public static boolean z(ArrayList arrayList, com.github.catvod.spider.merge.L.l lVar) {
        int size = arrayList.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        while (i >= i2) {
            if (((com.github.catvod.spider.merge.L.l) arrayList.get(i)) == lVar) {
                return true;
            }
            i--;
        }
        return false;
    }

    public final void A() {
    }

    public final void B(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            com.github.catvod.spider.merge.L.l lVar = (com.github.catvod.spider.merge.L.l) this.e.get(size);
            this.e.remove(size);
            if (lVar.d.b.equals(str)) {
                boolean z2 = this.g instanceof K;
                return;
            }
        }
    }

    public final void C() {
        if (this.r.size() > 0) {
        }
    }

    public final boolean D(N n) {
        this.g = n;
        return this.l.c(n, this);
    }

    public final boolean E(N n, B b) {
        this.g = n;
        return b.c(n, this);
    }

    public final boolean F(String str) {
        N n = this.g;
        K k = this.k;
        if (n == k) {
            K k2 = new K();
            k2.n(str);
            return D(k2);
        }
        k.f();
        k.n(str);
        return D(k);
    }

    public final void G(String str) {
        N n = this.g;
        L l = this.j;
        if (n == l) {
            L l2 = new L();
            l2.n(str);
            D(l2);
        } else {
            l.f();
            l.n(str);
            D(l);
        }
    }

    public final void H(B b) {
        this.r.add(b);
    }

    public final void I() {
        com.github.catvod.spider.merge.L.l lVar;
        if (this.e.size() > 256) {
            return;
        }
        boolean z2 = true;
        if (this.q.size() > 0) {
            ArrayList arrayList = this.q;
            lVar = (com.github.catvod.spider.merge.L.l) arrayList.get(arrayList.size() - 1);
        } else {
            lVar = null;
        }
        if (lVar == null || z(this.e, lVar)) {
            return;
        }
        int size = this.q.size();
        int i = size - 12;
        if (i < 0) {
            i = 0;
        }
        int i2 = size - 1;
        int i3 = i2;
        while (i3 != i) {
            i3--;
            lVar = (com.github.catvod.spider.merge.L.l) this.q.get(i3);
            if (lVar == null || z(this.e, lVar)) {
                z2 = false;
                break;
            }
        }
        while (true) {
            if (!z2) {
                i3++;
                lVar = (com.github.catvod.spider.merge.L.l) this.q.get(i3);
            }
            com.github.catvod.spider.merge.J.b.f(lVar);
            com.github.catvod.spider.merge.L.l lVar2 = new com.github.catvod.spider.merge.L.l(N(lVar.d.b, this.h), null, lVar.d().clone());
            x(lVar2);
            this.e.add(lVar2);
            this.q.set(i3, lVar2);
            if (i3 == i2) {
                return;
            } else {
                z2 = false;
            }
        }
    }

    public final void J(com.github.catvod.spider.merge.L.l lVar) {
        for (int size = this.q.size() - 1; size >= 0; size--) {
            if (((com.github.catvod.spider.merge.L.l) this.q.get(size)) == lVar) {
                this.q.remove(size);
                return;
            }
        }
    }

    public final void K(com.github.catvod.spider.merge.L.l lVar) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (((com.github.catvod.spider.merge.L.l) this.e.get(size)) == lVar) {
                this.e.remove(size);
                return;
            }
        }
    }

    public final void L() {
        D d;
        com.github.catvod.spider.merge.L.l lVar;
        com.github.catvod.spider.merge.L.l lVar2;
        if (!y("body")) {
            ArrayList arrayList = this.e;
            com.github.catvod.spider.merge.L.h hVar = this.d;
            Iterator it = hVar.z().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                d = D.c;
                if (zHasNext) {
                    lVar = (com.github.catvod.spider.merge.L.l) it.next();
                    if (lVar.d.b.equals("html")) {
                        break;
                    }
                } else {
                    com.github.catvod.spider.merge.L.q qVarW = hVar.w();
                    com.github.catvod.spider.merge.L.h hVar2 = qVarW instanceof com.github.catvod.spider.merge.L.h ? (com.github.catvod.spider.merge.L.h) qVarW : null;
                    if (hVar2 == null || hVar2.k == null) {
                        new C();
                    }
                    lVar = new com.github.catvod.spider.merge.L.l(E.a("html", d), hVar.e(), null);
                    hVar.x(lVar);
                }
            }
            Iterator it2 = lVar.z().iterator();
            while (true) {
                if (it2.hasNext()) {
                    lVar2 = (com.github.catvod.spider.merge.L.l) it2.next();
                    if ("body".equals(lVar2.d.b) || "frameset".equals(lVar2.d.b)) {
                        break;
                    }
                } else {
                    com.github.catvod.spider.merge.L.q qVarW2 = lVar.w();
                    com.github.catvod.spider.merge.L.h hVar3 = qVarW2 instanceof com.github.catvod.spider.merge.L.h ? (com.github.catvod.spider.merge.L.h) qVarW2 : null;
                    if (hVar3 == null || hVar3.k == null) {
                        new C();
                    }
                    lVar2 = new com.github.catvod.spider.merge.L.l(E.a("body", d), lVar.e(), null);
                    lVar.x(lVar2);
                }
            }
            arrayList.add(lVar2);
        }
        this.l = B.g;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x010b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x011a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x011d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x012b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x012e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x011a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0128 A[LOOP:0: B:10:0x0022->B:98:0x0128, LOOP_END] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1091)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean M() {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.M.C0032b.M():boolean");
    }

    public final E N(String str, D d) {
        E e = (E) this.i.get(str);
        if (e != null) {
            return e;
        }
        E eA = E.a(str, d);
        this.i.put(str, eA);
        return eA;
    }

    public final com.github.catvod.spider.merge.L.l a(com.github.catvod.spider.merge.L.l lVar) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (((com.github.catvod.spider.merge.L.l) this.e.get(size)) == lVar) {
                return (com.github.catvod.spider.merge.L.l) this.e.get(size - 1);
            }
        }
        return null;
    }

    public final void b(com.github.catvod.spider.merge.L.l lVar) {
        int size = this.q.size();
        int i = size - 13;
        int i2 = 0;
        if (i < 0) {
            i = 0;
        }
        for (int i3 = size - 1; i3 >= i; i3--) {
            com.github.catvod.spider.merge.L.l lVar2 = (com.github.catvod.spider.merge.L.l) this.q.get(i3);
            if (lVar2 == null) {
                return;
            }
            if (lVar.d.b.equals(lVar2.d.b) && lVar.d().equals(lVar2.d())) {
                i2++;
            }
            if (i2 == 3) {
                this.q.remove(i3);
                return;
            }
        }
    }

    public final void c() {
        while (!this.q.isEmpty()) {
            int size = this.q.size();
            if ((size > 0 ? (com.github.catvod.spider.merge.L.l) this.q.remove(size - 1) : null) == null) {
                return;
            }
        }
    }

    public final void d(String... strArr) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            com.github.catvod.spider.merge.L.l lVar = (com.github.catvod.spider.merge.L.l) this.e.get(size);
            String str = lVar.d.b;
            String[] strArr2 = com.github.catvod.bean.b.a;
            for (String str2 : strArr) {
                if (str2.equals(str)) {
                    return;
                }
            }
            if (lVar.d.b.equals("html")) {
                return;
            }
            this.e.remove(size);
        }
    }

    public final void e() {
        d("table", "template");
    }

    public final com.github.catvod.spider.merge.L.l f() {
        int size = this.e.size();
        return size > 0 ? (com.github.catvod.spider.merge.L.l) this.e.get(size - 1) : this.d;
    }

    public final boolean g(String str) {
        com.github.catvod.spider.merge.L.l lVarF;
        return (this.e.size() == 0 || (lVarF = f()) == null || !lVarF.d.b.equals(str)) ? false : true;
    }

    public final void h(B b) {
        if (((C) this.a.a).a()) {
            ((C) this.a.a).add(new com.github.catvod.spider.merge.B.c(this.b, "Unexpected %s token [%s] when in state [%s]", new Object[]{this.g.getClass().getSimpleName(), this.g, b}));
        }
    }

    public final void i(String str) {
        while (com.github.catvod.bean.b.c(f().d.b, C)) {
            if (str != null && g(str)) {
                return;
            } else {
                A();
            }
        }
    }

    public final void j(boolean z2) {
        String[] strArr = z2 ? D : C;
        while (com.github.catvod.bean.b.c(f().d.b, strArr)) {
            A();
        }
    }

    public final com.github.catvod.spider.merge.L.l k(String str) {
        for (int size = this.q.size() - 1; size >= 0; size--) {
            com.github.catvod.spider.merge.L.l lVar = (com.github.catvod.spider.merge.L.l) this.q.get(size);
            if (lVar == null) {
                return null;
            }
            if (lVar.d.b.equals(str)) {
                return lVar;
            }
        }
        return null;
    }

    public final com.github.catvod.spider.merge.L.l l(String str) {
        int size = this.e.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        while (i >= i2) {
            com.github.catvod.spider.merge.L.l lVar = (com.github.catvod.spider.merge.L.l) this.e.get(i);
            if (lVar.d.b.equals(str)) {
                return lVar;
            }
            i--;
        }
        return null;
    }

    public final boolean m(String str) {
        String[] strArr = z;
        String[] strArr2 = x;
        String[] strArr3 = this.w;
        strArr3[0] = str;
        return p(strArr3, strArr2, strArr);
    }

    public final boolean n(String str) {
        String[] strArr = x;
        String[] strArr2 = this.w;
        strArr2[0] = str;
        return p(strArr2, strArr, null);
    }

    public final boolean o(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            String str2 = ((com.github.catvod.spider.merge.L.l) this.e.get(size)).d.b;
            if (str2.equals(str)) {
                return true;
            }
            if (!com.github.catvod.bean.b.c(str2, B)) {
                return false;
            }
        }
        throw new com.github.catvod.spider.merge.J.c("Should not be reachable");
    }

    public final boolean p(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.e.size();
        int i = size - 1;
        int i2 = i > 100 ? size - 101 : 0;
        while (i >= i2) {
            String str = ((com.github.catvod.spider.merge.L.l) this.e.get(i)).d.b;
            if (com.github.catvod.bean.b.c(str, strArr)) {
                return true;
            }
            if (com.github.catvod.bean.b.c(str, strArr2)) {
                return false;
            }
            if (strArr3 != null && com.github.catvod.bean.b.c(str, strArr3)) {
                return false;
            }
            i--;
        }
        return false;
    }

    public final boolean q(String str) {
        String[] strArr = A;
        String[] strArr2 = this.w;
        strArr2[0] = str;
        return p(strArr2, strArr, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.github.catvod.spider.merge.L.l r(com.github.catvod.spider.merge.M.L r11) {
        /*
            r10 = this;
            r0 = 0
            r1 = 1
            boolean r2 = r11.l()
            if (r2 == 0) goto L72
            com.github.catvod.spider.merge.L.c r2 = r11.l
            int r3 = r2.a
            if (r3 != 0) goto Lf
            goto L72
        Lf:
            com.github.catvod.spider.merge.M.D r4 = r10.h
            if (r3 != 0) goto L15
            r3 = 1
            goto L16
        L15:
            r3 = 0
        L16:
            if (r3 == 0) goto L1a
            r5 = 0
            goto L52
        L1a:
            boolean r3 = r4.b
            r4 = 0
            r5 = 0
        L1e:
            java.lang.String[] r6 = r2.b
            int r6 = r6.length
            if (r4 >= r6) goto L52
            int r6 = r4 + 1
            r7 = r6
        L26:
            java.lang.String[] r8 = r2.b
            int r9 = r8.length
            if (r7 >= r9) goto L50
            r9 = r8[r7]
            if (r9 != 0) goto L30
            goto L50
        L30:
            if (r3 == 0) goto L3a
            r8 = r8[r4]
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L48
        L3a:
            if (r3 != 0) goto L4e
            java.lang.String[] r8 = r2.b
            r9 = r8[r4]
            r8 = r8[r7]
            boolean r8 = r9.equalsIgnoreCase(r8)
            if (r8 == 0) goto L4e
        L48:
            int r5 = r5 + r1
            r2.l(r7)
            int r7 = r7 + (-1)
        L4e:
            int r7 = r7 + r1
            goto L26
        L50:
            r4 = r6
            goto L1e
        L52:
            if (r5 <= 0) goto L72
            java.lang.String r2 = r11.c
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r2
            com.github.catvod.spider.merge.A.u r0 = r10.a
            java.lang.Object r0 = r0.a
            com.github.catvod.spider.merge.M.C r0 = (com.github.catvod.spider.merge.M.C) r0
            boolean r2 = r0.a()
            if (r2 == 0) goto L72
            com.github.catvod.spider.merge.B.c r2 = new com.github.catvod.spider.merge.B.c
            com.github.catvod.spider.merge.M.a r3 = r10.b
            java.lang.String r4 = "Dropped duplicate attribute(s) in tag [%s]"
            r2.<init>(r3, r4, r1)
            r0.add(r2)
        L72:
            boolean r0 = r11.k
            if (r0 == 0) goto L98
            com.github.catvod.spider.merge.L.l r11 = r10.u(r11)
            java.util.ArrayList r0 = r10.e
            r0.add(r11)
            com.github.catvod.spider.merge.M.P r0 = r10.c
            com.github.catvod.spider.merge.M.b0 r1 = com.github.catvod.spider.merge.M.g1.a
            r0.o(r1)
            com.github.catvod.spider.merge.M.P r0 = r10.c
            com.github.catvod.spider.merge.M.K r1 = r10.t
            r1.f()
            com.github.catvod.spider.merge.M.E r2 = r11.d
            java.lang.String r2 = r2.a
            r1.n(r2)
            r0.f(r1)
            return r11
        L98:
            com.github.catvod.spider.merge.L.l r0 = new com.github.catvod.spider.merge.L.l
            java.lang.String r1 = r11.m()
            com.github.catvod.spider.merge.M.D r2 = r10.h
            com.github.catvod.spider.merge.M.E r1 = r10.N(r1, r2)
            com.github.catvod.spider.merge.M.D r2 = r10.h
            com.github.catvod.spider.merge.L.c r11 = r11.l
            r2.a(r11)
            r2 = 0
            r0.<init>(r1, r2, r11)
            r10.x(r0)
            java.util.ArrayList r11 = r10.e
            r11.add(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.M.C0032b.r(com.github.catvod.spider.merge.M.L):com.github.catvod.spider.merge.L.l");
    }

    public final void s(G g) {
        com.github.catvod.spider.merge.L.l lVarF = f();
        String str = lVarF.d.b;
        String str2 = g.b;
        lVarF.x(g instanceof F ? new com.github.catvod.spider.merge.L.d(str2) : (str.equals("script") || str.equals("style")) ? new com.github.catvod.spider.merge.L.f(str2) : new com.github.catvod.spider.merge.L.s(str2));
    }

    public final void t(H h) {
        String string = h.c;
        if (string == null) {
            string = h.b.toString();
        }
        x(new com.github.catvod.spider.merge.L.e(string));
    }

    public final String toString() {
        return "TreeBuilder{currentToken=" + this.g + ", state=" + this.l + ", currentElement=" + f() + '}';
    }

    public final com.github.catvod.spider.merge.L.l u(L l) {
        E eN = N(l.m(), this.h);
        D d = this.h;
        com.github.catvod.spider.merge.L.c cVar = l.l;
        d.a(cVar);
        com.github.catvod.spider.merge.L.l lVar = new com.github.catvod.spider.merge.L.l(eN, null, cVar);
        x(lVar);
        if (l.k) {
            if (!E.j.containsKey(eN.a)) {
                eN.f = true;
            } else if (!eN.e) {
                P p = this.c;
                Object[] objArr = {eN.b};
                C c = p.b;
                if (c.a()) {
                    c.add(new com.github.catvod.spider.merge.B.c(p.a, "Tag [%s] cannot be self closing; not a void tag", objArr));
                }
            }
        }
        return lVar;
    }

    public final void v(L l, boolean z2, boolean z3) {
        E eN = N(l.m(), this.h);
        D d = this.h;
        com.github.catvod.spider.merge.L.c cVar = l.l;
        d.a(cVar);
        com.github.catvod.spider.merge.L.o oVar = new com.github.catvod.spider.merge.L.o(eN, cVar);
        if (!z3 || !y("template")) {
            this.p = oVar;
        }
        x(oVar);
        if (z2) {
            this.e.add(oVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(com.github.catvod.spider.merge.L.q r6) {
        /*
            r5 = this;
            r0 = 1
            java.lang.String r1 = "table"
            com.github.catvod.spider.merge.L.l r1 = r5.l(r1)
            r2 = 0
            if (r1 == 0) goto L18
            com.github.catvod.spider.merge.L.q r3 = r1.a
            com.github.catvod.spider.merge.L.l r3 = (com.github.catvod.spider.merge.L.l) r3
            if (r3 == 0) goto L12
            r4 = 1
            goto L21
        L12:
            com.github.catvod.spider.merge.L.l r3 = r5.a(r1)
        L16:
            r4 = 0
            goto L21
        L18:
            java.util.ArrayList r3 = r5.e
            java.lang.Object r3 = r3.get(r2)
            com.github.catvod.spider.merge.L.l r3 = (com.github.catvod.spider.merge.L.l) r3
            goto L16
        L21:
            if (r4 == 0) goto L37
            com.github.catvod.spider.merge.J.b.f(r1)
            com.github.catvod.spider.merge.L.q r3 = r1.a
            com.github.catvod.spider.merge.J.b.f(r3)
            com.github.catvod.spider.merge.L.q r3 = r1.a
            int r1 = r1.b
            com.github.catvod.spider.merge.L.q[] r0 = new com.github.catvod.spider.merge.L.q[r0]
            r0[r2] = r6
            r3.b(r1, r0)
            goto L3a
        L37:
            r3.x(r6)
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.M.C0032b.w(com.github.catvod.spider.merge.L.q):void");
    }

    public final void x(com.github.catvod.spider.merge.L.q qVar) {
        com.github.catvod.spider.merge.L.o oVar;
        if (this.e.isEmpty()) {
            this.d.x(qVar);
        } else if (this.v && com.github.catvod.bean.b.c(f().d.b, A.A)) {
            w(qVar);
        } else {
            f().x(qVar);
        }
        if (qVar instanceof com.github.catvod.spider.merge.L.l) {
            com.github.catvod.spider.merge.L.l lVar = (com.github.catvod.spider.merge.L.l) qVar;
            if (!lVar.d.h || (oVar = this.p) == null) {
                return;
            }
            oVar.j.add(lVar);
        }
    }

    public final boolean y(String str) {
        return l(str) != null;
    }
}
