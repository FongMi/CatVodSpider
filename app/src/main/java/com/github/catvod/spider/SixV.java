package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import okhttp3.*;
import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zhixc
 * 6V电影网（新版页面）
 */
public class SixV extends Spider {

    private String siteURL;

    private final String userAgent = "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.71 Safari/537.36";

    private Map<String, String> getHeader() {
        Map<String, String> header = new HashMap<>();
        header.put("User-Agent", userAgent);
        header.put("Referer", siteURL + "/");
        return header;
    }

    private Map<String, String> getDetailHeader() {
        Map<String, String> header = new HashMap<>();
        header.put("User-Agent", userAgent);
        return header;
    }

    @Override
    public void init(Context context, String extend) {
        super.init(context, extend);
        if (extend.endsWith("/")) {
            extend = extend.substring(0, extend.lastIndexOf("/"));
        }
        siteURL = extend;
    }

    @Override
    public String homeContent(boolean filter) {
        try {
            JSONArray classes = new JSONArray();
            List<String> typeIds = Arrays.asList("xijupian", "dongzuopian", "aiqingpian", "kehuanpian", "kongbupian", "juqingpian", "zhanzhengpian", "jilupian", "donghuapian", "dianshiju/guoju", "dianshiju/rihanju", "dianshiju/oumeiju");
            List<String> typeNames = Arrays.asList("喜剧片", "动作片", "爱情片", "科幻片", "恐怖片", "剧情片", "战争片", "纪录片", "动画片", "国剧", "日韩剧", "欧美剧");
            for (int i = 0; i < typeIds.size(); i++) {
                JSONObject c = new JSONObject();
                c.put("type_id", typeIds.get(i));
                c.put("type_name", typeNames.get(i));
                classes.put(c);
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
            String cateURL = siteURL + "/" + tid;
            if (!pg.equals("1")) {
                cateURL += "/index_" + pg + ".html";
            }
            String html = OkHttp.string(cateURL, getHeader());
            Elements items = Jsoup.parse(html).select("#post_container .post_hover");
            JSONArray videos = new JSONArray();
            for (Element item : items) {
                Element li = item.select("[class=zoom]").get(0);
                String vid = li.attr("href");
                String name = li.attr("title");
                String pic = li.select("img").attr("src");
                String remark = item.select("[rel=category tag]").text();

                JSONObject vod = new JSONObject()
                        .put("vod_id", vid)
                        .put("vod_name", name)
                        .put("vod_pic", pic)
                        .put("vod_remarks", remark);
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

    @Override
    public String detailContent(List<String> ids) {
        try {
            String vid = ids.get(0);
            String detailURL = siteURL + vid;
            String html = OkHttp.string(detailURL, getDetailHeader());
            Document doc = Jsoup.parse(html);
            Elements sourceList = doc.select("#post_content");

            String vod_play_from = "magnet";
            Map<String, String> playMap = new LinkedHashMap<>();
            int i = 0;
            for (Element source : sourceList) {
                i++;
                Elements aList = source.select("table a");
                List<String> vodItems = new ArrayList<>();
                for (Element a : aList) {
                    String episodeURL = a.attr("href");
                    String episodeName = a.text();
                    if (!episodeURL.startsWith("magnet")) continue;
                    vodItems.add(episodeName + "$" + episodeURL);
                }
                if (vodItems.size() > 0) {
                    playMap.put(vod_play_from + i, TextUtils.join("#", vodItems));
                }
            }

            String partHTML = doc.select(".context").html();
            String name = doc.select(".article_container > h1").text();
            String pic = doc.select("#post_content img").attr("src");
            String typeName = getStrByRegex(Pattern.compile("◎类　　别　(.*?)<br>"), partHTML);
            String year = getStrByRegex(Pattern.compile("◎年　　代　(.*?)<br>"), partHTML);
            String area = getStrByRegex(Pattern.compile("◎产　　地　(.*?)<br>"), partHTML);
            String remark = getStrByRegex(Pattern.compile("◎上映日期　(.*?)<br>"), partHTML);
            String actor = getActorOrDirector(Pattern.compile("◎演　　员　(.*?)</p>"), partHTML);
            if (actor.equals("")) {
                actor = getActorOrDirector(Pattern.compile("◎主　　演　(.*?)</p>"), partHTML);
            }
            String director = getActorOrDirector(Pattern.compile("◎导　　演　(.*?)<br>"), partHTML);
            String description = getDescription(Pattern.compile("◎简　　介(.*?)<hr>", Pattern.CASE_INSENSITIVE | Pattern.DOTALL), partHTML);

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
            if (playMap.size() > 0) {
                vod.put("vod_play_from", TextUtils.join("$$$", playMap.keySet()));
                vod.put("vod_play_url", TextUtils.join("$$$", playMap.values()));
            }

            JSONArray jsonArray = new JSONArray().put(vod);
            JSONObject result = new JSONObject().put("list", jsonArray);
            return result.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    private String getStrByRegex(Pattern pattern, String str) {
        try {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group(1).trim();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    private String getActorOrDirector(Pattern pattern, String str) {
        return getStrByRegex(pattern, str)
                .replaceAll("<br>", "")
                .replaceAll("&nbsp;", "")
                .replaceAll("&amp;", "")
                .replaceAll("middot;", "・")
                .replaceAll("　　　　　", ",");
    }

    private String getDescription(Pattern pattern, String str) {
        return getStrByRegex(pattern, str)
                .replaceAll("</?[^>]+>", "")  // 去掉 html 标签
                .replaceAll("\n", "") // 去掉换行符
                .replaceAll("　　　　", "")
                .replaceAll("&amp;", "")
                .replaceAll("middot;", "・")
                .replaceAll("ldquo;", "【")
                .replaceAll("rdquo;", "】");
    }

    @Override
    public String searchContent(String key, boolean quick) {
        try {
            String searchURL = siteURL + "/e/search/index.php";
            RequestBody formBody = new FormBody.Builder()
                    .add("show", "title")
                    .add("tempid", "1")
                    .add("tbname", "article")
                    .add("mid", "1")
                    .add("dopost", "search")
                    .add("submit", "")
                    .addEncoded("keyboard", key)
                    .build();
            Request request = new Request.Builder()
                    .url(searchURL)
                    .addHeader("User-Agent", userAgent)
                    .addHeader("Origin", siteURL)
                    .addHeader("Referer", siteURL + "/")
                    .post(formBody)
                    .build();
            OkHttpClient okHttpClient = OkHttp.client();
            Response response = okHttpClient.newCall(request).execute();
            if (response.body() == null) return "";
            String html = response.body().string();
            response.close(); // 关闭响应资源
            Elements items = Jsoup.parse(html).select("#post_container [class=zoom]");
            JSONArray videos = new JSONArray();
            for (Element item : items) {
                String vid = item.attr("href");
                String name = item.attr("title").replaceAll("</?[^>]+>", "");
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
