package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.utils.okhttp.OkHttpUtil;
import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.URI;
import java.util.HashMap;
import java.util.List;


public class QnMp4 extends Spider {

    private static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36";

    private String baseUrl = "https://www.qnmp4.com";

    private HashMap<String, String> buildHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", USER_AGENT);
        headers.put("Referer", this.baseUrl + "/");
        return headers;
    }

    private static String resolveUrl(String baseUrl, String relativeUrl) {
        try {
            if (relativeUrl.startsWith("//")) return URI.create(baseUrl).getScheme() + ":" + relativeUrl;
            if (relativeUrl.startsWith("/")) {
                URI base = URI.create(baseUrl);
                return base.getScheme() + "://" + base.getHost() + relativeUrl;
            }
            if (relativeUrl.startsWith("http://") || relativeUrl.startsWith("https://")) return relativeUrl;
            URI base = URI.create(baseUrl);
            return base.getScheme() + "://" + base.getHost() + "/" + relativeUrl;
        } catch (Exception e) {
            return relativeUrl;
        }
    }

    public String categoryContent(String cateId, String page, boolean filterEnabled, HashMap<String, String> filters) {
        try {
            JSONObject result = new JSONObject();
            JSONArray list = new JSONArray();
            String url = this.baseUrl + "/ms/{cateId}--------" + page + "---.html";
            if (filterEnabled && filters != null && filters.size() > 0) {
                for (String key : filters.keySet()) {
                    String value = filters.get(key);
                    if (value.length() > 0) {
                        url = url.replace("{" + key + "}", value);
                    }
                }
            }
            Document doc = Jsoup.parse(OkHttpUtil.string(url.replaceAll("\\{cateId\\}", cateId), buildHeaders()));
            Elements items = doc.select("ul.content-list li");
            for (int i = 0; i < items.size(); i++) {
                Element item = items.get(i);
                String name = item.select("h3").text();
                String pic = resolveUrl(this.baseUrl, item.select("img").attr("src"));
                String remark = item.select(".bottom2").text();
                String href = item.select("a").attr("href");
                JSONObject vod = new JSONObject();
                vod.put("vod_id", href);
                vod.put("vod_name", name);
                vod.put("vod_pic", pic);
                vod.put("vod_remarks", remark);
                list.put(vod);
            }
            result.put("page", page);
            result.put("pagecount", Integer.MAX_VALUE);
            result.put("limit", list.length());
            result.put("total", Integer.MAX_VALUE);
            result.put("list", list);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String detailContent(List<String> ids) {
        // TODO: Method not decompiled by JADX - needs manual reconstruction
        return "";
    }

    public String homeContent(boolean filterEnabled) {
        try {
            JSONArray classes = new JSONArray();
            String[] names = "电影&电视剧&综艺&动漫&短剧".split("&");
            String[] ids = "1&2&3&4&30".split("&");
            for (int i = 0; i < names.length; i++) {
                JSONObject cls = new JSONObject();
                cls.put("type_id", ids[i]);
                cls.put("type_name", names[i]);
                classes.put(cls);
            }
            JSONObject result = new JSONObject();
            result.put("class", classes);
            if (filterEnabled) {
                result.put("filters", new JSONObject("{}"));
            }
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public void init(Context context, String str) throws Exception {
        super.init(context, str);
        if (str.isEmpty()) {
            return;
        }
        this.baseUrl = str;
    }

    public String playerContent(String playFlag, String playUrl, List<String> vipFlags) {
        try {
            JSONObject result = new JSONObject();
            JSONObject header = new JSONObject();
            header.put("User-Agent", USER_AGENT);
            result.put("url", playUrl);
            if (playUrl.startsWith("tvbox") || playUrl.startsWith("ed2k")) {
                result.put("parse", 0);
            } else {
                result.put("header", header.toString());
                result.put("parse", 1);
            }
            result.put("playUrl", "");
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String searchContent(String keyword, boolean quick) {
        try {
            JSONArray list = new JSONArray();
            String url = this.baseUrl + "/vs/-------------.html?wd=" + keyword;
            Document doc = Jsoup.parse(OkHttpUtil.string(url, buildHeaders()));
            Elements items = doc.select("div.sr_lists li");
            for (int i = 0; i < items.size(); i++) {
                Element item = items.get(i);
                String name = item.select("h3").text();
                String pic = resolveUrl(this.baseUrl, item.select("img").attr("src"));
                String remark = item.select(".bottom2").text();
                String href = item.select("a").attr("href");
                JSONObject vod = new JSONObject();
                vod.put("vod_id", href);
                vod.put("vod_name", name);
                vod.put("vod_pic", pic);
                vod.put("vod_remarks", remark);
                list.put(vod);
            }
            JSONObject result = new JSONObject();
            result.put("list", list);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
