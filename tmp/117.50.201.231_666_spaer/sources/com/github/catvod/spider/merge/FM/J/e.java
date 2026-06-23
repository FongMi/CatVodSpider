package com.github.catvod.spider.merge.FM.j;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class e {

    @SerializedName("data")
    private d a;

    @SerializedName("time")
    private long b;

    @SerializedName("files")
    private List<C0361a> c;
    private String d;

    public final boolean a(String str) {
        return (TextUtils.isEmpty(this.d) ? "" : this.d).equals(str) && System.currentTimeMillis() <= this.b;
    }

    public final d b() {
        return this.a;
    }

    public final List<C0361a> c() {
        return this.c;
    }

    public final void d(List<C0361a> list) {
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
