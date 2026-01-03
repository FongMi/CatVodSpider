package com.github.catvod.spider;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.github.catvod.bean.danmu.DanmakuItem;
import com.github.catvod.bean.tv.Media;
import com.github.catvod.danmu.SharedPreferencesService;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DanmakuScanner {

    public static String lastDetectedTitle = "";

    private static String currentSeriesName = "";
    private static String currentEpisodeNum = "";
    private static long lastEpisodeChangeTime = 0;
    private static final long MIN_EPISODE_CHANGE_INTERVAL = 1000;

    // 视频播放状态
    private static boolean isVideoPlaying = false;
    private static long videoPlayStartTime = 0;
    private static final long MIN_PLAY_DURATION_BEFORE_PUSH = 2000; // 至少播放2秒再推送
    private static final long FORCE_PUSH_TIMEOUT = 10000; // 10秒后强制推送
    private static final long MAX_WAIT_FOR_PLAYBACK = 15000; // 最多等待15秒

    // View ID 生成器（兼容低版本Android）
    private static int nextViewId = 10000;

    // 延迟推送队列
    private static class PendingPush {
        DanmakuItem danmakuItem;
        Activity activity;
        String title;
        long scheduleTime;
        boolean isForcedPush = false; // 标记是否为强制推送

        PendingPush(DanmakuItem danmakuItem, Activity activity, String title, long scheduleTime) {
            this.danmakuItem = danmakuItem;
            this.activity = activity;
            this.title = title;
            this.scheduleTime = scheduleTime;
        }
    }

    private static final Map<String, PendingPush> pendingPushes = new HashMap<>();
    private static final Map<String, Long> lastPushTime = new HashMap<>();

    private static boolean isFirstDetection = true;

    // Hook相关
    private static Timer hookTimer;
    private static volatile boolean isMonitoring = false;
    private static Timer playbackCheckTimer;

    // 主线程Handler
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());
    private static Runnable delayedPushTask = null;

    // 正则表达式
    private static final Pattern EPISODE_PATTERN = Pattern.compile(
            "(?:第\\s*([零一二三四五六七八九十百千万0-9]+)\\s*[集话章回])|" +
                    "(?:[Ee][Pp]?\\s*([0-9]+))|" +
                    "(?:[Ss]([0-9]+)[Ee]([0-9]+))|" +
                    "(?:\\b([0-9]{1,3})\\b)"
    );

    private static final Pattern SERIES_NAME_PATTERN = Pattern.compile(
            "([^0-9:：\\[\\]【】()（）\\-—~～]+?)\\s*[:：\\[\\]【】()（）\\-—~～]*\\s*[0-9]"
    );

    // 启动Hook监控
    public static void startHookMonitor() {
        if (hookTimer != null || isMonitoring) {
            DanmakuSpider.log("⚠️ Hook监控已在运行中");
            return;
        }

        DanmakuSpider.log("🚀 启动Hook监控");
        isMonitoring = true;
        isFirstDetection = true;

        hookTimer = new Timer("DanmakuHookTimer", true);
        hookTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                try {
                    Activity act = DanmakuSpider.getTopActivity();
                    if (act != null && !act.isFinishing()) {
                        // 检查是否是播放界面
                        String className = act.getClass().getName().toLowerCase();
                        if (isPlayerActivity(className)) {
//                            DanmakuSpider.log("[Monitor] 检测到播放界面: " + className);

                            // 注入Leo弹幕按钮
                            mainHandler.post(new Runnable() {
                                @Override
                                public void run() {
                                    try {
                                        synchronized (DanmakuScanner.class) {
                                            injectLeoButton(act);
                                        }
                                    } catch (Exception e) {
                                        DanmakuSpider.log("❌ 按钮注入异常: " + e.getMessage());
                                    }
                                }
                            });

                            // 检查播放状态
//                            checkPlaybackStatus(act);

                            // Hook获取标题
//                            String newTitle = extractTitleFromView(act.getWindow().getDecorView());
                            String mediaJson = NetworkUtils.robustHttpGet("http://127.0.0.1:9978/media");
                            if (TextUtils.isEmpty(mediaJson) || mediaJson.equals("{}")) {
                                return;
                            }
//                            DanmakuSpider.log("[Monitor] mediaJson: " + mediaJson);

                            Gson gson = new Gson();
                            Media mediaEntity = gson.fromJson(mediaJson, Media.class);

                            if (TextUtils.isEmpty(mediaEntity.getUrl())) {
                                return;
                            }

                            isVideoPlaying = mediaEntity.getState() == 3 || mediaEntity.getState() == 2;

                            if (isVideoPlaying) {
                                // 视频开始播放
                                videoPlayStartTime = System.currentTimeMillis();
                                DanmakuSpider.log("▶️ 检测到视频开始播放");
                            } else {
                                // 视频停止播放
                                DanmakuSpider.log("⏸️ 检测到视频停止播放");

                                // 清空缓存和队列
                                pendingPushes.clear();
                                lastPushTime.clear();

                                return;
                            }

                            processDetectedTitle(mediaEntity, act);
                        } else {
                            // 不在播放界面，重置播放状态
                            resetPlaybackStatus();

//                            DanmakuSpider.log("不在播放界面，重置播放状态");
                        }
                    }
                } catch (Exception e) {
                    DanmakuSpider.log("❌ Hook监控异常: " + e.getMessage());
                }
            }
        }, 2000, 1500);

        // 启动播放状态检查定时器
        startPlaybackCheckTimer();
    }

    // 启动播放状态检查定时器
    private static void startPlaybackCheckTimer() {
        if (playbackCheckTimer != null) {
            playbackCheckTimer.cancel();
        }

        playbackCheckTimer = new Timer("PlaybackCheckTimer", true);
        playbackCheckTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                try {
                    // 检查是否有待推送的任务
//                    DanmakuSpider.log("检查待推送的任务数量：" + pendingPushes.size());
                    if (!pendingPushes.isEmpty()) {
                        checkAndExecutePendingPushes();
                    }
                } catch (Exception e) {
                    DanmakuSpider.log("❌ 播放检查定时器异常: " + e.getMessage());
                }
            }
        }, 2000, 2000); // 2秒后开始，每2秒检查一次
    }

    // 检查播放状态
    private static void checkPlaybackStatus(Activity activity) {
        try {
            // 这里可以尝试多种方法检测播放状态
            View root = activity.getWindow().getDecorView();
            boolean wasPlaying = isVideoPlaying;

            // 方法1：检查播放器控件
            isVideoPlaying = checkIfVideoIsPlaying(root);

            // 方法2：如果没有找到播放控件，假设视频在播放（避免无法检测的情况）
//            if (!isVideoPlaying && !pendingPushes.isEmpty()) {
//                // 如果有待推送任务且未检测到播放状态，假设视频在播放
//                // 这样可以避免因播放状态检测失败而卡住
//                DanmakuSpider.log("⚠️ 未检测到播放控件，假设视频在播放");
//                isVideoPlaying = true;
//                videoPlayStartTime = System.currentTimeMillis();
//            }

            if (isVideoPlaying && !wasPlaying) {
                // 视频开始播放
                videoPlayStartTime = System.currentTimeMillis();
                DanmakuSpider.log("▶️ 检测到视频开始播放");
            } else if (!isVideoPlaying && wasPlaying) {
                // 视频停止播放
                DanmakuSpider.log("⏸️ 检测到视频停止播放");
                DanmakuSpider.currentVideoSignature = "";
                DanmakuSpider.lastVideoDetectedTime = 0;
                DanmakuSpider.lastDanmakuId = -1;
                DanmakuSpider.resetAutoSearch();
                currentSeriesName = "";
                currentEpisodeNum = "";
                lastEpisodeChangeTime = 0;
                videoPlayStartTime = 0;

                // 清空缓存和队列
                pendingPushes.clear();
                lastPushTime.clear();
            }
        } catch (Exception e) {
            // 忽略检查错误，假设视频在播放
            if (!pendingPushes.isEmpty()) {
                DanmakuSpider.log("⚠️ 播放状态检查异常，假设视频在播放");
                isVideoPlaying = true;
                videoPlayStartTime = System.currentTimeMillis();
            }
        }
    }

    // 检查视频是否在播放
    private static boolean checkIfVideoIsPlaying(View view) {
        // 查找播放器控制UI元素
        if (view instanceof TextView) {
            TextView tv = (TextView) view;
            String text = tv.getText().toString().toLowerCase();
            // 播放器可能显示当前播放时间，如"01:23 / 45:67"
            if (text.matches("\\d{1,2}:\\d{2}\\s*/\\s*\\d{1,2}:\\d{2}") ||
                    text.matches("\\d{1,2}:\\d{2}:\\d{2}\\s*/\\s*\\d{1,2}:\\d{2}:\\d{2}")) {
                return true;
            }
        }

        if (view instanceof ViewGroup) {
            ViewGroup group = (ViewGroup) view;
            for (int i = 0; i < group.getChildCount(); i++) {
                if (checkIfVideoIsPlaying(group.getChildAt(i))) {
                    return true;
                }
            }
        }

        return false;
    }

    // 重置播放状态
    private static void resetPlaybackStatus() {
        DanmakuSpider.currentVideoSignature = "";
        DanmakuSpider.lastVideoDetectedTime = 0;
        DanmakuSpider.lastDanmakuId = -1;
        currentSeriesName = "";
        currentEpisodeNum = "";
        lastEpisodeChangeTime = 0;
        isVideoPlaying = false;
        videoPlayStartTime = 0;
    }

    // 检查并执行待推送任务
    private static void checkAndExecutePendingPushes() {
        long currentTime = System.currentTimeMillis();

        for (Map.Entry<String, PendingPush> entry : pendingPushes.entrySet()) {
            PendingPush push = entry.getValue();
            String key = entry.getKey();

            // 计算等待时间
            long waitTime = currentTime - push.scheduleTime;

            // 检查是否超时（超过最大等待时间）
            if (waitTime > MAX_WAIT_FOR_PLAYBACK) {
                DanmakuSpider.log("⏰ 推送任务超时（" + waitTime + "ms > " + MAX_WAIT_FOR_PLAYBACK + "ms），取消: " + key);
                pendingPushes.remove(key);
                continue;
            }

            // 检查是否达到强制推送时间（10秒）
            boolean shouldForcePush = waitTime >= FORCE_PUSH_TIMEOUT && !push.isForcedPush;

            if (shouldForcePush) {
                DanmakuSpider.log("🚨 等待" + waitTime + "ms未检测到播放状态，强制推送: " + key);
                push.isForcedPush = true;
                executePendingPush(push, true);
                pendingPushes.remove(key);
                continue;
            }

            // 检查视频是否在播放
            if (isVideoPlaying) {
                // 检查是否播放了足够长时间
                long playDuration = currentTime - videoPlayStartTime;
                if (playDuration >= MIN_PLAY_DURATION_BEFORE_PUSH) {
                    DanmakuSpider.log("✅ 视频已播放" + playDuration + "ms，执行推送: " + key);
                    executePendingPush(push, false);
                    pendingPushes.remove(key);
                } else {
                    DanmakuSpider.log("⏳ 视频播放中(" + playDuration + "ms)，等待达到" + MIN_PLAY_DURATION_BEFORE_PUSH + "ms");
                }
            } else {
                DanmakuSpider.log("⏸️ 视频未播放，已等待" + waitTime + "ms，还剩" + (FORCE_PUSH_TIMEOUT - waitTime) + "ms将强制推送");
            }
        }
    }

    // 执行待推送任务
    private static void executePendingPush(PendingPush push, boolean isForced) {
        if (push.activity == null || push.activity.isFinishing()) {
            DanmakuSpider.log("⚠️ Activity无效，取消推送");
            return;
        }

        DanmakuSpider.log("🚀 开始执行" + (isForced ? "强制" : "") + "推送: " + push.danmakuItem.getDanmakuUrl());

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    LeoDanmakuService.pushDanmakuDirect(push.danmakuItem, push.activity, true);

                    // 记录推送时间，防止重复推送
                    lastPushTime.put(push.danmakuItem.getDanmakuUrl(), System.currentTimeMillis());
                } catch (Exception e) {
                    DanmakuSpider.log("❌ 推送失败: " + e.getMessage());
                }
            }
        }).start();
    }

    // 停止Hook监控
    public static void stopHookMonitor() {
        isMonitoring = false;

        // 取消延迟任务
        if (delayedPushTask != null) {
            mainHandler.removeCallbacks(delayedPushTask);
            delayedPushTask = null;
        }

        if (hookTimer != null) {
            hookTimer.cancel();
            hookTimer = null;
        }

        if (playbackCheckTimer != null) {
            playbackCheckTimer.cancel();
            playbackCheckTimer = null;
        }

        // 清空缓存和队列
        pendingPushes.clear();
        lastPushTime.clear();

        DanmakuSpider.log("🛑 Hook监控已停止");
    }

    // 判断是否为播放界面
    private static boolean isPlayerActivity(String className) {
        return className.contains("videoactivity");

//        return className.contains("player") || className.contains("video") ||
//                className.contains("detail") || className.contains("play") ||
//                className.contains("media") || className.contains("movie") ||
//                className.contains("tv") || className.contains("film");
    }

    // 处理检测到的标题
    private static void processDetectedTitle(Media media, Activity activity) {
        lastDetectedTitle = media.getTitle();

        // 提取剧集信息
        String seriesName = extractSeriesName(media.getTitle());
        String episodeNum = extractEpisodeNum(media.getArtist());
        // 优先从剧集名中提取
        String year = extractYear(media.getArtist());
        if (TextUtils.isEmpty(year)) {
            year = extractYear2(media.getTitle());
        }
        String seasonNum = extractSeasonNum(media.getArtist());

        EpisodeInfo episodeInfo = new EpisodeInfo();
        episodeInfo.setEpisodeNum(episodeNum);
        episodeInfo.setEpisodeName(SharedPreferencesService.getSearchKeywordCache(activity, cleanTitle(media.getTitle())));
        episodeInfo.setEpisodeYear(year);
        episodeInfo.setEpisodeSeasonNum(seasonNum);
        episodeInfo.setSeriesName(seriesName);
        episodeInfo.setFileName(media.getArtist().replace("正在播放：", ""));

        DanmakuSpider.log("🎬 剧集名: " + seriesName + ", 年份: " + year + ", 季数: " + seasonNum + ", 集数: " + episodeNum);

        // 生成视频签名
        String newSignature = generateSignature(episodeInfo);

//        DanmakuSpider.log("🔑 视频签名: " + newSignature);

        // 检查是否为同一个视频
        boolean isSameVideo = isSameVideo(DanmakuSpider.currentVideoSignature, newSignature);;

        if (!isSameVideo) {
            // 不同的视频
            DanmakuSpider.currentVideoSignature = newSignature;
            DanmakuSpider.lastVideoDetectedTime = System.currentTimeMillis();

            handleEpisodeChange(episodeInfo, activity);
        } else {
            // 同一个视频，忽略重复触发
//            DanmakuSpider.log("✅ 检测到同一个视频，忽略重复触发");
        }
    }

    // 生成签名
    private static String generateSignature(EpisodeInfo episodeInfo) {
        return episodeInfo.getEpisodeName() + "|" + episodeInfo.getFileName();
    }

    // 判断是否为同一个视频
    private static boolean isSameVideo(String sig1, String sig2) {
        if (TextUtils.isEmpty(sig1) || TextUtils.isEmpty(sig2)) {
            return false;
        }
        return sig1.equals(sig2);
    }

    // 清理标题
    private static String cleanTitle(String title) {
        if (TextUtils.isEmpty(title)) {
            return "";
        }

        DanmakuSpider.log("🔍 清理前标题: " + title);

        // 先处理括号部分 - 同时处理中文和英文括号
        int bracketIndex = title.indexOf("（");
        int englishBracketIndex = title.indexOf("(");

        // 找到最小的括号位置（最先出现的）
        int minIndex = Integer.MAX_VALUE;
        if (bracketIndex != -1) {
            minIndex = Math.min(minIndex, bracketIndex);
        }
        if (englishBracketIndex != -1) {
            minIndex = Math.min(minIndex, englishBracketIndex);
        }

        if (minIndex != Integer.MAX_VALUE) {
            title = title.substring(0, minIndex);
        }

        // 再处理空格部分
        int spaceIndex = title.lastIndexOf(" ");
        if (spaceIndex != -1) {
            title = title.substring(0, spaceIndex);
        }

        DanmakuSpider.log("🧹 清理后标题: " + title);

        return title;
    }


    // 提取剧集名
    private static String extractSeriesName(String title) {
        if (TextUtils.isEmpty(title)) {
            return "";
        }

        // 尝试匹配剧集名模式
        Matcher matcher = SERIES_NAME_PATTERN.matcher(title);
        if (matcher.find()) {
            String seriesName = matcher.group(1);
            if (seriesName != null) {
                seriesName = seriesName.trim();
                // 清理结尾的标点
                seriesName = seriesName.replaceAll("[:：\\-—~～\\[\\]【】()（）]+$", "");
                return seriesName;
            }
        }

        // 如果找不到模式，尝试提取数字前的部分
        String[] parts = title.split("[:：\\-—~～]");
        if (parts.length > 0) {
            String firstPart = parts[0].trim();
            // 移除末尾的数字
            firstPart = firstPart.replaceAll("\\s+\\d+$", "");
            if (!TextUtils.isEmpty(firstPart)) {
                return firstPart;
            }
        }

        // 最后手段：移除所有数字和标点
        return title
                .replaceAll("\\d+", "")
                .replaceAll("[:：\\-—~～\\[\\]【】()（）]+", " ")
                .replaceAll("\\s+", " ")
                .trim();
    }

    // 提取集数
    private static String extractEpisodeNum(String title) {
        if (TextUtils.isEmpty(title)) {
            return "";
        }

        // 优先级1: 匹配 S01E03 或 S01-E03 等格式
        Pattern specificPattern = Pattern.compile("[Ss](?:[0-9]+)?[Ee]([0-9]+)");
        Matcher matcher = specificPattern.matcher(title);
        if (matcher.find()) {
//            DanmakuSpider.log("匹配S01E03格式: " + matcher.group(1));
            return matcher.group(1);
        }

        // 优先级2: 匹配 "第XX集" 格式
        Pattern chinesePattern = Pattern.compile("第\\s*([零一二三四五六七八九十百千万0-9]+)\\s*[集话章回]");
        matcher = chinesePattern.matcher(title);
        if (matcher.find()) {
//            DanmakuSpider.log("匹配中文集数: " + matcher.group(1));
            return convertChineseNumberToArabic(matcher.group(1));
        }

        // 优先级3: 匹配 EP03 格式
        Pattern epPattern = Pattern.compile("[Ee][Pp]?\\s*([0-9]+)");
        matcher = epPattern.matcher(title);
        if (matcher.find()) {
//            DanmakuSpider.log("匹配EP03格式: " + matcher.group(1));
            return matcher.group(1);
        }

        // 优先级4: 匹配点分隔格式 S01.E03
        Pattern dottedPattern = Pattern.compile("[Ss](?:[0-9]+)?[\\.\\-\\s]*[Ee]([0-9]+)");
        matcher = dottedPattern.matcher(title);
        if (matcher.find()) {
//            DanmakuSpider.log("匹配点分隔格式: " + matcher.group(1));
            return matcher.group(1);
        }

        // 优先级5: 匹配后缀式 E03 格式
        Pattern suffixPattern = Pattern.compile("\\.E([0-9]{1,3})(?:\\.|\\b|[^0-9])");
        matcher = suffixPattern.matcher(title);
        if (matcher.find()) {
//            DanmakuSpider.log("匹配后缀式 E03 格式: " + matcher.group(1));
            return matcher.group(1);
        }

        // 优先级6: 匹配带括号或方括号的数字（如 [02] 或 (02)）- 提高优先级
        Pattern bracketPattern = Pattern.compile("[\\[\\(]([0-9]{1,3})[\\]\\)]");
        matcher = bracketPattern.matcher(title);
        if (matcher.find()) {
            String num = matcher.group(1);
            if (num != null && num.length() >= 1 && num.length() <= 3) {
//            DanmakuSpider.log("匹配括号格式: " + num);
                return num;
            }
        }

        // 优先级7: 匹配文件名格式，如 02.1080p 或 02.720p 等，但排除画质标识如 4K
        // 改进的文件名格式匹配：匹配数字.分辨率格式，但不匹配数字.画质格式
        Pattern filenamePattern = Pattern.compile("\\b([0-9]{1,3})\\.(?:[0-9]{3,4}[pP]|HD|SD|720|1080|480)(?:\\b|\\D)");
        matcher = filenamePattern.matcher(title);
        if (matcher.find()) {
            String num = matcher.group(1);
            if (num != null && num.length() >= 1 && num.length() <= 3) {
//            DanmakuSpider.log("匹配文件名格式: " + num);
                return num;
            }
        }

        // 优先级8: 匹配前面有字母或标识的数字（如 E02, V02 等）
        Pattern letterPrefixPattern = Pattern.compile("[A-Za-z]([0-9]{1,3})(?:\\b|\\D)");
        matcher = letterPrefixPattern.matcher(title);
        if (matcher.find()) {
            String num = matcher.group(1);
            if (num != null && num.length() >= 1 && num.length() <= 3) {
//            DanmakuSpider.log("匹配字母前缀格式: " + num);
                return num;
            }
        }

        // 优先级9: 最后才匹配通用数字（优先级最低），但要排除文件大小、画质标识
        // 优化：排除常见的文件大小、画质、版本等标识
        Pattern numPattern = Pattern.compile("\\b([0-9]{1,3})\\b(?!(?:K|k|KB|MB|GB|\\.[0-9]+[MK]|\\d+\\.\\d+[MK]|p|P|hd|HD|sd|SD|4k|4K|2k|2K|fps|FPS|[xX][0-9]+|[0-9]+[xX][0-9]+))");
        matcher = numPattern.matcher(title);
        if (matcher.find()) {
            String num = matcher.group(1);
            if (num != null && num.length() >= 1 && num.length() <= 3) {
                // 额外检查：确保不是文件大小的一部分（如 974.24M 中的 974）
                String fullMatch = matcher.group(0);
                int matchStart = matcher.start();
                int matchEnd = matcher.end();

                // 检查数字前后是否包含文件大小标识
                boolean isFileSize = false;
                if (matchEnd < title.length()) {
                    String after = title.substring(matchEnd);
                    if (after.matches("^\\.?[0-9]*[MKGT][a-zA-Z]?")) { // 匹配 .24M, M, K 等
                        isFileSize = true;
                    }
                }

                if (!isFileSize) {
//            DanmakuSpider.log("最后才匹配通用数字（优先级最低）: " + num);
                    return num;
                }
            }
        }

        return "";
    }

    // 提取剧集年份
    private static String extractYear(String title) {
        if (TextUtils.isEmpty(title)) {
            return "";
        }

        // 匹配常见的年份格式
        Pattern yearPattern = Pattern.compile("(19|20)\\d{2}");
        Matcher matcher = yearPattern.matcher(title);

        if (matcher.find()) {
            return matcher.group();
        }

        return "";
    }

    // 提取剧集年份
    private static String extractYear2(String title) {
        if (TextUtils.isEmpty(title)) {
            return "";
        }

        // 匹配（xxxx）格式的年份，支持中文或英文括号
        Pattern bracketPattern = Pattern.compile("[（\\(](20\\d{2}|19\\d{2})[）\\)]");
        Matcher bracketMatcher = bracketPattern.matcher(title);
        if (bracketMatcher.find()) {
            return bracketMatcher.group(1);
        }

        // 匹配空格后的年份格式
        Pattern spacePattern = Pattern.compile("\\s(20\\d{2}|19\\d{2})(?!\\d)");
        Matcher spaceMatcher = spacePattern.matcher(title);
        if (spaceMatcher.find()) {
            return spaceMatcher.group(1);
        }

        return "";
    }




    // 提取剧集季数
    private static String extractSeasonNum(String title) {
        if (TextUtils.isEmpty(title)) {
            return "";
        }

        // 匹配 S01、Season 01、S1 等季数格式
        Pattern seasonPattern = Pattern.compile("[Ss](?:eason)?\\s*(\\d{1,2})");
        Matcher matcher = seasonPattern.matcher(title);

        if (matcher.find()) {
            return matcher.group(1);
        }

        return "";
    }


    // 中文数字转阿拉伯数字
    private static String convertChineseNumberToArabic(String chineseNum) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('零', 0);
        map.put('一', 1);
        map.put('二', 2);
        map.put('三', 3);
        map.put('四', 4);
        map.put('五', 5);
        map.put('六', 6);
        map.put('七', 7);
        map.put('八', 8);
        map.put('九', 9);
        map.put('十', 10);
        map.put('百', 100);
        map.put('千', 1000);
        map.put('万', 10000);

        try {
            if (chineseNum.matches("[零一二三四五六七八九十百千万]+")) {
                int result = 0;
                int temp = 0;
                int lastUnit = 1;

                for (int i = chineseNum.length() - 1; i >= 0; i--) {
                    char c = chineseNum.charAt(i);
                    if (map.containsKey(c)) {
                        int value = map.get(c);
                        if (value >= 10) { // 单位
                            if (value > lastUnit) {
                                lastUnit = value;
                                if (temp == 0) temp = 1;
                                result += temp * value;
                                temp = 0;
                            } else {
                                lastUnit = value;
                                temp = temp == 0 ? value : temp * value;
                            }
                        } else { // 数字
                            temp += value;
                        }
                    }
                }
                result += temp;
                return String.valueOf(result);
            }
        } catch (Exception e) {
            // 转换失败，尝试直接解析数字
        }

        // 尝试直接解析为数字
        try {
            return String.valueOf(Integer.parseInt(chineseNum));
        } catch (NumberFormatException e) {
            return chineseNum;
        }
    }

    // 处理换集检测
    private static void handleEpisodeChange(EpisodeInfo episodeInfo, Activity activity) {
        long currentTime = System.currentTimeMillis();

        // 检查是否有有效的剧集名
        if (TextUtils.isEmpty(episodeInfo.getSeriesName())) {
            DanmakuSpider.log("⚠️ 未检测到剧集名，不进行换集检测");
            return;
        }

        // 检查是否是同一个剧集系列
        boolean isSameSeries = isSameSeries(currentSeriesName, episodeInfo.getSeriesName());

        if (isSameSeries) {
            // 相同剧集系列，检查集数是否变化
            if (!currentEpisodeNum.equals(episodeInfo.getEpisodeNum())) {
                long timeSinceLastChange = currentTime - lastEpisodeChangeTime;

                DanmakuSpider.log("🔄 检测到同系列换集: " + currentEpisodeNum + " -> " + episodeInfo.getEpisodeNum());
                DanmakuSpider.log("⏰ 距离上次换集: " + timeSinceLastChange + "ms");
                videoPlayStartTime = System.currentTimeMillis();

                // 尝试获取下一个弹幕URL
                DanmakuItem nextDanmakuItem = DanmakuSpider.getNextDanmakuItem(Integer.parseInt(currentEpisodeNum), Integer.parseInt(episodeInfo.getEpisodeNum()));

                if (nextDanmakuItem != null) {
                    // 更新记录
                    currentEpisodeNum = episodeInfo.getEpisodeNum();
                    lastEpisodeChangeTime = currentTime;

                    // 生成推送key
                    String pushKey = generateSignature(episodeInfo);

                    // 检查是否最近已经推送过相同的弹幕
                    Long lastPush = lastPushTime.get(nextDanmakuItem.getDanmakuUrl());
                    if (lastPush != null && (currentTime - lastPush) < 60000) {
                        DanmakuSpider.log("⚠️ 最近1分钟内已推送过相同弹幕，跳过");
                        return;
                    }

                    // 延迟推送，等待视频播放
                    scheduleDelayedPush(nextDanmakuItem, activity, episodeInfo.getEpisodeName(), pushKey);
                } else {
                    DanmakuSpider.log("⚠️ 无法直接获取下一个弹幕URL，重新查询");
                    LeoDanmakuService.autoSearch(episodeInfo, activity);                }
            } else {
                DanmakuSpider.log("✅ 同一集，忽略");
            }
        } else {
            // 不同的剧集系列，更新记录
            DanmakuSpider.log("📺 检测到新剧集系列: " + episodeInfo.getSeriesName());
            currentSeriesName = episodeInfo.getSeriesName();
            currentEpisodeNum = episodeInfo.getEpisodeNum();
            lastEpisodeChangeTime = currentTime;

            startAutoSearch(episodeInfo, activity);
        }
    }

    // 判断是否为同一个剧集系列
    private static boolean isSameSeries(String series1, String series2) {
        if (TextUtils.isEmpty(series1) || TextUtils.isEmpty(series2)) {
            return false;
        }

        // 简单的相似性检查
        String s1 = series1.replaceAll("\\s+", "");
        String s2 = series2.replaceAll("\\s+", "");

        // 如果完全相同
        if (s1.equals(s2)) {
            return true;
        }

        // 检查一个是否包含另一个
        if (s1.contains(s2) || s2.contains(s1)) {
            return true;
        }

        // 计算编辑距离（简化版）
        int minLength = Math.min(s1.length(), s2.length());
        int maxLength = Math.max(s1.length(), s2.length());

        if (minLength == 0) return false;

        // 计算相同字符比例
        int sameChars = 0;
        for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                sameChars++;
            }
        }

        double similarity = (double) sameChars / maxLength;
        return similarity > 0.7; // 相似度超过70%认为是同一系列
    }

    // 安排延迟推送
    private static void scheduleDelayedPush(DanmakuItem item, Activity activity, String title, String pushKey) {
        DanmakuSpider.log("⏰ 安排延迟推送: " + pushKey);
        DanmakuSpider.log("   item: " + item.toString());
        DanmakuSpider.log("   等待视频播放后再推送（最多等待" + FORCE_PUSH_TIMEOUT/1000 + "秒）...");

        // 添加到待推送队列
        PendingPush pendingPush = new PendingPush(item, activity, title, System.currentTimeMillis());
        pendingPushes.put(pushKey, pendingPush);
    }

    // === 修改后的按钮注入逻辑 ===

    private static void injectLeoButton(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return;
        }

