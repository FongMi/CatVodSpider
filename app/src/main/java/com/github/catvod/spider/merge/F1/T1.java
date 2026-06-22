package com.github.catvod.spider.merge.f1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class T1 {
    U1 a;
    private int b;
    private int c;
    private Object[] d;
    private int[] e;

    T1(U1 u1) {
        this.a = u1;
    }

    public final boolean a() {
        return this.c < 0;
    }

    public final Object b() {
        Object obj = this.d[this.b];
        if (obj == I2.d) {
            return null;
        }
        return obj;
    }

    public final int c() {
        return this.e[this.b];
    }

    final void d(Object[] objArr, int[] iArr, int i) {
        this.d = objArr;
        this.e = iArr;
        this.b = -1;
        this.c = i;
    }

    public final void e() {
        int i = this.c;
        if (i == -1) {
            C1162n0.c();
            throw null;
        }
        if (i == 0) {
            this.c = -1;
            this.b = -1;
            return;
        }
        int i2 = this.b;
        while (true) {
            this.b = i2 + 1;
            Object obj = this.d[this.b];
            if (obj != null && obj != U1.g) {
                this.c--;
                return;
            }
            i2 = this.b;
        }
    }
}
