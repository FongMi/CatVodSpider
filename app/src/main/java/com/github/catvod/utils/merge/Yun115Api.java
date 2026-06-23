package com.github.catvod.utils.merge;

import android.text.TextUtils;
import com.github.catvod.bean.yun115.Yun115User;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;

import com.github.catvod.utils.MapHelper;
import com.github.catvod.utils.PanHttpClient;
import com.github.catvod.utils.PanStringUtils;
import com.github.catvod.utils.server.Server;
import com.google.gson.Gson;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.URLEncoder;
import java.util.*;

/**
 * 115 网盘 API 客户端
 */
public final class Yun115Api {
    private static class Holder { static final Yun115Api INSTANCE = new Yun115Api(); }

    // ==================== 常量 ====================

    private static final String DEFAULT_QUALITY_ORDER = "4kz|4k|2k|super|high|low";
    private static final String SHARE_API = "https://115cdn.com/webapi/";

    // ==================== 静态缓存 ====================

    /** 下载链接缓存 {请求URL → 下载链接} */
    private static Map<String, String> downloadCache;
    /** SHA 哈希缓存 {fileId → sha} */
    private static Map<String, String> shaCache;

    static {
        downloadCache = new HashMap<>(512);
        shaCache = new HashMap<>(4096);
    }

    // ==================== 实例字段 ====================

    /** 画质名称 → 画质代码，如 "4K" → "4k" */
    private final Map<String, String> qualityNameToCode;
    /** 画质代码 → 显示名称，如 "4k" → "4K" */
    private final Map<String, String> qualityCodeToName;
    /** 当前分享码 */
    private String shareCode;
    /** 当前提取码 */
    private String receiveCode;
    /** 用户信息 */
    public Yun115User userInfo;
    /** 画质优先级顺序 */
    private String qualityOrder;

    // ==================== 构造与单例 ====================

    Yun115Api() {
        try {
            Yun115User saved = (Yun115User) new Gson().fromJson(
                    LocalStorage.readJson("115_user"),
                    Yun115User.class);
            this.userInfo = saved != null ? saved : new Yun115User();
        } catch (Exception e) {
            SpiderDebug.log("115授权初始化失败，请删除根目录TV文件夹下授权文件后重试");
        }
        SpiderDebug.log("115 constructor user:" + this.userInfo);

        this.qualityNameToCode = new HashMap<>();
        this.qualityNameToCode.put("4K", "4k");
        this.qualityNameToCode.put("2k", "2k");
        this.qualityNameToCode.put("超清", "super");
        this.qualityNameToCode.put("高清", "high");
        this.qualityNameToCode.put("標清", "low");
        this.qualityNameToCode.put("流暢", "normal");

        this.qualityCodeToName = new HashMap<>();
        this.qualityCodeToName.put("4kz", "115原畫");
        this.qualityCodeToName.put("4k", "4K");
        this.qualityCodeToName.put("2k", "2K");
        this.qualityCodeToName.put("super", "高清");
        this.qualityCodeToName.put("high", "標清");
        this.qualityCodeToName.put("low", "流暢");
        this.qualityCodeToName.put("normal", "普通");
        this.qualityCodeToName.put("auto", "115秒传阿里");

        this.qualityOrder = DEFAULT_QUALITY_ORDER;
    }

    public static Yun115Api getInstance() {
        return Holder.INSTANCE;
    }

    // ==================== HTTP 请求 ====================

    /**
     * GET 请求（带重试）
     */
    private String apiGet(String path) throws InterruptedException {
        if (!path.startsWith("https")) {
            path = UrlUtils.resolveUrl(SHARE_API, path);
        }
        Map<String, String> headers = buildHeaders();
        Map<String, String> respHeaders = new HashMap<>();
        String result = null;
        for (int retry = 2; retry > 0; retry--) {
            result = PanHttpClient.get(path, headers, respHeaders);
            SpiderDebug.log("115 get result:" + result);
            if (result.length() > 10) break;
            Thread.sleep(500L);
        }
        SpiderDebug.log("115 get url:" + path + " headers:" + headers + " result:" + result);
        return result;
    }

