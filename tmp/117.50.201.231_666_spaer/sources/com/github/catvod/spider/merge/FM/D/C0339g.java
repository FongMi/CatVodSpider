package com.github.catvod.spider.merge.FM.d;

import android.text.TextUtils;
import com.github.catvod.spider.merge.FM.L.P;
import com.github.catvod.spider.merge.FM.o.z;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.d.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0339g implements Comparable<C0339g> {

    @SerializedName("items")
    private List<C0339g> a;

    @SerializedName("next_marker")
    private String b;

    @SerializedName("file_id")
    private final String c;

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

    public C0339g(String str) {
        this.c = str;
    }

    public final String a() {
        return TextUtils.isEmpty(this.h) ? "" : this.h;
    }

    public final String b() {
        String strA;
        String[] strArr = new String[3];
        strArr[0] = h();
        strArr[1] = f();
        if (this.i == 0.0d) {
            strA = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(z.g(this.i));
            strA = P.a(new byte[]{92}, new byte[]{1, -101, 95, 33, 103, 81, 54, -59}, sb);
        }
        strArr[2] = strA;
        return TextUtils.join(" ", Arrays.asList(strArr)).trim();
    }

    public final String c() {
        return TextUtils.isEmpty(this.g) ? "" : this.g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C0339g c0339g) {
        return i().compareTo(c0339g.i());
    }

    public final String d() {
        return TextUtils.isEmpty(this.c) ? "" : this.c;
    }

    public final List<C0339g> e() {
        List<C0339g> list = this.a;
        return list == null ? Collections.emptyList() : list;
    }

    public final String f() {
        return TextUtils.isEmpty(this.e) ? "" : this.e;
    }

    public final String g() {
        return TextUtils.isEmpty(this.b) ? "" : this.b;
    }

    public final String h() {
        if (TextUtils.isEmpty(this.j)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(this.j);
        return P.a(new byte[]{-96}, new byte[]{-3, 72, 121, 87, 29, 91, -108, 84}, sb);
    }

    public final String i() {
        String str;
        String[] strArr = new String[2];
        strArr[0] = h();
        String strF = f();
        Pattern pattern = z.a;
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
        strArr[1] = str2;
        return TextUtils.join(" ", Arrays.asList(strArr)).trim();
    }

    public final String j() {
        return TextUtils.isEmpty(this.f) ? "" : this.f;
    }

    public final C0339g k(String str) {
        this.j = str;
        return this;
    }
}
