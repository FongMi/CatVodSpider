package com.github.catvod.spider.merge.B;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class b implements Iterator<Object> {
    final Object[] a;
    int b = 0;
    boolean c = true;
    final /* synthetic */ c d;

    public b(c cVar, Object[] objArr) {
        this.d = cVar;
        this.a = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.c = false;
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return objArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.c) {
            throw new IllegalStateException();
        }
        this.d.remove(this.a[this.b - 1]);
        this.c = true;
    }
}
