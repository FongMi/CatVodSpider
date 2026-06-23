package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class abi implements r {
    public final int c;
    public final r d;

    public abi(int i, r rVar) {
        this.c = i;
        this.d = rVar;
    }

    @Override // com.github.catvod.spider.merge.A0.r
    public final boolean a() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.A0.r
    public final void b(zc zcVar) {
        this.d.b(zcVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof abi)) {
            return false;
        }
        abi abiVar = (abi) obj;
        return this.c == abiVar.c && this.d.equals(abiVar.d);
    }

    public final int hashCode() {
        return po.e(po.k(po.j(0, this.c), this.d), 2);
    }
}
