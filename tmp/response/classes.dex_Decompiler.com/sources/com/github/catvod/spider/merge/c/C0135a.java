package com.github.catvod.spider.merge.c;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.c.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0135a {

    @SerializedName("type_id")
    private final String a;

    @SerializedName("type_name")
    private final String b;

    @SerializedName("type_flag")
    private final String c;

    public C0135a(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = null;
    }

    public C0135a(String str, String str2, String str3) {
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
        if (obj instanceof C0135a) {
            return this.a.equals(((C0135a) obj).a);
        }
        return false;
    }
}
