package com.github.catvod.spider;

import android.content.Context;
import android.util.Base64;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Filter;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.NetPan;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Util;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.json.JSONObject;

import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * 聚合短剧 - Java 版本
 * 聚合多个短剧平台的爬虫
 */
public class JuheShortDrama extends Spider {

    // ==================== 配置常量 ====================
    private static final String KEYS = "d3dGiJc651gSQ8w1";
    private static final int SEARCH_LIMIT = 30;
    private static final int SEARCH_TIMEOUT = 6000;

    // 字符映射表（用于七猫加密）
    private static final Map<Character, Character> CHAR_MAP = new HashMap<>();
    static {
        String from = "+/0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String to = "PXMUlErYWbdJ9saI0oyH_GiNtgA8Fk3hfRqC4pzmBOuc6Kx5T-2eSZ1VvjQ7DwnLe";
        for (int i = 0; i < from.length(); i++) {
            CHAR_MAP.put(from.charAt(i), to.charAt(i));
        }
    }

    // 默认域名配置
    private static final Map<String, String> DEFAULT_HOSTS = new HashMap<>();
    static {
        DEFAULT_HOSTS.put("百度", "https://api.jkyai.top");
        DEFAULT_HOSTS.put("甜圈", "https://mov.cenguigui.cn");
        DEFAULT_HOSTS.put("锦鲤", "https://api.jinlidj.com");
        DEFAULT_HOSTS.put("番茄", "https://reading.snssdk.com");
        DEFAULT_HOSTS.put("番茄2", "https://fqgo.52dns.cc");  // 番茄详情/搜索用
        DEFAULT_HOSTS.put("星芽", "https://app.whjzjx.cn");
        DEFAULT_HOSTS.put("星芽登录", "https://u.shytkjgs.com");
        DEFAULT_HOSTS.put("西饭", "https://xifan-api-cn.youlishipin.com");
        DEFAULT_HOSTS.put("七猫", "https://api-store.qmplaylet.com");
        DEFAULT_HOSTS.put("七猫详情", "https://api-read.qmplaylet.com");
        DEFAULT_HOSTS.put("围观", "https://api.drama.9ddm.com");
        DEFAULT_HOSTS.put("碎片", "https://free-api.bighotwind.cc");
        DEFAULT_HOSTS.put("碎片图片", "https://speed.hiknz.com");
    }

    // 平台配置
    private static class Platform {
        String id;
        String name;
        String host;
        String url1;
        String url2;
        String search;
        String loginUrl;

        Platform(String id, String name, String host, String url1, String url2, String search) {
            this.id = id;
            this.name = name;
            this.host = host;
            this.url1 = url1;
            this.url2 = url2;
            this.search = search;
        }

        // 复制并设置新的 host
        Platform withHost(String newHost) {
            return new Platform(this.id, this.name, newHost, this.url1, this.url2, this.search);
        }
    }

    // 当前使用的域名配置（可被 extend 覆盖）
    private Map<String, String> hosts = new HashMap<>(DEFAULT_HOSTS);

    // 实例平台列表（根据配置动态生成）
    private List<Platform> platforms;

    // 星芽 Token
    private String xingyaToken = "";

    // ==================== 初始化 ====================
    @Override
    public void init(Context context, String extend) {
        super.init(context, extend);
        
        // 解析 extend 配置的自定义域名
        if (extend != null && !extend.isEmpty()) {
            try {
                JsonObject config = JsonParser.parseString(extend).getAsJsonObject();
                for (String key : config.keySet()) {
                    String customHost = config.get(key).getAsString();
                    if (customHost != null && !customHost.isEmpty()) {
                        hosts.put(key, customHost);
                        SpiderDebug.log("自定义域名: " + key + " -> " + customHost);
                    }
                }
            } catch (Exception e) {
                SpiderDebug.log("解析extend配置失败: " + e.getMessage());
            }
        }
        
        // 初始化平台列表（使用配置的域名）
        initPlatforms();
        
        // 获取星芽Token
        fetchXingyaToken();
    }

    /**
     * 初始化平台列表
     */
    private void initPlatforms() {
        platforms = Arrays.asList(
            new Platform("百度", "百度短剧", hosts.get("百度"),
                    "/API/bddjss.php?name=fyclass&page=fypage",
                    "/API/bddjss.php?id=fyid",
                    "/API/bddjss.php?name=**&page=fypage"),
            new Platform("甜圈", "甜圈短剧", hosts.get("甜圈"),
                    "/duanju/api.php?classname",
                    "/duanju/api.php?book_id",
                    "/duanju/api.php?name"),
            new Platform("锦鲤", "锦鲤短剧", hosts.get("锦鲤"),
                    "", "/api/detail", "/api/search"),
            new Platform("番茄", "番茄短剧", hosts.get("番茄"),
                    "/reading/bookapi/bookmall/cell/change/v",
                    hosts.get("番茄2") + "/catalog",
                    hosts.get("番茄2") + "/search"),
            new Platform("星芽", "星芽短剧", hosts.get("星芽"),
                    "/cloud/v2/theater/home_page?theater_class_id",
                    "/v2/theater_parent/detail",
                    "/v3/search"),
            new Platform("西饭", "西饭短剧", hosts.get("西饭"),
                    "/xifan/drama/portalPage",
                    "/xifan/drama/getDuanjuInfo",
                    "/xifan/search/getSearchList"),
            new Platform("七猫", "七猫短剧", hosts.get("七猫"),
                    "/api/v1/playlet/index",
                    hosts.get("七猫详情") + "/player/api/v1/playlet/info",
                    "/api/v1/playlet/search"),
            new Platform("围观", "围观短剧", hosts.get("围观"),
                    "/drama/home/shortVideoTags",
                    "/drama/home/shortVideoDetail",
                    "/drama/home/search"),
            new Platform("碎片", "碎片剧场", hosts.get("碎片"),
                    "/papaya/papaya-api/theater/tags",
                    "/papaya/papaya-api/videos/info",
                    "/papaya/papaya-api/videos/page")
        );
    }

