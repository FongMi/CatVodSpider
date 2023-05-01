package com.github.catvod.spider;

import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Filter;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Utils;

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

public class Ying extends Spider {

    private static final String siteUrl = "https://www.yhpdm.com";
    private static final String listUrl = siteUrl + "/list/";
    private static final String showUrl = siteUrl + "/showp/";
    private static final String filterUrl = siteUrl + "/yxsf/js/yx_catalog.js";

    private HashMap<String, String> getHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", Utils.CHROME);
        return headers;
    }

    private Filter getFilter(String[] texts) {
        List<Filter.Value> values = new ArrayList<>();
        for (int i = 2; i < texts.length; i++) {
            if (!texts[i].isEmpty()) values.add(new Filter.Value(texts[i].trim()));
        }
        return new Filter(texts[0].trim(), texts[1].trim(), values);
    }

    private void addClasses(List<Class> classes, String[] texts) {
        for (int i = 2; i < texts.length; i++) {
            if (!texts[i].isEmpty()) classes.add(new Class(texts[i].trim()));
        }
    }

    private void checkExtend(StringBuilder sb, HashMap<String, String> extend, String column) {
        if (!extend.containsKey(column) || extend.get(column).equals("全部") || extend.get(column).equals("更新时间")) return;
        sb.append("&").append(column).append("=").append(extend.get(column));
    }

    @Override
    public String homeContent(boolean filter) {
        List<Vod> list = new ArrayList<>();
        List<Class> classes = new ArrayList<>();
        List<Filter> array = new ArrayList<>();
        LinkedHashMap<String, List<Filter>> filters = new LinkedHashMap<>();
        Document doc1 = Jsoup.parse(OkHttp.string(filterUrl, getHeaders()));
        String[] split = doc1.text().split("_labels = ");
        for (int i = 0; i < split.length; i++) {
            if (split[i].startsWith("[")) {
                split[i] = split[i].substring(0, split[i].indexOf(";")).replace("[", "").replace("]", "").replace("\"", "");
                if (split[i].startsWith("region")) addClasses(classes, split[i].split(","));
                else array.add(getFilter(split[i].split(",")));
            }
        }
        for (Class type : classes) filters.put(type.getTypeId(), array);
        Document doc2 = Jsoup.parse(OkHttp.string(listUrl, getHeaders()));
        for (Element element : doc2.select("div.lpic > ul > li")) {
            String id = element.select("a").attr("href").split("/")[2];
            String name = element.select("h2").text();
            String pic = element.select("a > img").attr("src");
            String remarks = element.select("span > font").text();
            remarks = remarks.contains(":") ? remarks.split(" ")[1] : remarks;
            list.add(new Vod(id, name, pic, remarks));
        }
        return Result.string(classes, list, filters);
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        List<Vod> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("?pagesize=24&pageindex=").append(Integer.parseInt(pg) - 1);
        if (!tid.equals("全部")) sb.append("&region=").append(tid);
        checkExtend(sb, extend, "genre");
        checkExtend(sb, extend, "letter");
        checkExtend(sb, extend, "year");
        checkExtend(sb, extend, "season");
        checkExtend(sb, extend, "status");
        checkExtend(sb, extend, "label");
        checkExtend(sb, extend, "resource");
        checkExtend(sb, extend, "order");
        Document doc = Jsoup.parse(OkHttp.string(listUrl.concat(sb.toString()), getHeaders()));
        for (Element element : doc.select("div.lpic > ul > li")) {
            String id = element.select("a").attr("href").split("/")[2];
            String name = element.select("h2").text();
            String pic = element.select("a > img").attr("src");
            String remarks = element.select("span > font").text();
            remarks = remarks.contains(":") ? remarks.split(" ")[1] : remarks;
            list.add(new Vod(id, name, pic, remarks));
        }
        return Result.string(list);
    }

    @Override
    public String detailContent(List<String> ids) {
        Document doc = Jsoup.parse(OkHttp.string(showUrl.concat(ids.get(0)), getHeaders()));
        String name = doc.select("div.rate > h1").text();
        String pic = doc.select("div.thumb > img").attr("src");
        String content = doc.select("div.info").text();
        Elements element = doc.select("div.sinfo > span > a");

        Vod vod = new Vod();
        vod.setVodId(ids.get(0));
        vod.setVodName(name);
        vod.setVodPic(pic);
        vod.setVodContent(content);
        vod.setVodArea(element.get(1).text());
        vod.setVodYear(element.get(0).text());
        vod.setTypeName(element.get(2).text());

        Map<String, String> sites = new LinkedHashMap<>();
        Elements sources = doc.select("ul.menu0 > li");
        Elements sourceList = doc.select("div.main0 > div");
        for (int i = 0; i < sources.size(); i++) {
            Element source = sources.get(i);
            String sourceName = source.text();
            Elements playList = sourceList.get(i).select("a");
            List<String> vodItems = new ArrayList<>();
            for (int j = 0; j < playList.size(); j++) {
                Element e = playList.get(j);
                vodItems.add(e.text() + "$" + e.attr("href"));
            }
            if (vodItems.size() > 0) {
                sites.put(sourceName, TextUtils.join("#", vodItems));
            }
        }
        if (sites.size() > 0) {
            vod.setVodPlayFrom(TextUtils.join("$$$", sites.keySet()));
            vod.setVodPlayUrl(TextUtils.join("$$$", sites.values()));
        }
        return Result.string(vod);
    }

    @Override
    public String searchContent(String key, boolean quick) {
        List<Vod> list = new ArrayList<>();
        String target = siteUrl + "/s_all?ex=1&kw=" + URLEncoder.encode(key);
        Document doc = Jsoup.parse(OkHttp.string(target, getHeaders()));
        for (Element element : doc.select("div.lpic > ul > li")) {
            String id = element.select("a").attr("href").split("/")[2];
            String name = element.select("h2").text();
            String pic = element.select("a > img").attr("src");
            String remarks = element.select("span > font").text();
            remarks = remarks.contains(":") ? remarks.split(" ")[1] : remarks;
            list.add(new Vod(id, name, pic, remarks));
        }
        return Result.string(list);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        return Result.get().url(siteUrl + id).parse().header(getHeaders()).string();
    }
}
