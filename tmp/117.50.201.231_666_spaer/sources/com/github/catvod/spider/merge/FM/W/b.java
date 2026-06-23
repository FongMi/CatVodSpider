package com.github.catvod.spider.merge.FM.W;

import com.github.catvod.spider.merge.FM.M.C0274g;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class b implements com.github.catvod.spider.merge.FM.V.a {
    @Override // com.github.catvod.spider.merge.FM.V.a
    public final com.github.catvod.spider.merge.FM.V.f a(C0274g c0274g) {
        LinkedList linkedList = new LinkedList();
        Iterator<com.github.catvod.spider.merge.FM.K.m> it = c0274g.iterator();
        while (it.hasNext()) {
            linkedList.addAll(it.next().l0());
        }
        return new com.github.catvod.spider.merge.FM.V.f(new C0274g(linkedList));
    }

    @Override // com.github.catvod.spider.merge.FM.V.a
    public final String name() {
        return "ancestor";
    }
}
