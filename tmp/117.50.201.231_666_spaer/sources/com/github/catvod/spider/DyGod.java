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
import com.github.catvod.spider.merge.A0.ya;
import com.github.catvod.spider.merge.A0.yi;
import com.github.catvod.spider.merge.a.C0529a;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class DyGod extends Spider {
    public String a = "https://www.dygod.net";

    /* JADX INFO: renamed from: com.github.catvod.spider.DyGod$1, reason: invalid class name */
    class AnonymousClass1 extends ya {
        @Override // com.github.catvod.spider.merge.A0.xh
        public final void onFailure(Call call, Exception exc) {
        }

        @Override // com.github.catvod.spider.merge.A0.xh
        public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.DyGod$2, reason: invalid class name */
    class AnonymousClass2 extends ya {
        @Override // com.github.catvod.spider.merge.A0.xh
        public final void onFailure(Call call, Exception exc) {
        }

        @Override // com.github.catvod.spider.merge.A0.xh
        public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        }
    }

    public static String b(String str, HashMap map) {
        try {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            yi.g(yi.f(), str, map, anonymousClass1);
            return new String(((Response) anonymousClass1.getResult()).body().bytes(), "gb2312").replaceAll("\r|\n", "");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String c(String str) {
        try {
            if (str.startsWith("ed2k:")) {
                Matcher matcher = Pattern.compile("\\|file\\|(.*?)\\|").matcher(URLDecoder.decode(str));
                if (matcher.find()) {
                    str = "电驴-" + matcher.group(1);
                }
            } else if (str.startsWith("magnet:")) {
                Matcher matcher2 = Pattern.compile("(^|&)dn=([^&]*)(&|$)").matcher(URLDecoder.decode(str));
                if (matcher2.find()) {
                    str = "磁力-" + matcher2.group(2);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            String strReplace = this.a + "/html/{cateId}/index.html";
            if (!str2.equals("1")) {
                strReplace = this.a + "/html/{cateId}/index_" + str2 + ".html";
                if (str.contains(".html")) {
                    return "";
                }
            }
            if (z && map != null && map.size() > 0) {
                for (String str3 : map.keySet()) {
                    String str4 = map.get(str3);
                    if (str4.length() > 0) {
                        strReplace = strReplace.replace("{" + str3 + "}", str4);
                    }
                }
            }
            rp rpVarAh = oj.a(b(strReplace.replaceAll("\\{cateId\\}", str), e())).ah("div.co_content8 table");
            for (int i = 0; i < rpVarAh.size(); i++) {
                ed edVar = (ed) rpVarAh.get(i);
                String strF = edVar.ah("tr:contains(点击：)").f();
                String strF2 = edVar.ah("b").f();
                if (strF2.contains("《") && strF2.contains("》")) {
                    strF = strF2.split("》")[1];
                    strF2 = strF2.split("《")[1].split("》")[0];
                }
                String strAu = ((ed) edVar.ah("table a").get(edVar.ah("table a").size() - 1)).au("href");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("vod_id", strAu);
                jSONObject2.put("vod_name", strF2);
                jSONObject2.put("vod_remarks", strF);
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

    public final String d(String str, Map map, Map map2) {
        try {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2();
            yi.i(yi.f(), str, (HashMap) map, (HashMap) map2, anonymousClass2);
            return new String(((Response) anonymousClass2.getResult()).body().bytes(), "gb2312").replaceAll("\r|\n", "");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String detailContent(List<String> list) {
        String str;
        String str2;
        String str3;
        String str4;
        try {
            String strB = b(this.a + list.get(0), e());
            em emVarA = oj.a(strB);
            String strG = wh.g(this.a, emVarA.ah("div#Zoom>img").a("src"));
            String strF = emVarA.ah("div.title_all>h1").f();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (strB.contains("player_list")) {
                try {
                    rp rpVarAh = emVarA.ah("div.player_list li");
                    Collections.reverse(rpVarAh);
                    ArrayList arrayList3 = new ArrayList();
                    str2 = "";
                    str3 = strG;
                    int i = 0;
                    while (i < rpVarAh.size()) {
                        try {
                            ed edVar = (ed) rpVarAh.get(i);
                            rp rpVar = rpVarAh;
                            String strF2 = edVar.ah("a").f();
                            String strA = edVar.ah("a").a("href");
                            String str5 = strF;
                            if (strA.contains("jianpian")) {
                                strA = "tvbox-xg:" + strA.split("path=")[1];
                            }
                            arrayList3.add(strF2 + "$" + strA);
                            i++;
                            strF = str5;
                            rpVarAh = rpVar;
                        } catch (Exception e) {
                            e = e;
                            str = str2;
                            SpiderDebug.log(e);
                            return str;
                        }
                    }
                    str4 = strF;
                    arrayList2.add(TextUtils.join("#", arrayList3));
                    arrayList.add("视频播列表");
                } catch (Exception e2) {
                    e = e2;
                    str2 = "";
                    str = str2;
                    SpiderDebug.log(e);
                    return str;
                }
            } else {
                str2 = "";
                str3 = strG;
                str4 = strF;
            }
            if (strB.contains("id=\"downlist")) {
                rp rpVarAh2 = emVarA.ah("div#downlist table");
                Collections.reverse(rpVarAh2);
                ArrayList arrayList4 = new ArrayList();
                for (int i2 = 0; i2 < rpVarAh2.size(); i2++) {
                    ed edVar2 = (ed) rpVarAh2.get(i2);
                    arrayList4.add(c(edVar2.ah("td").f()) + "$" + edVar2.ah("a").a("href"));
                }
                arrayList2.add(TextUtils.join("#", arrayList4));
                arrayList.add("磁力列表一");
            } else if (strB.contains("href=\"ftp") || strB.contains("href=\"magnet") || strB.contains("href=\"ed2k")) {
                rp rpVarAh3 = emVarA.ah("div#Zoom table");
                Collections.reverse(rpVarAh3);
                ArrayList arrayList5 = new ArrayList();
                for (int i3 = 0; i3 < rpVarAh3.size(); i3++) {
                    ed edVar3 = (ed) rpVarAh3.get(i3);
                    arrayList5.add(c(edVar3.ah("a").f()) + "$" + edVar3.ah("a").a("href"));
                }
                arrayList2.add(TextUtils.join("#", arrayList5));
                arrayList.add("磁力列表二");
            }
            String strJoin = TextUtils.join("$$$", arrayList);
            String strJoin2 = TextUtils.join("$$$", arrayList2);
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("vod_id", list.get(0));
            jSONObject2.put("vod_name", str4);
            jSONObject2.put("vod_pic", str3);
            str = str2;
            try {
                jSONObject2.put("vod_content", str);
                jSONObject2.put("type_name", str);
                jSONObject2.put("vod_play_from", strJoin);
                jSONObject2.put("vod_play_url", strJoin2);
                jSONArray.put(jSONObject2);
                jSONObject.put("list", jSONArray);
                return jSONObject.toString();
            } catch (Exception e3) {
                e = e3;
                SpiderDebug.log(e);
                return str;
            }
        } catch (Exception e4) {
            e = e4;
            str = "";
        }
    }

    public final HashMap e() {
        HashMap mapF = wb.f("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
        mapF.put("Referer", this.a + "/");
        return mapF;
    }

    public String homeContent(boolean z) {
        try {
            JSONArray jSONArray = new JSONArray();
            String[] strArrSplit = "最新影片&国内电影&欧美电影&华语电视&日韩电视&欧美电视&最新综艺&旧版综艺&动漫资源&手机电影".split("&");
            String[] strArrSplit2 = "gndy/dyzz&gndy/china&gndy/oumei&tv/hytv&tv/rihantv&tv/oumeitv&zongyi2013&2009zongyi&dongman&3gp/3gpmovie".split("&");
            for (int i = 0; i < strArrSplit.length; i++) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type_id", strArrSplit2[i]);
                jSONObject.put("type_name", strArrSplit[i]);
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("class", jSONArray);
            if (z) {
                jSONObject2.put("filters", new JSONObject("{}]}"));
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

    /* JADX WARN: Multi-variable type inference failed */
    public String searchContent(String str, boolean z) {
        try {
            JSONArray jSONArray = new JSONArray();
            String str2 = this.a + "/e/search/index.php";
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("show", "title");
            linkedHashMap.put("tempid", "1");
            linkedHashMap.put("keyboard", str);
            linkedHashMap.put("Submit", "立即搜索");
            HashMap mapE = e();
            mapE.put("Content-Type", "application/x-www-form-urlencoded; charset=gb2312");
            rp rpVarAh = oj.a(d(str2, linkedHashMap, mapE)).ah("div.co_content8 table");
            for (int i = 0; i < rpVarAh.size(); i++) {
                ed edVar = (ed) rpVarAh.get(i);
                String strF = edVar.ah("tr:contains(点击：)").f();
                String strF2 = edVar.ah("b").f();
                if (strF2.contains("《") && strF2.contains("》")) {
                    strF = strF2.split("》")[1];
                    strF2 = strF2.split("《")[1].split("》")[0];
                }
                String strAu = ((ed) edVar.ah("table a").get(edVar.ah("table a").size() - 1)).au("href");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("vod_id", strAu);
                jSONObject.put("vod_name", strF2);
                jSONObject.put("vod_remarks", strF);
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
