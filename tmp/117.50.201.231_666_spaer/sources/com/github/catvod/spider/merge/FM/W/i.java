package com.github.catvod.spider.merge.FM.W;

import com.github.catvod.spider.merge.FM.A.p;
import com.github.catvod.spider.merge.FM.M.C0274g;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class i implements com.github.catvod.spider.merge.FM.V.a {
    @Override // com.github.catvod.spider.merge.FM.V.a
    public final com.github.catvod.spider.merge.FM.V.f a(C0274g c0274g) {
        LinkedList linkedList = new LinkedList();
        Iterator<com.github.catvod.spider.merge.FM.K.m> it = c0274g.iterator();
        while (it.hasNext()) {
            C0274g c0274gA = p.a(it.next());
            if (c0274gA != null) {
                linkedList.addAll(c0274gA);
            }
        }
        C0274g c0274g2 = new C0274g();
        c0274g2.addAll(linkedList);
        return new com.github.catvod.spider.merge.FM.V.f(c0274g2);
    }

    @Override // com.github.catvod.spider.merge.FM.V.a
    public final String name() {
        return "following-sibling";
    }
}
