package com.github.catvod.spider.merge.d1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d1.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C1020y extends EnumC0969B {
    C1020y() {
        super("Text", 7, null);
    }

    @Override // com.github.catvod.spider.merge.d1.EnumC0969B
    final boolean d(P p, C0975b c0975b) {
        if (p.b()) {
            c0975b.I((I) p);
            return true;
        }
        if (p.e()) {
            c0975b.r(this);
            c0975b.Z();
            c0975b.s0(c0975b.Y());
            return c0975b.e(p);
        }
        if (!p.f()) {
            return true;
        }
        c0975b.Z();
        c0975b.s0(c0975b.Y());
        return true;
    }
}
