package com.github.catvod.spider.merge.FM.A;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class j {
    static j[] c = new j[1001];
    public int a;
    public int b;

    public j(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static j b(int i, int i2) {
        if (i != i2 || i < 0 || i > 1000) {
            return new j(i, i2);
        }
        j[] jVarArr = c;
        if (jVarArr[i] == null) {
            jVarArr[i] = new j(i, i);
        }
        return jVarArr[i];
    }

    public final boolean a(j jVar) {
        int i = this.a;
        int i2 = jVar.a;
        if (!(i < i2 && this.b < i2)) {
            if (!(i > jVar.b)) {
                return false;
            }
        }
        return true;
    }

    public final j c(j jVar) {
        return b(Math.min(this.a, jVar.a), Math.max(this.b, jVar.b));
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a == jVar.a && this.b == jVar.b;
    }

    public final int hashCode() {
        return ((713 + this.a) * 31) + this.b;
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
