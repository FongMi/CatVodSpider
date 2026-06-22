package com.github.catvod.spider.merge.z;

import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.oZP;
import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0297p extends X {
    public final X[] c;
    public final int[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0297p(X[] xArr, int[] iArr) {
        int iF = 1;
        for (X x : xArr) {
            iF = com.github.catvod.spider.merge.B.l.g(iF, x);
        }
        for (int i : iArr) {
            iF = com.github.catvod.spider.merge.B.l.f(iF, i);
        }
        super(com.github.catvod.spider.merge.B.l.b(iF, xArr.length * 2));
        this.c = xArr;
        this.d = iArr;
    }

    @Override // com.github.catvod.spider.merge.z.X
    public final X c(int i) {
        return this.c[i];
    }

    @Override // com.github.catvod.spider.merge.z.X
    public final int d(int i) {
        return this.d[i];
    }

    @Override // com.github.catvod.spider.merge.z.X
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0297p) || this.a != obj.hashCode()) {
            return false;
        }
        C0297p c0297p = (C0297p) obj;
        return Arrays.equals(this.d, c0297p.d) && Arrays.equals(this.c, c0297p.c);
    }

    @Override // com.github.catvod.spider.merge.z.X
    public final boolean f() {
        return this.d[0] == Integer.MAX_VALUE;
    }

    @Override // com.github.catvod.spider.merge.z.X
    public final int h() {
        return this.d.length;
    }

    public final String toString() {
        String strD;
        if (f()) {
            return oZP.d("2E32");
        }
        StringBuilder sbC = C0133t.c(oZP.d("2E"));
        for (int i = 0; i < this.d.length; i++) {
            if (i > 0) {
                sbC.append(oZP.d("594F"));
            }
            int[] iArr = this.d;
            if (iArr[i] == Integer.MAX_VALUE) {
                strD = oZP.d("51");
            } else {
                sbC.append(iArr[i]);
                if (this.c[i] != null) {
                    sbC.append(' ');
                    strD = this.c[i].toString();
                } else {
                    strD = oZP.d("1B1A1B2D");
                }
            }
            sbC.append(strD);
        }
        sbC.append(oZP.d("28"));
        return sbC.toString();
    }
}
