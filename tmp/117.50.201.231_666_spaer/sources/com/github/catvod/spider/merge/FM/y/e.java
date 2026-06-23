package com.github.catvod.spider.merge.FM.Y;

import com.github.catvod.spider.merge.FM.K.m;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class e implements com.github.catvod.spider.merge.FM.V.d {
    @Override // com.github.catvod.spider.merge.FM.V.d
    public final com.github.catvod.spider.merge.FM.V.f a(com.github.catvod.spider.merge.FM.V.e eVar) {
        LinkedList linkedList = new LinkedList();
        Iterator<m> it = eVar.a().iterator();
        while (it.hasNext()) {
            linkedList.add(it.next().t());
        }
        return new com.github.catvod.spider.merge.FM.V.f(linkedList);
    }

    @Override // com.github.catvod.spider.merge.FM.V.d
    public final String name() {
        return "outerHtml";
    }
}
