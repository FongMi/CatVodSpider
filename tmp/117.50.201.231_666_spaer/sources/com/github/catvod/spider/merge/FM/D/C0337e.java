package com.github.catvod.spider.merge.FM.d;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.d.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0337e {

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
