package com.github.catvod.spider.merge.A0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import okio.Path;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class uk extends bs implements Iterator, xl, wi {
    public int a;
    public Path b;
    public xl c;

    public final RuntimeException d() {
        int i = this.a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.a);
    }

    @Override // com.github.catvod.spider.merge.A0.xl
    public final yg getContext() {
        return ek.a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.a;
            if (i != 0) {
                break;
            }
            this.a = 5;
            xl xlVar = this.c;
            ko.c(xlVar);
            this.c = null;
            xlVar.resumeWith(jo.i);
        }
        if (i == 1) {
            ko.c(null);
            throw null;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw d();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.a = 1;
            ko.c(null);
            throw null;
        }
        if (i != 3) {
            throw d();
        }
        this.a = 0;
        Path path = this.b;
        this.b = null;
        return path;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // com.github.catvod.spider.merge.A0.xl
    public final void resumeWith(Object obj) throws Throwable {
        act.c(obj);
        this.a = 4;
    }
}
