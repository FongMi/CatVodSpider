package com.github.catvod.spider.merge.h;

import android.text.TextUtils;
import com.github.catvod.spider.merge.a.C0098a;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.h.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0170b {

    @SerializedName("source_name")
    private String a;

    @SerializedName("url")
    private String b;

    public final String a() {
        return TextUtils.isEmpty(this.a) ? "" : this.a;
    }

    public final String b() {
        return TextUtils.isEmpty(this.b) ? "" : this.b.replaceAll(C0098a.a(new byte[]{2, -38, 71}, new byte[]{100, -82, 55, 90, -29, -76, 30, 38}), C0098a.a(new byte[]{-90, 60, 18, -39, 114, -8, -78, -26, -24, 44, 4, -58}, new byte[]{-46, 74, 112, -74, 10, -43, -54, -127}));
    }
}
