package com.github.catvod.spider.merge.f1;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1192x0 implements ListIterator {
    int b;
    int c;
    final /* synthetic */ int d;
    final /* synthetic */ B0 e;

    C1192x0(B0 b0, int i, int i2) {
        this.e = b0;
        this.d = i2;
        this.b = i;
        this.c = b0.l;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.d;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        B0.q1(this.e, this.c);
        int i = this.b;
        if (i == this.d) {
            throw new NoSuchElementException();
        }
        B0 b0 = this.e;
        this.b = i + 1;
        return b0.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        B0.q1(this.e, this.c);
        int i = this.b;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        B0 b0 = this.e;
        int i2 = i - 1;
        this.b = i2;
        return b0.get(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
