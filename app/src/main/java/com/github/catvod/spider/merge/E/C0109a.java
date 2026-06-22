package com.github.catvod.spider.merge.e;

import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.e.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class C0109a {

    @SerializedName("duration")
    private String a;

    @SerializedName("minBufferTime")
    private String b;

    @SerializedName("video")
    private List<C0111c> c;

    @SerializedName("audio")
    private List<C0111c> d;

    public final List a() {
        List<C0111c> list = this.d;
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

    public final List d() {
        List<C0111c> list = this.c;
        return list == null ? Collections.emptyList() : list;
    }
}
