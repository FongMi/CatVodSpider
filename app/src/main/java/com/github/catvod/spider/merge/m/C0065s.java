package com.github.catvod.spider.merge.M;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum C0065s extends B {
    public C0065s() {
        super("BeforeHtml", 1);
    }

    @Override // com.github.catvod.spider.merge.M.B
    public final boolean c(N n, C0032b c0032b) {
        if (n.b()) {
            c0032b.h(this);
            return false;
        }
        if (n.a()) {
            c0032b.t((H) n);
            return true;
        }
        if (B.a(n)) {
            c0032b.s((G) n);
            return true;
        }
        boolean zE = n.e();
        C0067t c0067t = B.c;
        if (zE) {
            L l = (L) n;
            if (l.c.equals("html")) {
                c0032b.r(l);
                c0032b.l = c0067t;
                return true;
            }
        }
        if (n.d() && com.github.catvod.spider.merge.K.b.c(((K) n).c, A.e)) {
            c0032b.getClass();
            com.github.catvod.spider.merge.L.l lVar = new com.github.catvod.spider.merge.L.l(c0032b.N("html", c0032b.h), null, null);
            c0032b.x(lVar);
            c0032b.e.add(lVar);
            c0032b.l = c0067t;
            return c0032b.D(n);
        }
        if (n.d()) {
            c0032b.h(this);
            return false;
        }
        c0032b.getClass();
        com.github.catvod.spider.merge.L.l lVar2 = new com.github.catvod.spider.merge.L.l(c0032b.N("html", c0032b.h), null, null);
        c0032b.x(lVar2);
        c0032b.e.add(lVar2);
        c0032b.l = c0067t;
        return c0032b.D(n);
    }
}
