package com.github.catvod.spider.merge.XU;

import com.github.catvod.spider.merge.bY.C0924s;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class h {

    @SerializedName("code")
    private Integer a;

    @SerializedName("message")
    private String b;

    @SerializedName("data")
    private f c;

    public static h b(String str) {
        return (h) C0924s.a(str, h.class);
    }

    public final f a() {
        f fVar = this.c;
        return fVar == null ? new f() : fVar;
    }
}
