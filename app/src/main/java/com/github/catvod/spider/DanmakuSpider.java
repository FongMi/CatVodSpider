package com.github.catvod.spider;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.Toast;

import com.github.catvod.bean.danmu.DanmakuItem;
import com.github.catvod.crawler.Spider;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.util.*;
import java.util.concurrent.ConcurrentMap;

public class DanmakuSpider extends Spider {

    // 配置
    public static Set<String> allApiUrls = new HashSet<>();
    public static String apiUrl = "";
    private static boolean initialized = false;
    private static File sCacheDir = null;
    
    // Leo弹幕状态
    public static boolean LEO_DANMAKU_ENABLED = true;
    public static String lastAutoDanmakuUrl = "";  // 上次自动推送的弹幕URL
    public static String lastManualDanmakuUrl = ""; // 上次手动选择的弹幕URL
    public static String lastDanmakuUrl = ""; // 上次弹幕URL
    public static ConcurrentMap<Integer, DanmakuItem> lastDanmakuItemMap = null;
    public static int lastDanmakuId = -1;          // 上次的弹幕ID
    public static boolean hasAutoSearched = false; // 是否已自动搜索过
    public static String lastProcessedTitle = "";  // 上次处理的标题
    // 添加：视频识别相关
    public static String currentVideoSignature = "";  // 当前视频的唯一标识（基于标题提取）
    public static long lastVideoDetectedTime = 0;     // 上次检测到视频的时间
    public static final long VIDEO_CHANGE_THRESHOLD = 5000; // 视频切换的最小间隔（5秒）
    
    // 日志
    private static final ArrayList<String> logBuffer = new ArrayList<>();
    private static final int MAX_LOG_SIZE = 1000;

    /**
     * 添加一个时间戳变量来防止 Leo弹幕 按钮快速连续点击：
     */
    public static long lastButtonClickTime = 0;// 在 DanmakuSpider 类中添加自动推送状态变量

    public static boolean autoPushEnabled = false; // 自动推送状态，默认关闭

    // 添加保存和加载自动推送状态的方法
    private static void saveAutoPushState(Context context) {
        try {
            SharedPreferences prefs = context.getSharedPreferences("danmaku_prefs", Context.MODE_PRIVATE);
            prefs.edit().putBoolean("auto_push_enabled", autoPushEnabled).apply();
        } catch (Exception e) {
            log("保存自动推送状态失败: " + e.getMessage());
        }
    }

    private static void loadAutoPushState(Context context) {
        try {
            SharedPreferences prefs = context.getSharedPreferences("danmaku_prefs", Context.MODE_PRIVATE);
            autoPushEnabled = prefs.getBoolean("auto_push_enabled", false);
            log("加载自动推送状态: " + autoPushEnabled);
        } catch (Exception e) {
            log("加载自动推送状态失败: " + e.getMessage());
        }
    }


    @Override
    public void init(Context context, String extend) throws Exception {
        super.init(context, extend);
        doInitWork(context, extend);
    }

    public static synchronized void doInitWork(Context context, String extend) {
        // 初始化缓存目录
        sCacheDir = new File(context.getCacheDir(), "leo_danmaku_cache");
        if (!sCacheDir.exists()) sCacheDir.mkdirs();

        // 初始化配置
        DanmakuConfig config = DanmakuConfigManager.loadConfig(context);
        Set<String> loaded = config.getApiUrls();
        if (loaded == null) {
            loaded = new HashSet<>();
        }
        if (!TextUtils.isEmpty(extend)) {
            if (extend.startsWith("http")) {
                loaded.add(extend);
            } else if (extend.startsWith("{") && extend.endsWith("}")) {
                try {
                    JSONObject jsonObject = new JSONObject(extend);
                    String apiUrl = jsonObject.getString("apiUrl");
                    if (!TextUtils.isEmpty(apiUrl)) {
                        loaded.add(apiUrl);
                    }
                    String autoPushEnabled = jsonObject.getString("autoPushEnabled");
                    if (!TextUtils.isEmpty(autoPushEnabled)) {
                        config.setAutoPushEnabled(Boolean.parseBoolean(autoPushEnabled));
                        DanmakuSpider.autoPushEnabled = config.isAutoPushEnabled();
                        log("自动推送状态已设置为: " + DanmakuSpider.autoPushEnabled);
                    }
                } catch (Exception e) {
                    log("解析JSON格式配置失败: " + e.getMessage());
                }
            }
        }

        allApiUrls.clear();
        allApiUrls.addAll(loaded);

        config.setApiUrls(loaded);
        DanmakuConfigManager.saveConfig(context, config);

        if (initialized) return;

        // 加载自动推送状态
        loadAutoPushState(context);

        // 显示启动提示
        Activity act = getTopActivity();
        if (act != null) {
            safeRunOnUiThread(act, new Runnable() {
                @Override
                public void run() {
                    safeShowToast(act, "Leo弹幕加载成功");
                }
            });
        }

        log("Leo弹幕插件 v1.0 初始化完成");
        initialized = true;
    }


