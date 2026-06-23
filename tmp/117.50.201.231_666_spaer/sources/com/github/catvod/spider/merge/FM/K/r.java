package com.github.catvod.spider.merge.FM.K;

import com.github.catvod.spider.merge.FM.M.O;
import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class r implements O {
    private final Appendable a;
    private final g b;

    r(Appendable appendable, g gVar) {
        this.a = appendable;
        this.b = gVar;
        gVar.g();
    }

    @Override // com.github.catvod.spider.merge.FM.M.O
    public final void a(s sVar, int i) {
        if (sVar.s().equals("#text")) {
            return;
        }
        try {
            sVar.w(this.a, i, this.b);
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.FM.H.a(e);
        }
    }

    @Override // com.github.catvod.spider.merge.FM.M.O
    public final void b(s sVar, int i) {
        try {
            sVar.v(this.a, i, this.b);
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.FM.H.a(e);
        }
    }
}
