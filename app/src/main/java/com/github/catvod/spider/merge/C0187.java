package com.github.catvod.spider.merge;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Ԭ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0187 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    @SerializedName("url")
    private String f466;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    @SerializedName("name")
    private String f467;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    @SerializedName("format")
    private String f468;

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static C0187 m664() {
        return new C0187();
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public C0187 m665(String str) {
        str.hashCode();
        byte b = -1;
        switch (str.hashCode()) {
            case 96897:
                if (str.equals(SOY.d("1B2122"))) {
                    b = 0;
                }
                break;
            case 114177:
                if (str.equals(SOY.d("092130"))) {
                    b = 1;
                }
                break;
            case 117110:
                if (str.equals(SOY.d("0C2625"))) {
                    b = 2;
                }
                break;
        }
        switch (b) {
            case 0:
            case 1:
                return m666(SOY.d("0E3729025B0F57212217"));
            case 2:
                return m666(SOY.d("0E3729025B010E26"));
            default:
                return m666(SOY.d("1B22211A1D141B2638191A58027F220316051322"));
        }
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public C0187 m666(String str) {
        this.f468 = str;
        return this;
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public C0187 m667(String str) {
        this.f467 = str;
        return this;
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public C0187 m668(String str) {
        this.f466 = str;
        return this;
    }
}
