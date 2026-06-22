package com.github.catvod.spider.merge.I;

import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.google.gson.Gson;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0 {
    private static final String[] g = {"QG3/GhopO+5+T", "1Sv94+ANND3lDmmw", "q2eTxRva8b3B5d", "m2", "VIc5CZRBMU71ENfbOh0+RgWIuzLy", "66M8Wpw6nkBEekOtL6e", "N0rucK7S8W/vrRkfPto5urIJJS8dVY0S", "oLAR7pdUVUAp9xcuHWzrU057aUhdCJrt", "6lxcykBSsfI//GR9", "r50cz+1I4gbU/fk8", "tdwzrTc4SNFC4marNGTgf05flC85A", "qvNVUDFjfsOMqvdi2gB8gCvtaJAIqxXs"};
    private static final Pattern h = Pattern.compile("https?://pan\\.xunlei\\.com/s/([^?#]+)(?:\\?[^#]*?pwd=([^&#]+))?(?:#.*)?", 2);
    public static final /* synthetic */ int i = 0;
    private String a = "";
    private String b = "";
    private String c = "";
    private String d = "";
    private int e = 0;
    public com.github.catvod.spider.merge.W.a f;

    public C0() {
        try {
            com.github.catvod.spider.merge.W.a aVar = (com.github.catvod.spider.merge.W.a) new Gson().fromJson(com.github.catvod.spider.merge.g.b.d(com.github.catvod.spider.merge.g.b.f("xunlei_user")), com.github.catvod.spider.merge.W.a.class);
            this.f = aVar == null ? new com.github.catvod.spider.merge.W.a() : aVar;
        } catch (Exception unused) {
            this.f = new com.github.catvod.spider.merge.W.a();
        }
    }

    private static String a() {
        try {
            String strC = y0.a.f.c();
            if (TextUtils.isEmpty(strC)) {
                return "";
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("client_id", "Xqp0kJBXWhwaTpB6");
            jSONObject.put("code_verifier", "b12YwMsrYLy2hwAOuJKBEgPHNSz1loku");
            jSONObject.put("grant_type", "authorization_code");
            jSONObject.put("code", strC);
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36");
            map.put("Content-Type", "application/json");
            map.put("accept-language", "zh-cn");
            map.put("x-client-id", "Xqp0kJBXWhwaTpB6");
            map.put("x-device-id", "925b7631473a13716b791d7f28289cad");
            com.github.catvod.spider.merge.f0.i iVarF = com.github.catvod.spider.merge.f0.d.f("https://xluser-ssl.xunlei.com/v1/auth/token", jSONObject.toString(), map);
            if (iVarF.b() != 200) {
                SpiderDebug.log("刷新 token 失败: " + iVarF.b() + " " + iVarF.a());
                return "";
            }
            JSONObject jSONObject2 = new JSONObject(iVarF.a());
            if (jSONObject2.has("refresh_token")) {
                y0.a.f.j(jSONObject2.optString("refresh_token", ""));
            }
            String strOptString = jSONObject2.optString("user_id", "");
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = jSONObject2.optString("sub", "");
            }
            if (!TextUtils.isEmpty(strOptString)) {
                y0.a.f.k(strOptString);
            }
            String strOptString2 = jSONObject2.optString("access_token", "");
            if (TextUtils.isEmpty(strOptString2)) {
                return "";
            }
            return "Bearer " + strOptString2;
        } catch (Exception e) {
            com.github.catvod.spider.merge.A.c.e(e, t0.b("刷新 token 异常: "));
            return "";
        }
    }

    private static void b(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("client_id", "Xqp0kJBXWhwaTpB6");
            jSONObject.put("response_type", "code");
            jSONObject.put("redirect_uri", "https://pan.xunlei.com/login/?sso_sign_in_in_iframe=&path=%2F");
            jSONObject.put("scope", "profile offline pan sso user");
            jSONObject.put("state", "state-kekfg9mh2qn");
            jSONObject.put("code_challenge", "xPsZzzstCvNRl_jItS5Zv5bh75GEaiuOsSHCeAgOZh0");
            jSONObject.put("code_challenge_method", "S256");
            jSONObject.put("sign_out_uri", "https://pan.xunlei.com/login/?sso_sign_out=");
            HashMap map = new HashMap();
            map.put("authorization", str);
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36");
            map.put("Content-Type", "application/json");
            map.put("accept-language", "zh-cn");
            map.put("x-client-id", "Xqp0kJBXWhwaTpB6");
            map.put("x-device-id", "925b7631473a13716b791d7f28289cad");
            com.github.catvod.spider.merge.f0.i iVarF = com.github.catvod.spider.merge.f0.d.f("https://xluser-ssl.xunlei.com/v1/user/authorize", jSONObject.toString(), map);
            if (iVarF.b() != 200) {
                SpiderDebug.log("刷新 authorize 失败: " + iVarF.b() + " " + iVarF.a());
            }
            JSONObject jSONObject2 = new JSONObject(iVarF.a());
            if (jSONObject2.has("code")) {
                y0.a.f.i(jSONObject2.optString("code", ""));
            }
        } catch (Exception e) {
            com.github.catvod.spider.merge.A.c.e(e, t0.b("刷新 token 异常: "));
        }
    }

    private void c() throws JSONException {
        Object obj;
        Object obj2;
        JSONObject jSONObjectOptJSONObject;
        String strI = i();
        String strH = h();
        HashMap mapB = com.github.catvod.spider.merge.B.e.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36", "accept-language", "zh,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,zh-CN;q=0.6");
        mapB.put("authorization", strI);
        mapB.put("content-type", "application/json");
        mapB.put("x-captcha-token", strH);
        mapB.put("x-client-id", "Xqp0kJBXWhwaTpB6");
        mapB.put("x-device-id", "925b7631473a13716b791d7f28289cad");
        String strM = com.github.catvod.spider.merge.f0.d.m("https://api-pan.xunlei.com/drive/v1/files?parent_id=&filters=%7B%22phase%22%3A%7B%22eq%22%3A%22PHASE_TYPE_COMPLETE%22%7D%2C%22trashed%22%3A%7B%22eq%22%3Afalse%7D%7D&with_audit=true&thumbnail_size=SIZE_SMALL&limit=50", mapB, null);
        if (strM != null && !strM.isEmpty()) {
            obj2 = "925b7631473a13716b791d7f28289cad";
            JSONArray jSONArrayOptJSONArray = new JSONObject(strM).optJSONArray("files");
            if (jSONArrayOptJSONArray != null) {
                int i2 = 0;
                obj = "x-client-id";
                while (true) {
                    if (i2 >= jSONArrayOptJSONArray.length()) {
                        break;
                    }
                    JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i2);
                    JSONArray jSONArray = jSONArrayOptJSONArray;
                    if ("ds".equals(jSONObject.optString("name", ""))) {
                        this.d = jSONObject.optString("id", "");
                        break;
                    } else {
                        i2++;
                        jSONArrayOptJSONArray = jSONArray;
                    }
                }
            } else {
                obj = "x-client-id";
            }
        } else {
            obj = "x-client-id";
            obj2 = "925b7631473a13716b791d7f28289cad";
        }
        if (TextUtils.isEmpty(this.d)) {
            String strI2 = i();
            String strH2 = h();
            HashMap mapB2 = com.github.catvod.spider.merge.B.e.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36", "Content-Type", "application/json");
            mapB2.put("accept-language", "zh,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,zh-CN;q=0.6");
            mapB2.put("authorization", strI2);
            mapB2.put("x-captcha-token", strH2);
            mapB2.put(obj, "Xqp0kJBXWhwaTpB6");
            mapB2.put("x-device-id", obj2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("parent_id", "");
            jSONObject2.put("name", "ds");
            jSONObject2.put("kind", "drive#folder");
            jSONObject2.put("space", "");
            com.github.catvod.spider.merge.f0.i iVarF = com.github.catvod.spider.merge.f0.d.f("https://api-pan.xunlei.com/drive/v1/files", jSONObject2.toString(), mapB2);
            if (iVarF.b() != 200 || (jSONObjectOptJSONObject = new JSONObject(iVarF.a()).optJSONObject("file")) == null) {
                return;
            }
            this.d = jSONObjectOptJSONObject.optString("id", "");
        }
    }

    private List e(String str, String str2) throws JSONException {
        JSONArray jSONArrayOptJSONArray;
        String strJ = j("/drive/v1/share", "GET");
        HashMap mapB = com.github.catvod.spider.merge.B.e.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36", "accept-language", "zh-CN,zh;q=0.9");
        mapB.put("x-captcha-token", strJ);
        mapB.put("x-client-id", "Xqp0kJBXWhwaTpB6");
        mapB.put("x-device-id", "925b7631473a13716b791d7f28289cad");
        String strM = com.github.catvod.spider.merge.f0.d.m("https://api-pan.xunlei.com/drive/v1/share/detail?share_id=" + str + "&parent_id=" + str2 + "&pass_code_token=" + URLEncoder.encode(this.c, "UTF-8") + "&limit=100&page_token=&thumbnail_size=SIZE_SMALL", mapB, null);
        ArrayList arrayList = new ArrayList();
        if (strM == null || strM.isEmpty() || (jSONArrayOptJSONArray = new JSONObject(strM).optJSONArray("files")) == null) {
            return arrayList;
        }
        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
            JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i2);
            A0 a0 = new A0(null);
            a0.a = jSONObject.optString("id", "");
            a0.b = jSONObject.optString("name", "");
            jSONObject.optString("parent_id", "");
            a0.c = jSONObject.optLong("size", 0L);
            a0.d = TextUtils.isEmpty(jSONObject.optString("mime_type", ""));
            arrayList.add(a0);
        }
        return arrayList;
    }

    private List f(String str, String str2) throws JSONException {
        String strJ = j("/drive/v1/share", "GET");
        HashMap mapB = com.github.catvod.spider.merge.B.e.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36", "accept-language", "zh-CN,zh;q=0.9");
        mapB.put("x-captcha-token", strJ);
        mapB.put("x-client-id", "Xqp0kJBXWhwaTpB6");
        mapB.put("x-device-id", "925b7631473a13716b791d7f28289cad");
        String strM = com.github.catvod.spider.merge.f0.d.m("https://api-pan.xunlei.com/drive/v1/share?share_id=" + str + "&pass_code=" + str2 + "&limit=100&pass_code_token=" + (TextUtils.isEmpty(this.c) ? "" : URLEncoder.encode(this.c, "UTF-8")) + "&page_token=&thumbnail_size=SIZE_SMALL", mapB, null);
        ArrayList arrayList = new ArrayList();
        if (strM != null && !strM.isEmpty()) {
            JSONObject jSONObject = new JSONObject(strM);
            if (jSONObject.has("pass_code_token")) {
                this.c = jSONObject.optString("pass_code_token", "");
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("files");
            if (jSONArrayOptJSONArray == null) {
                return arrayList;
            }
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i2);
                A0 a0 = new A0(null);
                a0.a = jSONObject2.optString("id", "");
                a0.b = jSONObject2.optString("name", "");
                jSONObject2.optString("parent_id", "");
                a0.c = jSONObject2.optLong("size", 0L);
                a0.d = TextUtils.isEmpty(jSONObject2.optString("mime_type", ""));
                arrayList.add(a0);
            }
        }
        return arrayList;
    }

    public static C0 g() {
        return y0.a;
    }

    private String h() {
        return j("/drive/v1/files", "GET");
    }

    public static String i() {
        try {
            String strB = y0.a.f.b();
            if (!TextUtils.isEmpty(strB) && q(strB)) {
                return strB;
            }
            String strR = r();
            b(strR);
            if (TextUtils.isEmpty(strR)) {
                return "";
            }
            y0.a.f.h(a());
            y0.a.f.g();
            return strR;
        } catch (Exception e) {
            com.github.catvod.spider.merge.A.c.e(e, t0.b("获取迅雷认证失败: "));
            return "";
        }
    }

    private String j(String str, String str2) throws JSONException {
        String str3;
        String strValueOf = String.valueOf(System.currentTimeMillis());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("client_id", "Xqp0kJBXWhwaTpB6");
        jSONObject.put("action", str2 + ":" + str);
        jSONObject.put("device_id", "925b7631473a13716b791d7f28289cad");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("username", "");
        jSONObject2.put("phone_number", "");
        jSONObject2.put("email", "");
        jSONObject2.put("package_name", "pan.xunlei.com");
        jSONObject2.put("client_version", "1.92.9");
        try {
            String strT = "Xqp0kJBXWhwaTpB61.92.9pan.xunlei.com925b7631473a13716b791d7f28289cad" + strValueOf;
            String[] strArr = g;
            for (int i2 = 0; i2 < 12; i2++) {
                strT = t(strT + strArr[i2]);
            }
            str3 = "1." + strT;
        } catch (Exception unused) {
            str3 = "";
        }
        jSONObject2.put("captcha_sign", str3);
        jSONObject2.put("timestamp", strValueOf);
        jSONObject2.put("user_id", y0.a.f.d());
        jSONObject.put("meta", jSONObject2);
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36");
        map.put("Content-Type", "application/json");
        map.put("X-Client-Id", "Xqp0kJBXWhwaTpB6");
        map.put("X-Device-Id", "925b7631473a13716b791d7f28289cad");
        com.github.catvod.spider.merge.f0.i iVarF = com.github.catvod.spider.merge.f0.d.f("https://xluser-ssl.xunlei.com/v1/shield/captcha/init", jSONObject.toString(), map);
        if (iVarF.b() == 200) {
            return new JSONObject(iVarF.a()).optString("captcha_token", "");
        }
        StringBuilder sbB = t0.b("captcha 请求失败: ");
        sbB.append(iVarF.b());
        sbB.append(" ");
        sbB.append(iVarF.a());
        SpiderDebug.log(sbB.toString());
        return "";
    }

    private static String l(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("client_id", "XW5SkOhLDjnOZP7J");
            jSONObject.put("action", "POST:/v1/auth/signin");
            jSONObject.put("device_id", "925b7631473a13716b791d7f28289cad");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phone_number", "+86" + str);
            jSONObject.put("meta", jSONObject2);
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36");
            map.put("Content-Type", "application/json");
            map.put("X-Client-Id", "XW5SkOhLDjnOZP7J");
            map.put("X-Device-Id", "925b7631473a13716b791d7f28289cad");
            com.github.catvod.spider.merge.f0.i iVarF = com.github.catvod.spider.merge.f0.d.f("https://xluser-ssl.xunlei.com/v1/shield/captcha/init", jSONObject.toString(), map);
            if (iVarF.b() == 200) {
                return new JSONObject(iVarF.a()).optString("captcha_token", "");
            }
            SpiderDebug.log("登录验证码请求失败: " + iVarF.b() + " " + iVarF.a());
            return "";
        } catch (Exception e) {
            com.github.catvod.spider.merge.A.c.e(e, t0.b("获取登录验证码异常: "));
            return "";
        }
    }

    private String p() throws JSONException {
        JSONArray jSONArrayOptJSONArray;
        String strI = i();
        String strJ = j("/drive/v1/files", "GET");
        HashMap mapB = com.github.catvod.spider.merge.B.e.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36", "accept-language", "zh,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,zh-CN;q=0.6");
        mapB.put("authorization", strI);
        mapB.put("content-type", "application/json");
        mapB.put("x-captcha-token", strJ);
        mapB.put("x-client-id", "Xqp0kJBXWhwaTpB6");
        mapB.put("x-device-id", "925b7631473a13716b791d7f28289cad");
        String strM = com.github.catvod.spider.merge.f0.d.m("https://api-pan.xunlei.com/drive/v1/files?parent_id=" + this.d + "&filters=%7B%22phase%22%3A%7B%22eq%22%3A%22PHASE_TYPE_COMPLETE%22%7D%2C%22trashed%22%3A%7B%22eq%22%3Afalse%7D%7D&with_audit=true&thumbnail_size=SIZE_SMALL&limit=50", mapB, null);
        return (strM == null || strM.isEmpty() || (jSONArrayOptJSONArray = new JSONObject(strM).optJSONArray("files")) == null || jSONArrayOptJSONArray.length() <= 0) ? "" : jSONArrayOptJSONArray.getJSONObject(0).optString("id", "");
    }

    private static boolean q(String str) {
        try {
            if (str.startsWith("Bearer ")) {
                str = str.substring(7);
            }
            String[] strArrSplit = str.split("\\.");
            if (strArrSplit.length > 1) {
                return new JSONObject(new String(Base64.decode(strArrSplit[1], 0))).getLong("exp") > System.currentTimeMillis() / 1000;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private static String r() {
        try {
            String strE = y0.a.f.e();
            String strF = y0.a.f.f();
            if (!TextUtils.isEmpty(strE) && !TextUtils.isEmpty(strF)) {
                return s(strE, strF);
            }
            return "";
        } catch (Exception e) {
            com.github.catvod.spider.merge.A.c.e(e, t0.b("迅雷登录失败: "));
            return "";
        }
    }

    private static String s(String str, String str2) {
        try {
            String strL = l(str);
            if (TextUtils.isEmpty(strL)) {
                SpiderDebug.log("获取登录验证码失败");
                return "";
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("client_id", "XW5SkOhLDjnOZP7J");
            jSONObject.put("client_secret", "Og9Vr1L8Ee6bh0olFxFDRg");
            jSONObject.put("password", str2);
            jSONObject.put("username", "+86 " + str);
            jSONObject.put("captcha_token", strL);
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36");
            map.put("Content-Type", "application/json");
            map.put("X-Client-Id", "XW5SkOhLDjnOZP7J");
            map.put("X-Device-Id", "925b7631473a13716b791d7f28289cad");
            com.github.catvod.spider.merge.f0.i iVarF = com.github.catvod.spider.merge.f0.d.f("https://xluser-ssl.xunlei.com/v1/auth/signin", jSONObject.toString(), map);
            if (iVarF.b() != 200) {
                SpiderDebug.log("登录失败: " + iVarF.b() + " " + iVarF.a());
                return "";
            }
            JSONObject jSONObject2 = new JSONObject(iVarF.a());
            String strOptString = jSONObject2.optString("access_token", "");
            if (TextUtils.isEmpty(strOptString)) {
                SpiderDebug.log("登录响应中没有 access_token: " + jSONObject2.toString());
                return "";
            }
            String strOptString2 = jSONObject2.optString("user_id", "");
            if (TextUtils.isEmpty(strOptString2)) {
                strOptString2 = jSONObject2.optString("sub", "");
            }
            if (!TextUtils.isEmpty(strOptString2)) {
                y0.a.f.k(strOptString2);
            }
            if (jSONObject2.has("refresh_token")) {
                y0.a.f.j(jSONObject2.optString("refresh_token", ""));
            }
            return "Bearer " + strOptString;
        } catch (Exception e) {
            com.github.catvod.spider.merge.A.c.e(e, t0.b("账号密码登录失败: "));
            return "";
        }
    }

    private static String t(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(String.format("%02x", Integer.valueOf(b & 255)));
            }
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    private String u(String str, String str2, String str3) throws JSONException, InterruptedException {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONArray jSONArrayNames;
        String strI = i();
        String strJ = j("/drive/v1/share/restore", "POST");
        HashMap mapB = com.github.catvod.spider.merge.B.e.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36", "Content-Type", "application/json");
        mapB.put("accept-language", "zh,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,zh-CN;q=0.6");
        mapB.put("authorization", y0.a.f.b());
        mapB.put("x-captcha-token", strJ);
        mapB.put("x-client-id", "Xqp0kJBXWhwaTpB6");
        mapB.put("x-device-id", "925b7631473a13716b791d7f28289cad");
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("parent_id", this.d);
        jSONObject3.put("share_id", str2);
        jSONObject3.put("pass_code_token", str3);
        jSONObject3.put("ancestor_ids", new JSONArray());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject3.put("file_ids", jSONArray);
        jSONObject3.put("specify_parent_id", true);
        com.github.catvod.spider.merge.f0.i iVarF = com.github.catvod.spider.merge.f0.d.f("https://api-pan.xunlei.com/drive/v1/share/restore", jSONObject3.toString(), mapB);
        String strOptString = "";
        if (iVarF.b() != 200) {
            int i2 = this.e;
            if (i2 >= 3) {
                return "";
            }
            this.e = i2 + 1;
            Thread.sleep(5000L);
            return u(str, str2, str3);
        }
        String strOptString2 = new JSONObject(iVarF.a()).optString("restore_task_id", "");
        if (TextUtils.isEmpty(strOptString2)) {
            return p();
        }
        int i3 = 0;
        this.e = 0;
        while (true) {
            if (i3 >= 20) {
                jSONObject = null;
                break;
            }
            HashMap mapB2 = com.github.catvod.spider.merge.B.e.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36", "accept-language", "zh,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,zh-CN;q=0.6");
            mapB2.put("authorization", strI);
            mapB2.put("x-captcha-token", strJ);
            mapB2.put("x-client-id", "Xqp0kJBXWhwaTpB6");
            String str4 = strI;
            mapB2.put("x-device-id", "925b7631473a13716b791d7f28289cad");
            String strM = com.github.catvod.spider.merge.f0.d.m("https://api-pan.xunlei.com/drive/v1/tasks/" + strOptString2, mapB2, null);
            jSONObject = TextUtils.isEmpty(strM) ? null : new JSONObject(strM);
            if (jSONObject != null && (jSONObject.optInt("progress", 0) >= 100 || "PHASE_TYPE_COMPLETE".equals(jSONObject.optString("phase")))) {
                break;
            }
            Thread.sleep(2000L);
            i3++;
            strI = str4;
        }
        if (jSONObject == null) {
            return "";
        }
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
            if (jSONObjectOptJSONObject != null) {
                String strOptString3 = jSONObjectOptJSONObject.optString("trace_file_ids", "");
                if (!TextUtils.isEmpty(strOptString3) && (jSONArrayNames = (jSONObject2 = new JSONObject(strOptString3)).names()) != null && jSONArrayNames.length() > 0) {
                    strOptString = jSONObject2.optString(jSONArrayNames.getString(0), "");
                }
            }
        } catch (Exception e) {
            com.github.catvod.spider.merge.A.c.e(e, t0.b("解析恢复文件ID失败: "));
        }
        return TextUtils.isEmpty(strOptString) ? p() : strOptString;
    }

    public final void d() {
        try {
            if (TextUtils.isEmpty(this.d)) {
                return;
            }
            String strI = i();
            String strH = h();
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36");
            map.put("Content-Type", "application/json");
            map.put("accept-language", "zh,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,zh-CN;q=0.6");
            map.put("authorization", strI);
            map.put("x-captcha-token", strH);
            map.put("x-client-id", "Xqp0kJBXWhwaTpB6");
            map.put("x-device-id", "925b7631473a13716b791d7f28289cad");
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(this.d);
            jSONObject.put("ids", jSONArray);
            jSONObject.put("space", "");
            if (com.github.catvod.spider.merge.f0.d.f("https://api-pan.xunlei.com/drive/v1/files:batchDelete", jSONObject.toString(), map).b() == 200) {
                this.d = "";
                SpiderDebug.log("删除文件夹成功");
            }
        } catch (Exception e) {
            com.github.catvod.spider.merge.A.c.e(e, t0.b("删除文件夹失败: "));
        }
    }

    public final String k(String str, String str2, String str3) {
        JSONObject jSONObjectOptJSONObject;
        try {
            String strI = i();
            if (TextUtils.isEmpty(strI)) {
                return "";
            }
            if (TextUtils.isEmpty(this.d)) {
                c();
            }
            String strU = u(str, str2, str3);
            if (TextUtils.isEmpty(strU)) {
                return "";
            }
            String strJ = j("/drive/v1/files", "GET");
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36");
            map.put("Accept", "*/*");
            map.put("Accept-Encoding", "gzip, deflate, br");
            map.put("x-captcha-token", strJ);
            map.put("authorization", strI);
            map.put("content-type", "application/json");
            map.put("x-client-id", "Xqp0kJBXWhwaTpB6");
            map.put("x-device-id", "925b7631473a13716b791d7f28289cad");
            String strM = com.github.catvod.spider.merge.f0.d.m("https://api-pan.xunlei.com/drive/v1/files/" + strU + "?space=&with[0]=public_share_tag&usage=FETCH", map, null);
            if (strM != null && !strM.isEmpty()) {
                JSONObject jSONObject = new JSONObject(strM);
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("links");
                if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("application/octet-stream")) != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("url", "");
                    if (!TextUtils.isEmpty(strOptString)) {
                        return strOptString;
                    }
                }
                return jSONObject.optString("web_content_link", "");
            }
            return "";
        } catch (Exception e) {
            com.github.catvod.spider.merge.A.c.e(e, t0.b("获取下载链接失败: "));
            return "";
        }
    }

    public final String m() {
        return this.c;
    }

    public final z0 n(String str) {
        try {
            Matcher matcher = h.matcher(str);
            if (matcher.find()) {
                return new z0(matcher.group(1), matcher.group(2));
            }
            return null;
        } catch (Exception e) {
            com.github.catvod.spider.merge.A.c.e(e, t0.b("解析迅雷分享链接异常: "));
            return null;
        }
    }

    public final List<B0> o(String str) {
        z0 z0VarN = n(str);
        if (z0VarN == null) {
            return new ArrayList();
        }
        String str2 = (String) z0VarN.a;
        this.a = str2;
        String str3 = (String) z0VarN.b;
        this.b = str3;
        this.c = "";
        try {
            ArrayList<A0> arrayList = (ArrayList) f(str2, str3);
            if (arrayList.isEmpty()) {
                return new ArrayList();
            }
            ArrayList arrayList2 = new ArrayList();
            for (A0 a0 : arrayList) {
                if (a0.d) {
                    for (A0 a02 : (ArrayList) e(this.a, a0.a)) {
                        if (!a02.d) {
                            arrayList2.add(new B0(a02.a, a02.b));
                        }
                    }
                } else {
                    arrayList2.add(new B0(a0.a, a0.b));
                }
            }
            return arrayList2;
        } catch (Exception e) {
            StringBuilder sbB = t0.b("获取迅雷分享文件列表失败: ");
            sbB.append(e.getMessage());
            SpiderDebug.log(sbB.toString());
            return new ArrayList();
        }
    }

    public final void v(String str, boolean z) {
        if (com.github.catvod.spider.merge.P0.e.c(this.f.e()) || z) {
            com.github.catvod.spider.merge.B.h.b("迅雷盘 setUser: ", str);
            if (str != null && str.startsWith("http")) {
                str = com.github.catvod.spider.merge.f0.d.l(str).trim();
            }
            if (com.github.catvod.spider.merge.P0.e.d(str)) {
                String[] strArrSplit = str.split("\\|");
                if (strArrSplit.length >= 2) {
                    this.f.l(strArrSplit[0]);
                    this.f.m(strArrSplit[1]);
                    this.f.g();
                }
            }
        }
    }
}
