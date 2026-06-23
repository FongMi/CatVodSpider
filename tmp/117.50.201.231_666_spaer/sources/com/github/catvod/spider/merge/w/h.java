package com.github.catvod.spider.merge.w;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class h {
    static h[] c = new h[1001];
    public int a;
    public int b;

    public h(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static h b(int i, int i2) {
        if (i != i2 || i < 0 || i > 1000) {
            return new h(i, i2);
        }
        h[] hVarArr = c;
        if (hVarArr[i] == null) {
            hVarArr[i] = new h(i, i);
        }
        return hVarArr[i];
    }

    public final boolean a(h hVar) {
        int i = this.a;
        int i2 = hVar.a;
        if (!(i < i2 && this.b < i2)) {
            if (!(i > hVar.b)) {
                return false;
            }
        }
        return true;
    }

    public final h c(h hVar) {
        return b(Math.min(this.a, hVar.a), Math.max(this.b, hVar.b));
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && this.b == hVar.b;
    }

    public final int hashCode() {
        return ((713 + this.a) * 31) + this.b;
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
