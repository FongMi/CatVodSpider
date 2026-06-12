package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.*;
import okhttp3.*;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class qiao2 extends Spider {

    private static String staticToken = "";

    private String apiBaseUrl = "";
    private String configUrl = "";
    private String signData = "";
    private String homeCateId = "";
    private String homeMold = "";
    private String apiKey = "";
    private String signUrl = "";
    private String appName = "";
    private String localUuid = "";
    private String rsaPublicKey = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDA+5YTt3w1q/0WGw+TWyCSHTAeYiwBqAqDWot1u/1hoeANpED8gtW1AxB1mYNDQ+9eR8Ml+JC13+ME6RHjEbN4+n9V9OP90c81G0qSjBQ/DKQiMIFjbTH97RjVMtswf96tqwe4Rs/DT2ym6MP4P7QvJcxrFz5VVQXyOtUxhpMc9oktWuk0XKE8Mozu1FM879RknlM6WmJL85Wl/BnZrd+/AQbzziceELGrBfjbc1UOFAxYq2kA10H3o+Z4oOIODxUtXeh4R2oH3vHb4Ynnw6reXED5KsE3u1EO5HMQZyN16TZMTIps32bPe+vQlAT6V5nGcqXGT9fntjqIxJB0T9G3AgMBAAECggEBAKP6Yuh4BZP5g0CwV8jHKuLc6FE469mwdtZsLooo5cF68c3Fnu6xIXQAmZDDk3SpmhCLe7edASF5jwZSIL/H/68xcteQEdZP2/htKy1g16dHT4Q5oQfh9hOkznACGZuZW5ZH+HRNvyZfK5ybtkEPqERTouHwSyfo6feMpDDD/+cf3h1//7JKXKA7JPEU420YucsjQwjMuu5xdPa0TPqEc5mIbOBj753Pzn4GCScM+FRqJWr2x8e+KDPcPY8CUDLBSWxGLsB0A7+bEq/EiAQkbx09QKTwwxRLgVXjBbvyPB8BOuJpPM9BHx+vFcm5WSbkJdRI4qVFtEdsN/gDfFkwcjkCgYEA8Z8i/fTFRnzyvp9Pp8E+bSaYlvpTLUZ1KYNStaDg/BqlYGgGK1Jh90qjvRbBoiIjeBQd3IFLT4pFdd7Z9drLFdvqB22SNeVQU57kir/B6NY5G7yOjXB4qN17F4S3GubYIEcjF0W1tG/uOqqzb8FxrLJTK8WiFudbBt2ioCO4pJsCgYEAzHd8MctmD1Z1eM/xusvX1yCwGpxBuHT+ymThzLXyI6Ej0Q50jOQlf3cTyY/FgGbvAMz+oBybkEwE80gu7CPi0WPs+yCpAIB4+Th7afsrRylQI1ZWoRovaRmsyjnkIw0Mnj06VYNYPtkzm/OViRIqf4ESTTGas24bDm5DuwM9gxUCgYBwg4BR7gdnWYvYRGtdXNlrDowD0jGlZaftWt/LAE2EWAwmpooo5kYEV9eDl/M3QtptckCti++77FGIH+wzVl03op6KMvXg7xXGurkF+2GawRb62YUwS+2EBQ7q1rxFZLXD4hxvG+EPUwgGfbLtGZGLr8aXHYLrU3TJ769pDvlOfQKBgAFlAzzXtU9/eHele3GZuFQoTeswi6Y1bhN1UrDxwMALdlITtinL2JGg/0qNp3wzt4ea3lW7PDhkvFfocyF7MS3ab6Ba3aw6NBkHEJhtdSMcHgbPrPGWWyJtYWdTs8GlciOWKVKx/aUYGCkFJUz1CcMq3zQVlYeJxbd4ew/Iet/tAoGBAMRfvG1iLQAlS3AGaQeRwVxnvpciDn+7/sUCf8DEOk8Bqg4/ytJDTDrWufCtwmpsXmp6AUQig9mNKj7z26wSNbwYdzPsncK+sGRlS7eLAzzcv1a+1pghOOGDuQNzwlFOcauhkrcqjeKmu7OiKD48pvh3ZICiIWS1YL7LuMfUwHRJ";
    JSONArray cachedData = null;

    public qiao2() {
    }

    private HashMap<String, String> makeUserAgentHeaders() {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", "Dart/3.0 (dart:io)");
        return map;
    }

    private HashMap<String, String> makeTokenHeaders(String str) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Content-Type", "application/json");
        map.put("token", staticToken);
        map.put("user-agent", "Dart/2.19 (dart:io)");
        map.put("appto-local-uuid", this.localUuid);
        return map;
    }

    private String makeSign(String type) {
        xx.ut utVar = new xx.ut(this) {
            final qiao2 S;

            {
                this.S = qiao2.this;
            }

            @Override
            public void onFailure(Call call, Exception exc) {
            }

            @Override
            public String onResponse(String str2) {
                return str2;
            }
        };
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("site", this.appName);
            jSONObject.put("type", type);
            Yy.N(Yy.T4(), this.signUrl, jSONObject.toString(), makeUserAgentHeaders(), utVar);
            return utVar.getResult();
        } catch (Throwable th) {
            return "";
        }
    }

    public static String formUpload(String str, String playUrl, String label, String key, String token) {
        OkHttpClient okHttpClient = new OkHttpClient();
        String boundary = "--dio-boundary-" + getRandomDigits(10);
        MediaType mediaType = MediaType.parse("multipart/form-data; " + boundary);
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(boundary);
        sb.append("\r\nContent-Disposition: form-data; name=\"play_url\"\r\n\r\n");
        sb.append(playUrl);
        String separator = "\r\n--";
        sb.append(separator);
        sb.append(boundary);
        sb.append("\r\nContent-Disposition: form-data; name=\"label\"\r\n\r\n");
        sb.append(label);
        sb.append(separator);
        sb.append(boundary);
        sb.append("\r\nContent-Disposition: form-data; name=\"key\"\r\n\r\n");
        sb.append(key);
        sb.append(separator);
        sb.append(boundary);
        sb.append("--\r\n\r\n");
        try {
            return okHttpClient.newCall(new Request.Builder().url(str).post(RequestBody.create(mediaType, sb.toString())).addHeader("User-Agent", "").addHeader("token", token).addHeader("content-type", "multipart/form-data; boundary=" + boundary).build()).execute().body().string();
        } catch (IOException e) {
            return "";
        }
    }

    public static String formUploadV5(String str, String playUrl, String label, String key, String sign, String token) {
        OkHttpClient okHttpClient = new OkHttpClient();
        String boundary = "--dio-boundary-" + getRandomDigits(10);
        MediaType mediaType = MediaType.parse("multipart/form-data; " + boundary);
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(boundary);
        sb.append("\r\nContent-Disposition: form-data; name=\"play_url\"\r\n\r\n");
        sb.append(playUrl);
        String separator = "\r\n--";
        sb.append(separator);
        sb.append(boundary);
        sb.append("\r\nContent-Disposition: form-data; name=\"label\"\r\n\r\n");
        sb.append(label);
        sb.append(separator);
        sb.append(boundary);
        sb.append("\r\nContent-Disposition: form-data; name=\"key\"\r\n\r\n");
        sb.append(key);
        sb.append(separator);
        sb.append(boundary);
        sb.append("\r\nContent-Disposition: form-data; name=\"sign\"\r\n\r\n");
        sb.append(sign);
        sb.append(separator);
        sb.append(boundary);
        sb.append("--\r\n\r\n");
        try {
            return okHttpClient.newCall(new Request.Builder().url(str).post(RequestBody.create(mediaType, sb.toString())).addHeader("token", token).addHeader("User-Agent", "Dart/2.19 (dart:io)").addHeader("appto-local-uuid", staticToken).addHeader("content-type", "multipart/form-data; boundary=" + boundary).build()).execute().body().string();
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

    private void initConfig() {
        JSONObject jSONObject = new JSONObject(xv.S(this.rsaPublicKey.substring(1), this.rsaPublicKey));
        this.apiKey = jSONObject.optString("key");
        staticToken = jSONObject.optString("uuid");
        this.signData = jSONObject.optString("iv");
        this.signUrl = jSONObject.optString("signurl");
        this.appName = jSONObject.optString("appname");
        String strToken = "token";
        if (jSONObject.has(strToken)) {
            this.localUuid = jSONObject.optString(strToken);
        }
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", "Dart/3.0 (dart:io)");
        String configResp = Yy.v(jSONObject.optString("config"), headers);
        StringBuilder sb = new StringBuilder();
        JSONObject configJson = new JSONObject(configResp);
        String domainKey = "domain";
        sb.append(configJson.optString(domainKey));
        sb.append(jSONObject.optString("api"));
        this.apiBaseUrl = sb.toString();
        this.configUrl = new JSONObject(configResp).optString(domainKey) + jSONObject.optString("configurl");
    }

    public String categoryContent(String categoryId, String page, boolean filter, HashMap<String, String> filters) {
        String keyRemarks = "vod_remarks";
        String keyPic = "vod_pic";
        String keyName = "vod_name";
        String keyId = "vod_id";
        String keyTotal = "total";
        String keyClass = "class";
        String keyYear = "year";
        String keyArea = "area";
        String keyType = "type";
        try {
            if (this.apiBaseUrl.isEmpty()) {
                initConfig();
            }
            JSONObject result = new JSONObject();
            String url = this.apiBaseUrl + "/vod/lists";
            if (filters == null) {
                filters = new HashMap<>();
            }
            if (!filters.containsKey(keyArea)) {
                filters.put(keyArea, "");
            }
            if (!filters.containsKey(keyType)) {
                filters.put(keyType, "");
            }
            if (!filters.containsKey(keyYear)) {
                filters.put(keyYear, "");
            }
            if (!filters.containsKey(keyClass)) {
                filters.put(keyClass, "");
            }
            JSONObject respJson = new JSONObject(Yy.v(((((((((url + "?type_id=" + categoryId) + "&area=" + filters.get(keyArea)) + "&lang=") + "&year=" + filters.get(keyYear)) + "&order=time") + "&type_name=" + filters.get(keyType)) + "&page=" + page) + "&pageSize=21") + "&__platform=android&sign=" + makeSign(keyType), makeTokenHeaders("")));
            int isEncrypted = respJson.getInt("ENCRYPTION");
            String dataKey = "data";
            JSONObject dataObj;
            if (isEncrypted != 0) {
                String decResp = xv.S(makeSign("dec").substring(1), this.rsaPublicKey);
                dataObj = new JSONObject(C1370pv.v(lE.S(respJson.optString(dataKey).replace("##d/", "H4sIAAAAAAAAA")), new JSONObject(decResp).optString("key"), new JSONObject(decResp).optString("iv")));
            } else {
                dataObj = new JSONObject(respJson.optString(dataKey));
            }
            JSONArray vodArray = dataObj.getJSONArray(dataKey);
            JSONArray listArray = new JSONArray();
            for (int i = 0; i < vodArray.length(); i++) {
                JSONObject vodItem = vodArray.optJSONObject(i);
                JSONObject item = new JSONObject();
                item.put(keyId, vodItem.optString(keyId));
                item.put(keyName, vodItem.optString(keyName));
                item.put(keyPic, vodItem.optString(keyPic));
                item.put(keyRemarks, vodItem.optString(keyRemarks));
                listArray.put(item);
            }
            int total = dataObj.getInt(keyTotal);
            result.put("page", page);
            result.put("pagecount", total / 21);
            result.put("limit", 21);
            result.put(keyTotal, total);
            result.put("list", listArray);
            return result.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    public String detailContent(List<String> ids) {
        String keyContent = "vod_content";
        String keyDirector = "vod_director";
        String keyActor = "vod_actor";
        String keyRemarks = "vod_remarks";
        String keyArea = "vod_area";
        String keyYear = "vod_year";
        String keyPic = "vod_pic";
        String keyName = "vod_name";
        String keyId = "vod_id";
        try {
            if (this.apiBaseUrl.isEmpty()) {
                initConfig();
            }
            JSONObject result = new JSONObject();
            JSONObject listWrapper = new JSONObject();
            JSONObject respJson = new JSONObject(Yy.v(this.apiBaseUrl + "/vod/getVod?id=" + ids.get(0) + "&__platform=android&sign=" + makeSign("detail"), makeTokenHeaders("")));
            int isEncrypted = respJson.getInt("ENCRYPTION");
            String dataKey = "data";
            JSONObject dataObj;
            if (isEncrypted != 0) {
                try {
                    String decResp = xv.S(makeSign("dec").substring(1), this.rsaPublicKey);
                    dataObj = new JSONObject(C1370pv.v(lE.S(respJson.optString(dataKey).replace("##d/", "H4sIAAAAAAAAA")), new JSONObject(decResp).optString("key"), new JSONObject(decResp).optString("iv")));
                } catch (Throwable th) {
                    return "";
                }
            } else {
                dataObj = new JSONObject(respJson.optString(dataKey));
            }
            ArrayList<String> playFromList = new ArrayList<>();
            ArrayList<String> playUrlList = new ArrayList<>();
            result.put(keyId, dataObj.optString(keyId));
            result.put(keyName, dataObj.optString(keyName));
            result.put(keyPic, dataObj.optString(keyPic));
            result.put("type_name", dataObj.optString("vod_class"));
            result.put(keyYear, dataObj.optString(keyYear));
            result.put(keyArea, dataObj.optString(keyArea));
            result.put(keyRemarks, dataObj.optString(keyRemarks));
            result.put(keyActor, dataObj.optString(keyActor));
            result.put(keyDirector, dataObj.optString(keyDirector));
            result.put(keyContent, dataObj.optString(keyContent));
            JSONArray playList = dataObj.getJSONArray("vod_play_list");
            for (int i = 0; i < playList.length(); i++) {
                JSONObject playItem = playList.optJSONObject(i);
                String showName = playItem.optJSONObject("player_info").optString("show");
                String fromName = playItem.optJSONObject("player_info").optString("from");
                if (!showName.contains("有广告")) {
                    ArrayList<String> episodeList = new ArrayList<>();
                    JSONArray urls = playItem.getJSONArray("urls");
                    for (int j = 0; j < urls.length(); j++) {
                        JSONObject urlItem = urls.optJSONObject(j);
                        episodeList.add(urlItem.optString("name") + "$" + urlItem.optString("url") + "&" + fromName);
                    }
                    if (!episodeList.isEmpty()) {
                        playFromList.add(showName);
                        playUrlList.add(TextUtils.join("#", episodeList));
                    }
                }
            }
            String playFrom = TextUtils.join("$$$", playFromList);
            String playUrl = TextUtils.join("$$$", playUrlList);
            result.put("vod_play_from", playFrom);
            result.put("vod_play_url", playUrl);
            JSONArray listArray = new JSONArray();
            listArray.put(result);
            listWrapper.put("list", listArray);
            return listWrapper.toString();
        } catch (Throwable th2) {
            return "";
        }
    }

    public String homeContent(boolean filter) {
        JSONArray cateArray;
        String keyCate = "cate";
        try {
            if (this.apiBaseUrl.isEmpty()) {
                initConfig();
            }
            String configResp = Yy.v(this.configUrl + "&sign=" + makeSign("config"), makeTokenHeaders(""));
            JSONObject result = new JSONObject();
            JSONArray classArray = new JSONArray();
            JSONObject respJson = new JSONObject(configResp);
            int isEncrypted = respJson.getInt("ENCRYPTION");
            String cateKey = "get_home_cate";
            String dataKey = "data";
            if (isEncrypted != 0) {
                String decResp = xv.S(makeSign("dec").substring(1), this.rsaPublicKey);
                cateArray = new JSONObject(C1370pv.v(lE.S(respJson.optString(dataKey).replace("##d/", "H4sIAAAAAAAAA")), new JSONObject(decResp).optString("key"), new JSONObject(decResp).optString("iv"))).getJSONArray(cateKey);
            } else {
                cateArray = new JSONObject(respJson.optString(dataKey)).getJSONArray(cateKey);
            }
            for (int i = 0; i < cateArray.length(); i++) {
                JSONObject cateItem = cateArray.optJSONObject(i);
                if (cateItem.has(keyCate)) {
                    this.homeCateId = cateItem.optString("id");
                    this.homeMold = cateItem.optString("mold");
                } else {
                    JSONObject typeObj = new JSONObject();
                    String typeId = "type_id";
                    if (cateItem.has(keyCate)) {
                        typeObj.put(typeId, cateItem.optString(keyCate));
                    } else {
                        typeObj.put(typeId, cateItem.optString("id"));
                    }
                    typeObj.put("type_name", cateItem.optString("title"));
                    classArray.put(typeObj);
                }
            }
            result.put("class", classArray);
            if (filter) {
                result.put("filters", new JSONObject("{\"1\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"爱情\",\"v\":\"爱情\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"警匪\",\"v\":\"警匪\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"动画\",\"v\":\"动画\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"武侠\",\"v\":\"武侠\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"枪战\",\"v\":\"枪战\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"惊悚\",\"v\":\"惊悚\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"青春\",\"v\":\"青春\"},{\"n\":\"文艺\",\"v\":\"文艺\"},{\"n\":\"微电影\",\"v\":\"微电影\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"运动\",\"v\":\"运动\"},{\"n\":\"农村\",\"v\":\"农村\"},{\"n\":\"儿童\",\"v\":\"儿童\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"中国大陆\",\"v\":\"大陆\"},{\"n\":\"中国香港\",\"v\":\"香港\"},{\"n\":\"中国台湾\",\"v\":\"台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"意大利\",\"v\":\"意大利\"},{\"n\":\"西班牙\",\"v\":\"西班牙\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}]}],\"2\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"青春偶像\",\"v\":\"青春偶像\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"家庭\",\"v\":\"家庭\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"乡村\",\"v\":\"乡村\"},{\"n\":\"情景\",\"v\":\"情景\"},{\"n\":\"商战\",\"v\":\"商战\"},{\"n\":\"网剧\",\"v\":\"网剧\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"中国大陆\",\"v\":\"大陆\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"新加坡\",\"v\":\"新加坡\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}]}],\"4\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"情感\",\"v\":\"情感\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"热血\",\"v\":\"热血\"},{\"n\":\"推理\",\"v\":\"推理\"},{\"n\":\"搞笑\",\"v\":\"搞笑\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"萝莉\",\"v\":\"萝莉\"},{\"n\":\"校园\",\"v\":\"校园\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"机战\",\"v\":\"机战\"},{\"n\":\"运动\",\"v\":\"运动\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"少年\",\"v\":\"少年\"},{\"n\":\"少女\",\"v\":\"少女\"},{\"n\":\"社会\",\"v\":\"社会\"},{\"n\":\"原创\",\"v\":\"原创\"},{\"n\":\"亲子\",\"v\":\"亲子\"},{\"n\":\"益智\",\"v\":\"益智\"},{\"n\":\"励志\",\"v\":\"励志\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"中国\",\"v\":\"内地\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"欧美\",\"v\":\"欧美\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}],\"3\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"选秀\",\"v\":\"选秀\"},{\"n\":\"情感\",\"v\":\"情感\"},{\"n\":\"访谈\",\"v\":\"访谈\"},{\"n\":\"播报\",\"v\":\"播报\"},{\"n\":\"旅游\",\"v\":\"旅游\"},{\"n\":\"音乐\",\"v\":\"音乐\"},{\"n\":\"美食\",\"v\":\"美食\"},{\"n\":\"纪实\",\"v\":\"纪实\"},{\"n\":\"曲艺\",\"v\":\"曲艺\"},{\"n\":\"生活\",\"v\":\"生活\"},{\"n\":\"游戏互动\",\"v\":\"游戏互动\"},{\"n\":\"财经\",\"v\":\"财经\"},{\"n\":\"求职\",\"v\":\"求职\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"港台\",\"v\":\"港台\"},{\"n\":\"日韩\",\"v\":\"日韩\"},{\"n\":\"欧美\",\"v\":\"欧美\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]}]}]}"));
            }
            return result.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    public String homeVideoContent() {
        JSONArray itemsArray;
        String keyRemarks = "vod_remarks";
        String keyPic = "vod_pic";
        String keyName = "vod_name";
        String keyId = "vod_id";
        try {
            JSONObject respJson = new JSONObject(Yy.v(this.apiBaseUrl + "/home/data?id=" + this.homeCateId + "&mold=" + this.homeMold + "&__platform=android&sign=" + makeSign("home"), makeTokenHeaders("")));
            JSONArray listArray = new JSONArray();
            int isEncrypted = respJson.getInt("ENCRYPTION");
            String itemsKey = "items";
            String sectionsKey = "sections";
            String dataKey = "data";
            if (isEncrypted != 0) {
                String decResp = xv.S(makeSign("dec").substring(1), this.rsaPublicKey);
                itemsArray = new JSONObject(C1370pv.v(lE.S(respJson.optString(dataKey).replace("##d/", "H4sIAAAAAAAAA")), new JSONObject(decResp).optString("key"), new JSONObject(decResp).optString("iv"))).getJSONArray(sectionsKey).optJSONObject(1).getJSONArray(itemsKey);
            } else {
                itemsArray = new JSONObject(respJson.optString(dataKey)).getJSONArray(sectionsKey).optJSONObject(1).getJSONArray(itemsKey);
            }
            for (int i = 0; i < itemsArray.length(); i++) {
                JSONObject item = itemsArray.optJSONObject(i);
                JSONObject vodObj = new JSONObject();
                vodObj.put(keyId, item.optString(keyId));
                vodObj.put(keyName, item.optString(keyName));
                vodObj.put(keyPic, item.optString(keyPic));
                vodObj.put(keyRemarks, item.optString(keyRemarks));
                listArray.put(vodObj);
            }
            JSONObject result = new JSONObject();
            result.put("list", listArray);
            return result.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    public void init(Context context, String str) {
        super.init(context, str);
        this.rsaPublicKey = Yy.v(C1370pv.l(str), makeUserAgentHeaders());
    }

    public String playerContent(String flag, String url, List<String> vipFlags) {
        return "";
    }

    public String searchContent(String keyword, boolean quick) {
        JSONArray dataArray;
        String keyRemarks = "vod_remarks";
        String keyPic = "vod_pic";
        String keyName = "vod_name";
        String keyId = "vod_id";
        try {
            if (this.apiBaseUrl.isEmpty()) {
                initConfig();
            }
            JSONObject result = new JSONObject();
            String resp = Yy.v(this.apiBaseUrl + "/search/lists?wd=" + URLEncoder.encode(keyword) + "&page=1&type=&__platform=android&sign=" + makeSign("search"), makeTokenHeaders(""));
            JSONArray listArray = new JSONArray();
            JSONObject respJson = new JSONObject(resp);
            int isEncrypted = respJson.getInt("ENCRYPTION");
            String dataKey = "data";
            if (isEncrypted != 0) {
                String decResp = xv.S(makeSign("dec").substring(1), this.rsaPublicKey);
                dataArray = new JSONObject(C1370pv.v(lE.S(respJson.optString(dataKey).replace("##d/", "H4sIAAAAAAAAA")), new JSONObject(decResp).optString("key"), new JSONObject(decResp).optString("iv"))).getJSONArray(dataKey);
            } else {
                dataArray = new JSONObject(respJson.optString(dataKey)).getJSONArray(dataKey);
            }
            for (int i = 0; i < dataArray.length(); i++) {
                JSONObject vodItem = dataArray.optJSONObject(i);
                JSONObject item = new JSONObject();
                item.put(keyId, vodItem.optString(keyId));
                item.put(keyName, vodItem.optString(keyName));
                item.put(keyPic, vodItem.optString(keyPic));
                item.put(keyRemarks, vodItem.optString(keyRemarks));
                listArray.put(item);
            }
            result.put("list", listArray);
            return result.toString();
        } catch (Throwable th) {
            return "";
        }
    }
}
