package com.github.catvod.spider.merge.O;

import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.i0.m;
import com.github.catvod.spider.merge.l.C1290c;
import com.google.gson.annotations.SerializedName;
import java.net.URLEncoder;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class j {
    private final int[] a = {46, 47, 18, 2, 53, 8, 23, 32, 15, 50, 10, 31, 58, 3, 45, 35, 27, 43, 5, 49, 33, 9, 42, 19, 29, 28, 14, 39, 12, 38, 41, 13, 37, 48, 7, 16, 24, 55, 40, 61, 26, 17, 0, 1, 60, 51, 30, 4, 22, 25, 54, 21, 56, 59, 6, 63, 57, 62, 11, 36, 20, 34, 44, 52};

    @SerializedName("img_url")
    private String b;

    @SerializedName("sub_url")
    private String c;

    public final String a() {
        return TextUtils.isEmpty(this.b) ? "" : this.b;
    }

    public final String b(LinkedHashMap<String, Object> linkedHashMap) {
        String strA = C1290c.a(Uri.parse(TextUtils.isEmpty(this.b) ? "" : this.b).getLastPathSegment().split("\\.")[0], Uri.parse(TextUtils.isEmpty(this.c) ? "" : this.c).getLastPathSegment().split("\\.")[0]);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            sb.append(strA.charAt(this.a[i]));
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
        String strB = m.B(sb2.toString());
        return t0.a(strB, "&w_rid=", m.c(strB + string));
    }
}
