package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C1370pv;
import com.github.catvod.spider.merge.Yy;
import com.github.catvod.spider.merge.ZP;
import com.github.catvod.spider.merge.xv;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class qiao extends Spider {

    private static final String USER_AGENT = "Dart/2.19 (dart:io)";
    private static final String DEFAULT_USER_AGENT = "Dart/3.0 (dart:io)";

    private String apiUrl = "";
    private String configUrl = "";
    private String encryptionKey = "1238389483762837";
    private String defaultCategoryId = "";
    private String defaultCategoryMold = "";
    public String token = "";
    private String rsaKey = "";
    private String parsedConfig = "";
    private String rawConfig = "";
    private String defaultId = "";
    private String defaultMold = "";
    private String initUrl = "";
    private String decodedData = "";
    private static final String RSA_PUBLIC_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDA+5YTt3w1q/0WGw+TWyCSHTAeYiwBqAqDWot1u/1hoeANpED8gtW1AxB1mYNDQ+9eR8Ml+JC13+ME6RHjEbN4+n9V9OP90c81G0qSjBQ/DKQiMIFjbTH97RjVMtswf96tqwe4Rs/DT2ym6MP4P7QvJcxrFz5VVQXyOtUxhpMc9oktWuk0XKE8Mozu1FM879RknlM6WmJL85Wl/BnZrd+/AQbzziceELGrBfjbc1UOFAxYq2kA10H3o+Z4oOIODxUtXeh4R2oH3vHb4Ynnw6reXED5KsE3u1EO5HMQZyN16TZMTIps32bPe+vQlAT6V5nGcqXGT9fntjqIxJB0T9G3AgMBAAECggEBAKP6Yuh4BZP5g0CwV8jHKuLc6FE469mwdtZsLooo5cF68c3Fnu6xIXQAmZDDk3SpmhCLe7edASF5jwZSIL/H/68xcteQEdZP2/htKy1g16dHT4Q5oQfh9hOkznACGZuZW5ZH+HRNvyZfK5ybtkEPqERTouHwSyfo6feMpDDD/+cf3h1//7JKXKA7JPEU420YucsjQwjMuu5xdPa0TPqEc5mIbOBj753Pzn4GCScM+FRqJWr2x8e+KDPcPY8CUDLBSWxGLsB0A7+bEq/EiAQkbx09QKTwwxRLgVXjBbvyPB8BOuJpPM9BHx+vFcm5WSbkJdRI4qVFtEdsN/gDfFkwcjkCgYEA8Z8i/fTFRnzyvp9Pp8E+bSaYlvpTLUZ1KYNStaDg/BqlYGgGK1Jh90qjvRbBoiIjeBQd3IFLT4pFdd7Z9drLFdvqB22SNeVQU57kir/B6NY5G7yOjXB4qN17F4S3GubYIEcjF0W1tG/uOqqzb8FxrLJTK8WiFudbBt2ioCO4pJsCgYEAzHd8MctmD1Z1eM/xusvX1yCwGpxBuHT+ymThzLXyI6Ej0Q50jOQlf3cTyY/FgGbvAMz+oBybkEwE80gu7CPi0WPs+yCpAIB4+Th7afsrRylQI1ZWoRovaRmsyjnkIw0Mnj06VYNYPtkzm/OViRIqf4ESTTGas24bDm5DuwM9gxUCgYBwg4BR7gdnWYvYRGtdXNlrDowD0jGlZaftWt/LAE2EWAwmpooo5kYEV9eDl/M3QtptckCti++77FGIH+wzVl03op6KMvXg7xXGurkF+2GawRb62YUwS+2EBQ7q1rxFZLXD4hxvG+EPUwgGfbLtGZGLr8aXHYLrU3TJ769pDvlOfQKBgAFlAzzXtU9/eHele3GZuFQoTeswi6Y1bhN1UrDxwMALdlITtinL2JGg/0qNp3wzt4ea3lW7PDhkvFfocyF7MS3ab6Ba3aw6NBkHEJhtdSMcHgbPrPGWWyJtYWdTs8GlciOWKVKx/aUYGCkFJUz1CcMq3zQVlYeJxbd4ew/Iet/tAoGBAMRfvG1iLQAlS3AGaQeRwVxnvpciDn+7/sUCf8DEOk8Bqg4/ytJDTDrWufCtwmpsXmp6AUQig9mNKj7z26wSNbwYdzPsncK+sGRlS7eLAzzcv1a+1pghOOGDuQNzwlFOcauhkrcqjeKmu7OiKD48pvh3ZICiIWS1YL7LuMfUwHRJ";
    JSONArray parsingConfigs = null;

    public qiao() {
    }

    private HashMap<String, String> makeDefaultHeaders() {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", DEFAULT_USER_AGENT);
        return map;
    }

    private HashMap<String, String> makeAuthHeaders(String str) {
        HashMap<String, String> map = new HashMap<>();
        map.put("token", this.token);
        map.put("User-Agent", this.token);
        return map;
    }

    public static String formUpload(String url, String playUrl, String label, String key, String token) {
        OkHttpClient client = new OkHttpClient();
        String boundary = "--dio-boundary-" + getRandomDigits(10);
        MediaType mediaType = MediaType.parse("multipart/form-data; " + boundary);
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(boundary);
        sb.append("\r\nContent-Disposition: form-data; name=\"play_url\"\r\n\r\n");
        sb.append(playUrl);
        String crlf = "\r\n--";
        sb.append(crlf);
        sb.append(boundary);
        sb.append("\r\nContent-Disposition: form-data; name=\"label\"\r\n\r\n");
        sb.append(label);
        sb.append(crlf);
        sb.append(boundary);
        sb.append("\r\nContent-Disposition: form-data; name=\"key\"\r\n\r\n");
        sb.append(key);
        sb.append(crlf);
        sb.append(boundary);
        sb.append("--\r\n\r\n");
        try {
            return client.newCall(new Request.Builder().url(url)
                    .post(RequestBody.create(mediaType, sb.toString()))
                    .addHeader("User-Agent", USER_AGENT)
                    .addHeader("token", token)
                    .addHeader("content-type", "multipart/form-data; boundary=" + boundary)
                    .build()).execute().body().string();
        } catch (IOException e) {
            return "parse_failed";
        }
    }

    public static String formUploadV5(String url, String playUrl, String label, String key, String token, String sign) {
        OkHttpClient client = new OkHttpClient();
        String boundary = "--dio-boundary-" + getRandomDigits(10);
        MediaType mediaType = MediaType.parse("multipart/form-data; " + boundary);
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(boundary);
        sb.append("\r\nContent-Disposition: form-data; name=\"play_url\"\r\n\r\n");
        sb.append(playUrl);
        String crlf = "\r\n--";
        sb.append(crlf);
        sb.append(boundary);
        sb.append("\r\nContent-Disposition: form-data; name=\"label\"\r\n\r\n");
        sb.append(label);
        sb.append(crlf);
        sb.append(boundary);
        sb.append("\r\nContent-Disposition: form-data; name=\"key\"\r\n\r\n");
        sb.append(key);
        sb.append(crlf);
        sb.append(boundary);
        sb.append("\r\nContent-Disposition: form-data; name=\"sign\"\r\n\r\n");
        sb.append(sign);
        sb.append(crlf);
        sb.append(boundary);
        sb.append("--\r\n\r\n");
        try {
            return client.newCall(new Request.Builder().url(url)
                    .post(RequestBody.create(mediaType, sb.toString()))
                    .addHeader("User-Agent", USER_AGENT)
                    .addHeader("token", token)
                    .addHeader("content-type", "multipart/form-data; boundary=" + boundary)
                    .build()).execute().body().string();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getRandomDigits(int length) {
        Random random = new Random();
        String result = "";
        for (int i = 0; i < length; i++) {
            result = result + String.valueOf(random.nextInt(10));
        }
        return result;
    }

    private void loadConfig() {
        JSONObject config = new JSONObject(xv.S(this.rawConfig.substring(1), RSA_PUBLIC_KEY));
        this.rsaKey = config.getString("key");
        this.token = config.getString("token");
        if (!this.apiUrl.isEmpty()) {
            if (config.has("config")) {
                HashMap<String, String> headers = new HashMap<>();
                headers.put("User-Agent", DEFAULT_USER_AGENT);
                String configData = Yy.v(config.getString("config"), headers);
                JSONObject configObj = new JSONObject(configData);
                String domain = configObj.getString("domain");
                this.apiUrl = domain + config.getString("api");
                this.configUrl = domain + config.getString("configurl");
            } else {
                String url = config.getString("url");
                this.apiUrl = url + config.getString("api");
                this.configUrl = url + config.getString("configurl");
            }
        }
    }

    public String categoryContent(String categoryId, String page, boolean filter, HashMap<String, String> filters) {
        try {
            if (this.apiUrl.isEmpty()) {
                loadConfig();
            }
            JSONObject result = new JSONObject();
            String url = this.apiUrl + "/vod/getLists";
            if (filters == null) {
                filters = new HashMap<>();
            }
            if (!filters.containsKey("area")) {
                filters.put("area", "");
            }
            if (!filters.containsKey("type")) {
                filters.put("type", "");
            }
            if (!filters.containsKey("year")) {
                filters.put("year", "");
            }
            if (!filters.containsKey("class")) {
                filters.put("class", "");
            }
            String requestUrl = (((((((url + "?type_id=" + categoryId)
                    + "&area=" + filters.get("area"))
                    + "&lang=")
                    + "&year=" + filters.get("year"))
                    + "&order=time")
                    + "&type_name=" + filters.get("type"))
                    + "&page=" + page)
                    + "&pageSize=21";
            JSONObject response = new JSONObject(Yy.v(requestUrl, makeAuthHeaders(USER_AGENT)));
            int isEncrypted = response.getInt("ENCRYPTION");
            JSONObject data;
            if (isEncrypted != 0) {
                data = new JSONObject(C1370pv.v(response.getString("data"), this.rsaKey, this.encryptionKey));
            } else {
                data = new JSONObject(response.getString("data"));
            }
            JSONArray items = data.getJSONArray("data");
            JSONArray list = new JSONArray();
            for (int i = 0; i < items.length(); i++) {
                JSONObject item = items.getJSONObject(i);
                JSONObject entry = new JSONObject();
                entry.put("vod_id", item.getString("vod_id"));
                entry.put("vod_name", item.getString("vod_name"));
                entry.put("vod_pic", item.getString("vod_pic"));
                entry.put("vod_remarks", item.getString("vod_remarks"));
                list.put(entry);
            }
            int total = data.getInt("total");
            int lastPage = data.getInt("last_page");
            int perPage = data.getInt("per_page");
            result.put("page", page);
            result.put("pagecount", lastPage);
            result.put("limit", perPage);
            result.put("total", total);
            result.put("list", list);
            return result.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    public String detailContent(List<String> list) {
        return "";
    }

    public String homeContent(boolean filter) {
        try {
            if (this.apiUrl.isEmpty()) {
                loadConfig();
            }
            String responseText = Yy.v(this.configUrl, makeAuthHeaders(USER_AGENT));
            JSONObject result = new JSONObject();
            JSONArray categories = new JSONArray();
            JSONObject response = new JSONObject(responseText);
            int isEncrypted = response.getInt("ENCRYPTION");
            JSONArray homeCate;
            if (isEncrypted != 0) {
                homeCate = new JSONObject(C1370pv.v(response.getString("data"), this.rsaKey, this.encryptionKey)).getJSONArray("get_home_cate");
            } else {
                homeCate = new JSONObject(response.getString("data")).getJSONArray("get_home_cate");
            }
            for (int i = 0; i < homeCate.length(); i++) {
                JSONObject cateItem = homeCate.getJSONObject(i);
                if (!cateItem.has("cate")) {
                    this.defaultCategoryId = cateItem.getString("id");
                    this.defaultCategoryMold = cateItem.getString("mold");
                } else {
                    JSONObject catEntry = new JSONObject();
                    if (cateItem.has("cate")) {
                        catEntry.put("type_id", cateItem.getString("cate"));
                    } else {
                        catEntry.put("type_id", cateItem.getString("id"));
                    }
                    catEntry.put("type_name", cateItem.getString("title"));
                    categories.put(catEntry);
                }
            }
            result.put("class", categories);
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
            JSONObject response = new JSONObject(Yy.v(this.apiUrl + "/home/cateData?id=" + this.defaultCategoryId, makeAuthHeaders(USER_AGENT)));
            JSONArray list = new JSONArray();
            int isEncrypted = response.getInt("ENCRYPTION");
            JSONArray items;
            if (isEncrypted != 0) {
                items = new JSONObject(response.getString("data")).getJSONArray("sections").getJSONObject(1).getJSONArray("items");
            } else {
                items = new JSONObject(C1370pv.v(response.getString("data"), this.rsaKey, this.encryptionKey)).getJSONArray("sections").getJSONObject(1).getJSONArray("items");
            }
            for (int i = 0; i < items.length(); i++) {
                JSONObject item = items.getJSONObject(i);
                JSONObject entry = new JSONObject();
                entry.put("vod_id", item.getString("vod_id"));
                entry.put("vod_name", item.getString("vod_name"));
                entry.put("vod_pic", item.getString("vod_pic"));
                entry.put("vod_remarks", item.getString("vod_remarks"));
                list.put(entry);
            }
            JSONObject result = new JSONObject();
            result.put("list", list);
            return result.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    public void init(Context context, String str) {
        super.init(context, str);
        this.rawConfig = str;
        String decodedUrl = C1370pv.l(str);
        HashMap<String, String> headers = makeDefaultHeaders();
        str = Yy.v(decodedUrl, headers);
    }

    public String playerContent(String vodId, String playUrl, List<String> flags) {
        try {
            JSONObject result = new JSONObject();
            String[] parts = playUrl.split("&");
            String sourceUrl = parts[0];
            String playKey = parts[1];
            String proxyUrl = this.apiUrl + "/parsing/proxy";
            if (this.parsingConfigs == null || this.parsingConfigs.length() == 0) {
                JSONObject response = new JSONObject(Yy.v(this.configUrl, makeAuthHeaders(USER_AGENT)));
                int isEncrypted = response.getInt("ENCRYPTION");
                if (isEncrypted != 0) {
                    this.parsingConfigs = new JSONObject(response.getString("data")).getJSONArray("get_parsing");
                } else {
                    this.parsingConfigs = new JSONObject(C1370pv.v(response.getString("data"), this.rsaKey, this.encryptionKey)).getJSONArray("get_parsing");
                }
            }
            for (int i = 0; i < this.parsingConfigs.length(); i++) {
                JSONObject parser = this.parsingConfigs.getJSONObject(i);
                if (parser.getString("key").contains(playKey)) {
                    JSONArray parserConfigs = parser.getJSONArray("config");
                    if (parserConfigs.length() != 0) {
                        if (ZP.OL(sourceUrl)) {
                            result.put("parse", 0);
                            result.put("url", sourceUrl);
                        }
                    } else if (ZP.OL(sourceUrl)) {
                        result.put("parse", 0);
                        result.put("url", sourceUrl);
                    }
                    for (int j = 0; j < parserConfigs.length(); j++) {
                        String label = parserConfigs.getJSONObject(j).getString("label");
                        String parseUrl = parserConfigs.getJSONObject(j).getString("url");
                        String uploadResult = formUpload(proxyUrl, sourceUrl, label, playKey, this.token);
                        if (uploadResult.contains("parse_failed")) {
                            JSONObject fallbackResponse = new JSONObject(Yy.v(parseUrl + sourceUrl, makeAuthHeaders(USER_AGENT)));
                            if (fallbackResponse.has("url")) {
                                String url = fallbackResponse.getString("url");
                                if (!url.equals("")) {
                                    result.put("parse", 0);
                                    result.put("url", url);
                                }
                            }
                        } else {
                            int uploadEncrypted = new JSONObject(uploadResult).getInt("ENCRYPTION");
                            JSONObject uploadData;
                            if (uploadEncrypted != 0) {
                                uploadData = new JSONObject(new JSONObject(uploadResult).getString("data"));
                            } else {
                                uploadData = new JSONObject(C1370pv.v(new JSONObject(uploadResult).getString("data"), this.rsaKey, this.encryptionKey));
                            }
                            if (uploadData.has("url")) {
                                String url = uploadData.getString("url");
                                if (!url.equals("")) {
                                    result.put("parse", 0);
                                    result.put("url", url);
                                }
                            }
                        }
                    }
                }
            }
            return result.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    public String searchContent(String keyword, boolean quick) {
        try {
            if (this.apiUrl.isEmpty()) {
                loadConfig();
            }
            JSONObject result = new JSONObject();
            String url = this.apiUrl + "/vod/getVodSearch?wd=" + URLEncoder.encode(keyword) + "&page=1&type=";
            String responseText = Yy.v(url, makeAuthHeaders(USER_AGENT));
            JSONArray list = new JSONArray();
            JSONObject response = new JSONObject(responseText);
            int isEncrypted = response.getInt("ENCRYPTION");
            JSONArray items;
            if (isEncrypted != 0) {
                items = new JSONObject(response.getString("data")).getJSONArray("data");
            } else {
                items = new JSONObject(C1370pv.v(response.getString("data"), this.rsaKey, this.encryptionKey)).getJSONArray("data");
            }
            for (int i = 0; i < items.length(); i++) {
                JSONObject item = items.getJSONObject(i);
                JSONObject entry = new JSONObject();
                entry.put("vod_id", item.getString("vod_id"));
                entry.put("vod_name", item.getString("vod_name"));
                entry.put("vod_pic", item.getString("vod_pic"));
                entry.put("vod_remarks", item.getString("vod_remarks"));
                list.put(entry);
            }
            result.put("list", list);
            return result.toString();
        } catch (Throwable th) {
            return "";
        }
    }
}
