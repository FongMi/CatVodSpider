package com.github.catvod.spider.merge.h;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.h.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class C0122f {

    @SerializedName("id")
    private int a;

    @SerializedName("name")
    private String b;

    public final String a() {
        return TextUtils.isEmpty(this.b) ? "" : this.b;
    }
}
