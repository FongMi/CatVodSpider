package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class mh implements r {
    public final int c;
    public final int d;

    public mh(int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    @Override // com.github.catvod.spider.merge.A0.r
    public final boolean a() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.A0.r
    public final void b(zc zcVar) {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mh)) {
            return false;
        }
        mh mhVar = (mh) obj;
        return this.c == mhVar.c && this.d == mhVar.d;
    }

    public final int hashCode() {
        return po.e(po.j(po.j(po.j(0, 1), this.c), this.d), 3);
    }
}
