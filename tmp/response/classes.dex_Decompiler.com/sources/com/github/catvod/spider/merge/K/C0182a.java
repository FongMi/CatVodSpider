package com.github.catvod.spider.merge.k;

import android.text.TextUtils;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.p.C0207D;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.k.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0182a implements Comparable<C0182a> {

    @SerializedName("fid")
    private String a;

    @SerializedName("file_name")
    private String b;

    @SerializedName("pdir_fid")
    private String c;

    @SerializedName("category")
    private int d;

    @SerializedName("file_type")
    private int e;

    @SerializedName("size")
    private double f;

    @SerializedName("format_type")
    private String g;

    @SerializedName("dir")
    private boolean h;

    @SerializedName("file")
    private boolean i;

    @SerializedName("updated_at")
    private String j;

    @SerializedName("share_fid_token")
    private String k;

    @SerializedName("pdir_name")
    private String l;

    public final int a() {
        return this.d;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return TextUtils.isEmpty(this.b) ? "" : this.b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C0182a c0182a) {
        return c().compareTo(c0182a.c());
    }

    public final String d() {
        return this.g;
    }

    public final String e() {
        return this.l;
    }

    public final String f() {
        return TextUtils.isEmpty(this.k) ? "" : this.k;
    }

    public final String g() {
        if (this.f == 0.0d) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C0098a.a(new byte[]{29}, new byte[]{70, 113, 36, -15, 88, 4, -22, 121}));
        sb.append(C0207D.i(this.f));
        return C0133t.b(new byte[]{122}, new byte[]{39, -74, 74, -6, -4, -4, 3, 0}, sb);
    }

    public final boolean h() {
        return this.h;
    }

    public final boolean i() {
        return this.i;
    }

    public final C0182a j(String str) {
        this.a = str;
        return this;
    }

    public final C0182a k(String str) {
        this.l = str;
        return this;
    }

    public final String toString() {
        return C0098a.a(new byte[]{-104, -66, 51, 42, 64, 4, -33, 33, -20, -19}, new byte[]{-47, -54, 86, 71, 59, 98, -74, 69}) + this.a + '\'' + C0098a.a(new byte[]{-9, -123, -39, 113, -24, -58, -124, 44, -74, -64, -126, 63}, new byte[]{-37, -91, -65, 24, -124, -93, -54, 77}) + this.b + '\'' + C0098a.a(new byte[]{79, -57, 114, 105, -92, 12, -114, -86}, new byte[]{99, -25, 2, 15, -51, 104, -77, -115}) + this.c + '\'' + C0098a.a(new byte[]{-106, 106, 1, -48, -88, 19, -56, 22, -56, 51, 95}, new byte[]{-70, 74, 98, -79, -36, 118, -81, 121}) + this.d + C0098a.a(new byte[]{62, 77, 50, 113, 79, -26, -98, 77, 98, 8, 105}, new byte[]{18, 109, 84, 24, 35, -125, -54, 52}) + this.e + C0098a.a(new byte[]{84, 74, 25, -46, 118, 87, -16}, new byte[]{120, 106, 106, -69, 12, 50, -51, -33}) + this.f + C0098a.a(new byte[]{-114, 25, 2, 17, 50, 67, 24, 105, -10, 64, 20, 27, 125, 9}, new byte[]{-94, 57, 100, 126, 64, 46, 121, 29}) + this.g + '\'' + C0098a.a(new byte[]{-10, -13, 71, -99, -12, 53, -78, 9}, new byte[]{-38, -45, 46, -18, -80, 92, -64, 52}) + this.h + C0098a.a(new byte[]{1, 20, 43, 87, 71, 61, 119, -10, 16}, new byte[]{45, 52, 66, 36, 1, 84, 27, -109}) + this.i + C0098a.a(new byte[]{54, -6, -43, -43, 71, 87, 108, -12, 126, -101, -44, -104}, new byte[]{26, -38, -96, -91, 35, 54, 24, -111}) + this.j + '}';
    }
}
