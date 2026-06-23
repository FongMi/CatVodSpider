package com.github.catvod.spider.merge.A0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class qg implements Iterator {
    public int a;
    public int b = 0;
    public final /* synthetic */ qh c;

    public qg(qh qhVar) {
        this.c = qhVar;
        this.a = qhVar.a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        qh qhVar = this.c;
        if (qhVar.a != this.a) {
            throw new ConcurrentModificationException("Use Iterator#remove() instead to remove attributes while iterating.");
        }
        while (true) {
            int i = this.b;
            if (i >= qhVar.a || !qh.d(qhVar.b[i])) {
                break;
            }
            this.b++;
        }
        return this.b < qhVar.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        qh qhVar = this.c;
        int i = qhVar.a;
        if (i != this.a) {
            throw new ConcurrentModificationException("Use Iterator#remove() instead to remove attributes while iterating.");
        }
        int i2 = this.b;
        if (i2 >= i) {
            throw new NoSuchElementException();
        }
        qe qeVar = new qe(qhVar.b[i2], (String) qhVar.c[this.b], qhVar);
        this.b++;
        return qeVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.b - 1;
        this.b = i;
        this.c.o(i);
        this.a--;
    }
}
