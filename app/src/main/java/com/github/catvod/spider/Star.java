package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Filter;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.bean.star.Card;
import com.github.catvod.bean.star.Condition;
import com.github.catvod.bean.star.Detail;
import com.github.catvod.bean.star.Query;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Util;

import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import okhttp3.OkHttpClient;

public class Star extends Spider {

    private static final String apiUrl = "https://aws.ulivetv.net/v3/web/api/filter";
    private static final String siteUrl = "https://www.histar.tv/";
    private static final String detail = siteUrl + "vod/detail/";
    private static final String data = "_next/data/";
    private LinkedHashMap<String, String> map;
    private String ver;

    private Map<String, String> getHeader() {
        Map<String, String> headers = new HashMap<>();
        headers.put("User-Agent", Util.CHROME);
        headers.put("Cookie", "userIP=127.0.0.1; aws-waf-token=");
        headers.put("Referer", siteUrl);
        return headers;
    }

    private String getVer() {
        for (Element script : Jsoup.parse(OkHttp.string(client(), siteUrl, getHeader())).select("script")) if (script.attr("src").contains("buildManifest.js")) return script.attr("src").split("/")[3];
        return "";
    }

    @Override
    public OkHttpClient client() {
        try {
            return super.client();
        } catch (Throwable e) {
            return OkHttp.client();
        }
    }

    @Override
    public void init(Context context, String extend) {
        map = new LinkedHashMap<>();
        map.put("movie", "电影");
        map.put("drama", "电视剧");
        map.put("animation", "动漫");
        map.put("variety", "综艺");
        map.put("documentary", "纪录片");
        ver = getVer();
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        List<Class> classes = new ArrayList<>();
        LinkedHashMap<String, List<Filter>> filters = new LinkedHashMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) classes.add(new Class(entry.getKey(), entry.getValue()));
        for (Class type : classes) {
            Element script = Jsoup.parse(OkHttp.string(client(), siteUrl + type.getTypeId() + "/all/all/all", getHeader())).select("#__NEXT_DATA__").get(0);
            JSONObject obj = new JSONObject(script.data()).getJSONObject("props").getJSONObject("pageProps").getJSONObject("filterCondition");
            Condition item = Condition.objectFrom(obj.toString());
            filters.put(type.getTypeId(), item.getFilter());
        }
        return Result.string(classes, filters);
    }

    @Override
    public String homeVideoContent() throws Exception {
        List<Vod> list = new ArrayList<>();
        Element script = Jsoup.parse(OkHttp.string(client(), siteUrl, getHeader())).select("#__NEXT_DATA__").get(0);
        List<Card> cards = Card.arrayFrom(new JSONObject(script.data()).getJSONObject("props").getJSONObject("pageProps").getJSONArray("cards").toString());
        for (Card card : cards) if (!card.getName().equals("电视直播")) for (Card item : card.getCards()) list.add(item.vod());
        return Result.string(list);
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        String year = extend.containsKey("year") ? extend.get("year") : "";
        String type = extend.containsKey("type") ? extend.get("type") : "";
        String area = extend.containsKey("area") ? extend.get("area") : "";
        Query query = new Query();
        query.setPageSize(16);
        query.setChName(map.get(tid));
        query.setPage(Integer.parseInt(pg));
        if (year.length() > 0) query.setYear(year);
        if (type.length() > 0) query.setLabel(type);
        if (area.length() > 0) query.setCountry(area);
        String body = OkHttp.post(apiUrl, query.toString());
        List<Card> cards = Card.arrayFrom(new JSONObject(body).getJSONObject("data").getJSONArray("list").toString());
        List<Vod> list = new ArrayList<>();
        for (Card card : cards) list.add(card.vod());
        return Result.string(list);
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        Element script = Jsoup.parse(OkHttp.string(client(), detail.concat(ids.get(0)), getHeader())).select("#__NEXT_DATA__").get(0);
        Detail detail = Detail.objectFrom(new JSONObject(script.data()).getJSONObject("props").getJSONObject("pageProps").getJSONObject("pageData").toString());
        Vod vod = new Vod();
        vod.setVodId(ids.get(0));
        vod.setVodPic(detail.getPicurl());
        vod.setVodYear(detail.getTime());
        vod.setVodName(detail.getName());
        vod.setVodArea(detail.getCountry());
        vod.setVodActor(detail.getActor());
        vod.setVodRemarks(detail.getCountStr());
        vod.setVodContent(detail.getDesc());
        vod.setVodDirector(detail.getDirector());
        vod.setTypeName(detail.getLabel());
        vod.setVodPlayFrom("FongMi");
        List<String> playUrls = new ArrayList<>();
        for (Detail.Video video : detail.getVideos()) playUrls.add(video.getEporder() + "$" + video.getPurl());
        vod.setVodPlayUrl(TextUtils.join("#", playUrls));
        return Result.string(vod);
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        List<Vod> list = new ArrayList<>();
        String json = OkHttp.string(client(), siteUrl + data + ver + "/search.json?word=" + URLEncoder.encode(key), getHeader());
        List<Card> items = Card.arrayFrom(new JSONObject(json).getJSONObject("pageProps").getJSONArray("initList").toString());
        for (Card item : items) list.add(item.vod());
        return Result.string(list);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        return Result.get().url(id).string();
    }
}

