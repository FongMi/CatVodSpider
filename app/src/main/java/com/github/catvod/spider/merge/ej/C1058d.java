package com.github.catvod.spider.merge.ej;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ej.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1058d extends AbstractC1060f {
    C1058d(Collection<N> collection) {
        this.a.addAll(collection);
        b();
    }

    C1058d(N... nArr) {
        this(Arrays.asList(nArr));
    }

    @Override // com.github.catvod.spider.merge.ej.N
    public final boolean a(com.github.catvod.spider.merge.Em.l lVar, com.github.catvod.spider.merge.Em.l lVar2) {
        for (int i = this.b - 1; i >= 0; i--) {
            if (!this.a.get(i).a(lVar, lVar2)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return com.github.catvod.spider.merge.Dw.e.e(this.a, "");
    }
}
