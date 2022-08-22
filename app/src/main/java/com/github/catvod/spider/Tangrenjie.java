package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.net.OkHttpUtil;

import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 不知名
 */
public class Tangrenjie extends Spider {

    private static final String siteUrl = "https://www.tangrenjie.tv";
    private final Pattern regexCategory = Pattern.compile("/vod/type/id/(\\d+).html");
    private final Pattern regexVid = Pattern.compile("/vod/detail/id/(\\d+).html");
    private final Pattern regexPlay = Pattern.compile("/vod/play/id/(\\d+)/sid/(\\d+)/nid/(\\d+).html");
    private final Pattern regexPage = Pattern.compile("\\S+/page/(\\d+)\\S+");
    private JSONObject playerConfig;
    private JSONObject filterConfig;

    @Override
    public void init(Context context) {
        super.init(context);
        try {
            playerConfig = new JSONObject("{\"if101\":{\"show\":\"蓝光一\",\"des\":\"\",\"ps\":\"0\",\"parse\":\"\",\"or\":999}}");
            filterConfig = new JSONObject("{\"1\":[{\"key\":\"cateId\",\"name\":\"分类\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"动作片\",\"v\":\"6\"},{\"n\":\"喜剧片\",\"v\":\"7\"},{\"n\":\"爱情片\",\"v\":\"8\"},{\"n\":\"科幻片\",\"v\":\"9\"},{\"n\":\"恐怖片\",\"v\":\"10\"},{\"n\":\"剧情片\",\"v\":\"11\"},{\"n\":\"战争片\",\"v\":\"12\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2000\",\"v\":\"2000\"},{\"n\":\"1997\",\"v\":\"1997\"},{\"n\":\"1980\",\"v\":\"1980\"}]},{\"key\":\"by\",\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}],\"2\":[{\"key\":\"cateId\",\"name\":\"分类\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"国产剧\",\"v\":\"13\"},{\"n\":\"港台剧\",\"v\":\"14\"},{\"n\":\"日韩剧\",\"v\":\"15\"},{\"n\":\"欧美剧\",\"v\":\"16\"},{\"n\":\"海外剧\",\"v\":\"27\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"欧美\",\"v\":\"欧美\"},{\"n\":\"韩国\",\"v\":\"韩国\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2000\",\"v\":\"2000\"},{\"n\":\"1997\",\"v\":\"1997\"},{\"n\":\"1980\",\"v\":\"1980\"}]},{\"key\":\"by\",\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}],\"4\":[{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"欧美\",\"v\":\"欧美\"},{\"n\":\"韩国\",\"v\":\"韩国\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2000\",\"v\":\"2000\"},{\"n\":\"1997\",\"v\":\"1997\"},{\"n\":\"1980\",\"v\":\"1980\"}]},{\"key\":\"by\",\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}],\"3\":[{\"key\":\"cateId\",\"name\":\"分类\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"纪录片\",\"v\":\"28\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2000\",\"v\":\"2000\"},{\"n\":\"1997\",\"v\":\"1997\"},{\"n\":\"1980\",\"v\":\"1980\"}]},{\"key\":\"by\",\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}]}");
        } catch (JSONException e) {
            SpiderDebug.log(e);
        }
    }

