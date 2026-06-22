package com.github.catvod.spider.merge.y;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.y.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1424m extends AbstractC1409A {
    private final long e;
    private final long f;
    private final boolean g;

    public C1424m(String str, boolean z, long j, long j2, boolean z2) {
        super(str, z);
        this.e = j;
        this.f = j2;
        this.g = z2;
    }

    @Override // com.github.catvod.spider.merge.y.InterfaceC1420i
    public final boolean a(N n, Object obj, Object obj2, Object obj3) {
        Object objB = b(n, obj, obj3);
        if (objB == null) {
            return false;
        }
        if (objB instanceof Number) {
            long jN0 = com.github.catvod.spider.merge.H.A.n0((Number) objB);
            if (jN0 >= this.e && jN0 <= this.f) {
                return !this.g;
            }
        }
        return this.g;
    }
}
