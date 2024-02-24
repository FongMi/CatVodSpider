package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Qile
 */

public class A18av extends Spider {

    private String siteUrl = "https://mjv002.com";
    //private String siteUrl = "https://18av.mm-cg.com";
    private String cookie = "";
    @Override
    public void init(Context context, String extend) throws Exception {
        cookie = getCookie();
        if(!extend.isEmpty())
            siteUrl = extend;
    }

    private Map<String, String> getHeader() {
        Map<String, String> header = new HashMap<>();
        header.put("User-Agent", Util.CHROME);
        header.put("Referer", siteUrl+"/");
        header.put("Cookie", cookie);
        return header;
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        List<Class> classes = new ArrayList<>();
        List<String> typeIds = Arrays.asList("/zh/chinese_list/all");
        List<String> typeNames = Arrays.asList("中文");
        for (int i = 0; i < typeIds.size(); i++)
            classes.add(new Class(typeIds.get(i), typeNames.get(i)));
        return Result.string(classes, fetchVodList(siteUrl));
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend)
            throws Exception {
        String cateUrl = getPageUrl(siteUrl + tid, pg);
        return Result.string(fetchVodList(cateUrl));
    }

    private List<Vod> fetchVodList(String url) {
        Document doc = Jsoup.parse(OkHttp.string(url, getHeader()));
        List<Vod> list = new ArrayList<>();
        for (Element li : doc.select("div.post")) {
            String vid = li.select("h3 a").attr("href");
            String name = li.select("h3").text();
            String pic = li.select("img").attr("src");
            String remarks = String.format("%s", li.select(".meta").text());
            list.add(new Vod(vid, name, pic, remarks));
        }
        return list;
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        Document doc = Jsoup.parse(OkHttp.string(ids.get(0), getHeader()));
        if(doc.text().contains("歡迎登入")) return Result.error("该资源需要登入");
        List<String> vodItems = new ArrayList<>();
        Elements sourceList = doc.select(".item.columns");
        for (Element a : sourceList) {
            String episodeUrl = a.select("div a").attr("href");
            String episodeName = a.select("div a").text();
            vodItems.add(episodeName + "$" + episodeUrl);
        }
        Elements elements = doc.select(".panel-block");
        String classifyName = "";
        String year = "";
        String area = "";
        String remark = "";
        String actors = "";
        for (Element element : elements) {
            String text = element.text();
            if (text.startsWith("類別:")) {
                classifyName = element.select("span a").text();
            } else if (text.startsWith("片商:")) {
                area = element.select("span a").text();
            } else if (text.startsWith("日期:")) {
                year = element.select("span").text();
            } else if (text.startsWith("評分:")) {
                remark = element.select("span").text();
            } else if (text.startsWith("演員:")) {
                actors = element.select("span").text();
            }
        }
        Vod vod = new Vod();
        vod.setVodId(ids.get(0));
        vod.setVodYear(year);
        vod.setVodArea(area);
        vod.setVodRemarks(remark);
        vod.setTypeName(classifyName);
        vod.setVodContent(String.format("网址：%s\n类别：%s\n演员：%s", ids.get(0), classifyName, actors));
        vod.setVodPlayFrom("磁力");
        vod.setVodPlayUrl(TextUtils.join("#", vodItems));
        return Result.string(vod);
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        String searchUrl = siteUrl + "/search?q=" + Uri.encode(key) + "&f=all";
        Document doc = Jsoup.parse(OkHttp.string(searchUrl, getHeader()));
        List<Vod> list = new ArrayList<>();
        for (Element li : doc.select(".item")) {
            String vid = siteUrl + li.select("a").attr("href");
            String name = li.select("a").attr("title");
            String pic = li.select("img").attr("src");
            list.add(new Vod(vid, name, pic));
        }
        return Result.string(list);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        return Result.get().url(id).header(getHeader()).string();
    }

    private String getPageUrl(String urlPrefix, String pg) {
        return String.format("%s/%s.html", urlPrefix, pg);
    }

    private String getCookie() {
        Map<String, String> headers = new HashMap<>();
        headers.put("User-Agent", Util.CHROME);
        headers.put("Referer", siteUrl);
        StringBuilder sb = new StringBuilder();
        Map<String, List<String>> resp = OkHttp.get(siteUrl + "/zh/chinese_IamOverEighteenYearsOld/19/index.html", headers).getResp();
        for (String item : resp.get("set-cookie")) sb.append(item.split(";")[0]).append(";");
        return sb.toString();
    }
}
