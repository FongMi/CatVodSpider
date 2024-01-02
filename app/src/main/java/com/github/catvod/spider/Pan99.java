package com.github.catvod.spider;

import android.content.Context;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

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
public class Pan99 extends Ali {

    private static String siteUrl = "https://pan99.xyz";
    private String douban = "@Referer=https://api.douban.com/@User-Agent=" + Util.CHROME;

    private Map<String, String> getHeader() {
        Map<String, String> header = new HashMap<>();
        header.put("User-Agent", Util.CHROME);
        return header;
    }

    @Override
    public void init(Context context, String extend) {
        String[] split = extend.split("\\$");
        if (split.length == 2 && split[1].length() > 0) siteUrl = split[1];
        super.init(context, split[0]);
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        List<Class> classes = new ArrayList<>();
        List<String> typeIds = Arrays.asList("dy", "tv", "tv/geng", "tv/netflix");
        List<String> typeNames = Arrays.asList("电影", "完结剧集", "追更剧集", "Netflix");
        for (int i = 0; i < typeIds.size(); i++) classes.add(new Class(typeIds.get(i), typeNames.get(i)));
        Document doc = Jsoup.parse(OkHttp.string(siteUrl, getHeader()));
        List<Vod> list = new ArrayList<>();
        for (Element li : doc.select("div.col a.media-img")) {
            String vid = li.attr("href");
            String name = li.attr("title");
            String pic = li.attr("data-bg") + douban;
            list.add(new Vod(vid, name, pic));
        }
        return Result.string(classes, list);
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        String cateId = extend.get("cateId") == null ? tid : extend.get("cateId");
        String cateUrl = siteUrl + String.format("/category/%s/page/%s", cateId, pg);
        Document doc = Jsoup.parse(OkHttp.string(cateUrl, getHeader()));
        List<Vod> list = new ArrayList<>();
        for (Element li : doc.select("div.col a.media-img")) {
            String vid = li.attr("href");
            String name = li.attr("title");
            String pic = li.attr("data-bg") + douban;
            list.add(new Vod(vid, name, pic));
        }
        return Result.string(list);
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        Document doc = Jsoup.parse(OkHttp.string(ids.get(0), getHeader()));
        List<String> shareLinks = doc.select(".card p a:not([href*=quark])").eachAttr("href");
        for (int i = 0; i < shareLinks.size(); i++) shareLinks.set(i, shareLinks.get(i).trim());
        String title = doc.select(".post-title.mb-2.mb-lg-3").text();
        String pic = doc.select("img.alignnone.size-medium").attr("src") + douban;
        Matcher matcher = Pattern.compile("◎导　　演(.*?)◎").matcher(doc.text());
        String director = matcher.find() ? matcher.group(1) : "";
        Matcher matcher1 = Pattern.compile("◎演　　员(.*?)◎").matcher(doc.text());
        String actor = matcher1.find() ? matcher1.group(1) : "";
        Matcher matcher2 = Pattern.compile("◎年　　代(.*?)◎").matcher(doc.text());
        String year = matcher2.find() ? matcher2.group(1) : "";
        Matcher matcher3 = Pattern.compile("◎产　　地(.*?)◎类　　别(.*?)◎").matcher(doc.text());
        String area = matcher3.find() ? matcher3.group(1) : "";
        Matcher matcher4 = Pattern.compile("◎类　　别(.*?)◎").matcher(doc.text());
        String classifyName = matcher4.find() ? matcher4.group(1) : "";
        Matcher matcher5 = Pattern.compile("◎集　　数(.*?)◎").matcher(doc.text());
        String remark = matcher5.find() ? "集数：" + matcher5.group(1) : "";
        Matcher matcher6 = Pattern.compile("◎简　　介(.*?)资源失效").matcher(doc.text());
        String brief = matcher6.find() ? matcher6.group(1) : "";
        Vod vod = new Vod();
        vod.setVodId(ids.get(0));
        vod.setVodPic(pic);
        vod.setVodYear(year);
        vod.setVodName(title);
        vod.setVodArea(area);
        vod.setVodActor(actor);
        vod.setVodRemarks(remark);
        vod.setVodContent(brief);
        vod.setVodDirector(director);
        vod.setTypeName(classifyName);
        vod.setVodPlayFrom(super.detailContentVodPlayFrom(shareLinks));
        vod.setVodPlayUrl(super.detailContentVodPlayUrl(shareLinks));
        return Result.string(vod);
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        String searchUrl = siteUrl + "/?cat=&s=" + URLEncoder.encode(key);
        Document doc = Jsoup.parse(OkHttp.string(searchUrl, getHeader()));
        List<Vod> list = new ArrayList<>();
        for (Element li : doc.select("div.col a.media-img")) {
            String vid = li.attr("href");
            String name = li.attr("title");
            String pic = li.attr("data-bg") + douban;
            list.add(new Vod(vid, name, pic));
        }
        return Result.string(list);
    }
}
