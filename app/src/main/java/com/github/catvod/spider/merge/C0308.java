package com.github.catvod.spider.merge;

import java.math.BigInteger;
import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ޖ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0308 {
    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static byte[] m1185(String str) {
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        int i = 0;
        while (i < byteArray.length && byteArray[i] == 0) {
            i++;
        }
        return Arrays.copyOfRange(byteArray, i, byteArray.length);
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static String m1186(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static BigInteger m1187(byte[] bArr) {
        return new BigInteger(m1186(bArr), 16);
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public static C0309 m1188(BigInteger bigInteger, int i) {
        return new C0309(m1185(String.format(SOY.d("5F62") + String.valueOf(i * 2) + SOY.d("02"), bigInteger)));
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public static byte[] m1189(int i) {
        return new byte[]{(byte) i};
    }
}
