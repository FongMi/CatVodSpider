package com.github.catvod.spider;

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
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Qile
 */
public class FirstAid extends Spider {

    private final String siteUrl = "https://m.youlai.cn";

    private Map<String, String> getHeader() {
        Map<String, String> header = new HashMap<>();
        header.put("User-Agent", Util.CHROME);
        return header;
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        List<Class> classes = new ArrayList<>();
        List<String> typeIds = Arrays.asList("jijiu|0", "jijiu|1", "jijiu|2", "jijiu|3", "jijiu|4", "jijiu|5", "jijiu|6", "jijiu|7");
        List<String> typeNames = Arrays.asList("急救技能", "家庭生活", "急危重症", "常见损伤", "动物致伤", "海洋急救", "中毒急救", "意外事故");
        for (int i = 0; i < typeIds.size(); i++) classes.add(new Class(typeIds.get(i), typeNames.get(i)));
        return Result.string(classes, Collections.emptyList());
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        String[] item = tid.split("\\|");
        String id = item[0];
        String digit = item[1];
        int digitValue = Integer.parseInt(digit);
        String cateId = extend.get("cateId") == null ? id : extend.get("cateId");
        Document doc = Jsoup.parse(OkHttp.string(siteUrl + String.format("/%s", cateId), getHeader()));
        String pic = "https:" + doc.select(".block100").eq(digitValue).attr("src");
        Elements lis = doc.select(".jj-title-li").eq(digitValue).select(".list-br3");
        List<Vod> list = new ArrayList<>();
        for (Element li : lis) {
            String vid = siteUrl + li.select("a").attr("href");
            String name = li.select("a").text();
            list.add(new Vod(vid, name, pic));
        }
        return Result.get().page(1, 1, 0, lis.size()).vod(list).string();
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        Document doc = Jsoup.parse(OkHttp.string(ids.get(0), getHeader()));
        String title = doc.select(".video-title.h1-title").text();
        String pic = doc.select(".video-cover.list-flex-in img").attr("src");
        String actor = doc.select("span.doc-name").text();
        String area = "中国";
        String brief = doc.select(".img-text-con").text();
        String play_url = doc.select("#video source").attr("src");
        if (play_url.isEmpty()) play_url = doc.select("#video").attr("src");
        String vod_play_url = title + "$" + play_url;
        Vod vod = new Vod();
        vod.setVodId(ids.get(0));
        vod.setVodPic(pic);
        vod.setVodName(title);
        vod.setVodActor(actor);
        vod.setVodArea(area);
        vod.setVodContent(brief);
        vod.setVodPlayFrom("Qile");
        vod.setVodPlayUrl(vod_play_url);
        return Result.string(vod);
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        String searchUrl = siteUrl + "/cse/search?q=" + URLEncoder.encode(key);
        Elements lis = Jsoup.parse(OkHttp.string(searchUrl, getHeader())).select(".search-video-li.list-br2");
        List<Vod> list = new ArrayList<>();
        for (Element li : lis) {
            String vid = siteUrl + li.select("a").attr("href");
            String name = li.select("h5.line-clamp1").text();
            String pic = li.select("dt.logo-bg img").attr("src");
            if (!pic.startsWith("https")) pic = "https:" + pic;
            list.add(new Vod(vid, name, pic));
        }
        return Result.string(list);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        return Result.get().url(id).header(getHeader()).string();
    }
}
