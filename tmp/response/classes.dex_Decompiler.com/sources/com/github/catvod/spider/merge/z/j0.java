package com.github.catvod.spider.merge.z;

import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.oZP;
import com.github.catvod.spider.merge.y.AbstractC0248C;
import com.github.catvod.spider.merge.y.C0249D;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class j0 extends l0 implements Comparable<j0> {
    public final int b;

    protected j0() {
        this.b = 0;
    }

    public j0(int i) {
        this.b = i;
    }

    @Override // com.github.catvod.spider.merge.z.l0
    public final boolean c(AbstractC0248C<?, ?> abstractC0248C, C0249D c0249d) {
        return abstractC0248C.h(this.b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(j0 j0Var) {
        return this.b - j0Var.b;
    }

    @Override // com.github.catvod.spider.merge.z.l0
    public final l0 d(AbstractC0248C<?, ?> abstractC0248C, C0249D c0249d) {
        if (abstractC0248C.h(this.b)) {
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
        StringBuilder sbC = C0133t.c(oZP.d("0E"));
        sbC.append(this.b);
        sbC.append(oZP.d("4B52073309360850"));
        return sbC.toString();
    }
}
