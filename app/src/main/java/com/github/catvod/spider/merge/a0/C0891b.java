package com.github.catvod.spider.merge.a0;

import android.text.TextUtils;
import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.i0.m;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.a0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0891b {

    @SerializedName("id")
    public String a;

    @SerializedName("name")
    public String b;

    @SerializedName("coType")
    public int c;

    @SerializedName("coSuffix")
    public String d;

    @SerializedName("size")
    public long e;

    @SerializedName("udTime")
    public String f;

    @SerializedName("thumbnailURL")
    public String g;

    @SerializedName("bthumbnailURL")
    public String h;

    @SerializedName("presentURL")
    public String i;

    @SerializedName("presentLURL")
    public String j;

    @SerializedName("presentHURL")
    public String k;

    @SerializedName("safestate")
    public int l;

    @SerializedName("auditResult")
    public int m;

    @SerializedName("flvState")
    public Object n;

    @SerializedName("dlTimes")
    public int o;

    @SerializedName("path")
    public String p;

    @SerializedName("cdnDownLoadUrl")
    public Object q;

    @SerializedName("ifCdn")
    public Object r;

    @SerializedName("extInfo")
    public C0893d s;

    @SerializedName("illegalType")
    public Object t;

    @SerializedName("illegalResult")
    public Object u;

    public final String a() {
        return m.y(this.b);
    }

    public final String b() {
        StringBuilder sbB = t0.b("[");
        sbB.append(m.n(this.e));
        sbB.append("]");
        return TextUtils.join(" ", Arrays.asList(m.v(a()), sbB.toString(), a(), "")).trim();
    }
}
