package com.github.catvod.spider.merge.c;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.c.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class C0102f {

    @SerializedName("url")
    private String a;

    @SerializedName("file_id")
    private String b;

    @SerializedName("expiration")
    private String c;

    public final String a() {
        return TextUtils.isEmpty(this.a) ? "" : this.a;
    }
}
