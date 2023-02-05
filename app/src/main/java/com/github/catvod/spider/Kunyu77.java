package com.github.catvod.spider;

import android.os.Build;
import android.text.TextUtils;

import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.utils.Misc;
import com.github.catvod.utils.okhttp.OkHttpUtil;

import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;


/**
 * Author: @SDL
 */
public class Kunyu77 extends Spider {
    private static final String siteUrl = "http://api.kunyu77.com";

    private String uAgent = "Dalvik/2.1.0 (Linux; U; Android " + Build.VERSION.RELEASE + "; " + Build.MODEL + " Build/" + Build.ID + ")";

    private HashMap<String, String> getHeaders(String url) {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("user-agent", uAgent);
        return headers;
    }
    private HashMap<String, String> getHeadersWithMd5(String url,String time) {
        // HashMap<String, String> headers = new HashMap<>();
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("user-agent", uAgent);
        hashMap.put("TK",Misc.MD5(url));
        hashMap.put("t", time);
        //headers.put("user-agent", uAgent);
        return hashMap;
    }
    @Override
    public String homeContent(boolean filter) {
        try {
            String url = siteUrl + "/api.php/provide/filter";
            String content = OkHttpUtil.string(url, getHeaders(url));
            JSONObject jsonObject = new JSONObject(decryptResponse(content)).getJSONObject("data");
            Iterator<String> keys = jsonObject.keys();
            JSONArray classes = new JSONArray();
            JSONObject filterConfig = new JSONObject();
            JSONArray extendsAll = null;
            while (keys.hasNext()) {
                String typeId = keys.next();
                String typeName = jsonObject.getJSONArray(typeId).getJSONObject(0).getString("cat");
                JSONObject newCls = new JSONObject();
                newCls.put("type_id", typeId);
                newCls.put("type_name", typeName);
                classes.put(newCls);
                try {
                    if (extendsAll == null) {
                        String filterUrl = siteUrl + "/api.php/provide/searchFilter?type_id=0&pagenum=1&pagesize=1";
                        String filterContent = OkHttpUtil.string(filterUrl, getHeaders(filterUrl));
                        JSONObject filterObj = new JSONObject(filterContent).getJSONObject("data").getJSONObject("conditions");
                        extendsAll = new JSONArray();
                        // 年份
                        JSONObject newTypeExtend = new JSONObject();
                        newTypeExtend.put("key", "year");
                        newTypeExtend.put("name", "年份");
                        JSONArray newTypeExtendKV = new JSONArray();
                        JSONObject kv = new JSONObject();
                        kv.put("n", "全部");
                        kv.put("v", "");
                        newTypeExtendKV.put(kv);
                        kv = new JSONObject();
                        kv.put("n", "2022");
                        kv.put("v", "2022");
                        newTypeExtendKV.put(kv);
                        kv = new JSONObject();
                        kv.put("n", "2021");
                        kv.put("v", "2021");
                        newTypeExtendKV.put(kv);
                        JSONArray years = filterObj.getJSONArray("y");
                        for (int j = 0; j < years.length(); j++) {
                            JSONObject child = years.getJSONObject(j);
                            kv = new JSONObject();
                            kv.put("n", child.getString("name"));
                            kv.put("v", child.getString("value"));
                            newTypeExtendKV.put(kv);
                        }
                        newTypeExtend.put("value", newTypeExtendKV);
                        extendsAll.put(newTypeExtend);
                        // 地区
                        newTypeExtend = new JSONObject();
                        newTypeExtend.put("key", "area");
                        newTypeExtend.put("name", "地区");
                        newTypeExtendKV = new JSONArray();
                        kv = new JSONObject();
                        kv.put("n", "全部");
                        kv.put("v", "");
                        newTypeExtendKV.put(kv);
                        JSONArray areas = filterObj.getJSONArray("a");
                        for (int j = 0; j < areas.length(); j++) {
                            JSONObject child = areas.getJSONObject(j);
                            kv = new JSONObject();
                            kv.put("n", child.getString("name"));
                            kv.put("v", child.getString("value"));
                            newTypeExtendKV.put(kv);
                        }
                        newTypeExtend.put("value", newTypeExtendKV);
                        extendsAll.put(newTypeExtend);
                        // 类型
                        newTypeExtend = new JSONObject();
                        newTypeExtend.put("key", "category");
                        newTypeExtend.put("name", "类型");
                        newTypeExtendKV = new JSONArray();
                        kv = new JSONObject();
                        kv.put("n", "全部");
                        kv.put("v", "");
                        newTypeExtendKV.put(kv);
                        JSONArray scat = filterObj.getJSONArray("scat");
                        for (int j = 0; j < scat.length(); j++) {
                            JSONObject child = scat.getJSONObject(j);
                            kv = new JSONObject();
                            kv.put("n", child.getString("name"));
                            kv.put("v", child.getString("value"));
                            newTypeExtendKV.put(kv);
                        }
                        newTypeExtend.put("value", newTypeExtendKV);
                        extendsAll.put(newTypeExtend);
                    }
                    if (extendsAll != null && extendsAll.length() > 0) {
                        filterConfig.put(typeId, extendsAll);
                    }
                } catch (Exception e) {
                    SpiderDebug.log(e);
                }
            }
            JSONObject result = new JSONObject();
            result.put("class", classes);
            if (filter) {
                result.put("filters", filterConfig);
            }
            return result.toString();
        } catch (Throwable th) {

        }
        return "";
    }

