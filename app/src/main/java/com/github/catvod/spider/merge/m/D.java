package com.github.catvod.spider.merge.m;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class D {
    public static final D c = new D(false, false);
    public static final D d = new D(true, true);
    public final boolean a;
    public final boolean b;

    public D(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final void a(com.github.catvod.spider.merge.L.c cVar) {
        if (cVar == null || this.b) {
            return;
        }
        for (int i = 0; i < cVar.a; i++) {
            String[] strArr = cVar.b;
            strArr[i] = com.github.catvod.spider.merge.R.f.a(strArr[i]);
        }
    }
}
