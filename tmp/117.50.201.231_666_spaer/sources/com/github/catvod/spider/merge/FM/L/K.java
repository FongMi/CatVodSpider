package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class K extends Q {
    final StringBuilder d = new StringBuilder();
    String e = null;
    final StringBuilder f = new StringBuilder();
    final StringBuilder g = new StringBuilder();
    boolean h = false;

    K() {
        this.a = 1;
    }

    @Override // com.github.catvod.spider.merge.FM.L.Q
    final Q h() {
        super.h();
        Q.i(this.d);
        this.e = null;
        Q.i(this.f);
        Q.i(this.g);
        this.h = false;
        return this;
    }

    final String k() {
        return this.d.toString();
    }

    public final String toString() {
        return com.github.catvod.spider.merge.FM.b.v.b(P.b("<!doctype "), k(), ">");
    }
}
