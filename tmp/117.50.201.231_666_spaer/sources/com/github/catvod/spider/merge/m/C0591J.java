package com.github.catvod.spider.merge.m;

import android.util.Base64;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.m.J, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0591J {
    private final C0605n a = new C0605n("yszyz2024");

    public final String a(String str) {
        C0605n c0605n = this.a;
        c0605n.getClass();
        return c0605n.b(Base64.decode(str, 0));
    }

    public final String b(String str) {
        C0605n c0605n = this.a;
        return c0605n.b(c0605n.d(str));
    }

    public final String c(String str) {
        return this.a.c(str);
    }
}
