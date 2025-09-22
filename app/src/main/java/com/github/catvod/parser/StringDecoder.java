package com.github.catvod.parser;

/**
 * StringDecoder - A readable version of C0165
 * Provides various string decryption and decoding utilities for the spider framework
 */
public class StringDecoder {

    // XOR constant used for various encryption operations
    public static final int DEFAULT_XOR_KEY = 749;

    /**
     * Decodes a string from an array of short values using XOR decryption
     * This is the primary method used throughout the spider framework
     *
     * @param encryptionKeys Array containing the encrypted short values
     * @param startIndex Starting position in the array
     * @param length Number of values to process
     * @param xorKey XOR key used for decryption
     * @return The decoded string
     */
    public static String decodeFromShortArray(short[] encryptionKeys, int startIndex, int length, int xorKey) {
        // Validate input parameters
        if (encryptionKeys == null || startIndex < 0 || length <= 0 ||
            startIndex + length > encryptionKeys.length) {
            return "";
        }

        // Decode each short value by XORing with the key
        char[] decodedChars = new char[length];
        for (int i = 0; i < length; i++) {
            decodedChars[i] = (char) (encryptionKeys[startIndex + i] ^ xorKey);
        }

        return new String(decodedChars);
    }

    /**
     * Decodes a hexadecimal-encoded string
     * Used for decoding hex-encoded configuration strings
     *
     * @param hexEncodedString String containing hex-encoded data
     * @return The decoded string
     */
    public static String decodeHexString(String hexEncodedString) {
        if (hexEncodedString == null || hexEncodedString.isEmpty()) {
            return "";
        }

        try {
            StringBuilder result = new StringBuilder();

            // Process pairs of hex characters
            for (int i = 0; i < hexEncodedString.length(); i += 2) {
                if (i + 1 < hexEncodedString.length()) {
                    String hexPair = hexEncodedString.substring(i, i + 2);
                    try {
                        int charValue = Integer.parseInt(hexPair, 16);
                        result.append((char) charValue);
                    } catch (NumberFormatException e) {
                        // If parsing fails, append the original characters
                        result.append(hexEncodedString.charAt(i));
                        if (i + 1 < hexEncodedString.length()) {
                            result.append(hexEncodedString.charAt(i + 1));
                        }
                    }
                }
            }
            return result.toString();
        } catch (Exception e) {
            // Return original string if decoding fails
            return hexEncodedString;
        }
    }

    /**
     * Simple XOR-based string transformation
     * Used for basic string obfuscation/deobfuscation
     *
     * @param input String to transform
     * @param xorKey XOR key for transformation
     * @return Transformed string
     */
    public static String xorTransform(String input, int xorKey) {
        if (input == null) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char transformedChar = (char) (input.charAt(i) ^ xorKey);
            result.append(transformedChar);
        }
        return result.toString();
    }

    /**
     * Position-based XOR decoding
     * Applies different XOR operations based on character position
     *
     * @param encodedString String to decode
     * @return Decoded string
     */
    public static String decodeWithPositionXor(String encodedString) {
        if (encodedString == null || encodedString.isEmpty()) {
            return "";
        }

        try {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < encodedString.length(); i++) {
                char originalChar = encodedString.charAt(i);
                // Apply position-based XOR transformation
                char decodedChar = (char) (originalChar ^ (i % 256));
                result.append(decodedChar);
            }
            return result.toString();
        } catch (Exception e) {
            return encodedString;
        }
    }

    /**
     * Dual-key XOR decoding for enhanced security
     * Alternates between two XOR keys based on position
     *
     * @param encryptionKeys Array of encrypted values
     * @param startIndex Starting position in array
     * @param length Number of values to process
     * @param primaryKey First XOR key
     * @param secondaryKey Second XOR key
     * @return Decoded string
     */
    public static String decodeDualKeyXor(short[] encryptionKeys, int startIndex, int length,
                                         int primaryKey, int secondaryKey) {
        if (encryptionKeys == null || startIndex < 0 || length <= 0 ||
            startIndex + length > encryptionKeys.length) {
            return "";
        }

        char[] decodedChars = new char[length];
        for (int i = 0; i < length; i++) {
            int encryptedValue = encryptionKeys[startIndex + i];

            // Alternate between primary and secondary keys
            if (i % 2 == 0) {
                encryptedValue ^= primaryKey;
            } else {
                encryptedValue ^= secondaryKey;
            }

            decodedChars[i] = (char) encryptedValue;
        }

        return new String(decodedChars);
    }

    /**
     * Utility method to validate decoded strings
     * Checks if a decoded string contains valid printable characters
     *
     * @param decodedString String to validate
     * @return true if string appears to be valid text
     */
    public static boolean isValidDecodedString(String decodedString) {
        if (decodedString == null || decodedString.isEmpty()) {
            return false;
        }

        // Check if string contains mostly printable ASCII characters
        int printableCount = 0;
        for (char c : decodedString.toCharArray()) {
            if (c >= 32 && c <= 126) { // Printable ASCII range
                printableCount++;
            }
        }

        // Consider valid if at least 80% of characters are printable
        return (double) printableCount / decodedString.length() >= 0.8;
    }
}