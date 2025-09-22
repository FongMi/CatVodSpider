package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.github.catvod.spider.merge.hs */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public abstract class AbstractC0122hs<E> extends ArrayList<E> {
    public AbstractC0122hs(int i) {
        super(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        mo630q();
        return super.add(e);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        mo630q();
        return super.addAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        mo630q();
        super.clear();
    }

    /* renamed from: q */
    public abstract void mo630q();

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public E remove(int i) {
        mo630q();
        return (E) super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        mo630q();
        return super.removeAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    protected void removeRange(int i, int i2) {
        mo630q();
        super.removeRange(i, i2);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        mo630q();
        return super.retainAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        mo630q();
        return (E) super.set(i, e);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        mo630q();
        super.add(i, e);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        mo630q();
        return super.addAll(i, collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        mo630q();
        return super.remove(obj);
    }
}
