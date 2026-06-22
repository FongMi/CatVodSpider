package com.github.catvod.spider.merge.y;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.y.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1421j implements InterfaceC1420i {
    private boolean a;
    private List<InterfaceC1420i> b;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.y.i>] */
    public C1421j(InterfaceC1420i interfaceC1420i, InterfaceC1420i interfaceC1420i2, boolean z) {
        ArrayList arrayList = new ArrayList(2);
        this.b = arrayList;
        arrayList.add(interfaceC1420i);
        this.b.add(interfaceC1420i2);
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.y.i>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.y.i>] */
    @Override // com.github.catvod.spider.merge.y.InterfaceC1420i
    public final boolean a(N n, Object obj, Object obj2, Object obj3) {
        if (this.a) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                if (!((InterfaceC1420i) it.next()).a(n, obj, obj2, obj3)) {
                    return false;
                }
            }
            return true;
        }
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            if (((InterfaceC1420i) it2.next()).a(n, obj, obj2, obj3)) {
                return true;
            }
        }
        return false;
    }
}
