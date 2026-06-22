package com.github.catvod.spider.merge.d;

import android.text.TextUtils;
import com.github.catvod.spider.merge.oZP;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class p {

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
        return TextUtils.isEmpty(this.b) ? "" : this.b;
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.isEmpty(this.a) ? "" : this.a);
        sb.append(oZP.d("55"));
        sb.append(b());
        return sb.toString();
    }

    public final String d() {
        return TextUtils.isEmpty(this.c) ? "" : this.c;
    }

    public final boolean e() {
        return (TextUtils.isEmpty(this.a) ? "" : this.a).length() > 0 && b().length() > 0;
    }

    public final void f(String str) {
        this.c = str;
    }
}
