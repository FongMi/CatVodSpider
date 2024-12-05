package com.github.catvod.spider;

import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zhixc
 * 迅雷电影天堂
 */
public class Xl720 extends Spider {
    private final String siteUrl = "https://www.xl720.com";
    private final Pattern NAME_PATTERN = Pattern.compile("《(.*?)》");

    private Map<String, String> getHeader() {
        Map<String, String> header = new HashMap<>();
        header.put("User-Agent", Util.CHROME);
        return header;
    }

    private Map<String, String> getHeader(String referer) {
        Map<String, String> header = new HashMap<>();
        header.put("User-Agent", Util.CHROME);
        header.put("Referer", referer);
        return header;
    }

    private String getStrByRegex(Pattern pattern, String html) {
        Matcher matcher = pattern.matcher(html);
        return matcher.find() ? matcher.group(1).trim() : "";
    }

    private int parseLastPageNumber(String html) {
        try {
            Element last = Jsoup.parse(html).select(".wp-pagenavi > a.last").last();
            int lastPageNum = Integer.parseInt(last.attr("href").split("/page/")[1]);
            return lastPageNum;
        } catch (Exception ignored) {
            return 1;
        }
    }

    private List<Vod> parseVodListFromDoc(String html) {
        List<Vod> videos = new ArrayList<>();
        Elements items = Jsoup.parse(html).select("[class=post-grid clearfix] > [class=post clearfix]");
        for (Element item : items) {
            String vodId = item.select(".entry-title > a").attr("href");
            String name = getName(item);
            String pic = item.select("img").attr("src");
            String remark = getRemark(item);
            videos.add(new Vod(vodId, name, pic, remark));
        }
        return videos;
    }

    private String getName(Element item) {
        String title = item.select(".entry-title > a").attr("title");
        String s = getStrByRegex(NAME_PATTERN, title);
        return "".equals(s) ? title : s;
    }

    private String getRemark(Element item) {
        try {
            String remark = item.select(".entry-title > a").attr("title").split("》")[1];
            return remark;
        } catch (Exception e) {
            return "";
        }
    }

    private String getActor(String html) {
        String actor = getStrByRegex(Pattern.compile("演　　员　(.*?)<p>"), html);
        if ("".equals(actor)) actor = getStrByRegex(Pattern.compile("主　　演　(.*?)\n<p>"), html);
        return removeHtmlTag(actor);
    }

    private String removeHtmlTag(String str) {
        return str.replaceAll("</?[^>]+>", "");
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        String html = OkHttp.string(siteUrl, getHeader());
        Document doc = Jsoup.parse(html);
        Elements aList = doc.select(".sf-menu > li > a");
        List<Class> classes = new ArrayList<>();
        for (int i = 1; i < aList.size(); i++) {
            Element a = aList.get(i);
            String typeId = a.attr("href").split("/category/")[1];
            String typeName = a.text();
            classes.add(new Class(typeId, typeName));
        }
        Elements elements = doc.select("[class=slider clearfix] > ul > li");
        List<Vod> videos = new ArrayList<>();
        for (Element element : elements) {
            Element a = element.selectFirst("a");
            String vodId = a.attr("href");
            String name = a.select(".cap").text();
            String pic = a.select("img").attr("src");
            String remark = element.select(".entry-rating").text();
            videos.add(new Vod(vodId, name, pic, remark));
        }
        return Result.string(classes, videos);
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        String cateUrl = siteUrl + "/category/" + tid;
        if (!pg.equals("1")) cateUrl += "/page/" + pg;
        String html = OkHttp.string(cateUrl, getHeader(siteUrl + "/"));
        List<Vod> videos = parseVodListFromDoc(html);
        int page = Integer.parseInt(pg), count = parseLastPageNumber(html), limit = videos.size(), total = Integer.MAX_VALUE;
        return Result.get().vod(videos).page(page, count, limit, total).string();
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        String detailUrl = ids.get(0);
        String html = OkHttp.string(detailUrl, getHeader());
        Document doc = Jsoup.parse(html);
        Map<String, String> playMap = new LinkedHashMap<>();
        List<String> vodItems = new ArrayList<>();
        for (Element a : doc.select("#play_list > a")) {
            String episodeUrl = a.attr("href").split("path=")[1].replaceAll("ftp", "tvbox-xg:ftp");
            String episodeTitle = a.text();
            vodItems.add(episodeTitle + "$" + episodeUrl);
        }
        if (vodItems.size() > 0) playMap.put("荐片", TextUtils.join("#", vodItems));
        vodItems = new ArrayList<>();
        for (Element a : doc.select("#zdownload > .download-link > a")) {
            String episodeUrl = a.attr("href");
            String episodeTitle = a.text().replaceAll(".torrent", "");
            vodItems.add(episodeTitle + "$" + episodeUrl);
        }
        if (vodItems.size() > 0) playMap.put("磁力", TextUtils.join("#", vodItems));

        String partHTML = doc.select("#info").html();
        String name = getStrByRegex(Pattern.compile("片　　名　(.*?)<br"), partHTML);
        String pic = doc.select("#mainpic > img").attr("src");
        String typeName = getStrByRegex(Pattern.compile("类　　别　(.*?)<br"), partHTML);
        String year = removeHtmlTag(getStrByRegex(Pattern.compile("年　　代　(.*?)<br"), partHTML));
        String area = removeHtmlTag(getStrByRegex(Pattern.compile("产　　地　(.*?)<br"), partHTML));
        String remark = "上映日期：" + getStrByRegex(Pattern.compile("上映日期　(.*?)<br"), partHTML);
        String actor = getActor(partHTML);
        String director = removeHtmlTag(getStrByRegex(Pattern.compile("导　　演　(.*?)\n<br"), partHTML));
        String description = doc.select("#link-report").text().replaceAll("　　", "");

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
        String searchUrl = siteUrl + "/?s=" + URLEncoder.encode(key);
        String html = "";
        if ("1".equals(pg)) {
            html = OkHttp.string(searchUrl, getHeader(siteUrl + "/"));
        } else {
            searchUrl = siteUrl + "/page/2?s=" + URLEncoder.encode(key);
            html = OkHttp.string(searchUrl, getHeader(siteUrl + "/"));
        }
        List<Vod> videos = parseVodListFromDoc(html);
        return Result.string(videos);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        return Result.get().url(id).string();
    }
}
