package com.github.catvod.spider.merge.h;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.h.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class C0120d {

    @SerializedName("name")
    private String a;

    @SerializedName("videos")
    private List<C0124h> b;

    public final String a() {
        return TextUtils.isEmpty(this.a) ? "" : this.a;
    }

    public final List b() {
        List<C0124h> list = this.b;
        return list == null ? Collections.emptyList() : list;
    }
}
