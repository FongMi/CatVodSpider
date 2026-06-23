package com.github.catvod.spider.merge.FM.y;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.y.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0462d extends com.github.catvod.spider.merge.FM.A.a {
    public static final C0462d a = new C0462d();

    private C0462d() {
    }

    @Override // com.github.catvod.spider.merge.FM.A.a
    public final boolean E(Object obj, Object obj2) {
        C0460b c0460b = (C0460b) obj;
        C0460b c0460b2 = (C0460b) obj2;
        if (c0460b == c0460b2) {
            return true;
        }
        return c0460b != null && c0460b2 != null && c0460b.a.b == c0460b2.a.b && c0460b.b == c0460b2.b && c0460b.e.equals(c0460b2.e);
    }

    @Override // com.github.catvod.spider.merge.FM.A.a
    public final int F(Object obj) {
        C0460b c0460b = (C0460b) obj;
        return c0460b.e.hashCode() + ((((c0460b.a.b + 217) * 31) + c0460b.b) * 31);
    }
}
