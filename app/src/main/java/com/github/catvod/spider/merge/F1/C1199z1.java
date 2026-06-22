package com.github.catvod.spider.merge.f1;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1199z1 extends AbstractSet<Object> {
    final /* synthetic */ C1 b;

    C1199z1(C1 c1) {
        this.b = c1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Object> iterator() {
        return new C1196y1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b.size();
    }
}
