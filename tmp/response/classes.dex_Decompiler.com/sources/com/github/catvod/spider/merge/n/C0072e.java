package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.oZP;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.N.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0072e extends AbstractC0073f {
    C0072e() {
    }

    C0072e(N... nArr) {
        List listAsList = Arrays.asList(nArr);
        if (this.b > 1) {
            this.a.add(new C0071d(listAsList));
        } else {
            this.a.addAll(listAsList);
        }
        b();
    }

    @Override // com.github.catvod.spider.merge.N.N
    public final boolean a(com.github.catvod.spider.merge.L.m mVar, com.github.catvod.spider.merge.L.m mVar2) {
        for (int i = 0; i < this.b; i++) {
            if (this.a.get(i).a(mVar, mVar2)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return com.github.catvod.spider.merge.K.b.f(this.a, oZP.d("594F"));
    }
}
