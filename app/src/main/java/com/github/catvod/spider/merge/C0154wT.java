package com.github.catvod.spider.merge;

import java.util.Random;

/* renamed from: com.github.catvod.spider.merge.wT */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0154wT {
    /* renamed from: QU */
    public static String m737QU() {
        int[][] iArr = {new int[]{1783627776, 1784676351}, new int[]{2035023872, 2035154943}, new int[]{2078801920, 2079064063}, new int[]{-1950089216, -1948778497}, new int[]{-1425539072, -1425014785}, new int[]{-1236271104, -1235419137}, new int[]{-770113536, -768606209}, new int[]{-569376768, -564133889}};
        int iNextInt = new Random().nextInt(8);
        return m738q(iArr[iNextInt][0] + new Random().nextInt(iArr[iNextInt][1] - iArr[iNextInt][0]));
    }

    /* renamed from: q */
    public static String m738q(int i) {
        int[] iArr = {(i >> 24) & 255, (i >> 16) & 255, (i >> 8) & 255, i & 255};
        return Integer.toString(iArr[0]) + "." + Integer.toString(iArr[1]) + "." + Integer.toString(iArr[2]) + "." + Integer.toString(iArr[3]);
    }

    /* renamed from: xC */
    public static String m739xC(int i) {
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
}
