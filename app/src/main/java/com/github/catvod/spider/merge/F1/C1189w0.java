package com.github.catvod.spider.merge.f1;

import java.util.Comparator;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1189w0 implements Comparator<Object> {
    final /* synthetic */ Object[] b;
    final /* synthetic */ InterfaceC1161n c;
    final /* synthetic */ C1185v d;
    final /* synthetic */ n2 e;
    final /* synthetic */ n2 f;

    C1189w0(Object[] objArr, InterfaceC1161n interfaceC1161n, C1185v c1185v, n2 n2Var, n2 n2Var2) {
        this.b = objArr;
        this.c = interfaceC1161n;
        this.d = c1185v;
        this.e = n2Var;
        this.f = n2Var2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Object[] objArr = this.b;
        objArr[0] = obj;
        objArr[1] = obj2;
        int iCompare = Double.compare(C1157l2.p1(this.c.b(this.d, this.e, this.f, objArr)), 0.0d);
        if (iCompare < 0) {
            return -1;
        }
        return iCompare > 0 ? 1 : 0;
    }
}
