package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.z.AbstractC0150b;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum C0040f extends B {
    public C0040f() {
        super("InTableBody", 12);
    }

    @Override // com.github.catvod.spider.merge.M.B
    public final boolean c(N n, C0032b c0032b) {
        int iA = AbstractC0150b.a(n.a);
        C0079z c0079z = B.i;
        if (iA == 1) {
            L l = (L) n;
            String str = l.c;
            if (!str.equals("tr")) {
                if (com.github.catvod.spider.merge.K.b.c(str, A.v)) {
                    c0032b.h(this);
                    c0032b.G("tr");
                    return c0032b.D(l);
                }
                if (com.github.catvod.spider.merge.K.b.c(str, A.B)) {
                    return d(n, c0032b);
                }
                c0032b.g = n;
                return c0079z.c(n, c0032b);
            }
            c0032b.d("tbody", "tfoot", "thead", "template");
            c0032b.r(l);
            c0032b.l = B.n;
        } else {
            if (iA != 2) {
                c0032b.g = n;
                return c0079z.c(n, c0032b);
            }
            String str2 = ((K) n).c;
            if (!com.github.catvod.spider.merge.K.b.c(str2, A.H)) {
                if (str2.equals("table")) {
                    return d(n, c0032b);
                }
                if (com.github.catvod.spider.merge.K.b.c(str2, A.C)) {
                    c0032b.h(this);
                    return false;
                }
                c0032b.g = n;
                return c0079z.c(n, c0032b);
            }
            if (!c0032b.q(str2)) {
                c0032b.h(this);
                return false;
            }
            c0032b.d("tbody", "tfoot", "thead", "template");
            c0032b.A();
            c0032b.l = c0079z;
        }
        return true;
    }

    public final boolean d(N n, C0032b c0032b) {
        if (!c0032b.q("tbody") && !c0032b.q("thead") && !c0032b.n("tfoot")) {
            c0032b.h(this);
            return false;
        }
        c0032b.d("tbody", "tfoot", "thead", "template");
        c0032b.F(c0032b.f().d.b);
        return c0032b.D(n);
    }
}
