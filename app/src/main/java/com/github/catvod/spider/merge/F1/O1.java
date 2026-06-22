package com.github.catvod.spider.merge.f1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class O1 implements Iterator<Q1> {
    private Q1 b;
    private Q1 c = Q1.h;
    private Q1 d;
    final /* synthetic */ Q1 e;

    public O1(Q1 q1) {
        this.e = q1;
        this.b = q1.d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final Q1 next() {
        Q1 q1 = this.b;
        if (q1 == null) {
            throw new NoSuchElementException();
        }
        this.d = this.c;
        this.c = q1;
        this.b = q1.c;
        return q1;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.c == Q1.h) {
            throw new IllegalStateException("next() has not been called");
        }
        Q1 q1 = this.c;
        Q1 q12 = this.e;
        if (q1 == q12.d) {
            q12.d = q1.c;
            return;
        }
        if (q1 != q12.e) {
            this.d.c = this.b;
        } else {
            Q1 q13 = this.d;
            q13.c = null;
            q12.e = q13;
        }
    }
}
