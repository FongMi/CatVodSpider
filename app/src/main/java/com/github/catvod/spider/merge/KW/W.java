package com.github.catvod.spider.merge.KW;

import com.github.catvod.spider.merge.ZrJ;
import com.github.catvod.spider.merge.bY.C0925t;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class W extends AbstractC0826n {
    public final int b;
    public final int c;
    public final boolean d;

    public W(AbstractC0825m abstractC0825m, int i, int i2, boolean z) {
        super(abstractC0825m);
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    @Override // com.github.catvod.spider.merge.KW.t0
    public final int a() {
        return 4;
    }

    @Override // com.github.catvod.spider.merge.KW.t0
    public final boolean b() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.KW.t0
    public final boolean d(int i, int i2) {
        return false;
    }

    public final String toString() {
        StringBuilder sbB = C0925t.b(ZrJ.d("09312E2917"));
        sbB.append(this.b);
        sbB.append(ZrJ.d("43"));
        sbB.append(this.c);
        return sbB.toString();
    }
}
