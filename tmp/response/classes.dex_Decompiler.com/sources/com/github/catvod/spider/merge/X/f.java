package com.github.catvod.spider.merge.X;

import com.github.catvod.spider.merge.N.C0074g;
import com.github.catvod.spider.merge.oZP;
import java.util.HashSet;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class f implements com.github.catvod.spider.merge.W.a {
    @Override // com.github.catvod.spider.merge.W.a
    public final com.github.catvod.spider.merge.W.f a(C0074g c0074g) {
        HashSet hashSet = new HashSet();
        C0074g c0074g2 = new C0074g();
        for (com.github.catvod.spider.merge.L.m mVar : c0074g) {
            C0074g c0074gZ = mVar.Z();
            c0074gZ.remove(mVar);
            hashSet.addAll(c0074gZ);
        }
        c0074g2.addAll(hashSet);
        return new com.github.catvod.spider.merge.W.f(c0074g2);
    }

    @Override // com.github.catvod.spider.merge.W.a
    public final String name() {
        return oZP.d("110A0422093B110E1935");
    }
}
