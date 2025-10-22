package com.github.catvod.spider;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 央视直播爬虫
 * 
 * 功能：
 * 1. homeContent - 显示直播列表
 * 2. categoryContent - 显示栏目列表 + 设置
 * 3. 支持切换内核（系统WebView/X5）
 * 4. 预留API接口
 * 
 * @author xMydev
 * @date 2025-01-22
 */
public class YangShi extends Spider {

    private static final String TAG = "YangShi";
    
    // 配置存储
    private static final String PREF_NAME = "yangshi_config";
    private static final String KEY_USE_X5 = "use_x5_webview";
    private static final String KEY_API_URL = "api_url";
    
    // 预留API地址（暂未使用）
    private String apiUrl = "";
    
    // 默认使用系统WebView
    private boolean useX5 = false;
    
    private SharedPreferences prefs;
    
    // ========== 写死的直播频道列表 ==========
    private static final String[][] LIVE_CHANNELS = {
        {"1", "CCTV-1 综合", "https://tv.cctv.com/live/cctv1/"},
        {"2", "CCTV-2 财经", "https://tv.cctv.com/live/cctv2/"},
        {"3", "CCTV-3 综艺", "https://tv.cctv.com/live/cctv3/"},
        {"4", "CCTV-4 中文国际", "https://tv.cctv.com/live/cctv4/"},
        {"5", "CCTV-5 体育", "https://tv.cctv.com/live/cctv5/"},
        {"6", "CCTV-6 电影", "https://tv.cctv.com/live/cctv6/"},
        {"7", "CCTV-7 国防军事", "https://tv.cctv.com/live/cctv7/"},
        {"8", "CCTV-8 电视剧", "https://tv.cctv.com/live/cctv8/"},
        {"9", "CCTV-9 纪录", "https://tv.cctv.com/live/cctvjilu"},
        {"10", "CCTV-10 科教", "https://tv.cctv.com/live/cctv10/"},
        {"11", "CCTV-11 戏曲", "https://tv.cctv.com/live/cctv11/"},
        {"12", "CCTV-12 社会与法", "https://tv.cctv.com/live/cctv12/"},
        {"13", "CCTV-13 新闻", "https://tv.cctv.com/live/cctv13/"},
        {"14", "CCTV-14 少儿", "https://tv.cctv.com/live/cctvchild"},
        {"15", "CCTV-15 音乐", "https://tv.cctv.com/live/cctv15/"},
        {"16", "CCTV-16 奥林匹克", "https://tv.cctv.com/live/cctv16/"},
        {"17", "CCTV-17 农业农村", "https://tv.cctv.com/live/cctv17/"},
        {"18", "CCTV-5+ 体育赛事", "https://tv.cctv.com/live/cctv5plus/"}
    };
    
    // ========== 写死的栏目分类列表 ==========
    private static final String[][] CATEGORIES = {
        {"news", "新闻"},
        {"tv", "电视剧"},
        {"variety", "综艺"},
        {"documentary", "纪录片"},
        {"sports", "体育"},
        {"settings", "设置"}
    };

    @Override
    public void init(Context context, String extend) throws Exception {
        super.init(context, extend);
        
        // 初始化SharedPreferences
        prefs = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        
        // 读取配置
        useX5 = prefs.getBoolean(KEY_USE_X5, false);
        apiUrl = prefs.getString(KEY_API_URL, "");
        
        SpiderDebug.log(TAG + " 初始化成功");
        SpiderDebug.log("当前内核: " + (useX5 ? "X5 WebView" : "系统 WebView"));
        
        // TODO: 从extend参数解析API地址（预留）
        if (!TextUtils.isEmpty(extend)) {
            try {
                JsonObject config = new Gson().fromJson(extend, JsonObject.class);
                if (config.has("api")) {
                    apiUrl = config.get("api").getAsString();
                    saveConfig(KEY_API_URL, apiUrl);
                }
            } catch (Exception e) {
                SpiderDebug.log(TAG + " 解析extend失败: " + e.getMessage());
            }
        }
    }

    /**
     * 首页内容 - 显示直播列表
     */
    @Override
    public String homeContent(boolean filter) throws Exception {
        // TODO: 未来从API获取数据
        // if (!TextUtils.isEmpty(apiUrl)) {
        //     return fetchFromApi(apiUrl + "/live/list");
        // }
        
        // 当前使用写死的数据
        List<Class> classes = new ArrayList<>();
        classes.add(new Class("live", "��视直播"));
        
        List<Vod> list = new ArrayList<>();
        for (String[] channel : LIVE_CHANNELS) {
            Vod vod = new Vod();
            vod.setVodId(channel[0]);
            vod.setVodName(channel[1]);
            vod.setVodPic("https://wtv.tools.yigechengzi.pro/prod-api/app/img/cctv" + channel[0] + ".png");
            vod.setVodRemarks("直播中");
            list.add(vod);
        }
        
        return Result.string(classes, list);
    }

    /**
     * 分类内容 - 显示栏目列表或设置
     */
    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        List<Vod> list = new ArrayList<>();
        
        // 特殊处理：设置分类
        if ("settings".equals(tid)) {
            return getSettingsContent();
        }
        
        // TODO: 未来从API获取栏目数据
        // if (!TextUtils.isEmpty(apiUrl)) {
        //     return fetchFromApi(apiUrl + "/category/" + tid + "?page=" + pg);
        // }
        
        // 当前返回写死的示例数据
        for (int i = 0; i < 10; i++) {
            Vod vod = new Vod();
            vod.setVodId(tid + "_" + i);
            vod.setVodName(getCategoryName(tid) + " 节目 " + i);
            vod.setVodPic("https://via.placeholder.com/300x400");
            vod.setVodRemarks("更新至第" + i + "期");
            list.add(vod);
        }
        
