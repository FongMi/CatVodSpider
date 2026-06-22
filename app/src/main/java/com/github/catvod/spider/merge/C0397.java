package com.github.catvod.spider.merge;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ࢢ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0397 {
    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static void m1539(String str, String str2) {
        String strD = SOY.d("4E7C665846");
        boolean z = (str == null || strD.equals(str) || m1540(strD).equals(m1540(str))) ? false : true;
        boolean z2 = (strD.equals(str2) || m1540(strD).equals(m1540(str2))) ? false : true;
        if (z) {
            System.err.printf(SOY.d("3B1C053A26572E3D3E1A54011F20221F1B195A77225601041F3671101B055A313E1211571D373F1306160E3B3E185413153722561A180E723C1700141272251E11571927230411190E7223031A03133F34560212082138191A575F21"), str, strD);
        }
        if (z2) {
            System.err.printf(SOY.d("3B1C053A265728273F021D1A1F7227130604133D3F5651045A27221310571C3D23560416082134045414153F211F18160E3B3E185413153722561A180E723C1700141272251E11571927230411190E7223031A03133F34560212082138191A575F21"), str2, strD);
        }
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static String m1540(String str) {
        int iIndexOf = str.indexOf(46);
        int iIndexOf2 = iIndexOf >= 0 ? str.indexOf(46, iIndexOf + 1) : -1;
        int iIndexOf3 = str.indexOf(45);
        int length = str.length();
        if (iIndexOf2 >= 0) {
            length = Math.min(length, iIndexOf2);
        }
        if (iIndexOf3 >= 0) {
            length = Math.min(length, iIndexOf3);
        }
        return str.substring(0, length);
    }
}
