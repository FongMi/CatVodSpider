package com.github.catvod.spider.merge.g;

import com.github.catvod.spider.merge.a.C0098a;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0159a {

    @SerializedName("duration")
    private String a;

    @SerializedName("minBufferTime")
    private String b;

    @SerializedName("video")
    private List<C0161c> c;

    @SerializedName("audio")
    private List<C0161c> d;

    public final List<C0161c> a() {
        List<C0161c> list = this.d;
        return list == null ? Collections.emptyList() : list;
    }

    public final String b() {
        String str = this.a;
        return str == null ? C0098a.a(new byte[]{-80}, new byte[]{-128, -25, -40, -88, -34, 66, 104, 113}) : str;
    }

    public final String c() {
        String str = this.b;
        return str == null ? C0098a.a(new byte[]{52}, new byte[]{4, -120, 79, -104, 51, -9, -31, 80}) : str;
    }

    public final List<C0161c> d() {
        List<C0161c> list = this.c;
        return list == null ? Collections.emptyList() : list;
    }
}
