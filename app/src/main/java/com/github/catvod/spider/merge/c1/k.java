package com.github.catvod.spider.merge.c1;

import com.github.catvod.spider.merge.e1.O;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class k implements O {
    final /* synthetic */ StringBuilder a;

    k(StringBuilder sb) {
        this.a = sb;
    }

    @Override // com.github.catvod.spider.merge.e1.O
    public final void a(s sVar, int i) {
        if ((sVar instanceof m) && ((m) sVar).d0() && (sVar.r() instanceof v) && !v.N(this.a)) {
            this.a.append(' ');
        }
    }

    @Override // com.github.catvod.spider.merge.e1.O
    public final void b(s sVar, int i) {
        if (sVar instanceof v) {
            m.N(this.a, (v) sVar);
        } else if (sVar instanceof m) {
            m mVar = (m) sVar;
            if (this.a.length() > 0) {
                if ((mVar.d0() || mVar.e.j().equals("br")) && !v.N(this.a)) {
                    this.a.append(' ');
                }
            }
        }
    }
}
