package com.github.catvod.spider.merge.A0;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class wx implements hp {
    public final AtomicReference a;

    public wx(td tdVar) {
        this.a = new AtomicReference(tdVar);
    }

    @Override // com.github.catvod.spider.merge.A0.hp
    public final Iterator iterator() {
        hp hpVar = (hp) this.a.getAndSet(null);
        if (hpVar != null) {
            return hpVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
