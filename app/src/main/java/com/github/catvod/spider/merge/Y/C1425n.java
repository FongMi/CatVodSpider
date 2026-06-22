package com.github.catvod.spider.merge.y;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.y.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1425n extends AbstractC1409A {
    private final long[] e;
    private final boolean f;

    public C1425n(String str, boolean z, long[] jArr, boolean z2) {
        super(str, z);
        this.e = jArr;
        this.f = z2;
    }

    @Override // com.github.catvod.spider.merge.y.InterfaceC1420i
    public final boolean a(N n, Object obj, Object obj2, Object obj3) {
        Object objB = b(n, obj, obj3);
        if (objB == null) {
            return false;
        }
        if (objB instanceof Number) {
            long jN0 = com.github.catvod.spider.merge.H.A.n0((Number) objB);
            for (long j : this.e) {
                if (j == jN0) {
                    return !this.f;
                }
            }
        }
        return this.f;
    }
}
