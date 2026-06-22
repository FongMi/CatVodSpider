package com.github.catvod.spider.merge.HR;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.HR.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0721d extends AbstractC0723f {
    C0721d(Collection<N> collection) {
        this.a.addAll(collection);
        b();
    }

    C0721d(N... nArr) {
        this(Arrays.asList(nArr));
    }

    @Override // com.github.catvod.spider.merge.HR.N
    public final boolean a(com.github.catvod.spider.merge.UY.m mVar, com.github.catvod.spider.merge.UY.m mVar2) {
        for (int i = this.b - 1; i >= 0; i--) {
            if (!this.a.get(i).a(mVar, mVar2)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return com.github.catvod.spider.merge.XU.n.f(this.a, "");
    }
}
