package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.AbstractC0099V3;
import com.github.catvod.spider.merge.C0082OO;
import com.github.catvod.spider.merge.C0093Tt;
import com.github.catvod.spider.merge.C0106ZJ;
import com.github.catvod.spider.merge.C0116dX;
import com.github.catvod.spider.merge.C0117f4;
import com.github.catvod.spider.merge.C0118ga;
import com.github.catvod.spider.merge.C0127lK;
import com.github.catvod.spider.merge.C0147tG;
import com.github.catvod.spider.merge.C0152vp;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.Call;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

public class Czsapp extends Spider {

    private static final Pattern VIDEO_ENCRYPT_PATTERN = Pattern.compile(
        "\"([^\"]+)\";var [\\d\\w]+=function dncry.*md5.enc.Utf8.parse\\(\"([\\d\\w]+)\".*md5.enc.Utf8.parse\\(([\\d]+)\\)");
    private static final Pattern VIDEO_URL_PATTERN = Pattern.compile("video: \\{url: \"([^\"]+)\"");
    private static final Pattern SUBTITLE_PATTERN = Pattern.compile("subtitle: \\{url:\"([^\"]+\\.vtt)\"");
    private static final Pattern SVG_PATTERN = Pattern.compile("const\\s+mysvg\\s*=\\s*'([^']+)'");
    private static final Pattern MOVIE_ID_PATTERN = Pattern.compile("/movie/(\\d+)\\.html");
    private static final Pattern PAGE_NUM_PATTERN = Pattern.compile("/page/(\\d+)");
    private static final Pattern PLAY_URL_PATTERN = Pattern.compile("/v_play/(.*)\\.html");
    private static final Pattern VKEY_PATTERN = Pattern.compile("var vkey = ['\"]([^'\"]+)['\"]");
    private static final Pattern FVKEY_PATTERN = Pattern.compile("var fvkey = ['\"]([^'\"]+)['\"]");
    private static final Pattern UA_PATTERN = Pattern.compile("var ua = ['\"]([^'\"]+)['\"]");
    private static final Pattern CIP_PATTERN = Pattern.compile("var cip = ['\"]([^'\"]+)['\"]");
    private static final Pattern TIME_PATTERN = Pattern.compile("var time = ['\"]([^'\"]+)['\"]");
    private static final Pattern URL_PATTERN = Pattern.compile("var url = ['\"]([^'\"]+)['\"]");
    private static final Pattern KEY_PATTERN = Pattern.compile("key=['\"]([^'\"]+)['\"]");
    private static final Pattern VALUE_PATTERN = Pattern.compile("value=['\"]([^'\"]+)['\"]");

    private static final String USER_AGENT =
        "Mozilla/5.0 (iPhone; CPU iPhone OS 13_2_3 like Mac OS X) AppleWebKit/537.36"
        + "  (KHTML, like Gecko) Version/13.0 Mobile/15E148 Safari/537.36";

    private String baseUrl = "";
    public static String cookieValue = "";

    @Override
    public void init(Context context, String str) throws Exception {
        super.init(context, str);
        this.baseUrl = C0152vp.m724Mo(str);
    }

