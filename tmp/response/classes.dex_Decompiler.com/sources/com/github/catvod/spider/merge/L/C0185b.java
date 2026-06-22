package com.github.catvod.spider.merge.l;

import com.github.catvod.spider.merge.a.C0098a;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.l.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0185b {

    @SerializedName("list")
    private List<C0184a> a;

    public final List<C0184a> a() {
        List<C0184a> list = this.a;
        return list == null ? Collections.emptyList() : list;
    }

    public final String toString() {
        return C0098a.a(new byte[]{57, 82, 23, -113, -60, -44, -50, -54, 16, 64, 94}, new byte[]{125, 51, 99, -18, -65, -67, -70, -81}) + this.a + '}';
    }
}
