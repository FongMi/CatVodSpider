package com.github.catvod.spider.merge.FM.b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.FM.a.C0298a;
import com.github.catvod.spider.merge.FM.c.C0327e;
import com.github.catvod.spider.merge.FM.c.C0329g;
import com.github.catvod.spider.merge.FM.c.C0332j;
import com.github.catvod.spider.merge.FM.f.C0343a;
import com.github.catvod.spider.merge.FM.f.C0344b;
import com.github.catvod.spider.merge.FM.m.C0378c;
import com.github.catvod.spider.merge.FM.o.C0394j;
import com.github.catvod.spider.merge.FM.o.C0396l;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class x {
    private static Bitmap c;
    private static String d;
    private static String e = "/tvtmp";
    private String a;
    private Map<String, Map<String, String>> b = new HashMap();

    private C0327e<String> a(String str, boolean z) {
        C0327e<String> c0327e = new C0327e<>();
        c0327e.d(0);
        try {
            b(true);
            String str2 = "https://pan.baidu.com/share/transfer?shareid=" + m(this.a, C0298a.b(new byte[]{-89, -82, -67, -26, 124, 119, 28}, new byte[]{-44, -58, -36, -108, 25, 30, 120, 7})) + "&from=" + m(this.a, "uk") + "&sekey=" + m(this.a, "sekey") + "&ondup=newcopy&async=1&channel=chunlei&web=1&app_id=250528";
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            map.put("fsidlist", arrayList.toString());
            map.put("path", e);
            JSONObject jSONObject = new JSONObject(C0378c.h(str2, map, f()).a());
            if (jSONObject.optInt("errno") == 0) {
                String strOptString = jSONObject.optJSONObject("extra").optJSONArray("list").optJSONObject(0).optString("to");
                if (TextUtils.isEmpty(strOptString) && z) {
                    return a(str, false);
                }
                c0327e.e(strOptString);
            } else if (jSONObject.optInt("errno") == 2) {
                c0327e.f(jSONObject.optString("show_msg"));
                if (jSONObject.optString("show_msg").equals("文件已存在")) {
                    c0327e.f("不支持看自己的分享");
                }
                c0327e.d(2);
            } else {
                c0327e.d(jSONObject.optInt("errno"));
                c0327e.f(jSONObject.optString("show_msg"));
            }
        } catch (Exception e2) {
            c0327e.d(500);
            c0327e.f(e2.getMessage());
            SpiderDebug.log("copy err" + e2.getMessage());
        }
        return c0327e;
    }

    private boolean b(boolean z) {
        try {
            n();
            C0344b c0344bE = C0344b.e(C0378c.n("https://pan.baidu.com/api/list?clienttype=0&app_id=250528&web=1&dp-logid=&order=time&desc=1&dir=" + e + "&num=100&page=1", f()));
            ArrayList arrayList = new ArrayList();
            if (c0344bE.a() == 0) {
                Iterator<C0343a> it = c0344bE.b().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().c());
                }
            }
            if (!arrayList.isEmpty() && arrayList.size() >= 3) {
                HashMap map = new HashMap();
                map.put("filelist", new JSONArray((Collection) arrayList).toString());
                if (!TextUtils.isEmpty(new JSONObject(C0378c.h("https://pan.baidu.com/api/filemanager?async=2&onnest=fail&opera=delete&bdstoken=", map, f()).a()).optString("taskid")) || !z) {
                    return true;
                }
                try {
                    return b(false);
                } catch (Exception e2) {
                    e = e2;
                    v.c(new byte[]{80, 63, -89, 83, -56, 97, -94, -60, 70, 40, -15, 22}, new byte[]{52, 90, -53, 54, -68, 4, -126, -95}, new StringBuilder(), e);
                    return false;
                }
            }
            return true;
        } catch (Exception e3) {
            e = e3;
        }
    }

    private void c(String str, String str2, String str3, String str4, List<C0343a> list, String str5) {
        try {
            String str6 = "https://pan.baidu.com/share/list?is_from_web=true&sekey=" + str + "&uk=" + str2 + "&shareid=" + str3 + "&order=other&desc=1&showempty=0&view_mode=1&web=1&page=1&num=100&dir=" + URLEncoder.encode(str4) + "&t=0.6675001943649936&channel=chunlei&web=1&app_id=250528&bdstoken=";
            Map<String, String> mapF = f();
            ((HashMap) mapF).put(C0298a.b(new byte[]{-76, 53, 96, 66, 109, 25}, new byte[]{-9, 90, 15, 41, 4, 124, 17, 75}), "BDCLND=" + str);
            C0344b c0344bE = C0344b.e(C0378c.n(str6, mapF));
            if (c0344bE.a() == 0) {
                List<C0343a> listB = c0344bE.b();
                ArrayList arrayList = new ArrayList();
                for (int size = listB.size() - 1; size >= 0; size--) {
                    C0343a c0343a = listB.get(size);
                    if (c0343a.g()) {
                        c0343a.j(str5);
                        list.add(c0343a);
                    } else if (c0343a.b() == 1) {
                        arrayList.add(c0343a);
                    }
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    c(str, str2, str3, listB.get(size2).c(), list, "");
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static x e() {
        return w.a;
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
                    return z ? string.isEmpty() ? "/" : string : string;
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
            JSONObject jSONObject = new JSONObject(C0378c.n("https://passport.baidu.com/v2/api/getqrcode?lp=pc&qrloginfrom=pc", map));
            SpiderDebug.log(jSONObject.toString());
            String str = "https://" + jSONObject.optString("imgurl") + "&logPage=traceId%3Apc_loginv5_1742970205%2ClogPage%3Aloginv5";
            d = jSONObject.optString("sign");
            byte[] bArrBytes = C0378c.d(str).body().bytes();
            c = BitmapFactory.decodeByteArray(bArrBytes, 0, bArrBytes.length);
            return !TextUtils.isEmpty(d);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>] */
    private String m(String str, String str2) {
        try {
            return (String) ((Map) this.b.get(str)).get(str2);
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    private C0343a n() {
        try {
            C0344b c0344bE = C0344b.e(C0378c.n("https://pan.baidu.com/api/list?clienttype=0&app_id=250528&web=1&dp-logid=&order=time&desc=1&dir=%2F&num=100&page=1", f()));
            if (c0344bE.a() == 0) {
                for (C0343a c0343a : c0344bE.b()) {
                    if (c0343a.c().equals(e)) {
                        return c0343a;
                    }
                }
            }
            String str = "https://pan.baidu.com/api/create?a=commit&bdstoken=" + new JSONObject(C0378c.n("https://pan.baidu.com/api/gettemplatevariable?clienttype=0&app_id=250528&web=1&fields=[\"bdstoken\",\"token\",\"uk\",\"isdocuser\",\"servertime\"]", f())).optJSONObject("result").optString("bdstoken") + "&clienttype=0&app_id=250528&web=1&dp-logid=";
            HashMap map = new HashMap();
            map.put("path", e);
            map.put("isdir", "1");
            map.put("block_list", "[]");
            JSONObject jSONObject = new JSONObject(C0378c.h(str, map, f()).a());
            C0343a c0343a2 = new C0343a();
            c0343a2.h(jSONObject.optLong("fs_id"));
            c0343a2.i(e);
            return c0343a2;
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
            JSONObject jSONObject = new JSONObject(C0378c.n(str, map));
            SpiderDebug.log(jSONObject.toString());
            if (jSONObject.optInt("errno") == 0) {
                JSONObject jSONObject2 = new JSONObject(jSONObject.optString("channel_v"));
                SpiderDebug.log(jSONObject2.toString());
                if (jSONObject2.optInt("status") == 0) {
                    String str2 = "https://passport.baidu.com/v3/login/main/qrbdusslogin?v=" + System.currentTimeMillis() + "&bduss=" + jSONObject2.optString("v");
                    new HashMap();
                    String str3 = "";
                    String str4 = "";
                    for (String str5 : C0378c.b(str2, map).c().get("set-cookie")) {
                        str4 = TextUtils.isEmpty(str4) ? str5.split(";")[0] : str4 + ";" + str5.split(";")[0];
                        if (str5.contains("BDUSS=")) {
                            str3 = str5.split(";")[0];
                        }
                    }
                    SpiderDebug.log("tempCookies: " + str4);
                    map.put("Cookie", str4);
                    Iterator<String> it = C0378c.l(C0378c.f(), C0378c.c(C0378c.c("https://pan.baidu.com/disk/main?from=homeFlow", map), map), new HashMap(), map).c().get("set-cookie").iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String next = it.next();
                        if (next.contains("STOKEN=")) {
                            str3 = str3 + ";" + next.split(";")[0];
                            break;
                        }
                    }
                    com.github.catvod.spider.merge.FM.o.z.s(".baidu", str3);
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public final void d(String str, String str2, List<C0343a> list) {
        int i;
        try {
            String strL = l(str, str2);
            if (TextUtils.isEmpty(strL)) {
                return;
            }
            char c2 = 5;
            char c3 = 0;
            int i2 = 8;
            char c4 = 6;
            int i3 = 7;
            r(str, "sekey", strL);
            Map<String, String> mapF = f();
            ((HashMap) mapF).put("Cookie", "BDCLND=" + strL);
            C0344b c0344bE = C0344b.e(C0378c.n("https://pan.baidu.com/share/list?web=5&app_id=250528&desc=1&showempty=0&page=1&num=20&order=time&shorturl=" + str + "&root=1&view_mode=1&channel=chunlei&web=1&bdstoken=", mapF));
            if (c0344bE.a() != 0) {
                C0394j.b("");
                return;
            }
            r(str, "shareid", c0344bE.c());
            r(str, "uk", c0344bE.d());
            List<C0343a> listB = c0344bE.b();
            int size = listB.size() - 1;
            while (size >= 0) {
                C0343a c0343a = listB.get(size);
                if (c0343a.g()) {
                    list.add(c0343a);
                }
                if (c0343a.b() == 1) {
                    byte[] bArr = new byte[2];
                    bArr[c3] = 98;
                    bArr[1] = 112;
                    byte[] bArr2 = new byte[i2];
                    bArr2[c3] = 23;
                    bArr2[1] = 27;
                    bArr2[2] = -52;
                    bArr2[3] = 46;
                    bArr2[4] = 15;
                    bArr2[c2] = -24;
                    bArr2[c4] = -92;
                    bArr2[i3] = -73;
                    String strM = m(str, C0298a.b(bArr, bArr2));
                    byte[] bArr3 = new byte[i3];
                    bArr3[c3] = -128;
                    bArr3[1] = -24;
                    bArr3[2] = -65;
                    bArr3[3] = 3;
                    bArr3[4] = 59;
                    bArr3[c2] = -100;
                    bArr3[c4] = -96;
                    byte[] bArr4 = new byte[i2];
                    bArr4[c3] = -13;
                    bArr4[1] = -128;
                    bArr4[2] = -34;
                    bArr4[3] = 113;
                    bArr4[4] = 94;
                    bArr4[c2] = -11;
                    bArr4[c4] = -60;
                    bArr4[7] = -67;
                    String strM2 = m(str, C0298a.b(bArr3, bArr4));
                    StringBuilder sb = new StringBuilder();
                    byte[] bArr5 = new byte[10];
                    bArr5[c3] = -85;
                    bArr5[1] = -79;
                    bArr5[2] = 57;
                    bArr5[3] = -70;
                    bArr5[4] = 45;
                    bArr5[c2] = -89;
                    bArr5[c4] = 113;
                    bArr5[7] = -99;
                    bArr5[8] = -22;
                    bArr5[9] = -87;
                    byte[] bArr6 = new byte[8];
                    bArr6[c3] = -124;
                    bArr6[1] = -62;
                    bArr6[2] = 81;
                    bArr6[3] = -37;
                    bArr6[4] = 95;
                    bArr6[5] = -62;
                    bArr6[6] = 29;
                    bArr6[7] = -12;
                    sb.append(C0298a.b(bArr5, bArr6));
                    sb.append(strM2);
                    byte[] bArr7 = new byte[1];
                    bArr7[c3] = -73;
                    byte[] bArr8 = new byte[8];
                    bArr8[c3] = -102;
                    bArr8[1] = 85;
                    bArr8[2] = -106;
                    bArr8[3] = 71;
                    bArr8[4] = -86;
                    bArr8[5] = -6;
                    bArr8[6] = 6;
                    bArr8[7] = -31;
                    sb.append(C0298a.b(bArr7, bArr8));
                    sb.append(c0343a.a());
                    sb.append("/");
                    sb.append(c0343a.e());
                    i = size;
                    c(strL, strM, strM2, sb.toString(), list, c0343a.e());
                } else {
                    i = size;
                }
                size = i - 1;
                i3 = 7;
                i2 = 8;
                c2 = 5;
                c3 = 0;
                c4 = 6;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final String g() {
        return com.github.catvod.spider.merge.FM.o.z.o("baidu.txt");
    }

    public final C0327e<String> h(String str) {
        C0327e<String> c0327e = new C0327e<>();
        try {
            c0327e = a(str, true);
        } catch (Exception e2) {
            c0327e.d(500);
            c0327e.e(e2.getMessage());
        }
        if (c0327e.a() == 0 && !com.github.catvod.spider.merge.FM.C.h.c(c0327e.b())) {
            String strB = c0327e.b();
            SpiderDebug.log("getDownLoadUrl copy res: " + strB);
            String str2 = "https://pan.baidu.com/api/mediainfo?type=M3U8_FLV_264_480&path=" + URLEncoder.encode(strB) + "&clienttype=80&origin=dlna";
            HashMap map = new HashMap();
            map.put("User-Agent", "netdisk;1.4.2;22021211RC;android-android;12;JSbridge4.4.0;jointBridge;1.1.0;");
            map.put("Cookie", g());
            JSONObject jSONObject = new JSONObject(C0378c.n(str2, map));
            String strOptString = jSONObject.optJSONObject("info").optString("dlink");
            SpiderDebug.log("getDownLoadUrl dlink res: " + strOptString);
            if (TextUtils.isEmpty(strOptString)) {
                c0327e.d(jSONObject.optInt("errno"));
                c0327e.e("dlink 为空");
            }
            c0327e.e(C0378c.c(strOptString, map));
            return c0327e;
        }
        return c0327e;
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
            jSONObject = new JSONObject(C0378c.h(str3, map, f()).a());
        } catch (Exception unused) {
        }
        if (jSONObject.optInt("errno") == 0) {
            return jSONObject.optString("randsk");
        }
        jSONObject.optInt("err_msg");
        C0394j.b("");
        return "";
    }

    public final C0332j o(String str, String str2, String str3) {
        ArrayList arrayList;
        char c2;
        List listAsList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Iterator it;
        C0332j c0332j = new C0332j();
        try {
            arrayList = new ArrayList();
            d(str, str2, arrayList);
            c2 = 3;
            listAsList = Arrays.asList("百度原画");
            arrayList2 = new ArrayList();
            arrayList3 = new ArrayList();
            it = arrayList.iterator();
        } catch (Exception unused) {
        }
        while (true) {
            String string = "";
            if (!it.hasNext()) {
                break;
            }
            C0343a c0343a = (C0343a) it.next();
            if (!TextUtils.isEmpty(c0343a.d())) {
                StringBuilder sb = new StringBuilder();
                byte[] bArr = new byte[8];
                bArr[0] = 41;
                bArr[1] = -64;
                bArr[2] = -84;
                bArr[c2] = -82;
                bArr[4] = 48;
                bArr[5] = 123;
                bArr[6] = 0;
                bArr[7] = -106;
                sb.append(C0298a.b(new byte[]{114}, bArr));
                sb.append(c0343a.d().trim());
                byte[] bArr2 = new byte[8];
                bArr2[0] = 46;
                bArr2[1] = -34;
                bArr2[2] = -16;
                bArr2[c2] = 31;
                bArr2[4] = -83;
                bArr2[5] = -49;
                bArr2[6] = 59;
                bArr2[7] = 45;
                sb.append(C0298a.b(new byte[]{115}, bArr2));
                string = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(c0343a.e());
            sb2.append(c0343a.f());
            byte[] bArr3 = new byte[8];
            bArr3[0] = -88;
            bArr3[1] = -102;
            bArr3[2] = 15;
            bArr3[c2] = -71;
            bArr3[4] = -105;
            bArr3[5] = 99;
            bArr3[6] = 119;
            bArr3[7] = 80;
            sb2.append(C0298a.b(new byte[]{-116}, bArr3));
            sb2.append(str);
            byte[] bArr4 = new byte[8];
            bArr4[0] = -47;
            bArr4[1] = -99;
            bArr4[2] = 116;
            bArr4[c2] = -50;
            bArr4[4] = -1;
            bArr4[5] = -51;
            bArr4[6] = -94;
            bArr4[7] = 75;
            sb2.append(C0298a.b(new byte[]{-6}, bArr4));
            sb2.append(c0343a.a());
            String string2 = sb2.toString();
            if (!TextUtils.isEmpty(str3) && !str3.contains("http")) {
                string2 = string2 + Marker.ANY_NON_NULL_MARKER + str3 + Marker.ANY_NON_NULL_MARKER + c0343a.e();
            }
            arrayList2.add(string2);
            c2 = 3;
            return c0332j;
        }
        byte b = 16;
        if (arrayList2.isEmpty()) {
            arrayList2.add("分享链接解析失败$0");
        }
        int i = 0;
        while (i < listAsList.size()) {
            arrayList3.add(TextUtils.join(C0298a.b(new byte[]{b}, new byte[]{51, 50, -91, 112, 82, -38, -23, -28}), arrayList2));
            i++;
            b = 16;
        }
        c0332j.g(str);
        c0332j.e(str);
        c0332j.i("");
        c0332j.h(i(((C0343a) arrayList.get(0)).c()));
        c0332j.k(TextUtils.join("$$$", arrayList3));
        c0332j.j(TextUtils.join("$$$", listAsList));
        return c0332j;
    }

    public final boolean p() {
        return !TextUtils.isEmpty(com.github.catvod.spider.merge.FM.o.z.o("baidu.txt"));
    }

    public final String q(String[] strArr) {
        try {
            if (!p()) {
                C0394j.b("还未登录百度账号,请前往【配置中心】登录");
                return C0329g.n("还未登录百度账号,请前往【配置中心】登录");
            }
            this.a = strArr[0];
            C0327e<String> c0327eH = h(strArr[1]);
            if (c0327eH.a() != 0) {
                return C0329g.n(c0327eH.c());
            }
            String strB = c0327eH.b();
            SpiderDebug.log("downloadUrl: " + strB);
            Map<String, String> mapF = f();
            ((HashMap) mapF).put("User-Agent", "netdisk;1.4.2;22021211RC;android-android;12;JSbridge4.4.0;jointBridge;1.1.0;");
            if (C0396l.b(1).booleanValue()) {
                String strC = C0396l.c(strB, 10, 500);
                if (strArr.length <= 3) {
                    C0329g c0329gE = C0329g.e();
                    c0329gE.x(strC);
                    c0329gE.j();
                    c0329gE.f(mapF);
                    return c0329gE.o();
                }
                String str = Proxy.getUrl() + "?do=appdanmu&vodName=" + strArr[2] + "&vodIndex=" + strArr[3] + "&vodUrl=";
                C0329g c0329gE2 = C0329g.e();
                c0329gE2.x(strC);
                c0329gE2.a(str);
                c0329gE2.j();
                c0329gE2.f(mapF);
                return c0329gE2.o();
            }
            if (TextUtils.isEmpty(C0396l.f())) {
                return "";
            }
            if (strArr.length <= 2) {
                C0329g c0329gE3 = C0329g.e();
                c0329gE3.x(C0396l.d(strB));
                c0329gE3.j();
                c0329gE3.f(mapF);
                return c0329gE3.o();
            }
            String str2 = Proxy.getUrl() + "?do=appdanmu&vodName=" + strArr[1] + "&vodIndex=" + strArr[2] + "&vodUrl=";
            C0329g c0329gE4 = C0329g.e();
            c0329gE4.x(C0396l.d(strB));
            c0329gE4.a(str2);
            c0329gE4.j();
            c0329gE4.f(mapF);
            return c0329gE4.o();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }
}
