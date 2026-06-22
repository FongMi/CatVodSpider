package com.github.catvod.spider.merge.XU;

import android.text.TextUtils;
import com.github.catvod.spider.merge.bY.C0925t;
import com.github.catvod.spider.merge.pT.C;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class g {

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
            this.a = com.github.catvod.spider.merge.XI.f.a(new byte[]{107}, new byte[]{91, -87, 65, 71, 105, 12, -126, -40});
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
        sb.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{-9}, new byte[]{-84, 104, 10, -24, 121, -103, -105, -43}));
        sb.append(C.i(this.d));
        return C0925t.a(new byte[]{60}, new byte[]{97, 17, 63, 84, 69, -106, -33, -63}, sb);
    }

    public final void j(String str) {
        this.p = str;
    }

    public final String toString() {
        return com.github.catvod.spider.merge.XI.f.a(new byte[]{-57, 18, 5, -120, 114, 28, 76, -65, -21, 47, 4, -40, 46}, new byte[]{-114, 102, 96, -27, 9, 90, 37, -45}) + this.a + '\'' + com.github.catvod.spider.merge.XI.f.a(new byte[]{3, -39, -47, 84, -50, 80, -70, 126, 66, -100, -86, 26}, new byte[]{47, -7, -105, 61, -94, 53, -12, 31}) + this.b + '\'' + com.github.catvod.spider.merge.XI.f.a(new byte[]{-20, 11, 39, 33, -96, 33, -102}, new byte[]{-64, 43, 115, 88, -48, 68, -89, -71}) + this.c + com.github.catvod.spider.merge.XI.f.a(new byte[]{88, 126, -77, 81, -6, -85, 126}, new byte[]{116, 94, -32, 56, -128, -50, 67, -14}) + this.d + com.github.catvod.spider.merge.XI.f.a(new byte[]{-52, -94, 3, 86, -118, -52, -51, 24, -108, -42, 57, 73, -127, -123, -113}, new byte[]{-32, -126, 64, 57, -28, -72, -88, 118}) + this.e + '\'' + com.github.catvod.spider.merge.XI.f.a(new byte[]{-80, -75, 70, -85, 55, -50, 109, -26, -16, -12, 114, -91, 91}, new byte[]{-100, -107, 21, -104, 124, -85, 20, -96}) + this.f + '\'' + com.github.catvod.spider.merge.XI.f.a(new byte[]{38, 112, 11, -29, -76, -27, -126, 48, 75, 36, 117, -74}, new byte[]{10, 80, 72, -111, -47, -124, -10, 85}) + this.g + '\'' + com.github.catvod.spider.merge.XI.f.a(new byte[]{97, 37, -123, 56, -64, 3, -82, 91, 12, 113, -19, 111}, new byte[]{77, 5, -48, 72, -92, 98, -38, 62}) + this.h + '\'' + com.github.catvod.spider.merge.XI.f.a(new byte[]{63, -126, 25, 24, -115, -31, -56, 40}, new byte[]{19, -94, 92, 108, -20, -122, -11, 15}) + this.i + '\'' + com.github.catvod.spider.merge.XI.f.a(new byte[]{75, -95, -63, -61, 16, 90, -20, -70, 6, -27, -48, -34, 11, 9, -89}, new byte[]{103, -127, -123, -84, 103, 52, -128, -43}) + this.j + '\'' + com.github.catvod.spider.merge.XI.f.a(new byte[]{115, -38, -104, -94, 1, -94, 11, 49, 98}, new byte[]{95, -6, -53, -42, 96, -42, 126, 66}) + this.k + com.github.catvod.spider.merge.XI.f.a(new byte[]{100, 114, -88, 49, -120, 70, 63, 35, 14, 59, -108, 53, -77, 71, 108}, new byte[]{72, 82, -8, 80, -6, 35, 81, 87}) + this.l + com.github.catvod.spider.merge.XI.f.a(new byte[]{-13, -88, -115, -76, 51, -28, 119, -121, -83, -15, -13}, new byte[]{-33, -120, -50, -43, 71, -127, 16, -24}) + this.m + com.github.catvod.spider.merge.XI.f.a(new byte[]{-64, -70, -55, 10, 66, 58, 48, -31, -86, -10, -8, 24, 17}, new byte[]{-20, -102, -103, 127, 44, 83, 67, -119}) + this.n + com.github.catvod.spider.merge.XI.f.a(new byte[]{-63, 114, -104, -46, 40, -122, 100, -82, -120, 28, -92, -62, 34, -55, 34}, new byte[]{-19, 82, -53, -90, 71, -12, 5, -55}) + this.o + '\'' + com.github.catvod.spider.merge.XI.f.a(new byte[]{-83, 12, 127, 28, -11, -92, -128, -40, -10, 120, 86, 30, -11, -17}, new byte[]{-127, 44, 47, 110, -112, -46, -23, -67}) + this.q + '}';
    }
}
