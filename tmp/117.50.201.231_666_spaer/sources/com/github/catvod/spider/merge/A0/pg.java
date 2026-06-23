package com.github.catvod.spider.merge.A0;

import java.util.RandomAccess;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class pg extends ph implements RandomAccess {
    public final ph a;
    public final int b;
    public final int c;

    public pg(ph phVar, int i, int i2) {
        this.a = phVar;
        this.b = i;
        pd pdVar = ph.Companion;
        int size = phVar.size();
        pdVar.getClass();
        pd.c(i, i2, size);
        this.c = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        pd pdVar = ph.Companion;
        int i2 = this.c;
        pdVar.getClass();
        pd.a(i, i2);
        return this.a.get(this.b + i);
    }

    @Override // com.github.catvod.spider.merge.A0.pa
    public final int getSize() {
        return this.c;
    }
}
