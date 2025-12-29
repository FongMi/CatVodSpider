package com.github.catvod.spider;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DanmakuConfigManager {
    
    private static final String PREF_NAME = "leo_danmaku_conf";
    private static final String KEY_URLS = "api_urls";
    
    public static void saveConfig(Context context, Set<String> urls) {
        try {
            SharedPreferences prefs = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            JSONArray arr = new JSONArray();
            for (String u : urls) arr.put(u);
            prefs.edit().putString(KEY_URLS, arr.toString()).apply();
        } catch (Exception e) {}
    }
    
    public static Set<String> loadConfig(Context context) {
        Set<String> list = new HashSet<>();
        try {
            SharedPreferences prefs = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            String json = prefs.getString(KEY_URLS, "");
            if (!TextUtils.isEmpty(json)) {
                JSONArray arr = new JSONArray(json);
                for (int i = 0; i < arr.length(); i++) {
                    list.add(arr.getString(i));
                }
            }
        } catch (Exception e) {}
        
        if (list.isEmpty()) {
            list.addAll(getDefaults());
        }
        return list;
    }
    
    private static List<String> getDefaults() {
        List<String> list = new ArrayList<>();
        return list;
    }
}