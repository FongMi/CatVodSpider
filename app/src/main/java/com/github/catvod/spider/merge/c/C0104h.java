package com.github.catvod.spider.merge.c;

import android.text.TextUtils;
import com.github.catvod.spider.merge.A.T;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.c.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class C0104h implements Comparable<C0104h> {

    @SerializedName("items")
    private List<C0104h> a;

    @SerializedName("next_marker")
    private String b;

    @SerializedName("file_id")
    private String c;

    @SerializedName("share_id")
    private String d;

    @SerializedName("name")
    private String e;

    @SerializedName("type")
    private String f;

    @SerializedName("file_extension")
    private String g;

    @SerializedName("category")
    private String h;

    @SerializedName("size")
    private double i;

    @SerializedName("parent")
    private String j;

    public C0104h(String str) {
        this.c = str;
    }

    public final String a() {
        return TextUtils.isEmpty(this.h) ? "" : this.h;
    }

    public final String b() {
        String str;
        String strH = h();
        String strF = f();
        if (this.i == 0.0d) {
            str = "";
        } else {
            str = "[" + com.github.catvod.spider.merge.o.d.c(this.i) + "]";
        }
        return TextUtils.join(" ", Arrays.asList(strH, strF, str)).trim();
    }

    public final String c() {
        return TextUtils.isEmpty(this.g) ? "" : this.g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C0104h c0104h) {
        return i().compareTo(c0104h.i());
    }

    public final String d() {
        return TextUtils.isEmpty(this.c) ? "" : this.c;
    }

    public final List e() {
        List<C0104h> list = this.a;
        return list == null ? Collections.emptyList() : list;
    }

    public final String f() {
        return TextUtils.isEmpty(this.e) ? "" : this.e;
    }

    public final String g() {
        return TextUtils.isEmpty(this.b) ? "" : this.b;
    }

    public final String h() {
        return TextUtils.isEmpty(this.j) ? "" : T.h(new StringBuilder("["), this.j, "]");
    }

    public final String i() {
        String str;
        String strH = h();
        String strF = f();
        Pattern pattern = com.github.catvod.spider.merge.o.d.a;
        String str2 = "";
        try {
            Matcher matcher = Pattern.compile(".*(1080|720|2160|4k|4K).*").matcher(strF);
            if (matcher.find()) {
                str = matcher.group(1) + " " + strF;
            } else {
                str = strF;
            }
            Matcher matcher2 = Pattern.compile("^([0-9]+)").matcher(strF);
            if (matcher2.find()) {
                str = matcher2.group(1) + " " + str;
            }
            str2 = str.replaceAll("\\D+", "") + " " + str.replaceAll("\\d+", "");
        } catch (Exception unused) {
        }
        return TextUtils.join(" ", Arrays.asList(strH, str2)).trim();
    }

    public final String j() {
        return TextUtils.isEmpty(this.f) ? "" : this.f;
    }

    public final void k(String str) {
        this.j = str;
    }
}
