package com.github.catvod.spider.merge.h;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.h.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class C0123g {

    @SerializedName("country")
    private String a;

    @SerializedName("label")
    private String b;

    @SerializedName("chName")
    private String c;

    @SerializedName("startTime")
    private Integer d;

    @SerializedName("endTime")
    private Integer e;

    @SerializedName("pageSize")
    private Integer f;

    @SerializedName("page")
    private Integer g;

    public final void a(String str) {
        this.c = str;
    }

    public final void b(String str) {
        this.a = str;
    }

    public final void c(String str) {
        this.b = str;
    }

    public final void d(Integer num) {
        this.g = num;
    }

    public final void e() {
        this.f = 16;
    }

    public final void f(String str) {
        this.d = Integer.valueOf(Integer.parseInt(str));
        this.e = Integer.valueOf(Integer.parseInt(str));
    }

    public final String toString() {
        return new Gson().toJson(this);
    }
}
