package com.github.catvod.spider.merge.C0.c0;

import com.github.catvod.spider.merge.C0.e0.O;
import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class q implements O {
    private final Appendable a;
    private final g b;

    q(Appendable appendable, g gVar) {
        this.a = appendable;
        this.b = gVar;
        gVar.e();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.github.catvod.spider.merge.C0.Z.a */
    @Override // com.github.catvod.spider.merge.C0.e0.O
    public final void a(r rVar, int i) throws com.github.catvod.spider.merge.C0.Z.a {
        try {
            rVar.w(this.a, i, this.b);
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.C0.Z.a(e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.github.catvod.spider.merge.C0.Z.a */
    @Override // com.github.catvod.spider.merge.C0.e0.O
    public final void b(r rVar, int i) throws com.github.catvod.spider.merge.C0.Z.a {
        if (rVar.t().equals("#text")) {
            return;
        }
        try {
            rVar.x(this.a, i, this.b);
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.C0.Z.a(e);
        }
    }
}
