package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class aq implements r {
    public final int c;

    public aq(int i) {
        this.c = i;
    }

    @Override // com.github.catvod.spider.merge.A0.r
    public final boolean a() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.A0.r
    public final void b(zc zcVar) {
        zcVar.p.d(zcVar.u);
        zcVar.u = this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aq) {
            return this.c == ((aq) obj).c;
        }
        return false;
    }

    public final int hashCode() {
        return po.e(po.j(po.j(0, 5), this.c), 2);
    }

    public final String toString() {
        return String.format("pushMode(%d)", Integer.valueOf(this.c));
    }
}
