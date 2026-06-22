package com.github.catvod.spider.merge.ai;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class p {

    @SerializedName("name")
    private String a;

    @SerializedName("url")
    private String b;

    @SerializedName("icon")
    private String c;

    @SerializedName("copy")
    private String d;

    @SerializedName("version")
    private String e;

    public p(String str) {
        this.b = str;
    }

    public final String a() {
        return TextUtils.isEmpty(this.d) ? "" : this.d;
    }

    public final String b() {
        return TextUtils.isEmpty(this.b) ? "" : this.b;
    }

    public final m c() {
        return new m(b(), TextUtils.isEmpty(this.a) ? "" : this.a, TextUtils.isEmpty(this.c) ? "" : this.c, TextUtils.isEmpty(this.e) ? "" : this.e, new l(Float.valueOf(1.0f)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return b().equals(((p) obj).b());
        }
        return false;
    }
}
