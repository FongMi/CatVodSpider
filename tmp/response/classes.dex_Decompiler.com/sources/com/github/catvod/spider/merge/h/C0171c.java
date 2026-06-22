package com.github.catvod.spider.merge.h;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.h.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0171c {

    @SerializedName("name")
    private String a;

    @SerializedName("source_list")
    private List<C0170b> b;

    public final String a() {
        return TextUtils.isEmpty(this.a) ? "" : this.a;
    }

    public final List<C0170b> b() {
        List<C0170b> list = this.b;
        return list == null ? Collections.emptyList() : list;
    }
}
