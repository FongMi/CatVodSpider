package com.github.catvod.spider.merge.FM.e;

import android.text.TextUtils;
import com.github.catvod.spider.merge.FM.L.P;
import com.github.catvod.spider.merge.FM.c.C0332j;
import com.github.catvod.spider.merge.FM.o.z;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class c {

    @SerializedName("name")
    private String a;

    @SerializedName(alternate = {"parent"}, value = "path")
    private String b;

    @SerializedName("type")
    private int c;

    @SerializedName("size")
    private long d;

    @SerializedName(alternate = {"thumbnail"}, value = "thumb")
    private String e;

    @SerializedName(alternate = {"raw_url"}, value = "url")
    private String f;

    @SerializedName(alternate = {"updated_at"}, value = "modified")
    private String g;

    public static List<c> a(String str) {
        return (List) new Gson().fromJson(str, new b().getType());
    }

    public final Date b() {
        try {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault()).parse(this.g);
        } catch (Exception unused) {
            return new Date();
        }
    }

    public final String c() {
        return TextUtils.isEmpty(this.a) ? "" : this.a;
    }

    public final String d(String str) {
        return ((TextUtils.isEmpty(this.e) ? "" : this.e).isEmpty() && k()) ? str : TextUtils.isEmpty(this.e) ? "" : this.e;
    }

    public final long e() {
        return this.d;
    }

    public final String f() {
        if (TextUtils.isEmpty(this.f)) {
            return "";
        }
        if (!this.f.startsWith("//")) {
            return this.f;
        }
        return "http:" + this.f;
    }

    public final C0332j g(C0342a c0342a, String str) {
        return new C0332j(i(c0342a.h()), c(), d(str), c0342a.h(), k());
    }

    public final C0332j h(String str, String str2) {
        return new C0332j(i(str), c(), d(str2), z.g(this.d), k());
    }

    public final String i(String str) {
        StringBuilder sbB = P.b(str);
        sbB.append(TextUtils.isEmpty(this.b) ? "" : this.b);
        sbB.append("/");
        sbB.append(c());
        return sbB.toString();
    }

    public final boolean j(boolean z) {
        if (!c().endsWith(".ts") && !c().endsWith(".mpg")) {
            if (z) {
                int i = this.c;
                return i == 0 || i == 4;
            }
            int i2 = this.c;
            if (i2 == 0 || i2 == 2 || i2 == 5) {
                return true;
            }
        }
        return false;
    }

    public final boolean k() {
        return this.c == 1;
    }

    public final boolean l(boolean z) {
        if (!c().endsWith(".ts") && !c().endsWith(".mpg")) {
            if (z) {
                int i = this.c;
                return i == 2 || i == 3;
            }
            int i2 = this.c;
            if (i2 != 3 && i2 != 4) {
                return false;
            }
        }
        return true;
    }

    public final void m(String str) {
        this.a = str;
    }

    public final void n(String str) {
        this.b = str;
    }

    public final void o(String str) {
        this.e = str;
    }

    public final void p(int i) {
        this.c = i;
    }
}
