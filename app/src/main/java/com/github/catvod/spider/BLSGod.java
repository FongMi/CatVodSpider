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
import java.util.*;


public class BLSGod extends Spider {

    private static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36";

    private static String baseUrl = "https://www.80sgod.com";

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

    private static String selectText(Element element, String selector) {
        if (selector.contains("&&")) {
            String[] parts = selector.split("&&");
            Elements targets = element.select(parts[0].replace("||", ", "));
            if (targets.isEmpty()) return "";
            Element target = targets.first();
            String path = parts[1];
            if (path.contains("||")) {
                String[] attrs = path.split("\\|\\|");
                for (String attr : attrs) {
                    String val = target.attr(attr.trim());
                    if (!val.isEmpty()) return val;
                }
                return "";
            }
            return target.attr(path);
        }
        return element.select(selector.replace("||", ", ")).text();
    }

    public String categoryContent(String cateId, String page, boolean filterEnabled, HashMap<String, String> filters) {
        try {
            JSONObject result = new JSONObject();
            JSONArray list = new JSONArray();
            String url = baseUrl + "/{cateId}--p/" + page;
            if (filterEnabled && filters != null && filters.size() > 0) {
                for (String key : filters.keySet()) {
                    String value = filters.get(key);
                    if (value.length() > 0) {
                        url = url.replace("{" + key + "}", value);
                    }
                }
            }
            Document doc = Jsoup.parse(OkHttpUtil.string(url.replaceAll("\\{cateId\\}", cateId), buildHeaders()));
            Elements items = doc.select(".me1, .me3").select("li");
            for (int i = 0; i < items.size(); i++) {
                Element item = items.get(i);
                String name = item.select("h3").text();
                String pic = appendHeaders(selectText(item, "img&&_src||src").trim());
                String remark = "";
                try {
                    remark = item.select("span").last().ownText().trim();
                } catch (Exception ignored) {
                }
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
        String vodPic = "";
        String vodName = "";
        String vodContent = null;
        try {
            String detailUrl = baseUrl + ids.get(0);
            Document doc = Jsoup.parse(OkHttpUtil.string(detailUrl, buildHeaders()));
            try {
                vodPic = doc.select("div.img img").attr("src");
            } catch (Exception ignored) {
            }
            try {
                vodName = doc.select(".info>h1").text();
            } catch (Exception ignored) {
            }
            try {
                vodContent = doc.select("#movie_content").text();
            } catch (Exception ignored) {
                vodContent = "";
            }
            ArrayList<String> playFromList = new ArrayList<>();
            ArrayList<String> playUrlList = new ArrayList<>();
            String[] qualityPrefixes = {"", "", "mp4", "hd", "bd", "bt", "jp"};
            Elements tabs = doc.select("ul#cpage>li");
            for (int i = 0; i < tabs.size(); i++) {
                Element tab = tabs.get(i);
                String tabId = tab.select("li").attr("id");
                String tabName = tab.select("li").text();
                int qualityIndex = Integer.parseInt(tabId.substring(4));
                String tabUrl = detailUrl + "/" + qualityPrefixes[qualityIndex] + "-1";
                Elements episodes = Jsoup.parse(OkHttpUtil.string(tabUrl, buildHeaders())).select("li:has([rel])");
                if (!qualityPrefixes[qualityIndex].equals("jp")) {
                    Collections.reverse(episodes);
                }
                ArrayList<String> episodeList = new ArrayList<>();
                for (int j = 0; j < episodes.size(); j++) {
                    Element episode = episodes.get(j);
                    String epTitle = episode.select("span").get(1).text();
                    String epUrl = episode.select("a").attr("href");
                    if (epUrl.contains("jianpian")) {
                        epUrl = "tvbox-xg:" + epUrl.split("path=")[1];
                    }
                    episodeList.add(epTitle + "$" + epUrl);
                }
                playUrlList.add(TextUtils.join("#", episodeList));
                playFromList.add(tabName);
            }
            String playFrom = TextUtils.join("$$$", playFromList);
            String playUrl = TextUtils.join("$$$", playUrlList);
            JSONObject result = new JSONObject();
            JSONArray list = new JSONArray();
            JSONObject vod = new JSONObject();
            vod.put("vod_id", ids.get(0));
            vod.put("vod_name", vodName);
            vod.put("vod_pic", appendHeaders(vodPic));
            vod.put("vod_content", vodContent);
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
            String[] names = "电影&剧集&综艺&动漫&音乐MV".split("&");
            String[] ids = "movie/list/---&ju/list/----0&zy/list/----4&dm/list/----14&mv/list/---".split("&");
            for (int i = 0; i < names.length; i++) {
                JSONObject cls = new JSONObject();
                cls.put("type_id", ids[i]);
                cls.put("type_name", names[i]);
                classes.put(cls);
            }
            JSONObject result = new JSONObject();
            result.put("class", classes);
            if (filterEnabled) {
                result.put("filters", new JSONObject("{\"movie/list/---\":[{\"name\":\"分类\",\"value\":[{\"v\":\"\",\"n\":\"全部\"},{\"v\":\"movie/list/---1-\",\"n\":\"国语电影\"},{\"v\":\"movie/list/2----\",\"n\":\"喜剧片\"},{\"v\":\"movie/list/1----\",\"n\":\"动作片\"},{\"v\":\"movie/list/6----\",\"n\":\"恐怖片\"},{\"v\":\"movie/list/3----\",\"n\":\"爱情片\"},{\"v\":\"movie/list/4----\",\"n\":\"科幻片\"}],\"key\":\"cateId\"}],\"dm/list/----14\":[{\"name\":\"分类\",\"value\":[{\"v\":\"\",\"n\":\"全部\"},{\"v\":\"dm/list/l----14\",\"n\":\"连载动漫\"},{\"v\":\"dm/list/j----14\",\"n\":\"剧场版动漫\"}],\"key\":\"cateId\"}],\"ju/list/----0\":[{\"name\":\"分类\",\"value\":[{\"v\":\"\",\"n\":\"全部\"},{\"v\":\"ju/list/----9\",\"n\":\"大陆剧\"},{\"v\":\"ju/list/----11\",\"n\":\"日韩剧\"},{\"v\":\"ju/list/----12\",\"n\":\"欧美剧\"},{\"v\":\"ju/list/----10\",\"n\":\"港台剧\"}],\"key\":\"cateId\"}],\"zy/list/----4\":[],\"mv/list/---\":[]}"));
            }
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String homeVideoContent() {
        try {
            Document doc = Jsoup.parse(OkHttpUtil.string(baseUrl, buildHeaders()));
            JSONObject result = new JSONObject();
            JSONArray list = new JSONArray();
            Elements items = doc.select("div.left li");
            for (int i = 0; i < items.size(); i++) {
                Element item = items.get(i);
                String name = item.select("h3").text().trim();
                String pic = appendHeaders(item.select("img").attr("src"));
                String remark = item.selectFirst("span.tip").ownText().replace(name, "");
                String href = item.select("a").attr("href");
                JSONObject vod = new JSONObject();
                vod.put("vod_id", href);
                vod.put("vod_name", name);
                vod.put("vod_pic", pic);
                vod.put("vod_remarks", remark);
                list.put(vod);
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
        if (str.isEmpty()) {
            return;
        }
        baseUrl = str;
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
            String url = baseUrl + "/search";
            LinkedHashMap<String, String> params = new LinkedHashMap<>();
            params.put("keyword", keyword);
            Elements items = Jsoup.parse(httpPost(url, params, buildHeaders())).select("ul.search_list li");
            for (int i = 0; i < items.size(); i++) {
                Element item = items.get(i);
                String name = item.select("a").text();
                String remark = item.select("em").text();
                String href = item.select("a").attr("href");
                JSONObject vod = new JSONObject();
                vod.put("vod_id", href);
                vod.put("vod_name", name);
                vod.put("vod_pic", "");
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
