package com.github.catvod.spider.merge.C0.e0;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.e0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class C0178e extends AbstractC0179f {
    C0178e() {
    }

    C0178e(N... nArr) {
        List listAsList = Arrays.asList(nArr);
        if (this.b > 1) {
            this.a.add(new C0177d(listAsList));
        } else {
            this.a.addAll(listAsList);
        }
        b();
    }

    @Override // com.github.catvod.spider.merge.C0.e0.N
    public final boolean a(com.github.catvod.spider.merge.C0.c0.l lVar, com.github.catvod.spider.merge.C0.c0.l lVar2) {
        for (int i = 0; i < this.b; i++) {
            if (this.a.get(i).a(lVar, lVar2)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return com.github.catvod.spider.merge.C0.b0.b.e(this.a, ", ");
    }
}
