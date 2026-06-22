package com.github.catvod.spider.merge.i;

import android.text.TextUtils;
import com.github.catvod.spider.merge.c.j;
import com.github.catvod.spider.merge.c.k;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class c {

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

    public c(String str) {
        this.b = str;
    }

    public final String a() {
        return TextUtils.isEmpty(this.d) ? "" : this.d;
    }

    public final String b() {
        return TextUtils.isEmpty(this.b) ? "" : this.b;
    }

    public final k c() {
        return new k("", TextUtils.isEmpty(this.a) ? "" : this.a, TextUtils.isEmpty(this.c) ? "" : this.c, TextUtils.isEmpty(this.e) ? "" : this.e, j.a(1.0f), b());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return b().equals(((c) obj).b());
        }
        return false;
    }
}
