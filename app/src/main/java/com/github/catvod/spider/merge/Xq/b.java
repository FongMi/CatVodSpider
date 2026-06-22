package com.github.catvod.spider.merge.Xq;

import com.github.catvod.spider.merge.HR.C0724g;
import com.github.catvod.spider.merge.ZrJ;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class b implements com.github.catvod.spider.merge.Wb.a {
    @Override // com.github.catvod.spider.merge.Wb.a
    public final com.github.catvod.spider.merge.Wb.f a(C0724g c0724g) {
        LinkedList linkedList = new LinkedList();
        Iterator<com.github.catvod.spider.merge.UY.m> it = c0724g.iterator();
        while (it.hasNext()) {
            linkedList.addAll(it.next().l0());
        }
        return new com.github.catvod.spider.merge.Wb.f(new C0724g(linkedList));
    }

    @Override // com.github.catvod.spider.merge.Wb.a
    public final String name() {
        return ZrJ.d("182D28283B311631");
    }
}
