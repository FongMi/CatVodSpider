package com.github.catvod.spider.merge;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Ԯ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0188 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    @SerializedName("vod_id")
    private String f469;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    @SerializedName("vod_name")
    private String f470;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    @SerializedName("vod_pic")
    private String f471;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    @SerializedName("vod_remarks")
    private String f472;

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    @SerializedName("vod_play_from")
    private String f473;

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    @SerializedName("vod_play_url")
    private String f474;

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    @SerializedName("vod_tag")
    private String f475;

    public C0188() {
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public void m669(String str) {
        this.f469 = str;
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public void m670(String str) {
        this.f470 = str;
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public void m671(String str) {
        this.f471 = str;
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public void m672(String str) {
        this.f473 = str;
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public void m673(String str) {
        this.f474 = str;
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public void m674(String str) {
        this.f472 = str;
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public void m675(String str) {
        this.f475 = str;
    }

    public C0188(String str, String str2, String str3, String str4, boolean z) {
        m669(str);
        m670(str2);
        m671(str3);
        m674(str4);
        m675(z ? SOY.d("1C3D3D121105") : SOY.d("1C3B3D13"));
    }
}
