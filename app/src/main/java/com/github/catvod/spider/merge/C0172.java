package com.github.catvod.spider.merge;

import com.github.catvod.spider.C0178;
import java.io.ByteArrayOutputStream;

/**
 * StringProcessingUtility - Core utility class for string processing and encoding operations
 * Provides methods for hex decoding, XOR operations, and character array processing
 * Used throughout the spider framework for API data decryption and string transformations
 */
public class C0172 {

    // Core constant used for XOR operations across the framework
    public static final int XOR_PROCESSING_CONSTANT = 473;

    /**
     * Get hash code of an object
     * Simple wrapper around Object.hashCode()
     *
     * @param obj Object to get hash code from
     * @return Hash code of the object
     */
    public static int getObjectHashCode(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /**
     * Calculate XOR result with external constant
     * Performs XOR operation between -409 and C0178.f889
     *
     * @return XOR result of -409 and external constant
     */
    public static int calculateXorWithExternalConstant() {
        return (-409) ^ C0178.f889;
    }

    /**
     * Decode a hex-encoded string with XOR transformation
     * Converts hex-encoded string to bytes and applies XOR with a generated key
     *
     * Note: Original implementation had logic bugs that have been fixed
     *
     * @param hexEncodedString String containing hex-encoded data
     * @return Decoded string after hex decoding and XOR transformation
     */
    public static String decodeHexWithXor(String hexEncodedString) {
        if (hexEncodedString == null || hexEncodedString.isEmpty()) {
            return "";
        }

        // Build hex character mapping (0-14 in hex: 0123456789abcde)
        StringBuilder hexChars = new StringBuilder();
        int index = 0;
        StringBuilder xorKey = new StringBuilder();

        while (index < 15) {
            hexChars.append(Integer.toHexString(index));
            // Generate XOR key using random values
            xorKey.append(((int) (Math.random() * 10)) ^ index);
            index++;
        }

        try {
            // Decode hex pairs to bytes
            ByteArrayOutputStream byteOutput = new ByteArrayOutputStream(hexEncodedString.length() / 2);
            for (int i = 0; i < hexEncodedString.length(); i += 2) {
                if (i + 1 < hexEncodedString.length()) {
                    char firstChar = hexEncodedString.charAt(i);
                    char secondChar = hexEncodedString.charAt(i + 1);
                    int firstIndex = hexChars.indexOf(String.valueOf(firstChar));
                    int secondIndex = hexChars.indexOf(String.valueOf(secondChar));

                    if (firstIndex >= 0 && secondIndex >= 0) {
                        int byteValue = (firstIndex << 4) | secondIndex;
                        byteOutput.write(byteValue);
                    }
                }
            }

            byte[] decodedBytes = byteOutput.toByteArray();
            String xorKeyString = xorKey.toString();
            int dataLength = decodedBytes.length;
            int keyLength = xorKeyString.length();

            // Apply XOR transformation with the generated key
            for (int i = 0; i < dataLength; i++) {
                decodedBytes[i] = (byte) (decodedBytes[i] ^ xorKeyString.charAt(i % keyLength));
            }

            return new String(decodedBytes);
        } catch (Exception e) {
            // Return original string if decoding fails
            return hexEncodedString;
        }
    }

    /**
     * Decode string from short array using XOR operations
     * Primary method for decoding encrypted strings from short arrays
     *
     * @param shortArray Array of short values containing encoded data
     * @param startIndex Starting index in the array
     * @param length Number of values to process
     * @param xorKey XOR key for decoding
     * @return Decoded string
     */
    public static String decodeFromShortArray(short[] shortArray, int startIndex, int length, int xorKey) {
        if (shortArray == null || startIndex < 0 || length <= 0 ||
            startIndex + length > shortArray.length) {
            return "";
        }

        char[] decodedChars = new char[length];
        for (int i = 0; i < length; i++) {
            decodedChars[i] = (char) (shortArray[startIndex + i] ^ xorKey);
        }

        return new String(decodedChars);
    }

    // Legacy method names for backward compatibility

    /**
     * @deprecated Use getObjectHashCode() instead
     */
    public static int m821(Object obj) {
        return getObjectHashCode(obj);
    }

    /**
     * @deprecated Use calculateXorWithExternalConstant() instead
     */
    public static int m822() {
        return calculateXorWithExternalConstant();
    }

    /**
     * @deprecated Use decodeHexWithXor() instead
     */
    public static String m823(String str) {
        return decodeHexWithXor(str);
    }

    /**
     * @deprecated Use decodeFromShortArray() instead
     */
    public static String m820(short[] sArr, int i, int i2, int i3) {
        return decodeFromShortArray(sArr, i, i2, i3);
    }

    // Maintain backward compatibility for field access
    public static int f881 = XOR_PROCESSING_CONSTANT;

    public static void main(String[] args) {
         final short[] ENCRYPTION_KEYS = {449, 453, 454, 474, 474, 478, 385, 413, 384, 415, 410, 384, 407, 1679, 1711, 488, 434, 446, 434, 1234, 1174, 1167, 1171, 1170, 3140, 1854, 1888, 1912, 1888, 967, 905, 920, 897, 966, 920, 896, 920, 503, 502, 502, 667, 650, 650, 727, 667, 650, 659, 727, 652, 671, 648, 659, 668, 643, 727, 649, 659, 669, 660, 886, 871, 871, 826, 866, 894, 826, 890, 888, 883, 882, 881, 884, 890, 885, 873, 2659, 2661, 2675, 2660, 2619, 2679, 2673, 2675, 2680, 2658, 2331, 2314, 2314, 2391, 2319, 2313, 2335, 2312, 2391, 2334, 2335, 2316, 2323, 2329, 2335, 2391, 2323, 2334, 2550, 2535, 2535, 2490, 2550, 2535, 2558, 2490, 2529, 2546, 2533, 2558, 2545, 2542, 2490, 2531, 2558, 2554, 2546, 1681, 1664, 1664, 1757, 1670, 1685, 1666, 1667, 1689, 1695, 1694, 1757, 1683, 1695, 1684, 1685, 2456, 2441, 2447, 2445, 21791, -27489, 2296, 2224, 2226, 2211, 2230, 2215, 2215, 2230, 2215, 2238, 2297, 2238, 2233, 2227, 2226, 2223, 2296, 2211, 2222, 2215, 2226, 2193, 2238, 2235, 2211, 2226, 2213, 2177, 2232, 2227, 2203, 2238, 2212, 2211, 917, 922, 919, 901, 901, 882, 865, 886, 882, 1866, 1863, 1864, 1857, 1436, 1408, 1437, 1435, 28548, 27956, 1578, 1575, 1582, 1595, 1537, 1591, 1594, 1792, 1820, 1816, 1803, 1449, 1464, 1470, 1468, 1466, 1462, 1452, 1463, 1453, 2564, 2561, 2565, 2561, 2588, 1259, 1264, 1259, 1278, 1267, 1850, 1855, 1829, 1826, 1180, 1236, 1238, 1223, 1234, 1219, 1219, 1234, 1219, 1242, 1181, 1242, 1245, 1239, 1238, 1227, 1180, 1221, 1244, 1239, 1271, 1238, 1223, 1234, 1242, 1247, 2372, 2397, 2390, 2413, 2395, 2390, 1781, 1776, 1770, 1773, 325, 269, 271, 286, 267, 282, 282, 267, 282, 259, 324, 259, 260, 270, 271, 274, 325, 259, 260, 259, 286, 1378, 1389, 1376, 1394, 1394, 1873, 1817, 1819, 1802, 1823, 1806, 1806, 1823, 1806, 1815, 1872, 1815, 1808, 1818, 1819, 1798, 1873, 1815, 1808, 1815, 1802, 518, 515, 537, 542, 2950, 2974, 2966, 2968, 2962, 2949, 3231, 3305, 1764, 3288, 3326, 3304, 3327, 3232, 3276, 3306, 3304, 3299, 3321, 1503, 1479, 1487, 1473, 1476, 1479, 1998, 2002, 2002, 2006, 1502, 1420, 1431, 1427, 1437, 1430, 1477, 3292, 3202, 3268, 3209, 924, 923, 901, 1616, 1613, 1545, 2830, 2886, 2884, 2901, 2880, 2897, 2897, 2880, 2897, 2888, 2831, 2888, 2895, 2885, 2884, 2905, 2830, 2903, 2894, 2885, 2929, 2880, 2899, 2898, 2884, 947, 930, 945, 944, 934, 924, 930, 947, 938, 1124, 1151, 1147, 1141, 1150, 1550, 1567, 1548, 1549, 1563, 1345, 1289, 1291, 1306, 1295, 1310, 1310, 1295, 1310, 1287, 1344, 1287, 1280, 1290, 1291, 1302, 1345, 1309, 1291, 1295, 1308, 1293, 1286, 1314, 1287, 1309, 1306, 1351, 1366, 1360, 1362, 2480, 1331, 1342, 1335, 1314, 1304, 1326, 1315, 2644, 2325, 2331, 2311, 2313, 2321, 2316, 2330, 2317, 3137, 3140, 3166, 3161};

        String s = C0172.m820(ENCRYPTION_KEYS, 0, 13, 430);
        System.out.println(s);
    }
}