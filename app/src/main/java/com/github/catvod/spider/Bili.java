package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.I.BilibiliApi;
import com.github.catvod.spider.merge.I.BuilderUtils;
import com.github.catvod.spider.merge.K.VodResult;
import com.github.catvod.spider.merge.K.VodItem;
import com.github.catvod.spider.merge.O.h;
import com.github.catvod.spider.merge.d1.JsoupParser;
import com.github.catvod.spider.merge.l.ConcatUtils;
import com.github.catvod.utils.server.Server;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Bili extends NetPan {
    private JsonObject config;

    class Loader {
        static volatile Bili instance = new Bili();

        private Loader() {
        }
    }

    private void f(com.github.catvod.spider.merge.O.a filterSet, StringBuilder sb, String quality) {
        for (com.github.catvod.spider.merge.O.FilterValue filterValue : filterSet.d()) {
            if (filterValue.g().equals(quality)) {
                sb.append(j(filterValue));
            }
        }
    }

    private String g(com.github.catvod.spider.merge.O.FilterValue filterValue, String videoAttrs) {
        return String.format(Locale.getDefault(), "<AdaptationSet>\n<ContentComponent contentType=\"%s\"/>\n<Representation id=\"%s\" bandwidth=\"%s\" codecs=\"%s\" mimeType=\"%s\" %s startWithSAP=\"%s\">\n<BaseURL>%s</BaseURL>\n<SegmentBase indexRange=\"%s\">\n<Initialization range=\"%s\"/>\n</SegmentBase>\n</Representation>\n</AdaptationSet>", filterValue.h().split("/")[0], filterValue.g() + "_" + filterValue.c(), filterValue.a(), filterValue.d(), filterValue.h(), videoAttrs, filterValue.k(), filterValue.b().replace("&", "&amp;"), filterValue.j().a(), filterValue.j().b());
    }

    public static Bili get() {
        return Loader.instance;
    }

    private String h(String type, String page, HashMap<String, String> params) {
        type.getClass();
        type.hashCode();
        switch (type) {
            case "his":
                return ConcatUtils.a("https://api.bilibili.com/x/v2/history?ps=20&pn=", page);
            case "hot":
                return ConcatUtils.a("https://api.bilibili.com/x/web-interface/popular?ps=20&pn=", page);
            case "rank":
                return "https://api.bilibili.com/x/web-interface/ranking/v2?rid=0&type=all";
            case "recm":
                return "https://api.bilibili.com/x/web-interface/wbi/index/top/feed/rcmd?ps=20";
            case "kejiRank":
                return "https://api.bilibili.com/x/web-interface/ranking/v2?rid=188&type=all";
            case "carRank":
                return "https://api.bilibili.com/x/web-interface/ranking/v2?rid=223&type=all";
            default:
                StringBuilder sbUrl = BuilderUtils.b("https://api.bilibili.com/x/web-interface/search/type?search_type=video&keyword=");
                if (params != null && params.containsKey("tid") && !params.get("tid").isEmpty()) {
                    type = params.get("tid");
                }
                sbUrl.append(type);
                String fullUrl = sbUrl.toString();
                if (params != null) {
                    for (String paramKey : params.keySet()) {
                        String paramVal = params.get(paramKey);
                        if (!paramVal.isEmpty() && !paramKey.equals("tid")) {
                            fullUrl = fullUrl + "&" + paramKey + "=" + URLEncoder.encode(paramVal, "UTF-8");
                        }
                    }
                }
                return BuilderUtils.a(fullUrl, "&page=", page);
        }
    }

    private Map<String, String> i() {
        HashMap headers = com.github.catvod.spider.merge.B.MapBuilder.b("cookie", "buvid3=84B0395D-C9F2-C490-E92E-A09AB48FE26E71636infoc", "User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
        headers.put("Referer", "https://www.bilibili.com");
        return headers;
    }

    private String j(com.github.catvod.spider.merge.O.FilterValue filterValue) {
        if (filterValue.h().startsWith("video")) {
            return g(filterValue, String.format(Locale.getDefault(), "height='%s' width='%s' frameRate='%s' sar='%s'", filterValue.f(), filterValue.l(), filterValue.e(), filterValue.i()));
        }
        if (filterValue.h().startsWith("audio")) {
            throw null;
        }
        return "";
    }

    private Map<String, String> k() {
        return BilibiliApi.i().o();
    }

    private void l(String type, String jsonStr, JSONArray outArray) throws JSONException {
        Object result;
        JSONObject rootObj = new JSONObject(jsonStr).optJSONObject("data");
        if (rootObj != null || type.equals("his")) {
            JSONArray dataArr = type.equals("his") ? new JSONObject(jsonStr).optJSONArray("data") : rootObj.optJSONArray(type.equals("recm") ? "item" : (type.endsWith("Rank") || type.equals("rank") || type.equals("hot")) ? "list" : "result");
            if (dataArr == null) {
                return;
            }
            for (int i = 0; i < dataArr.length(); i++) {
                JSONObject itemObj = dataArr.getJSONObject(i);
                String picUrl = itemObj.optString("pic");
                if (picUrl.isEmpty()) {
                    result = null;
                } else {
                    if (picUrl.startsWith("//")) {
                        picUrl = ConcatUtils.a("https:", picUrl);
                    }
                    String bvid = itemObj.optString("bvid");
                    String itemId = itemObj.optString((type.equals("his") || type.equals("hot") || type.contains("Rank") || type.equals("rank")) ? "aid" : "id");
                    JSONObject vodObj = new JSONObject();
                    vodObj.put("vod_id", bvid + "@" + itemId);
                    vodObj.put("vod_name", JsoupParser.d(itemObj.optString("title")).s0());
                    vodObj.put("vod_pic", picUrl);
                    String duration = itemObj.optString("duration");
                    if (duration.contains(":")) {
                        String[] parts = duration.split(":");
                        duration = (parts.length == 2 ? Integer.parseInt(parts[0]) : parts.length == 3 ? Integer.parseInt(parts[1]) + (Integer.parseInt(parts[0]) * 60) : 0) + "分钟";
                    } else {
                        try {
                            vodObj.put("vod_remarks", new BigDecimal(duration).divide(new BigDecimal("60"), RoundingMode.HALF_UP).toString() + "分钟");
                        } catch (Exception unused) {
                            vodObj.put("vod_remarks", duration);
                        }
                        result = vodObj;
                    }
                    vodObj.put("vod_remarks", duration);
                    result = vodObj;
                }
                if (result != null) {
                    outArray.put(result);
                }
            }
        }
    }

    private void m(String type, String page, JSONArray outArray) throws JSONException {
        JSONObject vodObj;
        String vodName;
        if ("1".equals(page) && type.equals("recm")) {
            vodObj = new JSONObject();
            StringBuilder sbId = BuilderUtils.b("recmCol");
            sbId.append(UUID.randomUUID());
            sbId.append("@");
            sbId.append("recmCol");
            sbId.append(UUID.randomUUID());
            vodObj.put("vod_id", sbId.toString());
            vodName = "推荐合集";
        } else if ("1".equals(page) && type.equals("hot")) {
            vodObj = new JSONObject();
            StringBuilder sbId2 = BuilderUtils.b("hotCol");
            sbId2.append(UUID.randomUUID());
            sbId2.append("@");
            sbId2.append("hotCol");
            sbId2.append(UUID.randomUUID());
            vodObj.put("vod_id", sbId2.toString());
            vodName = "热门合集";
        } else if ("1".equals(page) && type.equals("rank")) {
            vodObj = new JSONObject();
            StringBuilder sbId3 = BuilderUtils.b("rankCol");
            sbId3.append(UUID.randomUUID());
            sbId3.append("@");
            sbId3.append("rankCol");
            sbId3.append(UUID.randomUUID());
            vodObj.put("vod_id", sbId3.toString());
            vodName = "排行榜合集";
        } else {
            if (!"1".equals(page) || !type.equals("his")) {
                return;
            }
            vodObj = new JSONObject();
            StringBuilder sbId4 = BuilderUtils.b("hisCol");
            sbId4.append(UUID.randomUUID());
            sbId4.append("@");
            sbId4.append("hisCol");
            sbId4.append(UUID.randomUUID());
            vodObj.put("vod_id", sbId4.toString());
            vodName = "历史合集";
        }
        vodObj.put("vod_name", vodName);
        vodObj.put("vod_pic", "https://ts1.cn.mm.bing.net/th/id/R-C.1aada2475d9851291fc5bef3879ea8ce?rik=9H3yELyeynR2wA&riu=http%3a%2f%2fpic.3h3.com%2fup%2f2015-12%2f2015121227270835514629.jpg&ehk=Sg1VqYsgoeYzuAnVMRjm6zYCrBGLYM8CQn5%2fwJPtbg0%3d&risl=&pid=ImgRaw&r=0");
        outArray.put(vodObj);
    }

    public String categoryContent(String type, String page, boolean filter, HashMap<String, String> params) {
        try {
            String responseJson = com.github.catvod.spider.merge.k0.StringUtils.d(h(type, page, params), (type.equals("hot") || type.equals("recm") || type.equals("his")) ? k() : i());
            if (type.equals("recm") && BilibiliApi.i().Subtitle.get("recmCol") == null) {
                BilibiliApi.i().Subtitle.put("recmCol", responseJson);
            }
            JSONArray vodArray = new JSONArray();
            m(type, page, vodArray);
            l(type, responseJson, vodArray);
            int pageNum = Integer.parseInt(page);
            JSONObject resultObj = new JSONObject();
            resultObj.put("page", pageNum);
            if (vodArray.length() >= 19) {
                pageNum++;
            }
            resultObj.put("pagecount", pageNum);
            resultObj.put("limit", 19);
            resultObj.put("total", Integer.MAX_VALUE);
            resultObj.put("list", vodArray);
            return resultObj.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    @Override // com.github.catvod.en.NetPan
    public String detailContent(List<String> ids) throws JSONException {
        String picPrefix;
        String prefix;
        String pic;
        if (!BilibiliApi.i().f) {
            BilibiliApi.i().g();
        }
        String[] idParts = ids.get(0).split("@");
        String bvid = idParts[0];
        String aid = idParts[1];
        if (bvid.startsWith("recmCol")) {
            SpiderDebug.log("RECM_HEJI start");
            VodItem vodItem = new VodItem();
            vodItem.n("https://ts1.cn.mm.bing.net/th/id/R-C.1aada2475d9851291fc5bef3879ea8ce?rik=9H3yELyeynR2wA&riu=http%3a%2f%2fpic.3h3.com%2fup%2f2015-12%2f2015121227270835514629.jpg&ehk=Sg1VqYsgoeYzuAnVMRjm6zYCrBGLYM8CQn5%2fwJPtbg0%3d&risl=&pid=ImgRaw&r=0");
            vodItem.m("推荐合集");
            vodItem.g("推荐");
            LinkedHashMap<String, String> playMap = new LinkedHashMap<>();
            ArrayList<String> episodeList = new ArrayList<>();
            String cachedJson = (String) BilibiliApi.i().Subtitle.get("recmCol");
            if (com.github.catvod.spider.merge.P0.StringUtils.b(cachedJson)) {
                cachedJson = com.github.catvod.spider.merge.k0.StringUtils.d("https://api.bilibili.com/x/web-interface/wbi/index/top/feed/rcmd?ps=20", k());
                BilibiliApi.i().Subtitle.put("recmCol", cachedJson);
            }
            JSONArray itemsArr = new JSONObject(cachedJson).getJSONObject("data").getJSONArray("item");
            int idx = 0;
            while (idx < itemsArr.length()) {
                JSONObject itemObj = itemsArr.getJSONObject(idx);
                JSONObject vodObj = new JSONObject();
                String picUrl = itemObj.getString("pic");
                if (picUrl.startsWith("//")) {
                    picUrl = ConcatUtils.a("https:", picUrl);
                }
                String itemId = itemObj.getString("id");
                if (com.github.catvod.spider.merge.P0.StringUtils.b(picUrl)) {
                    picPrefix = "//";
                } else {
                    StringBuilder sb = new StringBuilder();
                    picPrefix = "//";
                    sb.append(itemObj.getString("bvid"));
                    sb.append("@");
                    sb.append(itemId);
                    vodObj.put("vod_id", sb.toString());
                    String title = itemObj.getString("title");
                    vodObj.put("vod_name", JsoupParser.d(title).s0());
                    episodeList.add(title + "$" + itemId + "+" + itemObj.getString("cid"));
                }
                idx++;
            }
            playMap.put("B站", TextUtils.join("#", episodeList));
            playMap.put("B站普画", TextUtils.join("#", episodeList));
            vodItem.o(TextUtils.join("$$$", playMap.keySet()));
            vodItem.p(TextUtils.join("$$$", playMap.values()));
            return VodResult.m(vodItem);
        }
        prefix = "//";
        String siteName = "B站";
        String idKey = "aid";
        if (bvid.startsWith("hotCol")) {
            SpiderDebug.log("HOT_HEJI start");
            VodItem vodItem2 = new VodItem();
            vodItem2.n("https://ts1.cn.mm.bing.net/th/id/R-C.1aada2475d9851291fc5bef3879ea8ce?rik=9H3yELyeynR2wA&riu=http%3a%2f%2fpic.3h3.com%2fup%2f2015-12%2f2015121227270835514629.jpg&ehk=Sg1VqYsgoeYzuAnVMRjm6zYCrBGLYM8CQn5%2fwJPtbg0%3d&risl=&pid=ImgRaw&r=0");
            vodItem2.m("热门合集");
            vodItem2.g("热门");
            LinkedHashMap<String, String> playMap2 = new LinkedHashMap<>();
            ArrayList<String> episodeList2 = new ArrayList<>();
            JSONArray hotArr = new JSONObject(com.github.catvod.spider.merge.k0.StringUtils.d("https://api.bilibili.com/x/web-interface/popular?ps=20&pn=", k())).getJSONObject("data").getJSONArray("list");
            int idx2 = 0;
            while (idx2 < hotArr.length()) {
                JSONObject itemObj2 = hotArr.getJSONObject(idx2);
                JSONObject vodObj2 = new JSONObject();
                String picUrl2 = itemObj2.getString("pic");
                if (picUrl2.startsWith(prefix)) {
                    picUrl2 = ConcatUtils.a("https:", picUrl2);
                }
                String itemId2 = itemObj2.getString(idKey);
                if (com.github.catvod.spider.merge.P0.StringUtils.b(picUrl2)) {
                    pic = picUrl2;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    pic = picUrl2;
                    sb2.append(itemObj2.getString("bvid"));
                    sb2.append("@");
                    sb2.append(itemId2);
                    vodObj2.put("vod_id", sb2.toString());
                    String title2 = itemObj2.getString("title");
                    vodObj2.put("vod_name", JsoupParser.d(title2).s0());
                    episodeList2.add(title2 + "$" + itemId2 + "+" + itemObj2.getString("cid"));
                }
                idx2++;
                idKey = idKey;
            }
            playMap2.put(siteName, TextUtils.join("#", episodeList2));
            playMap2.put("B站普画", TextUtils.join("#", episodeList2));
            vodItem2.o(TextUtils.join("$$$", playMap2.keySet()));
            vodItem2.p(TextUtils.join("$$$", playMap2.values()));
            return VodResult.m(vodItem2);
        }
        if (bvid.startsWith("rankCol")) {
            SpiderDebug.log("RANK_HEJI start");
            VodItem vodItem3 = new VodItem();
            vodItem3.n("https://ts1.cn.mm.bing.net/th/id/R-C.1aada2475d9851291fc5bef3879ea8ce?rik=9H3yELyeynR2wA&riu=http%3a%2f%2fpic.3h3.com%2fup%2f2015-12%2f2015121227270835514629.jpg&ehk=Sg1VqYsgoeYzuAnVMRjm6zYCrBGLYM8CQn5%2fwJPtbg0%3d&risl=&pid=ImgRaw&r=0");
            vodItem3.m("排行榜合集");
            vodItem3.g("排行榜");
            LinkedHashMap<String, String> playMap3 = new LinkedHashMap<>();
            ArrayList<String> episodeList3 = new ArrayList<>();
            JSONArray rankArr = new JSONObject(com.github.catvod.spider.merge.k0.StringUtils.d("https://api.bilibili.com/x/web-interface/ranking/v2?rid=0&type=all", k())).getJSONObject("data").getJSONArray("list");
            int idx3 = 0;
            while (idx3 < rankArr.length()) {
                JSONObject itemObj3 = rankArr.getJSONObject(idx3);
                JSONObject vodObj3 = new JSONObject();
                String picUrl3 = itemObj3.getString("pic");
                if (picUrl3.startsWith(prefix)) {
                    picUrl3 = ConcatUtils.a("https:", picUrl3);
                }
                String itemId3 = itemObj3.getString(idKey);
                if (com.github.catvod.spider.merge.P0.StringUtils.b(picUrl3)) {
                    rankArr = rankArr;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    rankArr = rankArr;
                    sb3.append(itemObj3.getString("bvid"));
                    sb3.append("@");
                    sb3.append(itemId3);
                    vodObj3.put("vod_id", sb3.toString());
                    String title3 = itemObj3.getString("title");
                    vodObj3.put("vod_name", JsoupParser.d(title3).s0());
                    episodeList3.add(title3 + "$" + itemId3 + "+" + itemObj3.getString("cid"));
                }
                idx3++;
                idKey = idKey;
            }
            playMap3.put(siteName, TextUtils.join("#", episodeList3));
            playMap3.put("B站普画", TextUtils.join("#", episodeList3));
            vodItem3.o(TextUtils.join("$$$", playMap3.keySet()));
            vodItem3.p(TextUtils.join("$$$", playMap3.values()));
            return VodResult.m(vodItem3);
        }
        if (bvid.startsWith("hisCol")) {
            SpiderDebug.log("HIS_HEJI start");
            VodItem vodItem4 = new VodItem();
            vodItem4.n("https://ts1.cn.mm.bing.net/th/id/R-C.1aada2475d9851291fc5bef3879ea8ce?rik=9H3yELyeynR2wA&riu=http%3a%2f%2fpic.3h3.com%2fup%2f2015-12%2f2015121227270835514629.jpg&ehk=Sg1VqYsgoeYzuAnVMRjm6zYCrBGLYM8CQn5%2fwJPtbg0%3d&risl=&pid=ImgRaw&r=0");
            vodItem4.m("历史合集");
            vodItem4.g("历史");
            LinkedHashMap<String, String> playMap4 = new LinkedHashMap<>();
            ArrayList<String> episodeList4 = new ArrayList<>();
            JSONArray hisArr = new JSONObject(com.github.catvod.spider.merge.k0.StringUtils.d("https://api.bilibili.com/x/v2/history?ps=20&pn=", k())).getJSONArray("data");
            int idx4 = 0;
            while (idx4 < hisArr.length()) {
                JSONObject itemObj4 = hisArr.getJSONObject(idx4);
                JSONObject vodObj4 = new JSONObject();
                String picUrl4 = itemObj4.getString("pic");
                if (picUrl4.startsWith(prefix)) {
                    picUrl4 = ConcatUtils.a("https:", picUrl4);
                }
                String itemId4 = itemObj4.getString(idKey);
                if (com.github.catvod.spider.merge.P0.StringUtils.b(picUrl4)) {
                    hisArr = hisArr;
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    hisArr = hisArr;
                    sb4.append(itemObj4.getString("bvid"));
                    sb4.append("@");
                    sb4.append(itemId4);
                    vodObj4.put("vod_id", sb4.toString());
                    String title4 = itemObj4.getString("title");
                    vodObj4.put("vod_name", JsoupParser.d(title4).s0());
                    episodeList4.add(title4 + "$" + itemId4 + "+" + itemObj4.getString("cid"));
                }
                idx4++;
                idKey = idKey;
            }
            playMap4.put(siteName, TextUtils.join("#", episodeList4));
            playMap4.put("B站普画", TextUtils.join("#", episodeList4));
            vodItem4.o(TextUtils.join("$$$", playMap4.keySet()));
            vodItem4.p(TextUtils.join("$$$", playMap4.values()));
            return VodResult.m(vodItem4);
        }
        com.github.catvod.spider.merge.O.VodCategory vodDetail = Subtitle.b(com.github.catvod.spider.merge.f0.HttpClient.m(ConcatUtils.a("https://api.bilibili.com/x/web-interface/view?aid=", aid), k(), null)).a();
        VodItem vodItem5 = new VodItem();
        vodItem5.l(ids.get(0));
        vodItem5.n(vodDetail.g());
        vodItem5.m(vodDetail.i());
        vodItem5.g(vodDetail.j());
        vodItem5.j(vodDetail.b());
        vodItem5.q((vodDetail.c().longValue() / 60) + "分鐘");
        LinkedHashMap<String, String> playMap5 = new LinkedHashMap<>();
        ArrayList<String> episodeList5 = new ArrayList<>();
        Iterator<com.github.catvod.spider.merge.O.e> epIt = vodDetail.f().iterator();
        while (epIt.hasNext()) {
            com.github.catvod.spider.merge.O.StringUtils ep = epIt.next();
            episodeList5.add(ep.b() + "$" + aid + "+" + ep.a());
            epIt = epIt;
            vodItem5 = vodItem5;
        }
        VodItem vodItem6 = vodItem5;
        playMap5.put(siteName, TextUtils.join("#", episodeList5));
        playMap5.put("B站普画", TextUtils.join("#", episodeList5));
        ArrayList<String> upVideoList = new ArrayList<>();
        JSONArray upArr = new JSONObject(BilibiliApi.i().p(vodDetail.e().a())).getJSONObject("data").getJSONObject("list").getJSONArray("vlist");
        int idx5 = 0;
        while (idx5 < upArr.length()) {
            JSONObject upItem = upArr.getJSONObject(idx5);
            upVideoList.add(upItem.getString("title") + "$" + upItem.optLong("aid") + "+" + upItem.getString("bvid"));
            idx5++;
        }
        playMap5.put("Up主视频", TextUtils.join("#", upVideoList));
        playMap5.put("Up主视频普画", TextUtils.join("#", upVideoList));
        JSONArray relatedArr = new JSONObject(com.github.catvod.spider.merge.f0.HttpClient.m("https://api.bilibili.com/x/web-interface/archive/related?bvid=" + bvid, k(), null)).optJSONArray("data");
        ArrayList<String> relatedList = new ArrayList<>();
        for (int i = 0; i < relatedArr.length(); i++) {
            JSONObject relatedItem = relatedArr.getJSONObject(i);
            relatedList.add(relatedItem.getString("title") + "$" + relatedItem.optLong("aid") + "+" + relatedItem.optLong("cid"));
        }
        playMap5.put("相关推荐", TextUtils.join("#", relatedList));
        playMap5.put("相关推荐普画", TextUtils.join("#", relatedList));
        vodItem6.o(TextUtils.join("$$$", playMap5.keySet()));
        vodItem6.p(TextUtils.join("$$$", playMap5.values()));
        return VodResult.m(vodItem6);
    }

    public String getBiliJct(String cookieStr) {
        int startIdx = cookieStr.indexOf("bili_jct=");
        if (startIdx == -1) {
            SpiderDebug.log("bili_jct not found in the cookie string.");
            return "";
        }
        int endIdx = cookieStr.indexOf(";", startIdx);
        if (endIdx == -1) {
            endIdx = cookieStr.length();
        }
        String jctValue = cookieStr.substring(startIdx + 9, endIdx);
        com.github.catvod.spider.merge.B.LogUtils.b("bili_jct value: ", jctValue);
        return jctValue;
    }

    public String getBiliMpd(String aid, String cid, String quality) {
        com.github.catvod.spider.merge.O.a filterSet = Subtitle.b(new JSONObject(com.github.catvod.spider.merge.f0.HttpClient.m("https://api.bilibili.com/x/player/playurl?avid=" + aid + "&cid=" + cid + "&qn=127&fnval=4048&fourk=1", k(), null)).toString()).a().a();
        StringBuilder sb = new StringBuilder();
        Iterator<com.github.catvod.spider.merge.O.c> audioIt = filterSet.a().iterator();
        if (audioIt.hasNext()) {
            audioIt.next();
            throw null;
        }
        f(filterSet, sb, quality);
        if (sb.length() == 0 && filterSet.d().size() > 0) {
            f(filterSet, sb, filterSet.d().get(0).g());
        }
        String mpdXml = String.format(Locale.getDefault(), "<MPD xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"urn:mpeg:dash:schema:mpd:2011\" xsi:schemaLocation=\"urn:mpeg:dash:schema:mpd:2011 DASH-MPD.xsd\" type=\"static\" mediaPresentationDuration=\"PT%sS\" minBufferTime=\"PT%sS\" profiles=\"urn:mpeg:dash:profile:isoff-on-demand:2011\">\n<Period duration=\"PT%sS\" start=\"PT0S\">\n%s\n%s\n</Period>\n</MPD>", filterSet.b(), filterSet.c(), filterSet.b(), sb.toString(), "");
        com.github.catvod.spider.merge.B.LogUtils.b("mpd", mpdXml);
        return mpdXml;
    }

    public String homeContent(boolean filter) {
        if (this.config.has("json")) {
            return com.github.catvod.spider.merge.f0.HttpClient.l(this.config.get("json").getAsString());
        }
        ArrayList<com.github.catvod.spider.merge.K.VodCategory> categories = new ArrayList<>();
        LinkedHashMap<String, List<com.github.catvod.spider.merge.K.FilterGroup>> filterMap = new LinkedHashMap<>();
        for (String typeId : this.config.get("type").getAsString().split("#")) {
            categories.add(new com.github.catvod.spider.merge.K.VodCategory(typeId, typeId));
            ArrayList<com.github.catvod.spider.merge.K.FilterGroup> filterGroups = new ArrayList<>();
            filterGroups.add(new com.github.catvod.spider.merge.K.FilterGroup("order", "排序", Arrays.asList(new com.github.catvod.spider.merge.K.FilterValue("預設", "totalrank"), new com.github.catvod.spider.merge.K.FilterValue("最多點擊", "click"), new com.github.catvod.spider.merge.K.FilterValue("最新發布", "pubdate"), new com.github.catvod.spider.merge.K.FilterValue("最多彈幕", "dm"), new com.github.catvod.spider.merge.K.FilterValue("最多收藏", "stow"))));
            filterGroups.add(new com.github.catvod.spider.merge.K.FilterGroup("duration", "時長", Arrays.asList(new com.github.catvod.spider.merge.K.FilterValue("全部時長", "0"), new com.github.catvod.spider.merge.K.FilterValue("60分鐘以上", "4"), new com.github.catvod.spider.merge.K.FilterValue("30~60分鐘", "3"), new com.github.catvod.spider.merge.K.FilterValue("10~30分鐘", "2"), new com.github.catvod.spider.merge.K.FilterValue("10分鐘以下", "1"))));
            filterMap.put(typeId, filterGroups);
        }
        return VodResult.p(categories, filterMap);
    }

    public String homeVideoContent() {
        Subtitle parser = Subtitle.b(com.github.catvod.spider.merge.f0.HttpClient.m("https://api.bilibili.com/x/web-interface/popular?ps=20", i(), null));
        ArrayList vodItems = new ArrayList();
        Iterator<com.github.catvod.spider.merge.O.g> it = com.github.catvod.spider.merge.O.VodResult.a(parser.a().d()).iterator();
        while (it.hasNext()) {
            vodItems.add(it.next().c());
        }
        return VodResult.n(vodItems);
    }

    @Override // com.github.catvod.en.NetPan
    public void init(Context context, String extend) {
        super.init(context, extend);
        this.config = JsonParser.parseString(extend).getAsJsonObject();
        SpiderDebug.log("extend:" + extend);
        BilibiliApi.i().r(this.config);
        SpiderDebug.log("extend: jieshu" + extend);
    }

    public void insertHis(String aid) {
        String cookieStr = (String) ((HashMap) BilibiliApi.i().o()).get("cookie");
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        String biliJct = getBiliJct(cookieStr);
        client.newCall(new Request.Builder().url("https://api.bilibili.com/x/click-interface/web/heartbeat").method("POST", RequestBody.create(MediaType.parse("application/x-www-form-urlencoded"), "aid=" + aid + "&played_time=318&csrf=" + biliJct)).addHeader("cookie", cookieStr).addHeader("Content-Type", "application/x-www-form-urlencoded").build()).execute().close();
    }

    @Override // com.github.catvod.en.NetPan
    public String playerContent(String playFlag, String playParam, List<String> vipFlags) {
        if (BaseApi.isOk("bili")) {
            return "";
        }
        String[] paramParts = playParam.split("\\+");
        String aid = paramParts[0];
        String cid = paramParts[1];
        String quality = playFlag.contains("普画") ? "80" : "127";
        try {
            if (cid.startsWith("BV")) {
                cid = new JSONObject(com.github.catvod.spider.merge.f0.HttpClient.m("https://api.bilibili.com/x/web-interface/view?aid=" + aid, k(), null)).getJSONObject("data").getString("cid");
            }
            insertHis(aid);
        } catch (Exception unused) {
        }
        String danmuUrl = "http://127.0.0.1:9975/api/danmu/?do=danmuku&vodName=https://api.bilibili.com/x/v1/dm/list.so?oid=".concat(cid);
        VodResult playerResult = new VodResult();
        playerResult.w(Server.y(aid, cid, quality));
        playerResult.a(danmuUrl);
        playerResult.b();
        playerResult.g(k());
        return playerResult.toString();
    }

    public String searchContent(String keyword, boolean filter) {
        return categoryContent(keyword, "1", true, new HashMap<>());
    }

    public String searchContent(String keyword, boolean filter, String page) {
        return categoryContent(keyword, page, true, new HashMap<>());
    }
}
