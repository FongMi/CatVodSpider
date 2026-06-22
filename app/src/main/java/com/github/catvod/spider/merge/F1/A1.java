package com.github.catvod.spider.merge.f1;

import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class A1 implements Iterator<Object> {
    Object[] b;
    Object c;
    int d = 0;
    final /* synthetic */ B1 e;

    A1(B1 b1) {
        this.e = b1;
        this.b = b1.b.o0(false, false);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d < this.b.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C1 c1 = this.e.b;
        Object[] objArr = this.b;
        int i = this.d;
        this.d = i + 1;
        Object obj = objArr[i];
        this.c = obj;
        return c1.get(obj);
    }

    @Override // java.util.Iterator
    public final void remove() {
        Object obj = this.c;
        if (obj == null) {
            throw new IllegalStateException();
        }
        this.e.b.remove(obj);
        this.c = null;
    }
}
