package com.github.catvod.spider.merge.ej;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ej.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1059e extends AbstractC1060f {
    C1059e() {
    }

    C1059e(N... nArr) {
        List listAsList = Arrays.asList(nArr);
        if (this.b > 1) {
            this.a.add(new C1058d(listAsList));
        } else {
            this.a.addAll(listAsList);
        }
        b();
    }

    @Override // com.github.catvod.spider.merge.ej.N
    public final boolean a(com.github.catvod.spider.merge.Em.l lVar, com.github.catvod.spider.merge.Em.l lVar2) {
        for (int i = 0; i < this.b; i++) {
            if (this.a.get(i).a(lVar, lVar2)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return com.github.catvod.spider.merge.Dw.e.e(this.a, ", ");
    }
}
