package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.utils.okhttp.OkHttpUtil;
import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MeijuTT extends Spider {

    private static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36";

    private static String baseUrl = "https://www.meijutt.tv";

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

    public String categoryContent(String cateId, String page, boolean filterEnabled, HashMap<String, String> filters) {
        try {
            JSONObject result = new JSONObject();
            JSONArray list = new JSONArray();
            String url = baseUrl + "/" + page + "_{cateId}______.html";
            if (filterEnabled && filters != null && filters.size() > 0) {
                for (String key : filters.keySet()) {
                    String value = filters.get(key);
                    if (value.length() > 0) {
                        url = url.replace("{" + key + "}", value);
                    }
                }
            }
            Document doc = Jsoup.parse(OkHttpUtil.string(url.replaceAll("\\{cateId\\}", cateId), buildHeaders()));
            Elements items = doc.select("div.list3_cn_box div.cn_box2");
            for (int i = 0; i < items.size(); i++) {
                Element item = items.get(i);
                String name = item.select("a").attr("title");
                String pic = item.select("img").attr("src");
                String remark = item.select(".list_20 li").get(1).ownText();
                String href = item.select("a").attr("href");
                JSONObject vod = new JSONObject();
                vod.put("vod_id", href);
                vod.put("vod_name", name);
                vod.put("vod_pic", appendHeaders(pic));
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
            String html = OkHttpUtil.string(baseUrl + ids.get(0), buildHeaders());
            Document doc = Jsoup.parse(html);
            String pic = doc.select("div.o_big_img_bg_b>img").attr("src");
            String name = doc.select("div.info-title>h1").text();
            ArrayList<String> playFromList = new ArrayList<>();
            ArrayList<String> playUrlList = new ArrayList<>();
            if (html.contains("class=\"down_list")) {
                Elements sourceBlocks = doc.select("div.down_list");
                Elements sourceNames = doc.select("div.from-tabs .downcili-ico,.down-ico");
                for (int i = 0; i < sourceBlocks.size(); i++) {
                    String sourceName = sourceNames.get(i).ownText();
                    Elements episodes = sourceBlocks.get(i).select("li");
                    ArrayList<String> episodeList = new ArrayList<>();
                    for (int j = 0; j < episodes.size(); j++) {
                        Element ep = episodes.get(j);
                        episodeList.add(ep.select("a").text() + "$" + ep.select("a").attr("href"));
                    }
                    playUrlList.add(TextUtils.join("#", episodeList));
                    for (int k = 0; k < playFromList.size(); k++) {
                        if (sourceName.equals(playFromList.get(k))) {
                            sourceName = sourceName + "" + (i + 1);
                        }
                    }
                    playFromList.add(sourceName);
                }
            }
            String playFrom = TextUtils.join("$$$", playFromList);
            String playUrl = TextUtils.join("$$$", playUrlList);
            JSONObject result = new JSONObject();
            JSONArray list = new JSONArray();
            JSONObject vod = new JSONObject();
            vod.put("vod_id", ids.get(0));
            vod.put("vod_name", name);
            vod.put("vod_pic", appendHeaders(pic));
            vod.put("vod_content", "");
            vod.put("type_name", "");
            vod.put("vod_play_from", playFrom);
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
            String[] names = "全部&魔幻科幻&灵异惊悚&都市情感&犯罪历史&选秀综艺&动漫卡通".split("&");
            String[] ids = "&1&2&3&4&5&6".split("&");
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
            String url = baseUrl + "/sousuo/index.asp?page=1&searchword=" + URLEncoder.encode(keyword, "gb2312") + "&searchtype=-1";
            Document doc = Jsoup.parse(OkHttpUtil.string(url, buildHeaders()));
            Elements items = doc.select("div.list3_cn_box div.cn_box2");
            for (int i = 0; i < items.size(); i++) {
                Element item = items.get(i);
                String name = item.select("a").attr("title");
                String pic = item.select("img").attr("src");
                String remark = item.select(".list_20 li").get(1).ownText();
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
