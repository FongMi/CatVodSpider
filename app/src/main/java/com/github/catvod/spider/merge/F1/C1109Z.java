package com.github.catvod.spider.merge.f1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.Z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class C1109Z implements InterfaceC1161n {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ C1109Z(Object obj, Object obj2, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // com.github.catvod.spider.merge.f1.InterfaceC1161n
    public final Object b(C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        switch (this.b) {
            case 0:
                C1115b0 c1115b0 = (C1115b0) this.c;
                Object obj = this.d;
                c1115b0.getClass();
                return (Boolean) C1093I.g(new C1111a0(c1115b0, obj));
            default:
                G1 g1 = (G1) this.c;
                H1 h1 = (H1) this.d;
                g1.getClass();
                n2 n2VarY = c1185v.y(n2Var);
                n2 n2Var3 = (AbstractC1106W) n2VarY;
                n2Var3.v("status", n2Var3, " rejected");
                n2Var3.v("reason", n2Var3, objArr.length > 0 ? objArr[0] : G2.b);
                return h1.a(c1185v, n2Var, n2VarY, g1);
        }
    }
}
