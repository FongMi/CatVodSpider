package com.github.catvod.spider;

import com.github.catvod.spider.merge.C0171;
import java.io.ByteArrayOutputStream;

/* renamed from: com.github.catvod.spider.ۣ۟ۡ۠ۧ */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0181 {

    /* renamed from: ۣ۟ۡۧۤ */
    public static int f892 = 627;

    /* renamed from: ۣ۟ۡ۟ۧ */
    public static int m855(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۣۢ۟ۧ */
    public static int m857() {
        return 815 ^ C0171.f880;
    }

    /* renamed from: ۢۤۥ۠ */
    public static String m858(String str) {
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
        for (int i2 = 0; i2 < str.length(); i2 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i2)) << 4) | string.indexOf(str.charAt(i2 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        String str3 = "a";
        while (str3.length() > 0) {
            str3 = "";
            if ("".length() == 0) {
                str3 = "a";
            }
        }
        int length = str3.length();
        int length2 = str2.length();
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* renamed from: ۣ۟ۢۧ۠ */
    public static String m856(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
