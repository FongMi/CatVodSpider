package com.github.catvod.spider.merge.d;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class f {

    @SerializedName("default_drive_id")
    private String a;

    @SerializedName("resource_drive_id")
    private String b;

    public final String a() {
        return (TextUtils.isEmpty(this.b) ? "" : this.b).isEmpty() ? TextUtils.isEmpty(this.a) ? "" : this.a : TextUtils.isEmpty(this.b) ? "" : this.b;
    }
}
