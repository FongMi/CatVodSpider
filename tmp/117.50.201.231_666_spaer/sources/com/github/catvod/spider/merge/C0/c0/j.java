package com.github.catvod.spider.merge.C0.c0;

import com.github.catvod.spider.merge.C0.e0.O;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class j implements O {
    final StringBuilder a;

    j(StringBuilder sb) {
        this.a = sb;
    }

    @Override // com.github.catvod.spider.merge.C0.e0.O
    public final void a(r rVar, int i) {
        if (rVar instanceof u) {
            l.N(this.a, (u) rVar);
        } else if (rVar instanceof l) {
            l lVar = (l) rVar;
            if (this.a.length() > 0) {
                if ((lVar.a0() || lVar.f.b().equals("br")) && !u.M(this.a)) {
                    this.a.append(' ');
                }
            }
        }
    }

    @Override // com.github.catvod.spider.merge.C0.e0.O
    public final void b(r rVar, int i) {
        if ((rVar instanceof l) && ((l) rVar).a0() && (rVar.s() instanceof u) && !u.M(this.a)) {
            this.a.append(' ');
        }
    }
}
