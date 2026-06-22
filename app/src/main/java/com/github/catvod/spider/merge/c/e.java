package com.github.catvod.spider.merge.C;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class e {
    public static final e[] c = new e[1001];
    public int a;
    public int b;

    public e(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static e a(int i, int i2) {
        if (i != i2 || i < 0 || i > 1000) {
            return new e(i, i2);
        }
        e[] eVarArr = c;
        if (eVarArr[i] == null) {
            eVarArr[i] = new e(i, i);
        }
        return eVarArr[i];
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b;
    }

    public final int hashCode() {
        return ((713 + this.a) * 31) + this.b;
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
