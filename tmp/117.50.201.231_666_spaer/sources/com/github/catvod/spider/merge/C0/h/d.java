package com.github.catvod.spider.merge.C0.h;

import android.text.TextUtils;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class d {
    private final int a;
    private final String b;

    public d() {
        this.a = 500;
        this.b = "";
    }

    public d(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final String a() {
        return TextUtils.isEmpty(this.b) ? "" : this.b;
    }

    public final int b() {
        return this.a;
    }
}
