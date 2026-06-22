package com.github.catvod.spider.merge.f1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class Q0 extends C1150k {
    public String D1() {
        return null;
    }

    protected abstract int E1();

    protected abstract int F1();

    protected abstract int G1();

    protected boolean H1(int i) {
        return false;
    }

    protected abstract String I1(int i);

    public Object J1(C1185v c1185v, n2 n2Var, int i, Object obj, Object obj2) {
        throw new C1096L("resumeGenerator() not implemented");
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k
    final String q1(int i, int i2) {
        String strD1 = D1();
        if (strD1 == null) {
            return super.q1(i, i2);
        }
        E2 e2 = new E2(1);
        e2.e(1, i);
        return C1197z.k(strD1, i2, e2);
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k
    public final int r1() {
        return G1();
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k
    public final int u1() {
        int iG1 = G1();
        if (E1() != 120) {
            return iG1;
        }
        E0 e0 = C1185v.h().d;
        while (true) {
            if (e0 == null) {
                e0 = null;
                break;
            }
            if (e0.j == this) {
                break;
            }
            e0 = e0.n;
        }
        return e0 == null ? iG1 : e0.k.length;
    }
}
