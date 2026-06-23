package com.github.catvod.spider.merge.d;

import android.text.TextUtils;
import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.b.C0547k;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class l {

    @SerializedName("token_type")
    private String a;

    @SerializedName("access_token")
    private String b;

    @SerializedName("refresh_token")
    private String c;

    @SerializedName("user_id")
    private String d;

    @SerializedName("device_id")
    private String e;

    @SerializedName("nick_name")
    private String f;

    @SerializedName("user_name")
    private String g;

    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.isEmpty(this.a) ? "" : this.a);
        sb.append(" ");
        sb.append(TextUtils.isEmpty(this.b) ? "" : this.b);
        return sb.toString();
    }

    public final String b() {
        return TextUtils.isEmpty(this.f) ? this.g : this.f;
    }

    public final String c() {
        return TextUtils.isEmpty(this.c) ? "" : this.c;
    }

    public final boolean d() {
        if ((TextUtils.isEmpty(this.a) ? "" : this.a).length() > 0) {
            if ((TextUtils.isEmpty(this.b) ? "" : this.b).length() > 0) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sbA = C0529a.a("User{tokenType='");
        C0547k.c(sbA, this.a, '\'', ", accessToken='");
        C0547k.c(sbA, this.b, '\'', ", refreshToken='");
        C0547k.c(sbA, this.c, '\'', ", userId='");
        C0547k.c(sbA, this.d, '\'', ", deviceId='");
        sbA.append(this.e);
        sbA.append('\'');
        sbA.append('}');
        return sbA.toString();
    }
}
