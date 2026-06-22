package com.github.catvod.spider.merge.f1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1114b implements InterfaceC1130f {
    final Object a;

    C1114b(Object obj) {
        this.a = obj;
    }

    @Override // com.github.catvod.spider.merge.f1.InterfaceC1130f
    public final void a(Object obj, n2 n2Var) {
        Object obj2 = this.a;
        if (obj2 instanceof InterfaceC1098N) {
            InterfaceC1098N interfaceC1098N = (InterfaceC1098N) obj2;
            interfaceC1098N.b(C1185v.h(), interfaceC1098N.B(), n2Var, new Object[]{obj});
        }
    }

    @Override // com.github.catvod.spider.merge.f1.InterfaceC1130f
    public final InterfaceC1098N b(String str, n2 n2Var) {
        Object obj = this.a;
        if (obj instanceof InterfaceC1098N) {
            return (InterfaceC1098N) obj;
        }
        return null;
    }
}
