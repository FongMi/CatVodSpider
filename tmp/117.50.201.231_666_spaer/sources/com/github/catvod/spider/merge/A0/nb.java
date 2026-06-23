package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class nb extends vf {
    public final int a;
    public final int b;
    public final boolean c;

    public nb() {
        this.a = -1;
        this.b = -1;
        this.c = false;
    }

    public nb(boolean z, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    @Override // com.github.catvod.spider.merge.A0.vf
    public final boolean d(wl wlVar, rf rfVar) {
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nb)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        nb nbVar = (nb) obj;
        return this.a == nbVar.a && this.b == nbVar.b && this.c == nbVar.c;
    }

    public final int hashCode() {
        return po.e(po.j(po.j(po.j(0, this.a), this.b), this.c ? 1 : 0), 3);
    }

    public final String toString() {
        return "{" + this.a + ":" + this.b + "}?";
    }
}
