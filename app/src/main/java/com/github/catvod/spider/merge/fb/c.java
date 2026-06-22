package com.github.catvod.spider.merge.fb;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class c {

    @SerializedName("key")
    private String a;

    @SerializedName("name")
    private String b;

    @SerializedName("value")
    private List<b> c;

    public c(String str, String str2, List<b> list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }
}
