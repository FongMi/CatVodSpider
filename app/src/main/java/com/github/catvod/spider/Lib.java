package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.C0082OO;
import com.github.catvod.spider.merge.C0093Tt;
import com.github.catvod.spider.merge.C0106ZJ;
import com.github.catvod.spider.merge.C0116dX;
import com.github.catvod.spider.merge.C0127lK;
import com.github.catvod.spider.merge.C0152vp;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * LibVio spider for libvio.cc movie/TV site.
 * Deobfuscated from XOR short-array obfuscation.
 */
public class Lib extends Spider {

    private static final String BASE_URL = "https://www.libvio.cc/";

    // Regex patterns for URL parsing
    private static final Pattern PATTERN_TYPE_PAGE = Pattern.compile("/type/(\\d+).html");
    private static final Pattern PATTERN_DETAIL_HREF = Pattern.compile("/detail/(\\d+).html");
    private static final Pattern PATTERN_PLAY_URL = Pattern.compile("/play/(\\d+)-(\\d+)-(\\d+).html");
    private static final Pattern PATTERN_SHOW_URL = Pattern.compile("/show/(\\S+).html");
    private static final Pattern PATTERN_PLAYER_CONFIG = Pattern.compile(
            "MacPlayerConfig.player_list=(\\{.*\\})\\,MacPlayerConfig.downer_list=");
    private static final Pattern PATTERN_URL_VALUE = Pattern.compile("\"url\": *\"([^\"]*)\",");
    private static final Pattern PATTERN_TOKEN_VALUE = Pattern.compile("\"token\": *\"([^\"]*)\"");
    private static final Pattern PATTERN_VKEY_VALUE = Pattern.compile("\"vkey\": *\"([^\"]*)\",");
    private static final Pattern PATTERN_PLAY_URL_SRC = Pattern.compile(
            "src=\"*([^\"]*)'\\+MacPlayer.PlayUrl");

    // Cached player config JSON parsed from page
    private JSONObject playerConfig;

    // Category filter definitions
    private JSONObject filterConfig;

    // HTTP headers
    private static final String USER_AGENT_CHROME =
            "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 "
            + "(KHTML, like Gecko) Chrome/102.0.5005.62 Safari/537.36";
    private static final String USER_AGENT_MAC =
            "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 "
            + "(KHTML, like Gecko) Chrome/91.0.4472.114 Safari/537.36";
    private static final String ACCEPT_HTML =
            "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,"
            + "image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9";
    private static final String ACCEPT_LANG_ZH =
            "zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2";

    // CSS selectors
    private static final String SELECTOR_PAGE_ITEMS = "ul.stui-page__item li";
    private static final String SELECTOR_VOD_BOX = "div.stui-vodlist__box";
    private static final String SELECTOR_VOD_LIST = "ul.stui-vodlist";
    private static final String SELECTOR_NAV_MENU = "ul.stui-header__menu li a";
    private static final String SELECTOR_PIC_LINK = "a .pic-text";
    private static final String SELECTOR_BODY_SCRIPT = "body>script";

    // JSON keys for API response
    private static final String KEY_VOD_ID = "vod_id";
    private static final String KEY_VOD_NAME = "vod_name";
    private static final String KEY_VOD_PIC = "vod_pic";
    private static final String KEY_VOD_REMARKS = "vod_remarks";
    private static final String KEY_PAGE = "page";
    private static final String KEY_PAGECOUNT = "pagecount";
    private static final String KEY_LIMIT = "limit";
    private static final String KEY_TOTAL = "total";
    private static final String KEY_LIST = "list";
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_PIC = "pic";

    protected String mDetailId = null;

