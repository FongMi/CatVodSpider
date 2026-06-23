package com.github.catvod.spider.merge.C0.c;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class e {

    @SerializedName("url")
    private String a;

    @SerializedName("name")
    private String b;

    @SerializedName("lang")
    private String c;

    @SerializedName("format")
    private String d;

    public final e a(String str) {
        str.getClass();
        switch (str) {
            case "ass":
            case "ssa":
                this.d = "text/x-ssa";
                return this;
            case "vtt":
                this.d = "text/vtt";
                return this;
            default:
                this.d = "application/x-subrip";
                return this;
        }
    }

    public final e b(String str) {
        this.c = str;
        return this;
    }

    public final e c(String str) {
        this.b = str;
        return this;
    }

    public final e d(String str) {
        this.a = str;
        return this;
    }
}
