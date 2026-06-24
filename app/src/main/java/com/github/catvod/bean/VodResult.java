package com.github.catvod.bean;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class VodResult {

    @SerializedName("class")
    private List<VodCategory> a;

    @SerializedName("list")
    private List<VodItem> b;

    @SerializedName("filters")
    private LinkedHashMap<String, List<d>> c;

    @SerializedName("header")
    private String d;

    @SerializedName("format")
    private String e;

    @SerializedName("url")
    private Object f;

    @SerializedName("subs")
    private List<h> g;

    @SerializedName("parse")
    private int h;

    @SerializedName("jx")
    private int i;

    @SerializedName("page")
    private Integer j;

    @SerializedName("pagecount")
    private Integer k;

    @SerializedName("limit")
    private Integer l;

    @SerializedName("total")
    private Integer m;

    @SerializedName("danmaku")
    private String n;

    @SerializedName("msg")
    private String o;

    public static String c(String str) {
        VodResult gVar = new VodResult();
        gVar.b = Collections.emptyList();
        gVar.o = str;
        return gVar.toString();
    }

    public static String m(VodItem iVar) {
        VodResult gVar = new VodResult();
        gVar.b = Arrays.asList(iVar);
        return gVar.toString();
    }

    public static String n(List<VodItem> list) {
        VodResult gVar = new VodResult();
        gVar.b = list;
        return gVar.toString();
    }

    public static String o(List<VodCategory> list, JsonElement jsonElement) {
        VodResult gVar = new VodResult();
        gVar.a = list;
        gVar.d(jsonElement);
        return gVar.toString();
    }

    /** Overload accepting JSONObject directly (used by PTT and similar spiders). */
    public static String o(List<VodCategory> list, org.json.JSONObject jSONObject) {
        VodResult gVar = new VodResult();
        gVar.a = list;
        gVar.e(jSONObject);
        return gVar.toString();
    }

    public static String p(List<VodCategory> list, LinkedHashMap<String, List<d>> linkedHashMap) {
        VodResult gVar = new VodResult();
        gVar.a = list;
        gVar.c = linkedHashMap;
        return gVar.toString();
    }

    public static String q(List<VodCategory> list, List<VodItem> list2) {
        VodResult gVar = new VodResult();
        gVar.a = list;
        gVar.b = list2;
        return gVar.toString();
    }

    public static String r(List<VodCategory> list, List<VodItem> list2, JsonElement jsonElement) {
        VodResult gVar = new VodResult();
        gVar.a = list;
        gVar.b = list2;
        gVar.d(jsonElement);
        return gVar.toString();
    }

    public static String s(List<VodCategory> list, List<VodItem> list2, LinkedHashMap<String, List<d>> linkedHashMap) {
        VodResult gVar = new VodResult();
        gVar.a = list;
        gVar.b = list2;
        gVar.c = linkedHashMap;
        return gVar.toString();
    }

    public static String t(List<VodCategory> list, List<VodItem> list2, JSONObject jSONObject) {
        VodResult gVar = new VodResult();
        gVar.a = list;
        gVar.b = list2;
        gVar.e(jSONObject);
        return gVar.toString();
    }

    public static String u(List<VodCategory> list, JSONObject jSONObject) {
        VodResult gVar = new VodResult();
        gVar.a = list;
        gVar.e(jSONObject);
        return gVar.toString();
    }

    public final VodResult a(String str) {
        this.n = str;
        return this;
    }

    public final VodResult b() {
        this.e = "application/dash+xml";
        return this;
    }

    public final VodResult d(JsonElement jsonElement) {
        if (jsonElement == null) {
            return this;
        }
        this.c = (LinkedHashMap) new Gson().fromJson(jsonElement.toString(), new e().getType());
        return this;
    }

    public final VodResult e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return this;
        }
        this.c = (LinkedHashMap) new Gson().fromJson(jSONObject.toString(), new f().getType());
        return this;
    }

    public final List<VodItem> f() {
        List<VodItem> list = this.b;
        return list == null ? Collections.emptyList() : list;
    }

    public final VodResult g(Map<String, String> map) {
        if (map.isEmpty()) {
            return this;
        }
        this.d = new Gson().toJson(map);
        return this;
    }

    public final VodResult h() {
        this.i = 1;
        return this;
    }

    public final VodResult i() {
        Object obj = this.f;
        this.e = (obj == null || !String.valueOf(obj).toLowerCase().contains(".iso")) ? "application/octet-stream" : "video/x-iso";
        return this;
    }

    public final VodResult j(int i, int i2, int i3, int i4) {
        if (i <= 0) {
            i = Integer.MAX_VALUE;
        }
        this.j = Integer.valueOf(i);
        if (i3 <= 0) {
            i3 = Integer.MAX_VALUE;
        }
        this.l = Integer.valueOf(i3);
        if (i4 <= 0) {
            i4 = Integer.MAX_VALUE;
        }
        this.m = Integer.valueOf(i4);
        if (i2 <= 0) {
            i2 = Integer.MAX_VALUE;
        }
        this.k = Integer.valueOf(i2);
        return this;
    }

    public final VodResult k() {
        this.h = 1;
        return this;
    }

    public final VodResult l() {
        this.h = 0;
        return this;
    }

    public final String toString() {
        return new Gson().toJson(this);
    }

    public final VodResult v(List<h> list) {
        this.g = list;
        return this;
    }

    public final VodResult w(String str) {
        this.f = str;
        return this;
    }

    public final VodResult x(List<String> list) {
        this.f = list;
        return this;
    }

    public final VodResult y(List<VodItem> list) {
        this.b = list;
        return this;
    }

    /** Setter for vod_id (obfuscation name f). */
    public final VodResult f(String str) {
        // vod_id is set via VodItem, not directly on VodResult.
        // This is a stub for obfuscated code compatibility.
        return this;
    }

    /** Setter for vod_name (obfuscation name g, String overload). */
    public final VodResult g(String str) {
        this.o = str;
        return this;
    }

    /** Setter for image URL (obfuscation name h, String overload). */
    public final VodResult h(String str) {
        this.n = str;
        return this;
    }

    /** Setter for play_from (obfuscation name i, String overload). */
    public final VodResult i(String str) {
        this.d = str;
        return this;
    }

    /** Setter for play_url (obfuscation name j, String overload). */
    public final VodResult j(String str) {
        this.f = str;
        return this;
    }
}
