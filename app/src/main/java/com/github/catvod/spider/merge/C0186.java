package com.github.catvod.spider.merge;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Ԫ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0186 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    @SerializedName("class")
    private List<C0168> f457;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    @SerializedName("list")
    private List<C0188> f458;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    @SerializedName("filters")
    private LinkedHashMap<String, List<C0184>> f459;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    @SerializedName("url")
    private Object f460;

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    @SerializedName("subs")
    private List<C0187> f461;

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    @SerializedName("page")
    private Integer f462;

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    @SerializedName("pagecount")
    private Integer f463;

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    @SerializedName("limit")
    private Integer f464;

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    @SerializedName("total")
    private Integer f465;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static C0186 m651() {
        return new C0186();
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public static String m652(C0188 c0188) {
        return m651().m662(c0188).m659();
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public static String m653(List<C0188> list) {
        return m651().m663(list).m659();
    }

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    public static String m654(List<C0168> list, LinkedHashMap<String, List<C0184>> linkedHashMap) {
        return m651().m655(list).m656(linkedHashMap).m659();
    }

    public String toString() {
        return new Gson().newBuilder().disableHtmlEscaping().create().toJson(this);
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public C0186 m655(List<C0168> list) {
        this.f457 = list;
        return this;
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public C0186 m656(LinkedHashMap<String, List<C0184>> linkedHashMap) {
        this.f459 = linkedHashMap;
        return this;
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public C0186 m657() {
        return m658(1, 1, 0, 1);
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public C0186 m658(int i, int i2, int i3, int i4) {
        if (i <= 0) {
            i = Integer.MAX_VALUE;
        }
        this.f462 = Integer.valueOf(i);
        if (i3 <= 0) {
            i3 = Integer.MAX_VALUE;
        }
        this.f464 = Integer.valueOf(i3);
        if (i4 <= 0) {
            i4 = Integer.MAX_VALUE;
        }
        this.f465 = Integer.valueOf(i4);
        if (i2 <= 0) {
            i2 = Integer.MAX_VALUE;
        }
        this.f463 = Integer.valueOf(i2);
        return this;
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public String m659() {
        return toString();
    }

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    public C0186 m660(List<C0187> list) {
        this.f461 = list;
        return this;
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    public C0186 m661(String str) {
        this.f460 = str;
        return this;
    }

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    public C0186 m662(C0188 c0188) {
        this.f458 = Arrays.asList(c0188);
        return this;
    }

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    public C0186 m663(List<C0188> list) {
        this.f458 = list;
        return this;
    }
}
