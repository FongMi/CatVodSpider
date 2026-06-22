package com.github.catvod.spider.merge.M;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum C0073w extends B {
    public C0073w() {
        super("AfterHead", 5);
    }

    @Override // com.github.catvod.spider.merge.M.B
    public final boolean c(N n, C0032b c0032b) {
        if (B.a(n)) {
            c0032b.s((G) n);
        } else if (n.a()) {
            c0032b.t((H) n);
        } else if (n.b()) {
            c0032b.h(this);
        } else {
            boolean zE = n.e();
            C0069u c0069u = B.d;
            if (zE) {
                L l = (L) n;
                String str = l.c;
                boolean zEquals = str.equals("html");
                C0075x c0075x = B.g;
                if (zEquals) {
                    c0032b.g = n;
                    return c0075x.c(n, c0032b);
                }
                if (str.equals("body")) {
                    c0032b.r(l);
                    c0032b.u = false;
                    c0032b.l = c0075x;
                } else if (str.equals("frameset")) {
                    c0032b.r(l);
                    c0032b.l = B.t;
                } else if (com.github.catvod.spider.merge.K.b.c(str, A.g)) {
                    c0032b.h(this);
                    com.github.catvod.spider.merge.L.l lVar = c0032b.o;
                    c0032b.e.add(lVar);
                    c0032b.E(n, c0069u);
                    c0032b.K(lVar);
                } else {
                    if (str.equals("head")) {
                        c0032b.h(this);
                        return false;
                    }
                    c0032b.G("body");
                    c0032b.u = true;
                    c0032b.D(n);
                }
            } else {
                if (n.d()) {
                    String str2 = ((K) n).c;
                    if (com.github.catvod.spider.merge.K.b.c(str2, A.d)) {
                        c0032b.G("body");
                    } else {
                        if (!str2.equals("template")) {
                            c0032b.h(this);
                            return false;
                        }
                        c0032b.E(n, c0069u);
                    }
                } else {
                    c0032b.G("body");
                }
                c0032b.u = true;
                c0032b.D(n);
            }
        }
        return true;
    }
}
