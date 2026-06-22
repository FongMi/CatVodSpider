package com.github.catvod.spider.merge.g;

import android.text.TextUtils;
import com.github.catvod.spider.merge.M.F;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.c.k;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0165g {

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

    public static List<C0165g> a(JsonElement jsonElement) {
        return (List) new Gson().fromJson(jsonElement, new C0164f().getType());
    }

    public final String b() {
        return TextUtils.isEmpty(this.d) ? "" : this.d;
    }

    public final k c() {
        String strB;
        StringBuilder sb;
        String strA;
        k kVar = new k();
        StringBuilder sb2 = new StringBuilder();
        String string = "";
        sb2.append(TextUtils.isEmpty(this.a) ? "" : this.a);
        sb2.append(C0098a.a(new byte[]{-124}, new byte[]{-60, -93, -47, -80, 75, -13, -54, -73}));
        sb2.append(TextUtils.isEmpty(this.b) ? "" : this.b);
        kVar.g(sb2.toString());
        kVar.h(F.d(TextUtils.isEmpty(this.c) ? "" : this.c).v0());
        if (b().startsWith(C0098a.a(new byte[]{-60, 52}, new byte[]{-21, 27, 82, -29, 72, 41, -55, 44}))) {
            strB = C0098a.a(new byte[]{0, 72, -114, 68, -31, -115}, new byte[]{104, 60, -6, 52, -110, -73, 33, 31}) + b();
        } else {
            strB = b();
        }
        kVar.i(strB);
        if (!TextUtils.isEmpty(this.e)) {
            if (this.e.contains(C0098a.a(new byte[]{-62}, new byte[]{-8, -79, -31, 64, 101, -26, -112, 52}))) {
                sb = new StringBuilder();
                sb.append(this.e.split(C0098a.a(new byte[]{11}, new byte[]{49, -26, -38, 83, 38, 93, 89, 25}))[0]);
                strA = C0098a.a(new byte[]{29, -105, -43, -72, -108, -52}, new byte[]{-8, 31, 83, 81, 4, 84, -112, 55});
            } else if (Integer.parseInt(this.e) < 60) {
                sb = new StringBuilder();
                sb.append(this.e);
                strA = C0098a.a(new byte[]{-75, 9, -2}, new byte[]{82, -82, 108, -109, 101, -27, -31, 56});
            } else {
                sb = new StringBuilder();
                sb.append(Integer.parseInt(this.e) / 60);
                strA = C0098a.a(new byte[]{-105, -61, -92, -6, 100, -70}, new byte[]{114, 75, 34, 19, -12, 34, -63, 86});
            }
            sb.append(strA);
            string = sb.toString();
        } else if (!TextUtils.isEmpty(this.f)) {
            string = this.f;
        }
        kVar.l(string);
        return kVar;
    }
}
