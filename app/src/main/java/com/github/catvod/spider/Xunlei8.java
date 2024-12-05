package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
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

import okhttp3.Headers;
import okhttp3.Response;

/**
 * @author zhixc
 * 迅雷吧
 */
public class Xunlei8 extends Spider {
    private final String siteUrl = "https://xunlei8.top";
    private String extend;
    private static HashMap<String, String> xunlei8PicHeader = null;

    private Map<String, String> getHeader() {
        Map<String, String> header = new HashMap<>();
        header.put("User-Agent", Util.CHROME);
        header.put("Referer", siteUrl + "/");
        return header;
    }

    private List<Vod> parseVodListFromDoc(String html) {
        List<Vod> videos = new ArrayList<>();
        Document doc = Jsoup.parse(html);
        Elements items = doc.select(".b876dd567bb .b33c0");
        for (Element it : items) {
            String vodId = it.select("a:eq(0)").attr("href");
            String name = it.select("a:eq(0)").attr("title");
            String pic = fixCover(it.select("a:eq(0) img:eq(0)").attr("src"));
            videos.add(new Vod(vodId, name, pic));
        }
        return videos;
    }

    private String fixCover(String cover) {
        try {
            return "proxy://do=xunlei8&pic=" + Base64.encodeToString(cover.getBytes("UTF-8"), Base64.DEFAULT | Base64.URL_SAFE | Base64.NO_WRAP);
        } catch (Exception ignored) {
            return cover;
        }
    }

    public static Object[] loadPic(Map<String, String> params) {
        String pic = params.get("pic");
        try {
            pic = new String(Base64.decode(pic, Base64.DEFAULT | Base64.URL_SAFE | Base64.NO_WRAP), "UTF-8");
            if (xunlei8PicHeader == null) {
                xunlei8PicHeader = new HashMap<>();
                xunlei8PicHeader.put("User-Agent", Util.CHROME);
                xunlei8PicHeader.put("referer", "https://xunlei8.top/");
            }
            Response response = OkHttp.newCall(pic, xunlei8PicHeader);
            if (response.code() == 200) {
                Headers headers = response.headers();
                String type = headers.get("Content-Type");
                if (type == null) {
                    type = "application/octet-stream";
                }
                Object[] result = new Object[3];
                result[0] = 200;
                result[1] = type;
                result[2] = response.body().byteStream();
                return result;
            }
        } catch (Throwable throwable) {
            SpiderDebug.log(throwable);
        }
        return null;
    }

    private String fixVodInfo(Element e) {
        StringBuilder sb = new StringBuilder();
        for (Element a : e.select("a")) sb.append(a.text()).append("/");
        return sb.toString();
    }

    @Override
    public void init(Context context, String extend) throws Exception {
        super.init(context, extend);
        this.extend = extend;
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        List<Class> classes = new ArrayList<>();
        List<String> typeIds = Arrays.asList("list", "tv");
        List<String> typeNames = Arrays.asList("电影", "电视剧");
        for (int i = 0; i < typeIds.size(); i++) classes.add(new Class(typeIds.get(i), typeNames.get(i)));
        return Result.string(classes, Json.parse(OkHttp.string(extend)));
    }

    @Override
    public String homeVideoContent() throws Exception {
        String html = OkHttp.string(siteUrl, getHeader());
        List<Vod> videos = parseVodListFromDoc(html);
        return Result.string(videos);
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        String cateId = extend.get("cateId") == null ? "0" : extend.get("cateId");
        String year = extend.get("year") == null ? "0" : extend.get("year");
        String area = extend.get("area") == null ? "0" : extend.get("area");
        String sort = extend.get("sort") == null ? "date" : extend.get("sort");
        String cateUrl = siteUrl + "/" + tid + "-" + cateId + "-" + year + "-" + area + "-" + sort + "-" + pg + "-30.html";
        String html = OkHttp.string(cateUrl, getHeader());
        List<Vod> videos = parseVodListFromDoc(html);
        int page = Integer.parseInt(pg), count = Integer.MAX_VALUE, limit = videos.size(), total = Integer.MAX_VALUE;
        return Result.get().vod(videos).page(page, count, limit, total).string();
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        String link = siteUrl + ids.get(0);
        String html = OkHttp.string(link, getHeader());
        Document doc = Jsoup.parse(html);
        String name = doc.select("h1").text();
        String pic = fixCover(doc.select(".bd800a7092 > img").attr("src"));
        String typeName = "";
        String year = "";
        String area = "";
        String remark = "";
        String actor = "";
        String director = "";
        String description = doc.select(".b1f40f7888").text();
        for (Element e : doc.select(".be998a > p")) {
            String text = e.text();
            if (text.startsWith("类型")) typeName = fixVodInfo(e);
            if (text.startsWith("上映")) year = text.replace("上映：", "");
            if (text.startsWith("地区")) area = text.replace("地区：", "");
            if (text.startsWith("片长")) remark = text;
            if (text.startsWith("主演")) actor = fixVodInfo(e);
            if (text.startsWith("导演")) director = fixVodInfo(e);
        }
        typeName += " 地区:" + area;
        area = "";
        typeName += " 年份:" + year;
        remark += " 年份:" + year;
        year = "";

        List<String> magnetList = new ArrayList<>();
        List<String> ed2kList = new ArrayList<>();
        List<String> vodItems = new ArrayList<>();
        Elements aList = doc.select("a.copylink");
        for (int i = 0; i < aList.size(); i++) {
            Element a = aList.get(i);
            String episodeUrl = a.attr("alt");
            String episodeName = (i + 1) + "";
            String episode = episodeName + "$" + episodeUrl;
            if (episodeUrl.startsWith("magnet")) magnetList.add(episode);
            if (episodeUrl.startsWith("ed2k")) ed2kList.add(episode);
            if (episodeUrl.startsWith("thunder://")) vodItems.add(episode);
        }
        Map<String, String> playMap = new LinkedHashMap<>();
        if (magnetList.size() > 0) playMap.put("磁力", TextUtils.join("#", magnetList));
        if (ed2kList.size() > 0) playMap.put("电驴", TextUtils.join("#", ed2kList));
        if (vodItems.size() > 0) playMap.put("边下边播", TextUtils.join("#", vodItems));

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
        if (!"1".equals(pg)) return "";
        String searchUrl = siteUrl + "/s/" + URLEncoder.encode(key) + ".html";
        String html = OkHttp.string(searchUrl, getHeader());
        List<Vod> videos = new ArrayList<>();
        Document doc = Jsoup.parse(html);
        for (Element it : doc.select(".b007")) {
            String vodId = it.select("a:eq(0)").attr("href");
            String name = it.select("h2 > a:eq(0)").text();
            String pic = fixCover(it.select("a:eq(0) > img").attr("src"));
            videos.add(new Vod(vodId, name, pic));
        }
        return Result.string(videos);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        return Result.get().url(id).string();
    }
}
