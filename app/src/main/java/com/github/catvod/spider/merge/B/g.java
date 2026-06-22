package com.github.catvod.spider.merge.b;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class g {

    @SerializedName("class")
    private List<C0093b> a;

    @SerializedName("list")
    private List<j> b;

    @SerializedName("filters")
    private LinkedHashMap<String, List<C0095d>> c;

    @SerializedName("header")
    private String d;

    @SerializedName("format")
    private String e;

    @SerializedName("danmaku")
    private String f;

    @SerializedName("click")
    private String g;

    @SerializedName("msg")
    private String h;

    @SerializedName("url")
    private Object i;

    @SerializedName("subs")
    private List<h> j;

    @SerializedName("parse")
    private int k;

    @SerializedName("jx")
    private int l;

    @SerializedName("page")
    private Integer m;

    @SerializedName("pagecount")
    private Integer n;

    @SerializedName("limit")
    private Integer o;

    @SerializedName("total")
    private Integer p;

    public static String d(String str) {
        g gVar = new g();
        gVar.b = Collections.emptyList();
        gVar.h = str;
        return gVar.toString();
    }

    public static String h(String str) {
        g gVar = new g();
        gVar.h = str;
        return gVar.toString();
    }

    public static String l(j jVar) {
        g gVar = new g();
        gVar.b = Arrays.asList(jVar);
        return gVar.toString();
    }

    public static String m(ArrayList arrayList) {
        g gVar = new g();
        gVar.b = arrayList;
        return gVar.toString();
    }

    public static String n(ArrayList arrayList, JsonElement jsonElement) {
        g gVar = new g();
        gVar.a = arrayList;
        if (jsonElement != null) {
            gVar.c = (LinkedHashMap) new Gson().fromJson(jsonElement.toString(), new f().getType());
        }
        return gVar.toString();
    }

    public static String o(ArrayList arrayList, ArrayList arrayList2, JsonElement jsonElement) {
        g gVar = new g();
        gVar.a = arrayList;
        gVar.b = arrayList2;
        if (jsonElement != null) {
            gVar.c = (LinkedHashMap) new Gson().fromJson(jsonElement.toString(), new f().getType());
        }
        return gVar.toString();
    }

    public static String p(ArrayList arrayList, ArrayList arrayList2, LinkedHashMap linkedHashMap) {
        g gVar = new g();
        gVar.a = arrayList;
        gVar.b = arrayList2;
        gVar.c = linkedHashMap;
        return gVar.toString();
    }

    public static String q(ArrayList arrayList, ArrayList arrayList2, JSONObject jSONObject) {
        g gVar = new g();
        gVar.a = arrayList;
        gVar.b = arrayList2;
        if (jSONObject != null) {
            gVar.c = (LinkedHashMap) new Gson().fromJson(jSONObject.toString(), new C0096e().getType());
        }
        return gVar.toString();
    }

    public static String r(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        g gVar = new g();
        gVar.a = arrayList;
        gVar.c = linkedHashMap;
        return gVar.toString();
    }

    public static String s(ArrayList arrayList, List list) {
        g gVar = new g();
        gVar.a = arrayList;
        gVar.b = list;
        return gVar.toString();
    }

    public static String t(ArrayList arrayList, JSONObject jSONObject) {
        g gVar = new g();
        gVar.a = arrayList;
        gVar.c = (LinkedHashMap) new Gson().fromJson(jSONObject.toString(), new C0096e().getType());
        return gVar.toString();
    }

    public final void a() {
        this.g = "document.getElementById('player-wrapper').click()";
    }

    public final void b(String str) {
        this.f = str;
    }

    public final void c() {
        this.e = "application/dash+xml";
    }

    public final void e(HashMap map) {
        if (map.isEmpty()) {
            return;
        }
        this.d = new Gson().toJson(map);
    }

    public final void f() {
        this.l = 1;
    }

    public final void g() {
        this.e = "application/x-mpegURL";
    }

    public final void i() {
        this.e = "application/octet-stream";
    }

    public final void j(int i, int i2, int i3, int i4) {
        if (i <= 0) {
            i = Integer.MAX_VALUE;
        }
        this.m = Integer.valueOf(i);
        if (i3 <= 0) {
            i3 = Integer.MAX_VALUE;
        }
        this.o = Integer.valueOf(i3);
        if (i4 <= 0) {
            i4 = Integer.MAX_VALUE;
        }
        this.p = Integer.valueOf(i4);
        if (i2 <= 0) {
            i2 = Integer.MAX_VALUE;
        }
        this.n = Integer.valueOf(i2);
    }

    public final void k() {
        this.k = 1;
    }

    public final String toString() {
        return new Gson().newBuilder().disableHtmlEscaping().create().toJson(this);
    }

    public final void u(List list) {
        this.j = list;
    }

    public final void v(String str) {
        this.i = str;
    }

    public final void w(ArrayList arrayList) {
        this.i = arrayList;
    }

    public final void x(ArrayList arrayList) {
        this.b = arrayList;
    }
}
