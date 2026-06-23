package com.github.catvod.spider.merge.M;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class e implements com.github.catvod.spider.merge.L.a {
    @Override // com.github.catvod.spider.merge.L.a
    public final com.github.catvod.spider.merge.L.f a(com.github.catvod.spider.merge.I.c cVar) {
        HashSet hashSet = new HashSet();
        com.github.catvod.spider.merge.I.c cVar2 = new com.github.catvod.spider.merge.I.c();
        Iterator<com.github.catvod.spider.merge.G.i> it = cVar.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().Z());
        }
        cVar2.addAll(hashSet);
        return new com.github.catvod.spider.merge.L.f(cVar2);
    }

    @Override // com.github.catvod.spider.merge.L.a
    public final String name() {
        return "descendant-or-self";
    }
}
