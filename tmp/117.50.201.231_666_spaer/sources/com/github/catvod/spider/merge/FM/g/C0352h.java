package com.github.catvod.spider.merge.FM.g;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.g.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0352h {

    @SerializedName("code")
    private Integer a;

    @SerializedName("message")
    private String b;

    @SerializedName("data")
    private C0346b c;

    public static C0352h b(String str) {
        return (C0352h) new Gson().fromJson(str, C0352h.class);
    }

    public final C0346b a() {
        C0346b c0346b = this.c;
        return c0346b == null ? new C0346b() : c0346b;
    }
}
