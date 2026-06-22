package com.github.catvod.spider.merge.k;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class e {

    @SerializedName("data")
    private d a;

    @SerializedName("time")
    private long b;

    @SerializedName("files")
    private List<C0182a> c;
    private String d;

    public final boolean a(String str) {
        return (TextUtils.isEmpty(this.d) ? "" : this.d).equals(str) && System.currentTimeMillis() <= this.b;
    }

    public final d b() {
        return this.a;
    }

    public final List<C0182a> c() {
        return this.c;
    }

    public final void d(List<C0182a> list) {
        this.c = list;
    }

    public final e e(String str) {
        this.d = str;
        return this;
    }

    public final e f() {
        this.b = System.currentTimeMillis() + 3600000;
        return this;
    }
}
