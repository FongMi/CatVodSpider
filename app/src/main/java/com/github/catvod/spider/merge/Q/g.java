package com.github.catvod.spider.merge.Q;

import android.text.TextUtils;
import com.github.catvod.bean.VodItem;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class g {

    @SerializedName("data")
    private List<g> a;

    @SerializedName("id")
    private String b;

    @SerializedName(alternate = {"path"}, value = "thumbnail")
    private String c;

    @SerializedName("title")
    private String d;

    @SerializedName("mask")
    private String e;

    public final List<g> a() {
        List<g> list = this.a;
        return list == null ? Collections.emptyList() : list;
    }

    public final i b(String str) {
        String string;
        String str2 = TextUtils.isEmpty(this.b) ? "" : this.b;
        String str3 = TextUtils.isEmpty(this.d) ? "" : this.d;
        if (TextUtils.isEmpty(this.c)) {
            string = "";
        } else {
            StringBuilder sbA = com.github.catvod.spider.merge.C1.a.a("http://", str);
            sbA.append(this.c);
            string = sbA.toString();
        }
        return new i(str2, str3, string, TextUtils.isEmpty(this.e) ? "" : this.e);
    }
}
