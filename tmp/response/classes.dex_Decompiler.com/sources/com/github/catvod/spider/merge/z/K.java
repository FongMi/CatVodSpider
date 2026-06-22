package com.github.catvod.spider.merge.z;

import com.github.catvod.spider.merge.oZP;
import java.util.EmptyStackException;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class K implements InterfaceC0277C {
    public static final K a = new K();

    private K() {
    }

    @Override // com.github.catvod.spider.merge.z.InterfaceC0277C
    public final boolean a() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.z.InterfaceC0277C
    public final void b(com.github.catvod.spider.merge.y.t tVar) {
        if (tVar.n.d()) {
            throw new EmptyStackException();
        }
        tVar.o = tVar.n.e(r0.f() - 1);
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.B.l.b(com.github.catvod.spider.merge.B.l.f(0, 4), 1);
    }

    public final String toString() {
        return oZP.d("0500070C033110");
    }
}
