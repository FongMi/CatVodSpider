package com.github.catvod.spider.merge.A0;

import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ei implements hp {
    public final hp a;
    public final int b;

    public ei(hp hpVar, int i) {
        this.a = hpVar;
        this.b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // com.github.catvod.spider.merge.A0.hp
    public final Iterator iterator() {
        return new pe(this);
    }
}
