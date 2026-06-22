package com.github.catvod.spider.merge.KW;

import com.github.catvod.spider.merge.ZrJ;
import java.util.EmptyStackException;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class K implements C {
    public static final K a = new K();

    private K() {
    }

    @Override // com.github.catvod.spider.merge.KW.C
    public final boolean a() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.KW.C
    public final void b(com.github.catvod.spider.merge.yZ.t tVar) {
        if (tVar.n.d()) {
            throw new EmptyStackException();
        }
        tVar.o = tVar.n.e(r0.f() - 1);
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.Bk.l.b(com.github.catvod.spider.merge.Bk.l.f(0, 4), 1);
    }

    public final String toString() {
        return ZrJ.d("092C3B0027211C");
    }
}
