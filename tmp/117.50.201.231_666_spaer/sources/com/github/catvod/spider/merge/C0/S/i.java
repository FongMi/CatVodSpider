package com.github.catvod.spider.merge.C0.S;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class i {
    static i[] c = new i[1001];
    public int a;
    public int b;

    public i(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static i b(int i, int i2) {
        if (i != i2 || i < 0 || i > 1000) {
            return new i(i, i2);
        }
        i[] iVarArr = c;
        if (iVarArr[i] == null) {
            iVarArr[i] = new i(i, i);
        }
        return iVarArr[i];
    }

    public final boolean a(i iVar) {
        int i = this.a;
        int i2 = iVar.a;
        if (!(i < i2 && this.b < i2)) {
            if (!(i > iVar.b)) {
                return false;
            }
        }
        return true;
    }

    public final i c(i iVar) {
        return b(Math.min(this.a, iVar.a), Math.max(this.b, iVar.b));
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a == iVar.a && this.b == iVar.b;
    }

    public final int hashCode() {
        return ((this.a + 713) * 31) + this.b;
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
