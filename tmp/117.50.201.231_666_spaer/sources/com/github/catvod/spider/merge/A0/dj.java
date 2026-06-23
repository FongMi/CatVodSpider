package com.github.catvod.spider.merge.A0;

import java.util.ArrayList;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum dj extends le {
    public dj() {
        super("ForeignContent", 23);
    }

    @Override // com.github.catvod.spider.merge.A0.le
    public final boolean a(uz uzVar, zl zlVar) {
        qh qhVar;
        qh qhVar2;
        qh qhVar3;
        ed edVarAp;
        int iH = wb.h(uzVar.g);
        if (iH == 0) {
            zlVar.as(this);
        } else if (iH == 1) {
            w wVar = (w) uzVar;
            if (ws.h(wVar.d, vu.an)) {
                return zlVar.v.a(uzVar, zlVar);
            }
            if (wVar.d.equals("font") && (((qhVar = wVar.f) != null && qhVar.m("color") != -1) || (((qhVar2 = wVar.f) != null && qhVar2.m("face") != -1) || ((qhVar3 = wVar.f) != null && qhVar3.m("size") != -1)))) {
                return zlVar.v.a(uzVar, zlVar);
            }
            zlVar.bh(wVar, zlVar.ap().g.d);
        } else if (iH == 2) {
            um umVar = (um) uzVar;
            if (umVar.d.equals("br") || umVar.d.equals("p")) {
                return zlVar.v.a(uzVar, zlVar);
            }
            if (umVar.d.equals("script") && zlVar.o.size() != 0 && (edVarAp = zlVar.ap()) != null) {
                ad adVar = edVarAp.g;
                if (adVar.c.equals("script") && adVar.d.equals("http://www.w3.org/2000/svg")) {
                    zlVar.bm();
                    return true;
                }
            }
            ArrayList arrayList = zlVar.o;
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("Stack unexpectedly empty");
            }
            int size = arrayList.size() - 1;
            ed edVar = (ed) arrayList.get(size);
            if (!edVar.aw(umVar.d)) {
                zlVar.as(this);
            }
            while (size != 0) {
                if (edVar.aw(umVar.d)) {
                    String str = edVar.g.c;
                    for (int size2 = zlVar.o.size() - 1; size2 >= 0 && !zlVar.bm().aw(str); size2--) {
                    }
                    return true;
                }
                size--;
                edVar = (ed) arrayList.get(size);
                if (edVar.g.d.equals("http://www.w3.org/1999/xhtml")) {
                    return zlVar.v.a(uzVar, zlVar);
                }
            }
        } else if (iH == 3) {
            zlVar.be((gx) uzVar);
        } else if (iH == 4) {
            im imVar = (im) uzVar;
            if (imVar.b.equals(le.aa)) {
                zlVar.as(this);
            } else if (le.ab(imVar)) {
                zlVar.bc(imVar);
            } else {
                zlVar.bc(imVar);
                zlVar.ae = false;
            }
        }
        return true;
    }
}
