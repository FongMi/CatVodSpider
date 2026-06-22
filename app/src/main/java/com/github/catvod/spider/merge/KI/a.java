package com.github.catvod.spider.merge.KI;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class a {

    @SerializedName("type_id")
    private final String a;

    @SerializedName("type_name")
    private final String b;

    @SerializedName("type_flag")
    private final String c;

    public a(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = null;
    }

    public a(String str, String str2, String str3) {
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
        if (obj instanceof a) {
            return this.a.equals(((a) obj).a);
        }
        return false;
    }
}
