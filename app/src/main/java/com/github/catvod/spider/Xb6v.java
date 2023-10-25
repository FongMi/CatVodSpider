package com.github.catvod.spider;

import android.text.TextUtils;
import com.github.catvod.bean.Class;
import com.github.catvod.bean.Filter;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Utils;
import okhttp3.FormBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zhixc
 * 新版6V电影网
 */
public class Xb6v extends Spider {

    private final String siteURL = "http://www.xb6v.com";
    private String nextSearchURLPrefix;
    private String nextSearchURLSuffix;

    private Map<String, String> getHeader() {
        Map<String, String> header = new HashMap<>();
        header.put("User-Agent", Utils.CHROME);
        header.put("Referer", siteURL + "/");
        return header;
    }

    private Map<String, String> getDetailHeader() {
        Map<String, String> header = new HashMap<>();
        header.put("User-Agent", Utils.CHROME);
        return header;
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        List<Class> classes = new ArrayList<>();
        String html = OkHttp.string(siteURL, getHeader());
        Document doc = Jsoup.parse(html);
        Elements elements = doc.select("#menus > li > a");
        LinkedHashMap<String, List<Filter>> filters = new LinkedHashMap<>();
        for (int i = 0; i < elements.size(); i++) {
            if (i < 2 || i == elements.size() - 1) continue;
            Element e = elements.get(i);
            String typeId = e.attr("href");
            String typeName = e.text();
            if (typeName.equals("电视剧")) {
                List<Filter.Value> values = new ArrayList<>();
                values.add(new Filter.Value("不限", ""));
                for (Element a : e.nextElementSibling().select("a")) {
                    values.add(new Filter.Value(a.text(), a.attr("href").replaceAll(typeId, "")));
                }
                List<Filter> filterList = new ArrayList<>();
                filterList.add(new Filter("cateId", "类型", values));
                filters.put(typeId, filterList);
            }
            classes.add(new Class(typeId, typeName));
        }
        return Result.string(classes, parseVodListFromDoc(doc), filters);
    }

    private List<Vod> parseVodListFromDoc(Document doc) {
        Elements items = doc.select("#post_container .post_hover");
        List<Vod> list = new ArrayList<>();
        for (Element item : items) {
            Element element = item.select("[class=zoom]").get(0);
            String vodId = element.attr("href");
            String name = element.attr("title").replaceAll("</?[^>]+>", "");
            String pic = element.select("img").attr("src");
            String remark = item.select("[rel=category tag]").text();
            list.add(new Vod(vodId, name, pic, remark));
        }
        return list;
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        HashMap<String, String> ext = new HashMap<>();
        if (extend != null && extend.size() > 0) {
            ext.putAll(extend);
        }
        String cateId = ext.get("cateId") == null ? "" : ext.get("cateId");
        String cateURL = siteURL + tid + cateId;
        if (!pg.equals("1")) cateURL += "index_" + pg + ".html";
        String html = OkHttp.string(cateURL, getHeader());
        Document doc = Jsoup.parse(html);
        String href = doc.select(".pagination > a").last().attr("href");
        int page = Integer.parseInt(pg);
        int count = Integer.parseInt(getStrByRegex(Pattern.compile("index_(.*?).html"), href));
        int limit = 18;
        Elements items = doc.select("#post_container .post_hover");
        int total = page == count ? (page - 1) * limit + items.size() : count * limit;
        return Result.get().vod(parseVodListFromDoc(doc)).page(page, count, limit, total).string();
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        String vodId = ids.get(0);
        String detailURL = siteURL + vodId;
        String html = OkHttp.string(detailURL, getDetailHeader());
        Document doc = Jsoup.parse(html);
        Elements sourceList = doc.select("#post_content");

        String circuitName = "磁力线路";
        Map<String, String> playMap = new LinkedHashMap<>();
        int i = 0;
        for (Element source : sourceList) {
            Elements aList = source.select("table a");
            List<String> vodItems = new ArrayList<>();
            for (Element a : aList) {
                String episodeURL = a.attr("href");
                String episodeName = a.text();
                if (!episodeURL.toLowerCase().startsWith("magnet")) continue;
                vodItems.add(episodeName + "$" + episodeURL);
            }
            if (vodItems.size() > 0) {
                i++;
                playMap.put(circuitName + i, TextUtils.join("#", vodItems));
            }
        }

        String partHTML = doc.select(".context").html();
        String name = doc.select(".article_container > h1").text();
        String pic = doc.select("#post_content img").attr("src");
        String typeName = getStrByRegex(Pattern.compile("◎类　　别　(.*?)<br>"), partHTML);
        if (typeName.equals("")) typeName = doc.select("[rel=category tag]").text();
        String year = getStrByRegex(Pattern.compile("◎年　　代　(.*?)<br>"), partHTML);
        if (year.equals("")) year = getStrByRegex(Pattern.compile("首播:(.*?)<br>"), partHTML);
        String area = getStrByRegex(Pattern.compile("◎产　　地　(.*?)<br>"), partHTML);
        if (area.equals("")) area = getStrByRegex(Pattern.compile("地区:(.*?)<br>"), partHTML);
        String remark = getStrByRegex(Pattern.compile("◎上映日期　(.*?)<br>"), partHTML);
        String actor = getActorOrDirector(Pattern.compile("◎演　　员　(.*?)</p>"), partHTML);
        if (actor.equals("")) actor = getActorOrDirector(Pattern.compile("◎主　　演　(.*?)</p>"), partHTML);
        if (actor.equals("")) actor = getActorOrDirector(Pattern.compile("主演:(.*?)<br>"), partHTML);
        String director = getActorOrDirector(Pattern.compile("◎导　　演　(.*?)<br>"), partHTML);
        if (director.equals("")) director = getActorOrDirector(Pattern.compile("导演:(.*?)<br>"), partHTML);
        String description = getDescription(Pattern.compile("◎简　　介(.*?)<hr>", Pattern.CASE_INSENSITIVE | Pattern.DOTALL), partHTML);
        if (description.equals("")) description = getDescription(Pattern.compile("简介(.*?)</p>", Pattern.CASE_INSENSITIVE | Pattern.DOTALL), partHTML);

        Vod vod = new Vod();
        vod.setVodId(ids.get(0));
        vod.setVodName(name);
        vod.setVodPic(pic);
        vod.setTypeName(typeName);
        vod.setVodYear(year);
        vod.setVodArea(area);
        vod.setVodRemarks(remark);
        vod.setVodActor(actor);
        vod.setVodDirector(director);
        vod.setVodContent(description);
        if (playMap.size() > 0) {
            vod.setVodPlayFrom(TextUtils.join("$$$", playMap.keySet()));
            vod.setVodPlayUrl(TextUtils.join("$$$", playMap.values()));
        }
        return Result.string(vod);
    }

