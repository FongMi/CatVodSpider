package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.A0.ku;
import com.github.catvod.spider.merge.A0.wb;
import com.github.catvod.spider.merge.A0.yi;
import com.github.catvod.spider.merge.a.C0529a;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class AppYs extends Spider {
    public static HashMap a;
    public static final Object b = new Object();
    public static final Pattern c = Pattern.compile("api\\.php/.*?/vod");
    public static final Pattern d = Pattern.compile("api\\.php/.+?\\.vod");
    public static final Pattern e = Pattern.compile("/.+\\?.+=");
    public static final Pattern f = Pattern.compile(".*(url|v|vid|php\\?id)=");
    public static final Pattern g = Pattern.compile("https?://[^/]*");
    public static final Pattern[] h = {Pattern.compile("jx\\.+huimaojia\\.+com/player"), Pattern.compile("py\\.+789pan\\.+cn/player/tm\\.php\\?url="), Pattern.compile("ztys\\.+waruanzy\\.+com/player/\\?url="), Pattern.compile("yingshi\\.+waruanzy\\.+com/789pan/\\?url="), Pattern.compile("vip\\.+parwix\\.+com:4433/player/\\?url="), Pattern.compile("api\\.+cxitco\\.+cn"), Pattern.compile("/vip\\.+renrenmi.cc"), Pattern.compile("yanbing\\.+parwix\\.+com:4433/player"), Pattern.compile("json\\.+cantin\\.+cc/apijson\\.php"), Pattern.compile("ffdm\\.+miaoletv\\.+com/\\?url="), Pattern.compile("vip\\.+sylwl\\.+cn/api/\\?key="), Pattern.compile("jx\\.+dikotv\\.+com/\\?url="), Pattern.compile("zly\\.+xjqxz\\.+top/player/\\?url="), Pattern.compile("5znn\\.+xyz/m3u8\\.+php"), Pattern.compile("uid=1735&my="), Pattern.compile("api\\.+xkvideo\\.+design/m3u8\\.+php\\?url="), Pattern.compile("play\\.+szbodankyy\\.+com/xxoocnmb"), Pattern.compile("vip\\.+fj6080\\.+xyz/player/\\?url="), Pattern.compile("a\\.+dxzj88\\.+com/jiexi"), Pattern.compile("host\\.+q-q\\.+wang/api"), Pattern.compile("保佑")};
    public static final Pattern[] i = {Pattern.compile("player=new"), Pattern.compile("<div id=\"video\""), Pattern.compile("<div id=\"[^\"]*?player\""), Pattern.compile("//视频链接"), Pattern.compile("HlsJsPlayer\\("), Pattern.compile("<iframe[\\s\\S]*?src=\"[^\"]+?\""), Pattern.compile("<video[\\s\\S]*?src=\"[^\"]+?\"")};
    public String j = "";
    public final HashMap k = new HashMap();

    public static void l(JSONObject jSONObject, String str, ArrayList arrayList) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object obj = jSONObject.get(next);
                if (next.equals(str) && (obj instanceof JSONArray)) {
                    arrayList.add((JSONArray) obj);
                }
                if (obj instanceof JSONObject) {
                    l((JSONObject) obj, str, arrayList);
                } else if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        l(jSONArray.getJSONObject(i2), str, arrayList);
                    }
                }
            } catch (JSONException e2) {
                SpiderDebug.log(e2);
            }
        }
    }

    public static void m(String str, JSONObject jSONObject) throws JSONException {
        String strOptString;
        String str2;
        if (!str.contains("baidu.com")) {
            jSONObject.put("parse", 1);
            jSONObject.put("playUrl", "");
            jSONObject.put("url", str);
            return;
        }
        String str3 = str.split("wd=")[1];
        if (str3.contains("duoduozy.com") || str3.contains("suoyo.cc")) {
            JSONObject jSONObject2 = new JSONObject(yi.k("https://www.6080kan.cc/app.php?url=".concat(str3), null));
            jSONObject.put("parse", 0);
            jSONObject.put("playUrl", "");
            jSONObject.put("url", jSONObject2.getString("url"));
            jSONObject.put("header", "{\"User-Agent\":\" Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.81 Safari/537.36 SE 2.X MetaSr 1.0\",\"referer\":\" https://player.duoduozy.com\",\"origin\":\" https://dp.duoduozy.com\",\"Host\":\" cache.m3u8.suoyo.cc\"}");
            return;
        }
        if (str3.contains("xfy")) {
            JSONObject jSONObject3 = new JSONObject(yi.k(str3, null));
            jSONObject.put("parse", 0);
            jSONObject.put("playUrl", "");
            jSONObject.put("url", jSONObject3.getString("url"));
            jSONObject.put("header", "{\"referer\":\" appguapi.lihaoyun.top:11543\",\"User-Agent\":\" Dart/2.14 (dart:io)\"}}");
            return;
        }
        if (str3.contains("api.iopenyun.com:88")) {
            if (!str3.contains("html")) {
                jSONObject.put("parse", 1);
                jSONObject.put("playUrl", "");
                jSONObject.put("url", str3);
                jSONObject.put("ua", "Mozilla/5.0 Windows10");
                jSONObject.put("header", "{\"Referer\":\"https://user.iopenyun.com:520/user/video/\"}");
                return;
            }
            Object string = new JSONObject(yi.k("https://api.m3u8.tv:5678/home/api?type=ys&uid=233711&key=dgilouvFKNRSWX2467&url=" + str3.split("=")[1], null)).getString("url");
            jSONObject.put("parse", 0);
            jSONObject.put("playUrl", "");
            jSONObject.put("url", string);
            return;
        }
        if (str3.contains("cat.wkfile.com")) {
            jSONObject.put("parse", 0);
            jSONObject.put("playUrl", "");
            jSONObject.put("url", str3);
            jSONObject.put("header", "{\"User-Agent\":\" Lavf/58.12.100\",\"Referer\":\" wkfile.com\"}");
            return;
        }
        if (str3.contains("=") || str3.indexOf(".m3u8") <= 15) {
            String str4 = ".mp4";
            if (str3.indexOf(".mp4") <= 15 && !str3.contains("/obj/tos")) {
                if (!str3.contains("=")) {
                    jSONObject.put("parse", 0);
                    jSONObject.put("playUrl", "");
                    jSONObject.put("url", str3);
                    return;
                }
                HashMap mapF = wb.f("User-Agent", "Mozilla/5.0 Android");
                TreeMap treeMap = new TreeMap();
                String strN = yi.n(str3, mapF, treeMap);
                String strH = yi.h(treeMap);
                if (strH != null) {
                    String str5 = "";
                    String strH2 = strH;
                    String strN2 = strN;
                    while (true) {
                        str2 = strN2;
                        if (strH2 == null) {
                            strH2 = str5;
                            break;
                        }
                        String str6 = str4;
                        if (strH2.indexOf(str4) > 30) {
                            break;
                        }
                        mapF.put("User-Agent", "Mozilla/5.0 Android");
                        strN2 = yi.n(strH2, mapF, treeMap);
                        str5 = strH2;
                        strH2 = yi.h(treeMap);
                        str4 = str6;
                    }
                    if (!strH2.contains("=http") && !strH2.contains("url=")) {
                        if (!str3.contains("www.mgtv.com")) {
                            jSONObject.put("parse", 0);
                            jSONObject.put("playUrl", "");
                            jSONObject.put("url", strH2);
                            return;
                        } else {
                            jSONObject.put("parse", 0);
                            jSONObject.put("playUrl", "");
                            jSONObject.put("url", strH2);
                            jSONObject.put("header", "{\"User-Agent\":\" Mozilla/5.0\", \"Referer\":\" \"}");
                            return;
                        }
                    }
                    if (str2.contains("<html")) {
                        jSONObject.put("parse", 1);
                        jSONObject.put("playUrl", "");
                        jSONObject.put("url", strH2);
                        return;
                    }
                    Object string2 = new JSONObject(str2).getString("url");
                    jSONObject.put("parse", 0);
                    jSONObject.put("playUrl", "");
                    jSONObject.put("url", string2);
                    if (strH2.contains("mgtv.com")) {
                        jSONObject.put("header", "{\"User-Agent\":\" Mozilla/5.0\", \"Referer\":\" \"}");
                        return;
                    } else {
                        strH2.contains("bilibili.com");
                        return;
                    }
                }
                if (strN.contains("<html")) {
                    Pattern[] patternArr = i;
                    int length = patternArr.length;
                    int i2 = 0;
                    while (i2 < length) {
                        int i3 = length;
                        if (patternArr[i2].matcher(strN).find()) {
                            jSONObject.put("parse", 1);
                            jSONObject.put("playUrl", "");
                            jSONObject.put("url", str3);
                            return;
                        }
                        i2++;
                        length = i3;
                    }
                    if (str3.split("url=")[1].contains("http")) {
                        jSONObject.put("parse", 1);
                        jSONObject.put("playUrl", "");
                        jSONObject.put("url", "http://1.117.152.239:39000/?url=" + str3.split("url=")[1]);
                        return;
                    }
                    if (str3.split("url=")[1].contains("renrenmi")) {
                        jSONObject.put("parse", 1);
                        jSONObject.put("playUrl", "");
                        jSONObject.put("url", "http://www.1080kan.cc/jiexi/rrmi.php?url=" + str3.split("url=")[1]);
                        jSONObject.put("header", "{\"Referer\":\"http://www.1080kan.cc/\"}");
                        return;
                    }
                    String str7 = str3.split("url=")[1];
                    jSONObject.put("parse", 1);
                    jSONObject.put("playUrl", "");
                    jSONObject.put("url", "https://jx.banyung.xyz:7799/player/?url=" + str3.split("url=")[1]);
                    return;
                }
                try {
                    strOptString = new JSONObject(strN).optString("url");
                } catch (Exception e2) {
                    e2.printStackTrace();
                    strOptString = "";
                }
                if (strOptString.length() > 1) {
                    if (str3.contains("mgtv.com")) {
                        jSONObject.put("parse", 0);
                        jSONObject.put("playUrl", "");
                        jSONObject.put("url", strOptString);
                        jSONObject.put("header", "{\"User-Agent\":\" Mozilla/5.0\", \"Referer\":\" \"}");
                        return;
                    }
                    if (str3.contains("bilibili.com")) {
                        jSONObject.put("parse", 0);
                        jSONObject.put("playUrl", "");
                        jSONObject.put("url", strOptString);
                        return;
                    } else {
                        jSONObject.put("parse", 0);
                        jSONObject.put("playUrl", "");
                        jSONObject.put("url", strOptString);
                        return;
                    }
                }
                if (str3.split("url=")[1].contains("http")) {
                    jSONObject.put("parse", 1);
                    jSONObject.put("playUrl", "");
                    jSONObject.put("url", "http://1.117.152.239:39000/?url=" + str3.split("url=")[1]);
                    return;
                }
                if (str3.split("url=")[1].contains("renrenmi")) {
                    jSONObject.put("parse", 1);
                    jSONObject.put("playUrl", "");
                    jSONObject.put("url", "http://www.1080kan.cc/jiexi/rrmi.php?url=" + str3.split("url=")[1]);
                    jSONObject.put("header", "{\"Referer\":\"http://www.1080kan.cc/\"}");
                    return;
                }
                String str8 = str3.split("url=")[1];
                jSONObject.put("parse", 1);
                jSONObject.put("playUrl", "");
                jSONObject.put("url", "https://jx.banyung.xyz:7799/player/?url=" + str3.split("url=")[1]);
                return;
            }
        }
        if (str3.contains("hsl.ysgc.xyz")) {
            Object string3 = new JSONObject(yi.k("https://jx.ysgc.xyz/?url=".concat(str3), null)).getString("url");
            jSONObject.put("parse", 0);
            jSONObject.put("playUrl", "");
            jSONObject.put("url", string3);
            jSONObject.put("header", "{\"Referer\":\" https://ysgc.cc\"}");
            return;
        }
        if (str3.contains("1.ruifenglb.com")) {
            jSONObject.put("parse", 0);
            jSONObject.put("playUrl", "");
            jSONObject.put("url", str3);
            jSONObject.put("header", "{\"Referer\":\" https://1.ruifenglb.com\"}");
            return;
        }
        Matcher matcher = Pattern.compile(".*(http.*)").matcher(str3);
        if (matcher.find()) {
            jSONObject.put("parse", 0);
            jSONObject.put("playUrl", "");
            jSONObject.put("url", matcher.group(1));
        } else {
            jSONObject.put("parse", 0);
            jSONObject.put("playUrl", "");
            jSONObject.put("url", str3);
        }
    }

    public static HashMap n(String str) {
        HashMap map = new HashMap();
        map.put("User-Agent", (str.contains("api.php/app") || str.contains("xgapp") || str.contains("freekan")) ? "Dart/2.14 (dart:io)" : (str.contains("zsb") || str.contains("fkxs") || str.contains("xays") || str.contains("xcys") || str.contains("szys") || str.contains("dxys") || str.contains("ytys") || str.contains("qnys")) ? "Dart/2.15 (dart:io)" : str.contains(".vod") ? "okhttp/4.1.0" : "Dalvik/2.1.0");
        return map;
    }

    public static String o(String str, String str2, String str3) {
        if (str.contains("xgapp") || str.contains("api.php/app/") || str.contains(".vod")) {
            if (str3.indexOf(".m3u8") > 15 || str3.indexOf(".mp4") > 15 || str3.contains("/obj/tos")) {
                if (!str3.contains("url=")) {
                    return "https://www.baidu.com/s?wd=".concat(str3);
                }
                return "https://www.baidu.com/s?wd=" + str3.split("url=")[1];
            }
            if (!str2.contains("url=") && str3.contains("RongXingVR")) {
                return "https://www.baidu.com/s?wd=https://fast.rongxingvr.cn:8866/api/?key=nShWumGdMIbTwngTbI&url=".concat(str3);
            }
            if (!str2.contains("url=") && str3.contains("LT")) {
                return "https://www.baidu.com/s?wd=https://f7.pyxddc.com/bcjx/4k.php?url=".concat(str3);
            }
            if (!str2.contains("url=") && str3.contains("renrenmi")) {
                return "https://www.baidu.com/s?wd=https://kuba.renrenmi.cc:2266/api/?key=Y6UYLYtjImTCKe98JD&url=".concat(str3);
            }
            if (!str2.contains("url=") && str3.contains(".html")) {
                return "https://www.baidu.com/s?wd=http://1.117.152.239:39000/?url=".concat(str3);
            }
            if (str3.contains("xfy")) {
                return "https://www.baidu.com/s?wd=http://jiexi.yunl.cc/api/?key=xYNESYSvHp1DV2ckKs&url=".concat(str3);
            }
            return "https://www.baidu.com/s?wd=" + str2 + str3;
        }
        if (!c.matcher(str).find()) {
            return "https://www.baidu.com/s?wd=" + str3;
        }
        if (str3.indexOf(".m3u8") > 15 || str3.indexOf(".mp4") > 15 || str3.contains("/obj/tos")) {
            if (!str3.contains("url=")) {
                return "https://www.baidu.com/s?wd=".concat(str3);
            }
            return "https://www.baidu.com/s?wd=" + str3.split("url=")[1];
        }
        if (str3.contains("xfy")) {
            if (!str3.contains("url=")) {
                return "https://www.baidu.com/s?wd=https://json.hfyrw.com/mao.go?url=".concat(str3);
            }
            return "https://www.baidu.com/s?wd=http://cache.dmtt.xyz/xfyjx/xfyjx.php?url=" + str3.split("url=")[1];
        }
        if (str3.contains("www.bilibili.com")) {
            return "https://www.baidu.com/s?wd=https://jx.parwix.com:4433/player/?url=" + str3.split("url=")[1];
        }
        if (str.contains("zhenfy") || str.contains("cztv") || str.contains("1.14.63.101") || str.contains("fit:8") || str.contains("diliktv.xyz") || str.contains("ppzhu.vip") || str.contains("api.8d8q.com") || str.contains("haokanju1.cc") || str.contains("cztv")) {
            return "https://www.baidu.com/s?wd=" + str3 + "&app=10000&account=272775028&password=qq272775028";
        }
        if (!str.contains("lxyyy") && !str.contains("j.zjj.life") && !str.contains("lktv") && !str.contains("0818tv") && !str.contains("ruoxinew")) {
            return "https://www.baidu.com/s?wd=".concat(str3);
        }
        return "https://www.baidu.com/s?wd=https://play.tkys.tv/?url=" + str3.split("url=")[1];
    }

    public static String p(String str, String str2) {
        if (str.contains(".vod")) {
            if (str.contains("iopenyun.com")) {
                return str + "/list?wd=" + str2 + "&page=";
            }
            return str + "?wd=" + str2 + "&page=";
        }
        if (str.contains("api.php/app") || str.contains("xgapp")) {
            return str + "search?text=" + str2 + "&pg=";
        }
        if (!c.matcher(str).find()) {
            return "";
        }
        if (str.contains("esellauto") || str.contains("1.14.63.101") || str.contains("zjys") || str.contains("dcd") || str.contains("lxue") || str.contains("weetai.cn") || str.contains("haokanju1") || str.contains("fit:8") || str.contains("zjj.life") || str.contains("love9989") || str.contains("8d8q") || str.contains("lk.pxun") || str.contains("hgyx") || str.contains("521x5") || str.contains("lxyyy") || str.contains("0818tv") || str.contains("diyoui") || str.contains("diliktv") || str.contains("ppzhu") || str.contains("aitesucai") || str.contains("zz.ci") || str.contains("chxjon") || str.contains("watchmi") || str.contains("vipbp") || str.contains("bhtv") || str.contains("xfykl")) {
            return str + "?ac=list&wd=" + str2 + "&page=";
        }
        return str + "?ac=list&zm=" + str2 + "&page=";
    }

    public static boolean q(String str) {
        return str.equals("伦理") || str.equals("情色") || str.equals("福利");
    }

    public static String r(JSONArray jSONArray) {
        try {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList.add(jSONArray.getString(i2));
            }
            return TextUtils.join(",", arrayList);
        } catch (JSONException unused) {
            return "";
        }
    }

    public static String s(String str) {
        synchronized (b) {
            try {
                if (a == null) {
                    HashMap map = new HashMap();
                    a = map;
                    map.put("youku", "优酷M");
                    a.put("qq", "腾讯M");
                    a.put("iqiyi", "爱奇艺M");
                    a.put("qiyi", "奇艺M");
                    a.put("letv", "乐视M");
                    a.put("sohu", "搜狐M");
                    a.put("tudou", "土豆M");
                    a.put("pptv", "PPTVM");
                    a.put("mgtv", "芒果TVM");
                    a.put("wasu", "华数M");
                    a.put("bilibili", "哔哩M");
                }
                if (!a.containsKey(str)) {
                    return str;
                }
                return (String) a.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String str3;
        String str4;
        int i2;
        try {
            str4 = this.j;
            str3 = "";
        } catch (Exception e2) {
            e = e2;
            str3 = "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            String str5 = "vod_id";
            sb.append(u(str4));
            sb.append(str);
            sb.append((str4.contains("api.php/app") || str4.contains("xgapp")) ? "&class=筛选class&area=筛选area&lang=筛选lang&year=筛选year&limit=18&pg=#PN#" : str4.contains(".vod") ? "&class=筛选class&area=筛选area&lang=筛选lang&year=筛选year&by=排序&limit=18&page=#PN#" : "&page=#PN#&area=筛选area&type=筛选class&start=筛选year");
            String strReplace = sb.toString().replace("#PN#", str2).replace("筛选class", (map == null || !map.containsKey("class")) ? str3 : map.get("class")).replace("筛选area", (map == null || !map.containsKey("area")) ? str3 : map.get("area")).replace("筛选lang", (map == null || !map.containsKey("lang")) ? str3 : map.get("lang")).replace("筛选year", (map == null || !map.containsKey("year")) ? str3 : map.get("year")).replace("排序", (map == null || !map.containsKey("排序")) ? str3 : map.get("排序"));
            SpiderDebug.log(strReplace);
            JSONObject jSONObject = new JSONObject(yi.k(strReplace, n(strReplace)));
            try {
            } catch (Exception e3) {
                SpiderDebug.log(e3);
            }
            if (jSONObject.has("totalpage") && (jSONObject.get("totalpage") instanceof Integer)) {
                i2 = jSONObject.getInt("totalpage");
            } else if (jSONObject.has("pagecount") && (jSONObject.get("pagecount") instanceof Integer)) {
                i2 = jSONObject.getInt("pagecount");
            } else if (jSONObject.has("data") && (jSONObject.get("data") instanceof JSONObject) && jSONObject.getJSONObject("data").has("total") && (jSONObject.getJSONObject("data").get("total") instanceof Integer) && jSONObject.getJSONObject("data").has("limit") && (jSONObject.getJSONObject("data").get("limit") instanceof Integer)) {
                int i3 = jSONObject.getJSONObject("data").getInt("limit");
                int i4 = jSONObject.getJSONObject("data").getInt("total");
                i2 = i4 % i3 == 0 ? i4 / i3 : (i4 / i3) + 1;
            } else {
                i2 = Integer.MAX_VALUE;
            }
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = (jSONObject.has("list") && (jSONObject.get("list") instanceof JSONArray)) ? jSONObject.getJSONArray("list") : (jSONObject.has("data") && (jSONObject.get("data") instanceof JSONObject) && jSONObject.getJSONObject("data").has("list") && (jSONObject.getJSONObject("data").get("list") instanceof JSONArray)) ? jSONObject.getJSONObject("data").getJSONArray("list") : (jSONObject.has("data") && (jSONObject.get("data") instanceof JSONArray)) ? jSONObject.getJSONArray("data") : null;
            if (jSONArray2 != null) {
                int i5 = 0;
                while (i5 < jSONArray2.length()) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i5);
                    String str6 = str5;
                    if (jSONObject2.has(str6)) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(str6, jSONObject2.getString(str6));
                        jSONObject3.put("vod_name", jSONObject2.getString("vod_name"));
                        jSONObject3.put("vod_pic", jSONObject2.getString("vod_pic"));
                        jSONObject3.put("vod_remarks", jSONObject2.getString("vod_remarks"));
                        jSONArray.put(jSONObject3);
                    } else {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put(str6, jSONObject2.getString("nextlink"));
                        jSONObject4.put("vod_name", jSONObject2.getString("title"));
                        jSONObject4.put("vod_pic", jSONObject2.getString("pic"));
                        jSONObject4.put("vod_remarks", jSONObject2.getString("state"));
                        jSONArray.put(jSONObject4);
                    }
                    i5++;
                    str5 = str6;
                }
            }
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("page", str2);
            jSONObject5.put("pagecount", i2);
            jSONObject5.put("limit", 90);
            jSONObject5.put("total", Integer.MAX_VALUE);
            jSONObject5.put("list", jSONArray);
            return jSONObject5.toString();
        } catch (Exception e4) {
            e = e4;
            SpiderDebug.log(e);
            return str3;
        }
    }

    public String detailContent(List<String> list) {
        try {
            String str = this.j;
            String str2 = y(str) + list.get(0);
            SpiderDebug.log(str2);
            JSONObject jSONObject = new JSONObject(yi.k(str2, n(str2)));
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            t(str, jSONObject, jSONObject3, list.get(0));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject3);
            jSONObject2.put("list", jSONArray);
            return jSONObject2.toString();
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object, org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    public String homeContent(boolean z) {
        String str;
        int i2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        JSONArray jSONArray;
        String str10;
        String str11;
        String str12;
        String str13;
        String[] strArr;
        String str14;
        String str15;
        String str16;
        String str17;
        AppYs appYs = this;
        String str18 = "";
        String str19 = "筛选";
        try {
            String strV = appYs.v(appYs.j);
            String str20 = "=";
            String str21 = "\\+";
            String str22 = "\n";
            JSONArray jSONArray2 = null;
            String str23 = "type_id";
            String str24 = "type_name";
            if (strV.isEmpty()) {
                String[] strArrSplit = appYs.w(strV, null).split("\n")[0].split("\\+");
                jSONArray2 = new JSONArray();
                for (int i3 = 1; i3 < strArrSplit.length; i3++) {
                    String[] strArrSplit2 = strArrSplit[i3].trim().split("=");
                    if (strArrSplit2.length >= 2) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("type_name", strArrSplit2[0].trim());
                        jSONObject.put("type_id", strArrSplit2[1].trim());
                        jSONArray2.put(jSONObject);
                    }
                }
            } else {
                SpiderDebug.log(strV);
                JSONObject jSONObject2 = new JSONObject(yi.k(strV, n(strV)));
                if (jSONObject2.has("list") && (jSONObject2.get("list") instanceof JSONArray)) {
                    jSONArray2 = jSONObject2.getJSONArray("list");
                } else if (jSONObject2.has("data") && (jSONObject2.get("data") instanceof JSONObject) && jSONObject2.getJSONObject("data").has("list") && (jSONObject2.getJSONObject("data").get("list") instanceof JSONArray)) {
                    jSONArray2 = jSONObject2.getJSONObject("data").getJSONArray("list");
                } else if (jSONObject2.has("data") && (jSONObject2.get("data") instanceof JSONArray)) {
                    jSONArray2 = jSONObject2.getJSONArray("data");
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            JSONArray jSONArray3 = new JSONArray();
            if (jSONArray2 != null) {
                int i4 = 0;
                while (i4 < jSONArray2.length()) {
                    JSONObject jSONObject4 = jSONArray2.getJSONObject(i4);
                    JSONArray jSONArray4 = jSONArray2;
                    String string = jSONObject4.getString(str24);
                    if (q(string)) {
                        str2 = str19;
                        str3 = str18;
                        jSONArray = jSONArray3;
                        str4 = strV;
                        i2 = i4;
                        str5 = str20;
                        str6 = str21;
                        str7 = str22;
                        str8 = str23;
                        str9 = str24;
                    } else {
                        i2 = i4;
                        String string2 = jSONObject4.getString(str23);
                        JSONArray jSONArray5 = jSONArray3;
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put(str23, string2);
                        jSONObject5.put(str24, string);
                        JSONObject jSONObjectOptJSONObject = jSONObject4.optJSONObject("type_extend");
                        if (z) {
                            String[] strArrSplit3 = appYs.w(strV, jSONObjectOptJSONObject).split(str22);
                            ?? jSONArray6 = new JSONArray();
                            str4 = strV;
                            for (?? IsEmpty = strV.isEmpty(); IsEmpty < strArrSplit3.length; IsEmpty++) {
                                String strTrim = strArrSplit3[IsEmpty].trim();
                                if (strTrim.isEmpty()) {
                                    str11 = str19;
                                    str14 = str18;
                                    str15 = str20;
                                    str10 = str21;
                                    str12 = str22;
                                    strArr = strArrSplit3;
                                    str16 = str23;
                                    str17 = str24;
                                } else {
                                    String[] strArrSplit4 = strTrim.split(str21);
                                    str10 = str21;
                                    String strTrim2 = strArrSplit4[0].trim();
                                    if (strTrim2.contains(str19)) {
                                        str12 = str22;
                                        String strReplace = strTrim2.replace(str19, str18);
                                        if (strReplace.equals("class")) {
                                            strTrim2 = "类型";
                                            str11 = str19;
                                        } else {
                                            str11 = str19;
                                            if (strReplace.equals("area")) {
                                                strTrim2 = "地区";
                                            } else if (strReplace.equals("lang")) {
                                                strTrim2 = "语言";
                                            } else if (strReplace.equals("year")) {
                                                strTrim2 = "年份";
                                            }
                                        }
                                        str13 = strTrim2;
                                        strTrim2 = strReplace;
                                    } else {
                                        str11 = str19;
                                        str12 = str22;
                                        str13 = strTrim2;
                                    }
                                    ?? jSONObject6 = new JSONObject();
                                    strArr = strArrSplit3;
                                    jSONObject6.put("key", strTrim2);
                                    jSONObject6.put("name", str13);
                                    JSONArray jSONArray7 = new JSONArray();
                                    int i5 = 1;
                                    while (i5 < strArrSplit4.length) {
                                        JSONObject jSONObject7 = new JSONObject();
                                        String[] strArr2 = strArrSplit4;
                                        String strTrim3 = strArrSplit4[i5].trim();
                                        String str25 = str23;
                                        int iIndexOf = strTrim3.indexOf(str20);
                                        String str26 = str20;
                                        String str27 = str24;
                                        str = str18;
                                        if (iIndexOf == -1) {
                                            try {
                                                if (!q(strTrim3)) {
                                                    jSONObject7.put("n", strTrim3);
                                                    jSONObject7.put("v", strTrim3);
                                                    jSONArray7.put(jSONObject7);
                                                }
                                            } catch (Exception e2) {
                                                e = e2;
                                                SpiderDebug.log(e);
                                                return str;
                                            }
                                        } else {
                                            String strSubstring = strTrim3.substring(0, iIndexOf);
                                            if (!q(strSubstring)) {
                                                jSONObject7.put("n", strSubstring.trim());
                                                jSONObject7.put("v", strTrim3.substring(iIndexOf + 1).trim());
                                                jSONArray7.put(jSONObject7);
                                            }
                                        }
                                        i5++;
                                        str23 = str25;
                                        strArrSplit4 = strArr2;
                                        str20 = str26;
                                        str24 = str27;
                                        str18 = str;
                                    }
                                    str14 = str18;
                                    str15 = str20;
                                    str16 = str23;
                                    str17 = str24;
                                    jSONObject6.put("value", jSONArray7);
                                    jSONArray6.put(jSONObject6);
                                }
                                str22 = str12;
                                str21 = str10;
                                str19 = str11;
                                strArrSplit3 = strArr;
                                str23 = str16;
                                str20 = str15;
                                str24 = str17;
                                str18 = str14;
                            }
                            str2 = str19;
                            str3 = str18;
                            str5 = str20;
                            str6 = str21;
                            str7 = str22;
                            str8 = str23;
                            str9 = str24;
                            if (!jSONObject3.has("filters")) {
                                jSONObject3.put("filters", new JSONObject());
                            }
                            jSONObject3.getJSONObject("filters").put(string2, jSONArray6);
                        } else {
                            str2 = str19;
                            str3 = str18;
                            str4 = strV;
                            str5 = str20;
                            str6 = str21;
                            str7 = str22;
                            str8 = str23;
                            str9 = str24;
                        }
                        jSONArray = jSONArray5;
                        jSONArray.put(jSONObject5);
                    }
                    i4 = i2 + 1;
                    appYs = this;
                    jSONArray3 = jSONArray;
                    jSONArray2 = jSONArray4;
                    strV = str4;
                    str22 = str7;
                    str21 = str6;
                    str19 = str2;
                    str23 = str8;
                    str20 = str5;
                    str24 = str9;
                    str18 = str3;
                }
            }
            str = str18;
            jSONObject3.put("class", jSONArray3);
            return jSONObject3.toString();
        } catch (Exception e3) {
            e = e3;
            str = str18;
        }
    }

    public String homeVideoContent() {
        boolean z;
        try {
            String str = this.j;
            String strConcat = (str.contains("api.php/app") || str.contains("xgapp")) ? str.concat("index_video?token=") : str.contains(".vod") ? str.concat("/vodPhbAll") : "";
            if (strConcat.isEmpty()) {
                strConcat = u(str) + "movie&page=1&area=&type=&start=";
                z = true;
            } else {
                z = false;
            }
            SpiderDebug.log(strConcat);
            JSONObject jSONObject = new JSONObject(yi.k(strConcat, n(strConcat)));
            JSONArray jSONArray = new JSONArray();
            if (z) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("data");
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("vod_id", jSONObject2.getString("nextlink"));
                    jSONObject3.put("vod_name", jSONObject2.getString("title"));
                    jSONObject3.put("vod_pic", jSONObject2.getString("pic"));
                    jSONObject3.put("vod_remarks", jSONObject2.getString("state"));
                    jSONArray.put(jSONObject3);
                }
            } else {
                ArrayList<JSONArray> arrayList = new ArrayList();
                l(jSONObject, "vlist", arrayList);
                if (arrayList.isEmpty()) {
                    l(jSONObject, "vod_list", arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                for (JSONArray jSONArray3 : arrayList) {
                    for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                        JSONObject jSONObject4 = jSONArray3.getJSONObject(i3);
                        String string = jSONObject4.getString("vod_id");
                        if (!arrayList2.contains(string)) {
                            arrayList2.add(string);
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("vod_id", string);
                            jSONObject5.put("vod_name", jSONObject4.getString("vod_name"));
                            jSONObject5.put("vod_pic", jSONObject4.getString("vod_pic"));
                            jSONObject5.put("vod_remarks", jSONObject4.getString("vod_remarks"));
                            jSONArray.put(jSONObject5);
                        }
                    }
                }
            }
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("list", jSONArray);
            return jSONObject6.toString();
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }

    public void init(Context context, String str) {
        super.init(context, str);
        this.j = str;
    }

    public boolean isVideoFormat(String str) {
        return ku.e(str);
    }

    public boolean manualVideoCheck() {
        return true;
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            String str3 = this.j;
            String strO = o(str3, x(str3, str), str2);
            JSONObject jSONObject = new JSONObject();
            m(strO, jSONObject);
            return C0529a.addDanmaku(jSONObject.toString());
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        try {
            String strP = p(this.j, URLEncoder.encode(str));
            JSONObject jSONObject = new JSONObject(yi.k(strP, n(strP)));
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = (jSONObject.has("list") && (jSONObject.get("list") instanceof JSONArray)) ? jSONObject.getJSONArray("list") : (jSONObject.has("data") && (jSONObject.get("data") instanceof JSONObject) && jSONObject.getJSONObject("data").has("list") && (jSONObject.getJSONObject("data").get("list") instanceof JSONArray)) ? jSONObject.getJSONObject("data").getJSONArray("list") : (jSONObject.has("data") && (jSONObject.get("data") instanceof JSONArray)) ? jSONObject.getJSONArray("data") : null;
            if (jSONArray2 != null) {
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                    if (jSONObject2.has("vod_id")) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("vod_id", jSONObject2.getString("vod_id"));
                        jSONObject3.put("vod_name", jSONObject2.getString("vod_name"));
                        jSONObject3.put("vod_pic", jSONObject2.getString("vod_pic"));
                        jSONObject3.put("vod_remarks", jSONObject2.getString("vod_remarks"));
                        jSONArray.put(jSONObject3);
                    } else {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("vod_id", jSONObject2.getString("nextlink"));
                        jSONObject4.put("vod_name", jSONObject2.getString("title"));
                        jSONObject4.put("vod_pic", jSONObject2.getString("pic"));
                        jSONObject4.put("vod_remarks", jSONObject2.getString("state"));
                        jSONArray.put(jSONObject4);
                    }
                }
            }
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("list", jSONArray);
            return jSONObject5.toString();
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }

    public final void t(String str, JSONObject jSONObject, JSONObject jSONObject2, String str2) throws JSONException {
        ArrayList arrayList;
        ArrayList arrayList2;
        JSONArray jSONArray;
        ArrayList arrayList3;
        String str3;
        HashMap map;
        Pattern[] patternArr;
        Pattern pattern;
        String[] strArr;
        int i2;
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        boolean zContains = str.contains("api.php/app/");
        String str4 = ",";
        HashMap map2 = this.k;
        CharSequence charSequence = "jpg.hou.lu/jm/za/index.php";
        String str5 = "parse_api";
        ArrayList arrayList6 = arrayList4;
        String str6 = "url";
        ArrayList arrayList7 = arrayList5;
        String str7 = "name";
        if (zContains) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("data");
            jSONObject2.put("vod_id", jSONObject3.optString("vod_id", str2));
            jSONObject2.put("vod_name", jSONObject3.getString("vod_name"));
            jSONObject2.put("vod_pic", jSONObject3.getString("vod_pic"));
            jSONObject2.put("type_name", jSONObject3.optString("vod_class"));
            jSONObject2.put("vod_year", jSONObject3.optString("vod_year"));
            jSONObject2.put("vod_area", jSONObject3.optString("vod_area"));
            jSONObject2.put("vod_remarks", jSONObject3.optString("vod_remarks"));
            jSONObject2.put("vod_actor", jSONObject3.optString("vod_actor"));
            jSONObject2.put("vod_director", jSONObject3.optString("vod_director"));
            jSONObject2.put("vod_content", jSONObject3.optString("vod_content"));
            JSONArray jSONArray2 = jSONObject3.getJSONArray("vod_url_with_player");
            int i3 = 0;
            while (i3 < jSONArray2.length()) {
                JSONObject jSONObject4 = jSONArray2.getJSONObject(i3);
                String str8 = str7;
                String strS = s(jSONObject4.getString(str8));
                ArrayList arrayList8 = arrayList7;
                arrayList8.add(strS);
                String str9 = str6;
                ArrayList arrayList9 = arrayList6;
                arrayList9.add(jSONObject4.getString(str9));
                String str10 = str5;
                String strOptString = jSONObject4.optString(str10);
                CharSequence charSequence2 = charSequence;
                if (strOptString.contains(charSequence2)) {
                    strOptString = "http://vip.mengx.vip/home/api?type=ys&uid=3249696&key=aefqrtuwxyEFHKNOQY&url=";
                }
                HashMap map3 = map2;
                map3.put(strS, strOptString);
                i3++;
                str7 = str8;
                arrayList7 = arrayList8;
                str6 = str9;
                str5 = str10;
                arrayList6 = arrayList9;
                charSequence = charSequence2;
                map2 = map3;
            }
        } else {
            HashMap map4 = map2;
            CharSequence charSequence3 = charSequence;
            String str11 = str5;
            String str12 = str6;
            if (!str.contains("xgapp")) {
                ArrayList arrayList10 = arrayList6;
                ArrayList arrayList11 = arrayList7;
                HashMap map5 = map4;
                String str13 = str12;
                if (str.contains(".vod")) {
                    JSONObject jSONObject5 = jSONObject.getJSONObject("data");
                    jSONObject2.put("vod_id", jSONObject5.optString("vod_id", str2));
                    jSONObject2.put("vod_name", jSONObject5.getString("vod_name"));
                    jSONObject2.put("vod_pic", jSONObject5.getString("vod_pic"));
                    jSONObject2.put("type_name", jSONObject5.optString("vod_class"));
                    jSONObject2.put("vod_year", jSONObject5.optString("vod_year"));
                    jSONObject2.put("vod_area", jSONObject5.optString("vod_area"));
                    jSONObject2.put("vod_remarks", jSONObject5.optString("vod_remarks"));
                    jSONObject2.put("vod_actor", jSONObject5.optString("vod_actor"));
                    jSONObject2.put("vod_director", jSONObject5.optString("vod_director"));
                    jSONObject2.put("vod_content", jSONObject5.optString("vod_content"));
                    JSONArray jSONArray3 = jSONObject5.getJSONArray("vod_play_list");
                    int i4 = 0;
                    while (i4 < jSONArray3.length()) {
                        JSONObject jSONObject6 = jSONArray3.getJSONObject(i4);
                        String strS2 = s(jSONObject6.getJSONObject("player_info").getString("show"));
                        ArrayList arrayList12 = arrayList11;
                        arrayList12.add(strS2);
                        String str14 = str13;
                        ArrayList arrayList13 = arrayList10;
                        arrayList13.add(jSONObject6.getString(str14));
                        try {
                            ArrayList arrayList14 = new ArrayList();
                            str3 = str4;
                            try {
                                String[] strArrSplit = jSONObject6.getJSONObject("player_info").optString("parse").split(str3);
                                String[] strArrSplit2 = jSONObject6.getJSONObject("player_info").optString("parse2").split(str3);
                                int length = strArrSplit.length;
                                int i5 = 0;
                                while (true) {
                                    patternArr = h;
                                    pattern = e;
                                    if (i5 >= length) {
                                        break;
                                    }
                                    jSONArray = jSONArray3;
                                    try {
                                        String str15 = strArrSplit[i5];
                                        if (pattern.matcher(str15).find()) {
                                            int length2 = patternArr.length;
                                            i2 = length;
                                            int i6 = 0;
                                            while (true) {
                                                if (i6 >= length2) {
                                                    arrayList3 = arrayList13;
                                                    arrayList14.add(str15);
                                                    break;
                                                }
                                                arrayList3 = arrayList13;
                                                try {
                                                    if (patternArr[i6].matcher(str15).find()) {
                                                        break;
                                                    }
                                                    i6++;
                                                    arrayList13 = arrayList3;
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    map = map5;
                                                    SpiderDebug.log(e);
                                                    i4++;
                                                    map5 = map;
                                                    arrayList11 = arrayList12;
                                                    str4 = str3;
                                                    str13 = str14;
                                                    arrayList10 = arrayList3;
                                                    jSONArray3 = jSONArray;
                                                }
                                            }
                                        } else {
                                            i2 = length;
                                            arrayList3 = arrayList13;
                                        }
                                        i5++;
                                        jSONArray3 = jSONArray;
                                        length = i2;
                                        arrayList13 = arrayList3;
                                    } catch (Exception e3) {
                                        e = e3;
                                        arrayList3 = arrayList13;
                                        map = map5;
                                        SpiderDebug.log(e);
                                        i4++;
                                        map5 = map;
                                        arrayList11 = arrayList12;
                                        str4 = str3;
                                        str13 = str14;
                                        arrayList10 = arrayList3;
                                        jSONArray3 = jSONArray;
                                    }
                                }
                                jSONArray = jSONArray3;
                                arrayList3 = arrayList13;
                                int length3 = strArrSplit2.length;
                                int i7 = 0;
                                while (i7 < length3) {
                                    String str16 = strArrSplit2[i7];
                                    if (pattern.matcher(str16).find()) {
                                        int length4 = patternArr.length;
                                        int i8 = 0;
                                        while (true) {
                                            if (i8 >= length4) {
                                                strArr = strArrSplit2;
                                                arrayList14.add(str16);
                                                break;
                                            } else {
                                                strArr = strArrSplit2;
                                                if (patternArr[i8].matcher(str16).find()) {
                                                    break;
                                                }
                                                i8++;
                                                strArrSplit2 = strArr;
                                            }
                                        }
                                    } else {
                                        strArr = strArrSplit2;
                                    }
                                    i7++;
                                    strArrSplit2 = strArr;
                                }
                                if (arrayList14.size() <= 0 || !((String) arrayList14.get(0)).contains("=")) {
                                    map = map5;
                                    map.put(strS2, "http://1.117.152.239:39000/?url=");
                                } else {
                                    String string = (String) arrayList14.get(0);
                                    boolean zContains2 = string.contains("http");
                                    Pattern pattern2 = f;
                                    try {
                                        if (zContains2) {
                                            Matcher matcher = pattern2.matcher(string);
                                            if (matcher.find()) {
                                                string = matcher.group(0).replace("..", ".").replace("vip.aotian.love", "vip.gaotian.love");
                                            }
                                        } else if (string.contains("//")) {
                                            Matcher matcher2 = pattern2.matcher(string);
                                            if (matcher2.find()) {
                                                string = "http:" + matcher2.group(0).replace("..", ".");
                                            }
                                        } else {
                                            Matcher matcher3 = g.matcher(str);
                                            if (matcher3.find()) {
                                                try {
                                                    Matcher matcher4 = pattern2.matcher(str);
                                                    if (matcher4.find()) {
                                                        StringBuilder sb = new StringBuilder();
                                                        try {
                                                            sb.append(matcher3.group(0));
                                                            sb.append(matcher4.group(0).replace("..", "."));
                                                            string = sb.toString();
                                                        } catch (Exception e4) {
                                                            e = e4;
                                                            map = map5;
                                                            SpiderDebug.log(e);
                                                            i4++;
                                                            map5 = map;
                                                            arrayList11 = arrayList12;
                                                            str4 = str3;
                                                            str13 = str14;
                                                            arrayList10 = arrayList3;
                                                            jSONArray3 = jSONArray;
                                                        }
                                                    }
                                                } catch (Exception e5) {
                                                    e = e5;
                                                }
                                            }
                                            map = map5;
                                            map.put(strS2, string);
                                        }
                                        map.put(strS2, string);
                                    } catch (Exception e6) {
                                        e = e6;
                                        SpiderDebug.log(e);
                                    }
                                    map = map5;
                                }
                            } catch (Exception e7) {
                                e = e7;
                                jSONArray = jSONArray3;
                            }
                        } catch (Exception e8) {
                            e = e8;
                            jSONArray = jSONArray3;
                            arrayList3 = arrayList13;
                            str3 = str4;
                        }
                        i4++;
                        map5 = map;
                        arrayList11 = arrayList12;
                        str4 = str3;
                        str13 = str14;
                        arrayList10 = arrayList3;
                        jSONArray3 = jSONArray;
                    }
                    arrayList2 = arrayList10;
                    arrayList = arrayList11;
                } else {
                    if (c.matcher(str).find()) {
                        jSONObject2.put("vod_id", jSONObject.optString("vod_id", str2));
                        jSONObject2.put("vod_name", jSONObject.getString("title"));
                        jSONObject2.put("vod_pic", jSONObject.getString("img_url"));
                        jSONObject2.put("type_name", r(jSONObject.optJSONArray("type")));
                        jSONObject2.put("vod_year", jSONObject.optString("pubtime"));
                        jSONObject2.put("vod_area", r(jSONObject.optJSONArray("area")));
                        jSONObject2.put("vod_remarks", jSONObject.optString("trunk"));
                        jSONObject2.put("vod_actor", r(jSONObject.optJSONArray("actor")));
                        jSONObject2.put("vod_director", r(jSONObject.optJSONArray("director")));
                        jSONObject2.put("vod_content", jSONObject.optString("intro"));
                        JSONObject jSONObject7 = jSONObject.getJSONObject("videolist");
                        Iterator<String> itKeys = jSONObject7.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            JSONArray jSONArray4 = jSONObject7.getJSONArray(next);
                            ArrayList arrayList15 = new ArrayList();
                            for (int i9 = 0; i9 < jSONArray4.length(); i9++) {
                                JSONObject jSONObject8 = jSONArray4.getJSONObject(i9);
                                arrayList15.add(jSONObject8.getString("title") + "$" + jSONObject8.getString(str13));
                            }
                            arrayList11.add(s(next));
                            arrayList10.add(TextUtils.join("#", arrayList15));
                        }
                    }
                    arrayList = arrayList11;
                    arrayList2 = arrayList10;
                }
                jSONObject2.put("vod_play_from", TextUtils.join("$$$", arrayList));
                jSONObject2.put("vod_play_url", TextUtils.join("$$$", arrayList2));
            }
            JSONObject jSONObject9 = jSONObject.getJSONObject("data").getJSONObject("vod_info");
            jSONObject2.put("vod_id", jSONObject9.optString("vod_id", str2));
            jSONObject2.put("vod_name", jSONObject9.getString("vod_name"));
            jSONObject2.put("vod_pic", jSONObject9.getString("vod_pic"));
            jSONObject2.put("type_name", jSONObject9.optString("vod_class"));
            jSONObject2.put("vod_year", jSONObject9.optString("vod_year"));
            jSONObject2.put("vod_area", jSONObject9.optString("vod_area"));
            jSONObject2.put("vod_remarks", jSONObject9.optString("vod_remarks"));
            jSONObject2.put("vod_actor", jSONObject9.optString("vod_actor"));
            jSONObject2.put("vod_director", jSONObject9.optString("vod_director"));
            jSONObject2.put("vod_content", jSONObject9.optString("vod_content"));
            JSONArray jSONArray5 = jSONObject9.getJSONArray("vod_url_with_player");
            int i10 = 0;
            while (i10 < jSONArray5.length()) {
                JSONObject jSONObject10 = jSONArray5.getJSONObject(i10);
                String str17 = str7;
                String strS3 = s(jSONObject10.getString(str17));
                ArrayList arrayList16 = arrayList7;
                arrayList16.add(strS3);
                String str18 = str12;
                ArrayList arrayList17 = arrayList6;
                arrayList17.add(jSONObject10.getString(str18));
                String str19 = str11;
                String strOptString2 = jSONObject10.optString(str19);
                CharSequence charSequence4 = charSequence3;
                if (strOptString2.contains(charSequence4)) {
                    strOptString2 = "http://vip.mengx.vip/home/api?type=ys&uid=3249696&key=aefqrtuwxyEFHKNOQY&url=";
                }
                HashMap map6 = map4;
                map6.put(strS3, strOptString2);
                i10++;
                str7 = str17;
                arrayList7 = arrayList16;
                str12 = str18;
                str11 = str19;
                arrayList6 = arrayList17;
                charSequence3 = charSequence4;
                map4 = map6;
            }
        }
        arrayList2 = arrayList6;
        arrayList = arrayList7;
        jSONObject2.put("vod_play_from", TextUtils.join("$$$", arrayList));
        jSONObject2.put("vod_play_url", TextUtils.join("$$$", arrayList2));
    }

    public final String u(String str) {
        return (str.contains("api.php/app") || str.contains("xgapp")) ? str.contains("dijiaxia") ? "http://www.dijiaxia.com/api.php/app/video?tid=" : str.concat("video?tid=") : str.contains(".vod") ? str.contains("iopenyun") ? str.concat("/list?type=") : str.concat("?type=") : str.concat("?ac=list&class=");
    }

    public final String v(String str) {
        return (str.contains("api.php/app") || str.contains("xgapp")) ? str.concat("nav?token=") : str.contains(".vod") ? str.contains("iopenyun.com") ? str.concat("/list?type") : str.concat("/types") : "";
    }

    public final String w(String str, JSONObject jSONObject) {
        String str2 = "";
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next.equals("class") || next.equals("area") || next.equals("lang") || next.equals("year")) {
                    try {
                        str2 = str2 + "筛选" + next + "+全部=+" + jSONObject.getString(next).replace(",", Marker.ANY_NON_NULL_MARKER) + "\n";
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        if (!str.contains(".vod")) {
            return (str.contains("api.php/app") || str.contains("xgapp")) ? str2 : "分类+全部=+电影=movie+连续剧=tvplay+综艺=tvshow+动漫=comic+4K=movie_4k+体育=tiyu\n筛选class+全部=+喜剧+爱情+恐怖+动作+科幻+剧情+战争+警匪+犯罪+动画+奇幻+武侠+冒险+枪战+恐怖+悬疑+惊悚+经典+青春+文艺+微电影+古装+历史+运动+农村+惊悚+惊悚+伦理+情色+福利+三级+儿童+网络电影\n筛选area+全部=+大陆+香港+台湾+美国+英国+法国+日本+韩国+德国+泰国+印度+西班牙+加拿大+其他\n筛选year+全部=+2022+2021+2020+2019+2018+2017+2016+2015+2014+2013+2012+2011+2010+2009+2008+2007+2006+2005+2004+2003+2002+2001+2000";
        }
        return str2 + "\n排序+全部=+最新=time+最热=hits+评分=score";
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String x(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            java.util.regex.Pattern r0 = com.github.catvod.spider.AppYs.d
            java.util.regex.Matcher r0 = r0.matcher(r3)
            boolean r0 = r0.find()
            java.util.HashMap r1 = r2.k
            if (r0 == 0) goto L1b
            boolean r3 = r1.containsKey(r4)
            if (r3 == 0) goto L38
            java.lang.Object r3 = r1.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            goto L3a
        L1b:
            java.lang.String r0 = "api.php/app/"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "xgapp"
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L3a
        L2b:
            boolean r3 = r1.containsKey(r4)
            if (r3 == 0) goto L38
            java.lang.Object r3 = r1.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            goto L3a
        L38:
            java.lang.String r3 = ""
        L3a:
            java.lang.String r0 = "svip.jhyun.jx.cn"
            boolean r0 = r3.contains(r0)
            java.lang.String r1 = "https://jx.parwix.com:4433/player/?url="
            if (r0 != 0) goto L68
            java.lang.String r0 = "svip.jhdyw.vip"
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L4d
            goto L68
        L4d:
            java.lang.String r4 = "jhsj.manduhu.com"
            boolean r4 = r3.contains(r4)
            if (r4 != 0) goto L66
            java.lang.String r4 = "v.jhdyw.vip/nhdz666"
            boolean r4 = r3.contains(r4)
            if (r4 == 0) goto L5e
            goto L66
        L5e:
            java.lang.String r4 = "x-n.cc"
            boolean r4 = r3.contains(r4)
            if (r4 == 0) goto L88
        L66:
            r3 = r1
            goto L88
        L68:
            java.lang.String r3 = "人人迷"
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L73
            java.lang.String r3 = "http://www.1080kan.cc/jiexi/rrmi.php?url="
            goto L88
        L73:
            java.lang.String r3 = "人人"
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L7e
            java.lang.String r3 = "http://www.1080kan.cc/jiexi/rr.php?url="
            goto L88
        L7e:
            java.lang.String r3 = "番茄"
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L66
            java.lang.String r3 = "http://www.1080kan.cc/jiexi/fq.php?url="
        L88:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppYs.x(java.lang.String, java.lang.String):java.lang.String");
    }

    public final String y(String str) {
        return (str.contains("api.php/app") || str.contains("xgapp")) ? str.contains("dijiaxia") ? "https://www.dijiaxia.com/api.php/app/video_detail?id=" : str.contains("1010dy") ? "http://www.1010dy.cc/api.php/app/video_detail?id=" : str.concat("video_detail?id=") : str.contains(".vod") ? str.contains("iopenyun") ? str.concat("/detailID?vod_id=") : str.concat("/detail?vod_id=") : "";
    }
}
