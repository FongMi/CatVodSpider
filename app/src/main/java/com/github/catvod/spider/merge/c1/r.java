package com.github.catvod.spider.merge.c1;

import com.github.catvod.spider.merge.e1.O;
import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class r implements O {
    private final Appendable a;
    private final g b;

    r(Appendable appendable, g gVar) {
        this.a = appendable;
        this.b = gVar;
        gVar.h();
    }

    @Override // com.github.catvod.spider.merge.e1.O
    public final void a(s sVar, int i) {
        if (sVar.s().equals("#text")) {
            return;
        }
        try {
            sVar.w(this.a, i, this.b);
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.Z0.a(e);
        }
    }

    @Override // com.github.catvod.spider.merge.e1.O
    public final void b(s sVar, int i) {
        try {
            sVar.v(this.a, i, this.b);
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.Z0.a(e);
        }
    }
}
