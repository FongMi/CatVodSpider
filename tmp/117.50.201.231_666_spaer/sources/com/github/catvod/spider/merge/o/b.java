package com.github.catvod.spider.merge.O;

import com.github.catvod.spider.merge.G.i;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class b implements com.github.catvod.spider.merge.L.d {
    @Override // com.github.catvod.spider.merge.L.d
    public final com.github.catvod.spider.merge.L.f a(com.github.catvod.spider.merge.L.e eVar) {
        LinkedList linkedList = new LinkedList();
        Iterator<i> it = eVar.a().iterator();
        while (it.hasNext()) {
            linkedList.add(it.next().b0());
        }
        return new com.github.catvod.spider.merge.L.f(linkedList);
    }

    @Override // com.github.catvod.spider.merge.L.d
    public final String name() {
        return "html";
    }
}
