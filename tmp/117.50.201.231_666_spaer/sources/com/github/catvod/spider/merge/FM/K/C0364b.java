package com.github.catvod.spider.merge.FM.k;

import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.k.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0364b {

    @SerializedName("list")
    private List<C0363a> a;

    public final List<C0363a> a() {
        List<C0363a> list = this.a;
        return list == null ? Collections.emptyList() : list;
    }

    public final String toString() {
        return "Data{items=" + this.a + '}';
    }
}
