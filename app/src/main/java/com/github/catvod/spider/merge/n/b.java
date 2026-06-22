package com.github.catvod.spider.merge.N;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class b extends d {
    public b(Collection collection) {
        this.a.addAll(collection);
        this.b = this.a.size();
    }

    @Override // com.github.catvod.spider.merge.N.o
    public final boolean a(com.github.catvod.spider.merge.L.l lVar, com.github.catvod.spider.merge.L.l lVar2) {
        for (int i = this.b - 1; i >= 0; i--) {
            if (!((o) this.a.get(i)).a(lVar, lVar2)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return com.github.catvod.bean.b.f(this.a, "");
    }

    public b(o... oVarArr) {
        this(Arrays.asList(oVarArr));
    }
}
