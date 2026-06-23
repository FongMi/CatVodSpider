package com.github.catvod.spider.merge.d;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class h {

    @SerializedName("token_type")
    private String a;

    @SerializedName("access_token")
    private String b;

    @SerializedName("refresh_token")
    private String c;

    public static h d(String str) {
        h hVar = (h) new Gson().fromJson(str, h.class);
        return hVar == null ? new h() : hVar;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.isEmpty(this.a) ? "" : this.a);
        sb.append(" ");
        sb.append(TextUtils.isEmpty(this.b) ? "" : this.b);
        return sb.toString();
    }

    public final String b() {
        return TextUtils.isEmpty(this.c) ? "" : this.c;
    }

    public final boolean c() {
        if ((TextUtils.isEmpty(this.a) ? "" : this.a).length() > 0) {
            if ((TextUtils.isEmpty(this.b) ? "" : this.b).length() > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        return (TextUtils.isEmpty(this.b) ? "" : this.b).length() > 0;
    }
}
