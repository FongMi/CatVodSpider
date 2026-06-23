package com.github.catvod.spider.merge.H;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class f {
    public static final f c = new f(false, false);
    public static final f d = new f(true, true);
    private final boolean a;
    private final boolean b;

    public f(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    static String a(String str) {
        return com.github.catvod.spider.merge.F.a.e(str.trim());
    }

    public final String b(String str) {
        String strTrim = str.trim();
        return !this.b ? com.github.catvod.spider.merge.F.a.e(strTrim) : strTrim;
    }

    @Nullable
    final com.github.catvod.spider.merge.G.b c(@Nullable com.github.catvod.spider.merge.G.b bVar) {
        if (bVar != null && !this.b) {
            bVar.u();
        }
        return bVar;
    }

    public final String d(String str) {
        String strTrim = str.trim();
        return !this.a ? com.github.catvod.spider.merge.F.a.e(strTrim) : strTrim;
    }

    public final boolean e() {
        return this.b;
    }

    public final boolean f() {
        return this.a;
    }
}
