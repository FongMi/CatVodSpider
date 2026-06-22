package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.en.NetPan;
import com.github.catvod.bean.VodItem;
import com.github.catvod.bean.VodResult;
import com.github.catvod.utils.okhttp.OkHttpUtil;
import com.google.gson.JsonParser;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.*;

public class Douban extends NetPan {

    private static final String API_KEY = "0ac44ae016490db2204ce0a042db2916";

    private String filterUrl;

    private static class CategoryItem extends com.github.catvod.bean.VodCategory {
        @com.google.gson.annotations.SerializedName("type_id")
        private final String id;
        @com.google.gson.annotations.SerializedName("type_name")
        private final String name;

        CategoryItem(String id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    private Map<String, String> buildHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Host", "frodo.douban.com");
        headers.put("Connection", "Keep-Alive");
        headers.put("Referer", "https://servicewechat.com/wx2f9b06c1de1ccfca/84/page-frame.html");
        headers.put("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36 MicroMessenger/7.0.9.501 NetType/WIFI MiniProgramEnv/Windows WindowsWechat");
        return headers;
    }

    private List<VodItem> parseVodItems(JSONArray jsonArray) throws JSONException {
        ArrayList<VodItem> vodItems = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject item = jsonArray.getJSONObject(i);
            item.optString("id");
            String title = item.optString("title");
            String coverUrl;
            try {
                coverUrl = item.getJSONObject("pic").optString("normal") + "@Referer=https://api.douban.com/@User-Agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36";
            } catch (Exception unused) {
                coverUrl = "";
            }
            if (coverUrl != null && !coverUrl.trim().isEmpty()) {
                String ratingText;
                try {
                    ratingText = "评分：" + item.getJSONObject("rating").optString("value");
                } catch (Exception unused2) {
                    ratingText = "";
                }
                String fullTitle = title + "%%" + item.optString("card_subtitle");
                vodItems.add(new VodItem(fullTitle, title, coverUrl, ratingText));
            }
        }
        return vodItems;
    }

    public String categoryContent(String typeId, String filterId, boolean filterGenre, HashMap<String, String> extend) throws JSONException {
        try {
            String url;
            if ("movie".equals(typeId) || "tv".equals(typeId)) {
                StringBuilder sb = new StringBuilder();
                sb.append("https://frodo.douban.com/api/v2/");
                sb.append(typeId);
                sb.append("/recommend?");
                if (extend != null && extend.containsKey("sort")) {
                    sb.append("sort=").append(extend.get("sort"));
                }
                if (extend != null && extend.containsKey("tags")) {
                    sb.append("&tags=").append(extend.get("tags"));
                }
                if (extend != null && extend.containsKey("genre")) {
                    sb.append("&genres=").append(extend.get("genre"));
                }
                if (extend != null && extend.containsKey("year")) {
                    sb.append("&year=").append(extend.get("year"));
                }
                sb.append("&start=0&count=50&apikey=").append(API_KEY);
                url = sb.toString();
            } else if ("rank_list_movie".equals(typeId)) {
                url = "https://frodo.douban.com/api/v2/movie/recommend?sort=U&start=0&count=50&apikey=" + API_KEY;
            } else if ("rank_list_tv".equals(typeId)) {
                url = "https://frodo.douban.com/api/v2/tv/recommend?sort=U&start=0&count=50&apikey=" + API_KEY;
            } else {
                url = "https://frodo.douban.com/api/v2/subject_collection/" + typeId + "/items?start=0&count=50&apikey=" + API_KEY;
            }
            JSONObject response = new JSONObject(OkHttpUtil.string(url, buildHeaders()));
            JSONArray items = response.optJSONArray("items");
            if (items == null) {
                items = response.optJSONArray("subject_collection_items");
            }
            ArrayList categories = new ArrayList();
            categories.add(new CategoryItem(typeId, typeId));
            return VodResult.r(categories, parseVodItems(items), null);
        } catch (Exception exception) {
            return VodResult.c("分类获取失败: " + exception.getMessage());
        }
    }

    public String homeContent(boolean filterGenre) throws JSONException {
        ArrayList categories = new ArrayList();
        List<String> categoryIds = Arrays.asList("hot_gaia", "tv_hot", "show_hot", "movie", "tv", "rank_list_movie", "rank_list_tv");
        List<String> categoryNames = Arrays.asList("热门电影", "热播剧集", "热播综艺", "电影筛选", "电视筛选", "电影榜单", "电视剧榜单");
        for (int i = 0; i < categoryIds.size(); i++) {
            categories.add(new CategoryItem(categoryIds.get(i), categoryNames.get(i)));
        }
        String hotItemsJson = OkHttpUtil.string("http://api.douban.com/api/v2/subject_collection/subject_real_time_hotest/items?apikey=" + API_KEY, buildHeaders());
        JSONArray hotItems = new JSONObject(hotItemsJson).optJSONArray("subject_collection_items");
        com.google.gson.JsonElement filterJson = filterGenre ? JsonParser.parseString(OkHttpUtil.string(this.filterUrl, new HashMap<>())) : null;
        return VodResult.r(categories, parseVodItems(hotItems), filterJson);
    }

    @Override
    public void init(Context context, String config) {
        super.init(context, config);
        this.filterUrl = JsonParser.parseString(config).getAsJsonObject().get("filter").getAsString();
    }
}
