package com.github.catvod.spider.merge.FM.i;

import android.text.TextUtils;
import com.github.catvod.spider.merge.FM.L.P;
import com.github.catvod.spider.merge.FM.o.z;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.i.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0359b {

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

    public final int a() {
        return this.m;
    }

    public final String b() {
        return this.g;
    }

    public final String c() {
        return this.i;
    }

    public final String d() {
        if (TextUtils.isEmpty(this.a)) {
            this.a = "0";
        }
        return this.a;
    }

    public final String e() {
        return this.b;
    }

    public final String f() {
        return this.p;
    }

    public final String g() {
        return this.f;
    }

    public final long h() {
        return this.d;
    }

    public final String i() {
        if (this.d == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(z.g(this.d));
        return P.a(new byte[]{109}, new byte[]{48, 92, -114, 80, 47, 64, -84, 18}, sb);
    }

    public final void j(String str) {
        this.p = str;
    }

    public final String toString() {
        return "Item{FileId='" + this.a + "', FileName='" + this.b + "', Type=" + this.c + ", Size=" + this.d + ", ContentType='" + this.e + "', S3KeyFlag='" + this.f + "', CreateAt='" + this.g + "', UpdateAt='" + this.h + "', Etag='" + this.i + "', DownloadUrl='" + this.j + "', Status=" + this.k + ", ParentFileId=" + this.l + ", Category=" + this.m + ", PunishFlag=" + this.n + ", StorageNode='" + this.o + "', PreviewType=" + this.q + '}';
    }
}
