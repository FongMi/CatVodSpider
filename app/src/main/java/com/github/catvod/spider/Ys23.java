package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Util;
import com.github.catvod.bean.Class;
import com.github.catvod.bean.Vod;
import com.github.catvod.bean.Result;

import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.URLEncoder;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ys23 extends Spider {

    private String siteURL = "http://tv.ersanyun.cn";

    private Map<String, String> getHeader() {
        Map<String, String> header = new HashMap<>();
        header.put("User-Agent", Util.CHROME);
        header.put("Referer", siteURL + "/");
        return header;
    }

    @Override
    public void init(Context context, String extend) throws Exception {
        if (!extend.isEmpty())  siteURL = extend;
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        List<Class> classes = new ArrayList<>();
        List<String> typeIds = Arrays.asList("1", "2", "3", "4", "48", "49");
        List<String> typeNames = Arrays.asList("电影", "电视剧", "综艺", "动漫", "热门短剧", "体育赛事");
        for (int i = 0; i < typeIds.size(); i++) {
            classes.add(new Class(typeIds.get(i), typeNames.get(i)));
        }
        String f = "{\"1\": [{\"key\": \"class\", \"name\": \"剧情\", \"value\": [{\"n\": \"全部\", \"v\": \"\"}, {\"n\": \"动作片\", \"v\": \"cate_id=9&\"}, {\"n\": \"喜剧片\", \"v\": \"cate_id=10&\"}, {\"n\": \"爱情片\", \"v\": \"cate_id=11&\"}, {\"n\": \"恐怖片\", \"v\": \"cate_id=12&\"}, {\"n\": \"剧情片\", \"v\": \"cate_id=13&\"}, {\"n\": \"科幻片\", \"v\": \"cate_id=14&\"}, {\"n\": \"动画片\", \"v\": \"cate_id=17&\"}]}], \"2\": [{\"key\": \"class\", \"name\": \"剧情\", \"value\": [{\"n\": \"全部\", \"v\": \"\"}, {\"n\": \"国产剧\", \"v\": \"cate_id=22&\"}, {\"n\": \"香港剧\", \"v\": \"cate_id=23&\"}, {\"n\": \"台湾剧\", \"v\": \"cate_id=24&\"}, {\"n\": \"欧美剧\", \"v\": \"cate_id=25&\"}, {\"n\": \"日本剧\", \"v\": \"cate_id=26&\"}, {\"n\": \"韩国剧\", \"v\": \"cate_id=27&\"}, {\"n\": \"海外剧\", \"v\": \"cate_id=29&\"}]}]}";        JSONObject filterConfig = new JSONObject(f);
        Document doc = Jsoup.parse(OkHttp.string(siteURL, getHeader()));
        ArrayList<Vod> list = new ArrayList<Vod>();
        for (Element li : doc.select(".video-card-wrap")) {
            String vid = siteURL + li.select("a").attr("href");
            String name = li.select("a").attr("title");
            String pic = li.select("a img").attr("data-src");
            if (!pic.startsWith("http"))
                pic = siteURL + pic;
            list.add(new Vod(vid, name, pic));
        }
        return Result.string(classes, list, filterConfig);
    }


    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        String classType = extend.get("class") == null ? "" : extend.get("class");
        String cateId = extend.get("cateId") == null ? tid : extend.get("cateId");
        String cateURL = siteURL
                + String.format("/vod/index.html?%spage=%s&type_id=%s", classType, pg, cateId);
        System.out.println(cateURL);
        Document doc = Jsoup.parse(OkHttp.string(cateURL, getHeader()));
        List<Vod> list = new ArrayList<>();
        for (Element li : doc.select(".card.vertical")) {
            String vid = siteURL + li.attr("href");
            String name = li.attr("title");
            String pic = li.select("img").attr("data-src");
            if (!pic.startsWith("http"))
                pic = siteURL + pic;
            list.add(new Vod(vid, name, pic));
        }
        return Result.string(list);
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        Document doc = Jsoup.parse(OkHttp.string(ids.get(0), getHeader()));
        Elements sources = doc.select(".playlist-rect__container");
        Elements circuits = doc.select(".playlist-top__title.cms-playlist-name");
        StringBuilder vod_play_url = new StringBuilder();
        StringBuilder vod_play_from = new StringBuilder();
        for (int i = 0; i < sources.size(); i++) {
            String spanText = circuits.get(i).text();
            vod_play_from.append(spanText).append("$$$");
            Elements aElementArray = sources.get(i).select(".playlist-rect__col a");
            for (int j = 0; j < aElementArray.size(); j++) {
                Element a = aElementArray.get(j);
                String href = siteURL + a.attr("href");
                String text = a.text();
                vod_play_url.append(text).append("$").append(href);
                boolean notLastEpisode = j < aElementArray.size() - 1;
                vod_play_url.append(notLastEpisode ? "#" : "$$$");
            }
        }
        String name = doc.select(".playlist-intro__title").text();
        String description = doc.select(".playlist-top__update-info").text();
        Vod vod = new Vod();
        vod.setVodId(ids.get(0));
        vod.setVodName(name);
        vod.setVodContent(description);
        vod.setVodPlayFrom(vod_play_from.toString());
        vod.setVodPlayUrl(vod_play_url.toString());
        return Result.string(vod);
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        String searchURL = siteURL + "/search/index.html?keyword=" + URLEncoder.encode(key);;
        Document doc = Jsoup.parse(OkHttp.string(searchURL, getHeader()));
        List<Vod> list = new ArrayList<>();
        for (Element li : doc.select(".list_item")) {
            String vid = siteURL + li.select("strong a").attr("href");
            String name = li.select("strong a").attr("title");
            String pic = li.select(".figure_pic.lazy1").attr("src");
            if (!pic.startsWith("http"))
                pic = siteURL + pic;
            String remark = li.select(".figure_info").text();
            list.add(new Vod(vid, name, pic, remark));
        }
        return Result.string(list);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        String html = OkHttp.string(id, getHeader());
        Matcher matcher = Pattern.compile("var temCurVodFile = \"(.*?)\";").matcher(html);
        String realUrl = matcher.find() ? matcher.group(1) : "";
        return Result.get().url(realUrl).header(getHeader()).string();
    }
}