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
import java.net.URI;
import java.net.URLDecoder;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class New6v extends Spider {

    private static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36";

    private static String baseUrl = "http://www.xb6v.com";

    private static String appendHeaders(String url) {
        try {
            JSONObject headers = new JSONObject();
            headers.put("User-Agent", USER_AGENT);
            return url + "@Headers=" + headers.toString();
        } catch (Exception e) {
            return url;
        }
    }

    private static HashMap<String, String> buildHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", USER_AGENT);
        headers.put("Referer", baseUrl + "/");
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
                return response.body() != null ? response.body().string() : "";
            }
        } catch (IOException e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String categoryContent(String cateId, String page, boolean filterEnabled, HashMap<String, String> filters) {
        try {
            JSONObject result = new JSONObject();
            JSONArray list = new JSONArray();
            String path = "{cateId}";
            if (!page.equals("1")) {
                path = "{cateId}index_" + page + ".html";
                if (cateId.contains(".html")) {
                    return "";
                }
            }
            if (filterEnabled && filters != null && filters.size() > 0) {
                for (String key : filters.keySet()) {
                    String value = filters.get(key);
                    if (value.length() > 0) {
                        path = path.replace("{" + key + "}", value);
                    }
                }
            }
            String url = path.replaceAll("\\{cateId\\}", cateId);
            if (!cateId.contains("http")) {
                url = resolveUrl(baseUrl, url);
            }
            Document doc = Jsoup.parse(OkHttpUtil.string(url, buildHeaders()));
            boolean isQian = cateId.contains("/qian");
            if (isQian) {
                Elements items = doc.select("div#tab-content li");
                for (int i = 0; i < items.size(); i++) {
                    Element item = items.get(i);
                    String name = item.select("a").text();
                    if (name.contains("《") && name.contains("》")) {
                        name = name.substring(name.indexOf("《"));
                    }
                    String href = item.select("a").attr("href");
                    JSONObject vod = new JSONObject();
                    vod.put("vod_id", href);
                    vod.put("vod_name", name);
                    vod.put("vod_pic", "");
                    vod.put("vod_remarks", "");
                    list.put(vod);
                }
            } else {
                Elements items = doc.select("ul#post_container li");
                for (int i = 0; i < items.size(); i++) {
                    Element item = items.get(i);
                    String name = item.select("h2").text();
                    String pic = item.select("img").attr("src");
                    String remark = item.select(".info_date").text();
                    String href = item.select("a").attr("href");
                    JSONObject vod = new JSONObject();
                    vod.put("vod_id", href);
                    vod.put("vod_name", name);
                    vod.put("vod_pic", appendHeaders(pic));
                    vod.put("vod_remarks", remark);
                    list.put(vod);
                }
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
            String url = resolveUrl(baseUrl, ids.get(0));
            Document doc = Jsoup.parse(OkHttpUtil.string(url, buildHeaders()));
            String pic = doc.select("div#post_content img").get(0).attr("src");
            String name = doc.select("div#content>div>h1").text();
            ArrayList<String> playList = new ArrayList<>();
            try {
                Elements links = doc.select("div#post_content a[href^=magnet],a[href^=ed2k]");
                for (Element link : links) {
                    String title = link.select("a").text();
                    String href = link.select("a").attr("href");
                    if (href.startsWith("ed2k:")) {
                        Matcher matcher = Pattern.compile("\\|file\\|(.*?)\\|").matcher(URLDecoder.decode(href));
                        if (matcher.find()) title = matcher.group(1);
                    } else if (href.startsWith("magnet:")) {
                        Matcher matcher = Pattern.compile("(^|&)dn=([^&]*)(&|$)").matcher(URLDecoder.decode(href));
                        if (matcher.find()) title = matcher.group(2);
                    }
                    playList.add(title + "$" + href);
                }
            } catch (Exception e) {
                SpiderDebug.log(e);
            }
            String playUrl = playList.size() > 0 ? TextUtils.join("#", playList) : "";
            JSONObject result = new JSONObject();
            JSONArray list = new JSONArray();
            JSONObject vod = new JSONObject();
            vod.put("vod_id", ids.get(0));
            vod.put("vod_name", name);
            vod.put("vod_pic", appendHeaders(pic));
            vod.put("vod_content", "");
            vod.put("vod_play_from", "新6V");
            vod.put("vod_play_url", playUrl);
            list.put(vod);
            result.put("list", list);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String homeContent(boolean filterEnabled) {
        try {
            JSONArray classes = new JSONArray();
            for (Element link : Jsoup.parse(OkHttpUtil.string(baseUrl, buildHeaders())).select("ul#menus a")) {
                String name = link.ownText();
                if (name.contains("首页") || name.contains("最新") || name.contains("旧版")) continue;
                String href = link.attr("href");
                JSONObject cls = new JSONObject();
                cls.put("type_id", href);
                cls.put("type_name", name);
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
        baseUrl = str;
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
            String url = baseUrl + "/e/search/1index.php";
            LinkedHashMap<String, String> params = new LinkedHashMap<>();
            params.put("show", "title");
            params.put("tempid", "1");
            params.put("tbname", "article");
            params.put("mid", "1");
            params.put("dopost", "search");
            params.put("submit", "");
            params.put("keyboard", keyword);
            Document doc = Jsoup.parse(httpPost(url, params, buildHeaders()));
            Elements items = doc.select("ul#post_container li");
            for (Element item : items) {
                String name = item.select("h2").text();
                if (name.contains("《") && name.contains("》")) {
                    name = name.substring(name.indexOf("《"));
                }
                String pic = item.select("img").attr("src");
                String remark = item.select(".info_date").text();
                String href = item.select("a").attr("href");
                JSONObject vod = new JSONObject();
                vod.put("vod_id", href);
                vod.put("vod_name", name);
                vod.put("vod_pic", appendHeaders(pic));
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
