package com.github.catvod.spider.merge.y;

import java.math.BigDecimal;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.y.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1427p extends AbstractC1409A {
    private final long e;
    private final int f;
    private BigDecimal g;
    private Float h;
    private Double i;

    public C1427p(String str, boolean z, long j, int i) {
        super(str, z);
        this.e = j;
        this.f = i;
    }

    @Override // com.github.catvod.spider.merge.y.InterfaceC1420i
    public final boolean a(N n, Object obj, Object obj2, Object obj3) {
        Object objB = b(n, obj, obj3);
        if (objB == null || !(objB instanceof Number)) {
            return false;
        }
        if (objB instanceof BigDecimal) {
            if (this.g == null) {
                this.g = BigDecimal.valueOf(this.e);
            }
            int iCompareTo = this.g.compareTo((BigDecimal) objB);
            int iC = z.c(this.f);
            return iC != 0 ? iC != 1 ? iC != 2 ? iC != 3 ? iC != 4 ? iC == 5 && iCompareTo >= 0 : iCompareTo > 0 : iCompareTo <= 0 : iCompareTo < 0 : iCompareTo != 0 : iCompareTo == 0;
        }
        if (objB instanceof Float) {
            if (this.h == null) {
                this.h = Float.valueOf(this.e);
            }
            int iCompareTo2 = this.h.compareTo((Float) objB);
            int iC2 = z.c(this.f);
            return iC2 != 0 ? iC2 != 1 ? iC2 != 2 ? iC2 != 3 ? iC2 != 4 ? iC2 == 5 && iCompareTo2 >= 0 : iCompareTo2 > 0 : iCompareTo2 <= 0 : iCompareTo2 < 0 : iCompareTo2 != 0 : iCompareTo2 == 0;
        }
        if (!(objB instanceof Double)) {
            long jN0 = com.github.catvod.spider.merge.H.A.n0((Number) objB);
            int iC3 = z.c(this.f);
            return iC3 != 0 ? iC3 != 1 ? iC3 != 2 ? iC3 != 3 ? iC3 != 4 ? iC3 == 5 && jN0 <= this.e : jN0 < this.e : jN0 >= this.e : jN0 > this.e : jN0 != this.e : jN0 == this.e;
        }
        if (this.i == null) {
            this.i = Double.valueOf(this.e);
        }
        int iCompareTo3 = this.i.compareTo((Double) objB);
        int iC4 = z.c(this.f);
        return iC4 != 0 ? iC4 != 1 ? iC4 != 2 ? iC4 != 3 ? iC4 != 4 ? iC4 == 5 && iCompareTo3 >= 0 : iCompareTo3 > 0 : iCompareTo3 <= 0 : iCompareTo3 < 0 : iCompareTo3 != 0 : iCompareTo3 == 0;
    }
}
