package com.github.catvod.spider.merge.f1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1126e implements InterfaceC1130f {
    final C1186v0 a;

    C1126e(C1186v0 c1186v0) {
        this.a = c1186v0;
    }

    @Override // com.github.catvod.spider.merge.f1.InterfaceC1130f
    public final void a(Object obj, n2 n2Var) {
        C1185v c1185vH = C1185v.h();
        Class<?>[] clsArr = this.a.c;
        Object objD1 = C1099O.D1(c1185vH, n2Var, obj, C1099O.F1(clsArr[clsArr.length - 1]));
        C1186v0 c1186v0 = this.a;
        Object obj2 = c1186v0.g;
        if (obj2 == null) {
            c1186v0.c(n2Var, new Object[]{objD1});
        } else {
            c1186v0.c(obj2, new Object[]{n2Var, objD1});
        }
    }

    @Override // com.github.catvod.spider.merge.f1.InterfaceC1130f
    public final InterfaceC1098N b(String str, n2 n2Var) {
        C1186v0 c1186v0 = this.a;
        if (c1186v0.f == null) {
            c1186v0.f = new C1183u0(c1186v0, n2Var, p2.m0(n2Var), str);
        }
        return c1186v0.f;
    }
}
