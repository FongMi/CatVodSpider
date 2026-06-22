package com.github.catvod.spider.merge.KW;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.KW.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0837z extends C0814b {
    private final D f;
    private final boolean g;

    public C0837z(AbstractC0825m abstractC0825m, int i, X x) {
        super(abstractC0825m, i, x, l0.a);
        this.g = false;
        this.f = null;
    }

    public C0837z(C0837z c0837z, AbstractC0825m abstractC0825m) {
        super(c0837z, abstractC0825m, c0837z.c, c0837z.e);
        this.f = c0837z.f;
        this.g = d(c0837z, abstractC0825m);
    }

    public C0837z(C0837z c0837z, AbstractC0825m abstractC0825m, D d) {
        super(c0837z, abstractC0825m, c0837z.c, c0837z.e);
        this.f = d;
        this.g = d(c0837z, abstractC0825m);
    }

    public C0837z(C0837z c0837z, AbstractC0825m abstractC0825m, X x) {
        super(c0837z, abstractC0825m, x, c0837z.e);
        this.f = c0837z.f;
        this.g = d(c0837z, abstractC0825m);
    }

    private static boolean d(C0837z c0837z, AbstractC0825m abstractC0825m) {
        return c0837z.g || ((abstractC0825m instanceof AbstractC0833v) && ((AbstractC0833v) abstractC0825m).h);
    }

    @Override // com.github.catvod.spider.merge.KW.C0814b
    public final boolean a(C0814b c0814b) {
        boolean zEquals = true;
        if (this == c0814b) {
            return true;
        }
        if (!(c0814b instanceof C0837z)) {
            return false;
        }
        C0837z c0837z = (C0837z) c0814b;
        if (this.g != c0837z.g) {
            return false;
        }
        D d = this.f;
        D d2 = c0837z.f;
        if (d != null) {
            zEquals = d.equals(d2);
        } else if (d2 != null) {
            zEquals = false;
        }
        if (zEquals) {
            return super.a(c0814b);
        }
        return false;
    }

    public final D e() {
        return this.f;
    }

    public final boolean f() {
        return this.g;
    }

    @Override // com.github.catvod.spider.merge.KW.C0814b
    public final int hashCode() {
        return com.github.catvod.spider.merge.Bk.l.b(com.github.catvod.spider.merge.Bk.l.g(com.github.catvod.spider.merge.Bk.l.f(com.github.catvod.spider.merge.Bk.l.g(com.github.catvod.spider.merge.Bk.l.g(com.github.catvod.spider.merge.Bk.l.f(com.github.catvod.spider.merge.Bk.l.f(7, this.a.b), this.b), this.c), this.e), this.g ? 1 : 0), this.f), 6);
    }
}
