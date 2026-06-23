package com.github.catvod.spider.merge.h;

import android.text.TextUtils;
import com.github.catvod.spider.merge.A.l;
import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.b.C0547k;
import com.github.catvod.spider.merge.m.C0590I;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.h.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0566a implements Comparable<C0566a> {

    @SerializedName("FileId")
    private String a;

    @SerializedName("FileName")
    private String b;

    @SerializedName("Type")
    private int c;

    @SerializedName("Size")
    private long d;

    @SerializedName("ContentType")
    private String e;

    @SerializedName("S3KeyFlag")
    private String f;

    @SerializedName("CreateAt")
    private String g;

    @SerializedName("UpdateAt")
    private String h;

    @SerializedName("Etag")
    private String i;

    @SerializedName("DownloadUrl")
    private String j;

    @SerializedName("Status")
    private int k;

    @SerializedName("ParentFileId")
    private int l;

    @SerializedName("Category")
    private int m;

    @SerializedName("PunishFlag")
    private int n;

    @SerializedName("StorageNode")
    private String o;

    @SerializedName("PreviewType")
    private String p;

    @SerializedName("pfName")
    private int q;

    public final String a() {
        return this.i;
    }

    public final String b() {
        if (TextUtils.isEmpty(this.a)) {
            this.a = "0";
        }
        return this.a;
    }

    public final String c() {
        return l.format(this.b, "");
    }

    @Override // java.lang.Comparable
    public final int compareTo(C0566a c0566a) {
        return this.b.compareTo(c0566a.b);
    }

    public final String d() {
        return this.f;
    }

    public final long e() {
        return this.d;
    }

    public final String f() {
        if (this.d == 0) {
            return "";
        }
        StringBuilder sbA = C0529a.a("[");
        sbA.append(C0590I.e(this.d));
        sbA.append("]");
        return sbA.toString();
    }

    public final boolean g() {
        return this.m == 2;
    }

    public final boolean h() {
        return this.m == 0;
    }

    public final String toString() {
        StringBuilder sbA = C0529a.a("Item{FileId='");
        C0547k.c(sbA, this.a, '\'', ", FileName='");
        C0547k.c(sbA, this.b, '\'', ", Type=");
        sbA.append(this.c);
        sbA.append(", Size=");
        sbA.append(this.d);
        sbA.append(", ContentType='");
        C0547k.c(sbA, this.e, '\'', ", S3KeyFlag='");
        C0547k.c(sbA, this.f, '\'', ", CreateAt='");
        C0547k.c(sbA, this.g, '\'', ", UpdateAt='");
        C0547k.c(sbA, this.h, '\'', ", Etag='");
        C0547k.c(sbA, this.i, '\'', ", DownloadUrl='");
        C0547k.c(sbA, this.j, '\'', ", Status=");
        sbA.append(this.k);
        sbA.append(", ParentFileId=");
        sbA.append(this.l);
        sbA.append(", Category=");
        sbA.append(this.m);
        sbA.append(", PunishFlag=");
        sbA.append(this.n);
        sbA.append(", StorageNode='");
        C0547k.c(sbA, this.o, '\'', ", PreviewType=");
        sbA.append(this.q);
        sbA.append('}');
        return sbA.toString();
    }
}