    @Override
    public String homeVideoContent() {
        try {
            JSONArray videos = new JSONArray();
            try {
                String url = siteUrl + "/api.php/provide/homeBlock?type_id=0";
                String content = OkHttpUtil.string(url, getHeaders(url));
                JSONObject jsonObject = new JSONObject(decryptResponse(content));
                JSONArray jsonArray = jsonObject.getJSONObject("data").getJSONArray("blocks");
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject blockObj = jsonArray.getJSONObject(i);
                    String blockName = blockObj.getString("block_name");
                    if (!blockName.startsWith("热播")) {
                        continue;
                    }
                    JSONArray contents = blockObj.getJSONArray("contents");
                    for (int j = 0; j < contents.length() && j < 3; j++) {
                        JSONObject vObj = contents.getJSONObject(j);
                        JSONObject v = new JSONObject();
                        v.put("vod_id", vObj.getString("id"));
                        v.put("vod_name", vObj.getString("title"));
                        v.put("vod_pic", vObj.getString("videoCover"));
                        v.put("vod_remarks", vObj.getString("msg"));
                        videos.put(v);
                    }
                }
            } catch (Exception e) {

            }
            JSONObject result = new JSONObject();
            result.put("list", videos);
            return result.toString();
        } catch (Throwable th) {

        }
        return "";
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        try {
            String url = siteUrl + "/api.php/provide/searchFilter?type_id=" + tid + "&pagenum=" + pg + "&pagesize=24";
            Set<String> keys = extend.keySet();
            for (String key : keys) {
                String val = extend.get(key).trim();
                if (val.length() == 0)
                    continue;
                url += "&" + key + "=" + URLEncoder.encode(val);
            }
            String content = OkHttpUtil.string(url, getHeaders(url));
            JSONObject dataObject = new JSONObject(decryptResponse(content)).getJSONObject("data");
            JSONArray jsonArray = dataObject.getJSONArray("result");
            JSONArray videos = new JSONArray();
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject vObj = jsonArray.getJSONObject(i);
                JSONObject v = new JSONObject();
                v.put("vod_id", vObj.getString("id"));
                v.put("vod_name", vObj.getString("title"));
                v.put("vod_pic", vObj.getString("videoCover"));
                v.put("vod_remarks", vObj.getString("msg"));
                videos.put(v);
            }
            JSONObject result = new JSONObject();
            int limit = 24;
            int page = Integer.parseInt(dataObject.getString("page"));
            int total = dataObject.getInt("total");
            int pageCount = dataObject.getInt("pagesize");
            result.put("page", page);
            result.put("pagecount", pageCount);
            result.put("limit", limit);
            result.put("total", total);
            result.put("list", videos);
            return result.toString();
        } catch (Throwable th) {

        }
        return "";
    }

    @Override
    public String detailContent(List<String> ids) {
        try {
//            SpiderDebug.log("kuyun77>>ids"+ids);
//            String str2 = String.valueOf(System.currentTimeMillis() / 1000L);
//            String url = siteUrl + "/api.php/provide/videoDetail?ids=" + ids.get(0);
//            url = url + "&pcode=010110002&version=2.0.4&devid=4ac3fe96a6133de96904b8d3c8cfe16d&package=com.sevenVideo.app.android&sys=android&sysver=7.1.2&brand=realme&model=RMX1931&sj=";
//            url = url + str2;
            String str2 = String.valueOf(System.currentTimeMillis() / 1000L);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("http://api.kunyu77.com/api.php/provide/videoDetail");
            stringBuilder2.append("?ids=");
            stringBuilder2.append(ids.get(0));
            stringBuilder2.append("&pcode=010110002&version=2.0.4&devid=4ac3fe96a6133de96904b8d3c8cfe16d&package=com.sevenVideo.app.android&sys=android&sysver=7.1.2&brand=realme&model=RMX1931&sj=");
            stringBuilder2.append(str2);
            String str4 = stringBuilder2.toString();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("/api.php/provide/videoDetailrealme4ac3fe96a6133de96904b8d3c8cfe16d");
            stringBuilder3.append(ids.get(0));
            stringBuilder3.append("RMX1931com.sevenVideo.app.android010110002");
            stringBuilder3.append(str2);
            stringBuilder3.append("android7.1.22.0.4");
            stringBuilder3.append(str2);
            stringBuilder3.append("XSpeUFjJ");
            //JSONObject jSONObject1 = (new JSONObject(c(Vf.h(str4, Q(stringBuilder3.toString(), str2))))).getJSONObject("data");


            String content = OkHttpUtil.string(str4, getHeadersWithMd5(stringBuilder3.toString(),str2));
            SpiderDebug.log("kuyun77>>detailContent11"+content);
            JSONObject dataObject = new JSONObject(decryptResponse(content));
            JSONObject vObj = dataObject.getJSONObject("data");
            JSONObject result = new JSONObject();
            JSONArray list = new JSONArray();
            JSONObject vodAtom = new JSONObject();
            String title = vObj.getString("videoName");
            vodAtom.put("vod_id", vObj.getString("id"));
            vodAtom.put("vod_name", title);
            vodAtom.put("vod_pic", vObj.getString("videoCover"));
            vodAtom.put("type_name", vObj.getString("subCategory"));
            vodAtom.put("vod_year", vObj.getString("year"));
            vodAtom.put("vod_area", vObj.getString("area"));
            vodAtom.put("vod_remarks", vObj.getString("msg"));
            vodAtom.put("vod_actor", vObj.getString("actor"));
            vodAtom.put("vod_director", vObj.getString("director"));
            vodAtom.put("vod_content", vObj.getString("brief").trim());
            String str1 = String.valueOf(System.currentTimeMillis() / 1000L);
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append("http://api.kunyu77.com/api.php/provide/videoPlaylist");
            stringBuilder1.append("?ids=");
            stringBuilder1.append(ids.get(0));
            stringBuilder1.append("&pcode=010110002&version=2.0.4&devid=4ac3fe96a6133de96904b8d3c8cfe16d&package=com.sevenVideo.app.android&sys=android&sysver=7.1.2&brand=realme&model=RMX1931&sj=");
            stringBuilder1.append(str1);
            String str3 = stringBuilder1.toString();
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append("/api.php/provide/videoPlaylistrealme4ac3fe96a6133de96904b8d3c8cfe16d");
            stringBuilder4.append(ids.get(0));
            stringBuilder4.append("RMX1931com.sevenVideo.app.android010110002");
            stringBuilder4.append(str1);
            stringBuilder4.append("android7.1.22.0.4");
            stringBuilder4.append(str1);
            stringBuilder4.append("XSpeUFjJ");


            //url = siteUrl + "/api.php/provide/videoPlaylist?ids=" + ids.get(0);
            content = OkHttpUtil.string(str3, getHeadersWithMd5(stringBuilder4.toString(),str1));
            JSONArray episodes = new JSONObject(content).getJSONObject("data").getJSONArray("episodes");
            LinkedHashMap<String, ArrayList<String>> playlist = new LinkedHashMap<>();
            for (int i = 0; i < episodes.length(); i++) {
                JSONArray playurls = episodes.getJSONObject(i).getJSONArray("playurls");
                for (int j = 0; j < playurls.length(); j++) {
                    JSONObject purl = playurls.getJSONObject(j);
                    String from = purl.getString("playfrom");
                    ArrayList<String> urls = playlist.get(from);
                    if (urls == null) {
                        urls = new ArrayList<>();
                        playlist.put(from, urls);
                    }
                    String name = purl.getString("title").replace(title, "").trim();
                    if (name.isEmpty()) {
                        name = (i + 1) + "";
                    }
                    String pid = purl.getString("playurl");
                    urls.add(name + "$" + pid);
                }
            }
            String vod_play_from = TextUtils.join("$$$", playlist.keySet());
            StringBuilder sb = new StringBuilder();
            Iterator<ArrayList<String>> iter = playlist.values().iterator();
            short fromSize = (short) playlist.size();
            while (iter.hasNext()) {
                fromSize--;
                ArrayList<String> urls = iter.next();
                sb.append(TextUtils.join("#", urls));
                if (fromSize > 0)
                    sb.append("$$$");
            }
            vodAtom.put("vod_play_from", vod_play_from);
            vodAtom.put("vod_play_url", sb.toString());
            list.put(vodAtom);
            result.put("list", list);
            return result.toString();
        } catch (Throwable th) {

        }
        return "";
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        try {
            String videoUrl = id;
            try {
                String url = siteUrl + "/api.php/provide/parserUrl?url=" + id;
                String content = OkHttpUtil.string(url, getHeaders(url));
                JSONObject dataObj = new JSONObject(decryptResponse(content)).getJSONObject("data");
                JSONObject playHeader = dataObj.optJSONObject("playHeader");
                String jxUrl = dataObj.getString("url");
                content = OkHttpUtil.string(jxUrl, getHeaders(jxUrl));
                JSONObject result = Misc.jsonParse(jxUrl, content);
                if (result != null) {
                    result.put("parse", 0);
                    result.put("playUrl", "");
                    if (playHeader != null) {
                        JSONObject header = result.getJSONObject("header");
                        Iterator<String> iter = playHeader.keys();
                        while (iter.hasNext()) {
                            String key = iter.next();
                            header.put(key, " " + playHeader.getString(key));
                        }
                        result.put("header", header.toString());
                    }
                    return result.toString();
                }
            } catch (Throwable th) {

            }
            if (Misc.isVip(videoUrl)) {
                JSONObject result = new JSONObject();
                result.put("parse", 1);
                result.put("jx", "1");
                result.put("url", videoUrl);
                return result.toString();
            }
            JSONObject result = new JSONObject();
            result.put("parse", 0);
            result.put("playUrl", "");
            result.put("url", id);
            return result.toString();
        } catch (Throwable th) {

        }
        return "";
    }

    @Override
    public String searchContent(String key, boolean quick) {
        if (quick)
            return "";
        try {
            String url = siteUrl + "/api.php/provide/searchVideo?searchName=" + URLEncoder.encode(key);
            String content = OkHttpUtil.string(url, getHeaders(url));
            JSONObject dataObject = new JSONObject(decryptResponse(content));
            JSONArray jsonArray = dataObject.getJSONArray("data");
            JSONArray videos = new JSONArray();
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject vObj = jsonArray.getJSONObject(i);
                JSONObject v = new JSONObject();
                String title = vObj.getString("videoName");
                if (!title.contains(key))
                    continue;
                v.put("vod_id", vObj.getString("id"));
                v.put("vod_name", title);
                v.put("vod_pic", vObj.getString("videoCover"));
                v.put("vod_remarks", vObj.getString("msg"));
                videos.put(v);
            }
            JSONObject result = new JSONObject();
            result.put("list", videos);
            return result.toString();
        } catch (Throwable th) {

        }
        return "";
    }

    protected String decryptResponse(String src) {
        return src;
    }

}