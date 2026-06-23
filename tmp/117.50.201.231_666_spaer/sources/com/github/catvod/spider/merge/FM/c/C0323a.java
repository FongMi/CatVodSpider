package com.github.catvod.spider.merge.FM.c;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.c.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0323a {

    @SerializedName("type_id")
    private final String a;

    @SerializedName("type_name")
    private final String b;

    @SerializedName("type_flag")
    private final String c;

    public C0323a(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = null;
    }

    public C0323a(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0323a) {
            return this.a.equals(((C0323a) obj).a);
        }
        return false;
    }
}
