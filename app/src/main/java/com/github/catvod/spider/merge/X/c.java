package com.github.catvod.spider.merge.X;

import com.github.catvod.bean.VodItem;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class c {

    @SerializedName("list")
    private List<b> a;

    public final List<i> a(String str) {
        ArrayList arrayList = new ArrayList();
        List<b> listEmptyList = this.a;
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        this.a = listEmptyList;
        for (b bVar : listEmptyList) {
            if (bVar.a().contains(str)) {
                arrayList.add(bVar.b());
            }
        }
        return arrayList;
    }
}
