package com.github.catvod.spider.merge.Q;

import android.text.TextUtils;
import com.github.catvod.spider.merge.K.VodItem;
import com.github.catvod.spider.merge.i0.m;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class d {

    @SerializedName("jump_id")
    private String a;

    @SerializedName("id")
    private String b;

    @SerializedName(alternate = {"path"}, value = "thumbnail")
    private String c;

    @SerializedName("title")
    private String d;

    @SerializedName("mask")
    private String e;

    @SerializedName("description")
    private String f;

    @SerializedName("playlist")
    private c g;

    @SerializedName("year")
    private String h;

    @SerializedName("area")
    private String i;

    @SerializedName("types")
    private List<c> j;

    @SerializedName("actors")
    private List<c> k;

    @SerializedName("directors")
    private List<c> l;

    @SerializedName("source_list_source")
    private List<b> m;

    @SerializedName("dataList")
    private List<d> n;

    public final String a() {
        List<c> list = this.k;
        return list == null ? "" : h(list, true);
    }

    public final String b() {
        String str = this.i;
        return str == null ? "" : str;
    }

    public final List<d> c() {
        List<d> list = this.n;
        return list == null ? Collections.emptyList() : list;
    }

    public final String d() {
        return TextUtils.isEmpty(this.f) ? "" : this.f.replace("\u3000", "");
    }

    public final String e() {
        List<c> list = this.l;
        return list == null ? "" : h(list, true);
    }

    public final String f(String str) {
        if (TextUtils.isEmpty(this.c)) {
            return "";
        }
        StringBuilder sbA = com.github.catvod.spider.merge.C1.a.a("http://", str);
        sbA.append(this.c);
        return sbA.toString();
    }

    public final String g() {
        List<c> list = this.j;
        return list == null ? "" : h(list, false);
    }

    public final String h(List<c> list, boolean z) {
        StringBuilder sb = new StringBuilder();
        Iterator<c> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next().c(z));
            sb.append(" ");
        }
        return m.B(sb.toString());
    }

    public final String i() {
        ArrayList arrayList = new ArrayList();
        List<b> listEmptyList = this.m;
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        Iterator<b> it = listEmptyList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().b());
        }
        return TextUtils.join("$$$", arrayList);
    }

    public final String j() {
        ArrayList arrayList = new ArrayList();
        List<b> listEmptyList = this.m;
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        for (b bVar : listEmptyList) {
            ArrayList arrayList2 = new ArrayList();
            for (a aVar : bVar.a()) {
                arrayList2.add(aVar.a() + "$" + aVar.b());
            }
            arrayList.add(TextUtils.join("#", arrayList2));
        }
        return TextUtils.join("$$$", arrayList);
    }

    public final String k() {
        String str = this.h;
        return str == null ? "" : str;
    }

    public final i l(String str) {
        return new i(TextUtils.isEmpty(this.a) ? "" : this.a, TextUtils.isEmpty(this.d) ? "" : this.d, f(str));
    }

    public final i m(String str) {
        String strB = "";
        String str2 = TextUtils.isEmpty(this.b) ? "" : this.b;
        String str3 = TextUtils.isEmpty(this.d) ? "" : this.d;
        String strF = f(str);
        if (TextUtils.isEmpty(this.e)) {
            c cVar = this.g;
            if (cVar != null) {
                strB = cVar.b();
            }
        } else {
            strB = this.e;
        }
        return new i(str2, str3, strF, strB);
    }
}
