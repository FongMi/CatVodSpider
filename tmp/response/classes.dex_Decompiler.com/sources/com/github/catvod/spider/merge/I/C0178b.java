package com.github.catvod.spider.merge.i;

import android.text.TextUtils;
import com.github.catvod.spider.merge.c.k;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.i.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0178b {

    @SerializedName("name")
    private String a;

    @SerializedName("list")
    private List<c> b;

    public static List<C0178b> a(String str) {
        return (List) new Gson().fromJson(str, new C0177a().getType());
    }

    public final List<c> b() {
        List<c> list = this.b;
        return list == null ? Collections.emptyList() : list;
    }

    public final String c() {
        return TextUtils.isEmpty(this.a) ? "" : this.a;
    }

    public final List<k> d() {
        ArrayList arrayList = new ArrayList();
        Iterator<c> it = b().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c());
        }
        return arrayList;
    }
}
