package com.github.catvod.spider.merge.FM.W;

import com.github.catvod.spider.merge.FM.M.C0274g;
import java.util.HashSet;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class f implements com.github.catvod.spider.merge.FM.V.a {
    @Override // com.github.catvod.spider.merge.FM.V.a
    public final com.github.catvod.spider.merge.FM.V.f a(C0274g c0274g) {
        HashSet hashSet = new HashSet();
        C0274g c0274g2 = new C0274g();
        for (com.github.catvod.spider.merge.FM.K.m mVar : c0274g) {
            C0274g c0274gZ = mVar.Z();
            c0274gZ.remove(mVar);
            hashSet.addAll(c0274gZ);
        }
        c0274g2.addAll(hashSet);
        return new com.github.catvod.spider.merge.FM.V.f(c0274g2);
    }

    @Override // com.github.catvod.spider.merge.FM.V.a
    public final String name() {
        return "descendant";
    }
}
