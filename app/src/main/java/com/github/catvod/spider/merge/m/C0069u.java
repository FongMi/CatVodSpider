package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.z.AbstractC0150b;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum C0069u extends B {
    public C0069u() {
        super("InHead", 3);
    }

    @Override // com.github.catvod.spider.merge.M.B
    public final boolean c(N n, C0032b c0032b) {
        B b;
        if (B.a(n)) {
            c0032b.s((G) n);
            return true;
        }
        int iA = AbstractC0150b.a(n.a);
        if (iA == 0) {
            c0032b.h(this);
            return false;
        }
        if (iA == 1) {
            L l = (L) n;
            String str = l.c;
            if (str.equals("html")) {
                return B.g.c(n, c0032b);
            }
            if (com.github.catvod.spider.merge.K.b.c(str, A.a)) {
                com.github.catvod.spider.merge.L.l lVarU = c0032b.u(l);
                if (str.equals("base") && lVarU.k("href") && !c0032b.n) {
                    String strA = lVarU.a("href");
                    if (strA.length() != 0) {
                        c0032b.f = strA;
                        c0032b.n = true;
                        com.github.catvod.spider.merge.L.h hVar = c0032b.d;
                        hVar.getClass();
                        hVar.D(strA);
                    }
                }
            } else if (str.equals("meta")) {
                c0032b.u(l);
            } else {
                boolean zEquals = str.equals("title");
                C0077y c0077y = B.h;
                if (zEquals) {
                    c0032b.c.o(g1.c);
                    c0032b.m = c0032b.l;
                    c0032b.l = c0077y;
                    c0032b.r(l);
                } else if (com.github.catvod.spider.merge.K.b.c(str, A.b)) {
                    B.b(l, c0032b);
                } else if (str.equals("noscript")) {
                    c0032b.r(l);
                    b = B.e;
                    c0032b.l = b;
                } else if (str.equals("script")) {
                    c0032b.c.o(g1.f);
                    c0032b.m = c0032b.l;
                    c0032b.l = c0077y;
                    c0032b.r(l);
                } else {
                    if (str.equals("head")) {
                        c0032b.h(this);
                        return false;
                    }
                    if (!str.equals("template")) {
                        c0032b.F("head");
                        return c0032b.D(n);
                    }
                    c0032b.r(l);
                    c0032b.q.add(null);
                    c0032b.u = false;
                    C0050k c0050k = B.r;
                    c0032b.l = c0050k;
                    c0032b.H(c0050k);
                }
            }
        } else if (iA == 2) {
            String str2 = ((K) n).c;
            if (str2.equals("head")) {
                c0032b.A();
                b = B.f;
                c0032b.l = b;
            } else {
                if (com.github.catvod.spider.merge.K.b.c(str2, A.c)) {
                    c0032b.F("head");
                    return c0032b.D(n);
                }
                if (!str2.equals("template")) {
                    c0032b.h(this);
                    return false;
                }
                if (c0032b.y(str2)) {
                    c0032b.j(true);
                    if (!str2.equals(c0032b.f().d.b)) {
                        c0032b.h(this);
                    }
                    c0032b.B(str2);
                    c0032b.c();
                    c0032b.C();
                    c0032b.M();
                } else {
                    c0032b.h(this);
                }
            }
        } else {
            if (iA != 3) {
                c0032b.F("head");
                return c0032b.D(n);
            }
            c0032b.t((H) n);
        }
        return true;
    }
}
