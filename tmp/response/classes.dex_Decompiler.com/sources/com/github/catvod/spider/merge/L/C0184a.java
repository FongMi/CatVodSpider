package com.github.catvod.spider.merge.l;

import android.text.TextUtils;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.p.C0207D;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.l.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0184a implements Comparable<C0184a> {

    @SerializedName("fid")
    private String a;

    @SerializedName("file_name")
    private String b;

    @SerializedName("pdir_fid")
    private String c;

    @SerializedName("pdir_name")
    private String d;

    @SerializedName("category")
    private int e;

    @SerializedName("file_type")
    private int f;

    @SerializedName("size")
    private double g;

    @SerializedName("format_type")
    private String h;

    @SerializedName("dir")
    private boolean i;

    @SerializedName("file")
    private boolean j;

    @SerializedName("updated_at")
    private String k;

    @SerializedName("share_fid_token")
    private String l;

    public final int a() {
        return this.e;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return TextUtils.isEmpty(this.b) ? "" : this.b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C0184a c0184a) {
        return c().compareTo(c0184a.c());
    }

    public final String d() {
        return this.h;
    }

    public final String e() {
        return this.d;
    }

    public final String f() {
        return TextUtils.isEmpty(this.l) ? "" : this.l;
    }

    public final String g() {
        if (this.g == 0.0d) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C0098a.a(new byte[]{63}, new byte[]{100, -116, -67, 105, 58, -61, -6, 98}));
        sb.append(C0207D.i(this.g));
        return C0133t.b(new byte[]{12}, new byte[]{81, -98, -33, -88, 124, 68, 42, 105}, sb);
    }

    public final boolean h() {
        return this.i;
    }

    public final boolean i() {
        return this.j;
    }

    public final C0184a j(String str) {
        this.a = str;
        return this;
    }

    public final C0184a k(String str) {
        this.d = str;
        return this;
    }

    public final String toString() {
        return C0098a.a(new byte[]{-52, -16, -58, 72, -3, -38, -72, -61, -72, -93}, new byte[]{-123, -124, -93, 37, -122, -68, -47, -89}) + this.a + '\'' + C0098a.a(new byte[]{107, 6, 56, -116, 36, 89, -63, 39, 42, 67, 99, -62}, new byte[]{71, 38, 94, -27, 72, 60, -113, 70}) + this.b + '\'' + C0098a.a(new byte[]{-64, -105, 100, 3, -104, 35, 22, 70}, new byte[]{-20, -73, 20, 101, -15, 71, 43, 97}) + this.c + '\'' + C0098a.a(new byte[]{60, -7, 93, -77, 30, 115, -81, -104, 98, -96, 3}, new byte[]{16, -39, 62, -46, 106, 22, -56, -9}) + this.e + C0098a.a(new byte[]{-94, -106, 112, -111, -15, -84, 77, 113, -2, -45, 43}, new byte[]{-114, -74, 22, -8, -99, -55, 25, 8}) + this.f + C0098a.a(new byte[]{40, -71, 66, 66, -19, -105, 110}, new byte[]{4, -103, 49, 43, -105, -14, 83, -24}) + this.g + C0098a.a(new byte[]{-91, -84, -106, 28, -58, -24, -23, 65, -35, -11, -128, 22, -119, -94}, new byte[]{-119, -116, -16, 115, -76, -123, -120, 53}) + this.h + '\'' + C0098a.a(new byte[]{48, -49, 127, -52, -59, 90, 101, -77}, new byte[]{28, -17, 22, -65, -127, 51, 23, -114}) + this.i + C0098a.a(new byte[]{-86, -76, -83, 115, 97, 114, -119, -118, -69}, new byte[]{-122, -108, -60, 0, 39, 27, -27, -17}) + this.j + C0098a.a(new byte[]{35, -113, 123, -52, -106, 103, 1, -91, 107, -18, 122, -127}, new byte[]{15, -81, 14, -68, -14, 6, 117, -64}) + this.k + '}';
    }
}
