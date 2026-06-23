package com.github.catvod.spider.merge.i;

import android.text.TextUtils;
import com.github.catvod.spider.merge.A.l;
import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.b.C0547k;
import com.github.catvod.spider.merge.m.C0590I;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.i.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0568a implements Comparable<C0568a> {

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
    private String l;

    public final int a() {
        return this.d;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        String strI = i();
        if (!TextUtils.isEmpty(strI)) {
            sb.append("[");
            sb.append(strI.length() > 5 ? strI.substring(0, 5) : strI.substring(0));
            sb.append("]");
        }
        if (TextUtils.isEmpty(i())) {
            sb.append(this.b);
        } else {
            sb.append(l.format(this.b, e()));
        }
        return sb.toString();
    }

    public final String cc() {
        return this.b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C0568a c0568a) {
        return c().compareTo(c0568a.c());
    }

    public final String d() {
        return TextUtils.isEmpty(this.k) ? "" : this.k;
    }

    public final String e() {
        if (this.f == 0.0d) {
            return "";
        }
        StringBuilder sbA = C0529a.a("[");
        sbA.append(C0590I.e(this.f));
        sbA.append("]");
        return sbA.toString();
    }

    public final boolean f() {
        return this.h;
    }

    public final boolean g() {
        return this.i;
    }

    public final void h(String str) {
        this.l = str;
    }

    public final String i() {
        return TextUtils.isEmpty(this.l) ? "" : this.l;
    }

    public final String toString() {
        StringBuilder sbA = C0529a.a("Item{fid='");
        C0547k.c(sbA, this.a, '\'', ", fileName='");
        C0547k.c(sbA, this.b, '\'', ", pfid='");
        C0547k.c(sbA, this.c, '\'', ", category=");
        sbA.append(this.d);
        sbA.append(", fileType=");
        sbA.append(this.e);
        sbA.append(", size=");
        sbA.append(this.f);
        sbA.append(", formatType='");
        C0547k.c(sbA, this.g, '\'', ", isDir=");
        sbA.append(this.h);
        sbA.append(", isFile=");
        sbA.append(this.i);
        sbA.append(", updatedAt=");
        sbA.append(this.j);
        sbA.append('}');
        return sbA.toString();
    }
}
