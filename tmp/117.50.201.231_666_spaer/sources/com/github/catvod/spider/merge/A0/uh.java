package com.github.catvod.spider.merge.A0;

import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class uh implements Iterator, wi {
    public final Iterator a;
    public final /* synthetic */ acr b;

    public uh(acr acrVar) {
        this.b = acrVar;
        this.a = ((hp) acrVar.c).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.github.catvod.spider.merge.A0.qw, com.github.catvod.spider.merge.A0.zy] */
    @Override // java.util.Iterator
    public final Object next() {
        return this.b.b.invoke(this.a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
