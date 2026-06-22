package com.github.catvod.spider.merge.f1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1110a implements InterfaceC1118c {
    final Object a;

    C1110a(Object obj) {
        this.a = obj;
    }

    @Override // com.github.catvod.spider.merge.f1.InterfaceC1118c
    public final Object a(n2 n2Var) {
        Object obj = this.a;
        if (!(obj instanceof InterfaceC1098N)) {
            return G2.b;
        }
        InterfaceC1098N interfaceC1098N = (InterfaceC1098N) obj;
        return interfaceC1098N.b(C1185v.h(), interfaceC1098N.B(), n2Var, C1157l2.y);
    }

    @Override // com.github.catvod.spider.merge.f1.InterfaceC1118c
    public final InterfaceC1098N b(String str, n2 n2Var) {
        Object obj = this.a;
        if (obj instanceof InterfaceC1098N) {
            return (InterfaceC1098N) obj;
        }
        return null;
    }
}
