package com.github.catvod.spider.merge.f1;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1116b1 extends C1156l1 {
    Object j;
    int k;
    Class<?> l;

    public C1116b1(n2 n2Var, Object obj) {
        super(n2Var, null, C1157l2.j);
        Class<?> cls = obj.getClass();
        if (!cls.isArray()) {
            throw new RuntimeException("Array expected");
        }
        this.j = obj;
        this.k = Array.getLength(obj);
        this.l = cls.getComponentType();
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1, com.github.catvod.spider.merge.f1.n2
    public final n2 C() {
        if (this.b == null) {
            this.b = D2.r1(p2.u0(this.c), B2.Array);
        }
        return this.b;
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1, com.github.catvod.spider.merge.f1.n2
    public final String F() {
        return "JavaArray";
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1, com.github.catvod.spider.merge.f1.L2
    public final Object c() {
        return this.j;
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1, com.github.catvod.spider.merge.f1.y2
    public final Object e(w2 w2Var, n2 n2Var) {
        return x2.g.equals(w2Var) ? Boolean.TRUE : I2.c;
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1
    public final boolean equals(Object obj) {
        if (obj instanceof C1116b1) {
            Object obj2 = ((C1116b1) obj).j;
            Object obj3 = this.j;
            if (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1, com.github.catvod.spider.merge.f1.n2
    public final boolean g(n2 n2Var) {
        if (!(n2Var instanceof L2)) {
            return false;
        }
        return this.l.isInstance(((L2) n2Var).c());
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1
    public final int hashCode() {
        Object obj = this.j;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1, com.github.catvod.spider.merge.f1.n2
    public final Object l(String str, n2 n2Var) {
        if (str.equals("length")) {
            return Integer.valueOf(this.k);
        }
        Object objL = super.l(str, n2Var);
        if (objL != I2.c || p2.y0(C(), str)) {
            return objL;
        }
        throw C1185v.H("msg.java.member.not.found", this.j.getClass().getName(), str);
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1, com.github.catvod.spider.merge.f1.n2
    public final Object m(Class<?> cls) {
        return (cls == null || cls == C1157l2.l) ? this.j.toString() : cls == C1157l2.a ? Boolean.TRUE : cls == C1157l2.i ? C1157l2.t : this;
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1, com.github.catvod.spider.merge.f1.y2
    public final boolean n(w2 w2Var, n2 n2Var) {
        return x2.g.equals(w2Var);
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1, com.github.catvod.spider.merge.f1.y2
    public final void o(w2 w2Var) {
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1, com.github.catvod.spider.merge.f1.n2
    public final void t(int i, n2 n2Var, Object obj) {
        if (i < 0 || i >= this.k) {
            throw C1185v.H("msg.java.array.index.out.of.bounds", String.valueOf(i), String.valueOf(this.k - 1));
        }
        Object obj2 = this.j;
        Class<?> cls = this.l;
        Object[] objArr = C1185v.x;
        Array.set(obj2, i, C1156l1.f(cls, obj));
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1, com.github.catvod.spider.merge.f1.n2
    public final Object[] u() {
        int i = this.k;
        Object[] objArr = new Object[i];
        while (true) {
            i--;
            if (i < 0) {
                return objArr;
            }
            objArr[i] = Integer.valueOf(i);
        }
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1, com.github.catvod.spider.merge.f1.n2
    public final void v(String str, n2 n2Var, Object obj) {
        if (!str.equals("length")) {
            throw C1185v.H("msg.java.array.member.not.found", str);
        }
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1, com.github.catvod.spider.merge.f1.n2
    public final Object w(int i, n2 n2Var) {
        if (i < 0 || i >= this.k) {
            return G2.b;
        }
        C1185v c1185vH = C1185v.h();
        return c1185vH.s().c(c1185vH, this, Array.get(this.j, i), this.l);
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1, com.github.catvod.spider.merge.f1.n2
    public final boolean x(String str, n2 n2Var) {
        return str.equals("length") || super.x(str, n2Var);
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1, com.github.catvod.spider.merge.f1.n2
    public final boolean z(int i, n2 n2Var) {
        return i >= 0 && i < this.k;
    }
}
