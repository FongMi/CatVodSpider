package com.github.catvod.spider.merge.FM.k;

import android.text.TextUtils;
import com.github.catvod.spider.merge.FM.L.P;
import com.github.catvod.spider.merge.FM.o.z;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.k.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0363a implements Comparable<C0363a> {

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
    public final int compareTo(C0363a c0363a) {
        return c().compareTo(c0363a.c());
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
        sb.append("[");
        sb.append(z.g(this.g));
        return P.a(new byte[]{16}, new byte[]{77, -72, 16, -121, 103, 107, -92, -15}, sb);
    }

    public final boolean h() {
        return this.i;
    }

    public final boolean i() {
        return this.j;
    }

    public final C0363a j(String str) {
        this.a = str;
        return this;
    }

    public final C0363a k(String str) {
        this.d = str;
        return this;
    }

    public final String toString() {
        return "Item{fid='" + this.a + "', fileName='" + this.b + "', pfid='" + this.c + "', category=" + this.e + ", fileType=" + this.f + ", size=" + this.g + ", formatType='" + this.h + "', isDir=" + this.i + ", isFile=" + this.j + ", updatedAt=" + this.k + '}';
    }
}
