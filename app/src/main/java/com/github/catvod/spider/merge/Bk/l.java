package com.github.catvod.spider.merge.Bk;

import com.github.catvod.spider.merge.Mp.F;
import java.util.Locale;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class l implements com.github.catvod.spider.merge.XI.h {
    public static int b(int i, int i2) {
        int i3 = i ^ (i2 * 4);
        int i4 = (i3 ^ (i3 >>> 16)) * (-2048144789);
        int i5 = (i4 ^ (i4 >>> 13)) * (-1028477387);
        return i5 ^ (i5 >>> 16);
    }

    public static String c(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public static String d(String str) {
        return c(str).trim();
    }

    public static com.github.catvod.spider.merge.UY.h e(String str) {
        return F.d(str);
    }

    public static int f(int i, int i2) {
        int i3 = i2 * (-862048943);
        int i4 = i ^ (((i3 >>> 17) | (i3 << 15)) * 461845907);
        return (((i4 >>> 19) | (i4 << 13)) * 5) - 430675100;
    }

    public static int g(int i, Object obj) {
        return f(i, obj != null ? obj.hashCode() : 0);
    }

    @Override // com.github.catvod.spider.merge.XI.h
    public com.github.catvod.spider.merge.XI.i a(String str) {
        return com.github.catvod.spider.merge.VB.b.a;
    }
}
