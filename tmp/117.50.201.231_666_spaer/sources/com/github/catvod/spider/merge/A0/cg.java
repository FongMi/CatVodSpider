package com.github.catvod.spider.merge.A0;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class cg {

    @ni("name")
    private String p;

    @ni(alternate = {"parent"}, value = "path")
    private String q;

    @ni("type")
    private int r;

    @ni("size")
    private long s;

    @ni(alternate = {"thumbnail"}, value = "thumb")
    private String t;

    @ni(alternate = {"raw_url"}, value = "url")
    private String u;

    @ni(alternate = {"updated_at"}, value = "modified")
    private String v;

    public static List a(String str) {
        return (List) new oa().y(str, new fj(new zh().b));
    }

    public final Date b() {
        try {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault()).parse(this.v);
        } catch (Exception unused) {
            return new Date();
        }
    }

    public final String c() {
        return TextUtils.isEmpty(this.p) ? "" : this.p;
    }

    public final long d() {
        return this.s;
    }

    public final String e() {
        if (TextUtils.isEmpty(this.u)) {
            return "";
        }
        if (!this.u.startsWith("//")) {
            return this.u;
        }
        return "http:" + this.u;
    }

    public final wo f(mr mrVar, String str) {
        String strH = h(mrVar.g());
        String strC = c();
        if (!(TextUtils.isEmpty(this.t) ? "" : this.t).isEmpty() || !j()) {
            str = TextUtils.isEmpty(this.t) ? "" : this.t;
        }
        return new wo(strH, strC, str, mrVar.g(), j());
    }

    public final wo g(String str, String str2) {
        String str3;
        String strH = h(str);
        String strC = c();
        if (!(TextUtils.isEmpty(this.t) ? "" : this.t).isEmpty() || !j()) {
            str2 = TextUtils.isEmpty(this.t) ? "" : this.t;
        }
        String str4 = str2;
        double d = this.s;
        List list = wh.a;
        if (d <= 0.0d) {
            str3 = "";
        } else {
            str3 = d > 1.099511627776E12d ? String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d / 1.099511627776E12d), "TB") : d > 1.073741824E9d ? String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d / 1.073741824E9d), "GB") : d > 1048576.0d ? String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d / 1048576.0d), "MB") : String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d / 1024.0d), "KB");
        }
        return new wo(strH, strC, str4, str3, j());
    }

    public final String h(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(TextUtils.isEmpty(this.q) ? "" : this.q);
        sb.append("/");
        sb.append(c());
        return sb.toString();
    }

    public final boolean i(boolean z) {
        if (c().endsWith(".ts") || c().endsWith(".mpg")) {
            return false;
        }
        if (z) {
            int i = this.r;
            return i == 0 || i == 4;
        }
        int i2 = this.r;
        return i2 == 0 || i2 == 2 || i2 == 5;
    }

    public final boolean j() {
        return this.r == 1;
    }

    public final boolean k(boolean z) {
        if (c().endsWith(".ts") || c().endsWith(".mpg")) {
            return true;
        }
        if (z) {
            int i = this.r;
            return i == 2 || i == 3;
        }
        int i2 = this.r;
        return i2 == 3 || i2 == 4;
    }

    public final void l(String str) {
        this.p = str;
    }

    public final void m(String str) {
        this.q = str;
    }

    public final void n(String str) {
        this.t = str;
    }

    public final void o(int i) {
        this.r = i;
    }
}
