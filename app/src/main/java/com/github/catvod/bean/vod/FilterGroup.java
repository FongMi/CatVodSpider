package com.github.catvod.bean.vod;

import com.github.catvod.bean.VodCategory;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * 播放器内容构建器（VodResult JSON 构建）
 */
public final class FilterGroup {

    @SerializedName("class")
    private List<VodCategory> a;

    @SerializedName("list")
    private List<VodItem> b;

    @SerializedName("filters")
    private LinkedHashMap<String, List<FilterItem>> c;

    @SerializedName("header")
    private String d;

    @SerializedName("format")
    private String e;

    @SerializedName("url")
    private String f;

    @SerializedName("subs")
    private List<SubtitleEntry> g;

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

    @SerializedName("msg")
    private String n;

    @SerializedName("danmaku")
    private String o;

    public FilterGroup() {
    }

    /** 构造筛选组（替代 merge.fb.FilterGroup 的 key, name, options 构造函数） */
    public FilterGroup(String key, String name, List<com.github.catvod.bean.dm84.FilterValue> options) {
        this.d = key;
        this.e = name;
        // Store as JSON string in format field for serialization
        try {
            this.f = new Gson().toJson(options);
        } catch (Exception ignored) {
        }
    }

    public static String e(FilterGroup result) {
        return result.toString();
    }

    /** Passthrough: if already a String, return as-is. */
    public static String e(String result) {
        return result;
    }

    public static String f(List<VodItem> list) {
        FilterGroup r = new FilterGroup();
        r.b = list;
        return r.toString();
    }

    public static String g(List<VodCategory> list, LinkedHashMap<String, List<FilterItem>> filters) {
        FilterGroup r = new FilterGroup();
        r.a = list;
        r.c = filters;
        return r.toString();
    }

    public final FilterGroup h(List<SubtitleEntry> subs) {
        this.g = subs;
        return this;
    }

    public final FilterGroup i(String url) {
        this.f = url;
        return this;
    }

    public final FilterGroup j(List<VodItem> list) {
        this.b = list;
        return this;
    }

    public final FilterGroup d() {
        this.h = 1;
        return this;
    }

    public final FilterGroup b() {
        this.i = 1;
        return this;
    }

    public final FilterGroup a(String header) {
        this.d = header;
        return this;
    }

    public final FilterGroup c(String format) {
        this.e = format;
        return this;
    }

    @Override
    public String toString() {
        return new Gson().newBuilder().disableHtmlEscaping().create().toJson(this);
    }

    /** Setter for subtitle list (accepts bean.h list). */
    public final FilterGroup v(List<com.github.catvod.bean.h> subs) {
        if (subs == null || subs.isEmpty()) return this;
        if (this.g == null) this.g = new java.util.ArrayList<>();
        for (com.github.catvod.bean.h sub : subs) {
            SubtitleEntry entry = new SubtitleEntry();
            entry.name = sub != null ? String.valueOf(sub) : "";
            this.g.add(entry);
        }
        return this;
    }

    /** Static helper: convert VodResult to JSON string. */
    public static String e(com.github.catvod.bean.VodResult result) {
        return result.toString();
    }

    // Inner classes
    public static class VodItem {
        @SerializedName("vod_id") public String id;
        @SerializedName("vod_name") public String name;
        @SerializedName("vod_pic") public String pic;
        @SerializedName("vod_remarks") public String remarks;
        @SerializedName("vod_play_from") public String playFrom;
        @SerializedName("vod_play_url") public String playUrl;
        @SerializedName("vod_content") public String content;
    }

    public static class SubtitleEntry {
        @SerializedName("url") public String url;
        @SerializedName("name") public String name;
        @SerializedName("lang") public String lang;
        @SerializedName("format") public String format;
    }
}
