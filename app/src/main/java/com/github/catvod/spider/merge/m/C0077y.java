package com.github.catvod.spider.merge.M;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum C0077y extends B {
    public C0077y() {
        super("Text", 7);
    }

    @Override // com.github.catvod.spider.merge.M.B
    public final boolean c(N n, C0032b c0032b) {
        if (n.a == 5) {
            c0032b.s((G) n);
            return true;
        }
        if (n.c()) {
            c0032b.h(this);
            c0032b.A();
            c0032b.l = c0032b.m;
            return c0032b.D(n);
        }
        if (!n.d()) {
            return true;
        }
        c0032b.A();
        c0032b.l = c0032b.m;
        return true;
    }
}
