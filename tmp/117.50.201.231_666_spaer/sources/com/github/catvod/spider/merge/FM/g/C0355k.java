package com.github.catvod.spider.merge.FM.g;

import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.spider.merge.FM.L.P;
import com.github.catvod.spider.merge.FM.b.r;
import com.github.catvod.spider.merge.FM.o.z;
import com.google.gson.annotations.SerializedName;
import java.net.URLEncoder;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.g.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0355k {
    private final int[] a = {46, 47, 18, 2, 53, 8, 23, 32, 15, 50, 10, 31, 58, 3, 45, 35, 27, 43, 5, 49, 33, 9, 42, 19, 29, 28, 14, 39, 12, 38, 41, 13, 37, 48, 7, 16, 24, 55, 40, 61, 26, 17, 0, 1, 60, 51, 30, 4, 22, 25, 54, 21, 56, 59, 6, 63, 57, 62, 11, 36, 20, 34, 44, 52};

    @SerializedName("img_url")
    private String b;

    @SerializedName("sub_url")
    private String c;

    public final String a(LinkedHashMap<String, Object> linkedHashMap) {
        String strB = C0354j.b(Uri.parse(TextUtils.isEmpty(this.b) ? "" : this.b).getLastPathSegment().split("\\.")[0], Uri.parse(TextUtils.isEmpty(this.c) ? "" : this.c).getLastPathSegment().split("\\.")[0]);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            sb.append(strB.charAt(this.a[i]));
        }
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        linkedHashMap.put("wts", Long.valueOf(System.currentTimeMillis() / 1000));
        for (String str : linkedHashMap.keySet()) {
            sb2.append(str);
            sb2.append("=");
            sb2.append(URLEncoder.encode(linkedHashMap.get(str).toString()));
            sb2.append("&");
        }
        String strQ = z.q(sb2.toString());
        return r.b(new byte[]{10, 36, -106, -82, -43, -48, -108}, new byte[]{44, 83, -55, -36, -68, -76, -87, -3}, P.b(strQ), z.a(strQ + string));
    }
}
