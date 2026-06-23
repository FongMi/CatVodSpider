package com.github.catvod.spider.merge.FM.f;

import com.github.catvod.spider.merge.FM.L.P;
import com.github.catvod.spider.merge.FM.o.z;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.f.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0343a implements Comparable<C0343a> {

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
    public final int compareTo(C0343a c0343a) {
        return this.a.compareTo(c0343a.a);
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
        sb.append("[");
        sb.append(z.g(this.o));
        return P.a(new byte[]{-78}, new byte[]{-17, -53, 6, -62, -105, -21, -123, 19}, sb);
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
        return "Item{tkbindId=" + this.b + ", serverMtime=" + this.c + ", category=" + this.d + ", isScene=" + this.e + ", fsId=" + this.f + ", fromType=" + this.g + ", extentInt2=" + this.h + ", serverAtime=" + this.i + ", serverCtime=" + this.j + ", extentInt8=" + this.k + ", wpfile=" + this.l + ", extentTinyint7=" + this.m + ", localMtime=" + this.n + ", size=" + this.o + ", isdir=" + this.p + ", serverFilename='" + this.a + "', share=" + this.q + ", ownerType=" + this.r + ", pl=" + this.s + ", localCtime=" + this.t + ", path='" + this.u + "', realCategory='" + this.v + "', ownerId=" + this.w + ", operId=" + this.x + ", unlist=" + this.y + '}';
    }
}
