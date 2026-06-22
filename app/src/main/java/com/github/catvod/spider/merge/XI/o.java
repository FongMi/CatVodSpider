package com.github.catvod.spider.merge.XI;

import com.github.catvod.spider.merge.bY.C0924s;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class o {

    @SerializedName("list")
    private List<n> a;

    @SerializedName("uk")
    private String b;

    @SerializedName("share_id")
    private String c;

    @SerializedName("errno")
    private int d;

    public static o e(String str) {
        return (o) C0924s.a(str, o.class);
    }

    public final int a() {
        return this.d;
    }

    public final List<n> b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.b;
    }

    public final String toString() {
        return f.a(new byte[]{-39, 83, 23, 12, 19, -103, -14, 3, -1, 11}, new byte[]{-117, 54, 100, 124, 104, -11, -101, 112}) + this.a + f.a(new byte[]{-10, -108, -25, -100, -108, -94}, new byte[]{-38, -76, -110, -9, -87, -123, -22, -91}) + this.b + '\'' + f.a(new byte[]{112, 67, -112, -25, 123, -98, -102, 86, 56, 94, -60}, new byte[]{92, 99, -29, -113, 26, -20, -1, 31}) + this.c + '\'' + f.a(new byte[]{-17, -49, -6, -97, -117, 126, -83, -58}, new byte[]{-61, -17, -97, -19, -7, 16, -62, -5}) + this.d + '}';
    }
}
