package com.github.catvod.spider.merge.A0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class rp extends ArrayList {
    public rp(ed... edVarArr) {
        super(Arrays.asList(edVarArr));
    }

    public final String a(String str) {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            ed edVar = (ed) it.next();
            if (edVar.av(str)) {
                return edVar.au(str);
            }
        }
        return "";
    }

    @Override // java.util.ArrayList
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final rp clone() {
        rp rpVar = new rp(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            rpVar.add(((ed) it.next()).b());
        }
        return rpVar;
    }

    public final String c() {
        return (String) stream().map(new el(3)).collect(ws.m("\n"));
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            ((ed) it.next()).ba();
        }
        super.clear();
    }

    public final String d() {
        return (String) stream().map(new el(5)).collect(ws.m("\n"));
    }

    public final rp e(String str) {
        wc.c(str);
        dr drVarH = nf.h(str);
        rp rpVar = new rp();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        Iterator it = iterator();
        while (it.hasNext()) {
            ed edVar = (ed) it.next();
            wc.e(drVarH);
            wc.e(edVar);
            for (ed edVar2 : bh.a(drVarH, edVar)) {
                if (identityHashMap.put(edVar2, Boolean.TRUE) == null) {
                    rpVar.add(edVar2);
                }
            }
        }
        return rpVar;
    }

    public final String f() {
        return (String) stream().map(new el(4)).collect(ws.m(" "));
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ed edVar = (ed) super.remove(i);
        edVar.ba();
        return edVar;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        ((ed) super.remove(iIndexOf)).ba();
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.ArrayList, java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        Iterator<E> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (predicate.test((ed) it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        for (int i = 0; i < size(); i++) {
            ed edVar = (ed) unaryOperator.apply((ed) get(i));
            wc.e(edVar);
            ((ed) super.set(i, edVar)).bb(edVar);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        Iterator<E> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains((ed) it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        ed edVar = (ed) obj;
        wc.e(edVar);
        ed edVar2 = (ed) super.set(i, edVar);
        edVar2.bb(edVar);
        return edVar2;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return d();
    }
}
