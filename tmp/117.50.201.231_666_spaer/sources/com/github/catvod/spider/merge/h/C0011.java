package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.U.C0026;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.H.۟ۧۥ۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class C0011 {

    /* JADX INFO: renamed from: ۟ۥۤۧۤ, reason: not valid java name and contains not printable characters */
    public static int f15 = 846;

    /* JADX INFO: renamed from: ۡۢۡۡ, reason: not valid java name and contains not printable characters */
    public static int m34(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤۦۦ, reason: not valid java name and contains not printable characters */
    public static String m35(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۤۦۦۦ, reason: not valid java name and contains not printable characters */
    public static String m36(String str) {
        String string = "";
        int i = 0;
        String str2 = "";
        while (i < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i).toString();
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

    /* JADX INFO: renamed from: ۥۡ۠۟, reason: contains not printable characters */
    public static int m37() {
        return 464 ^ C0026.f26;
    }
}
