package com.github.catvod.spider.merge.b0;

import android.text.TextUtils;
import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.i0.m;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0902a implements Comparable<C0902a> {

    @SerializedName("list")
    private List<C0902a> b;

    @SerializedName("is_owner")
    private int c;

    @SerializedName("fid")
    private String d;

    @SerializedName("n")
    private String e;

    @SerializedName("cid")
    private String f;

    @SerializedName("fc")
    private int g;

    @SerializedName("format_type")
    private String h;

    @SerializedName("ico")
    private String i;

    @SerializedName("s")
    private double j;

    @SerializedName("sha")
    private String k;

    @SerializedName(alternate = {"big_thumbnail"}, value = "thumb")
    private String l;

    public C0902a(String str) {
        this.d = str;
        this.f = str;
    }

    public final String a() {
        if (TextUtils.isEmpty(this.d)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        sb.append("_");
        sb.append(TextUtils.isEmpty(this.k) ? "" : this.k);
        return sb.toString();
    }

    public final String b() {
        return TextUtils.join(" ", Arrays.asList(m.v(f()), j(), g(), f())).trim();
    }

    public final String c() {
        if (!this.e.contains(".")) {
            return "";
        }
        String str = this.e;
        return str.substring(str.lastIndexOf(".") + 1).toLowerCase();
    }

    @Override // java.lang.Comparable
    public final int compareTo(C0902a c0902a) {
        return k().compareTo(c0902a.k());
    }

    public final String d() {
        return TextUtils.isEmpty(this.d) ? "" : this.d;
    }

    public final List<C0902a> e() {
        List<C0902a> list = this.b;
        return list == null ? Collections.emptyList() : list;
    }

    public final String f() {
        return TextUtils.isEmpty(this.e) ? "" : m.y(this.e);
    }

    public final String g() {
        return TextUtils.isEmpty(this.f) ? "" : this.f;
    }

    public final String h() {
        return this.k;
    }

    public final double i() {
        return this.j;
    }

    public final String j() {
        if (this.j == 0.0d) {
            return "";
        }
        StringBuilder sbB = t0.b("[");
        sbB.append(m.n(this.j));
        sbB.append("]");
        return sbB.toString();
    }

    public final String k() {
        return m.v(f());
    }

    public final String l() {
        return this.l;
    }

    public final String m() {
        return this.g == 0 ? "folder" : "file";
    }

    public final C0902a n(String str) {
        this.f = str;
        return this;
    }
}