    /**
     * 构建 HTTP 请求头
     */
    public Map<String, String> buildHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
        headers.put("Referer", "https://115.com/");
        headers.put("Cookie", userInfo.b());
        return headers;
    }

    // ==================== 分享信息 ====================

    /**
     * 检查分享链接是否过期
     */
    private static void checkShareExpiry(JSONObject shareData) {
        try {
            long expireTime = shareData.getJSONObject("shareinfo").getLong("expire_time");
            if (expireTime == -1 || new Date().getTime() / 1000 <= expireTime) return;
            SpiderDebug.log("115分享链接已经过期 可能获取不到播放地址");
        } catch (Exception ignored) {
        }
    }

    // ==================== 文件列表 ====================

    /**
     * 递归列出分享目录中的文件
     *
     * @param headers     HTTP 请求头
     * @param recursive   是否递归子目录
     * @param folder      当前文件夹
     * @param videoList   视频文件输出列表
     * @param subList     字幕文件输出列表
     * @param folderList  子文件夹输出列表
     */
    private void listFiles(Map<String, String> headers, boolean recursive, Yun115File folder,
                           List<Yun115File> videoList, List<Yun115File> subList, List<Yun115File> folderList) throws InterruptedException, JSONException {
        if (recursive) {
            folderList = new ArrayList<>();
        }
        SpiderDebug.log("listFiles >> cid=" + folder.categoryId());
        String resp = apiGet("share/snap?share_code=" + shareCode + "&offset=0&receive_code=" + receiveCode
                + "&cid=" + folder.categoryId() + "&limit=9999&asc=1&o=file_name");
        SpiderDebug.log("listFiles >> " + resp);
        Yun115File result = (Yun115File) new Gson().fromJson(
                new JSONObject(resp).getJSONObject("data").toString(), Yun115File.class);
        try {
            if (!result.children().isEmpty()) {
                Collections.sort(result.children(), new Yun115FileComparator());
            }
        } catch (Exception e) {
            SpiderDebug.log("listFiles error: " + e.getMessage());
        }
        for (Yun115File file : result.children()) {
            if ("folder".equals(file.type())) {
                folderList.add(file);
            } else if (file.j() != null && (BaseApi.get().d.booleanValue()
                    || (PanStringUtils.getMimeType(file.name()) != null
                    && !PanStringUtils.getMimeType(file.name()).isEmpty()))) {
                file.n(folder.name());
                videoList.add(file);
            } else if (PanStringUtils.isSubtitleExtension(file.extension())) {
                subList.add(file);
            }
        }
        if (recursive) {
            for (Yun115File subFolder : folderList) {
                listFiles(headers, recursive, subFolder, videoList, subList, null);
            }
        }
    }

    /**
     * 构建字幕关联信息
     */
    private String buildSubtitleMapping(String videoName, List<Yun115File> subtitleFiles) {
        List<Yun115File> matched = new ArrayList<>();
        String normalizedName = PanStringUtils.removeExtension(videoName).toLowerCase();
        for (Yun115File sub : subtitleFiles) {
            String subName = PanStringUtils.removeExtension(sub.name()).toLowerCase();
            if (normalizedName.contains(subName) || subName.contains(normalizedName)) {
                matched.add(sub);
            }
        }
        if (matched.isEmpty()) {
            matched.addAll(subtitleFiles);
        }
        StringBuilder sb = new StringBuilder();
        for (Yun115File sub : matched) {
            shaCache.put(sub.fileId(), sub.sha());
            sb.append("+").append(PanStringUtils.removeExtension(sub.name()));
            sb.append("@@@").append(sub.extension());
            sb.append("@@@").append(sub.id());
        }
        return sb.toString();
    }

    // ==================== 缓存清理 ====================

    /**
     * 清理服务端缓存
     */
    public void cleanCache(String fileName) {
        if (userInfo.b == null || userInfo.b.isEmpty()) return;
        try {
            PanHttpClient.get(
                    AliDriveHelper.getProxyBaseUrl() + "/api/clean115/?pwd=" + URLEncoder.encode(userInfo.b)
                            + "&cookie=" + URLEncoder.encode(userInfo.b())
                            + "&fileName=" + URLEncoder.encode(fileName));
        } catch (Exception ignored) {
        }
    }

    // ==================== 字幕列表 ====================

    /**
     * 从播放地址参数中提取字幕列表
     */
    public List<com.github.catvod.bean.h> buildSubtitleList(String[] params) {
        ArrayList<com.github.catvod.bean.h> subtitles = new ArrayList<>();
        for (String param : params) {
            if (param.contains("@@@")) {
                String[] parts = param.split("@@@");
                String name = parts[0];
                String ext = parts[1];
                String subUrl = Proxy.getUrl() + "?do=quark&type=sub&share_id=" + params[0] + "&file_id=" + parts[2];
                com.github.catvod.bean.h sub = new com.github.catvod.bean.h();
                sub.b(name);
                sub.a(ext);
                sub.c(subUrl);
                subtitles.add(sub);
            }
        }
        return subtitles;
    }

    // ==================== VodItem 构建 ====================

    /**
     * 构建视频详情 VodItem
     *
     * @param shareId     分享 ID
     * @param code        分享码
     * @param cid         目录 ID
     * @param title       标题（为空则从 API 获取）
     * @param pwd         提取码
     * @return VodItem
     */
    public com.github.catvod.bean.VodItem buildVodItem(String shareId, String code, String cid, String title, String pwd) {
        String displayTitle;
        ArrayList<String> sourceNames = new ArrayList<>();
        String[] qualities = qualityOrder.split("\\|");
        boolean hasAliSource = false;
        boolean hasOriginalSource = false;
        for (String q : qualities) {
            if ("4k".equals(q) || "4kz".equals(q)) {
                if (!hasOriginalSource) {
                    sourceNames.add("115原畫");
                    hasOriginalSource = true;
                }
            } else if (!hasAliSource) {
                sourceNames.add(qualityCodeToName.get("auto") + "");
                hasAliSource = true;
            }
        }
        try {
            this.receiveCode = pwd;
            this.shareCode = code;
            JSONObject data = new JSONObject(apiGet("share/snap?share_code=" + shareCode
                    + "&offset=0&receive_code=" + receiveCode + "&cid=" + cid + "&asc=1&o=file_name")).getJSONObject("data");
            if (title == null || title.isEmpty()) {
                displayTitle = PanStringUtils.cleanFilename(
                        data.getJSONObject("shareinfo").getString("share_title"));
                checkShareExpiry(data);
            } else {
                displayTitle = title;
            }
            ArrayList<Yun115File> videoFiles = new ArrayList<>();
            List<Yun115File> subtitleFiles = new ArrayList<>();
            listFiles(null, true, new Yun115File(cid), videoFiles, subtitleFiles, null);
            // 构建播放列表
            ArrayList<String> episodeList = new ArrayList<>();
            for (Yun115File video : videoFiles) {
                shaCache.put(video.fileId(), video.sha());
                episodeList.add(video.display() + "$" + code + "_" + receiveCode + '+'
                        + video.fileId() + '+' + PanStringUtils.cleanFilename(displayTitle)
                        + '+' + video.name() + '+' + video.size() + '+' + video.sha()
                        + buildSubtitleMapping(video.name(), subtitleFiles));
            }
            ArrayList<String> playUrls = new ArrayList<>();
            for (int i = 0; i < sourceNames.size(); i++) {
                playUrls.add(TextUtils.join("#", episodeList));
            }
            // 组装 VodItem
            com.github.catvod.bean.VodItem vod = new com.github.catvod.bean.VodItem();
            vod.l(shareId);
            vod.j(shareId);
            vod.n("https://is1-ssl.mzstatic.com/image/thumb/Purple221/v4/5f/ed/bf/5fedbfb2-1431-a324-97c5-327487d5817d/AppIcon-0-0-1x_U007emarketing-0-8-0-0-sRGB-85-220.png/350x350.png");
            vod.m(displayTitle);
            vod.p(TextUtils.join("$$$", playUrls));
            vod.o(TextUtils.join("$$$", sourceNames));
            vod.g("115雲盤");
            return vod;
        } catch (Exception e) {
            return BaseApi.fakeVod(sourceNames, "115雲盤");
        }
    }

    /**
     * 构建文件夹浏览列表
     */
    public List<com.github.catvod.bean.VodItem> buildFolderList(com.github.catvod.bean.JsonUtils params) {
        String shareCodeParam = params.d();
        String shareId = params.c();
        String folderId = params.f();
        String pathPrefix = params.e();
        String folderIdParam = (params.b() == null || params.b().isEmpty()) ? "0" : params.b();
        HashMap<String, String> extendParams = params.a();
        List<Yun115File> videoFiles = new ArrayList<>();
        ArrayList<Yun115File> folderItems = new ArrayList<>();
        try {
            String cid = PanStringUtils.isEmpty(folderIdParam) ? "0" : folderIdParam;
            this.receiveCode = shareCodeParam;
            this.shareCode = shareId;
            JSONObject data = new JSONObject(apiGet("share/snap?share_code=" + shareCode
                    + "&offset=0&receive_code=" + receiveCode + "&cid=" + cid + "&asc=1&o=file_name")).getJSONObject("data");
            if (folderId == null || folderId.isEmpty()) {
                folderId = data.getJSONObject("shareinfo").getString("share_title");
                checkShareExpiry(data);
            }
            videoFiles = new ArrayList<>();
            listFiles(extendParams, false, new Yun115File(folderIdParam), videoFiles, new ArrayList<>(), folderItems);
        } catch (Exception ignored) {
        }
        // 构建结果列表
        ArrayList<com.github.catvod.bean.VodItem> result = new ArrayList<>();
        for (Yun115File folder : folderItems) {
            com.github.catvod.bean.VodItem vod = new com.github.catvod.bean.VodItem();
            vod.l(shareId + "*#" + folder.categoryId() + "*#" + folder.name());
            vod.m(folder.name());
            vod.r(folder.type());
            result.add(vod);
        }
        for (Yun115File video : videoFiles) {
            com.github.catvod.bean.VodItem vod = new com.github.catvod.bean.VodItem();
            vod.l(pathPrefix + "_" + folderIdParam + "*#" + folderId);
            vod.m(video.display());
            vod.r(video.type());
            vod.n(video.thumbnail());
            result.add(vod);
        }
        return result;
    }

    // ==================== 播放地址 ====================

    /**
     * 获取播放地址
     *
     * @param params  播放参数数组 [shareId_pwd, fileId, fileName, fileSize, sha, ...]
     * @param quality 画质名称
     * @return 播放信息 JSON
     */
    public String getPlayUrl(String[] params, String quality) {
        try {
            if (!Server.v()) Thread.sleep(2000L);
            // 构建下载请求 URL
            String requestUrl;
            if (NetPan.isYunSelf115(params[0])) {
                requestUrl = AliDriveHelper.getProxyBaseUrl() + "/api/downloadByFileId/?fileId="
                        + URLEncoder.encode(params[1]) + "&cookie=" + URLEncoder.encode(userInfo.b());
            } else {
                requestUrl = AliDriveHelper.getProxyBaseUrl() + "/api/downloadByShareCode/?shareId="
                        + URLEncoder.encode(params[0].split("_")[0])
                        + "&pwd=" + URLEncoder.encode(params[0].split("_")[1])
                        + "&fileId=" + URLEncoder.encode(params[1])
                        + "&cookie=" + URLEncoder.encode(userInfo.b());
            }
            // 获取下载链接（带缓存）
            if (downloadCache.get(requestUrl) == null || downloadCache.get(requestUrl).length() == 0) {
                String resp = PanHttpClient.get(requestUrl);
                String cookiePart = resp.split("\\*#")[0];
                String downloadUrl = resp.split("\\*#")[1];
                if (downloadUrl.startsWith("https")) {
                    if (NetPan.isYunSelf115(params[0])) {
                        downloadUrl = Server.F(downloadUrl);
                    }
                    downloadCache.put(requestUrl, downloadUrl);
                    Init.execute(() -> { try { Thread.sleep(3000L); } catch (InterruptedException ignored) {} if (!NetPan.isYunSelf115(params[0])) cleanCache(params[2]); });
                }
            }
            String cachedUrl = downloadCache.get(requestUrl);
            // 根据画质选择播放方式
            String fileName = params[2] + params[3];
            String playUrl;
            if (quality.contains("阿里")) {
                String aliKey = "阿里" + params[1];
                if (downloadCache.get(aliKey) != null && downloadCache.get(aliKey).length() > 0) {
                    playUrl = downloadCache.get(aliKey);
                } else {
                    playUrl = AliDriveHelper.createBySecUpload(fileName, cachedUrl,
                            Long.valueOf((long) Double.parseDouble(params[4])), params[5]);
                    if (playUrl != null && !playUrl.isEmpty()) {
                        downloadCache.put(aliKey, playUrl);
                    }
                }
            } else if (BaseApi.get().d.booleanValue()) {
                BaseApi.get().downloadFileWithDownloadManager(cachedUrl, fileName, buildHeaders());
                SpiderDebug.log("正在下载 " + fileName);
                playUrl = Server.B();
            } else {
                playUrl = NetPan.getIsoDownloadUrl(cachedUrl);
            }
            // 组装播放结果
            PlayResult result = new PlayResult();
            result.setUrl(playUrl);
            result.setExtra(AliDriveHelper.getDanmakuUrl(params));
            result.setOctetStream();
            result.setSubtitles(buildSubtitleList(params));
            result.setHeaders(quality.contains("阿里") ? AliDriveHelper.getDefaultHeaders() : buildHeaders());
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log("yun115 api error: " + e.getMessage());
            PlayResult error = new PlayResult();
            error.setUrl("4234234");
            return error.toString();
        }
    }

    // ==================== Cookie 管理 ====================

    /**
     * 设置 115 Cookie
     *
     * @param cookie Cookie 字符串或包含 Cookie 的 URL
     * @param force  是否强制更新
     */
    public void setCookie(String cookie, boolean force) {
        if (PanStringUtils.isEmpty(userInfo.b()) || force) {
            SpiderDebug.log("set new Cookie:" + cookie);
            if (cookie != null && cookie.startsWith("http")) {
                cookie = PanHttpClient.get(cookie).trim();
            }
            if (cookie != null && !cookie.isEmpty()) {
                if (cookie.endsWith(";")) {
                    cookie = cookie.substring(0, cookie.length() - 1);
                }
                userInfo.d(cookie);
                userInfo.c();
                downloadCache = new HashMap<>(512);
                shaCache = new HashMap<>(4096);
            }
        }
    }
}
