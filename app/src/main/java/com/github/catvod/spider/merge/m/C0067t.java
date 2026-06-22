package com.github.catvod.spider.merge.M;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum C0067t extends B {
    public C0067t() {
        super("BeforeHead", 2);
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
            return B.g.c(n, c0032b);
        }
        if (n.e()) {
            L l = (L) n;
            if (l.c.equals("head")) {
                c0032b.o = c0032b.r(l);
                c0032b.l = B.d;
                return true;
            }
        }
        if (n.d() && com.github.catvod.bean.b.c(((K) n).c, A.e)) {
            c0032b.G("head");
            return c0032b.D(n);
        }
        if (n.d()) {
            c0032b.h(this);
            return false;
        }
        c0032b.G("head");
        return c0032b.D(n);
    }
}
