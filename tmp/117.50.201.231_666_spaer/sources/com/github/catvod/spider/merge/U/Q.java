package com.github.catvod.spider.merge.u;

import com.github.catvod.spider.merge.a.C0529a;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class Q extends AbstractC0641j {
    public final int b;
    public final int c;
    public final boolean d;

    public Q(AbstractC0640i abstractC0640i, int i, int i2, boolean z) {
        super(abstractC0640i);
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    @Override // com.github.catvod.spider.merge.u.i0
    public final int a() {
        return 4;
    }

    @Override // com.github.catvod.spider.merge.u.i0
    public final boolean b() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.u.i0
    public final boolean d(int i, int i2) {
        return false;
    }

    public final String toString() {
        StringBuilder sbA = C0529a.a("pred_");
        sbA.append(this.b);
        sbA.append(":");
        sbA.append(this.c);
        return sbA.toString();
    }
}
