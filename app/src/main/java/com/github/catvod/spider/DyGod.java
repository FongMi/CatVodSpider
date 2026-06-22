package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.utils.okhttp.OkHttpUtil;
import okhttp3.*;
import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class DyGod extends Spider {

    private static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36";

    private String baseUrl = "https://www.dygod.net";

    private HashMap<String, String> buildHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", USER_AGENT);
        headers.put("Referer", this.baseUrl + "/");
        return headers;
    }

    private static String httpGet(String url, Map<String, String> headers) {
        try {
            Request.Builder reqBuilder = new Request.Builder().url(url).get();
            if (headers != null) {
                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    reqBuilder.addHeader(entry.getKey(), entry.getValue());
                }
            }
            try (Response response = OkHttpUtil.defaultClient().newCall(reqBuilder.build()).execute()) {
                return response.body() != null ? new String(response.body().bytes(), "gb2312").replaceAll("\r|\n", "") : "";
            }
        } catch (IOException e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    private static String httpPost(String url, Map<String, String> params, Map<String, String> headers) {
        try {
            FormBody.Builder formBuilder = new FormBody.Builder();
            for (Map.Entry<String, String> entry : params.entrySet()) {
                formBuilder.add(entry.getKey(), entry.getValue());
            }
            Request.Builder reqBuilder = new Request.Builder().url(url).post(formBuilder.build());
            if (headers != null) {
                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    reqBuilder.addHeader(entry.getKey(), entry.getValue());
                }
            }
            try (Response response = OkHttpUtil.defaultClient().newCall(reqBuilder.build()).execute()) {
                return response.body() != null ? new String(response.body().bytes(), "gb2312").replaceAll("\r|\n", "") : "";
            }
        } catch (IOException e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    private static String resolveUrl(String baseUrl, String relativeUrl) {
        try {
            if (relativeUrl.startsWith("//")) {
                return java.net.URI.create(baseUrl).getScheme() + ":" + relativeUrl;
            }
            if (relativeUrl.startsWith("/")) {
                java.net.URI base = java.net.URI.create(baseUrl);
                return base.getScheme() + "://" + base.getHost() + relativeUrl;
            }
            if (relativeUrl.startsWith("http://") || relativeUrl.startsWith("https://")) {
                return relativeUrl;
            }
            java.net.URI base = java.net.URI.create(baseUrl);
            return base.getScheme() + "://" + base.getHost() + "/" + relativeUrl;
        } catch (Exception e) {
            return relativeUrl;
        }
    }

    private String parseLinkTitle(String url) {
        try {
            if (url.startsWith("ed2k:")) {
                Matcher matcher = Pattern.compile("\\|file\\|(.*?)\\|").matcher(URLDecoder.decode(url));
                if (matcher.find()) {
                    return "电驴-" + matcher.group(1);
                }
            } else if (url.startsWith("magnet:")) {
                Matcher matcher = Pattern.compile("(^|&)dn=([^&]*)(&|$)").matcher(URLDecoder.decode(url));
                if (matcher.find()) {
                    return "磁力-" + matcher.group(2);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return url;
    }

    public String categoryContent(String cateId, String page, boolean filterEnabled, HashMap<String, String> filters) {
        try {
            JSONObject result = new JSONObject();
            JSONArray list = new JSONArray();
            String url = this.baseUrl + "/html/{cateId}/index.html";
            if (!page.equals("1")) {
                url = this.baseUrl + "/html/{cateId}/index_" + page + ".html";
                if (cateId.contains(".html")) {
                    return "";
                }
            }
            if (filterEnabled && filters != null && filters.size() > 0) {
                for (String key : filters.keySet()) {
                    String value = filters.get(key);
                    if (value.length() > 0) {
                        url = url.replace("{" + key + "}", value);
                    }
                }
            }
            Elements tables = Jsoup.parse(httpGet(url.replaceAll("\\{cateId\\}", cateId), buildHeaders())).select("div.co_content8 table");
            for (int i = 0; i < tables.size(); i++) {
                Element table = tables.get(i);
                String remark = table.select("tr:contains(点击：)").text();
                String title = table.select("b").text();
                if (title.contains("《") && title.contains("》")) {
                    remark = title.split("》")[1];
                    title = title.split("《")[1].split("》")[0];
                }
                String href = table.select("table a").get(table.select("table a").size() - 1).attr("href");
                JSONObject vod = new JSONObject();
                vod.put("vod_id", href);
                vod.put("vod_name", title);
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
        try {
            String html = httpGet(this.baseUrl + ids.get(0), buildHeaders());
            Document doc = Jsoup.parse(html);
            String pic = resolveUrl(this.baseUrl, doc.select("div#Zoom>img").attr("src"));
            String name = doc.select("div.title_all>h1").text();
            ArrayList<String> playFromList = new ArrayList<>();
            ArrayList<String> playUrlList = new ArrayList<>();
            if (html.contains("player_list")) {
                Elements items = doc.select("div.player_list li");
                Collections.reverse(items);
                ArrayList<String> episodeList = new ArrayList<>();
                for (int i = 0; i < items.size(); i++) {
                    Element item = items.get(i);
                    String epTitle = item.select("a").text();
                    String epUrl = item.select("a").attr("href");
                    if (epUrl.contains("jianpian")) {
                        epUrl = "tvbox-xg:" + epUrl.split("path=")[1];
                    }
                    episodeList.add(epTitle + "$" + epUrl);
                }
                playUrlList.add(TextUtils.join("#", episodeList));
                playFromList.add("视频播列表");
            }
            if (html.contains("id=\"downlist")) {
                Elements tables = doc.select("div#downlist table");
                Collections.reverse(tables);
                ArrayList<String> downloadList = new ArrayList<>();
                for (int i = 0; i < tables.size(); i++) {
                    Element table = tables.get(i);
                    downloadList.add(parseLinkTitle(table.select("td").text()) + "$" + table.select("a").attr("href"));
                }
                playUrlList.add(TextUtils.join("#", downloadList));
                playFromList.add("磁力列表一");
            } else if (html.contains("href=\"ftp") || html.contains("href=\"magnet") || html.contains("href=\"ed2k")) {
                Elements tables = doc.select("div#Zoom table");
                Collections.reverse(tables);
                ArrayList<String> downloadList = new ArrayList<>();
                for (int i = 0; i < tables.size(); i++) {
                    Element table = tables.get(i);
                    downloadList.add(parseLinkTitle(table.select("a").text()) + "$" + table.select("a").attr("href"));
                }
                playUrlList.add(TextUtils.join("#", downloadList));
                playFromList.add("磁力列表二");
            }
            String playFrom = TextUtils.join("$$$", playFromList);
            String playUrl = TextUtils.join("$$$", playUrlList);
            JSONObject result = new JSONObject();
            JSONArray list = new JSONArray();
            JSONObject vod = new JSONObject();
            vod.put("vod_id", ids.get(0));
            vod.put("vod_name", name);
            vod.put("vod_pic", pic);
            vod.put("vod_content", "");
            vod.put("type_name", "");
            vod.put("vod_play_from", playFrom);
            vod.put("vod_play_url", playUrl);
            list.put(vod);
            result.put("list", list);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    public String homeContent(boolean filterEnabled) {
        try {
            JSONArray classes = new JSONArray();
            String[] names = "最新影片&国内电影&欧美电影&华语电视&日韩电视&欧美电视&最新综艺&旧版综艺&动漫资源&手机电影".split("&");
            String[] ids = "gndy/dyzz&gndy/china&gndy/oumei&tv/hytv&tv/rihantv&tv/oumeitv&zongyi2013&2009zongyi&dongman&3gp/3gpmovie".split("&");
            for (int i = 0; i < names.length; i++) {
                JSONObject cls = new JSONObject();
                cls.put("type_id", ids[i]);
                cls.put("type_name", names[i]);
                classes.put(cls);
            }
            JSONObject result = new JSONObject();
            result.put("class", classes);
            if (filterEnabled) {
                result.put("filters", new JSONObject("{}]}"));
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
            result.put("url", playUrl);
            result.put("parse", 0);
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
            String url = this.baseUrl + "/e/search/index.php";
            LinkedHashMap<String, String> params = new LinkedHashMap<>();
            params.put("show", "title");
            params.put("tempid", "1");
            params.put("keyboard", keyword);
            params.put("Submit", "立即搜索");
            HashMap<String, String> headers = buildHeaders();
            headers.put("Content-Type", "application/x-www-form-urlencoded; charset=gb2312");
            Elements tables = Jsoup.parse(httpPost(url, params, headers)).select("div.co_content8 table");
            for (int i = 0; i < tables.size(); i++) {
                Element table = tables.get(i);
                String remark = table.select("tr:contains(点击：)").text();
                String title = table.select("b").text();
                if (title.contains("《") && title.contains("》")) {
                    remark = title.split("》")[1];
                    title = title.split("《")[1].split("》")[0];
                }
                String href = table.select("table a").get(table.select("table a").size() - 1).attr("href");
                JSONObject vod = new JSONObject();
                vod.put("vod_id", href);
                vod.put("vod_name", title);
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
