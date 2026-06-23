package com.github.catvod.utils;

import com.google.gson.Gson;

/**
 * Gson 序列化工具类
 * <p>
 * 替代 merge.C.u.a()
 */
public final class GsonHelper {

    private static final Gson GSON = new Gson();

    private GsonHelper() {
    }

    /**
     * JSON 字符串反序列化为对象（替代 C.u.a）
     */
    @SuppressWarnings("unchecked")
    public static <T> T fromJson(String json, Class<T> cls) {
        return GSON.fromJson(json, cls);
    }

    /**
     * 对象序列化为 JSON 字符串
     */
    public static String toJson(Object obj) {
        return GSON.toJson(obj);
    }
}
