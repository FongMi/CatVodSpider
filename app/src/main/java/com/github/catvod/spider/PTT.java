package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Json;
import com.github.catvod.utils.Util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PTT extends Spider {

    private String url = "https://ptt.red/";
    private String extend;

    private Map<String, String> getHeader() {
        Map<String, String> header = new HashMap<>();
        header.put("User-Agent", Util.CHROME);
        header.put("Accept-Language", "zh-TW,zh;q=0.9,en-US;q=0.8,en;q=0.7");
        return header;
    }

    @Override
    public void init(Context context, String extend) throws Exception {
        this.extend = extend;
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        Document doc = Jsoup.parse(OkHttp.string(url, getHeader()));
        List<Class> classes = new ArrayList<>();
        for (Element a : doc.select("li > a.px-2.px-sm-3.py-2.nav-link")) classes.add(new Class(a.attr("href").replace("/p/", ""), a.text()));
        return Result.string(classes, TextUtils.isEmpty(extend) ? Json.parse("{}") : Json.parse(OkHttp.string(extend)));
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        Uri.Builder builder = Uri.parse(url + "p/" + tid).buildUpon();
        if (!TextUtils.isEmpty(extend.get("c"))) builder.appendEncodedPath("c/" + extend.get("c"));
        if (!TextUtils.isEmpty(extend.get("area"))) builder.appendQueryParameter("area_id", extend.get("area"));
        if (!TextUtils.isEmpty(extend.get("year"))) builder.appendQueryParameter("year", extend.get("year"));
        if (!TextUtils.isEmpty(extend.get("sort"))) builder.appendQueryParameter("sort", extend.get("sort"));
        builder.appendQueryParameter("page", pg);
        Document doc = Jsoup.parse(OkHttp.string(builder.toString(), getHeader()));
        List<Vod> list = new ArrayList<>();
        for (Element div : doc.select("div.card > div.embed-responsive")) {
            Element a = div.select("a").get(0);
            Element img = a.select("img").get(0);
            String remark = div.select("span.badge.badge-success").get(0).text();
            String vodPic = img.attr("src").startsWith("http") ? img.attr("src") : url + img.attr("src");
            String name = img.attr("alt");
            if (!TextUtils.isEmpty(name)) list.add(new Vod(a.attr("href").substring(3), name, vodPic, remark));
        }
        return Result.string(list);
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        Document doc = Jsoup.parse(OkHttp.string(url + ids.get(0) + "/1", getHeader()));
        LinkedHashMap<String, String> flags = new LinkedHashMap<>();
        List<String> playUrls = new ArrayList<>();
        for (Element a : doc.select("ul#w1 > li > a")) {
            flags.put(a.attr("href").split("/")[3], a.attr("title"));
        }
        Elements items = doc.select("div > a.seq.border");
        for (String flag : flags.keySet()) {
            List<String> urls = new ArrayList<>();
            for (Element e : items) urls.add(e.text() + "$" + ids.get(0) + "/" + e.attr("href").split("/")[2] + "/" + flag);
            if (urls.isEmpty()) urls.add("1$" + ids.get(0) + "/1/" + flag);
            playUrls.add(TextUtils.join("#", urls));
        }
        Vod vod = new Vod();
        vod.setVodPlayFrom(TextUtils.join("$$$", flags.values()));
        vod.setVodPlayUrl(TextUtils.join("$$$", playUrls));
        return Result.string(vod);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        Matcher m = Pattern.compile("contentUrl\":\"(.*?)\"").matcher(OkHttp.string(url + id));
        if (m.find()) return Result.get().url(m.group(1).replace("\\", "")).string();
        return Result.error("");
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        return searchContent(key, quick, "1");
    }

    @Override
    public String searchContent(String key, boolean quick, String pg) throws Exception {
        Document doc = Jsoup.parse(OkHttp.string(url + String.format("q/%s?page=%s", key, pg), getHeader()));
        List<Vod> list = new ArrayList<>();
        for (Element div : doc.select("div.card > div.embed-responsive")) {
            Element a = div.select("a").get(0);
            Element img = a.select("img").get(0);
            String remark = div.select("span.badge.badge-success").get(0).text();
            String vodPic = img.attr("src").startsWith("http") ? img.attr("src") : url + img.attr("src");
            String name = img.attr("alt");
            if (!TextUtils.isEmpty(name)) list.add(new Vod(a.attr("href").substring(3), name, vodPic, remark));
        }
        return Result.string(list);
    }
}
