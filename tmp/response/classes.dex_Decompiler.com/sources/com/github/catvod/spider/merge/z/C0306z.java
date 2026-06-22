package com.github.catvod.spider.merge.z;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0306z extends C0283b {
    private final C0278D f;
    private final boolean g;

    public C0306z(AbstractC0294m abstractC0294m, int i, X x) {
        super(abstractC0294m, i, x, l0.a);
        this.g = false;
        this.f = null;
    }

    public C0306z(C0306z c0306z, AbstractC0294m abstractC0294m) {
        super(c0306z, abstractC0294m, c0306z.c, c0306z.e);
        this.f = c0306z.f;
        this.g = d(c0306z, abstractC0294m);
    }

    public C0306z(C0306z c0306z, AbstractC0294m abstractC0294m, C0278D c0278d) {
        super(c0306z, abstractC0294m, c0306z.c, c0306z.e);
        this.f = c0278d;
        this.g = d(c0306z, abstractC0294m);
    }

    public C0306z(C0306z c0306z, AbstractC0294m abstractC0294m, X x) {
        super(c0306z, abstractC0294m, x, c0306z.e);
        this.f = c0306z.f;
        this.g = d(c0306z, abstractC0294m);
    }

    private static boolean d(C0306z c0306z, AbstractC0294m abstractC0294m) {
        return c0306z.g || ((abstractC0294m instanceof AbstractC0302v) && ((AbstractC0302v) abstractC0294m).h);
    }

    @Override // com.github.catvod.spider.merge.z.C0283b
    public final boolean a(C0283b c0283b) {
        boolean zEquals = true;
        if (this == c0283b) {
            return true;
        }
        if (!(c0283b instanceof C0306z)) {
            return false;
        }
        C0306z c0306z = (C0306z) c0283b;
        if (this.g != c0306z.g) {
            return false;
        }
        C0278D c0278d = this.f;
        C0278D c0278d2 = c0306z.f;
        if (c0278d != null) {
            zEquals = c0278d.equals(c0278d2);
        } else if (c0278d2 != null) {
            zEquals = false;
        }
        if (zEquals) {
            return super.a(c0283b);
        }
        return false;
    }

    public final C0278D e() {
        return this.f;
    }

    public final boolean f() {
        return this.g;
    }

    @Override // com.github.catvod.spider.merge.z.C0283b
    public final int hashCode() {
        return com.github.catvod.spider.merge.B.l.b(com.github.catvod.spider.merge.B.l.g(com.github.catvod.spider.merge.B.l.f(com.github.catvod.spider.merge.B.l.g(com.github.catvod.spider.merge.B.l.g(com.github.catvod.spider.merge.B.l.f(com.github.catvod.spider.merge.B.l.f(7, this.a.b), this.b), this.c), this.e), this.g ? 1 : 0), this.f), 6);
    }
}
