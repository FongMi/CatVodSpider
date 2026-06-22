package com.github.catvod.spider.merge.e;

import android.text.TextUtils;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.c.k;
import com.github.catvod.spider.merge.p.C0207D;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.e.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0154c {

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

    public static List<C0154c> a(String str) {
        return (List) new Gson().fromJson(str, new C0153b().getType());
    }

    public final Date b() {
        try {
            return new SimpleDateFormat(C0098a.a(new byte[]{-45, -108, -46, -33, 98, 32, -54, -36, -50, -119, -116, -14, 104, 37, -49, -53, -57, -128, -111, -43, 60, 67, -44, -94, -7, -73}, new byte[]{-86, -19, -85, -90, 79, 109, -121, -15}), Locale.getDefault()).parse(this.g);
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
        if (!this.f.startsWith(C0098a.a(new byte[]{13, 93}, new byte[]{34, 114, -90, 93, 4, -8, -86, -39}))) {
            return this.f;
        }
        return C0098a.a(new byte[]{-83, -76, -50, -83, 44}, new byte[]{-59, -64, -70, -35, 22, 126, 39, 5}) + this.f;
    }

    public final k g(C0152a c0152a, String str) {
        return new k(i(c0152a.h()), c(), d(str), c0152a.h(), k());
    }

    public final k h(String str, String str2) {
        return new k(i(str), c(), d(str2), C0207D.i(this.d), k());
    }

    public final String i(String str) {
        StringBuilder sbC = C0133t.c(str);
        sbC.append(TextUtils.isEmpty(this.b) ? "" : this.b);
        sbC.append(C0098a.a(new byte[]{-9}, new byte[]{-40, 31, -14, 8, -76, -46, -109, 71}));
        sbC.append(c());
        return sbC.toString();
    }

    public final boolean j(boolean z) {
        if (!c().endsWith(C0098a.a(new byte[]{90, -33, 43}, new byte[]{116, -85, 88, 85, 5, 9, 93, -45})) && !c().endsWith(C0098a.a(new byte[]{93, -75, 64, 75}, new byte[]{115, -40, 48, 44, 59, -116, 76, -53}))) {
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
        if (!c().endsWith(C0098a.a(new byte[]{-117, -29, 110}, new byte[]{-91, -105, 29, -91, -59, -66, -69, -99})) && !c().endsWith(C0098a.a(new byte[]{-32, 11, -14, -65}, new byte[]{-50, 102, -126, -40, 27, -61, -24, 110}))) {
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
