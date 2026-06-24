package com.github.catvod.utils.merge;

/**
 * String utility stub (original obfuscated class).
 * Provides helper methods used by file comparators.
 */
public final class m {

    /** Extract numeric substring from input, or return original if no digits. */
    public static String x(String input) {
        if (input == null) return "";
        String digits = input.replaceAll("\\D+", "");
        return digits.isEmpty() ? input : digits;
    }

    /** Extract cleaned filename (remove path prefix). Alias for cleanFilename. */
    public static String v(String input) {
        return com.github.catvod.utils.PanStringUtils.cleanFilename(input);
    }
}