    /**
     * 获取星芽Token
     */
    private void fetchXingyaToken() {
        try {
            HashMap<String, String> headers = new HashMap<>();
            headers.put("User-Agent", "okhttp/4.10.0");
            headers.put("platform", "1");
            headers.put("Content-Type", "application/json");

            JSONObject body = new JSONObject();
            body.put("device", "24250683a3bdb3f118dff25ba4b1cba1a");

            String loginUrl = hosts.get("星芽登录") + "/user/v1/account/login";
            String response = OkHttp.post(loginUrl, body.toString(), headers).getBody();
            JsonObject res = JsonParser.parseString(response).getAsJsonObject();
            if (res.has("data") && res.getAsJsonObject("data").has("token")) {
                xingyaToken = res.getAsJsonObject("data").get("token").getAsString();
                SpiderDebug.log("星芽短剧token获取成功");
            }
        } catch (Exception e) {
            SpiderDebug.log("星芽短剧token获取失败: " + e.getMessage());
        }
    }

    // ==================== 首页内容 ====================
    @Override
    public String homeContent(boolean filter) throws Exception {
        List<Class> classes = new ArrayList<>();
        LinkedHashMap<String, List<Filter>> filters = new LinkedHashMap<>();

        for (Platform plat : platforms) {
            classes.add(new Class(plat.id, plat.name));
        }

        return Result.string(classes, filters);
    }

    @Override
    public String homeVideoContent() throws Exception {
        List<Vod> list = new ArrayList<>();
        // 随机选择一个平台获取推荐
        Platform randomPlat = platforms.get(new Random().nextInt(platforms.size()));
        try {
            list.addAll(fetchPlatformList(randomPlat.id, "", "1", 10));
        } catch (Exception e) {
            SpiderDebug.log("推荐加载失败: " + e.getMessage());
        }
        return Result.string(list);
    }

