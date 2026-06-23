package com.github.catvod.spider.merge.A0;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class an extends pi implements RandomAccess, Serializable {
    public static final an a;
    public Object[] b;
    public final int c;
    public int d;
    public boolean e;
    public final an f;
    public final an g;

    static {
        an anVar = new an(0);
        anVar.e = true;
        a = anVar;
    }

    public an() {
        this(10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public an(int i) {
        this(new Object[i], 0, 0, false, null, null);
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
    }

    public an(Object[] objArr, int i, int i2, boolean z, an anVar, an anVar2) {
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = anVar;
        this.g = anVar2;
        if (anVar != null) {
            ((AbstractList) this).modCount = ((AbstractList) anVar).modCount;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        n();
        m();
        pd pdVar = ph.Companion;
        int i2 = this.d;
        pdVar.getClass();
        pd.b(i, i2);
        l(this.c + i, obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        n();
        m();
        l(this.c + this.d, obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        ko.f("elements", collection);
        n();
        m();
        pd pdVar = ph.Companion;
        int i2 = this.d;
        pdVar.getClass();
        pd.b(i, i2);
        int size = collection.size();
        k(this.c + i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        ko.f("elements", collection);
        n();
        m();
        int size = collection.size();
        k(this.c + this.d, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        n();
        m();
        q(this.c, this.d);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        m();
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            Object[] objArr = this.b;
            int i = this.d;
            if (i != list.size()) {
                return false;
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (!ko.b(objArr[this.c + i2], list.get(i2))) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m();
        pd pdVar = ph.Companion;
        int i2 = this.d;
        pdVar.getClass();
        pd.a(i, i2);
        return this.b[this.c + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        m();
        Object[] objArr = this.b;
        int i = this.d;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.c + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // com.github.catvod.spider.merge.A0.pi
    public final int i() {
        m();
        return this.d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        m();
        for (int i = 0; i < this.d; i++) {
            if (ko.b(this.b[this.c + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        m();
        return this.d == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.github.catvod.spider.merge.A0.pi
    public final Object j(int i) {
        n();
        m();
        pd pdVar = ph.Companion;
        int i2 = this.d;
        pdVar.getClass();
        pd.a(i, i2);
        return p(this.c + i);
    }

    public final void k(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        an anVar = this.f;
        if (anVar != null) {
            anVar.k(i, collection, i2);
            this.b = anVar.b;
            this.d += i2;
        } else {
            o(i, i2);
            Iterator it = collection.iterator();
            for (int i3 = 0; i3 < i2; i3++) {
                this.b[i + i3] = it.next();
            }
        }
    }

    public final void l(int i, Object obj) {
        ((AbstractList) this).modCount++;
        an anVar = this.f;
        if (anVar == null) {
            o(i, 1);
            this.b[i] = obj;
        } else {
            anVar.l(i, obj);
            this.b = anVar.b;
            this.d++;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        m();
        for (int i = this.d - 1; i >= 0; i--) {
            if (ko.b(this.b[this.c + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        m();
        pd pdVar = ph.Companion;
        int i2 = this.d;
        pdVar.getClass();
        pd.b(i, i2);
        return new ro(this, i);
    }

    public final void m() {
        an anVar = this.g;
        if (anVar != null && ((AbstractList) anVar).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void n() {
        an anVar;
        if (this.e || ((anVar = this.g) != null && anVar.e)) {
            throw new UnsupportedOperationException();
        }
    }

    public final void o(int i, int i2) {
        int i3 = this.d + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.b;
        if (i3 > objArr.length) {
            pd pdVar = ph.Companion;
            int length = objArr.length;
            pdVar.getClass();
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArr2 = this.b;
            ko.f("<this>", objArr2);
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, i4);
            ko.e("copyOf(...)", objArrCopyOf);
            this.b = objArrCopyOf;
        }
        Object[] objArr3 = this.b;
        qb.e(objArr3, objArr3, i + i2, i, this.c + this.d);
        this.d += i2;
    }

    public final Object p(int i) {
        ((AbstractList) this).modCount++;
        an anVar = this.f;
        if (anVar != null) {
            this.d--;
            return anVar.p(i);
        }
        Object[] objArr = this.b;
        Object obj = objArr[i];
        int i2 = this.d;
        int i3 = this.c;
        qb.e(objArr, objArr, i, i + 1, i2 + i3);
        Object[] objArr2 = this.b;
        int i4 = (i3 + this.d) - 1;
        ko.f("<this>", objArr2);
        objArr2[i4] = null;
        this.d--;
        return obj;
    }

    public final void q(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        an anVar = this.f;
        if (anVar != null) {
            anVar.q(i, i2);
        } else {
            Object[] objArr = this.b;
            qb.e(objArr, objArr, i, i + i2, this.d);
            Object[] objArr2 = this.b;
            int i3 = this.d;
            ko.f("<this>", objArr2);
            for (int i4 = i3 - i2; i4 < i3; i4++) {
                objArr2[i4] = null;
            }
        }
        this.d -= i2;
    }

    public final int r(int i, int i2, Collection collection, boolean z) {
        int iR;
        an anVar = this.f;
        if (anVar != null) {
            iR = anVar.r(i, i2, collection, z);
        } else {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                int i5 = i + i3;
                if (collection.contains(this.b[i5]) == z) {
                    Object[] objArr = this.b;
                    i3++;
                    objArr[i4 + i] = objArr[i5];
                    i4++;
                } else {
                    i3++;
                }
            }
            int i6 = i2 - i4;
            Object[] objArr2 = this.b;
            qb.e(objArr2, objArr2, i + i4, i2 + i, this.d);
            Object[] objArr3 = this.b;
            int i7 = this.d;
            ko.f("<this>", objArr3);
            for (int i8 = i7 - i6; i8 < i7; i8++) {
                objArr3[i8] = null;
            }
            iR = i6;
        }
        if (iR > 0) {
            ((AbstractList) this).modCount++;
        }
        this.d -= iR;
        return iR;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        n();
        m();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            j(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        ko.f("elements", collection);
        n();
        m();
        return r(this.c, this.d, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        ko.f("elements", collection);
        n();
        m();
        return r(this.c, this.d, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        n();
        m();
        pd pdVar = ph.Companion;
        int i2 = this.d;
        pdVar.getClass();
        pd.a(i, i2);
        Object[] objArr = this.b;
        int i3 = this.c + i;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        pd pdVar = ph.Companion;
        int i3 = this.d;
        pdVar.getClass();
        pd.c(i, i2, i3);
        Object[] objArr = this.b;
        int i4 = this.c + i;
        int i5 = i2 - i;
        boolean z = this.e;
        an anVar = this.g;
        return new an(objArr, i4, i5, z, this, anVar == null ? this : anVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        m();
        Object[] objArr = this.b;
        int i = this.d;
        int i2 = this.c;
        return qb.h(objArr, i2, i + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        ko.f("destination", objArr);
        m();
        int length = objArr.length;
        int i = this.d;
        int i2 = this.c;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.b, i2, i + i2, objArr.getClass());
            ko.e("copyOfRange(...)", objArrCopyOfRange);
            return objArrCopyOfRange;
        }
        qb.e(this.b, objArr, 0, i2, i + i2);
        int i3 = this.d;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m();
        Object[] objArr = this.b;
        int i = this.d;
        StringBuilder sb = new StringBuilder((i * 3) + 2);
        sb.append("[");
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[this.c + i2];
            if (obj == this) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        ko.e("toString(...)", string);
        return string;
    }
}
