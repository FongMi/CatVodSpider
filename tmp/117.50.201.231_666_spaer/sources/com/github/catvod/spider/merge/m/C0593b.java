package com.github.catvod.spider.merge.m;

import com.github.catvod.spider.merge.a.C0531c;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.m.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0593b {
    private static final int[] a = {46, 47, 18, 2, 53, 8, 23, 32, 15, 50, 10, 31, 58, 3, 45, 35, 27, 43, 5, 49, 33, 9, 42, 19, 29, 28, 14, 39, 12, 38, 41, 13, 37, 48, 7, 16, 24, 55, 40, 61, 26, 17, 0, 1, 60, 51, 30, 4, 22, 25, 54, 21, 56, 59, 6, 63, 57, 62, 11, 36, 20, 34, 44, 52};

    public static String a(String str, String str2, String str3) {
        String strA = C0531c.a(str, str2);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            sb.append(strA.charAt(a[i]));
        }
        String string = sb.toString();
        String str4 = (System.currentTimeMillis() / 1000) + "";
        return str3 + "&w_rid=" + C0590I.a(str3 + "&wts=" + str4 + string) + "&wts=" + str4;
    }
}
