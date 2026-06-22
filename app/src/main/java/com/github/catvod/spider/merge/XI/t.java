package com.github.catvod.spider.merge.XI;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class t {

    @SerializedName("name")
    private String a;

    @SerializedName("url")
    private final String b;

    @SerializedName("icon")
    private String c;

    @SerializedName("copy")
    private String d;

    @SerializedName("version")
    private String e;

    public t(String str) {
        this.b = str;
    }

    public final String a() {
        return TextUtils.isEmpty(this.d) ? "" : this.d;
    }

    public final String b() {
        return TextUtils.isEmpty(this.b) ? "" : this.b;
    }

    public final com.github.catvod.spider.merge.KI.k c() {
        return new com.github.catvod.spider.merge.KI.k("", TextUtils.isEmpty(this.a) ? "" : this.a, TextUtils.isEmpty(this.c) ? "" : this.c, TextUtils.isEmpty(this.e) ? "" : this.e, com.github.catvod.spider.merge.KI.j.a(1.0f), b());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            return b().equals(((t) obj).b());
        }
        return false;
    }
}
