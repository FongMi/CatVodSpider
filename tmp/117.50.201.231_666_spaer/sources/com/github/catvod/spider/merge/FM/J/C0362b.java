package com.github.catvod.spider.merge.FM.j;

import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.j.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0362b {

    @SerializedName("list")
    private List<C0361a> a;

    public final List<C0361a> a() {
        List<C0361a> list = this.a;
        return list == null ? Collections.emptyList() : list;
    }

    public final String toString() {
        return "Data{items=" + this.a + '}';
    }
}
