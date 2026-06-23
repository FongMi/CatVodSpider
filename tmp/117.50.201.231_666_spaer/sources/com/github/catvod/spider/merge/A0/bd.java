package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class bd {
    public static final bd[] a = new bd[1001];
    public int b;
    public int c;

    public bd(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public static bd d(int i, int i2) {
        if (i != i2 || i < 0 || i > 1000) {
            return new bd(i, i2);
        }
        bd[] bdVarArr = a;
        if (bdVarArr[i] == null) {
            bdVarArr[i] = new bd(i, i);
        }
        return bdVarArr[i];
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof bd)) {
            return false;
        }
        bd bdVar = (bd) obj;
        return this.b == bdVar.b && this.c == bdVar.c;
    }

    public final int hashCode() {
        return ((713 + this.b) * 31) + this.c;
    }

    public final String toString() {
        return this.b + ".." + this.c;
    }
}
