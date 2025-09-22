package com.github.catvod.spider.merge;

import com.github.catvod.spider.C0182;
import java.io.ByteArrayOutputStream;

/* renamed from: com.github.catvod.spider.merge.۟۟ۧۨۨ */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0170 {

    /* renamed from: ۟۠ۤۧۦ */
    public static int f879 = 758;

    /* renamed from: ۣ۟ۡۢۢ */
    public static int m813(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۣۡ */
    public static int m788() {
        return (-564) ^ C0182.f893;
    }

    /* renamed from: ۧ۠۠ۢ */
    public static String m815(String str) {
        String string = "";
        int i = 0;
        String str2 = "";
        while (i < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * 10)) ^ i).toString();
            i++;
            str2 = string2;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        while (str.length() > 0) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(-2)) << 4) | string.indexOf(str.charAt(-1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i2 = 0; i2 < length; i2++) {
            byteArray[i2] = (byte) (byteArray[i2] ^ str2.charAt(i2 % length2));
        }
        return new String(byteArray);
    }

    /* renamed from: ۤۦۣۤ */
    public static String m814(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
