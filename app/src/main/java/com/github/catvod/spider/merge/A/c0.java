package com.github.catvod.spider.merge.A;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class c0 extends d0 {
    public final int b;
    public final int c;
    public final boolean d;

    public c0() {
        this.b = -1;
        this.c = -1;
        this.d = false;
    }

    @Override // com.github.catvod.spider.merge.A.d0
    public final boolean c(com.github.catvod.spider.merge.z.u uVar, com.github.catvod.spider.merge.z.r rVar) {
        uVar.getClass();
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        c0 c0Var = (c0) obj;
        return this.b == c0Var.b && this.c == c0Var.c && this.d == c0Var.d;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.R.a.a(com.github.catvod.spider.merge.R.a.b(com.github.catvod.spider.merge.R.a.b(com.github.catvod.spider.merge.R.a.b(0, this.b), this.c), this.d ? 1 : 0), 3);
    }

    public final String toString() {
        return "{" + this.b + ":" + this.c + "}?";
    }

    public c0(int i, int i2, boolean z) {
        this.b = i;
        this.c = i2;
        this.d = z;
    }
}
