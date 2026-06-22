package com.github.catvod.spider.merge.Xq;

import com.github.catvod.spider.merge.HR.C0724g;
import com.github.catvod.spider.merge.ZrJ;
import java.util.LinkedList;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class a implements com.github.catvod.spider.merge.Wb.a {
    @Override // com.github.catvod.spider.merge.Wb.a
    public final com.github.catvod.spider.merge.Wb.f a(C0724g c0724g) {
        LinkedList linkedList = new LinkedList();
        for (com.github.catvod.spider.merge.UY.m mVar : c0724g) {
            linkedList.addAll(mVar.l0());
            linkedList.add(mVar);
        }
        return new com.github.catvod.spider.merge.Wb.f(new C0724g(linkedList));
    }

    @Override // com.github.catvod.spider.merge.Wb.a
    public final String name() {
        return ZrJ.d("182D28283B31163166223A680A26272B");
    }
}
