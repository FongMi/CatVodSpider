package com.github.catvod.spider.merge.AB.b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.AB.o.c0;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class z {
    private static Bitmap c = null;
    private static String d = null;
    private static final String e = "/tvtmp";
    private String a;
    private final Map<String, Map<String, String>> b = new HashMap();

    private com.github.catvod.spider.merge.AB.c.e<String> a(String str, boolean z) {
        com.github.catvod.spider.merge.AB.c.e<String> eVar = new com.github.catvod.spider.merge.AB.c.e<>();
        eVar.e(0);
        try {
            b(true);
            String str2 = "https://pan.baidu.com/share/transfer?shareid=" + m(this.a, "shareid") + "&from=" + m(this.a, "uk") + "&sekey=" + m(this.a, "sekey") + "&ondup=newcopy&async=1&channel=chunlei&web=1&app_id=250528";
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            map.put("fsidlist", arrayList.toString());
            map.put("path", e);
            JSONObject jSONObject = new JSONObject(com.github.catvod.spider.merge.AB.m.c.h(str2, map, f()).a());
            if (jSONObject.optInt("errno") == 0) {
                String strOptString = jSONObject.optJSONObject("extra").optJSONArray("list").optJSONObject(0).optString("to");
                if (TextUtils.isEmpty(strOptString) && z) {
                    return a(str, false);
                }
                eVar.f(strOptString);
            } else if (jSONObject.optInt("errno") == 2) {
                eVar.g(jSONObject.optString("show_msg"));
                if (jSONObject.optString("show_msg").equals("文件已存在")) {
                    eVar.g("不支持看自己的分享");
                }
                eVar.e(2);
            } else {
                eVar.e(jSONObject.optInt("errno"));
                eVar.g(jSONObject.optString("show_msg"));
            }
        } catch (Exception e2) {
            eVar.e(500);
            eVar.g(e2.getMessage());
            SpiderDebug.log("copy err" + e2.getMessage());
        }
        return eVar;
    }

    private boolean b(boolean z) {
        try {
            n();
            com.github.catvod.spider.merge.AB.f.b bVarE = com.github.catvod.spider.merge.AB.f.b.e(com.github.catvod.spider.merge.AB.m.c.l("https://pan.baidu.com/api/list?clienttype=0&app_id=250528&web=1&dp-logid=&order=time&desc=1&dir=/tvtmp&num=100&page=1", f()));
            ArrayList arrayList = new ArrayList();
            if (bVarE.a() == 0) {
                Iterator it = bVarE.b().iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.github.catvod.spider.merge.AB.f.a) it.next()).c());
                }
            }
            if (!arrayList.isEmpty() && arrayList.size() >= 3) {
                HashMap map = new HashMap();
                map.put("filelist", new JSONArray((Collection) arrayList).toString());
                if (TextUtils.isEmpty(new JSONObject(com.github.catvod.spider.merge.AB.m.c.h("https://pan.baidu.com/api/filemanager?async=2&onnest=fail&opera=delete&bdstoken=", map, f()).a()).optString("taskid")) && z) {
                    return b(false);
                }
            }
            return true;
        } catch (Exception e2) {
            SpiderDebug.log("delete err: " + e2);
            return false;
        }
    }

    private void c(String str, String str2, String str3, String str4, List<com.github.catvod.spider.merge.AB.f.a> list, String str5) {
        try {
            String str6 = "https://pan.baidu.com/share/list?is_from_web=true&sekey=" + str + "&uk=" + str2 + "&shareid=" + str3 + "&order=other&desc=1&showempty=0&view_mode=1&web=1&page=1&num=100&dir=" + URLEncoder.encode(str4) + "&t=0.6675001943649936&channel=chunlei&web=1&app_id=250528&bdstoken=";
            Map<String, String> mapF = f();
            ((HashMap) mapF).put("Cookie", "BDCLND=" + str);
            com.github.catvod.spider.merge.AB.f.b bVarE = com.github.catvod.spider.merge.AB.f.b.e(com.github.catvod.spider.merge.AB.m.c.l(str6, mapF));
            if (bVarE.a() == 0) {
                List listB = bVarE.b();
                ArrayList arrayList = new ArrayList();
                for (int size = listB.size() - 1; size >= 0; size--) {
                    com.github.catvod.spider.merge.AB.f.a aVar = (com.github.catvod.spider.merge.AB.f.a) listB.get(size);
                    if (aVar.g()) {
                        aVar.j(str5);
                        list.add(aVar);
                    } else if (aVar.b() == 1) {
                        arrayList.add(aVar);
                    }
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    c(str, str2, str3, ((com.github.catvod.spider.merge.AB.f.a) listB.get(size2)).c(), list, "");
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static z e() {
        return y.a;
    }

    private Map<String, String> f() {
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Safari/537.36 Edg/134.0.0.0");
        map.put("Accept", "application/json;charset=UTF-8");
        if (!TextUtils.isEmpty(g())) {
            map.put("Cookie", g());
        }
        map.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        map.put("Referer", "https://pan.baidu.com");
        return map;
    }

    private String i(String str) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    ArrayList arrayList = new ArrayList(Arrays.asList(str.split("/+")));
                    boolean z = !arrayList.isEmpty() && ((String) arrayList.get(0)).isEmpty();
                    if (arrayList.isEmpty()) {
                        return "";
                    }
                    int size = arrayList.size() - 1;
                    if (size >= 0) {
                        arrayList.remove(size);
                    }
                    if (z && arrayList.size() == 1 && ((String) arrayList.get(0)).isEmpty()) {
                        return "/";
                    }
                    StringBuilder sb = new StringBuilder();
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        while (true) {
                            sb.append((CharSequence) it.next());
                            if (!it.hasNext()) {
                                break;
                            }
                            sb.append((CharSequence) "/");
                        }
                    }
                    String string = sb.toString();
                    if (z) {
                        if (string.isEmpty()) {
                            return "/";
                        }
                    }
                    return string;
                }
            } catch (Exception unused) {
            }
        }
        return str;
    }

    public static boolean k() {
        try {
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
            map.put("Referer", "https://pan.baidu.com/");
            JSONObject jSONObject = new JSONObject(com.github.catvod.spider.merge.AB.m.c.l("https://passport.baidu.com/v2/api/getqrcode?lp=pc&qrloginfrom=pc", map));
            SpiderDebug.log(jSONObject.toString());
            String str = "https://" + jSONObject.optString("imgurl") + "&logPage=traceId%3Apc_loginv5_1742970205%2ClogPage%3Aloginv5";
            d = jSONObject.optString("sign");
            byte[] bArrBytes = com.github.catvod.spider.merge.AB.m.c.d(str).body().bytes();
            c = BitmapFactory.decodeByteArray(bArrBytes, 0, bArrBytes.length);
            return !TextUtils.isEmpty(d);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>] */
    private String m(String str, String str2) {
        try {
            return (String) ((Map) this.b.get(str)).get(str2);
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    private com.github.catvod.spider.merge.AB.f.a n() {
        try {
            com.github.catvod.spider.merge.AB.f.b bVarE = com.github.catvod.spider.merge.AB.f.b.e(com.github.catvod.spider.merge.AB.m.c.l("https://pan.baidu.com/api/list?clienttype=0&app_id=250528&web=1&dp-logid=&order=time&desc=1&dir=%2F&num=100&page=1", f()));
            if (bVarE.a() == 0) {
                for (com.github.catvod.spider.merge.AB.f.a aVar : bVarE.b()) {
                    if (aVar.c().equals(e)) {
                        return aVar;
                    }
                }
            }
            String str = "https://pan.baidu.com/api/create?a=commit&bdstoken=" + new JSONObject(com.github.catvod.spider.merge.AB.m.c.l("https://pan.baidu.com/api/gettemplatevariable?clienttype=0&app_id=250528&web=1&fields=[\"bdstoken\",\"token\",\"uk\",\"isdocuser\",\"servertime\"]", f())).optJSONObject("result").optString("bdstoken") + "&clienttype=0&app_id=250528&web=1&dp-logid=";
            HashMap map = new HashMap();
            String str2 = e;
            map.put("path", str2);
            map.put("isdir", "1");
            map.put("block_list", "[]");
            JSONObject jSONObject = new JSONObject(com.github.catvod.spider.merge.AB.m.c.h(str, map, f()).a());
            com.github.catvod.spider.merge.AB.f.a aVar2 = new com.github.catvod.spider.merge.AB.f.a();
            aVar2.h(jSONObject.optLong("fs_id"));
            aVar2.i(str2);
            return aVar2;
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return null;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void r(String str, String str2, String str3) {
        try {
            Map<String, String> map = this.b.get(str);
            if (map == null) {
                map = new HashMap<>();
            }
            map.put(str2, str3);
            this.b.put(str, map);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static boolean s() {
        try {
            String str = "https://passport.baidu.com/channel/unicast?channel_id=" + d;
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
            map.put("Referer", "https://pan.baidu.com/");
            JSONObject jSONObject = new JSONObject(com.github.catvod.spider.merge.AB.m.c.l(str, map));
            SpiderDebug.log(jSONObject.toString());
            if (jSONObject.optInt("errno") == 0) {
                JSONObject jSONObject2 = new JSONObject(jSONObject.optString("channel_v"));
                SpiderDebug.log(jSONObject2.toString());
                if (jSONObject2.optInt("status") == 0) {
                    String str2 = "https://passport.baidu.com/v3/login/main/qrbdusslogin?v=" + System.currentTimeMillis() + "&bduss=" + jSONObject2.optString("v");
                    new HashMap();
                    String str3 = "";
                    String str4 = "";
                    for (String str5 : com.github.catvod.spider.merge.AB.m.c.b(str2, map).c().get("set-cookie")) {
                        str3 = TextUtils.isEmpty(str3) ? str5.split(";")[0] : str3 + ";" + str5.split(";")[0];
                        if (str5.contains("BDUSS=")) {
                            str4 = str5.split(";")[0];
                        }
                    }
                    SpiderDebug.log("tempCookies: " + str3);
                    map.put("Cookie", str3);
                    Iterator<String> it = com.github.catvod.spider.merge.AB.m.c.j(com.github.catvod.spider.merge.AB.m.c.f(), com.github.catvod.spider.merge.AB.m.c.c(com.github.catvod.spider.merge.AB.m.c.c("https://pan.baidu.com/disk/main?from=homeFlow", map), map), new HashMap(), map).c().get("set-cookie").iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String next = it.next();
                        if (next.contains("STOKEN=")) {
                            str4 = str4 + ";" + next.split(";")[0];
                            break;
                        }
                    }
                    c0.u(".baidu", str4);
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public final void d(String str, String str2, List<com.github.catvod.spider.merge.AB.f.a> list) {
        try {
            String strL = l(str, str2);
            if (TextUtils.isEmpty(strL)) {
                return;
            }
            r(str, "sekey", strL);
            Map<String, String> mapF = f();
            ((HashMap) mapF).put("Cookie", "BDCLND=" + strL);
            com.github.catvod.spider.merge.AB.f.b bVarE = com.github.catvod.spider.merge.AB.f.b.e(com.github.catvod.spider.merge.AB.m.c.l("https://pan.baidu.com/share/list?web=5&app_id=250528&desc=1&showempty=0&page=1&num=20&order=time&shorturl=" + str + "&root=1&view_mode=1&channel=chunlei&web=1&bdstoken=", mapF));
            if (bVarE.a() != 0) {
                com.github.catvod.spider.merge.AB.o.E.b("");
                return;
            }
            r(str, "shareid", bVarE.c());
            r(str, "uk", bVarE.d());
            List listB = bVarE.b();
            for (int size = listB.size() - 1; size >= 0; size--) {
                com.github.catvod.spider.merge.AB.f.a aVar = (com.github.catvod.spider.merge.AB.f.a) listB.get(size);
                if (aVar.g()) {
                    list.add(aVar);
                }
                if (aVar.b() == 1) {
                    byte[] bArr = new byte[8];
                    bArr[0] = 87;
                    bArr[1] = -4;
                    bArr[2] = 48;
                    bArr[3] = 121;
                    bArr[4] = -63;
                    bArr[5] = -10;
                    bArr[6] = -45;
                    bArr[7] = -44;
                    String strM = m(str, com.github.catvod.spider.merge.AB.a.a.a(new byte[]{34, -105}, bArr));
                    byte[] bArr2 = new byte[7];
                    bArr2[0] = -14;
                    bArr2[1] = -70;
                    bArr2[2] = 111;
                    bArr2[3] = -5;
                    bArr2[4] = 65;
                    bArr2[5] = -103;
                    bArr2[6] = -120;
                    byte[] bArr3 = new byte[8];
                    bArr3[0] = -127;
                    bArr3[1] = -46;
                    bArr3[2] = 14;
                    bArr3[3] = -119;
                    bArr3[4] = 36;
                    bArr3[5] = -16;
                    bArr3[6] = -20;
                    bArr3[7] = 55;
                    String strM2 = m(str, com.github.catvod.spider.merge.AB.a.a.a(bArr2, bArr3));
                    StringBuilder sb = new StringBuilder();
                    byte[] bArr4 = new byte[10];
                    bArr4[0] = 74;
                    bArr4[1] = 15;
                    bArr4[2] = 30;
                    bArr4[3] = -106;
                    bArr4[4] = -73;
                    bArr4[5] = 17;
                    bArr4[6] = 61;
                    bArr4[7] = 26;
                    bArr4[8] = 11;
                    bArr4[9] = 23;
                    sb.append(com.github.catvod.spider.merge.AB.a.a.a(bArr4, new byte[]{101, 124, 118, -9, -59, 116, 81, 115}));
                    sb.append(strM2);
                    sb.append("-");
                    sb.append(aVar.a());
                    sb.append("/");
                    sb.append(aVar.e());
                    c(strL, strM, strM2, sb.toString(), list, aVar.e());
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final String g() {
        return c0.q(".baidu");
    }

    public final com.github.catvod.spider.merge.AB.c.e<String> h(String str) {
        com.github.catvod.spider.merge.AB.c.e<String> eVar = new com.github.catvod.spider.merge.AB.c.e<>();
        try {
            eVar = a(str, true);
        } catch (Exception e2) {
            eVar.e(500);
            eVar.f(e2.getMessage());
        }
        if (eVar.b() == 0 && !com.github.catvod.spider.merge.AB.C.h.c((CharSequence) eVar.c())) {
            String str2 = (String) eVar.c();
            SpiderDebug.log("getDownLoadUrl copy res: " + str2);
            String str3 = "https://pan.baidu.com/api/mediainfo?type=M3U8_FLV_264_480&path=" + URLEncoder.encode(str2) + "&clienttype=80&origin=dlna";
            HashMap map = new HashMap();
            map.put("User-Agent", "netdisk;1.4.2;22021211RC;android-android;12;JSbridge4.4.0;jointBridge;1.1.0;");
            map.put("Cookie", g());
            JSONObject jSONObject = new JSONObject(com.github.catvod.spider.merge.AB.m.c.l(str3, map));
            String strOptString = jSONObject.optJSONObject("info").optString("dlink");
            SpiderDebug.log("getDownLoadUrl dlink res: " + strOptString);
            if (TextUtils.isEmpty(strOptString)) {
                eVar.e(jSONObject.optInt("errno"));
                eVar.f("dlink 为空");
            }
            eVar.f(com.github.catvod.spider.merge.AB.m.c.c(strOptString, map));
            return eVar;
        }
        return eVar;
    }

    public final Bitmap j() {
        return c;
    }

    public final String l(String str, String str2) {
        JSONObject jSONObject;
        try {
            String str3 = "https://pan.baidu.com/share/verify?t=" + System.currentTimeMillis() + "&surl=" + str + "&channel=chunlei&web=1&app_id=250528&bdstoken=";
            HashMap map = new HashMap();
            map.put("pwd", str2);
            jSONObject = new JSONObject(com.github.catvod.spider.merge.AB.m.c.h(str3, map, f()).a());
        } catch (Exception unused) {
        }
        if (jSONObject.optInt("errno") == 0) {
            return jSONObject.optString("randsk");
        }
        jSONObject.optInt("err_msg");
        com.github.catvod.spider.merge.AB.o.E.b("");
        return "";
    }

    public final com.github.catvod.spider.merge.AB.c.j o(String str, String str2, String str3) {
        ArrayList arrayList;
        List listSingletonList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Iterator it;
        com.github.catvod.spider.merge.AB.c.j jVar = new com.github.catvod.spider.merge.AB.c.j();
        try {
            arrayList = new ArrayList();
            d(str, str2, arrayList);
            listSingletonList = Collections.singletonList("B度原画");
            arrayList2 = new ArrayList();
            arrayList3 = new ArrayList();
            it = arrayList.iterator();
        } catch (Exception unused) {
        }
        while (true) {
            String str4 = "";
            if (!it.hasNext()) {
                break;
            }
            com.github.catvod.spider.merge.AB.f.a aVar = (com.github.catvod.spider.merge.AB.f.a) it.next();
            if (!TextUtils.isEmpty(aVar.d())) {
                str4 = "[" + aVar.d().trim() + "]";
            }
            String str5 = str4 + aVar.e() + aVar.f() + "$" + str + Marker.ANY_NON_NULL_MARKER + aVar.a();
            if (!TextUtils.isEmpty(str3) && !str3.contains("http")) {
                str5 = str5 + Marker.ANY_NON_NULL_MARKER + str3 + Marker.ANY_NON_NULL_MARKER + aVar.e();
            }
            arrayList2.add(str5);
            return jVar;
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add("分享链接解析失败$0");
        }
        for (int i = 0; i < listSingletonList.size(); i++) {
            arrayList3.add(TextUtils.join("#", arrayList2));
        }
        jVar.g(str);
        jVar.e(str);
        jVar.i("");
        jVar.h(i(((com.github.catvod.spider.merge.AB.f.a) arrayList.get(0)).c()));
        jVar.k(TextUtils.join("$$$", arrayList3));
        jVar.j(TextUtils.join("$$$", listSingletonList));
        return jVar;
    }

    public final boolean p() {
        return !TextUtils.isEmpty(c0.q(".baidu"));
    }

    public final String q(String[] strArr) {
        try {
            if (!p()) {
                com.github.catvod.spider.merge.AB.o.E.b("未登录, 请去配置中心设置");
                return com.github.catvod.spider.merge.AB.c.g.n("未登录, 请去配置中心设置");
            }
            this.a = strArr[0];
            com.github.catvod.spider.merge.AB.c.e<String> eVarH = h(strArr[1]);
            if (eVarH.b() != 0) {
                return com.github.catvod.spider.merge.AB.c.g.n(eVarH.d());
            }
            String str = (String) eVarH.c();
            SpiderDebug.log("downloadUrl: " + str);
            Map<String, String> mapF = f();
            ((HashMap) mapF).put("User-Agent", "netdisk;1.4.2;22021211RC;android-android;12;JSbridge4.4.0;jointBridge;1.1.0;");
            if (com.github.catvod.spider.merge.AB.o.H.b(5).booleanValue()) {
                String strD = com.github.catvod.spider.merge.AB.o.H.d(str, 12, 400);
                if (strArr.length <= 3) {
                    com.github.catvod.spider.merge.AB.c.g gVarE = com.github.catvod.spider.merge.AB.c.g.e();
                    gVarE.y(strD);
                    gVarE.j();
                    gVarE.f(mapF);
                    return gVarE.o();
                }
                String str2 = Proxy.getUrl() + "?do=danmu&vodName=" + strArr[2] + "&vodIndex=" + strArr[3] + "&vodUrl=";
                com.github.catvod.spider.merge.AB.c.g gVarE2 = com.github.catvod.spider.merge.AB.c.g.e();
                gVarE2.y(strD);
                gVarE2.a(str2);
                gVarE2.j();
                gVarE2.f(mapF);
                return gVarE2.o();
            }
            if (TextUtils.isEmpty(com.github.catvod.spider.merge.AB.o.H.g())) {
                return "";
            }
            if (strArr.length <= 2) {
                com.github.catvod.spider.merge.AB.c.g gVarE3 = com.github.catvod.spider.merge.AB.c.g.e();
                gVarE3.y(com.github.catvod.spider.merge.AB.o.H.e(str));
                gVarE3.j();
                gVarE3.f(mapF);
                return gVarE3.o();
            }
            String str3 = Proxy.getUrl() + "?do=danmu&vodName=" + strArr[1] + "&vodIndex=" + strArr[2] + "&vodUrl=";
            com.github.catvod.spider.merge.AB.c.g gVarE4 = com.github.catvod.spider.merge.AB.c.g.e();
            gVarE4.y(com.github.catvod.spider.merge.AB.o.H.e(str));
            gVarE4.a(str3);
            gVarE4.j();
            gVarE4.f(mapF);
            return gVarE4.o();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }
}
