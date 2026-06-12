package com.github.catvod.parser;

/**
 * C0165 - String decryption and parsing utility class
 * Provides methods for decoding encrypted strings using various algorithms
 */
public class C0165 {

    // Static field used for XOR operations
    public static final int f808 = 749;

    /**
     * Decrypt string using short array and XOR operations
     * @param shortArray Array of short values used as encryption keys
     * @param startIndex Starting index in the array
     * @param length Length of data to process
     * @param xorKey XOR key for decryption
     * @return Decrypted string
     */
    public static String m798(short[] shortArray, int startIndex, int length, int xorKey) {
        if (shortArray == null || startIndex < 0 || length <= 0 ||
            startIndex + length > shortArray.length) {
            return "";
        }

        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            result[i] = (char) (shortArray[startIndex + i] ^ xorKey);
        }
        return new String(result);
    }

    /**
     * Decode string using hexadecimal decoding
     * @param encodedString Hex-encoded string to decode
     * @return Decoded string
     */
    public static String m797(String encodedString) {
        if (encodedString == null || encodedString.isEmpty()) {
            return "";
        }

        try {
            // Simple hex decoding - this is a basic implementation
            // The actual implementation might be more complex
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < encodedString.length(); i += 2) {
                if (i + 1 < encodedString.length()) {
                    String hex = encodedString.substring(i, i + 2);
                    try {
                        int value = Integer.parseInt(hex, 16);
                        result.append((char) value);
                    } catch (NumberFormatException e) {
                        // If hex parsing fails, just append the characters as-is
                        result.append(encodedString.charAt(i));
                        if (i + 1 < encodedString.length()) {
                            result.append(encodedString.charAt(i + 1));
                        }
                    }
                }
            }
            return result.toString();
        } catch (Exception e) {
            // Fallback: return the original string if decoding fails
            return encodedString;
        }
    }

    /**
     * Alternative decoding method with different algorithm
     * @param encodedString String to decode
     * @return Decoded string
     */
    public static String m799(String encodedString) {
        if (encodedString == null || encodedString.isEmpty()) {
            return "";
        }

        // Simple base64-like decoding or custom algorithm
        // This is a placeholder implementation
        try {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < encodedString.length(); i++) {
                char c = encodedString.charAt(i);
                // Apply simple transformation
                result.append((char) (c ^ (i % 256)));
            }
            return result.toString();
        } catch (Exception e) {
            return encodedString;
        }
    }

    /**
     * Generic string processing method
     * @param input Input string
     * @param key Processing key
     * @return Processed string
     */
    public static String m800(String input, int key) {
        if (input == null) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            result.append((char) (c ^ key));
        }
        return result.toString();
    }

    /**
     * Advanced string decryption with multiple parameters
     * @param shortArray Encryption key array
     * @param startIndex Start position in array
     * @param length Length of data
     * @param xorKey1 Primary XOR key
     * @param xorKey2 Secondary XOR key
     * @return Decrypted string
     */
    public static String m801(short[] shortArray, int startIndex, int length, int xorKey1, int xorKey2) {
        if (shortArray == null || startIndex < 0 || length <= 0 ||
            startIndex + length > shortArray.length) {
            return "";
        }

        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            int value = shortArray[startIndex + i];
            // Apply both XOR keys alternately
            if (i % 2 == 0) {
                value ^= xorKey1;
            } else {
                value ^= xorKey2;
            }
            result[i] = (char) value;
        }
        return new String(result);
    }
}