        return Result.string(list);
    }

    /**
     * 获取设置内容
     */
    private String getSettingsContent() {
        List<Vod> list = new ArrayList<>();
        
        // 设置项1：切换内核
        Vod kernelSetting = new Vod();
        kernelSetting.setVodId("setting_kernel");
        kernelSetting.setVodName("切换内核");
        kernelSetting.setVodPic("https://via.placeholder.com/300x400?text=Kernel");
        kernelSetting.setVodRemarks("当前: " + (useX5 ? "X5 WebView" : "系统 WebView"));
        kernelSetting.setVodContent("点击切换播放内核\n\n" +
            "系统 WebView: 轻量级，兼容性好\n" +
            "X5 WebView: 功能强大，适合复杂页面\n\n" +
            "当前使用: " + (useX5 ? "X5 WebView" : "系统 WebView"));
        list.add(kernelSetting);
        
        // 设置项2：API地址（预留）
        Vod apiSetting = new Vod();
        apiSetting.setVodId("setting_api");
        apiSetting.setVodName("API设置");
        apiSetting.setVodPic("https://via.placeholder.com/300x400?text=API");
        apiSetting.setVodRemarks(TextUtils.isEmpty(apiUrl) ? "未配置" : "已配置");
        apiSetting.setVodContent("设置数据源API地址\n\n当前: " + 
            (TextUtils.isEmpty(apiUrl) ? "使用内置数据" : apiUrl));
        list.add(apiSetting);
        
        return Result.string(list);
    }

    /**
     * 详情内容
     */
    @Override
    public String detailContent(List<String> ids) throws Exception {
        String vodId = ids.get(0);
        
        // 处理设置项的点击
        if (vodId.startsWith("setting_")) {
            return handleSettingClick(vodId);
        }
        
        // TODO: 未来从API获取详情
        // if (!TextUtils.isEmpty(apiUrl)) {
        //     return fetchFromApi(apiUrl + "/detail/" + vodId);
        // }
        
        // 查找对应的频道
        for (String[] channel : LIVE_CHANNELS) {
            if (channel[0].equals(vodId)) {
                Vod vod = new Vod();
                vod.setVodId(channel[0]);
                vod.setVodName(channel[1]);
                vod.setVodPic("https://wtv.tools.yigechengzi.pro/prod-api/app/img/cctv" + channel[0] + ".png");
                vod.setVodYear("2024");
                vod.setVodArea("中国");
                vod.setVodRemarks("24小时直播");
                vod.setVodContent("中央广播电视总台 " + channel[1] + " 官方直播频道");
                
                // 播放信息
                String playFrom = useX5 ? "X5-WebView" : "System-WebView";
                vod.setVodPlayFrom(playFrom);
                vod.setVodPlayUrl("播放$" + channel[2]);
                
                return Result.string(vod);
            }
        }
        
        // 未找到，返回空
        return Result.string(new Vod());
    }

    /**
     * 处理设置项点击
     */
    private String handleSettingClick(String settingId) {
        if ("setting_kernel".equals(settingId)) {
            // 切换内核
            useX5 = !useX5;
            saveConfig(KEY_USE_X5, useX5);
            
            SpiderDebug.log("内核已切换为: " + (useX5 ? "X5 WebView" : "系统 WebView"));
            
            // 返回更新后的设置项
            return getSettingsContent();
        }
        
        return Result.string(new Vod());
    }

    /**
     * 搜索内容
     */
    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        // TODO: 未来从API搜索
        // if (!TextUtils.isEmpty(apiUrl)) {
        //     return fetchFromApi(apiUrl + "/search?keyword=" + key);
        // }
        
        List<Vod> list = new ArrayList<>();
        
        // 简单的本地搜索
        for (String[] channel : LIVE_CHANNELS) {
            if (channel[1].toLowerCase().contains(key.toLowerCase())) {
                Vod vod = new Vod();
                vod.setVodId(channel[0]);
                vod.setVodName(channel[1]);
                vod.setVodPic("https://wtv.tools.yigechengzi.pro/prod-api/app/img/cctv" + channel[0] + ".png");
                vod.setVodRemarks("直播中");
                list.add(vod);
            }
        }
        
        return Result.string(list);
    }

    /**
     * 播放器内容
     */
    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36");
        headers.put("Referer", "https://tv.cctv.com/");
        
        // parse=1 表示需要WebView解析
        return Result.get()
            .url(id)
            .parse(1)
            .header(headers)
            .string();
    }

    // ========== 工具方法 ==========
    
    /**
     * 保存配置（布尔值）
     */
    private void saveConfig(String key, boolean value) {
        prefs.edit().putBoolean(key, value).apply();
    }
    
    /**
     * 保存配置（字符串）
     */
    private void saveConfig(String key, String value) {
        prefs.edit().putString(key, value).apply();
    }
    
    /**
     * 获取分类名称
     */
    private String getCategoryName(String tid) {
        for (String[] category : CATEGORIES) {
            if (category[0].equals(tid)) {
                return category[1];
            }
        }
        return "未知分类";
    }
    
    /**
     * 从API获取数据（预留方法）
     */
    private String fetchFromApi(String url) throws Exception {
        // TODO: 实现API请求逻辑
        // String response = OkHttp.string(url);
        // return parseApiResponse(response);
        throw new Exception("API功能暂未实现");
    }
    
    /**
     * 判断是否使用X5内核
     */
    public static boolean isUseX5(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return prefs.getBoolean(KEY_USE_X5, false);
    }
}