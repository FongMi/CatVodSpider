package com.github.catvod.utils.merge;

import android.content.SharedPreferences;
import com.github.catvod.spider.Init;
import com.google.gson.Gson;

/**
 * 本地持久化存储工具（替代 merge.g.b 的 SharedPreferences 读写功能）
 */
public final class LocalStorage {

    private static SharedPreferences prefs() {
        return Init.context().getSharedPreferences(
                Init.context().getPackageName() + "_preferences", 0);
    }

    /**
     * 从 SharedPreferences 读取字符串
     *
     * @param key 存储键名，如 "p123_user"
     * @return 存储的值，不存在返回空串
     */
    public static String read(String key) {
        return prefs().getString(key, "");
    }

    /**
     * 写入字符串到 SharedPreferences
     *
     * @param key   存储键名
     * @param value 存储值
     */
    public static void save(String key, String value) {
        prefs().edit().putString(key, value).apply();
    }

    /**
     * 读取并返回 JSON 字符串（空串返回 null，便于 Gson 判断）
     *
     * @param key 存储键名
     * @return JSON 字符串，不存在或为空返回 null
     */
    public static String readJson(String key) {
        String value = prefs().getString(key, "");
        return (value != null && !value.isEmpty()) ? value : null;
    }

    /**
     * Serialize an object to JSON and save it to SharedPreferences.
     *
     * @param key    存储键名
     * @param object 要持久化的对象
     */
    public static void saveJson(String key, Object object) {
        save(key, new Gson().toJson(object));
    }
}
