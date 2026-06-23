package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class wo {

    @ni("type_name")
    private String f;

    @ni("vod_id")
    private String g;

    @ni("vod_name")
    private String h;

    @ni("vod_pic")
    private String i;

    @ni("vod_remarks")
    private String j;

    @ni("vod_year")
    private String k;

    @ni("vod_area")
    private String l;

    @ni("vod_actor")
    private String m;

    @ni("vod_director")
    private String n;

    @ni("vod_content")
    private String o;

    @ni("vod_play_from")
    private String p;

    @ni("vod_play_url")
    private String q;

    @ni("vod_tag")
    private String r;

    @ni("action")
    private String s;

    @ni("style")
    private wu t;

    public wo(String str, String str2, String str3, String str4, boolean z) {
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.r = z ? "folder" : "file";
    }

    public final void a(String str) {
        this.g = str;
    }

    public final void b(String str) {
        this.h = str;
    }

    public final void c(String str) {
        this.i = str;
    }

    public final void d(String str) {
        this.p = str;
    }

    public final void e(String str) {
        this.q = str;
    }
}
