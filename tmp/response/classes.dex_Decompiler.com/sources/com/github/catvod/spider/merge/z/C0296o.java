package com.github.catvod.spider.merge.z;

import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0296o extends t0 {
    public final int b;
    public final int c;

    public C0296o(AbstractC0294m abstractC0294m, int i, int i2) {
        super(abstractC0294m);
        this.b = i;
        this.c = i2;
    }

    @Override // com.github.catvod.spider.merge.z.t0
    public final int a() {
        return 6;
    }

    @Override // com.github.catvod.spider.merge.z.t0
    public final boolean d(int i, int i2) {
        return false;
    }

    public final String toString() {
        StringBuilder sbC = C0133t.c(oZP.d("140C0328033B2A"));
        sbC.append(this.b);
        sbC.append(oZP.d("4F"));
        sbC.append(this.c);
        return sbC.toString();
    }
}
