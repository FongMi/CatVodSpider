package com.github.catvod.spider.merge;

import com.github.catvod.parser.C0165;
import com.github.catvod.parser.C0166;
import com.github.catvod.spider.C0177;
import com.github.catvod.spider.C0178;
import com.github.catvod.spider.C0179;
import com.github.catvod.spider.C0180;
import com.github.catvod.spider.C0181;
import com.github.catvod.spider.C0182;
import com.github.catvod.spider.C0183;
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

/* renamed from: com.github.catvod.spider.merge.vp */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0152vp {

    /* renamed from: short */
    private static final short[] f876short = {575, 574, 573, 572, 571, 570, 569, 568, 567, 566, 590, 589, 588, 587, 586, 585, 1633, 1637, 1651, 2439, 2435, 2453, 2537, 2437, 2436, 2437, 2537, 2454, 2445, 2437, 2453, 2545, 2454, 2471, 2466, 2466, 2479, 2472, 2465, 2137, 2136, 2122, 2081, 2100, 1133, 1129, 1151, 1898, 1902, 1912, 1796, 1896, 1897, 1896, 1796, 1915, 1888, 1896, 1912, 1820, 1915, 1866, 1871, 1871, 1858, 1861, 1868, 2903, 2902, 2884, 2863, 2874, 1465, 1469, 1451, 2901, 2897, 2887, 2875, 2903, 2902, 2903, 2875, 2884, 2911, 2903, 2887, 2849, 2884, 2933, 2928, 2928, 2941, 2938, 2931, 1759, 1758, 1740, 1703, 1714, 1207, 1203, 1189, 2641, 2645, 2627, 2623, 2643, 2642, 2643, 2623, 2624, 2651, 2643, 2627, 2599, 2624, 2673, 2676, 2676, 2681, 2686, 2679, 2677, 2676, 2662, 2573, 2584, 2703, 2711, 2719, 2705, 2708, 2711, 2760, 2760, 2760, 2787, 2786, 2800, 2747, 2734, 2885, 2881, 2903, 438, 434, 420, 472, 434, 436, 437, 472, 423, 444, 436, 420, 450, 423, 406, 403, 403, 414, 409, 400, 3193, 3197, 3179, 2465, 2464, 2482, 2521, 2508, 2771, 2775, 2753, 709, 705, 727, 683, 711, 710, 711, 683, 724, 719, 711, 727, 689, 724, 709, 704, 704, 717, 714, 707, 1005, 1004, 1022, 949, 928, 1439, 1457, 1453, 19438, 32686, 1466, 1441, 1464, 1464, 2917, 2891, 2903, -25007, 21896, 17699, 27905, 2847, 2840, 17507, 2072, 2076, 2058, 2534, 2530, 2548, 2440, 2530, 2532, 2533, 2440, 2551, 2540, 2532, 2548, 2450, 2551, 2502, 2499, 2499, 2510, 2505, 2496, 1386, 1387, 1401, 1298, 1287, 2916, 2912, 2934, 2318, 2314, 2332, 2400, 2316, 2331, 2333, 2400, 2335, 2308, 2316, 2332, 2426, 2335, 2350, 2347, 2347, 2342, 2337, 2344, 2775, 2774, 2756, 2735, 2746, 2894, 2890, 2908, 1818, 1822, 1800, 1908, 1822, 1816, 1817, 1908, 1803, 1808, 1816, 1800, 1902, 1803, 1850, 1855, 1855, 1842, 1845, 1852, 21186, -25183, -25477, 22434, 22209, -28289, 18238, 2340, 2359, 2358, 2340, 21075, -29818};

    /* renamed from: q */
    private static final char[] f748q = C0178.m845(f876short, 0, 16, 527).toCharArray();

    /* renamed from: B */
    public static String m720B(String str, String str2, String str3) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException, InvalidAlgorithmParameterException {
        String str4 = "ۣ۠ۧ";
        Cipher cipher = null;
        SecretKeySpec secretKeySpec = null;
        byte[] bArrDoFinal = null;
        IvParameterSpec ivParameterSpec = null;
        Key keyM726RH = null;
        short[] sArr = null;
        byte[] bytes = null;
        while (true) {
            switch (C0174.m829(str4)) {
                case 56322:
                    str4 = "ۣۥۤ";
                    bytes = keyM726RH.getEncoded();
                    break;
                case 56355:
                    cipher = Cipher.getInstance(str2);
                    str4 = "ۢ۟۟";
                    break;
                case 56381:
                    str4 = "ۣۤ";
                    bArrDoFinal = cipher.doFinal(bytes);
                    break;
                case 56417:
                    str3 = C0131mQ.m679xC(bArrDoFinal);
                    str4 = "ۢۥۤ";
                    break;
                case 56418:
                    str4 = "ۢ۟";
                    bytes = str.getBytes(str2);
                    break;
                case 1747780:
                    str4 = "ۣۤۥ";
                    bytes = str2.getBytes();
                    break;
                case 1747934:
                    str4 = "ۦۣۢ";
                    sArr = f876short;
                    break;
                case 1748612:
                    return str;
                case 1748613:
                    str2 = C0178.m845(sArr, 16, 3, 1568);
                    str4 = "ۥۧ۠";
                    break;
                case 1749570:
                    str4 = "۟۟";
                    bytes = str3.getBytes();
                    break;
                case 1749761:
                    str = str3.toString();
                    str4 = "ۡ۟ۢ";
                    break;
                case 1750692:
                    str4 = "۠ۢ";
                    keyM726RH = m726RH(bytes);
                    break;
                case 1750722:
                    str4 = "ۣۡ۟";
                    sArr = f876short;
                    break;
                case 1752702:
                    str4 = "۠ۨۦ";
                    secretKeySpec = new SecretKeySpec(bytes, str2);
                    break;
                case 1753541:
                    str2 = C0171.m816(sArr, 19, 20, 2502);
                    str4 = "ۡۤ";
                    break;
                case 1753702:
                    str2 = C0176.m836(sArr, 39, 5, 2060);
                    str4 = "ۣۥ";
                    break;
                case 1754599:
                    str4 = "ۦۨۨ";
                    sArr = f876short;
                    break;
                case 1755401:
                    cipher.init(1, secretKeySpec, ivParameterSpec);
                    str4 = "ۧۦۦ";
                    break;
                default:
                    str4 = "ۨۡۢ";
                    ivParameterSpec = new IvParameterSpec(bytes);
                    break;
            }
        }
    }

    /* renamed from: F */
    public static String m721F(String str, String str2, String str3) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException, InvalidAlgorithmParameterException {
        String str4 = "ۣۣۤ";
        SecretKeySpec secretKeySpec = null;
        IvParameterSpec ivParameterSpec = null;
        Cipher cipher = null;
        byte[] bArrDoFinal = null;
        Key keyM726RH = null;
        short[] sArr = null;
        byte[] bytes = null;
        while (true) {
            switch (C0174.m829(str4)) {
                case 56421:
                    str4 = "ۧۤۦ";
                    keyM726RH = m726RH(bytes);
                    break;
                case 1746849:
                    str4 = "ۦۤۡ";
                    ivParameterSpec = new IvParameterSpec(bytes);
                    break;
                case 1746880:
                    str4 = "۟ۤۦ";
                    bytes = m733w8(str3);
                    break;
                case 1747773:
                    return str;
                case 1747840:
                    str4 = "ۣۢۦ";
                    sArr = f876short;
                    break;
                case 1748646:
                    str3 = C0131mQ.m679xC(bArrDoFinal);
                    str4 = "ۨۨۡ";
                    break;
                case 1748893:
                    str2 = C0169.m809(sArr, 47, 20, 1835);
                    str4 = "ۢۤۦ";
                    break;
                case 1749732:
                    str4 = "۟ۥۦ";
                    cipher = Cipher.getInstance(str2);
                    break;
                case 1750631:
                    str2 = C0166.m801(sArr, 67, 5, 2818);
                    str4 = "ۣۤۨ";
                    break;
                case 1751586:
                    secretKeySpec = new SecretKeySpec(bytes, str2);
                    str4 = "۠ۨۢ";
                    break;
                case 1751620:
                    str4 = "ۣۨ";
                    bytes = str2.getBytes();
                    break;
                case 1751625:
                    str4 = "ۦۦۧ";
                    bytes = str.getBytes(str2);
                    break;
                case 1753571:
                    cipher.init(1, secretKeySpec, ivParameterSpec);
                    str4 = "۠ۥۥ";
                    break;
                case 1753639:
                    str4 = "ۡ۠ۥ";
                    bArrDoFinal = cipher.doFinal(bytes);
                    break;
                case 1754471:
                    str4 = "ۧۤۢ";
                    sArr = f876short;
                    break;
                case 1754533:
                    str2 = C0170.m814(sArr, 44, 3, 1068);
                    str4 = "ۤۢ۠";
                    break;
                case 1754537:
                    str4 = "ۧۢۢ";
                    bytes = keyM726RH.getEncoded();
                    break;
                case 1755617:
                    str = str3.toString();
                    str4 = "ۣ۠۠";
                    break;
                default:
                    str4 = "ۡۨۤ";
                    sArr = f876short;
                    break;
            }
        }
    }

    /* renamed from: FN */
    public static String m722FN(String str, String str2, String str3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            byte[] bArrM678q = C0131mQ.m678q(str);
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), C0183.m866(f876short, 72, 3, 1528));
            IvParameterSpec ivParameterSpec = new IvParameterSpec(str3.getBytes());
            Cipher cipher = Cipher.getInstance(C0175.m834(f876short, 75, 20, 2836));
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(cipher.doFinal(bArrM678q), C0170.m814(f876short, 95, 5, 1674));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: MH */
    public static String m723MH(String str, String str2, String str3) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        String str4 = "ۨۤۤ";
        byte[] bArrDoFinal = null;
        IvParameterSpec ivParameterSpec = null;
        SecretKeySpec secretKeySpec = null;
        Cipher cipher = null;
        Key keyM726RH = null;
        short[] sArr = null;
        byte[] bytes = null;
        while (true) {
            switch (C0174.m829(str4)) {
                case 56297:
                    str4 = "ۨۤ۠";
                    ivParameterSpec = new IvParameterSpec(bytes);
                    break;
                case 1746718:
                    str4 = "ۨ۟۠";
                    sArr = f876short;
                    break;
                case 1746786:
                    str4 = "۟ۧۥ";
                    sArr = f876short;
                    break;
                case 1746820:
                    str4 = "۟ۨ";
                    bytes = str3.getBytes();
                    break;
                case 1746941:
                    str2 = C0183.m866(sArr, 123, 5, 2592);
                    str4 = "ۧۦۣ";
                    break;
                case 1746967:
                    str4 = "ۦۢۧ";
                    bytes = keyM726RH.getEncoded();
                    break;
                case 1750753:
                    bArrDoFinal = cipher.doFinal(bytes);
                    str4 = "۟ۢۥ";
                    break;
                case 1750788:
                    return str3;
                case 1752584:
                    str4 = "ۣۦۤ";
                    bytes = C0131mQ.m678q(str);
                    break;
                case 1752671:
                    str4 = "۟ۨ۠";
                    keyM726RH = m726RH(bytes);
                    break;
                case 1753515:
                    str4 = "۟ۦۢ";
                    sArr = f876short;
                    break;
                case 1754593:
                    str4 = "۟۠۟";
                    secretKeySpec = new SecretKeySpec(bytes, str2);
                    break;
                case 1754596:
                    str3 = new String(bArrDoFinal, str2);
                    str4 = "ۣۧۨ";
                    break;
                case 1755337:
                    str2 = C0179.m849(sArr, 103, 20, 2576);
                    str4 = "ۨۢۡ";
                    break;
                case 1755431:
                    str4 = "ۣ۟ۨ";
                    cipher = Cipher.getInstance(str2);
                    break;
                case 1755492:
                    cipher.init(2, secretKeySpec, ivParameterSpec);
                    str4 = "ۥۣۦ";
                    break;
                case 1755496:
                    str4 = "ۥۦ۠";
                    bytes = str2.getBytes();
                    break;
                default:
                    str2 = C0174.m828(sArr, 100, 3, 1270);
                    str4 = "ۧۦ۠";
                    break;
            }
        }
    }

    /* renamed from: Mo */
    public static String m724Mo(String str) {
        String str2 = "ۢۧۥ";
        byte[] bArrM729i = null;
        short[] sArr = null;
        byte[] bytes = null;
        byte[] bArrM732u = null;
        String str3 = null;
        Charset charset = null;
        while (true) {
            switch (C0174.m829(str2)) {
                case 1746974:
                    bArrM729i = m729i(str3);
                    str2 = "ۣ۟ۦ";
                    break;
                case 1747687:
                    str = C0165.m798(sArr, 128, 9, 2814);
                    str2 = "ۢ۠ۧ";
                    break;
                case 1747775:
                    str2 = "ۢ۠ۥ";
                    bArrM732u = m732u(bArrM729i, bytes);
                    break;
                case 1749607:
                    str2 = "ۣۦۤ";
                    charset = C0118ga.f677xC;
                    break;
                case 1749609:
                    str2 = "ۣ۠ۢ";
                    bytes = str.getBytes(charset);
                    break;
                case 1749824:
                    str2 = "۟ۨۧ";
                    str3 = m727UJ(str);
                    break;
                case 1750753:
                    str2 = "ۣۨۢ";
                    str3 = new String(bArrM732u, charset);
                    break;
                case 1753447:
                    str2 = "۠۠ۧ";
                    sArr = f876short;
                    break;
                case 1755433:
                    return str3;
                default:
                    str2 = "ۦ۠ۡ";
                    charset = C0118ga.f677xC;
                    break;
            }
        }
    }

    /* renamed from: QU */
    public static String m725QU(String str, String str2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        String str3 = "ۢ۠";
        Cipher cipher = null;
        SecretKeySpec secretKeySpec = null;
        String strM814 = null;
        byte[] bArrDoFinal = null;
        byte[] bytes = null;
        short[] sArr = null;
        while (true) {
            switch (C0174.m829(str3)) {
                case 56382:
                    str3 = "ۦ۠ۢ";
                    sArr = f876short;
                    break;
                case 56570:
                    str3 = "ۦۦۤ";
                    bytes = str.getBytes(strM814);
                    break;
                case 1746850:
                    cipher = Cipher.getInstance(str2);
                    str3 = "ۦۣۢ";
                    break;
                case 1747717:
                    str3 = "ۡ۟ۦ";
                    secretKeySpec = new SecretKeySpec(bytes, str2);
                    break;
                case 1748616:
                    str3 = "ۡ۠۟";
                    sArr = f876short;
                    break;
                case 1748640:
                    str2 = C0176.m836(sArr, 145, 20, 503);
                    str3 = "۟ۤۧ";
                    break;
                case 1750664:
                    str3 = "ۥۧۢ";
                    bytes = str2.getBytes(strM814);
                    break;
                case 1752704:
                    str3 = "ۦۤۡ";
                    sArr = f876short;
                    break;
                case 1753448:
                    str3 = "ۣۣۨ";
                    strM814 = C0170.m814(sArr, 137, 5, 2710);
                    break;
                case 1753511:
                    cipher.init(1, secretKeySpec);
                    str3 = "ۨۢ";
                    break;
                case 1753540:
                    return str2;
                case 1753571:
                    str2 = C0172.m820(sArr, 142, 3, 2820);
                    str3 = "۠ۡۦ";
                    break;
                case 1753636:
                    str3 = "ۡۥۡ";
                    bArrDoFinal = cipher.doFinal(bytes);
                    break;
                default:
                    str2 = C0131mQ.m679xC(bArrDoFinal);
                    str3 = "ۦۣۡ";
                    break;
            }
        }
    }

    /* renamed from: RH */
    private static Key m726RH(byte[] bArr) {
        return new SecretKeySpec(bArr, C0171.m816(f876short, 165, 3, 3128));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:107:0x0051. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:84:0x000e. Please report as an issue. */
    /* renamed from: UJ */
    private static String m727UJ(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int length = str.length();
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                    case 49:
                        i2 = i < length ? 1709 : 1678;
                    case 204:
                        char cCharAt = str.charAt(i);
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    i3 = cCharAt >= 'g' ? 1833 : 1802;
                                case 54:
                                case 471:
                                    break;
                                case 500:
                                    int i4 = 1864;
                                    while (true) {
                                        i4 ^= 1881;
                                        switch (i4) {
                                            case 17:
                                                i4 = cCharAt <= 'l' ? 48736 : 48705;
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
                                                    }
                                                    break;
                                                }
                                            case 47483:
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

    /* renamed from: W */
    public static String m728W(String str, String str2, String str3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        String strM849 = C0179.m849(f876short, 168, 5, 2548);
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(str3.getBytes(strM849));
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(strM849), C0174.m828(f876short, 173, 3, 2706));
            Cipher cipher = Cipher.getInstance(C0181.m856(f876short, 176, 20, 644));
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(cipher.doFinal(C0131mQ.m678q(str)), strM849);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:36:0x000f. Please report as an issue. */
    /* renamed from: i */
    private static byte[] m729i(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        int i = 0;
        while (true) {
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                    case 49:
                        i2 = i < length ? 1709 : 1678;
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

    /* JADX WARN: Failed to find 'out' block for switch in B:59:0x0010. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:68:0x0036. Please report as an issue. */
    /* renamed from: q */
    public static String m730q(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        String str3 = null;
        String strM814 = C0170.m814(f876short, 196, 5, 920);
        int i = 1616;
        while (true) {
            i ^= 1633;
            try {
                switch (i) {
                    case 14:
                    case 49:
                        i = str2 == null ? 1709 : 1678;
                    case 204:
                        System.out.print(C0170.m814(f876short, 201, 9, 1492));
                        break;
                    case 239:
                        int length = str2.length();
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = length != 16 ? 1833 : 1802;
                                case 54:
                                case 471:
                                    SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(strM814), C0168.m805(f876short, 220, 3, 2137));
                                    Cipher cipher = Cipher.getInstance(C0172.m820(f876short, 223, 20, 2471));
                                    cipher.init(2, secretKeySpec);
                                    try {
                                        str3 = new String(cipher.doFinal(C0131mQ.m678q(str)), strM814);
                                        break;
                                    } catch (Exception e) {
                                        System.out.println(e.toString());
                                        break;
                                    }
                                case 500:
                                    System.out.print(C0176.m836(f876short, 210, 10, 2862));
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

    /* renamed from: se */
    public static String m731se(String str, String str2, String str3, String str4) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str3.getBytes(C0168.m805(f876short, 243, 5, 1343)), C0169.m809(f876short, 248, 3, 2853));
            Cipher cipher = Cipher.getInstance(C0182.m861(f876short, 251, 20, 2383));
            cipher.init(2, secretKeySpec, new IvParameterSpec(str4.getBytes()));
            return new String(cipher.doFinal(C0131mQ.m678q(str)), str2);
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:106:0x002c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:119:0x006e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:93:0x000a. Please report as an issue. */
    /* renamed from: u */
    private static byte[] m732u(byte[] bArr, byte[] bArr2) {
        int[] iArr = new int[256];
        int i = 0;
        while (true) {
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                    case 49:
                        i2 = i < 256 ? 1709 : 1678;
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
                                i6 = i5 < 256 ? 48736 : 48705;
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
                                    case 53:
                                        break;
                                    case 503:
                                        i12 = i11 < length2 ? 49635 : 48953;
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

    /* JADX WARN: Failed to find 'out' block for switch in B:67:0x002c. Please report as an issue. */
    /* renamed from: w8 */
    public static byte[] m733w8(String str) {
        int length = str.length();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = length < 1 ? 1709 : 1678;
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
                                    i3 = i2 < length2 ? 1833 : 1802;
                                case 54:
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

    /* renamed from: xC */
    public static String m734xC(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        String strM836 = C0176.m836(f876short, 271, 5, 2690);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = str2 != null ? 1709 : 1678;
                case 204:
                    try {
                        int length = str2.length();
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = length == 32 ? 1833 : 1802;
                                case 54:
                                case 471:
                                    break;
                                case 500:
                                    SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(strM836), C0178.m845(f876short, 276, 3, 2831));
                                    Cipher cipher = Cipher.getInstance(C0177.m841(f876short, 279, 20, 1883));
                                    cipher.init(2, secretKeySpec);
                                    return new String(cipher.doFinal(C0131mQ.m678q(str)), strM836);
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
        throw new IllegalArgumentException(C0180.m851(f876short, 299, 13, 2308));
    }
}
