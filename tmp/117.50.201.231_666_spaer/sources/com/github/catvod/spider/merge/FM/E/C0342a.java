package com.github.catvod.spider.merge.FM.e;

import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.spider.merge.FM.m.C0378c;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.e.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0342a {

    @SerializedName("drives")
    private List<C0342a> a;

    @SerializedName("params")
    private List<e> b;

    @SerializedName("login")
    private d c;

    @SerializedName("vodPic")
    private String d;

    @SerializedName("name")
    private final String e;

    @SerializedName("server")
    private String f;

    @SerializedName("version")
    private int g;

    @SerializedName("path")
    private String h;

    @SerializedName("token")
    private String i;

    @SerializedName("search")
    private Boolean j;

    @SerializedName("hidden")
    private Boolean k;

    public C0342a(String str) {
        this.e = str;
    }

    public final C0342a a() {
        if (this.h == null) {
            String path = Uri.parse(TextUtils.isEmpty(this.f) ? "" : this.f).getPath();
            this.h = TextUtils.isEmpty(path) ? "" : path;
        }
        if (this.g == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(f());
            sb.append("/api/public/settings");
            this.g = C0378c.n(sb.toString(), null).contains("v2.") ? 2 : 3;
        }
        return this;
    }

    public final String b(String str) {
        List<e> arrayList = this.b;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        for (e eVar : arrayList) {
            if (str.startsWith(eVar.b())) {
                return eVar.a();
            }
        }
        return "";
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        sb.append(f());
        sb.append(l() ? "/api/fs/get" : "/api/public/path");
        return sb.toString();
    }

    public final List<C0342a> d() {
        List<C0342a> list = this.a;
        return list == null ? new ArrayList() : list;
    }

    public final HashMap<String, String> e() {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
        if (!(TextUtils.isEmpty(this.i) ? "" : this.i).isEmpty()) {
            map.put("Authorization", this.i);
        }
        return map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0342a) {
            return h().equals(((C0342a) obj).h());
        }
        return false;
    }

    public final String f() {
        return (TextUtils.isEmpty(this.f) ? "" : this.f).replace(i(), "");
    }

    public final d g() {
        return this.c;
    }

    public final String h() {
        return TextUtils.isEmpty(this.e) ? "" : this.e;
    }

    public final String i() {
        return TextUtils.isEmpty(this.h) ? "" : this.h;
    }

    public final String j() {
        return TextUtils.isEmpty(this.d) ? "https://x.imgs.ovh/x/2023/09/05/64f680bb030b4.png" : this.d;
    }

    public final Boolean k() {
        Boolean bool = this.k;
        return Boolean.valueOf(bool != null && bool.booleanValue());
    }

    public final boolean l() {
        return this.g == 3;
    }

    public final String m() {
        StringBuilder sb = new StringBuilder();
        sb.append(f());
        sb.append(l() ? "/api/fs/list" : "/api/public/path");
        return sb.toString();
    }

    public final String n(String str) {
        HashMap map;
        Gson gson;
        if (l()) {
            map = new HashMap();
            map.put("keywords", str);
            map.put("page", 1);
            map.put("parent", "/");
            map.put("per_page", 100);
            gson = new Gson();
        } else {
            map = new HashMap();
            map.put("keyword", str);
            map.put("path", "/");
            gson = new Gson();
        }
        return gson.toJson(map);
    }

    public final Boolean o() {
        Boolean bool = this.j;
        return Boolean.valueOf(bool == null || bool.booleanValue());
    }

    public final String p() {
        StringBuilder sb = new StringBuilder();
        sb.append(f());
        sb.append(l() ? "/api/fs/search" : "/api/public/search");
        return sb.toString();
    }

    public final void q(String str) {
        this.i = str;
    }
}
