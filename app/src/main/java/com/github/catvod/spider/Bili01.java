package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;

import com.github.catvod.bean.Result;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Misc;
import com.github.catvod.utils.okhttp.OkHttpUtil;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Bili01 extends Spider {
    private String extend;
    private static final String url = "https://www.bilibili.com";
    private static final String recmUrl = "https://api.bilibili.com/x/web-interface/wbi/index/top/feed/rcmd?y_num=3&fresh_type=4&feed_version=V8&fresh_idx_1h=9&fetch_row=28&fresh_idx=9&brush=9&homepage_ver=1&ps=12&outside_trigger=&w_rid=a7d90770ead893ccfef77d9ae4438cae&wts=1675154158";
    protected JSONObject ext = null;
    private HashMap<String, String> header;

    private String getCookie(String cookie) {
        if (TextUtils.isEmpty(cookie))
            return "buvid3=84B0395D-C9F2-C490-E92E-A09AB48FE26E71636infoc";
        if (cookie.startsWith("http")) return OkHttp.string(cookie).replace("\n", "");
        return cookie;
    }

    private void setHeader() throws Exception {
        header.put("cookie", getCookie(ext.getString("cookie")));
        header.put("User-Agent", Misc.CHROME);
        header.put("Referer", url);
    }

    private void fetchExt() {
        String result = OkHttp.string(extend);
        SpiderDebug.log("bili>>fetchExt>>result:" + result);
        if (!TextUtils.isEmpty(result)) extend = result;
    }

    private void fetchRule() {
        try {
            if (header.containsKey("cookie") && header.get("cookie").length() > 0) return;
            SpiderDebug.log("bili>>fetchRule>>extend:" + extend);
            if (extend.startsWith("http")) fetchExt();
            ext = new JSONObject(extend);
            setHeader();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void init(Context context, String extend) {
        this.extend = extend;
        this.header = new HashMap<>();
        super.init(context, extend);
        try {
            fetchRule();
        } catch (Exception e) {

        }
    }

    @Override
    public String homeContent(boolean filter) {
        JSONObject results = new JSONObject();
        try {
            results.put("class", ext.getJSONArray("classes"));
            if (filter) {
                results.put("filters", ext.getJSONObject("filter"));
            }
        } catch (JSONException e) {
            SpiderDebug.log(e);
        }
        return results.toString();
    }

    @Override
    public String homeVideoContent() {
        fetchRule();
        return categoryContent("自驾游", "1", true, new HashMap<>());
//        try {
//            JSONArray videos = new JSONArray();
//            try {
//                String url = "https://api.bilibili.com/x/web-interface/search/type?search_type=video&keyword=窗 白噪音";
//                String content = OkHttpUtil.string(url, header);
//                JSONObject data = new JSONObject(content).getJSONObject("data");
//                JSONArray RArray = data.getJSONArray("result");
//                for (int i = 0; i < RArray.length(); i++) {
//                    JSONObject info = RArray.getJSONObject(i);
//                    JSONObject result = new JSONObject();
//                    String pic = info.getString("pic");
//                    if (pic.startsWith("//")) {
//                        pic = "https:" + pic;
//                    }
//                    result.put("vod_id", info.getString("bvid"));
//                    String title = info.getString("title");
//                    Document KS = Jsoup.parse(title);
//                    String name = KS.text();
//                    result.put("vod_name", name);
//                    result.put("vod_pic", pic);
//                    String duration = info.getString("duration");
//                    String words = duration.split(":")[0];
//                    String remark = words + "分钟";
//                    result.put("vod_remarks", remark);
//                    videos.put(result);
//                }
//            } catch (Exception e) {
//
//            }
//            JSONObject result = new JSONObject();
//            result.put("list", videos);
//            return result.toString();
//        } catch (Throwable th) {
//
//        }
//        return "";
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        try {
            String url = "https://api.bilibili.com/x/web-interface/search/type?search_type=video&keyword=";
            if (extend != null && extend.size() > 0 && extend.containsKey("tid") && extend.get("tid").length() > 0) {
                url += extend.get("tid");
            } else {
                url += tid;
            }
            if (extend != null && extend.size() > 0) {
                for (Iterator<String> it = extend.keySet().iterator(); it.hasNext(); ) {
                    String key = it.next();
                    String value = extend.get(key);
                    if (value.length() > 0) {
                        url += "&" + key + "=" + URLEncoder.encode(value);
                    }
                }
            }
            url += "&page=" + pg;
            //获取个人推荐
            if (tid.equals("recm")) {
                url = recmUrl;
            }
            SpiderDebug.log("bili>>categoryContent:" + url);
            SpiderDebug.log("bili>>categoryContent>>header:" + header);
            String content = OkHttpUtil.string(url, header);

            SpiderDebug.log("bili>>categoryContent>>content:" + new JSONObject(content));
            SpiderDebug.log("bili>>categoryContent>>header:" + header);
            JSONObject data = new JSONObject(content).getJSONObject("data");

//            JSONObject resp = new JSONObject(OkHttp.string(url, null));
//            JSONArray RSArray = resp.getJSONObject("data").getJSONArray("result");

            JSONArray list = new JSONArray();
            JSONArray RSArray = data.getJSONArray(tid.equals("recm") ? "item" : "result");
            for (int i = 0; i < RSArray.length(); i++) {
                JSONObject info = RSArray.getJSONObject(i);
                JSONObject result = new JSONObject();
                String pic = info.getString("pic");
                if (pic.startsWith("//")) {
                    pic = "https:" + pic;
                }
                result.put("vod_id", info.getString("bvid"));
                String title = info.getString("title");
                Document doc = Jsoup.parse(title);
                String name = doc.text();
                result.put("vod_name", name);
                result.put("vod_pic", pic);
                String duration = info.getString("duration");
                String Split = duration.split(":")[0];
                String remark = Split + "分钟";
                result.put("vod_remarks", remark);
                list.put(result);
            }
            JSONObject result = new JSONObject();
            int limit = 20;
            int page = Integer.parseInt(pg);
            result.put("page", page);
            int pageCount = list.length() == limit ? page + 1 : page;
            result.put("pagecount", pageCount);
            result.put("limit", limit);
            result.put("total", Integer.MAX_VALUE);
            result.put("list", list);
            return result.toString();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String detailContent(List<String> ids) {
        int i = 0;
        try {
            String str = ids.get(0);
            String sb2 = "https://api.bilibili.com/x/web-interface/archive/stat?bvid=" + str;
            JSONObject jSONObject = new JSONObject(OkHttpUtil.string(sb2, null));
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            long j = jSONObject2.getLong("aid");
            String sb4 = j + "";
            String sb6 = "https://api.bilibili.com/x/web-interface/view?aid=" + sb4;
            JSONObject jSONObject3 = new JSONObject(OkHttpUtil.string(sb6, null));
            JSONObject jSONObject4 = jSONObject3.getJSONObject("data");
            JSONObject v = new JSONObject();
            v.put("vod_id", str);
            String string = jSONObject4.getString("title");
            v.put("vod_name", string);
            String string2 = jSONObject4.getString("pic");
            v.put("vod_pic", string2);
            String string3 = jSONObject4.getString("tname");
            v.put("type_name", string3);
            v.put("vod_year", "");
            v.put("vod_area", "");
            String sb7 = jSONObject4.getLong("duration") / 60 + "分钟";
            v.put("vod_remarks", sb7);
            v.put("vod_actor", "");
            v.put("vod_director", "");
            String string4 = jSONObject4.getString("desc");
            v.put("vod_content", string4);
            v.put("vod_play_from", "B站");
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject4.getJSONArray("pages");
            while (true) {
                int length = jSONArray.length();
                if (i < length) {
                    JSONObject jSONObject6 = jSONArray.getJSONObject(i);
                    String string5 = jSONObject6.getString("part");
                    String replace = string5.replace("$", "_").replace("#", "_");
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(replace);
                    sb8.append("$");
                    sb8.append(sb4);
                    sb8.append("+ ");
                    long j2 = jSONObject6.getLong("cid");
                    sb8.append(j2);
                    String sb9 = sb8.toString();
                    arrayList.add(sb9);
                    i++;
                } else {
                    v.put("vod_play_url", TextUtils.join("#", arrayList));
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put(v);
                    JSONObject jSONObject7 = new JSONObject();
                    jSONObject7.put("list", jSONArray2);
                    return jSONObject7.toString();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String playerContent(String str, String str2, List<String> list) {

//        String[] ids = str2.split("\\+");
//        String aid = ids[0];
//        String cid = ids[1];
//        String url = "https://api.bilibili.com/x/player/playurl?avid=" + aid + "&cid=" + cid + "&qn=120&fourk=1";
//        JSONObject resp = null;
//        try {
//            resp = new JSONObject(OkHttp.string(url, header));
//
//        url = resp.getJSONObject("data").getJSONArray("durl").getJSONObject(0).getString("url");
//        } catch (JSONException e) {
//            throw new RuntimeException(e);
//        }
//        return Result.get().url(url).header(header).string();
        try {
            String[] split = str2.split("\\+");
            String str3 = split[0];
            String str4 = split[1];
            String sb2 = "https://api.bilibili.com/x/player/playurl?avid=" + str3 + "&cid= " + str4 + "&qn=120&fourk=1";
            JSONObject jSONObject = new JSONObject(OkHttpUtil.string(sb2, header));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("parse", "0");
            jSONObject2.put("playUrl", "");
            JSONObject jSONObject3 = jSONObject.getJSONObject("data");
            JSONObject jSONObject4 = jSONObject3.getJSONArray("durl").getJSONObject(0);
            String string = jSONObject4.getString("url");
            jSONObject2.put("url", string);
            jSONObject2.put("header", "{\"Referer\":\"https://www.bilibili.com\",\"User-Agent\":\"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/100.0.4896.127 Safari/537.36\"}");
            jSONObject2.put("contentType", "video/x-flv");
            return jSONObject2.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String searchContent(String key, boolean quick) {
        try {
            JSONObject result = new JSONObject();
            String url = "https://api.bilibili.com/x/web-interface/search/type?search_type=video&keyword=" + URLEncoder.encode(key);
            String content = OkHttpUtil.string(url, null);
            JSONObject data = new JSONObject(content).getJSONObject("data");
            JSONArray videos = new JSONArray();
            JSONArray RSArray = data.getJSONArray("result");
            for (int i = 0; i < RSArray.length(); i++) {
                JSONObject info = RSArray.getJSONObject(i);
                JSONObject v = new JSONObject();
                String pic = info.getString("pic");
                if (pic.startsWith("//")) {
                    pic = "https:" + pic;
                }
                v.put("vod_id", info.getString("bvid"));
                String title = info.getString("title");
                Document doc = Jsoup.parse(title);
                String name = doc.text();
                v.put("vod_name", name);
                v.put("vod_pic", pic);
                String duration = info.getString("duration");
                String Split = duration.split(":")[0];
                String remark = Split + "分钟";
                v.put("vod_remarks", remark);
                videos.put(v);
            }
            result.put("list", videos);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }
}