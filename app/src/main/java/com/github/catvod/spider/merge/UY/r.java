package com.github.catvod.spider.merge.UY;

import com.github.catvod.spider.merge.HR.O;
import com.github.catvod.spider.merge.ZrJ;
import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class r implements O {
    private final Appendable a;
    private final g b;

    r(Appendable appendable, g gVar) {
        this.a = appendable;
        this.b = gVar;
        gVar.g();
    }

    @Override // com.github.catvod.spider.merge.HR.O
    public final void a(s sVar, int i) {
        try {
            sVar.v(this.a, i, this.b);
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.XI.v(e);
        }
    }

    @Override // com.github.catvod.spider.merge.HR.O
    public final void b(s sVar, int i) {
        if (sVar.s().equals(ZrJ.d("5A372E353C"))) {
            return;
        }
        try {
            sVar.w(this.a, i, this.b);
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.XI.v(e);
        }
    }
}
