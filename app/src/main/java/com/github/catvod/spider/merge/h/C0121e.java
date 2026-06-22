package com.github.catvod.spider.merge.h;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.h.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class C0121e {

    @SerializedName("videosGroup")
    private List<C0120d> a;

    @SerializedName("actor")
    private List<C0122f> b;

    @SerializedName("country")
    private String c;

    @SerializedName("desc")
    private String d;

    @SerializedName("director")
    private List<C0122f> e;

    @SerializedName("name")
    private String f;

    @SerializedName("picurl")
    private String g;

    @SerializedName("time")
    private String h;

    @SerializedName("countStr")
    private String i;

    public final List a() {
        List<C0122f> list = this.b;
        return list == null ? Collections.emptyList() : list;
    }

    public final String b() {
        return TextUtils.isEmpty(this.i) ? "" : this.i;
    }

    public final String c() {
        return TextUtils.isEmpty(this.c) ? "" : this.c;
    }

    public final String d() {
        return TextUtils.isEmpty(this.d) ? "" : this.d;
    }

    public final List e() {
        List<C0122f> list = this.e;
        return list == null ? Collections.emptyList() : list;
    }

    public final String f() {
        return TextUtils.isEmpty(this.f) ? "" : this.f;
    }

    public final String g() {
        return TextUtils.isEmpty(this.g) ? "" : this.g;
    }

    public final String h() {
        return TextUtils.isEmpty(this.h) ? "" : this.h;
    }

    public final List i() {
        List<C0120d> list = this.a;
        return list == null ? Collections.emptyList() : list;
    }
}
