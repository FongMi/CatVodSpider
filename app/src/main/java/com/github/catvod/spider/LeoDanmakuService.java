package com.github.catvod.spider;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.Toast;

import com.github.catvod.bean.danmu.DanmakuItem;
import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;

public class LeoDanmakuService {

    // 线程池
    private static final ExecutorService searchExecutor = Executors.newFixedThreadPool(4);
    // 添加防重复推送的静态变量
    private static long lastPushTime = 0;
    private static final long PUSH_MIN_INTERVAL = 3000; // 3秒内不重复推送

    // 在 LeoDanmakuService 类中添加缓存相关字段
    private static final long CACHE_EXPIRE_TIME = 30 * 60 * 1000; // 30分钟

    // 执行搜索
    public static List<DanmakuItem> searchDanmaku(String keyword, Activity activity) {
        if (TextUtils.isEmpty(keyword)) return new ArrayList<>();

        final List<DanmakuItem> globalResults = Collections.synchronizedList(new ArrayList<DanmakuItem>());

        try {
            List<String> targets = new ArrayList<>(DanmakuSpider.allApiUrls);
            if (targets.isEmpty()) {
                DanmakuSpider.log("没有配置API地址");
                Toast.makeText(activity, "没有配置API地址", Toast.LENGTH_SHORT).show();
                return globalResults;
            }

            ExecutorCompletionService<List<DanmakuItem>> completionService =
                    new ExecutorCompletionService<>(searchExecutor);
            int pendingTasks = 0;

            for (final String url : targets) {
                completionService.submit(() -> doSearch(url, keyword));
                pendingTasks++;
            }

            // 超时控制
            long endTime = System.currentTimeMillis() + 30000;

            while (pendingTasks > 0) {
                long timeLeft = endTime - System.currentTimeMillis();
                if (timeLeft <= 0) break;

                try {
                    long wait = globalResults.isEmpty() ? 8000 : 50;
                    if (wait > timeLeft) wait = timeLeft;

                    java.util.concurrent.Future<List<DanmakuItem>> future =
                            completionService.poll(wait, TimeUnit.MILLISECONDS);
                    if (future != null) {
                        List<DanmakuItem> res = future.get();
                        pendingTasks--;

                        if (res != null && !res.isEmpty()) {
                            // 过滤结果
                            java.util.Iterator<DanmakuItem> it = res.iterator();
                            while (it.hasNext()) {
                                DanmakuItem item = it.next();
                                if (!item.title.contains(keyword) && !keyword.contains(item.title)) {
                                    String kClean = keyword.replaceAll("\\s+", "");
                                    String tClean = item.title.replaceAll("\\s+", "");
                                    if (!tClean.contains(kClean) && !kClean.contains(tClean)) {
                                        it.remove();
                                    }
                                }
                            }

                            if (!res.isEmpty()) {
                                DanmakuSpider.log("找到弹幕结果: " + res.size() + " 个");
                                globalResults.addAll(res);
                            }
                        }
                    } else {
                        if (!globalResults.isEmpty()) break;
                    }
                } catch (Exception e) {
                    pendingTasks--;
                }
            }
        } catch (Exception e) {
            DanmakuSpider.log("搜索异常: " + e.getMessage());
        }

        // 将List转换为ConcurrentMap
        ConcurrentHashMap<Integer, DanmakuItem> resultMap = new ConcurrentHashMap<>();
        for (DanmakuItem item : globalResults) {
            resultMap.put(item.getEpId(), item);
        }
        DanmakuSpider.lastDanmakuItemMap = resultMap;

        return globalResults;
    }

