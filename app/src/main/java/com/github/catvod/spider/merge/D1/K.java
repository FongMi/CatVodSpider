package com.github.catvod.spider.merge.d1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class K extends P {
    final StringBuilder d = new StringBuilder();
    String e = null;
    final StringBuilder f = new StringBuilder();
    final StringBuilder g = new StringBuilder();
    boolean h = false;

    K() {
        this.a = 1;
    }

    @Override // com.github.catvod.spider.merge.d1.P
    final P h() {
        super.h();
        P.i(this.d);
        this.e = null;
        P.i(this.f);
        P.i(this.g);
        this.h = false;
        return this;
    }

    public final String toString() {
        StringBuilder sbB = com.github.catvod.spider.merge.I.t0.b("<!doctype ");
        sbB.append(this.d.toString());
        sbB.append(">");
        return sbB.toString();
    }
}
