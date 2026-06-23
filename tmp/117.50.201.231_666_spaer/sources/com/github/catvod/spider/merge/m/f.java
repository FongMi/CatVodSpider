package com.github.catvod.spider.merge.M;

import java.util.HashSet;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class f implements com.github.catvod.spider.merge.L.a {
    @Override // com.github.catvod.spider.merge.L.a
    public final com.github.catvod.spider.merge.L.f a(com.github.catvod.spider.merge.I.c cVar) {
        HashSet hashSet = new HashSet();
        com.github.catvod.spider.merge.I.c cVar2 = new com.github.catvod.spider.merge.I.c();
        for (com.github.catvod.spider.merge.G.i iVar : cVar) {
            com.github.catvod.spider.merge.I.c cVarZ = iVar.Z();
            cVarZ.remove(iVar);
            hashSet.addAll(cVarZ);
        }
        cVar2.addAll(hashSet);
        return new com.github.catvod.spider.merge.L.f(cVar2);
    }

    @Override // com.github.catvod.spider.merge.L.a
    public final String name() {
        return "descendant";
    }
}
