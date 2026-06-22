package com.github.catvod.spider.merge.i;

import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.spider.merge.b.j;
import com.github.catvod.spider.merge.o.d;
import com.google.gson.annotations.SerializedName;
import com.thegrizzlylabs.sardineandroid.DavResource;
import com.thegrizzlylabs.sardineandroid.Sardine;
import com.thegrizzlylabs.sardineandroid.impl.OkHttpSardine;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.i.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class C0125a {

    @SerializedName("drives")
    private List<C0125a> a;

    @SerializedName("name")
    private String b;

    @SerializedName("server")
    private String c;

    @SerializedName("user")
    private String d;

    @SerializedName("pass")
    private String e;

    @SerializedName("path")
    private String f;

    @SerializedName("webdav")
    private Sardine g;

    public C0125a(String str) {
        this.b = str;
    }

    public final List a() {
        List<C0125a> list = this.a;
        return list == null ? new ArrayList() : list;
    }

    public final String b() {
        return (TextUtils.isEmpty(this.c) ? "" : this.c).replace(d(), "");
    }

    public final String c() {
        return TextUtils.isEmpty(this.b) ? "" : this.b;
    }

    public final String d() {
        return TextUtils.isEmpty(this.f) ? "" : this.f;
    }

    public final Sardine e() {
        if (this.g == null) {
            OkHttpSardine okHttpSardine = new OkHttpSardine();
            this.g = okHttpSardine;
            okHttpSardine.setCredentials(TextUtils.isEmpty(this.d) ? "" : this.d, TextUtils.isEmpty(this.e) ? "" : this.e);
            String path = Uri.parse(TextUtils.isEmpty(this.c) ? "" : this.c).getPath();
            this.f = TextUtils.isEmpty(path) ? "" : path;
        }
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0125a) {
            return c().equals(((C0125a) obj).c());
        }
        return false;
    }

    public final j f(DavResource davResource, String str) {
        return new j(c() + davResource.getPath(), davResource.getName(), str, d.c(davResource.getContentLength().longValue()), davResource.isDirectory());
    }
}
