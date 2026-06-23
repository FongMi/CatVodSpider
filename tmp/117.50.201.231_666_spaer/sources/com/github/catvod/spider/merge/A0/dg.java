package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class dg {

    @ni("url")
    private String d;

    @ni("name")
    private String e;

    @ni("lang")
    private String f;

    @ni("format")
    private String g;

    public final void a(String str) {
        str.getClass();
        switch (str) {
            case "ass":
            case "ssa":
                this.g = "text/x-ssa";
                break;
            case "vtt":
                this.g = "text/vtt";
                break;
            default:
                this.g = "application/x-subrip";
                break;
        }
    }

    public final void b(String str) {
        this.e = str;
    }

    public final void c(String str) {
        this.d = str;
    }
}
