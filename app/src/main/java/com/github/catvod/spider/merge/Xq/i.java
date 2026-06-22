package com.github.catvod.spider.merge.Xq;

import com.github.catvod.spider.merge.Bk.p;
import com.github.catvod.spider.merge.HR.C0724g;
import com.github.catvod.spider.merge.ZrJ;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class i implements com.github.catvod.spider.merge.Wb.a {
    @Override // com.github.catvod.spider.merge.Wb.a
    public final com.github.catvod.spider.merge.Wb.f a(C0724g c0724g) {
        LinkedList linkedList = new LinkedList();
        Iterator<com.github.catvod.spider.merge.UY.m> it = c0724g.iterator();
        while (it.hasNext()) {
            C0724g c0724gA = p.a(it.next());
            if (c0724gA != null) {
                linkedList.addAll(c0724gA);
            }
        }
        C0724g c0724g2 = new C0724g();
        c0724g2.addAll(linkedList);
        return new com.github.catvod.spider.merge.Wb.f(c0724g2);
    }

    @Override // com.github.catvod.spider.merge.Wb.a
    public final String name() {
        return ZrJ.d("1F2C27212732102D2C603B2C1B2F22232F");
    }
}
