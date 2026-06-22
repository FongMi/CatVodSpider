package com.github.catvod.bean;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class h {

    @SerializedName("url")
    private String a;

    @SerializedName("name")
    private String b;

    @SerializedName("lang")
    private String c;

    @SerializedName("format")
    private String d;

    public final h a(String str) {
        str.getClass();
        switch (str) {
            case "ass":
            case "ssa":
                this.d = "text/x-ssa";
                break;
            case "vtt":
                this.d = "text/vtt";
                break;
            default:
                this.d = "application/x-subrip";
                break;
        }
        return this;
    }

    public final h b(String str) {
        int i = com.github.catvod.spider.merge.i0.g.a;
        this.b = str;
        return this;
    }

    public final h c(String str) {
        this.a = str;
        return this;
    }
}
