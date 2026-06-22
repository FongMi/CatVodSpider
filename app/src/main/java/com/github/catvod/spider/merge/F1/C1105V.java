package com.github.catvod.spider.merge.f1;

import java.io.Serializable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.V, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1105V implements Serializable {
    private AbstractC1106W b;
    private int c;
    private Object[] d;
    private short[] e;
    int f;
    private C1104U g;
    private short h;

    C1105V(AbstractC1106W abstractC1106W, int i) {
        if (abstractC1106W == null) {
            throw new IllegalArgumentException();
        }
        if (i < 1) {
            throw new IllegalArgumentException();
        }
        this.b = abstractC1106W;
        this.c = i;
    }

    private Object c(int i) {
        Object[] objArr = this.d;
        if (objArr == null) {
            synchronized (this) {
                objArr = this.d;
                if (objArr == null) {
                    int i2 = this.c;
                    Object[] objArr2 = new Object[i2 * 2];
                    this.d = objArr2;
                    this.e = new short[i2];
                    objArr = objArr2;
                }
            }
        }
        int i3 = (i - 1) * 2;
        Object obj = objArr[i3];
        if (obj == null) {
            int i4 = this.f;
            if (i == i4) {
                j(i4, "constructor", this.g, this.h);
                this.g = null;
            } else {
                this.b.h1(i);
            }
            obj = objArr[i3];
            if (obj == null) {
                throw new IllegalStateException(this.b.getClass().getName() + ".initPrototypeId(int id) did not initialize id=" + i);
            }
        }
        return obj;
    }

    private void j(int i, Object obj, Object obj2, int i2) {
        Object[] objArr = this.d;
        if (objArr == null) {
            throw new IllegalStateException();
        }
        if (obj2 == null) {
            obj2 = I2.d;
        }
        int i3 = i - 1;
        int i4 = i3 * 2;
        synchronized (this) {
            if (objArr[i4] == null) {
                objArr[i4] = obj2;
                objArr[i4 + 1] = obj;
                this.e[i3] = (short) i2;
            } else if (!obj.equals(objArr[i4 + 1])) {
                throw new IllegalStateException();
            }
        }
    }

    final C1104U a() {
        if (this.f != 0) {
            throw new IllegalStateException();
        }
        int iC1 = this.b.c1("constructor");
        this.f = iC1;
        if (iC1 == 0) {
            throw new IllegalStateException("No id for constructor property");
        }
        this.b.h1(iC1);
        C1104U c1104u = this.g;
        if (c1104u != null) {
            c1104u.I1(this.b.F(), p2.u0(this.b));
            this.g.J1(this.b);
            return this.g;
        }
        throw new IllegalStateException(this.b.getClass().getName() + ".initPrototypeId() did not initialize id=" + this.f);
    }

    final void b(int i) {
        c(i);
        int i2 = i - 1;
        if ((this.e[i2] & 4) != 0) {
            if (C1185v.h().u()) {
                throw C1157l2.C1("msg.delete.property.with.configurable.false", (String) this.d[(i2 * 2) + 1]);
            }
        } else {
            int i3 = i2 * 2;
            synchronized (this) {
                this.d[i3] = I2.c;
                this.e[i2] = 0;
            }
        }
    }

    final int d(w2 w2Var) {
        return this.b.b1(w2Var);
    }

    final int e(String str) {
        return this.b.c1(str);
    }

    final Object f(int i) {
        Object objC = c(i);
        if (objC == I2.d) {
            return null;
        }
        return objC;
    }

    final int g(int i) {
        c(i);
        return this.e[i - 1];
    }

    final Object[] h(boolean z, boolean z2, Object[] objArr) {
        int i;
        Object[] objArr2 = null;
        int i2 = 0;
        for (int i3 = 1; i3 <= this.c; i3++) {
            Object objC = c(i3);
            if (z || (this.e[i3 - 1] & 2) == 0) {
                int i4 = n2.a;
                if (objC != I2.c) {
                    Object obj = this.d[((i3 - 1) * 2) + 1];
                    if (obj instanceof String) {
                        if (objArr2 == null) {
                            objArr2 = new Object[this.c];
                        }
                        i = i2 + 1;
                        objArr2[i2] = obj;
                    } else if (z2 && (obj instanceof w2)) {
                        if (objArr2 == null) {
                            objArr2 = new Object[this.c];
                        }
                        i = i2 + 1;
                        objArr2[i2] = obj.toString();
                    }
                    i2 = i;
                }
            }
        }
        if (i2 == 0) {
            return objArr;
        }
        if (objArr == null || objArr.length == 0) {
            if (i2 == objArr2.length) {
                return objArr2;
            }
            Object[] objArr3 = new Object[i2];
            System.arraycopy(objArr2, 0, objArr3, 0, i2);
            return objArr3;
        }
        int length = objArr.length;
        Object[] objArr4 = new Object[length + i2];
        System.arraycopy(objArr, 0, objArr4, 0, length);
        System.arraycopy(objArr2, 0, objArr4, length, i2);
        return objArr4;
    }

    final boolean i(int i) {
        Object obj;
        Object[] objArr = this.d;
        if (objArr == null || (obj = objArr[(i - 1) * 2]) == null) {
            return true;
        }
        int i2 = n2.a;
        return obj != I2.c;
    }

    final void k(int i, w2 w2Var, Object obj, int i2) {
        if (1 > i || i > this.c) {
            throw new IllegalArgumentException();
        }
        if (obj == I2.c) {
            throw new IllegalArgumentException();
        }
        p2.P(i2);
        if (this.b.b1(w2Var) != i) {
            throw new IllegalArgumentException(w2Var.toString());
        }
        if (i != this.f) {
            j(i, w2Var, obj, i2);
        } else {
            if (!(obj instanceof C1104U)) {
                throw new IllegalArgumentException("consructor should be initialized with IdFunctionObject");
            }
            this.g = (C1104U) obj;
            this.h = (short) i2;
        }
    }

    final void l(int i, String str, Object obj) {
        if (1 > i || i > this.c) {
            throw new IllegalArgumentException();
        }
        if (obj == I2.c) {
            throw new IllegalArgumentException();
        }
        p2.P(2);
        if (this.b.c1(str) != i) {
            throw new IllegalArgumentException(str);
        }
        if (i != this.f) {
            j(i, str, obj, 2);
        } else {
            this.g = (C1104U) obj;
            this.h = (short) 2;
        }
    }

    final void m(int i, n2 n2Var, Object obj) {
        if (obj == I2.c) {
            throw new IllegalArgumentException();
        }
        c(i);
        int i2 = i - 1;
        if ((this.e[i2] & 1) == 0) {
            if (n2Var == this.b) {
                if (obj == null) {
                    obj = I2.d;
                }
                int i3 = i2 * 2;
                synchronized (this) {
                    this.d[i3] = obj;
                }
                return;
            }
            Object obj2 = this.d[(i2 * 2) + 1];
            if (!(obj2 instanceof w2)) {
                n2Var.v((String) obj2, n2Var, obj);
            } else if (n2Var instanceof y2) {
                ((y2) n2Var).q((w2) obj2, n2Var, obj);
            }
        }
    }

    final void n(int i, int i2) {
        p2.P(i2);
        c(i);
        synchronized (this) {
            this.e[i - 1] = (short) i2;
        }
    }
}
