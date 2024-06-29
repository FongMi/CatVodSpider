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

public class Ysj extends Spider {

    private static final String siteUrl = "https://www.dmmiku.com";
    private static final String cateUrl = "https://www.dmmiku.com/index.php/vod/show";
    private static final String homeUrl = "https://www.dmmiku.com/index.php/vod/show/id/20.html";
    private static final String detailUrl = "https://www.dmmiku.com/index.php/vod/detail/id/";
    private static final String searchUrl = "https://www.dmmiku.com/index.php/vod/search.html";
    private static final String playUrl = "/index.php/vod/play/id/";

    private HashMap<String, String> getHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", Util.CHROME);
        return headers;
    }

    private Filter getFilter(String name, String key, List<String> texts) {
        List<Filter.Value> values = new ArrayList<>();
        for (String text : texts) {
            if (text.isEmpty()) continue;
            values.add(new Filter.Value(text, text.replace("全部", "")));
        }
        return new Filter(key, name, values);
    }

    @Override
    public String homeContent(boolean filter) {
        List<Vod> list = new ArrayList<>();
        List<Class> classes = new ArrayList<>();
        List<Filter> array = new ArrayList<>();
        LinkedHashMap<String, List<Filter>> filters = new LinkedHashMap<>();
        Document doc = Jsoup.parse(OkHttp.string(homeUrl, getHeaders()));
        array.add(getFilter("地區", "area", doc.select("div#hl03").select("a").eachText()));
        array.add(getFilter("年份", "year", doc.select("div#hl04").select("a").eachText()));
        array.add(getFilter("語言", "lang", doc.select("div#hl05").select("a").eachText()));
        array.add(getFilter("字母", "letter", doc.select("div#hl06").select("a").eachText()));
        for (Element element : doc.select("div#hl02").select("a")) {
            String typeId = element.attr("href").split("/")[5];
            typeId = typeId.contains(".html") ? "" : typeId;
            String typeName = element.text().replace("BD", "");
            classes.add(new Class(typeId, typeName));
            filters.put(typeId, array);
        }
        for (Element element : doc.select("li.vodlist_item")) {
            String id = element.select("a").attr("href").split("/")[5];
            String name = element.select("a").attr("title");
            String pic = siteUrl + element.select("a").attr("data-original");
            String remark = element.select("span.pic_text").text();
            list.add(new Vod(id, name, pic, remark));
        }
        return Result.string(classes, list, filters);
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        StringBuilder sb = new StringBuilder(cateUrl);
        if (extend.containsKey("area")) sb.append("/area/").append(extend.get("area"));
        if (tid.length() > 0) sb.append("/class/").append(tid);
        sb.append("/id/20");
        if (extend.containsKey("lang")) sb.append("/lang/").append(extend.get("lang"));
        if (extend.containsKey("letter")) sb.append("/letter/").append(extend.get("letter"));
        if (extend.containsKey("year")) sb.append("/year/").append(extend.get("year"));
        if (!pg.equals("1")) sb.append("/page/").append(pg);
        sb.append(".html");
        Document doc = Jsoup.parse(OkHttp.string(sb.toString(), getHeaders()));
        List<Vod> list = new ArrayList<>();
        for (Element element : doc.select("li.vodlist_item")) {
            String id = element.select("a").attr("href").split("/")[5];
            String name = element.select("a").attr("title");
            String pic = siteUrl + element.select("a").attr("data-original");
            String remark = element.select("span.pic_text").text();
            list.add(new Vod(id, name, pic, remark));
        }
        return Result.string(list);
    }

    @Override
    public String detailContent(List<String> ids) {
        Document doc = Jsoup.parse(OkHttp.string(detailUrl.concat(ids.get(0)), getHeaders()));
        String name = doc.select("h2.title").text();
        String pic = siteUrl + doc.select("a.vodlist_thumb").attr("data-original");
        String year = doc.select("li.data").get(0).select("a").get(0).text();
        String area = doc.select("li.data").get(0).select("a").get(1).text();
        String type = doc.select("li.data").get(0).select("a").get(2).text();
        String actor = doc.select("li.data").get(2).text().replace("主演：", "");
        String director = doc.select("li.data").get(3).text().replace("导演：", "");
        String content = doc.select("div.content_desc > span").text();

        Vod vod = new Vod();
        vod.setVodId(ids.get(0));
        vod.setVodPic(pic);
        vod.setVodYear(year);
        vod.setVodName(name);
        vod.setVodArea(area);
        vod.setVodActor(actor);
        vod.setVodContent(content);
        vod.setVodDirector(director);
        vod.setTypeName(type);

        Map<String, String> sites = new LinkedHashMap<>();
        Elements sources = doc.select("div.play_source_tab > a");
        Elements sourceList = doc.select("ul.content_playlist");
        for (int i = 0; i < sources.size(); i++) {
            Element source = sources.get(i);
            String sourceName = source.attr("alt");
            Elements playList = sourceList.get(i).select("a");
            List<String> vodItems = new ArrayList<>();
            for (int j = 0; j < playList.size(); j++) {
                Element e = playList.get(j);
                String href = e.attr("href").replace(playUrl, "");
                vodItems.add(e.text() + "$" + href);
            }
            if (vodItems.size() > 0) {
                sites.put(sourceName, TextUtils.join("#", vodItems));
            }
        }
        if (sites.size() > 0) {
            vod.setVodPlayFrom(TextUtils.join("$$$", sites.keySet()));
            vod.setVodPlayUrl(TextUtils.join("$$$", sites.values()));
        }
        return Result.string(vod);
    }

    @Override
    public String searchContent(String key, boolean quick) {
        List<Vod> list = new ArrayList<>();
        String target = searchUrl.concat("?wd=").concat(key).concat("&submit=");
        Document doc = Jsoup.parse(OkHttp.string(target, getHeaders()));
        if (doc.html().contains("很抱歉，暂无相关视频")) return Result.string(list);
        for (Element element : doc.select("li.searchlist_item")) {
            String id = element.select("a").attr("href").split("/")[5];
            String name = element.select("a").attr("title");
            String pic = siteUrl + element.select("a").attr("data-original");
            String remark = element.select("span.pic_text").text();
            list.add(new Vod(id, name, pic, remark));
        }
        return Result.string(list);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        return Result.get().url(siteUrl + playUrl + id).parse().header(getHeaders()).string();
    }
}
