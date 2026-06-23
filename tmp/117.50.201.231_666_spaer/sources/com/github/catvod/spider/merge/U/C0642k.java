package com.github.catvod.spider.merge.u;

import com.github.catvod.spider.merge.a.C0529a;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.u.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0642k extends i0 {
    public final int b;
    public final int c;

    public C0642k(AbstractC0640i abstractC0640i, int i, int i2) {
        super(abstractC0640i);
        this.b = i;
        this.c = i2;
    }

    @Override // com.github.catvod.spider.merge.u.i0
    public final int a() {
        return 6;
    }

    @Override // com.github.catvod.spider.merge.u.i0
    public final boolean d(int i, int i2) {
        return false;
    }

    public final String toString() {
        StringBuilder sbA = C0529a.a("action_");
        sbA.append(this.b);
        sbA.append(":");
        sbA.append(this.c);
        return sbA.toString();
    }
}
