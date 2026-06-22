package com.github.catvod.spider.merge.g;

import android.text.TextUtils;
import com.github.catvod.spider.merge.b.i;
import com.github.catvod.spider.merge.b.j;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class c {

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

    public c(String str) {
        this.b = str;
    }

    public final String a() {
        return TextUtils.isEmpty(this.d) ? "" : this.d;
    }

    public final j b() {
        return new j(TextUtils.isEmpty(this.a) ? "" : this.a, TextUtils.isEmpty(this.c) ? "" : this.c, TextUtils.isEmpty(this.e) ? "" : this.e, new i(Float.valueOf(1.0f)), TextUtils.isEmpty(this.b) ? "" : this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return (TextUtils.isEmpty(this.b) ? "" : this.b).equals(TextUtils.isEmpty(cVar.b) ? "" : cVar.b);
    }
}
