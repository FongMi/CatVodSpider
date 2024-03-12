package com.github.catvod.spider;

import android.content.Context;

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

public class Zhaozy extends Ali {

    private final Pattern regexAli = Pattern.compile("(https://www.aliyundrive.com/s/[^\"]+)");
    private final Pattern regexVid = Pattern.compile("(\\S+)");
    private final String siteUrl = "https://zhaoziyuan1.cc/";
    private String username;
    private String password;

    private Map<String, String> getHeader() {
        Map<String, String> headers = new HashMap<>();
        headers.put("User-Agent", Util.CHROME);
        headers.put("Referer", siteUrl);
        return headers;
    }

    private void getCookie() {
        Map<String, String> params = new HashMap<>();
        params.put("username", username);
        params.put("password", password);
        Map<String, String> headers = new HashMap<>();
        headers.put("User-Agent", Util.CHROME);
        headers.put("Referer", siteUrl + "stop.html");
        headers.put("Origin", siteUrl);
        OkHttp.post(siteUrl + "logiu.html", params, headers);
    }

    @Override
    public void init(Context context, String extend) {
        String[] split = extend.split("\\$\\$\\$");
        super.init(context, split[0]);
        username = split[1];
        password = split[2];
        getCookie();
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        if (pattern.matcher(ids.get(0)).find()) return super.detailContent(ids);
        Matcher matcher = regexAli.matcher(OkHttp.string(siteUrl + ids.get(0), getHeader()));
        if (matcher.find()) return super.detailContent(Arrays.asList(matcher.group(1)));
        return "";
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        String url = siteUrl + "so?filename=" + URLEncoder.encode(key);
        Document doc = Jsoup.parse(OkHttp.string(url, getHeader()));
        List<Vod> list = new ArrayList<>();
        for (Element element : doc.select("div.li_con div.news_text")) {
            String href = element.select("div.news_text a").attr("href");
            Matcher matcher = regexVid.matcher(href);
            if (!matcher.find()) continue;
            String name = element.select("div.news_text a h3").text();
            if (!name.contains(key)) continue;
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
