package com.github.catvod.spider.merge.e;

import android.text.TextUtils;
import com.github.catvod.spider.merge.A.l;
import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.b.C0547k;
import com.github.catvod.spider.merge.m.C0590I;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.e.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0560a implements Comparable<C0560a> {

    @SerializedName("tkbind_id")
    private int a;

    @SerializedName("server_mtime")
    private long b;

    @SerializedName("category")
    private int c;

    @SerializedName("is_scene")
    private int d;

    @SerializedName("fs_id")
    private long e;

    @SerializedName("from_type")
    private int f;

    @SerializedName("extent_int2")
    private int g;

    @SerializedName("server_atime")
    private long h;

    @SerializedName("server_ctime")
    private long i;

    @SerializedName("extent_int8")
    private long j;

    @SerializedName("wpfile")
    private int k;

    @SerializedName("extent_tinyint7")
    private int l;

    @SerializedName("local_mtime")
    private long m;

    @SerializedName("size")
    private long n;

    @SerializedName("isdir")
    private int o;

    @SerializedName("server_filename")
    private String p;

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

    public final long a() {
        return this.e;
    }

    public final int b() {
        return this.o;
    }

    public final String c() {
        return this.u;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C0560a c0560a) {
        return d().compareTo(c0560a.d());
    }

    public final String d() {
        String str = this.p;
        String str2 = this.u;
        String strSubstring = str2.substring(0, str2.lastIndexOf("/"));
        return "[" + strSubstring.substring(strSubstring.lastIndexOf("/") + 1) + "]" + l.format(this.p, f());
    }

    public final String dd() {
        return TextUtils.isEmpty(this.p) ? "" : this.p;
    }

    public final String e() {
        return this.o == 1 ? "folder" : "file";
    }

    public final String f() {
        if (this.n == 0) {
            return "";
        }
        return "[" + C0590I.e(this.n) + "]";
    }

    /* JADX INFO: renamed from: f, reason: collision with other method in class */
    public final boolean m96f() {
        int i = this.c;
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 6) {
            return this.p.toLowerCase().endsWith(".iso");
        }
        return false;
    }

    public final String toString() {
        StringBuilder sbA = C0529a.a("Item{tkbindId=");
        sbA.append(this.a);
        sbA.append(", serverMtime=");
        sbA.append(this.b);
        sbA.append(", category=");
        sbA.append(this.c);
        sbA.append(", isScene=");
        sbA.append(this.d);
        sbA.append(", fsId=");
        sbA.append(this.e);
        sbA.append(", fromType=");
        sbA.append(this.f);
        sbA.append(", extentInt2=");
        sbA.append(this.g);
        sbA.append(", serverAtime=");
        sbA.append(this.h);
        sbA.append(", serverCtime=");
        sbA.append(this.i);
        sbA.append(", extentInt8=");
        sbA.append(this.j);
        sbA.append(", wpfile=");
        sbA.append(this.k);
        sbA.append(", extentTinyint7=");
        sbA.append(this.l);
        sbA.append(", localMtime=");
        sbA.append(this.m);
        sbA.append(", size=");
        sbA.append(this.n);
        sbA.append(", isdir=");
        sbA.append(this.o);
        sbA.append(", serverFilename='");
        C0547k.c(sbA, this.p, '\'', ", share=");
        sbA.append(this.q);
        sbA.append(", ownerType=");
        sbA.append(this.r);
        sbA.append(", pl=");
        sbA.append(this.s);
        sbA.append(", localCtime=");
        sbA.append(this.t);
        sbA.append(", path='");
        C0547k.c(sbA, this.u, '\'', ", realCategory='");
        C0547k.c(sbA, this.v, '\'', ", ownerId=");
        sbA.append(this.w);
        sbA.append(", operId=");
        sbA.append(this.x);
        sbA.append(", unlist=");
        sbA.append(this.y);
        sbA.append('}');
        return sbA.toString();
    }
}
