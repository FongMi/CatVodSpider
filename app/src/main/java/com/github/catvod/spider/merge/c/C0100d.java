package com.github.catvod.spider.merge.c;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.c.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class C0100d {

    @SerializedName("redirectUri")
    private String a;

    public final String a() {
        return (TextUtils.isEmpty(this.a) ? "" : this.a).split("code=")[1];
    }
}
