package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.k.C0575b;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class RenRen extends Pan {
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException {
        int i;
        int iIndexOf;
        int i2;
        int iIndexOf2;
        int i3;
        int iIndexOf3;
        int iIndexOf4;
        int iIndexOf5;
        int iIndexOf6;
        int iIndexOf7;
        String strSubstring;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        StringBuilder sb = new StringBuilder();
        sb.append("https://www.rrdynb.com/");
        sb.append(str);
        if (!str.endsWith("/")) {
            sb.append("/");
        }
        if (!str2.equals("1")) {
            String string = sb.toString();
            if (string.endsWith("/")) {
                string = string.substring(0, string.length() - 1);
            }
            sb = new StringBuilder();
            sb.append(string);
            if (str.contains("movie")) {
                sb.append("/list_2_");
                sb.append(str2);
                sb.append(".html");
            } else if (str.contains("dianshiju")) {
                sb.append("/list_6_");
                sb.append(str2);
                sb.append(".html");
            } else if (str.contains("zongyi")) {
                sb.append("/list_10_");
                sb.append(str2);
                sb.append(".html");
            } else if (str.contains("dongman")) {
                sb.append("/list_13_");
                sb.append(str2);
                sb.append(".html");
            }
        }
        String string2 = sb.toString();
        HashMap map2 = new HashMap();
        map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36");
        String strL = C0575b.l(string2, map2);
        if (TextUtils.isEmpty(strL)) {
            jSONObject.put("list", jSONArray);
            jSONObject.put("page", 1);
            jSONObject.put("pagecount", 1);
            jSONObject.put("limit", 20);
            jSONObject.put("total", 0);
            return jSONObject.toString();
        }
        int iIndexOf8 = strL.indexOf("<ul id=\"movielist\"");
        if (iIndexOf8 == -1) {
            jSONObject.put("list", jSONArray);
            jSONObject.put("page", 1);
            jSONObject.put("pagecount", 1);
            jSONObject.put("limit", 20);
            jSONObject.put("total", 0);
            return jSONObject.toString();
        }
        int iIndexOf9 = strL.indexOf("</ul>", iIndexOf8);
        if (iIndexOf9 == -1) {
            jSONObject.put("list", jSONArray);
            jSONObject.put("page", 1);
            jSONObject.put("pagecount", 1);
            jSONObject.put("limit", 20);
            jSONObject.put("total", 0);
            return jSONObject.toString();
        }
        String[] strArrSplit = strL.substring(iIndexOf8, iIndexOf9).split("<li class=\"pure-g shadow\"");
        if (strArrSplit.length <= 1) {
            jSONObject.put("list", jSONArray);
            jSONObject.put("page", 1);
            jSONObject.put("pagecount", 1);
            jSONObject.put("limit", 20);
            jSONObject.put("total", 0);
            return jSONObject.toString();
        }
        for (int i4 = 1; i4 < strArrSplit.length; i4++) {
            String str3 = strArrSplit[i4];
            int iIndexOf10 = str3.indexOf("href=\"");
            if (iIndexOf10 != -1 && (iIndexOf = str3.indexOf("\"", (i = iIndexOf10 + 6))) != -1) {
                String strSubstring2 = str3.substring(i, iIndexOf);
                int iIndexOf11 = str3.indexOf("data-original=\"");
                String strSubstring3 = (iIndexOf11 == -1 || (iIndexOf2 = str3.indexOf("\"", (i2 = iIndexOf11 + 15))) == -1) ? "" : str3.substring(i2, iIndexOf2);
                int iIndexOf12 = str3.indexOf("title=\"");
                String strSubstring4 = (iIndexOf12 == -1 || (iIndexOf3 = str3.indexOf("\"", (i3 = iIndexOf12 + 7))) == -1) ? "" : str3.substring(i3, iIndexOf3);
                if (TextUtils.isEmpty(strSubstring4) && (iIndexOf5 = str3.indexOf("<h2")) != -1 && (iIndexOf6 = str3.indexOf(">", iIndexOf5)) != -1 && (iIndexOf7 = str3.indexOf("</a>", iIndexOf6)) != -1 && (strSubstring = str3.substring(iIndexOf6 + 1, iIndexOf7)) != null) {
                    strSubstring4 = strSubstring.replace("<i>", "").replace("</i>", "").trim();
                }
                if (TextUtils.isEmpty(strSubstring4)) {
                    strSubstring4 = "";
                } else {
                    String str4 = strSubstring4;
                    int iIndexOf13 = str4.indexOf("《");
                    if (iIndexOf13 != -1 && (iIndexOf4 = str4.indexOf("》", iIndexOf13)) != -1) {
                        strSubstring4 = str4.substring(iIndexOf13 + 1, iIndexOf4);
                    }
                }
                if (!TextUtils.isEmpty(strSubstring4) && !TextUtils.isEmpty(strSubstring2)) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("vod_id", strSubstring2);
                    jSONObject2.put("vod_name", strSubstring4);
                    jSONObject2.put("vod_pic", strSubstring3);
                    jSONObject2.put("vod_remarks", "");
                    jSONArray.put(jSONObject2);
                }
            }
        }
        jSONObject.put("list", jSONArray);
        jSONObject.put("page", Integer.parseInt(str2));
        jSONObject.put("pagecount", 100);
        jSONObject.put("limit", 20);
        jSONObject.put("total", 20);
        return jSONObject.toString();
    }

    @Override // com.github.catvod.spider.Pan
    public String detailContent(List<String> list) throws JSONException {
        String strSubstring;
        String strTrim;
        int iIndexOf;
        int iIndexOf2;
        int i;
        int iIndexOf3;
        int iIndexOf4;
        int iIndexOf5;
        int iIndexOf6;
        JSONObject jSONObject = new JSONObject();
        String str = "https://www.rrdynb.com" + list.get(0);
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36");
        String strL = C0575b.l(str, map);
        if (TextUtils.isEmpty(strL)) {
            jSONObject.put("msg", "获取详情页失败");
            return jSONObject.toString();
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("vod_id", "");
        jSONObject2.put("vod_name", "");
        jSONObject2.put("vod_pic", "");
        jSONObject2.put("vod_remarks", "");
        jSONObject2.put("vod_content", "");
        int iIndexOf7 = strL.indexOf("movie-des shadow");
        if (iIndexOf7 == -1) {
            iIndexOf7 = strL.indexOf("movie-des");
        }
        if (iIndexOf7 == -1) {
            jSONObject.put("msg", "无法定位电影信息区域");
            return jSONObject.toString();
        }
        int iIndexOf8 = strL.indexOf("</div>", iIndexOf7);
        if (iIndexOf8 != -1) {
            int iIndexOf9 = strL.indexOf("<!--网友评论", iIndexOf8 + 6);
            if (iIndexOf9 != -1) {
                iIndexOf8 = iIndexOf9 + 9;
            }
            strSubstring = strL.substring(iIndexOf7, iIndexOf8);
        } else {
            strSubstring = strL.substring(iIndexOf7);
        }
        int iIndexOf10 = strSubstring.indexOf("<h1>");
        if (iIndexOf10 == -1 || (iIndexOf4 = strSubstring.indexOf("</h1>", iIndexOf10)) == -1) {
            strTrim = "";
        } else {
            String strReplace = strSubstring.substring(iIndexOf10 + 4, iIndexOf4).replace("&amp;", "&").replace("&quot;", "\"");
            strTrim = (TextUtils.isEmpty(strReplace) || (iIndexOf5 = strReplace.indexOf("《")) == -1 || (iIndexOf6 = strReplace.indexOf("》", iIndexOf5)) == -1) ? strReplace : strReplace.substring(iIndexOf5 + 1, iIndexOf6).replaceAll("<.*?>", "").trim();
        }
        if (!TextUtils.isEmpty(strTrim)) {
            jSONObject2.put("vod_name", strTrim);
        }
        int iIndexOf11 = strSubstring.indexOf("<div class=\"movie-txt\"");
        if (iIndexOf11 != -1 && (iIndexOf2 = strSubstring.indexOf("src=\"", iIndexOf11)) != -1 && (iIndexOf3 = strSubstring.indexOf("\"", (i = iIndexOf2 + 5))) != -1) {
            String strSubstring2 = strSubstring.substring(i, iIndexOf3);
            if (strSubstring2.startsWith("http") && (strSubstring2.contains(".jpg") || strSubstring2.contains(".png"))) {
                jSONObject2.put("vod_pic", strSubstring2);
            }
        }
        int iIndexOf12 = strSubstring.indexOf("剧情简介：");
        if (iIndexOf12 != -1 && (iIndexOf = strSubstring.indexOf("资源：", iIndexOf12)) != -1) {
            jSONObject2.put("vod_content", strSubstring.substring(iIndexOf12 + 5, iIndexOf).replaceAll("<[^>]+>", "").replace("&nbsp;", " ").trim());
        }
        ArrayList arrayList = new ArrayList();
        int iIndexOf13 = strSubstring.indexOf("href=\"");
        while (iIndexOf13 != -1) {
            int i2 = iIndexOf13 + 6;
            int iIndexOf14 = strSubstring.indexOf("\"", i2);
            if (iIndexOf14 == -1) {
                break;
            }
            String strSubstring3 = strSubstring.substring(i2, iIndexOf14);
            if (strSubstring3.contains("pan.baidu.com") || strSubstring3.contains("pan.quark.cn") || strSubstring3.contains("www.aliyundrive.com")) {
                int iIndexOf15 = strSubstring3.indexOf("#");
                if (iIndexOf15 != -1) {
                    strSubstring3 = strSubstring3.substring(0, iIndexOf15);
                }
                arrayList.add(C0529a.filterCloudDiskLinks(strSubstring3.replace("&amp;", "&").replace("?entry=nmmecc", "")));
            }
            iIndexOf13 = strSubstring.indexOf("href=\"", iIndexOf14 + 1);
        }
        if (arrayList.size() > 0) {
            PanOrder.sort(arrayList);
            jSONObject2.put("vod_play_from", detailContentVodPlayFrom(arrayList));
            jSONObject2.put("vod_play_url", detailContentVodPlayUrl(arrayList));
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject2);
        jSONObject.put("list", jSONArray);
        return C0529a.processVodData(jSONObject.toString());
    }

    public String homeContent(boolean z) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        List listAsList = Arrays.asList("movie", "dianshiju", "zongyi", "dongman");
        List listAsList2 = Arrays.asList("电影", "电视剧", "老电影", "动漫");
        for (int i = 0; i < listAsList.size(); i++) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type_id", listAsList.get(i));
            jSONObject.put("type_name", listAsList2.get(i));
            jSONArray.put(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("class", jSONArray);
        jSONObject3.put("filters", jSONObject2);
        return jSONObject3.toString();
    }

    @Override // com.github.catvod.spider.Pan
    public void init(Context context, String str) {
        try {
            super.init(context, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String searchContent(String str, boolean z) throws JSONException {
        int i;
        int iIndexOf;
        int i2;
        int iIndexOf2;
        int iIndexOf3;
        int iIndexOf4;
        int iIndexOf5;
        int iIndexOf6;
        int iIndexOf7;
        String strSubstring;
        int i3;
        int iIndexOf8;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (TextUtils.isEmpty(str)) {
            jSONObject.put("list", jSONArray);
            jSONObject.put("page", 1);
            jSONObject.put("pagecount", 1);
            jSONObject.put("limit", 20);
            jSONObject.put("total", 0);
            return jSONObject.toString();
        }
        String str2 = "https://www.rrdynb.com/plus/search.php?q=" + URLEncoder.encode(str);
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36");
        String strL = C0575b.l(str2, map);
        if (TextUtils.isEmpty(strL)) {
            jSONObject.put("list", jSONArray);
            jSONObject.put("page", 1);
            jSONObject.put("pagecount", 1);
            jSONObject.put("limit", 20);
            jSONObject.put("total", 0);
            return jSONObject.toString();
        }
        int iIndexOf9 = strL.indexOf("<ul id=\"movielist\"");
        if (iIndexOf9 == -1) {
            jSONObject.put("list", jSONArray);
            jSONObject.put("page", 1);
            jSONObject.put("pagecount", 1);
            jSONObject.put("limit", 20);
            jSONObject.put("total", 0);
            return jSONObject.toString();
        }
        int iIndexOf10 = strL.indexOf("</ul>", iIndexOf9);
        if (iIndexOf10 == -1) {
            jSONObject.put("list", jSONArray);
            jSONObject.put("page", 1);
            jSONObject.put("pagecount", 1);
            jSONObject.put("limit", 20);
            jSONObject.put("total", 0);
            return jSONObject.toString();
        }
        String[] strArrSplit = strL.substring(iIndexOf9, iIndexOf10).split("<li class=\"pure-g shadow\"");
        if (strArrSplit.length <= 1) {
            jSONObject.put("list", jSONArray);
            jSONObject.put("page", 1);
            jSONObject.put("pagecount", 1);
            jSONObject.put("limit", 20);
            jSONObject.put("total", 0);
            return jSONObject.toString();
        }
        for (int i4 = 1; i4 < strArrSplit.length; i4++) {
            String str3 = strArrSplit[i4];
            int iIndexOf11 = str3.indexOf("href=\"");
            if (iIndexOf11 != -1 && (iIndexOf = str3.indexOf("\"", (i = iIndexOf11 + 6))) != -1) {
                String strSubstring2 = str3.substring(i, iIndexOf);
                int iIndexOf12 = str3.indexOf("data-original=\"");
                String strTrim = "";
                String strSubstring3 = (iIndexOf12 == -1 || (iIndexOf2 = str3.indexOf("\"", (i2 = iIndexOf12 + 15))) == -1) ? "" : str3.substring(i2, iIndexOf2);
                int iIndexOf13 = str3.indexOf("title=\"");
                if (iIndexOf13 != -1 && (iIndexOf8 = str3.indexOf("\"", (i3 = iIndexOf13 + 7))) != -1) {
                    strTrim = str3.substring(i3, iIndexOf8);
                }
                if (TextUtils.isEmpty(strTrim) && (iIndexOf5 = str3.indexOf("<h2")) != -1 && (iIndexOf6 = str3.indexOf(">", iIndexOf5)) != -1 && (iIndexOf7 = str3.indexOf("</a>", iIndexOf6)) != -1 && (strSubstring = str3.substring(iIndexOf6 + 1, iIndexOf7)) != null) {
                    strTrim = strSubstring.replace("<i>", "").replace("</i>", "").trim();
                }
                String strTrim2 = (TextUtils.isEmpty(strTrim) || (iIndexOf3 = strTrim.indexOf("《")) == -1 || (iIndexOf4 = strTrim.indexOf("》", iIndexOf3)) == -1) ? strTrim : strTrim.substring(iIndexOf3 + 1, iIndexOf4).replaceAll("<.*?>", "").trim();
                if (TextUtils.isEmpty(strTrim2) && !TextUtils.isEmpty(strTrim)) {
                    strTrim2 = strTrim.replaceAll("<.*?>", "").trim();
                }
                if (!TextUtils.isEmpty(strTrim2) && !TextUtils.isEmpty(strSubstring2)) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("vod_id", strSubstring2);
                    jSONObject2.put("vod_name", strTrim2);
                    jSONObject2.put("vod_pic", strSubstring3);
                    jSONObject2.put("vod_remarks", "");
                    jSONArray.put(jSONObject2);
                }
            }
        }
        jSONObject.put("list", jSONArray);
        jSONObject.put("page", 1);
        jSONObject.put("pagecount", 1);
        jSONObject.put("limit", 20);
        jSONObject.put("total", 20);
        return jSONObject.toString();
    }
}
