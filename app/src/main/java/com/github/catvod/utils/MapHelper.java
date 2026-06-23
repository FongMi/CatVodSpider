package com.github.catvod.utils;

import java.util.HashMap;

/**
 * HashMap 构建工具类
 * <p>
 * 替代 merge.I.BuilderUtils.c() 和 merge.B.e.b()
 */
public final class MapHelper {

    private MapHelper() {
    }

    /**
     * 创建单对 HashMap（替代 BuilderUtils.c）
     */
    public static HashMap<String, String> of(String key, String value) {
        HashMap<String, String> map = new HashMap<>();
        map.put(key, value);
        return map;
    }

    /**
     * 创建双对 HashMap
     */
    public static HashMap<String, String> of(String k1, String v1, String k2, String v2) {
        HashMap<String, String> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        return map;
    }

    /**
     * 创建三对 HashMap
     */
    public static HashMap<String, String> of(String k1, String v1, String k2, String v2, String k3, String v3) {
        HashMap<String, String> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        return map;
    }

    /**
     * 创建四对 HashMap
     */
    public static HashMap<String, String> of(String k1, String v1, String k2, String v2,
                                              String k3, String v3, String k4, String v4) {
        HashMap<String, String> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        return map;
    }
}
