package com.github.catvod.spider.merge.d;

import android.text.TextUtils;
import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.b.C0544h;
import com.github.catvod.spider.merge.b.C0547k;
import com.github.catvod.spider.merge.m.C0590I;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class g implements Comparable<g> {

    @SerializedName("items")
    private List<g> a;

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

    @SerializedName("drive_id")
    private String j;

    @SerializedName("updated_at")
    private String k;

    @SerializedName("parent")
    private String l;

    public g(String str) {
        this.c = str;
    }

    public final String a() {
        return TextUtils.isEmpty(this.h) ? "" : this.h;
    }

    public final String b() {
        return TextUtils.join(" ", Arrays.asList(h(), ff(), i())).trim();
    }

    public final String c() {
        return TextUtils.isEmpty(this.c) ? "" : this.c;
    }

    @Override // java.lang.Comparable
    public final int compareTo(g gVar) {
        return j().compareTo(gVar.j());
    }

    public final Double d() {
        return Double.valueOf(this.i);
    }

    public final List<g> e() {
        List<g> list = this.a;
        return list == null ? Collections.emptyList() : list;
    }

    public final String f() {
        return TextUtils.isEmpty(this.e) ? "" : this.e;
    }

    public final String ff() {
        if (TextUtils.isEmpty(this.e)) {
            return "";
        }
        String str = this.e;
        return str.contains("_") ? str.replace("_", "·") : str;
    }

    public final String g() {
        return TextUtils.isEmpty(this.b) ? "" : this.b;
    }

    public final String h() {
        return TextUtils.isEmpty(this.l) ? "" : C0544h.b(C0529a.a("["), this.l, "]");
    }

    public final String i() {
        if (this.i == 0.0d) {
            return "";
        }
        StringBuilder sbA = C0529a.a("[");
        sbA.append(C0590I.e(this.i));
        sbA.append("]");
        return sbA.toString();
    }

    public final String j() {
        String str;
        String[] strArr = new String[2];
        strArr[0] = h();
        String strFf = ff();
        List<String> list = C0590I.a;
        String str2 = "";
        try {
            Matcher matcher = Pattern.compile(".*(1080|720|2160|4k|4K).*").matcher(strFf);
            if (matcher.find()) {
                str = matcher.group(1) + " " + strFf;
            } else {
                str = strFf;
            }
            Matcher matcher2 = Pattern.compile("^([0-9]+)").matcher(strFf);
            if (matcher2.find()) {
                str = matcher2.group(1) + " " + str;
            }
            str2 = str.replaceAll("\\D+", "") + " " + str.replaceAll("\\d+", "");
        } catch (Exception unused) {
        }
        strArr[1] = str2;
        return TextUtils.join(" ", Arrays.asList(strArr)).trim();
    }

    public final String k() {
        return TextUtils.isEmpty(this.f) ? "" : this.f;
    }

    public final String l() {
        return this.k;
    }

    public final g m(String str) {
        this.l = str;
        return this;
    }

    public final String toString() {
        StringBuilder sbA = C0529a.a("Item{items=");
        sbA.append(this.a);
        sbA.append(", nextMarker='");
        C0547k.c(sbA, this.b, '\'', ", fileId='");
        C0547k.c(sbA, this.c, '\'', ", shareId='");
        C0547k.c(sbA, this.d, '\'', ", name='");
        C0547k.c(sbA, this.e, '\'', ", type='");
        C0547k.c(sbA, this.f, '\'', ", fileExtension='");
        C0547k.c(sbA, this.g, '\'', ", category='");
        C0547k.c(sbA, this.h, '\'', ", size=");
        sbA.append(this.i);
        sbA.append(", parent='");
        sbA.append(this.l);
        sbA.append('\'');
        sbA.append('}');
        return sbA.toString();
    }
}
