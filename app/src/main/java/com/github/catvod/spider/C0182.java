package com.github.catvod.spider;

import com.github.catvod.spider.merge.C0171;
import java.io.ByteArrayOutputStream;

/**
 * StringEncodingUtility - Utility class for string encoding and decoding operations
 * Provides methods for hex decoding, XOR operations, and string transformations
 * Used throughout the spider framework for data processing
 */
public class C0182 {

    // Static constant used for XOR operations
    public static final int XOR_CONSTANT = -982;

    /**
     * Get XOR result with internal constant
     * @return XOR result of 567 and internal constant
     */
    public static int getXorValue() {
        return 567 ^ C0171.f880;
    }

    /**
     * Get hash code of an object
     * @param obj Object to get hash code from
     * @return Hash code of the object
     */
    public static int getHashCode(Object obj) {
        return obj.hashCode();
    }

    /**
     * Decode a hex-encoded string with XOR transformation
     * This method performs hex decoding followed by XOR operations
     *
     * @param hexEncodedString String containing hex-encoded data
     * @return Decoded string after hex decoding and XOR transformation
     */
    public static String decodeHexString(String hexEncodedString) {
        if (hexEncodedString == null || hexEncodedString.isEmpty()) {
            return "";
        }

        // Build hex character mapping
        StringBuilder hexChars = new StringBuilder();
        int index = 0;
        StringBuilder xorKey = new StringBuilder();

        while (index < 15) {
            hexChars.append(Integer.toHexString(index));
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

            // Apply XOR transformation (note: original code has array bounds issue)
            // Fixed the array access issue in the original code
            for (int i = 0; i < decodedBytes.length; i++) {
                if (xorKeyString.length() > 0) {
                    decodedBytes[i] = (byte) (decodedBytes[i] ^ xorKeyString.charAt(i % xorKeyString.length()));
                }
            }

            return new String(decodedBytes);
        } catch (Exception e) {
            // Return original string if decoding fails
            return hexEncodedString;
        }
    }

    /**
     * Decode string from short array using XOR operations
     * This is the primary decoding method used throughout the framework
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
     * @deprecated Use getXorValue() instead
     */
    public static int m859() {
        return getXorValue();
    }

    /**
     * @deprecated Use getHashCode() instead
     */
    public static int m860(Object obj) {
        return getHashCode(obj);
    }

    /**
     * @deprecated Use decodeHexString() instead
     */
    public static String m862(String str) {
        return decodeHexString(str);
    }

    /**
     * @deprecated Use decodeFromShortArray() instead
     */
    public static String m861(short[] sArr, int i, int i2, int i3) {
        return decodeFromShortArray(sArr, i, i2, i3);
    }
}