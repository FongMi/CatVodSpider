package com.github.catvod.spider.merge.Em;

import com.github.catvod.spider.merge.ej.O;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class j implements O {
    final /* synthetic */ StringBuilder a;

    j(StringBuilder sb) {
        this.a = sb;
    }

    @Override // com.github.catvod.spider.merge.ej.O
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

    @Override // com.github.catvod.spider.merge.ej.O
    public final void b(r rVar, int i) {
        if ((rVar instanceof l) && ((l) rVar).a0() && (rVar.s() instanceof u) && !u.M(this.a)) {
            this.a.append(' ');
        }
    }
}
