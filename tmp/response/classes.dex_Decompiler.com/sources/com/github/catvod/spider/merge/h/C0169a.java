package com.github.catvod.spider.merge.h;

import android.text.TextUtils;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.c.k;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.h.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0169a {

    @SerializedName("id")
    private String a;

    @SerializedName(alternate = {"path"}, value = "thumbnail")
    private String b;

    @SerializedName("title")
    private String c;

    @SerializedName("mask")
    private String d;

    public final k a() {
        String str;
        String str2 = TextUtils.isEmpty(this.a) ? "" : this.a;
        String str3 = TextUtils.isEmpty(this.c) ? "" : this.c;
        if (TextUtils.isEmpty(this.b)) {
            str = "";
        } else {
            str = C0098a.a(new byte[]{38, -47, -116, -98, -5, -18, -22, 77, 35, -62, -55, -64, -73, -93, -78, 81, 61, -117, -101, -127, -84}, new byte[]{78, -91, -8, -18, -63, -63, -59, 36}) + this.b;
        }
        return new k(str2, str3, str, TextUtils.isEmpty(this.d) ? "" : this.d);
    }
}
