package com.github.catvod.spider;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;

import java.util.Set;

public class DanmakuConfigManager {
    private static final String PREFS_NAME = "danmaku_config";
    private static final String KEY_CONFIG_JSON = "config_json";

    // 旧的配置键，用于迁移
    private static final String OLD_KEY_API_URLS = "api_urls";
    private static final String OLD_KEY_LP_WIDTH = "lp_width";
    private static final String OLD_KEY_LP_HEIGHT = "lp_height";
    private static final String OLD_KEY_LP_ALPHA = "lp_alpha";
    private static final String OLD_PREFS_AUTO_PUSH = "danmaku_prefs";
    private static final String OLD_KEY_AUTO_PUSH = "auto_push_enabled";

    private static DanmakuConfig sDanmakuConfig;
    private static final Gson gson = new Gson();

    public static DanmakuConfig getConfig(Context context) {
        if (sDanmakuConfig == null) {
            sDanmakuConfig = loadConfig(context);
        }
        return sDanmakuConfig;
    }

    public static DanmakuConfig loadConfig(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        String json = prefs.getString(KEY_CONFIG_JSON, null);
        if (json != null) {
            return gson.fromJson(json, DanmakuConfig.class);
        } else {
            // 迁移旧配置
            return migrateOldConfig(context);
        }
    }

    public static void saveConfig(Context context, DanmakuConfig config) {
        sDanmakuConfig = config;
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        String json = gson.toJson(config);
        prefs.edit().putString(KEY_CONFIG_JSON, json).apply();
    }

    private static DanmakuConfig migrateOldConfig(Context context) {
        DanmakuConfig config = new DanmakuConfig();
        SharedPreferences oldPrefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);

        // 迁移 API URLs
        Set<String> apiUrls = oldPrefs.getStringSet(OLD_KEY_API_URLS, null);
        if (apiUrls != null) {
            config.apiUrls.addAll(apiUrls);
        }

        // 迁移布局配置
        config.lpWidth = oldPrefs.getFloat(OLD_KEY_LP_WIDTH, 0.9f);
        config.lpHeight = oldPrefs.getFloat(OLD_KEY_LP_HEIGHT, 0.85f);
        config.lpAlpha = oldPrefs.getFloat(OLD_KEY_LP_ALPHA, 1f);

        // 迁移自动推送状态
        SharedPreferences autoPushPrefs = context.getSharedPreferences(OLD_PREFS_AUTO_PUSH, Context.MODE_PRIVATE);
        config.autoPushEnabled = autoPushPrefs.getBoolean(OLD_KEY_AUTO_PUSH, false);

        // 保存新的配置格式并清除旧的
        saveConfig(context, config);
        oldPrefs.edit()
                .remove(OLD_KEY_API_URLS)
                .remove(OLD_KEY_LP_WIDTH)
                .remove(OLD_KEY_LP_HEIGHT)
                .remove(OLD_KEY_LP_ALPHA)
                .apply();
        autoPushPrefs.edit().remove(OLD_KEY_AUTO_PUSH).apply();

        DanmakuSpider.log("旧配置已成功迁移到新格式。");
        return config;
    }
}
