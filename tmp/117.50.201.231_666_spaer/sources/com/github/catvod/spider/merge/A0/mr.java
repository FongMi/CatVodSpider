package com.github.catvod.spider.merge.A0;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class mr {

    @ni("drives")
    private List<mr> o;

    @ni("params")
    private List<zw> p;

    @ni("login")
    private ar q;

    @ni("vodPic")
    private String r;

    @ni("name")
    private String s;

    @ni("server")
    private String t;

    @ni("version")
    private int u;

    @ni("path")
    private String v;

    @ni("token")
    private String w;

    @ni("search")
    private Boolean x;

    @ni("hidden")
    private Boolean y;

    public mr(String str) {
        this.s = str;
    }

    public final void a() {
        if (this.v == null) {
            String path = Uri.parse(TextUtils.isEmpty(this.t) ? "" : this.t).getPath();
            this.v = TextUtils.isEmpty(path) ? "" : path;
        }
        if (this.u == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(e());
            sb.append("/api/public/settings");
            this.u = yi.k(sb.toString(), null).contains("v2.") ? 2 : 3;
        }
    }

    public final String b(String str) {
        List<zw> arrayList = this.p;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        for (zw zwVar : arrayList) {
            if (str.startsWith(zwVar.b())) {
                return zwVar.a();
            }
        }
        return "";
    }

    public final List c() {
        List<mr> list = this.o;
        return list == null ? new ArrayList() : list;
    }

    public final HashMap d() {
        HashMap mapF = wb.f("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Safari/537.36");
        if (!(TextUtils.isEmpty(this.w) ? "" : this.w).isEmpty()) {
            mapF.put("Authorization", this.w);
        }
        return mapF;
    }

    public final String e() {
        return (TextUtils.isEmpty(this.t) ? "" : this.t).replace(h(), "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mr) {
            return g().equals(((mr) obj).g());
        }
        return false;
    }

    public final ar f() {
        return this.q;
    }

    public final String g() {
        return TextUtils.isEmpty(this.s) ? "" : this.s;
    }

    public final String h() {
        return TextUtils.isEmpty(this.v) ? "" : this.v;
    }

    public final String i() {
        return TextUtils.isEmpty(this.r) ? "https://x.imgs.ovh/x/2023/09/05/64f680bb030b4.png" : this.r;
    }

    public final Boolean j() {
        Boolean bool = this.y;
        return Boolean.valueOf(bool != null && bool.booleanValue());
    }

    public final boolean k() {
        return this.u == 3;
    }

    public final String l(String str) {
        if (!k()) {
            HashMap map = new HashMap();
            map.put("keyword", str);
            map.put("path", "/");
            return new oa().ad(map);
        }
        HashMap mapF = wb.f("keywords", str);
        mapF.put("page", 1);
        mapF.put("parent", "/");
        mapF.put("per_page", 100);
        return new oa().ad(mapF);
    }

    public final Boolean m() {
        Boolean bool = this.x;
        return Boolean.valueOf(bool == null || bool.booleanValue());
    }

    public final void n(String str) {
        this.w = str;
    }
}
