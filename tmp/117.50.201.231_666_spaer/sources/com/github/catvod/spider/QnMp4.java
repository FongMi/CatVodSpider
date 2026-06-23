package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.A0.ed;
import com.github.catvod.spider.merge.A0.oj;
import com.github.catvod.spider.merge.A0.rp;
import com.github.catvod.spider.merge.A0.wb;
import com.github.catvod.spider.merge.A0.wh;
import com.github.catvod.spider.merge.A0.yi;
import com.github.catvod.spider.merge.a.C0529a;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class QnMp4 extends Spider {
    public String a;

    public final HashMap b() {
        HashMap mapF = wb.f("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
        mapF.put("Referer", this.a + "/");
        return mapF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            String strReplace = this.a + "/ms/{cateId}--------" + str2 + "---.html";
            if (z && map != null && map.size() > 0) {
                for (String str3 : map.keySet()) {
                    String str4 = map.get(str3);
                    if (str4.length() > 0) {
                        strReplace = strReplace.replace("{" + str3 + "}", str4);
                    }
                }
            }
            rp rpVarAh = oj.a(yi.k(strReplace.replaceAll("\\{cateId\\}", str), b())).ah("ul.content-list li");
            for (int i = 0; i < rpVarAh.size(); i++) {
                ed edVar = (ed) rpVarAh.get(i);
                String strF = edVar.ah("h3").f();
                String strG = wh.g(this.a, edVar.ah("img").a("src"));
                String strF2 = edVar.ah(".bottom2").f();
                String strA = edVar.ah("a").a("href");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("vod_id", strA);
                jSONObject2.put("vod_name", strF);
                jSONObject2.put("vod_pic", strG);
                jSONObject2.put("vod_remarks", strF2);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("page", str2);
            jSONObject.put("pagecount", Integer.MAX_VALUE);
            jSONObject.put("limit", jSONArray.length());
            jSONObject.put("total", Integer.MAX_VALUE);
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010a A[Catch: Exception -> 0x017a, TryCatch #2 {Exception -> 0x017a, blocks: (B:30:0x0102, B:32:0x010a, B:33:0x0117, B:35:0x011d, B:36:0x0139, B:38:0x013f, B:41:0x017c), top: B:58:0x0102, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String detailContent(java.util.List<java.lang.String> r24) {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.QnMp4.detailContent(java.util.List):java.lang.String");
    }

    public String homeContent(boolean z) {
        try {
            JSONArray jSONArray = new JSONArray();
            String[] strArrSplit = "电影&电视剧&综艺&动漫&短剧".split("&");
            String[] strArrSplit2 = "1&2&3&4&30".split("&");
            for (int i = 0; i < strArrSplit.length; i++) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type_id", strArrSplit2[i]);
                jSONObject.put("type_name", strArrSplit[i]);
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("class", jSONArray);
            if (z) {
                jSONObject2.put("filters", new JSONObject("{}"));
            }
            return jSONObject2.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public void init(Context context, String str) {
        super.init(context, str);
        if (str.isEmpty()) {
            return;
        }
        try {
            String strOptString = new JSONObject(str).optString("url");
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = str;
            }
            for (String str2 : strOptString.split(",")) {
                String strTrim = str2.trim();
                if (!TextUtils.isEmpty(strTrim)) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strTrim).openConnection();
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.setReadTimeout(5000);
                    httpURLConnection.setRequestMethod("HEAD");
                    httpURLConnection.setInstanceFollowRedirects(true);
                    int responseCode = httpURLConnection.getResponseCode();
                    httpURLConnection.disconnect();
                    if (responseCode >= 200 && responseCode < 400) {
                        this.a = strTrim;
                        return;
                    }
                }
            }
            this.a = str;
        } catch (Exception e) {
            Log.e("QnMp4", "init error", e);
            this.a = str;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
            jSONObject.put("url", str2);
            if (str2.startsWith("tvbox") || str2.startsWith("ed2k")) {
                jSONObject.put("parse", 0);
            } else {
                jSONObject.put("header", jSONObject2.toString());
                jSONObject.put("parse", 1);
            }
            jSONObject.put("playUrl", "");
            return C0529a.addDanmaku(jSONObject.toString());
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String searchContent(String str, boolean z) {
        try {
            JSONArray jSONArray = new JSONArray();
            rp rpVarAh = oj.a(yi.k(this.a + "/vs/-------------.html?wd=" + str, b())).ah("div.sr_lists li");
            for (int i = 0; i < rpVarAh.size(); i++) {
                ed edVar = (ed) rpVarAh.get(i);
                String strF = edVar.ah("h3").f();
                String strG = wh.g(this.a, edVar.ah("img").a("src"));
                String strF2 = edVar.ah(".bottom2").f();
                String strA = edVar.ah("a").a("href");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("vod_id", strA);
                jSONObject.put("vod_name", strF);
                jSONObject.put("vod_pic", strG);
                jSONObject.put("vod_remarks", strF2);
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("list", jSONArray);
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
