package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.C.u;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class f {

    @SerializedName("data")
    private List<d> a;

    public static f b(String str) {
        return (f) u.a(str, f.class);
    }

    public final List<d> a() {
        List<d> list = this.a;
        return list == null ? Collections.emptyList() : list;
    }
}
