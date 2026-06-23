package com.github.catvod.spider.merge.FM.y;

import com.github.catvod.spider.merge.FM.x.AbstractC0425C;
import com.github.catvod.spider.merge.FM.x.C0426D;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class j0 extends l0 implements Comparable<j0> {
    public final int b;

    protected j0() {
        this.b = 0;
    }

    public j0(int i) {
        this.b = i;
    }

    @Override // com.github.catvod.spider.merge.FM.y.l0
    public final boolean c(AbstractC0425C<?, ?> abstractC0425C, C0426D c0426d) {
        return abstractC0425C.h(this.b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(j0 j0Var) {
        return this.b - j0Var.b;
    }

    @Override // com.github.catvod.spider.merge.FM.y.l0
    public final l0 d(AbstractC0425C<?, ?> abstractC0425C, C0426D c0426d) {
        if (abstractC0425C.h(this.b)) {
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
        StringBuilder sbB = com.github.catvod.spider.merge.FM.L.P.b("{");
        sbB.append(this.b);
        sbB.append(">=prec}?");
        return sbB.toString();
    }
}
