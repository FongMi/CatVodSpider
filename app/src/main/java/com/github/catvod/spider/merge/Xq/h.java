package com.github.catvod.spider.merge.Xq;

import com.github.catvod.spider.merge.HR.C0724g;
import com.github.catvod.spider.merge.ZrJ;
import java.util.LinkedList;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class h implements com.github.catvod.spider.merge.Wb.a {
    @Override // com.github.catvod.spider.merge.Wb.a
    public final com.github.catvod.spider.merge.Wb.f a(C0724g c0724g) {
        LinkedList linkedList = new LinkedList();
        for (com.github.catvod.spider.merge.UY.m mVar : c0724g) {
            if (mVar.g0() != null) {
                linkedList.add(mVar.g0());
            }
        }
        C0724g c0724g2 = new C0724g();
        c0724g2.addAll(linkedList);
        return new com.github.catvod.spider.merge.Wb.f(c0724g2);
    }

    @Override // com.github.catvod.spider.merge.Wb.a
    public final String name() {
        return ZrJ.d("1F2C27212732102D2C603B2C1B2F22232F68162D2E");
    }
}