    /**
     * Build default HTTP headers for category/home page requests.
     */
    private static HashMap<String, String> buildDefaultHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", USER_AGENT_CHROME);
        return headers;
    }

    /**
     * Build HTTP headers for main site requests (with referer).
     */
    private HashMap<String, String> buildSiteHeaders(String url) {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("method", "GET");
        headers.put("Upgrade-Insecure-Requests", "1");
        headers.put("DNT", "1");
        headers.put("referer", BASE_URL);
        headers.put("User-Agent", USER_AGENT_MAC);
        headers.put("Accept", ACCEPT_HTML);
        headers.put("Accept-Language", "Accept-Language");
        return headers;
    }

    /**
     * Build HTTP headers for detail/play page requests.
     */
    private HashMap<String, String> buildDetailHeaders(String url) {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("method", "GET");
        headers.put("Upgrade-Insecure-Requests", "1");
        headers.put("DNT", "1");
        headers.put("User-Agent", USER_AGENT_MAC);
        headers.put("Accept", ACCEPT_HTML);
        headers.put("Accept-Language", ACCEPT_LANG_ZH);
        headers.put("referer", BASE_URL);
        return headers;
    }

    /**
     * Extract first regex group match, or return original string if not found.
     */
    private static String extractGroup(Pattern pattern, String str) {
        if (pattern == null) return str;
        try {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group(1).trim();
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return str;
    }

    /**
     * Reverses a string.
     */
    public static String strReverse(String str) {
        int length = str.length();
        String result = "";
        for (int i = 0; i < length; i++) {
            result = result + str.charAt((length - i) - 1);
        }
        return result;
    }

    /**
     * Decode hex-encoded string (each 2 hex chars = 1 char).
     */
    public static String decodeHexStr(String str) {
        String result = "";
        int length = str.length();
        for (int i = 0; i < length; i += 2) {
            result = result + ((char) Integer.parseInt(str.substring(i, i + 2), 16));
        }
        return result;
    }

    /**
     * Decode obfuscated URL string by extracting middle portion,
     * swapping halves, and recombining.
     */
    public static String decodeUrlStr(String str) {
        int halfLen = str.length() / 2;
        int firstEnd = halfLen - 7;
        int secondStart = halfLen + 7;
        String first = str.substring(0, firstEnd);
        String second = str.substring(secondStart);
        return first + second;
    }

    @Override
    public String categoryContent(String str, String str2, boolean z,
                                  HashMap<String, String> map) throws JSONException, NumberFormatException {
        String separator = "-";
        try {
            String[] urlParts = {"", "", "", "", "", "", "", "", "", "", "", ""};
            urlParts[0] = str;
            urlParts[8] = str2;
            if (map != null && map.size() > 0) {
                Iterator<String> it = map.keySet().iterator();
                while (it.hasNext()) {
                    String key = it.next();
                    urlParts[Integer.parseInt(key)] = URLEncoder.encode(map.get(key));
                }
            }
            String url = BASE_URL + "show/" + TextUtils.join(separator, urlParts) + ".html";
            String html = C0106ZJ.m484FN(url, buildSiteHeaders(url));
            C0082OO document = C0093Tt.m440q(html);
            JSONObject result = new JSONObject();

            // Parse pagination
            C0116dX pageItems = document.m654b(SELECTOR_PAGE_ITEMS);
            int pageCount = pageItems.size();
            String aHref = "href";
            String aTag = "a";
            int currentPage = -1;
            int totalCount = 0;

            for (int i = 0; i < pageItems.size(); i++) {
                C0127lK item = pageItems.get(i);
                C0127lK link = item.m667pt(aTag);
                if (link == null) {
                    continue;
                }
                String text = link.m653a();
                if (item.m670wt("active")) {
                    Matcher matcher = PATTERN_SHOW_URL.matcher(link.mo126QU(aHref));
                    if (matcher.find()) {
                        currentPage = Integer.parseInt(matcher.group(1).split(separator)[8]);
                    } else {
                        currentPage = 0;
                    }
                }
                if (text.equals("尾页")) {
                    Matcher matcher = PATTERN_SHOW_URL.matcher(link.mo126QU(aHref));
                    if (matcher.find()) {
                        totalCount = Integer.parseInt(matcher.group(1).split(separator)[8]);
                    }
                }
            }

            // Parse video list
            JSONArray listArray = new JSONArray();
            if (!html.contains("没有找到您想要的结果哦")) {
                C0116dX listItems = document.m654b(SELECTOR_VOD_BOX);
                for (int i = 0; i < listItems.size(); i++) {
                    C0127lK item = listItems.get(i);
                    String imgTitle = item.m654b(aTag).m595q("title");
                    String imgSrc = item.m654b(aTag).m595q("data-original");
                    String linkHref = item.m654b(SELECTOR_PIC_LINK).m596u();
                    Matcher matcher = PATTERN_DETAIL_HREF.matcher(item.m654b(aTag).m595q(aHref));
                    if (matcher.find()) {
                        String vodId = matcher.group(1);
                        JSONObject vodObj = new JSONObject();
                        vodObj.put(KEY_VOD_ID, vodId);
                        vodObj.put(KEY_VOD_NAME, imgTitle);
                        vodObj.put(KEY_VOD_PIC, imgSrc);
                        vodObj.put(KEY_VOD_REMARKS, linkHref);
                        listArray.put(vodObj);
                    }
                }
            }

            if (currentPage == -1) currentPage = Integer.parseInt(str2);
            if (totalCount == 0) totalCount = currentPage;

            result.put(KEY_PAGE, currentPage);
            result.put(KEY_PAGECOUNT, totalCount);
            result.put(KEY_LIMIT, 48);
            String totalKey = KEY_TOTAL;
            int totalItems;
            if (totalCount > 1) {
                totalItems = totalCount * 48;
            } else {
                totalItems = listArray.length();
            }
            result.put(totalKey, totalItems);
            result.put(KEY_LIST, listArray);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /**
     * Detail page: fetch video info and episode list.
     * Reconstructed from the same patterns used in categoryContent/homeContent.
     */
    public String detailContent(List<String> ids) throws JSONException {
        try {
            String detailUrl = BASE_URL + "detail/" + ids.get(0) + ".html";
            String html = C0106ZJ.m484FN(detailUrl, buildDetailHeaders(detailUrl));
            C0082OO document = C0093Tt.m440q(html);

            // Extract main video info
            JSONObject videoInfo = new JSONObject();
            C0127lK infoEl = document.m654b("div.stui-content__thumb").get(0);
            String vodPic = infoEl.m654b("a img").m595q("data-original");
            String vodName = infoEl.m654b("a img").m595q("title");
            String vodId = ids.get(0);

            // Extract description/details from the info panel
            C0127lK detailEl = document.m654b("div.stui-content__detail").get(0);
            String vodRemarks = "";
            try {
                vodRemarks = detailEl.m654b("p.data").m653a();
            } catch (Exception ignored) {
            }
            String vodContent = "";
            try {
                vodContent = detailEl.m654b("span.sketch-content").m653a();
            } catch (Exception ignored) {
            }

            // Parse episode sources
            JSONArray sourceArray = new JSONArray();
            JSONArray sourceNameArray = new JSONArray();
            C0116dX sourceTabs = document.m654b("div.stui-vodlist__head");
            for (int s = 0; s < sourceTabs.size(); s++) {
                C0127lK tabEl = sourceTabs.get(s);
                String sourceName = tabEl.m654b("h3").m653a();
                C0116dX epLinks = tabEl.m654b("ul li a");
                JSONArray episodeArray = new JSONArray();
                for (int e = 0; e < epLinks.size(); e++) {
                    C0127lK epLink = epLinks.get(e);
                    String epName = epLink.m653a();
                    String epHref = epLink.mo126QU("href");
                    Matcher playMatcher = PATTERN_PLAY_URL.matcher(epHref);
                    if (playMatcher.find()) {
                        JSONObject epObj = new JSONObject();
                        epObj.put(KEY_VOD_NAME, epName);
                        epObj.put("vod_play_url", epHref);
                        episodeArray.put(epObj);
                    }
                }
                sourceArray.put(episodeArray.toString());
                sourceNameArray.put(sourceName);
            }

            // Build result
            videoInfo.put(KEY_VOD_ID, vodId);
            videoInfo.put(KEY_VOD_NAME, vodName);
            videoInfo.put(KEY_VOD_PIC, vodPic);
            videoInfo.put(KEY_VOD_REMARKS, vodRemarks);
            videoInfo.put("vod_content", vodContent);
            videoInfo.put("vod_play_from", TextUtils.join("$$$", sourceNameArray));
            videoInfo.put("vod_play_url", TextUtils.join("$$$", sourceArray));

            JSONArray resultList = new JSONArray();
            resultList.put(videoInfo);
            JSONObject result = new JSONObject();
            result.put(KEY_LIST, resultList);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /**
     * Home page: return categories and banner/list content.
     */
    public String homeContent(boolean z) throws JSONException {
        String homeUrl = BASE_URL;
        String aTag = "a";
        try {
            C0082OO document = C0093Tt.m440q(C0106ZJ.m484FN(homeUrl, buildSiteHeaders(homeUrl)));

            // Parse navigation categories
            C0116dX navItems = document.m654b(SELECTOR_NAV_MENU);
            JSONArray classesArray = new JSONArray();
            Iterator<C0127lK> it = navItems.iterator();
            while (it.hasNext()) {
                C0127lK next = it.next();
                String navText = next.m653a();
                boolean isCategory = false;
                if (navText.equals("电影")) isCategory = true;
                else if (navText.equals("剧集")) isCategory = true;
                else if (navText.equals("动漫")) isCategory = true;
                else if (navText.equals("日韩剧")) isCategory = true;
                else if (navText.equals("欧美剧")) isCategory = true;
                if (isCategory) {
                    String href = next.mo126QU("href");
                    Matcher matcher = PATTERN_TYPE_PAGE.matcher(href);
                    if (matcher.find()) {
                        String typeId = matcher.group(1).trim();
                        JSONObject classObj = new JSONObject();
                        classObj.put("type_id", typeId);
                        classObj.put("type_name", navText);
                        classesArray.put(classObj);
                    }
                }
            }

            JSONObject resultObj = new JSONObject();
            if (z) {
                resultObj.put("filters", filterConfig);
            }
            resultObj.put("class", classesArray);

            // Parse banner/list items
            try {
                C0116dX listItems = document.m654b(SELECTOR_VOD_LIST).get(0)
                        .m654b(SELECTOR_VOD_BOX);
                JSONArray listArray = new JSONArray();
                for (int i = 0; i < listItems.size(); i++) {
                    C0127lK item = listItems.get(i);
                    String title = item.m654b(aTag).m595q("title");
                    String imgSrc = item.m654b(aTag).m595q("data-original");
                    String linkHref = item.m654b(SELECTOR_PIC_LINK).m596u();
                    Matcher matcher = PATTERN_DETAIL_HREF
                            .matcher(item.m654b(aTag).m595q("href"));
                    if (matcher.find()) {
                        String vodId = matcher.group(1);
                        JSONObject vodObj = new JSONObject();
                        vodObj.put(KEY_VOD_ID, vodId);
                        vodObj.put(KEY_VOD_NAME, title);
                        vodObj.put(KEY_VOD_PIC, imgSrc);
                        vodObj.put(KEY_VOD_REMARKS, linkHref);
                        listArray.put(vodObj);
                    }
                }
                resultObj.put(KEY_LIST, listArray);
            } catch (Exception e) {
                SpiderDebug.log(e);
            }

            return resultObj.toString();
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }

    @Override
    public void init(Context context, String str) {
        super.init(context, str);
        try {
            Matcher matcher = PATTERN_PLAYER_CONFIG.matcher(
                    C0106ZJ.m484FN(C0152vp.m724Mo(str), buildSiteHeaders("")));
            if (matcher.find()) {
                playerConfig = new JSONObject(matcher.group(1));
            }
            filterConfig = new JSONObject("{\"1\":[{\"key\":\"3\",\"name\":"
                    + "\"类型\",\"value\":[{\"n\":\"全部\","
                    + "\"v\":\"\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},"
                    + "{\"n\":\"爱情\",\"v\":\"爱情\"},"
                    + "{\"n\":\"恐怖\",\"v\":\"恐怖\"},"
                    + "{\"n\":\"动作\",\"v\":\"动作\"},"
                    + "{\"n\":\"科幻\",\"v\":\"科幻\"},"
                    + "{\"n\":\"剧情\",\"v\":\"剧情\"},"
                    + "{\"n\":\"战争\",\"v\":\"战争\"},"
                    + "{\"n\":\"警匪\",\"v\":\"警匪\"},"
                    + "{\"n\":\"犯罪\",\"v\":\"犯罪\"},"
                    + "{\"n\":\"动画\",\"v\":\"动画\"},"
                    + "{\"n\":\"奇幻\",\"v\":\"奇幻\"},"
                    + "{\"n\":\"武侠\",\"v\":\"武侠\"},"
                    + "{\"n\":\"冒险\",\"v\":\"冒险\"},"
                    + "{\"n\":\"枪战\",\"v\":\"枪战\"},"
                    + "{\"n\":\"恐怖\",\"v\":\"恐怖\"},"
                    + "{\"n\":\"悬疑\",\"v\":\"悬疑\"},"
                    + "{\"n\":\"惊悚\",\"v\":\"惊悚\"},"
                    + "{\"n\":\"经典\",\"v\":\"经典\"},"
                    + "{\"n\":\"青春\",\"v\":\"青春\"},"
                    + "{\"n\":\"文艺\",\"v\":\"文艺\"},"
                    + "{\"n\":\"微电影\",\"v\":\"微电影\"},"
                    + "{\"n\":\"古装\",\"v\":\"古装\"},"
                    + "{\"n\":\"历史\",\"v\":\"历史\"},"
                    + "{\"n\":\"运动\",\"v\":\"运动\"},"
                    + "{\"n\":\"农村\",\"v\":\"农村\"},"
                    + "{\"n\":\"儿童\",\"v\":\"儿童\"}]},"
                    + "{\"key\":\"1\",\"name\":\"地区\","
                    + "\"value\":[{\"n\":\"全部\",\"v\":\"\"},"
                    + "{\"n\":\"中国大陆\","
                    + "\"v\":\"中国大陆\"},"
                    + "{\"n\":\"中国香港\","
                    + "\"v\":\"中国香港\"},"
                    + "{\"n\":\"中国台湾\","
                    + "\"v\":\"中国台湾\"},"
                    + "{\"n\":\"美国\",\"v\":\"美国\"},"
                    + "{\"n\":\"法国\",\"v\":\"法国\"},"
                    + "{\"n\":\"英国\",\"v\":\"英国\"},"
                    + "{\"n\":\"日本\",\"v\":\"日本\"},"
                    + "{\"n\":\"韩国\",\"v\":\"韩国\"},"
                    + "{\"n\":\"德国\",\"v\":\"德国\"},"
                    + "{\"n\":\"泰国\",\"v\":\"泰国\"},"
                    + "{\"n\":\"印度\",\"v\":\"印度\"},"
                    + "{\"n\":\"意大利\",\"v\":\"意大利\"},"
                    + "{\"n\":\"西班牙\",\"v\":\"西班牙\"},"
                    + "{\"n\":\"加拿大\",\"v\":\"加拿大\"},"
                    + "{\"n\":\"其他\",\"v\":\"其他\"}]},"
                    + "{\"key\":\"11\",\"name\":\"年份\","
                    + "\"value\":[{\"n\":\"全部\",\"v\":\"\"},"
                    + "{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},"
                    + "{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},"
                    + "{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},"
                    + "{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},"
                    + "{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},"
                    + "{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},"
                    + "{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},"
                    + "{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},"
                    + "{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},"
                    + "{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},"
                    + "{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},"
                    + "{\"n\":\"2000\",\"v\":\"2000\"}]},"
                    + "{\"key\":\"4\",\"name\":\"语言\","
                    + "\"value\":[{\"n\":\"全部\",\"v\":\"\"},"
                    + "{\"n\":\"英语\",\"v\":\"英语\"},"
                    + "{\"n\":\"韩语\",\"v\":\"韩语\"},"
                    + "{\"n\":\"日语\",\"v\":\"日语\"},"
                    + "{\"n\":\"法语\",\"v\":\"法语\"},"
                    + "{\"n\":\"泰语\",\"v\":\"泰语\"},"
                    + "{\"n\":\"德语\",\"v\":\"德语\"},"
                    + "{\"n\":\"印度语\",\"v\":\"印度语\"},"
                    + "{\"n\":\"国语\",\"v\":\"国语\"},"
                    + "{\"n\":\"粤语\",\"v\":\"粤语\"},"
                    + "{\"n\":\"俄语\",\"v\":\"俄语\"},"
                    + "{\"n\":\"西班牙语\","
                    + "\"v\":\"西班牙语\"},"
                    + "{\"n\":\"意大利语\","
                    + "\"v\":\"意大利语\"},"
                    + "{\"n\":\"其它\",\"v\":\"其它\"}]},"
                    + "{\"key\":\"2\",\"name\":\"排序\","
                    + "\"value\":[{\"n\":\"时间\",\"v\":\"time\"},"
                    + "{\"n\":\"人气\",\"v\":\"hits\"},"
                    + "{\"n\":\"评分\",\"v\":\"score\"}]}],"
                    + "\"2\":[{\"key\":\"3\",\"name\":\"类型\",\"value\":["
                    + "{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"古装\",\"v\":\"古装\"},"
                    + "{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"青春偶像\",\"v\":\"青春偶像\"},"
                    + "{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"家庭\",\"v\":\"家庭\"},"
                    + "{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"动作\",\"v\":\"动作\"},"
                    + "{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},"
                    + "{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"经典\",\"v\":\"经典\"},"
                    + "{\"n\":\"乡村\",\"v\":\"乡村\"},{\"n\":\"情景\",\"v\":\"情景\"},"
                    + "{\"n\":\"商战\",\"v\":\"商战\"},{\"n\":\"网剧\",\"v\":\"网剧\"},"
                    + "{\"n\":\"其他\",\"v\":\"其他\"}]},"
                    + "{\"key\":\"1\",\"name\":\"地区\",\"value\":["
                    + "{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"中国大陆\",\"v\":\"中国大陆\"},"
                    + "{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},"
                    + "{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"日本\",\"v\":\"日本\"},"
                    + "{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},"
                    + "{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"新加坡\",\"v\":\"新加坡\"},"
                    + "{\"n\":\"其他\",\"v\":\"其他\"}]},"
                    + "{\"key\":\"4\",\"name\":\"语言\",\"value\":["
                    + "{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"英语\",\"v\":\"英语\"},"
                    + "{\"n\":\"韩语\",\"v\":\"韩语\"},{\"n\":\"日语\",\"v\":\"日语\"},"
                    + "{\"n\":\"法语\",\"v\":\"法语\"},{\"n\":\"泰语\",\"v\":\"泰语\"},"
                    + "{\"n\":\"德语\",\"v\":\"德语\"},{\"n\":\"印度语\",\"v\":\"印度语\"},"
                    + "{\"n\":\"国语\",\"v\":\"国语\"},{\"n\":\"粤语\",\"v\":\"粤语\"},"
                    + "{\"n\":\"俄语\",\"v\":\"俄语\"},{\"n\":\"西班牙语\",\"v\":\"西班牙语\"},"
                    + "{\"n\":\"意大利语\",\"v\":\"意大利语\"},{\"n\":\"其它\",\"v\":\"其它\"}]},"
                    + "{\"key\":\"11\",\"name\":\"年份\",\"value\":["
                    + "{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},"
                    + "{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},"
                    + "{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},"
                    + "{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},"
                    + "{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},"
                    + "{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},"
                    + "{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},"
                    + "{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},"
                    + "{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},"
                    + "{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},"
                    + "{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},"
                    + "{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}]},"
                    + "{\"key\":\"2\",\"name\":\"排序\",\"value\":["
                    + "{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},"
                    + "{\"n\":\"评分\",\"v\":\"score\"}]}],"
                    + "\"4\":[{\"key\":\"3\",\"name\":\"类型\",\"value\":["
                    + "{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"情感\",\"v\":\"情感\"},"
                    + "{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"热血\",\"v\":\"热血\"},"
                    + "{\"n\":\"推理\",\"v\":\"推理\"},{\"n\":\"搞笑\",\"v\":\"搞笑\"},"
                    + "{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"萝莉\",\"v\":\"萝莉\"},"
                    + "{\"n\":\"校园\",\"v\":\"校园\"},{\"n\":\"动作\",\"v\":\"动作\"},"
                    + "{\"n\":\"机战\",\"v\":\"机战\"},{\"n\":\"运动\",\"v\":\"运动\"},"
                    + "{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"少年\",\"v\":\"少年\"},"
                    + "{\"n\":\"少女\",\"v\":\"少女\"},{\"n\":\"社会\",\"v\":\"社会\"},"
                    + "{\"n\":\"原创\",\"v\":\"原创\"},{\"n\":\"亲子\",\"v\":\"亲子\"},"
                    + "{\"n\":\"益智\",\"v\":\"益智\"},{\"n\":\"励志\",\"v\":\"励志\"},"
                    + "{\"n\":\"其他\",\"v\":\"其他\"}]},"
                    + "{\"key\":\"1\",\"name\":\"地区\",\"value\":["
                    + "{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"中国\",\"v\":\"中国\"},"
                    + "{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"欧美\",\"v\":\"欧美\"},"
                    + "{\"n\":\"其他\",\"v\":\"其他\"}]},"
                    + "{\"key\":\"11\",\"name\":\"年份\",\"value\":["
                    + "{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},"
                    + "{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},"
                    + "{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},"
                    + "{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},"
                    + "{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},"
                    + "{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},"
                    + "{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},"
                    + "{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},"
                    + "{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},"
                    + "{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},"
                    + "{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},"
                    + "{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}]},"
                    + "{\"key\":\"2\",\"name\":\"排序\",\"value\":["
                    + "{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},"
                    + "{\"n\":\"评分\",\"v\":\"score\"}]}],"
                    + "\"15\":[{\"key\":\"3\",\"name\":\"类型\",\"value\":["
                    + "{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"古装\",\"v\":\"古装\"},"
                    + "{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"青春偶像\",\"v\":\"青春偶像\"},"
                    + "{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"家庭\",\"v\":\"家庭\"},"
                    + "{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"动作\",\"v\":\"动作\"},"
                    + "{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},"
                    + "{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"经典\",\"v\":\"经典\"},"
                    + "{\"n\":\"乡村\",\"v\":\"乡村\"},{\"n\":\"情景\",\"v\":\"情景\"},"
                    + "{\"n\":\"商战\",\"v\":\"商战\"},{\"n\":\"网剧\",\"v\":\"网剧\"},"
                    + "{\"n\":\"惊悚\",\"v\":\"惊悚\"},{\"n\":\"其他\",\"v\":\"其他\"}]},"
                    + "{\"key\":\"1\",\"name\":\"地区\",\"value\":["
                    + "{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"日本\",\"v\":\"日本\"},"
                    + "{\"n\":\"韩国\",\"v\":\"韩国\"}]},"
                    + "{\"key\":\"11\",\"name\":\"年份\",\"value\":["
                    + "{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},"
                    + "{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},"
                    + "{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},"
                    + "{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},"
                    + "{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},"
                    + "{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},"
                    + "{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},"
                    + "{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},"
                    + "{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},"
                    + "{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},"
                    + "{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},"
                    + "{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}]},"
                    + "{\"key\":\"2\",\"name\":\"排序\",\"value\":["
                    + "{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},"
                    + "{\"n\":\"评分\",\"v\":\"score\"}]}],"
                    + "\"16\":[{\"key\":\"3\",\"name\":\"类型\",\"value\":["
                    + "{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"古装\",\"v\":\"古装\"},"
                    + "{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"青春偶像\",\"v\":\"青春偶像\"},"
                    + "{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"家庭\",\"v\":\"家庭\"},"
                    + "{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"动作\",\"v\":\"动作\"},"
                    + "{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},"
                    + "{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"经典\",\"v\":\"经典\"},"
                    + "{\"n\":\"乡村\",\"v\":\"乡村\"},{\"n\":\"情景\",\"v\":\"情景\"},"
                    + "{\"n\":\"商战\",\"v\":\"商战\"},{\"n\":\"网剧\",\"v\":\"网剧\"},"
                    + "{\"n\":\"其他\",\"v\":\"其他\"}]},"
                    + "{\"key\":\"1\",\"name\":\"地区\",\"value\":["
                    + "{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"美国\",\"v\":\"美国\"},"
                    + "{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"德国\",\"v\":\"德国\"},"
                    + "{\"n\":\"加拿大\",\"v\":\"加拿大\"},{\"n\":\"其他\",\"v\":\"其他\"}]},"
                    + "{\"key\":\"11\",\"name\":\"年份\",\"value\":["
                    + "{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},"
                    + "{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},"
                    + "{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},"
                    + "{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},"
                    + "{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},"
                    + "{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},"
                    + "{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},"
                    + "{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},"
                    + "{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},"
                    + "{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},"
                    + "{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},"
                    + "{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}]},"
                    + "{\"key\":\"4\",\"name\":\"语言\",\"value\":["
                    + "{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"国语\",\"v\":\"国语\"},"
                    + "{\"n\":\"日语\",\"v\":\"日语\"},{\"n\":\"英语\",\"v\":\"英语\"},"
                    + "{\"n\":\"其他\",\"v\":\"其他\"}]},"
                    + "{\"key\":\"2\",\"name\":\"排序\",\"value\":["
                    + "{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},"
                    + "{\"n\":\"评分\",\"v\":\"score\"}]}]}");
        } catch (JSONException e) {
            SpiderDebug.log(e);
        }
    }

    /**
     * Player page: resolve the actual video playback URL.
     */
    public String playerContent(String str, String str2, List<String> list) throws JSONException {
        String fromKey = "from";
        try {
            // Build default header config for the player
            JSONObject headerConfig = new JSONObject();
            headerConfig.put("User-Agent", USER_AGENT_MAC);
            headerConfig.put("Accept", " */*");
            headerConfig.put("Accept-Language", " zh-CN,zh;q=0.9,en-US;q=0.8,en;q=0.7");
            headerConfig.put("Accept-Encoding", " identity;q=1, *;q=0");
            headerConfig.put("Sec-Fetch-Dest", " video");
            headerConfig.put("Sec-Fetch-Mode", " no-cors");
            headerConfig.put("Sec-Fetch-Site", " cross-site");

            String playUrl = BASE_URL + "//play/" + str2 + ".html";
            C0082OO document = C0093Tt.m440q(C0106ZJ.m484FN(playUrl, buildDetailHeaders(playUrl)));
            JSONObject result = new JSONObject();

            // Look for embedded player script
            C0116dX scripts = document.m654b("script");
            for (int i = 0; i < scripts.size(); i++) {
                String scriptContent = scripts.get(i).m671y().trim();
                if (scriptContent.startsWith("var player_")) {
                    // Extract the JSON config from player_xxx={...}
                    JSONObject playerObj = new JSONObject(
                            scriptContent.substring(
                                    scriptContent.indexOf('{'),
                                    scriptContent.lastIndexOf('}') + 1));

                    boolean hasConfig = playerConfig.has(playerObj.optString(fromKey));
                    if (hasConfig) {
                        // Resolve through player config JS
                        Matcher matcher = PATTERN_PLAY_URL_SRC.matcher(
                                C0106ZJ.m484FN(
                                        BASE_URL + "//static/player/"
                                                + playerObj.optString(fromKey) + ".js",
                                        buildDefaultHeaders()));
                        String videoUrl = null;
                        if (matcher.find()) {
                            videoUrl = matcher.group(1);
                        }
                        // Build full resolved URL
                        String resolvedUrl;
                        if (videoUrl.contains("http")) {
                            resolvedUrl = videoUrl;
                        } else {
                            resolvedUrl = videoUrl + playerObj.optString("url");
                        }
                        // Fetch the actual source page and parse video data
                        boolean isDirectUrl = resolvedUrl.contains("=");
                        C0082OO sourceDoc;
                        if (isDirectUrl) {
                            sourceDoc = C0093Tt.m440q(
                                    C0106ZJ.m484FN(resolvedUrl, buildDetailHeaders(resolvedUrl)));
                        } else {
                            sourceDoc = C0093Tt.m440q(
                                    C0106ZJ.m484FN(resolvedUrl, buildSiteHeaders(resolvedUrl)));
                        }
                        // Parse source scripts for video data
                        C0116dX sourceScripts = sourceDoc.m654b(SELECTOR_BODY_SCRIPT);
                        Pattern vidPattern = Pattern.compile("var vid = '(.*)';");
                        Pattern dataPattern = Pattern.compile(
                                "\"data\":['\"]([^'\"]+)['\"]");

                        for (int j = 0; j < sourceScripts.size(); j++) {
                            String src = sourceScripts.get(j).m671y().trim();
                            Matcher m1 = vidPattern.matcher(src);
                            Matcher m2 = dataPattern.matcher(src);
                            if (m2.find()) {
                                String dataValue = m2.group(1);
                                result.put("parse", 0);
                                result.put("playUrl", "");
                                String decodedUrl = decodeUrlStr(decodeHexStr(strReverse(dataValue)));
                                result.put("url", decodedUrl);
                                if (decodedUrl.contains("libvio")) {
                                    headerConfig.put("Referer", " https://www.libvio.cc/");
                                }
                                result.put("header", headerConfig.toString());
                            } else if (m1.find()) {
                                String vidValue = m1.group(1);
                                result.put("parse", 0);
                                result.put("playUrl", "");
                                result.put("url", vidValue);
                                if (vidValue.contains("libvio")) {
                                    headerConfig.put("Referer", " https://www.libvio.cc/");
                                    result.put("header", headerConfig.toString());
                                }
                            }
                        }
                    }
                }
            }
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /**
     * Search: query the libvio suggest API and return matching results.
     */
    public String searchContent(String keyword, boolean quick) throws JSONException {
        try {
            String searchUrl = BASE_URL + "//index.php/ajax/suggest?mid=1&wd="
                    + URLEncoder.encode(keyword)
                    + "&limit=10&timestamp=" + System.currentTimeMillis();
            JSONObject jsonResp = new JSONObject(C0106ZJ.m484FN(searchUrl, buildSiteHeaders(searchUrl)));
            JSONObject result = new JSONObject();
            JSONArray resultArray = new JSONArray();
            int total = jsonResp.getInt(KEY_TOTAL);
            String listKey = KEY_LIST;
            if (total > 0) {
                JSONArray items = new JSONArray(jsonResp.optString(listKey));
                for (int i = 0; i < items.length(); i++) {
                    JSONObject item = items.optJSONObject(i);
                    String id = item.optString(KEY_ID);
                    String name = item.optString(KEY_NAME);
                    String pic = item.optString(KEY_PIC);
                    if (!TextUtils.isEmpty(pic)) {
                        if (!pic.startsWith("http")) {
                            pic = BASE_URL + pic;
                        }
                    }
                    JSONObject obj = new JSONObject();
                    obj.put(KEY_VOD_ID, id);
                    obj.put(KEY_VOD_NAME, name);
                    obj.put(KEY_VOD_PIC, pic);
                    obj.put(KEY_VOD_REMARKS, "");
                    resultArray.put(obj);
                }
            }
            result.put(listKey, resultArray);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
