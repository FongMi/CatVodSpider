package com.github.catvod.spider.merge.FM.W;

import com.github.catvod.spider.merge.FM.M.C0274g;
import java.util.LinkedList;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class l implements com.github.catvod.spider.merge.FM.V.a {
    @Override // com.github.catvod.spider.merge.FM.V.a
    public final com.github.catvod.spider.merge.FM.V.f a(C0274g c0274g) {
        LinkedList linkedList = new LinkedList();
        for (com.github.catvod.spider.merge.FM.K.m mVar : c0274g) {
            if (mVar.n0() != null) {
                linkedList.add(mVar.n0());
            }
        }
        C0274g c0274g2 = new C0274g();
        c0274g2.addAll(linkedList);
        return new com.github.catvod.spider.merge.FM.V.f(c0274g2);
    }

    @Override // com.github.catvod.spider.merge.FM.V.a
    public final String name() {
        return "preceding-sibling-one";
    }
}
