package com.github.catvod.spider.merge.g;

import com.github.catvod.spider.merge.A.l;
import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.b.C0547k;
import com.github.catvod.spider.merge.m.C0590I;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0564a implements Comparable<C0564a> {

    @SerializedName("createDate")
    private String a;

    @SerializedName("fileCata")
    private int b;

    @SerializedName("fileListSize")
    private int c;

    @SerializedName("id")
    private String d;

    @SerializedName("lastOpTime")
    private String e;

    @SerializedName("name")
    private String f;

    @SerializedName("parentId")
    private String g;

    @SerializedName("rev")
    private String h;

    @SerializedName("starLabel")
    private String i;

    @SerializedName("size")
    private double j;

    @SerializedName("mediaType")
    private int k = -1;

    public final String a() {
        return this.d;
    }

    public final String b() {
        return l.format(this.f, e());
    }

    public final boolean c() {
        return this.k == 3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C0564a c0564a) {
        return b().compareTo(c0564a.b());
    }

    public final boolean d() {
        return this.k == -1;
    }

    public final String e() {
        if (this.j == 0.0d) {
            return "";
        }
        StringBuilder sbA = C0529a.a("[");
        sbA.append(C0590I.e(this.j));
        sbA.append("]");
        return sbA.toString();
    }

    public final String toString() {
        StringBuilder sbA = C0529a.a("Item{createDate='");
        C0547k.c(sbA, this.a, '\'', ", fileCata=");
        sbA.append(this.b);
        sbA.append(", fileListSize=");
        sbA.append(this.c);
        sbA.append(", id='");
        C0547k.c(sbA, this.d, '\'', ", lastOpTime='");
        C0547k.c(sbA, this.e, '\'', ", name='");
        C0547k.c(sbA, this.f, '\'', ", parentId='");
        C0547k.c(sbA, this.g, '\'', ", rev='");
        C0547k.c(sbA, this.h, '\'', ", starLabel='");
        C0547k.c(sbA, this.i, '\'', ", mediaType='");
        sbA.append(this.k);
        sbA.append('\'');
        sbA.append('}');
        return sbA.toString();
    }
}
