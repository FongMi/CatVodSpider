package com.github.catvod.spider.merge.c;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class m {

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
