package com.github.catvod.spider.merge.f1;

import java.util.ArrayList;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class G1 {
    final ArrayList<Object> a = new ArrayList<>();
    int b = 1;
    C1135g0 c;
    n2 d;
    E1 e;
    boolean f;

    G1(C1135g0 c1135g0, n2 n2Var, E1 e1, boolean z) {
        this.c = c1135g0;
        this.d = n2Var;
        this.e = e1;
        this.f = z;
    }

    final void a(C1185v c1185v, n2 n2Var) {
        this.e.c.b(c1185v, n2Var, G2.d, new Object[]{c1185v.x(n2Var, this.a.toArray())});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.github.catvod.spider.merge.f1.n] */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.github.catvod.spider.merge.f1.n] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [com.github.catvod.spider.merge.f1.k, com.github.catvod.spider.merge.f1.o0] */
    final Object b(C1185v c1185v, n2 n2Var) {
        InterfaceC1161n interfaceC1161nV = C1157l2.V(this.d, "resolve", c1185v, n2Var);
        n2 n2Var2 = c1185v.v;
        c1185v.v = null;
        for (int i = 0; i != 2097152; i++) {
            G2 g2 = G2.b;
            try {
                boolean zHasNext = this.c.hasNext();
                Object next = zHasNext ? this.c.next() : g2;
                int i2 = 1;
                if (!zHasNext) {
                    int i3 = this.b - 1;
                    this.b = i3;
                    if (i3 == 0) {
                        a(c1185v, n2Var);
                    }
                    return this.e.a;
                }
                this.a.add(g2);
                Object objB = interfaceC1161nV.b(c1185v, n2Var, n2Var2, new Object[]{next});
                final H1 h1 = new H1(i);
                C1165o0 c1165o0 = new C1165o0(n2Var, 1, new InterfaceC1161n() { // from class: com.github.catvod.spider.merge.f1.F1
                    @Override // com.github.catvod.spider.merge.f1.InterfaceC1161n
                    public final Object b(C1185v c1185v2, n2 n2Var3, n2 n2Var4, Object[] objArr) {
                        G1 g1 = this.b;
                        H1 h12 = h1;
                        g1.getClass();
                        Object obj = objArr.length > 0 ? objArr[0] : G2.b;
                        if (!g1.f) {
                            n2 n2VarY = c1185v2.y(n2Var3);
                            n2 n2Var5 = (AbstractC1106W) n2VarY;
                            n2Var5.v("status", n2Var5, "fulfilled");
                            n2Var5.v("value", n2Var5, obj);
                            obj = n2VarY;
                        }
                        return h12.a(c1185v2, n2Var3, obj, g1);
                    }
                });
                ?? c1165o02 = this.e.e;
                if (!this.f) {
                    c1165o02 = new C1165o0(n2Var, 1, new C1109Z(this, h1, i2));
                    c1165o02.B1();
                }
                this.b++;
                ?? V = C1157l2.V(objB, "then", c1185v, n2Var);
                n2 n2Var3 = c1185v.v;
                c1185v.v = null;
                V.b(c1185v, n2Var, n2Var3, new Object[]{c1165o0, c1165o02});
            } catch (Throwable th) {
                this.c.c();
                throw th;
            }
        }
        throw C1157l2.J0("msg.promise.all.toobig", new Object[0]);
    }
}
