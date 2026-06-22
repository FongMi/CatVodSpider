package com.github.catvod.spider.merge.Z;

import com.github.catvod.spider.merge.D.h;
import com.github.catvod.spider.merge.L.m;
import com.github.catvod.spider.merge.N.C0074g;
import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class c implements com.github.catvod.spider.merge.W.d {
    @Override // com.github.catvod.spider.merge.W.d
    public final com.github.catvod.spider.merge.W.f a(com.github.catvod.spider.merge.W.e eVar) {
        C0074g c0074g = new C0074g();
        for (m mVar : eVar.a()) {
            c0074g.addAll(mVar.V());
            String strJ0 = mVar.j0();
            if (h.d(strJ0)) {
                m mVar2 = new m("");
                mVar2.P(strJ0);
                c0074g.add(mVar2);
            }
        }
        return new com.github.catvod.spider.merge.W.f(c0074g);
    }

    @Override // com.github.catvod.spider.merge.W.d
    public final String name() {
        return oZP.d("1B001324");
    }
}
