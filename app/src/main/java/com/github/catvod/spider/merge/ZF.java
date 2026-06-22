package com.github.catvod.spider.merge;

import java.util.Random;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class ZF {
    public static String S(int i) {
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        if (i <= 0) {
            return stringBuffer.toString();
        }
        int i2 = 0;
        do {
            i2++;
            stringBuffer.append("0123456789abcdef".charAt(random.nextInt(16)));
        } while (i2 < i);
        return stringBuffer.toString();
    }

    public static String T4() {
        int[][] iArr = {new int[]{1783627776, 1784676351}, new int[]{2035023872, 2035154943}, new int[]{2078801920, 2079064063}, new int[]{-1950089216, -1948778497}, new int[]{-1425539072, -1425014785}, new int[]{-1236271104, -1235419137}, new int[]{-770113536, -768606209}, new int[]{-569376768, -564133889}};
        int iNextInt = new Random().nextInt(8);
        return l8(iArr[iNextInt][0] + new Random().nextInt(iArr[iNextInt][1] - iArr[iNextInt][0]));
    }

    public static String b(int i) {
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        if (i <= 0) {
            return stringBuffer.toString();
        }
        int i2 = 0;
        do {
            i2++;
            stringBuffer.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".charAt(random.nextInt(62)));
        } while (i2 < i);
        return stringBuffer.toString();
    }

    public static String l8(int i) {
        int[] iArr = {(i >> 24) & 255, (i >> 16) & 255, (i >> 8) & 255, i & 255};
        return Integer.toString(iArr[0]) + "." + Integer.toString(iArr[1]) + "." + Integer.toString(iArr[2]) + "." + Integer.toString(iArr[3]);
    }
}
