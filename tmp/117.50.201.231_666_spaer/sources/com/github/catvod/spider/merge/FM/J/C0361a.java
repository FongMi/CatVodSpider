package com.github.catvod.spider.merge.FM.j;

import android.text.TextUtils;
import com.github.catvod.spider.merge.FM.L.P;
import com.github.catvod.spider.merge.FM.o.z;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.j.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0361a implements Comparable<C0361a> {

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
    public final int compareTo(C0361a c0361a) {
        return c().compareTo(c0361a.c());
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
        sb.append("[");
        sb.append(z.g(this.f));
        return P.a(new byte[]{-22}, new byte[]{-73, 98, -73, -94, 8, -43, -21, -66}, sb);
    }

    public final boolean h() {
        return this.h;
    }

    public final boolean i() {
        return this.i;
    }

    public final C0361a j(String str) {
        this.a = str;
        return this;
    }

    public final C0361a k(String str) {
        this.l = str;
        return this;
    }

    public final String toString() {
        return "Item{fid='" + this.a + "', fileName='" + this.b + "', pfid='" + this.c + "', category=" + this.d + ", fileType=" + this.e + ", size=" + this.f + ", formatType='" + this.g + "', isDir=" + this.h + ", isFile=" + this.i + ", updatedAt=" + this.j + '}';
    }
}
