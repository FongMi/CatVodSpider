package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Json;
import com.github.catvod.utils.Util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * @author zhixc
 * 电影港
 * 地址发布：https://www.dygang.me/
 */
public class DyGang extends Spider {
    private final String siteUrl = "https://www.dygangs.me";
    private String extend;
    private String nextSearchUrlPrefix;
    private String nextSearchUrlSuffix;

    private Map<String, String> getHeader() {
        Map<String, String> header = new HashMap<>();
        header.put("User-Agent", Util.CHROME);
        header.put("Referer", siteUrl + "/");
        return header;
    }

    private Map<String, String> getSearchHeader() {
        Map<String, String> header = new HashMap<>();
        header.put("User-Agent", Util.CHROME);
        return header;
    }

    private String response2string(Response response) throws Exception {
        if (!response.isSuccessful() || response.body() == null) return "";
        byte[] bytes = response.body().bytes();
        response.close();
        return new String(bytes, "GBK");
    }

    private String getStrByRegex(Pattern pattern, String html) {
        Matcher matcher = pattern.matcher(html);
        return matcher.find() ? matcher.group(1).trim() : "";
    }

    private List<Vod> parseVodListFromDoc(String html, boolean isHotVod) {
        List<Vod> videos = new ArrayList<>();
        Document doc = Jsoup.parse(html);
        String itemsCssQuery = isHotVod ? "td[width=132]" : "table[width=388]";
        Elements items = doc.select(itemsCssQuery);
        for (Element it : items) {
            String vodId = it.select("a:eq(0)").attr("href");
            String name = it.select("a:eq(0) > img:eq(0)").attr("alt");
            String pic = it.select("a:eq(0) > img:eq(0)").attr("src");
            videos.add(new Vod(vodId, name, pic));
        }
        return videos;
    }

    private String getActor(String html) {
        String actor = getStrByRegex(Pattern.compile("◎演　　员　(.*?)</p", Pattern.DOTALL), html);
        if ("".equals(actor)) actor = getStrByRegex(Pattern.compile("◎主　　演　(.*?)</p", Pattern.DOTALL), html);
        return actor.replaceAll("&middot;", "·").replaceAll("\r\n", "").replaceAll("<br />", "").replaceAll("&nbsp;", "").replaceAll("　　　　 　", " / ").replaceAll("　　　　　 ", " / ").replaceAll("　　　　　　", " / ");
    }

    private String getDirector(String html) {
        return getStrByRegex(Pattern.compile("◎导　　演　(.*?)<br"), html).replaceAll("&middot;", "·");
    }

    private String getDescription(String html) {
        return getStrByRegex(Pattern.compile("◎简　　介(.*?)<hr", Pattern.DOTALL), html).replaceAll("&middot;", "·").replaceAll("\r\n", "").replaceAll("&nbsp;", " ").replaceAll("　　　　", "");
    }

    private String removeHtmlTag(String str) {
        return str.replaceAll("</?[^>]+>", "");
    }

    private boolean isMovie(String vodId) {
        return !(vodId.startsWith("/dsj") || vodId.startsWith("/dsj1") || vodId.startsWith("/yx") || vodId.startsWith("/dmq"));
    }

    private Map<String, String> parsePlayMapFromDoc(Document doc) {
        Map<String, String> playMap = new LinkedHashMap<>();
        List<String> magnetList = new ArrayList<>();
        List<String> ed2kList = new ArrayList<>();
        Elements aList = doc.select("td[bgcolor=#ffffbb] > a");
        for (Element a : aList) {
            String episodeUrl = a.attr("href");
            String episodeName = a.text();
            String episode = episodeName + "$" + episodeUrl;
            if (episodeUrl.startsWith("magnet")) magnetList.add(episode);
            if (episodeUrl.startsWith("ed2k")) ed2kList.add(episode);
        }
        if (magnetList.size() > 0) playMap.put("磁力", TextUtils.join("#", magnetList));
        if (ed2kList.size() > 0) playMap.put("电驴", TextUtils.join("#", ed2kList));
        return playMap;
    }

    private Map<String, String> parsePlayMapForMovieFromDoc(Document doc) {
        Map<String, String> playMap = new LinkedHashMap<>();
        Elements aList = doc.select("td[bgcolor=#ffffbb] > a");
        for (int i = 0; i < aList.size(); i++) {
            Element a = aList.get(i);
            String episodeUrl = a.attr("href");
            String episodeName = a.text();
            if (episodeUrl.startsWith("magnet") || episodeUrl.startsWith("ed2k")) {
                if (playMap.containsKey(episodeName)) episodeName += i;
                playMap.put(episodeName, episodeUrl);
            }
        }
        return playMap;
    }

    private int parseLastPageNumber(String html) {
        try {
            String href = Jsoup.parse(html).select("td[align=middle] > a").last().attr("href");
            int num = Integer.parseInt(getStrByRegex(Pattern.compile("index_(.*?)\\.htm"), href));
            return num;
        } catch (Exception ignored) {
            return 1;
        }
    }

