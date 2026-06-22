package com.github.catvod.spider.merge.g;

import com.github.catvod.spider.merge.b.C0132s;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0166h {

    @SerializedName("code")
    private Integer a;

    @SerializedName("message")
    private String b;

    @SerializedName("data")
    private C0160b c;

    public static C0166h b(String str) {
        return (C0166h) C0132s.a(str, C0166h.class);
    }

    public final C0160b a() {
        C0160b c0160b = this.c;
        return c0160b == null ? new C0160b() : c0160b;
    }
}
