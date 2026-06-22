package com.github.catvod.spider.merge.KW;

import com.github.catvod.spider.merge.ZrJ;
import com.github.catvod.spider.merge.bY.C0925t;
import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.KW.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0828p extends X {
    public final X[] c;
    public final int[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0828p(X[] xArr, int[] iArr) {
        int iF = 1;
        for (X x : xArr) {
            iF = com.github.catvod.spider.merge.Bk.l.g(iF, x);
        }
        for (int i : iArr) {
            iF = com.github.catvod.spider.merge.Bk.l.f(iF, i);
        }
        super(com.github.catvod.spider.merge.Bk.l.b(iF, xArr.length * 2));
        this.c = xArr;
        this.d = iArr;
    }

    @Override // com.github.catvod.spider.merge.KW.X
    public final X c(int i) {
        return this.c[i];
    }

    @Override // com.github.catvod.spider.merge.KW.X
    public final int d(int i) {
        return this.d[i];
    }

    @Override // com.github.catvod.spider.merge.KW.X
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0828p) || this.a != obj.hashCode()) {
            return false;
        }
        C0828p c0828p = (C0828p) obj;
        return Arrays.equals(this.d, c0828p.d) && Arrays.equals(this.c, c0828p.c);
    }

    @Override // com.github.catvod.spider.merge.KW.X
    public final boolean f() {
        return this.d[0] == Integer.MAX_VALUE;
    }

    @Override // com.github.catvod.spider.merge.KW.X
    public final int h() {
        return this.d.length;
    }

    public final String toString() {
        String strD;
        if (f()) {
            return ZrJ.d("221E");
        }
        StringBuilder sbB = C0925t.b(ZrJ.d("22"));
        for (int i = 0; i < this.d.length; i++) {
            if (i > 0) {
                sbB.append(ZrJ.d("5563"));
            }
            int[] iArr = this.d;
            if (iArr[i] == Integer.MAX_VALUE) {
                strD = ZrJ.d("5D");
            } else {
                sbB.append(iArr[i]);
                if (this.c[i] != null) {
                    sbB.append(' ');
                    strD = this.c[i].toString();
                } else {
                    strD = ZrJ.d("17362721");
                }
            }
            sbB.append(strD);
        }
        sbB.append(ZrJ.d("24"));
        return sbB.toString();
    }
}
