package com.github.catvod.spider.merge.fb;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class FilterGroup {

    @SerializedName("class")
    private List<a> a;

    @SerializedName("list")
    private List<g> b;

    @SerializedName("filters")
    private LinkedHashMap<String, List<c>> c;

    @SerializedName("header")
    private String d;

    @SerializedName("format")
    private String e;

    @SerializedName("url")
    private String f;

    @SerializedName("subs")
    private List<e> g;

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

    public static String e(g gVar) {
        FilterGroup dVar = new FilterGroup();
        dVar.b = Arrays.asList(gVar);
        return dVar.toString();
    }

    public static String f(List<g> list) {
        FilterGroup dVar = new FilterGroup();
        dVar.b = list;
        return dVar.toString();
    }

    public static String g(List<a> list, LinkedHashMap<String, List<c>> linkedHashMap) {
        FilterGroup dVar = new FilterGroup();
        dVar.a = list;
        dVar.c = linkedHashMap;
        return dVar.toString();
    }

    public final FilterGroup a(Map<String, String> map) {
        if (map.isEmpty()) {
            return this;
        }
        this.d = new Gson().toJson(map);
        return this;
    }

    public final FilterGroup b() {
        this.i = 1;
        return this;
    }

    public final FilterGroup c() {
        this.j = 1;
        this.l = Integer.MAX_VALUE;
        this.m = 1;
        this.k = 1;
        return this;
    }

    public final FilterGroup d() {
        this.h = 1;
        return this;
    }

    public final FilterGroup h(List<e> list) {
        this.g = list;
        return this;
    }

    public final FilterGroup i(String str) {
        this.f = str;
        return this;
    }

    public final FilterGroup j(List<g> list) {
        this.b = list;
        return this;
    }

    public final String toString() {
        return new Gson().toJson(this);
    }
}
