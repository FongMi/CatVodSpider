package com.github.catvod.spider.merge.f1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class v2 extends Z1 {
    private n2 b;
    private int c;
    private String d;

    private v2(n2 n2Var, int i, String str) {
        this.b = n2Var;
        this.c = i;
        this.d = str;
    }

    static Z1 e(C1185v c1185v, n2 n2Var, Object obj, String str) {
        int i;
        n2 n2VarU1 = C1157l2.u1(c1185v, obj, n2Var);
        if (n2VarU1 == null) {
            throw C1157l2.H1(obj, str);
        }
        if (str.equals("__proto__")) {
            i = 1;
        } else {
            if (!str.equals("__parent__")) {
                throw new IllegalArgumentException(str);
            }
            i = 2;
        }
        if (!c1185v.t(5)) {
            i = 0;
        }
        return new v2(n2VarU1, i, str);
    }

    @Override // com.github.catvod.spider.merge.f1.Z1
    public final boolean a(C1185v c1185v) {
        if (this.c == 0) {
            return C1157l2.n(this.b, this.d);
        }
        return false;
    }

    @Override // com.github.catvod.spider.merge.f1.Z1
    public final Object b(C1185v c1185v) {
        int i = this.c;
        if (i == 0) {
            return C1157l2.S(this.b, this.d, c1185v);
        }
        if (i == 1) {
            return this.b.C();
        }
        if (i == 2) {
            return this.b.B();
        }
        C1162n0.c();
        throw null;
    }

    @Override // com.github.catvod.spider.merge.f1.Z1
    @Deprecated
    public final Object c() {
        throw new IllegalStateException();
    }

    @Override // com.github.catvod.spider.merge.f1.Z1
    public final Object d(C1185v c1185v, n2 n2Var, Object obj) {
        int i = this.c;
        if (i == 0) {
            n2 n2Var2 = this.b;
            String str = this.d;
            Class<?> cls = C1157l2.a;
            p2.L0(n2Var2, str, obj);
            return obj;
        }
        if (i != 1 && i != 2) {
            C1162n0.c();
            throw null;
        }
        n2 n2VarU1 = C1157l2.u1(c1185v, obj, n2Var);
        if (n2VarU1 != null) {
            n2 n2VarC = n2VarU1;
            while (n2VarC != this.b) {
                n2VarC = this.c == 1 ? n2VarC.C() : n2VarC.B();
                if (n2VarC == null) {
                }
            }
            throw C1185v.H("msg.cyclic.value", this.d);
        }
        if (this.c == 1) {
            n2 n2Var3 = this.b;
            if ((n2Var3 instanceof p2) && !((p2) n2Var3).B0()) {
                c1185v.getClass();
            }
            c1185v.getClass();
            this.b.E(n2VarU1);
        } else {
            this.b.D(n2VarU1);
        }
        return n2VarU1;
    }
}
