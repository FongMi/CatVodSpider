package com.github.catvod.spider.merge.Bk;

import com.github.catvod.spider.merge.ZrJ;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class c<T> implements Set<T> {
    protected final a a;
    protected T[][] b;
    protected int c;
    protected int d;
    protected int e;

    public c() {
        this(null, 8);
    }

    public c(a aVar, int i) {
        this.c = 0;
        this.d = (int) Math.floor(12.0d);
        this.e = 8;
        this.a = aVar == null ? m.a : aVar;
        this.b = d(16);
        this.e = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected T a(Object obj) {
        return obj;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(T t) {
        return f(t) == t;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        boolean z = false;
        for (T t : collection) {
            if (f(t) != t) {
                z = true;
            }
        }
        return z;
    }

    public final boolean b(T t) {
        if (t == null) {
            return false;
        }
        T[] tArr = this.b[e(t)];
        T t2 = null;
        if (tArr != null) {
            int length = tArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    T t3 = tArr[i];
                    if (t3 == null) {
                        break;
                    }
                    if (this.a.E(t3, t)) {
                        t2 = t3;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        return t2 != null;
    }

    protected T[] c(int i) {
        return (T[]) new Object[i];
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.b = d(16);
        this.c = 0;
        this.d = (int) Math.floor(12.0d);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return b(a(obj));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0029, code lost:
    
        continue;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsAll(java.util.Collection<?> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.github.catvod.spider.merge.Bk.c
            r1 = 0
            if (r0 == 0) goto L2c
            com.github.catvod.spider.merge.Bk.c r8 = (com.github.catvod.spider.merge.Bk.c) r8
            T[][] r8 = r8.b
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
            java.lang.Object r6 = r7.a(r6)
            boolean r6 = r7.b(r6)
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
            java.lang.Object r0 = r7.a(r0)
            boolean r0 = r7.b(r0)
            if (r0 != 0) goto L30
            return r1
        L45:
            r8 = 1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Bk.c.containsAll(java.util.Collection):boolean");
    }

    protected T[][] d(int i) {
        return (T[][]) new Object[i][];
    }

    protected final int e(T t) {
        return this.a.F(t) & (this.b.length - 1);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (cVar.c != this.c) {
            return false;
        }
        return containsAll(cVar);
    }

    public final T f(T t) {
        T[] tArrC;
        int i = 0;
        if (this.c > this.d) {
            T[][] tArr = this.b;
            int length = tArr.length * 2;
            T[][] tArrD = d(length);
            int[] iArr = new int[tArrD.length];
            this.b = tArrD;
            double d = length;
            Double.isNaN(d);
            Double.isNaN(d);
            Double.isNaN(d);
            this.d = (int) (d * 0.75d);
            for (T[] tArr2 : tArr) {
                if (tArr2 != null) {
                    for (T t2 : tArr2) {
                        if (t2 == null) {
                            break;
                        }
                        int iE = e(t2);
                        int i2 = iArr[iE];
                        if (i2 == 0) {
                            tArrC = c(this.e);
                            tArrD[iE] = tArrC;
                        } else {
                            tArrC = tArrD[iE];
                            if (i2 == tArrC.length) {
                                tArrC = (T[]) Arrays.copyOf(tArrC, tArrC.length * 2);
                                tArrD[iE] = tArrC;
                            }
                        }
                        tArrC[i2] = t2;
                        iArr[iE] = iArr[iE] + 1;
                    }
                }
            }
        }
        int iE2 = e(t);
        T[] tArr3 = this.b[iE2];
        if (tArr3 != null) {
            while (true) {
                if (i >= tArr3.length) {
                    int length2 = tArr3.length;
                    Object[] objArrCopyOf = Arrays.copyOf(tArr3, tArr3.length * 2);
                    ((T[][]) this.b)[iE2] = objArrCopyOf;
                    objArrCopyOf[length2] = t;
                    break;
                }
                T t3 = tArr3[i];
                if (t3 == null) {
                    tArr3[i] = t;
                    break;
                }
                if (this.a.E(t3, t)) {
                    return t3;
                }
                i++;
            }
        } else {
            T[] tArrC2 = c(this.e);
            tArrC2[0] = t;
            this.b[iE2] = tArrC2;
        }
        this.c++;
        return t;
    }

    public final boolean g(T t) {
        T t2;
        if (t == null) {
            return false;
        }
        T[] tArr = this.b[e(t)];
        if (tArr == null) {
            return false;
        }
        for (int i = 0; i < tArr.length && (t2 = tArr[i]) != null; i++) {
            if (this.a.E(t2, t)) {
                System.arraycopy(tArr, i + 1, tArr, i, (tArr.length - i) - 1);
                tArr[tArr.length - 1] = null;
                this.c--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int iF = 0;
        for (T[] tArr : this.b) {
            if (tArr != null) {
                for (T t : tArr) {
                    if (t == null) {
                        break;
                    }
                    iF = l.f(iF, this.a.F(t));
                }
            }
        }
        return l.b(iF, this.c);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.c == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new b(this, toArray());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return g(a(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zG = false;
        while (it.hasNext()) {
            zG |= g(a(it.next()));
        }
        return zG;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        int i = 0;
        for (T[] tArr : this.b) {
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
        boolean z = i != this.c;
        this.c = i;
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.c;
    }

    @Override // java.util.Set, java.util.Collection
    public final T[] toArray() {
        T[] tArrC = c(this.c);
        int i = 0;
        for (T[] tArr : this.b) {
            if (tArr != null) {
                int length = tArr.length;
                int i2 = 0;
                while (i2 < length) {
                    T t = tArr[i2];
                    if (t == null) {
                        break;
                    }
                    tArrC[i] = t;
                    i2++;
                    i++;
                }
            }
        }
        return tArrC;
    }

    public final String toString() {
        if (this.c == 0) {
            return ZrJ.d("023E");
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        boolean z = true;
        for (T[] tArr : this.b) {
            if (tArr != null) {
                for (T t : tArr) {
                    if (t == null) {
                        break;
                    }
                    if (z) {
                        z = false;
                    } else {
                        sb.append(ZrJ.d("5563"));
                    }
                    sb.append(t.toString());
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final <U> U[] toArray(U[] uArr) {
        int length = uArr.length;
        int i = this.c;
        if (length < i) {
            uArr = (U[]) Arrays.copyOf(uArr, i);
        }
        int i2 = 0;
        for (T[] tArr : this.b) {
            if (tArr != null) {
                int length2 = tArr.length;
                int i3 = 0;
                while (i3 < length2) {
                    T t = tArr[i3];
                    if (t == null) {
                        break;
                    }
                    uArr[i2] = t;
                    i3++;
                    i2++;
                }
            }
        }
        return uArr;
    }
}
