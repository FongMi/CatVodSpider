package com.github.catvod.spider.merge;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Ⴧ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0583<T> implements Set<T> {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    protected final AbstractC0581<? super T> f1290;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    protected T[][] f1291;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    protected int f1292;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    protected int f1293;

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    protected int f1294;

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    protected int f1295;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.Ⴧ$Ϳ, reason: contains not printable characters */
    protected class C0584 implements Iterator<T> {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        final T[] f1296;

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        int f1297 = 0;

        /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
        boolean f1298 = true;

        public C0584(T[] tArr) {
            this.f1296 = tArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1297 < this.f1296.length;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f1298 = false;
            T[] tArr = this.f1296;
            int i = this.f1297;
            this.f1297 = i + 1;
            return tArr[i];
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f1298) {
                throw new IllegalStateException();
            }
            C0583.this.remove(this.f1296[this.f1297 - 1]);
            this.f1298 = true;
        }
    }

    public C0583() {
        this(null, 16, 8);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(T t) {
        return m1852(t) == t;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        boolean z = false;
        for (T t : collection) {
            if (m1852(t) != t) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f1291 = mo1566(16);
        this.f1292 = 0;
        this.f1293 = (int) Math.floor(12.0d);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return m1848(mo1564(obj));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0029, code lost:
    
        continue;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean containsAll(java.util.Collection<?> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.github.catvod.spider.merge.C0583
            r1 = 0
            if (r0 == 0) goto L2c
            com.github.catvod.spider.merge.Ⴧ r8 = (com.github.catvod.spider.merge.C0583) r8
            T[][] r8 = r8.f1291
            int r0 = r8.length
            r2 = 0
        Lb:
            if (r2 >= r0) goto L45
            r3 = r8[r2]
            if (r3 != 0) goto L12
            goto L29
        L12:
            int r4 = r3.length
            r5 = 0
        L14:
            if (r5 >= r4) goto L29
            r6 = r3[r5]
            if (r6 != 0) goto L1b
            goto L29
        L1b:
            java.lang.Object r6 = r7.mo1564(r6)
            boolean r6 = r7.m1848(r6)
            if (r6 != 0) goto L26
            return r1
        L26:
            int r5 = r5 + 1
            goto L14
        L29:
            int r2 = r2 + 1
            goto Lb
        L2c:
            java.util.Iterator r8 = r8.iterator()
        L30:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L45
            java.lang.Object r0 = r8.next()
            java.lang.Object r0 = r7.mo1564(r0)
            boolean r0 = r7.m1848(r0)
            if (r0 != 0) goto L30
            return r1
        L45:
            r8 = 1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0583.containsAll(java.util.Collection):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0583)) {
            return false;
        }
        C0583 c0583 = (C0583) obj;
        if (c0583.size() != size()) {
            return false;
        }
        return containsAll(c0583);
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        int iM408 = C0120.m408();
        for (T[] tArr : this.f1291) {
            if (tArr != null) {
                for (T t : tArr) {
                    if (t == null) {
                        break;
                    }
                    iM408 = C0120.m410(iM408, this.f1290.mo413(t));
                }
            }
        }
        return C0120.m406(iM408, size());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f1292 == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return new C0584(toArray());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return m1854(mo1564(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zM1854 = false;
        while (it.hasNext()) {
            zM1854 |= m1854(mo1564(it.next()));
        }
        return zM1854;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        int i = 0;
        for (T[] tArr : this.f1291) {
            if (tArr != null) {
                int i2 = 0;
                int i3 = 0;
                while (i2 < tArr.length && tArr[i2] != null) {
                    if (collection.contains(tArr[i2])) {
                        if (i2 != i3) {
                            tArr[i3] = tArr[i2];
                        }
                        i3++;
                        i++;
                    }
                    i2++;
                }
                i += i3;
                while (i3 < i2) {
                    tArr[i3] = null;
                    i3++;
                }
            }
        }
        boolean z = i != this.f1292;
        this.f1292 = i;
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f1292;
    }

    @Override // java.util.Set, java.util.Collection
    public T[] toArray() {
        T[] tArrMo1565 = mo1565(size());
        int i = 0;
        for (T[] tArr : this.f1291) {
            if (tArr != null) {
                int length = tArr.length;
                int i2 = 0;
                while (i2 < length) {
                    T t = tArr[i2];
                    if (t == null) {
                        break;
                    }
                    tArrMo1565[i] = t;
                    i2++;
                    i++;
                }
            }
        }
        return tArrMo1565;
    }

    public String toString() {
        if (size() == 0) {
            return SOY.d("012F");
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        boolean z = true;
        for (T[] tArr : this.f1291) {
            if (tArr != null) {
                for (T t : tArr) {
                    if (t == null) {
                        break;
                    }
                    if (z) {
                        z = false;
                    } else {
                        sb.append(SOY.d("5672"));
                    }
                    sb.append(t.toString());
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Ϳ */
    protected T mo1564(Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public boolean m1848(T t) {
        return (t == null || m1850(t) == null) ? false : true;
    }

    /* JADX INFO: renamed from: ԩ */
    protected T[] mo1565(int i) {
        return (T[]) new Object[i];
    }

    /* JADX INFO: renamed from: Ԫ */
    protected T[][] mo1566(int i) {
        return (T[][]) new Object[i][];
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    protected void m1849() {
        T[] tArrMo1565;
        T[][] tArr = this.f1291;
        this.f1294 += 4;
        int length = tArr.length * 2;
        T[][] tArrMo1566 = mo1566(length);
        int[] iArr = new int[tArrMo1566.length];
        this.f1291 = tArrMo1566;
        double d = length;
        Double.isNaN(d);
        this.f1293 = (int) (d * 0.75d);
        size();
        for (T[] tArr2 : tArr) {
            if (tArr2 != null) {
                for (T t : tArr2) {
                    if (t == null) {
                        break;
                    }
                    int iM1851 = m1851(t);
                    int i = iArr[iM1851];
                    if (i == 0) {
                        tArrMo1565 = mo1565(this.f1295);
                        tArrMo1566[iM1851] = tArrMo1565;
                    } else {
                        tArrMo1565 = tArrMo1566[iM1851];
                        if (i == tArrMo1565.length) {
                            tArrMo1565 = (T[]) Arrays.copyOf(tArrMo1565, tArrMo1565.length * 2);
                            tArrMo1566[iM1851] = tArrMo1565;
                        }
                    }
                    tArrMo1565[i] = t;
                    iArr[iM1851] = iArr[iM1851] + 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public T m1850(T t) {
        if (t == null) {
            return t;
        }
        T[] tArr = this.f1291[m1851(t)];
        if (tArr == null) {
            return null;
        }
        for (T t2 : tArr) {
            if (t2 == null) {
                return null;
            }
            if (this.f1290.mo412(t2, t)) {
                return t2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    protected final int m1851(T t) {
        return this.f1290.mo413(t) & (this.f1291.length - 1);
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public final T m1852(T t) {
        if (this.f1292 > this.f1293) {
            m1849();
        }
        return m1853(t);
    }

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    protected T m1853(T t) {
        int iM1851 = m1851(t);
        T[] tArr = this.f1291[iM1851];
        if (tArr == null) {
            T[] tArrMo1565 = mo1565(this.f1295);
            tArrMo1565[0] = t;
            this.f1291[iM1851] = tArrMo1565;
            this.f1292++;
            return t;
        }
        for (int i = 0; i < tArr.length; i++) {
            T t2 = tArr[i];
            if (t2 == null) {
                tArr[i] = t;
                this.f1292++;
                return t;
            }
            if (this.f1290.mo412(t2, t)) {
                return t2;
            }
        }
        int length = tArr.length;
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length * 2);
        ((T[][]) this.f1291)[iM1851] = objArrCopyOf;
        objArrCopyOf[length] = t;
        this.f1292++;
        return t;
    }

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    public boolean m1854(T t) {
        T t2;
        if (t == null) {
            return false;
        }
        T[] tArr = this.f1291[m1851(t)];
        if (tArr == null) {
            return false;
        }
        for (int i = 0; i < tArr.length && (t2 = tArr[i]) != null; i++) {
            if (this.f1290.mo412(t2, t)) {
                System.arraycopy(tArr, i + 1, tArr, i, (tArr.length - i) - 1);
                tArr[tArr.length - 1] = null;
                this.f1292--;
                return true;
            }
        }
        return false;
    }

    public C0583(AbstractC0581<? super T> abstractC0581, int i, int i2) {
        this.f1292 = 0;
        this.f1293 = (int) Math.floor(12.0d);
        this.f1294 = 1;
        this.f1295 = 8;
        this.f1290 = abstractC0581 == null ? C0121.f308 : abstractC0581;
        this.f1291 = mo1566(i);
        this.f1295 = i2;
    }

    @Override // java.util.Set, java.util.Collection
    public <U> U[] toArray(U[] uArr) {
        if (uArr.length < size()) {
            uArr = (U[]) Arrays.copyOf(uArr, size());
        }
        int i = 0;
        for (T[] tArr : this.f1291) {
            if (tArr != null) {
                int length = tArr.length;
                int i2 = 0;
                while (i2 < length) {
                    T t = tArr[i2];
                    if (t == null) {
                        break;
                    }
                    uArr[i] = t;
                    i2++;
                    i++;
                }
            }
        }
        return uArr;
    }
}
