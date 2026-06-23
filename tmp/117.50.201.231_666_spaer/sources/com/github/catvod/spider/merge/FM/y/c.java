package com.github.catvod.spider.merge.FM.Y;

import com.github.catvod.spider.merge.FM.C.h;
import com.github.catvod.spider.merge.FM.K.m;
import com.github.catvod.spider.merge.FM.M.C0274g;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class c implements com.github.catvod.spider.merge.FM.V.d {
    @Override // com.github.catvod.spider.merge.FM.V.d
    public final com.github.catvod.spider.merge.FM.V.f a(com.github.catvod.spider.merge.FM.V.e eVar) {
        C0274g c0274g = new C0274g();
        for (m mVar : eVar.a()) {
            c0274g.addAll(mVar.V());
            String strJ0 = mVar.j0();
            if (h.d(strJ0)) {
                m mVar2 = new m("");
                mVar2.P(strJ0);
                c0274g.add(mVar2);
            }
        }
        return new com.github.catvod.spider.merge.FM.V.f(c0274g);
    }

    @Override // com.github.catvod.spider.merge.FM.V.d
    public final String name() {
        return "node";
    }
}
