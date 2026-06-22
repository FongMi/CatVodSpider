package com.github.catvod.spider.merge.L;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.l.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public  class ConcatUtils {
    public static String a(String str, String str2) {
        return str + str2;
    }

    public static String b(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }
}
