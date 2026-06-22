package com.github.catvod.spider.merge.kT;

import android.text.TextUtils;
import com.github.catvod.spider.merge.XI.f;
import com.github.catvod.spider.merge.bY.C0925t;
import com.github.catvod.spider.merge.pT.C;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class a implements Comparable<a> {

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
    public final int compareTo(a aVar) {
        return c().compareTo(aVar.c());
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
        sb.append(f.a(new byte[]{-2}, new byte[]{-91, 25, -113, 123, 19, -78, -47, -22}));
        sb.append(C.i(this.f));
        return C0925t.a(new byte[]{-2}, new byte[]{-93, -77, 71, -90, -61, 109, -15, 28}, sb);
    }

    public final boolean h() {
        return this.h;
    }

    public final boolean i() {
        return this.i;
    }

    public final a j(String str) {
        this.a = str;
        return this;
    }

    public final a k(String str) {
        this.l = str;
        return this;
    }

    public final String toString() {
        return f.a(new byte[]{-127, -21, -81, -58, -98, -13, 15, 69, -11, -72}, new byte[]{-56, -97, -54, -85, -27, -107, 102, 33}) + this.a + '\'' + f.a(new byte[]{107, -22, -65, 117, -108, 45, 51, 69, 42, -81, -28, 59}, new byte[]{71, -54, -39, 28, -8, 72, 125, 36}) + this.b + '\'' + f.a(new byte[]{-121, -104, 107, -105, -86, -84, -14, -33}, new byte[]{-85, -72, 27, -15, -61, -56, -49, -8}) + this.c + '\'' + f.a(new byte[]{-29, -42, -33, -51, 81, 75, -107, 62, -67, -113, -127}, new byte[]{-49, -10, -68, -84, 37, 46, -14, 81}) + this.d + f.a(new byte[]{105, -29, 13, -17, -63, 52, 55, -105, 53, -90, 86}, new byte[]{69, -61, 107, -122, -83, 81, 99, -18}) + this.e + f.a(new byte[]{50, 31, -25, 71, 50, 53, -41}, new byte[]{30, 63, -108, 46, 72, 80, -22, 111}) + this.f + f.a(new byte[]{15, -125, 71, -68, 117, 40, -10, -117, 119, -38, 81, -74, 58, 98}, new byte[]{35, -93, 33, -45, 7, 69, -105, -1}) + this.g + '\'' + f.a(new byte[]{75, 53, 34, 99, 19, 86, 23, 67}, new byte[]{103, 21, 75, 16, 87, 63, 101, 126}) + this.h + f.a(new byte[]{28, -23, -8, 20, 64, -92, 41, -95, 13}, new byte[]{48, -55, -111, 103, 6, -51, 69, -60}) + this.i + f.a(new byte[]{-19, -26, 117, 73, 84, 26, 89, -76, -91, -121, 116, 4}, new byte[]{-63, -58, 0, 57, 48, 123, 45, -47}) + this.j + '}';
    }
}
