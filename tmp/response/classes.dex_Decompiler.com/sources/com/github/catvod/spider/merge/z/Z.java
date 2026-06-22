package com.github.catvod.spider.merge.z;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class Z extends com.github.catvod.spider.merge.B.a {
    public static final Z a = new Z();

    private Z() {
    }

    @Override // com.github.catvod.spider.merge.B.a
    public final boolean E(Object obj, Object obj2) {
        C0283b c0283b = (C0283b) obj;
        C0283b c0283b2 = (C0283b) obj2;
        if (c0283b == c0283b2) {
            return true;
        }
        return c0283b != null && c0283b2 != null && c0283b.a.b == c0283b2.a.b && c0283b.c.equals(c0283b2.c);
    }

    @Override // com.github.catvod.spider.merge.B.a
    public final int F(Object obj) {
        C0283b c0283b = (C0283b) obj;
        return com.github.catvod.spider.merge.B.l.b(com.github.catvod.spider.merge.B.l.g(com.github.catvod.spider.merge.B.l.f(7, c0283b.a.b), c0283b.c), 2);
    }
}
