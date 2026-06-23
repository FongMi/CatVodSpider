package com.github.catvod.spider.merge.FM.g;

import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.g.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0345a {

    @SerializedName("duration")
    private String a;

    @SerializedName("minBufferTime")
    private String b;

    @SerializedName("video")
    private List<C0347c> c;

    @SerializedName("audio")
    private List<C0347c> d;

    public final List<C0347c> a() {
        List<C0347c> list = this.d;
        return list == null ? Collections.emptyList() : list;
    }

    public final String b() {
        String str = this.a;
        return str == null ? "0" : str;
    }

    public final String c() {
        String str = this.b;
        return str == null ? "0" : str;
    }

    public final List<C0347c> d() {
        List<C0347c> list = this.c;
        return list == null ? Collections.emptyList() : list;
    }
}
