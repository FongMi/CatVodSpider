package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.bean.Class;
import com.github.catvod.bean.Vod;
import com.github.catvod.bean.Result;

import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ys21 extends Spider {

    private String siteURL;

    private final String userAgent = "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36 Edg/120.0.0.0";

    private Map<String, String> getHeader() {
        Map<String, String> header = new HashMap<>();
        header.put("User-Agent", userAgent);
        header.put("Referer", siteURL + "/text/index.html");
        return header;
    }

    @Override
    public void init(Context context, String extend) throws Exception {
        super.init(context, extend);
        // 域名经常性发生变化，通过外部配置文件传入，可以方便修改
        if (extend.endsWith("/")) {
            extend = extend.substring(0, extend.lastIndexOf("/"));
        }
        siteURL = extend;
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        List<Class> classes = new ArrayList<>();
        List<String> typeIds = Arrays.asList("1", "2", "3", "4", "5", "6");
        List<String> typeNames = Arrays.asList("电影", "电视剧", "综艺", "动漫", "热门短剧", "体育赛事");
        for (int i = 0; i < typeIds.size(); i++) {
            classes.add(new Class(typeIds.get(i), typeNames.get(i)));
        }
        String f = "{\"1\":[{\"key\":\"cate_id\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"0\"},{\"n\":\"电影\",\"v\":\"39\"},{\"n\":\"动作片\",\"v\":\"9\"},{\"n\":\"喜剧片\",\"v\":\"10\"},{\"n\":\"爱情片\",\"v\":\"11\"},{\"n\":\"恐怖片\",\"v\":\"12\"},{\"n\":\"剧情片\",\"v\":\"13\"},{\"n\":\"科幻片\",\"v\":\"14\"},{\"n\":\"惊悚片\",\"v\":\"15\"},{\"n\":\"奇幻片\",\"v\":\"16\"},{\"n\":\"动画片\",\"v\":\"17\"},{\"n\":\"悬疑片\",\"v\":\"18\"},{\"n\":\"冒险片\",\"v\":\"19\"},{\"n\":\"纪录片\",\"v\":\"20\"},{\"n\":\"战争片\",\"v\":\"21\"},{\"n\":\"犯罪片\",\"v\":\"43\"},{\"n\":\"灾难片\",\"v\":\"55\"}]}],\"2\":[{\"key\":\"cate_id\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"0\"},{\"n\":\"电视剧\",\"v\":\"22\"},{\"n\":\"国产剧\",\"v\":\"9\"},{\"n\":\"香港剧\",\"v\":\"23\"},{\"n\":\"台湾剧\",\"v\":\"24\"},{\"n\":\"欧美剧\",\"v\":\"25\"},{\"n\":\"日本剧\",\"v\":\"26\"},{\"n\":\"韩国剧\",\"v\":\"27\"},{\"n\":\"泰国剧\",\"v\":\"28\"},{\"n\":\"海外剧\",\"v\":\"29\"}]}],\"3\":[{\"key\":\"cate_id\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"0\"},{\"n\":\"综艺\",\"v\":\"41\"},{\"n\":\"大陆综艺\",\"v\":\"30\"},{\"n\":\"港台综艺\",\"v\":\"31\"},{\"n\":\"日韩综艺\",\"v\":\"32\"},{\"n\":\"欧美综艺\",\"v\":\"33\"},{\"n\":\"海外综艺\",\"v\":\"34\"},{\"n\":\"演唱会\",\"v\":\"47\"}]}],\"4\":[{\"key\":\"cate_id\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"0\"},{\"n\":\"动漫\",\"v\":\"42\"},{\"n\":\"国产动漫\",\"v\":\"35\"},{\"n\":\"日韩动漫\",\"v\":\"36\"},{\"n\":\"欧美动漫\",\"v\":\"37\"},{\"n\":\"海外动漫\",\"v\":\"38\"},{\"n\":\"港台动漫\",\"v\":\"46\"}]}],\"5\":[{\"key\":\"cate_id\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"0\"},{\"n\":\"短剧\",\"v\":\"54\"}]}],\"6\":[{\"key\":\"cate_id\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"0\"},{\"n\":\"影视解说\",\"v\":\"45\"}]}],\"7\":[{\"key\":\"cate_id\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"0\"},{\"n\":\"体育赛事\",\"v\":\"50\"},{\"n\":\"篮球赛事\",\"v\":\"51\"},{\"n\":\"足球赛事\",\"v\":\"52\"},{\"n\":\"斯诺克\",\"v\":\"53\"}]}]}";
        JSONObject filterConfig = new JSONObject(f);
        Document doc = Jsoup.parse(OkHttp.string(siteURL, getHeader()));
        ArrayList<Vod> list = new ArrayList<Vod>();
        for (Element li : doc.select(".myui-vodlist .myui-vodlist__box")) {
            String vid = li.select("a").first().attr("href");
            String name = li.select(".myui-vodlist__detail .title a").first().text();
            String pic = siteURL + li.select(".myui-vodlist__thumb").first().attr("data-original");
            String remark = "";
            list.add(new Vod(vid, name, pic, remark));
        }

        return Result.string(classes, list, filterConfig);
    }

    @Override
    public String homeVideoContent() throws Exception {
        String hotURL = siteURL + "/label/new.html";
        String html = OkHttp.string(hotURL, getHeader());
        Elements lis = Jsoup.parse(html)
                .select("[class=module-items module-poster-items]")
                .get(0)
                .select(".module-item");
        JSONArray videos = new JSONArray();
        for (Element li : lis) {
            String vid = siteURL + li.attr("href");
            String name = li.attr("title");
            String pic = li.select("img").attr("data-original");
            String remark = li.select("[class=module-item-note]").text();
            JSONObject vod = new JSONObject()
                    .put("vod_id", vid)
                    .put("vod_name", name)
                    .put("vod_pic", pic)
                    .put("vod_remarks", remark);
            videos.put(vod);
        }
        JSONObject result = new JSONObject()
                .put("list", videos);
        return result.toString();
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend)
            throws Exception {
        // 筛选处理 start
        HashMap<String, String> ext = new HashMap<>();
        if (extend != null && extend.size() > 0) {
            ext.putAll(extend);
        }

        String cateId = ext.get("cate_id") == null ? "0" : ext.get("cateId");

        String cateURL = siteURL
                + String.format("/vod/index.html?cate_id=%s&type_id=%s&page=%s", cateId, tid, pg);
        Document doc = Jsoup.parse(OkHttp.string(cateURL, getHeader()));
        Elements elements = doc.select("ul.myui-vodlist >li");
        JSONArray videos = new JSONArray();
        for (Element element : elements) {
            String vodId = element.select(".myui-vodlist__box >a").attr("href");
            String vodPic = siteURL
                    + element.select(".myui-vodlist__box >a .myui-vodlist__thumb").attr("data-original");
            String vodName = element.select(".myui-vodlist__detail .title >a").text();

            JSONObject vod = new JSONObject()
                    .put("vod_id", vodId)
                    .put("vod_name", vodName)
                    .put("vod_pic", vodPic)
                    .put("vod_remarks", "");
            videos.put(vod);
        }

        JSONObject result = new JSONObject()
                .put("pagecount", 999)
                .put("list", videos);

        return result.toString();
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        String html = OkHttp.string(siteURL + ids.get(0), getHeader());
        Document doc = Jsoup.parse(html);
        String name = doc.select(".myui-content__detail .title").text();
        String pic = siteURL + doc.select(".myui-content__thumb .myui-vodlist__thumb > img").attr("src");

        String typeName = ""; // 影片类型

        String year = doc.selectFirst("p.data:has(span.text-muted:contains(上映)) > span.text-red").ownText(); // 影片年代
        String area = ""; // 地区
        String remark = "";
        String actor = doc.selectFirst("p.data:has(span.text-muted:contains(主演))").ownText();
        String director = doc.selectFirst("p.data:has(span.text-muted:contains(导演))").ownText();
        String description = doc.selectFirst("p.data:has(span.text-muted:contains(简介)) > span.jianjie").text();

        Vod vod = new Vod();
        vod.setVodId(ids.get(0)); // 必填
        vod.setVodName(name);
        vod.setVodPic(pic);
        vod.setTypeName(typeName); // 选填
        vod.setVodYear(year); // 选填
        vod.setVodArea(area); // 选填
        vod.setVodRemarks(remark); // 选填
        vod.setVodActor(actor); // 选填
        vod.setVodDirector(director); // 选填
        vod.setVodContent(description); // 选填
        // vod.setVodPlayFrom("ys21");

        Map<String, String> sites = new LinkedHashMap<>();
        Elements sources = doc.select("ul.nav > li");
        Elements sourceList = doc.select("ul.myui-content__list");
        for (int i = 0; i < sources.size(); i++) {
            Element source = sources.get(i);
            String sourceName = source.text();
            Elements playList = sourceList.get(i).select("a");
            List<String> vodItems = new ArrayList<>();
            for (int j = 0; j < playList.size(); j++) {
                Element e = playList.get(j);
                vodItems.add(e.text() + "$" + e.attr("href"));
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
    public String searchContent(String key, boolean quick) throws Exception {
        String searchURL = null;
        searchURL = siteURL + "/search/index.html?keyword=" + URLEncoder.encode(key);

        Document doc = Jsoup.parse(OkHttp.string(searchURL, getHeader()));
        ArrayList<Vod> list = new ArrayList<Vod>();
        Elements elements = doc.select("ul.myui-vodlist__media >li.clearfix");

        for (Element element : elements) {
            String vodId = element.select(".thumb >a").attr("href");
            String vodPic = siteURL + element.select(".thumb >a .myui-vodlist__thumb").attr("data-original");
            String vodName = element.select(".detail .title >a").text();
            Vod vod = new Vod();
            vod.setVodId(vodId); // 必填
            vod.setVodName(vodName);
            vod.setVodPic(vodPic);
            list.add(vod);
        }

        return Result.string(list);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        String playPageURL = siteURL + id;
        Map<String, String> header = getHeader();
        String html = OkHttp.string(playPageURL, header);

        Pattern pattern = Pattern.compile("var temCurVodFile = \"(.*?)\";");
        Matcher matcher = pattern.matcher(html);
        if (matcher.find()) {
            // 提取到temCurVodFile的值
            String temCurVodFile = matcher.group(1);

            JSONObject result = new JSONObject()
                    .put("parse", 0)
                    .put("header", header.toString())
                    .put("playUrl", "")
                    .put("url", temCurVodFile);
            return result.toString();
        }

        return "";
    }
}
