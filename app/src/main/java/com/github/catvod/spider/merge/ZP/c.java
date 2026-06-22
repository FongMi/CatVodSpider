package com.github.catvod.spider.merge.ZP;

import com.github.catvod.spider.merge.HR.C0724g;
import com.github.catvod.spider.merge.UY.m;
import com.github.catvod.spider.merge.VE.h;
import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class c implements com.github.catvod.spider.merge.Wb.d {
    @Override // com.github.catvod.spider.merge.Wb.d
    public final com.github.catvod.spider.merge.Wb.f a(com.github.catvod.spider.merge.Wb.e eVar) {
        C0724g c0724g = new C0724g();
        for (m mVar : eVar.a()) {
            c0724g.addAll(mVar.V());
            String strJ0 = mVar.j0();
            if (h.d(strJ0)) {
                m mVar2 = new m("");
                mVar2.P(strJ0);
                c0724g.add(mVar2);
            }
        }
        return new com.github.catvod.spider.merge.Wb.f(c0724g);
    }

    @Override // com.github.catvod.spider.merge.Wb.d
    public final String name() {
        return ZrJ.d("172C2F28");
    }
}
