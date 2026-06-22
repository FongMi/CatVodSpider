package com.github.catvod.spider.merge.f1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class E1 {
    n2 a;
    private Object b;
    InterfaceC1161n c;
    private Object d;
    InterfaceC1161n e;

    E1(C1185v c1185v, n2 n2Var, Object obj) {
        G2 g2 = G2.b;
        this.b = g2;
        this.d = g2;
        if (!(obj instanceof InterfaceC1182u)) {
            throw C1157l2.C1("msg.constructor.expected", new Object[0]);
        }
        this.a = ((InterfaceC1182u) obj).a(c1185v, n2Var, new Object[]{new C1165o0(n2Var, 2, new InterfaceC1161n() { // from class: com.github.catvod.spider.merge.f1.D1
            @Override // com.github.catvod.spider.merge.f1.InterfaceC1161n
            public final Object b(C1185v c1185v2, n2 n2Var2, n2 n2Var3, Object[] objArr) {
                E1.a(this.b, objArr);
                return G2.b;
            }
        })});
        Object obj2 = this.b;
        if (!(obj2 instanceof InterfaceC1161n)) {
            throw C1157l2.C1("msg.function.expected", new Object[0]);
        }
        this.c = (InterfaceC1161n) obj2;
        Object obj3 = this.d;
        if (!(obj3 instanceof InterfaceC1161n)) {
            throw C1157l2.C1("msg.function.expected", new Object[0]);
        }
        this.e = (InterfaceC1161n) obj3;
    }

    public static void a(E1 e1, Object[] objArr) {
        if (!G2.b(e1.b) || !G2.b(e1.d)) {
            throw C1157l2.C1("msg.promise.capability.state", new Object[0]);
        }
        if (objArr.length > 0) {
            e1.b = objArr[0];
        }
        if (objArr.length > 1) {
            e1.d = objArr[1];
        }
        G2 g2 = G2.b;
    }
}
