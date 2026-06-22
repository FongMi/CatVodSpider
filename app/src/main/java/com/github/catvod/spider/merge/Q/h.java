package com.github.catvod.spider.merge.q;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class h<T> implements Iterator<T> {
    final int b;
    int c;
    int d;
    boolean e = false;
    final /* synthetic */ m f;

    h(m mVar, int i) {
        this.f = mVar;
        this.b = i;
        this.c = mVar.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d < this.c;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T t = (T) this.f.b(this.d, this.b);
        this.d++;
        this.e = true;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.e) {
            throw new IllegalStateException();
        }
        int i = this.d - 1;
        this.d = i;
        this.c--;
        this.e = false;
        this.f.h(i);
    }
}
