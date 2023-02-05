package com.github.catvod.spider;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;

import com.github.catvod.crawler.Spider;
import com.github.catvod.utils.okhttp.OkHttpUtil;

import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;


/**
 * Author: @SDL
 */
public class AppTT extends Spider {
    private static final String KEY = "SRK#e%4UYtU#KiEo*vsPqpr0cC4bxAQW";
    private static final String IV = "o6sYmm*x5hn#rcCt";
    private static final String siteUrl = "http://110.42.1.95:7788";

    private String uAgent = "Dalvik/2.1.0 (Linux; U; Android " + Build.VERSION.RELEASE + "; " + Build.MODEL + " Build/" + Build.ID + ")";

    private HashMap<String, String> getHeaders(String url) {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", getUA(url));
        return hashMap;
    }

    private String getUA(String str) {
        if (!(str.contains("api.php/app") || str.contains("xgapp"))) {
            if (!str.contains("freekan")) {
                if (!(str.contains("zsb") || str.contains("fkxs") || str.contains("xays") || str.contains("xcys") || str.contains("szys") || str.contains("dxys") || str.contains("ytys"))) {
                    if (!str.contains("qnys")) {
                        return str.contains(".vod") ? "okhttp/4.1.0" : "Dalvik/2.1.0";
                    }
                }
                return "Dart/2.15 (dart:io)";
            }
        }
        return "Dart/2.14 (dart:io)";
    }

    @Override
    public void init(Context context) {
        super.init(context);
    }

    @Override
    public String homeContent(boolean filter) {
        try {

            JSONArray classes = new JSONArray();
            JSONObject jSONObject1 = new JSONObject();
            jSONObject1.put("type_id", 1);
            jSONObject1.put("type_name", "电影");
            classes.put(jSONObject1);

            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type_id", 2);
            jSONObject2.put("type_name", "连续剧");
            classes.put(jSONObject2);

            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("type_id", 3);
            jSONObject3.put("type_name", "动漫");
            classes.put(jSONObject3);

            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("type_id", 4);
            jSONObject4.put("type_name", "综艺");
            classes.put(jSONObject4);

            JSONObject result = new JSONObject();
            result.put("class", classes);

            return result.toString();
        } catch (Throwable th) {

        }
        return "";
    }

