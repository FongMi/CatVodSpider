package com.github.catvod.spider.merge.f;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class g {

    @SerializedName("nickname")
    private String a;

    @SerializedName("mid")
    private String b;

    @SerializedName("cookie")
    private String c;

    @SerializedName("wbiImg")
    private String d;

    @SerializedName("wbiSub")
    private String e;

    @SerializedName("isVip")
    private Boolean f;

    public g() {
    }

    public g(String str) {
        this.c = "";
    }

    public final String a() {
        return TextUtils.isEmpty(this.c) ? "" : this.c;
    }

    public final String b() {
        return TextUtils.isEmpty(this.b) ? "" : this.b;
    }

    public final String c() {
        return TextUtils.isEmpty(this.a) ? "" : this.a;
    }

    public final Boolean d() {
        Boolean bool = this.f;
        return Boolean.valueOf(bool == null ? false : bool.booleanValue());
    }

    public final String e() {
        return TextUtils.isEmpty(this.d) ? "" : this.d;
    }

    public final String f() {
        return TextUtils.isEmpty(this.e) ? "" : this.e;
    }

    public final boolean g() {
        if (a().length() > 0) {
            if ((TextUtils.isEmpty(this.a) ? "" : this.a).length() > 0 && b().length() > 0) {
                return true;
            }
        }
        return false;
    }

    public final void h(String str) {
        this.c = str;
    }

    public final void i(String str) {
        this.b = str;
    }

    public final void j(String str) {
        this.a = str;
    }

    public final void k(Boolean bool) {
        this.f = bool;
    }

    public final void l(String str) {
        this.d = str;
    }

    public final void m(String str) {
        this.e = str;
    }

    public final String toString() {
        return new Gson().toJson(this);
    }
}
