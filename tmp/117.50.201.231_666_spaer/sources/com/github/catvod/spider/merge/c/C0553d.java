package com.github.catvod.spider.merge.c;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.c.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0553d {

    @SerializedName("url")
    private String a;

    @SerializedName("name")
    private String b;

    @SerializedName("lang")
    private String c;

    @SerializedName("format")
    private String d;

    public final C0553d a(String str) {
        String str2;
        switch (str) {
            case "ass":
            case "ssa":
                str2 = "text/x-ssa";
                break;
            case "vtt":
                str2 = "text/vtt";
                break;
            default:
                str2 = "application/x-subrip";
                break;
        }
        this.d = str2;
        return this;
    }

    public final C0553d b(String str) {
        this.b = str;
        return this;
    }

    public final C0553d c(String str) {
        this.a = str;
        return this;
    }
}
