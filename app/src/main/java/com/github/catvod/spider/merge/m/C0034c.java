package com.github.catvod.spider.merge.M;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum C0034c extends B {
    public C0034c() {
        super("InTableText", 9);
    }

    @Override // com.github.catvod.spider.merge.M.B
    public final boolean c(N n, C0032b c0032b) {
        if (n.a == 5) {
            G g = (G) n;
            if (g.b.equals(B.x)) {
                c0032b.h(this);
                return false;
            }
            c0032b.s.add(g.b);
            return true;
        }
        if (c0032b.s.size() > 0) {
            for (String str : c0032b.s) {
                if (com.github.catvod.spider.merge.K.b.d(str)) {
                    G g2 = new G();
                    g2.b = str;
                    c0032b.s(g2);
                } else {
                    c0032b.h(this);
                    boolean zC = com.github.catvod.spider.merge.K.b.c(c0032b.f().d.b, A.A);
                    B b = B.g;
                    if (zC) {
                        c0032b.v = true;
                        G g3 = new G();
                        g3.b = str;
                        c0032b.E(g3, b);
                        c0032b.v = false;
                    } else {
                        G g4 = new G();
                        g4.b = str;
                        c0032b.E(g4, b);
                    }
                }
            }
            c0032b.s = new ArrayList();
        }
        c0032b.l = c0032b.m;
        return c0032b.D(n);
    }
}