    @Override
    public void init(Context context, String extend) throws Exception {
        super.init(context, extend);
        this.extend = extend;
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        List<Class> classes = new ArrayList<>();
        List<String> typeIds = Arrays.asList("my_dianying", "my_dianshiju", "dmq", "zy", "jilupian");
        List<String> typeNames = Arrays.asList("电影", "电视剧", "动漫", "综艺", "纪录片");
        for (int i = 0; i < typeIds.size(); i++) classes.add(new Class(typeIds.get(i), typeNames.get(i)));
        return Result.string(classes, Json.parse(OkHttp.string(extend)));
    }

    @Override
    public String homeVideoContent() throws Exception {
        String html = response2string(OkHttp.newCall(siteUrl, getHeader()));
        List<Vod> videos = parseVodListFromDoc(html, true);
        return Result.string(videos);
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        if ("my_dianying".equals(tid)) tid = extend.get("cateId") == null ? "ys" : extend.get("cateId");
        if ("my_dianshiju".equals(tid)) tid = extend.get("cateId") == null ? "dsj" : extend.get("cateId");
        String cateUrl = siteUrl + "/" + tid;
        if (!"1".equals(pg)) cateUrl += "/index_" + pg + ".htm";
        String html = response2string(OkHttp.newCall(cateUrl, getHeader()));
        List<Vod> videos = parseVodListFromDoc(html, false);
        int lastPageNumber = parseLastPageNumber(html);
        int page = Integer.parseInt(pg), count = (lastPageNumber == 1 || lastPageNumber < page) ? page : lastPageNumber, limit = videos.size(), total = Integer.MAX_VALUE;
        return Result.get().vod(videos).page(page, count, limit, total).string();
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        String vodId = ids.get(0);
        String link = siteUrl + vodId;
        String html = response2string(OkHttp.newCall(link, getHeader()));
        String remark = "上映日期：" + removeHtmlTag(getStrByRegex(Pattern.compile("◎上映日期　(.*?)<br"), html));
        String actor = getActor(html);
        String director = getDirector(html);
        String description = removeHtmlTag(getDescription(html)).replaceAll("　　　", "").replaceAll("　　", "");
        Document doc = Jsoup.parse(html);
        Map<String, String> playMap = isMovie(vodId) ? parsePlayMapForMovieFromDoc(doc) : parsePlayMapFromDoc(doc);
        String name = doc.select("div[class=title] > a:eq(0)").text();
        String pic = doc.select("img[width=120]:eq(0)").attr("src");
        String typeName = removeHtmlTag(getStrByRegex(Pattern.compile("◎类　　别　(.*?)<br"), html)).replaceAll(" / ", "/");
        String year = getStrByRegex(Pattern.compile("◎年　　代　(.*?)<br"), html);
        String area = removeHtmlTag(getStrByRegex(Pattern.compile("◎产　　地　(.*?)<br"), html));

        // 由于部分信息过长，故进行一些调整，将年份、地区等信息放到 类别、备注里面
        typeName += " 地区:" + area;
        area = "";
        typeName += " 年份:" + year;
        remark += " 年份:" + year;
        year = "";

        Vod vod = new Vod();
        vod.setVodId(ids.get(0));
        vod.setVodName(name);
        vod.setVodPic(pic);
        vod.setTypeName(typeName);
        vod.setVodYear(year);
        vod.setVodArea(area);
        vod.setVodRemarks(remark);
        vod.setVodActor(actor);
        vod.setVodDirector(director);
        vod.setVodContent(description);
        vod.setVodPlayFrom(TextUtils.join("$$$", playMap.keySet()));
        vod.setVodPlayUrl(TextUtils.join("$$$", playMap.values()));
        return Result.string(vod);
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        return searchContent(key, quick, "1");
    }

    @Override
    public String searchContent(String key, boolean quick, String pg) throws Exception {
        String searchUrl = siteUrl + "/e/search/index.php";
        String html = "";
        if ("1".equals(pg)) {
            String requestBody = "tempid=1&tbname=article&keyboard=" + URLEncoder.encode(key, "GBK") + "&show=title%2Csmalltext&Submit=%CB%D1%CB%F7";
            RequestBody formBody = RequestBody.create(MediaType.parse("application/x-www-form-urlencoded"), requestBody);
            Request request = new Request.Builder()
                    .url(searchUrl)
                    .post(formBody)
                    .header("Accept", Util.ACCEPT)
                    .header("Accept-Language", "zh-CN,zh;q=0.9")
                    .header("Cache-Control", "max-age=0")
                    .header("Connection", "keep-alive")
                    .header("Content-Type", "application/x-www-form-urlencoded")
                    .header("Origin", siteUrl)
                    .header("Referer", siteUrl + "/")
                    .header("User-Agent", Util.CHROME)
                    .build();
            Response response = OkHttp.newCall(request);
            if (!response.isSuccessful()) return "";
            String[] split = String.valueOf(response.request().url()).split("\\?searchid=");
            nextSearchUrlPrefix = split[0] + "index.php?page=";
            nextSearchUrlSuffix = "&searchid=" + split[1];
            html = response2string(response);
        } else {
            int page = Integer.parseInt(pg) - 1;
            searchUrl = nextSearchUrlPrefix + page + nextSearchUrlSuffix;
            html = response2string(OkHttp.newCall(searchUrl, getSearchHeader()));
        }
        List<Vod> videos = parseVodListFromDoc(html, false);
        return Result.string(videos);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        return Result.get().url(id).string();
    }
}
