package com.github.catvod.spider;

import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;

import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Qile
 */
public class Jianpian extends Spider {
    private final String siteUrl = "http://api2.rinhome.com";

    private Map<String, String> getHeader() {
        Map<String, String> headers = new HashMap<>();
        headers.put("User-Agent", "jianpian-android/360");
        headers.put("JPAUTH", "y261ow7kF2dtzlxh1GS9EB8nbTxNmaK/QQIAjctlKiEv");
        return headers;
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        JSONArray classes = new JSONArray();
        List<String> typeIds = Arrays.asList("0", "1", "2", "3", "4");
        List<String> typeNames = Arrays.asList("全部", "电影", "电视剧", "动漫", "综艺");
        for (int i = 0; i < typeIds.size(); i++) {
            JSONObject obj = new JSONObject()
                    .put("type_id", typeIds.get(i))
                    .put("type_name", typeNames.get(i));
            classes.put(obj);
        }
        // filter 二级筛选
        String f = "{\"0\": [{\"key\": \"year\", \"name\": \"年份\", \"value\": [{\"n\": \"全部\", \"v\": \"0\"}, {\"n\": \"2023\", \"v\": \"153\"}, {\"n\": \"2022\", \"v\": \"101\"}, {\"n\": \"2021\", \"v\": \"118\"}, {\"n\": \"2020\", \"v\": \"16\"}, {\"n\": \"2019\", \"v\": \"7\"}, {\"n\": \"2018\", \"v\": \"2\"}, {\"n\": \"2017\", \"v\": \"3\"}, {\"n\": \"2016\", \"v\": \"22\"}]}, {\"key\": \"by\", \"name\": \"排序\", \"value\": [{\"n\": \"热门\", \"v\": \"hot\"}, {\"n\": \"更新\", \"v\": \"updata\"}, {\"n\": \"评分\", \"v\": \"rating\"}]}],\"1\": [{\"key\": \"year\", \"name\": \"年份\", \"value\": [{\"n\": \"全部\", \"v\": \"0\"}, {\"n\": \"2023\", \"v\": \"153\"}, {\"n\": \"2022\", \"v\": \"101\"}, {\"n\": \"2021\", \"v\": \"118\"}, {\"n\": \"2020\", \"v\": \"16\"}, {\"n\": \"2019\", \"v\": \"7\"}, {\"n\": \"2018\", \"v\": \"2\"}, {\"n\": \"2017\", \"v\": \"3\"}, {\"n\": \"2016\", \"v\": \"22\"}]}, {\"key\": \"by\", \"name\": \"排序\", \"value\": [{\"n\": \"热门\", \"v\": \"hot\"}, {\"n\": \"更新\", \"v\": \"updata\"}, {\"n\": \"评分\", \"v\": \"rating\"}]}], \"2\": [{\"key\": \"year\", \"name\": \"年份\", \"value\": [{\"n\": \"全部\", \"v\": \"0\"}, {\"n\": \"2023\", \"v\": \"153\"}, {\"n\": \"2022\", \"v\": \"101\"}, {\"n\": \"2021\", \"v\": \"118\"}, {\"n\": \"2020\", \"v\": \"16\"}, {\"n\": \"2019\", \"v\": \"7\"}, {\"n\": \"2018\", \"v\": \"2\"}, {\"n\": \"2017\", \"v\": \"3\"}, {\"n\": \"2016\", \"v\": \"22\"}]}, {\"key\": \"by\", \"name\": \"排序\", \"value\": [{\"n\": \"热门\", \"v\": \"hot\"}, {\"n\": \"更新\", \"v\": \"updata\"}, {\"n\": \"评分\", \"v\": \"rating\"}]}],\"3\": [{\"key\": \"year\", \"name\": \"年份\", \"value\": [{\"n\": \"全部\", \"v\": \"0\"}, {\"n\": \"2023\", \"v\": \"153\"}, {\"n\": \"2022\", \"v\": \"101\"}, {\"n\": \"2021\", \"v\": \"118\"}, {\"n\": \"2020\", \"v\": \"16\"}, {\"n\": \"2019\", \"v\": \"7\"}, {\"n\": \"2018\", \"v\": \"2\"}, {\"n\": \"2017\", \"v\": \"3\"}, {\"n\": \"2016\", \"v\": \"22\"}]}, {\"key\": \"by\", \"name\": \"排序\", \"value\": [{\"n\": \"热门\", \"v\": \"hot\"}, {\"n\": \"更新\", \"v\": \"updata\"}, {\"n\": \"评分\", \"v\": \"rating\"}]}],\"4\": [{\"key\": \"year\", \"name\": \"年份\", \"value\": [{\"n\": \"全部\", \"v\": \"0\"}, {\"n\": \"2023\", \"v\": \"153\"}, {\"n\": \"2022\", \"v\": \"101\"}, {\"n\": \"2021\", \"v\": \"118\"}, {\"n\": \"2020\", \"v\": \"16\"}, {\"n\": \"2019\", \"v\": \"7\"}, {\"n\": \"2018\", \"v\": \"2\"}, {\"n\": \"2017\", \"v\": \"3\"}, {\"n\": \"2016\", \"v\": \"22\"}]}, {\"key\": \"by\", \"name\": \"排序\", \"value\": [{\"n\": \"热门\", \"v\": \"hot\"}, {\"n\": \"更新\", \"v\": \"updata\"}, {\"n\": \"评分\", \"v\": \"rating\"}]}]}";
        JSONObject filterConfig = new JSONObject(f);
        JSONObject result = new JSONObject()
                .put("class", classes)
                .put("filters", filterConfig);
        return result.toString();
    }

