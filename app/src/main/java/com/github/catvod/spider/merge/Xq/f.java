package com.github.catvod.spider.merge.Xq;

import com.github.catvod.spider.merge.HR.C0724g;
import com.github.catvod.spider.merge.ZrJ;
import java.util.HashSet;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class f implements com.github.catvod.spider.merge.Wb.a {
    @Override // com.github.catvod.spider.merge.Wb.a
    public final com.github.catvod.spider.merge.Wb.f a(C0724g c0724g) {
        HashSet hashSet = new HashSet();
        C0724g c0724g2 = new C0724g();
        for (com.github.catvod.spider.merge.UY.m mVar : c0724g) {
            C0724g c0724gZ = mVar.Z();
            c0724gZ.remove(mVar);
            hashSet.addAll(c0724gZ);
        }
        c0724g2.addAll(hashSet);
        return new com.github.catvod.spider.merge.Wb.f(c0724g2);
    }

    @Override // com.github.catvod.spider.merge.Wb.a
    public final String name() {
        return ZrJ.d("1D26382E2D2B1D222539");
    }
}
