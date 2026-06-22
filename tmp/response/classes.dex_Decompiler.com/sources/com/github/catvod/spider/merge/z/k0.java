package com.github.catvod.spider.merge.z;

import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.oZP;
import com.github.catvod.spider.merge.y.AbstractC0248C;
import com.github.catvod.spider.merge.y.C0249D;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class k0 extends l0 {
    public final int b;
    public final int c;
    public final boolean d;

    protected k0() {
        this.b = -1;
        this.c = -1;
        this.d = false;
    }

    public k0(int i, int i2, boolean z) {
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    @Override // com.github.catvod.spider.merge.z.l0
    public final boolean c(AbstractC0248C<?, ?> abstractC0248C, C0249D c0249d) {
        abstractC0248C.getClass();
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        k0 k0Var = (k0) obj;
        return this.b == k0Var.b && this.c == k0Var.c && this.d == k0Var.d;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.B.l.b(com.github.catvod.spider.merge.B.l.f(com.github.catvod.spider.merge.B.l.f(com.github.catvod.spider.merge.B.l.f(0, this.b), this.c), this.d ? 1 : 0), 3);
    }

    public final String toString() {
        StringBuilder sbC = C0133t.c(oZP.d("0E"));
        sbC.append(this.b);
        sbC.append(oZP.d("4F"));
        sbC.append(this.c);
        sbC.append(oZP.d("0850"));
        return sbC.toString();
    }
}
