package com.github.catvod.spider.merge.f1;

import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class U1 implements Serializable {
    private static final Object g = new Object();
    private transient Object[] b;
    private transient int[] c;
    private int d;
    private int e;
    private transient int f;

    public U1(int i) {
        if (i < 0) {
            C1162n0.c();
            throw null;
        }
        int i2 = 2;
        while ((1 << i2) < (i * 4) / 3) {
            i2++;
        }
        this.d = i2;
    }

    private int b(Object obj) {
        int i;
        int iHashCode = obj.hashCode();
        Object[] objArr = this.b;
        if (objArr != null) {
            int i2 = (-1640531527) * iHashCode;
            int i3 = this.d;
            i = i2 >>> (32 - i3);
            Object obj2 = objArr[i];
            if (obj2 != null) {
                int i4 = 1 << i3;
                if (obj2 != obj && (this.c[i4 + i] != iHashCode || !obj2.equals(obj))) {
                    i = obj2 == g ? i : -1;
                    int i5 = i4 - 1;
                    int iL = l(i2, i5, this.d);
                    while (true) {
                        i = (i + iL) & i5;
                        Object obj3 = this.b[i];
                        if (obj3 == null) {
                            break;
                        }
                        if (obj3 == obj || (this.c[i4 + i] == iHashCode && obj3.equals(obj))) {
                            break;
                        }
                        if (obj3 == g && i < 0) {
                            i = i;
                        }
                    }
                }
                return i;
            }
        } else {
            i = -1;
        }
        if (i < 0) {
            Object[] objArr2 = this.b;
            if (objArr2 != null) {
                int i6 = this.f;
                if (i6 * 4 < (1 << this.d) * 3) {
                    this.f = i6 + 1;
                    i = i;
                }
            }
            if (objArr2 == null) {
                int i7 = 1 << this.d;
                this.b = new Object[i7];
                this.c = new int[i7 * 2];
            } else {
                int i8 = this.e;
                if (i8 * 2 >= this.f) {
                    this.d++;
                }
                int i9 = 1 << this.d;
                int[] iArr = this.c;
                int length = objArr2.length;
                this.b = new Object[i9];
                this.c = new int[i9 * 2];
                int i10 = 0;
                this.e = 0;
                this.f = 0;
                while (i8 != 0) {
                    Object obj4 = objArr2[i10];
                    if (obj4 != null && obj4 != g) {
                        this.c[g(obj4, iArr[length + i10])] = iArr[i10];
                        i8--;
                    }
                    i10++;
                }
            }
            return g(obj, iHashCode);
        }
        this.b[i] = obj;
        this.c[(1 << this.d) + i] = iHashCode;
        this.e++;
        return i;
    }

    private int c(Object obj) {
        if (this.b == null) {
            return -1;
        }
        int iHashCode = obj.hashCode();
        int i = (-1640531527) * iHashCode;
        int i2 = this.d;
        int i3 = i >>> (32 - i2);
        Object obj2 = this.b[i3];
        if (obj2 == null) {
            return -1;
        }
        int i4 = 1 << i2;
        if (obj2 != obj && (this.c[i4 + i3] != iHashCode || !obj2.equals(obj))) {
            int i5 = i4 - 1;
            int iL = l(i, i5, this.d);
            while (true) {
                i3 = (i3 + iL) & i5;
                Object obj3 = this.b[i3];
                if (obj3 == null) {
                    return -1;
                }
                if (obj3 == obj || (this.c[i4 + i3] == iHashCode && obj3.equals(obj))) {
                    break;
                }
            }
        }
        return i3;
    }

    private int g(Object obj, int i) {
        int i2 = (-1640531527) * i;
        int i3 = this.d;
        int i4 = i2 >>> (32 - i3);
        int i5 = 1 << i3;
        if (this.b[i4] != null) {
            int i6 = i5 - 1;
            int iL = l(i2, i6, i3);
            do {
                i4 = (i4 + iL) & i6;
            } while (this.b[i4] != null);
        }
        this.b[i4] = obj;
        this.c[i5 + i4] = i;
        this.f++;
        this.e++;
        return i4;
    }

    private static int l(int i, int i2, int i3) {
        int i4 = 32 - (i3 * 2);
        if (i4 >= 0) {
            i >>>= i4;
        } else {
            i2 >>>= -i4;
        }
        return (i & i2) | 1;
    }

    public final int d(Object obj) {
        if (obj == null) {
            obj = I2.d;
        }
        int iC = c(obj);
        if (iC >= 0) {
            return this.c[iC];
        }
        return -1;
    }

    public final boolean e(Object obj) {
        if (obj == null) {
            obj = I2.d;
        }
        return c(obj) >= 0;
    }

    final void f(T1 t1) {
        t1.d(this.b, this.c, this.e);
    }

    public final Object h(Object obj) {
        boolean z;
        if (obj == null) {
            obj = I2.d;
            z = true;
        } else {
            z = false;
        }
        int iB = b(obj);
        this.c[iB] = 0;
        if (z) {
            return null;
        }
        return this.b[iB];
    }

    public final void i(Object obj, int i) {
        if (obj == null) {
            obj = I2.d;
        }
        this.c[b(obj)] = i;
    }

    public final void j(Object obj) {
        if (obj == null) {
            obj = I2.d;
        }
        int iC = c(obj);
        if (iC >= 0) {
            this.b[iC] = g;
            this.e--;
        }
    }

    public final int k() {
        return this.e;
    }
}
