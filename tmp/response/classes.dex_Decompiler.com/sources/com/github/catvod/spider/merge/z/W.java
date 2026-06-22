package com.github.catvod.spider.merge.z;

import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class W extends AbstractC0295n {
    public final int b;
    public final int c;
    public final boolean d;

    public W(AbstractC0294m abstractC0294m, int i, int i2, boolean z) {
        super(abstractC0294m);
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    @Override // com.github.catvod.spider.merge.z.t0
    public final int a() {
        return 4;
    }

    @Override // com.github.catvod.spider.merge.z.t0
    public final boolean b() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.z.t0
    public final boolean d(int i, int i2) {
        return false;
    }

    public final String toString() {
        StringBuilder sbC = C0133t.c(oZP.d("051D122533"));
        sbC.append(this.b);
        sbC.append(oZP.d("4F"));
        sbC.append(this.c);
        return sbC.toString();
    }
}
