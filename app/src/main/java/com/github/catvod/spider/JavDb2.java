package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.net.OkHttp;
import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.HashMap;
import java.util.List;

public class JavDb2 extends Spider {

    private static String siteUrl = "https://javdb524.com";
    @Override
    public void init(Context context, String extend) throws Exception {
        super.init(context, extend);
        if(!extend.isEmpty()){
            this.siteUrl = extend;
        }
    }

    /*
     * 爬虫headers
     */
    private static HashMap<String, String> getHeaders(String url) {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
        headers.put("Referer", siteUrl+"/");
        return headers;
    }


    @Override
    public String homeContent(boolean z) throws Exception {
        try {
            JSONArray classes = new JSONArray();
            String[] fenleis = new String[] {"全部", "有码", "无码", "欧美",
                    "有码周榜",
                    "无码周榜"};
            String[] fenleisval = new String[] {"/", "/censored", "/uncensored", "/western",
                    "/rankings/movies?p=weekly&t=censored",
                    "/rankings/movies?p=weekly&t=uncensored",
            };
            //String[] fenleis = "全部&有玛&无玛&欧美&有玛周榜".split("&");
            //String[] fenleisval = "/&/censored&/uncensored&/western&/rankings/movies?p=weekly&t=censored".split("&");
            for (int i = 0; i < fenleis.length; i++) {
                JSONObject fenjson = new JSONObject();
                fenjson.put("type_id", fenleisval[i]);
                fenjson.put("type_name", fenleis[i]);
                fenjson.put("type_flag", "2");
                classes.put(fenjson);
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("class", classes);
            if(z) {
                jSONObject4.put("filters", new JSONObject("{}"));
            }
            return jSONObject4.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
        

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        try {
            JSONObject result = new JSONObject();
            JSONArray videos = new JSONArray();
            if(tid.startsWith("/v/")){
              if(!pg.equals("1")) return "";
              String webUrl = siteUrl+tid;
              String html = OkHttp.string(webUrl, getHeaders(siteUrl));
              Document doc = Jsoup.parse(html);
              String cover = doc.select("div.column-video-cover img").attr("src");
              String vodtitle = doc.select("div.video-detail>h2").text();
              if(html.contains("id=\"magnets-content")){
                Elements lists = doc.select("div#magnets-content div.item");
                for (int i = 0; i < lists.size(); i++) {
                  Element vod = lists.get(i);
                  //String title = vod.select("a").text();
                  String title = vod.select("a span.meta").text() + " " + vod.select("a span.name").text();
                  String link = vod.select("a").attr("href");
                  JSONObject v = new JSONObject();
                  v.put("vod_tag", "file");
                  v.put("vod_pic", "");
                  v.put("vod_id", vodtitle+"$$$"+cover+"$$$"+link);
                  v.put("vod_name", title);
                  videos.put(v);
                }
              }
            }else{
              String webUrl = siteUrl+tid+"?page="+pg;
              String html = OkHttp.string(webUrl, getHeaders(siteUrl));
              Document doc = Jsoup.parse(html);
              
              Elements list = doc.select("div.movie-list div.item");
              for (int i = 0; i < list.size(); i++) {
                Element vod = list.get(i);
                String title = vod.select(".video-title").text();
                String cover = vod.select("img").attr("src");
                String remarks = vod.select(".meta").text();
                String id = vod.select("a").attr("href");
                JSONObject v = new JSONObject();
                v.put("vod_tag", "folder");
                v.put("vod_id", id);
                v.put("vod_name", title);
                v.put("vod_pic", cover);
                v.put("vod_remarks", remarks);
                videos.put(v);
              }
            }
            result.put("page", pg);
            result.put("pagecount", Integer.MAX_VALUE);
            result.put("limit", videos.length());
            result.put("total", Integer.MAX_VALUE);
            result.put("list", videos);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        try {
            String pgurl = ids.get(0).trim();
            String cover = pgurl.split("\\$\\$\\$")[1];
            String url = pgurl.split("\\$\\$\\$")[2];
            String name = pgurl.split("\\$\\$\\$")[0];
            
            JSONObject result = new JSONObject();
            JSONArray list = new JSONArray();
            JSONObject vodAtom = new JSONObject();
            vodAtom.put("vod_id", pgurl);
            vodAtom.put("vod_name", !name.equals("") ? name : url);
            vodAtom.put("vod_pic", cover);
            vodAtom.put("type_name", "磁力链接");
            vodAtom.put("vod_content", url);
            vodAtom.put("vod_play_from", "magnet");
            vodAtom.put("vod_play_url", "立即播放$" + url);
            list.put(vodAtom);
            result.put("list", list);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        try {
            JSONObject result = new JSONObject();
            result.put("url", id);
            result.put("parse", 0);
            result.put("playUrl", "");
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }
    
    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        try {
            return "";
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }
}
