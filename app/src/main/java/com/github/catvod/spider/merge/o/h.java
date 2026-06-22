package com.github.catvod.spider.merge.O;

import com.github.catvod.spider.merge.C.u;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class h {

    @SerializedName("code")
    private Integer a;

    @SerializedName("message")
    private String b;

    @SerializedName("data")
    private b c;

    public static h b(String str) {
        return (h) u.a(str, h.class);
    }

    public final b a() {
        b bVar = this.c;
        return bVar == null ? new b() : bVar;
    }
}
