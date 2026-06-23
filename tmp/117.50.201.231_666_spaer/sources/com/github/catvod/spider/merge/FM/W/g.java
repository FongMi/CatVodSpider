package com.github.catvod.spider.merge.FM.W;

import com.github.catvod.spider.merge.FM.A.p;
import com.github.catvod.spider.merge.FM.M.C0274g;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class g implements com.github.catvod.spider.merge.FM.V.a {
    @Override // com.github.catvod.spider.merge.FM.V.a
    public final com.github.catvod.spider.merge.FM.V.f a(C0274g c0274g) {
        LinkedList linkedList = new LinkedList();
        for (com.github.catvod.spider.merge.FM.K.m mVar : c0274g) {
            Iterator<com.github.catvod.spider.merge.FM.K.m> it = mVar.l0().iterator();
            while (it.hasNext()) {
                C0274g c0274gA = p.a(it.next());
                if (c0274gA != null) {
                    Iterator<com.github.catvod.spider.merge.FM.K.m> it2 = c0274gA.iterator();
                    while (it2.hasNext()) {
                        linkedList.addAll(it2.next().Z());
                    }
                }
            }
            C0274g c0274gA2 = p.a(mVar);
            if (c0274gA2 != null) {
                Iterator<com.github.catvod.spider.merge.FM.K.m> it3 = c0274gA2.iterator();
                while (it3.hasNext()) {
                    linkedList.addAll(it3.next().Z());
                }
            }
        }
        return new com.github.catvod.spider.merge.FM.V.f(new C0274g(linkedList));
    }

    @Override // com.github.catvod.spider.merge.FM.V.a
    public final String name() {
        return "following";
    }
}
