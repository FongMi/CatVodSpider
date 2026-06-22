package com.github.catvod.spider.merge.KW;

import com.github.catvod.spider.merge.ZrJ;
import com.github.catvod.spider.merge.bY.C0925t;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class j0 extends l0 implements Comparable<j0> {
    public final int b;

    protected j0() {
        this.b = 0;
    }

    public j0(int i) {
        this.b = i;
    }

    @Override // com.github.catvod.spider.merge.KW.l0
    public final boolean c(com.github.catvod.spider.merge.yZ.C<?, ?> c, com.github.catvod.spider.merge.yZ.D d) {
        return c.h(this.b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(j0 j0Var) {
        return this.b - j0Var.b;
    }

    @Override // com.github.catvod.spider.merge.KW.l0
    public final l0 d(com.github.catvod.spider.merge.yZ.C<?, ?> c, com.github.catvod.spider.merge.yZ.D d) {
        if (c.h(this.b)) {
            return l0.a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j0) {
            return this == obj || this.b == ((j0) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return 31 + this.b;
    }

    public final String toString() {
        StringBuilder sbB = C0925t.b(ZrJ.d("02"));
        sbB.append(this.b);
        sbB.append(ZrJ.d("477E3B3F2D26047C"));
        return sbB.toString();
    }
}
