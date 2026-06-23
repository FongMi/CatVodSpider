package com.github.catvod.spider.merge.FM.y;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class Z extends com.github.catvod.spider.merge.FM.A.a {
    public static final Z a = new Z();

    private Z() {
    }

    @Override // com.github.catvod.spider.merge.FM.A.a
    public final boolean E(Object obj, Object obj2) {
        C0460b c0460b = (C0460b) obj;
        C0460b c0460b2 = (C0460b) obj2;
        if (c0460b == c0460b2) {
            return true;
        }
        return c0460b != null && c0460b2 != null && c0460b.a.b == c0460b2.a.b && c0460b.c.equals(c0460b2.c);
    }

    @Override // com.github.catvod.spider.merge.FM.A.a
    public final int F(Object obj) {
        C0460b c0460b = (C0460b) obj;
        return com.github.catvod.spider.merge.FM.A.l.c(com.github.catvod.spider.merge.FM.A.l.j(com.github.catvod.spider.merge.FM.A.l.i(7, c0460b.a.b), c0460b.c), 2);
    }
}
