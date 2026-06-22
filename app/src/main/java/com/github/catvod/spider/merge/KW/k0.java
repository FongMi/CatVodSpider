package com.github.catvod.spider.merge.KW;

import com.github.catvod.spider.merge.ZrJ;
import com.github.catvod.spider.merge.bY.C0925t;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
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

    @Override // com.github.catvod.spider.merge.KW.l0
    public final boolean c(com.github.catvod.spider.merge.yZ.C<?, ?> c, com.github.catvod.spider.merge.yZ.D d) {
        c.getClass();
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
        return com.github.catvod.spider.merge.Bk.l.b(com.github.catvod.spider.merge.Bk.l.f(com.github.catvod.spider.merge.Bk.l.f(com.github.catvod.spider.merge.Bk.l.f(0, this.b), this.c), this.d ? 1 : 0), 3);
    }

    public final String toString() {
        StringBuilder sbB = C0925t.b(ZrJ.d("02"));
        sbB.append(this.b);
        sbB.append(ZrJ.d("43"));
        sbB.append(this.c);
        sbB.append(ZrJ.d("047C"));
        return sbB.toString();
    }
}
