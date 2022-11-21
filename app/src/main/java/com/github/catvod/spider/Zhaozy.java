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

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Zhaozy extends Spider {
    private static final Pattern aliyun = Pattern.compile("(https://www.aliyundrive.com/s/[^\"]+)");
    private Push Push;

    public String detailContent(List<String> list) {
        try {
            Pattern pattern = aliyun;
            if (pattern.matcher(list.get(0)).find()) {
                return Push.detailContent(list);
            }
            Matcher matcher = pattern.matcher(OkHttpUtil.string("https://zhaoziyuan.me/" + list.get(0), null));
            if (!matcher.find()) {
                return "";
            }
            list.set(0, matcher.group(1));
            return Push.detailContent(list);
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    public void init(Context context, String str) {
        super.init(context, str);
        Push = new Push();
        Push.init(context, str);
    }

    public String playerContent(String str, String str2, List<String> list) {
        return Push.playerContent(str, str2, list);
    }

    protected static HashMap<String, String> sHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.62 Safari/537.36");
        headers.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
        headers.put("Accept-encoding", "gzip, deflate, br");
        headers.put("Accept-language", "zh-SG,zh;q=0.9,en-GB;q=0.8,en;q=0.7,zh-CN;q=0.6");
        return headers;
    }

    private Pattern regexVid = Pattern.compile("(\\S+)");

    public String searchContent(String key, boolean quick) {
        try {
            String url = "https://zhaoziyuan.me/so?filename=" + URLEncoder.encode(key);
            Document docs = Jsoup.parse(OkHttpUtil.string(url, null));
            JSONObject result = new JSONObject();
            JSONArray videos = new JSONArray();
            Elements list = docs.select("div.li_con div.news_text");
            for (int i = 0; i < list.size(); i++) {
                Element doc = list.get(i);
                String sourceName = doc.select("div.news_text a h3").text();
                if (sourceName.contains(key)) {
                    String list1 = doc.select("div.news_text a").attr("href");
                    Matcher matcher = regexVid.matcher(list1);
                    if (matcher.find()) {
                        JSONObject v = new JSONObject();
                        String group = matcher.group(1);
                        String cover = "https://inews.gtimg.com/newsapp_bt/0/13263837859/1000";
                        String remark = doc.select("div.news_text a p").text();

                        v.put("vod_name", sourceName);
                        v.put("vod_remarks", remark);
                        v.put("vod_id", group);
                        v.put("vod_pic", cover);
                        videos.put(v);
                    }
                }
            }
            result.put("list", videos);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }
}