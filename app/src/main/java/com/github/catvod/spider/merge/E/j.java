package com.github.catvod.spider.merge.e;

import android.net.Uri;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class j {
    public final int[] a = {46, 47, 18, 2, 53, 8, 23, 32, 15, 50, 10, 31, 58, 3, 45, 35, 27, 43, 5, 49, 33, 9, 42, 19, 29, 28, 14, 39, 12, 38, 41, 13, 37, 48, 7, 16, 24, 55, 40, 61, 26, 17, 0, 1, 60, 51, 30, 4, 22, 25, 54, 21, 56, 59, 6, 63, 57, 62, 11, 36, 20, 34, 44, 52};

    @SerializedName("img_url")
    private String b;

    @SerializedName("sub_url")
    private String c;

    public final String a(LinkedHashMap linkedHashMap) {
        String lowerCase = "";
        String str = Uri.parse(TextUtils.isEmpty(this.b) ? "" : this.b).getLastPathSegment().split("\\.")[0];
        String str2 = str + Uri.parse(TextUtils.isEmpty(this.c) ? "" : this.c).getLastPathSegment().split("\\.")[0];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            sb.append(str2.charAt(this.a[i]));
        }
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        linkedHashMap.put("wts", Long.valueOf(System.currentTimeMillis() / 1000));
        for (String str3 : linkedHashMap.keySet()) {
            sb2.append(str3);
            sb2.append("=");
            sb2.append(URLEncoder.encode(linkedHashMap.get(str3).toString()));
            sb2.append("&");
        }
        String strG = com.github.catvod.spider.merge.o.d.g(sb2.toString());
        try {
            StringBuilder sb3 = new StringBuilder(new BigInteger(1, MessageDigest.getInstance("MD5").digest((strG + string).getBytes("UTF-8"))).toString(16));
            while (sb3.length() < 32) {
                sb3.insert(0, "0");
            }
            lowerCase = sb3.toString().toLowerCase();
        } catch (Exception unused) {
        }
        return strG + "&w_rid=" + lowerCase;
    }
}
