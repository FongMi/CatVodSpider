package com.github.catvod.spider.merge.FM.M;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.M.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0271d extends AbstractC0273f {
    C0271d(Collection<N> collection) {
        this.a.addAll(collection);
        b();
    }

    C0271d(N... nArr) {
        this(Arrays.asList(nArr));
    }

    @Override // com.github.catvod.spider.merge.FM.M.N
    public final boolean a(com.github.catvod.spider.merge.FM.K.m mVar, com.github.catvod.spider.merge.FM.K.m mVar2) {
        for (int i = this.b - 1; i >= 0; i--) {
            if (!this.a.get(i).a(mVar, mVar2)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return com.github.catvod.spider.merge.FM.J.b.f(this.a, "");
    }
}
