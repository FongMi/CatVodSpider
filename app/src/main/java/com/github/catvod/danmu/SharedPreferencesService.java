package com.github.catvod.danmu;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.spider.DanmakuSpider;

public class SharedPreferencesService {
    /**
     * 保存搜索关键词缓存
     * 创建映射关系：initialKeyword -> 用户手动输入的关键词
     * @param context 上下文
     * @param initialKeyword 初始关键词（作为缓存的键）
     * @param manualKeyword 用户手动输入的关键词（缓存的值）
     */
    public static void saveSearchKeywordCache(Context context, String initialKeyword, String manualKeyword) {
        try {
            android.content.SharedPreferences prefs = context.getSharedPreferences("danmaku_search_cache", Context.MODE_PRIVATE);
            android.content.SharedPreferences.Editor editor = prefs.edit();
            // 保存映射关系：以initialKeyword作为键，manualKeyword作为值
            String cacheKey = "search_keyword_" + initialKeyword;
            editor.putString(cacheKey, manualKeyword);
            editor.apply();
            DanmakuSpider.log("保存搜索缓存成功: " + initialKeyword + " -> " + manualKeyword);
        } catch (Exception e) {
            DanmakuSpider.log("保存搜索缓存失败: " + e.getMessage());
        }
    }

    /**
     * 读取搜索关键词缓存
     * 优先返回缓存的手动输入值，如果没有缓存或缓存为空则返回initialKeyword
     * @param context 上下文
     * @param initialKeyword 初始关键词（作为缓存的键）
     * @return 缓存的关键词或initialKeyword
     */
    public static String getSearchKeywordCache(Context context, String initialKeyword) {
        try {
            android.content.SharedPreferences prefs = context.getSharedPreferences("danmaku_search_cache", Context.MODE_PRIVATE);
            String cacheKey = "search_keyword_" + initialKeyword;
            // 获取缓存值，如果不存在则使用initialKeyword作为默认值
            String cachedKeyword = prefs.getString(cacheKey, initialKeyword);

            // 如果缓存值为空字符串（表示已清空），返回initialKeyword
            if (TextUtils.isEmpty(cachedKeyword)) {
                DanmakuSpider.log("读取搜索缓存为空，返回初始值: " + initialKeyword);
                return initialKeyword;
            }

            DanmakuSpider.log("读取搜索缓存: " + initialKeyword + " -> " + cachedKeyword);
            return cachedKeyword;
        } catch (Exception e) {
            DanmakuSpider.log("读取搜索缓存失败: " + e.getMessage());
            return initialKeyword;
        }
    }
}
