package com.github.catvod.spider.merge.d;

import android.text.TextUtils;
import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.b.C0547k;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class k {

    @SerializedName("share_id")
    private String a;

    @SerializedName("share_token")
    private String b;

    @SerializedName("expire_time")
    private String c;

    @SerializedName("expires_in")
    private int d;

    @SerializedName("creator_id")
    private String e;

    @SerializedName("creator_name")
    private String f;

    @SerializedName("creator_phone")
    private String g;

    @SerializedName("expiration")
    private String h;

    @SerializedName("updated_at")
    private String i;

    @SerializedName("vip")
    private String j;

    @SerializedName("avatar")
    private String k;

    @SerializedName("share_name")
    private String l;

    @SerializedName("display_name")
    private String m;

    @SerializedName("share_title")
    private String n;

    @SerializedName("has_pwd")
    private boolean o;

    @SerializedName("file_infos")
    private List<g> p;

    @SerializedName("time")
    private long q;

    public static k d(String str) {
        return (k) new Gson().fromJson(str, k.class);
    }

    public final boolean a(String str) {
        return (TextUtils.isEmpty(this.a) ? "" : this.a).equals(str) && System.currentTimeMillis() <= this.q;
    }

    public final String b() {
        return TextUtils.isEmpty(this.l) ? "" : this.l;
    }

    public final String c() {
        return TextUtils.isEmpty(this.b) ? "" : this.b;
    }

    public final k e(String str) {
        this.a = str;
        return this;
    }

    public final k f() {
        this.q = System.currentTimeMillis() + 3600000;
        return this;
    }

    public final String toString() {
        StringBuilder sbA = C0529a.a("{share_id='");
        C0547k.c(sbA, this.a, '\'', ", share_token='");
        C0547k.c(sbA, this.b, '\'', ", expireTime='");
        C0547k.c(sbA, this.c, '\'', ", expiresIn=");
        sbA.append(this.d);
        sbA.append(", creatorId='");
        C0547k.c(sbA, this.e, '\'', ", creatorName='");
        C0547k.c(sbA, this.f, '\'', ", creatorPhone='");
        C0547k.c(sbA, this.g, '\'', ", expiration='");
        C0547k.c(sbA, this.h, '\'', ", updatedAt='");
        C0547k.c(sbA, this.i, '\'', ", vip='");
        C0547k.c(sbA, this.j, '\'', ", avatar='");
        C0547k.c(sbA, this.k, '\'', ", shareName='");
        C0547k.c(sbA, this.l, '\'', ", displayName='");
        C0547k.c(sbA, this.m, '\'', ", shareTitle='");
        C0547k.c(sbA, this.n, '\'', ", hasPwd=");
        sbA.append(this.o);
        sbA.append(", fileInfos=");
        sbA.append(this.p);
        sbA.append(", time=");
        sbA.append(this.q);
        sbA.append('}');
        return sbA.toString();
    }
}
