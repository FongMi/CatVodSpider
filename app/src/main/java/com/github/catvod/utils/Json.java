package com.github.catvod.utils;

import com.google.gson.JsonParser;

public class Json {

    public static String getString(String result, String column) {
        return JsonParser.parseString(result).getAsJsonObject().get(column).getAsString();
    }

    public static int getInt(String result, String column) {
        return JsonParser.parseString(result).getAsJsonObject().get(column).getAsInt();
    }

    public static long getLong(String result, String column) {
        return JsonParser.parseString(result).getAsJsonObject().get(column).getAsLong();
    }

    public static boolean getBoolean(String result, String column) {
        return JsonParser.parseString(result).getAsJsonObject().get(column).getAsBoolean();
    }
}