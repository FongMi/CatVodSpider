package com.github.catvod.spider.merge.f1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1149j2 implements InterfaceC1161n {
    String b;
    InterfaceC1161n c;

    C1149j2(InterfaceC1161n interfaceC1161n, String str) {
        this.c = interfaceC1161n;
        this.b = str;
    }

    @Override // com.github.catvod.spider.merge.f1.InterfaceC1161n
    public final Object b(C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        return this.c.b(c1185v, n2Var, n2Var2, new Object[]{this.b, C1157l2.x0(objArr, null, c1185v, n2Var)});
    }
}
