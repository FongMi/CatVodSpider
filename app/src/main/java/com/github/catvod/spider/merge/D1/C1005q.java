package com.github.catvod.spider.merge.d1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d1.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C1005q extends EnumC0969B {
    C1005q() {
        super("AfterAfterFrameset", 22, null);
    }

    @Override // com.github.catvod.spider.merge.d1.EnumC0969B
    final boolean d(P p, C0975b c0975b) {
        if (p.c()) {
            c0975b.J((J) p);
            return true;
        }
        if (p.d() || EnumC0969B.a(p) || (p.g() && ((N) p).e.equals("html"))) {
            return c0975b.d0(p, EnumC0969B.h);
        }
        if (p.e()) {
            return true;
        }
        if (p.g() && ((N) p).e.equals("noframes")) {
            return c0975b.d0(p, EnumC0969B.e);
        }
        c0975b.r(this);
        return false;
    }
}
