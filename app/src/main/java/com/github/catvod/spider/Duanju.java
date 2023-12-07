package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Utils;

import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Qile
 */
public class Duanju extends Spider {

    private static String siteUrl = "https://duanju.one";

    private Map<String, String> getHeader() {
        Map<String, String> header = new HashMap<>();
        header.put("User-Agent", Utils.CHROME);
        return header;
    }

    @Override
    public void init(Context context, String extend) throws Exception {
        super.init(context, extend);
        if (!extend.isEmpty()) {
            siteUrl = extend;
        }
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        List<Class> classes = new ArrayList<>();
        List<String> typeIds = Arrays.asList("1", "2", "3", "26", "25", "27", "28", "32");
        List<String> typeNames = Arrays.asList("抖剧", "快剧", "都市", "穿越", "逆袭", "虐恋", "重生", "其他");
        for (int i = 0; i < typeIds.size(); i++) classes.add(new Class(typeIds.get(i), typeNames.get(i)));
        Document doc = Jsoup.parse(OkHttp.string(siteUrl, getHeader()));
        List<Vod> list = new ArrayList<>();
        for (Element li : doc.select("div.module-items").eq(0).select(".module-item")) {
            String vid = siteUrl + li.select(".module-item-pic a").attr("href");
            String name = li.select(".module-item-pic a").attr("title");
            String pic = li.select(".module-item-pic img").attr("data-src");
            String remark = li.select(".module-item-text").text();
            list.add(new Vod(vid, name, pic, remark));
        }
        return Result.string(classes, list);
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        HashMap<String, String> ext = new HashMap<>();
        if (extend != null && extend.size() > 0) ext.putAll(extend);
        String cateId = ext.get("cateId") == null ? tid : ext.get("cateId");
        String cateUrl = siteUrl + String.format("/vodshow/%s--------%s---.html", cateId, pg);
        Document doc = Jsoup.parse(OkHttp.string(cateUrl, getHeader()));
        List<Vod> list = new ArrayList<>();
        for (Element li : doc.select(".module-items .module-item")) {
            String vid = siteUrl + li.select(".module-item-pic a").attr("href");
            String name = li.select(".module-item-pic a").attr("title");
            String pic = li.select(".module-item-pic img").attr("data-src");
            String remark = li.select(".module-item-text").text();
            list.add(new Vod(vid, name, pic, remark));
        }
        return Result.string(list);
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        String detailUrl = ids.get(0);
        Document doc = Jsoup.parse(OkHttp.string(detailUrl, getHeader()));
        List<String> vodItems = new ArrayList<>();
        Elements sourceList = doc.select(".scroll-content a");
        for (Element a : sourceList) {
            String episodeUrl = siteUrl + a.attr("href");
            String episodeName = a.text();
            vodItems.add(episodeName + "$" + episodeUrl);
        }
        String vod_play_from = "Qile";
        String vod_play_url = TextUtils.join("#", vodItems);
        String title = doc.select("h1.page-title").text();
        String classifyName = doc.select("div.tag-link a").text();
        String year = doc.select("a.tag-link").eq(1).text();
        String area = doc.select("a.tag-link").eq(2).text();
        String remark = doc.select("div.title-info span").text();
        String director = "Qile";
        String actor = "FongMi";
        String brief = "该剧由蜂蜜用爱发电制作，欢迎观看！";
        Vod vod = new Vod();
        vod.setVodId(ids.get(0));
        vod.setVodYear(year);
        vod.setVodName(title);
        vod.setVodArea(area);
        vod.setVodActor(actor);
        vod.setVodRemarks(remark);
        vod.setVodContent(brief);
        vod.setVodDirector(director);
        vod.setTypeName(classifyName);
        vod.setVodPlayFrom(vod_play_from.toString());
        vod.setVodPlayUrl(vod_play_url.toString());
        return Result.string(vod);
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        String searchUrl = siteUrl + "/vodsearch/" + URLEncoder.encode(key) + "-------------.html";
        Document doc = Jsoup.parse(OkHttp.string(searchUrl, getHeader()));
        List<Vod> list = new ArrayList<>();
        for (Element li : doc.select(".module-search-item")) {
            String vid = siteUrl + li.select(".module-item-pic a").attr("href");
            String name = li.select(".module-item-pic img").attr("alt");
            String pic = li.select(".module-item-pic img").attr("data-src");
            String remark = li.select(".video-info-header a.video-serial").text();
            list.add(new Vod(vid, name, pic, remark));
        }
        return Result.string(list);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        String content = OkHttp.string(id, getHeader());
        Matcher matcher = Pattern.compile("player_aaaa=(.*?)</script>").matcher(content);
        String json = matcher.find() ? matcher.group(1) : "";
        JSONObject player = new JSONObject(json);
        String realUrl = player.getString("url");
        return Result.get().url(realUrl).header(getHeader()).string();
    }
}
