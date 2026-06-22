package com.github.catvod.spider.merge.d;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class m {

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