    private String getStrByRegex(Pattern pattern, String str) {
        try {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group(1).trim();
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    private String getActorOrDirector(Pattern pattern, String str) {
        return getStrByRegex(pattern, str)
                .replaceAll("<br>", "")
                .replaceAll("&nbsp;", "")
                .replaceAll("&amp;", "")
                .replaceAll("middot;", "・")
                .replaceAll("　　　　　", ",")
                .replaceAll("　　　　 　", ",");
    }

    private String getDescription(Pattern pattern, String str) {
        return getStrByRegex(pattern, str)
                .replaceAll("</?[^>]+>", "")
                .replaceAll("\n", "")
                .replaceAll("　　　　", "")
                .replaceAll("&amp;", "")
                .replaceAll("middot;", "・")
                .replaceAll("ldquo;", "【")
                .replaceAll("rdquo;", "】");
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        return searchContent(key, quick, "1");
    }

    @Override
    public String searchContent(String key, boolean quick, String pg) throws Exception {
        String searchURL = siteURL + "/e/search/index.php";
        String html;
        if (pg.equals("1")) {
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
                    .addHeader("User-Agent", Utils.CHROME)
                    .addHeader("Origin", siteURL)
                    .addHeader("Referer", siteURL + "/")
                    .post(formBody)
                    .build();
            Response response = OkHttp.client().newCall(request).execute();
            if (response.body() == null) return "";
            initNextSearchURL(response);
            html = response.body().string();
            response.close();
        } else {
            int page = Integer.parseInt(pg) - 1;
            searchURL = nextSearchURLPrefix + page + nextSearchURLSuffix;
            html = OkHttp.string(searchURL, getHeader());
        }
        return Result.string(parseVodListFromDoc(Jsoup.parse(html)));
    }

    private void initNextSearchURL(Response response) {
        String[] split = String.valueOf(response.request().url()).split("\\?searchid=");
        nextSearchURLPrefix = split[0] + "index.php?page=";
        nextSearchURLSuffix = "&searchid=" + split[1];
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        return Result.get().url(id).string();
    }
}
