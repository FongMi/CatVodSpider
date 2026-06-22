package com.github.catvod.spider.merge.c;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class p {

    @SerializedName("token_type")
    private String a;

    @SerializedName("access_token")
    private String b;

    @SerializedName("refresh_token")
    private String c;

    public final void a() {
        this.c = "";
        this.b = "";
    }

    public final String b() {
        return TextUtils.isEmpty(this.b) ? "" : this.b;
    }

    public final String c() {
        return TextUtils.isEmpty(this.c) ? "" : this.c;
    }

    public final String d() {
        return TextUtils.isEmpty(this.a) ? "" : this.a;
    }

    public final void e(String str) {
        this.c = str;
    }
}
