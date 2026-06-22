package com.github.catvod.spider.merge.f1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1196y1 implements Iterator<Object> {
    Object[] b;
    Object c;
    int d = 0;
    final /* synthetic */ C1199z1 e;

    C1196y1(C1199z1 c1199z1) {
        this.e = c1199z1;
        this.b = c1199z1.b.o0(false, false);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d < this.b.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            Object[] objArr = this.b;
            int i = this.d;
            this.d = i + 1;
            Object obj = objArr[i];
            this.c = obj;
            return obj;
        } catch (ArrayIndexOutOfBoundsException unused) {
            this.c = null;
            throw new NoSuchElementException();
        }
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
