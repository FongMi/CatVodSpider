package com.github.catvod.spider.merge.y;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class I extends AbstractC1409A {
    private final String[] e;
    private final boolean f;

    public I(String str, boolean z, String[] strArr, boolean z2) {
        super(str, z);
        this.e = strArr;
        this.f = z2;
    }

    @Override // com.github.catvod.spider.merge.y.InterfaceC1420i
    public final boolean a(N n, Object obj, Object obj2, Object obj3) {
        Object objB = b(n, obj, obj3);
        for (String str : this.e) {
            if (str == objB || (str != null && str.equals(objB))) {
                return !this.f;
            }
        }
        return this.f;
    }
}
