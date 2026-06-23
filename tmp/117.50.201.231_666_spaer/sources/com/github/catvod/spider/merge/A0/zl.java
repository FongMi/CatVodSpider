package com.github.catvod.spider.merge.A0;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class zl {
    public static final String[] a = {"applet", "caption", "html", "marquee", "object", "table", "td", "th"};
    public static final String[] b = {"ol", "ul"};
    public static final String[] c = {"button"};
    public static final String[] d = {"html", "table"};
    public static final String[] e = {"optgroup", "option"};
    public static final String[] f = {"dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc"};
    public static final String[] g = {"caption", "colgroup", "dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] h = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};
    public static final String[] i = {"mi", "mn", "mo", "ms", "mtext"};
    public static final String[] j = {"desc", "foreignObject", "title"};
    public ArrayList aa;
    public ArrayList ab;
    public ArrayList ac;
    public um ad;
    public boolean ae;
    public boolean af;
    public xa k;
    public sf l;
    public hm m;
    public em n;
    public ArrayList o;
    public String p;
    public uz q;
    public vz r;
    public HashMap s;
    public w t;
    public le v;
    public le w;
    public boolean x;
    public ed y;
    public by z;
    public final um u = new um(3, this);
    public final String[] ag = {null};

    public static boolean ah(ArrayList arrayList, ed edVar) {
        int size = arrayList.size();
        int i2 = size - 1;
        int i3 = i2 >= 256 ? size - 257 : 0;
        while (i2 >= i3) {
            if (((ed) arrayList.get(i2)) == edVar) {
                return true;
            }
            i2--;
        }
        return false;
    }

    public final ed ai(ed edVar) {
        for (int size = this.o.size() - 1; size >= 0; size--) {
            if (((ed) this.o.get(size)) == edVar) {
                return (ed) this.o.get(size - 1);
            }
        }
        return null;
    }

    public final void aj(ed edVar) {
        int size = this.aa.size();
        int i2 = size - 13;
        int i3 = 0;
        if (i2 < 0) {
            i2 = 0;
        }
        for (int i4 = size - 1; i4 >= i2; i4--) {
            ed edVar2 = (ed) this.aa.get(i4);
            if (edVar2 == null) {
                return;
            }
            if (edVar.g.c.equals(edVar2.g.c) && edVar.l().equals(edVar2.l())) {
                i3++;
            }
            if (i3 == 3) {
                this.aa.remove(i4);
                return;
            }
        }
    }

    public final void ak() {
        while (!this.aa.isEmpty()) {
            int size = this.aa.size();
            if ((size > 0 ? (ed) this.aa.remove(size - 1) : null) == null) {
                return;
            }
        }
    }

    public final void al(String... strArr) {
        for (int size = this.o.size() - 1; size >= 0; size--) {
            ed edVar = (ed) this.o.get(size);
            if ("http://www.w3.org/1999/xhtml".equals(edVar.g.d) && (ws.h(edVar.g.c, strArr) || edVar.aw("html"))) {
                return;
            }
            bm();
        }
    }

    public final void am() {
        al("table", "template");
    }

    public final void an() {
        al("tr", "template");
    }

    public final ed ao(w wVar, String str, boolean z) {
        int i2;
        int i3;
        qh qhVar = wVar.f;
        if (!z) {
            vz vzVar = this.r;
            if (qhVar == null) {
                vzVar.getClass();
            } else if (!vzVar.d) {
                for (int i4 = 0; i4 < qhVar.a; i4++) {
                    String str2 = qhVar.b[i4];
                    if (!qh.d(str2)) {
                        qhVar.b[i4] = qf.c(str2);
                    }
                }
            }
        }
        if (qhVar != null && (i2 = qhVar.a) != 0) {
            vz vzVar2 = this.r;
            if (i2 == 0) {
                i3 = 0;
            } else {
                boolean z2 = vzVar2.d;
                int i5 = 0;
                i3 = 0;
                while (i5 < qhVar.a) {
                    String str3 = qhVar.b[i5];
                    i5++;
                    int i6 = i5;
                    while (i6 < qhVar.a) {
                        if ((z2 && str3.equals(qhVar.b[i6])) || (!z2 && str3.equalsIgnoreCase(qhVar.b[i6]))) {
                            i3++;
                            qhVar.o(i6);
                            i6--;
                        }
                        i6++;
                    }
                }
            }
            if (i3 > 0) {
                Object[] objArr = {wVar.d};
                kx kxVar = (kx) this.k.d;
                if (kxVar.a()) {
                    kxVar.add(new abb(this.l, "Dropped duplicate attribute(s) in tag [%s]", objArr));
                }
            }
        }
        ad adVarBy = by(wVar.c, str, z ? vz.b : this.r);
        return adVarBy.c.equals("form") ? new by(adVarBy, qhVar) : new ed(adVarBy, null, qhVar);
    }

    public final ed ap() {
        int size = this.o.size();
        return size > 0 ? (ed) this.o.get(size - 1) : this.n;
    }

    public final boolean aq(String str) {
        ed edVarAp;
        if (this.o.size() == 0 || (edVarAp = ap()) == null) {
            return false;
        }
        ad adVar = edVarAp.g;
        return adVar.c.equals(str) && adVar.d.equals("http://www.w3.org/1999/xhtml");
    }

    public final void ar(ed edVar) {
        by byVar;
        if (edVar.g.j && (byVar = this.z) != null) {
            byVar.a.add(edVar);
        }
        if (((kx) this.k.d).a() && edVar.av("xmlns")) {
            String strAu = edVar.au("xmlns");
            ad adVar = edVar.g;
            if (!strAu.equals(adVar.d)) {
                Object[] objArr = {edVar.au("xmlns"), adVar.b};
                kx kxVar = (kx) this.k.d;
                if (kxVar.a()) {
                    kxVar.add(new abb(this.l, "Invalid xmlns attribute [%s] on tag [%s]", objArr));
                }
            }
        }
        if (this.af && ws.i(ap().g.c, vu.ab)) {
            bj(edVar);
        } else {
            ap().y(edVar);
        }
        this.o.add(edVar);
    }

    public final void as(le leVar) {
        if (((kx) this.k.d).a()) {
            ((kx) this.k.d).add(new abb(this.l, "Unexpected %s token [%s] when in state [%s]", new Object[]{this.q.getClass().getSimpleName(), this.q, leVar}));
        }
    }

    public final void at(String str) {
        while (ws.i(ap().g.c, f)) {
            if (str != null && aq(str)) {
                return;
            } else {
                bm();
            }
        }
    }

    public final void au(boolean z) {
        String[] strArr = z ? g : f;
        while ("http://www.w3.org/1999/xhtml".equals(ap().g.d) && ws.i(ap().g.c, strArr)) {
            bm();
        }
    }

    public final ed av(String str) {
        for (int size = this.aa.size() - 1; size >= 0; size--) {
            ed edVar = (ed) this.aa.get(size);
            if (edVar == null) {
                return null;
            }
            if (edVar.aw(str)) {
                return edVar;
            }
        }
        return null;
    }

    public final ed aw(String str) {
        int size = this.o.size();
        int i2 = size - 1;
        int i3 = i2 >= 256 ? size - 257 : 0;
        while (i2 >= i3) {
            ed edVar = (ed) this.o.get(i2);
            ad adVar = edVar.g;
            if (adVar.c.equals(str) && adVar.d.equals("http://www.w3.org/1999/xhtml")) {
                return edVar;
            }
            i2--;
        }
        return null;
    }

    public final boolean ax(String str) {
        String[] strArr = c;
        String[] strArr2 = a;
        String[] strArr3 = this.ag;
        strArr3[0] = str;
        return ba(strArr3, strArr2, strArr);
    }

    public final boolean ay(String str) {
        String[] strArr = a;
        String[] strArr2 = this.ag;
        strArr2[0] = str;
        return ba(strArr2, strArr, null);
    }

    public final boolean az(String str) {
        for (int size = this.o.size() - 1; size >= 0; size--) {
            String str2 = ((ed) this.o.get(size)).g.c;
            if (str2.equals(str)) {
                return true;
            }
            if (!ws.i(str2, e)) {
                return false;
            }
        }
        throw new gg("Should not be reachable");
    }

    public final boolean ba(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.o.size();
        int i2 = size - 1;
        int i3 = i2 > 100 ? size - 101 : 0;
        while (i2 >= i3) {
            ed edVar = (ed) this.o.get(i2);
            if (edVar.g.d.equals("http://www.w3.org/1999/xhtml")) {
                String str = edVar.g.c;
                if (ws.i(str, strArr)) {
                    return true;
                }
                if (ws.i(str, strArr2)) {
                    return false;
                }
                if (strArr3 != null && ws.i(str, strArr3)) {
                    return false;
                }
            }
            i2--;
        }
        return false;
    }

    public final boolean bb(String str) {
        String[] strArr = d;
        String[] strArr2 = this.ag;
        strArr2[0] = str;
        return ba(strArr2, strArr, null);
    }

    public final void bc(im imVar) {
        bd(imVar, ap());
    }

    public final void bd(im imVar, ed edVar) {
        String str = edVar.g.c;
        String str2 = imVar.b;
        edVar.y(imVar instanceof e ? new rm(str2) : (str.equals("script") || str.equals("style")) ? new abt(str2) : new vy(str2));
    }

    public final void be(gx gxVar) {
        String string = gxVar.c;
        if (string == null) {
            string = gxVar.b.toString();
        }
        ap().y(new tk(string));
    }

    public final ed bf(w wVar) {
        ed edVarAo = ao(wVar, "http://www.w3.org/1999/xhtml", false);
        ar(edVarAo);
        if (wVar.e) {
            HashMap map = ad.a;
            ad adVar = edVarAo.g;
            if (!map.containsKey(adVar.b)) {
                adVar.h = true;
            } else if (!adVar.g) {
                hm hmVar = this.m;
                Object[] objArr = {adVar.c};
                kx kxVar = hmVar.d;
                if (kxVar.a()) {
                    kxVar.add(new abb(hmVar.c, "Tag [%s] cannot be self closing; not a void tag", objArr));
                }
            }
            this.m.al(wa.c);
            hm hmVar2 = this.m;
            um umVar = this.ad;
            umVar.a();
            umVar.ab(adVar.b);
            hmVar2.ac(umVar);
        }
        return edVarAo;
    }

    public final ed bg(w wVar) {
        ed edVarAo = ao(wVar, "http://www.w3.org/1999/xhtml", false);
        ar(edVarAo);
        bm();
        return edVarAo;
    }

    public final void bh(w wVar, String str) {
        ed edVarAo = ao(wVar, str, true);
        ar(edVarAo);
        if (wVar.e) {
            edVarAo.g.h = true;
            bm();
        }
    }

    public final void bi(w wVar, boolean z, boolean z2) {
        by byVar = (by) ao(wVar, "http://www.w3.org/1999/xhtml", false);
        if (!z2 || !bk("template")) {
            this.z = byVar;
        }
        ar(byVar);
        if (z) {
            return;
        }
        bm();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void bj(com.github.catvod.spider.merge.A0.ed r6) {
        /*
            r5 = this;
            r0 = 1
            java.lang.String r1 = "table"
            com.github.catvod.spider.merge.A0.ed r1 = r5.aw(r1)
            r2 = 0
            if (r1 == 0) goto L18
            com.github.catvod.spider.merge.A0.fw r3 = r1.ap
            com.github.catvod.spider.merge.A0.ed r3 = (com.github.catvod.spider.merge.A0.ed) r3
            if (r3 == 0) goto L12
            r4 = 1
            goto L21
        L12:
            com.github.catvod.spider.merge.A0.ed r3 = r5.ai(r1)
        L16:
            r4 = 0
            goto L21
        L18:
            java.util.ArrayList r3 = r5.o
            java.lang.Object r3 = r3.get(r2)
            com.github.catvod.spider.merge.A0.ed r3 = (com.github.catvod.spider.merge.A0.ed) r3
            goto L16
        L21:
            if (r4 == 0) goto L40
            com.github.catvod.spider.merge.A0.wc.e(r1)
            com.github.catvod.spider.merge.A0.fw r3 = r1.ap
            com.github.catvod.spider.merge.A0.wc.e(r3)
            com.github.catvod.spider.merge.A0.fw r3 = r6.ap
            com.github.catvod.spider.merge.A0.fw r4 = r1.ap
            if (r3 != r4) goto L34
            r6.ba()
        L34:
            com.github.catvod.spider.merge.A0.fw r3 = r1.ap
            int r1 = r1.aq
            com.github.catvod.spider.merge.A0.fw[] r0 = new com.github.catvod.spider.merge.A0.fw[r0]
            r0[r2] = r6
            r3.at(r1, r0)
            goto L43
        L40:
            r3.y(r6)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A0.zl.bj(com.github.catvod.spider.merge.A0.ed):void");
    }

    public final boolean bk(String str) {
        return aw(str) != null;
    }

    public final boolean bl(String[] strArr) {
        int size = this.o.size();
        int i2 = size - 1;
        int i3 = i2 > 100 ? size - 101 : 0;
        while (i2 >= i3) {
            if (!ws.i(((ed) this.o.get(i2)).g.c, strArr)) {
                return true;
            }
            i2--;
        }
        return false;
    }

    public final ed bm() {
        return (ed) this.o.remove(this.o.size() - 1);
    }

    public final void bn(String str) {
        for (int size = this.o.size() - 1; size >= 0; size--) {
            ad adVar = bm().g;
            if (adVar.c.equals(str) && adVar.d.equals("http://www.w3.org/1999/xhtml")) {
                return;
            }
        }
    }

    public final void bo() {
        if (this.ab.size() > 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean bp(com.github.catvod.spider.merge.A0.uz r9) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A0.zl.bp(com.github.catvod.spider.merge.A0.uz):boolean");
    }

    public final boolean bq(String str) {
        uz uzVar = this.q;
        um umVar = this.u;
        if (uzVar == umVar) {
            um umVar2 = new um(3, this);
            umVar2.ab(str);
            return bp(umVar2);
        }
        umVar.a();
        umVar.ab(str);
        return bp(umVar);
    }

    public final void br(String str) {
        w wVar = this.t;
        if (this.q == wVar) {
            w wVar2 = new w(2, this);
            wVar2.ab(str);
            bp(wVar2);
        } else {
            wVar.a();
            wVar.ab(str);
            bp(wVar);
        }
    }

    public final void bs(le leVar) {
        this.ab.add(leVar);
    }

    public final void bt() {
        ed edVar;
        if (this.o.size() > 256) {
            return;
        }
        boolean z = true;
        if (this.aa.size() > 0) {
            ArrayList arrayList = this.aa;
            edVar = (ed) arrayList.get(arrayList.size() - 1);
        } else {
            edVar = null;
        }
        if (edVar == null || ah(this.o, edVar)) {
            return;
        }
        int size = this.aa.size();
        int i2 = size - 12;
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = size - 1;
        int i4 = i3;
        while (i4 != i2) {
            i4--;
            edVar = (ed) this.aa.get(i4);
            if (edVar == null || ah(this.o, edVar)) {
                z = false;
                break;
            }
        }
        while (true) {
            if (!z) {
                i4++;
                edVar = (ed) this.aa.get(i4);
            }
            wc.e(edVar);
            ed edVar2 = new ed(by(edVar.g.c, "http://www.w3.org/1999/xhtml", this.r), null, edVar.l().clone());
            ar(edVar2);
            this.aa.set(i4, edVar2);
            if (i4 == i3) {
                return;
            } else {
                z = false;
            }
        }
    }

    public final void bu(ed edVar) {
        for (int size = this.aa.size() - 1; size >= 0; size--) {
            if (((ed) this.aa.get(size)) == edVar) {
                this.aa.remove(size);
                return;
            }
        }
    }

    public final void bv(ed edVar) {
        for (int size = this.o.size() - 1; size >= 0; size--) {
            if (((ed) this.o.get(size)) == edVar) {
                this.o.remove(size);
                return;
            }
        }
    }

    public final void bw() {
        vz vzVar;
        if (!bk("body")) {
            ArrayList arrayList = this.o;
            em emVar = this.n;
            ed edVarAc = emVar.ac();
            while (true) {
                vzVar = vz.a;
                if (edVarAc == null) {
                    String str = emVar.g.d;
                    fw fwVarX = emVar.x();
                    em emVar2 = fwVarX instanceof em ? (em) fwVarX : null;
                    (emVar2 != null ? emVar2.al : new xa(new zl())).getClass();
                    ed edVar = new ed(ad.m("html", str, vzVar), emVar.m(), null);
                    emVar.y(edVar);
                    edVarAc = edVar;
                } else if (edVarAc.aw("html")) {
                    break;
                } else {
                    edVarAc = edVarAc.af();
                }
            }
            ed edVarAc2 = edVarAc.ac();
            while (true) {
                if (edVarAc2 == null) {
                    String str2 = edVarAc.g.d;
                    fw fwVarX2 = edVarAc.x();
                    em emVar3 = fwVarX2 instanceof em ? (em) fwVarX2 : null;
                    (emVar3 != null ? emVar3.al : new xa(new zl())).getClass();
                    ed edVar2 = new ed(ad.m("body", str2, vzVar), edVarAc.m(), null);
                    edVarAc.y(edVar2);
                    edVarAc2 = edVar2;
                } else if (edVarAc2.aw("body") || edVarAc2.aw("frameset")) {
                    break;
                } else {
                    edVarAc2 = edVarAc2.af();
                }
            }
            arrayList.add(edVarAc2);
        }
        this.v = le.i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x011c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x013a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x015a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0146  */
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
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
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
    public final boolean bx() {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A0.zl.bx():boolean");
    }

    public final ad by(String str, String str2, vz vzVar) {
        ad adVar = (ad) this.s.get(str);
        if (adVar != null && adVar.d.equals(str2)) {
            return adVar;
        }
        ad adVarM = ad.m(str, str2, vzVar);
        this.s.put(str, adVarM);
        return adVarM;
    }

    public final String toString() {
        return "TreeBuilder{currentToken=" + this.q + ", state=" + this.v + ", currentElement=" + ap() + '}';
    }
}
