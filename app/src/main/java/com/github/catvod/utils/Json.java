package com.github.catvod.utils;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class Json {

    public static JsonElement parse(String json) {
        try {
            return JsonParser.parseString(json);
        } catch (Exception e) {
            return new JsonParser().parse(json);
        }
    }
}
