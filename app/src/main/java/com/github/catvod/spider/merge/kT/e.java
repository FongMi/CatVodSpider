package com.github.catvod.spider.merge.kT;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class e {

    @SerializedName("data")
    private d a;

    @SerializedName("time")
    private long b;

    @SerializedName("files")
    private List<a> c;
    private String d;

    public final boolean a(String str) {
        return (TextUtils.isEmpty(this.d) ? "" : this.d).equals(str) && System.currentTimeMillis() <= this.b;
    }

    public final d b() {
        return this.a;
    }

    public final List<a> c() {
        return this.c;
    }

    public final void d(List<a> list) {
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
