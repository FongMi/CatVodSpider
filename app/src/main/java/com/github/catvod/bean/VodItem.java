package com.github.catvod.bean;

import com.github.catvod.en.NetPan;
import com.google.gson.annotations.SerializedName;

public final class VodItem {

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

    @SerializedName("action")
    private String k;

    @SerializedName("vod_play_from")
    private String l;

    @SerializedName("vod_play_url")
    private String m;

    @SerializedName("vod_tag")
    private String n;

    public VodItem() {
    }

    public VodItem(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final String a() {
        return NetPan.getNetPanType(this.b);
    }

    public final String b() {
        return this.j;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.d;
    }

    public final String f() {
        return this.m;
    }

    public final void g(String str) {
        this.a = str;
    }

    public final void h(String str) {
        this.h = str;
    }

    public final void i(String str) {
        this.g = str;
    }

    public final void j(String str) {
        this.j = str;
    }

    public final void k(String str) {
        this.i = str;
    }

    public final void l(String str) {
        this.b = str;
    }

    public final void m(String str) {
        this.c = str;
    }

    public final void n(String str) {
        this.d = str;
    }

    public final void o(String str) {
        this.l = str;
    }

    public final void p(String str) {
        this.m = str;
    }

    public final void q(String str) {
        this.e = str;
    }

    public final void r(String str) {
        this.n = str;
    }

    public final void s(String str) {
        this.f = str;
    }

    public VodItem(String str, String str2, String str3, String str4) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public VodItem(String str, String str2, String str3, String str4, String str5) {
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.k = str;
    }

    public VodItem(String str, String str2, String str3, String str4, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.n = z ? "folder" : "file";
    }
}