    @Override
    public String homeVideoContent() throws Exception {
        String url = "https://yjpapipxblwdohpakljwg.hxhzs.com/api/tag/hand?code=unknown601193cf375db73d&channel=wandoujia";
        String content = OkHttp.string(url, getHeader());
        JSONObject jsonObject = new JSONObject(content);
        JSONArray videoArray = jsonObject.getJSONArray("data").getJSONObject(0).getJSONArray("video");
        JSONArray videos = new JSONArray();
        for (int i = 0; i < videoArray.length(); i++) {
            JSONObject blockObj = videoArray.getJSONObject(i);
            JSONObject playlistObj = blockObj.getJSONObject("playlist");
            videos.put(new JSONObject()
                    .put("vod_id", blockObj.getInt("id"))
                    .put("vod_name", blockObj.getString("title"))
                    .put("vod_pic", blockObj.getString("path") + "@Referer=www.jianpianapp.com@User-Agent=jianpian-version362")
                    .put("vod_remarks", playlistObj.getString("title")));
        }
        JSONObject result = new JSONObject()
                .put("list", videos);
        return result.toString();
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        // 筛选处理
        HashMap<String, String> ext = new HashMap<>();
        if (extend != null && extend.size() > 0) {
            ext.putAll(extend);
        }
        String cateId = ext.get("cateId") == null ? tid : ext.get("cateId");
        String year = ext.get("year") == null ? "0" : ext.get("year");
        String by = ext.get("by") == null ? "hot" : ext.get("by");
        String url = siteUrl + String.format("/api/crumb/list?area=0&category_id=%s&page=%s&type=0&limit=24&sort=%s&year=%s", cateId, pg, by, year);
        String content = OkHttp.string(url, getHeader());
        JSONObject jsonObject = new JSONObject(content);
        JSONArray dataArray = jsonObject.getJSONArray("data");
        JSONArray videos = new JSONArray();
        for (int i = 0; i < dataArray.length(); i++) {
            JSONObject vObj = dataArray.getJSONObject(i);
            JSONObject v = new JSONObject();
            JSONObject playlistObj = vObj.getJSONObject("playlist");
            v.put("vod_id", vObj.getInt("id"));
            v.put("vod_name", vObj.getString("title"));
            v.put("vod_pic", vObj.getString("path") + "@Referer=www.jianpianapp.com@User-Agent=jianpian-version362");
            v.put("vod_remarks", playlistObj.getString("title"));
            videos.put(v);
        }
        JSONObject result = new JSONObject()
                .put("page", Integer.parseInt(pg))
                .put("pagecount", Integer.MAX_VALUE)
                .put("limit", 24)
                .put("total", Integer.MAX_VALUE)
                .put("list", videos);
        return result.toString();
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        String url = siteUrl + "/api/node/detail?channel=wandoujia&token=&id=" + ids.get(0);
        String content = OkHttp.string(url, getHeader());
        JSONObject dataObject = new JSONObject(content);
        JSONObject vObj = dataObject.getJSONObject("data");
        JSONObject result = new JSONObject();
        JSONArray list = new JSONArray();
        JSONObject vodAtom = new JSONObject();
        vodAtom.put("vod_id", vObj.getInt("id"));
        vodAtom.put("vod_name", vObj.getString("title"));
        vodAtom.put("vod_pic", vObj.getString("thumbnail") + "@Referer=www.jianpianapp.com@User-Agent=jianpian-version362");
        vodAtom.put("type_name", vObj.getJSONArray("types").getJSONObject(0).getString("name"));
        vodAtom.put("vod_year", vObj.getJSONObject("year").getString("title"));
        vodAtom.put("vod_area", vObj.getJSONObject("area").getString("title"));
        vodAtom.put("vod_remarks", vObj.getString("mask"));
        vodAtom.put("vod_director", vObj.getJSONArray("directors").getJSONObject(0).getString("name"));
        vodAtom.put("vod_content", vObj.getString("description").trim());

        JSONArray actorsArray = vObj.getJSONArray("actors");
        StringBuilder vod_actor = new StringBuilder();
        for (int i = 0; i < actorsArray.length(); i++) {
            JSONObject actorObj = actorsArray.getJSONObject(i);
            String actorName = actorObj.getString("name");
            if (i > 0) {
                vod_actor.append(" ");
            }
            vod_actor.append(actorName);
        }
        vodAtom.put("vod_actor", vod_actor.toString());

        JSONArray dataArray = vObj.getJSONArray("btbo_downlist");
        StringBuilder vod_play_url = new StringBuilder();
        for (int i = 0; i < dataArray.length(); i++) {
            JSONObject listObj = dataArray.getJSONObject(i);
            String vod_play_urls = listObj.getString("val").replaceAll("ftp", "tvbox-xg:ftp");
            if (i > 0) {
                vod_play_url.append("#");
            }
            vod_play_url.append(vod_play_urls);
        }
        vodAtom.put("vod_play_url", vod_play_url.toString());
        vodAtom.put("vod_play_from", "边下边播");
        list.put(vodAtom);
        result.put("list", list);
        return result.toString();
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        String url = siteUrl + "/api/video/search?page=1&key=" + URLEncoder.encode(key);
        String content = OkHttp.string(url, getHeader());
        JSONObject jsonObject = new JSONObject(content);
        JSONArray dataArray = jsonObject.getJSONArray("data");
        JSONArray videos = new JSONArray();
        for (int i = 0; i < dataArray.length(); i++) {
            JSONObject vObj = dataArray.getJSONObject(i);
            JSONObject v = new JSONObject();
            v.put("vod_id", vObj.getInt("id"));
            v.put("vod_name", vObj.getString("title"));
            v.put("vod_pic", vObj.getString("thumbnail") + "@Referer=www.jianpianapp.com@User-Agent=jianpian-version362");
            v.put("vod_remarks", vObj.getString("mask"));
            videos.put(v);
        }
        JSONObject result = new JSONObject();
        result.put("list", videos);
        return result.toString();
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        JSONObject result = new JSONObject()
                .put("parse", 0)
                .put("header", getHeader())
                .put("playUrl", "")
                .put("url", id);
        return result.toString();
    }
}