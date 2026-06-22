package com.github.catvod.spider.merge.L;

import com.github.catvod.spider.merge.N.O;
import com.github.catvod.spider.merge.oZP;
import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class r implements O {
    private final Appendable a;
    private final g b;

    r(Appendable appendable, g gVar) {
        this.a = appendable;
        this.b = gVar;
        gVar.g();
    }

    @Override // com.github.catvod.spider.merge.N.O
    public final void a(s sVar, int i) {
        try {
            sVar.v(this.a, i, this.b);
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.I.a(e);
        }
    }

    @Override // com.github.catvod.spider.merge.N.O
    public final void b(s sVar, int i) {
        if (sVar.s().equals(oZP.d("561B123918"))) {
            return;
        }
        try {
            sVar.w(this.a, i, this.b);
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.I.a(e);
        }
    }
}
