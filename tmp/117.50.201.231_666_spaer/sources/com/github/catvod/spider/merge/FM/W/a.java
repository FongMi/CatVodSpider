package com.github.catvod.spider.merge.FM.W;

import com.github.catvod.spider.merge.FM.M.C0274g;
import java.util.LinkedList;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class a implements com.github.catvod.spider.merge.FM.V.a {
    @Override // com.github.catvod.spider.merge.FM.V.a
    public final com.github.catvod.spider.merge.FM.V.f a(C0274g c0274g) {
        LinkedList linkedList = new LinkedList();
        for (com.github.catvod.spider.merge.FM.K.m mVar : c0274g) {
            linkedList.addAll(mVar.l0());
            linkedList.add(mVar);
        }
        return new com.github.catvod.spider.merge.FM.V.f(new C0274g(linkedList));
    }

    @Override // com.github.catvod.spider.merge.FM.V.a
    public final String name() {
        return "ancestor-or-self";
    }
}
