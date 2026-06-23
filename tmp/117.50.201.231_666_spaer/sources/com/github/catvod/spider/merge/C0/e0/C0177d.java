package com.github.catvod.spider.merge.C0.e0;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.e0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class C0177d extends AbstractC0179f {
    C0177d(Collection<N> collection) {
        this.a.addAll(collection);
        b();
    }

    C0177d(N... nArr) {
        this(Arrays.asList(nArr));
    }

    @Override // com.github.catvod.spider.merge.C0.e0.N
    public final boolean a(com.github.catvod.spider.merge.C0.c0.l lVar, com.github.catvod.spider.merge.C0.c0.l lVar2) {
        for (int i = this.b - 1; i >= 0; i--) {
            if (!this.a.get(i).a(lVar, lVar2)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return com.github.catvod.spider.merge.C0.b0.b.e(this.a, "");
    }
}
