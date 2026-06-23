package com.github.catvod.spider.merge.A0;

import java.util.Arrays;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class gk {
    public final r[] a;
    public final int b;

    public gk(r[] rVarArr) {
        this.a = rVarArr;
        int iK = 0;
        for (r rVar : rVarArr) {
            iK = po.k(iK, rVar);
        }
        this.b = po.e(iK, rVarArr.length);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gk)) {
            return false;
        }
        gk gkVar = (gk) obj;
        return this.b == gkVar.b && Arrays.equals(this.a, gkVar.a);
    }

    public final int hashCode() {
        return this.b;
    }
}
