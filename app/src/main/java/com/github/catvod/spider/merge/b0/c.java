package com.github.catvod.spider.merge.b0;

import android.text.TextUtils;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.M;
import com.github.catvod.spider.merge.i0.m;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class c {

    @SerializedName("cookie")
    private String a;
    public String b = "";

    public final c a() {
        this.a = "";
        m.w("115 cookie已清空！");
        return this;
    }

    public final String b() {
        return TextUtils.isEmpty(this.a) ? "" : this.a;
    }

    public final c c() {
        Init.execute(new M(this, 3));
        return this;
    }

    public final void d(String str) {
        this.a = str;
    }

    public final String toString() {
        return new Gson().toJson(this);
    }
}
