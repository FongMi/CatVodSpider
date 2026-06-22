package com.github.catvod.spider.merge.b;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class C0095d {

    @SerializedName("key")
    private String a;

    @SerializedName("name")
    private String b;

    @SerializedName("init")
    private String c;

    @SerializedName("value")
    private List<C0094c> d;

    public C0095d(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.d = list;
    }
}
