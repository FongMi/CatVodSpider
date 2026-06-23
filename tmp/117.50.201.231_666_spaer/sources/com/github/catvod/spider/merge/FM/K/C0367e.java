package com.github.catvod.spider.merge.FM.k;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.k.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0367e {

    @SerializedName("data")
    private C0366d a;

    @SerializedName("time")
    private long b;

    @SerializedName("files")
    private List<C0363a> c;
    private String d;

    public final boolean a(String str) {
        return (TextUtils.isEmpty(this.d) ? "" : this.d).equals(str) && System.currentTimeMillis() <= this.b;
    }

    public final C0366d b() {
        return this.a;
    }

    public final List<C0363a> c() {
        return this.c;
    }

    public final void d(List<C0363a> list) {
        this.c = list;
    }

    public final C0367e e(String str) {
        this.d = str;
        return this;
    }

    public final C0367e f() {
        this.b = System.currentTimeMillis() + 3600000;
        return this;
    }
}
