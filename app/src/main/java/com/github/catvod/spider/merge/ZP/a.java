package com.github.catvod.spider.merge.ZP;

import com.github.catvod.spider.merge.UY.m;
import com.github.catvod.spider.merge.ZrJ;
import java.util.LinkedList;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class a implements com.github.catvod.spider.merge.Wb.d {
    @Override // com.github.catvod.spider.merge.Wb.d
    public final com.github.catvod.spider.merge.Wb.f a(com.github.catvod.spider.merge.Wb.e eVar) {
        LinkedList linkedList = new LinkedList();
        for (m mVar : eVar.a()) {
            linkedList.add(ZrJ.d("0A2039243831").equals(mVar.s()) ? mVar.X() : mVar.v0());
        }
        return new com.github.catvod.spider.merge.Wb.f(linkedList);
    }

    @Override // com.github.catvod.spider.merge.Wb.d
    public final String name() {
        return ZrJ.d("182F27192D3D0D");
    }
}
