package com.github.catvod.spider.merge.C;

import com.github.catvod.spider.merge.A.C0003d;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class a implements Iterator {
    public final Object[] a;
    public int b = 0;
    public boolean c = true;
    public final /* synthetic */ C0003d d;

    public a(C0003d c0003d, Object[] objArr) {
        this.d = c0003d;
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
        int i = this.b;
        this.b = i + 1;
        return this.a[i];
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
