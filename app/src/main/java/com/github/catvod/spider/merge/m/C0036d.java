package com.github.catvod.spider.merge.M;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum C0036d extends B {
    public C0036d() {
        super("InCaption", 10);
    }

    @Override // com.github.catvod.spider.merge.M.B
    public final boolean c(N n, C0032b c0032b) {
        if (n.d()) {
            K k = (K) n;
            if (k.c.equals("caption")) {
                if (!c0032b.q(k.c)) {
                    c0032b.h(this);
                    return false;
                }
                c0032b.j(false);
                if (!c0032b.g("caption")) {
                    c0032b.h(this);
                }
                c0032b.B("caption");
                c0032b.c();
                c0032b.l = B.i;
                return true;
            }
        }
        if ((n.e() && com.github.catvod.bean.b.c(((L) n).c, A.y)) || (n.d() && ((K) n).c.equals("table"))) {
            c0032b.h(this);
            if (c0032b.F("caption")) {
                return c0032b.D(n);
            }
            return true;
        }
        if (n.d() && com.github.catvod.bean.b.c(((K) n).c, A.J)) {
            c0032b.h(this);
            return false;
        }
        C0075x c0075x = B.g;
        c0032b.g = n;
        return c0075x.c(n, c0032b);
    }
}
