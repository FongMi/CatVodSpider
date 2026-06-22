package com.github.catvod.spider.merge.kT;

import com.github.catvod.spider.merge.XI.f;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class b {

    @SerializedName("list")
    private List<a> a;

    public final List<a> a() {
        List<a> list = this.a;
        return list == null ? Collections.emptyList() : list;
    }

    public final String toString() {
        return f.a(new byte[]{-122, 53, 108, 65, -84, 32, -25, -101, -81, 39, 37}, new byte[]{-62, 84, 24, 32, -41, 73, -109, -2}) + this.a + '}';
    }
}
