package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.AbstractC0099V3;
import com.github.catvod.spider.merge.C0079Nx;
import com.github.catvod.spider.merge.C0106ZJ;
import com.github.catvod.spider.merge.C0118ga;
import com.github.catvod.spider.merge.C0131mQ;
import com.github.catvod.spider.merge.C0154wT;
import java.io.ByteArrayInputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

public class Hmys extends Spider {

    private static final String API_KEY = "vT1RQRz8YzlzTgN26pIXNJ7Mi65juwSP";
    private static final Pattern HLS_PATTERN = Pattern.compile("(\\S+.ts)|(#EXT-X-KEY:\\S+\")(\\S+)(\")");

    private static final String AES_IV = "ZT8g6QH2kS3Xj7G5wG4JtU1F";
    private static final String AES_KEY = "51518888";
    private static final String APP_VERSION = "20000";
    private static final String PACKAGE_NAME = "com.leosnv";
    private static final String APP_NAME = "河马视频";
    private static final String CHANNEL = "shiguang";
    private static final String VERSION_CODE = "baiyun";
    private static final String MD5_HASH = "a0b3e42be8e9b38ce9ef13fd71d1470e";

    private String baseUrl = "";
    private String deviceId = "";
    private String loginData = "";
    private String authToken = "";

    private HashMap<String, String> createHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Device-Id", URLEncoder.encode(Build.MODEL));
        headers.put("Mob-Model", URLEncoder.encode(Build.MODEL));
        headers.put("Screen-Width", "1080");
        headers.put("Screen-Height", "2340");
        headers.put("Mob-Mfr", URLEncoder.encode(Build.BRAND));
        headers.put("Sys-Platform", "Android");
        headers.put("Sys-Release", String.valueOf(Build.VERSION.SDK_INT));
        headers.put("prefersex", "1");
        headers.put("Token", this.authToken);
        headers.put("Accept", "application/vnd.yourapi.v1.full+json");
        headers.put("User-Agent", PACKAGE_NAME);
        headers.put("appid", APP_VERSION);
        headers.put("Channel", CHANNEL);
        headers.put("Version-Code", VERSION_CODE);
        String timestamp = String.valueOf(System.currentTimeMillis());
        headers.put("Cur-Time", timestamp);
        headers.put("timestamp", timestamp);
        return headers;
    }

    private String signUrl(String url) {
        String path = Uri.parse(url).getPath();
        String hexTime = Integer.toHexString((int) (System.currentTimeMillis() / 1000));
        String signature = C0118ga.m604q(API_KEY + path + hexTime, C0118ga.f677xC).toLowerCase();
        return url + "&wsSecret=" + signature + "&wsTime=" + hexTime;
    }

    private String decryptResponse(String jsonStr) {
        try {
            return C0079Nx.m309q(
                new JSONObject(jsonStr).optString("data").replaceAll("\n", ""),
                AES_IV, AES_KEY);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void init(Context context, String str) throws Exception {
        super.init(context, str);
        this.baseUrl = str;
        try {
            android.content.SharedPreferences prefs = context.getSharedPreferences("sp_Sgys", 0);
            this.deviceId = prefs.getString("device", null);
            if (this.deviceId == null) {
                this.deviceId = C0154wT.m739xC(16);
                prefs.edit().putString("device", this.deviceId).apply();
            }
        } catch (Throwable e) {
            if (this.deviceId == null) {
                this.deviceId = C0154wT.m739xC(16);
            }
        }
        regLogin();
    }

    private void regLogin() {
        try {
            C0154wT.m737QU();
            HashMap<String, String> params = new HashMap<>();
            params.put("action", "6");
            AbstractC0099V3.Qe loginReq = new AbstractC0099V3.Qe(this) {
                @Override public void onFailure(Call call, Exception exc) {}
                @Override public String onResponse(String str) { return str; }
            };
            C0106ZJ.m492i(C0106ZJ.m488QU(),
                this.baseUrl + "/api/stats/login", params, createHeaders(), loginReq);
            android.util.Log.d("TTT", "loginFormat = " + decryptResponse(loginReq.getResult()));

            HashMap<String, String> initParams = new HashMap<>();
            initParams.put("password", "");
            initParams.put("account", "");
            C0106ZJ.m492i(C0106ZJ.m488QU(),
                this.baseUrl + "/api/user/init", initParams, createHeaders(), loginReq);
            String initResult = decryptResponse(loginReq.getResult());
            this.loginData = initResult;
            this.authToken = new JSONObject(this.loginData)
                .getJSONObject("result").getJSONObject("user_info").getString("token");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        try {
            int page = Integer.parseInt(pg);
            if (page == 0) page = 1;

            if (extend == null) extend = new HashMap<>();
            extend.putIfAbsent("area", "全部");
            extend.putIfAbsent("type", "全部");
            extend.putIfAbsent("year", "全部");
            extend.putIfAbsent("class", "全部");

            HashMap<String, String> params = new HashMap<>();
            params.put("cate", extend.get("type"));
            params.put("order", "全部");
            params.put("type_pid", tid);
            params.put("page", String.valueOf(page));
            params.put("area", extend.get("area"));
            params.put("length", "12");
            params.put("year", extend.get("year"));

            JSONArray videoList = new JSONArray();
            AbstractC0099V3.Qe req = new AbstractC0099V3.Qe(this, videoList) {
                @Override public void onFailure(Call call, Exception exc) {}
                @Override public String onResponse(String str) {
                    try {
                        JSONArray items = new JSONObject(decryptResponse(str)).getJSONArray("result");
                        for (int i = 0; i < items.length(); i++) {
                            JSONObject item = items.getJSONObject(i);
                            JSONObject entry = new JSONObject();
                            entry.put("vod_id", item.getString("vod_id"));
                            entry.put("vod_name", item.getString("title"));
                            entry.put("vod_pic", item.optString("pic"));
                            String score = item.optString("score");
                            if (score.equals("null")) score = "";
                            entry.put("vod_remarks", score);
                            videoList.put(entry);
                        }
                    } catch (Exception e) { throw new RuntimeException(e); }
                    return str;
                }
            };
            C0106ZJ.m492i(C0106ZJ.m488QU(),
                this.baseUrl + "/api/block/category", params, createHeaders(), req);

            JSONObject response = new JSONObject();
            response.put("page", page);
            int total = videoList.length();
            page = total == 12 ? page + 1 : page;
            response.put("pagecount", page);
            response.put("limit", 12);
            response.put("total", Integer.MAX_VALUE);
            response.put("list", videoList);
            return response.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    @Override
    public String homeContent(boolean filter) {
        try {
            JSONObject response = new JSONObject();
            JSONArray categories = new JSONArray();
            AbstractC0099V3.Qe req = new AbstractC0099V3.Qe(this) {
                @Override public void onFailure(Call call, Exception exc) {}
                @Override public String onResponse(String str) { return str; }
            };
            HashMap<String, String> params = new HashMap<>();
            C0106ZJ.m492i(C0106ZJ.m488QU(),
                this.baseUrl + "/api/block/category_type", params, createHeaders(), req);
            JSONArray result = new JSONObject(decryptResponse(req.getResult())).getJSONArray("result");
            for (int i = 0; i < result.length(); i++) {
                JSONObject cat = result.getJSONObject(i);
                JSONObject entry = new JSONObject();
                entry.put("type_id", cat.getString("type_pid"));
                entry.put("type_name", cat.getString("type_name"));
                categories.put(entry);
            }
            response.put("class", categories);
            if (filter) {
                String filtersJson = "{\"1\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"爱情\",\"v\":\"爱情\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"警匪\",\"v\":\"警匪\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"动画\",\"v\":\"动画\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"武侠\",\"v\":\"武侠\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"枪战\",\"v\":\"枪战\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"惊悚\",\"v\":\"惊悚\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"青春\",\"v\":\"青春\"},{\"n\":\"文艺\",\"v\":\"文艺\"},{\"n\":\"微电影\",\"v\":\"微电影\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"运动\",\"v\":\"运动\"},{\"n\":\"农村\",\"v\":\"农村\"},{\"n\":\"儿童\",\"v\":\"儿童\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"中国大陆\",\"v\":\"大陆\"},{\"n\":\"中国香港\",\"v\":\"香港\"},{\"n\":\"中国台湾\",\"v\":\"台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"意大利\",\"v\":\"意大利\"},{\"n\":\"西班牙\",\"v\":\"西班牙\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}]}],\"2\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"青春偶像\",\"v\":\"青春偶像\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"家庭\",\"v\":\"家庭\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"乡村\",\"v\":\"乡村\"},{\"n\":\"情景\",\"v\":\"情景\"},{\"n\":\"商战\",\"v\":\"商战\"},{\"n\":\"网剧\",\"v\":\"网剧\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"中国大陆\",\"v\":\"大陆\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"新加坡\",\"v\":\"新加坡\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}]}],\"4\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"情感\",\"v\":\"情感\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"热血\",\"v\":\"热血\"},{\"n\":\"推理\",\"v\":\"推理\"},{\"n\":\"搞笑\",\"v\":\"搞笑\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"萝莉\",\"v\":\"萝莉\"},{\"n\":\"校园\",\"v\":\"校园\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"机战\",\"v\":\"机战\"},{\"n\":\"运动\",\"v\":\"运动\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"少年\",\"v\":\"少年\"},{\"n\":\"少女\",\"v\":\"少女\"},{\"n\":\"社会\",\"v\":\"社会\"},{\"n\":\"原创\",\"v\":\"原创\"},{\"n\":\"亲子\",\"v\":\"亲子\"},{\"n\":\"益智\",\"v\":\"益智\"},{\"n\":\"励志\",\"v\":\"励志\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"中国\",\"v\":\"内地\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"欧美\",\"v\":\"欧美\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}],\"3\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"选秀\",\"v\":\"选秀\"},{\"n\":\"情感\",\"v\":\"情感\"},{\"n\":\"访谈\",\"v\":\"访谈\"},{\"n\":\"播报\",\"v\":\"播报\"},{\"n\":\"旅游\",\"v\":\"旅游\"},{\"n\":\"音乐\",\"v\":\"音乐\"},{\"n\":\"美食\",\"v\":\"美食\"},{\"n\":\"纪实\",\"v\":\"纪实\"},{\"n\":\"曲艺\",\"v\":\"曲艺\"},{\"n\":\"生活\",\"v\":\"生活\"},{\"n\":\"游戏互动\",\"v\":\"游戏互动\"},{\"n\":\"财经\",\"v\":\"财经\"},{\"n\":\"求职\",\"v\":\"求职\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"港台\",\"v\":\"港台\"},{\"n\":\"日韩\",\"v\":\"日韩\"},{\"n\":\"欧美\",\"v\":\"欧美\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]}]}";
                response.put("filters", new JSONObject(filtersJson));
            }
            return response.toString();
        } catch (Throwable e) {
            return "";
        }
    }

    @Override
    public String homeVideoContent() {
        try {
            JSONArray videoList = new JSONArray();
            AbstractC0099V3.Qe req = new AbstractC0099V3.Qe(this) {
                @Override public void onFailure(Call call, Exception exc) {}
                @Override public String onResponse(String str) { return str; }
            };
            HashMap<String, String> params = new HashMap<>();
            C0106ZJ.m492i(C0106ZJ.m488QU(),
                this.baseUrl + "/api/nav/index?nav_id=98", params, createHeaders(), req);
            JSONArray items = new JSONObject(decryptResponse(req.getResult()))
                .getJSONArray("result").getJSONObject(1)
                .getJSONArray("block_list").getJSONObject(0)
                .getJSONArray("vod_list");
            for (int i = 0; i < items.length(); i++) {
                JSONObject item = items.getJSONObject(i);
                JSONObject entry = new JSONObject();
                entry.put("vod_id", item.getString("vod_id"));
                entry.put("vod_name", item.getString("title"));
                entry.put("vod_pic", item.getString("pic"));
                entry.put("vod_remarks", item.getString("score"));
                videoList.put(entry);
            }
            JSONObject response = new JSONObject();
            response.put("list", videoList);
            return response.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    @Override
    public String detailContent(List<String> ids) {
        try {
            JSONObject response = new JSONObject();
            HashMap<String, String> params = new HashMap<>();
            params.put("vod_id", ids.get(0));
            ArrayList<String> playSources = new ArrayList<>();
            C0106ZJ.m492i(C0106ZJ.m488QU(),
                this.baseUrl + "/api/vod/info", params, createHeaders(),
                new AbstractC0099V3.Qe(this, response, playSources) {
                    @Override public void onFailure(Call call, Exception exc) {}
                    @Override public String onResponse(String str) {
                        try {
                            JSONObject result = new JSONObject(decryptResponse(str)).getJSONObject("result");
                            JSONArray mapList = result.getJSONArray("map_list");
                            String vodId = result.getString("id");
                            response.put("vod_id", vodId);
                            response.put("vod_name", result.getString("title"));
                            response.put("vod_pic", result.getString("pic"));
                            response.put("vod_remarks", result.getString("remarks"));
                            response.put("vod_actor", result.getString("actor"));
                            response.put("vod_director", result.getString("director"));
                            response.put("type_name", result.getString("tags"));
                            response.put("vod_year", result.getString("year"));
                            response.put("vod_area", result.getString("area"));
                            response.put("vod_content", result.getString("intro"));
                            response.put("vod_play_from", "秒播");
                            ArrayList<String> episodes = new ArrayList<>();
                            for (int i = 0; i < mapList.length(); i++) {
                                JSONObject ep = mapList.getJSONObject(i);
                                episodes.add(ep.getString("title") + "$"
                                    + vodId + "|" + ep.getString("id") + "|"
                                    + ep.getString("collection"));
                            }
                            playSources.add(TextUtils.join("#", episodes));
                        } catch (Exception e) { throw new RuntimeException(e); }
                        return str;
                    }
                });
            response.put("vod_play_url", TextUtils.join("$$$", playSources));
            JSONObject wrapper = new JSONObject();
            JSONArray list = new JSONArray();
            list.put(response);
            wrapper.put("list", list);
            return wrapper.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    @Override
    public String playerContent(String flag, String id, List<String> vodFlags) {
        JSONObject result = new JSONObject();
        String[] parts = id.split("\\|");
        String vodId = parts[0];
        String mapId = parts[1];
        String collection = parts[2];
        try {
            AbstractC0099V3.Qe req = new AbstractC0099V3.Qe(this) {
                @Override public void onFailure(Call call, Exception exc) {}
                @Override public String onResponse(String str) { return str; }
            };
            HashMap<String, String> params = new HashMap<>();
            params.put("xz", "0");
            params.put("collection", collection);
            params.put("vod_map_id", mapId);
            params.put("vod_id", vodId);
            C0106ZJ.m492i(C0106ZJ.m488QU(),
                this.baseUrl + "/api/vod/play_url", params, createHeaders(), req);
            JSONObject data = new JSONObject(decryptResponse(req.getResult())).getJSONObject("result");
            String playUrl = Proxy.localProxyUrl()
                + "?do=hmys&type=m3u8&url="
                + Base64.encodeToString(data.getString("vod_url").getBytes(C0118ga.f677xC), 10)
                + "&ck=" + data.getString("ck");
            result.put("parse", 0);
            result.put("url", playUrl);
            result.put("playUrl", "");
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return result.toString();
    }

    @Override
    public String searchContent(String keyword, boolean quick) {
        try {
            JSONArray videoList = new JSONArray();
            try {
                HashMap<String, String> params = new HashMap<>();
                params.put("pn", "1");
                params.put("type_pid", "0");
                params.put("kw", keyword);
                C0106ZJ.m492i(C0106ZJ.m488QU(),
                    this.baseUrl + "/api/search/result", params, createHeaders(),
                    new AbstractC0099V3.Qe(this, keyword, videoList) {
                        @Override public void onFailure(Call call, Exception exc) {}
                        @Override public String onResponse(String str) {
                            try {
                                JSONArray items = new JSONObject(decryptResponse(str)).getJSONArray("result");
                                for (int i = 0; i < items.length(); i++) {
                                    JSONObject item = items.getJSONObject(i);
                                    if (!item.getString("title").contains(keyword)) continue;
                                    JSONObject entry = new JSONObject();
                                    entry.put("vod_id", item.getString("vod_id"));
                                    entry.put("vod_name", item.getString("title"));
                                    entry.put("vod_pic", item.optString("pic"));
                                    String serial = item.optString("serial");
                                    if (serial.equals("null")) serial = "";
                                    entry.put("vod_remarks", serial);
                                    videoList.put(entry);
                                }
                            } catch (Exception e) { throw new RuntimeException(e); }
                            return str;
                        }
                    });
            } catch (Exception ignored) {}
            JSONObject response = new JSONObject();
            response.put("list", videoList);
            return response.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public static Object[] vod(Map<String, String> map) {
        String type = map.get("type");
        String encodedUrl = map.get("url");
        String ck = map.get("ck");
        String contentUrl = new String(Base64.decode(encodedUrl, Base64.URL_SAFE), C0118ga.f677xC);
        try {
            if (type.equals("m3u8")) {
                return proxyM3u8(contentUrl, ck);
            } else if (type.equals("ts")) {
                return proxyTs(contentUrl, ck);
            }
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static Object[] proxyM3u8(String contentUrl, String ck) {
        String signedUrl = signUrl(contentUrl);
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.114 Safari/537.36");
        headers.put("Accept", "*/*");
        AbstractC0099V3.p req = new AbstractC0099V3.p() {
            @Override public void onFailure(Call call, Exception exc) {}
            @Override public String onResponse(Response response) { return null; }
        };
        C0106ZJ.m490UJ(C0106ZJ.m488QU(), signedUrl, null, headers, req);
        Response resp = req.getResult();
        if (resp.code() != 200) return null;
        String contentType = resp.headers().get("Content-Type");
        if (contentType == null) contentType = "application/octet-stream";
        return new Object[]{200, contentType, resp.body().byteStream()};
    }

    private static Object[] proxyTs(String contentUrl, String ck) {
        String path = Uri.parse(contentUrl).getPath();
        String hexTime = Integer.toHexString((int) (System.currentTimeMillis() / 1000));
        String signature = C0118ga.m604q(API_KEY + path + hexTime, C0118ga.f677xC).toLowerCase();
        String encodedParam = new String(C0131mQ.m678q(ck));
        String signedUrl = contentUrl + "?" + encodedParam
            + "&wsSecret=" + signature + "&wsTime=" + hexTime;

        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.114 Safari/537.36");
        headers.put("Accept", "*/*");
        String responseHtml = C0106ZJ.m484FN(signedUrl, headers);

        String baseUrl = contentUrl.substring(0, contentUrl.indexOf(Uri.parse(contentUrl).getLastPathSegment()));
        StringBuilder result = new StringBuilder();
        Matcher matcher = HLS_PATTERN.matcher(responseHtml);
        int lastEnd = 0;
        while (matcher.find()) {
            result.append(responseHtml, lastEnd, matcher.start());
            if (matcher.group().contains("EXT-X-KEY")) {
                StringBuilder proxyUrl = new StringBuilder();
                proxyUrl.append(Proxy.localProxyUrl());
                proxyUrl.append("?do=hmys&type=ts&url=");
                proxyUrl.append(Base64.encodeToString(
                    (baseUrl + matcher.group(1)).getBytes(C0118ga.f677xC), Base64.URL_SAFE));
                proxyUrl.append("&ck=");
                proxyUrl.append(encodedParam.replace("&", "|"));
                result.append(proxyUrl);
            }
            lastEnd = matcher.end();
        }
        result.append(responseHtml, lastEnd, responseHtml.length());
        return new Object[]{200, "application/octet-stream",
            new ByteArrayInputStream(result.toString().getBytes(C0118ga.f677xC))};
    }
}
