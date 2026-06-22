package com.github.catvod.spider.merge.e1;

import com.github.catvod.spider.merge.b1.C0906c;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.e1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1034e extends AbstractC1035f {
    C1034e() {
    }

    C1034e(N... nArr) {
        List listAsList = Arrays.asList(nArr);
        if (this.b > 1) {
            this.a.add(new C1033d(listAsList));
        } else {
            this.a.addAll(listAsList);
        }
        b();
    }

    @Override // com.github.catvod.spider.merge.e1.N
    public final boolean a(com.github.catvod.spider.merge.c1.m mVar, com.github.catvod.spider.merge.c1.m mVar2) {
        for (int i = 0; i < this.b; i++) {
            if (this.a.get(i).a(mVar, mVar2)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return C0906c.f(this.a, ", ");
    }
}
