package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C1370pv;
import com.github.catvod.spider.merge.Yy;
import com.github.catvod.spider.merge.ZP;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class TTian extends Spider {

    private static final String API_SIGN_KEY = "7gp0bnd2sr85ydii2j32pcypscoc4w6c7g5spl";

    private String baseUrl;
    private String signKey;
    private String altSignKey = "";

    public TTian() {
        this.signKey = API_SIGN_KEY;
        this.altSignKey = API_SIGN_KEY;
    }

    public static String getRandomDigits(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

    private HashMap<String, String> getDefaultHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", "okhttp/4.9.3");
        headers.put("Referer", " ");
        return headers;
    }

    public String categoryContent(String typeId, String page, boolean filter, HashMap<String, String> filters) {
        try {
            JSONObject result = new JSONObject();
            JSONArray list = new JSONObject(formUploadCate(this.baseUrl + "/v3/home/type_search", typeId, page))
                    .optJSONObject("data").getJSONArray("list");
            JSONArray videos = new JSONArray();
            for (int i = 0; i < list.length(); i++) {
                JSONObject item = list.optJSONObject(i);
                JSONObject video = new JSONObject();
                video.put("vod_id", item.optString("vod_id"));
                video.put("vod_name", item.optString("vod_name"));
                if (item.has("vod_pic")) {
                    video.put("vod_pic", item.optString("vod_pic"));
                } else {
                    video.put("vod_pic", item.optString("vod_pic_thumb"));
                }
                video.put("vod_remarks", item.optString("vod_remarks"));
                videos.put(video);
            }
            result.put("page", page);
            result.put("pagecount", 100);
            result.put("limit", 12);
            result.put("total", 1200);
            result.put("list", videos);
            return result.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    // TODO: Method not decompiled by JADX - needs manual reconstruction
    public String detailContent(List<String> ids) {
        return "";
    }

    public String formUpload(String url) {
        String sign;
        String timestamp = String.valueOf(System.currentTimeMillis() / 1000);
        if (!this.baseUrl.contains("rbot")) {
            sign = ZP.l8(this.signKey + timestamp, ZP.S).toLowerCase();
        } else {
            sign = ZP.l8(this.altSignKey + timestamp, ZP.S).toLowerCase();
        }
        OkHttpClient client = new OkHttpClient();
        String boundary = "--dio-boundary-" + getRandomDigits(10);
        MediaType mediaType = MediaType.parse("multipart/form-data; " + boundary);
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(boundary);
        sb.append("\r\nContent-Disposition: form-data; name=\"\"\r\n\r\n\r\n--");
        sb.append(boundary);
        sb.append("\r\nContent-Disposition: form-data; name=\"sign\"\r\n\r\n");
        sb.append(sign);
        String delimiter = "\r\n--";
        sb.append(delimiter);
        sb.append(boundary);
        sb.append("\r\nContent-Disposition: form-data; name=\"timestamp\"\r\n\r\n");
        sb.append(timestamp);
        sb.append(delimiter);
        sb.append(boundary);
        sb.append("--\r\n\r\n");
        try {
            return client.newCall(new Request.Builder()
                    .url(url)
                    .post(RequestBody.create(mediaType, sb.toString()))
                    .addHeader("User-Agent", "okhttp-okgo/jeasonlzy")
                    .addHeader("content-type", "multipart/form-data; boundary=" + boundary)
                    .build())
                    .execute().body().string();
        } catch (IOException e) {
            return "解析失败";
        }
    }

    public String formUploadCate(String url, String typeId, String page) {
        String sign;
        String timestamp = String.valueOf(System.currentTimeMillis() / 1000);
        if (!this.baseUrl.contains("rbot")) {
            sign = ZP.l8(this.signKey + timestamp, ZP.S).toLowerCase();
        } else {
            sign = ZP.l8(this.altSignKey + timestamp, ZP.S).toLowerCase();
        }
        OkHttpClient client = new OkHttpClient();
        String contentType = "multipart/form-data; boundary=4b8a0b47-84bc-4b6e-b252-db25b4b9abd2";
        String boundary = "4b8a0b47-84bc-4b6e-b252-db25b4b9abd2";
        String body = "--" + boundary + "\r\nContent-Disposition: form-data; name=\"sign\"\r\n\r\n"
                + sign + "\r\n--" + boundary + "\r\nContent-Disposition: form-data; name=\"timestamp\"\r\n\r\n"
                + timestamp + "\r\n--" + boundary + "\r\nContent-Disposition: form-data; name=\"limit\"\r\n\r\n"
                + "12\r\n--" + boundary + "\r\nContent-Disposition: form-data; name=\"type_id\"\r\n\r\n"
                + typeId + "\r\n--" + boundary + "\r\nContent-Disposition: form-data; name=\"page\"\r\n\r\n"
                + page + "\r\n--" + boundary + "\r\n--\r\n\r\n";
        try {
            return client.newCall(new Request.Builder()
                    .url(url)
                    .post(RequestBody.create(MediaType.parse(contentType), body))
                    .addHeader("User-Agent", "okhttp-okgo/jeasonlzy")
                    .addHeader("content-type", contentType)
                    .build())
                    .execute().body().string();
        } catch (IOException e) {
            return "解析失败";
        }
    }

    public String formUploadDetail(String url, String vodId) {
        String sign;
        String timestamp = String.valueOf(System.currentTimeMillis() / 1000);
        if (!this.baseUrl.contains("rbot")) {
            sign = ZP.l8(this.signKey + timestamp, ZP.S).toLowerCase();
        } else {
            sign = ZP.l8(this.altSignKey + timestamp, ZP.S).toLowerCase();
        }
        OkHttpClient client = new OkHttpClient();
        String boundary = "--dio-boundary-" + getRandomDigits(10);
        MediaType mediaType = MediaType.parse("multipart/form-data; " + boundary);
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(boundary);
        sb.append("\r\nContent-Disposition: form-data; name=\"vod_id\"\r\n\r\n");
        sb.append(vodId);
        String delimiter = "\r\n--";
        sb.append(delimiter);
        sb.append(boundary);
        sb.append("\r\nContent-Disposition: form-data; name=\"sign\"\r\n\r\n");
        sb.append(sign);
        sb.append(delimiter);
        sb.append(boundary);
        sb.append("\r\nContent-Disposition: form-data; name=\"timestamp\"\r\n\r\n");
        sb.append(timestamp);
        sb.append(delimiter);
        sb.append(boundary);
        sb.append("--\r\n\r\n");
        try {
            return client.newCall(new Request.Builder()
                    .url(url)
                    .post(RequestBody.create(mediaType, sb.toString()))
                    .addHeader("User-Agent", "okhttp-okgo/jeasonlzy")
                    .addHeader("content-type", "multipart/form-data; boundary=" + boundary)
                    .build())
                    .execute().body().string();
        } catch (IOException e) {
            return "解析失败";
        }
    }

    public String formUploadSearch(String url, String keyword) {
        String sign;
        String timestamp = String.valueOf(System.currentTimeMillis() / 1000);
        if (!this.baseUrl.contains("rbot")) {
            sign = ZP.l8(this.signKey + timestamp, ZP.S).toLowerCase();
        } else {
            sign = ZP.l8(this.altSignKey + timestamp, ZP.S).toLowerCase();
        }
        OkHttpClient client = new OkHttpClient();
        String boundary = "--dio-boundary-" + getRandomDigits(10);
        MediaType mediaType = MediaType.parse("multipart/form-data; " + boundary);
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(boundary);
        sb.append("\r\nContent-Disposition: form-data; name=\"keyword\"\r\n\r\n");
        sb.append(keyword);
        String delimiter = "\r\n--";
        sb.append(delimiter);
        sb.append(boundary);
        sb.append("\r\nContent-Disposition: form-data; name=\"sign\"\r\n\r\n");
        sb.append(sign);
        sb.append(delimiter);
        sb.append(boundary);
        sb.append("\r\nContent-Disposition: form-data; name=\"timestamp\"\r\n\r\n");
        sb.append(timestamp);
        sb.append(delimiter);
        sb.append(boundary);
        sb.append("--\r\n\r\n");
        try {
            return client.newCall(new Request.Builder()
                    .url(url)
                    .post(RequestBody.create(mediaType, sb.toString()))
                    .addHeader("User-Agent", "okhttp-okgo/jeasonlzy")
                    .addHeader("content-type", "multipart/form-data; boundary=" + boundary)
                    .build())
                    .execute().body().string();
        } catch (IOException e) {
            return "解析失败";
        }
    }

    public String homeContent(boolean filter) {
        try {
            JSONObject result = new JSONObject();
            String response = formUpload(this.baseUrl + "/v3/type/top_type");
            JSONArray classes = new JSONArray();
            JSONArray list = new JSONObject(response).optJSONObject("data").getJSONArray("list");
            for (int i = 0; i < list.length(); i++) {
                JSONObject item = list.optJSONObject(i);
                JSONObject cat = new JSONObject();
                cat.put("type_id", item.optString("type_id"));
                cat.put("type_name", item.optString("type_name"));
                classes.put(cat);
            }
            result.put("class", classes);
            if (filter) {
                result.put("filters", new JSONObject("{\"1\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"爱情\",\"v\":\"爱情\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"警匪\",\"v\":\"警匪\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"动画\",\"v\":\"动画\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"武侠\",\"v\":\"武侠\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"枪战\",\"v\":\"枪战\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"惊悚\",\"v\":\"惊悚\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"青春\",\"v\":\"青春\"},{\"n\":\"文艺\",\"v\":\"文艺\"},{\"n\":\"微电影\",\"v\":\"微电影\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"运动\",\"v\":\"运动\"},{\"n\":\"农村\",\"v\":\"农村\"},{\"n\":\"儿童\",\"v\":\"儿童\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"中国大陆\",\"v\":\"大陆\"},{\"n\":\"中国香港\",\"v\":\"香港\"},{\"n\":\"中国台湾\",\"v\":\"台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"意大利\",\"v\":\"意大利\"},{\"n\":\"西班牙\",\"v\":\"西班牙\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}]}],\"2\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"青春偶像\",\"v\":\"青春偶像\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"家庭\",\"v\":\"家庭\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"乡村\",\"v\":\"乡村\"},{\"n\":\"情景\",\"v\":\"情景\"},{\"n\":\"商战\",\"v\":\"商战\"},{\"n\":\"网剧\",\"v\":\"网剧\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"中国大陆\",\"v\":\"大陆\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"新加坡\",\"v\":\"新加坡\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}]}],\"4\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"情感\",\"v\":\"情感\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"热血\",\"v\":\"热血\"},{\"n\":\"推理\",\"v\":\"推理\"},{\"n\":\"搞笑\",\"v\":\"搞笑\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"萝莉\",\"v\":\"萝莉\"},{\"n\":\"校园\",\"v\":\"校园\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"机战\",\"v\":\"机战\"},{\"n\":\"运动\",\"v\":\"运动\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"少年\",\"v\":\"少年\"},{\"n\":\"少女\",\"v\":\"少女\"},{\"n\":\"社会\",\"v\":\"社会\"},{\"n\":\"原创\",\"v\":\"原创\"},{\"n\":\"亲子\",\"v\":\"亲子\"},{\"n\":\"益智\",\"v\":\"益智\"},{\"n\":\"励志\",\"v\":\"励志\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"中国\",\"v\":\"内地\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"欧美\",\"v\":\"欧美\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}],\"3\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"选秀\",\"v\":\"选秀\"},{\"n\":\"情感\",\"v\":\"情感\"},{\"n\":\"访谈\",\"v\":\"访谈\"},{\"n\":\"播报\",\"v\":\"播报\"},{\"n\":\"旅游\",\"v\":\"旅游\"},{\"n\":\"音乐\",\"v\":\"音乐\"},{\"n\":\"美食\",\"v\":\"美食\"},{\"n\":\"纪实\",\"v\":\"纪实\"},{\"n\":\"曲艺\",\"v\":\"曲艺\"},{\"n\":\"生活\",\"v\":\"生活\"},{\"n\":\"游戏互动\",\"v\":\"游戏互动\"},{\"n\":\"财经\",\"v\":\"财经\"},{\"n\":\"求职\",\"v\":\"求职\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"港台\",\"v\":\"港台\"},{\"n\":\"日韩\",\"v\":\"日韩\"},{\"n\":\"欧美\",\"v\":\"欧美\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]}]}]}"));
            }
            return result.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    public String homeVideoContent() {
        try {
            JSONObject response = new JSONObject(formUpload(this.baseUrl + "/v3/type/tj_vod"));
            JSONArray videos = new JSONArray();
            JSONArray list = response.optJSONObject("data").getJSONArray("cai");
            for (int i = 0; i < list.length(); i++) {
                JSONObject item = list.optJSONObject(i);
                JSONObject video = new JSONObject();
                video.put("vod_id", item.optString("vod_id"));
                video.put("vod_name", item.optString("vod_name"));
                if (item.has("vod_pic")) {
                    video.put("vod_pic", item.optString("vod_pic"));
                } else {
                    video.put("vod_pic", item.optString("vod_pic_thumb"));
                }
                video.put("vod_remarks", item.optString("vod_remarks"));
                videos.put(video);
            }
            JSONObject result = new JSONObject();
            result.put("list", videos);
            return result.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    @Override
    public void init(Context context, String extend) throws Exception {
        super.init(context, extend);
        this.baseUrl = C1370pv.l(extend);
    }

    public String parseUrl(String playFrom, String playUrl) {
        JSONObject result = new JSONObject();
        try {
            if (playFrom.length() >= 3) {
                String timestamp = String.valueOf(System.currentTimeMillis() / 1000);
                String sign;
                if (!this.baseUrl.contains("rbot")) {
                    sign = ZP.l8(this.signKey + timestamp, ZP.S).toLowerCase();
                } else {
                    sign = ZP.l8(this.altSignKey + timestamp, ZP.S).toLowerCase();
                }
                String response = Yy.v(playFrom + playUrl + "&sign=" + sign + "&timestamp=" + timestamp, getDefaultHeaders());
                if (response.contains("{")) {
                    JSONObject json = new JSONObject(response);
                    if (json.has("url")) {
                        String url = json.optString("url");
                        if (url == null || url.isEmpty()) {
                            String parsedUrl = json.optString("url");
                            if (parsedUrl.length() < 5) {
                                return "404";
                            }
                            if (parsedUrl.contains("https://material-pro-video-1255975723.cos.ap-beijing.myqcloud.com")) {
                                result.put("jx", 1);
                                result.put("url", playUrl);
                                return result.toString();
                            } else {
                                result.put("parse", 0);
                                result.put("url", parsedUrl);
                                return result.toString();
                            }
                        } else {
                            result.put("parse", 0);
                            result.put("url", playUrl);
                            return result.toString();
                        }
                    } else {
                        if (playUrl.contains(".m3u8")) {
                            result.put("parse", 0);
                            result.put("url", playUrl);
                            return result.toString();
                        } else {
                            if (ZP.l(playUrl)) {
                                result.put("jx", 1);
                                result.put("url", playUrl);
                                return result.toString();
                            } else {
                                return result.toString();
                            }
                        }
                    }
                } else {
                    return "404";
                }
            } else {
                result.put("parse", 0);
                result.put("url", playUrl);
                return result.toString();
            }
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public String playerContent(String playFrom, String playUrl, List<String> vipFlags) {
        try {
            Init2.lj();
            String[] parts = playUrl.split("qiaoji");
            String playSources = parts[1];
            String mainUrl = parts[0];
            if (playSources.contains("end")) {
                String[] urls = playSources.replace("@end", "").split("@");
                for (String url : urls) {
                    String result = parseUrl(url, mainUrl);
                    if (result.contains("404")) {
                        // try next URL
                    } else {
                        return result;
                    }
                }
                return "";
            } else {
                return parseUrl(playSources, mainUrl);
            }
        } catch (Throwable th) {
            return "";
        }
    }

    public String searchContent(String keyword, boolean quick) {
        try {
            JSONObject result = new JSONObject();
            String response = formUploadSearch(this.baseUrl + "/v3/home/search", keyword);
            JSONArray videos = new JSONArray();
            JSONArray list = new JSONObject(response).optJSONObject("data").getJSONArray("list");
            for (int i = 0; i < list.length(); i++) {
                JSONObject item = list.optJSONObject(i);
                JSONObject video = new JSONObject();
                video.put("vod_id", item.optString("vod_id"));
                video.put("vod_name", item.optString("vod_name"));
                if (item.has("vod_pic")) {
                    video.put("vod_pic", item.optString("vod_pic"));
                } else {
                    video.put("vod_pic", item.optString("vod_pic_thumb"));
                }
                video.put("vod_remarks", item.optString("vod_remarks"));
                videos.put(video);
            }
            result.put("list", videos);
            return result.toString();
        } catch (Throwable th) {
            return "";
        }
    }
}
