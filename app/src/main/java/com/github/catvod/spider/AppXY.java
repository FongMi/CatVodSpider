package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Crypto;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leospring
 * 星牙短剧
 */
public class AppXY extends Spider {

    private String auth;

    private Map<String, String> getHeader() {
        Map<String, String> map = new HashMap<>();
        map.put("User-Agent", "okhttp/4.10.0");
        if (!TextUtils.isEmpty(auth)) map.put("Authorization", auth);
        return map;
    }

    @Override
    public void init(Context context, String extend) throws Exception {
        String s = System.currentTimeMillis() + "";
        Map<String, String> map = new HashMap<>();
        map.put("device", Crypto.md5(s));
        map.put("install_first_open", "true");
        map.put("first_install_time", s);
        map.put("last_update_time", s);
        auth = new JSONObject(OkHttp.post("https://app.whjzjx.cn/v1/account/login", map, getHeader()).getBody()).optJSONObject("data").optString("token");
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        ArrayList<Class> classes = new ArrayList<>();
        JSONArray array = new JSONObject(OkHttp.string("https://app.whjzjx.cn/cloud/v2/theater/classes", getHeader())).optJSONObject("data").optJSONArray("list");
        for (int i = 0; i < array.length(); ++i) {
            JSONObject object = array.optJSONObject(i);
            if (!object.optString("show_type").contains("Bookstore")) {
                classes.add(new Class(object.optString("id"), object.optString("class_name")));
            }
        }
        return Result.string(classes, new ArrayList<>());
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        List<Vod> videos = new ArrayList<>();
        String class2Id = extend.get("class2_id");
        if (class2Id == null) class2Id = "0";
        JSONArray array = new JSONObject(OkHttp.string(("https://app.whjzjx.cn/cloud/v2/theater/home_page?theater_class_id=" + tid + "&class2_ids=" + class2Id + "&type=1&page_num=" + pg + "&page_size=24"), getHeader())).optJSONObject("data").optJSONArray("list");
        for (int v = 0; v < array.length(); ++v) {
            JSONObject object = array.optJSONObject(v).optJSONObject("theater");
            videos.add(new Vod(object.optString("id"), object.optString("title"), object.optString("cover_url"), object.optString("total") + "集"));
        }
        return Result.string(videos);
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        Vod vod = new Vod();
        JSONObject object = new JSONObject(OkHttp.string(("https://app.whjzjx.cn/v2/theater_parent/detail?theater_parent_id=" + ids.get(0)), getHeader())).optJSONObject("data");
        vod.setVodId(ids.get(0));
        vod.setVodName(object.optString("title"));
        vod.setVodPic(object.optString("cover_url"));
        vod.setTypeName(object.optJSONArray("desc_tags").join(",").replace("\"", ""));
        vod.setVodContent(object.optString("introduction"));
        ArrayList<String> playUrls = new ArrayList<>();
        ArrayList<String> playFrom = new ArrayList<>();
        playFrom.add("leospring");
        JSONArray array = object.optJSONArray("theaters");
        ArrayList<String> urlNames = new ArrayList<>();
        for (int i = 0; i < array.length(); ++i) {
            object = array.optJSONObject(i);
            urlNames.add(object.optString("num") + "$" + object.optString("son_video_url"));
        }
        playUrls.add(TextUtils.join("#", urlNames));
        vod.setVodPlayFrom(TextUtils.join("$$$", playFrom));
        vod.setVodPlayUrl(TextUtils.join("$$$", playUrls));
        return Result.string(vod);
    }

    @Override
    public String playerContent(String flag, String id, List<String> flags) throws Exception {
        return Result.get().url(id).toString();
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        List<Vod> list = new ArrayList<>();
        JSONArray array = new JSONObject(OkHttp.post("https://app.whjzjx.cn/v3/search", new JSONObject().put("text", key).toString(), getHeader()).getBody()).optJSONObject("data").optJSONObject("theater").optJSONArray("search_data");
        for (int i = 0; i < array.length(); ++i) {
            JSONObject object = array.optJSONObject(i);
            list.add(new Vod(object.optString("id"), object.optString("title"), object.optString("cover_url"), object.optString("score_str")));
        }
        return Result.string(list);
    }
}