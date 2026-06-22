package com.github.catvod.spider.merge.e;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.e.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0156e {

    @SerializedName("path")
    private String a;

    @SerializedName("pass")
    private String b;

    public final String a() {
        return TextUtils.isEmpty(this.b) ? "" : this.b;
    }

    public final String b() {
        return TextUtils.isEmpty(this.a) ? "" : this.a;
    }
}