    private HashMap<String, String> getHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.114 Safari/537.36");
        headers.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
        headers.put("Accept-Language", "zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2");
        return headers;
    }

    @Override
    public String homeContent(boolean filter) {
        Document doc = Jsoup.parse(OkHttpUtil.string(siteUrl, getHeaders()));
        Elements elements = doc.select("ul.top_nav li a");
        List<Class> classes = new ArrayList<>();
        for (Element ele : elements) {
            Elements b = ele.select("b");
            String name = b.text();
            boolean show = name.equals("电影") || name.equals("电视剧") || name.equals("动漫") || name.equals("综艺");
            if (show) {
                Matcher mather = regexCategory.matcher(ele.attr("href"));
                if (!mather.find()) continue;
                String id = mather.group(1).trim();
                classes.add(new Class(id, name));
            }
        }
        Element homeList = doc.select("div.cbox1").get(1);
        Elements list = homeList.select("ul.vodlist li.vodlist_item");
        List<Vod> videos = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Element vod = list.get(i);
            String title = vod.selectFirst("a.vodlist_thumb").attr("title");
            String cover = siteUrl + vod.selectFirst("a.vodlist_thumb").attr("data-original");
            String remark = vod.select("span.pic_text b").text();
            Matcher matcher = regexVid.matcher(vod.selectFirst("a.vodlist_thumb").attr("href"));
            if (!matcher.find()) continue;
            String id = "1=" + matcher.group(1);
            videos.add(new Vod(id, title, cover, remark));
        }
        Result result = new Result();
        result.setFilters(filterConfig);
        result.setClasses(classes);
        result.setList(videos);
        return result.toString();
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        StringBuilder url = new StringBuilder(siteUrl + "/vod/show/id/");
        if (extend != null && extend.size() > 0 && extend.containsKey("tid") && extend.get("tid").length() > 0) {
            url.append(extend.get("tid"));
        } else {
            url.append(tid);
        }
        if (extend != null && extend.size() > 0) {
            for (String key : extend.keySet()) {
                String value = extend.get(key);
                if (TextUtils.isEmpty(value)) continue;
                url.append("/").append(key).append("/").append(URLEncoder.encode(value));
            }
        }
        url.append("/page/").append(pg).append(".html");
        String html = OkHttpUtil.string(url.toString(), getHeaders());
        Document doc = Jsoup.parse(html);
        List<Vod> videos = new ArrayList<>();
        if (!html.contains("没有找到您想要的结果哦")) {
            Elements list = doc.select("ul.vodlist li.vodlist_item");
            for (int i = 0; i < list.size(); i++) {
                Element vod = list.get(i);
                String title = vod.selectFirst("a.vodlist_thumb").attr("title");
                String cover = siteUrl + vod.selectFirst("a.vodlist_thumb").attr("data-original");
                String remark = vod.select("span.pic_text b").text();
                Matcher matcher = regexVid.matcher(vod.selectFirst("a.vodlist_thumb").attr("href"));
                if (!matcher.find()) continue;
                String id = tid + "=" + matcher.group(1);
                videos.add(new Vod(id, title, cover, remark));
            }
        }
        Result result = new Result();
        result.setList(videos);
        return result.toString();
    }

    @Override
    public String detailContent(List<String> ids) {
        String[] idd = ids.get(0).split("=");
        String tid = idd[0];
        String detail = idd[1];
        String url = siteUrl + "/vod/detail/id/" + detail + ".html";
        String htmltemp = OkHttpUtil.string(url, getHeaders());
        String htmlsrc = "";
        if (tid.equals("1")) {
            htmlsrc = htmltemp.substring(0, 25000);
        } else {
            htmlsrc = htmltemp;
        }
        Document doc = Jsoup.parse(htmlsrc);
        Result result = new Result();
        String vid = doc.selectFirst("div.content_thumb a").attr("href");
        String cover = siteUrl + doc.selectFirst("div.content_thumb a").attr("data-original");
        String title = doc.selectFirst("div.content_thumb a").attr("title");
        String desc = doc.selectFirst("div.content > section > font").text();
        String category = "", area = "", year = "", director = "", actor = "", remark = "";
        remark = doc.select("span.data_style b").text();
        Elements span_text_muted = doc.select("li.data span");
        for (int i = 0; i < span_text_muted.size() - 2; i++) {
            Element text = span_text_muted.get(i);
            String info = text.text();
            if (info.contains("类型")) {
                try {
                    String cate = text.parent().text();
                    category = cate.substring(3);
                } catch (Exception e) {
                    category = "";
                }
            } else if (info.contains("年份")) {
                try {
                    year = text.parent().select("a").get(0).text();
                } catch (Exception e) {
                    year = "";
                }
            } else if (info.contains("地区")) {
                try {
                    area = text.parent().select("a").get(0).text();
                } catch (Exception e) {
                    area = "";
                }
            }
        }
        List<String> actors = new ArrayList<>();
        Elements aa = doc.select("li.data").get(0).select("a");
        for (int j = 0; j < aa.size(); j++) actors.add(aa.get(j).text());
        actor = TextUtils.join(",", actors);
        List<String> directors = new ArrayList<>();
        Elements bb = doc.select("li.data").get(1).select("a");
        for (int j = 0; j < bb.size(); j++) directors.add(bb.get(j).text());
        director = TextUtils.join(",", directors);

        Vod vod = new Vod();
        vod.setVodId(vid);
        vod.setVodName(title);
        vod.setVodPic(cover);
        vod.setTypeName(category);
        vod.setVodYear(year);
        vod.setVodArea(area);
        vod.setVodRemarks(remark);
        vod.setVodActor(actor);
        vod.setVodDirector(director);
        vod.setVodContent(desc);

        Map<String, String> vod_play = new TreeMap<>((o1, o2) -> {
            try {
                int sort1 = playerConfig.getJSONObject(o1).getInt("or");
                int sort2 = playerConfig.getJSONObject(o2).getInt("or");
                if (sort1 == sort2) return 1;
                return sort1 - sort2 > 0 ? 1 : -1;
            } catch (JSONException e) {
                SpiderDebug.log(e);
            }
            return 0;
        });

        Elements sources = doc.select("div.play_source_tab a");
        Elements sourceList = doc.select("div.playlist_full");
        for (int i = 0; i < sources.size(); i++) {
            Element source = sources.get(i);
            String sourceName = source.attr("alt");
            sourceName = sourceName.replaceAll("[^\u4E00-\u9FA5]", "");
            boolean found = false;
            for (Iterator<String> it = playerConfig.keys(); it.hasNext(); ) {
                try {
                    String flag = it.next();
                    if (playerConfig.getJSONObject(flag).getString("show").equals(sourceName)) {
                        sourceName = flag;
                        found = true;
                        break;
                    }
                } catch (Exception ignored) {
                }
            }
            if (!found) continue;
            String playList = "";
            Elements playListA = sourceList.get(i).select("ul>li>a");
            List<String> vodItems = new ArrayList<>();
            for (int j = 0; j < playListA.size(); j++) {
                Element element = playListA.get(j);
                Matcher matcher = regexPlay.matcher(element.attr("href"));
                if (!matcher.find()) continue;
                String playURL = matcher.group(1) + "/sid/" + matcher.group(2) + "/nid/" + matcher.group(3);
                vodItems.add(element.text() + "$" + playURL + "=" + tid);
            }
            if (vodItems.size() > 0) playList = TextUtils.join("#", vodItems);
            if (playList.length() == 0) continue;
            vod_play.put(sourceName, playList);
        }
        if (vod_play.size() > 0) {
            vod.setVodPlayFrom(TextUtils.join("$$$", vod_play.keySet()));
            vod.setVodPlayUrl(TextUtils.join("$$$", vod_play.values()));
        }
        result.setList(Arrays.asList(vod));
        return result.toString();
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        try {
            String[] idd = id.split("=");
            String tid = idd[1];
            String detail = idd[0];
            String url = siteUrl + "/vod/play/id/" + detail + ".html";
            String htmltemp = OkHttpUtil.string(url, getHeaders());
            String htmlsrc = "";
            if (tid.equals("1")) {
                htmlsrc = htmltemp.substring(0, 25000);
            } else {
                htmlsrc = htmltemp;
            }
            Document doc = Jsoup.parse(htmlsrc);
            Elements allScript = doc.select("script");
            JSONObject result = new JSONObject();
            for (int i = 0; i < allScript.size(); i++) {
                String scContent = allScript.get(i).toString();
                if (scContent.contains("var player_")) { // 取直链
                    int start = scContent.indexOf('{');
                    int end = scContent.lastIndexOf('}') + 1;
                    String json = scContent.substring(start, end);
                    JSONObject player = new JSONObject(json);
                    String urlsrc = player.getString("url");
                    String urlb64 = new String(Base64.decode(urlsrc.getBytes(), Base64.DEFAULT));
                    String urldec = URLDecoder.decode(urlb64, "UTF-8");
                    result.put("parse", 0);
                    result.put("playUrl", "");
                    result.put("url", urldec);
                    result.put("header", "");
                    break;
                }
            }
            String uu = result.getString("url");
            if (!(uu.length() > 0)) {
                result.put("parse", 1);
                result.put("url", url);
            }
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    @Override
    public String searchContent(String key, boolean quick) {
        String url = siteUrl + "/vod/search.html?wd=" + URLEncoder.encode(key) + "&submit=";
        String html = OkHttpUtil.string(url, getHeaders());
        Document doc = Jsoup.parse(html);
        Result result = new Result();
        List<Vod> videos = new ArrayList<>();
        Elements list = doc.select("li.searchlist_item");
        for (int i = 0; i < list.size(); i++) {
            Element vod = list.get(i);
            String classes = vod.selectFirst("h4.vodlist_title > a >span").text();
            String tid = "";
            switch (classes) {
                case "电影":
                    tid = "1";
                    break;
                case "电视剧":
                    tid = "2";
                    break;
                case "综艺":
                    tid = "3";
                    break;
                case "动漫":
                    tid = "4";
                    break;
            }
            String title = vod.selectFirst("a.vodlist_thumb").attr("title");
            String cover = siteUrl + vod.selectFirst("a.vodlist_thumb").attr("data-original");
            String remark = vod.select("span.pic_text").text();
            Matcher matcher = regexVid.matcher(vod.selectFirst("a.vodlist_thumb").attr("href"));
            if (!matcher.find()) continue;
            String id = tid + "=" + matcher.group(1);
            videos.add(new Vod(id, title, cover, remark));
        }
        result.setList(videos);
        return result.toString();
    }
}
