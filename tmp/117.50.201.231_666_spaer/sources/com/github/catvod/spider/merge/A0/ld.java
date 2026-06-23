package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ld implements r {
    public final int c;

    public ld(int i) {
        this.c = i;
    }

    @Override // com.github.catvod.spider.merge.A0.r
    public final boolean a() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.A0.r
    public final void b(zc zcVar) {
        zcVar.n = this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ld) {
            return this.c == ((ld) obj).c;
        }
        return false;
    }

    public final int hashCode() {
        return po.e(po.j(po.j(0, 0), this.c), 2);
    }

    public final String toString() {
        return String.format("channel(%d)", Integer.valueOf(this.c));
    }
}
