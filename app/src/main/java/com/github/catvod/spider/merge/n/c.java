package com.github.catvod.spider.merge.N;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class c extends d {
    public c() {
    }

    @Override // com.github.catvod.spider.merge.N.o
    public final boolean a(com.github.catvod.spider.merge.L.l lVar, com.github.catvod.spider.merge.L.l lVar2) {
        for (int i = 0; i < this.b; i++) {
            if (((o) this.a.get(i)).a(lVar, lVar2)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return com.github.catvod.bean.b.f(this.a, ", ");
    }

    public c(o... oVarArr) {
        List listAsList = Arrays.asList(oVarArr);
        if (this.b > 1) {
            this.a.add(new b(listAsList));
        } else {
            this.a.addAll(listAsList);
        }
        this.b = this.a.size();
    }
}
