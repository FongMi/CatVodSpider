package com.github.catvod.spider;

import android.text.TextUtils;
import android.util.Base64;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Doll extends Spider {

    private final String url = "https://hongkongdollvideo.com/";

    @Override
    public String homeContent(boolean filter) throws Exception {
        List<Class> classes = new ArrayList<>();
        List<Vod> list = new ArrayList<>();
        Document doc = Jsoup.parse(OkHttp.string(url));
        for (Element a : doc.select("ul#side-menu").get(0).select("li > a")) {
            String typeName = a.text();
            String typeId = a.attr("href").replace(url, "");
            classes.add(new Class(typeId, typeName));
        }
        for (Element div : doc.select("div.video-detail")) {
            String id = div.select("h3.video-title > a").attr("href").replace(url, "");
            String name = div.select("h3.video-title > a").text();
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
        for (Element div : doc.select("div.video-detail")) {
            String id = div.select("h3.video-title > a").attr("href").replace(url, "");
            String name = div.select("h3.video-title > a").text();
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
        String key = "";
        String voteTag = "";
        StringBuilder code = new StringBuilder();
        String html = OkHttp.string(id);
        Document doc = Jsoup.parse(html);
        Matcher m = Pattern.compile("/video/(\\w+).html").matcher(id);
        if (m.find()) key = m.group(1);
        for (Element a : doc.select("script")) {
            if (a.html().startsWith("var voteTag")) {
                Pattern pattern = Pattern.compile("voteTag=\"([^&]+)\"");
                Matcher matcher = pattern.matcher(a.html());
                if (matcher.find()) voteTag = matcher.group(1);
                break;
            }
        }
        if (TextUtils.isEmpty(voteTag)) return Result.get().url(id).parse().string();
        voteTag = new String(Base64.decode(voteTag, 0));
        for (int i = 0; i < voteTag.length(); i++) {
            int k = i % key.length();
            code.append((char) (voteTag.charAt(i) ^ key.charAt(k)));
        }
        String playUrl = URLDecoder.decode(new String(Base64.decode(code.toString(), 0)));
        return Result.get().url(playUrl).string();
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
        for (Element div : doc.select("div.video-detail")) {
            String id = div.select("h3.video-title > a").attr("href").replace(url, "");
            String name = div.select("h3.video-title > a").text();
            String pic = div.select("div.thumb > a > img").attr("data-src");
            String remark = div.select("div.date").text();
            list.add(new Vod(id, name, pic, remark));
        }
        return Result.string(list);
    }
}
