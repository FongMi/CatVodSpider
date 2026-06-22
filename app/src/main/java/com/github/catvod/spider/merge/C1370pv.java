package com.github.catvod.spider.merge;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.pv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C1370pv {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f107short = {2033, 2032, 2035, 2034, 2037, 2036, 2039, 2038, 2041, 2040, 1920, 1923, 1922, 1925, 1924, 1927, 971, 975, 985, 2682, 2686, 2664, 2580, 2680, 2681, 2680, 2580, 2667, 2672, 2680, 2664, 2574, 2667, 2650, 2655, 2655, 2642, 2645, 2652, 1779, 1778, 1760, 1675, 1694, 2012, 1987, -27926, 22835, 22608, -24594, 25018, 1956, 1955, 23746, -31465, 1981, 1956, 1959, 1965, 18648, 1980, -1895, 22726, 21976, 1967, 1973, 22443, -26424, -26350, 21195, 21416, -27626, 27202, 3166, 3167, 22330, -28945, 3141, 3167, 3160, 3163, 17184, 3140, -3231, 21310, 24096, 3159, 3149, 941, 940, 958, 981, 960, 2936, 2940, 2922, 555, 559, 569, 581, 553, 574, 568, 581, 570, 545, 553, 569, 607, 570, 523, 526, 526, 515, 516, 525, 1600, 1604, 1618, 889, 893, 875, 2920, 2924, 2938, 2822, 2922, 2923, 2922, 2822, 2937, 2914, 2922, 2938, 2846, 2937, 2888, 2893, 2893, 2880, 2887, 2894, 2025, 2024, 2042, 1937, 1924, 2490, 2491, 2473, 2498, 2519, 1128, 1132, 1146, 3012, 3008, 3030, 2986, 3008, 3014, 3015, 2986, 3029, 3022, 3014, 3030, 2992, 3029, 3044, 3041, 3041, 3052, 3051, 3042, 21134, -25107, -25545, 22510, 22157, -28365, 18290, 2408, 2427, 2426, 2408, 21023, -29750, 640, 641, 659, 728, 717, 300, 296, 318, 471, 467, 453, 441, 467, 469, 468, 441, 454, 477, 469, 453, 419, 454, 503, 498, 498, 511, 504, 497, 2999, 2995, 2981, 3152, 3156, 3138, 3134, 3154, 3155, 3154, 3134, 3137, 3162, 3154, 3138, 3110, 3137, 3184, 3189, 3189, 3192, 3199, 3190, 448, 449, 467, 440, 429, 2720, 2724, 2738, 1073, 1077, 1059, 1119, 1075, 1074, 1075, 1119, 1056, 1083, 1075, 1059, 1095, 1056, 1041, 1044, 1044, 1049, 1054, 1047, 1740, 1741, 1759, 1716, 1697, 1059, 1083, 1075, 1085, 1080, 1083, 1124, 1124, 1124, 950, 951, 933, 1006, 1019, 1029, 1067, 1079, 19060, 32308, 1056, 1083, 1058, 1058, 2024, 1990, 2010, -27940, 22789, 18862, 24972, 1938, 1941, 18670, 2852, 2848, 2870, 434, 438, 416, 476, 438, 432, 433, 476, 419, 440, 432, 416, 454, 419, 402, 407, 407, 410, 413, 404, 1757, 1756, 1742, 1701, 1712, 1664, 1668, 1682, 764, 760, 750, 658, 766, 767, 766, 658, 749, 758, 766, 750, 648, 749, 764, 761, 761, 756, 755, 762, 2344, 2348, 2362, 1325, 1321, 1343, 1347, 1327, 1326, 1327, 1347, 1340, 1319, 1327, 1343, 1369, 1340, 1293, 1288, 1288, 1285, 1282, 1291, 3047, 3046, 3060, 2975, 2954};
    private static final char[] l8 = "0123456789ABCDEF".toCharArray();

    public static String A(String str, String str2, String str3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArrL8 = MN.l8(str);
        byte[] bArrL82 = MN.l8(str2);
        byte[] bArrL83 = MN.l8(str3);
        int length = bArrL8.length;
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = length != 32 ? 1678 : 1709;
                    break;
                case 204:
                    int length2 = bArrL82.length;
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = length2 != 16 ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                throw new IllegalArgumentException("IV长度必须是16字节(128位)，当前: " + bArrL82.length);
                            case 500:
                                SecretKeySpec secretKeySpec = new SecretKeySpec(bArrL8, "AES");
                                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArrL82);
                                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                                cipher.init(2, secretKeySpec, ivParameterSpec);
                                return new String(cipher.doFinal(bArrL83), "UTF-8");
                        }
                    }
                    break;
                case 239:
                    throw new IllegalArgumentException("密钥长度必须是32字节(256位)，当前: " + bArrL8.length);
            }
        }
    }

    public static String HM(String str, String str2, String str3, String str4) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str3.getBytes("UTF-8"), "AES");
            Cipher cipher = Cipher.getInstance("AES/CTR/PKCS5Padding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(str4.getBytes()));
            return new String(cipher.doFinal(MN.l8(str)), str2);
        } catch (Exception e) {
            return null;
        }
    }

    private static Key Kf(byte[] bArr) {
        return new SecretKeySpec(bArr, "AES");
    }

    public static String N(String str, String str2, String str3) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        String str4 = "ۣۣۣ";
        SecretKeySpec secretKeySpec = null;
        IvParameterSpec ivParameterSpec = null;
        Key keyKf = null;
        byte[] bArrDoFinal = null;
        Cipher cipher = null;
        byte[] bArrL8 = null;
        short[] sArr = null;
        while (true) {
            switch (com.github.catvod.spider.v.d(str4)) {
                case 56383:
                    return str3;
                case 56414:
                    str2 = com.github.catvod.spider.v.b(sArr, 119, 3, 824);
                    str4 = "ۧۦۨ";
                    break;
                case 56510:
                    str4 = "ۧۡ";
                    bArrL8 = MN.l8(str);
                    break;
                case 56511:
                    str4 = "ۣ۠ۧ";
                    sArr = f107short;
                    break;
                case 56538:
                    str4 = "ۣ۟۟";
                    bArrDoFinal = cipher.doFinal(bArrL8);
                    break;
                case 1746694:
                    str2 = com.github.catvod.parser.a.c(sArr, 142, 5, 1980);
                    str4 = "ۡ۟ۡ";
                    break;
                case 1746788:
                    str4 = "ۦۦۧ";
                    bArrL8 = keyKf.getEncoded();
                    break;
                case 1747684:
                    str4 = "۟ۢۧ";
                    keyKf = Kf(bArrL8);
                    break;
                case 1747749:
                    str4 = "۠ۧۤ";
                    ivParameterSpec = new IvParameterSpec(bArrL8);
                    break;
                case 1748611:
                    str3 = new String(bArrDoFinal, str2);
                    str4 = "ۢۡ";
                    break;
                case 1750531:
                    str4 = "۟۟ۦ";
                    sArr = f107short;
                    break;
                case 1750570:
                    str2 = C1024e.e(sArr, 122, 20, 2857);
                    str4 = "ۥۢۥ";
                    break;
                case 1750659:
                    str4 = "۠۠ۤ";
                    bArrL8 = str2.getBytes();
                    break;
                case 1752552:
                    str4 = "ۦۣۨ";
                    cipher = Cipher.getInstance(str2);
                    break;
                case 1753639:
                    str4 = "ۣۡ";
                    sArr = f107short;
                    break;
                case 1753697:
                    str4 = "۠ۢۧ";
                    bArrL8 = str3.getBytes();
                    break;
                case 1754601:
                    secretKeySpec = new SecretKeySpec(bArrL8, str2);
                    str4 = "ۦۥ";
                    break;
                default:
                    cipher.init(2, secretKeySpec, ivParameterSpec);
                    str4 = "ۦۤ";
                    break;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x002c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x006e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000a. Please report as an issue. */
    private static byte[] OL(byte[] bArr, byte[] bArr2) {
        int[] iArr = new int[256];
        int i = 0;
        while (true) {
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        i2 = i >= 256 ? 1678 : 1709;
                        break;
                    case 204:
                        iArr[i] = i;
                        i++;
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    i3 = 1771;
                                    break;
                                case 54:
                                    break;
                            }
                        }
                        break;
                    case 239:
                        break;
                }
                int length = bArr2.length;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    int i6 = 1864;
                    while (true) {
                        i6 ^= 1881;
                        switch (i6) {
                            case 17:
                                i6 = i5 >= 256 ? 48705 : 48736;
                                break;
                            case 47384:
                                break;
                            case 47417:
                                i4 = (((i4 + iArr[i5]) + bArr2[i5 % length]) + (i5 % 128)) % 256;
                                int i7 = iArr[i5];
                                iArr[i5] = iArr[i4];
                                iArr[i4] = i7;
                                i5++;
                                int i8 = 48767;
                                while (true) {
                                    i8 ^= 48784;
                                    switch (i8) {
                                        case 14:
                                            break;
                                        case 239:
                                            i8 = 48798;
                                            break;
                                    }
                                }
                                break;
                            case 47483:
                                break;
                        }
                        byte[] bArr3 = new byte[bArr.length];
                        int i9 = 0;
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            int length2 = bArr.length;
                            int i12 = 48891;
                            while (true) {
                                i12 ^= 48908;
                                switch (i12) {
                                    case 22:
                                        break;
                                    case 53:
                                        break;
                                    case 503:
                                        i12 = i11 >= length2 ? 48953 : 49635;
                                        break;
                                    case 32495:
                                        int i13 = (i9 + 1) % 256;
                                        i10 = ((iArr[i13] + i10) + (i11 % 64)) % 256;
                                        int i14 = iArr[i13];
                                        iArr[i13] = iArr[i10];
                                        iArr[i10] = i14;
                                        bArr3[i11] = (byte) (iArr[((iArr[i13] + iArr[i10]) + iArr[(i13 + i10) % 256]) % 256] ^ bArr[i11]);
                                        i11++;
                                        int i15 = 49666;
                                        while (true) {
                                            i15 ^= 49683;
                                            switch (i15) {
                                                case 17:
                                                    i15 = 49697;
                                                    break;
                                                case 50:
                                                    break;
                                            }
                                        }
                                        i9 = i13;
                                        break;
                                }
                                return bArr3;
                            }
                        }
                    }
                }
            }
        }
    }

    public static String S(String str, String str2) {
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = str2 == null ? 1678 : 1709;
                    break;
                case 204:
                    try {
                        int length = str2.length();
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = length != 32 ? 1802 : 1833;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case 500:
                                    SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes("UTF-8"), "AES");
                                    Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
                                    cipher.init(2, secretKeySpec);
                                    return new String(cipher.doFinal(MN.l8(str)), "UTF-8");
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        return null;
                    }
                    break;
                case 239:
                    break;
            }
        }
        throw new IllegalArgumentException("密钥长度必须为 32 字节");
    }

    public static String T4(String str, String str2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        String str3 = "۟ۧۧ";
        String strE = null;
        byte[] bArrDoFinal = null;
        SecretKeySpec secretKeySpec = null;
        Cipher cipher = null;
        byte[] bytes = null;
        short[] sArr = null;
        while (true) {
            switch (com.github.catvod.spider.v.d(str3)) {
                case 56444:
                    str2 = com.github.catvod.spider.e.d(sArr, 193, 3, 365);
                    str3 = "ۦۨۧ";
                    break;
                case 1746687:
                    return str2;
                case 1746750:
                    str3 = "ۨ۠۟";
                    bytes = str2.getBytes(strE);
                    break;
                case 1746943:
                    str3 = "ۧ۠ۧ";
                    sArr = f107short;
                    break;
                case 1747683:
                    str3 = "ۣۧ۠";
                    sArr = f107short;
                    break;
                case 1750633:
                    str3 = "ۣ۟۟";
                    bytes = str.getBytes(strE);
                    break;
                case 1750780:
                    str2 = com.github.catvod.parser.c.e(sArr, 196, 20, 406);
                    str3 = "ۦۡۦ";
                    break;
                case 1753483:
                    str3 = "ۦۧۧ";
                    cipher = Cipher.getInstance(str2);
                    break;
                case 1753670:
                    cipher.init(1, secretKeySpec);
                    str3 = "ۣۢۨ";
                    break;
                case 1753701:
                    str3 = "ۣ۠۠";
                    secretKeySpec = new SecretKeySpec(bytes, str2);
                    break;
                case 1754414:
                    strE = C1228h.e(sArr, 188, 5, 757);
                    str3 = "۟ۡ۠";
                    break;
                case 1755367:
                    str3 = "ۤ۠";
                    sArr = f107short;
                    break;
                case 1755465:
                    str2 = MN.S(bArrDoFinal);
                    str3 = "۟۟۟";
                    break;
                default:
                    str3 = "ۣۨۤ";
                    bArrDoFinal = cipher.doFinal(bytes);
                    break;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0051. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000e. Please report as an issue. */
    private static String b(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int length = str.length();
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        i2 = i >= length ? 1678 : 1709;
                        break;
                    case 204:
                        char cCharAt = str.charAt(i);
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    i3 = cCharAt < 'g' ? 1802 : 1833;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case 500:
                                    int i4 = 1864;
                                    while (true) {
                                        i4 ^= 1881;
                                        switch (i4) {
                                            case 17:
                                                i4 = cCharAt > 'l' ? 48705 : 48736;
                                                break;
                                            case 47384:
                                                break;
                                            case 47417:
                                                sb.append((char) (cCharAt - 6));
                                                int i5 = 48767;
                                                while (true) {
                                                    i5 ^= 48784;
                                                    switch (i5) {
                                                        case 14:
                                                            break;
                                                        case 239:
                                                            i5 = 48798;
                                                            break;
                                                    }
                                                    break;
                                                }
                                                break;
                                            case 47483:
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        sb.append(cCharAt);
                        i++;
                        int i6 = 48891;
                        while (true) {
                            i6 ^= 48908;
                            switch (i6) {
                                case 22:
                                    break;
                                case 503:
                                    i6 = 48922;
                                    break;
                            }
                        }
                        break;
                    case 239:
                        break;
                }
                return sb.toString();
            }
        }
    }

    public static String cD(String str, String str2, String str3) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException, InvalidAlgorithmParameterException {
        String str4 = "ۨ۟ۧ";
        SecretKeySpec secretKeySpec = null;
        Key keyKf = null;
        Cipher cipher = null;
        byte[] bArrDoFinal = null;
        IvParameterSpec ivParameterSpec = null;
        short[] sArr = null;
        byte[] encoded = null;
        while (true) {
            switch (com.github.catvod.spider.v.d(str4)) {
                case 1746849:
                    str2 = C0948d.e(sArr, 239, 5, 405);
                    str4 = "ۤ۠۟";
                    break;
                case 1746968:
                    str2 = com.github.catvod.spider.e.d(sArr, 219, 20, 3089);
                    str4 = "ۡۥۤ";
                    break;
                case 1747657:
                    str4 = "ۣۡ۟";
                    encoded = str3.getBytes();
                    break;
                case 1747683:
                    str = str3.toString();
                    str4 = "ۢ۟ۥ";
                    break;
                case 1747746:
                    str3 = MN.S(bArrDoFinal);
                    str4 = "ۣ۠۠";
                    break;
                case 1747803:
                    str4 = "۟ۨۡ";
                    sArr = f107short;
                    break;
                case 1748733:
                    str4 = "ۢۡۢ";
                    ivParameterSpec = new IvParameterSpec(encoded);
                    break;
                case 1748800:
                    str4 = "۠۟ۨ";
                    cipher = Cipher.getInstance(str2);
                    break;
                case 1749576:
                    return str;
                case 1749635:
                    cipher.init(1, secretKeySpec, ivParameterSpec);
                    str4 = "ۣۤۧ";
                    break;
                case 1750694:
                    str4 = "۟ۤۦ";
                    sArr = f107short;
                    break;
                case 1751523:
                    str4 = "ۨۦۦ";
                    encoded = str.getBytes(str2);
                    break;
                case 1751740:
                    str2 = com.github.catvod.parser.f.c(sArr, 216, 3, 3062);
                    str4 = "ۥۥۤ";
                    break;
                case 1752644:
                    secretKeySpec = new SecretKeySpec(encoded, str2);
                    str4 = "۠ۤ۟";
                    break;
                case 1755344:
                    str4 = "ۨۧ۠";
                    encoded = str2.getBytes();
                    break;
                case 1755460:
                    str4 = "۠ۨۢ";
                    encoded = keyKf.getEncoded();
                    break;
                case 1755560:
                    str4 = "۠ۢۤ";
                    bArrDoFinal = cipher.doFinal(encoded);
                    break;
                case 1755585:
                    str4 = "ۣۨ۟";
                    keyKf = Kf(encoded);
                    break;
                default:
                    str4 = "ۤۧ۟";
                    sArr = f107short;
                    break;
            }
        }
    }

    public static String hR(String str, String str2, String str3) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException, InvalidAlgorithmParameterException {
        String str4 = "ۡۡ";
        byte[] bArrDoFinal = null;
        Key keyKf = null;
        Cipher cipher = null;
        SecretKeySpec secretKeySpec = null;
        IvParameterSpec ivParameterSpec = null;
        short[] sArr = null;
        byte[] bytes = null;
        while (true) {
            switch (com.github.catvod.spider.v.d(str4)) {
                case 56289:
                    cipher.init(1, secretKeySpec, ivParameterSpec);
                    str4 = "ۥۣۦ";
                    break;
                case 1746782:
                    str4 = "ۣۤۢ";
                    keyKf = Kf(bytes);
                    break;
                case 1746941:
                    str4 = "ۥۦۧ";
                    sArr = f107short;
                    break;
                case 1747777:
                    str2 = com.github.catvod.parser.d.b(sArr, 267, 5, 1689);
                    str4 = "ۦۢۨ";
                    break;
                case 1749579:
                    str4 = "ۧ۟ۥ";
                    sArr = f107short;
                    break;
                case 1749639:
                    str3 = MN.S(bArrDoFinal);
                    str4 = "ۦۤۥ";
                    break;
                case 1749758:
                    return str;
                case 1750602:
                    bArrDoFinal = cipher.doFinal(bytes);
                    str4 = "ۢۡۦ";
                    break;
                case 1750689:
                    str4 = "ۢ۟ۨ";
                    bytes = keyKf.getEncoded();
                    break;
                case 1751591:
                    str4 = "ۦۣ۟";
                    cipher = Cipher.getInstance(str2);
                    break;
                case 1752584:
                    str4 = "ۣ۠ۤ";
                    sArr = f107short;
                    break;
                case 1752676:
                    str4 = "۟ۧۥ";
                    secretKeySpec = new SecretKeySpec(bytes, str2);
                    break;
                case 1752678:
                    str2 = com.github.catvod.parser.f.c(sArr, 247, 20, 1136);
                    str4 = "ۤۢۥ";
                    break;
                case 1753418:
                    str4 = "ۧۤۡ";
                    bytes = s(str3);
                    break;
                case 1753516:
                    str4 = "ۣۡۨ";
                    bytes = str.getBytes(str2);
                    break;
                case 1753575:
                    str = str3.toString();
                    str4 = "ۢۥۡ";
                    break;
                case 1754381:
                    str2 = com.github.catvod.parser.g.c(sArr, 244, 3, 2785);
                    str4 = "ۥۦۥ";
                    break;
                case 1754532:
                    str4 = "۟۠";
                    ivParameterSpec = new IvParameterSpec(bytes);
                    break;
                default:
                    str4 = "۟ۢۡ";
                    bytes = str2.getBytes();
                    break;
            }
        }
    }

    public static String l(String str) {
        String str2 = "ۣۤۥ";
        short[] sArr = null;
        byte[] bytes = null;
        byte[] bArrTT = null;
        byte[] bArrOL = null;
        String str3 = null;
        Charset charset = null;
        while (true) {
            switch (com.github.catvod.spider.v.d(str2)) {
                case 56296:
                    str2 = "ۡ۟۟";
                    bytes = str.getBytes(charset);
                    break;
                case 1747749:
                    str2 = "ۧۧۨ";
                    str3 = new String(bArrOL, charset);
                    break;
                case 1748609:
                    str2 = "ۥ۠۟";
                    bArrOL = OL(bArrTT, bytes);
                    break;
                case 1751622:
                    str2 = "ۥۡۨ";
                    str3 = b(str);
                    break;
                case 1751749:
                    sArr = f107short;
                    str2 = "ۣۨۡ";
                    break;
                case 1752484:
                    str2 = "۠ۢۧ";
                    charset = ZP.S;
                    break;
                case 1752524:
                    str2 = "ۦۨ۟";
                    bArrTT = tT(str3);
                    break;
                case 1753693:
                    str2 = "ۤۧۨ";
                    charset = ZP.S;
                    break;
                case 1755462:
                    str = com.github.catvod.spider.c.e(sArr, 272, 9, 1106);
                    str2 = "۟ۧ";
                    break;
                default:
                    return str3;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0023. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0007. Please report as an issue. */
    public static String l8(String str, String str2) {
        String str3 = null;
        int i = 1616;
        while (true) {
            i ^= 1633;
            try {
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        i = str2 != null ? 1678 : 1709;
                        break;
                    case 204:
                        System.out.print("Key为空null");
                        break;
                    case 239:
                        int length = str2.length();
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = length == 16 ? 1802 : 1833;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes("utf-8"), "AES");
                                    Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
                                    cipher.init(2, secretKeySpec);
                                    try {
                                        str3 = new String(cipher.doFinal(MN.l8(str)), "utf-8");
                                    } catch (Exception e) {
                                        System.out.println(e.toString());
                                    }
                                    break;
                                case 500:
                                    System.out.print("Key长度不是16位");
                                    break;
                            }
                        }
                        break;
                }
            } catch (Exception e2) {
                System.out.println(e2.toString());
            }
            return str3;
        }
        return str3;
    }

    public static String n(String str, String str2, String str3) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(str3.getBytes("UTF-8"));
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes("UTF-8"), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(cipher.doFinal(MN.l8(str)), "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x002c. Please report as an issue. */
    public static byte[] s(String str) {
        int length = str.length();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = length >= 1 ? 1678 : 1709;
                    break;
                case 204:
                    return null;
                case 239:
                    byte[] bArr = new byte[str.length() / 2];
                    int i2 = 0;
                    while (true) {
                        int length2 = str.length() / 2;
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    i3 = i2 >= length2 ? 1802 : 1833;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case 500:
                                    int i4 = i2 * 2;
                                    int i5 = i4 + 1;
                                    bArr[i2] = (byte) (Integer.parseInt(str.substring(i5, i4 + 2), 16) + (Integer.parseInt(str.substring(i4, i5), 16) * 16));
                                    i2++;
                                    int i6 = 1864;
                                    while (true) {
                                        i6 ^= 1881;
                                        switch (i6) {
                                            case 17:
                                                i6 = 48674;
                                                break;
                                            case 47483:
                                                break;
                                        }
                                    }
                                    break;
                            }
                            return bArr;
                        }
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000f. Please report as an issue. */
    private static byte[] tT(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        int i = 0;
        while (true) {
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        i2 = i >= length ? 1678 : 1709;
                        break;
                    case 204:
                        bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
                        i += 2;
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    i3 = 1771;
                                    break;
                                case 54:
                                    break;
                            }
                        }
                        break;
                    case 239:
                        break;
                }
                return bArr;
            }
        }
    }

    public static String v(String str, String str2, String str3) {
        try {
            byte[] bArrL8 = MN.l8(str);
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(str3.getBytes());
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(cipher.doFinal(bArrL8), "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
