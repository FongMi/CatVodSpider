package com.github.catvod.spider.merge.c;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.c.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class C0105i {

    @SerializedName("token_type")
    private String a;

    @SerializedName("access_token")
    private String b;

    @SerializedName("refresh_token")
    private String c;

    public final void a() {
        this.c = "";
        this.b = "";
    }

    public final String b() {
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.isEmpty(this.a) ? "" : this.a);
        sb.append(" ");
        sb.append(TextUtils.isEmpty(this.b) ? "" : this.b);
        return sb.toString();
    }

    public final String c() {
        return TextUtils.isEmpty(this.c) ? "" : this.c;
    }
}
