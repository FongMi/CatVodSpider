package com.github.catvod.spider.merge.FM.d;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class l {

    @SerializedName("domain_id")
    private String a;

    @SerializedName("drive_id")
    private String b;

    @SerializedName("file_id")
    private String c;

    @SerializedName("code")
    private String d;

    @SerializedName("message")
    private String e;

    public final String a() {
        return TextUtils.isEmpty(this.c) ? "" : this.c;
    }
}
