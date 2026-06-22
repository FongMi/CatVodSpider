package com.github.catvod.spider.merge.R;

import android.text.TextUtils;
import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.i0.m;
import com.github.catvod.spider.merge.l.C1290c;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class a implements Comparable<a> {

    @SerializedName("InfoList")
    private List<a> b;

    @SerializedName("shareKey")
    private String c;

    @SerializedName("FileId")
    private Long d;

    @SerializedName("FileName")
    private String e;

    @SerializedName("pdir_fid")
    private String f;

    @SerializedName("Type")
    private int g;

    @SerializedName("S3KeyFlag")
    private String h;

    @SerializedName("Category")
    private String i;

    @SerializedName("Size")
    private String j;

    @SerializedName("Etag")
    private String k;

    @SerializedName(alternate = {"big_thumbnail"}, value = "thumb")
    private String l;

    public final String a() {
        String string;
        String[] strArr = new String[4];
        strArr[0] = m.v(e());
        if (Long.parseLong(this.j) == 0) {
            string = "";
        } else {
            StringBuilder sbB = t0.b("[");
            sbB.append(m.n(Double.parseDouble(this.j)));
            sbB.append("]");
            string = sbB.toString();
        }
        strArr[1] = string;
        strArr[2] = TextUtils.isEmpty(this.f) ? "" : C1290c.b(t0.b("["), this.f, "]");
        strArr[3] = e();
        return TextUtils.join(" ", Arrays.asList(strArr)).trim();
    }

    public final String b() {
        return this.k;
    }

    public final Long c() {
        return this.d;
    }

    @Override // java.lang.Comparable
    public final int compareTo(a aVar) {
        return h().compareTo(aVar.h());
    }

    public final List<a> d() {
        List<a> list = this.b;
        return list == null ? Collections.emptyList() : list;
    }

    public final String e() {
        return TextUtils.isEmpty(this.e) ? "" : m.y(this.e);
    }

    public final String f() {
        return this.h;
    }

    public final String g() {
        return String.valueOf(this.j);
    }

    public final String h() {
        return m.v(e());
    }

    public final String i() {
        return this.g == 1 ? "folder" : "file";
    }
}