    // ==================== 分类内容 ====================
    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        String area = extend != null && extend.containsKey("area") ? extend.get("area") : "";
        List<Vod> list = fetchPlatformList(tid, area, pg, 24);
        return Result.get().vod(list).page().string();
    }

    /**
     * 获取平台列表
     */
    private List<Vod> fetchPlatformList(String platformId, String area, String page, int limit) throws Exception {
        List<Vod> list = new ArrayList<>();
        Platform plat = getPlatformById(platformId);
        if (plat == null) return list;

        switch (platformId) {
            case "百度":
                list = fetchBaiduList(plat, area, page);
                break;
            case "甜圈":
                list = fetchTianquanList(plat, area, page);
                break;
            case "锦鲤":
                list = fetchJinliList(plat, area, page, limit);
                break;
            case "番茄":
                list = fetchFanqieList(plat, area, page);
                break;
            case "星芽":
                list = fetchXingyaList(plat, area, page);
                break;
            case "西饭":
                list = fetchXifanList(plat, area, page);
                break;
            case "七猫":
                list = fetchQimaoList(plat, area, page);
                break;
            case "围观":
                list = fetchWeiguanList(plat, page, limit);
                break;
            case "碎片":
                list = fetchSuipianList(plat, page, limit);
                break;
        }
        return list;
    }

    // ==================== 各平台列表实现 ====================

    private List<Vod> fetchBaiduList(Platform plat, String area, String page) throws Exception {
        List<Vod> list = new ArrayList<>();
        String url = plat.host + plat.url1.replace("fyclass", area.isEmpty() ? "逆袭" : area).replace("fypage", page);
        String response = OkHttp.string(url, getHeaders());
        JsonObject res = JsonParser.parseString(response).getAsJsonObject();
        JsonArray data = res.getAsJsonArray("data");
        for (JsonElement item : data) {
            JsonObject obj = item.getAsJsonObject();
            Vod vod = new Vod();
            vod.setVodId("百度@" + obj.get("id").getAsString());
            vod.setVodName(obj.get("title").getAsString());
            vod.setVodPic(obj.get("cover").getAsString());
            vod.setVodRemarks("更新至" + obj.get("totalChapterNum").getAsInt() + "集");
            list.add(vod);
        }
        return list;
    }

    private List<Vod> fetchTianquanList(Platform plat, String area, String page) throws Exception {
        List<Vod> list = new ArrayList<>();
        String url = plat.host + plat.url1 + "=" + (area.isEmpty() ? "推荐榜" : area) + "&offset=" + page;
        String response = OkHttp.string(url, getHeaders());
        JsonObject res = JsonParser.parseString(response).getAsJsonObject();
        JsonArray data = res.getAsJsonArray("data");
        for (JsonElement item : data) {
            JsonObject obj = item.getAsJsonObject();
            Vod vod = new Vod();
            vod.setVodId("甜圈@" + obj.get("book_id").getAsString());
            vod.setVodName(obj.get("title").getAsString());
            vod.setVodPic(obj.get("cover").getAsString());
            vod.setVodRemarks(getJsonString(obj, "copyright", "未知"));
            list.add(vod);
        }
        return list;
    }

    private List<Vod> fetchJinliList(Platform plat, String area, String page, int limit) throws Exception {
        List<Vod> list = new ArrayList<>();
        JSONObject body = new JSONObject();
        body.put("page", Integer.parseInt(page));
        body.put("limit", limit);
        body.put("type_id", area);
        body.put("year", "");
        body.put("keyword", "");

        String response = OkHttp.post(plat.host + plat.search, body.toString(), getHeaders()).getBody();
        JsonObject res = JsonParser.parseString(response).getAsJsonObject();
        JsonArray dataList = res.getAsJsonObject("data").getAsJsonArray("list");
        for (JsonElement item : dataList) {
            JsonObject obj = item.getAsJsonObject();
            Vod vod = new Vod();
            vod.setVodId("锦鲤@" + obj.get("vod_id").getAsString());
            vod.setVodName(getJsonString(obj, "vod_name", "未知"));
            vod.setVodPic(getJsonString(obj, "vod_pic", ""));
            vod.setVodRemarks(getJsonString(obj, "vod_total", "0") + "集");
            list.add(vod);
        }
        return list;
    }

    private List<Vod> fetchFanqieList(Platform plat, String area, String page) throws Exception {
        List<Vod> list = new ArrayList<>();
        String sessionId = String.valueOf(System.currentTimeMillis());
        String url = plat.host + plat.url1 + "?change_type=0&selected_items=" +
                (area.isEmpty() ? "videoseries_hot" : area) +
                "&tab_type=8&cell_id=6952850996422770718&version_tag=video_feed_refactor&device_id=1423244030195267&aid=1967&app_name=novelapp&ssmix=a&session_id=" + sessionId;
        if (Integer.parseInt(page) > 1) {
            url += "&offset=" + ((Integer.parseInt(page) - 1) * 12);
        }

        String response = OkHttp.string(url, getHeaders());
        JsonObject res = JsonParser.parseString(response).getAsJsonObject();
        if (res.has("data") && res.getAsJsonObject("data").has("cell_view")) {
            JsonArray items = res.getAsJsonObject("data").getAsJsonObject("cell_view").getAsJsonArray("cell_data");
            for (JsonElement item : items) {
                JsonObject obj = item.getAsJsonObject();
                JsonObject videoData = obj.has("video_data") && obj.getAsJsonArray("video_data").size() > 0
                        ? obj.getAsJsonArray("video_data").get(0).getAsJsonObject() : obj;

                Vod vod = new Vod();
                vod.setVodId("番茄@" + getJsonString(videoData, "series_id", getJsonString(videoData, "book_id", "")));
                vod.setVodName(getJsonString(videoData, "title", "未知短剧"));
                vod.setVodPic(getJsonString(videoData, "cover", getJsonString(videoData, "horiz_cover", "")));
                vod.setVodRemarks(getJsonString(videoData, "sub_title", ""));
                list.add(vod);
            }
        }
        return list;
    }

    private List<Vod> fetchXingyaList(Platform plat, String area, String page) throws Exception {
        List<Vod> list = new ArrayList<>();
        String url = plat.host + plat.url1 + "=" + (area.isEmpty() ? "1" : area) +
                "&type=1&class2_ids=0&page_num=" + page + "&page_size=24";

        String response = OkHttp.string(url, getXingyaHeaders());
        JsonObject res = JsonParser.parseString(response).getAsJsonObject();
        JsonArray dataList = res.getAsJsonObject("data").getAsJsonArray("list");
        for (JsonElement item : dataList) {
            JsonObject obj = item.getAsJsonObject().getAsJsonObject("theater");
            String detailUrl = plat.host + plat.url2 + "?theater_parent_id=" + obj.get("id").getAsString();

            Vod vod = new Vod();
            vod.setVodId("星芽@" + detailUrl);
            vod.setVodName(obj.get("title").getAsString());
            vod.setVodPic(obj.get("cover_url").getAsString());
            vod.setVodRemarks(obj.get("total").getAsInt() + "集");
            list.add(vod);
        }
        return list;
    }

    private List<Vod> fetchXifanList(Platform plat, String area, String page) throws Exception {
        List<Vod> list = new ArrayList<>();
        String[] areaParts = area.isEmpty() ? new String[]{"", ""} : area.split("@");
        String typeId = areaParts[0];
        String typeName = areaParts.length > 1 ? areaParts[1] : "";
        long ts = System.currentTimeMillis() / 1000;

        String url = plat.host + plat.url1 + "?reqType=aggregationPage&offset=" + ((Integer.parseInt(page) - 1) * 30) +
                "&categoryId=" + typeId + "&quickEngineVersion=-1&scene=&categoryNames=" + URLEncoder.encode(typeName, "UTF-8") +
                "&categoryVersion=1&density=1.5&pageID=page_theater&version=2001001&androidVersionCode=28&requestId=" + ts + "aa498144140ef297&appId=drama&teenMode=false&userBaseMode=false";

        String response = OkHttp.string(url, getHeaders());
        JsonObject res = JsonParser.parseString(response).getAsJsonObject();
        JsonArray elements = res.getAsJsonObject("result").getAsJsonArray("elements");
        for (JsonElement soup : elements) {
            JsonArray contents = soup.getAsJsonObject().getAsJsonArray("contents");
            for (JsonElement vodItem : contents) {
                JsonObject dj = vodItem.getAsJsonObject().getAsJsonObject("duanjuVo");
                Vod vod = new Vod();
                vod.setVodId("西饭@" + dj.get("duanjuId").getAsString() + "#" + dj.get("source").getAsString());
                vod.setVodName(dj.get("title").getAsString());
                vod.setVodPic(dj.get("coverImageUrl").getAsString());
                vod.setVodRemarks(dj.get("total").getAsInt() + "集");
                list.add(vod);
            }
        }
        return list;
    }

    private List<Vod> fetchQimaoList(Platform plat, String area, String page) throws Exception {
        List<Vod> list = new ArrayList<>();
        String tagId = area.isEmpty() ? "0" : area;
        String signStr = "operation=1playlet_privacy=1tag_id=" + tagId + KEYS;
        String sign = md5(signStr);
        String url = plat.host + plat.url1 + "?tag_id=" + tagId + "&playlet_privacy=1&operation=1&sign=" + sign;

        HashMap<String, String> headers = getQimaoHeaders();
        String response = OkHttp.string(url, headers);
        JsonObject res = JsonParser.parseString(response).getAsJsonObject();

        if (res.has("data") && res.getAsJsonObject("data").has("list")) {
            JsonArray dataList = res.getAsJsonObject("data").getAsJsonArray("list");
            for (JsonElement item : dataList) {
                JsonObject obj = item.getAsJsonObject();
                Vod vod = new Vod();
                vod.setVodId("七猫@" + URLEncoder.encode(obj.get("playlet_id").getAsString(), "UTF-8"));
                vod.setVodName(getJsonString(obj, "title", "未知"));
                vod.setVodPic(getJsonString(obj, "image_link", ""));
                vod.setVodRemarks(getJsonString(obj, "total_episode_num", "0") + "集");
                list.add(vod);
            }
        }
        return list;
    }

    private List<Vod> fetchWeiguanList(Platform plat, String page, int limit) throws Exception {
        List<Vod> list = new ArrayList<>();
        JSONObject postData = new JSONObject();
        postData.put("audience", "全部受众");
        postData.put("page", Integer.parseInt(page));
        postData.put("pageSize", limit);
        postData.put("searchWord", "");
        postData.put("subject", "全部主题");

        String response = OkHttp.post(plat.host + plat.search, postData.toString(), getHeaders()).getBody();
        JsonObject res = JsonParser.parseString(response).getAsJsonObject();
        JsonArray data = res.getAsJsonArray("data");
        for (JsonElement item : data) {
            JsonObject obj = item.getAsJsonObject();
            Vod vod = new Vod();
            vod.setVodId("围观@" + obj.get("oneId").getAsString());
            vod.setVodName(obj.get("title").getAsString());
            vod.setVodPic(getJsonString(obj, "vertPoster", ""));
            vod.setVodRemarks("集数:" + getJsonString(obj, "episodeCount", "0"));
            list.add(vod);
        }
        return list;
    }

    private List<Vod> fetchSuipianList(Platform plat, String page, int limit) throws Exception {
        List<Vod> list = new ArrayList<>();
        // 获取碎片Token
        String token = getSuipianToken();
        if (token.isEmpty()) return list;

        HashMap<String, String> headers = getHeaders();
        headers.put("Authorization", token);

        String url = plat.host + plat.search + "?type=5&tagId=&pageNum=" + page + "&pageSize=" + limit;
        String response = OkHttp.string(url, headers);
        JsonObject res = JsonParser.parseString(response).getAsJsonObject();
        JsonArray dataList = res.getAsJsonArray("list");
        for (JsonElement item : dataList) {
            JsonObject obj = item.getAsJsonObject();
            String compoundId = obj.get("itemId").getAsString() + "@" + obj.get("videoCode").getAsString();
            Vod vod = new Vod();
            vod.setVodId("碎片@" + compoundId);
            vod.setVodName(obj.get("title").getAsString());
            vod.setVodPic("https://speed.hiknz.com/papaya/papaya-file/files/download/" +
                    obj.get("imageKey").getAsString() + "/" + obj.get("imageName").getAsString());
            vod.setVodRemarks("集数:" + getJsonString(obj, "episodesMax", "0"));
            list.add(vod);
        }
        return list;
    }

    // ==================== 详情页 ====================
    @Override
    public String detailContent(List<String> ids) throws Exception {
        String id = ids.get(0);
        String[] parts = id.split("@", 2);
        String platform = parts[0];
        String realId = parts.length > 1 ? parts[1] : "";

        Vod vod = new Vod();
        vod.setVodId(id);

        switch (platform) {
            case "百度":
                vod = fetchBaiduDetail(realId, vod);
                break;
            case "甜圈":
                vod = fetchTianquanDetail(realId, vod);
                break;
            case "锦鲤":
                vod = fetchJinliDetail(realId, vod);
                break;
            case "番茄":
                vod = fetchFanqieDetail(realId, vod);
                break;
            case "星芽":
                vod = fetchXingyaDetail(realId, vod);
                break;
            case "西饭":
                vod = fetchXifanDetail(realId, vod);
                break;
            case "七猫":
                vod = fetchQimaoDetail(realId, vod);
                break;
            case "围观":
                vod = fetchWeiguanDetail(realId, vod);
                break;
            case "碎片":
                vod = fetchSuipianDetail(realId, vod);
                break;
        }

        return Result.string(vod);
    }

    private Vod fetchBaiduDetail(String id, Vod vod) throws Exception {
        Platform plat = getPlatformById("百度");
        String url = plat.host + plat.url2.replace("fyid", id);
        String response = OkHttp.string(url, getHeaders());
        JsonObject res = JsonParser.parseString(response).getAsJsonObject();

        vod.setVodName(res.get("title").getAsString());
        JsonArray data = res.getAsJsonArray("data");
        if (data.size() > 0) {
            vod.setVodPic(data.get(0).getAsJsonObject().get("cover").getAsString());
        }
        vod.setVodRemarks("更新至:" + res.get("total").getAsInt() + "集");
        vod.setVodPlayFrom("百度短剧");

        StringBuilder playUrl = new StringBuilder();
        for (int i = 0; i < data.size(); i++) {
            JsonObject item = data.get(i).getAsJsonObject();
            if (i > 0) playUrl.append("#");
            playUrl.append(item.get("title").getAsString()).append("$").append(item.get("video_id").getAsString());
        }
        vod.setVodPlayUrl(playUrl.toString());
        return vod;
    }

    private Vod fetchTianquanDetail(String id, Vod vod) throws Exception {
        Platform plat = getPlatformById("甜圈");
        String url = plat.host + plat.url2 + "=" + id;
        String response = OkHttp.string(url, getHeaders());
        JsonObject res = JsonParser.parseString(response).getAsJsonObject();

        vod.setVodName(getJsonString(res, "book_name", "未知"));
        vod.setTypeName(getJsonString(res, "category", ""));
        vod.setVodPic(getJsonString(res, "book_pic", ""));
        vod.setVodContent(getJsonString(res, "desc", ""));
        vod.setVodRemarks(getJsonString(res, "duration", ""));
        vod.setVodPlayFrom("甜圈短剧");

        JsonArray data = res.getAsJsonArray("data");
        StringBuilder playUrl = new StringBuilder();
        for (int i = 0; i < data.size(); i++) {
            JsonObject item = data.get(i).getAsJsonObject();
            if (i > 0) playUrl.append("#");
            playUrl.append(item.get("title").getAsString()).append("$").append(item.get("video_id").getAsString());
        }
        vod.setVodPlayUrl(playUrl.toString());
        return vod;
    }

    private Vod fetchJinliDetail(String id, Vod vod) throws Exception {
        Platform plat = getPlatformById("锦鲤");
        String url = plat.host + plat.url2 + "/" + id;
        String response = OkHttp.string(url, getHeaders());
        JsonObject res = JsonParser.parseString(response).getAsJsonObject();
        JsonObject data = res.getAsJsonObject("data");

        vod.setVodName(getJsonString(data, "vod_name", "暂无名称"));
        vod.setTypeName(getJsonString(data, "vod_class", "暂无类型"));
        vod.setVodPic(getJsonString(data, "vod_pic", ""));
        vod.setVodRemarks(getJsonString(data, "vod_remarks", ""));
        vod.setVodContent(getJsonString(data, "vod_blurb", "暂无剧情"));
        vod.setVodPlayFrom("锦鲤短剧");

        JsonObject player = data.getAsJsonObject("player");
        StringBuilder playUrl = new StringBuilder();
        boolean first = true;
        for (String key : player.keySet()) {
            if (!first) playUrl.append("#");
            first = false;
            playUrl.append(key).append("$").append(player.get(key).getAsString());
        }
        vod.setVodPlayUrl(playUrl.toString());
        return vod;
    }

    private Vod fetchFanqieDetail(String id, Vod vod) throws Exception {
        Platform plat = getPlatformById("番茄");
        String url = plat.url2 + "?book_id=" + id;
        String response = OkHttp.string(url, getHeaders());
        JsonObject res = JsonParser.parseString(response).getAsJsonObject();
        JsonObject data = res.getAsJsonObject("data");
        JsonObject bookInfo = data.getAsJsonObject("book_info");

        vod.setVodName(getJsonString(bookInfo, "book_name", "未知"));
        vod.setVodPic(getJsonString(bookInfo, "thumb_url", getJsonString(bookInfo, "audio_thumb_uri", "")));
        vod.setVodContent(getJsonString(bookInfo, "abstract", getJsonString(bookInfo, "book_abstract_v2", "")));
        vod.setVodPlayFrom("番茄短剧");

        JsonArray itemList = data.getAsJsonArray("item_data_list");
        StringBuilder playUrl = new StringBuilder();
        for (int i = 0; i < itemList.size(); i++) {
            JsonObject item = itemList.get(i).getAsJsonObject();
            if (i > 0) playUrl.append("#");
            playUrl.append(item.get("title").getAsString()).append("$").append(item.get("item_id").getAsString());
        }
        vod.setVodRemarks("更新至" + itemList.size() + "集");
        vod.setVodPlayUrl(playUrl.toString());
        return vod;
    }

    private Vod fetchXingyaDetail(String detailUrl, Vod vod) throws Exception {
        String response = OkHttp.string(detailUrl, getXingyaHeaders());
        JsonObject res = JsonParser.parseString(response).getAsJsonObject();
        JsonObject data = res.getAsJsonObject("data");

        vod.setVodName(data.get("title").getAsString());
        vod.setVodPic(data.get("cover_url").getAsString());
        vod.setVodContent(getJsonString(data, "introduction", ""));
        vod.setVodPlayFrom("星芽短剧");

        JsonArray theaters = data.getAsJsonArray("theaters");
        StringBuilder playUrl = new StringBuilder();
        for (int i = 0; i < theaters.size(); i++) {
            JsonObject item = theaters.get(i).getAsJsonObject();
            if (i > 0) playUrl.append("#");
            playUrl.append(item.get("num").getAsString()).append("$").append(item.get("son_video_url").getAsString());
        }
        vod.setVodPlayUrl(playUrl.toString());
        return vod;
    }

    private Vod fetchXifanDetail(String id, Vod vod) throws Exception {
        Platform plat = getPlatformById("西饭");
        String[] parts = id.split("#");
        String duanjuId = parts[0];
        String source = parts.length > 1 ? parts[1] : "";

        String url = plat.host + plat.url2 + "?duanjuId=" + duanjuId + "&source=" + source +
                "&openFrom=homescreen&type=&pageID=page_inner_flow&density=1.5&version=2001001&androidVersionCode=28&requestId=" +
                System.currentTimeMillis() + "aa498144140ef297&appId=drama&teenMode=false&userBaseMode=false";

        String response = OkHttp.string(url, getHeaders());
        JsonObject res = JsonParser.parseString(response).getAsJsonObject();
        JsonObject data = res.getAsJsonObject("result");

        vod.setVodName(data.get("title").getAsString());
        vod.setVodPic(getJsonString(data, "coverImageUrl", ""));
        vod.setVodContent(getJsonString(data, "desc", "未知"));
        String updateStatus = getJsonString(data, "updateStatus", "");
        vod.setVodRemarks(updateStatus.equals("over") ? data.get("total").getAsInt() + "集 已完结" : "更新" + data.get("total").getAsInt() + "集");
        vod.setVodPlayFrom("西饭短剧");

        JsonArray episodeList = data.getAsJsonArray("episodeList");
        StringBuilder playUrl = new StringBuilder();
        for (int i = 0; i < episodeList.size(); i++) {
            JsonObject ep = episodeList.get(i).getAsJsonObject();
            if (i > 0) playUrl.append("#");
            playUrl.append(ep.get("index").getAsInt()).append("$").append(ep.get("playUrl").getAsString());
        }
        vod.setVodPlayUrl(playUrl.toString());
        return vod;
    }

    private Vod fetchQimaoDetail(String id, Vod vod) throws Exception {
        Platform plat = getPlatformById("七猫");
        String did = java.net.URLDecoder.decode(id, "UTF-8");
        String sign = md5("playlet_id=" + did + KEYS);
        String url = plat.url2 + "?playlet_id=" + did + "&sign=" + sign;

        String response = OkHttp.string(url, getQimaoHeaders());
        JsonObject res = JsonParser.parseString(response).getAsJsonObject();
        JsonObject data = res.getAsJsonObject("data");

        vod.setVodName(getJsonString(data, "title", "未知标题"));
        vod.setVodPic(getJsonString(data, "image_link", ""));
        vod.setVodContent(getJsonString(data, "intro", "未知剧情"));
        vod.setVodRemarks(getJsonString(data, "tags", "") + " " + getJsonString(data, "total_episode_num", "0") + "集");
        vod.setVodPlayFrom("七猫短剧");

        JsonArray playList = data.getAsJsonArray("play_list");
        StringBuilder playUrl = new StringBuilder();
        for (int i = 0; i < playList.size(); i++) {
            JsonObject item = playList.get(i).getAsJsonObject();
            if (i > 0) playUrl.append("#");
            playUrl.append(item.get("sort").getAsInt()).append("$").append(item.get("video_url").getAsString());
        }
        vod.setVodPlayUrl(playUrl.toString());
        return vod;
    }

    private Vod fetchWeiguanDetail(String id, Vod vod) throws Exception {
        Platform plat = getPlatformById("围观");
        String url = plat.host + plat.url2 + "?oneId=" + id + "&page=1&pageSize=1000";
        String response = OkHttp.string(url, getHeaders());
        JsonObject res = JsonParser.parseString(response).getAsJsonObject();
        JsonArray data = res.getAsJsonArray("data");

        if (data.size() > 0) {
            JsonObject first = data.get(0).getAsJsonObject();
            vod.setVodName(first.get("title").getAsString());
            vod.setVodPic(getJsonString(first, "vertPoster", ""));
            vod.setVodRemarks("共" + data.size() + "集");
            vod.setVodContent("播放量:" + getJsonString(first, "collectionCount", "0"));
        }
        vod.setVodPlayFrom("围观短剧");

        StringBuilder playUrl = new StringBuilder();
        for (int i = 0; i < data.size(); i++) {
            JsonObject episode = data.get(i).getAsJsonObject();
            if (i > 0) playUrl.append("#");
            playUrl.append(episode.get("title").getAsString()).append("第").append(episode.get("playOrder").getAsInt())
                    .append("集$").append(episode.get("playSetting").toString());
        }
        vod.setVodPlayUrl(playUrl.toString());
        return vod;
    }

    private Vod fetchSuipianDetail(String id, Vod vod) throws Exception {
        String token = getSuipianToken();
        if (token.isEmpty()) return vod;

        Platform plat = getPlatformById("碎片");
        String[] parts = id.split("@");
        String itemId = parts[0];
        String videoCode = parts.length > 1 ? parts[1] : "";

        HashMap<String, String> headers = getHeaders();
        headers.put("Authorization", token);

        String url = plat.host + plat.url2 + "?videoCode=" + videoCode + "&itemId=" + itemId;
        String response = OkHttp.string(url, headers);
        JsonObject res = JsonParser.parseString(response).getAsJsonObject();
        JsonObject data = res.has("data") ? res.getAsJsonObject("data") : res;

        vod.setVodName(data.get("title").getAsString());
        vod.setVodPic("https://speed.hiknz.com/papaya/papaya-file/files/download/" +
                data.get("imageKey").getAsString() + "/" + data.get("imageName").getAsString());
        vod.setVodRemarks("共" + getJsonString(data, "episodesMax", "0") + "集");
        vod.setVodContent(getJsonString(data, "content", getJsonString(data, "description", "")));
        vod.setVodPlayFrom("碎片剧场");

        JsonArray episodesList = data.getAsJsonArray("episodesList");
        StringBuilder playUrl = new StringBuilder();
        for (int i = 0; i < episodesList.size(); i++) {
            JsonObject episode = episodesList.get(i).getAsJsonObject();
            String episodeTitle = "第" + episode.get("episodes").getAsInt() + "集";
            String pUrl = "";

            if (episode.has("resolutionList") && episode.getAsJsonArray("resolutionList").size() > 0) {
                JsonArray resolutionList = episode.getAsJsonArray("resolutionList");
                JsonObject best = resolutionList.get(0).getAsJsonObject();
                for (JsonElement r : resolutionList) {
                    if (r.getAsJsonObject().get("resolution").getAsInt() > best.get("resolution").getAsInt()) {
                        best = r.getAsJsonObject();
                    }
                }
                pUrl = "https://speed.hiknz.com/papaya/papaya-file/files/download/" +
                        best.get("fileKey").getAsString() + "/" + best.get("fileName").getAsString();
            }

            if (!pUrl.isEmpty()) {
                if (playUrl.length() > 0) playUrl.append("#");
                playUrl.append(episodeTitle).append("$").append(pUrl);
            }
        }
        vod.setVodPlayUrl(playUrl.toString());
        return vod;
    }

    // ==================== 播放解析 ====================
    @Override
    public String playerContent(String flag, String id, List<String> vipFlags)   {
        String playUrl = id;

        if (flag.contains("百度")) {
            String response = OkHttp.string(hosts.get("百度") + "/API/bddjss.php?video_id=" + id, getHeaders());
            JsonObject res = JsonParser.parseString(response).getAsJsonObject();
            JsonArray qualities = res.getAsJsonObject("data").getAsJsonArray("qualities");
            // 优先选择高清
            String[] order = {"1080p", "sc", "sd"};
            for (String q : order) {
                for (JsonElement qual : qualities) {
                    if (qual.getAsJsonObject().get("quality").getAsString().equals(q)) {
                        playUrl = qual.getAsJsonObject().get("download_url").getAsString();
                        break;
                    }
                }
                if (!playUrl.equals(id)) break;
            }
        } else if (flag.contains("甜圈")) {
            playUrl = hosts.get("甜圈") + "/duanju/api.php?video_id=" + id + "&type=mp4";
        } else if (flag.contains("锦鲤")) {
            HashMap<String, String> headers = getHeaders();
            headers.put("referer", "https://www.jinlidj.com/");
            String html = OkHttp.string(id + "&auto=1", headers);
            java.util.regex.Matcher m = java.util.regex.Pattern.compile("let data\\s*=\\s*(\\{[^;]*\\});").matcher(html);
            if (m.find()) {
                JsonObject data = JsonParser.parseString(m.group(1)).getAsJsonObject();
                playUrl = data.get("url").getAsString();
            }
        } else if (flag.contains("番茄")) {
            String response = OkHttp.string(hosts.get("番茄2") + "/video?item_ids=" + id, getHeaders());
            JsonObject res = JsonParser.parseString(response).getAsJsonObject();
            if (res.has("data") && res.getAsJsonObject("data").has(id)) {
                String videoModel = res.getAsJsonObject("data").getAsJsonObject(id).get("video_model").getAsString();
                JsonObject vm = JsonParser.parseString(videoModel).getAsJsonObject();
                if (vm.has("video_list") && vm.getAsJsonObject("video_list").has("video_1")) {
                    String encoded = vm.getAsJsonObject("video_list").getAsJsonObject("video_1").get("main_url").getAsString();
                    playUrl = new String(Base64.decode(encoded, Base64.DEFAULT));
                }
            }
        } else if (flag.contains("围观")) {
            // 解析 playSetting JSON
            try {
                JsonObject playSetting = JsonParser.parseString(id).getAsJsonObject();
                if (playSetting.has("super")) {
                    playUrl = playSetting.get("super").getAsString();
                } else if (playSetting.has("high")) {
                    playUrl = playSetting.get("high").getAsString();
                } else if (playSetting.has("normal")) {
                    playUrl = playSetting.get("normal").getAsString();
                }
            } catch (Exception e) {
                playUrl = id;
            }
        }
        // 星芽、西饭、七猫、碎片等平台的播放地址已经是直接可用的

        return Result.get().parse(0).url(playUrl).string();
    }

    // ==================== 搜索 ====================
    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        return searchContent(key, quick, "1");
    }

    @Override
    public String searchContent(String key, boolean quick, String pg) throws Exception {
        List<Vod> list = new ArrayList<>();
        ExecutorService executor = Executors.newFixedThreadPool(platforms.size());
        List<Future<List<Vod>>> futures = new ArrayList<>();

        for (Platform plat : platforms) {
            futures.add(executor.submit(() -> searchPlatform(plat, key, pg)));
        }

        for (Future<List<Vod>> future : futures) {
            try {
                List<Vod> result = future.get(SEARCH_TIMEOUT, TimeUnit.MILLISECONDS);
                list.addAll(result);
            } catch (Exception e) {
                // 忽略超时或失败的平台
            }
        }
        executor.shutdown();

        return Result.string(list);
    }

    private List<Vod> searchPlatform(Platform plat, String key, String page) {
        List<Vod> list = new ArrayList<>();
        try {
            switch (plat.id) {
                case "百度": {
                    String url = plat.host + plat.search.replace("**", URLEncoder.encode(key, "UTF-8")).replace("fypage", page);
                    String response = OkHttp.string(url, getHeaders());
                    JsonObject res = JsonParser.parseString(response).getAsJsonObject();
                    if (res.has("data")) {
                        JsonArray data = res.getAsJsonArray("data");
                        for (JsonElement item : data) {
                            JsonObject obj = item.getAsJsonObject();
                            Vod vod = new Vod();
                            vod.setVodId("百度@" + obj.get("id").getAsString());
                            vod.setVodName(obj.get("title").getAsString());
                            vod.setVodPic(obj.get("cover").getAsString());
                            vod.setVodRemarks("百度短剧");
                            list.add(vod);
                        }
                    }
                    break;
                }
                case "甜圈": {
                    String url = plat.host + plat.search + "=" + URLEncoder.encode(key, "UTF-8") + "&offset=" + page;
                    String response = OkHttp.string(url, getHeaders());
                    JsonObject res = JsonParser.parseString(response).getAsJsonObject();
                    if (res.has("data")) {
                        JsonArray data = res.getAsJsonArray("data");
                        for (JsonElement item : data) {
                            JsonObject obj = item.getAsJsonObject();
                            Vod vod = new Vod();
                            vod.setVodId("甜圈@" + obj.get("book_id").getAsString());
                            vod.setVodName(obj.get("title").getAsString());
                            vod.setVodPic(obj.get("cover").getAsString());
                            vod.setVodRemarks("甜圈短剧");
                            list.add(vod);
                        }
                    }
                    break;
                }
                case "锦鲤": {
                    JSONObject body = new JSONObject();
                    body.put("page", Integer.parseInt(page));
                    body.put("limit", SEARCH_LIMIT);
                    body.put("type_id", "");
                    body.put("year", "");
                    body.put("keyword", key);
                    String response = OkHttp.post(plat.host + plat.search, body.toString(), getHeaders()).getBody();
                    JsonObject res = JsonParser.parseString(response).getAsJsonObject();
                    if (res.has("data") && res.getAsJsonObject("data").has("list")) {
                        JsonArray dataList = res.getAsJsonObject("data").getAsJsonArray("list");
                        for (JsonElement item : dataList) {
                            JsonObject obj = item.getAsJsonObject();
                            Vod vod = new Vod();
                            vod.setVodId("锦鲤@" + obj.get("vod_id").getAsString());
                            vod.setVodName(getJsonString(obj, "vod_name", "未知"));
                            vod.setVodPic(getJsonString(obj, "vod_pic", ""));
                            vod.setVodRemarks("锦鲤短剧");
                            list.add(vod);
                        }
                    }
                    break;
                }
                case "番茄": {
                    String url = plat.search + "?keyword=" + URLEncoder.encode(key, "UTF-8") + "&page=" + page;
                    String response = OkHttp.string(url, getHeaders());
                    JsonObject res = JsonParser.parseString(response).getAsJsonObject();
                    if (res.has("data") && res.get("data").isJsonArray()) {
                        JsonArray data = res.getAsJsonArray("data");
                        for (JsonElement item : data) {
                            JsonObject obj = item.getAsJsonObject();
                            Vod vod = new Vod();
                            vod.setVodId("番茄@" + getJsonString(obj, "series_id", ""));
                            vod.setVodName(getJsonString(obj, "title", "未知"));
                            vod.setVodPic(getJsonString(obj, "cover", ""));
                            vod.setVodRemarks("番茄短剧");
                            list.add(vod);
                        }
                    }
                    break;
                }
                case "星芽": {
                    JSONObject body = new JSONObject();
                    body.put("text", key);
                    String response = OkHttp.post(plat.host + plat.search, body.toString(), getXingyaHeaders()).getBody();
                    JsonObject res = JsonParser.parseString(response).getAsJsonObject();
                    if (res.has("data") && res.getAsJsonObject("data").has("theater")) {
                        JsonArray searchData = res.getAsJsonObject("data").getAsJsonObject("theater").getAsJsonArray("search_data");
                        for (JsonElement item : searchData) {
                            JsonObject obj = item.getAsJsonObject();
                            String detailUrl = plat.host + plat.url2 + "?theater_parent_id=" + obj.get("id").getAsString();
                            Vod vod = new Vod();
                            vod.setVodId("星芽@" + detailUrl);
                            vod.setVodName(obj.get("title").getAsString());
                            vod.setVodPic(getJsonString(obj, "cover_url", ""));
                            vod.setVodRemarks("星芽短剧");
                            list.add(vod);
                        }
                    }
                    break;
                }
                case "围观": {
                    JSONObject postData = new JSONObject();
                    postData.put("audience", "");
                    postData.put("page", Integer.parseInt(page));
                    postData.put("pageSize", SEARCH_LIMIT);
                    postData.put("searchWord", key);
                    postData.put("subject", "");
                    String response = OkHttp.post(plat.host + plat.search, postData.toString(), getHeaders()).getBody();
                    JsonObject res = JsonParser.parseString(response).getAsJsonObject();
                    if (res.has("data") && res.get("data").isJsonArray()) {
                        JsonArray data = res.getAsJsonArray("data");
                        for (JsonElement item : data) {
                            JsonObject obj = item.getAsJsonObject();
                            Vod vod = new Vod();
                            vod.setVodId("围观@" + obj.get("oneId").getAsString());
                            vod.setVodName(obj.get("title").getAsString());
                            vod.setVodPic(getJsonString(obj, "vertPoster", ""));
                            vod.setVodRemarks("围观短剧");
                            list.add(vod);
                        }
                    }
                    break;
                }
                // 更多平台搜索...
            }
        } catch (Exception e) {
            SpiderDebug.log(plat.name + "搜索失败: " + e.getMessage());
        }
        return list;
    }

    // ==================== 工具方法 ====================

    private Platform getPlatformById(String id) {
        for (Platform plat : platforms) {
            if (plat.id.equals(id)) return plat;
        }
        return null;
    }

    private HashMap<String, String> getHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", "okhttp/3.12.11");
        headers.put("Content-Type", "application/json; charset=utf-8");
        return headers;
    }

    private HashMap<String, String> getXingyaHeaders() {
        HashMap<String, String> headers = getHeaders();
        if (!xingyaToken.isEmpty()) {
            headers.put("authorization", xingyaToken);
        }
        return headers;
    }

    private HashMap<String, String> getQimaoHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", "okhttp/3.12.11");
        headers.put("Content-Type", "application/json; charset=utf-8");
        try {
            String sessionId = String.valueOf(System.currentTimeMillis());
            JSONObject data = new JSONObject();
            data.put("static_score", "0.8");
            data.put("uuid", "00000000-7fc7-08dc-0000-000000000000");
            data.put("device-id", "20250220125449b9b8cac84c2dd3d035c9052a2572f7dd0122edde3cc42a70");
            data.put("session-id", sessionId);

            String jsonStr = data.toString();
            String base64Str = Base64.encodeToString(jsonStr.getBytes("UTF-8"), Base64.NO_WRAP);
            StringBuilder qmParams = new StringBuilder();
            for (char c : base64Str.toCharArray()) {
                qmParams.append(CHAR_MAP.getOrDefault(c, c));
            }

            String paramsStr = "AUTHORIZATION=app-version=10001application-id=com.duoduo.readchannel=unknownis-white=net-env=5platform=androidqm-params=" + qmParams + "reg=" + KEYS;
            String sign = md5(paramsStr);

            headers.put("net-env", "5");
            headers.put("channel", "unknown");
            headers.put("platform", "android");
            headers.put("application-id", "com.duoduo.read");
            headers.put("app-version", "10001");
            headers.put("qm-params", qmParams.toString());
            headers.put("sign", sign);
        } catch (Exception e) {
            SpiderDebug.log("七猫参数生成失败: " + e.getMessage());
        }
        return headers;
    }

    private String getSuipianToken() {
        try {
            String openId = md5(UUID.randomUUID().toString()).substring(0, 16);
            String key = encHex(String.valueOf(System.currentTimeMillis()));

            JSONObject body = new JSONObject();
            body.put("openId", openId);

            HashMap<String, String> headers = new HashMap<>();
            headers.put("Content-Type", "application/json");
            headers.put("key", key);

            String response = OkHttp.post(hosts.get("碎片") + "/papaya/papaya-api/oauth2/uuid",
                    body.toString(), headers).getBody();
            JsonObject res = JsonParser.parseString(response).getAsJsonObject();
            if (res.has("data") && res.getAsJsonObject("data").has("token")) {
                return res.getAsJsonObject("data").get("token").getAsString();
            }
        } catch (Exception e) {
            SpiderDebug.log("碎片Token获取失败: " + e.getMessage());
        }
        return "";
    }

    private String md5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digest = md.digest(input.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", b & 0xff));
            }
            return sb.toString();
        } catch (Exception e) {
            return "";
        }
    }

    private String encHex(String txt) {
        try {
            SecretKeySpec keySpec = new SecretKeySpec("p0sfjw@k&qmewu#w".getBytes("UTF-8"), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, keySpec);
            byte[] encrypted = cipher.doFinal(txt.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for (byte b : encrypted) {
                sb.append(String.format("%02x", b & 0xff));
            }
            return sb.toString();
        } catch (Exception e) {
            return "";
        }
    }

    private String getJsonString(JsonObject obj, String key, String defaultValue) {
        if (obj.has(key) && !obj.get(key).isJsonNull()) {
            return obj.get(key).getAsString();
        }
        return defaultValue;
    }
}
