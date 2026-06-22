package com.github.catvod.spider.merge.M;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum C0071v extends B {
    public C0071v() {
        super("InHeadNoscript", 4);
    }

    @Override // com.github.catvod.spider.merge.M.B
    public final boolean c(N n, C0032b c0032b) {
        if (n.b()) {
            c0032b.h(this);
        } else {
            if (n.e() && ((L) n).c.equals("html")) {
                C0075x c0075x = B.g;
                c0032b.g = n;
                return c0075x.c(n, c0032b);
            }
            boolean zD = n.d();
            C0069u c0069u = B.d;
            if (!zD || !((K) n).c.equals("noscript")) {
                if (B.a(n) || n.a() || (n.e() && com.github.catvod.spider.merge.K.b.c(((L) n).c, A.f))) {
                    c0032b.g = n;
                    return c0069u.c(n, c0032b);
                }
                if (n.d() && ((K) n).c.equals("br")) {
                    c0032b.h(this);
                    G g = new G();
                    g.b = n.toString();
                    c0032b.s(g);
                    return true;
                }
                if ((n.e() && com.github.catvod.spider.merge.K.b.c(((L) n).c, A.I)) || n.d()) {
                    c0032b.h(this);
                    return false;
                }
                c0032b.h(this);
                G g2 = new G();
                g2.b = n.toString();
                c0032b.s(g2);
                return true;
            }
            c0032b.A();
            c0032b.l = c0069u;
        }
        return true;
    }
}
