package com.github.catvod.spider.merge.i;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.i.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0571d {

    @SerializedName("nickname")
    private String a;

    @SerializedName("member_type")
    private String b;

    @SerializedName("cookie")
    private String c;

    public C0571d() {
    }

    public C0571d(String str) {
        this.c = str;
    }

    public static C0571d e(String str) {
        C0571d c0571d = (C0571d) new Gson().fromJson(str, C0571d.class);
        return c0571d == null ? new C0571d() : c0571d;
    }

    public final String a() {
        return TextUtils.isEmpty(this.c) ? "" : this.c;
    }

    public final String b() {
        return TextUtils.isEmpty(this.b) ? "" : this.b;
    }

    public final String c() {
        return TextUtils.isEmpty(this.a) ? "" : this.a;
    }

    public final boolean d() {
        return a().length() > 0 && b().length() > 0 && c().length() > 0;
    }

    public final void f(String str) {
        this.c = str;
    }

    public final void g(String str) {
        this.b = str;
    }

    public final void h(String str) {
        this.a = str;
    }

    public final String toString() {
        return new Gson().toJson(this);
    }
}
