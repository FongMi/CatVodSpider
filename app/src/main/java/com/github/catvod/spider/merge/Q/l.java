package com.github.catvod.spider.merge.q;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class l implements Collection<Object> {
    final /* synthetic */ m b;

    l(m mVar) {
        this.b = mVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.b.a();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.b.f(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.b.d() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new h(this.b, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        int iF = this.b.f(obj);
        if (iF < 0) {
            return false;
        }
        this.b.h(iF);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        int iD = this.b.d();
        int i = 0;
        boolean z = false;
        while (i < iD) {
            if (collection.contains(this.b.b(i, 1))) {
                this.b.h(i);
                i--;
                iD--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        int iD = this.b.d();
        int i = 0;
        boolean z = false;
        while (i < iD) {
            if (!collection.contains(this.b.b(i, 1))) {
                this.b.h(i);
                i--;
                iD--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.b.d();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        m mVar = this.b;
        int iD = mVar.d();
        Object[] objArr = new Object[iD];
        for (int i = 0; i < iD; i++) {
            objArr[i] = mVar.b(i, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.b.k(tArr, 1);
    }
}
