package com.github.catvod.utils;

/**
 * String decoder stub (original in deleted merge package).
 * Simple XOR-based decoding for obfuscated strings.
 */
public class SOY {

    public static String d(String input) {
        if (input == null) return "";
        // Simple hex-decode stub: each pair of hex chars becomes a char
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < input.length(); i += 2) {
                if (i + 2 <= input.length()) {
                    int val = Integer.parseInt(input.substring(i, i + 2), 16);
                    sb.append((char) val);
                }
            }
            return sb.toString();
        } catch (Exception e) {
            return input;
        }
    }
}
