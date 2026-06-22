package com.github.catvod.spider.merge.e;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.e.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class C0113e {

    @SerializedName("cid")
    private String a;

    @SerializedName("part")
    private String b;

    public final String a() {
        return TextUtils.isEmpty(this.a) ? "" : this.a;
    }

    public final String b() {
        return TextUtils.isEmpty(this.b) ? "" : this.b.replace("#", "");
    }
}
