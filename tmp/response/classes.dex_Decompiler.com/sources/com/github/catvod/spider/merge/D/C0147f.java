package com.github.catvod.spider.merge.d;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0147f {

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
