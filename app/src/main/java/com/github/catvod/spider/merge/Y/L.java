package com.github.catvod.spider.merge.y;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class L extends AbstractC1409A {
    private final Object e;
    private boolean f;

    public L(String str, boolean z, Object obj, boolean z2) {
        super(str, z);
        this.f = true;
        if (obj == null) {
            throw new IllegalArgumentException("value is null");
        }
        this.e = obj;
        this.f = z2;
    }

    @Override // com.github.catvod.spider.merge.y.InterfaceC1420i
    public final boolean a(N n, Object obj, Object obj2, Object obj3) {
        boolean zEquals = this.e.equals(b(n, obj, obj3));
        return !this.f ? !zEquals : zEquals;
    }
}
