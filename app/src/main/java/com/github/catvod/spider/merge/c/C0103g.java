package com.github.catvod.spider.merge.c;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.c.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class C0103g {

    @SerializedName("default_drive_id")
    private String a;

    @SerializedName("resource_drive_id")
    private String b;

    public final String a() {
        return (TextUtils.isEmpty(this.b) ? "" : this.b).isEmpty() ? TextUtils.isEmpty(this.a) ? "" : this.a : TextUtils.isEmpty(this.b) ? "" : this.b;
    }
}
