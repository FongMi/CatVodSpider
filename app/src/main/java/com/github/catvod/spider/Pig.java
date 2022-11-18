package com.github.catvod.spider;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttpUtil;
import com.github.catvod.utils.Misc;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Pig extends Spider {

    private static final String siteUrl = "https://pigav.com/";

    private HashMap<String, String> getHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", Misc.CHROME);
        return headers;
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        List<Vod> list = new ArrayList<>();
        List<Class> classes = new ArrayList<>();
        Document doc = Jsoup.parse(OkHttpUtil.string(siteUrl, getHeaders()));
        for (Element element : doc.select("li.menu-item > a")) {
            String typeId = element.attr("href").replace(siteUrl, "");
            String typeName = element.text();
            if (typeId.contains("nowav.tv")) break;
            classes.add(new Class(typeId, typeName));
        }
        for (Element element : doc.select("div.media")) {
            String pic = element.select("span").attr("data-bgsrc");
            String url = element.select("a").attr("href");
            String name = element.select("a").attr("title");
            String id = url.replace(siteUrl, "");
            list.add(new Vod(id, name, pic));
        }
        return Result.string(classes, list);
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        List<Vod> list = new ArrayList<>();
        String target = siteUrl.concat(tid).concat("/page/").concat(pg);
        Document doc = Jsoup.parse(OkHttpUtil.string(target, getHeaders()));
        for (Element element : doc.select("div.media")) {
            String pic = element.select("span").attr("data-bgsrc");
            String url = element.select("a").attr("href");
            String name = element.select("a").attr("title");
            String id = url.replace(siteUrl, "");
            list.add(new Vod(id, name, pic));
        }
        return Result.string(list);
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        Document doc = Jsoup.parse(OkHttpUtil.string(siteUrl.concat("/").concat(ids.get(0)), getHeaders()));
        String url = doc.select("source").attr("src");
        String name = doc.select("h1.is-title").text();
        String pic = doc.select("video.video-js").attr("poster");
        Vod vod = new Vod();
        vod.setVodId(ids.get(0));
        vod.setVodPic(pic);
        vod.setVodName(name);
        vod.setVodPlayFrom("朱古力");
        vod.setVodPlayUrl("播放$" + url);
        return Result.string(vod);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        return Result.get().url(id).header(getHeaders()).string();
    }
}
