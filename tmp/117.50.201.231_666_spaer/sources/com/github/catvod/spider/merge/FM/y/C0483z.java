package com.github.catvod.spider.merge.FM.y;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.y.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0483z extends C0460b {
    private final C0455D f;
    private final boolean g;

    public C0483z(AbstractC0471m abstractC0471m, int i, X x) {
        super(abstractC0471m, i, x, l0.a);
        this.g = false;
        this.f = null;
    }

    public C0483z(C0483z c0483z, AbstractC0471m abstractC0471m) {
        super(c0483z, abstractC0471m, c0483z.c, c0483z.e);
        this.f = c0483z.f;
        this.g = d(c0483z, abstractC0471m);
    }

    public C0483z(C0483z c0483z, AbstractC0471m abstractC0471m, C0455D c0455d) {
        super(c0483z, abstractC0471m, c0483z.c, c0483z.e);
        this.f = c0455d;
        this.g = d(c0483z, abstractC0471m);
    }

    public C0483z(C0483z c0483z, AbstractC0471m abstractC0471m, X x) {
        super(c0483z, abstractC0471m, x, c0483z.e);
        this.f = c0483z.f;
        this.g = d(c0483z, abstractC0471m);
    }

    private static boolean d(C0483z c0483z, AbstractC0471m abstractC0471m) {
        return c0483z.g || ((abstractC0471m instanceof AbstractC0479v) && ((AbstractC0479v) abstractC0471m).h);
    }

    @Override // com.github.catvod.spider.merge.FM.y.C0460b
    public final boolean a(C0460b c0460b) {
        boolean zEquals = true;
        if (this == c0460b) {
            return true;
        }
        if (!(c0460b instanceof C0483z)) {
            return false;
        }
        C0483z c0483z = (C0483z) c0460b;
        if (this.g != c0483z.g) {
            return false;
        }
        C0455D c0455d = this.f;
        C0455D c0455d2 = c0483z.f;
        if (c0455d != null) {
            zEquals = c0455d.equals(c0455d2);
        } else if (c0455d2 != null) {
            zEquals = false;
        }
        if (zEquals) {
            return super.a(c0460b);
        }
        return false;
    }

    public final C0455D e() {
        return this.f;
    }

    public final boolean f() {
        return this.g;
    }

    @Override // com.github.catvod.spider.merge.FM.y.C0460b
    public final int hashCode() {
        return com.github.catvod.spider.merge.FM.A.l.c(com.github.catvod.spider.merge.FM.A.l.j(com.github.catvod.spider.merge.FM.A.l.i(com.github.catvod.spider.merge.FM.A.l.j(com.github.catvod.spider.merge.FM.A.l.j(com.github.catvod.spider.merge.FM.A.l.i(com.github.catvod.spider.merge.FM.A.l.i(7, this.a.b), this.b), this.c), this.e), this.g ? 1 : 0), this.f), 6);
    }
}
