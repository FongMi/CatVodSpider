package com.github.catvod.spider.merge.ka;

import android.text.TextUtils;
import com.github.catvod.spider.merge.dp.n;
import com.github.catvod.spider.merge.nz.o;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class e {

    @SerializedName("items")
    private List<e> a;

    @SerializedName("next_marker")
    private String b;

    @SerializedName("file_id")
    private String c;

    @SerializedName("share_id")
    private String d;

    @SerializedName("name")
    private String e;

    @SerializedName("type")
    private String f;

    @SerializedName("file_extension")
    private String g;

    @SerializedName("category")
    private String h;

    @SerializedName("size")
    private double i;

    @SerializedName("parent")
    private String j;

    public e(String str) {
        this.c = str;
    }

    public final String a() {
        return TextUtils.isEmpty(this.h) ? "" : this.h;
    }

    public final String b() {
        String[] strArr = new String[3];
        String string = "";
        strArr[0] = TextUtils.isEmpty(this.j) ? "" : n.b(d.b("["), this.j, "]");
        strArr[1] = f();
        if (this.i != 0.0d) {
            StringBuilder sbB = d.b("[");
            sbB.append(o.c(this.i));
            sbB.append("]");
            string = sbB.toString();
        }
        strArr[2] = string;
        return TextUtils.join(" ", Arrays.asList(strArr)).trim();
    }

    public final String c() {
        return TextUtils.isEmpty(this.g) ? "" : this.g;
    }

    public final String d() {
        return TextUtils.isEmpty(this.c) ? "" : this.c;
    }

    public final List<e> e() {
        List<e> list = this.a;
        return list == null ? Collections.emptyList() : list;
    }

    public final String f() {
        return TextUtils.isEmpty(this.e) ? "" : this.e;
    }

    public final String g() {
        return TextUtils.isEmpty(this.b) ? "" : this.b;
    }

    public final String h() {
        return TextUtils.isEmpty(this.f) ? "" : this.f;
    }

    public final e i(String str) {
        this.j = str;
        return this;
    }
}
