package com.github.catvod.spider.merge.Fs;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
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
        return !this.b ? com.github.catvod.spider.merge.Dw.s.c(strTrim) : strTrim;
    }

    final com.github.catvod.spider.merge.Em.c b(com.github.catvod.spider.merge.Em.c cVar) {
        if (cVar != null && !this.b) {
            cVar.r();
        }
        return cVar;
    }

    public final String c(String str) {
        String strTrim = str.trim();
        return !this.a ? com.github.catvod.spider.merge.Dw.s.c(strTrim) : strTrim;
    }

    public final boolean d() {
        return this.b;
    }

    public final boolean e() {
        return this.a;
    }
}
