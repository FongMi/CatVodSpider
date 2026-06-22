package com.github.catvod.spider.merge.KI;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class j {

    @SerializedName("type")
    private final String a;

    @SerializedName("ratio")
    private Float b;

    public j(String str, Float f) {
        this.a = str;
        this.b = f;
    }

    public static j a(float f) {
        return new j(com.github.catvod.spider.merge.XI.f.a(new byte[]{50, 74, -44, -17}, new byte[]{64, 47, -73, -101, 58, 90, 58, 25}), Float.valueOf(f));
    }
}
