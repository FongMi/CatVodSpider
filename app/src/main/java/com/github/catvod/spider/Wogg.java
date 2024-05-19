package com.github.catvod.spider;

import android.content.Context;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Json;
import com.github.catvod.utils.Util;
import com.google.gson.JsonObject;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zhixc
 */
public class Wogg extends Ali {

    private final String siteUrl = "https://www.wogg.net";
    private final Pattern regexCategory = Pattern.compile("/vodtype/(\\w+).html");
    private final Pattern regexPageTotal = Pattern.compile("\\$\\(\"\\.mac_total\"\\)\\.text\\('(\\d+)'\\);");

    private Map<String, String> getHeader() {
        Map<String, String> header = new HashMap<>();
        header.put("User-Agent", Util.CHROME);
        return header;
    }

    @Override
    public void init(Context context, String extend) {
        JsonObject ext = Json.safeObject(extend);
        super.init(context, ext.has("token") ? ext.get("token").getAsString() : "");
    }

    @Override
    public String homeContent(boolean filter) {
        List<Class> classes = new ArrayList<>();
        Document doc = Jsoup.parse(OkHttp.string(siteUrl, getHeader()));
        Elements elements = doc.select(".nav-link");
        for (Element e : elements) {
            Matcher mather = regexCategory.matcher(e.attr("href"));
            if (mather.find()) {
                classes.add(new Class(mather.group(1), e.text().trim()));
            }
        }
        return Result.string(classes, parseVodListFromDoc(doc));
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        String[] urlParams = new String[]{tid, "", "", "", "", "", "", "", pg, "", "", ""};
        if (extend != null && extend.size() > 0) {
            for (String key : extend.keySet()) {
                urlParams[Integer.parseInt(key)] = extend.get(key);
            }
        }
        Document doc = Jsoup.parse(OkHttp.string(String.format("%s/index.php/vodshow/%s.html", siteUrl, String.join("-", urlParams)), getHeader()));
        int page = Integer.parseInt(pg), limit = 72, total = 0;
        Matcher matcher = regexPageTotal.matcher(doc.html());
        if (matcher.find()) total = Integer.parseInt(matcher.group(1));
        int count = total <= limit ? 1 : ((int) Math.ceil(total / (double) limit));
        return Result.get().vod(parseVodListFromDoc(doc)).page(page, count, limit, total).string();
    }

    private List<Vod> parseVodListFromDoc(Document doc) {
        List<Vod> list = new ArrayList<>();
        Elements elements = doc.select(".module-item");
        for (Element e : elements) {
            String vodId = e.selectFirst(".video-name a").attr("href");
            String vodPic = e.selectFirst(".module-item-pic > img").attr("data-src");
            String vodName = e.selectFirst(".video-name").text();
            String vodRemarks = e.selectFirst(".module-item-text").text();
            list.add(new Vod(vodId, vodName, vodPic, vodRemarks));
        }
        return list;
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        String vodId = ids.get(0);
        Document doc = Jsoup.parse(OkHttp.string(siteUrl + vodId, getHeader()));

        Vod item = new Vod();
        item.setVodId(vodId);
        item.setVodName(doc.selectFirst(".video-info-header > .page-title").text());
        item.setVodPic(doc.selectFirst(".module-item-pic img").attr("data-src"));
        item.setVodArea(doc.select(".video-info-header a.tag-link").last().text());
        item.setTypeName(String.join(",", doc.select(".video-info-header div.tag-link a").eachText()));

        List<String> shareLinks = doc.select(".module-row-text").eachAttr("data-clipboard-text");
        for (int i = 0; i < shareLinks.size(); i++) shareLinks.set(i, shareLinks.get(i).trim());

        item.setVodPlayFrom(detailContentVodPlayFrom(shareLinks));
        item.setVodPlayUrl(detailContentVodPlayUrl(shareLinks));

        Elements elements = doc.select(".video-info-item");
        for (Element e : elements) {
            String title = e.previousElementSibling().text();
            if (title.contains("导演")) {
                item.setVodDirector(String.join(",", e.select("a").eachText()));
            } else if (title.contains("主演")) {
                item.setVodActor(String.join(",", e.select("a").eachText()));
            } else if (title.contains("年代")) {
                item.setVodYear(e.selectFirst("a").text().trim());
            } else if (title.contains("备注")) {
                item.setVodRemarks(e.text().trim());
            } else if (title.contains("剧情")) {
                item.setVodContent(e.selectFirst(".sqjj_a").text().replace("[收起部分]", "").trim());
            }
        }

        return Result.string(item);
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        return searchContent(key, "1");
    }

    @Override
    public String searchContent(String key, boolean quick, String pg) throws Exception {
        return searchContent(key, pg);
    }

    private String searchContent(String key, String pg) {
        String searchURL = siteUrl + String.format("/index.php/vodsearch/%s----------%s---.html", URLEncoder.encode(key), pg);
        String html = OkHttp.string(searchURL, getHeader());
        Elements items = Jsoup.parse(html).select(".module-search-item");
        List<Vod> list = new ArrayList<>();
        for (Element item : items) {
            String vodId = item.select(".video-serial").attr("href");
            String name = item.select(".video-serial").attr("title");
            String pic = item.select(".module-item-pic > img").attr("data-src");
            String remark = item.select(".video-tag-icon").text();
            list.add(new Vod(vodId, name, pic, remark));
        }
        return Result.string(list);
    }
}