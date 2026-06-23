package com.github.catvod.spider.merge.FM.y;

import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.y.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0474p extends X {
    public final X[] c;
    public final int[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0474p(X[] xArr, int[] iArr) {
        int i = 1;
        for (X x : xArr) {
            i = com.github.catvod.spider.merge.FM.A.l.j(i, x);
        }
        for (int i2 : iArr) {
            i = com.github.catvod.spider.merge.FM.A.l.i(i, i2);
        }
        super(com.github.catvod.spider.merge.FM.A.l.c(i, xArr.length * 2));
        this.c = xArr;
        this.d = iArr;
    }

    @Override // com.github.catvod.spider.merge.FM.y.X
    public final X c(int i) {
        return this.c[i];
    }

    @Override // com.github.catvod.spider.merge.FM.y.X
    public final int d(int i) {
        return this.d[i];
    }

    @Override // com.github.catvod.spider.merge.FM.y.X
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0474p) || this.a != obj.hashCode()) {
            return false;
        }
        C0474p c0474p = (C0474p) obj;
        return Arrays.equals(this.d, c0474p.d) && Arrays.equals(this.c, c0474p.c);
    }

    @Override // com.github.catvod.spider.merge.FM.y.X
    public final boolean f() {
        return this.d[0] == Integer.MAX_VALUE;
    }

    @Override // com.github.catvod.spider.merge.FM.y.X
    public final int h() {
        return this.d.length;
    }

    public final String toString() {
        String string;
        if (f()) {
            return "[]";
        }
        StringBuilder sbB = com.github.catvod.spider.merge.FM.L.P.b("[");
        for (int i = 0; i < this.d.length; i++) {
            if (i > 0) {
                sbB.append(", ");
            }
            int[] iArr = this.d;
            if (iArr[i] == Integer.MAX_VALUE) {
                string = "$";
            } else {
                sbB.append(iArr[i]);
                if (this.c[i] != null) {
                    sbB.append(' ');
                    string = this.c[i].toString();
                } else {
                    string = "null";
                }
            }
            sbB.append(string);
        }
        sbB.append("]");
        return sbB.toString();
    }
}
