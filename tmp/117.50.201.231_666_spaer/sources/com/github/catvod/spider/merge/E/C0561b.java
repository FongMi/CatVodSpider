package com.github.catvod.spider.merge.e;

import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.b.C0547k;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.e.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0561b {

    @SerializedName("list")
    private List<C0560a> a;

    @SerializedName("uk")
    private String b;

    @SerializedName("share_id")
    private String c;

    @SerializedName("errno")
    private int d;

    public static C0561b e(String str) {
        return (C0561b) new Gson().fromJson(str, C0561b.class);
    }

    public final int a() {
        return this.d;
    }

    public final List<C0560a> b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sbA = C0529a.a("Resp{list=");
        sbA.append(this.a);
        sbA.append(", uk='");
        C0547k.c(sbA, this.b, '\'', ", shareId='");
        C0547k.c(sbA, this.c, '\'', ", errno=");
        sbA.append(this.d);
        sbA.append('}');
        return sbA.toString();
    }
}
