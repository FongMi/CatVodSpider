package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.A0.ed;
import com.github.catvod.spider.merge.A0.em;
import com.github.catvod.spider.merge.A0.oj;
import com.github.catvod.spider.merge.A0.rp;
import com.github.catvod.spider.merge.A0.wb;
import com.github.catvod.spider.merge.A0.wh;
import com.github.catvod.spider.merge.a.C0529a;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class MeijuTT extends Spider {
    public static String a = "https://www.meijutt.cc";

    public static String b(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
            return str + "@Headers=" + jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    public static HashMap c() {
        HashMap mapF = wb.f("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
        mapF.put("Referer", a.concat("/"));
        return mapF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            String strReplace = a + "/mjtt/{cateId}-" + str2 + ".html";
            if (z && map != null && map.size() > 0) {
                for (String str3 : map.keySet()) {
                    String str4 = map.get(str3);
                    if (str4.length() > 0) {
                        strReplace = strReplace.replace("{" + str3 + "}", str4);
                    }
                }
            }
            rp rpVarAh = oj.a(wh.e(strReplace.replaceAll("\\{cateId\\}", str), "utf-8", c())).ah("div.list3_cn_box div.cn_box2");
            for (int i = 0; i < rpVarAh.size(); i++) {
                ed edVar = (ed) rpVarAh.get(i);
                String strA = edVar.ah("a").a("title");
                String strA2 = edVar.ah("img").a("data-original");
                String strAk = ((ed) edVar.ah(".list_20 li").get(1)).ak();
                String strA3 = edVar.ah("a").a("href");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("vod_id", strA3);
                jSONObject2.put("vod_name", strA);
                jSONObject2.put("vod_pic", b(strA2));
                jSONObject2.put("vod_remarks", strAk);
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
    public String detailContent(List<String> list) {
        String str = "a";
        try {
            String strE = wh.e(a + list.get(0), "utf-8", c());
            em emVarA = oj.a(strE);
            String strA = emVarA.ah("div.o_big_img_bg_b>img").a("data-original");
            String strF = emVarA.ah("div.info-title>h1").f();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            try {
                if (strE.contains("class=\"down_list")) {
                    rp rpVarAh = emVarA.ah("div.down_list");
                    rp rpVarAh2 = emVarA.ah("div.from-tabs .downcili-ico,.down-ico");
                    int i = 0;
                    while (i < rpVarAh.size()) {
                        String strAk = ((ed) rpVarAh2.get(i)).ak();
                        rp rpVarAh3 = ((ed) rpVarAh.get(i)).ah("li");
                        ArrayList arrayList3 = new ArrayList();
                        int i2 = 0;
                        while (i2 < rpVarAh3.size()) {
                            ed edVar = (ed) rpVarAh3.get(i2);
                            rp rpVar = rpVarAh;
                            String str2 = str;
                            arrayList3.add(edVar.ah(str).f() + "$" + edVar.ah(str).a("href"));
                            i2++;
                            str = str2;
                            rpVarAh = rpVar;
                        }
                        String str3 = str;
                        rp rpVar2 = rpVarAh;
                        arrayList2.add(TextUtils.join("#", arrayList3));
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            if (strAk.equals(arrayList.get(i3))) {
                                strAk = strAk + "" + (i + 1);
                            }
                        }
                        arrayList.add(strAk);
                        i++;
                        str = str3;
                        rpVarAh = rpVar2;
                    }
                }
            } catch (Exception e) {
                SpiderDebug.log(e);
            }
            String strJoin = TextUtils.join("$$$", arrayList);
            String strJoin2 = TextUtils.join("$$$", arrayList2);
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("vod_id", list.get(0));
            jSONObject2.put("vod_name", strF);
            jSONObject2.put("vod_pic", b(strA));
            jSONObject2.put("vod_content", "");
            jSONObject2.put("type_name", "");
            jSONObject2.put("vod_play_from", strJoin);
            jSONObject2.put("vod_play_url", strJoin2);
            jSONArray.put(jSONObject2);
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }

    public String homeContent(boolean z) {
        try {
            JSONArray jSONArray = new JSONArray();
            String[] strArrSplit = "魔幻科幻&灵异惊悚&都市情感&犯罪历史&选秀综艺&动漫卡通".split("&");
            String[] strArrSplit2 = "1&2&3&4&5&6".split("&");
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
        a = str;
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
            rp rpVarAh = oj.a(wh.e(a + "/sousuo/index.asp?page=1&searchword=" + URLEncoder.encode(str, "utf-8") + "&searchtype=-1", "utf-8", c())).ah("div.list3_cn_box div.cn_box2");
            for (int i = 0; i < rpVarAh.size(); i++) {
                ed edVar = (ed) rpVarAh.get(i);
                String strA = edVar.ah("a").a("title");
                String strA2 = edVar.ah("img").a("data-original");
                String strAk = ((ed) edVar.ah(".list_20 li").get(1)).ak();
                String strA3 = edVar.ah("a").a("href");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("vod_id", strA3);
                jSONObject.put("vod_name", strA);
                jSONObject.put("vod_pic", b(strA2));
                jSONObject.put("vod_remarks", strAk);
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
