package com.github.catvod.spider.merge.Em;

import com.github.catvod.spider.merge.ej.O;
import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class q implements O {
    private final Appendable a;
    private final g b;

    q(Appendable appendable, g gVar) {
        this.a = appendable;
        this.b = gVar;
        gVar.e();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.github.catvod.spider.merge.Dw.q, java.lang.Throwable] */
    @Override // com.github.catvod.spider.merge.ej.O
    public final void a(r rVar, int i) {
        try {
            rVar.w(this.a, i, this.b);
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.Dw.q(e);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.github.catvod.spider.merge.Dw.q, java.lang.Throwable] */
    @Override // com.github.catvod.spider.merge.ej.O
    public final void b(r rVar, int i) {
        if (rVar.t().equals("#text")) {
            return;
        }
        try {
            rVar.x(this.a, i, this.b);
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.Dw.q(e);
        }
    }
}
