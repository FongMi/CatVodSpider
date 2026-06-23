package com.github.catvod.spider.merge.c;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.c.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0552c {

    @SerializedName("class")
    private List<C0550a> a;

    @SerializedName("list")
    private List<C0554e> b;

    @SerializedName("filters")
    private LinkedHashMap<String, List<C0551b>> c;

    @SerializedName("header")
    private String d;

    @SerializedName("format")
    private String e;

    @SerializedName("danmaku")
    private String f;

    @SerializedName("url")
    private Object g;

    @SerializedName("subs")
    private List<C0553d> h;

    @SerializedName("parse")
    private int i;

    @SerializedName("jx")
    private int j;

    @SerializedName("page")
    private Integer k;

    @SerializedName("pagecount")
    private Integer l;

    @SerializedName("limit")
    private Integer m;

    @SerializedName("total")
    private Integer n;

    @SerializedName("msg")
    private String o;

    @SerializedName("errMsg")
    private String p;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.c.c$a */
    class a extends TypeToken<LinkedHashMap<String, List<C0551b>>> {
        a() {
        }
    }

    public static String c(String str) {
        C0552c c0552c = new C0552c();
        c0552c.b = Collections.emptyList();
        c0552c.o = str;
        return c0552c.toString();
    }

    public static C0552c e() {
        return new C0552c();
    }

    public static String i(List list) {
        if (list != null && !list.isEmpty()) {
            if (list.get(0) instanceof C0554e) {
                C0552c c0552c = new C0552c();
                c0552c.b = list;
                return c0552c.toString();
            }
            if (list.get(0) instanceof C0550a) {
                C0552c c0552c2 = new C0552c();
                c0552c2.a = list;
                return c0552c2.toString();
            }
        }
        return "";
    }

    public static String l(String str) {
        C0552c c0552c = new C0552c();
        c0552c.i = 0;
        c0552c.g = "";
        c0552c.o = str;
        c0552c.p = str;
        return c0552c.toString();
    }

    public static String m(C0554e c0554e) {
        C0552c c0552c = new C0552c();
        c0552c.b = Arrays.asList(c0554e);
        return c0552c.toString();
    }

    public static String m(Integer num, Integer num2, Integer num3, Integer num4, List list) {
        C0552c c0552c = new C0552c();
        c0552c.m95i(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
        c0552c.b = list;
        return c0552c.toString();
    }

    public static String n(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("parse", 0);
            jSONObject.put("url", "");
            jSONObject.put("msg", str);
            jSONObject.put("errMsg", str);
            return jSONObject.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public static String n(List<C0554e> list) {
        C0552c c0552c = new C0552c();
        c0552c.b = list;
        return c0552c.toString();
    }

    public static String o(List<C0550a> list, LinkedHashMap<String, List<C0551b>> linkedHashMap) {
        C0552c c0552c = new C0552c();
        c0552c.a = list;
        c0552c.c = linkedHashMap;
        return c0552c.toString();
    }

    public static String p(List<C0550a> list, List<C0554e> list2) {
        C0552c c0552c = new C0552c();
        c0552c.a = list;
        c0552c.b = list2;
        return c0552c.toString();
    }

    public static String q(ArrayList arrayList, List list, LinkedHashMap linkedHashMap) {
        C0552c c0552c = new C0552c();
        c0552c.a = arrayList;
        c0552c.b = list;
        c0552c.c = linkedHashMap;
        return c0552c.toString();
    }

    public static String q(List<C0550a> list, List<C0554e> list2, LinkedHashMap<String, List<C0551b>> linkedHashMap) {
        C0552c c0552c = new C0552c();
        c0552c.a = list;
        c0552c.b = list2;
        c0552c.c = linkedHashMap;
        return c0552c.toString();
    }

    public static String r(List<C0550a> list, List<C0554e> list2, JSONObject jSONObject) {
        C0552c c0552c = new C0552c();
        c0552c.a = list;
        c0552c.b = list2;
        c0552c.d(jSONObject);
        return c0552c.toString();
    }

    public static String s(List<C0550a> list, JSONObject jSONObject) {
        C0552c c0552c = new C0552c();
        c0552c.a = list;
        c0552c.d(jSONObject);
        return c0552c.toString();
    }

    public final C0552c a(String str) {
        this.f = str;
        return this;
    }

    public final C0552c b() {
        this.e = "application/dash+xml";
        return this;
    }

    public final void b(int i) {
        if (i <= 0) {
            i = Integer.MAX_VALUE;
        }
        this.k = Integer.valueOf(i);
        this.m = Integer.MAX_VALUE;
        this.n = Integer.MAX_VALUE;
        this.l = Integer.MAX_VALUE;
    }

    public final C0552c d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return this;
        }
        this.c = (LinkedHashMap) new Gson().fromJson(jSONObject.toString(), new a().getType());
        return this;
    }

    public final C0552c e(Map<String, String> map) {
        if (map.isEmpty()) {
            return this;
        }
        this.d = new Gson().toJson(map);
        return this;
    }

    /* JADX INFO: renamed from: e, reason: collision with other method in class */
    public final void m94e(Map map) {
        if (map.isEmpty()) {
            return;
        }
        this.d = new Gson().toJson(map);
    }

    public final C0552c f() {
        this.j = 1;
        return this;
    }

    public final C0552c g() {
        this.e = "application/x-mpegURL";
        return this;
    }

    public final C0552c h() {
        this.e = "application/octet-stream";
        return this;
    }

    public final C0552c hh() {
        this.e = "video/x-iso";
        return this;
    }

    public final C0552c i(int i, int i2, int i3, int i4) {
        if (i <= 0) {
            i = Integer.MAX_VALUE;
        }
        this.k = Integer.valueOf(i);
        if (i3 <= 0) {
            i3 = Integer.MAX_VALUE;
        }
        this.m = Integer.valueOf(i3);
        if (i4 <= 0) {
            i4 = Integer.MAX_VALUE;
        }
        this.n = Integer.valueOf(i4);
        if (i2 <= 0) {
            i2 = Integer.MAX_VALUE;
        }
        this.l = Integer.valueOf(i2);
        return this;
    }

    /* JADX INFO: renamed from: i, reason: collision with other method in class */
    public final void m95i(int i, int i2, int i3, int i4) {
        if (i <= 0) {
            i = Integer.MAX_VALUE;
        }
        this.k = Integer.valueOf(i);
        if (i3 <= 0) {
            i3 = Integer.MAX_VALUE;
        }
        this.m = Integer.valueOf(i3);
        if (i4 <= 0) {
            i4 = Integer.MAX_VALUE;
        }
        this.n = Integer.valueOf(i4);
        if (i2 <= 0) {
            i2 = Integer.MAX_VALUE;
        }
        this.l = Integer.valueOf(i2);
    }

    public final C0552c j() {
        this.i = 1;
        return this;
    }

    public final C0552c k(int i) {
        this.i = i;
        return this;
    }

    public final String o() {
        return toString();
    }

    public final C0552c q(C0554e c0554e) {
        this.b = Arrays.asList(c0554e);
        return this;
    }

    public final C0552c t(List<C0553d> list) {
        this.h = list;
        return this;
    }

    public final String toString() {
        return new Gson().newBuilder().disableHtmlEscaping().create().toJson(this);
    }

    public final C0552c u(String str) {
        this.g = str;
        return this;
    }

    public final C0552c v(List<String> list) {
        this.g = list;
        return this;
    }

    public final C0552c w(List<C0554e> list) {
        this.b = list;
        return this;
    }

    public final void w(String str) {
        this.g = str;
    }

    public final void y(List list) {
        this.g = list;
    }

    public final void z(List list) {
        this.b = list;
    }
}
