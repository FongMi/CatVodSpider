package com.github.catvod.spider.merge.FM.g;

import android.text.TextUtils;
import com.github.catvod.spider.merge.FM.L.F;
import com.github.catvod.spider.merge.FM.c.C0332j;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.g.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0351g {

    @SerializedName("bvid")
    private String a;

    @SerializedName("aid")
    private String b;

    @SerializedName("title")
    private String c;

    @SerializedName("pic")
    private String d;

    @SerializedName("duration")
    private String e;

    @SerializedName("length")
    private String f;

    public static List<C0351g> a(JsonElement jsonElement) {
        return (List) new Gson().fromJson(jsonElement, new C0350f().getType());
    }

    public final String b() {
        return TextUtils.isEmpty(this.d) ? "" : this.d;
    }

    public final C0332j c() {
        String strB;
        StringBuilder sb;
        String str;
        C0332j c0332j = new C0332j();
        StringBuilder sb2 = new StringBuilder();
        String string = "";
        sb2.append(TextUtils.isEmpty(this.a) ? "" : this.a);
        sb2.append("@");
        sb2.append(TextUtils.isEmpty(this.b) ? "" : this.b);
        c0332j.g(sb2.toString());
        c0332j.h(F.d(TextUtils.isEmpty(this.c) ? "" : this.c).v0());
        if (b().startsWith("//")) {
            strB = "https:" + b();
        } else {
            strB = b();
        }
        c0332j.i(strB);
        if (!TextUtils.isEmpty(this.e)) {
            if (this.e.contains(":")) {
                sb = new StringBuilder();
                sb.append(this.e.split(":")[0]);
                str = "分鐘";
            } else if (Integer.parseInt(this.e) < 60) {
                sb = new StringBuilder();
                sb.append(this.e);
                str = "秒";
            } else {
                sb = new StringBuilder();
                sb.append(Integer.parseInt(this.e) / 60);
                str = "分鐘";
            }
            sb.append(str);
            string = sb.toString();
        } else if (!TextUtils.isEmpty(this.f)) {
            string = this.f;
        }
        c0332j.l(string);
        return c0332j;
    }
}
