package com.github.catvod.spider.merge.y;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.y.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1422k implements G {
    private final InterfaceC1420i a;

    public C1422k(InterfaceC1420i interfaceC1420i) {
        this.a = interfaceC1420i;
    }

    @Override // com.github.catvod.spider.merge.y.G
    public final Object a(N n, Object obj, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        C1413b c1413b = new C1413b();
        if (!(obj2 instanceof Iterable)) {
            if (this.a.a(n, obj, obj2, obj2)) {
                return obj2;
            }
            return null;
        }
        for (Object obj3 : (Iterable) obj2) {
            if (this.a.a(n, obj, obj2, obj3)) {
                c1413b.add(obj3);
            }
        }
        return c1413b;
    }
}
