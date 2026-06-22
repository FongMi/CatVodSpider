package com.github.catvod.spider.merge.d;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class o {

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
    private List<C0149h> p;
    private long q;

    public final boolean a(String str) {
        return (TextUtils.isEmpty(this.a) ? "" : this.a).equals(str) && System.currentTimeMillis() <= this.q;
    }

    public final String b() {
        return TextUtils.isEmpty(this.k) ? "" : this.k;
    }

    public final List<C0149h> c() {
        List<C0149h> list = this.p;
        return list == null ? Collections.emptyList() : list;
    }

    public final String d() {
        return TextUtils.isEmpty(this.l) ? "" : this.l;
    }

    public final String e() {
        return TextUtils.isEmpty(this.b) ? "" : this.b;
    }

    public final o f(String str) {
        this.a = str;
        return this;
    }

    public final o g() {
        this.q = System.currentTimeMillis() + 3600000;
        return this;
    }
}
