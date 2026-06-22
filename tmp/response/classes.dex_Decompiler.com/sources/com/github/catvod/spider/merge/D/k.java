package com.github.catvod.spider.merge.d;

import android.text.TextUtils;
import com.github.catvod.spider.merge.a.C0098a;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class k {

    @SerializedName("template_id")
    private String a;

    @SerializedName("language")
    private String b;

    @SerializedName("status")
    private String c;

    @SerializedName("url")
    private String d;

    public final com.github.catvod.spider.merge.c.i a() {
        com.github.catvod.spider.merge.c.i iVar = new com.github.catvod.spider.merge.c.i();
        iVar.d(TextUtils.isEmpty(this.d) ? "" : this.d);
        iVar.c(TextUtils.isEmpty(this.b) ? "" : this.b);
        iVar.b(TextUtils.isEmpty(this.b) ? "" : this.b);
        return iVar.a(C0098a.a(new byte[]{100, -49, 49}, new byte[]{18, -69, 69, 83, 92, 5, 94, 107}));
    }

    public final String b() {
        return TextUtils.isEmpty(this.a) ? "" : this.a;
    }

    public final String c() {
        return TextUtils.isEmpty(this.d) ? "" : this.d;
    }
}
