package com.github.catvod.spider.merge.k;

import com.github.catvod.spider.merge.a.C0098a;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.k.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0183b {

    @SerializedName("list")
    private List<C0182a> a;

    public final List<C0182a> a() {
        List<C0182a> list = this.a;
        return list == null ? Collections.emptyList() : list;
    }

    public final String toString() {
        return C0098a.a(new byte[]{7, 100, -100, 123, -63, -122, -120, 15, 46, 118, -43}, new byte[]{67, 5, -24, 26, -70, -17, -4, 106}) + this.a + '}';
    }
}
