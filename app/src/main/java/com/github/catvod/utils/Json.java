package com.github.catvod.utils;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Json {

    public static JsonElement parse(String json) {
        try {
            return JsonParser.parseString(json);
        } catch (Throwable e) {
            return new JsonParser().parse(json);
        }
    }

    public static JsonObject safeObject(String json) {
        try {
            JsonObject obj = parse(json).getAsJsonObject();
            return obj == null ? new JsonObject() : obj;
        } catch (Throwable e) {
            return new JsonObject();
        }
    }
}
