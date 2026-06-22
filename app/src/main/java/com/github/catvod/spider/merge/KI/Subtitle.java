package com.github.catvod.spider.merge.KI;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class Subtitle {

    @SerializedName("class")
    private List<a> a;

    @SerializedName("list")
    private List<k> b;

    @SerializedName("filters")
    private LinkedHashMap<String, List<c>> c;

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
    private List<i> j;

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

    public static String c(String str) {
        Subtitle hVar = new Subtitle();
        hVar.b = Collections.emptyList();
        hVar.h = str;
        return hVar.toString();
    }

    public static Subtitle e() {
        return new Subtitle();
    }

    public static String i(String str) {
        Subtitle hVar = new Subtitle();
        hVar.h = str;
        return hVar.toString();
    }

    public static String n(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{25, 19, -110, 50, -72}, new byte[]{105, 114, -32, 65, -35, 125, -67, 94}), 0);
            jSONObject.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{6, -65, -92}, new byte[]{115, -51, -56, -6, -17, -10, -70, 0}), "");
            jSONObject.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{86, 60, -56}, new byte[]{59, 79, -81, 101, 100, 95, 47, 66}), str);
            jSONObject.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{89, -66, 9, 127, 35, -34}, new byte[]{60, -52, 123, 50, 80, -71, -96, 46}), str);
            return jSONObject.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public static String p(k kVar) {
        Subtitle hVar = new Subtitle();
        hVar.b = Collections.singletonList(kVar);
        return hVar.toString();
    }

    public static String q(List<k> list) {
        Subtitle hVar = new Subtitle();
        hVar.b = list;
        return hVar.toString();
    }

    public static String r(List<a> list, JsonElement jsonElement) {
        Subtitle hVar = new Subtitle();
        hVar.a = list;
        if (jsonElement != null) {
            hVar.c = (LinkedHashMap) new Gson().fromJson(jsonElement.toString(), new g().getType());
        }
        return hVar.toString();
    }

    public static String s(List<a> list, LinkedHashMap<String, List<c>> linkedHashMap) {
        Subtitle hVar = new Subtitle();
        hVar.a = list;
        hVar.c = linkedHashMap;
        return hVar.toString();
    }

    public static String t(List<a> list, List<k> list2) {
        Subtitle hVar = new Subtitle();
        hVar.a = list;
        hVar.b = list2;
        return hVar.toString();
    }

    public static String u(List<a> list, List<k> list2, LinkedHashMap<String, List<c>> linkedHashMap) {
        Subtitle hVar = new Subtitle();
        hVar.a = list;
        hVar.b = list2;
        hVar.c = linkedHashMap;
        return hVar.toString();
    }

    public static String v(List<a> list, List<k> list2, JSONObject jSONObject) {
        Subtitle hVar = new Subtitle();
        hVar.a = list;
        hVar.b = list2;
        hVar.d(jSONObject);
        return hVar.toString();
    }

    public static String w(List<a> list, JSONObject jSONObject) {
        Subtitle hVar = new Subtitle();
        hVar.a = list;
        hVar.d(jSONObject);
        return hVar.toString();
    }

    public final Subtitle A(List<k> list) {
        this.b = list;
        return this;
    }

    public final Subtitle a(String str) {
        this.f = str;
        return this;
    }

    public final Subtitle b() {
        this.e = com.github.catvod.spider.merge.XI.f.a(new byte[]{-114, 94, -92, 54, 91, 30, 79, -52, -122, 65, -70, 117, 86, 28, 93, -48, -60, 86, -71, 54}, new byte[]{-17, 46, -44, 90, 50, 125, 46, -72});
        return this;
    }

    public final Subtitle d(JSONObject jSONObject) {
        this.c = (LinkedHashMap) new Gson().fromJson(jSONObject.toString(), new f().getType());
        return this;
    }

    public final Subtitle f(Map<String, String> map) {
        if (map.isEmpty()) {
            return this;
        }
        this.d = new Gson().toJson(map);
        return this;
    }

    public final Subtitle g() {
        this.l = 1;
        return this;
    }

    public final Subtitle h() {
        this.e = com.github.catvod.spider.merge.XI.f.a(new byte[]{54, -124, 37, -66, 38, -44, -126, -96, 62, -101, 59, -3, 55, -102, -114, -92, 50, -109, 0, -128, 3}, new byte[]{87, -12, 85, -46, 79, -73, -29, -44});
        return this;
    }

    public final Subtitle j() {
        this.e = com.github.catvod.spider.merge.XI.f.a(new byte[]{-76, 27, 5, -118, 34, 46, -116, 95, -68, 4, 27, -55, 36, 46, -103, 78, -95, 70, 6, -110, 57, 40, -116, 70}, new byte[]{-43, 107, 117, -26, 75, 77, -19, 43});
        return this;
    }

    public final Subtitle k(int i, int i2, int i3, int i4) {
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
        return this;
    }

    public final Subtitle l() {
        this.k = 1;
        return this;
    }

    public final Subtitle m(int i) {
        this.k = i;
        return this;
    }

    public final String o() {
        return toString();
    }

    public final String toString() {
        return new Gson().newBuilder().disableHtmlEscaping().create().toJson(this);
    }

    public final Subtitle x(List<i> list) {
        this.j = list;
        return this;
    }

    public final Subtitle y(String str) {
        this.i = str;
        return this;
    }

    public final Subtitle z(List<String> list) {
        this.i = list;
        return this;
    }
}
