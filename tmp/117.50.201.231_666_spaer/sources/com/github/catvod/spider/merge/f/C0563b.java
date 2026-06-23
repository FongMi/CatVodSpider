package com.github.catvod.spider.merge.f;

import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0563b {

    @SerializedName("result")
    private JsonElement a;

    @SerializedName("wbi_img")
    private JsonElement b;

    @SerializedName("list")
    private JsonElement c;

    @SerializedName("isLogin")
    private Boolean d;

    @SerializedName("vipStatus")
    private Integer e;

    @SerializedName("qrcode_key")
    private String f;

    @SerializedName("url")
    private String g;

    @SerializedName("aid")
    private String h;

    @SerializedName("cid")
    private String i;

    @SerializedName("title")
    private String j;

    @SerializedName("tname")
    private String k;

    @SerializedName("uname")
    private String l;

    @SerializedName("mid")
    private String m;

    @SerializedName("pic")
    private String n;

    @SerializedName("duration")
    private Long o;

    @SerializedName("desc")
    private String p;

    @SerializedName("accept_description")
    private List<String> q;

    @SerializedName("accept_quality")
    private List<Integer> r;

    @SerializedName("pages")
    private List<d> s;

    @SerializedName("dash")
    private C0562a t;

    public final List<String> a() {
        List<String> list = this.q;
        return list == null ? Collections.emptyList() : list;
    }

    public final List<Integer> b() {
        List<Integer> list = this.r;
        return list == null ? Collections.emptyList() : list;
    }

    public final String c() {
        return TextUtils.isEmpty(this.h) ? "" : this.h;
    }

    public final String d() {
        return TextUtils.isEmpty(this.i) ? "" : this.i;
    }

    public final C0562a e() {
        C0562a c0562a = this.t;
        return c0562a == null ? new C0562a() : c0562a;
    }

    public final String f() {
        return TextUtils.isEmpty(this.p) ? "" : this.p;
    }

    public final Long g() {
        Long l = this.o;
        return Long.valueOf(l == null ? 0L : l.longValue());
    }

    public final JsonElement h() {
        return this.c;
    }

    public final String i() {
        return TextUtils.isEmpty(this.m) ? "" : this.m;
    }

    public final List<d> j() {
        List<d> list = this.s;
        return list == null ? Collections.emptyList() : list;
    }

    public final String k() {
        return TextUtils.isEmpty(this.n) ? "" : this.n;
    }

    /* JADX INFO: renamed from: k, reason: collision with other method in class */
    public final boolean m97k() {
        Boolean bool = this.d;
        return bool != null && bool.booleanValue();
    }

    public final String l() {
        return TextUtils.isEmpty(this.f) ? "" : this.f;
    }

    public final JsonElement m() {
        return this.a;
    }

    public final String n() {
        return TextUtils.isEmpty(this.j) ? "" : this.j;
    }

    public final String o() {
        return TextUtils.isEmpty(this.k) ? "" : this.k;
    }

    public final String p() {
        String str = this.l;
        return str == null ? "" : str;
    }

    public final String q() {
        return TextUtils.isEmpty(this.g) ? "" : this.g;
    }

    public final JsonElement r() {
        return this.b;
    }

    public final boolean s() {
        Integer num = this.e;
        return (num == null || num.intValue() == 0) ? false : true;
    }
}
