package com.github.catvod.spider.merge.u;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class U extends com.github.catvod.spider.merge.w.a {
    public static final U a = new U();

    private U() {
    }

    @Override // com.github.catvod.spider.merge.w.a
    public final boolean E(Object obj, Object obj2) {
        C0633b c0633b = (C0633b) obj;
        C0633b c0633b2 = (C0633b) obj2;
        if (c0633b == c0633b2) {
            return true;
        }
        return c0633b != null && c0633b2 != null && c0633b.a.b == c0633b2.a.b && c0633b.c.equals(c0633b2.c);
    }

    @Override // com.github.catvod.spider.merge.w.a
    public final int F(Object obj) {
        C0633b c0633b = (C0633b) obj;
        return com.github.catvod.spider.merge.F.a.b(com.github.catvod.spider.merge.F.a.i(com.github.catvod.spider.merge.F.a.h(7, c0633b.a.b), c0633b.c), 2);
    }
}
