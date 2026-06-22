package com.github.catvod.spider.merge.M;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum C0042g extends B {
    public C0042g() {
        super("InRow", 13);
    }

    @Override // com.github.catvod.spider.merge.M.B
    public final boolean c(N n, C0032b c0032b) {
        boolean zE = n.e();
        C0079z c0079z = B.i;
        if (zE) {
            L l = (L) n;
            String str = l.c;
            if (!com.github.catvod.bean.b.c(str, A.v)) {
                if (!com.github.catvod.bean.b.c(str, A.D)) {
                    c0032b.g = n;
                    return c0079z.c(n, c0032b);
                }
                if (c0032b.F("tr")) {
                    return c0032b.D(n);
                }
                return false;
            }
            c0032b.d("tr", "template");
            c0032b.r(l);
            c0032b.l = B.o;
            c0032b.q.add(null);
        } else {
            if (!n.d()) {
                c0032b.g = n;
                return c0079z.c(n, c0032b);
            }
            String str2 = ((K) n).c;
            boolean zEquals = str2.equals("tr");
            C0040f c0040f = B.m;
            if (zEquals) {
                if (!c0032b.q(str2)) {
                    c0032b.h(this);
                    return false;
                }
                c0032b.d("tr", "template");
            } else {
                if (str2.equals("table")) {
                    if (c0032b.F("tr")) {
                        return c0032b.D(n);
                    }
                    return false;
                }
                if (!com.github.catvod.bean.b.c(str2, A.s)) {
                    if (com.github.catvod.bean.b.c(str2, A.E)) {
                        c0032b.h(this);
                        return false;
                    }
                    c0032b.g = n;
                    return c0079z.c(n, c0032b);
                }
                if (!c0032b.q(str2) || !c0032b.q("tr")) {
                    c0032b.h(this);
                    return false;
                }
                c0032b.d("tr", "template");
            }
            c0032b.A();
            c0032b.l = c0040f;
        }
        return true;
    }
}
