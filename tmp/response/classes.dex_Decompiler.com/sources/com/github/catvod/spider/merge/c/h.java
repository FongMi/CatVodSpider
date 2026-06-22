package com.github.catvod.spider.merge.c;

import com.github.catvod.spider.merge.a.C0098a;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class h {

    @SerializedName("class")
    private List<C0135a> a;

    @SerializedName("list")
    private List<k> b;

    @SerializedName("filters")
    private LinkedHashMap<String, List<C0137c>> c;

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
        h hVar = new h();
        hVar.b = Collections.emptyList();
        hVar.h = str;
        return hVar.toString();
    }

    public static h e() {
        return new h();
    }

    public static String i(String str) {
        h hVar = new h();
        hVar.h = str;
        return hVar.toString();
    }

    public static String n(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0098a.a(new byte[]{-7, -48, -1, -19, -56}, new byte[]{-119, -79, -115, -98, -83, -106, 49, -83}), 0);
            jSONObject.put(C0098a.a(new byte[]{-118, -106, -91}, new byte[]{-1, -28, -55, 103, 46, 126, -2, 26}), "");
            jSONObject.put(C0098a.a(new byte[]{59, -121, 49}, new byte[]{86, -12, 86, 33, 65, 7, 64, -101}), str);
            jSONObject.put(C0098a.a(new byte[]{-119, 115, 23, 90, 84, -42}, new byte[]{-20, 1, 101, 23, 39, -79, 3, 30}), str);
            return jSONObject.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public static String p(k kVar) {
        h hVar = new h();
        hVar.b = Collections.singletonList(kVar);
        return hVar.toString();
    }

    public static String q(List<k> list) {
        h hVar = new h();
        hVar.b = list;
        return hVar.toString();
    }

    public static String r(List<C0135a> list, JsonElement jsonElement) {
        h hVar = new h();
        hVar.a = list;
        if (jsonElement != null) {
            hVar.c = (LinkedHashMap) new Gson().fromJson(jsonElement.toString(), new C0141g().getType());
        }
        return hVar.toString();
    }

    public static String s(List<C0135a> list, LinkedHashMap<String, List<C0137c>> linkedHashMap) {
        h hVar = new h();
        hVar.a = list;
        hVar.c = linkedHashMap;
        return hVar.toString();
    }

    public static String t(List<C0135a> list, List<k> list2) {
        h hVar = new h();
        hVar.a = list;
        hVar.b = list2;
        return hVar.toString();
    }

    public static String u(List<C0135a> list, List<k> list2, LinkedHashMap<String, List<C0137c>> linkedHashMap) {
        h hVar = new h();
        hVar.a = list;
        hVar.b = list2;
        hVar.c = linkedHashMap;
        return hVar.toString();
    }

    public static String v(List<C0135a> list, List<k> list2, JSONObject jSONObject) {
        h hVar = new h();
        hVar.a = list;
        hVar.b = list2;
        hVar.d(jSONObject);
        return hVar.toString();
    }

    public static String w(List<C0135a> list, JSONObject jSONObject) {
        h hVar = new h();
        hVar.a = list;
        hVar.d(jSONObject);
        return hVar.toString();
    }

    public final h A(List<k> list) {
        this.b = list;
        return this;
    }

    public final h a(String str) {
        this.f = str;
        return this;
    }

    public final h b() {
        this.e = C0098a.a(new byte[]{-65, 102, 66, -77, -62, 116, -14, 28, -73, 121, 92, -16, -49, 118, -32, 0, -11, 110, 95, -77}, new byte[]{-34, 22, 50, -33, -85, 23, -109, 104});
        return this;
    }

    public final h d(JSONObject jSONObject) {
        this.c = (LinkedHashMap) new Gson().fromJson(jSONObject.toString(), new C0140f().getType());
        return this;
    }

    public final h f(Map<String, String> map) {
        if (map.isEmpty()) {
            return this;
        }
        this.d = new Gson().toJson(map);
        return this;
    }

    public final h g() {
        this.l = 1;
        return this;
    }

    public final h h() {
        this.e = C0098a.a(new byte[]{54, -67, 93, 122, -84, -116, -57, -20, 62, -94, 67, 57, -67, -62, -53, -24, 50, -86, 120, 68, -119}, new byte[]{87, -51, 45, 22, -59, -17, -90, -104});
        return this;
    }

    public final h j() {
        this.e = C0098a.a(new byte[]{26, -79, 127, 122, -27, 10, -97, -121, 18, -82, 97, 57, -29, 10, -118, -106, 15, -20, 124, 98, -2, 12, -97, -98}, new byte[]{123, -63, 15, 22, -116, 105, -2, -13});
        return this;
    }

    public final h k(int i, int i2, int i3, int i4) {
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

    public final h l() {
        this.k = 1;
        return this;
    }

    public final h m(int i) {
        this.k = i;
        return this;
    }

    public final String o() {
        return toString();
    }

    public final String toString() {
        return new Gson().newBuilder().disableHtmlEscaping().create().toJson(this);
    }

    public final h x(List<i> list) {
        this.j = list;
        return this;
    }

    public final h y(String str) {
        this.i = str;
        return this;
    }

    public final h z(List<String> list) {
        this.i = list;
        return this;
    }
}
