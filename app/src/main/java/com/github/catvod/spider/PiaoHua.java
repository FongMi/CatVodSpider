package com.github.catvod.spider;

import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.URLEncoder;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @author zhixc
 * 新飘花电影网
 */
public class PiaoHua extends Spider {

    private final String siteURL = "https://www.xpiaohua.com";

    private final String userAgent = "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.71 Safari/537.36";

    @Override
    public String homeContent(boolean filter) {
        try {
            JSONArray classes = new JSONArray();
            List<String> typeIds = Arrays.asList("/dongzuo/", "/xiju/", "/aiqing/", "/kehuan/", "/juqing/", "/xuanyi/", "/zhanzheng/", "/kongbu/", "/zainan/", "/dongman/", "/jilu/");
            List<String> typeNames = Arrays.asList("动作片", "喜剧片", "爱情片", "科幻片", "剧情片", "悬疑片", "战争片", "恐怖片", "灾难片", "动漫", "纪录片");
            for (int i = 0; i < typeIds.size(); i++) {
                JSONObject obj = new JSONObject();
                obj.put("type_id", typeIds.get(i));
                obj.put("type_name", typeNames.get(i));
                classes.put(obj);
            }
            JSONObject result = new JSONObject()
                    .put("class", classes);
            return result.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        try {
            // 第一页
            // https://www.xpiaohua.com/column/xiju/
            // 第二页
            // https://www.xpiaohua.com/column/xiju/list_2.html
            String cateURL = siteURL + "/column" + tid;
            if (!pg.equals("1")) {
                cateURL += "/list_" + pg + ".html";
            }
            String html = getWebContent(cateURL);
            JSONArray videos = new JSONArray();
            Elements items = Jsoup.parse(html).select("#list dl");
            for (Element item : items) {
                String vid = item.select("strong a").attr("href");
                String name = item.select("strong").text();
                String pic = item.select("img").attr("src");
                JSONObject vod = new JSONObject()
                        .put("vod_id", vid)
                        .put("vod_name", name)
                        .put("vod_pic", pic)
                        .put("vod_remarks", "");
                videos.put(vod);
            }

            JSONObject result = new JSONObject()
                    .put("pagecount", 999)
                    .put("list", videos);
            return result.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    private String getWebContent(String targetURL) throws Exception {
        Request request = new Request.Builder()
                .addHeader("User-Agent", userAgent)
                .get()
                .url(targetURL)
                .build();
        OkHttpClient okHttpClient = OkHttp.client();
        Response response = okHttpClient.newCall(request).execute();
        if (response.body() == null) return "";
        byte[] bytes = response.body().bytes();
        response.close();
        return new String(bytes, "gb2312");
    }

    @Override
    public String detailContent(List<String> ids) {
        try {
            String detailURL = ids.get(0);
            String html = getWebContent(detailURL);
            Document doc = Jsoup.parse(html);
            String vod_play_url = "";
            String vod_play_from = "magnet";
            Elements aList = doc.select("table").get(0).select("a");
            List<String> vodItems = new ArrayList<>();
            for (Element element : aList) {
                String episodeURL = element.attr("href");
                if (!episodeURL.startsWith("magnet")) continue;
                String episodeName = getEpisodeName(episodeURL);
                vodItems.add(episodeName + "$" + episodeURL);
            }
            if (vodItems.size() > 0) {
                vod_play_url = TextUtils.join("#", vodItems);
            }

            String name = doc.select("h3").text();
            String pic = doc.select("#showinfo img").attr("src");
            String typeName = getStrByRegex(Pattern.compile("◎类　　别　(.*?)<br"), html);
            String year = getStrByRegex(Pattern.compile("◎年　　代　(.*?)<br"), html);
            String area = getStrByRegex(Pattern.compile("◎产　　地　(.*?)<br"), html);
            String remark = getStrByRegex(Pattern.compile("◎上映日期　(.*?)<br"), html);
            String actor = getActorStr(html);
            String director = getDirectorStr(Pattern.compile("◎导　　演　(.*?)<br"), html);
            String description = getDescription(Pattern.compile("◎简　　介(.*?)◎", Pattern.CASE_INSENSITIVE | Pattern.DOTALL), html);
            JSONObject vod = new JSONObject()
                    .put("vod_id", ids.get(0))
                    .put("vod_name", name)
                    .put("vod_pic", pic)
                    .put("type_name", typeName)
                    .put("vod_year", year)
                    .put("vod_area", area)
                    .put("vod_remarks", remark)
                    .put("vod_actor", actor)
                    .put("vod_director", director)
                    .put("vod_content", description);
            if (vod_play_url.length() > 0) {
                vod.put("vod_play_from", vod_play_from);
                vod.put("vod_play_url", vod_play_url);
            }

            JSONArray jsonArray = new JSONArray().put(vod);
            JSONObject result = new JSONObject()
                    .put("list", jsonArray);
            return result.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    private static String getEpisodeName(String episodeURL) {
        try {
            return episodeURL.split("&dn=")[1];
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "第1集";
    }

    private String getDescription(Pattern pattern, String html) {
        return getStrByRegex(pattern, html).replaceAll("</?[^>]+>", "");
    }

    private String getDirectorStr(Pattern pattern, String html) {
        return getStrByRegex(pattern, html)
                .replaceAll("&middot;", "·");
    }

    private String getActorStr(String html) {
        Pattern p1 = Pattern.compile("◎演　　员　(.*?)◎");
        Pattern p2 = Pattern.compile("◎主　　演　(.*?)◎");
        String actor = getStrByRegex(p1, html).equals("") ? getStrByRegex(p2, html) : "";
        return actor.replaceAll("</?[^>]+>", "")
                .replaceAll("　　　　　", "")
                .replaceAll("&middot;", "·");
    }

    private String getStrByRegex(Pattern pattern, String html) {
        try {
            Matcher matcher = pattern.matcher(html);
            if (matcher.find()) return matcher.group(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    @Override
    public String searchContent(String key, boolean quick) {
        try {
            String searchURL = siteURL + "/plus/search.php?q=" + URLEncoder.encode(key, "GBK") + "&searchtype.x=0&searchtype.y=0";
            String html = getWebContent(searchURL);
            JSONArray videos = new JSONArray();
            Elements items = Jsoup.parse(html).select("#list dl");
            for (Element item : items) {
                String vid = item.select("strong a").attr("href");
                String name = item.select("strong").text();
                String pic = item.select("img").attr("src");
                JSONObject vod = new JSONObject()
                        .put("vod_id", vid)
                        .put("vod_name", name)
                        .put("vod_pic", pic)
                        .put("vod_remarks", "");
                videos.put(vod);
            }
            JSONObject result = new JSONObject()
                    .put("list", videos);
            return result.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        try {
            JSONObject result = new JSONObject()
                    .put("parse", 0)
                    .put("header", "")
                    .put("playUrl", "")
                    .put("url", id);
            return result.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
