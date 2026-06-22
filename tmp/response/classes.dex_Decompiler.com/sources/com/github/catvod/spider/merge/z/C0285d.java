package com.github.catvod.spider.merge.z;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0285d extends com.github.catvod.spider.merge.B.a {
    public static final C0285d a = new C0285d();

    private C0285d() {
    }

    @Override // com.github.catvod.spider.merge.B.a
    public final boolean E(Object obj, Object obj2) {
        C0283b c0283b = (C0283b) obj;
        C0283b c0283b2 = (C0283b) obj2;
        if (c0283b == c0283b2) {
            return true;
        }
        return c0283b != null && c0283b2 != null && c0283b.a.b == c0283b2.a.b && c0283b.b == c0283b2.b && c0283b.e.equals(c0283b2.e);
    }

    @Override // com.github.catvod.spider.merge.B.a
    public final int F(Object obj) {
        C0283b c0283b = (C0283b) obj;
        return c0283b.e.hashCode() + ((((c0283b.a.b + 217) * 31) + c0283b.b) * 31);
    }
}
