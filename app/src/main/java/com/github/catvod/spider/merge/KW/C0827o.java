package com.github.catvod.spider.merge.KW;

import com.github.catvod.spider.merge.ZrJ;
import com.github.catvod.spider.merge.bY.C0925t;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.KW.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0827o extends t0 {
    public final int b;
    public final int c;

    public C0827o(AbstractC0825m abstractC0825m, int i, int i2) {
        super(abstractC0825m);
        this.b = i;
        this.c = i2;
    }

    @Override // com.github.catvod.spider.merge.KW.t0
    public final int a() {
        return 6;
    }

    @Override // com.github.catvod.spider.merge.KW.t0
    public final boolean d(int i, int i2) {
        return false;
    }

    public final String toString() {
        StringBuilder sbB = C0925t.b(ZrJ.d("18203F24272B26"));
        sbB.append(this.b);
        sbB.append(ZrJ.d("43"));
        sbB.append(this.c);
        return sbB.toString();
    }
}
