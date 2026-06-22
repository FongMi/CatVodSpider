package com.github.catvod.spider.merge.XI;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class u {

    @SerializedName("name")
    private String a;

    @SerializedName("list")
    private List<t> b;

    public static List<u> a(String str) {
        return (List) new Gson().fromJson(str, new s().getType());
    }

    public final List<t> b() {
        List<t> list = this.b;
        return list == null ? Collections.emptyList() : list;
    }

    public final String c() {
        return TextUtils.isEmpty(this.a) ? "" : this.a;
    }

    public final List<com.github.catvod.spider.merge.KI.k> d() {
        ArrayList arrayList = new ArrayList();
        Iterator<t> it = b().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c());
        }
        return arrayList;
    }
}
