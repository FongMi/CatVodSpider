package com.github.catvod.spider.merge.c;

import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class n {

    @SerializedName("responses")
    private List<n> a;

    @SerializedName("body")
    private m b;

    @SerializedName("id")
    private String c;

    @SerializedName("status")
    private int d;

    public final m a() {
        m mVar = this.b;
        return mVar == null ? new m() : mVar;
    }

    public final n b() {
        List<n> listEmptyList = this.a;
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        if (listEmptyList.isEmpty()) {
            return new n();
        }
        List<n> listEmptyList2 = this.a;
        if (listEmptyList2 == null) {
            listEmptyList2 = Collections.emptyList();
        }
        return listEmptyList2.get(0);
    }

    public final int c() {
        return this.d;
    }
}
