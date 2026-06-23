package com.github.catvod.spider.merge.b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.c.C0552c;
import com.github.catvod.spider.merge.c.C0554e;
import com.github.catvod.spider.merge.e.C0560a;
import com.github.catvod.spider.merge.e.C0561b;
import com.github.catvod.spider.merge.k.C0575b;
import com.github.catvod.spider.merge.k.C0577d;
import com.github.catvod.spider.merge.m.C0590I;
import com.github.catvod.spider.merge.m.C0602k;
import com.github.catvod.spider.merge.m.C0603l;
import java.io.File;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0546j {
    private static Map<String, String> bdclndMap;
    private static String cookie;
    private static Bitmap d;
    private static String e;
    private static Map<String, List<Long>> shareFsIdMap;
    private static Map<String, String> ukMap;
    private static final String[] aa = {"V2238A", "V2148A", "V2024A", "V1938A", "V1831A", "V1829A", "V1809A", "V1732A", "V2056A", "V2072A", "V2085A", "V2196A", "V2166BA", "V2217A", "V2243A", "SM-G9980", "SM-G9750", "SM-N9860", "SM-G7810", "SM-G9910", "SM-F7110", "SM-S9080", "SM-F9260", "SM-M2250", "SM-A5360", "SM-A3260", "SM-A715F", "SM-T735C", "SM-T505C", "SM-X700", "SM-X800", "M2102K1AC", "M2007J3SC", "M2012K11AC", "M2104K10AC", "M2103K19C", "2201122C", "2203121C", "2207122MC", "2210132C", "22127RK46C", "2107119DC", "2112123AC", "22041216C", "22081212C", "23013RK75C", "PDKM00", "PEXM00", "PCLM50", "PDSM00", "PEMM00", "PFDM00", "PGFM10", "PHJ110", "PJA110", "PJT110", "PKD110", "CPH2381", "CPH2451", "CPH2411", "CPH2521", "CPH2201", "VCE-AL00", "OXF-AN10", "LIO-AL00", "ELS-AN00", "JAD-AL50", "NOH-AN00", "NOH-AL10", "LIO-AL00", "TAS-AL00", "EVR-AL00", "MAR-AL00", "ANA-AN00", "JNY-AL10", "CDY-AN90", "DVC-AN20", "RMX2202", "RMX3366", "RMX3370", "RMX3310", "RMX3350", "RMX3461", "RMX3560", "RMX3708", "RMX2111", "RMX3125", "LE2120", "LE2110", "LE2100", "LE2117", "LE2125", "NE2210", "NE2215", "NE2217", "GM1910", "GM1900", "22041216UC", "22071212AC", "22101316C", "22101316U", "22127RK46C", "2304FPN6DC", "23049RAD8C", "23078RKD5C", "21091116AC", "21091116UC", "LSA-AN00", "TNA-AN00", "HJC-AN90", "FNE-AN00", "ANY-AN00", "TEL-AN00", "TEL-AN10", "TNY-AL00", "TNY-AN00", "LGE-AN00", "NX669J", "NX709S", "2109119BC", "22101316G", "XT2153-1", "XT2175-2", "A2633", "A2487", "KG5", "KG5K"};
    private static final Random z = new Random();
    private String a = "";
    private String b = "";
    private String randsk = "";
    private String uk = "";
    private String shareIdLong = "";
    private String randomFsId = "";
    private String to = "";
    private HashMap c = new HashMap();

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.b.j$a */
    private static class a {
        static volatile C0546j a = new C0546j();
    }

    private String a(String str, boolean z2) {
        b(true);
        boolean z3 = false;
        String key = "";
        String str2 = key;
        String str3 = str2;
        Map<String, List<Long>> map = shareFsIdMap;
        if (map != null) {
            Iterator<Map.Entry<String, List<Long>>> it = map.entrySet().iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, List<Long>> next = it.next();
                List<Long> value = next.getValue();
                if (value != null) {
                    Iterator<Long> it2 = value.iterator();
                    while (it2.hasNext()) {
                        if (it2.next().toString().equals(str)) {
                            key = next.getKey();
                            str2 = bdclndMap.get(key);
                            str3 = ukMap.get(key);
                            z3 = true;
                            break loop0;
                        }
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("https://pan.baidu.com/share/transfer?shareid=");
        if (!z3) {
            key = (String) this.c.get("shareid");
        }
        sb.append(key);
        sb.append("&from=");
        sb.append(!z3 ? (String) this.c.get("uk") : str3);
        sb.append("&sekey=");
        sb.append(!z3 ? (String) this.c.get("sekey") : str2);
        sb.append("&ondup=newcopy&async=1&channel=chunlei&web=1&app_id=250528");
        String string = sb.toString();
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        map2.put("fsidlist", arrayList.toString());
        map2.put("path", k());
        JSONObject jSONObject = new JSONObject(C0575b.g(string, map2, g()).a());
        if (jSONObject.optInt("errno") != 0) {
            return "";
        }
        String strOptString = jSONObject.optJSONObject("extra").optJSONArray("list").optJSONObject(0).optString("to");
        return (TextUtils.isEmpty(strOptString) && z2) ? a(str, false) : strOptString;
    }

    private boolean b(boolean z2) {
        try {
            String strA = C0602k.a(C0602k.b("/baidu_fsid.txt"));
            if (TextUtils.isEmpty(strA)) {
                return true;
            }
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(strA);
            map.put("filelist", new JSONArray((Collection) arrayList).toString());
            if (TextUtils.isEmpty(new JSONObject(C0575b.g("https://pan.baidu.com/api/filemanager?async=2&onnest=fail&opera=delete&bdstoken=", map, g()).a()).optString("taskid")) && z2) {
                return b(false);
            }
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private void c(String str, String str2, String str3, String str4, List<C0560a> list) {
        try {
            String str5 = "https://pan.baidu.com/share/list?is_from_web=true&sekey=" + str + "&uk=" + str2 + "&shareid=" + str3 + "&order=name&desc=1&showempty=0&view_mode=1&web=1&page=1&num=100&dir=" + URLEncoder.encode(str4) + "&t=0.6675001943649936&channel=chunlei&web=1&app_id=250528&bdstoken=";
            Map<String, String> mapG = g();
            ((HashMap) mapG).put("Cookie", "BDCLND=" + str);
            String strL = C0575b.l(str5, mapG);
            parseAndStoreShareInfo(strL, str);
            C0561b c0561bE = C0561b.e(strL);
            if (c0561bE.a() == 0) {
                List<C0560a> listB = c0561bE.b();
                ArrayList arrayList = new ArrayList();
                for (C0560a c0560a : listB) {
                    if (c0560a.m96f()) {
                        SpiderDebug.log(c0560a.toString());
                        list.add(c0560a);
                    } else if (c0560a.b() == 1) {
                        arrayList.add(c0560a);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c(str, str2, str3, ((C0560a) it.next()).c(), list);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static String extractLastPart(String str) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("/");
        int length = strArrSplit.length;
        if (3 >= 3) {
            return strArrSplit[strArrSplit.length - 1];
        }
        return null;
    }

    public static C0546j f() {
        return a.a;
    }

    private Map<String, String> g() {
        HashMap mapC = C0544h.c("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Safari/537.36 Edg/134.0.0.0", "Accept", "application/json;charset=UTF-8");
        mapC.put("Cookie", j());
        mapC.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        mapC.put("Referer", "https://pan.baidu.com");
        return mapC;
    }

    private Map<String, String> h() {
        HashMap map = new HashMap();
        map.put("Referer", "https://pan.baidu.com");
        map.put("Cookie", j());
        map.put("User-Agent", "netdisk;12.11.9;V2238A;android-android;12;JSbridge4.4.0;jointBridge;1.1.0;");
        return map;
    }

    private String m(String str) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    ArrayList arrayList = new ArrayList(Arrays.asList(str.split("/+")));
                    boolean z2 = !arrayList.isEmpty() && ((String) arrayList.get(0)).isEmpty();
                    if (arrayList.isEmpty()) {
                        return "";
                    }
                    int size = arrayList.size() - 1;
                    if (size >= 0) {
                        arrayList.remove(size);
                    }
                    if (z2 && arrayList.size() == 1 && ((String) arrayList.get(0)).isEmpty()) {
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
                    return z2 ? string.isEmpty() ? "/" : string : string;
                }
            } catch (Exception unused) {
            }
        }
        return str;
    }

    public static boolean o() {
        try {
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
            map.put("Referer", "https://pan.baidu.com/");
            JSONObject jSONObject = new JSONObject(C0575b.l("https://passport.baidu.com/v2/api/getqrcode?lp=pc&qrloginfrom=pc", map));
            SpiderDebug.log(jSONObject.toString());
            String str = "https://" + jSONObject.optString("imgurl") + "&logPage=traceId%3Apc_loginv5_1742970205%2ClogPage%3Aloginv5";
            SpiderDebug.log(str);
            e = jSONObject.optString("sign");
            byte[] bArrBytes = C0575b.c(str).body().bytes();
            d = BitmapFactory.decodeByteArray(bArrBytes, 0, bArrBytes.length);
            return !TextUtils.isEmpty(e);
        } catch (Exception unused) {
            return false;
        }
    }

    private static void parseAndStoreShareInfo(String str, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("share_id");
        String strOptString2 = jSONObject.optString("uk");
        if (bdclndMap == null) {
            bdclndMap = new HashMap();
        }
        if (ukMap == null) {
            ukMap = new HashMap();
        }
        Map<String, String> map = bdclndMap;
        String str3 = map.get(strOptString);
        if (str3 == null || !str3.equals(str2)) {
            map.put(strOptString, str2);
        }
        Map<String, String> map2 = ukMap;
        String str4 = map2.get(strOptString);
        if (str4 == null || !str4.equals(strOptString2)) {
            map2.put(strOptString, strOptString2);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("list");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    storeShareFsId(strOptString, Long.valueOf(jSONObjectOptJSONObject.optLong("fs_id")));
                }
            }
        }
    }

    public static void processShare(C0546j c0546j) {
        String[] strArrSplit = "3I3h39fbjo5Vv7zc8Zpj7w&ieyu|Dy4_Ef8Gw4N3mUYKOXDGjg&yz47|zQBpMm_YK945s96MYi2X-Q&790t|bQ55jQimAFxRaMh5KmmpCQ&d3st|P6RrcWdcBQHihj2gpncbgg&q856|dS-EbkbfTyuGpd7UrvxuSA&39ul|W1BCyEYWS5Uj4IxLAD9nyQ&m572|6hMEUXJM1KtSXC2Nq64vuA&63f7|rqzIrUQhfpqSaRfflK5wSA&zsc9|eOP80JUQCPpL7UOgysXGWQ&mgqs|8H8sXE4CJvvLsRMLlk0VhQ&5269|-1cfwV2_RQnp9rV47xYCqQ&73j9|rIzmVNF6yFcRlRIFM86hFw&o594|Shxt3M4EvsUbKTTrOqv79w&j9lu|zmEMpwA8qPj1ECQbf3hQEg&t70u".split("\\|");
        String[] strArrSplit2 = strArrSplit[new Random().nextInt(strArrSplit.length)].split("&");
        c0546j.verifyShare(strArrSplit2[0], strArrSplit2[1]);
        cookie = c0546j.j();
        String str = c0546j.shareIdLong;
        if (str.isEmpty()) {
            return;
        }
        String str2 = c0546j.uk;
        if (str2.isEmpty()) {
            return;
        }
        String str3 = c0546j.randsk;
        if (str3.isEmpty()) {
            return;
        }
        String str4 = c0546j.randomFsId;
        if (str4.isEmpty()) {
            return;
        }
        String strTransferFile = c0546j.transferFile(str, str2, str3, str4);
        if (strTransferFile.isEmpty() || !c0546j.getUrl(strTransferFile)) {
            return;
        }
        C0602k.c(C0602k.d("bdtime"), new SimpleDateFormat("yyyyMMdd").format(new Date()));
        String str5 = c0546j.to;
        if (TextUtils.isEmpty(str5)) {
            return;
        }
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str5);
        map.put("filelist", new JSONArray((Collection) arrayList).toString());
        SpiderDebug.log("删除文件结果: " + C0575b.g("https://pan.baidu.com/api/filemanager?async=2&onnest=fail&opera=delete&bdstoken=", map, c0546j.g()).a());
    }

    private String r(String str) {
        try {
            return new JSONObject(C0602k.a(a.a.i())).optString(str);
        } catch (Exception unused) {
            return "";
        }
    }

    private static void storeShareFsId(String str, Long l) {
        if (shareFsIdMap == null) {
            shareFsIdMap = new HashMap();
        }
        Map<String, List<Long>> map = shareFsIdMap;
        List<Long> arrayList = map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(str, arrayList);
        }
        if (arrayList.contains(l)) {
            return;
        }
        arrayList.add(l);
    }

    public static boolean t() {
        try {
            String str = "https://passport.baidu.com/channel/unicast?channel_id=" + e;
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
            map.put("Referer", "https://pan.baidu.com/");
            JSONObject jSONObject = new JSONObject(C0575b.l(str, map));
            if (jSONObject.optInt("errno") == 0) {
                JSONObject jSONObject2 = new JSONObject(jSONObject.optString("channel_v"));
                if (jSONObject2.optInt("status") == 0) {
                    String str2 = "https://passport.baidu.com/v3/login/main/qrbdusslogin?v=" + System.currentTimeMillis() + "&bduss=" + jSONObject2.optString("v");
                    HashMap map2 = new HashMap();
                    C0577d c0577dJ = C0575b.j(C0575b.e(), str2, new HashMap(), map, map2);
                    JSONObject jSONObjectOptJSONObject = new JSONObject(c0577dJ.a().replace("'", "\"")).optJSONObject("data").optJSONObject("user");
                    String str3 = "";
                    String str4 = "";
                    for (String str5 : c0577dJ.c().get("set-cookie")) {
                        str3 = TextUtils.isEmpty(str3) ? str5.split(";")[0] : str3 + ";" + str5.split(";")[0];
                        if (str5.contains("BDUSS=")) {
                            str4 = str5.split(";")[0];
                        }
                    }
                    map.put("Cookie", str3);
                    Iterator<String> it = C0575b.j(C0575b.e(), C0575b.b(C0575b.b("https://pan.baidu.com/disk/main?from=homeFlow", map), map), new HashMap(), map, map2).c().get("set-cookie").iterator();
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
                    jSONObjectOptJSONObject.put("cookie", str4);
                    C0602k.c(a.a.i(), jSONObjectOptJSONObject.toString());
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public final void d(String str, List<C0560a> list) {
        StringBuilder sbA = C0529a.a("https://pan.baidu.com/api/list?dir=");
        sbA.append(URLEncoder.encode(str));
        Iterator<C0560a> it = C0561b.e(C0575b.l(sbA.toString(), g())).b().iterator();
        while (it.hasNext()) {
            list.add(it.next());
        }
    }

    public final void e(String str, String str2, List<C0560a> list) {
        try {
            this.c = new HashMap();
            String strP = p(str, str2);
            if (TextUtils.isEmpty(strP)) {
                return;
            }
            this.c.put("sekey", strP);
            Map<String, String> mapG = g();
            ((HashMap) mapG).put("Cookie", "BDCLND=" + strP);
            C0561b c0561bE = C0561b.e(C0575b.l("https://pan.baidu.com/share/list?web=5&app_id=250528&desc=1&showempty=0&page=1&num=20&order=name&shorturl=" + str + "&root=1&view_mode=1&channel=chunlei&web=1&bdstoken=", mapG));
            if (c0561bE.a() != 0) {
                SpiderDebug.log("");
                return;
            }
            this.c.put("shareid", c0561bE.c());
            this.c.put("uk", c0561bE.d());
            for (C0560a c0560a : c0561bE.b()) {
                if (c0560a.m96f()) {
                    list.add(c0560a);
                }
                if (c0560a.b() == 1) {
                    c(strP, (String) this.c.get("uk"), (String) this.c.get("shareid"), "/sharelink" + ((String) this.c.get("shareid")) + "-" + c0560a.a() + "/" + c0560a.dd(), list);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public boolean getUrl(String str) {
        String strAd = com.github.catvod.spider.merge.A.a.ad(18);
        String strAd2 = com.github.catvod.spider.merge.A.a.ad(40);
        String str2 = com.github.catvod.spider.merge.A.a.ad(32).toUpperCase() + "|" + com.github.catvod.spider.merge.A.a.ad(9).toUpperCase();
        StringBuilder sbA = C0529a.a("");
        sbA.append(System.currentTimeMillis() / 1000);
        String string = sbA.toString();
        Uri.Builder builderBuildUpon = Uri.parse("https://d.pcs.baidu.com/rest/2.0/pcs/file").buildUpon();
        builderBuildUpon.appendQueryParameter("app_id", "250528");
        builderBuildUpon.appendQueryParameter("method", "locatedownload");
        builderBuildUpon.appendQueryParameter("check_blue", "1");
        builderBuildUpon.appendQueryParameter("path", str);
        builderBuildUpon.appendQueryParameter("version", "2.2.101.236");
        builderBuildUpon.appendQueryParameter("clienttype", "17");
        builderBuildUpon.appendQueryParameter("time", string);
        builderBuildUpon.appendQueryParameter("rand", strAd2);
        builderBuildUpon.appendQueryParameter("devuid", str2);
        builderBuildUpon.appendQueryParameter("channel", "0");
        builderBuildUpon.appendQueryParameter("version_app", "12.24.6");
        builderBuildUpon.appendQueryParameter("apn_id", "1_0");
        builderBuildUpon.appendQueryParameter("freeisp", "0");
        builderBuildUpon.appendQueryParameter("queryfree", "0");
        builderBuildUpon.appendQueryParameter("cuid", str2);
        builderBuildUpon.appendQueryParameter("network_type", "WIFI");
        builderBuildUpon.appendQueryParameter("deviceid", strAd);
        String string2 = builderBuildUpon.build().toString();
        Map<String, String> mapW = w();
        ((HashMap) mapW).put("User-Agent", "netdisk;P2SP;2.2.101.236;netdisk;12.24.6;V2238A;android-android;12;JSbridge4.4.0;jointBridge;1.1.0;");
        String strA = C0575b.g(string2, new HashMap(), mapW).a();
        if (strA.contains("error_msg")) {
            return false;
        }
        if (!strA.contains("{") && !strA.contains("}")) {
            return false;
        }
        Uri.Builder builderBuildUpon2 = Uri.parse("https://sdata.baidupcs.com/rest/2.0/pcs/file").buildUpon();
        builderBuildUpon2.appendQueryParameter("app_id", "250528");
        builderBuildUpon2.appendQueryParameter("method", "download");
        builderBuildUpon2.appendQueryParameter("check_blue", "1");
        builderBuildUpon2.appendQueryParameter("path", str);
        builderBuildUpon2.appendQueryParameter("time", string);
        builderBuildUpon2.appendQueryParameter("apn_id", "1_0");
        builderBuildUpon2.appendQueryParameter("freeisp", "0");
        builderBuildUpon2.appendQueryParameter("queryfree", "0");
        builderBuildUpon2.appendQueryParameter("cuid", str2);
        builderBuildUpon2.appendQueryParameter("network_type", "WIFI");
        builderBuildUpon2.appendQueryParameter("deviceid", strAd);
        String string3 = builderBuildUpon2.build().toString();
        int iNextInt = new Random().nextInt(307201) + 102400;
        HashMap map = new HashMap();
        String[] strArr = aa;
        Random random = z;
        map.put("User-Agent", String.format("netdisk;P2SP;2.2.101.236;netdisk;12.24.6;%s;android-android;%d;JSbridge4.4.0;jointBridge;1.1.0;", strArr[random.nextInt(127)], Integer.valueOf(random.nextInt(7) + 9)));
        map.put("Connection", "Keep-Alive");
        map.put("cookie", cookie);
        map.put("Range", "bytes=0-" + iNextInt);
        C0575b.l(string3, map);
        return true;
    }

    /* JADX INFO: renamed from: h, reason: collision with other method in class */
    public final String m88h() {
        if (TextUtils.isEmpty(this.a)) {
            String strOptString = "";
            try {
                JSONObject jSONObject = new JSONObject(C0575b.l("https://pan.baidu.com/api/gettemplatevariable?clienttype=0&app_id=250528&web=1&dp-logid=30708700659759020032&fields=[%22bdstoken%22,%22token%22,%22uk%22,%22isdocuser%22,%22servertime%22]", g()));
                if (jSONObject.optInt("errno") == 0) {
                    strOptString = jSONObject.optJSONObject("result").optString("bdstoken");
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            this.a = strOptString;
        }
        return this.a;
    }

    public final File i() {
        return C0602k.b("/baidu.txt");
    }

    public final String j() {
        return r("cookie");
    }

    public final String k() {
        C0561b c0561bE;
        if (TextUtils.isEmpty(this.b)) {
            String strC = "";
            try {
                c0561bE = C0561b.e(C0575b.l("https://pan.baidu.com/api/search?clienttype=0&app_id=250528&web=1&order=name&desc=1&num=100&page=1&recursion=1&key=TV", g()));
            } catch (Exception e2) {
                e2.printStackTrace();
                c0561bE = null;
            }
            if (c0561bE != null) {
                Iterator<C0560a> it = c0561bE.b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C0560a next = it.next();
                    if (next.b() == 1 && "/TV".equals(next.c())) {
                        strC = next.c();
                        break;
                    }
                }
            }
            this.b = strC;
        }
        if (TextUtils.isEmpty(this.b)) {
            try {
                String str = "https://pan.baidu.com/api/create?a=commit&bdstoken=" + m88h();
                HashMap map = new HashMap();
                map.put("path", "/TV");
                map.put("isdir", "1");
                map.put("block_list", "[]");
                JSONObject jSONObject = new JSONObject(C0575b.g(str, map, g()).a());
                this.b = jSONObject.optInt("errno") == 0 ? jSONObject.optString("path") : "/";
            } catch (Exception e3) {
                e3.printStackTrace();
                this.b = "/";
            }
        }
        return this.b;
    }

    public final String l(String str) {
        try {
            if (!str.startsWith("/")) {
                str = a(str, true);
                if (com.github.catvod.spider.merge.y.f.c(str)) {
                    return "";
                }
                C0602k.c(C0602k.b("/baidu_fsid.txt"), str);
                String[] strArrSplit = str.split("/");
                int length = strArrSplit.length;
                if (length > 0) {
                    String strSubstring = strArrSplit[length - 1];
                    int iLastIndexOf = strSubstring.lastIndexOf(".");
                    if (iLastIndexOf > 0) {
                        strSubstring = strSubstring.substring(0, iLastIndexOf);
                    }
                    C0603l.a("danmuvodindex", strSubstring);
                }
            }
            String str2 = "https://pan.baidu.com/api/mediainfo?type=M3U8_FLV_264_480&path=" + URLEncoder.encode(str) + "&clienttype=80&origin=dlna";
            HashMap map = new HashMap();
            map.put("User-Agent", "netdisk;12.11.9;V2238A;android-android;12;JSbridge4.4.0;jointBridge;1.1.0;");
            map.put("Cookie", j());
            JSONObject jSONObject = new JSONObject(C0575b.l(str2, map));
            SpiderDebug.log(jSONObject.toString());
            return C0575b.b(jSONObject.optJSONObject("info").optString("dlink"), map);
        } catch (Exception unused) {
            return "";
        }
    }

    public final Bitmap n() {
        return d;
    }

    public final String p(String str, String str2) {
        JSONObject jSONObject;
        try {
            String str3 = "https://pan.baidu.com/share/verify?t=" + System.currentTimeMillis() + "&surl=" + str + "&channel=chunlei&web=1&app_id=250528&bdstoken=";
            HashMap map = new HashMap();
            map.put("pwd", str2);
            jSONObject = new JSONObject(C0575b.g(str3, map, g()).a());
        } catch (Exception unused) {
        }
        if (jSONObject.optInt("errno") == 0) {
            return jSONObject.optString("randsk");
        }
        jSONObject.optInt("err_msg");
        SpiderDebug.log("");
        return "";
    }

    public final String q() {
        return r("username");
    }

    public String q(String[] strArr, String str) {
        f();
        if (TextUtils.isEmpty(j())) {
            C0590I.i("还未登录百度账号,请前往【配置中心】登录");
            return C0552c.l("还未登录百度账号,请前往【配置中心】登录");
        }
        String str2 = strArr.length > 1 ? strArr[1] : "";
        String str3 = strArr[0];
        String str4 = Proxy.getUrl() + "?do=danmu&site=wangpan";
        String strA = com.github.catvod.spider.merge.F.a.a("baidu", str2, str3, "");
        C0552c c0552c = new C0552c();
        c0552c.u(strA);
        c0552c.h();
        c0552c.e(h());
        c0552c.a(str4);
        return c0552c.toString();
    }

    public final C0554e s(String str, String str2) {
        C0554e c0554e = new C0554e();
        try {
            ArrayList<C0560a> arrayList = new ArrayList();
            e(str, str2, arrayList);
            Collections.sort(arrayList);
            List<String> baiduOptions = Config.getBaiduOptions();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (C0560a c0560a : arrayList) {
                arrayList2.add(c0560a.d() + "$" + c0560a.a());
            }
            if (arrayList2.isEmpty()) {
                arrayList2.add("分享链接解析失败$0");
            }
            for (int i = 0; i < baiduOptions.size(); i++) {
                arrayList3.add(TextUtils.join("#", arrayList2));
            }
            c0554e.j(str);
            c0554e.h(str);
            c0554e.l("https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/0rBz/1200X800/baidu.jpg");
            c0554e.k(extractLastPart(m(((C0560a) arrayList.get(0)).c())));
            c0554e.n(TextUtils.join("$$$", arrayList3));
            c0554e.m(TextUtils.join("$$$", baiduOptions));
        } catch (Exception unused) {
        }
        return c0554e;
    }

    public String transferFile(String str, String str2, String str3, String str4) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject2;
        HashMap map = new HashMap();
        map.put("path", k());
        map.put("fsidlist", "[" + str4 + "]");
        JSONObject jSONObject = new JSONObject(C0575b.g("https://pan.baidu.com/share/transfer?shareid=" + str + "&from=" + str2 + "&sekey=" + str3 + "&ondup=newcopy&async=1&channel=chunlei&web=1&app_id=250528", map, g()).a());
        int iOptInt = jSONObject.optInt("errno");
        if (iOptInt != 0 || (jSONObjectOptJSONObject = jSONObject.optJSONObject("extra")) == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("list")) == null || jSONArrayOptJSONArray.length() <= 0 || (jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(0)) == null) {
            SpiderDebug.log("转存失败, errno=" + iOptInt + ", err_msg=" + jSONObject.optString("err_msg"));
            return "";
        }
        String strOptString = jSONObjectOptJSONObject2.optString("to");
        this.to = strOptString;
        SpiderDebug.log("转存成功: " + strOptString);
        return strOptString;
    }

    public void verifyShare(String str, String str2) {
        JSONObject jSONObjectOptJSONObject;
        int length;
        JSONObject jSONObjectOptJSONObject2;
        try {
            String str3 = "https://pan.baidu.com/share/verify?t=" + System.currentTimeMillis() + "&surl=" + str + "&channel=chunlei&web=1&app_id=250528&bdstoken=";
            HashMap map = new HashMap();
            map.put("pwd", str2);
            JSONObject jSONObject = new JSONObject(C0575b.g(str3, map, g()).a());
            if (jSONObject.optInt("errno") != 0) {
                SpiderDebug.log("verify失败");
                return;
            }
            String strOptString = jSONObject.optString("randsk");
            String str4 = "https://pan.baidu.com/share/list?web=5&app_id=250528&desc=1&showempty=0&page=1&num=20&order=name&shorturl=" + str + "&root=1&view_mode=1&channel=chunlei&web=1&bdstoken=";
            HashMap map2 = new HashMap();
            Map<String, String> mapG = g();
            if (mapG != null) {
                map2.putAll(mapG);
            }
            map2.put("Cookie", "BDCLND=" + strOptString);
            JSONObject jSONObject2 = new JSONObject(C0575b.l(str4, map2));
            if (jSONObject2.optInt("errno") != 0) {
                SpiderDebug.log("list根目录失败");
                return;
            }
            String strValueOf = String.valueOf(jSONObject2.optLong("share_id"));
            String strValueOf2 = String.valueOf(jSONObject2.optLong("uk"));
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("list");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0 || (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) == null) {
                SpiderDebug.log("根目录为空");
                return;
            }
            String strOptString2 = jSONObjectOptJSONObject.optString("fs_id");
            String strOptString3 = jSONObjectOptJSONObject.optString("server_filename");
            this.randsk = strOptString;
            this.shareIdLong = strValueOf;
            this.uk = strValueOf2;
            StringBuilder sb = new StringBuilder();
            sb.append("https://pan.baidu.com/share/list?is_from_web=true&sekey=");
            sb.append(strOptString);
            sb.append("&uk=");
            sb.append(strValueOf2);
            sb.append("&shareid=");
            sb.append(strValueOf);
            sb.append("&order=name&desc=1&showempty=0&view_mode=1&web=1&page=1&num=100&dir=");
            sb.append(URLEncoder.encode("/sharelink" + strValueOf2 + "-" + strOptString2 + "/" + strOptString3));
            sb.append("&t=0.6675001943649936&channel=chunlei&web=1&app_id=250528&bdstoken=");
            String string = sb.toString();
            HashMap map3 = new HashMap();
            Map<String, String> mapG2 = g();
            if (mapG2 != null) {
                map3.putAll(mapG2);
            }
            map3.put("Cookie", "BDCLND=" + strOptString);
            JSONObject jSONObject3 = new JSONObject(C0575b.l(string, map3));
            if (jSONObject3.optInt("errno") != 0) {
                this.randomFsId = strOptString2;
                return;
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject3.optJSONArray("list");
            if (jSONArrayOptJSONArray2 == null || (length = jSONArrayOptJSONArray2.length()) <= 0 || (jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(new Random().nextInt(length))) == null) {
                this.randomFsId = strOptString2;
            } else {
                this.randomFsId = jSONObjectOptJSONObject2.optString("fs_id");
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final Map<String, String> w() {
        HashMap map = new HashMap();
        map.put("Referer", "https://pan.baidu.com");
        map.put("Cookie", a.a.j());
        map.put("User-Agent", "netdisk;12.11.9;V2238A;android-android;12;JSbridge4.4.0;jointBridge;1.1.0;");
        return map;
    }
}
