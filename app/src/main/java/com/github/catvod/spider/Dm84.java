package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.Bk.l;
import com.github.catvod.spider.merge.HR.C0724g;
import com.github.catvod.spider.merge.KI.k;
import com.github.catvod.spider.merge.Mp.P;
import com.github.catvod.spider.merge.UY.m;
import com.github.catvod.spider.merge.bY.C0924s;
import com.github.catvod.spider.merge.bY.C0925t;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONObject;
import java.net.URL;
import java.net.URLEncoder;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dm84 extends Spider {

    private String baseUrl;
    private String cookie;

    private static String matchGroup(String text, String regex) {
        Matcher matcher = Pattern.compile(regex).matcher(text);
        return matcher.find() ? matcher.group(1) : null;
    }

    private com.github.catvod.spider.merge.KI.FilterValue buildFilter(String label, String key, List<String> options) {
        ArrayList<com.github.catvod.spider.merge.KI.b> items = new ArrayList<>();
        for (String option : options) {
            if (!option.isEmpty()) {
                String display = option.replace("按", "");
                String value = option;
                if (key.equals("by")) {
                    value = option.replace("按时间", "time").replace("按人气", "hits").replace("按评分", "score");
                }
                items.add(new com.github.catvod.spider.merge.KI.b(display, value));
            }
        }
        return new com.github.catvod.spider.merge.KI.c(key, label, items);
    }

    private HashMap<String, String> createHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
        headers.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headers.put("accept-language", "zh-CN,zh;q=0.9");
        headers.put("Sec-Fetch-User", "?1");
        headers.put("Sec-Fetch-Dest", "document");
        headers.put("Sec-Fetch-Mode", "navigate");
        headers.put("Sec-Fetch-Site", "none");
        if (!TextUtils.isEmpty(this.cookie)) {
            headers.put("Cookie", this.cookie);
        }
        return headers;
    }

    private String postForUrl(String apiUrl, String body, Map<String, String> headers) {
        try {
            OkHttpClient client = new OkHttpClient().newBuilder().build();
            Request.Builder builder = new Request.Builder().url(apiUrl)
                .method("POST", RequestBody.create(
                    MediaType.parse("application/x-www-form-urlencoded; charset=UTF-8"), body));
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                builder.addHeader(entry.getKey(), entry.getValue());
            }
            return new JSONObject(client.newCall(builder.build()).execute().body().string())
                .getString("url");
        } catch (Exception e) {
            return "";
        }
    }

    @Override
    public void init(Context context, String str) {
        if (!str.isEmpty()) {
            this.baseUrl = str;
        }
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        ArrayList<Object> videoList = new ArrayList<>();
        if (extend.get("type") == null) extend.put("type", "");
        if (extend.get("year") == null) extend.put("year", "");
        if (extend.get("by") == null) extend.put("by", "time");

        String url = this.baseUrl + String.format("/show-%s--%s-%s--%s-%s.html",
            tid, extend.get("by"), URLEncoder.encode(extend.get("type")), extend.get("year"), pg);

        Iterator<?> items = C0925t.c(
            new byte[]{102, -32, 49, -45, 55, 22, -61, -110},
            new byte[]{2, -119, 71, -3, 94, 98, -90, -1},
            l.e(com.github.catvod.spider.merge.nU.FilterValue.l(url, createHeaders())));
        while (items.hasNext()) {
            m item = (m) items.next();
            C0924s.b(
                item.o0("a.title").a("href").split("/")[2],
                P.a(new byte[]{-43, -5, 45, 53, 26, 92, 7},
                    new byte[]{-76, -43, 89, 92, 110, 48, 98, 90}, item),
                item.o0("a.cover").a("data-bg"),
                P.a(new byte[]{-92, 40, -77, -26, -61, 15, 4, -53, -76},
                    new byte[]{-41, 88, -46, -120, -19, 107, 97, -72}, item),
                videoList);
        }
        return Subtitle.q(videoList);
    }

    @Override
    public String detailContent(List<String> ids) {
        m doc = l.e(com.github.catvod.spider.merge.nU.FilterValue.l(
            this.baseUrl + "/v/" + ids.get(0), createHeaders()));

        String vodName = doc.o0("h1.v_title").text();
        String vodContent = doc.o0("p.v_desc > span.desc").text();
        String vodPic = doc.o0("meta[property=og:image]").a("content");
        String vodArea = doc.o0("meta[name=og:video:area]").a("content");
        String type_name = doc.o0("meta[name=og:video:class]").a("content");
        String vodActor = doc.o0("meta[name=og:video:actor]").a("content");
        String vodContentFull = doc.o0("meta[property=og:description]").a("content");
        String vodYear = doc.o0("meta[name=og:video:release_date]").a("content");
        String vodDirector = doc.o0("meta[name=og:video:director]").a("content");

        k detail = new k();
        detail.g(ids.get(0));
        detail.i(vodPic);
        detail.n(vodYear);
        detail.h(vodName);
        detail.d(vodArea);
        detail.c(vodActor);
        detail.l(vodContent);
        detail.e(vodContentFull);
        detail.f(vodDirector);
        detail.b(type_name);

        // Extract play sources and episodes
        LinkedHashMap<String, String> playMap = new LinkedHashMap<>();
        C0724g tabs = doc.o0("ul.tab_control > li");
        C0724g playLists = doc.o0("ul.play_list");
        for (int i = 0; i < tabs.size(); i++) {
            String sourceName = tabs.get(i).v0();
            C0724g episodes = playLists.get(i).o0("a");
            ArrayList<String> epList = new ArrayList<>();
            for (int j = episodes.size() - 1; j >= 0; j--) {
                m ep = episodes.get(j);
                epList.add(ep.v0() + "$" + ep.c("href"));
            }
            if (!epList.isEmpty()) {
                playMap.put(sourceName, TextUtils.join("#", epList));
            }
        }
        if (!playMap.isEmpty()) {
            detail.j(TextUtils.join("$$", playMap.keySet()));
            detail.k(TextUtils.join("$$", playMap.values()));
        }
        return Subtitle.p(detail);
    }

    @Override
    public String homeContent(boolean filter) {
        ArrayList<Object> videoList = new ArrayList<>();
        ArrayList<com.github.catvod.spider.merge.KI.a> categories = new ArrayList<>();
        LinkedHashMap<String, List<?>> filters = new LinkedHashMap<>();

        HashMap<String, String> headers = createHeaders();
        headers.put("Referer", this.baseUrl);
        com.github.catvod.spider.merge.nU.StringUtils resp = com.github.catvod.spider.merge.nU.FilterValue.b(this.baseUrl, headers);
        List<String> cookies = resp.c().get("set-cookie");
        if (cookies != null && !cookies.isEmpty()) {
            this.cookie = cookies.get(0);
        }

        m doc = l.e(resp.a());

        // Parse categories from navigation
        Iterator<?> navItems = C0925t.c(
            new byte[]{-98, 117, 62, -124, 41, 38, 29, -111, -124, 110, 48, -44, 104, 60, 43, -61, -43, 57, 113},
            new byte[]{-21, 25, 16, -22, 72, 80, 66, -29}, doc);
        while (navItems.hasNext()) {
            m nav = (m) navItems.next();
            if (nav.c("href").startsWith("/list")) {
                String catId = nav.c("href").split("-")[1].substring(0, 1);
                String catName = nav.v0().substring(0, 2);
                categories.add(new com.github.catvod.spider.merge.KI.a(catId, catName));
            }
        }

        // Parse filters for each category
        for (com.github.catvod.spider.merge.KI.a cat : categories) {
            StringBuilder urlBuilder = new StringBuilder();
            urlBuilder.append(this.baseUrl);
            urlBuilder.append("/list-");
            urlBuilder.append(cat.a());
            String categoryUrl = C0925t.a(
                new byte[]{-94, 116, -76, -13, -62},
                new byte[]{-116, 28, -64, -98, -82, 50, -6, -12}, urlBuilder);
            m catDoc = l.e(com.github.catvod.spider.merge.nU.FilterValue.l(categoryUrl, createHeaders()));

            C0724g filterDivs = catDoc.o0("ul.list_filter > li > div");
            ArrayList<com.github.catvod.spider.merge.KI.FilterValue> filterList = new ArrayList<>();
            filterList.add(buildFilter("類型", "type", filterDivs.get(0).o0(".type").c()));
            filterList.add(buildFilter("時間", "year", filterDivs.get(1).o0("a").c()));
            filterList.add(buildFilter("排序", "by", filterDivs.get(2).o0("a").c()));
            filters.put(cat.a(), filterList);
        }

        // Parse latest videos
        Iterator<?> videoItems = C0925t.c(
            new byte[]{109, 71, 60, -26, 17, -8, 122, 66},
            new byte[]{9, 46, 74, -56, 120, -116, 31, 47}, doc);
        while (videoItems.hasNext()) {
            m item = (m) videoItems.next();
            C0924s.b(
                item.o0("a.title").a("href").split("/")[2],
                P.a(new byte[]{52, 13, 56, -74, -79, -23, 53},
                    new byte[]{85, 35, 76, -33, -59, -123, 80, 43}, item),
                item.o0("a.cover").a("data-bg"),
                P.a(new byte[]{-85, 48, -58, 104, -90, 32, -69, -56, -69},
                    new byte[]{-40, 64, -89, 6, -120, 68, -34, -69}, item),
                videoList);
        }
        return Subtitle.u(categories, videoList, filters);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vodFlags) {
        String iframeSrc = l.e(com.github.catvod.spider.merge.nU.FilterValue.l(
            this.baseUrl + id, createHeaders())).o0("iframe").a("src");
        try {
            C0724g scripts = l.e(com.github.catvod.spider.merge.nU.FilterValue.k(iframeSrc)).o0("script");
            String videoUrl = "", t = "", key = "", act = "", play = "";
            for (int i = 0; i < scripts.size(); i++) {
                String script = scripts.get(i).toString();
                if (script.contains("key") && script.contains("url")) {
                    videoUrl = matchGroup(script, "var\\s+url\\s*=\\s*\"(.*?)\";");
                    t = matchGroup(script, "var\\s+t\\s*=\\s*\"(.*?)\";");
                    key = matchGroup(script, "var\\s+key\\s*=\\s*\"(.*?)\";");
                    act = matchGroup(script, "var\\s+act\\s*=\\s*\"(.*?)\";");
                    play = matchGroup(script, "var\\s+play\\s*=\\s*\"(.*?)\";");
                }
            }

            URL parsedUrl = new URL(iframeSrc);
            String origin = parsedUrl.getPort() == -1
                ? String.format("%s://%s", parsedUrl.getProtocol(), parsedUrl.getHost())
                : String.format("%s://%s:%d", parsedUrl.getProtocol(), parsedUrl.getHost(), parsedUrl.getPort());

            String postBody = String.format("url=%s&t=%s&key=%s&act=%s&play=%s",
                videoUrl, t, key, act, play);

            HashMap<String, String> apiHeaders = new HashMap<>();
            apiHeaders.put("accept", "application/json, text/javascript, */*; q=0.01");
            apiHeaders.put("accept-language", "zh-CN,zh;q=0.9,en;q=0.8");
            apiHeaders.put("content-type", "application/x-www-form-urlencoded; charset=UTF-8");
            apiHeaders.put("origin", origin);
            apiHeaders.put("priority", "u=1, i");
            apiHeaders.put("sec-ch-ua", "\"Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126\"");
            apiHeaders.put("sec-ch-ua-mobile", "?0");
            apiHeaders.put("sec-ch-ua-platform", "\"Windows\"");
            apiHeaders.put("sec-fetch-dest", "empty");
            apiHeaders.put("sec-fetch-mode", "cors");
            apiHeaders.put("sec-fetch-site", "same-origin");
            apiHeaders.put("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
            apiHeaders.put("x-requested-with", "XMLHttpRequest");
            apiHeaders.put("referer", iframeSrc);
            if (!TextUtils.isEmpty(this.cookie)) {
                apiHeaders.put("Cookie", this.cookie);
            }

            String resolvedUrl = postForUrl(origin + "/api.php", postBody, apiHeaders);
            if (!resolvedUrl.isEmpty()) {
                Subtitle result = Subtitle.e();
                result.y(resolvedUrl);
                result.f(createHeaders());
                return result.o();
            }

            // Fallback: direct iframe play
            Subtitle fallback = Subtitle.e();
            fallback.y(iframeSrc);
            fallback.l();
            fallback.f(createHeaders());
            return fallback.o();
        } catch (Exception e) {
            Subtitle fallback = Subtitle.e();
            fallback.y(iframeSrc);
            fallback.l();
            fallback.f(createHeaders());
            return fallback.o();
        }
    }

    @Override
    public String searchContent(String keyword, boolean quick) {
        ArrayList<Object> videoList = new ArrayList<>();
        Iterator<?> items = C0925t.c(
            new byte[]{-76, -85, -70, 117, 73, 82, 60, 1},
            new byte[]{-48, -62, -52, 91, 32, 38, 89, 108},
            l.e(com.github.catvod.spider.merge.nU.FilterValue.l(
                this.baseUrl + "/s----------.html?wd=" + keyword, createHeaders())));
        while (items.hasNext()) {
            m item = (m) items.next();
            C0924s.b(
                item.o0("a.title").a("href").split("/")[2],
                P.a(new byte[]{124, 27, -13, -15, -65, -102, 41},
                    new byte[]{29, 53, -121, -104, -53, -10, 76, -86}, item),
                item.o0("a.cover").a("data-bg"),
                P.a(new byte[]{-9, -85, 63, 82, -1, -83, -85, -75, -25},
                    new byte[]{-124, -37, 94, 60, -47, -55, -50, -58}, item),
                videoList);
        }
        return Subtitle.q(videoList);
    }
}
