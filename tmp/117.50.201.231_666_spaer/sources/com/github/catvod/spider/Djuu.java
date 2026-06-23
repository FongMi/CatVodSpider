package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.A0.ed;
import com.github.catvod.spider.merge.A0.em;
import com.github.catvod.spider.merge.A0.oj;
import com.github.catvod.spider.merge.A0.rp;
import com.github.catvod.spider.merge.A0.ya;
import com.github.catvod.spider.merge.A0.yi;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import okhttp3.Call;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class Djuu extends Spider {
    public static ArrayList a = new ArrayList();

    /* JADX INFO: renamed from: com.github.catvod.spider.Djuu$1, reason: invalid class name */
    class AnonymousClass1 extends ya {
        @Override // com.github.catvod.spider.merge.A0.xh
        public final void onFailure(Call call, Exception exc) {
        }

        @Override // com.github.catvod.spider.merge.A0.xh
        public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        }
    }

    public final String b(String str) {
        try {
            StringBuilder sb = new StringBuilder("https://m.djuu.com");
            sb.append(str);
            sb.append("@Headers=");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("User-Agent", "Mozilla/5.0 (Linux; Android 13; V2049A Build/TP1A.220624.014; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/116.0.0.0 Mobile Safari/537.36");
            jSONObject.put("Referer", "https://m.djuu.com/");
            sb.append(jSONObject.toString());
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public final HashMap c(String str) {
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Linux; Android 13; V2049A Build/TP1A.220624.014; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/116.0.0.0 Mobile Safari/537.36");
        map.put("Referer", "https://m.djuu.com");
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strConcat;
        String strF;
        rp rpVarAh;
        String str3;
        String strF2;
        String strB;
        String strA;
        Djuu djuu = this;
        String str4 = str;
        String str5 = "div.fs-5";
        try {
            if (str4.equals("djlist")) {
                a = new ArrayList();
                if (!str2.equals("1")) {
                    return "";
                }
                strConcat = "https://m.djuu.com/".concat(str4);
            } else {
                strConcat = "https://m.djuu.com" + str4.replace("{pg}", str2);
            }
            em emVarA = oj.a(yi.k(strConcat, djuu.c("https://m.djuu.com")));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (str4.equals("djlist")) {
                rpVarAh = emVarA.ah("div.my-3 div.mb-2");
                strF = "";
            } else {
                rp rpVarAh2 = emVarA.ah("div#djuu-musiclist-djlist div.djuu-list-item");
                strF = emVarA.ah("div.fs-4").f();
                rpVarAh = rpVarAh2;
            }
            int i = 0;
            while (i < rpVarAh.size()) {
                ed edVar = (ed) rpVarAh.get(i);
                if (str4.equals("djlist")) {
                    strF2 = edVar.ah(str5).f();
                    strB = djuu.b(edVar.ah("img").a("src"));
                    str3 = str5;
                    strA = edVar.ah(str5).a("onclick").split("\\('")[1].split("'\\)")[0].replace("1_1.html", "1_{pg}.html");
                } else {
                    str3 = str5;
                    strF2 = edVar.ah("div.me-2 > span").f();
                    strB = djuu.b("/static/mobile/images/play/logo.png");
                    strA = edVar.ah("div.djuu-list-item").a("data-bs-id");
                }
                JSONObject jSONObject2 = new JSONObject();
                if (str4.equals("djlist")) {
                    jSONObject2.put("vod_tag", "folder");
                    jSONObject2.put("vod_id", strA);
                } else {
                    jSONObject2.put("vod_tag", "file");
                    jSONObject2.put("vod_id", strA + "$$$" + strF2 + "$$$" + strB + "$$$" + strF);
                    ArrayList arrayList = a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(strF2);
                    sb.append("$");
                    sb.append(strA);
                    arrayList.add(sb.toString());
                }
                jSONObject2.put("vod_name", strF2);
                jSONObject2.put("vod_pic", strB);
                jSONArray.put(jSONObject2);
                i++;
                djuu = this;
                str4 = str;
                str5 = str3;
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
    public final String d(String str, String str2) {
        try {
            a = new ArrayList();
            String str3 = "https://m.djuu.com/search?musicname=" + URLEncoder.encode(str);
            if (!str2.equals("1")) {
                str3 = "https://m.djuu.com/search?musicname=" + URLEncoder.encode(str) + "&page=" + str2;
            }
            em emVarA = oj.a(yi.k(str3, c("https://m.djuu.com")));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            rp rpVarAh = emVarA.ah("div#djuu-musiclist-search div.djuu-list-item");
            for (int i = 0; i < rpVarAh.size(); i++) {
                ed edVar = (ed) rpVarAh.get(i);
                String strF = edVar.ah("div.me-2 > span").f();
                String strB = b("/static/mobile/images/play/logo.png");
                String strA = edVar.ah("div.djuu-list-item").a("data-bs-id");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("vod_id", strA + "$$$" + strF + "$$$" + strB + "$$$");
                jSONObject2.put("vod_name", strF);
                jSONObject2.put("vod_pic", strB);
                jSONObject2.put("vod_tag", "file");
                jSONObject2.put("vod_remarks", "");
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String detailContent(List<String> list) {
        try {
            String[] strArrSplit = list.get(0).split("\\$\\$\\$");
            String str = strArrSplit[0];
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("vod_id", list);
            jSONObject2.put("vod_name", a.size() >= 1 ? strArrSplit[3] : strArrSplit[1]);
            jSONObject2.put("vod_pic", strArrSplit[2]);
            jSONObject2.put("vod_play_from", "DJ呦呦网");
            if (a.size() >= 1) {
                jSONObject2.put("vod_play_url", TextUtils.join("#", a));
            } else {
                jSONObject2.put("vod_play_url", strArrSplit[1] + "$" + str);
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String homeContent(boolean z) {
        try {
            JSONArray jSONArray = new JSONArray();
            String[] strArrSplit = "曲库".split("&");
            String[] strArrSplit2 = "djlist".split("&");
            for (int i = 0; i < strArrSplit.length; i++) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type_id", strArrSplit2[i]);
                jSONObject.put("type_name", strArrSplit[i]);
                if (strArrSplit[i].contains("曲库")) {
                    jSONObject.put("type_flag", "1");
                }
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("class", jSONArray);
            jSONObject2.put("filters", new JSONObject("{}"));
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public void init(Context context) {
        super.init(context);
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strString;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("User-Agent", "Mozilla/5.0 (Linux; Android 13; V2049A Build/TP1A.220624.014; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/116.0.0.0 Mobile Safari/537.36");
            jSONObject.put("Referer", "https://m.djuu.com/");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("id", str2);
            HashMap mapC = c("https://m.djuu.com");
            try {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1();
                yi.i(yi.f(), "https://m.djuu.com/play/music", linkedHashMap, mapC, anonymousClass1);
                strString = ((Response) anonymousClass1.getResult()).body().string();
            } catch (Throwable th) {
                th.printStackTrace();
                strString = null;
            }
            String strOptString = new JSONObject(strString).getJSONObject("data").optString("url");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("url", strOptString);
            jSONObject2.put("parse", 0);
            jSONObject2.put("playUrl", "");
            jSONObject2.put("header", jSONObject.toString());
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        return d(str, "1");
    }

    public String searchContent(String str, boolean z, String str2) {
        return d(str, str2);
    }
}
