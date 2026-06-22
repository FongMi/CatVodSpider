package com.github.catvod.spider.merge.f1;

import java.io.Serializable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1115b0 implements Cloneable, Serializable {
    C1115b0 b;
    int c;
    boolean d;
    final C1108Y e;
    final C1131f0 f;
    Object[] g;
    int[] h;
    double[] i;
    final C1115b0 j;
    final int k;
    final int l;
    final boolean m;
    boolean n;
    final n2 o;
    Object p;
    double q;
    int r;
    int s;
    n2 t;
    int u;
    int v;

    C1115b0(C1185v c1185v, n2 n2Var, C1108Y c1108y, C1115b0 c1115b0) {
        C1131f0 c1131f0 = c1108y.t;
        this.f = c1131f0;
        c1185v.getClass();
        this.m = c1131f0.d;
        int i = c1131f0.n;
        int i2 = (c1131f0.o + i) - 1;
        this.l = i2;
        this.e = c1108y;
        this.j = this;
        this.k = i;
        this.o = n2Var;
        this.b = c1115b0;
        int i3 = c1115b0 == null ? 0 : c1115b0.c + 1;
        this.c = i3;
        if (i3 > c1185v.m()) {
            throw C1185v.F("Exceeded maximum stack depth");
        }
        this.p = G2.b;
        this.s = c1131f0.E;
        this.u = i2;
    }

    final C1115b0 a() {
        if (!this.d) {
            C1162n0.c();
            throw null;
        }
        try {
            C1115b0 c1115b0 = (C1115b0) clone();
            c1115b0.g = (Object[]) this.g.clone();
            c1115b0.h = (int[]) this.h.clone();
            c1115b0.i = (double[]) this.i.clone();
            c1115b0.d = false;
            return c1115b0;
        } catch (CloneNotSupportedException unused) {
            throw new IllegalStateException();
        }
    }

    public final boolean equals(Object obj) {
        int i = 0;
        if (!(obj instanceof C1115b0)) {
            return false;
        }
        C1185v c1185vE = C1185v.e();
        try {
            if (c1185vE.c != null) {
                boolean zBooleanValue = ((Boolean) C1093I.g(new C1111a0(this, obj))).booleanValue();
                c1185vE.close();
                return zBooleanValue;
            }
            n2 n2VarU0 = p2.u0(this.t);
            C1109Z c1109z = new C1109Z(this, obj, i);
            Object[] objArr = C1157l2.y;
            C1115b0 c1115b0 = this;
            while (true) {
                C1115b0 c1115b02 = c1115b0.b;
                if (c1115b02 == null) {
                    boolean zBooleanValue2 = ((Boolean) C1157l2.p(c1109z, c1185vE, n2VarU0, n2VarU0, objArr, c1115b0.f.A)).booleanValue();
                    c1185vE.close();
                    return zBooleanValue2;
                }
                c1115b0 = c1115b02;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    c1185vE.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public final int hashCode() {
        int iA = 0;
        int i = 0;
        C1115b0 c1115b0 = this;
        while (true) {
            iA = (((iA * 31) + c1115b0.r) * 31) + c1115b0.f.a();
            c1115b0 = c1115b0.b;
            if (c1115b0 == null) {
                break;
            }
            int i2 = i + 1;
            if (i >= 8) {
                break;
            }
            i = i2;
        }
        return iA;
    }
}
