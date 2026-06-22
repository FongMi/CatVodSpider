package com.github.catvod.spider.merge.ai;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class k {

    @SerializedName("class")
    private List<j> a;

    @SerializedName("list")
    private List<m> b;

    @SerializedName("filters")
    private LinkedHashMap<String, List<Object>> c;

    @SerializedName("header")
    private String d;

    @SerializedName("format")
    private String e;

    @SerializedName("danmaku")
    private String f;

    @SerializedName("url")
    private Object g;

    @SerializedName("subs")
    private List<Object> h;

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

    public static String b(m mVar) {
        k kVar = new k();
        kVar.b = Arrays.asList(mVar);
        return kVar.toString();
    }

    public static String c(List<j> list, List<m> list2) {
        k kVar = new k();
        kVar.a = list;
        kVar.b = list2;
        return kVar.toString();
    }

    public final k a() {
        this.k = 1;
        this.m = Integer.MAX_VALUE;
        this.n = 1;
        this.l = 1;
        return this;
    }

    public final k d(List<m> list) {
        this.b = list;
        return this;
    }

    public final String toString() {
        return new Gson().newBuilder().disableHtmlEscaping().create().toJson(this);
    }
}
