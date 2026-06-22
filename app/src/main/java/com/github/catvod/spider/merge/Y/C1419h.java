package com.github.catvod.spider.merge.y;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.y.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1419h extends AbstractC1409A {
    private final double e;
    private final int f;

    public C1419h(String str, boolean z, double d, int i) {
        super(str, z);
        this.e = d;
        this.f = i;
    }

    @Override // com.github.catvod.spider.merge.y.InterfaceC1420i
    public final boolean a(N n, Object obj, Object obj2, Object obj3) {
        Object objB = b(n, obj, obj3);
        if (objB == null || !(objB instanceof Number)) {
            return false;
        }
        double dDoubleValue = ((Number) objB).doubleValue();
        int iC = z.c(this.f);
        return iC != 0 ? iC != 1 ? iC != 2 ? iC != 3 ? iC != 4 ? iC == 5 && dDoubleValue <= this.e : dDoubleValue < this.e : dDoubleValue >= this.e : dDoubleValue > this.e : dDoubleValue != this.e : dDoubleValue == this.e;
    }
}
