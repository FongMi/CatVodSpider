package com.github.catvod.spider.merge.A0;

import java.util.Arrays;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class px extends xr {
    public final xr[] e;
    public final int[] f;

    public px(ga gaVar) {
        this(new xr[]{gaVar.e}, new int[]{gaVar.f});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public px(xr[] xrVarArr, int[] iArr) {
        int iJ = 1;
        for (xr xrVar : xrVarArr) {
            iJ = po.k(iJ, xrVar);
        }
        for (int i : iArr) {
            iJ = po.j(iJ, i);
        }
        super(po.e(iJ, xrVarArr.length * 2));
        this.e = xrVarArr;
        this.f = iArr;
    }

    @Override // com.github.catvod.spider.merge.A0.xr
    public final xr a(int i) {
        return this.e[i];
    }

    @Override // com.github.catvod.spider.merge.A0.xr
    public final int b(int i) {
        return this.f[i];
    }

    @Override // com.github.catvod.spider.merge.A0.xr
    public final boolean c() {
        return this.f[0] == Integer.MAX_VALUE;
    }

    @Override // com.github.catvod.spider.merge.A0.xr
    public final int d() {
        return this.f.length;
    }

    @Override // com.github.catvod.spider.merge.A0.xr
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof px)) {
            return false;
        }
        if (this.i != ((xr) obj).i) {
            return false;
        }
        px pxVar = (px) obj;
        return Arrays.equals(this.f, pxVar.f) && Arrays.equals(this.e, pxVar.e);
    }

    public final String toString() {
        if (c()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            int[] iArr = this.f;
            if (i >= iArr.length) {
                sb.append("]");
                return sb.toString();
            }
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = iArr[i];
            if (i2 == Integer.MAX_VALUE) {
                sb.append("$");
            } else {
                sb.append(i2);
                xr[] xrVarArr = this.e;
                if (xrVarArr[i] != null) {
                    sb.append(' ');
                    sb.append(xrVarArr[i].toString());
                } else {
                    sb.append("null");
                }
            }
            i++;
        }
    }
}