    @Override
    public String homeVideoContent() {
        try {
            JSONArray videos = new JSONArray();
            try {
                String url = siteUrl + "/api.php/v1.vod/curnavitemlist?type_id=0";

                String content = OkHttpUtil.string(url, getHeaders(url));
                JSONObject jsonObject = new JSONObject(decryptResponse(content));
                JSONArray jsonArray = jsonObject.getJSONObject("data").getJSONArray("swiperList");
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject blockObj = jsonArray.getJSONObject(i);
                    JSONObject v = new JSONObject();
                    v.put("vod_id", blockObj.getString("vod_id"));
                    v.put("vod_name", blockObj.getString("vod_name"));
                    v.put("vod_pic", blockObj.getString("vod_pic"));
                    v.put("vod_remarks", blockObj.getString("vod_remarks"));
                    videos.put(v);
                }
            } catch (Exception e) {
            }
            JSONObject result = new JSONObject();
            result.put("list", videos);
            return result.toString();
        } catch (Throwable th) {

        }
        return "";
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        try {
            String url = siteUrl + "/api.php/v1.vod?type=" + tid + "&page=" + pg + "&pagesize=20";
//            Set<String> keys = extend.keySet();
//            for (String key : keys) {
//                String val = extend.get(key).trim();
//                if (val.length() == 0)
//                    continue;
//                url += "&" + key + "=" + URLEncoder.encode(val);
//            }
            String content = OkHttpUtil.string(url, getHeaders(url));
            JSONObject dataObject = new JSONObject(decryptResponse(content)).getJSONObject("data");
            JSONArray jsonArray = dataObject.getJSONArray("list");
            JSONArray videos = new JSONArray();
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject vObj = jsonArray.getJSONObject(i);
                JSONObject v = new JSONObject();
                v.put("vod_id", vObj.getString("vod_id"));
                v.put("vod_name", vObj.getString("vod_name"));
                v.put("vod_pic", vObj.getString("vod_pic"));
                v.put("vod_remarks", vObj.getString("vod_remarks"));
                videos.put(v);
            }
            JSONObject result = new JSONObject();
            int limit = 20;
            int page = dataObject.getInt("page");
            int total = dataObject.getInt("total");
            int pageCount = videos.length();
            result.put("page", page);
            result.put("pagecount", total / 20);
            result.put("limit", limit);
            result.put("total", total);
            result.put("list", videos);
            return result.toString();
        } catch (Throwable th) {

        }
        return "";
    }

    @Override
    public String detailContent(List<String> ids) {
        try {
            String url = siteUrl + "/api.php/v1.vod/detilldata?vod_id=" + ids.get(0);
            String content = OkHttpUtil.string(url, getHeaders(url));
            JSONObject dataObject = new JSONObject(decryptResponse(content));
            JSONObject vObj = dataObject.getJSONObject("data");
            JSONObject result = new JSONObject();
            JSONArray list = new JSONArray();

            JSONObject videoInfo = vObj.getJSONObject("videoInfo");

            JSONObject vodAtom = new JSONObject();
            String title = videoInfo.getString("vod_name");
            vodAtom.put("vod_id", videoInfo.getString("vod_id"));
            vodAtom.put("vod_name", videoInfo.getString("vod_name"));
            vodAtom.put("vod_pic", videoInfo.getString("vod_pic"));
            //   vodAtom.put("type_name", videoInfo.getString("subCategory"));
            vodAtom.put("vod_year", videoInfo.getString("vod_year"));
            vodAtom.put("vod_area", videoInfo.getString("vod_area"));
            vodAtom.put("vod_remarks", videoInfo.getString("vod_remarks"));
            vodAtom.put("vod_actor", videoInfo.getString("vod_actor"));
            vodAtom.put("vod_director", videoInfo.getString("vod_director"));
            vodAtom.put("vod_content", videoInfo.getString("vod_content").trim());


            JSONArray episodes = vObj.getJSONArray("source");
            LinkedHashMap<String, ArrayList<String>> playlist = new LinkedHashMap<>();
            String show = null;
            String parse = null;
            for (int i = 0; i < episodes.length(); i++) {
                JSONArray playurls = episodes.getJSONObject(i).getJSONArray("list");

                show = episodes.getJSONObject(i).getJSONObject("player_info").getString("show");
                parse = episodes.getJSONObject(i).getJSONObject("player_info").getString("parse");
                ArrayList<String> urls = playlist.get(show);
                if (urls == null) {
                    urls = new ArrayList<>();
                    playlist.put(show, urls);
                }

                for (int j = 0; j < playurls.length(); j++) {
                    if (playurls.get(j).toString().contains(".m3u8") || playurls.get(j).toString().contains(".mp4")) {
                        urls.add(playurls.get(j).toString());
                    } else {
                        String name = playurls.get(j).toString().split("\\$")[0];
                        String pid = playurls.get(j).toString().split("\\$")[1];

                        urls.add(name + "$" + parse + pid);
                    }


                }
            }


            String vod_play_from = TextUtils.join("$$$", playlist.keySet());
            StringBuilder sb = new StringBuilder();
            Iterator<ArrayList<String>> iter = playlist.values().iterator();
            short fromSize = (short) playlist.size();
            while (iter.hasNext()) {
                fromSize--;
                ArrayList<String> urls = iter.next();
                sb.append(TextUtils.join("#", urls));
                if (fromSize > 0)
                    sb.append("$$$");
            }
            vodAtom.put("vod_play_from", vod_play_from);
            vodAtom.put("vod_play_url", sb.toString());
            list.put(vodAtom);
            result.put("list", list);
            return result.toString();
        } catch (Throwable th) {

        }
        return "";
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        try {
            String jxurl = null;
            if (id.contains(".m3u8") || id.toString().contains(".mp4")) {
                jxurl = id;
            } else {
                String url = id + "&sc=1&token=" + getToken();
                String content = OkHttpUtil.string(url, getHeaders(url));
                String decryptcontent = decrypt(content, "UTF-8", KEY, IV);
                jxurl = new JSONObject(decryptcontent).getString("url");
            }


            JSONObject result = new JSONObject();
            result.put("parse", 0);
            result.put("playUrl", "");
            result.put("url", jxurl);
            return result.toString();
        } catch (Throwable th) {

        }
        return "";
    }

    @Override
    public String searchContent(String key, boolean quick) {
        try {
            String url = siteUrl + "/api.php/v1.vod?wd=" + URLEncoder.encode(key);
            String content = OkHttpUtil.string(url, getHeaders(url));
            JSONObject dataObject = new JSONObject(decryptResponse(content));
            JSONArray jsonArray = dataObject.getJSONObject("data").getJSONArray("list");
            JSONArray videos = new JSONArray();
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject vObj = jsonArray.getJSONObject(i);
                JSONObject v = new JSONObject();

                v.put("vod_id", vObj.getString("vod_id"));
                v.put("vod_name", vObj.getString("vod_name"));
                v.put("vod_pic", vObj.getString("vod_pic"));
                v.put("vod_remarks", vObj.getString("vod_remarks"));
                videos.put(v);
            }
            JSONObject result = new JSONObject();
            result.put("list", videos);
            return result.toString();
        } catch (Throwable th) {

        }
        return "";
    }

    protected String decryptResponse(String src) {
        return src;
    }

    public String decrypt(String str, String str2, String str3, String str4) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str3.getBytes("UTF-8"), "AES");
            Cipher instance = Cipher.getInstance("AES/CTR/PKCS5Padding");
            instance.init(2, secretKeySpec, new IvParameterSpec(str4.getBytes()));
            return new String(instance.doFinal(Base64.decode(str, 0)), str2);
        } catch (Exception unused) {
            return null;
        }
    }

    public String encrypt(String str, String str2, String str3, String str4) {
        try {
            Cipher instance = Cipher.getInstance("AES/CTR/PKCS5Padding");
            instance.init(1, new SecretKeySpec(str3.getBytes(), "AES"), new IvParameterSpec(str4.getBytes()));
            return Base64.encodeToString(instance.doFinal(str.getBytes(str2)), 0);
        } catch (Exception unused) {
            return null;
        }
    }

    public String getToken() {
        return encrypt(Long.valueOf(new Date().getTime()).toString(), "UTF-8", KEY, IV);
    }
}