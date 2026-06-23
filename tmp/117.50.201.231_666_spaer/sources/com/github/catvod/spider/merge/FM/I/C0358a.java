package com.github.catvod.spider.merge.FM.i;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.i.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0358a {

    @SerializedName("Next")
    private String a;

    @SerializedName("Len")
    private int b;

    @SerializedName("IsFirst")
    private Boolean c;

    @SerializedName("Expired")
    private Boolean d;

    @SerializedName("InfoList")
    private List<C0359b> e;

    public final List<C0359b> a() {
        return this.e;
    }

    public final int b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final String toString() {
        return "Data{Next='" + this.a + "', Len=" + this.b + ", IsFirst=" + this.c + ", Expired=" + this.d + ", InfoList=" + this.e + '}';
    }
}
