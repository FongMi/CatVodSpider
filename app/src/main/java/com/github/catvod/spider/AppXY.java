package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * @author leospring
 * 星牙短剧
 */
public class AppXY extends Spider {
    private static String auth = "";

    private Map<String, String> getHeader() {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("User-Agent", "okhttp/4.10.0");
        if (!TextUtils.isEmpty(auth)) {
            hashMap.put("Authorization", auth);
        }
        return hashMap;
    }

    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        List<Vod> videos = new ArrayList<>();
        try {
            String class2Id = extend.get("class2_id");
            if(class2Id == null) class2Id = "0";
            JSONArray jsonArray = new JSONObject(OkHttp.string(("https://app.whjzjx.cn/cloud/v2/theater/home_page?theater_class_id=" + tid + "&class2_ids=" + class2Id + "&type=1&page_num=" + pg + "&page_size=24"), getHeader())).optJSONObject("data").optJSONArray("list");
            for(int v = 0; v < jsonArray.length(); ++v) {
                JSONObject jSONObject0 = jsonArray.optJSONObject(v).optJSONObject("theater");
                videos.add(new Vod(jSONObject0.optString("id"), jSONObject0.optString("title"), jSONObject0.optString("cover_url"), jSONObject0.optString("total") + "集"));
            }
        }
        catch(Exception e) {
        }
        return Result.string(videos);
    }

    public String detailContent(List<String> ids) throws Exception {
        Vod vod = new Vod();
        try {
            JSONObject json = new JSONObject(OkHttp.string(("https://app.whjzjx.cn/v2/theater_parent/detail?theater_parent_id=" + ids.get(0)), getHeader())).optJSONObject("data");
            vod.setVodId(ids.get(0));
            vod.setVodName(json.optString("title"));
            vod.setVodPic(json.optString("cover_url"));
            vod.setTypeName(json.optJSONArray("desc_tags").toString());
            vod.setVodContent(json.optString("introduction"));
            ArrayList<String> playUrls = new ArrayList<>();
            ArrayList<String> playFroms = new ArrayList<>();
            playFroms.add("leospring");
            JSONArray jsonArray = json.optJSONArray("theaters");
            ArrayList<String> urlNames = new ArrayList<>();
            for(int v = 0; v < jsonArray.length(); ++v) {
                JSONObject item = jsonArray.optJSONObject(v);
                urlNames.add(item.optString("num") + "$" + item.optString("son_video_url"));
            }

            playUrls.add(TextUtils.join("#", urlNames));
            vod.setVodPlayFrom(TextUtils.join("$$$", playFroms));
            vod.setVodPlayUrl(TextUtils.join("$$$", playUrls));
        }
        catch(Exception e) {
        }

        return Result.string(vod);
    }

    public String homeContent(boolean z) throws Exception {
        ArrayList<Class> classes = new ArrayList<>();
        try {
            JSONArray jSONArray0 = new JSONObject(OkHttp.string("https://app.whjzjx.cn/cloud/v2/theater/classes", getHeader())).optJSONObject("data").optJSONArray("list");
            for(int v = 0; v < jSONArray0.length(); ++v) {
                JSONObject jSONObject0 = jSONArray0.optJSONObject(v);
                if(!jSONObject0.optString("show_type").contains("Bookstore")) {
                    classes.add(new Class(jSONObject0.optString("id"), jSONObject0.optString("class_name"), null));
                }
            }
        }
        catch(Exception unused_ex) {
        }
        return Result.string(classes, new ArrayList<>());
    }

    public void init(Context context0, String s) throws Exception {
        this.login();
    }

    public boolean login() {
        try {
            String s = System.currentTimeMillis() + "";
            Map<String, String> map = new HashMap<>();
            map.put("device", getDeviceId(s));
            map.put("install_first_open", "true");
            map.put("first_install_time", s);
            map.put("last_update_time", s);
            String s1 = new JSONObject(OkHttp.post("https://app.whjzjx.cn/v1/account/login", map, getHeader()).getBody()).optJSONObject("data").optString("token");
            auth = s1;
            return !TextUtils.isEmpty(s1);
        }
        catch(Exception e) {
            return false;
        }
    }

    public static String getDeviceId(String s) {
        try {
            StringBuilder sb = new StringBuilder(new BigInteger(1, MessageDigest.getInstance("MD5").digest(s.getBytes("UTF-8"))).toString(16));
            while(sb.length() < 0x20) {
                sb.insert(0, "0");
            }
            return sb.toString().toLowerCase();
        }
        catch(Exception e) {
            return "";
        }
    }

    @Override
    public String playerContent(String flag, String id, List<String> flags) throws Exception {
        return Result.get().url(id).toString();
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        List<Vod> list = new ArrayList<>();
        new JSONObject().put("text", key);
        JSONArray jsonArray = new JSONObject(OkHttp.post("https://app.whjzjx.cn/v3/search", new JSONObject().put("text", key).toString(), getHeader()).getBody()).optJSONObject("data").optJSONObject("theater").optJSONArray("search_data");
        for(int v = 0; v < jsonArray.length(); ++v) {
            JSONObject jSONObject0 = jsonArray.optJSONObject(v);
            list.add(new Vod(jSONObject0.optString("id"), jSONObject0.optString("title"), jSONObject0.optString("cover_url"), jSONObject0.optString("score_str")));
        }

        return Result.string(list);
    }
}

