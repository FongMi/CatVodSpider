package com.github.catvod.spider.merge.j;

import com.github.catvod.spider.merge.a.C0098a;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.j.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0179a {

    @SerializedName("Next")
    private String a;

    @SerializedName("Len")
    private int b;

    @SerializedName("IsFirst")
    private Boolean c;

    @SerializedName("Expired")
    private Boolean d;

    @SerializedName("InfoList")
    private List<C0180b> e;

    public final List<C0180b> a() {
        return this.e;
    }

    public final int b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final String toString() {
        return C0098a.a(new byte[]{119, -118, 85, 72, -122, -69, -102, 126, 71, -42, 6}, new byte[]{51, -21, 33, 41, -3, -11, -1, 6}) + this.a + '\'' + C0098a.a(new byte[]{-86, -1, 94, -11, -128, -127}, new byte[]{-122, -33, 18, -112, -18, -68, -26, -108}) + this.b + C0098a.a(new byte[]{99, 20, 109, -59, -68, 27, -55, 31, 59, 9}, new byte[]{79, 52, 36, -74, -6, 114, -69, 108}) + this.c + C0098a.a(new byte[]{-57, 92, -19, 10, -37, -63, 123, 35, -113, 65}, new byte[]{-21, 124, -88, 114, -85, -88, 9, 70}) + this.d + C0098a.a(new byte[]{-22, 101, -49, 110, 120, -94, 76, 7, -75, 49, -69}, new byte[]{-58, 69, -122, 0, 30, -51, 0, 110}) + this.e + '}';
    }
}
