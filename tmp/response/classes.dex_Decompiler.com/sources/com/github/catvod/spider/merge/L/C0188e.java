package com.github.catvod.spider.merge.l;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.l.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0188e {

    @SerializedName("data")
    private C0187d a;

    @SerializedName("time")
    private long b;

    @SerializedName("files")
    private List<C0184a> c;
    private String d;

    public final boolean a(String str) {
        return (TextUtils.isEmpty(this.d) ? "" : this.d).equals(str) && System.currentTimeMillis() <= this.b;
    }

    public final C0187d b() {
        return this.a;
    }

    public final List<C0184a> c() {
        return this.c;
    }

    public final void d(List<C0184a> list) {
        this.c = list;
    }

    public final C0188e e(String str) {
        this.d = str;
        return this;
    }

    public final C0188e f() {
        this.b = System.currentTimeMillis() + 3600000;
        return this;
    }
}
