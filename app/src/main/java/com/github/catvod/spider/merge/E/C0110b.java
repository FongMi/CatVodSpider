package com.github.catvod.spider.merge.e;

import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.e.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class C0110b {

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
    private List<C0113e> p;

    @SerializedName("dash")
    private C0109a q;

    @SerializedName("owner")
    private C0112d r;

    @SerializedName("wbi_img")
    private j s;

    public final List a() {
        List<String> list = this.n;
        return list == null ? Collections.emptyList() : list;
    }

    public final List b() {
        List<Integer> list = this.o;
        return list == null ? Collections.emptyList() : list;
    }

    public final String c() {
        return TextUtils.isEmpty(this.h) ? "" : this.h;
    }

    public final C0109a d() {
        C0109a c0109a = this.q;
        return c0109a == null ? new C0109a() : c0109a;
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

    public final C0112d h() {
        C0112d c0112d = this.r;
        return c0112d == null ? new C0112d() : c0112d;
    }

    public final List i() {
        List<C0113e> list = this.p;
        return list == null ? Collections.emptyList() : list;
    }

    public final String j() {
        return TextUtils.isEmpty(this.k) ? "" : this.k;
    }

    public final JsonElement k() {
        return this.a;
    }

    public final String l() {
        return TextUtils.isEmpty(this.i) ? "" : this.i;
    }

    public final String m() {
        return TextUtils.isEmpty(this.j) ? "" : this.j;
    }

    public final j n() {
        j jVar = this.s;
        return jVar == null ? new j() : jVar;
    }

    public final boolean o() {
        Boolean bool = this.c;
        return bool != null && bool.booleanValue();
    }

    public final boolean p() {
        Integer num = this.d;
        return (num == null || num.intValue() == 0) ? false : true;
    }
}
