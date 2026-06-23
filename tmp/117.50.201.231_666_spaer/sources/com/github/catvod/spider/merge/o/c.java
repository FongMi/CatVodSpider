package com.github.catvod.spider.merge.O;

import com.github.catvod.spider.merge.G.i;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class c implements com.github.catvod.spider.merge.L.d {
    @Override // com.github.catvod.spider.merge.L.d
    public final com.github.catvod.spider.merge.L.f a(com.github.catvod.spider.merge.L.e eVar) {
        com.github.catvod.spider.merge.I.c cVar = new com.github.catvod.spider.merge.I.c();
        for (i iVar : eVar.a()) {
            cVar.addAll(iVar.V());
            String strI0 = iVar.i0();
            if (com.github.catvod.spider.merge.y.f.d(strI0)) {
                i iVar2 = new i("");
                iVar2.Q(strI0);
                cVar.add(iVar2);
            }
        }
        return new com.github.catvod.spider.merge.L.f(cVar);
    }

    @Override // com.github.catvod.spider.merge.L.d
    public final String name() {
        return "node";
    }
}
