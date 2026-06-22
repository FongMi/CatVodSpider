package com.github.catvod.spider.merge.f1;

import java.util.AbstractCollection;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class B1 extends AbstractCollection<Object> {
    final /* synthetic */ C1 b;

    B1(C1 c1) {
        this.b = c1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new A1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.b.size();
    }
}
