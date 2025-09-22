package com.github.catvod.spider.merge;

import java.io.ByteArrayOutputStream;

/**
 * StringDecodingUtility - Utility class for string decoding and transformation operations
 * Provides methods for hex string decoding, XOR operations, and character array processing
 * Part of the spider framework's string processing utilities
 */
public class C0169 {

    // Static constant used for various operations
    public static final int OPERATION_CONSTANT = 534;

    /**
     * Decode a hex-encoded string with XOR transformation
     * Converts hex-encoded string to bytes and applies XOR with a generated key
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
     * Calculate XOR result with internal constant
     * Performs XOR operation between -773 and external constant
     *
     * @return XOR result of -773 and C0171.f880
     */
    public static int calculateXorWithConstant() {
        return (-773) ^ C0171.f880;
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
     * @deprecated Use decodeHexWithXor() instead
     */
    public static String m810(String str) {
        return decodeHexWithXor(str);
    }

    /**
     * @deprecated Use getObjectHashCode() instead
     */
    public static int m811(Object obj) {
        return getObjectHashCode(obj);
    }

    /**
     * @deprecated Use calculateXorWithConstant() instead
     */
    public static int m812() {
        return calculateXorWithConstant();
    }

    /**
     * @deprecated Use decodeFromShortArray() instead
     */
    public static String m809(short[] sArr, int i, int i2, int i3) {
        return decodeFromShortArray(sArr, i, i2, i3);
    }
}