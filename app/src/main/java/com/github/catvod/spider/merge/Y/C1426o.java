package com.github.catvod.spider.merge.y;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.y.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1426o extends AbstractC1409A {
    private final Long[] e;
    private final boolean f;

    public C1426o(String str, boolean z, Long[] lArr, boolean z2) {
        super(str, z);
        this.e = lArr;
        this.f = z2;
    }

    @Override // com.github.catvod.spider.merge.y.InterfaceC1420i
    public final boolean a(N n, Object obj, Object obj2, Object obj3) {
        Object objB = b(n, obj, obj3);
        int i = 0;
        if (objB == null) {
            Long[] lArr = this.e;
            int length = lArr.length;
            while (i < length) {
                if (lArr[i] != null) {
                    i++;
                }
            }
            return this.f;
        }
        if (objB instanceof Number) {
            long jN0 = com.github.catvod.spider.merge.H.A.n0((Number) objB);
            Long[] lArr2 = this.e;
            int length2 = lArr2.length;
            while (i < length2) {
                Long l = lArr2[i];
                if (l == null || l.longValue() != jN0) {
                    i++;
                }
            }
        }
        return this.f;
        return !this.f;
    }
}
