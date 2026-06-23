package com.github.catvod.spider.merge.A0;

import android.text.TextUtils;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class ar {

    @ni("username")
    private String c;

    @ni("password")
    private String d;

    public final String a() {
        return TextUtils.isEmpty(this.d) ? "" : this.d;
    }

    public final String b() {
        return TextUtils.isEmpty(this.c) ? "" : this.c;
    }
}
