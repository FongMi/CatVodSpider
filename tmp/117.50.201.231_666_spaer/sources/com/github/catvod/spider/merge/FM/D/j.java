package com.github.catvod.spider.merge.FM.d;

import android.text.TextUtils;
import com.github.catvod.spider.merge.FM.c.C0330h;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class j {

    @SerializedName("template_id")
    private String a;

    @SerializedName("language")
    private String b;

    @SerializedName("status")
    private String c;

    @SerializedName("url")
    private String d;

    public final C0330h a() {
        C0330h c0330h = new C0330h();
        c0330h.d(TextUtils.isEmpty(this.d) ? "" : this.d);
        c0330h.c(TextUtils.isEmpty(this.b) ? "" : this.b);
        c0330h.b(TextUtils.isEmpty(this.b) ? "" : this.b);
        return c0330h.a("vtt");
    }

    public final String b() {
        return TextUtils.isEmpty(this.a) ? "" : this.a;
    }

    public final String c() {
        return TextUtils.isEmpty(this.d) ? "" : this.d;
    }
}
