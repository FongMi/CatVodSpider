package com.github.catvod.spider.merge.FM.f;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.f.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0344b {

    @SerializedName("list")
    private List<C0343a> a;

    @SerializedName("uk")
    private String b;

    @SerializedName("share_id")
    private String c;

    @SerializedName("errno")
    private int d;

    public static C0344b e(String str) {
        return (C0344b) new Gson().fromJson(str, C0344b.class);
    }

    public final int a() {
        return this.d;
    }

    public final List<C0343a> b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.b;
    }

    public final String toString() {
        return "Resp{list=" + this.a + ", uk='" + this.b + "', shareId='" + this.c + "', errno=" + this.d + '}';
    }
}
