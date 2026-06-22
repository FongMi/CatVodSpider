package com.github.catvod.spider.merge.d;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0148g {

    @SerializedName("default_drive_id")
    private String a;

    @SerializedName("resource_drive_id")
    private String b;

    public final String a() {
        return (TextUtils.isEmpty(this.b) ? "" : this.b).isEmpty() ? TextUtils.isEmpty(this.a) ? "" : this.a : TextUtils.isEmpty(this.b) ? "" : this.b;
    }
}
