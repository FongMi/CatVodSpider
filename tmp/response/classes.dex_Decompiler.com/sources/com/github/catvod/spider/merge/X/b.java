package com.github.catvod.spider.merge.X;

import com.github.catvod.spider.merge.N.C0074g;
import com.github.catvod.spider.merge.oZP;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class b implements com.github.catvod.spider.merge.W.a {
    @Override // com.github.catvod.spider.merge.W.a
    public final com.github.catvod.spider.merge.W.f a(C0074g c0074g) {
        LinkedList linkedList = new LinkedList();
        Iterator<com.github.catvod.spider.merge.L.m> it = c0074g.iterator();
        while (it.hasNext()) {
            linkedList.addAll(it.next().l0());
        }
        return new com.github.catvod.spider.merge.W.f(new C0074g(linkedList));
    }

    @Override // com.github.catvod.spider.merge.W.a
    public final String name() {
        return oZP.d("140114241F211A1D");
    }
}
