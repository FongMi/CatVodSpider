package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.utils.okhttp.OkHttpUtil;
import okhttp3.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dygang extends Spider {

    private static final String BASE_URL = "https://www.dygang.tv";

    private JSONObject filterConfig;
    private JSONObject playerConfig;
    private final Pattern categoryPattern = Pattern.compile("/(\\S+)/");
    private final Pattern detailPattern = Pattern.compile("(\\S+)");
    private final Pattern playPattern = Pattern.compile("/play/(\\S+)/");
    private final Pattern pagePattern = Pattern.compile("/ys/index_(\\d+).htm");

    public static String utf8ToGbk(String str) throws java.io.UnsupportedEncodingException {
        byte[] bytes = str.getBytes("UTF-8");
        return new String(bytes, "gb2312");
    }

    private HashMap<String, String> buildPostHeaders(String url) {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36 Edg/110.0.1587.57");
        headers.put("Content-Type", "application/x-www-form-urlencoded");
        headers.put("Accept-Encoding", "gzip");
        return headers;
    }

    private HashMap<String, String> buildGetHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("method", "GET");
        headers.put("Origin", BASE_URL);
        headers.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
        headers.put("Accept-Language", "zh-CN,zh;q=0.9");
        headers.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.114 Safari/537.36");
        return headers;
    }

    private static String httpPost(String url, Map<String, String> params, Map<String, String> headers, Map<String, String> responseHeaders) {
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
                if (responseHeaders != null) {
                    for (Map.Entry<String, List<String>> entry : response.headers().toMultimap().entrySet()) {
                        if (!entry.getValue().isEmpty()) {
                            responseHeaders.put(entry.getKey(), entry.getValue().get(0));
                        }
                    }
                }
                return response.body() != null ? response.body().string() : "";
            }
        } catch (IOException e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String categoryContent(String cateId, String page, boolean filterEnabled, HashMap<String, String> filters) {
        try {
            int pageNum = Integer.parseInt(page);
            String url = (pageNum != 1) ? BASE_URL + "/" + cateId + "/index_" + page + ".htm" : BASE_URL + "/" + cateId + "/index.htm";
            Document doc = Jsoup.parse(OkHttpUtil.string(url, buildGetHeaders()));
            JSONObject result = new JSONObject();
            Elements paginationLinks = doc.select("td a[href*='index_']");
            int size = paginationLinks.size();
            int currentPage;
            int pagecount;
            if (size != 0) {
                int foundPage = -1;
                int totalPages = 0;
                for (Element link : paginationLinks) {
                    Element child = link.selectFirst("a");
                    if (child != null) {
                        String linkText = child.text();
                        Matcher matcher = this.pagePattern.matcher(child.attr("href"));
                        if (matcher.find()) {
                            int parsed = Integer.parseInt(matcher.group(1));
                            if (linkText.equals("尾页")) {
                                totalPages = parsed;
                            } else if (foundPage == -1) {
                                foundPage = parsed - 1;
                            }
                        }
                    }
                }
                currentPage = (foundPage != -1) ? foundPage : pageNum;
                pagecount = totalPages;
            } else {
                currentPage = pageNum;
                pagecount = pageNum;
            }
            JSONArray list = new JSONArray();
            if (!doc.html().contains("没有找到您想要的结果哦")) {
                Elements items = doc.select("table.border1 a");
                for (Element item : items) {
                    String vodName = item.select("img").attr("alt");
                    String vodPic = item.select("img").attr("src");
                    Matcher matcher = this.detailPattern.matcher(item.attr("href"));
                    if (matcher.find()) {
                        JSONObject vod = new JSONObject();
                        vod.put("vod_id", matcher.group(1));
                        vod.put("vod_name", vodName);
                        vod.put("vod_pic", vodPic);
                        vod.put("vod_remarks", "磁力");
                        list.put(vod);
                    }
                }
            }
            result.put("page", currentPage);
            result.put("pagecount", pagecount);
            result.put("limit", 8);
            result.put("total", (pagecount <= 1) ? list.length() : pagecount * 8);
            result.put("list", list);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String detailContent(List<String> ids) {
        try {
            String url = BASE_URL + ids.get(0);
            Document doc = Jsoup.parse(OkHttpUtil.string(url, buildGetHeaders()));
            JSONObject result = new JSONObject();
            JSONObject vod = new JSONObject();
            String vodPic = doc.select("td#dede_content img").attr("src");
            String vodName = doc.select("div.title a").text();
            vod.put("vod_id", ids.get(0));
            vod.put("vod_name", vodName);
            vod.put("vod_pic", vodPic);
            Elements magnetLinks = doc.select("td > a[href*='magnet']");
            ArrayList<String> playParts = new ArrayList<>();
            for (Element link : magnetLinks) {
                playParts.add(link.text().split("\\.")[0] + "$" + link.attr("href"));
            }
            String playUrl = (playParts.size() > 0) ? TextUtils.join("#", playParts) : "";
            vod.put("vod_play_from", "电影港");
            vod.put("vod_play_url", playUrl);
            JSONArray list = new JSONArray();
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
            Document doc = Jsoup.parse(OkHttpUtil.string(BASE_URL, buildGetHeaders()));
            Elements navLinks = doc.select("TD.bg-fleet a");
            JSONArray categories = new JSONArray();
            Set<String> allowedCategories = new HashSet<>(Arrays.asList(
                    "国剧", "最新电影", "经典高清", "国配电影", "经典港片", "4K高清区",
                    "高清原盘", "日韩剧", "美剧", "综艺", "动漫", "3D电影", "纪录片"));
            for (Element link : navLinks) {
                String linkText = link.text();
                if (allowedCategories.contains(linkText)) {
                    Matcher matcher = this.categoryPattern.matcher(link.attr("href"));
                    if (matcher.find()) {
                        JSONObject cat = new JSONObject();
                        cat.put("type_id", matcher.group(1).trim());
                        cat.put("type_name", linkText);
                        categories.put(cat);
                    }
                }
            }
            JSONObject result = new JSONObject();
            if (filterEnabled) {
                result.put("filters", this.filterConfig);
            }
            result.put("class", categories);
            JSONArray list = new JSONArray();
            Elements items = doc.select("table.border1 a");
            for (Element item : items) {
                String vodName = item.select("img").attr("alt");
                String vodPic = item.select("img").attr("src");
                Matcher matcher = this.detailPattern.matcher(item.attr("href"));
                if (matcher.find()) {
                    JSONObject vod = new JSONObject();
                    vod.put("vod_id", matcher.group(1));
                    vod.put("vod_name", vodName);
                    vod.put("vod_pic", vodPic);
                    vod.put("vod_remarks", "磁力");
                    list.put(vod);
                }
            }
            result.put("list", list);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public void init(Context context, String str) throws Exception {
        super.init(context, str);
        try {
            this.playerConfig = new JSONObject("{\"xg_app_player\":{\"show\":\"app全局解析\",\"des\":\"\",\"ps\":\"1\",\"parse\":\"https://www.x-n.cc/api.php?url=\"},\"ppayun2\":{\"show\":\"专线ぁ\",\"des\":\"pp云\",\"ps\":\"0\",\"parse\":\"https://app.banwl.com/static/player/?url=\"},\"ppayun\":{\"show\":\"一线ぁ\",\"des\":\"pp云\",\"ps\":\"0\",\"parse\":\"https://app.banwl.com/static/player/?url=\"},\"index\":{\"show\":\"啊班云\",\"des\":\"http://yun.banwl.com\",\"ps\":\"1\",\"parse\":\"https://app.banwl.com/static/player/?url=\"},\"dongmanmiao\":{\"show\":\"动漫喵\",\"des\":\"\",\"ps\":\"0\",\"parse\":\"\"},\"bilibili\":{\"show\":\"bilibili\",\"des\":\"\",\"ps\":\"0\",\"parse\":\"\"},\"cycp\":{\"show\":\"动漫ぁ\",\"des\":\"\",\"ps\":\"0\",\"parse\":\"\"},\"dp\":{\"show\":\"弹幕\",\"des\":\"\",\"ps\":\"0\",\"parse\":\"\"},\"qiyi\":{\"show\":\"爱奇艺视\",\"des\":\"\",\"ps\":\"0\",\"parse\":\"\"},\"qq\":{\"show\":\"腾讯视频\",\"des\":\"\",\"ps\":\"0\",\"parse\":\"\"}}");
            this.filterConfig = new JSONObject("{}");
        } catch (JSONException e) {
            SpiderDebug.log(e);
        }
    }

    public String playerContent(String playFlag, String playUrl, List<String> vipFlags) {
        try {
            JSONObject result = new JSONObject();
            result.put("parse", 0);
            result.put("playUrl", "");
            result.put("url", playUrl);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String searchContent(String keyword, boolean quick) throws JSONException {
        JSONArray list = new JSONArray();
        try {
            String searchUrl = BASE_URL + "/e/search/index123.php";
            HashMap<String, String> params = new HashMap<>();
            params.put("keyboard", keyword);
            params.put("submit", "搜+索");
            params.put("show", "title,smalltext");
            params.put("tempid", "1");
            params.put("tbname", "article");
            HashMap<String, String> respHeaders = new HashMap<>();
            httpPost(searchUrl, params, buildPostHeaders(searchUrl), respHeaders);
            String location = respHeaders.get("Location");
            String resultUrl = BASE_URL + "/e/search/" + location;
            Elements items = Jsoup.parse(OkHttpUtil.string(resultUrl, buildGetHeaders())).select("table.border1 a");
            for (Element item : items) {
                String vodName = item.select("img").attr("alt");
                String vodPic = item.select("img").attr("src");
                Matcher matcher = this.detailPattern.matcher(item.attr("href"));
                if (matcher.find()) {
                    JSONObject vod = new JSONObject();
                    vod.put("vod_id", matcher.group(1));
                    vod.put("vod_name", vodName);
                    vod.put("vod_pic", vodPic);
                    vod.put("vod_remarks", "磁力");
                    list.put(vod);
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        JSONObject result = new JSONObject();
        result.put("list", list);
        return result.toString();
    }
}
