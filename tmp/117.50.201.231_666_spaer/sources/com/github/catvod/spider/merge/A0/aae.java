package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class aae extends vf implements Comparable {
    public final int a;

    public aae(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.A0.vf
    public final vf b(wl wlVar, rf rfVar) {
        if (wlVar.p(this.a)) {
            return vf.e;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((aae) obj).a;
    }

    @Override // com.github.catvod.spider.merge.A0.vf
    public final boolean d(wl wlVar, rf rfVar) {
        return wlVar.p(this.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aae) {
            return this == obj || this.a == ((aae) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return 31 + this.a;
    }

    public final String toString() {
        return "{" + this.a + ">=prec}?";
    }
}
