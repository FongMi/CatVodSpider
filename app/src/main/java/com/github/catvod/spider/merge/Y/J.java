package com.github.catvod.spider.merge.y;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class J extends AbstractC1409A {
    private final String e;
    private final int f;

    public J(String str, boolean z, String str2, int i) {
        super(str, z);
        this.e = str2;
        this.f = i;
    }

    @Override // com.github.catvod.spider.merge.y.InterfaceC1420i
    public final boolean a(N n, Object obj, Object obj2, Object obj3) {
        Object objB = b(n, obj, obj3);
        int i = this.f;
        if (i == 1) {
            return this.e.equals(objB);
        }
        if (i == 2) {
            return !this.e.equals(objB);
        }
        if (objB == null) {
            return false;
        }
        int iCompareTo = this.e.compareTo(objB.toString());
        int i2 = this.f;
        return i2 == 4 ? iCompareTo <= 0 : i2 == 3 ? iCompareTo < 0 : i2 == 6 ? iCompareTo >= 0 : i2 == 5 && iCompareTo > 0;
    }
}
