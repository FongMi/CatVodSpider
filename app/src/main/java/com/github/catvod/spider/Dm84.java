package com.github.catvod.spider;

import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttpUtil;
import com.github.catvod.utils.Misc;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author FongMi
 */
public class Dm84 extends Spider {

    private static final String siteUrl = "https://dm84.tv";

    private HashMap<String, String> getHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", Misc.CHROME);
        return headers;
    }

    private JSONObject addFilter(String name, String key, List<String> texts) throws JSONException {
        JSONObject object = new JSONObject();
        JSONArray array = new JSONArray();
        for (String text : texts) {
            if (text.isEmpty()) continue;
            JSONObject o = new JSONObject();
            o.put("n", text.replace("按", ""));
            o.put("v", key.equals("by") ? replaceBy(text) : text);
            array.put(o);
        }
        object.put("key", key);
        object.put("name", name);
        object.put("value", array);
        return object;
    }

    private String replaceBy(String text) {
        return text.replace("按时间", "time").replace("按人气", "hist").replace("按评分", "score");
    }

    @Override
    public String homeContent(boolean filter) {
        List<Class> classes = new ArrayList<>();
        List<Vod> videos = new ArrayList<>();
        JSONObject filters = new JSONObject();
        Document doc = Jsoup.parse(OkHttpUtil.string(siteUrl, getHeaders()));
        for (Element element : doc.select("ul.nav_row > li > a")) {
            if (element.attr("href").startsWith("/list")) {
                String id = element.attr("href").split("-")[1].substring(0, 1);
                String name = element.text().substring(0, 2);
                classes.add(new Class(id, name));
            }
        }
        for (Class item : classes) {
            try {
                JSONArray array = new JSONArray();
                doc = Jsoup.parse(OkHttpUtil.string(siteUrl + "/list-" + item.getTypeId() + ".html", getHeaders()));
                Elements elements = doc.select("ul.list_filter > li > div");
                array.put(addFilter("類型", "type", elements.get(0).select("a").eachText()));
                array.put(addFilter("時間", "year", elements.get(1).select("a").eachText()));
                array.put(addFilter("排序", "by", elements.get(2).select("a").eachText()));
                filters.put(item.getTypeId(), array);
            } catch (Exception ignored) {
            }
        }
        for (Element element : doc.select("div.item")) {
            String img = element.select("a.cover").attr("data-bg");
            String url = element.select("a.title").attr("href");
            String name = element.select("a.title").text();
            String remark = element.select("span.desc").text();
            String id = url.split("/")[2];
            videos.add(new Vod(id, name, img, remark));
        }
        Result result = new Result();
        result.setFilters(filters);
        result.setClasses(classes);
        result.setList(videos);
        return result.toString();
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        Result result = new Result();
        List<Vod> videos = new ArrayList<>();
        if (extend.get("type") == null) extend.put("type", "");
        if (extend.get("year") == null) extend.put("year", "");
        if (extend.get("by") == null) extend.put("by", "time");
        String by = extend.get("by");
        String type = Misc.encode(extend.get("type"));
        String year = extend.get("year");
        String target = siteUrl + String.format("/show-%s--%s-%s--%s-%s.html", tid, by, type, year, pg);
        Document doc = Jsoup.parse(OkHttpUtil.string(target, getHeaders()));
        for (Element element : doc.select("div.item")) {
            String img = element.select("a.cover").attr("data-bg");
            String url = element.select("a.title").attr("href");
            String name = element.select("a.title").text();
            String remark = element.select("span.desc").text();
            String id = url.split("/")[2];
            videos.add(new Vod(id, name, img, remark));
        }
        result.setList(videos);
        return result.toString();
    }

    @Override
    public String detailContent(List<String> ids) {
        Vod vod = new Vod();
        Result result = new Result();
        Map<String, String> sites = new LinkedHashMap<>();

        Document doc = Jsoup.parse(OkHttpUtil.string(siteUrl.concat("/v/").concat(ids.get(0)), getHeaders()));
        String name = doc.select("h1.v_title").text();
        String remarks = doc.select("p.v_desc > span.desc").text();
        String img = doc.select("meta[property=og:image]").attr("content");
        String area = doc.select("meta[name=og:video:area]").attr("content");
        String type = doc.select("meta[name=og:video:class]").attr("content");
        String actor = doc.select("meta[name=og:video:actor]").attr("content");
        String content = doc.select("meta[property=og:description]").attr("content");
        String year = doc.select("meta[name=og:video:release_date]").attr("content");
        String director = doc.select("meta[name=og:video:director]").attr("content");

        vod.setVodId(ids.get(0));
        vod.setVodPic(img);
        vod.setVodYear(year);
        vod.setVodName(name);
        vod.setVodArea(area);
        vod.setVodActor(actor);
        vod.setVodRemarks(remarks);
        vod.setVodContent(content);
        vod.setVodDirector(director);
        vod.setTypeName(type);

        Elements sources = doc.select("ul.tab_control > li");
        Elements sourceList = doc.select("ul.play_list");
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
        result.setList(Arrays.asList(vod));
        return result.toString();
    }

    @Override
    public String searchContent(String key, boolean quick) {
        Result result = new Result();
        List<Vod> videos = new ArrayList<>();
        String target = siteUrl.concat("/s----------.html?wd=").concat(key);
        Document doc = Jsoup.parse(OkHttpUtil.string(target, getHeaders()));
        for (Element element : doc.select("div.item")) {
            String img = element.select("a.cover").attr("data-bg");
            String url = element.select("a.title").attr("href");
            String name = element.select("a.title").text();
            String remark = element.select("span.desc").text();
            String id = url.split("/")[2];
            videos.add(new Vod(id, name, img, remark));
        }
        result.setList(videos);
        return result.toString();
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        Document doc = Jsoup.parse(OkHttpUtil.string(siteUrl.concat(id), getHeaders()));
        String url = doc.select("iframe").attr("src");
        Result result = new Result();
        result.setUrl(url);
        result.setParse("1");
        result.setHeader(new Gson().toJson(getHeaders()));
        return result.toString();
    }
}
