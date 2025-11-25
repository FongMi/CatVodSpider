package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Crypto;
import com.github.catvod.utils.Util;

import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Qile
 * @date 2024-10-06
 */
public class YHDM extends Spider {

    private static String siteUrl = "https://www.857fans.com";
    private final Map<String, String> configCache = new HashMap<>();

    private Map<String, String> getHeader() {
        Map<String, String> header = new HashMap<>();
        header.put("User-Agent", Util.CHROME);
        return header;
    }

    @Override
    public void init(Context context, String extend) {
        if (!extend.isEmpty()) siteUrl = extend;
    }

    @Override
    public String homeContent(boolean filter) {
        List<Class> classes = new ArrayList<>();
        List<String> typeIds = Arrays.asList("guochandongman", "ribendongman", "dongmandianying", "omeidongman");
        List<String> typeNames = Arrays.asList("国产动漫", "日本动漫", "动漫电影", "欧美动漫");
        for (int i = 0; i < typeIds.size(); i++) classes.add(new Class(typeIds.get(i), typeNames.get(i)));
        Document doc = Jsoup.parse(OkHttp.string(siteUrl, getHeader()));
        List<Vod> list = new ArrayList<>();
        for (Element li : doc.select(".stui-vodlist.clearfix .myui-vodlist__box")) {
            String vid = li.select("a").attr("href");
            String name = li.select("a").attr("title");
            String pic = li.select("a").attr("data-original");
            if (!pic.startsWith("http")) pic = siteUrl + pic;
            String remark = li.select(".pic-text.text-right").text();
            list.add(new Vod(vid, name, pic, remark));
        }
        return Result.string(classes, list);
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        String cateUrl = siteUrl + String.format("/type/%s-%s.html", tid, pg);
        Document doc = Jsoup.parse(OkHttp.string(cateUrl, getHeader()));
        List<Vod> list = new ArrayList<>();
        for (Element li : doc.select(".myui-vodlist__box")) {
            String vid = li.select("a").attr("href");
            String name = li.select("a").attr("title");
            String pic = li.select("a").attr("data-original");
            if (!pic.startsWith("http")) pic = siteUrl + pic;
            String remark = li.select(".pic-text.text-right").text();
            list.add(new Vod(vid, name, pic, remark));
        }
        return Result.string(list);
    }

    @Override
    public String detailContent(List<String> ids) {
        String detailUrl = siteUrl + ids.get(0);
        Document doc = Jsoup.parse(OkHttp.string(detailUrl, getHeader()));
        Elements sources = doc.select(".myui-content__list.sort-list");
        Elements circuits = doc.select("a[href^=#playlist]");
        StringBuilder vod_play_url = new StringBuilder();
        StringBuilder vod_play_from = new StringBuilder();
        for (int i = 0; i < circuits.size(); i++) {
            String spanText = circuits.get(i).text();
            vod_play_from.append(spanText).append("$$$");
            Elements aElementArray = sources.get(i).select("a");
            for (int j = 0; j < aElementArray.size(); j++) {
                Element a = aElementArray.get(j);
                String href = a.attr("href");
                String text = a.text();
                vod_play_url.append(text).append("$").append(href);
                boolean notLastEpisode = j < aElementArray.size() - 1;
                vod_play_url.append(notLastEpisode ? "#" : "$$$");
            }
        }
        String text = doc.select(".myui-content__detail").text();
        String classifyName = matcher(text, "类型：(.*?)分类");
        String area = matcher(text, "地区：(.*?)年份");
        String year = matcher(text, "年份：(.*?)更新");
        String remark = matcher(text, "更新：(.*?)简介");
        String brief = doc.select(".col-pd.text-collapse .data").text();
        Vod vod = new Vod();
        vod.setVodId(ids.get(0));
        vod.setVodArea(area);
        vod.setVodYear(year);
        vod.setVodRemarks(remark);
        vod.setVodContent(brief);
        vod.setTypeName(classifyName);
        vod.setVodPlayFrom(vod_play_from.toString());
        vod.setVodPlayUrl(vod_play_url.toString());
        return Result.string(vod);
    }

    @Override
    public String searchContent(String key, boolean quick) {
        String searchUrl = siteUrl + "/search/" + Uri.encode(key) + "-------------.html";
        Document doc = Jsoup.parse(OkHttp.string(searchUrl, getHeader()));
        List<Vod> list = new ArrayList<>();
        for (Element li : doc.select("li.clearfix")) {
            String vid = li.select("a").attr("href");
            String name = li.select("a").attr("title");
            String pic = li.select("a").attr("data-original");
            if (!pic.startsWith("http")) pic = siteUrl + pic;
            String remark = li.select(".pic-text.text-right").text();
            list.add(new Vod(vid, name, pic, remark));
        }
        return Result.string(list);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws JSONException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
        String todayDate = dateFormat.format(new Date());
        String ConfigUrl = siteUrl + "/static/js/playerconfig.js?t=" + todayDate;
        if (!configCache.containsKey(ConfigUrl)) {
            String ConfigContent = OkHttp.string(ConfigUrl, getHeader());
            String ConfigObject = matcher(ConfigContent, "player_list=(.*?),MacPlayerConfig");
            configCache.put(ConfigUrl, ConfigObject);
        }
        String content = OkHttp.string(siteUrl + id, getHeader());
        String json = matcher(content, "player_aaaa=(.*?)</script>");
        JSONObject player = new JSONObject(json);
        String aaaaUrl = player.getString("url");
        String from = player.getString("from");
        String parseUrl = new JSONObject(configCache.get(ConfigUrl)).getJSONObject(from).getString("parse");
        String parseUrls = parseUrl + aaaaUrl;
        String content1 = OkHttp.string(parseUrls, getHeader());
        String playUrl = matcher(content1, "getVideoInfo\\(\"(.*?)\"");
        String key = "57A891D97E332A9D";
        String iv = matcher(content1, "bt_token = \"(.*?)\"");
        String realUrl = Crypto.CBC(playUrl, key, iv);
        return Result.get().url(realUrl).string();
    }

    private String matcher(String content, String pattern) {
        Matcher matcher = Pattern.compile(pattern).matcher(content);
        return matcher.find() ? matcher.group(1) : "";
    }
}