    // 执行搜索
    private static List<DanmakuItem> doSearch(String apiBase, String keyword) {
        List<DanmakuItem> list = new ArrayList<>();
        try {
            // 尝试多种API路径
            String searchUrl = apiBase + "/api/v2/search/episodes?anime=" + 
                URLEncoder.encode(keyword, "UTF-8");
            DanmakuSpider.log("搜索URL: " + searchUrl);
            
            String json = NetworkUtils.robustHttpGet(searchUrl);
            
            // 回退到旧API
            if (TextUtils.isEmpty(json)) {
                searchUrl = apiBase + "/search/episodes?anime=" + 
                    URLEncoder.encode(keyword, "UTF-8");
                DanmakuSpider.log("回退搜索URL: " + searchUrl);
                json = NetworkUtils.robustHttpGet(searchUrl);
            }
            
            if (TextUtils.isEmpty(json)) {
                DanmakuSpider.log("搜索响应为空");
                return list;
            }

            // 解析JSON
            JSONArray array = null;
            JSONObject rootOpt = null;
            
            if (json.trim().startsWith("[")) {
                array = new JSONArray(json);
            } else {
                rootOpt = new JSONObject(json);
                if (rootOpt.has("episodes")) array = rootOpt.optJSONArray("episodes");
                else if (rootOpt.has("animes")) array = rootOpt.optJSONArray("animes");
            }
            
            if (array == null) {
                DanmakuSpider.log("未找到episodes/animes数组");
                return list;
            }
            
            // 判断数据结构
            boolean isAnimeList = false;
            if (array.length() > 0) {
                JSONObject first = array.optJSONObject(0);
                if (first != null && first.has("episodes") && !first.has("episodeId")) {
                    isAnimeList = true;
                }
                if (rootOpt != null && rootOpt.has("animes")) {
                    isAnimeList = true;
                }
            }
            
            if (isAnimeList) {
                // 嵌套结构
                for (int i = 0; i < array.length(); i++) {
                    JSONObject anime = array.optJSONObject(i);
                    String animeTitle = anime.optString("animeTitle");
                    if (TextUtils.isEmpty(animeTitle)) animeTitle = anime.optString("title");
                    
                    JSONArray eps = anime.optJSONArray("episodes");
                    if (eps != null) {
                        for (int j = 0; j < eps.length(); j++) {
                            JSONObject ep = eps.optJSONObject(j);
                            processEpisode(ep, animeTitle, apiBase, list);
                        }
                    }
                }
            } else {
                // 扁平结构
                for (int i = 0; i < array.length(); i++) {
                    JSONObject ep = array.optJSONObject(i);
                    processEpisode(ep, null, apiBase, list);
                }
            }
        } catch (Exception e) {
            DanmakuSpider.log("搜索解析错误: " + e.getMessage());
            e.printStackTrace();
        }
        
        return list;
    }
    
    // 处理单集数据
    private static void processEpisode(JSONObject ep, String forcedTitle, String apiBase, List<DanmakuItem> list) {
        String animeTitle = forcedTitle;
        if (TextUtils.isEmpty(animeTitle)) animeTitle = ep.optString("animeTitle");
        if (TextUtils.isEmpty(animeTitle)) animeTitle = ep.optString("title");
        if (TextUtils.isEmpty(animeTitle)) animeTitle = ep.optString("name");
        
        String epTitle = ep.optString("episodeTitle");
        if (TextUtils.isEmpty(epTitle)) epTitle = ep.optString("epTitle");
        
        int epId = ep.optInt("episodeId", ep.optInt("epId", ep.optInt("id")));
        
        if (TextUtils.isEmpty(animeTitle)) {
            return;
        }
        
        DanmakuItem item = new DanmakuItem();
        item.title = animeTitle;
        item.epTitle = epTitle;
        item.epId = epId;
        item.apiBase = apiBase;

        String[] parts = animeTitle.split("(?i)from"); // 使用不区分大小写的正则表达式
        if (parts.length > 1) {
            String fromPart = parts[1].trim();
            if (!fromPart.isEmpty()) { // 额外检查分割后的部分是否为空
                item.from = fromPart;
                item.animeTitle = parts[0].trim();
            }
        }


        // 清理标题
        String temp = epTitle.replace(animeTitle, "");
        temp = temp.replaceAll("【.*?】", "").replaceAll("\\[.*?\\]", "").trim();
        if (temp.startsWith("-") || temp.startsWith("_")) {
            temp = temp.substring(1).trim();
        }
        
        item.shortTitle = temp;
        if (TextUtils.isEmpty(item.shortTitle)) {
            item.shortTitle = epTitle;
        }
        
        list.add(item);
    }
    
