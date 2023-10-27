package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Utils;
import com.google.gson.JsonParser;
import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URLEncoder;
import java.util.*;

public class Douban extends Spider {
    private final String hostURL = "https://frodo.douban.com/api/v2";
    private final String apikey = "?apikey=0ac44ae016490db2204ce0a042db2916";
    private String extend;

    private Map<String, String> getHeader() {
        Map<String, String> header = new HashMap<>();
        header.put("Host", "frodo.douban.com");
        header.put("Connection", "Keep-Alive");
        header.put("Referer", "https://servicewechat.com/wx2f9b06c1de1ccfca/84/page-frame.html");
        header.put("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36 MicroMessenger/7.0.9.501 NetType/WIFI MiniProgramEnv/Windows WindowsWechat");
        return header;
    }

    @Override
    public void init(Context context, String extend) throws Exception {
        super.init(context, extend);
        this.extend = extend;
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        List<Class> classes = new ArrayList<>();
        List<String> typeIds = Arrays.asList("hot_gaia", "tv_hot", "show_hot", "movie", "tv", "rank_list_movie", "rank_list_tv");
        List<String> typeNames = Arrays.asList("热门电影", "热播剧集", "热播综艺", "电影筛选", "电视筛选", "电影榜单", "电视剧榜单");
        for (int i = 0; i < typeIds.size(); i++) classes.add(new Class(typeIds.get(i), typeNames.get(i)));
        String recommendURL = "http://api.douban.com/api/v2/subject_collection/subject_real_time_hotest/items" + apikey;
        JSONObject jsonObject = new JSONObject(OkHttp.string(recommendURL, getHeader()));
        JSONArray items = jsonObject.optJSONArray("subject_collection_items");
        return Result.string(classes, parseVodListFromJSONArray(items), filter ? JsonParser.parseString(OkHttp.string(extend)) : null);
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        HashMap<String, String> ext = new HashMap<>();
        if (extend != null && extend.size() > 0) {
            ext.putAll(extend);
        }
        String sort = ext.get("sort") == null ? "T" : ext.get("sort");
        String tags = URLEncoder.encode(getTags(ext));
        int start = (Integer.parseInt(pg) - 1) * 20;
        String cateURL;
        String itemKey = "items";
        switch (tid) {
            case "hot_gaia":
                sort = ext.get("sort") == null ? "recommend" : ext.get("sort");
                String area = ext.get("area") == null ? "全部" : ext.get("area");
                sort = sort + "&area=" + URLEncoder.encode(area);
                cateURL = hostURL + "/movie/hot_gaia" + apikey + "&sort=" + sort + "&start=" + start + "&count=20";
                break;
            case "tv_hot":
                String type = ext.get("type") == null ? "tv_hot" : ext.get("type");
                cateURL = hostURL + "/subject_collection/" + type + "/items" + apikey + "&start=" + start + "&count=20";
                itemKey = "subject_collection_items";
                break;
            case "show_hot":
                String showType = ext.get("type") == null ? "show_hot" : ext.get("type");
                cateURL = hostURL + "/subject_collection/" + showType + "/items" + apikey + "&start=" + start + "&count=20";
                itemKey = "subject_collection_items";
                break;
            case "tv":
                cateURL = hostURL + "/tv/recommend" + apikey + "&sort=" + sort + "&tags=" + tags + "&start=" + start + "&count=20";
                break;
            case "rank_list_movie":
                String rankMovieType = ext.get("榜单") == null ? "movie_real_time_hotest" : ext.get("榜单");
                cateURL = hostURL + "/subject_collection/" + rankMovieType + "/items" + apikey + "&start=" + start + "&count=20";
                itemKey = "subject_collection_items";
                break;
            case "rank_list_tv":
                String rankTVType = ext.get("榜单") == null ? "tv_real_time_hotest" : ext.get("榜单");
                cateURL = hostURL + "/subject_collection/" + rankTVType + "/items" + apikey + "&start=" + start + "&count=20";
                itemKey = "subject_collection_items";
                break;
            default:
                cateURL = hostURL + "/movie/recommend" + apikey + "&sort=" + sort + "&tags=" + tags + "&start=" + start + "&count=20";
        }
        JSONObject jsonObject = new JSONObject(OkHttp.string(cateURL, getHeader()));
        JSONArray items = jsonObject.getJSONArray(itemKey);
        List<Vod> list = parseVodListFromJSONArray(items);
        int page = Integer.parseInt(pg), count = Integer.MAX_VALUE, limit = 20, total = Integer.MAX_VALUE;
        return Result.get().vod(list).page(page, count, limit, total).string();
    }

    private List<Vod> parseVodListFromJSONArray(JSONArray items) throws Exception {
        List<Vod> list = new ArrayList<>();
        for (int i = 0; i < items.length(); i++) {
            JSONObject item = items.getJSONObject(i);
            String vodId = "msearch:" + item.optString("id");
            String name = item.optString("title");
            String pic = getPic(item);
            String remark = getRating(item);
            list.add(new Vod(vodId, name, pic, remark));
        }
        return list;
    }

    private String getRating(JSONObject item) {
        try {
            return "评分：" + item.getJSONObject("rating").optString("value");
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    private String getPic(JSONObject item) {
        try {
            return item.getJSONObject("pic").optString("normal") + "@Referer=https://api.douban.com/@User-Agent=" + Utils.CHROME;
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    private String getTags(HashMap<String, String> ext) {
        try {
            StringBuilder tags = new StringBuilder();
            for (String key : ext.keySet()) {
                if (key.equals("sort")) continue;
                tags.append(ext.get(key)).append(",");
            }
            return tags.substring(0, tags.lastIndexOf(","));
        } catch (Exception e) {
//            SpiderDebug.log(e);
        }
        return "";
    }
}