    private String md5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(input.getBytes());
            byte[] digest = md.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hex = Integer.toHexString(b & 0xFF);
                if (hex.length() < 2) {
                    sb.append("0");
                }
                sb.append(hex);
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private HashMap<String, String> createHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", USER_AGENT);
        headers.put("Referer", this.baseUrl);
        headers.put("Accept-language", "zh-CN,zh;q=0.9");
        headers.put("X-Requested-With", "XMLHttpRequset");
        if (cookieValue.length() > 0) {
            headers.put("Cookie", cookieValue);
        }
        return headers;
    }

    private static String stringToNum(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i) + 1);
        }
        return sb.toString();
    }

    private String fetchHtml(String url) {
        try {
            return C0106ZJ.m484FN(url, createHeaders());
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        try {
            JSONObject response = new JSONObject();
            String pageUrl = pg.equals("1")
                ? this.baseUrl + tid
                : this.baseUrl + tid + "/page/" + pg;
            C0082OO doc = C0093Tt.m440q(fetchWithCookieHandling(pageUrl));

            int currentPage = Integer.parseInt(pg);
            int maxPage = currentPage;
            Matcher pageMatcher = PAGE_NUM_PATTERN.matcher(
                doc.m654b("div.pagenavi_txt  a.extend").m593QU().mo126QU("href"));
            if (pageMatcher.find()) {
                maxPage = Integer.parseInt(pageMatcher.group(1));
            }

            C0116dX items = doc.m654b("div.mi_ne_kd > ul > li");
            JSONArray list = new JSONArray();
            for (C0127lK item : items) {
                Matcher linkMatcher = MOVIE_ID_PATTERN.matcher(item.m654b("a").m595QU("href"));
                if (!linkMatcher.find()) continue;

                String vodId = linkMatcher.group(1);
                String vodPic = item.m654b("img").m595QU("data-original").trim();
                String vodRemarks = item.m654b("img").m595QU("alt").trim();
                String vodName = item.m654b("div.hdinfo > span").m596u().trim();

                JSONObject entry = new JSONObject();
                entry.put("vod_id", vodId);
                entry.put("vod_name", vodName);
                entry.put("vod_pic", vodPic);
                entry.put("vod_remarks", vodRemarks);
                list.put(entry);
            }

            response.put("list", list);
            response.put("page", currentPage);
            response.put("pagecount", maxPage);
            response.put("limit", 24);
            int total = maxPage > 1 ? maxPage * 24 : list.length();
            response.put("total", total);
            return response.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String detailContent(List<String> ids) {
        try {
            JSONObject response = new JSONObject();
            JSONArray videoList = new JSONArray();
            JSONObject detail = new JSONObject();

            C0082OO doc = C0093Tt.m440q(fetchWithCookieHandling(this.baseUrl + "/movie/" + ids.get(0) + ".html"));

            String title = doc.m654b("div.moviedteail_tt > h1").m596u().trim();
            String imageUrl = doc.m654b("div.dyimg > img").m595QU("src");

            Iterator<C0127lK> infoItems = doc.m654b("ul.moviedteail_list > li").iterator();
            String category = "";
            String area = "";
            String year = "";
            String director = "";
            String actor = "";
            String douban = "";

            while (infoItems.hasNext()) {
                String text = infoItems.next().m653a().trim();
                if (text.length() < 4) continue;
                String label = text.substring(0, 2);
                String value = text.substring(3);
                switch (label) {
                    case "类型": category = value; break;
                    case "地区": area = value; break;
                    case "年份": year = value; break;
                    case "导演": director = value; break;
                    case "主演": actor = value; break;
                    case "豆瓣": douban = value; break;
                }
            }

            detail.put("vod_id", ids.get(0));
            detail.put("vod_name", title);
            detail.put("vod_pic", imageUrl);
            detail.put("type_name", category);
            detail.put("vod_year", year);
            detail.put("vod_area", area);
            detail.put("vod_remarks", douban);
            detail.put("vod_actor", actor);
            detail.put("vod_director", director);

            String content = doc.m654b("div.yp_context").m596u().trim();
            detail.put("vod_content", "此接口完全免费，请勿上当受骗！！" + content);

            detail.put("vod_play_from", "蓝光秒播");

            ArrayList<String> episodes = new ArrayList<>();
            for (C0127lK ep : doc.m654b("div.paly_list_btn > a")) {
                Matcher epMatcher = PLAY_URL_PATTERN.matcher(ep.mo126QU("href"));
                if (epMatcher.find()) {
                    episodes.add(ep.m653a() + "$" + epMatcher.group(1));
                }
            }
            detail.put("vod_play_url", TextUtils.join("#", episodes));

            videoList.put(detail);
            response.put("list", videoList);
            return response.toString();
        } catch (Exception e) {
            return "";
        }
    }

    public String homeContent(boolean filter) {
        try {
            JSONObject response = new JSONObject();
            C0082OO doc = C0093Tt.m440q(fetchWithCookieHandling(this.baseUrl));

            C0116dX navItems = doc.m654b(".navlist > li > a");
            JSONArray categories = new JSONArray();
            for (C0127lK nav : navItems) {
                String href = nav.mo126QU("href");
                if (href.length() <= 1) continue;
                String typeId = href.substring(1).replace(this.baseUrl.substring(1), "");
                String typeName = nav.m653a().trim();
                if (typeName.contains("首页")) continue;
                JSONObject cat = new JSONObject();
                cat.put("type_id", typeId);
                cat.put("type_name", typeName);
                categories.put(cat);
            }
            response.put("class", categories);

            C0116dX videoItems = doc.m654b("div.mi_ne_kd > ul > li");
            JSONArray videoList = new JSONArray();
            for (C0127lK item : videoItems) {
                Matcher idMatcher = MOVIE_ID_PATTERN.matcher(item.m654b("a").m595QU("href"));
                if (!idMatcher.find()) continue;
                String vodId = idMatcher.group(1);
                String vodPic = item.m654b("img").m595QU("alt").trim();
                String vodRemarks = item.m654b("img").m595QU("data-original").trim();
                String vodName = item.m654b("div.hdinfo > span").m596u().trim();

                JSONObject entry = new JSONObject();
                entry.put("vod_id", vodId);
                entry.put("vod_name", vodName);
                entry.put("vod_pic", vodPic);
                entry.put("vod_remarks", vodRemarks);
                videoList.put(entry);
            }
            response.put("list", videoList);
            return response.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public Object[] loadsub(String str) throws IOException {
        try {
            AbstractC0099V3.p callback = new AbstractC0099V3.p(this) {
                final Czsapp spider = Czsapp.this;

                @Override
                protected void onFailure(Call call, Exception exc) {}

                @Override
                public String onResponse(Response response) {
                    return null;
                }
            };
            C0106ZJ.m490UJ(C0106ZJ.m488QU(), str, null, createHeaders(), callback);
            Response result = callback.getResult();

            if (result.code() == 404) {
                return new Object[]{200, "application/octet-stream",
                    new ByteArrayInputStream("WEBVTT".getBytes())};
            }

            byte[] body = result.body().bytes();
            byte[] iv = Arrays.copyOfRange(body, 0, 16);
            String decrypted = C0117f4.m598q(
                C0147tG.m713q(Arrays.copyOfRange(body, 16, body.length), iv, iv));
            String vtt = decrypted
                .replaceAll("(\\d{2}:\\d{2}:\\d{2}.\\d{3}.+\\d{2}:\\d{2}:\\d{2}.\\d{3}).*", "$1")
                .replaceAll("(\\d{2}:\\d{2}.\\d{3}).*?( --> )(\\d{2}:\\d{2}.\\d{3}).*", "00:$1$200:$3")
                .replaceAll("<.*><.*>(.*)<.*><.*>", "$1")
                .replaceAll("&(.*);", "")
                .replaceAll(".*NOTE.*", "");

            BufferedReader reader = new BufferedReader(new StringReader(vtt));
            ArrayList<String> lines = new ArrayList<>();
            int epNum = 1;
            String line = reader.readLine();
            while (line != null) {
                if (line.matches("\\d{2}:\\d{2}:\\d{2}.\\d{3}.+\\d{2}:\\d{2}:\\d{2}.\\d{3}")) {
                    if (!((String) lines.get(lines.size() - 1)).trim().isEmpty()) {
                        lines.add(epNum + "");
                        epNum++;
                    }
                }
                lines.add(line);
                line = reader.readLine();
            }

            return new Object[]{200, "application/octet-stream",
                new ByteArrayInputStream(TextUtils.join("\n", lines).getBytes())};
        } catch (Exception e) {
            e.printStackTrace();
            SpiderDebug.log(e);
            return null;
        }
    }

    public String playerContent(String flag, String id, List<String> vodFlags) {
        try {
            String html = fetchWithCookieHandling(this.baseUrl + "/v_play/" + id + ".html");
            C0082OO doc = C0093Tt.m440q(html);

            Matcher encryptMatcher = VIDEO_ENCRYPT_PATTERN.matcher(html);
            String videoUrl = "";
            String subtitleUrl = "";

            if (encryptMatcher.find()) {
                String decrypted = C0152vp.m723MH(
                    encryptMatcher.group(1), encryptMatcher.group(2), encryptMatcher.group(3));

                Matcher urlMatcher = VIDEO_URL_PATTERN.matcher(decrypted);
                videoUrl = urlMatcher.find() ? urlMatcher.group(1) : "";

                Matcher subMatcher = SUBTITLE_PATTERN.matcher(decrypted);
                subtitleUrl = subMatcher.find() ? subMatcher.group(1) : "";
            }

            boolean isExternalUrl = TextUtils.isEmpty(videoUrl);

            String strM849 = "url";
            JSONObject result = new JSONObject();

            if (isExternalUrl) {
                C0116dX iframes = doc.m654b("iframe.viframe");
                if (iframes != null) {
                    String iframeSrc = iframes.m595QU("src");
                    if (iframeSrc.contains("jx.xmflv.com")) {
                        Matcher svgMatcher = SVG_PATTERN.matcher(
                            C0106ZJ.m484FN(iframeSrc, createHeaders()));
                        if (svgMatcher.find()) {
                            videoUrl = svgMatcher.group(1);
                        }
                    } else {
                        String iframeHtml = C0106ZJ.m484FN(iframeSrc, createHeaders());
                        Pattern timePattern = TIME_PATTERN;
                        Matcher timeMatcher = timePattern.matcher(iframeHtml);
                        Matcher uaMatcher = UA_PATTERN.matcher(iframeHtml);
                        Matcher urlMatcher = URL_PATTERN.matcher(iframeHtml);
                        if (timeMatcher.find()) {
                            String time = timeMatcher.group(1);
                            Matcher cipMatcher = CIP_PATTERN.matcher(iframeHtml);
                            String cip = cipMatcher.find() ? cipMatcher.group(1) : "";
                            String ua = uaMatcher.find() ? uaMatcher.group(1) : "";
                            String url = urlMatcher.find() ? urlMatcher.group(1) : "";

                            String apiUrl = "https://jx.xmflv.com/player.php?time=" + time + "&url=" + url;
                            String apiHtml = C0106ZJ.m484FN(apiUrl, createHeaders());
                            Matcher vkeyMatcher = VKEY_PATTERN.matcher(apiHtml);
                            Matcher fvkeyMatcher = FVKEY_PATTERN.matcher(apiHtml);
                            Matcher uaMatcher2 = UA_PATTERN.matcher(apiHtml);
                            Matcher cipMatcher2 = CIP_PATTERN.matcher(apiHtml);
                            Matcher timeMatcher2 = TIME_PATTERN.matcher(apiHtml);

                            if (vkeyMatcher.find()) {
                                String fvkey = fvkeyMatcher.find() ? fvkeyMatcher.group(1) : "";
                                String ua2 = uaMatcher2.find() ? uaMatcher2.group(1) : "";
                                String cip2 = cipMatcher2.find() ? cipMatcher2.group(1) : "";
                                String vkey = vkeyMatcher.group(1);

                                byte[] keyBytes = md5(ua2).getBytes();
                                byte[] ivBytes = "UVE1NTY4MDY2NQ==".getBytes();
                                Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
                                cipher.init(Cipher.ENCRYPT_MODE,
                                    new SecretKeySpec(keyBytes, "AES"),
                                    new IvParameterSpec(ivBytes));
                                String encrypted = Base64.encodeToString(
                                    cipher.doFinal(time.getBytes()), Base64.DEFAULT);

                                AbstractC0099V3.p playerCallback = new AbstractC0099V3.p(this) {
                                    final Czsapp spider = Czsapp.this;

                                    @Override
                                    protected void onFailure(Call call, Exception exc) {}

                                    @Override
                                    public String onResponse(Response response) {
                                        return null;
                                    }
                                };
                                HashMap<String, String> params = new HashMap<>();
                                params.put(strM849, url);
                                params.put("time", time);
                                params.put("ua", ua);
                                params.put("cip", cip);
                                params.put("vkey", vkey);
                                params.put("fvkey", encrypted);
                                C0106ZJ.m492i(C0106ZJ.m488QU(),
                                    "https://jx.xmflv.com/xmflv-1.SVG",
                                    params, createHeaders(), playerCallback);
                                videoUrl = new JSONObject(playerCallback.getResult().body().string())
                                    .optString(strM849);
                            }
                        }
                    }
                }
            }

            result.put("parse", 0);
            result.put("playUrl", "");
            result.put(strM849, videoUrl);
            result.put("header", "");
            if (!TextUtils.isEmpty(subtitleUrl)) {
                result.put("subf", "/vtt/utf-8");
                result.put("subt", Proxy.localProxyUrl() + "?do=czspp&url=" + URLEncoder.encode(subtitleUrl));
            }
            return result.toString();
        } catch (Exception e) {
            e.printStackTrace();
            SpiderDebug.log(e);
            return "";
        }
    }

    public String searchContent(String keyword, boolean quick) {
        try {
            JSONObject response = new JSONObject();
            C0116dX items = C0093Tt.m440q(
                fetchWithCookieHandling(this.baseUrl + "/search?q=" + URLEncoder.encode(keyword)))
                .m654b("div.mi_ne_kd > ul > li");

            JSONArray list = new JSONArray();
            for (C0127lK item : items) {
                Matcher idMatcher = MOVIE_ID_PATTERN.matcher(item.m654b("a").m595QU("href"));
                JSONObject entry = new JSONObject();
                if (idMatcher.find()) {
                    String vodId = idMatcher.group(1);
                    String vodName = item.m654b("img").m595QU("alt").trim();
                    String vodPic = item.m654b("img").m595QU("src").trim();
                    boolean hasRemarks = item.m670wt(".jidi");
                    String vodRemarks = hasRemarks
                        ? C0093Tt.m440q(C0106ZJ.m484FN(
                            item.m654b("a").m595QU("href"), createHeaders()))
                            .m654b("ul.moviedteail_list li span").get(0).m653a()
                        : item.m654b(".jidi span").m596u();

                    entry.put("vod_id", vodId);
                    entry.put("vod_name", vodName);
                    entry.put("vod_pic", vodPic);
                    entry.put("vod_remarks", vodRemarks);
                }
                list.put(entry);
            }

            response.put("list", list);
            return response.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    protected final String fetchWithCookieHandling(String str) {
        cookieValue = "";
        String response = C0106ZJ.m482B(str, createHeaders(), new TreeMap<>());

        String separator = ";";
        String cookieHeader = "set-cookie";

        if (response.contains("window.location.href")) {
            // Redirect: extract cookie and re-request
            TreeMap<String, List<String>> headerMap = new TreeMap<>();
            C0106ZJ.m482B(str, createHeaders(), headerMap);
            List<String> cookies = headerMap.get(cookieHeader);
            if (cookies != null) {
                StringBuilder sb = new StringBuilder();
                for (String cookie : cookies) {
                    sb.append(cookie.split(separator)[0]);
                }
                cookieValue = sb.toString();
            }
            return C0106ZJ.m484FN(str, createHeaders());
        }

        if (response.contains("滑动验证")) {
            // Slider captcha: extract cookie, re-request, then fetch again
            TreeMap<String, List<String>> headerMap = new TreeMap<>();
            C0106ZJ.m482B(str, createHeaders(), headerMap);
            List<String> cookies = headerMap.get(cookieHeader);
            StringBuilder sb = new StringBuilder();
            for (String cookie : cookies) {
                sb.append(cookie.split(separator)[0]);
            }
            cookieValue = sb.toString();
            return C0106ZJ.m484FN(str, createHeaders());
        }

        if (response.contains("正在进行人机识别")) {
            // Robot check: extract key-value pairs from script
            Matcher keyMatcher = KEY_PATTERN.matcher(
                Pattern.compile("c.get[\\(][\"]([^'\"]+)").matcher(response).find()
                    ? response : "");
            Matcher valMatcher = VALUE_PATTERN.matcher(response);

            TreeMap<String, List<String>> headerMap = new TreeMap<>();
            C0106ZJ.m482B(str, createHeaders(), headerMap);
            List<String> cookies = headerMap.get(cookieHeader);
            StringBuilder sb = new StringBuilder();
            for (String cookie : cookies) {
                sb.append(cookie.split(separator)[0]);
            }
            cookieValue = sb.toString();
            return C0106ZJ.m484FN(str, createHeaders());
        }

        if (response.contains("btwaf")) {
            // WAF protection
            if (response.contains("keywords")) {
                // Extract cookie for keywords WAF
                TreeMap<String, List<String>> headerMap = new TreeMap<>();
                C0106ZJ.m482B(str, createHeaders(), headerMap);
                List<String> cookies = headerMap.get(cookieHeader);
                StringBuilder sb = new StringBuilder();
                for (String cookie : cookies) {
                    sb.append(cookie.split(separator)[0]);
                }
                cookieValue = sb.toString();
            } else {
                // Extract btwaf ID from redirect URL
                Matcher btwafMatcher = Pattern.compile(".*=\"\\S+btwaf=(\\d+)\".*").matcher(response);
                if (btwafMatcher.find()) {
                    return fetchWithCookieHandling(str + "?btwaf=" + btwafMatcher.group(1));
                }
            }
            return fetchWithCookieHandling(str);
        }

        return response;
    }
}
