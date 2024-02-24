package com.github.catvod.spider;

import android.content.Context;
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

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hsck extends Spider {
    private String siteUrl = "http://hsck.net";
    Pattern playUrlPattern = Pattern.compile(".*(https:\\\\/\\\\/[a-zA-Z0-9-]+.cdn2020\\.com.*\\.m3u8).*");
    // 重定向的地址
    Pattern redirectPattern = Pattern.compile(".*strU=\\\"(https:\\/\\/.*?\\/).*");

    @Override
    public void init(Context context, String extend) throws Exception {
        if(!extend.isEmpty()) {
            this.siteUrl = extend;
        }
    }

    private Map<String, String> getHeader() {
        Map<String, String> header = new HashMap<>();
        header.put("User-Agent", Util.CHROME);
        header.put("Referer", siteUrl+"/");
        return header;
    }

    private boolean checkRealLocation(String content) throws IOException {
        if (content.contains("id=\"hao123\"")) {
            Matcher matcher = redirectPattern.matcher(content);
            if (matcher.matches()) {
                String url = matcher.group(1);
                String redirectUrl = String.format("%s?u=http://hsck.net&p=", url);
                this.siteUrl = OkHttp.getLocation(redirectUrl, getHeader());
                return true;
            }
        }
        return false;
    }

    @Override
    public String homeContent(boolean filter) throws Exception {

        List<Vod> list = fetchVodList("", "");
        List<Class> classes = new ArrayList<>();
        List<String> typeIds = Arrays.asList("15", "8", "9", "10", "7", "21", "22", "");
        List<String> typeNames = Arrays.asList("国产", "日本无码中文", "日本有码中文", "日本无码", "日本有码", "欧美", "动漫", siteUrl);
        for (int i = 0; i < typeIds.size(); i++)
            classes.add(new Class(typeIds.get(i), typeNames.get(i)));
        return Result.string(classes, list);
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        return Result.string(fetchVodList(tid, pg));
    }

    private String getPageUrl(String tid, String page) {
        if ("".equals(tid)) {
            return siteUrl;
        }
        if ("".equals(page)) page = "1";
        return String.format("%s/vodtype/%s-%s.html", siteUrl, tid, page);
    }

    private List<Vod> fetchVodList(String tid, String pg) throws IOException {
        String url = getPageUrl(tid, pg);
        String content = OkHttp.string(url, getHeader());
        boolean urlIsChanged = checkRealLocation(content);
        if (urlIsChanged) {
            url = getPageUrl(tid, pg);
            content = OkHttp.string(url, getHeader());
        }

        Document doc = Jsoup.parse(content);
        List<Vod> list = new ArrayList<>();
        for (Element li : doc.select("ul.stui-vodlist li")) {
            String href = li.select("a.stui-vodlist__thumb").attr("href");
            if (!href.startsWith("/")) {
                continue;
            }
            String vid = this.siteUrl + href;
            String name = li.select(".stui-vodlist__detail a").text();
            String pic = li.select("a.stui-vodlist__thumb").attr("data-original");
            String remarks = "";
            list.add(new Vod(vid, name, pic, remarks));
        }
        return list;
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        String url = ids.get(0);
        Document doc = Jsoup.parse(OkHttp.string(url, getHeader()));
        String playUrl = getPlayUrl(doc);

        List<String> vodItems = new ArrayList<>();
        vodItems.add("播放$" + playUrl);

        Vod vod = new Vod();
        vod.setVodId(ids.get(0));
        vod.setVodYear("");
        vod.setVodArea("");
        vod.setVodRemarks("");
        vod.setTypeName("");
        vod.setVodContent(String.format("网址：%s\n播放地址：%s", url, playUrl));
        vod.setVodPlayFrom("磁力");
        vod.setVodPlayUrl(TextUtils.join("#", vodItems));

        return Result.string(vod);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        return Result.get().url(id).header(getHeader()).string();
    }

    public String getPlayUrl(Document doc) {
        for (Element script : doc.select("script")) {
            String content = script.html();
            if (content.contains("player_aaaa")) {
                Matcher matcher = playUrlPattern.matcher(content);
                if (matcher.matches()) {
                    return matcher.group(1).replace("\\/", "/");
                }
            }
        }
        return "";
    }

}
