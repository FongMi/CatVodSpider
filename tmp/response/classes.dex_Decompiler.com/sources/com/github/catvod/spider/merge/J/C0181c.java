package com.github.catvod.spider.merge.j;

import com.github.catvod.spider.merge.b.C0132s;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.j.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0181c {

    @SerializedName("code")
    private Integer a;

    @SerializedName("message")
    private String b;

    @SerializedName("data")
    private C0179a c;

    public static C0181c b(String str) {
        return (C0181c) C0132s.a(str, C0181c.class);
    }

    public final C0179a a() {
        C0179a c0179a = this.c;
        return c0179a == null ? new C0179a() : c0179a;
    }
}
