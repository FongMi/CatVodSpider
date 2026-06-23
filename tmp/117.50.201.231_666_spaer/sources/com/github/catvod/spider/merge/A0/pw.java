package com.github.catvod.spider.merge.A0;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class pw extends pi {
    public static final Object[] a = new Object[0];
    public int b;
    public Object[] c = a;
    public int d;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        pd pdVar = ph.Companion;
        int i2 = this.d;
        pdVar.getClass();
        pd.b(i, i2);
        int i3 = this.d;
        if (i == i3) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        f(i3 + 1);
        int iH = h(this.b + i);
        int i4 = this.d;
        if (i < ((i4 + 1) >> 1)) {
            if (iH == 0) {
                Object[] objArr = this.c;
                ko.f("<this>", objArr);
                iH = objArr.length;
            }
            int i5 = iH - 1;
            int i6 = this.b;
            if (i6 == 0) {
                Object[] objArr2 = this.c;
                ko.f("<this>", objArr2);
                length = objArr2.length - 1;
            } else {
                length = i6 - 1;
            }
            int i7 = this.b;
            if (i5 >= i7) {
                Object[] objArr3 = this.c;
                objArr3[length] = objArr3[i7];
                qb.e(objArr3, objArr3, i7, i7 + 1, i5 + 1);
            } else {
                Object[] objArr4 = this.c;
                qb.e(objArr4, objArr4, i7 - 1, i7, objArr4.length);
                Object[] objArr5 = this.c;
                objArr5[objArr5.length - 1] = objArr5[0];
                qb.e(objArr5, objArr5, 0, 1, i5 + 1);
            }
            this.c[i5] = obj;
            this.b = length;
        } else {
            int iH2 = h(i4 + this.b);
            if (iH < iH2) {
                Object[] objArr6 = this.c;
                qb.e(objArr6, objArr6, iH + 1, iH, iH2);
            } else {
                Object[] objArr7 = this.c;
                qb.e(objArr7, objArr7, 1, 0, iH2);
                Object[] objArr8 = this.c;
                objArr8[0] = objArr8[objArr8.length - 1];
                qb.e(objArr8, objArr8, iH + 1, iH, objArr8.length - 1);
            }
            this.c[iH] = obj;
        }
        this.d++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        ko.f("elements", collection);
        pd pdVar = ph.Companion;
        int i2 = this.d;
        pdVar.getClass();
        pd.b(i, i2);
        if (collection.isEmpty()) {
            return false;
        }
        int i3 = this.d;
        if (i == i3) {
            return addAll(collection);
        }
        f(collection.size() + i3);
        int iH = h(this.d + this.b);
        int iH2 = h(this.b + i);
        int size = collection.size();
        if (i < ((this.d + 1) >> 1)) {
            int i4 = this.b;
            int length = i4 - size;
            if (iH2 < i4) {
                Object[] objArr = this.c;
                qb.e(objArr, objArr, length, i4, objArr.length);
                if (size >= iH2) {
                    Object[] objArr2 = this.c;
                    qb.e(objArr2, objArr2, objArr2.length - size, 0, iH2);
                } else {
                    Object[] objArr3 = this.c;
                    qb.e(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.c;
                    qb.e(objArr4, objArr4, 0, size, iH2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.c;
                qb.e(objArr5, objArr5, length, i4, iH2);
            } else {
                Object[] objArr6 = this.c;
                length += objArr6.length;
                int i5 = iH2 - i4;
                int length2 = objArr6.length - length;
                if (length2 >= i5) {
                    qb.e(objArr6, objArr6, length, i4, iH2);
                } else {
                    qb.e(objArr6, objArr6, length, i4, i4 + length2);
                    Object[] objArr7 = this.c;
                    qb.e(objArr7, objArr7, 0, this.b + length2, iH2);
                }
            }
            this.b = length;
            int length3 = iH2 - size;
            if (length3 < 0) {
                length3 += this.c.length;
            }
            e(length3, collection);
        } else {
            int i6 = iH2 + size;
            if (iH2 < iH) {
                int i7 = size + iH;
                Object[] objArr8 = this.c;
                if (i7 <= objArr8.length) {
                    qb.e(objArr8, objArr8, i6, iH2, iH);
                } else if (i6 >= objArr8.length) {
                    qb.e(objArr8, objArr8, i6 - objArr8.length, iH2, iH);
                } else {
                    int length4 = iH - (i7 - objArr8.length);
                    qb.e(objArr8, objArr8, 0, length4, iH);
                    Object[] objArr9 = this.c;
                    qb.e(objArr9, objArr9, i6, iH2, length4);
                }
            } else {
                Object[] objArr10 = this.c;
                qb.e(objArr10, objArr10, size, 0, iH);
                Object[] objArr11 = this.c;
                if (i6 >= objArr11.length) {
                    qb.e(objArr11, objArr11, i6 - objArr11.length, iH2, objArr11.length);
                } else {
                    qb.e(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.c;
                    qb.e(objArr12, objArr12, i6, iH2, objArr12.length - size);
                }
            }
            e(iH2, collection);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        ko.f("elements", collection);
        if (collection.isEmpty()) {
            return false;
        }
        f(collection.size() + i());
        e(h(i() + this.b), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        f(this.d + 1);
        int length = this.b;
        if (length == 0) {
            Object[] objArr = this.c;
            ko.f("<this>", objArr);
            length = objArr.length;
        }
        int i = length - 1;
        this.b = i;
        this.c[i] = obj;
        this.d++;
    }

    public final void addLast(Object obj) {
        f(i() + 1);
        this.c[h(i() + this.b)] = obj;
        this.d = i() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int iH = h(this.d + this.b);
        int i = this.b;
        if (i < iH) {
            qb.i(this.c, i, iH);
        } else if (!isEmpty()) {
            Object[] objArr = this.c;
            qb.i(objArr, this.b, objArr.length);
            qb.i(this.c, 0, iH);
        }
        this.b = 0;
        this.d = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.c.length;
        while (i < length && it.hasNext()) {
            this.c[i] = it.next();
            i++;
        }
        int i2 = this.b;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.c[i3] = it.next();
        }
        this.d = collection.size() + this.d;
    }

    public final void f(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.c;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == a) {
            if (i < 10) {
                i = 10;
            }
            this.c = new Object[i];
            return;
        }
        pd pdVar = ph.Companion;
        int length = objArr.length;
        pdVar.getClass();
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        Object[] objArr3 = this.c;
        qb.e(objArr3, objArr2, 0, this.b, objArr3.length);
        Object[] objArr4 = this.c;
        int length2 = objArr4.length;
        int i3 = this.b;
        qb.e(objArr4, objArr2, length2 - i3, 0, i3);
        this.b = 0;
        this.c = objArr2;
    }

    public final int g(int i) {
        ko.f("<this>", this.c);
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        pd pdVar = ph.Companion;
        int i2 = this.d;
        pdVar.getClass();
        pd.a(i, i2);
        return this.c[h(this.b + i)];
    }

    public final int h(int i) {
        Object[] objArr = this.c;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // com.github.catvod.spider.merge.A0.pi
    public final int i() {
        return this.d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iH = h(i() + this.b);
        int length = this.b;
        if (length < iH) {
            while (length < iH) {
                if (ko.b(obj, this.c[length])) {
                    i = this.b;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iH) {
            return -1;
        }
        int length2 = this.c.length;
        while (true) {
            if (length >= length2) {
                for (int i2 = 0; i2 < iH; i2++) {
                    if (ko.b(obj, this.c[i2])) {
                        length = i2 + this.c.length;
                        i = this.b;
                    }
                }
                return -1;
            }
            if (ko.b(obj, this.c[length])) {
                i = this.b;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return i() == 0;
    }

    @Override // com.github.catvod.spider.merge.A0.pi
    public final Object j(int i) {
        pd pdVar = ph.Companion;
        int i2 = this.d;
        pdVar.getClass();
        pd.a(i, i2);
        if (i == size() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        int iH = h(this.b + i);
        Object[] objArr = this.c;
        Object obj = objArr[iH];
        if (i < (this.d >> 1)) {
            int i3 = this.b;
            if (iH >= i3) {
                qb.e(objArr, objArr, i3 + 1, i3, iH);
            } else {
                qb.e(objArr, objArr, 1, 0, iH);
                Object[] objArr2 = this.c;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i4 = this.b;
                qb.e(objArr2, objArr2, i4 + 1, i4, objArr2.length - 1);
            }
            Object[] objArr3 = this.c;
            int i5 = this.b;
            objArr3[i5] = null;
            this.b = g(i5);
        } else {
            int iH2 = h((size() - 1) + this.b);
            if (iH <= iH2) {
                Object[] objArr4 = this.c;
                qb.e(objArr4, objArr4, iH, iH + 1, iH2 + 1);
            } else {
                Object[] objArr5 = this.c;
                qb.e(objArr5, objArr5, iH, iH + 1, objArr5.length);
                Object[] objArr6 = this.c;
                objArr6[objArr6.length - 1] = objArr6[0];
                qb.e(objArr6, objArr6, 0, 1, iH2 + 1);
            }
            this.c[iH2] = null;
        }
        this.d--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iH = h(this.d + this.b);
        int i2 = this.b;
        if (i2 < iH) {
            length = iH - 1;
            if (i2 <= length) {
                while (!ko.b(obj, this.c[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.b;
                return length - i;
            }
            return -1;
        }
        if (i2 > iH) {
            int i3 = iH - 1;
            while (true) {
                if (-1 >= i3) {
                    Object[] objArr = this.c;
                    ko.f("<this>", objArr);
                    length = objArr.length - 1;
                    int i4 = this.b;
                    if (i4 <= length) {
                        while (!ko.b(obj, this.c[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                        i = this.b;
                    }
                } else {
                    if (ko.b(obj, this.c[i3])) {
                        length = i3 + this.c.length;
                        i = this.b;
                        break;
                    }
                    i3--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        j(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iH;
        ko.f("elements", collection);
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.c.length != 0) {
            int iH2 = h(this.d + this.b);
            int i = this.b;
            if (i < iH2) {
                iH = i;
                while (i < iH2) {
                    Object obj = this.c[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.c[iH] = obj;
                        iH++;
                    }
                    i++;
                }
                qb.i(this.c, iH, iH2);
            } else {
                int length = this.c.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr = this.c;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.c[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iH = h(i2);
                for (int i3 = 0; i3 < iH2; i3++) {
                    Object[] objArr2 = this.c;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.c[iH] = obj3;
                        iH = g(iH);
                    }
                }
                z = z2;
            }
            if (z) {
                int length2 = iH - this.b;
                if (length2 < 0) {
                    length2 += this.c.length;
                }
                this.d = length2;
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.c;
        int i = this.b;
        Object obj = objArr[i];
        objArr[i] = null;
        this.b = g(i);
        this.d = i() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int iH = h(sx.k(this) + this.b);
        Object[] objArr = this.c;
        Object obj = objArr[iH];
        objArr[iH] = null;
        this.d = i() - 1;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iH;
        ko.f("elements", collection);
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.c.length != 0) {
            int iH2 = h(this.d + this.b);
            int i = this.b;
            if (i < iH2) {
                iH = i;
                while (i < iH2) {
                    Object obj = this.c[i];
                    if (collection.contains(obj)) {
                        this.c[iH] = obj;
                        iH++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                qb.i(this.c, iH, iH2);
            } else {
                int length = this.c.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr = this.c;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.c[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iH = h(i2);
                for (int i3 = 0; i3 < iH2; i3++) {
                    Object[] objArr2 = this.c;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.c[iH] = obj3;
                        iH = g(iH);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                int length2 = iH - this.b;
                if (length2 < 0) {
                    length2 += this.c.length;
                }
                this.d = length2;
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        pd pdVar = ph.Companion;
        int i2 = this.d;
        pdVar.getClass();
        pd.a(i, i2);
        int iH = h(this.b + i);
        Object[] objArr = this.c;
        Object obj2 = objArr[iH];
        objArr[iH] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[i()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        ko.f("array", objArr);
        int length = objArr.length;
        int i = this.d;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            ko.d("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>", objNewInstance);
            objArr = (Object[]) objNewInstance;
        }
        int iH = h(this.d + this.b);
        int i2 = this.b;
        if (i2 < iH) {
            qb.f(this.c, objArr, 0, i2, iH, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.c;
            qb.e(objArr2, objArr, 0, this.b, objArr2.length);
            Object[] objArr3 = this.c;
            qb.e(objArr3, objArr, objArr3.length - this.b, 0, iH);
        }
        int i3 = this.d;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }
}
