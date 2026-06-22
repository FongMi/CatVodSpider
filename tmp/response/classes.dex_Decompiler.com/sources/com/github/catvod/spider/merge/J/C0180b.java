package com.github.catvod.spider.merge.j;

import android.text.TextUtils;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.p.C0207D;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.j.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0180b {

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
            this.a = C0098a.a(new byte[]{-51}, new byte[]{-3, -54, 71, -32, -119, -76, 90, -102});
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
        sb.append(C0098a.a(new byte[]{121}, new byte[]{34, -127, 75, 42, 76, 26, 99, 26}));
        sb.append(C0207D.i(this.d));
        return C0133t.b(new byte[]{30}, new byte[]{67, -80, 102, -108, -47, 39, -125, -42}, sb);
    }

    public final void j(String str) {
        this.p = str;
    }

    public final String toString() {
        return C0098a.a(new byte[]{74, -115, -59, -77, -49, -118, -65, -72, 102, -80, -60, -29, -109}, new byte[]{3, -7, -96, -34, -76, -52, -42, -44}) + this.a + '\'' + C0098a.a(new byte[]{22, -98, -36, -110, -62, -71, -44, 97, 87, -37, -89, -36}, new byte[]{58, -66, -102, -5, -82, -36, -102, 0}) + this.b + '\'' + C0098a.a(new byte[]{82, -84, -123, -127, 20, 115, 115}, new byte[]{126, -116, -47, -8, 100, 22, 78, -79}) + this.c + C0098a.a(new byte[]{9, 113, 5, -36, 121, -13, 58}, new byte[]{37, 81, 86, -75, 3, -106, 7, -30}) + this.d + C0098a.a(new byte[]{-10, -73, 9, 94, -33, -41, 69, 63, -82, -61, 51, 65, -44, -98, 7}, new byte[]{-38, -105, 74, 49, -79, -93, 32, 81}) + this.e + '\'' + C0098a.a(new byte[]{78, 109, -13, -45, 58, -42, 116, -57, 14, 44, -57, -35, 86}, new byte[]{98, 77, -96, -32, 113, -77, 13, -127}) + this.f + '\'' + C0098a.a(new byte[]{-35, 42, -100, 56, 74, -68, -86, -74, -80, 126, -30, 109}, new byte[]{-15, 10, -33, 74, 47, -35, -34, -45}) + this.g + '\'' + C0098a.a(new byte[]{116, -8, -52, -40, -9, 76, -121, 38, 25, -84, -92, -113}, new byte[]{88, -40, -103, -88, -109, 45, -13, 67}) + this.h + '\'' + C0098a.a(new byte[]{9, -111, 17, 61, -72, -93, 81, 74}, new byte[]{37, -79, 84, 73, -39, -60, 108, 109}) + this.i + '\'' + C0098a.a(new byte[]{124, 127, -40, 75, 36, 118, 67, 37, 49, 59, -55, 86, 63, 37, 8}, new byte[]{80, 95, -100, 36, 83, 24, 47, 74}) + this.j + '\'' + C0098a.a(new byte[]{36, -92, 78, -51, -72, 115, 97, 75, 53}, new byte[]{8, -124, 29, -71, -39, 7, 20, 56}) + this.k + C0098a.a(new byte[]{-110, 62, -49, -40, -16, -5, -68, 35, -8, 119, -13, -36, -53, -6, -17}, new byte[]{-66, 30, -97, -71, -126, -98, -46, 87}) + this.l + C0098a.a(new byte[]{-98, -95, -39, -105, -70, 39, 33, -88, -64, -8, -89}, new byte[]{-78, -127, -102, -10, -50, 66, 70, -57}) + this.m + C0098a.a(new byte[]{-122, 31, -116, 90, 1, 94, 108, 80, -20, 83, -67, 72, 82}, new byte[]{-86, 63, -36, 47, 111, 55, 31, 56}) + this.n + C0098a.a(new byte[]{34, 101, -90, 18, -72, 11, 39, -108, 107, 11, -102, 2, -78, 68, 97}, new byte[]{14, 69, -11, 102, -41, 121, 70, -13}) + this.o + '\'' + C0098a.a(new byte[]{40, 113, 2, -83, -126, -5, 125, 1, 115, 5, 43, -81, -126, -80}, new byte[]{4, 81, 82, -33, -25, -115, 20, 100}) + this.q + '}';
    }
}
