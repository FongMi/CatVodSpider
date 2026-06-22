package com.github.catvod.spider.merge.f1;

import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class S1 implements Serializable {
    private int b;
    private transient Object c;
    private transient Object d;
    private transient Object e;
    private transient Object f;
    private transient Object g;
    private transient Object[] h;

    private Object c(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? this.h[i - 5] : this.g : this.f : this.e : this.d : this.c;
    }

    public final void a(Object obj) {
        int i = this.b;
        if (i >= 5) {
            int i2 = (i + 1) - 5;
            if (i2 <= 0) {
                throw new IllegalArgumentException();
            }
            Object[] objArr = this.h;
            if (objArr == null) {
                if (10 >= i2) {
                    i2 = 10;
                }
                this.h = new Object[i2];
            } else {
                int length = objArr.length;
                if (length < i2) {
                    int i3 = length > 5 ? length * 2 : 10;
                    if (i3 >= i2) {
                        i2 = i3;
                    }
                    Object[] objArr2 = new Object[i2];
                    if (i > 5) {
                        System.arraycopy(objArr, 0, objArr2, 0, i - 5);
                    }
                    this.h = objArr2;
                }
            }
        }
        this.b = i + 1;
        if (i == 0) {
            this.c = obj;
            return;
        }
        if (i == 1) {
            this.d = obj;
            return;
        }
        if (i == 2) {
            this.e = obj;
            return;
        }
        if (i == 3) {
            this.f = obj;
        } else if (i != 4) {
            this.h[i - 5] = obj;
        } else {
            this.g = obj;
        }
    }

    public final Object b(int i) {
        if (i >= 0 && i < this.b) {
            return c(i);
        }
        throw new IndexOutOfBoundsException(i + " ∉ [0, " + this.b + ')');
    }

    public final boolean d() {
        return this.b == 0;
    }

    public final Object e() {
        int i = this.b;
        if (i != 0) {
            return c(i - 1);
        }
        throw new RuntimeException("Empty stack");
    }

    public final Object f() {
        Object obj;
        int i = this.b - 1;
        if (i == -1) {
            throw new RuntimeException("Empty stack");
        }
        if (i == 0) {
            obj = this.c;
            this.c = null;
        } else if (i == 1) {
            obj = this.d;
            this.d = null;
        } else if (i == 2) {
            obj = this.e;
            this.e = null;
        } else if (i == 3) {
            obj = this.f;
            this.f = null;
        } else if (i != 4) {
            Object[] objArr = this.h;
            int i2 = i - 5;
            obj = objArr[i2];
            objArr[i2] = null;
        } else {
            obj = this.g;
            this.g = null;
        }
        this.b = i;
        return obj;
    }

    public final void g(Object obj) {
        a(obj);
    }

    public final int h() {
        return this.b;
    }

    public final Object[] i() {
        Object[] objArr = new Object[this.b];
        j(objArr);
        return objArr;
    }

    public final void j(Object[] objArr) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                System.arraycopy(this.h, 0, objArr, 5, i - 5);
                            }
                            objArr[4] = this.g;
                        }
                        objArr[3] = this.f;
                    }
                    objArr[2] = this.e;
                }
                objArr[1] = this.d;
            }
            objArr[0] = this.c;
        }
    }
}
