package com.github.catvod.spider.merge.d;

import android.text.TextUtils;
import com.github.catvod.spider.merge.a.C0098a;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0145d {

    @SerializedName("redirectUri")
    private String a;

    public final String a() {
        return (TextUtils.isEmpty(this.a) ? "" : this.a).split(C0098a.a(new byte[]{-10, 72, 53, -21, 79}, new byte[]{-107, 39, 81, -114, 114, -38, 86, -34}))[1];
    }
}
