package com.github.catvod.spider.merge.h;

import android.text.TextUtils;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.c.k;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.h.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0176h {

    @SerializedName("data")
    private List<C0176h> a;

    @SerializedName("id")
    private String b;

    @SerializedName(alternate = {"path"}, value = "thumbnail")
    private String c;

    @SerializedName("title")
    private String d;

    @SerializedName("mask")
    private String e;

    public final List<C0176h> a() {
        List<C0176h> list = this.a;
        return list == null ? Collections.emptyList() : list;
    }

    public final k b() {
        String str;
        String str2 = TextUtils.isEmpty(this.b) ? "" : this.b;
        String str3 = TextUtils.isEmpty(this.d) ? "" : this.d;
        if (TextUtils.isEmpty(this.c)) {
            str = "";
        } else {
            str = C0098a.a(new byte[]{18, -38, 102, -12, 33, -61, 12, 99, 23, -55, 35, -86, 109, -114, 84, 127, 9, -128, 113, -21, 118}, new byte[]{122, -82, 18, -124, 27, -20, 35, 10}) + this.c;
        }
        return new k(str2, str3, str, TextUtils.isEmpty(this.e) ? "" : this.e);
    }
}
