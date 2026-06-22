package com.github.catvod.spider.merge.d;

import android.text.TextUtils;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.oZP;
import com.github.catvod.spider.merge.p.C0207D;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0149h implements Comparable<C0149h> {

    @SerializedName("items")
    private List<C0149h> a;

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

    public C0149h(String str) {
        this.c = str;
    }

    public final String a() {
        return TextUtils.isEmpty(this.h) ? "" : this.h;
    }

    public final String b() {
        String strB;
        String[] strArr = new String[3];
        strArr[0] = h();
        strArr[1] = f();
        if (this.i == 0.0d) {
            strB = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(C0098a.a(new byte[]{57}, new byte[]{98, 112, 8, 1, 91, -27, -50, -92}));
            sb.append(C0207D.i(this.i));
            strB = C0133t.b(new byte[]{-18}, new byte[]{-77, 37, -66, -91, 39, -47, -65, 27}, sb);
        }
        strArr[2] = strB;
        return TextUtils.join(oZP.d("55"), Arrays.asList(strArr)).trim();
    }

    public final String c() {
        return TextUtils.isEmpty(this.g) ? "" : this.g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C0149h c0149h) {
        return i().compareTo(c0149h.i());
    }

    public final String d() {
        return TextUtils.isEmpty(this.c) ? "" : this.c;
    }

    public final List<C0149h> e() {
        List<C0149h> list = this.a;
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
        sb.append(C0098a.a(new byte[]{-14}, new byte[]{-87, 59, 86, 103, -55, 93, -66, -89}));
        sb.append(this.j);
        return C0133t.b(new byte[]{-21}, new byte[]{-74, -24, 116, 87, -9, -63, 64, 38}, sb);
    }

    public final String i() {
        String str;
        String strD = oZP.d("55");
        String[] strArr = new String[2];
        strArr[0] = h();
        String strF = f();
        Pattern pattern = C0207D.a;
        String str2 = "";
        try {
            Matcher matcher = Pattern.compile(C0098a.a(new byte[]{-103, 56, -124, 85, 1, 28, 1, -101, -128, 32, -100, 24, 3, 21, 7, -41, -53, 38, -57, 24, 5, 111, 24, -55, -99}, new byte[]{-73, 18, -84, 100, 49, 36, 49, -25})).matcher(strF);
            if (matcher.find()) {
                str = matcher.group(1) + strD + strF;
            } else {
                str = strF;
            }
            Matcher matcher2 = Pattern.compile(C0098a.a(new byte[]{-61, 114, 88, -12, -10, -26, -85, -78, -76}, new byte[]{-99, 90, 3, -60, -37, -33, -10, -103})).matcher(strF);
            if (matcher2.find()) {
                str = matcher2.group(1) + strD + str;
            }
            str2 = str.replaceAll(C0098a.a(new byte[]{21, -4, 50}, new byte[]{73, -72, 25, -86, -70, -39, -80, -93}), "") + strD + str.replaceAll(C0098a.a(new byte[]{60, -11, -116}, new byte[]{96, -111, -89, -67, -1, 26, -57, 75}), "");
        } catch (Exception unused) {
        }
        strArr[1] = str2;
        return TextUtils.join(strD, Arrays.asList(strArr)).trim();
    }

    public final String j() {
        return TextUtils.isEmpty(this.f) ? "" : this.f;
    }

    public final C0149h k(String str) {
        this.j = str;
        return this;
    }
}
