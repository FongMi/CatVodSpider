package com.github.catvod.spider.merge;

import java.math.BigInteger;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ޘ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0310 {
    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static C0309 m1195(BigInteger bigInteger) {
        String str = String.format(SOY.d("5F2A"), bigInteger);
        if (str.length() % 2 != 0) {
            str = SOY.d("4A") + str;
        }
        C0309 c0309 = new C0309(C0308.m1185(str));
        if (c0309.m1191(0) <= 127) {
            c0309.m1192(0, C0308.m1189(c0309.m1194()));
            c0309.m1192(0, C0308.m1189(2));
            return c0309;
        }
        int iM1194 = c0309.m1194();
        c0309.m1192(0, C0308.m1189(0));
        c0309.m1192(0, C0308.m1189(iM1194 + 1));
        c0309.m1192(0, C0308.m1189(2));
        return c0309;
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static C0309 m1196(int i) {
        if (i < 128) {
            return new C0309(C0308.m1189(i));
        }
        String str = String.format(SOY.d("5F2A"), Integer.valueOf(i));
        if (str.length() % 2 != 0) {
            str = SOY.d("4A") + str;
        }
        C0309 c0309 = new C0309(C0308.m1185(str));
        c0309.m1192(0, C0308.m1189(c0309.m1194() | 128));
        return c0309;
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static C0309 m1197(C0309... c0309Arr) {
        C0309 c0309 = new C0309(C0308.m1189(48));
        int iM1194 = 0;
        for (C0309 c03092 : c0309Arr) {
            iM1194 += c03092.m1194();
            c0309.m1193(c03092.m1190());
        }
        c0309.m1192(1, m1196(iM1194).m1190());
        return c0309;
    }
}
