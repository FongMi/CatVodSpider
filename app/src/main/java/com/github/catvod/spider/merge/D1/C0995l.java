package com.github.catvod.spider.merge.d1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d1.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C0995l extends EnumC0969B {
    C0995l() {
        super("AfterBody", 18, null);
    }

    @Override // com.github.catvod.spider.merge.d1.EnumC0969B
    final boolean d(P p, C0975b c0975b) {
        if (EnumC0969B.a(p)) {
            c0975b.I((I) p);
            return true;
        }
        if (p.c()) {
            c0975b.J((J) p);
            return true;
        }
        if (p.d()) {
            c0975b.r(this);
            return false;
        }
        if (p.g() && ((N) p).e.equals("html")) {
            return c0975b.d0(p, EnumC0969B.h);
        }
        if (p.f() && ((M) p).e.equals("html")) {
            c0975b.getClass();
            if (c0975b.W("html")) {
                c0975b.a0("html");
            }
            c0975b.s0(EnumC0969B.w);
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
