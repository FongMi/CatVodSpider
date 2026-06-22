package com.github.catvod.spider.merge.Z;

import com.github.catvod.spider.merge.L.m;
import com.github.catvod.spider.merge.oZP;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class e implements com.github.catvod.spider.merge.W.d {
    @Override // com.github.catvod.spider.merge.W.d
    public final com.github.catvod.spider.merge.W.f a(com.github.catvod.spider.merge.W.e eVar) {
        LinkedList linkedList = new LinkedList();
        Iterator<m> it = eVar.a().iterator();
        while (it.hasNext()) {
            linkedList.add(it.next().t());
        }
        return new com.github.catvod.spider.merge.W.f(linkedList);
    }

    @Override // com.github.catvod.spider.merge.W.d
    public final String name() {
        return oZP.d("1A1A03241E1D01021B");
    }
}
