package com.github.catvod.spider.merge.M;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum C0056n extends B {
    public C0056n() {
        super("InFrameset", 19);
    }

    @Override // com.github.catvod.spider.merge.M.B
    public final boolean c(N n, C0032b c0032b) {
        L l;
        if (B.a(n)) {
            c0032b.s((G) n);
        } else if (n.a()) {
            c0032b.t((H) n);
        } else {
            if (n.b()) {
                c0032b.h(this);
                return false;
            }
            if (n.e()) {
                l = (L) n;
                String str = l.c;
                str.getClass();
                switch (str) {
                    case "frameset":
                        c0032b.r(l);
                        break;
                    case "html":
                        C0075x c0075x = B.g;
                        c0032b.g = l;
                        return c0075x.c(l, c0032b);
                    case "frame":
                        c0032b.u(l);
                        break;
                    case "noframes":
                        C0069u c0069u = B.d;
                        c0032b.g = l;
                        return c0069u.c(l, c0032b);
                    default:
                        c0032b.h(this);
                        return false;
                }
            } else if (n.d() && ((K) n).c.equals("frameset")) {
                if (c0032b.g("html")) {
                    c0032b.h(this);
                    return false;
                }
                c0032b.A();
                if (!c0032b.g("frameset")) {
                    c0032b.l = B.u;
                }
            } else {
                if (!n.c()) {
                    c0032b.h(this);
                    return false;
                }
                if (!c0032b.g("html")) {
                    c0032b.h(this);
                }
            }
        }
        return true;
    }
}
