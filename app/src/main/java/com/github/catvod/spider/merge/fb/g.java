package com.github.catvod.spider.merge.fb;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class g {

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

    @SerializedName("style")
    private f n;

    public g() {
    }

    public g(String str, String str2, String str3, String str4, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.m = z ? "folder" : "file";
    }

    public final void a(String str) {
        this.a = str;
    }

    public final void b(String str) {
        this.h = str;
    }

    public final void c(String str) {
        this.g = str;
    }

    public final void d(String str) {
        this.j = str;
    }

    public final void e(String str) {
        this.i = str;
    }

    public final void f(String str) {
        this.b = str;
    }

    public final void g(String str) {
        this.c = str;
    }

    public final void h(String str) {
        this.d = str;
    }

    public final void i(String str) {
        this.k = str;
    }

    public final void j(String str) {
        this.l = str;
    }

    public final void k(String str) {
        this.e = str;
    }

    public final void l(String str) {
        this.f = str;
    }
}
