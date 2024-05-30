package com.github.catvod.spider;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Doll extends Spider {

    private final String url = "https://hongkongdollvideo.com/";

    @Override
    public String homeContent(boolean filter) throws Exception {
        List<Class> classes = new ArrayList<>();
        List<Vod> list = new ArrayList<>();
        Document doc = Jsoup.parse(OkHttp.string(url));
        for (Element a : doc.select("ul.menu").get(0).select("li > a")) {
            String typeName = a.text();
            String typeId = a.attr("href");
            if (typeId.contains(url)) classes.add(new Class(typeId.replace(url, ""), typeName));
        }
        for (Element div : doc.select("div.video-item")) {
            String id = div.select("a.video-title").attr("href").replace(url, "");
            String name = div.select("a.video-title").text();
            String pic = div.select("div.thumb > a > img").attr("data-src");
            String remark = div.select("div.date").text();
            list.add(new Vod(id, name, pic, remark));
        }
        return Result.string(classes, list);
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        List<Vod> list = new ArrayList<>();
        String target = pg.equals("1") ? url + tid : url + tid + "/" + pg + ".html";
        Document doc = Jsoup.parse(OkHttp.string(target));
        for (Element div : doc.select("div.video-item")) {
            String id = div.select("a.video-title").attr("href").replace(url, "");
            String name = div.select("a.video-title").text();
            String pic = div.select("div.thumb > a > img").attr("data-src");
            String remark = div.select("div.date").text();
            list.add(new Vod(id, name, pic, remark));
        }
        return Result.string(list);
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        String html = OkHttp.string(url + ids.get(0));
        Document doc = Jsoup.parse(html);
        String pic = doc.select("meta[property=og:image]").attr("content");
        String name = doc.select("meta[property=og:title]").attr("content");
        Vod vod = new Vod();
        vod.setVodId(ids.get(0));
        vod.setVodPic(pic);
        vod.setVodName(name);
        vod.setVodPlayFrom("玩偶姐姐");
        vod.setVodPlayUrl("播放$" + url + ids.get(0));
        return Result.string(vod);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        return Result.get().url(id).parse().click("document.getElementById('player-wrapper').click()").string();
    }

    @Override
    public boolean manualVideoCheck() throws Exception {
        return true;
    }

    @Override
    public boolean isVideoFormat(String url) throws Exception {
        return !url.contains("afcdn.net") && url.contains(".m3u8");
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        return searchContent("search/" + key);
    }

    @Override
    public String searchContent(String key, boolean quick, String pg) throws Exception {
        return searchContent("search/" + key + "/" + pg + ".html");
    }

    private String searchContent(String query) {
        List<Vod> list = new ArrayList<>();
        Document doc = Jsoup.parse(OkHttp.string(url + query));
        for (Element div : doc.select("div.video-item")) {
            String id = div.select("a.video-title").attr("href").replace(url, "");
            String name = div.select("a.video-title").text();
            String pic = div.select("div.thumb > a > img").attr("data-src");
            String remark = div.select("div.date").text();
            list.add(new Vod(id, name, pic, remark));
        }
        return Result.string(list);
    }
}
