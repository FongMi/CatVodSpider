package com.github.catvod.bean.dm84;

import com.github.catvod.bean.vod.FilterItem;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class FilterValue {

    @SerializedName("key")
    private final String a;

    @SerializedName("name")
    private final String b;

    @SerializedName("value")
    private final List<com.github.catvod.bean.vod.FilterItem> c;

    public FilterValue(String str, String str2, List<com.github.catvod.bean.vod.FilterItem> list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public FilterValue(String name, String value) {
        this.a = name;
        this.b = value;
        this.c = null;
    }
}
