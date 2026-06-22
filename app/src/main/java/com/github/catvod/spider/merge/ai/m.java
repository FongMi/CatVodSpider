package com.github.catvod.spider.merge.ai;

import com.github.catvod.spider.merge.nIe;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class m {

    @SerializedName("type_name")
    private String a;

    @SerializedName("vod_id")
    private String b;

    @SerializedName("vod_name")
    private String c;

    @SerializedName("vod_pic")
    private String d;

    @SerializedName("vod_remarks")
    private String e;

    @SerializedName("vod_year")
    private String f;

    @SerializedName("vod_area")
    private String g;

    @SerializedName("vod_actor")
    private String h;

    @SerializedName("vod_director")
    private String i;

    @SerializedName("vod_content")
    private String j;

    @SerializedName("vod_play_from")
    private String k;

    @SerializedName("vod_play_url")
    private String l;

    @SerializedName("vod_tag")
    private String m;

    @SerializedName("style")
    private l n;

    public m() {
    }

    public m(String str, String str2, String str3, String str4, l lVar) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.n = lVar;
    }

    public final void a() {
        this.k = nIe.d("04093D240426");
    }

    public final void b() {
        this.l = nIe.d("04093D24042666203C2D2E022B");
    }
}
