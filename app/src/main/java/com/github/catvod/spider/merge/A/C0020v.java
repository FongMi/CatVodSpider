package com.github.catvod.spider.merge.A;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class C0020v extends C0001b {
    public final C0024z f;
    public final boolean g;

    public C0020v(AbstractC0008i abstractC0008i, int i, Q q) {
        super(abstractC0008i, i, q, d0.a);
        this.g = false;
        this.f = null;
    }

    public static boolean c(C0020v c0020v, AbstractC0008i abstractC0008i) {
        return c0020v.g || ((abstractC0008i instanceof r) && ((r) abstractC0008i).h);
    }

    @Override // com.github.catvod.spider.merge.A.C0001b
    public final boolean a(C0001b c0001b) {
        boolean zEquals = true;
        if (this == c0001b) {
            return true;
        }
        if (!(c0001b instanceof C0020v)) {
            return false;
        }
        C0020v c0020v = (C0020v) c0001b;
        if (this.g != c0020v.g) {
            return false;
        }
        C0024z c0024z = this.f;
        C0024z c0024z2 = c0020v.f;
        if (c0024z != null) {
            zEquals = c0024z.equals(c0024z2);
        } else if (c0024z2 != null) {
            zEquals = false;
        }
        if (zEquals) {
            return super.a(c0001b);
        }
        return false;
    }

    @Override // com.github.catvod.spider.merge.A.C0001b
    public final int hashCode() {
        return com.github.catvod.spider.merge.R.a.a(com.github.catvod.spider.merge.R.a.c(com.github.catvod.spider.merge.R.a.b(com.github.catvod.spider.merge.R.a.c(com.github.catvod.spider.merge.R.a.c(com.github.catvod.spider.merge.R.a.b(com.github.catvod.spider.merge.R.a.b(7, this.a.b), this.b), this.c), this.e), this.g ? 1 : 0), this.f), 6);
    }

    public C0020v(C0020v c0020v, AbstractC0008i abstractC0008i) {
        super(c0020v, abstractC0008i, c0020v.c, c0020v.e);
        this.f = c0020v.f;
        this.g = c(c0020v, abstractC0008i);
    }

    public C0020v(C0020v c0020v, AbstractC0008i abstractC0008i, C0024z c0024z) {
        super(c0020v, abstractC0008i, c0020v.c, c0020v.e);
        this.f = c0024z;
        this.g = c(c0020v, abstractC0008i);
    }

    public C0020v(C0020v c0020v, AbstractC0008i abstractC0008i, Q q) {
        super(c0020v, abstractC0008i, q, c0020v.e);
        this.f = c0020v.f;
        this.g = c(c0020v, abstractC0008i);
    }
}
