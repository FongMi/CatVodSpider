package com.github.catvod.spider.merge.KW;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.KW.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0816d extends com.github.catvod.spider.merge.Bk.a {
    public static final C0816d a = new C0816d();

    private C0816d() {
    }

    @Override // com.github.catvod.spider.merge.Bk.a
    public final boolean E(Object obj, Object obj2) {
        C0814b c0814b = (C0814b) obj;
        C0814b c0814b2 = (C0814b) obj2;
        if (c0814b == c0814b2) {
            return true;
        }
        return c0814b != null && c0814b2 != null && c0814b.a.b == c0814b2.a.b && c0814b.b == c0814b2.b && c0814b.e.equals(c0814b2.e);
    }

    @Override // com.github.catvod.spider.merge.Bk.a
    public final int F(Object obj) {
        C0814b c0814b = (C0814b) obj;
        return c0814b.e.hashCode() + ((((c0814b.a.b + 217) * 31) + c0814b.b) * 31);
    }
}
