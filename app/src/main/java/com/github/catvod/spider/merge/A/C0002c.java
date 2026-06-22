package com.github.catvod.spider.merge.A;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class C0002c extends com.github.catvod.spider.merge.J.b {
    public static final C0002c a = new C0002c();

    @Override // com.github.catvod.spider.merge.J.b
    public final boolean a(Object obj, Object obj2) {
        C0001b c0001b = (C0001b) obj;
        C0001b c0001b2 = (C0001b) obj2;
        if (c0001b == c0001b2) {
            return true;
        }
        return c0001b != null && c0001b2 != null && c0001b.a.b == c0001b2.a.b && c0001b.b == c0001b2.b && c0001b.e.equals(c0001b2.e);
    }

    @Override // com.github.catvod.spider.merge.J.b
    public final int b(Object obj) {
        C0001b c0001b = (C0001b) obj;
        return c0001b.e.hashCode() + ((((217 + c0001b.a.b) * 31) + c0001b.b) * 31);
    }
}
