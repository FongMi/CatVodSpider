package com.github.catvod.spider.merge.Xq;

import com.github.catvod.spider.merge.Bk.p;
import com.github.catvod.spider.merge.HR.C0724g;
import com.github.catvod.spider.merge.ZrJ;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class g implements com.github.catvod.spider.merge.Wb.a {
    @Override // com.github.catvod.spider.merge.Wb.a
    public final com.github.catvod.spider.merge.Wb.f a(C0724g c0724g) {
        LinkedList linkedList = new LinkedList();
        for (com.github.catvod.spider.merge.UY.m mVar : c0724g) {
            Iterator<com.github.catvod.spider.merge.UY.m> it = mVar.l0().iterator();
            while (it.hasNext()) {
                C0724g c0724gA = p.a(it.next());
                if (c0724gA != null) {
                    Iterator<com.github.catvod.spider.merge.UY.m> it2 = c0724gA.iterator();
                    while (it2.hasNext()) {
                        linkedList.addAll(it2.next().Z());
                    }
                }
            }
            C0724g c0724gA2 = p.a(mVar);
            if (c0724gA2 != null) {
                Iterator<com.github.catvod.spider.merge.UY.m> it3 = c0724gA2.iterator();
                while (it3.hasNext()) {
                    linkedList.addAll(it3.next().Z());
                }
            }
        }
        return new com.github.catvod.spider.merge.Wb.f(new C0724g(linkedList));
    }

    @Override // com.github.catvod.spider.merge.Wb.a
    public final String name() {
        return ZrJ.d("1F2C27212732102D2C");
    }
}
