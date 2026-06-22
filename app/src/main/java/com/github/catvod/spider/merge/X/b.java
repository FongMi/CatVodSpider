package com.github.catvod.spider.merge.X;

import com.github.catvod.bean.VodItem;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class b {

    @SerializedName("url")
    private String a;

    @SerializedName("gmtCreate")
    private String b;

    @SerializedName("fileInfos")
    private List<a> c;

    public final String a() {
        return this.c.get(0).a();
    }

    public final i b() {
        return new i(this.a, this.c.get(0).a(), "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/48/5e/29/485e292b-ed09-47b8-8c41-3402a7fb8936/AppIcon-0-1x_U007epad-0-1-0-85-220-0.png/350x350.png", this.b);
    }
}
