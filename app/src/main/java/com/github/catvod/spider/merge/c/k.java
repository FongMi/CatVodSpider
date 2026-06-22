package com.github.catvod.spider.merge.c;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class k {

    @SerializedName("template_id")
    private String a;

    @SerializedName("language")
    private String b;

    @SerializedName("status")
    private String c;

    @SerializedName("url")
    private String d;

    public final String a() {
        return TextUtils.isEmpty(this.b) ? "" : this.b;
    }

    public final String b() {
        return TextUtils.isEmpty(this.a) ? "" : this.a;
    }

    public final String c() {
        return TextUtils.isEmpty(this.d) ? "" : this.d;
    }
}
