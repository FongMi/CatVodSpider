package com.github.catvod.spider.merge.UY;

import com.github.catvod.spider.merge.HR.O;
import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class k implements O {
    final /* synthetic */ StringBuilder a;

    k(StringBuilder sb) {
        this.a = sb;
    }

    @Override // com.github.catvod.spider.merge.HR.O
    public final void a(s sVar, int i) {
        if (sVar instanceof v) {
            m.O(this.a, (v) sVar);
        } else if (sVar instanceof m) {
            m mVar = (m) sVar;
            if (this.a.length() > 0) {
                if ((mVar.f0() || mVar.d.j().equals(ZrJ.d("1B31"))) && !v.N(this.a)) {
                    this.a.append(' ');
                }
            }
        }
    }

    @Override // com.github.catvod.spider.merge.HR.O
    public final void b(s sVar, int i) {
        if ((sVar instanceof m) && ((m) sVar).f0() && (sVar.r() instanceof v) && !v.N(this.a)) {
            this.a.append(' ');
        }
    }
}
