package com.github.catvod.spider.merge.g;

import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0160b {

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
    private List<C0163e> p;

    @SerializedName("dash")
    private C0159a q;

    @SerializedName("owner")
    private C0162d r;

    @SerializedName("wbi_img")
    private C0168j s;

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

    public final C0159a d() {
        C0159a c0159a = this.q;
        return c0159a == null ? new C0159a() : c0159a;
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

    public final C0162d h() {
        C0162d c0162d = this.r;
        return c0162d == null ? new C0162d() : c0162d;
    }

    public final List<C0163e> i() {
        List<C0163e> list = this.p;
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

    public final C0168j p() {
        C0168j c0168j = this.s;
        return c0168j == null ? new C0168j() : c0168j;
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
