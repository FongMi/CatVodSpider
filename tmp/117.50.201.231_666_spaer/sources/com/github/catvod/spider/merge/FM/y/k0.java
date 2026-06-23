package com.github.catvod.spider.merge.FM.y;

import com.github.catvod.spider.merge.FM.x.AbstractC0425C;
import com.github.catvod.spider.merge.FM.x.C0426D;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
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

    @Override // com.github.catvod.spider.merge.FM.y.l0
    public final boolean c(AbstractC0425C<?, ?> abstractC0425C, C0426D c0426d) {
        abstractC0425C.getClass();
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
        return com.github.catvod.spider.merge.FM.A.l.c(com.github.catvod.spider.merge.FM.A.l.i(com.github.catvod.spider.merge.FM.A.l.i(com.github.catvod.spider.merge.FM.A.l.i(0, this.b), this.c), this.d ? 1 : 0), 3);
    }

    public final String toString() {
        StringBuilder sbB = com.github.catvod.spider.merge.FM.L.P.b("{");
        sbB.append(this.b);
        sbB.append(":");
        sbB.append(this.c);
        sbB.append("}?");
        return sbB.toString();
    }
}
