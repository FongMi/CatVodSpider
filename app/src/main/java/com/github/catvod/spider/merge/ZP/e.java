package com.github.catvod.spider.merge.ZP;

import com.github.catvod.spider.merge.UY.m;
import com.github.catvod.spider.merge.ZrJ;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class e implements com.github.catvod.spider.merge.Wb.d {
    @Override // com.github.catvod.spider.merge.Wb.d
    public final com.github.catvod.spider.merge.Wb.f a(com.github.catvod.spider.merge.Wb.e eVar) {
        LinkedList linkedList = new LinkedList();
        Iterator<m> it = eVar.a().iterator();
        while (it.hasNext()) {
            linkedList.add(it.next().t());
        }
        return new com.github.catvod.spider.merge.Wb.f(linkedList);
    }

    @Override // com.github.catvod.spider.merge.Wb.d
    public final String name() {
        return ZrJ.d("16363F283A0D0D2E27");
    }
}
