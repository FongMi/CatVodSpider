package com.github.catvod.spider.merge.M;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum C0062q extends B {
    public C0062q() {
        super("AfterAfterFrameset", 22);
    }

    @Override // com.github.catvod.spider.merge.M.B
    public final boolean c(N n, C0032b c0032b) {
        if (n.a()) {
            c0032b.t((H) n);
            return true;
        }
        if (n.b() || B.a(n) || (n.e() && ((L) n).c.equals("html"))) {
            C0075x c0075x = B.g;
            c0032b.g = n;
            return c0075x.c(n, c0032b);
        }
        if (n.c()) {
            return true;
        }
        if (!n.e() || !((L) n).c.equals("noframes")) {
            c0032b.h(this);
            return false;
        }
        C0069u c0069u = B.d;
        c0032b.g = n;
        return c0069u.c(n, c0032b);
    }
}
