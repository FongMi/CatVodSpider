package com.github.catvod.spider.merge.M;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum C0058o extends B {
    public C0058o() {
        super("AfterFrameset", 20);
    }

    @Override // com.github.catvod.spider.merge.M.B
    public final boolean c(N n, C0032b c0032b) {
        if (B.a(n)) {
            c0032b.s((G) n);
            return true;
        }
        if (n.a()) {
            c0032b.t((H) n);
            return true;
        }
        if (n.b()) {
            c0032b.h(this);
            return false;
        }
        if (n.e() && ((L) n).c.equals("html")) {
            C0075x c0075x = B.g;
            c0032b.g = n;
            return c0075x.c(n, c0032b);
        }
        if (n.d() && ((K) n).c.equals("html")) {
            c0032b.l = B.w;
            return true;
        }
        if (n.e() && ((L) n).c.equals("noframes")) {
            C0069u c0069u = B.d;
            c0032b.g = n;
            return c0069u.c(n, c0032b);
        }
        if (n.c()) {
            return true;
        }
        c0032b.h(this);
        return false;
    }
}
