package com.github.catvod.spider.merge.q;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class j implements Set<Object> {
    final /* synthetic */ m b;

    j(m mVar) {
        this.b = mVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<Object> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.b.a();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.b.e(obj) >= 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Map mapC = this.b.c();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!mapC.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        return m.j(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int iHashCode = 0;
        for (int iD = this.b.d() - 1; iD >= 0; iD--) {
            Object objB = this.b.b(iD, 0);
            iHashCode += objB == null ? 0 : objB.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.b.d() == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new h(this.b, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        int iE = this.b.e(obj);
        if (iE < 0) {
            return false;
        }
        this.b.h(iE);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Map mapC = this.b.c();
        int size = mapC.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            mapC.remove(it.next());
        }
        return size != mapC.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        Map mapC = this.b.c();
        int size = mapC.size();
        Iterator it = mapC.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != mapC.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.b.d();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        m mVar = this.b;
        int iD = mVar.d();
        Object[] objArr = new Object[iD];
        for (int i = 0; i < iD; i++) {
            objArr[i] = mVar.b(i, 0);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.b.k(tArr, 0);
    }
}
