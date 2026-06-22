package com.github.catvod.spider.merge.q;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.q.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1377f<E> implements Cloneable {
    private static final Object f = new Object();
    private boolean b = false;
    private long[] c;
    private Object[] d;
    private int e;

    public C1377f() {
        int iE = C1376e.e(10);
        this.c = new long[iE];
        this.d = new Object[iE];
    }

    private void c() {
        int i = this.e;
        long[] jArr = this.c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.b = false;
        this.e = i2;
    }

    public final void a(long j, E e) {
        int i = this.e;
        if (i != 0 && j <= this.c[i - 1]) {
            e(j, e);
            return;
        }
        if (this.b && i >= this.c.length) {
            c();
        }
        int i2 = this.e;
        if (i2 >= this.c.length) {
            int iE = C1376e.e(i2 + 1);
            long[] jArr = new long[iE];
            Object[] objArr = new Object[iE];
            long[] jArr2 = this.c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.c = jArr;
            this.d = objArr;
        }
        this.c[i2] = j;
        this.d[i2] = e;
        this.e = i2 + 1;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1377f<E> clone() {
        try {
            C1377f<E> c1377f = (C1377f) super.clone();
            c1377f.c = (long[]) this.c.clone();
            c1377f.d = (Object[]) this.d.clone();
            return c1377f;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final E d(long j, E e) {
        int iB = C1376e.b(this.c, this.e, j);
        if (iB >= 0) {
            Object[] objArr = this.d;
            if (objArr[iB] != f) {
                return (E) objArr[iB];
            }
        }
        return e;
    }

    public final void e(long j, E e) {
        int iB = C1376e.b(this.c, this.e, j);
        if (iB >= 0) {
            this.d[iB] = e;
            return;
        }
        int iB2 = iB ^ (-1);
        int i = this.e;
        if (iB2 < i) {
            Object[] objArr = this.d;
            if (objArr[iB2] == f) {
                this.c[iB2] = j;
                objArr[iB2] = e;
                return;
            }
        }
        if (this.b && i >= this.c.length) {
            c();
            iB2 = C1376e.b(this.c, this.e, j) ^ (-1);
        }
        int i2 = this.e;
        if (i2 >= this.c.length) {
            int iE = C1376e.e(i2 + 1);
            long[] jArr = new long[iE];
            Object[] objArr2 = new Object[iE];
            long[] jArr2 = this.c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.c = jArr;
            this.d = objArr2;
        }
        int i3 = this.e;
        if (i3 - iB2 != 0) {
            long[] jArr3 = this.c;
            int i4 = iB2 + 1;
            System.arraycopy(jArr3, iB2, jArr3, i4, i3 - iB2);
            Object[] objArr4 = this.d;
            System.arraycopy(objArr4, iB2, objArr4, i4, this.e - iB2);
        }
        this.c[iB2] = j;
        this.d[iB2] = e;
        this.e++;
    }

    public final void f(long j) {
        int iB = C1376e.b(this.c, this.e, j);
        if (iB >= 0) {
            Object[] objArr = this.d;
            Object obj = objArr[iB];
            Object obj2 = f;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.b = true;
            }
        }
    }

    public final String toString() {
        if (this.b) {
            c();
        }
        int i = this.e;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.e; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            if (this.b) {
                c();
            }
            sb.append(this.c[i2]);
            sb.append('=');
            if (this.b) {
                c();
            }
            Object obj = this.d[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
