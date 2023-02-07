package com.github.catvod.spider;

import android.os.SystemClock;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Utils;

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
        for (Element a : doc.select("ul#side-menu").get(0).select("li > a")) {
            String typeName = a.text();
            String typeId = a.attr("href").replace(url, "");
            classes.add(new Class(typeId, typeName));
        }
        for (Element div : doc.select("div.video-detail")) {
            String id = div.select("h3.video-title > a").attr("href").replace(url, "");
            String name = div.select("h3.video-title > a").text();
            String pic = url + div.select("div.thumb > a > img").attr("data-src");
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
            String pic = url + div.select("div.thumb > a > img").attr("data-src");
            String remark = div.select("div.date").text();
            list.add(new Vod(id, name, pic, remark));
        }
        return Result.string(list);
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        Document doc = Jsoup.parse(OkHttp.string(url + ids.get(0)));
        String name = doc.select("meta[property=og:title]").attr("content");
        String pic = doc.select("meta[property=og:image]").attr("content");
        Vod vod = new Vod();
        vod.setVodId(ids.get(0));
        vod.setVodPic(pic);
        vod.setVodName(name);
        vod.setVodPlayFrom("玩偶姐姐");
        vod.setVodPlayUrl("播放$" + ids.get(0));
        return Result.string(vod);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        HashMap<String, String> result = new HashMap<>();
        Utils.loadWebView(url + id, getClient(result));
        while (result.isEmpty()) SystemClock.sleep(10);
        return Result.get().url(result.get("url")).string();
    }

    private WebViewClient getClient(HashMap<String, String> result) {
        return new WebViewClient() {
            @Override
            public void onLoadResource(WebView view, String url) {
                if (url.endsWith(".m3u8")) {
                    result.put("url", url);
                    view.destroy();
                }
            }
        };
    }
}
