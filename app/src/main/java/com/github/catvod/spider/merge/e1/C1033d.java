package com.github.catvod.spider.merge.e1;

import com.github.catvod.spider.merge.b1.C0906c;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.e1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1033d extends AbstractC1035f {
    C1033d(Collection<N> collection) {
        this.a.addAll(collection);
        b();
    }

    C1033d(N... nArr) {
        this(Arrays.asList(nArr));
    }

    @Override // com.github.catvod.spider.merge.e1.N
    public final boolean a(com.github.catvod.spider.merge.c1.m mVar, com.github.catvod.spider.merge.c1.m mVar2) {
        for (int i = this.b - 1; i >= 0; i--) {
            if (!this.a.get(i).a(mVar, mVar2)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return C0906c.f(this.a, "");
    }
}
