package com.github.catvod.spider;

import android.content.Context;

import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttpUtil;
import com.github.catvod.utils.Misc;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zhaozy extends Spider {

    private final Pattern regexAli = Pattern.compile("(https://www.aliyundrive.com/s/[^\"]+)");
    private final Pattern regexVid = Pattern.compile("(\\S+)");
    private final String siteUrl = "https://zhaoziyuan.la/";
    private Ali ali;

    private Map<String, String> getHeader() {
        Map<String, String> headers = new HashMap<>();
        headers.put("User-Agent", Misc.CHROME);
        headers.put("Referer", siteUrl);
        headers.put("Cookie", getCookie());
        return headers;
    }

    private String getCookie() {
        Map<String, String> params = new HashMap<>();
        params.put("username", "nikalo8893@bitvoo.com");
        params.put("password", "P@ssw0rd");
        Map<String, String> headers = new HashMap<>();
        headers.put("User-Agent", Misc.CHROME);
        headers.put("Referer", siteUrl + "login.html");
        headers.put("Origin", siteUrl);
        Map<String, List<String>> resp = new HashMap<>();
        OkHttpUtil.post(siteUrl + "logiu.html", params, headers, resp);
        StringBuilder sb = new StringBuilder();
        for (String item : resp.get("set-cookie")) sb.append(item.split(";")[0]).append(";");
        return sb.toString();
    }

    @Override
    public void init(Context context, String extend) {
        ali = new Ali(extend);
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        Matcher matcher = regexAli.matcher(OkHttpUtil.string(siteUrl + ids.get(0), getHeader()));
        if (!matcher.find()) return "";
        ids.set(0, matcher.group(1));
        return ali.detailContent(ids);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        return ali.playerContent(flag, id);
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        String url = siteUrl + "so?filename=" + URLEncoder.encode(key);
        Document doc = Jsoup.parse(OkHttpUtil.string(url, getHeader()));
        List<Vod> list = new ArrayList<>();
        for (Element element : doc.select("div.li_con div.news_text")) {
            String href = element.select("div.news_text a").attr("href");
            Matcher matcher = regexVid.matcher(href);
            if (!matcher.find()) continue;
            String name = element.select("div.news_text a h3").text();
            String remark = element.select("div.news_text a p").text().split("\\|")[1].split("：")[1];
            Vod vod = new Vod();
            vod.setVodPic("https://inews.gtimg.com/newsapp_bt/0/13263837859/1000");
            vod.setVodId(matcher.group(1));
            vod.setVodRemarks(remark);
            vod.setVodName(name);
            list.add(vod);
        }
        return Result.string(list);
    }
}