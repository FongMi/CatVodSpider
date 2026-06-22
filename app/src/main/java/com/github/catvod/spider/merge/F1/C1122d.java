package com.github.catvod.spider.merge.f1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1122d implements InterfaceC1118c {
    final C1186v0 a;

    C1122d(C1186v0 c1186v0) {
        this.a = c1186v0;
    }

    @Override // com.github.catvod.spider.merge.f1.InterfaceC1118c
    public final Object a(n2 n2Var) {
        C1186v0 c1186v0 = this.a;
        Object obj = c1186v0.g;
        return obj == null ? c1186v0.c(n2Var, C1157l2.y) : c1186v0.c(obj, new Object[]{n2Var});
    }

    @Override // com.github.catvod.spider.merge.f1.InterfaceC1118c
    public final InterfaceC1098N b(String str, n2 n2Var) {
        C1186v0 c1186v0 = this.a;
        if (c1186v0.e == null) {
            c1186v0.e = new C1180t0(c1186v0, n2Var, p2.m0(n2Var), str);
        }
        return c1186v0.e;
    }
}
