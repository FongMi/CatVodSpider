package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.B.JsonUtils;
import com.github.catvod.spider.merge.K.VodResult;
import com.github.catvod.spider.merge.K.VodItem;
import com.google.gson.JsonParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Douban extends NetPan {
    private String filterUrl;

    private Map<String, String> buildHeaders() {
        HashMap headers = com.github.catvod.spider.merge.B.MapBuilder.b("Host", "frodo.douban.com", "Connection", "Keep-Alive");
        headers.put("Referer", "https://servicewechat.com/wx2f9b06c1de1ccfca/84/page-frame.html");
        headers.put("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36 MicroMessenger/7.0.9.501 NetType/WIFI MiniProgramEnv/Windows WindowsWechat");
        return headers;
    }

    private List<VodItem> parseVodItems(JSONArray jsonArray) throws JSONException {
        String coverUrl;
        String ratingText;
        ArrayList vodItems = new ArrayList();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject item = jsonArray.getJSONObject(i);
            item.optString("id");
            String title = item.optString("title");
            try {
                coverUrl = item.getJSONObject("pic").optString("normal") + "@Referer=https://api.douban.com/@User-Agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36";
            } catch (Exception unused) {
                coverUrl = "";
            }
            if (!com.github.catvod.spider.merge.P0.StringUtils.b(coverUrl)) {
                try {
                    ratingText = "评分：" + item.getJSONObject("rating").optString("value");
                } catch (Exception unused2) {
                    ratingText = "";
                }
                StringBuilder titleBuilder = com.github.catvod.spider.merge.C1.a.a(title, "%%");
                titleBuilder.append(item.optString("card_subtitle"));
                vodItems.add(new VodItem(titleBuilder.toString(), title, coverUrl, ratingText));
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
                sb.append("&start=0&count=50&apikey=0ac44ae016490db2204ce0a042db2916");
                url = sb.toString();
            } else if ("rank_list_movie".equals(typeId)) {
                url = "https://frodo.douban.com/api/v2/movie/recommend?sort=U&start=0&count=50&apikey=0ac44ae016490db2204ce0a042db2916";
            } else if ("rank_list_tv".equals(typeId)) {
                url = "https://frodo.douban.com/api/v2/tv/recommend?sort=U&start=0&count=50&apikey=0ac44ae016490db2204ce0a042db2916";
            } else {
                url = "https://frodo.douban.com/api/v2/subject_collection/" + typeId + "/items?start=0&count=50&apikey=0ac44ae016490db2204ce0a042db2916";
            }
            JSONObject response = new JSONObject(com.github.catvod.spider.merge.f0.HttpClient.m(url, buildHeaders(), null));
            JSONArray items = response.optJSONArray("items");
            if (items == null) {
                items = response.optJSONArray("subject_collection_items");
            }
            ArrayList<VodCategory> categories = new ArrayList<>();
            categories.add(new VodCategory(typeId, typeId));
            return VodResult.r(categories, parseVodItems(items), null);
        } catch (Exception exception) {
            return VodResult.c("分类获取失败: " + exception.getMessage());
        }
    }

    public String homeContent(boolean filterGenre) {
        ArrayList categories = new ArrayList();
        List categoryIds = Arrays.asList("hot_gaia", "tv_hot", "show_hot", "movie", "tv", "rank_list_movie", "rank_list_tv");
        List categoryNames = Arrays.asList("热门电影", "热播剧集", "热播综艺", "电影筛选", "电视筛选", "电影榜单", "电视剧榜单");
        for (int i = 0; i < categoryIds.size(); i++) {
            categories.add(new com.github.catvod.spider.merge.K.VodCategory((String) categoryIds.get(i), (String) categoryNames.get(i)));
        }
        return VodResult.r(categories, parseVodItems(new JSONObject(com.github.catvod.spider.merge.f0.HttpClient.m("http://api.douban.com/api/v2/subject_collection/subject_real_time_hotest/items?apikey=0ac44ae016490db2204ce0a042db2916", buildHeaders(), null)).optJSONArray("subject_collection_items")), filterGenre ? JsonUtils.c(com.github.catvod.spider.merge.f0.HttpClient.l(this.filterUrl)) : null);
    }

    @Override // com.github.catvod.en.NetPan
    public void init(Context context, String config) {
        super.init(context, config);
        this.filterUrl = JsonParser.parseString(config).getAsJsonObject().get("filter").getAsString();
    }
}
