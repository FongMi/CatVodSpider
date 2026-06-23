package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.b.C0544h;
import com.github.catvod.spider.merge.k.C0575b;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class ShuangXing extends Pan {
    private String e = "";

    private Map<String, String> l() {
        HashMap mapC = C0544h.c("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/143.0.0.0 Safari/537.36 Edg/143.0.0.0", "Referer", "https://1.star2.cn");
        mapC.put("Cookie", this.e);
        return mapC;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException {
        int i;
        int iIndexOf;
        int i2;
        int iIndexOf2;
        int iIndexOf3;
        int iIndexOf4;
        int i3;
        int iIndexOf5;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        String strL = C0575b.l("https://1.star2.cn/" + str + "_" + str2, l());
        if (TextUtils.isEmpty(strL)) {
            jSONObject.put("list", jSONArray);
            jSONObject.put("page", 1);
            jSONObject.put("pagecount", 1);
            jSONObject.put("limit", 20);
            jSONObject.put("total", 0);
            return jSONObject.toString();
        }
        int iIndexOf6 = strL.indexOf("<ul class=\"erx-list\">");
        if (iIndexOf6 == -1) {
            jSONObject.put("list", jSONArray);
            jSONObject.put("page", 1);
            jSONObject.put("pagecount", 1);
            jSONObject.put("limit", 20);
            jSONObject.put("total", 0);
            return jSONObject.toString();
        }
        int iIndexOf7 = strL.indexOf("</ul>", iIndexOf6);
        if (iIndexOf7 == -1) {
            jSONObject.put("list", jSONArray);
            jSONObject.put("page", 1);
            jSONObject.put("pagecount", 1);
            jSONObject.put("limit", 20);
            jSONObject.put("total", 0);
            return jSONObject.toString();
        }
        String[] strArrSplit = strL.substring(iIndexOf6, iIndexOf7).split("<li class=\"item\">");
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
            int iIndexOf8 = str3.indexOf("<a href=\"");
            if (iIndexOf8 != -1 && (iIndexOf = str3.indexOf("\"", (i = iIndexOf8 + 9))) != -1) {
                String strSubstring = str3.substring(i, iIndexOf);
                int iIndexOf9 = str3.indexOf(">", iIndexOf);
                if (iIndexOf9 != -1 && (iIndexOf2 = str3.indexOf("</a>", (i2 = iIndexOf9 + 1))) != -1) {
                    StringBuilder sb = new StringBuilder(str3.substring(i2, iIndexOf2));
                    while (true) {
                        iIndexOf3 = sb.indexOf("【");
                        if (iIndexOf3 < 0) {
                            break;
                        }
                        int iIndexOf10 = sb.indexOf("】", iIndexOf3);
                        if (iIndexOf10 > iIndexOf3) {
                            sb.delete(iIndexOf3, iIndexOf10 + 1);
                        } else {
                            sb.delete(iIndexOf3, sb.length());
                        }
                    }
                    String string = sb.toString();
                    int iIndexOf11 = str3.indexOf("<span class=\"erx-num-font time\">");
                    if (iIndexOf11 != iIndexOf3 && (iIndexOf4 = str3.indexOf(">", iIndexOf11 + 31)) != -1 && (iIndexOf5 = str3.indexOf("</span>", (i3 = iIndexOf4 + 1))) > 0) {
                        str3.substring(i3, iIndexOf5);
                    }
                    if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(sb)) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("vod_id", strSubstring);
                        jSONObject2.put("vod_name", string);
                        jSONObject2.put("vod_pic", "");
                        jSONObject2.put("vod_remarks", "");
                        jSONArray.put(jSONObject2);
                    }
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
        int i;
        int iIndexOf;
        int iIndexOf2;
        int iIndexOf3;
        JSONObject jSONObject = new JSONObject();
        String strL = C0575b.l("https://1.star2.cn" + list.get(0), l());
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
        int iIndexOf4 = strL.indexOf("<h1");
        if (iIndexOf4 != -1 && (iIndexOf2 = strL.indexOf("</h1>", iIndexOf4)) != -1 && (iIndexOf3 = strL.indexOf(">", iIndexOf4)) != -1 && iIndexOf3 < iIndexOf2) {
            jSONObject2.put("vod_name", strL.substring(iIndexOf3 + 1, iIndexOf2));
        }
        ArrayList arrayList = new ArrayList();
        int iIndexOf5 = strL.indexOf("dlipp-dl-btn");
        while (iIndexOf5 != -1) {
            int iIndexOf6 = strL.indexOf("href=\"", iIndexOf5);
            if (iIndexOf6 == -1 || (iIndexOf = strL.indexOf("\"", (i = iIndexOf6 + 6))) == -1) {
                break;
            }
            arrayList.add(C0529a.filterCloudDiskLinks(strL.substring(i, iIndexOf)));
            iIndexOf5 = strL.indexOf("dlipp-dl-btn", iIndexOf + 1);
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
        List listAsList = Arrays.asList("dj", "ju", "zy", "mv", "rh", "ym", "wj", "dm");
        List listAsList2 = Arrays.asList("短剧", "国剧", "综艺", "电影", "韩日", "英美", "外剧", "动漫");
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
        this.e = com.github.catvod.spider.merge.A.a.a("https://1.star2.cn", l());
    }

    public String searchContent(String str, boolean z) {
        int iIndexOf;
        int iIndexOf2;
        int i;
        int iIndexOf3;
        int i2;
        int iIndexOf4;
        int iIndexOf5;
        int i3;
        int iIndexOf6;
        try {
            JSONArray jSONArray = new JSONArray();
            String strL = C0575b.l("https://1.star2.cn/search/?keyword=" + URLEncoder.encode(str, "UTF-8"), l());
            if (TextUtils.isEmpty(strL) || (iIndexOf = strL.indexOf("<ul class=\"erx-list\">")) == -1 || (iIndexOf2 = strL.indexOf("</ul>", iIndexOf)) == -1) {
                return "{\"list\":[]}";
            }
            String[] strArrSplit = strL.substring(iIndexOf, iIndexOf2).split("<li class=\"item\">");
            if (strArrSplit.length <= 1) {
                return "{\"list\":[]}";
            }
            for (int i4 = 1; i4 < strArrSplit.length; i4++) {
                String str2 = strArrSplit[i4];
                int iIndexOf7 = str2.indexOf("<a href=\"");
                if (iIndexOf7 != -1 && (iIndexOf3 = str2.indexOf("\"", (i = iIndexOf7 + 9))) != -1) {
                    String strSubstring = str2.substring(i, iIndexOf3);
                    int iIndexOf8 = str2.indexOf(">", iIndexOf3);
                    if (iIndexOf8 != -1 && (iIndexOf4 = str2.indexOf("</a>", (i2 = iIndexOf8 + 1))) != -1) {
                        StringBuilder sb = new StringBuilder(str2.substring(i2, iIndexOf4));
                        while (true) {
                            int iIndexOf9 = sb.indexOf("【");
                            if (iIndexOf9 < 0) {
                                break;
                            }
                            int iIndexOf10 = sb.indexOf("】", iIndexOf9);
                            if (iIndexOf10 > iIndexOf9) {
                                sb.delete(iIndexOf9, iIndexOf10 + 1);
                            } else {
                                sb.delete(iIndexOf9, sb.length());
                            }
                        }
                        String string = sb.toString();
                        int iIndexOf11 = str2.indexOf("<span class=\"erx-num-font time\">");
                        String strSubstring2 = (iIndexOf11 == -1 || (iIndexOf5 = str2.indexOf(">", iIndexOf11 + 31)) == -1 || (iIndexOf6 = str2.indexOf("</span>", (i3 = iIndexOf5 + 1))) == -1) ? "" : str2.substring(i3, iIndexOf6);
                        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(strSubstring)) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("vod_id", strSubstring);
                            jSONObject.put("vod_name", string);
                            jSONObject.put("vod_pic", "");
                            jSONObject.put("vod_remarks", strSubstring2);
                            jSONArray.put(jSONObject);
                        }
                    }
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("list", jSONArray);
            return jSONObject2.toString();
        } catch (Exception e) {
            return "{\"list\":[]}";
        }
    }
}
