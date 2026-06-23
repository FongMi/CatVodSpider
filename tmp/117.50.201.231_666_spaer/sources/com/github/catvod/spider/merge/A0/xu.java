package com.github.catvod.spider.merge.A0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class xu implements Iterator {
    public adi a;
    public adi b = null;
    public int c;
    public final /* synthetic */ my d;
    public final /* synthetic */ int e;

    public xu(my myVar, int i) {
        this.e = i;
        this.d = myVar;
        this.a = myVar.g.d;
        this.c = myVar.f;
    }

    public final Object f() {
        return g();
    }

    public final adi g() {
        adi adiVar = this.a;
        my myVar = this.d;
        if (adiVar == myVar.g) {
            throw new NoSuchElementException();
        }
        if (myVar.f != this.c) {
            throw new ConcurrentModificationException();
        }
        this.a = adiVar.d;
        this.b = adiVar;
        return adiVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a != this.d.g;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.e) {
            case 1:
                return g().f;
            default:
                return f();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        adi adiVar = this.b;
        if (adiVar == null) {
            throw new IllegalStateException();
        }
        my myVar = this.d;
        myVar.l(adiVar, true);
        this.b = null;
        this.c = myVar.f;
    }
}
