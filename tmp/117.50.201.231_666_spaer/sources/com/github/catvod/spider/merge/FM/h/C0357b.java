package com.github.catvod.spider.merge.FM.h;

import android.text.TextUtils;
import com.github.catvod.spider.merge.FM.c.C0332j;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.h.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0357b {

    @SerializedName("name")
    private String a;

    @SerializedName("list")
    private List<c> b;

    public static List<C0357b> a(String str) {
        return (List) new Gson().fromJson(str, new C0356a().getType());
    }

    public final List<c> b() {
        List<c> list = this.b;
        return list == null ? Collections.emptyList() : list;
    }

    public final String c() {
        return TextUtils.isEmpty(this.a) ? "" : this.a;
    }

    public final List<C0332j> d() {
        ArrayList arrayList = new ArrayList();
        Iterator<c> it = b().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c());
        }
        return arrayList;
    }
}
