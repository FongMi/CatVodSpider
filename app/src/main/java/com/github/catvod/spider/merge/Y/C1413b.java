package com.github.catvod.spider.merge.y;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.y.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1413b extends AbstractC1412a implements List<Object>, Cloneable, RandomAccess, Serializable {
    private final List<Object> j;
    protected transient Object k;
    protected transient Type l;

    public C1413b() {
        this.j = new ArrayList();
    }

    public C1413b(int i) {
        this.j = new ArrayList(i);
    }

    public C1413b(List<Object> list) {
        if (list == null) {
            throw new IllegalArgumentException("list is null.");
        }
        this.j = list;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.j.add(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        return this.j.add(obj);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends Object> collection) {
        return this.j.addAll(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<?> collection) {
        return this.j.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.j.clear();
    }

    public final Object clone() {
        return new C1413b(new ArrayList(this.j));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.j.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return this.j.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        List<Object> list;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1413b) {
            list = this.j;
            obj = ((C1413b) obj).j;
        } else {
            list = this.j;
        }
        return list.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.j.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.j.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.j.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.j.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<Object> iterator() {
        return this.j.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.j.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<Object> listIterator() {
        return this.j.listIterator();
    }

    @Override // java.util.List
    public final ListIterator<Object> listIterator(int i) {
        return this.j.listIterator(i);
    }

    public final Type n() {
        return this.l;
    }

    public final C1416e o(int i) {
        Object obj = this.j.get(i);
        return obj instanceof C1416e ? (C1416e) obj : obj instanceof Map ? new C1416e((Map<String, Object>) obj) : (C1416e) AbstractC1412a.j(obj);
    }

    public final Object p() {
        return this.k;
    }

    public final void q(Type type) {
        this.l = type;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        return this.j.remove(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.j.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        return this.j.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return this.j.retainAll(collection);
    }

    public final void s(Object obj) {
        this.k = obj;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        if (i != -1) {
            if (this.j.size() > i) {
                return this.j.set(i, obj);
            }
            for (int size = this.j.size(); size < i; size++) {
                this.j.add(null);
            }
        }
        this.j.add(obj);
        return null;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.j.size();
    }

    @Override // java.util.List
    public final List<Object> subList(int i, int i2) {
        return this.j.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return this.j.toArray();
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.j.toArray(tArr);
    }
}
