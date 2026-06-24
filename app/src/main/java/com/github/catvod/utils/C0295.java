package com.github.catvod.utils;

import java.util.HashMap;

/**
 * HTTP fetch utility stub (original in deleted merge package).
 * Used by M3uPlaylistParser for URL content fetching.
 */
public class C0295 {

    public static String m1089(String url, HashMap<String, String> headers) {
        try {
            return PanHttpClient.get(url, headers, null);
        } catch (Exception e) {
            return "";
        }
    }
}
