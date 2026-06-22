package com.github.catvod.spider.merge.X;

import com.github.catvod.spider.merge.B.p;
import com.github.catvod.spider.merge.N.C0074g;
import com.github.catvod.spider.merge.oZP;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class g implements com.github.catvod.spider.merge.W.a {
    @Override // com.github.catvod.spider.merge.W.a
    public final com.github.catvod.spider.merge.W.f a(C0074g c0074g) {
        LinkedList linkedList = new LinkedList();
        for (com.github.catvod.spider.merge.L.m mVar : c0074g) {
            Iterator<com.github.catvod.spider.merge.L.m> it = mVar.l0().iterator();
            while (it.hasNext()) {
                C0074g c0074gA = p.a(it.next());
                if (c0074gA != null) {
                    Iterator<com.github.catvod.spider.merge.L.m> it2 = c0074gA.iterator();
                    while (it2.hasNext()) {
                        linkedList.addAll(it2.next().Z());
                    }
                }
            }
            C0074g c0074gA2 = p.a(mVar);
            if (c0074gA2 != null) {
                Iterator<com.github.catvod.spider.merge.L.m> it3 = c0074gA2.iterator();
                while (it3.hasNext()) {
                    linkedList.addAll(it3.next().Z());
                }
            }
        }
        return new com.github.catvod.spider.merge.W.f(new C0074g(linkedList));
    }

    @Override // com.github.catvod.spider.merge.W.a
    public final String name() {
        return oZP.d("13001B2D03221C0110");
    }
}
