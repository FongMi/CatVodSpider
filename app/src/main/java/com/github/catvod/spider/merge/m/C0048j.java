package com.github.catvod.spider.merge.M;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum C0048j extends B {
    public C0048j() {
        super("InSelectInTable", 16);
    }

    @Override // com.github.catvod.spider.merge.M.B
    public final boolean c(N n, C0032b c0032b) {
        boolean zE = n.e();
        String[] strArr = A.G;
        if (!zE || !com.github.catvod.bean.b.c(((L) n).c, strArr)) {
            if (n.d()) {
                K k = (K) n;
                if (com.github.catvod.bean.b.c(k.c, strArr)) {
                    c0032b.h(this);
                    if (!c0032b.q(k.c)) {
                        return false;
                    }
                }
            }
            C0046i c0046i = B.p;
            c0032b.g = n;
            return c0046i.c(n, c0032b);
        }
        c0032b.h(this);
        c0032b.B("select");
        c0032b.M();
        return c0032b.D(n);
    }
}
