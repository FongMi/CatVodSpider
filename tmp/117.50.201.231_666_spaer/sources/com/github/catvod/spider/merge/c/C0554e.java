package com.github.catvod.spider.merge.c;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.c.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0554e {

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
    private a o;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.c.e$a */
    public static class a {

        @SerializedName("type")
        private String a;

        @SerializedName("ratio")
        private Float b;

        public a() {
            this.a = "list";
        }

        public a(Float f) {
            this.a = "rect";
            this.b = f;
        }
    }

    public C0554e() {
    }

    public C0554e(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public C0554e(String str, String str2, String str3, String str4) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public C0554e(String str, String str2, String str3, String str4, String str5) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.n = str5;
    }

    public C0554e(String str, String str2, String str3, String str4, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.m = z ? "folder" : "file";
    }

    public static String e(C0554e c0554e) {
        C0552c c0552c = new C0552c();
        c0552c.q(c0554e);
        return c0552c.toString();
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.l;
    }

    public final void d(a aVar) {
        this.o = aVar;
    }

    public final void e(String str) {
        this.a = str;
    }

    public final void f(String str) {
        this.h = str;
    }

    public final String g() {
        return this.l;
    }

    public final void g(String str) {
        this.g = str;
    }

    public final void h(String str) {
        this.j = str;
    }

    public final void i(String str) {
        this.i = str;
    }

    public final void j(String str) {
        this.b = str;
    }

    public final void k(String str) {
        this.c = str;
    }

    public final void l(String str) {
        this.d = str;
    }

    public final void m(String str) {
        this.k = str;
    }

    public final void n(String str) {
        this.l = str;
    }

    public final void o(String str) {
        this.e = str;
    }

    public final void p(String str) {
        this.m = str;
    }

    public final void q(String str) {
        this.f = str;
    }

    public final void r(String str) {
        this.n = str;
    }
}
