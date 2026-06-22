package com.github.catvod.spider.merge.f;

import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.p.C0207D;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0158a implements Comparable<C0158a> {

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
    public final int compareTo(C0158a c0158a) {
        return this.a.compareTo(c0158a.a);
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
        sb.append(C0098a.a(new byte[]{-26}, new byte[]{-67, -116, 103, 63, -109, 9, -50, 5}));
        sb.append(C0207D.i(this.o));
        return C0133t.b(new byte[]{-27}, new byte[]{-72, 94, -128, -13, -6, -69, 111, -79}, sb);
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
        return C0098a.a(new byte[]{19, -99, -15, -40, 118, 12, -48, -77, 51, -121, -16, -4, 105, 69}, new byte[]{90, -23, -108, -75, 13, 120, -69, -47}) + this.b + C0098a.a(new byte[]{-92, 50, 120, 126, 67, -98, 123, 28, -59, 102, 98, 118, 84, -43}, new byte[]{-120, 18, 11, 27, 49, -24, 30, 110}) + this.c + C0098a.a(new byte[]{86, 55, 46, 59, 77, -87, 32, -109, 8, 110, 112}, new byte[]{122, 23, 77, 90, 57, -52, 71, -4}) + this.d + C0098a.a(new byte[]{98, -104, 72, 5, 10, -39, -65, -20, 43, -123}, new byte[]{78, -72, 33, 118, 89, -70, -38, -126}) + this.e + C0098a.a(new byte[]{-38, -14, 111, -18, 90, 45, 119}, new byte[]{-10, -46, 9, -99, 19, 73, 74, -24}) + this.f + C0098a.a(new byte[]{46, -81, -57, -52, 119, -51, 100, 118, 114, -22, -100}, new byte[]{2, -113, -95, -66, 24, -96, 48, 15}) + this.g + C0098a.a(new byte[]{46, 64, 39, -32, -80, 107, 9, -14, 75, 14, 54, -86, -7}, new byte[]{2, 96, 66, -104, -60, 14, 103, -122}) + this.h + C0098a.a(new byte[]{60, 69, 39, -65, -35, 5, -90, -116, 81, 17, 61, -73, -54, 78}, new byte[]{16, 101, 84, -38, -81, 115, -61, -2}) + this.i + C0098a.a(new byte[]{-56, 34, -62, -10, -75, 102, -44, -16, -89, 118, -40, -2, -94, 45}, new byte[]{-28, 2, -79, -109, -57, 16, -79, -126}) + this.j + C0098a.a(new byte[]{7, 27, 7, -127, -24, 77, 122, 41, 98, 85, 22, -63, -95}, new byte[]{43, 59, 98, -7, -100, 40, 20, 93}) + this.k + C0098a.a(new byte[]{28, 84, 34, -108, 88, 90, -62, 39, 13}, new byte[]{48, 116, 85, -28, 62, 51, -82, 66}) + this.l + C0098a.a(new byte[]{-74, 110, 44, -124, 104, -54, -120, -112, -50, 39, 39, -123, 117, -63, -110, -45, -89}, new byte[]{-102, 78, 73, -4, 28, -81, -26, -28}) + this.m + C0098a.a(new byte[]{-26, -75, -39, 56, -62, -87, -43, -54, -66, -4, -40, 50, -100}, new byte[]{-54, -107, -75, 87, -95, -56, -71, -121}) + this.n + C0098a.a(new byte[]{-27, -109, 63, 7, -78, 30, 22}, new byte[]{-55, -77, 76, 110, -56, 123, 43, 87}) + this.o + C0098a.a(new byte[]{-83, -119, -116, 51, 13, -72, -49, 105}, new byte[]{-127, -87, -27, 64, 105, -47, -67, 84}) + this.p + C0098a.a(new byte[]{-4, 55, -28, 57, -97, -121, 80, 26, -106, 126, -5, 57, -125, -112, 88, 13, -19, 48}, new byte[]{-48, 23, -105, 92, -19, -15, 53, 104}) + this.a + '\'' + C0098a.a(new byte[]{103, -112, 86, -4, 119, -96, 67, 107}, new byte[]{75, -80, 37, -108, 22, -46, 38, 86}) + this.q + C0098a.a(new byte[]{-41, 29, 101, -71, 23, -67, 121, 13, -126, 77, 111, -13}, new byte[]{-5, 61, 10, -50, 121, -40, 11, 89}) + this.r + C0098a.a(new byte[]{106, 66, -54, -36, -46}, new byte[]{70, 98, -70, -80, -17, 58, -70, -54}) + this.s + C0098a.a(new byte[]{-99, -78, 51, 47, 92, -60, 42, 79, -59, -5, 50, 37, 2}, new byte[]{-79, -110, 95, 64, 63, -91, 70, 12}) + this.t + C0098a.a(new byte[]{25, 32, 114, -109, -69, 127, -110, 46}, new byte[]{53, 0, 2, -14, -49, 23, -81, 9}) + this.u + '\'' + C0098a.a(new byte[]{-103, 103, 25, 14, -125, -40, -101, 3, -63, 34, 12, 4, -112, -51, -27, 69}, new byte[]{-75, 71, 107, 107, -30, -76, -40, 98}) + this.v + '\'' + C0098a.a(new byte[]{117, -122, -29, 67, -75, -51, -24, 34, 61, -101}, new byte[]{89, -90, -116, 52, -37, -88, -102, 107}) + this.w + C0098a.a(new byte[]{-125, -52, -14, 57, 101, -125, -116, -43, -110}, new byte[]{-81, -20, -99, 73, 0, -15, -59, -79}) + this.x + C0098a.a(new byte[]{-76, -19, 70, -78, -30, 23, -72, -102, -91}, new byte[]{-104, -51, 51, -36, -114, 126, -53, -18}) + this.y + '}';
    }
}
