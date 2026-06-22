package com.github.catvod.spider.merge.h;

import com.github.catvod.spider.merge.b.C0132s;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.h.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0175g {

    @SerializedName("data")
    private List<C0173e> a;

    public static C0175g b(String str) {
        return (C0175g) C0132s.a(str, C0175g.class);
    }

    public final List<C0173e> a() {
        List<C0173e> list = this.a;
        return list == null ? Collections.emptyList() : list;
    }
}
