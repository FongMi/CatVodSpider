package com.github.catvod.spider.merge.O;

import android.text.TextUtils;
import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.d1.F;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class g {

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

    public static List<g> a(JsonElement jsonElement) {
        return (List) new Gson().fromJson(jsonElement, new f().getType());
    }

    public final String b() {
        return TextUtils.isEmpty(this.d) ? "" : this.d;
    }

    public final com.github.catvod.spider.merge.K.VodItem c() {
        String strB;
        com.github.catvod.spider.merge.K.VodItem iVar = new com.github.catvod.spider.merge.K.VodItem();
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.isEmpty(this.a) ? "" : this.a);
        sb.append("@");
        sb.append(TextUtils.isEmpty(this.b) ? "" : this.b);
        iVar.l(sb.toString());
        iVar.m(F.d(TextUtils.isEmpty(this.c) ? "" : this.c).s0());
        StringBuilder sb2 = new StringBuilder();
        sb2.append((TextUtils.isEmpty(this.e) ? "" : this.e).split(":")[0]);
        sb2.append("分鐘");
        iVar.q(sb2.toString());
        if (b().startsWith("//")) {
            StringBuilder sbB = t0.b("https:");
            sbB.append(b());
            strB = sbB.toString();
        } else {
            strB = b();
        }
        iVar.n(strB);
        return iVar;
    }
}
