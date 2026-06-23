package com.github.catvod.bean.vod;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class StringUtils {

    @SerializedName("url")
    private String a;

    @SerializedName("name")
    private String b;

    @SerializedName("lang")
    private String c;

    @SerializedName("format")
    private String d;

    public final StringUtils a(String str) {
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

    public final StringUtils b(String str) {
        this.c = str;
        return this;
    }

    public final StringUtils c(String str) {
        this.b = str;
        return this;
    }

    public final StringUtils d(String str) {
        this.a = str;
        return this;
    }
}
