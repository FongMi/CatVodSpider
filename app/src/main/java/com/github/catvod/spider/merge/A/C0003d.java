package com.github.catvod.spider.merge.A;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class C0003d implements Set {
    public final com.github.catvod.spider.merge.J.b a;
    public Object[][] b;
    public int c;
    public int d;
    public final int e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0003d(int i) {
        this(C0002c.a);
        switch (i) {
            case 1:
                this(com.github.catvod.spider.merge.C.g.a);
                break;
            default:
                break;
        }
    }

    public final boolean a(C0001b c0001b) {
        if (c0001b == null) {
            return false;
        }
        Object[] objArr = this.b[b(c0001b)];
        Object obj = null;
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        break;
                    }
                    if (this.a.a(obj2, c0001b)) {
                        obj = obj2;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        return obj != null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return c(obj) == obj;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        boolean z = false;
        for (Object obj : collection) {
            if (c(obj) != obj) {
                z = true;
            }
        }
        return z;
    }

    public final int b(Object obj) {
        return this.a.b(obj) & (this.b.length - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(Object obj) {
        Object[] objArrCopyOf;
        int i = this.c;
        int i2 = this.d;
        int i3 = this.e;
        if (i > i2) {
            Object[][] objArr = this.b;
            int length = objArr.length * 2;
            Object[][] objArr2 = new C0001b[length][];
            int[] iArr = new int[length];
            this.b = objArr2;
            double d = length;
            Double.isNaN(d);
            this.d = (int) (d * 0.75d);
            for (Object[] objArr3 : objArr) {
                if (objArr3 != null) {
                    for (Object obj2 : objArr3) {
                        if (obj2 == null) {
                            break;
                        }
                        int iB = b(obj2);
                        int i4 = iArr[iB];
                        if (i4 == 0) {
                            objArrCopyOf = new C0001b[i3];
                            objArr2[iB] = objArrCopyOf;
                        } else {
                            objArrCopyOf = objArr2[iB];
                            if (i4 == objArrCopyOf.length) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length * 2);
                                objArr2[iB] = objArrCopyOf;
                            }
                        }
                        objArrCopyOf[i4] = obj2;
                        iArr[iB] = iArr[iB] + 1;
                    }
                }
            }
        }
        int iB2 = b(obj);
        Object[][] objArr4 = this.b;
        Object[] objArr5 = objArr4[iB2];
        if (objArr5 != null) {
            int i5 = 0;
            while (true) {
                if (i5 >= objArr5.length) {
                    int length2 = objArr5.length;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr5, objArr5.length * 2);
                    this.b[iB2] = objArrCopyOf2;
                    objArrCopyOf2[length2] = obj;
                    break;
                }
                Object obj3 = objArr5[i5];
                if (obj3 == null) {
                    objArr5[i5] = obj;
                    break;
                }
                if (this.a.a(obj3, obj)) {
                    return obj3;
                }
                i5++;
            }
        } else {
            Object[] objArr6 = new C0001b[i3];
            objArr6[0] = obj;
            objArr4[iB2] = objArr6;
        }
        this.c++;
        return obj;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.b = new C0001b[16][];
        this.c = 0;
        this.d = (int) Math.floor(12.0d);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return a(!(obj instanceof C0001b) ? null : (C0001b) obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x002e, code lost:
    
        continue;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsAll(java.util.Collection r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.github.catvod.spider.merge.A.C0003d
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L31
            com.github.catvod.spider.merge.A.d r10 = (com.github.catvod.spider.merge.A.C0003d) r10
            java.lang.Object[][] r10 = r10.b
            int r0 = r10.length
            r3 = 0
        Lc:
            if (r3 >= r0) goto L4e
            r4 = r10[r3]
            if (r4 != 0) goto L13
            goto L2e
        L13:
            int r5 = r4.length
            r6 = 0
        L15:
            if (r6 >= r5) goto L2e
            r7 = r4[r6]
            if (r7 != 0) goto L1c
            goto L2e
        L1c:
            boolean r8 = r7 instanceof com.github.catvod.spider.merge.A.C0001b
            if (r8 != 0) goto L22
            r7 = r1
            goto L24
        L22:
            com.github.catvod.spider.merge.A.b r7 = (com.github.catvod.spider.merge.A.C0001b) r7
        L24:
            boolean r7 = r9.a(r7)
            if (r7 != 0) goto L2b
            return r2
        L2b:
            int r6 = r6 + 1
            goto L15
        L2e:
            int r3 = r3 + 1
            goto Lc
        L31:
            java.util.Iterator r10 = r10.iterator()
        L35:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r10.next()
            boolean r3 = r0 instanceof com.github.catvod.spider.merge.A.C0001b
            if (r3 != 0) goto L45
            r0 = r1
            goto L47
        L45:
            com.github.catvod.spider.merge.A.b r0 = (com.github.catvod.spider.merge.A.C0001b) r0
        L47:
            boolean r0 = r9.a(r0)
            if (r0 != 0) goto L35
            return r2
        L4e:
            r10 = 1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A.C0003d.containsAll(java.util.Collection):boolean");
    }

    public final boolean d(C0001b c0001b) {
        Object obj;
        if (c0001b == null) {
            return false;
        }
        Object[] objArr = this.b[b(c0001b)];
        if (objArr == null) {
            return false;
        }
        for (int i = 0; i < objArr.length && (obj = objArr[i]) != null; i++) {
            if (this.a.a(obj, c0001b)) {
                System.arraycopy(objArr, i + 1, objArr, i, (objArr.length - i) - 1);
                objArr[objArr.length - 1] = null;
                this.c--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0003d)) {
            return false;
        }
        C0003d c0003d = (C0003d) obj;
        if (c0003d.c != this.c) {
            return false;
        }
        return containsAll(c0003d);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int iB = 0;
        for (Object[] objArr : this.b) {
            if (objArr != null) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        break;
                    }
                    iB = com.github.catvod.spider.merge.R.a.b(iB, this.a.b(obj));
                }
            }
        }
        return com.github.catvod.spider.merge.R.a.a(iB, this.c);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.c == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new com.github.catvod.spider.merge.C.a(this, toArray());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return d(!(obj instanceof C0001b) ? null : (C0001b) obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        boolean zD = false;
        for (Object obj : collection) {
            zD |= d(!(obj instanceof C0001b) ? null : (C0001b) obj);
        }
        return zD;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Object obj;
        int i = 0;
        for (Object[] objArr : this.b) {
            if (objArr != null) {
                int i2 = 0;
                int i3 = 0;
                while (i2 < objArr.length && (obj = objArr[i2]) != null) {
                    if (collection.contains(obj)) {
                        if (i2 != i3) {
                            objArr[i3] = objArr[i2];
                        }
                        i3++;
                        i++;
                    }
                    i2++;
                }
                i += i3;
                while (i3 < i2) {
                    objArr[i3] = null;
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C0001b[] c0001bArr = new C0001b[this.c];
        int i = 0;
        for (Object[] objArr : this.b) {
            if (objArr != null) {
                int length = objArr.length;
                int i2 = 0;
                while (i2 < length) {
                    Object obj = objArr[i2];
                    if (obj == null) {
                        break;
                    }
                    c0001bArr[i] = obj;
                    i2++;
                    i++;
                }
            }
        }
        return c0001bArr;
    }

    public final String toString() {
        if (this.c == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        boolean z = true;
        for (Object[] objArr : this.b) {
            if (objArr != null) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        break;
                    }
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(obj.toString());
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C0003d(com.github.catvod.spider.merge.J.b bVar) {
        this.c = 0;
        this.d = (int) Math.floor(12.0d);
        this.a = bVar;
        this.b = new C0001b[16][];
        this.e = 2;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.c;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = 0;
        for (Object[] objArr2 : this.b) {
            if (objArr2 != null) {
                int length2 = objArr2.length;
                int i3 = 0;
                while (i3 < length2) {
                    Object obj = objArr2[i3];
                    if (obj == null) {
                        break;
                    }
                    objArr[i2] = obj;
                    i3++;
                    i2++;
                }
            }
        }
        return objArr;
    }
}
