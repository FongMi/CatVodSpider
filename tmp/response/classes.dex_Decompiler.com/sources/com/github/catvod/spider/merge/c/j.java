package com.github.catvod.spider.merge.c;

import com.github.catvod.spider.merge.a.C0098a;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
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
        return new j(C0098a.a(new byte[]{71, -34, 55, -119}, new byte[]{53, -69, 84, -3, -54, -88, 100, -95}), Float.valueOf(f));
    }
}
