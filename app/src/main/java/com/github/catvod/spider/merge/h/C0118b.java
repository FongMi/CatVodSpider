package com.github.catvod.spider.merge.h;

import android.text.TextUtils;
import com.github.catvod.spider.merge.b.j;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.h.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class C0118b {

    @SerializedName("name")
    private String a;

    @SerializedName(alternate = {"picurl"}, value = "img")
    private String b;

    @SerializedName("id")
    private String c;

    @SerializedName("countStr")
    private String d;

    @SerializedName("url")
    private String e;

    @SerializedName("cards")
    private List<C0118b> f;

    public static List a(String str) {
        return (List) new Gson().fromJson(str, new C0117a().getType());
    }

    public final List b() {
        List<C0118b> list = this.f;
        return list == null ? Collections.emptyList() : list;
    }

    public final String c() {
        return TextUtils.isEmpty(this.a) ? "" : this.a;
    }

    public final j d() {
        return new j(TextUtils.isEmpty(this.c) ? "" : this.c, c(), TextUtils.isEmpty(this.b) ? "" : this.b, TextUtils.isEmpty(this.d) ? "" : this.d);
    }
}