    // 自动搜索
    public static boolean autoSearch(EpisodeInfo episodeInfo, Activity activity) {
        if (TextUtils.isEmpty(episodeInfo.getEpisodeName())) return false;

        final boolean[] found = {false};
        final Object lock = new Object();

        activity.runOnUiThread(() -> Toast.makeText(activity, "开始自动搜索弹幕", Toast.LENGTH_LONG).show());
        DanmakuSpider.log("开始自动搜索弹幕：" + episodeInfo.getEpisodeName());

        // 20秒超时
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            synchronized (lock) {
                if (!found[0]) {
                    activity.runOnUiThread(() -> {
                        DanmakuSpider.log("自动搜索超时（20秒）");
//                        Toast.makeText(activity, "自动搜索超时（20秒）", Toast.LENGTH_SHORT).show();
                    });
                    lock.notify();
                }
            }
        }, 20000);

        new Thread(() -> {
            try {
                if (TextUtils.isEmpty(episodeInfo.getEpisodeName())) {
                    synchronized (lock) {
                        lock.notify();
                    }
                    return;
                }

                DanmakuSpider.log("自动搜索关键词: '" + episodeInfo.getEpisodeName());
                List<DanmakuItem> results = searchDanmaku(episodeInfo.getEpisodeName(), activity);

                if (!results.isEmpty()) {
                    int matchedIndex = -1;
                    for (int i = 0; i < results.size(); i++) {
                        DanmakuItem item = results.get(i);

                        boolean isMatch = true;

                        // 检查年份匹配
                        if (!TextUtils.isEmpty(episodeInfo.getEpisodeYear())) {
                            if (!item.title.contains(episodeInfo.getEpisodeYear())) {
                                isMatch = false;
                            }
                        }

                        // 如果年份匹配成功或没有年份信息，检查集数匹配
                        if (isMatch && !TextUtils.isEmpty(episodeInfo.getEpisodeNum())) {
                            String episodeNum = episodeInfo.getEpisodeNum();
                            try {
                                int epNum = Integer.parseInt(episodeNum);
                                String formattedEpTitle = String.format("第%s集", epNum);
                                if (!item.epTitle.contains(formattedEpTitle)) {
                                    isMatch = false;
                                }
                            } catch (NumberFormatException e) {
                                DanmakuSpider.log("集数格式错误: " + episodeNum);
                                isMatch = false;
                            }
                        }

                        if (isMatch) {
                            matchedIndex = i;
                            break; // 找到匹配项，立即退出循环
                        }
                    }

                    // 如果找到匹配项，使用匹配项；否则使用第一条
                    DanmakuItem selectedItem;
                    if (matchedIndex != -1) {
                        selectedItem = results.get(matchedIndex);
                        DanmakuSpider.log("🎯 找到匹配的弹幕项: " + selectedItem.title + " - " + selectedItem.epTitle);
                    } else {
                        selectedItem = results.get(0); // 使用第一条作为默认选项
                        DanmakuSpider.log("⚠️ 未找到精确匹配，使用第一条结果: " + selectedItem.title + " - " + selectedItem.epTitle);
                    }

                    DanmakuSpider.log("🎯 自动搜索找到结果: " + selectedItem);

                    // 立即记录弹幕URL（在推送前）
                    DanmakuSpider.recordDanmakuUrl(selectedItem, true);

                    found[0] = true;

                    pushDanmakuDirect(selectedItem, activity, true);
                } else {
                    DanmakuSpider.log("自动搜索未找到任何结果");
                    // 显示提示
                    activity.runOnUiThread(() -> Toast.makeText(activity, "自动搜索未找到弹幕，请手动搜索", Toast.LENGTH_LONG).show());
                }

                synchronized (lock) {
                    lock.notify();
                }
            } catch (Exception e) {
                DanmakuSpider.log("自动搜索异常: " + e.getMessage());
                synchronized (lock) {
                    lock.notify();
                }
            }
        }).start();

        // 等待结果
        synchronized (lock) {
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return found[0];
    }
    
    // 手动搜索
    public static List<DanmakuItem> manualSearch(String keyword, Activity activity) {
        List<DanmakuItem> results = new ArrayList<>();
        
        if (TextUtils.isEmpty(keyword)) return results;
        
        try {
            String cleanKeyword = DanmakuUtils.extractTitle(keyword);
            if (!TextUtils.isEmpty(cleanKeyword)) {
                results = searchDanmaku(cleanKeyword, activity);
            }
        } catch (Exception e) {
            DanmakuSpider.log("手动搜索失败: " + e.getMessage());
        }
        
        return results;
    }
    
    // 直接推送弹幕URL
    public static void pushDanmakuDirect(DanmakuItem danmakuItem, Activity activity, boolean isAuto) {
        // 防重复推送检查
        long currentTime = System.currentTimeMillis();
        if (currentTime - lastPushTime < PUSH_MIN_INTERVAL) {
            DanmakuSpider.log("⚠️ 推送过于频繁，跳过本次推送: " + danmakuItem.getDanmakuUrl());
            return;
        }
        lastPushTime = currentTime;
        // 记录弹幕URL（这个可以在主线程执行）
        DanmakuSpider.recordDanmakuUrl(danmakuItem, isAuto);

        // 在网络请求前检查是否在主线程
        boolean isMainThread = Looper.myLooper() == Looper.getMainLooper();
        if (isMainThread) {
            DanmakuSpider.log("警告：推送弹幕在主线程调用，切换到子线程");
            // 切换到子线程执行
            new Thread(() -> pushDanmakuInThread(danmakuItem, activity)).start();
        } else {
            // 已经在子线程，直接执行
            DanmakuSpider.log("已经在子线程，直接执行弹幕推送");

            pushDanmakuInThread(danmakuItem, activity);
        }
    }

    // 单独的网络推送方法，确保在子线程中执行
    private static void pushDanmakuInThread(DanmakuItem danmakuItem, Activity activity) {
        try {
            if (TextUtils.isEmpty(danmakuItem.getDanmakuUrl())) {
                DanmakuSpider.log("推送弹幕URL为空");
                return;
            }

            DanmakuSpider.apiUrl = danmakuItem.getApiBase();

            String localIp = NetworkUtils.getLocalIpAddress();
            String pushUrl = "http://" + localIp + ":9978/action?do=refresh&type=danmaku&path=" +
                    URLEncoder.encode(danmakuItem.getDanmakuUrl(), "UTF-8");
            DanmakuSpider.log("推送地址: " + pushUrl);

            String resp = "";
            for (int i = 0; i < 3; i++) {
                resp = NetworkUtils.robustHttpGet(pushUrl);
                if (!TextUtils.isEmpty(resp) && resp.toLowerCase().contains("ok")) {
                    break;
                }
                if (i < 2) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                    }
                }
            }

            DanmakuSpider.log("推送弹幕到TVBox: " + danmakuItem.getDanmakuUrl() + " 响应: " + resp);

            // 在主线程显示Toast
            if (activity != null && !activity.isFinishing()) {
                final String finalResp = resp;
                activity.runOnUiThread(() -> {
                    if (!TextUtils.isEmpty(finalResp) && finalResp.toLowerCase().contains("ok")) {
                        Toast.makeText(activity, "Leo弹幕已推送：" + String.format("%s - %s", danmakuItem.getTitle(), danmakuItem.getEpTitle()), Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(activity, "推送失败: " + finalResp, Toast.LENGTH_SHORT).show();
                    }
                });
            }
        } catch (Exception e) {
            DanmakuSpider.log("推送失败: " + e.getMessage());
            if (activity != null && !activity.isFinishing()) {
                activity.runOnUiThread(() -> Toast.makeText(activity, "推送异常", Toast.LENGTH_SHORT).show());
            }
        }
    }
}