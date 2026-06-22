package com.github.catvod.spider.merge.q;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class o<E> implements Cloneable {
    private static final Object e = new Object();
    private int[] b;
    private Object[] c;
    private int d;

    public o() {
        int iD = C1376e.d(10);
        this.b = new int[iD];
        this.c = new Object[iD];
    }

    public final void a(int i, E e2) {
        int i2 = this.d;
        if (i2 != 0 && i <= this.b[i2 - 1]) {
            d(i, e2);
            return;
        }
        if (i2 >= this.b.length) {
            int iD = C1376e.d(i2 + 1);
            int[] iArr = new int[iD];
            Object[] objArr = new Object[iD];
            int[] iArr2 = this.b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.b = iArr;
            this.c = objArr;
        }
        this.b[i2] = i;
        this.c[i2] = e2;
        this.d = i2 + 1;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o<E> clone() {
        try {
            o<E> oVar = (o) super.clone();
            oVar.b = (int[]) this.b.clone();
            oVar.c = (Object[]) this.c.clone();
            return oVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final E c(int i, E e2) {
        int iA = C1376e.a(this.b, this.d, i);
        if (iA >= 0) {
            Object[] objArr = this.c;
            if (objArr[iA] != e) {
                return (E) objArr[iA];
            }
        }
        return e2;
    }

    public final void d(int i, E e2) {
        int iA = C1376e.a(this.b, this.d, i);
        if (iA >= 0) {
            this.c[iA] = e2;
            return;
        }
        int i2 = iA ^ (-1);
        int i3 = this.d;
        if (i2 < i3) {
            Object[] objArr = this.c;
            if (objArr[i2] == e) {
                this.b[i2] = i;
                objArr[i2] = e2;
                return;
            }
        }
        if (i3 >= this.b.length) {
            int iD = C1376e.d(i3 + 1);
            int[] iArr = new int[iD];
            Object[] objArr2 = new Object[iD];
            int[] iArr2 = this.b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.b = iArr;
            this.c = objArr2;
        }
        int i4 = this.d - i2;
        if (i4 != 0) {
            int[] iArr3 = this.b;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4);
            Object[] objArr4 = this.c;
            System.arraycopy(objArr4, i2, objArr4, i5, this.d - i2);
        }
        this.b[i2] = i;
        this.c[i2] = e2;
        this.d++;
    }

    public final String toString() {
        int i = this.d;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(this.b[i2]);
            sb.append('=');
            Object obj = this.c[i2];
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
