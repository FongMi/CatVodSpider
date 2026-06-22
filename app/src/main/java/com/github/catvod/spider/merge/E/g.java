package com.github.catvod.spider.merge.e;

import android.text.TextUtils;
import com.github.catvod.spider.merge.A.T;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class g {

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

    public static List a(JsonElement jsonElement) {
        return (List) new Gson().fromJson(jsonElement, new f().getType());
    }

    public final com.github.catvod.spider.merge.b.j b() {
        String string;
        StringBuilder sb;
        String str;
        com.github.catvod.spider.merge.b.j jVar = new com.github.catvod.spider.merge.b.j();
        StringBuilder sb2 = new StringBuilder();
        String strH = "";
        sb2.append(TextUtils.isEmpty(this.a) ? "" : this.a);
        sb2.append("@");
        sb2.append(TextUtils.isEmpty(this.b) ? "" : this.b);
        jVar.g(sb2.toString());
        jVar.h(com.github.catvod.spider.merge.R.e.a(TextUtils.isEmpty(this.c) ? "" : this.c).O());
        if ((TextUtils.isEmpty(this.d) ? "" : this.d).startsWith("//")) {
            StringBuilder sb3 = new StringBuilder("https:");
            sb3.append(TextUtils.isEmpty(this.d) ? "" : this.d);
            string = sb3.toString();
        } else {
            string = TextUtils.isEmpty(this.d) ? "" : this.d;
        }
        jVar.i(string);
        if (!TextUtils.isEmpty(this.e)) {
            String str2 = "分鐘";
            if (this.e.contains(":")) {
                sb = new StringBuilder();
                str = this.e.split(":")[0];
            } else if (Integer.parseInt(this.e) < 60) {
                sb = new StringBuilder();
                str = this.e;
                str2 = "秒";
            } else {
                strH = (Integer.parseInt(this.e) / 60) + "分鐘";
            }
            strH = T.h(sb, str, str2);
        } else if (!TextUtils.isEmpty(this.f)) {
            strH = this.f;
        }
        jVar.l(strH);
        return jVar;
    }
}