//        DanmakuSpider.log("[按钮注入] 开始尝试注入按钮");

        try {
            // 先检查是否已经有Leo弹幕按钮存在
            View root = activity.getWindow().getDecorView();
            View existing = root.findViewWithTag("danmu_button");
            if (existing != null) {
//                DanmakuSpider.log("[按钮注入] 按钮已存在，跳过");
                return;
            }

            // 遍历视图树寻找合适的锚点按钮
            traverseForButton(root, 0);
        } catch (Exception e) {
            DanmakuSpider.log("[按钮注入] 异常: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // 轻量级遍历寻找按钮锚点
    private static void traverseForButton(View view, int depth) {
        if (view == null || depth > 12) return; // 增加深度限制，播放器UI可能比较深

        if (view instanceof TextView) {
            TextView tv = (TextView) view;
            CharSequence cs = tv.getText();
            if (cs != null && cs.length() > 0 && cs.length() < 20) { // 放宽长度限制
                String text = cs.toString();
                // 寻找合适的锚点按钮
                if (text.equals("字幕") || text.equals("视轨") || text.equals("音轨")) {
//                    DanmakuSpider.log("[按钮注入] 找到按钮锚点: " + text + " 深度: " + depth);
                    if (view.getParent() instanceof ViewGroup) {
                        injectButton((ViewGroup) view.getParent(), tv);
                        return; // 找到一个就返回
                    }
                }
            }
        } else if (view instanceof ViewGroup) {
            ViewGroup group = (ViewGroup) view;
            // 修剪：跳过列表控件
            if (view instanceof android.widget.ListView ||
                    view.getClass().getName().contains("RecyclerView")) {
                return;
            }

            for (int i = 0; i < group.getChildCount(); i++) {
                traverseForButton(group.getChildAt(i), depth + 1);
            }
        }
    }

    // 注入Leo弹幕按钮（原版逻辑）
    private static void injectButton(ViewGroup parent, TextView anchor) {
        try {
            View existing = parent.findViewWithTag("danmu_button");
            String anchorText = anchor.getText().toString();
            boolean isTargetAnchor = anchorText.contains("音轨");

            // 逻辑：如果已存在按钮
            if (existing != null) {
                // 如果当前锚点是"音轨"，我们重新定位按钮
                if (isTargetAnchor) {
                    ((ViewGroup) existing.getParent()).removeView(existing);
                    DanmakuSpider.log("[按钮注入] 移除旧按钮，准备重新注入");
                } else {
                    DanmakuSpider.log("[按钮注入] 按钮已存在，跳过");
                    return; // 否则不重复添加
                }
            }

            if (isInRecyclerView(parent)) {
                DanmakuSpider.log("[按钮注入] 在RecyclerView中，跳过");
                return;
            }

            TextView btn;
            if (existing != null && isTargetAnchor) {
                btn = (TextView) existing; // 复用
            } else {
                // 创建新的Leo弹幕按钮
                btn = new TextView(parent.getContext());
                btn.setText("Leo弹幕");
                btn.setTag("danmu_button");
                btn.setTextColor(anchor.getTextColors());
                btn.setTextSize(0, anchor.getTextSize());
                btn.setGravity(Gravity.CENTER);
                btn.setPadding(20, 10, 20, 10);
                btn.setSingleLine(true);

                // 修复焦点问题 - 添加必要的焦点设置
                btn.setFocusable(true);
                btn.setFocusableInTouchMode(true);
                btn.setClickable(true);

                // 设置背景（使用锚点的背景）
                if (anchor.getBackground() != null && anchor.getBackground().getConstantState() != null) {
                    btn.setBackground(anchor.getBackground().getConstantState().newDrawable());
                } else {
                    btn.setBackgroundColor(Color.parseColor("#4CAF50"));
                }

                // 按钮点击事件 - 这是核心注册逻辑
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (parent.getContext() instanceof Activity) {
                            Activity activity = (Activity) parent.getContext();
                            // 添加防抖动检查
                            long currentTime = System.currentTimeMillis();
                            if (currentTime - DanmakuSpider.lastButtonClickTime < 500) {
                                DanmakuSpider.log("[按钮点击] 防抖动：点击过于频繁");
                                return;
                            }
                            DanmakuSpider.lastButtonClickTime = currentTime;

                            DanmakuSpider.log("[按钮点击] 打开搜索对话框");
                            DanmakuUIHelper.showSearchDialog(activity, lastDetectedTitle);
                        }
                    }
                });

                // 设置长按事件（可选）
                btn.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        DanmakuSpider.safeShowToast(parent.getContext(), "Leo弹幕插件 v1.0");
                        return true;
                    }
                });
            }

            // 布局参数设置
            ViewGroup.LayoutParams anchorLp = anchor.getLayoutParams();
            ViewGroup.LayoutParams params = null;

            if (anchorLp instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams llp = new LinearLayout.LayoutParams((LinearLayout.LayoutParams) anchorLp);
                llp.weight = 0;
                params = llp;
            } else if (anchorLp instanceof ViewGroup.MarginLayoutParams) {
                params = new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) anchorLp);
            } else {
                params = new ViewGroup.LayoutParams(anchorLp);
            }

            // 插入位置逻辑
            int insertIndex = -1;
            boolean isInsertBefore = anchorText.equals("弹幕搜索") || anchorText.contains("搜索") || isTargetAnchor;
            int anchorIndex = parent.indexOfChild(anchor);

            if (isInsertBefore) {
                insertIndex = anchorIndex;
            } else {
                insertIndex = anchorIndex + 1;
            }

            // 如果按钮已经在正确位置，直接返回
            if (existing != null && parent.indexOfChild(existing) == insertIndex) {
                if (existing.getVisibility() != View.VISIBLE) existing.setVisibility(View.VISIBLE);
                return;
            }

            // 为RelativeLayout设置特殊规则
            if (parent instanceof android.widget.RelativeLayout) {
                android.widget.RelativeLayout.LayoutParams rlp = new android.widget.RelativeLayout.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                if (anchor.getId() == View.NO_ID) {
                    // 使用兼容方式生成View ID
                    anchor.setId(generateViewId());
                }
                if (isInsertBefore) {
                    rlp.addRule(android.widget.RelativeLayout.LEFT_OF, anchor.getId());
                } else {
                    rlp.addRule(android.widget.RelativeLayout.RIGHT_OF, anchor.getId());
                }
                rlp.alignWithParent = true;
                rlp.addRule(android.widget.RelativeLayout.CENTER_VERTICAL);
                params = rlp;
            }

            // 设置边距
            if (params instanceof ViewGroup.MarginLayoutParams) {
                int existingLeft = 0;
                int existingRight = 0;
                if (anchorLp instanceof ViewGroup.MarginLayoutParams) {
                    existingLeft = ((ViewGroup.MarginLayoutParams) anchorLp).leftMargin;
                    existingRight = ((ViewGroup.MarginLayoutParams) anchorLp).rightMargin;
                }

                // 如果原始边距太小，使用默认值
                if (existingLeft < 5 && existingRight < 5) {
                    existingLeft = 20;
                    existingRight = 20;
                }

                ((ViewGroup.MarginLayoutParams) params).leftMargin = existingLeft;
                ((ViewGroup.MarginLayoutParams) params).rightMargin = existingRight > 0 ? existingRight : existingLeft;
                ((ViewGroup.MarginLayoutParams) params).topMargin = 0;
                ((ViewGroup.MarginLayoutParams) params).bottomMargin = 0;
            }

            // 确保按钮在最顶层显示
            btn.setElevation(10f); // 设置阴影层级，确保按钮在顶层
            btn.bringToFront(); // 将按钮置于最前

            try {
                if (insertIndex >= 0 && insertIndex <= parent.getChildCount()) {
                    parent.addView(btn, insertIndex, params);
                } else {
                    parent.addView(btn, params);
                }

                // 重新请求布局
                parent.requestLayout();
                parent.post(new Runnable() {
                    @Override
                    public void run() {
                        // 确保按钮正确显示
                        btn.setVisibility(View.VISIBLE);
                        btn.setClickable(true);
                    }
                });

                DanmakuSpider.log("✅ Leo弹幕按钮注入成功");
            } catch (Exception e) {
                DanmakuSpider.log("❌ 添加按钮失败: " + e.getMessage());
                parent.addView(btn);
            }
        } catch (Exception e) {
            DanmakuSpider.log("❌ 注入按钮异常: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // 兼容低版本的View ID生成方法
    private static int generateViewId() {
        // 确保ID为正数且不与其他ID冲突
        nextViewId++;
        // 确保ID不会超过Android允许的最大值（0xFFFFFF，因为高8位有特殊用途）
        if (nextViewId > 0x00FFFFFF) {
            nextViewId = 10000;
        }
        return nextViewId;
    }

    // 检查是否在RecyclerView中
    private static boolean isInRecyclerView(View view) {
        View p = view;
        while (p != null) {
            if (p.getClass().getName().contains("RecyclerView")) return true;
            if (p.getParent() instanceof View) {
                p = (View) p.getParent();
            } else {
                break;
            }
        }
        return false;
    }
    // === 按钮注入逻辑结束 ===

    // 提取标题的辅助方法
    private static String extractTitleFromView(View view) {
        if (view instanceof TextView) {
            TextView tv = (TextView) view;
            String text = tv.getText().toString().trim();
            if (isPotentialTitle(text)) {
                return text;
            }
        } else if (view instanceof ViewGroup) {
            ViewGroup group = (ViewGroup) view;

            for (int i = 0; i < group.getChildCount(); i++) {
                View child = group.getChildAt(i);
                if (child.getVisibility() == View.VISIBLE) {
                    String result = extractTitleFromView(child);
                    if (!TextUtils.isEmpty(result)) {
                        return result;
                    }
                }
            }
        }
        return "";
    }

    private static boolean isPotentialTitle(String text) {
        if (TextUtils.isEmpty(text) || text.length() < 2 || text.length() > 200) return false;

        if (text.matches(".*\\d{1,2}:\\d{1,2}(:\\d{1,2})?.*")) return false;
        if (text.matches("\\d+")) return false;

        String lower = text.toLowerCase();
        if (lower.contains("loading") || lower.contains("buffering") ||
                lower.contains("error") || lower.contains("fail")) {
            return false;
        }

        return true;
    }

    private static void startAutoSearch(EpisodeInfo episodeInfo, final Activity activity) {
        // 检查自动推送状态
        if (!DanmakuSpider.autoPushEnabled && !DanmakuSpider.hasAutoSearched) {
            DanmakuSpider.log("❌ 自动推送已关闭，跳过自动搜索");
            return;
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                boolean found = LeoDanmakuService.autoSearch(episodeInfo, activity);
                if (!found && activity != null && !activity.isFinishing()) {
                    activity.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            DanmakuSpider.safeShowToast(activity,
                                    "Leo弹幕获取失败，请手动搜索");
                        }
                    });
                }
            }
        }).start();
    }
}