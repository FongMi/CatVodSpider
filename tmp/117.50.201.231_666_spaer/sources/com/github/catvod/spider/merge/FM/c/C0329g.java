package com.github.catvod.spider.merge.FM.c;

import com.github.catvod.spider.merge.FM.a.C0298a;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.c.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0329g {

    @SerializedName("class")
    private List<C0323a> a;

    @SerializedName("list")
    private List<C0332j> b;

    @SerializedName("filters")
    private LinkedHashMap<String, List<C0325c>> c;

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
    private List<C0330h> j;

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
        C0329g c0329g = new C0329g();
        c0329g.b = Collections.emptyList();
        c0329g.h = str;
        return c0329g.toString();
    }

    public static C0329g e() {
        return new C0329g();
    }

    public static String i(String str) {
        C0329g c0329g = new C0329g();
        c0329g.h = str;
        return c0329g.toString();
    }

    public static String n(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0298a.b(new byte[]{77, -35, 124, -84, 4}, new byte[]{61, -68, 14, -33, 97, 111, 42, -22}), 0);
            jSONObject.put("url", "");
            jSONObject.put("msg", str);
            jSONObject.put("errMsg", str);
            return jSONObject.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public static String p(C0332j c0332j) {
        C0329g c0329g = new C0329g();
        c0329g.b = Collections.singletonList(c0332j);
        return c0329g.toString();
    }

    public static String q(List<C0332j> list) {
        C0329g c0329g = new C0329g();
        c0329g.b = list;
        return c0329g.toString();
    }

    public static String r(List<C0323a> list, LinkedHashMap<String, List<C0325c>> linkedHashMap) {
        C0329g c0329g = new C0329g();
        c0329g.a = list;
        c0329g.c = linkedHashMap;
        return c0329g.toString();
    }

    public static String s(List<C0323a> list, List<C0332j> list2) {
        C0329g c0329g = new C0329g();
        c0329g.a = list;
        c0329g.b = list2;
        return c0329g.toString();
    }

    public static String t(List<C0323a> list, List<C0332j> list2, LinkedHashMap<String, List<C0325c>> linkedHashMap) {
        C0329g c0329g = new C0329g();
        c0329g.a = list;
        c0329g.b = list2;
        c0329g.c = linkedHashMap;
        return c0329g.toString();
    }

    public static String u(List<C0323a> list, List<C0332j> list2, JSONObject jSONObject) {
        C0329g c0329g = new C0329g();
        c0329g.a = list;
        c0329g.b = list2;
        c0329g.d(jSONObject);
        return c0329g.toString();
    }

    public static String v(List<C0323a> list, JSONObject jSONObject) {
        C0329g c0329g = new C0329g();
        c0329g.a = list;
        c0329g.d(jSONObject);
        return c0329g.toString();
    }

    public final C0329g a(String str) {
        this.f = str;
        return this;
    }

    public final C0329g b() {
        this.e = "application/dash+xml";
        return this;
    }

    public final C0329g d(JSONObject jSONObject) {
        this.c = (LinkedHashMap) new Gson().fromJson(jSONObject.toString(), new C0328f().getType());
        return this;
    }

    public final C0329g f(Map<String, String> map) {
        if (map.isEmpty()) {
            return this;
        }
        this.d = new Gson().toJson(map);
        return this;
    }

    public final C0329g g() {
        this.l = 1;
        return this;
    }

    public final C0329g h() {
        this.e = "application/x-mpegURL";
        return this;
    }

    public final C0329g j() {
        this.e = "application/octet-stream";
        return this;
    }

    public final C0329g k(int i, int i2, int i3, int i4) {
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

    public final C0329g l() {
        this.k = 1;
        return this;
    }

    public final C0329g m(int i) {
        this.k = i;
        return this;
    }

    public final String o() {
        return toString();
    }

    public final String toString() {
        return new Gson().newBuilder().disableHtmlEscaping().create().toJson(this);
    }

    public final C0329g w(List<C0330h> list) {
        this.j = list;
        return this;
    }

    public final C0329g x(String str) {
        this.i = str;
        return this;
    }

    public final C0329g y(List<String> list) {
        this.i = list;
        return this;
    }

    public final C0329g z(List<C0332j> list) {
        this.b = list;
        return this;
    }
}