    // 获取Top Activity
    public static Activity getTopActivity() {
        try {
            Class<?> activityThreadClass = Class.forName("android.app.ActivityThread");
            Object activityThread = activityThreadClass.getMethod("currentActivityThread").invoke(null);
            java.lang.reflect.Field activitiesField = activityThreadClass.getDeclaredField("mActivities");
            activitiesField.setAccessible(true);
            Map<Object, Object> activities = (Map<Object, Object>) activitiesField.get(activityThread);
            
            for (Object activityRecord : activities.values()) {
                Class<?> activityRecordClass = activityRecord.getClass();
                java.lang.reflect.Field pausedField = activityRecordClass.getDeclaredField("paused");
                pausedField.setAccessible(true);
                if (!pausedField.getBoolean(activityRecord)) {
                    java.lang.reflect.Field activityField = activityRecordClass.getDeclaredField("activity");
                    activityField.setAccessible(true);
                    return (Activity) activityField.get(activityRecord);
                }
            }
        } catch (Exception e) {
            log("获取TopActivity失败: " + e.getMessage());
        }
        return null;
    }

    // 安全显示Toast
    public static void safeShowToast2(Activity activity, String message) {
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            safeRunOnUiThread(activity, new Runnable() {
                @Override
                public void run() {
                    if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                        Toast.makeText(activity, message, Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    public static void safeShowToast(Context context, String message) {
        safeShowToast2((Activity)context, message);
    }

    // 安全运行UI线程
    public static void safeRunOnUiThread(Activity activity, Runnable runnable) {
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            activity.runOnUiThread(runnable);
        }
    }

    // 重置自动搜索状态
    public static void resetAutoSearch() {
        hasAutoSearched = false;
        lastProcessedTitle = "";
    }

    // 记录弹幕URL
    public static void recordDanmakuUrl(DanmakuItem danmakuItem, boolean isAuto) {
        if (isAuto) {
            lastAutoDanmakuUrl = danmakuItem.getDanmakuUrl();
            log("记录自动弹幕URL: " + danmakuItem.getDanmakuUrl());
        } else {
            lastManualDanmakuUrl = danmakuItem.getDanmakuUrl();
            log("记录手动弹幕URL: " + danmakuItem.getDanmakuUrl());
        }
        lastDanmakuUrl = danmakuItem.getDanmakuUrl();
        lastDanmakuId = danmakuItem.getEpId();

        // 记录视频检测时间
        lastVideoDetectedTime = System.currentTimeMillis();
        log("✅ 更新视频检测时间: " + lastVideoDetectedTime);

        // 设置已搜索过，这样换集时就会尝试递增
        if (lastDanmakuId > 0) {
            hasAutoSearched = true;
            log("✅ 设置 hasAutoSearched = true (ID: " + lastDanmakuId + ")");
        }
    }

    // 获取下一个弹幕ID
    public static DanmakuItem getNextDanmakuItem(int currentEpisodeNum, int newEpisodeNum) {
        int nextId = lastDanmakuId + (newEpisodeNum - currentEpisodeNum);
        log("📝 获取下一个弹幕URL: " + lastDanmakuId + " -> " + nextId);

        if (nextId <= 0) {
            return null;
        }

        DanmakuItem nextDanmakuItem = lastDanmakuItemMap.get(nextId);
        if (nextDanmakuItem != null) {
            log("✅ 获取到下一个弹幕弹幕信息: " + nextDanmakuItem.toString());
            return nextDanmakuItem;
        }

        return null;
    }

    // 日志记录
    public static void log(String msg) {
        String time = new java.text.SimpleDateFormat("HH:mm:ss").format(new java.util.Date());
        logBuffer.add(time + " " + Thread.currentThread().getName() + " " + msg);
        if (logBuffer.size() > MAX_LOG_SIZE) {
            logBuffer.remove(0);
        }
    }

    public static String getLogContent() {
        StringBuilder sb = new StringBuilder();
        for (String s : logBuffer) sb.append(s).append("\n");
        return sb.toString();
    }

    public static void clearLogs() {
        logBuffer.clear();
    }

    // TVBox接口
    @Override
    public String homeContent(boolean filter) {
        try {
            JSONObject result = new JSONObject();
            JSONArray classes = new JSONArray();
            classes.put(createClass("leo_danmaku_config", "Leo弹幕设置"));
            result.put("class", classes);
            result.put("list", new JSONArray());
            return result.toString();
        } catch (Exception e) {
            return "";
        }
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        try {
            JSONObject result = new JSONObject();
            JSONArray list = new JSONArray();

            // 创建弹幕配置按钮
            JSONObject configVod = createVod("config", "弹幕配置", "", "配置弹幕API");
            list.put(configVod);

            // 创建自动推送弹幕按钮（保持开启状态）
            JSONObject autoPushVod = createVod("auto_push", "自动推送弹幕", "",
                    autoPushEnabled ? "已开启" : "已关闭");
            list.put(autoPushVod);

            // 创建查看日志按钮
            JSONObject logVod = createVod("log", "查看日志", "", "调试信息");
            list.put(logVod);

            // 创建布局配置按钮
            JSONObject lpConfigVod = createVod("lp_config", "布局配置", "", "调整弹窗大小和透明度");
            list.put(lpConfigVod);

            result.put("list", list);
            result.put("page", 1);
            result.put("pagecount", 1);
            result.put("limit", 20);
            result.put("total", list.length());
            return result.toString();
        } catch (Exception e) {
            return "";
        }
    }



    @Override
    public String detailContent(List<String> ids) {
        if (ids == null || ids.isEmpty()) return "";
        final String id = ids.get(0);

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                final Activity ctx = getTopActivity();
                if (ctx != null && !ctx.isFinishing()) {
                    ctx.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                if (id.equals("config")) {
                                    DanmakuUIHelper.showConfigDialog(ctx);
                                } else if (id.equals("auto_push")) {
                                    // 切换自动推送状态
                                    autoPushEnabled = !autoPushEnabled;
                                    saveAutoPushState(ctx);

                                    // 更新UI显示
                                    DanmakuSpider.log("自动推送状态切换: " + autoPushEnabled);
                                    safeShowToast(ctx,
                                            autoPushEnabled ? "自动推送已开启" : "自动推送已关闭");

                                    // 重新加载页面以更新状态显示
                                    refreshCategoryContent(ctx);
                                } else if (id.equals("log")) {
                                    DanmakuUIHelper.showLogDialog(ctx);
                                } else if (id.equals("lp_config")) {
                                    DanmakuUIHelper.showLpConfigDialog(ctx);
                                }
                            } catch (Exception e) {
                                DanmakuSpider.log("显示对话框失败: " + e.getMessage());
                                safeShowToast(ctx,
                                        "请稍后再试");
                            }
                        }
                    });
                }
            }
        }, 100); // 延迟100ms，确保Activity稳定

        try {
            JSONObject vod = new JSONObject();
            vod.put("vod_id", id);
            vod.put("vod_name", id.equals("auto_push") ? "自动推送弹幕" :
                    id.equals("log") ? "查看日志" : id.equals("lp_config") ? "布局配置" : "Leo弹幕设置");
            vod.put("vod_pic", "");
            vod.put("vod_remarks", id.equals("auto_push") ?
                    (autoPushEnabled ? "已开启" : "已关闭") :
                    id.equals("log") ? "调试信息" : id.equals("lp_config") ? "调整弹窗大小和透明度" : "请稍候...");
            vod.put("vod_play_url", "");
            vod.put("vod_play_from", "");
            JSONObject result = new JSONObject();
            JSONArray list = new JSONArray();
            list.put(vod);
            result.put("list", list);
            return result.toString();
        } catch (Exception e) {
            return "";
        }
    }

    // 添加刷新分类内容的方法
    private void refreshCategoryContent(Activity ctx) {
        try {
            String content = categoryContent("", "", false, new HashMap<>());
            if (!TextUtils.isEmpty(content)) {
                JSONObject result = new JSONObject(content);
                JSONArray list = result.getJSONArray("list");

                // 找到自动推送按钮并更新其remark
                for (int i = 0; i < list.length(); i++) {
                    JSONObject item = list.getJSONObject(i);
                    if ("auto_push".equals(item.getString("vod_id"))) {
                        item.put("vod_remarks", autoPushEnabled ? "已开启" : "已关闭");
                        break;
                    }
                }
            }
        } catch (Exception e) {
            DanmakuSpider.log("刷新分类内容失败: " + e.getMessage());
        }
    }


    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        return "";
    }

    private JSONObject createClass(String id, String name) throws Exception {
        JSONObject cls = new JSONObject();
        cls.put("type_id", id);
        cls.put("type_name", name);
        return cls;
    }

    private JSONObject createVod(String id, String name, String pic, String remark) throws Exception {
        JSONObject vod = new JSONObject();
        vod.put("vod_id", id);
        vod.put("vod_name", name);
        vod.put("vod_pic", pic);
        vod.put("vod_remarks", remark);
        return vod;
    }
}
