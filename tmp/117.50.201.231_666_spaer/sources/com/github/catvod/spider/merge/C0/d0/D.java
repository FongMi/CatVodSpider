package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class D {
    public static final D c = new D(false, false);
    public static final D d = new D(true, true);
    private final boolean a;
    private final boolean b;

    public D(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final String a(String str) {
        String strTrim = str.trim();
        return !this.b ? com.github.catvod.spider.merge.C0.x.a.c(strTrim) : strTrim;
    }

    final com.github.catvod.spider.merge.C0.c0.c b(com.github.catvod.spider.merge.C0.c0.c cVar) {
        if (cVar != null && !this.b) {
            cVar.r();
        }
        return cVar;
    }

    public final String c(String str) {
        String strTrim = str.trim();
        return !this.a ? com.github.catvod.spider.merge.C0.x.a.c(strTrim) : strTrim;
    }

    public final boolean d() {
        return this.b;
    }

    public final boolean e() {
        return this.a;
    }
}
