package com.github.catvod.spider.merge.u;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.u.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0652v extends C0633b {
    private final C0655y f;
    private final boolean g;

    public C0652v(AbstractC0640i abstractC0640i, int i, S s) {
        super(abstractC0640i, i, s, b0.a);
        this.g = false;
        this.f = null;
    }

    public C0652v(C0652v c0652v, AbstractC0640i abstractC0640i) {
        super(c0652v, abstractC0640i, c0652v.c, c0652v.e);
        this.f = c0652v.f;
        this.g = d(c0652v, abstractC0640i);
    }

    public C0652v(C0652v c0652v, AbstractC0640i abstractC0640i, S s) {
        super(c0652v, abstractC0640i, s, c0652v.e);
        this.f = c0652v.f;
        this.g = d(c0652v, abstractC0640i);
    }

    public C0652v(C0652v c0652v, AbstractC0640i abstractC0640i, C0655y c0655y) {
        super(c0652v, abstractC0640i, c0652v.c, c0652v.e);
        this.f = c0655y;
        this.g = d(c0652v, abstractC0640i);
    }

    private static boolean d(C0652v c0652v, AbstractC0640i abstractC0640i) {
        return c0652v.g || ((abstractC0640i instanceof r) && ((r) abstractC0640i).h);
    }

    @Override // com.github.catvod.spider.merge.u.C0633b
    public final boolean a(C0633b c0633b) {
        boolean zEquals = true;
        if (this == c0633b) {
            return true;
        }
        if (!(c0633b instanceof C0652v)) {
            return false;
        }
        C0652v c0652v = (C0652v) c0633b;
        if (this.g != c0652v.g) {
            return false;
        }
        C0655y c0655y = this.f;
        C0655y c0655y2 = c0652v.f;
        if (c0655y != null) {
            zEquals = c0655y.equals(c0655y2);
        } else if (c0655y2 != null) {
            zEquals = false;
        }
        if (zEquals) {
            return super.a(c0633b);
        }
        return false;
    }

    public final C0655y e() {
        return this.f;
    }

    public final boolean f() {
        return this.g;
    }

    @Override // com.github.catvod.spider.merge.u.C0633b
    public final int hashCode() {
        return com.github.catvod.spider.merge.F.a.b(com.github.catvod.spider.merge.F.a.i(com.github.catvod.spider.merge.F.a.h(com.github.catvod.spider.merge.F.a.i(com.github.catvod.spider.merge.F.a.i(com.github.catvod.spider.merge.F.a.h(com.github.catvod.spider.merge.F.a.h(7, this.a.b), this.b), this.c), this.e), this.g ? 1 : 0), this.f), 6);
    }
}
