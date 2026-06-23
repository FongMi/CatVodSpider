package com.github.catvod.spider.merge.d1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d1.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C1003p extends EnumC0969B {
    C1003p() {
        super("AfterAfterBody", 21, null);
    }

    @Override // com.github.catvod.spider.merge.d1.EnumC0969B
    final boolean d(P p, C0975b c0975b) {
        if (p.c()) {
            c0975b.J((J) p);
            return true;
        }
        if (p.d() || (p.g() && ((N) p).e.equals("html"))) {
            return c0975b.d0(p, EnumC0969B.h);
        }
        if (EnumC0969B.a(p)) {
            c0975b.I((I) p);
            return true;
        }
        if (p.e()) {
            return true;
        }
        c0975b.r(this);
        c0975b.l0();
        return c0975b.e(p);
    }
}
