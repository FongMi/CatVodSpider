package com.github.catvod.spider.merge.h;

import android.text.TextUtils;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.c.k;
import com.github.catvod.spider.merge.oZP;
import com.github.catvod.spider.merge.p.C0207D;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.h.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0173e {

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
    private C0172d g;

    @SerializedName("year")
    private String h;

    @SerializedName("area")
    private String i;

    @SerializedName("types")
    private List<C0172d> j;

    @SerializedName("actors")
    private List<C0172d> k;

    @SerializedName("directors")
    private List<C0172d> l;

    @SerializedName("source_list_source")
    private List<C0171c> m;

    @SerializedName("dataList")
    private List<C0169a> n;

    public final String a() {
        List<C0172d> list = this.k;
        return list == null ? "" : h(list, true);
    }

    public final String b() {
        String str = this.i;
        return str == null ? "" : str;
    }

    public final List<C0169a> c() {
        List<C0169a> list = this.n;
        return list == null ? Collections.emptyList() : list;
    }

    public final String d() {
        return TextUtils.isEmpty(this.f) ? "" : this.f.replace(C0098a.a(new byte[]{-116, -59, 7}, new byte[]{111, 69, -121, -108, -110, 7, -44, -2}), "");
    }

    public final String e() {
        List<C0172d> list = this.l;
        return list == null ? "" : h(list, true);
    }

    public final String f() {
        if (TextUtils.isEmpty(this.c)) {
            return "";
        }
        return C0098a.a(new byte[]{67, 62, -90, -35, 117, -89, 49, 20, 66, 39, -75, -125, 100, -24, 127, 90, 88, 47, -4, -50, 105, -16}, new byte[]{43, 74, -46, -83, 6, -99, 30, 59}) + this.c;
    }

    public final String g() {
        List<C0172d> list = this.j;
        return list == null ? "" : h(list, false);
    }

    public final String h(List<C0172d> list, boolean z) {
        StringBuilder sb = new StringBuilder();
        Iterator<C0172d> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next().c(z));
            sb.append(oZP.d("55"));
        }
        return C0207D.s(sb.toString());
    }

    public final String i() {
        StringBuilder sb = new StringBuilder();
        List<C0171c> listEmptyList = this.m;
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        if (listEmptyList != null && !listEmptyList.isEmpty()) {
            int i = 0;
            while (true) {
                if (i >= listEmptyList.size()) {
                    break;
                }
                if (listEmptyList.get(i).a().equals(C0098a.a(new byte[]{-66, -111, -112, -18, -43, 39, -25, 44, -28, -63, -97, -87}, new byte[]{91, 41, 40, 6, 114, -93, 0, -106}))) {
                    sb.append(C0098a.a(new byte[]{34, -21, -128, 12, 18, -108, 12, -80, 92, -78, -113, 87}, new byte[]{-57, 91, 15, -21, -93, 39, -21, 57}));
                    break;
                }
                i++;
            }
        }
        return sb.toString();
    }

    public final String j() {
        StringBuilder sb = new StringBuilder();
        List<C0171c> listEmptyList = this.m;
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        if (listEmptyList != null && !listEmptyList.isEmpty()) {
            Iterator<C0171c> it = listEmptyList.iterator();
            while (it.hasNext()) {
                List<C0170b> listB = it.next().b();
                if (listB != null && !listB.isEmpty()) {
                    for (C0170b c0170b : listB) {
                        sb.append(c0170b.a());
                        sb.append(C0098a.a(new byte[]{-105}, new byte[]{-77, 82, -109, -10, 30, -100, -64, -77}));
                        sb.append(c0170b.b());
                        sb.append(C0098a.a(new byte[]{31}, new byte[]{60, 59, -2, 33, -80, 95, -7, 99}));
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    sb.append(C0098a.a(new byte[]{-10, -16, 88}, new byte[]{-46, -44, 124, 34, 81, 113, 91, 85}));
                }
            }
            if (sb.length() >= 3) {
                sb.delete(sb.length() - 3, sb.length());
            }
        }
        return sb.toString();
    }

    public final String k() {
        String str = this.h;
        return str == null ? "" : str;
    }

    public final k l() {
        return new k(TextUtils.isEmpty(this.a) ? "" : this.a, TextUtils.isEmpty(this.d) ? "" : this.d, f());
    }

    public final k m() {
        String strB = "";
        String str = TextUtils.isEmpty(this.b) ? "" : this.b;
        String str2 = TextUtils.isEmpty(this.d) ? "" : this.d;
        String strF = f();
        if (TextUtils.isEmpty(this.e)) {
            C0172d c0172d = this.g;
            if (c0172d != null) {
                strB = c0172d.b();
            }
        } else {
            strB = this.e;
        }
        return new k(str, str2, strF, strB);
    }
}
