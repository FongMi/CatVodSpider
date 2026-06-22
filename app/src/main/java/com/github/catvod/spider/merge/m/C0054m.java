package com.github.catvod.spider.merge.M;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum C0054m extends B {
    public C0054m() {
        super("Initial", 0);
    }

    @Override // com.github.catvod.spider.merge.M.B
    public final boolean c(N n, C0032b c0032b) {
        if (B.a(n)) {
            return true;
        }
        if (n.a()) {
            c0032b.t((H) n);
        } else {
            boolean zB = n.b();
            C0065s c0065s = B.b;
            if (!zB) {
                c0032b.l = c0065s;
                return c0032b.D(n);
            }
            I i = (I) n;
            D d = c0032b.h;
            String string = i.b.toString();
            d.getClass();
            String strTrim = string.trim();
            if (!d.a) {
                strTrim = com.github.catvod.spider.merge.R.f.a(strTrim);
            }
            com.github.catvod.spider.merge.L.i iVar = new com.github.catvod.spider.merge.L.i(strTrim, i.d.toString(), i.e.toString());
            String str = i.c;
            if (str != null) {
                iVar.x("pubSysKey", str);
            }
            c0032b.d.x(iVar);
            if (i.f) {
                c0032b.d.l = 2;
            }
            c0032b.l = c0065s;
        }
        return true;
    }
}
