package com.github.catvod.spider.merge.X;

import com.github.catvod.spider.merge.N.C0074g;
import com.github.catvod.spider.merge.oZP;
import java.util.LinkedList;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class l implements com.github.catvod.spider.merge.W.a {
    @Override // com.github.catvod.spider.merge.W.a
    public final com.github.catvod.spider.merge.W.f a(C0074g c0074g) {
        LinkedList linkedList = new LinkedList();
        for (com.github.catvod.spider.merge.L.m mVar : c0074g) {
            if (mVar.n0() != null) {
                linkedList.add(mVar.n0());
            }
        }
        C0074g c0074g2 = new C0074g();
        c0074g2.addAll(linkedList);
        return new com.github.catvod.spider.merge.W.f(c0074g2);
    }

    @Override // com.github.catvod.spider.merge.W.a
    public final String name() {
        return oZP.d("051D122209311C01106C1F3C17031E2F0B781A0112");
    }
}
