package com.github.catvod.spider.merge.f;

import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0132s;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class b {

    @SerializedName("list")
    private List<C0158a> a;

    @SerializedName("uk")
    private String b;

    @SerializedName("share_id")
    private String c;

    @SerializedName("errno")
    private int d;

    public static b e(String str) {
        return (b) C0132s.a(str, b.class);
    }

    public final int a() {
        return this.d;
    }

    public final List<C0158a> b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.b;
    }

    public final String toString() {
        return C0098a.a(new byte[]{41, -21, -58, -32, -40, 108, 49, 8, 15, -77}, new byte[]{123, -114, -75, -112, -93, 0, 88, 123}) + this.a + C0098a.a(new byte[]{98, 48, -119, 110, 42, -2}, new byte[]{78, 16, -4, 5, 23, -39, 61, 26}) + this.b + '\'' + C0098a.a(new byte[]{-57, -26, -117, -80, -82, -124, -73, 84, -113, -5, -33}, new byte[]{-21, -58, -8, -40, -49, -10, -46, 29}) + this.c + '\'' + C0098a.a(new byte[]{113, 103, -76, 21, 46, 84, -12, 83}, new byte[]{93, 71, -47, 103, 92, 58, -101, 110}) + this.d + '}';
    }
}
