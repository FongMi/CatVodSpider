package com.github.catvod.spider.merge.A;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class b0 extends d0 implements Comparable {
    public final int b;

    public b0(int i) {
        this.b = i;
    }

    @Override // com.github.catvod.spider.merge.A.d0
    public final boolean c(com.github.catvod.spider.merge.z.u uVar, com.github.catvod.spider.merge.z.r rVar) {
        return uVar.b(this.b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.b - ((b0) obj).b;
    }

    @Override // com.github.catvod.spider.merge.A.d0
    public final d0 d(com.github.catvod.spider.merge.z.u uVar, com.github.catvod.spider.merge.z.r rVar) {
        if (uVar.b(this.b)) {
            return d0.a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            return this == obj || this.b == ((b0) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return 31 + this.b;
    }

    public final String toString() {
        return "{" + this.b + ">=prec}?";
    }
}
