package com.github.catvod.spider.merge.F;

import android.text.TextUtils;
import com.github.catvod.spider.merge.A.T;
import com.github.catvod.spider.merge.b.j;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class C0116c {

    @SerializedName(alternate = {"id"}, value = "jump_id")
    private String a;

    @SerializedName(alternate = {"path"}, value = "thumbnail")
    private String b;

    @SerializedName("title")
    private String c;

    @SerializedName("mask")
    private String d;

    @SerializedName("description")
    private String e;

    @SerializedName("playlist")
    private C0115b f;

    @SerializedName("year")
    private C0115b g;

    @SerializedName("area")
    private C0115b h;

    @SerializedName("types")
    private List<C0115b> i;

    @SerializedName("actors")
    private List<C0115b> j;

    @SerializedName("directors")
    private List<C0115b> k;

    @SerializedName("btbo_downlist")
    private List<C0114a> l;

    public static String g(List list, boolean z) {
        String strA;
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0115b c0115b = (C0115b) it.next();
            if (z) {
                String str = c0115b.a() + "/{pg}";
                String strA2 = c0115b.a();
                String strA3 = c0115b.a();
                StringBuilder sb2 = new StringBuilder("[a=cr:{\"id\":\"");
                sb2.append(str);
                sb2.append("\",\"name\":\"");
                sb2.append(strA2);
                sb2.append("\"}/]");
                strA = T.h(sb2, strA3, "[/a]");
            } else {
                strA = c0115b.a();
            }
            sb.append(strA);
            sb.append(" ");
        }
        return com.github.catvod.spider.merge.o.d.g(sb.toString());
    }

    public final String a() {
        List<C0115b> list = this.j;
        return list == null ? "" : g(list, true);
    }

    public final String b() {
        C0115b c0115b = this.h;
        return c0115b == null ? "" : c0115b.a();
    }

    public final String c() {
        return TextUtils.isEmpty(this.e) ? "" : this.e.replace("\u3000", "");
    }

    public final String d() {
        List<C0115b> list = this.k;
        return list == null ? "" : g(list, true);
    }

    public final String e() {
        StringBuilder sb = new StringBuilder();
        List<C0114a> listEmptyList = this.l;
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        Iterator<C0114a> it = listEmptyList.iterator();
        while (it.hasNext()) {
            sb.append(it.next().a());
            sb.append("#");
        }
        return com.github.catvod.spider.merge.o.d.g(sb.toString());
    }

    public final String f() {
        List<C0115b> list = this.i;
        return list == null ? "" : g(list, false);
    }

    public final String h() {
        C0115b c0115b = this.g;
        return c0115b == null ? "" : c0115b.a();
    }

    public final j i() {
        String strA = "";
        String str = TextUtils.isEmpty(this.a) ? "" : this.a;
        String str2 = TextUtils.isEmpty(this.c) ? "" : this.c;
        String strH = TextUtils.isEmpty(this.b) ? "" : T.h(new StringBuilder(), this.b, "@Referer=www.jianpianapp.com@User-Agent=jianpian-version362");
        if (TextUtils.isEmpty(this.d)) {
            C0115b c0115b = this.f;
            if (c0115b != null) {
                strA = c0115b.a();
            }
        } else {
            strA = this.d;
        }
        return new j(str, str2, strH, strA);
    }
}
