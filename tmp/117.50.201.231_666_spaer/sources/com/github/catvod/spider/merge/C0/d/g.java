package com.github.catvod.spider.merge.C0.d;

import android.text.TextUtils;
import com.github.catvod.spider.merge.C0.b.p;
import com.github.catvod.spider.merge.C0.j.l;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class g {

    @SerializedName("default_drive_id")
    private String a;

    @SerializedName("user_id")
    private String b;

    @SerializedName("token_type")
    private String c;

    @SerializedName("access_token")
    private String d;

    @SerializedName("refresh_token")
    private String e;

    public static g f(String str) {
        g gVar = (g) new Gson().fromJson(str, g.class);
        return gVar == null ? new g() : gVar;
    }

    public final g a() {
        this.e = "";
        this.d = "";
        return this;
    }

    public final String b() {
        return TextUtils.isEmpty(this.d) ? "" : this.d;
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.isEmpty(this.c) ? "" : this.c);
        sb.append(" ");
        sb.append(TextUtils.isEmpty(this.d) ? "" : this.d);
        return sb.toString();
    }

    public final String d() {
        return TextUtils.isEmpty(this.a) ? "" : this.a;
    }

    public final String e() {
        return TextUtils.isEmpty(this.e) ? "" : this.e;
    }

    public final g g() {
        l.g(p.o().x(), toString());
        return this;
    }

    public final void h(String str) {
        this.e = str;
    }

    public final String toString() {
        return new Gson().toJson(this);
    }
}
