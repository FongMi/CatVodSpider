package com.github.catvod.spider.merge.N;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.N.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0071d extends AbstractC0073f {
    C0071d(Collection<N> collection) {
        this.a.addAll(collection);
        b();
    }

    C0071d(N... nArr) {
        this(Arrays.asList(nArr));
    }

    @Override // com.github.catvod.spider.merge.N.N
    public final boolean a(com.github.catvod.spider.merge.L.m mVar, com.github.catvod.spider.merge.L.m mVar2) {
        for (int i = this.b - 1; i >= 0; i--) {
            if (!this.a.get(i).a(mVar, mVar2)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return com.github.catvod.spider.merge.K.b.f(this.a, "");
    }
}
