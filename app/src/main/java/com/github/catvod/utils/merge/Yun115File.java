package com.github.catvod.utils.merge;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Yun115File implements Comparable<Yun115File> {

    @SerializedName("list")
    private List<Yun115File> children;

    @SerializedName("is_owner")
    private int isOwner;

    @SerializedName("fid")
    private String fileId;

    @SerializedName("n")
    private String fileName;

    @SerializedName("cid")
    private String categoryId;

    @SerializedName("fc")
    private int fileCount;

    @SerializedName("format_type")
    private String formatType;

    @SerializedName("ico")
    private String icon;

    @SerializedName("s")
    private double size;

    @SerializedName("sha")
    private String sha;

    @SerializedName(alternate = {"big_thumbnail"}, value = "thumb")
    private String thumbnail;

    public Yun115File(String str) {
        this.fileId = str;
        this.categoryId = str;
    }

    public final String a() {
        if (TextUtils.isEmpty(this.fileId)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.fileId);
        sb.append("_");
        sb.append(TextUtils.isEmpty(this.sha) ? "" : this.sha);
        return sb.toString();
    }

    public final String b() {
        return TextUtils.join(" ", Arrays.asList(com.github.catvod.spider.merge.i0.GeneralUtils.v(f()), j(), g(), f())).trim();
    }

    public final String c() {
        if (!this.fileName.contains(".")) {
            return "";
        }
        String str = this.fileName;
        return str.substring(str.lastIndexOf(".") + 1).toLowerCase();
    }

    @Override
    public final int compareTo(Yun115File other) {
        return k().compareTo(other.k());
    }

    public final String d() {
        return TextUtils.isEmpty(this.fileId) ? "" : this.fileId;
    }

    public final List<Yun115File> e() {
        List<Yun115File> list = this.children;
        return list == null ? Collections.emptyList() : list;
    }

    public final String f() {
        return TextUtils.isEmpty(this.fileName) ? "" : com.github.catvod.spider.merge.i0.GeneralUtils.y(this.fileName);
    }

    public final String g() {
        return TextUtils.isEmpty(this.categoryId) ? "" : this.categoryId;
    }

    public final String h() {
        return this.sha;
    }

    public final double i() {
        return this.size;
    }

    public final String j() {
        if (this.size == 0.0d) {
            return "";
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(com.github.catvod.spider.merge.i0.GeneralUtils.n(this.size));
        sb.append("]");
        return sb.toString();
    }

    public final String k() {
        return com.github.catvod.spider.merge.i0.GeneralUtils.v(f());
    }

    public final String l() {
        return this.thumbnail;
    }

    public final String m() {
        return this.fileCount == 0 ? "folder" : "file";
    }

    public final Yun115File n(String str) {
        this.categoryId = str;
        return this;
    }
}
