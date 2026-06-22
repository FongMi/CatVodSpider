package com.github.catvod.spider.merge.M;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum C0044h extends B {
    public C0044h() {
        super("InCell", 14);
    }

    @Override // com.github.catvod.spider.merge.M.B
    public final boolean c(N n, C0032b c0032b) {
        boolean zD = n.d();
        C0075x c0075x = B.g;
        if (!zD) {
            if (!n.e() || !com.github.catvod.spider.merge.K.b.c(((L) n).c, A.y)) {
                c0032b.g = n;
                return c0075x.c(n, c0032b);
            }
            if (!c0032b.q("td") && !c0032b.q("th")) {
                c0032b.h(this);
                return false;
            }
            if (c0032b.q("td")) {
                c0032b.F("td");
            } else {
                c0032b.F("th");
            }
            return c0032b.D(n);
        }
        String str = ((K) n).c;
        if (com.github.catvod.spider.merge.K.b.c(str, A.v)) {
            boolean zQ = c0032b.q(str);
            C0042g c0042g = B.n;
            if (!zQ) {
                c0032b.h(this);
                c0032b.l = c0042g;
                return false;
            }
            c0032b.j(false);
            if (!c0032b.g(str)) {
                c0032b.h(this);
            }
            c0032b.B(str);
            c0032b.c();
            c0032b.l = c0042g;
            return true;
        }
        if (com.github.catvod.spider.merge.K.b.c(str, A.w)) {
            c0032b.h(this);
            return false;
        }
        if (!com.github.catvod.spider.merge.K.b.c(str, A.x)) {
            c0032b.g = n;
            return c0075x.c(n, c0032b);
        }
        if (!c0032b.q(str)) {
            c0032b.h(this);
            return false;
        }
        if (c0032b.q("td")) {
            c0032b.F("td");
        } else {
            c0032b.F("th");
        }
        return c0032b.D(n);
    }
}
