package com.github.catvod.bean;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class d {

    @SerializedName("key")
    private String a;

    @SerializedName("name")
    private String b;

    @SerializedName("value")
    private List<c> c;

    public d(String str, String str2, List<c> list) {
        this.a = str;
        int i = com.github.catvod.spider.merge.i0.g.a;
        this.b = str2;
        this.c = list;
    }
}
