package com.github.catvod.spider.merge.A0;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class nu extends rf {
    @Override // com.github.catvod.spider.merge.A0.rf, com.github.catvod.spider.merge.A0.dl
    public final Object b(uv uvVar) {
        if (!(uvVar instanceof uv)) {
            return uvVar.f(this);
        }
        if (!"..".equals(c())) {
            return as.d(uvVar.d().a);
        }
        HashSet hashSet = new HashSet();
        rp rpVar = new rp();
        Iterator<E> it = uvVar.d().a.iterator();
        while (it.hasNext()) {
            hashSet.add((ed) ((ed) it.next()).ap);
        }
        rpVar.addAll(hashSet);
        return as.d(rpVar);
    }
}
