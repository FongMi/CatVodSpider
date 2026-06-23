package com.github.catvod.spider.merge.b;

import android.text.TextUtils;
import android.util.Log;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.c.C0552c;
import com.github.catvod.spider.merge.c.C0554e;
import com.github.catvod.spider.merge.i.C0568a;
import com.github.catvod.spider.merge.i.C0569b;
import com.github.catvod.spider.merge.i.C0570c;
import com.github.catvod.spider.merge.i.C0571d;
import com.github.catvod.spider.merge.k.C0575b;
import com.github.catvod.spider.merge.m.C0590I;
import com.github.catvod.spider.merge.m.C0602k;
import com.github.catvod.spider.merge.m.C0603l;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class w {
    private static String e;
    private static HashMap f = new HashMap();
    private static boolean t;
    private Boolean a;
    private C0570c b;
    private C0571d c;
    private final ArrayList d = new ArrayList();
    private String fid;
    private String q;
    private ConcurrentHashMap<String, b> s;

    /* JADX INFO: renamed from: t, reason: collision with other field name */
    private ConcurrentHashMap<String, c> f34t;
    private Map tokenMap;

    private static class a {
        static volatile w a = new w();
    }

    class b {
        String a = null;
        long b = 0;
        boolean c = false;

        b() {
        }
    }

    class c {
        public List<String> a;
        public long b;
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException unused) {
            }
            try {
                w.this.deleteQuarkTempAsync();
            } catch (Exception e) {
                Log.e("QuarkCleanup", e.getMessage());
            }
        }
    }

    w() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(String str, boolean z) {
        return true;
    }

    private void deleteQuarkTemp() {
        try {
            String str = this.fid;
            if (str == null || str.isEmpty()) {
                return;
            }
            C0575b.f("https://drive-pc.quark.cn/1/clouddrive/file/delete?pr=ucpro&fr=pc&uc_param_str=", "{\"action_type\":2,\"filelist\":[\"" + str + "\"],\"exclude_fids\":[]}", g());
        } catch (Exception e2) {
            Log.e("QuarkTempDelete", "Error deleting file: " + e2.getMessage());
        }
    }

    public static w e() {
        return a.a;
    }

    private String f(String str, Map<String, String> map) {
        try {
            Response responseD = C0575b.d(str, map);
            List listHeaders = responseD.headers("set-cookie");
            if (listHeaders.size() > 0) {
                C0571d c0571dO = o();
                String strQ = C0590I.q(c0571dO.a(), (String) listHeaders.get(0));
                c0571dO.f(strQ);
                this.q = strQ;
            }
            return responseD.body().string();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    private Map<String, String> g() {
        HashMap mapB = v.b("Referer", "https://pan.quark.cn");
        String strA = this.q;
        if (TextUtils.isEmpty(strA)) {
            strA = o().a();
        }
        mapB.put("Cookie", strA);
        mapB.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) quark-cloud-drive/3.0.1 Chrome/100.0.4896.160 Electron/18.3.5.12-a038f7b798 Safari/537.36 Channel/pckk_other_ch");
        return mapB;
    }

    private String i(String str) {
        return new JSONObject(f(u.a("https://drive-pc.quark.cn/1/clouddrive/file/info?pr=ucpro&fr=pc&uc_param_str=&fid=", str, "&_fetch_full_path=0&need_profile_tags=1"), g())).optJSONObject("data").optString("file_name");
    }

    private String k(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        u(str);
        String strC = c(str, str2, str3, true);
        if (!TextUtils.isEmpty(strC)) {
            this.d.add(0, strC);
        }
        return strC;
    }

    private String m() {
        try {
            Map<String, String> mapG = g();
            ((HashMap) mapG).put("Cookie", o().a());
            JSONArray jSONArray = new JSONObject(f("https://drive-pc.quark.cn/1/clouddrive/file/sort?pr=ucpro&fr=pc&uc_param_str=&pdir_fid=0&_page=1&_size=50&_fetch_total=1&_fetch_sub_dirs=0&_sort=file_type:asc,file_name:asc", mapG)).getJSONObject("data").getJSONArray("list");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if ("Quarktemp".equals(jSONObject.getString("file_name"))) {
                    return jSONObject.getString("fid");
                }
            }
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("pdir_fid", "0");
            jsonObject.addProperty("file_name", "Quarktemp");
            jsonObject.addProperty("dir_path", "");
            jsonObject.addProperty("dir_init_lock", Boolean.FALSE);
            String string = jsonObject.toString();
            Map<String, String> mapG2 = g();
            ((HashMap) mapG2).put("Cookie", o().a());
            String strOptString = new JSONObject(C0575b.f("https://drive-pc.quark.cn/1/clouddrive/file?pr=ucpro&fr=pc", string, mapG2).a()).optJSONObject("data").optString("fid");
            return !TextUtils.isEmpty(strOptString) ? strOptString : "0";
        } catch (Exception e2) {
            e2.printStackTrace();
            Log.e("Quark_temp_folder_error", "Quark_temp_folder_error");
            return "0";
        }
    }

    private void q(String str, int i, List<C0568a> list) {
        Map<String, String> mapG = g();
        ((HashMap) mapG).put("Cookie", o().a());
        C0569b c0569bC = C0569b.c(f("https://drive-pc.quark.cn/1/clouddrive/file/sort?pr=ucpro&fr=pc&uc_param_str=&pdir_fid=" + str + "&_page=" + i + "&_size=100&_fetch_total=1&_fetch_sub_dirs=0&_sort=file_type:asc,file_name:asc", mapG));
        list.addAll(c0569bC.a().a());
        if (c0569bC.b().a()) {
            q(str, i + 1, list);
        }
    }

    private String r(String str) {
        try {
            return new JSONObject(C0602k.a(a.a.i())).optString(str);
        } catch (Exception unused) {
            return "";
        }
    }

    private String t(String str, Map<String, Object> map) {
        return C0575b.f(str, new JSONObject(map).toString(), g()).a();
    }

    public final String c(String str, String str2, String str3, boolean z) {
        String strSubstring = str;
        if (strSubstring.contains("?pwd=")) {
            int iIndexOf = strSubstring.indexOf("?pwd=");
            strSubstring = iIndexOf > 0 ? strSubstring.substring(0, iIndexOf) : "";
        }
        try {
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if ("0".equals(str2)) {
            throw new RuntimeException();
        }
        if (TextUtils.isEmpty(e)) {
            e = m();
        }
        HashMap map = new HashMap();
        String str4 = "https://drive-pc.quark.cn/1/clouddrive/share/sharepage/save?pr=ucpro&fr=pc&uc_param_str=&__t=" + System.currentTimeMillis();
        map.put("pdir_fid", "0");
        map.put("pwd_id", strSubstring);
        map.put("scene", "link");
        map.put("stoken", this.b.c().a());
        map.put("to_pdir_fid", e);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        map.put("fid_list", arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(str3);
        map.put("fid_token_list", arrayList2);
        JSONObject jSONObject = new JSONObject(t(str4, map));
        if (jSONObject.optInt("status") > 200) {
            String strOptString = jSONObject.optString("message");
            if (!strOptString.contains("转存文件token校验异常") || !z) {
                C0590I.i(strOptString);
                return "";
            }
            String strJ = j(str, str2);
            if (!TextUtils.isEmpty(strJ)) {
                return c(strSubstring, str2, strJ, false);
            }
            C0590I.i(strOptString);
            return "";
        }
        String strOptString2 = jSONObject.optJSONObject("data").optString("task_id");
        for (int i = 1; i < 6; i++) {
            JSONObject jSONObject2 = new JSONObject(f("https://drive-pc.quark.cn/1/clouddrive/task?pr=ucpro&fr=pc&uc_param_str=&task_id=" + strOptString2 + "&retry_index=" + i + "&__t=" + System.currentTimeMillis(), g()));
            if (jSONObject2.optInt("status") > 200) {
                if (jSONObject2.optInt("code") == 41013 && z) {
                    e = "";
                    return c(strSubstring, str2, str3, false);
                }
                String str5 = jSONObject2.optString("message") + "[" + jSONObject2.optInt("code") + "]";
                if (str5.contains("capacity limit")) {
                    str5 = "云盘容量不足,转存失败,请清理云盘后再试试";
                }
                C0590I.i(str5);
                return "";
            }
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONObject("data").optJSONObject("save_as").optJSONArray("save_as_top_fids");
            if (jSONArrayOptJSONArray.length() > 0) {
                String strOptString3 = jSONArrayOptJSONArray.optString(0);
                this.fid = strOptString3;
                return strOptString3;
            }
            TimeUnit.SECONDS.sleep(1L);
        }
        return "";
    }

    public void deleteQuarkTempAsync() {
        deleteQuarkTemp();
    }

    public final String h(String str, String str2, String str3) {
        try {
            String strK = k(str, str2, str3);
            if (TextUtils.isEmpty(strK)) {
                return "";
            }
            if (this.s == null) {
                this.s = new ConcurrentHashMap<>();
            }
            b bVar = this.s.get(strK);
            if (bVar != null && System.currentTimeMillis() - bVar.b < 60000) {
                String str4 = bVar.a;
                if (!TextUtils.isEmpty(str4)) {
                    t = bVar.c;
                    return str4;
                }
            }
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(strK);
            map.put("fids", arrayList);
            String strN = n();
            if (!TextUtils.isEmpty(strN)) {
                map.put("token", strN);
            }
            JSONObject jSONObject = new JSONObject(t("https://drive-pc.quark.cn/1/clouddrive/file/download?pr=ucpro&fr=pc", map));
            if (jSONObject.optString("message").contains("file not found")) {
                return "";
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONArray("data").optJSONObject(0);
            String strOptString = jSONObjectOptJSONObject.optString("download_url");
            boolean zContains = jSONObjectOptJSONObject.optString("format_type").toLowerCase().contains("iso");
            t = zContains;
            if (strOptString != null && !strOptString.isEmpty()) {
                b bVar2 = new b();
                bVar2.a = strOptString;
                bVar2.b = System.currentTimeMillis();
                bVar2.c = zContains;
                this.s.put(strK, bVar2);
            }
            return strOptString;
        } catch (Exception unused) {
            return "";
        }
    }

    public final File i() {
        return C0602k.b("/quark_cookie.txt");
    }

    public final String i(String str, String str2, String str3) {
        JSONObject jSONObjectOptJSONObject;
        String str4;
        try {
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(str2);
            map.put("fids", arrayList);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(str3);
            map.put("fids_token", arrayList2);
            map.put("pwd_id", str);
            Map map2 = this.tokenMap;
            map.put("stoken", (map2 == null || (str4 = (String) map2.get(str)) == null) ? "" : str4);
            map.put("speedup_session", "");
            String strN = n();
            if (!TextUtils.isEmpty(strN)) {
                map.put("token", strN);
            }
            JSONArray jSONArrayOptJSONArray = new JSONObject(t("https://drive-pc.quark.cn/1/clouddrive/file/download?pr=ucpro&fr=pc", map)).optJSONArray("data");
            if (jSONArrayOptJSONArray == null || (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) == null) {
                return "";
            }
            String strOptString = jSONObjectOptJSONObject.optString("download_url");
            t = jSONObjectOptJSONObject.optString("format_type").toLowerCase().contains("iso");
            return strOptString;
        } catch (Exception e2) {
            return "";
        }
    }

    public final String j() {
        return r("cookie");
    }

    public final String j(String str, String str2) {
        List<C0568a> arrayList = (List) f.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            x(str, "", arrayList, "");
        }
        for (C0568a c0568a : arrayList) {
            if (str2.equals(c0568a.b())) {
                return c0568a.d();
            }
        }
        if (!f.containsKey(str)) {
            f.put(str, arrayList);
        }
        return "";
    }

    public final List<String> l(String str, String str2, String str3) {
        List<String> list;
        try {
            String strK = k(str, str2, str3);
            if (this.f34t == null) {
                this.f34t = new ConcurrentHashMap<>();
            }
            c cVar = this.f34t.get(strK);
            if (cVar != null && System.currentTimeMillis() - cVar.b < 60000 && (list = cVar.a) != null && !list.isEmpty()) {
                return list;
            }
            HashMap map = new HashMap();
            map.put("fid", strK);
            map.put("resolutions", "normal,low,high,super,2k,4k");
            map.put("supports", "fmp4,m3u8");
            JSONObject jSONObject = new JSONObject(t("https://drive-pc.quark.cn/1/clouddrive/file/v2/play?pr=ucpro&fr=pc&uc_param_str=", map));
            if (jSONObject.optString("message").contains("file not found")) {
                ArrayList arrayList = new ArrayList();
                c cVar2 = new c();
                cVar2.a = arrayList;
                cVar2.b = System.currentTimeMillis();
                this.f34t.put(strK, cVar2);
                return arrayList;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONObject("data").optJSONArray("video_list");
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject.optBoolean("accessable")) {
                    arrayList2.add(jSONObjectOptJSONObject.optString("resolution"));
                    arrayList2.add(jSONObjectOptJSONObject.optJSONObject("video_info").optString("url"));
                }
            }
            c cVar3 = new c();
            cVar3.a = arrayList2;
            cVar3.b = System.currentTimeMillis();
            this.f34t.put(strK, cVar3);
            return arrayList2;
        } catch (Exception e2) {
            e2.printStackTrace();
            ArrayList arrayList3 = new ArrayList();
            c cVar4 = new c();
            cVar4.a = arrayList3;
            cVar4.b = System.currentTimeMillis();
            this.f34t.put(str2, cVar4);
            return arrayList3;
        }
    }

    public final String n() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject("{\"conversation_id\":\"" + ("300000" + jCurrentTimeMillis) + "\",\"conversation_type\":3,\"msg_id\":\"" + (jCurrentTimeMillis + "000") + "\"}");
        Map<String, String> mapG = g();
        ((HashMap) mapG).put("Content-Type", "application/json");
        JSONObject jSONObject2 = new JSONObject(C0575b.f("https://drive-social-api.quark.cn/1/clouddrive/chat/conv/file/acquire_dl_token?pr=ucpro&fr=pc&sys=darwin&ve=3.19", jSONObject.toString(), mapG).a());
        return (jSONObject2.optInt("status") == 200 && jSONObject2.optInt("code") == 0) ? jSONObject2.optJSONObject("data").optString("token") : "";
    }

    public final String nickname() {
        return r("nickname");
    }

    public final C0571d o() {
        String strA = C0602k.a(C0602k.b("/quark_cookie.txt"));
        return strA.startsWith("{") ? C0571d.e(strA) : new C0571d(strA);
    }

    public final C0554e p(String str, String str2) {
        u(str);
        ArrayList<C0568a> arrayList = new ArrayList();
        x(str, str2, arrayList, "");
        Collections.sort(arrayList);
        List<String> quarkOptions = Config.getQuarkOptions();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (C0568a c0568a : arrayList) {
            arrayList2.add(c0568a.c() + "$" + (c0568a.c() + "__" + c0568a.b()) + Marker.ANY_NON_NULL_MARKER + str + Marker.ANY_NON_NULL_MARKER + c0568a.d());
        }
        if (arrayList2.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append(TextUtils.isEmpty(this.b.d()) ? "分享文件夹为空" : this.b.d());
            sb.append("$0+");
            sb.append(str);
            sb.append("+0");
            arrayList2.add(sb.toString());
        }
        for (int i = 0; i < quarkOptions.size(); i++) {
            arrayList3.add(TextUtils.join("#", arrayList2));
        }
        C0554e c0554e = new C0554e();
        c0554e.j(str);
        c0554e.h(str + "/" + str2);
        c0554e.l("https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/El1L/1200X800/quark.jpg");
        c0554e.k(this.b.c() == null ? "获取视频名称失败" : this.b.c().b());
        c0554e.n(TextUtils.join("$$$", arrayList3));
        c0554e.m(TextUtils.join("$$$", quarkOptions));
        return c0554e;
    }

    public final void r(String str, List<C0568a> list) {
        q(str, 1, list);
    }

    public final String s(String[] strArr, String str) {
        if (!o().d()) {
            C0590I.i("还未登录夸克账号,请前往【配置中心】登录");
            return C0552c.l("还未登录夸克账号,请前往【配置中心】登录");
        }
        f("https://drive-pc.quark.cn/1/clouddrive/config?pr=ucpro&fr=pc&uc_param_str=", g());
        String str2 = strArr[0];
        String str3 = strArr.length > 1 ? strArr[1] : "";
        String str4 = strArr.length > 2 ? strArr[2] : "";
        String str5 = str.split("#")[0];
        if (str2.contains("__")) {
            C0603l.c("danmuvodindex", str2.split("__")[0]);
            str2 = str2.split("__")[1];
        }
        String str6 = Proxy.getUrl() + "?do=danmu&site=wangpan";
        if (str5.contains("智能")) {
            String strB = com.github.catvod.spider.merge.F.a.b("quark", str3, str2, str4);
            C0552c c0552c = new C0552c();
            c0552c.u(strB);
            if (t) {
                c0552c.hh();
            } else {
                c0552c.h();
            }
            c0552c.e(g());
            c0552c.a(str6);
            return c0552c.toString();
        }
        String strA = com.github.catvod.spider.merge.F.a.a("quark", str3, str2, str4);
        List<String> listL = l(str3, str2, str4);
        new Thread(new d()).start();
        if (!str5.contains("原画")) {
            C0552c c0552c2 = new C0552c();
            c0552c2.v(listL);
            c0552c2.h();
            c0552c2.e(g());
            c0552c2.a(str6);
            return c0552c2.toString();
        }
        C0552c c0552c3 = new C0552c();
        c0552c3.u(strA);
        if (t) {
            c0552c3.hh();
        } else {
            c0552c3.h();
        }
        c0552c3.e(g());
        c0552c3.a(str6);
        return c0552c3.toString();
    }

    public final String ss(String[] strArr, String str) throws JSONException, UnsupportedEncodingException {
        f("https://drive-pc.quark.cn/1/clouddrive/config?pr=ucpro&fr=pc&uc_param_str=", g());
        String strA = com.github.catvod.spider.merge.F.a.a("quark", strArr.length > 1 ? strArr[1] : "", strArr[0], strArr.length > 2 ? strArr[2] : "");
        Map<String, String> mapG = g();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Referer", mapG.get("Referer"));
        jSONObject.put("Cookie", mapG.get("Cookie"));
        jSONObject.put("User-Agent", mapG.get("User-Agent"));
        String str2 = strA + "&header=" + URLEncoder.encode(jSONObject.toString(), "UTF-8");
        new Thread(new d()).start();
        return str2;
    }

    public final void u(String str) {
        String str2;
        String strSubstring;
        try {
            C0570c c0570c = this.b;
            if (c0570c == null || !c0570c.a(str)) {
                if (str.contains("?pwd=")) {
                    int iIndexOf = str.indexOf("?pwd=");
                    String strSubstring2 = str.substring(0, iIndexOf);
                    strSubstring = str.substring(iIndexOf + "?pwd=".length());
                    str2 = strSubstring2;
                } else {
                    str2 = str;
                    strSubstring = "";
                }
                String str3 = str2;
                String str4 = "https://drive-pc.quark.cn/1/clouddrive/share/sharepage/token?__t=" + System.currentTimeMillis();
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("pwd_id", str2);
                jsonObject.addProperty("passcode", strSubstring);
                String strA = C0575b.f(str4, jsonObject.toString(), g()).a();
                JSONObject jSONObjectOptJSONObject = new JSONObject(strA).optJSONObject("data");
                String strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("stoken") : null;
                if (strOptString == null) {
                    strOptString = "";
                }
                Map map = this.tokenMap;
                if (map == null) {
                    map = new HashMap();
                    this.tokenMap = map;
                }
                map.put(str3, strOptString);
                C0570c c0570c2 = (C0570c) new Gson().fromJson(strA, C0570c.class);
                c0570c2.f(str);
                c0570c2.g();
                this.b = c0570c2;
                if (c0570c2.c() == null) {
                    this.b.e(new JSONObject(strA).optString("message"));
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final boolean v(String str) {
        try {
            if (str.startsWith("http")) {
                str = C0575b.l(str, null).trim();
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Map<String, String> mapG = g();
            HashMap map = (HashMap) mapG;
            map.put("Cookie", str);
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
            JSONObject jSONObject = new JSONObject(f("https://drive-pc.quark.cn/1/clouddrive/member?pr=ucpro&fr=pc&uc_param_str=&fetch_subscribe=true&_ch=home&fetch_identity=true", mapG));
            if (!"200".equals(jSONObject.optString("status"))) {
                throw new Exception();
            }
            C0571d c0571d = new C0571d(str);
            c0571d.g(jSONObject.optJSONObject("data").optString("member_type"));
            JSONObject jSONObject2 = new JSONObject(f("https://pan.quark.cn/account/info?fr=pc&platform=pc", mapG));
            StringBuilder sb = new StringBuilder();
            sb.append("->");
            int i = 1;
            sb.append(!jSONObject2.optBoolean("success"));
            SpiderDebug.log(sb.toString());
            c0571d.h(!jSONObject2.optBoolean("success") ? "获取用户名异常" : jSONObject2.optJSONObject("data").optString("nickname"));
            Init.run(new RunnableC0549p(c0571d, C0602k.b("/quark_cookie.txt"), i));
            return c0571d.d();
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public final void w(String str, String str2, int i, List<C0568a> list) {
        if (this.b.b(str)) {
            String strSubstring = str;
            if (str.contains("?pwd=")) {
                strSubstring = str.substring(0, str.indexOf("?pwd="));
            }
            String strF = f("https://drive-pc.quark.cn/1/clouddrive/share/sharepage/detail?pr=ucpro&fr=pc&uc_param_str=&pwd_id=" + strSubstring + "&stoken=" + URLEncoder.encode(this.b.c().a()) + "&pdir_fid=" + str2 + "&force=0&_page=" + i + "&_size=100&_sort=file_type:asc,file_name:asc", g());
            C0569b c0569bC = C0569b.c(strF);
            list.addAll(c0569bC.a().a());
            boolean zA = c0569bC.b().a();
            boolean z = false;
            try {
                JSONObject jSONObject = new JSONObject(strF).getJSONObject("metadata");
                int i2 = jSONObject.getInt("_total");
                int i3 = jSONObject.getInt("_count");
                if (i2 > 0) {
                    if (i * 100 < i2 && i3 == 100) {
                        z = true;
                    }
                    zA = z;
                }
            } catch (Exception unused) {
            }
            if (zA) {
                w(str, str2, i + 1, list);
            }
        }
    }

    public final void x(String str, String str2, List<C0568a> list) {
        int iA;
        ArrayList<C0568a> arrayList = new ArrayList();
        w(str, str2, 1, arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (C0568a c0568a : arrayList) {
            if (c0568a.f()) {
                arrayList2.add(c0568a);
            } else if (c0568a.g() && ((iA = c0568a.a()) == 1 || iA == 2 || (iA == 7 && c0568a.c().toLowerCase().endsWith(".iso")))) {
                list.add(c0568a);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            x(str, ((C0568a) it.next()).b(), list);
        }
    }

    public final void x(String str, String str2, List<C0568a> list, String str3) {
        int iA;
        ArrayList<C0568a> arrayList = new ArrayList();
        w(str, str2, 1, arrayList);
        ArrayList<C0568a> arrayList2 = new ArrayList();
        for (C0568a c0568a : arrayList) {
            if (c0568a.f()) {
                arrayList2.add(c0568a);
            } else if (c0568a.g() && ((iA = c0568a.a()) == 1 || iA == 2 || (iA == 7 && c0568a.cc().toLowerCase().endsWith(".iso")))) {
                c0568a.h(str3);
                list.add(c0568a);
            }
        }
        for (C0568a c0568a2 : arrayList2) {
            x(str, c0568a2.b(), list, c0568a2.c());
        }
    }
}
