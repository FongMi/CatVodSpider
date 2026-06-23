package com.github.catvod.spider.merge.FM.K;

import com.github.catvod.spider.merge.FM.M.O;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class k implements O {
    final /* synthetic */ StringBuilder a;

    k(StringBuilder sb) {
        this.a = sb;
    }

    @Override // com.github.catvod.spider.merge.FM.M.O
    public final void a(s sVar, int i) {
        if ((sVar instanceof m) && ((m) sVar).f0() && (sVar.r() instanceof v) && !v.N(this.a)) {
            this.a.append(' ');
        }
    }

    @Override // com.github.catvod.spider.merge.FM.M.O
    public final void b(s sVar, int i) {
        if (sVar instanceof v) {
            m.O(this.a, (v) sVar);
        } else if (sVar instanceof m) {
            m mVar = (m) sVar;
            if (this.a.length() > 0) {
                if ((mVar.f0() || mVar.d.j().equals("br")) && !v.N(this.a)) {
                    this.a.append(' ');
                }
            }
        }
    }
}
