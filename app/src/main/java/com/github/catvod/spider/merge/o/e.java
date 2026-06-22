package com.github.catvod.spider.merge.O;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class e {

    @SerializedName("cid")
    private String a;

    @SerializedName("part")
    private String b;

    public final String a() {
        return TextUtils.isEmpty(this.a) ? "" : this.a;
    }

    public final String b() {
        return TextUtils.isEmpty(this.b) ? "" : this.b;
    }
}
