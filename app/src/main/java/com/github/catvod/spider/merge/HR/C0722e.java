package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.ZrJ;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.HR.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0722e extends AbstractC0723f {
    C0722e() {
    }

    C0722e(N... nArr) {
        List listAsList = Arrays.asList(nArr);
        if (this.b > 1) {
            this.a.add(new C0721d(listAsList));
        } else {
            this.a.addAll(listAsList);
        }
        b();
    }

    @Override // com.github.catvod.spider.merge.HR.N
    public final boolean a(com.github.catvod.spider.merge.UY.m mVar, com.github.catvod.spider.merge.UY.m mVar2) {
        for (int i = 0; i < this.b; i++) {
            if (this.a.get(i).a(mVar, mVar2)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return com.github.catvod.spider.merge.XU.n.f(this.a, ZrJ.d("5563"));
    }
}
