package com.github.catvod.spider.merge.e;

import com.github.catvod.spider.merge.A.T;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class h {

    @SerializedName("code")
    private Integer a;

    @SerializedName("message")
    private String b;

    @SerializedName("data")
    private C0110b c;

    public static h b(String str) {
        return (h) T.c(str, h.class);
    }

    public final C0110b a() {
        C0110b c0110b = this.c;
        return c0110b == null ? new C0110b() : c0110b;
    }
}
