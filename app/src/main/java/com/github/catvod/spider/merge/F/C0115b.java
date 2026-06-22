package com.github.catvod.spider.merge.F;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class C0115b {

    @SerializedName(alternate = {"name"}, value = "title")
    private String a;

    public final String a() {
        return TextUtils.isEmpty(this.a) ? "" : this.a;
    }
}
