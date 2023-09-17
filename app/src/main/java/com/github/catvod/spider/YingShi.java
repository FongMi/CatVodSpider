package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Filter;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.bean.webdav.Drive;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.FileUtil;
import com.github.catvod.utils.Utils;

import org.json.JSONArray;
import org.json.JSONException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class YingShi extends Spider {

    private final String siteUrl = "https://www.yingshi.tv";
    private ExecutorService service;

    public File getCache() {
        return FileUtil.getCacheFile("ying_shi_home");
    }

    private HashMap<String, String> getHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", Utils.CHROME);
        headers.put("Referer", siteUrl);
        return headers;
    }

    @Override
    public void init(Context context, String extend) {
        service = Executors.newCachedThreadPool();
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        if (getCache().exists()) return FileUtil.read(getCache());
        List<Class> classes = new ArrayList<>();
        classes.add(new Class("1", "電視劇"));
        classes.add(new Class("2", "電影"));
        classes.add(new Class("4", "動漫"));
        classes.add(new Class("3", "綜藝"));
        classes.add(new Class("5", "紀錄片"));
        LinkedHashMap<String, List<Filter>> filters = new LinkedHashMap<>();
        for (Class type : classes) filters.put(type.getTypeId(), service.submit(new Job(type.getTypeId())).get());
        String result = Result.string(classes, filters);
        FileUtil.write(getCache(), result);
        return result;
    }

    @Override
    public String homeVideoContent() {
        Document doc = Jsoup.parse(OkHttp.string(siteUrl));
        List<Vod> list = new ArrayList<>();
        for (Element e : doc.select("div#desktop-container").select("li.ys_show_item")) {
            String id = e.select("a").attr("href").split("/")[4];
            String pic = e.select("img").attr("src");
            String name = e.select("h2.ys_show_title").text();
            String remark = e.select("span.ys_show_episode_text").text();
            if (!TextUtils.isEmpty(name)) list.add(new Vod(id, name, pic, remark));
        }
        return Result.string(list);
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        String by = extend.containsKey("by") ? extend.get("by") : "time";
        String cls = extend.containsKey("class") ? extend.get("class") : "";
        String area = extend.containsKey("area") ? extend.get("area") : "";
        String lang = extend.containsKey("lang") ? extend.get("lang") : "";
        String year = extend.containsKey("year") ? extend.get("year") : "";
        Map<String, String> params = new HashMap<>();
        params.put("mid", "1");
        params.put("by", by);
        params.put("tid", tid);
        params.put("page", pg);
        params.put("class", cls);
        params.put("year", year);
        params.put("lang", lang);
        params.put("area", area);
        params.put("limit", "35");
        return OkHttp.get(siteUrl + "/ajax/data", params, getHeaders());
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        Document doc = Jsoup.parse(OkHttp.string(siteUrl + "/vod/play/id/" + ids.get(0) + "/sid/1/nid/1.html"));
        String json = doc.html().split("let data = ")[1].split("let obj = ")[0].trim();
        json = json.substring(0, json.length() - 1).replace("&amp;", " ");
        Vod vod = Vod.objectFrom(json);
        return Result.string(vod);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        String proxyUrl = Proxy.getUrl() + "?do=yingshi&url=" + id;
        return Result.get().url(id).m3u8().string();
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
        Map<String, String> params = new HashMap<>();
        params.put("mid", "1");
        params.put("page", pg);
        params.put("limit", "18");
        params.put("wd", URLEncoder.encode(key));
        return OkHttp.get(siteUrl + "/ajax/search.html", params, getHeaders());
    }

    private static class Job implements Callable<List<Filter>> {

        private final String typeId;

        public Job(String typeId) {
            this.typeId = typeId;
        }

        @Override
        public List<Filter> call() {
            List<Filter> items = new ArrayList<>();
            String url = "https://www.yingshi.tv/vod/show/by/hits_day/id/%s/order/desc.html";
            Document doc = Jsoup.parse(OkHttp.string(String.format(url, typeId)));
            items.add(filter(doc.select("div.ys_filter_list_show_types").get(0).select("div.ys_filter.flex").get(1).select("div > div"), "by", "排序", 4));
            items.add(filter(doc.select("div#ys_filter_by_class").get(0).select("div > div"), "class", "類型", 6));
            items.add(filter(doc.select("div#ys_filter_by_country").get(0).select("div > div"), "area", "地區", 4));
            items.add(filter(doc.select("div#ys_filter_by_lang").get(0).select("div > div"), "lang", "語言", 8));
            items.add(filter(doc.select("div#ys_filter_by_year").get(0).select("div > div"), "year", "時間", 10));
            return items;
        }

        private Filter filter(Elements elements, String key, String name, int index) {
            List<Filter.Value> values = new ArrayList<>();
            for (Element e : elements) {
                String n = e.select("p").text();
                boolean all = n.contains("全部");
                String v = all ? "" : e.select("a").attr("href").split("/")[index].replace(".html", "");
                values.add(new Filter.Value(n, v));
            }
            return new Filter(key, name, values);
        }
    }

    public static Object[] vod(Map<String, String> params) throws Exception {
        String url = params.get("url");
        List<String> AdBlock = Arrays.asList("10.0099", "8.1748"); // Advertisement ts
        String content = OkHttp.string(url);
        Matcher m = Pattern.compile("#EXT-X-DISCONTINUITY[\\s\\S]*?(?=#EXT-X-DISCONTINUITY|$)").matcher(content);
        while (m.find()) {
            BigDecimal k = BigDecimal.ZERO;
            Matcher digit = Pattern.compile("#EXTINF:(\\d+\\.\\d+)").matcher(m.group(0));
            while (digit.find()) {
                BigDecimal g = new BigDecimal(digit.group(1));
                k = k.add(g);
            }
            for (String ads : AdBlock) {
                if (k.toString().contains(ads)) {
                    content = content.replaceAll(m.group(0), "");
                    System.out.println("Found ads: " + ads);
                }
            }
        }
        Object[] result = new Object[3];
        result[0] = 200;
        result[1] = "application/octet-stream";
        result[2] = content;
        return result;
    }
}
