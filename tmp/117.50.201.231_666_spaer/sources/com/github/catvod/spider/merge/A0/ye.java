package com.github.catvod.spider.merge.A0;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ye extends rf {
    @Override // com.github.catvod.spider.merge.A0.rf, com.github.catvod.spider.merge.A0.dl
    public final Object b(uv uvVar) {
        if (!(uvVar instanceof uv)) {
            return uvVar.f(this);
        }
        List listL = l(abj.class);
        if (listL == null) {
            return null;
        }
        if (listL.size() <= 1) {
            return (as) ((dl) listL.get(0)).b(uvVar);
        }
        LinkedList linkedList = new LinkedList();
        Iterator it = listL.iterator();
        while (it.hasNext()) {
            as asVar = (as) ((abj) it.next()).b(uvVar);
            if (asVar != null) {
                linkedList.add(asVar.i());
            }
        }
        return as.d(fx.e(linkedList, ":"));
    }
}
