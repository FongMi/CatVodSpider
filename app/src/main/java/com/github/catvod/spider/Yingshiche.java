package com.github.catvod.spider;

import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Util;

import org.json.JSONObject;
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

/**
 * @author Qile
 */
public class Yingshiche extends Ali {

    private final String siteUrl = "https://www.weixine.link";

    private Map<String, String> getHeader() {
        Map<String, String> header = new HashMap<>();
        header.put("User-Agent", Util.CHROME);
        return header;
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        List<Class> classes = new ArrayList<>();
        List<String> typeIds = Arrays.asList("2", "1", "4", "3", "5", "6");
        List<String> typeNames = Arrays.asList("电视剧", "电影", "综艺", "动漫", "短剧", "音乐");
        for (int i = 0; i < typeIds.size(); i++) classes.add(new Class(typeIds.get(i), typeNames.get(i)));
        String f = "{\"1\": [{\"key\": \"class\", \"name\": \"剧情\", \"value\": [{\"n\": \"全部\", \"v\": \"\"}, {\"n\": \"喜剧\", \"v\": \"喜剧\"}, {\"n\": \"爱情\", \"v\": \"爱情\"}, {\"n\": \"恐怖\", \"v\": \"恐怖\"}, {\"n\": \"动作\", \"v\": \"动作\"}, {\"n\": \"科幻\", \"v\": \"科幻\"}, {\"n\": \"剧情\", \"v\": \"剧情\"}, {\"n\": \"战争\", \"v\": \"战争\"}, {\"n\": \"警匪\", \"v\": \"警匪\"}, {\"n\": \"犯罪\", \"v\": \"犯罪\"},  {\"n\": \"动画\", \"v\": \"动画\"}, {\"n\": \"奇幻\", \"v\": \"奇幻\"}, {\"n\": \"武侠\", \"v\": \"武侠\"}, {\"n\": \"冒险\", \"v\": \"冒险\"}, {\"n\": \"枪战\", \"v\": \"枪战\"}, {\"n\": \"悬疑\", \"v\": \"悬疑\"}, {\"n\": \"惊悚\", \"v\": \"惊悚\"}, {\"n\": \"经典\", \"v\": \"经典\"}]}, {\"key\": \"area\", \"name\": \"地区\", \"value\": [{\"n\": \"全部\", \"v\": \"\"}, {\"n\": \"大陆\", \"v\": \"大陆\"}, {\"n\": \"香港\", \"v\": \"香港\"}, {\"n\": \"台湾\", \"v\": \"台湾\"}, {\"n\": \"美国\", \"v\": \"美国\"}, {\"n\": \"法国\", \"v\": \"法国\"}, {\"n\": \"英国\", \"v\": \"英国\"}, {\"n\": \"日本\", \"v\": \"日本\"}, {\"n\": \"韩国\", \"v\": \"韩国\"}, {\"n\": \"德国\", \"v\": \"德国\"}, {\"n\": \"泰国\", \"v\": \"泰国\"}, {\"n\": \"印度\", \"v\": \"印度\"}, {\"n\": \"意大利\", \"v\": \"意大利\"}, {\"n\": \"西班牙\", \"v\": \"西班牙\"}, {\"n\": \"加拿大\", \"v\": \"加拿大\"}, {\"n\": \"其他\", \"v\": \"其他\"}]}, {\"key\": \"year\", \"name\": \"年份\", \"value\": [{\"n\": \"全部\", \"v\": \"\"}, {\"n\": \"2023\", \"v\": \"2023\"}, {\"n\": \"2022\", \"v\": \"2022\"}, {\"n\": \"2021\", \"v\": \"2021\"}, {\"n\": \"2020\", \"v\": \"2020\"}, {\"n\": \"2019\", \"v\": \"2019\"}, {\"n\": \"2018\", \"v\": \"2018\"}, {\"n\": \"2017\", \"v\": \"2017\"}, {\"n\": \"2016\", \"v\": \"2016\"}, {\"n\": \"2015\", \"v\": \"2015\"}, {\"n\": \"2014\", \"v\": \"2014\"}, {\"n\": \"2013\", \"v\": \"2013\"}, {\"n\": \"2012\", \"v\": \"2012\"}, {\"n\": \"2011\", \"v\": \"2011\"}, {\"n\": \"2010\", \"v\": \"2010\"}]}, {\"key\": \"by\", \"name\": \"排序\", \"value\": [{\"n\": \"时间\", \"v\": \"time\"}, {\"n\": \"人气\", \"v\": \"hits\"}, {\"n\": \"评分\", \"v\": \"score\"}]}],\"2\": [{\"key\": \"class\", \"name\": \"剧情\", \"value\": [{\"n\": \"全部\", \"v\": \"\"}, {\"n\": \"喜剧\", \"v\": \"喜剧\"}, {\"n\": \"爱情\", \"v\": \"爱情\"}, {\"n\": \"恐怖\", \"v\": \"恐怖\"}, {\"n\": \"动作\", \"v\": \"动作\"}, {\"n\": \"科幻\", \"v\": \"科幻\"}, {\"n\": \"剧情\", \"v\": \"剧情\"}, {\"n\": \"战争\", \"v\": \"战争\"}, {\"n\": \"警匪\", \"v\": \"警匪\"}, {\"n\": \"犯罪\", \"v\": \"犯罪\"},  {\"n\": \"动画\", \"v\": \"动画\"}, {\"n\": \"奇幻\", \"v\": \"奇幻\"}, {\"n\": \"武侠\", \"v\": \"武侠\"}, {\"n\": \"冒险\", \"v\": \"冒险\"}, {\"n\": \"枪战\", \"v\": \"枪战\"}, {\"n\": \"悬疑\", \"v\": \"悬疑\"}, {\"n\": \"惊悚\", \"v\": \"惊悚\"}, {\"n\": \"经典\", \"v\": \"经典\"}]}, {\"key\": \"area\", \"name\": \"地区\", \"value\": [{\"n\": \"全部\", \"v\": \"\"}, {\"n\": \"大陆\", \"v\": \"大陆\"}, {\"n\": \"香港\", \"v\": \"香港\"}, {\"n\": \"台湾\", \"v\": \"台湾\"}, {\"n\": \"美国\", \"v\": \"美国\"}, {\"n\": \"法国\", \"v\": \"法国\"}, {\"n\": \"英国\", \"v\": \"英国\"}, {\"n\": \"日本\", \"v\": \"日本\"}, {\"n\": \"韩国\", \"v\": \"韩国\"}, {\"n\": \"德国\", \"v\": \"德国\"}, {\"n\": \"泰国\", \"v\": \"泰国\"}, {\"n\": \"印度\", \"v\": \"印度\"}, {\"n\": \"意大利\", \"v\": \"意大利\"}, {\"n\": \"西班牙\", \"v\": \"西班牙\"}, {\"n\": \"加拿大\", \"v\": \"加拿大\"}, {\"n\": \"其他\", \"v\": \"其他\"}]}, {\"key\": \"year\", \"name\": \"年份\", \"value\": [{\"n\": \"全部\", \"v\": \"\"}, {\"n\": \"2023\", \"v\": \"2023\"}, {\"n\": \"2022\", \"v\": \"2022\"}, {\"n\": \"2021\", \"v\": \"2021\"}, {\"n\": \"2020\", \"v\": \"2020\"}, {\"n\": \"2019\", \"v\": \"2019\"}, {\"n\": \"2018\", \"v\": \"2018\"}, {\"n\": \"2017\", \"v\": \"2017\"}, {\"n\": \"2016\", \"v\": \"2016\"}, {\"n\": \"2015\", \"v\": \"2015\"}, {\"n\": \"2014\", \"v\": \"2014\"}, {\"n\": \"2013\", \"v\": \"2013\"}, {\"n\": \"2012\", \"v\": \"2012\"}, {\"n\": \"2011\", \"v\": \"2011\"}, {\"n\": \"2010\", \"v\": \"2010\"}]}, {\"key\": \"by\", \"name\": \"排序\", \"value\": [{\"n\": \"时间\", \"v\": \"time\"}, {\"n\": \"人气\", \"v\": \"hits\"}, {\"n\": \"评分\", \"v\": \"score\"}]}],\"3\": [{\"key\": \"class\", \"name\": \"剧情\", \"value\": [{\"n\": \"全部\", \"v\": \"\"}, {\"n\": \"情感\", \"v\": \"情感\"}, {\"n\": \"科幻\", \"v\": \"科幻\"}, {\"n\": \"热血\", \"v\": \"热血\"}, {\"n\": \"推理\", \"v\": \"推理\"}, {\"n\": \"搞笑\", \"v\": \"搞笑\"}, {\"n\": \"冒险\", \"v\": \"冒险\"}, {\"n\": \"萝莉\", \"v\": \"萝莉\"}, {\"n\": \"校园\", \"v\": \"校园\"}, {\"n\": \"动作\", \"v\": \"动作\"},  {\"n\": \"机战\", \"v\": \"机战\"}, {\"n\": \"运动\", \"v\": \"运动\"}, {\"n\": \"战争\", \"v\": \"战争\"}, {\"n\": \"少年\", \"v\": \"少年\"}, {\"n\": \"少女\", \"v\": \"少女\"}, {\"n\": \"社会\", \"v\": \"社会\"}, {\"n\": \"原创\", \"v\": \"原创\"}, {\"n\": \"亲子\", \"v\": \"亲子\"}]}, {\"key\": \"area\", \"name\": \"地区\", \"value\": [{\"n\": \"全部\", \"v\": \"\"}, {\"n\": \"大陆\", \"v\": \"大陆\"}, {\"n\": \"日本\", \"v\": \"日本\"}, {\"n\": \"欧美\", \"v\": \"欧美\"}, {\"n\": \"其他\", \"v\": \"其他\"}]}, {\"key\": \"year\", \"name\": \"年份\", \"value\": [{\"n\": \"全部\", \"v\": \"\"}, {\"n\": \"2023\", \"v\": \"2023\"}, {\"n\": \"2022\", \"v\": \"2022\"}, {\"n\": \"2021\", \"v\": \"2021\"}, {\"n\": \"2020\", \"v\": \"2020\"}, {\"n\": \"2019\", \"v\": \"2019\"}, {\"n\": \"2018\", \"v\": \"2018\"}, {\"n\": \"2017\", \"v\": \"2017\"}, {\"n\": \"2016\", \"v\": \"2016\"}, {\"n\": \"2015\", \"v\": \"2015\"}, {\"n\": \"2014\", \"v\": \"2014\"}, {\"n\": \"2013\", \"v\": \"2013\"}, {\"n\": \"2012\", \"v\": \"2012\"}, {\"n\": \"2011\", \"v\": \"2011\"}, {\"n\": \"2010\", \"v\": \"2010\"}, {\"n\": \"2009\", \"v\": \"2009\"}, {\"n\": \"2008\", \"v\": \"2008\"}, {\"n\": \"2007\", \"v\": \"2007\"}, {\"n\": \"2006\", \"v\": \"2006\"}, {\"n\": \"2005\", \"v\": \"2005\"}, {\"n\": \"2004\", \"v\": \"2004\"}]}, {\"key\": \"by\", \"name\": \"排序\", \"value\": [{\"n\": \"时间\", \"v\": \"time\"}, {\"n\": \"人气\", \"v\": \"hits\"}, {\"n\": \"评分\", \"v\": \"score\"}]}], \"4\": [{\"key\": \"area\", \"name\": \"地区\", \"value\": [{\"n\": \"全部\", \"v\": \"\"}, {\"n\": \"大陆\", \"v\": \"大陆\"}, {\"n\": \"香港\", \"v\": \"香港\"}, {\"n\": \"台湾\", \"v\": \"台湾\"}, {\"n\": \"美国\", \"v\": \"美国\"}, {\"n\": \"法国\", \"v\": \"法国\"}, {\"n\": \"英国\", \"v\": \"英国\"}, {\"n\": \"日本\", \"v\": \"日本\"}, {\"n\": \"韩国\", \"v\": \"韩国\"}]}, {\"key\": \"year\", \"name\": \"年份\", \"value\": [{\"n\": \"全部\", \"v\": \"\"}, {\"n\": \"2023\", \"v\": \"2023\"}, {\"n\": \"2022\", \"v\": \"2022\"}, {\"n\": \"2021\", \"v\": \"2021\"}, {\"n\": \"2020\", \"v\": \"2020\"}, {\"n\": \"2019\", \"v\": \"2019\"}, {\"n\": \"2018\", \"v\": \"2018\"}, {\"n\": \"2017\", \"v\": \"2017\"}, {\"n\": \"2016\", \"v\": \"2016\"}, {\"n\": \"2015\", \"v\": \"2015\"}, {\"n\": \"2014\", \"v\": \"2014\"}, {\"n\": \"2013\", \"v\": \"2013\"}, {\"n\": \"2012\", \"v\": \"2012\"}, {\"n\": \"2011\", \"v\": \"2011\"}, {\"n\": \"2010\", \"v\": \"2010\"}, {\"n\": \"2009\", \"v\": \"2009\"}, {\"n\": \"2008\", \"v\": \"2008\"}, {\"n\": \"2007\", \"v\": \"2007\"}, {\"n\": \"2006\", \"v\": \"2006\"}, {\"n\": \"2005\", \"v\": \"2005\"}, {\"n\": \"2004\", \"v\": \"2004\"}]}, {\"key\": \"by\", \"name\": \"排序\", \"value\": [{\"n\": \"时间\", \"v\": \"time\"}, {\"n\": \"人气\", \"v\": \"hits\"}, {\"n\": \"评分\", \"v\": \"score\"}]}], \"6\": [{\"key\": \"class\", \"name\": \"剧情\", \"value\": [{\"n\": \"全部\", \"v\": \"\"}, {\"n\": \"古装\", \"v\": \"古装\"}, {\"n\": \"战争\", \"v\": \"战争\"}, {\"n\": \"青春偶像\", \"v\": \"青春偶像\"}, {\"n\": \"喜剧\", \"v\": \"喜剧\"}, {\"n\": \"家庭\", \"v\": \"家庭\"}, {\"n\": \"犯罪\", \"v\": \"犯罪\"}, {\"n\": \"动作\", \"v\": \"动作\"}, {\"n\": \"奇幻\", \"v\": \"奇幻\"}, {\"n\": \"剧情\", \"v\": \"剧情\"},  {\"n\": \"历史\", \"v\": \"历史\"}, {\"n\": \"经典\", \"v\": \"经典\"}, {\"n\": \"乡村\", \"v\": \"乡村\"}, {\"n\": \"情景\", \"v\": \"情景\"}, {\"n\": \"商战\", \"v\": \"商战\"}, {\"n\": \"网剧\", \"v\": \"网剧\"}, {\"n\": \"其他\", \"v\": \"其他\"}]}, {\"key\": \"area\", \"name\": \"地区\", \"value\": [{\"n\": \"全部\", \"v\": \"\"}, {\"n\": \"内地\", \"v\": \"内地\"}]}, {\"key\": \"year\", \"name\": \"年份\", \"value\": [{\"n\": \"全部\", \"v\": \"\"}, {\"n\": \"2023\", \"v\": \"2023\"}, {\"n\": \"2022\", \"v\": \"2022\"}, {\"n\": \"2021\", \"v\": \"2021\"}, {\"n\": \"2020\", \"v\": \"2020\"}, {\"n\": \"2019\", \"v\": \"2019\"}, {\"n\": \"2018\", \"v\": \"2018\"}, {\"n\": \"2017\", \"v\": \"2017\"}, {\"n\": \"2016\", \"v\": \"2016\"}, {\"n\": \"2015\", \"v\": \"2015\"}, {\"n\": \"2014\", \"v\": \"2014\"}, {\"n\": \"2013\", \"v\": \"2013\"}, {\"n\": \"2012\", \"v\": \"2012\"}, {\"n\": \"2011\", \"v\": \"2011\"}, {\"n\": \"2010\", \"v\": \"2010\"}]}, {\"key\": \"by\", \"name\": \"排序\", \"value\": [{\"n\": \"时间\", \"v\": \"time\"}, {\"n\": \"人气\", \"v\": \"hits\"}, {\"n\": \"评分\", \"v\": \"score\"}]}]}";
        JSONObject filterConfig = new JSONObject(f);
        Document doc = Jsoup.parse(OkHttp.string(siteUrl, getHeader()));
        List<Vod> list = new ArrayList<>();
        for (Element li : doc.select(".module-items .module-item")) {
            String vid = li.select("a").attr("href");
            String name = li.select("a").attr("title");
            String pic = li.select("img").attr("data-src");
            String remark = li.select("[class=module-item-text]").text();
            list.add(new Vod(vid, name, pic, remark));
        }
        return Result.string(classes, list, filterConfig);
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        String cateId = extend.get("cateId") == null ? tid : extend.get("cateId");
        String area = extend.get("area") == null ? "" : extend.get("area");
        String year = extend.get("year") == null ? "" : extend.get("year");
        String by = extend.get("by") == null ? "" : extend.get("by");
        String classType = extend.get("class") == null ? "" : extend.get("class");
        String cateUrl = String.format(siteUrl + "/vodshow/%s-%s-%s-%s-----%s---%s.html", cateId, area, by, classType, pg, year);
        Document doc = Jsoup.parse(OkHttp.string(cateUrl, getHeader()));
        List<Vod> list = new ArrayList<>();
        for (Element li : doc.select(".module-items .module-item")) {
            String vid = li.select("a").attr("href");
            String name = li.select("a").attr("title");
            String pic = li.select("img").attr("data-src");
            String remark = li.select("[class=module-item-text]").text();
            list.add(new Vod(vid, name, pic, remark));
        }
        return Result.string(list);
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        Document doc = Jsoup.parse(OkHttp.string(siteUrl + ids.get(0), getHeader()));
        Map<String, String> vod_play = new LinkedHashMap<>();
        List<String> shareLinks = doc.select(".module-row-text").eachAttr("data-clipboard-text");
        for (int i = 0; i < shareLinks.size(); i++) shareLinks.set(i, shareLinks.get(i).trim());
        for (String link : shareLinks) {
            if (link.contains("alipan.com") || link.contains("aliyundrive.com")) {
                vod_play.put(detailContentVodPlayFrom(Arrays.asList(link)), detailContentVodPlayUrl(Arrays.asList(link)));
            }
        }
        String title = doc.selectFirst(".video-info-header > .page-title").text();
        String pic = doc.selectFirst(".module-item-pic img").attr("data-src");
        String area = doc.select(".video-info-header a.tag-link").last().text();
        String classifyName = String.join(",", doc.select(".video-info-header div.tag-link a").eachText());
        String brief = doc.select("p.sqjj_a").text();
        String director = getVideoInfo(doc, "导演");
        String actor = getVideoInfo(doc, "主演");
        String year = getVideoInfo(doc, "年代");
        String remark = getVideoInfo(doc, "备注");

        Vod vod = new Vod();
        vod.setVodId(ids.get(0));
        vod.setVodPic(pic);
        vod.setVodYear(year);
        vod.setVodName(title);
        vod.setVodArea(area);
        vod.setVodActor(actor);
        vod.setVodRemarks(remark);
        vod.setVodContent(brief);
        vod.setVodDirector(director);
        vod.setTypeName(classifyName);
        vod.setVodPlayFrom(TextUtils.join("$$$", vod_play.keySet()));
        vod.setVodPlayUrl(TextUtils.join("$$$", vod_play.values()));
        return Result.string(vod);
    }

    private String getVideoInfo(Document doc, String keyword) {
        Elements elements = doc.select(".video-info-item");
        for (Element e : elements) {
            String titles = e.previousElementSibling().text();
            if (titles.contains(keyword)) {
                return String.join(",", e.select("a").eachText());
            }
        }
        return "";
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
        String searchURL = siteUrl + String.format("/vodsearch/%s----------%s---.html", URLEncoder.encode(key), pg);
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
