package com.github.catvod.spider.merge.g;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class b {

    @SerializedName("name")
    private String a;

    @SerializedName("list")
    private List<c> b;

    public static List a(String str) {
        return (List) new Gson().fromJson(str, new a().getType());
    }

    public final List b() {
        List<c> list = this.b;
        return list == null ? Collections.emptyList() : list;
    }

    public final String c() {
        return TextUtils.isEmpty(this.a) ? "" : this.a;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        Iterator it = b().iterator();
        while (it.hasNext()) {
            arrayList.add(((c) it.next()).b());
        }
        return arrayList;
    }
}
