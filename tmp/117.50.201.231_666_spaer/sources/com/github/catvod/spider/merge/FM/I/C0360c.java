package com.github.catvod.spider.merge.FM.i;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.i.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0360c {

    @SerializedName("code")
    private Integer a;

    @SerializedName("message")
    private String b;

    @SerializedName("data")
    private C0358a c;

    public static C0360c b(String str) {
        return (C0360c) new Gson().fromJson(str, C0360c.class);
    }

    public final C0358a a() {
        C0358a c0358a = this.c;
        return c0358a == null ? new C0358a() : c0358a;
    }
}
