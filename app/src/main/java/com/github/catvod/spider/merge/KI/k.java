package com.github.catvod.spider.merge.KI;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class k {

    @SerializedName("type_name")
    private String a;

    @SerializedName("vod_id")
    private String b;

    @SerializedName("vod_name")
    private String c;

    @SerializedName("vod_pic")
    private String d;

    @SerializedName("vod_remarks")
    private String e;

    @SerializedName("vod_year")
    private String f;

    @SerializedName("vod_area")
    private String g;

    @SerializedName("vod_actor")
    private String h;

    @SerializedName("vod_director")
    private String i;

    @SerializedName("vod_content")
    private String j;

    @SerializedName("vod_play_from")
    private String k;

    @SerializedName("vod_play_url")
    private String l;

    @SerializedName("vod_tag")
    private String m;

    @SerializedName("action")
    private String n;

    @SerializedName("style")
    private j o;

    public k() {
    }

    public k(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final String a() {
        return this.l;
    }

    public final void b(String str) {
        this.a = str;
    }

    public final void c(String str) {
        this.h = str;
    }

    public final void d(String str) {
        this.g = str;
    }

    public final void e(String str) {
        this.j = str;
    }

    public final void f(String str) {
        this.i = str;
    }

    public final void g(String str) {
        this.b = str;
    }

    public final void h(String str) {
        this.c = str;
    }

    public final void i(String str) {
        this.d = str;
    }

    public final void j(String str) {
        this.k = str;
    }

    public final void k(String str) {
        this.l = str;
    }

    public final void l(String str) {
        this.e = str;
    }

    public final void m(String str) {
        this.m = str;
    }

    public final void n(String str) {
        this.f = str;
    }

    public k(String str, String str2, String str3, String str4) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public k(String str, String str2, String str3, String str4, j jVar, String str5) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.o = jVar;
        this.n = str5;
    }

    public k(String str, String str2, String str3, String str4, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.m = z ? com.github.catvod.spider.merge.XI.f.a(new byte[]{-23, -69, -53, -5, -24, -113}, new byte[]{-113, -44, -89, -97, -115, -3, -11, -115}) : com.github.catvod.spider.merge.XI.f.a(new byte[]{-97, -30, 38, 24}, new byte[]{-7, -117, 74, 125, 101, 70, -114, 55});
    }
}
