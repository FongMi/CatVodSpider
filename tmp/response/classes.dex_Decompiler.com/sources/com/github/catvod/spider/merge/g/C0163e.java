package com.github.catvod.spider.merge.g;

import android.text.TextUtils;
import com.github.catvod.spider.merge.a.C0098a;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0163e {

    @SerializedName("cid")
    private String a;

    @SerializedName("part")
    private String b;

    public final String a() {
        return TextUtils.isEmpty(this.a) ? "" : this.a;
    }

    public final String b() {
        return TextUtils.isEmpty(this.b) ? "" : this.b.replace(C0098a.a(new byte[]{23}, new byte[]{52, 112, 117, -28, 61, -58, 118, -100}), "");
    }
}
