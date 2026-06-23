package com.github.catvod.spider.merge.A0;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ro implements ListIterator, wi {
    public final an a;
    public int b;
    public int c = -1;
    public int d;

    public ro(an anVar, int i) {
        this.a = anVar;
        this.b = i;
        this.d = ((AbstractList) anVar).modCount;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        e();
        int i = this.b;
        this.b = i + 1;
        an anVar = this.a;
        anVar.add(i, obj);
        this.c = -1;
        this.d = ((AbstractList) anVar).modCount;
    }

    public final void e() {
        if (((AbstractList) this.a).modCount != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.d;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        e();
        int i = this.b;
        an anVar = this.a;
        if (i >= anVar.d) {
            throw new NoSuchElementException();
        }
        this.b = i + 1;
        this.c = i;
        return anVar.b[anVar.c + i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        e();
        int i = this.b;
        if (i <= 0) {
            throw new NoSuchElementException();
        }
        int i2 = i - 1;
        this.b = i2;
        this.c = i2;
        an anVar = this.a;
        return anVar.b[anVar.c + i2];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        e();
        int i = this.c;
        if (i == -1) {
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
        }
        an anVar = this.a;
        anVar.j(i);
        this.b = this.c;
        this.c = -1;
        this.d = ((AbstractList) anVar).modCount;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        e();
        int i = this.c;
        if (i == -1) {
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
        }
        this.a.set(i, obj);
    }
}
