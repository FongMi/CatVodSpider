package com.github.catvod.spider.merge.KW;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class H implements C {
    private final int a;
    private final C b;

    public H(int i, C c) {
        this.a = i;
        this.b = c;
    }

    @Override // com.github.catvod.spider.merge.KW.C
    public final boolean a() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.KW.C
    public final void b(com.github.catvod.spider.merge.yZ.t tVar) {
        this.b.b(tVar);
    }

    public final C c() {
        return this.b;
    }

    public final int d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h = (H) obj;
        return this.a == h.a && this.b.equals(h.b);
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.Bk.l.b(com.github.catvod.spider.merge.Bk.l.g(com.github.catvod.spider.merge.Bk.l.f(0, this.a), this.b), 2);
    }
}
