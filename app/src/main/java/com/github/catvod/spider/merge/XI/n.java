package com.github.catvod.spider.merge.XI;

import com.github.catvod.spider.merge.bY.C0925t;
import com.github.catvod.spider.merge.pT.C;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class n implements Comparable<n> {

    @SerializedName("server_filename")
    private String a;

    @SerializedName("tkbind_id")
    private int b;

    @SerializedName("server_mtime")
    private long c;

    @SerializedName("category")
    private int d;

    @SerializedName("is_scene")
    private int e;

    @SerializedName("fs_id")
    private long f;

    @SerializedName("from_type")
    private int g;

    @SerializedName("extent_int2")
    private int h;

    @SerializedName("server_atime")
    private long i;

    @SerializedName("server_ctime")
    private long j;

    @SerializedName("extent_int8")
    private long k;

    @SerializedName("wpfile")
    private int l;

    @SerializedName("extent_tinyint7")
    private int m;

    @SerializedName("local_mtime")
    private long n;

    @SerializedName("size")
    private long o;

    @SerializedName("isdir")
    private int p;

    @SerializedName("share")
    private int q;

    @SerializedName("owner_type")
    private int r;

    @SerializedName("pl")
    private int s;

    @SerializedName("local_ctime")
    private long t;

    @SerializedName("path")
    private String u;

    @SerializedName("real_category")
    private String v;

    @SerializedName("owner_id")
    private long w;

    @SerializedName("oper_id")
    private long x;

    @SerializedName("unlist")
    private int y;
    private String z;

    public final long a() {
        return this.f;
    }

    public final int b() {
        return this.p;
    }

    public final String c() {
        return this.u;
    }

    @Override // java.lang.Comparable
    public final int compareTo(n nVar) {
        return this.a.compareTo(nVar.a);
    }

    public final String d() {
        return this.z;
    }

    public final String e() {
        return this.a;
    }

    public final String f() {
        if (this.o == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f.a(new byte[]{-16}, new byte[]{-85, 58, -73, 102, -46, -56, 52, 64}));
        sb.append(C.i(this.o));
        return C0925t.a(new byte[]{68}, new byte[]{25, 25, -58, 79, -30, -125, 22, 63}, sb);
    }

    public final boolean g() {
        return this.d == 1;
    }

    public final void h(long j) {
        this.f = j;
    }

    public final void i(String str) {
        this.u = str;
    }

    public final void j(String str) {
        this.z = str;
    }

    public final String toString() {
        return f.a(new byte[]{-55, 113, 3, -86, 47, 38, -127, 0, -23, 107, 2, -114, 48, 111}, new byte[]{-128, 5, 102, -57, 84, 82, -22, 98}) + this.b + f.a(new byte[]{-39, 119, -128, 9, 113, -90, 42, 107, -72, 35, -102, 1, 102, -19}, new byte[]{-11, 87, -13, 108, 3, -48, 79, 25}) + this.c + f.a(new byte[]{-51, 124, -120, -20, -128, -59, -116, -4, -109, 37, -42}, new byte[]{-31, 92, -21, -115, -12, -96, -21, -109}) + this.d + f.a(new byte[]{104, 37, 109, 86, -116, -49, 17, -80, 33, 56}, new byte[]{68, 5, 4, 37, -33, -84, 116, -34}) + this.e + f.a(new byte[]{-115, -112, 83, -92, -110, -85, -86}, new byte[]{-95, -80, 53, -41, -37, -49, -105, 79}) + this.f + f.a(new byte[]{11, 1, 25, 22, -24, -47, 62, 22, 87, 68, 66}, new byte[]{39, 33, 127, 100, -121, -68, 106, 111}) + this.g + f.a(new byte[]{44, 106, -125, -47, 126, -79, -9, 123, 73, 36, -110, -101, 55}, new byte[]{0, 74, -26, -87, 10, -44, -103, 15}) + this.h + f.a(new byte[]{-3, -62, 112, -98, 22, 46, 71, 103, -112, -106, 106, -106, 1, 101}, new byte[]{-47, -30, 3, -5, 100, 88, 34, 21}) + this.i + f.a(new byte[]{16, 1, 8, 119, -36, -74, 17, 51, 127, 85, 18, 127, -53, -3}, new byte[]{60, 33, 123, 18, -82, -64, 116, 65}) + this.j + f.a(new byte[]{-101, -26, 124, 21, -94, -59, 20, -52, -2, -88, 109, 85, -21}, new byte[]{-73, -58, 25, 109, -42, -96, 122, -72}) + this.k + f.a(new byte[]{51, 31, 80, 100, 94, 72, -33, 64, 34}, new byte[]{31, 63, 39, 20, 56, 33, -77, 37}) + this.l + f.a(new byte[]{-18, -124, 40, 25, 33, -29, 36, -77, -106, -51, 35, 24, 60, -24, 62, -16, -1}, new byte[]{-62, -92, 77, 97, 85, -122, 74, -57}) + this.m + f.a(new byte[]{-43, -103, -99, -40, 45, 77, 87, -29, -115, -48, -100, -46, 115}, new byte[]{-7, -71, -15, -73, 78, 44, 59, -82}) + this.n + f.a(new byte[]{-98, 39, 40, 76, 110, -58, -48}, new byte[]{-78, 7, 91, 37, 20, -93, -19, 85}) + this.o + f.a(new byte[]{64, 86, 95, 127, -113, -30, -2, 33}, new byte[]{108, 118, 54, 12, -21, -117, -116, 28}) + this.p + f.a(new byte[]{0, 35, 123, -2, 96, -8, 55, 115, 106, 106, 100, -2, 124, -17, 63, 100, 17, 36}, new byte[]{44, 3, 8, -101, 18, -114, 82, 1}) + this.a + '\'' + f.a(new byte[]{98, -5, 29, -15, 106, 29, -125, -19}, new byte[]{78, -37, 110, -103, 11, 111, -26, -48}) + this.q + f.a(new byte[]{94, 11, 89, 3, 21, 1, 115, 47, 11, 91, 83, 73}, new byte[]{114, 43, 54, 116, 123, 100, 1, 123}) + this.r + f.a(new byte[]{-30, 32, -66, -102, -66}, new byte[]{-50, 0, -50, -10, -125, 44, -70, -121}) + this.s + f.a(new byte[]{4, 25, 63, 95, 16, -55, 56, -87, 92, 80, 62, 85, 78}, new byte[]{40, 57, 83, 48, 115, -88, 84, -22}) + this.t + f.a(new byte[]{3, 85, -44, -110, 82, -41, -115, -21}, new byte[]{47, 117, -92, -13, 38, -65, -80, -52}) + this.u + '\'' + f.a(new byte[]{-44, 59, -11, 79, -49, -43, -36, -67, -116, 126, -32, 69, -36, -64, -94, -5}, new byte[]{-8, 27, -121, 42, -82, -71, -97, -36}) + this.v + '\'' + f.a(new byte[]{-63, -37, -93, -2, 21, 42, 28, 104, -119, -58}, new byte[]{-19, -5, -52, -119, 123, 79, 110, 33}) + this.w + f.a(new byte[]{-56, -75, 34, 30, -5, 61, -118, -24, -39}, new byte[]{-28, -107, 77, 110, -98, 79, -61, -116}) + this.x + f.a(new byte[]{-114, -38, -3, 54, -124, 3, -90, -12, -97}, new byte[]{-94, -6, -120, 88, -24, 106, -43, -128}) + this.y + '}';
    }
}
