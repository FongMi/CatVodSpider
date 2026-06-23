package com.github.catvod.spider.merge.FM.g;

import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.g.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0346b {

    @SerializedName("result")
    private JsonElement a;

    @SerializedName("list")
    private JsonElement b;

    @SerializedName("isLogin")
    private Boolean c;

    @SerializedName("vipStatus")
    private Integer d;

    @SerializedName("qrcode_key")
    private String e;

    @SerializedName("url")
    private String f;

    @SerializedName("aid")
    private String g;

    @SerializedName("cid")
    private String h;

    @SerializedName("title")
    private String i;

    @SerializedName("tname")
    private String j;

    @SerializedName("pic")
    private String k;

    @SerializedName("duration")
    private Long l;

    @SerializedName("desc")
    private String m;

    @SerializedName("accept_description")
    private List<String> n;

    @SerializedName("accept_quality")
    private List<Integer> o;

    @SerializedName("pages")
    private List<C0349e> p;

    @SerializedName("dash")
    private C0345a q;

    @SerializedName("owner")
    private C0348d r;

    @SerializedName("wbi_img")
    private C0355k s;

    public final List<String> a() {
        List<String> list = this.n;
        return list == null ? Collections.emptyList() : list;
    }

    public final List<Integer> b() {
        List<Integer> list = this.o;
        return list == null ? Collections.emptyList() : list;
    }

    public final String c() {
        return TextUtils.isEmpty(this.h) ? "" : this.h;
    }

    public final C0345a d() {
        C0345a c0345a = this.q;
        return c0345a == null ? new C0345a() : c0345a;
    }

    public final String e() {
        return TextUtils.isEmpty(this.m) ? "" : this.m;
    }

    public final Long f() {
        Long l = this.l;
        return Long.valueOf(l == null ? 0L : l.longValue());
    }

    public final JsonElement g() {
        return this.b;
    }

    public final C0348d h() {
        C0348d c0348d = this.r;
        return c0348d == null ? new C0348d() : c0348d;
    }

    public final List<C0349e> i() {
        List<C0349e> list = this.p;
        return list == null ? Collections.emptyList() : list;
    }

    public final String j() {
        return TextUtils.isEmpty(this.k) ? "" : this.k;
    }

    public final String k() {
        return TextUtils.isEmpty(this.e) ? "" : this.e;
    }

    public final JsonElement l() {
        return this.a;
    }

    public final String m() {
        return TextUtils.isEmpty(this.i) ? "" : this.i;
    }

    public final String n() {
        return TextUtils.isEmpty(this.j) ? "" : this.j;
    }

    public final String o() {
        return TextUtils.isEmpty(this.f) ? "" : this.f;
    }

    public final C0355k p() {
        C0355k c0355k = this.s;
        return c0355k == null ? new C0355k() : c0355k;
    }

    public final boolean q() {
        Boolean bool = this.c;
        return bool != null && bool.booleanValue();
    }

    public final boolean r() {
        Integer num = this.d;
        return (num == null || num.intValue() == 0) ? false : true;
    }
}
