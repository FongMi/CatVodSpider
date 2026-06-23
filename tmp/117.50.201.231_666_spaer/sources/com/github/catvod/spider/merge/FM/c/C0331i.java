package com.github.catvod.spider.merge.FM.c;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.c.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0331i {

    @SerializedName("type")
    private final String a;

    @SerializedName("ratio")
    private Float b;

    public C0331i(String str, Float f) {
        this.a = str;
        this.b = f;
    }

    public static C0331i a(float f) {
        return new C0331i("rect", Float.valueOf(f));
    }
}
