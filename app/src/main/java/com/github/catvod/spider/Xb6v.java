package com.github.catvod.spider;

import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Filter;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import okhttp3.FormBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * @author zhixc
 * 新版6V电影网
 */
public class Xb6v extends Spider {

    private final String siteUrl = "https://www.xb6v.com";
    private String nextSearchUrlPrefix;
    private String nextSearchUrlSuffix;

    private Map<String, String> getHeader() {
        Map<String, String> header = new HashMap<>();
        header.put("User-Agent", Util.CHROME);
        header.put("Referer", siteUrl + "/");
        return header;
    }

    private Map<String, String> getDetailHeader() {
        Map<String, String> header = new HashMap<>();
        header.put("User-Agent", Util.CHROME);
        return header;
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        List<Class> classes = new ArrayList<>();
        String html = OkHttp.string(siteUrl, getHeader());
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

    private List<Vod> parseVodListFromDoc(String html) {
        return parseVodListFromDoc(Jsoup.parse(html));
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
        String cateId = extend.get("cateId") == null ? "" : extend.get("cateId");
        String cateUrl = siteUrl + tid + cateId;
        if (!pg.equals("1")) cateUrl += "index_" + pg + ".html";
        String html = OkHttp.string(cateUrl, getHeader());
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
        String detailUrl = siteUrl + vodId;
        String html = OkHttp.string(detailUrl, getDetailHeader());
        Document doc = Jsoup.parse(html);
        Elements sourceList = doc.select("#post_content");

        String circuitName = "磁力线路";
        Map<String, String> playMap = new LinkedHashMap<>();
        int i = 0;
        for (Element source : sourceList) {
            Elements aList = source.select("table a");
            List<String> vodItems = new ArrayList<>();
            for (Element a : aList) {
                String episodeUrl = a.attr("href");
                String episodeName = a.text();
                if (!episodeUrl.toLowerCase().startsWith("magnet")) continue;
                vodItems.add(episodeName + "$" + episodeUrl);
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
        vod.setVodPlayFrom(TextUtils.join("$$$", playMap.keySet()));
        vod.setVodPlayUrl(TextUtils.join("$$$", playMap.values()));

        return Result.string(vod);
    }

    private String getStrByRegex(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) return matcher.group(1).trim();
        return "";
    }

    private String getActorOrDirector(Pattern pattern, String str) {
        return getStrByRegex(pattern, str)
                .replaceAll("<br>", "")
                .replaceAll("&nbsp;", "")
                .replaceAll("&amp;", "")
                .replaceAll("middot;", "・")
                .replaceAll("　　　　　", ",")
                .replaceAll("　　　　 　", ",")
                .replaceAll("　", "");
    }

    private String getDescription(Pattern pattern, String str) {
        return getStrByRegex(pattern, str)
                .replaceAll("</?[^>]+>", "")
                .replaceAll("\n", "")
                .replaceAll("&amp;", "")
                .replaceAll("middot;", "・")
                .replaceAll("ldquo;", "【")
                .replaceAll("rdquo;", "】")
                .replaceAll("　", "");
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        return searchContent(key, quick, "1");
    }

    @Override
    public String searchContent(String key, boolean quick, String pg) throws Exception {
        String searchUrl = siteUrl + "/e/search/index.php";
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
            Request request = new Request.Builder().url(searchUrl)
                    .addHeader("User-Agent", Util.CHROME)
                    .addHeader("Origin", siteUrl)
                    .addHeader("Referer", siteUrl + "/")
                    .post(formBody)
                    .build();
            Response response = OkHttp.newCall(request);
            String[] split = String.valueOf(response.request().url()).split("\\?searchid=");
            nextSearchUrlPrefix = split[0] + "index.php?page=";
            nextSearchUrlSuffix = "&searchid=" + split[1];
            return Result.string(parseVodListFromDoc(response.body().string()));
        } else {
            int page = Integer.parseInt(pg) - 1;
            searchUrl = nextSearchUrlPrefix + page + nextSearchUrlSuffix;
            return Result.string(parseVodListFromDoc(OkHttp.string(searchUrl, getHeader())));
        }
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        return Result.get().url(id).string();
    }
}
