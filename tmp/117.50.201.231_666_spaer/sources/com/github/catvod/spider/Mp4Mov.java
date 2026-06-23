package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.A0.ed;
import com.github.catvod.spider.merge.A0.em;
import com.github.catvod.spider.merge.A0.oj;
import com.github.catvod.spider.merge.A0.rp;
import com.github.catvod.spider.merge.A0.wb;
import com.github.catvod.spider.merge.A0.wh;
import com.github.catvod.spider.merge.A0.yi;
import com.github.catvod.spider.merge.a.C0529a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class Mp4Mov extends Spider {
    public String a = "https://mp4.z6.net.cn";

    public final HashMap b() {
        HashMap mapF = wb.f("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Safari/537.36");
        mapF.put("Referer", this.a + "/");
        return mapF;
    }

    public final HashMap c() {
        HashMap mapF = wb.f("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Safari/537.36");
        mapF.put("Referer", this.a + "/search/");
        mapF.put("Content-Type", "application/x-www-form-urlencoded");
        return mapF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            em emVarA = oj.a(yi.k(this.a + "/list/" + str + "-" + str2 + ".html", b()));
            String str3 = "href";
            if (str.equals("99")) {
                rp rpVarAh = emVarA.ah("div#list_dy ul>li");
                int i = 0;
                while (i < rpVarAh.size()) {
                    ed edVar = (ed) rpVarAh.get(i);
                    rp rpVar = rpVarAh;
                    String strF = edVar.ah("a").f();
                    String strF2 = edVar.ah(".time").f();
                    if (strF.contains("《") && strF.contains("》")) {
                        strF2 = strF.split("》")[1];
                        strF = strF.split("《")[1].split("》")[0];
                    }
                    String strA = edVar.ah("a").a("href");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("vod_id", strA);
                    jSONObject2.put("vod_name", strF);
                    jSONObject2.put("vod_pic", "");
                    jSONObject2.put("vod_remarks", strF2);
                    jSONArray.put(jSONObject2);
                    i++;
                    rpVarAh = rpVar;
                }
            } else {
                rp rpVarAh2 = emVarA.ah("div#list_all ul>li");
                int i2 = 0;
                while (i2 < rpVarAh2.size()) {
                    ed edVar2 = (ed) rpVarAh2.get(i2);
                    String strF3 = edVar2.ah("h2").f();
                    rp rpVar2 = rpVarAh2;
                    String strA2 = edVar2.ah("img").a("data-original");
                    String strF4 = edVar2.ah(".update_time").f();
                    if (strF3.contains("《") && strF3.contains("》")) {
                        strF4 = strF3.split("》")[1];
                        strF3 = strF3.split("《")[1].split("》")[0];
                    }
                    String strA3 = edVar2.ah("a").a(str3);
                    String str4 = str3;
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("vod_id", strA3);
                    jSONObject3.put("vod_name", strF3);
                    jSONObject3.put("vod_pic", strA2);
                    jSONObject3.put("vod_remarks", strF4);
                    jSONArray.put(jSONObject3);
                    i2++;
                    str3 = str4;
                    rpVarAh2 = rpVar2;
                }
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
            JSONArray jSONArray = new JSONArray();
            String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
            String str3 = this.a + "/search/";
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("wd", str);
            linkedHashMap.put("p", str2);
            linkedHashMap.put("t", encrypt(strValueOf, "7230789078907890"));
            rp rpVarAh = oj.a(wh.f(str3, linkedHashMap, c())).ah("div#list_all ul>li");
            for (int i = 0; i < rpVarAh.size(); i++) {
                ed edVar = (ed) rpVarAh.get(i);
                String strF = edVar.ah("h2").f();
                String strA = edVar.ah("img").a("data-original");
                String strF2 = edVar.ah(".update_time").f();
                if (strF.contains("《") && strF.contains("》")) {
                    strF2 = strF.split("》")[1];
                    strF = strF.split("《")[1].split("》")[0];
                }
                String strA2 = edVar.ah("a").a("href");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("vod_id", strA2);
                jSONObject.put("vod_name", strF);
                jSONObject.put("vod_pic", strA);
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

    /* JADX WARN: Multi-variable type inference failed */
    public String detailContent(List<String> list) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            int i = 0;
            sb.append(list.get(0));
            em emVarA = oj.a(yi.k(sb.toString(), b()));
            String strA = emVarA.ah("div.pic>img").a("src");
            String strF = emVarA.ah("div.article-header>h1").f();
            String strAk = ((ed) emVarA.ah("ul.breadcrumb li").get(1)).ak();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            rp rpVarAh = emVarA.ah("ul.down-list");
            int i2 = 0;
            while (i2 < rpVarAh.size()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("列表");
                int i3 = i2 + 1;
                sb2.append(i3);
                String string = sb2.toString();
                rp rpVarAh2 = ((ed) rpVarAh.get(i2)).ah("li:has(a[href^=ed2k],a[href^=magnet])");
                if (strAk.contains("电视剧")) {
                    Collections.reverse(rpVarAh2);
                }
                ArrayList arrayList3 = new ArrayList();
                rp rpVar = rpVarAh;
                while (i < rpVarAh2.size()) {
                    ed edVar = (ed) rpVarAh2.get(i);
                    arrayList3.add(edVar.ah("a").a("title") + "$" + edVar.ah("a").a("href"));
                    i++;
                    strAk = strAk;
                }
                arrayList2.add(TextUtils.join("#", arrayList3));
                arrayList.add(string);
                i2 = i3;
                rpVarAh = rpVar;
                strAk = strAk;
                i = 0;
            }
            String strJoin = TextUtils.join("$$$", arrayList);
            String strJoin2 = TextUtils.join("$$$", arrayList2);
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("vod_id", list.get(0));
            jSONObject2.put("vod_name", strF);
            jSONObject2.put("vod_pic", strA);
            jSONObject2.put("type_name", "");
            jSONObject2.put("vod_content", "");
            jSONObject2.put("vod_play_from", strJoin);
            jSONObject2.put("vod_play_url", strJoin2);
            jSONArray.put(jSONObject2);
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String encrypt(String str, String str2) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(1, secretKeySpec);
            return Base64.encodeToString(cipher.doFinal(bytes), 2);
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    public String homeContent(boolean z) {
        try {
            JSONArray jSONArray = new JSONArray();
            String[] strArrSplit = "电视剧&动作片&科幻片&爱情片&喜剧片&恐怖片&战争片&剧情片&纪录片&动画片".split("&");
            String[] strArrSplit2 = "10&1&2&3&4&5&6&7&8&9".split("&");
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
        this.a = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", str2);
            jSONObject.put("parse", 0);
            jSONObject.put("playUrl", "");
            return C0529a.addDanmaku(jSONObject.toString());
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
