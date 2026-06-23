package com.github.catvod.spider.merge.FM.d;

import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class m {

    @SerializedName("responses")
    private List<m> a;

    @SerializedName("body")
    private l b;

    @SerializedName("id")
    private String c;

    @SerializedName("status")
    private int d;

    public final l a() {
        l lVar = this.b;
        return lVar == null ? new l() : lVar;
    }

    public final m b() {
        List<m> listEmptyList = this.a;
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        if (listEmptyList.isEmpty()) {
            return new m();
        }
        List<m> listEmptyList2 = this.a;
        if (listEmptyList2 == null) {
            listEmptyList2 = Collections.emptyList();
        }
        return listEmptyList2.get(0);
    }

    public final int c() {
        return this.d;
    }
}
