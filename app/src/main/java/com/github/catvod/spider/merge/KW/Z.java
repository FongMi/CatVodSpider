package com.github.catvod.spider.merge.KW;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class Z extends com.github.catvod.spider.merge.Bk.a {
    public static final Z a = new Z();

    private Z() {
    }

    @Override // com.github.catvod.spider.merge.Bk.a
    public final boolean E(Object obj, Object obj2) {
        C0814b c0814b = (C0814b) obj;
        C0814b c0814b2 = (C0814b) obj2;
        if (c0814b == c0814b2) {
            return true;
        }
        return c0814b != null && c0814b2 != null && c0814b.a.b == c0814b2.a.b && c0814b.c.equals(c0814b2.c);
    }

    @Override // com.github.catvod.spider.merge.Bk.a
    public final int F(Object obj) {
        C0814b c0814b = (C0814b) obj;
        return com.github.catvod.spider.merge.Bk.l.b(com.github.catvod.spider.merge.Bk.l.g(com.github.catvod.spider.merge.Bk.l.f(7, c0814b.a.b), c0814b.c), 2);
    }
}
