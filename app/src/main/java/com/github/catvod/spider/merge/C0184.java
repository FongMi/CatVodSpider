package com.github.catvod.spider.merge;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Ԩ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0184 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    @SerializedName("key")
    private String f452;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    @SerializedName("name")
    private String f453;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    @SerializedName("value")
    private List<C0185> f454;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.Ԩ$Ϳ, reason: contains not printable characters */
    public static class C0185 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        @SerializedName("n")
        private String f455;

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        @SerializedName("v")
        private String f456;

        public C0185(String str, String str2) {
            this.f455 = str;
            this.f456 = str2;
        }
    }

    public C0184(String str, String str2, List<C0185> list) {
        this.f452 = str;
        this.f453 = str2;
        this.f454 = list;
    }
}
