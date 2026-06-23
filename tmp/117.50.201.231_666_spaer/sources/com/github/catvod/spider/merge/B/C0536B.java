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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0536B {
    private static HashMap d = new HashMap();
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private static String f28e = "";
    public static boolean t;
    private C0570c a;
    private C0571d b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private JSONObject f29b;
    private final ArrayList c = new ArrayList();
    private String fid;
    private ConcurrentHashMap<String, b> s;

    /* JADX INFO: renamed from: t, reason: collision with other field name */
    private ConcurrentHashMap<String, c> f30t;
    private String u;

    /* JADX INFO: renamed from: u, reason: collision with other field name */
    private ConcurrentHashMap<String, c> f31u;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.b.B$a */
    private static class a {
        static volatile C0536B a = new C0536B();
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.b.B$b */
    class b {
        String a = null;
        long b = 0;
        boolean c = false;

        b() {
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.b.B$c */
    class c {
        public List<String> a;
        public long b;
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.b.B$d */
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
                C0536B.this.deleteUCTempAsync();
            } catch (Exception e) {
                Log.e("UCCleanup", e.getMessage());
            }
        }
    }

    C0536B() {
    }

    private void G(String str, String str2, String str3) {
        String str4;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("req_id", str);
            jSONObject.put("app_ver", "1.6.8");
            jSONObject.put("device_id", str2);
            jSONObject.put("device_brand", "vivo");
            jSONObject.put("platform", "tv");
            jSONObject.put("device_name", "V2238A");
            jSONObject.put("device_model", "V2238A");
            jSONObject.put("build_device", "V2238A");
            jSONObject.put("build_product", "V2238A");
            jSONObject.put("device_gpu", "Adreno (TM) 640");
            jSONObject.put("activity_rect", "{}");
            jSONObject.put("channel", "UCTVOFFICIALWEB");
            if (TextUtils.isEmpty(str3)) {
                str4 = "refresh_token";
                try {
                    str3 = this.f29b.optString("refresh_token");
                } catch (Exception e2) {
                    e = e2;
                    SpiderDebug.log("getRefreshTokenByTV e:" + e);
                    return;
                }
            } else {
                str4 = "code";
            }
            jSONObject.put(str4, str3);
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Linux; U; Android 12; zh-cn; V2238A Build/V417IR) AppleWebKit/533.1 (KHTML, like Gecko) Mobile Safari/533.1");
            map.put("Content-Type", "application/json; charset=utf-8");
            JSONObject jSONObject2 = new JSONObject(C0575b.f("http://api.extscreen.com/ucdrive/token", jSONObject.toString(), map).a());
            if (jSONObject2.optInt("code") == 200) {
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("data");
                jSONObjectOptJSONObject.put("start_time", System.currentTimeMillis() / 1000);
                jSONObjectOptJSONObject.put("device_id", str2);
                com.github.catvod.spider.merge.A.n.u("uc_token.txt", jSONObjectOptJSONObject.toString());
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public static C0536B c() {
        return a.a;
    }

    private String d(String str, Map<String, String> map) {
        try {
            Response responseD = C0575b.d(str, map);
            List listHeaders = responseD.headers("set-cookie");
            if (listHeaders.size() > 0) {
                C0571d c0571dL = l();
                String strQ = C0590I.q(c0571dL.a(), (String) listHeaders.get(0));
                c0571dL.f(strQ);
                this.u = strQ;
            }
            return responseD.body().string();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    private void deleteUCTemp() {
        try {
            String str = this.fid;
            if (str == null || str.isEmpty()) {
                return;
            }
            C0575b.f("https://pc-api.uc.cn/1/clouddrive/file/delete?pr=UCBrowser&fr=pc", "{\"action_type\":2,\"filelist\":[\"" + str + "\"],\"exclude_fids\":[]}", e());
        } catch (Exception e2) {
            Log.e("UCTempDelete", "delete error: " + e2.getMessage());
        }
    }

    private Map<String, String> e() {
        HashMap mapB = v.b("Referer", "https://drive.uc.cn");
        String strA = this.u;
        if (TextUtils.isEmpty(strA)) {
            strA = l().a();
        }
        mapB.put("Cookie", strA);
        mapB.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) uc-cloud-drive/1.8.7 Chrome/100.0.4896.160 Electron/18.3.5.16-b62cf9c50d Safari/537.36 Channel/ucpan_other_ch");
        return mapB;
    }

    private String h() {
        String strA = C0602k.a(i());
        if (TextUtils.isEmpty(strA)) {
            strA = C0575b.l("https://pc-api.uc.cn/1/clouddrive/file", e());
            if (TextUtils.isEmpty(strA)) {
                return "";
            }
            C0602k.c(i(), strA);
        }
        return strA;
    }

    private String j(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        s(str);
        String strA = a(str, str2, str3, true);
        if (!TextUtils.isEmpty(strA)) {
            this.c.add(0, strA);
        }
        return strA;
    }

    private String m() {
        try {
            Map<String, String> mapE = e();
            ((HashMap) mapE).put("Cookie", l().a());
            JSONArray jSONArray = new JSONObject(d("https://pc-api.uc.cn/1/clouddrive/file/sort?pr=UCBrowser&fr=pc&pdir_fid=0&_page=1&_size=200&_fetch_total=1&_fetch_sub_dirs=0&_sort=file_type:asc,file_name:asc", mapE)).getJSONObject("data").getJSONArray("list");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if ("UCtemp".equals(jSONObject.getString("file_name"))) {
                    return jSONObject.getString("fid");
                }
            }
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("pdir_fid", "0");
            jsonObject.addProperty("file_name", "UCtemp");
            jsonObject.addProperty("dir_path", "");
            jsonObject.addProperty("dir_init_lock", Boolean.FALSE);
            String string = jsonObject.toString();
            Map<String, String> mapE2 = e();
            ((HashMap) mapE2).put("Cookie", l().a());
            String strOptString = new JSONObject(C0575b.f("https://pc-api.uc.cn/1/clouddrive/file?pr=UCBrowser&fr=pc", string, mapE2).a()).optJSONObject("data").optString("fid");
            return !TextUtils.isEmpty(strOptString) ? strOptString : "0";
        } catch (Exception e2) {
            e2.printStackTrace();
            Log.e("UC_temp_folder_error", "UC_temp_folder_error");
            return "0";
        }
    }

    private boolean n(String str) {
        String str2;
        try {
            Map<String, String> mapE = e();
            ((HashMap) mapE).put("Range", "bytes=0-1");
            Response responseD = C0575b.d(str, mapE);
            if (responseD.body() != null) {
                responseD.body().close();
            }
            int iCode = responseD.code();
            if (iCode < 200 || iCode >= 300 || (str2 = responseD.headers().get("Content-Range")) == null) {
                return true;
            }
            Matcher matcher = Pattern.compile(".*/(\\d+)").matcher(str2);
            if (matcher.find()) {
                return Long.parseLong(matcher.group(1)) == 15340287;
            }
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    private void o(String str, int i, List<C0568a> list) {
        Map<String, String> mapE = e();
        ((HashMap) mapE).put("Cookie", l().a());
        C0569b c0569bC = C0569b.c(d("https://pc-api.uc.cn/1/clouddrive/file/sort?pr=UCBrowser&fr=pc&uc_param_str=&pdir_fid=" + str + "&_page=" + i + "&_size=100&_fetch_total=1&_fetch_sub_dirs=0&_sort=file_type:asc,file_name:asc", mapE));
        if (c0569bC.a() == null) {
            return;
        }
        list.addAll(c0569bC.a().a());
        if (c0569bC.b().a()) {
            o(str, i + 1, list);
        }
    }

    private String r(String str) {
        try {
            return new JSONObject(C0602k.a(a.a.j())).optString(str);
        } catch (Exception unused) {
            return "";
        }
    }

    private String r(String str, Map<String, Object> map) {
        return C0575b.f(str, new JSONObject(map).toString(), e()).a();
    }

    public final boolean Q() {
        try {
            JSONObject jSONObject = this.f29b;
            if (jSONObject != null && jSONObject.optInt("status") == 0) {
                return true;
            }
            String strC = com.github.catvod.spider.merge.FM.o.z.c("uc_token.txt");
            if (TextUtils.isEmpty(strC)) {
                throw new Exception("empty tvuc");
            }
            JSONObject jSONObject2 = new JSONObject(strC);
            this.f29b = jSONObject2;
            if ((jSONObject2.optLong("start_time") + this.f29b.optLong("expires_in")) - (System.currentTimeMillis() / 1000) > 7200) {
                return true;
            }
            try {
                String str = System.currentTimeMillis() + "";
                String strOptString = this.f29b.optString("device_id");
                G(C0590I.a(strOptString + str), strOptString, "");
            } catch (Exception unused) {
            }
            return true;
        } catch (Exception e2) {
            SpiderDebug.log("setTvObject e:" + e2);
            return false;
        }
    }

    public final String a(String str, String str2, String str3, boolean z) {
        JSONObject jSONObject;
        try {
            if (TextUtils.isEmpty(f28e)) {
                f28e = m();
            }
            HashMap map = new HashMap();
            String str4 = "https://pc-api.uc.cn/1/clouddrive/share/sharepage/save?pr=UCBrowser&fr=pc&uc_param_str=&__t=" + System.currentTimeMillis();
            map.put("pdir_fid", "0");
            map.put("pwd_id", str);
            map.put("scene", "link");
            map.put("stoken", this.a.c().a());
            map.put("to_pdir_fid", f28e);
            ArrayList arrayList = new ArrayList();
            arrayList.add(str2);
            map.put("fid_list", arrayList);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(str3);
            map.put("fid_token_list", arrayList2);
            jSONObject = new JSONObject(r(str4, map));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (jSONObject.optInt("status") > 200) {
            String strOptString = jSONObject.optString("message");
            if (!strOptString.contains("转存文件token校验异常") || !z) {
                C0590I.i(strOptString);
                return "";
            }
            String strG = g(str, str2);
            if (!TextUtils.isEmpty(strG)) {
                return a(str, str2, strG, false);
            }
            C0590I.i(strOptString);
            return "";
        }
        String strOptString2 = jSONObject.optJSONObject("data").optString("task_id");
        for (int i = 1; i < 6; i++) {
            JSONObject jSONObject2 = new JSONObject(d("https://pc-api.uc.cn/1/clouddrive/task?pr=UCBrowser&fr=pc&uc_param_str=&task_id=" + strOptString2 + "&retry_index=" + i + "&__t=" + System.currentTimeMillis(), e()));
            if (jSONObject2.optInt("status") > 200) {
                String strOptString3 = jSONObject2.optString("message");
                if (strOptString3.contains("capacity limit")) {
                    strOptString3 = "云盘容量不足,转存失败,请清理云盘后再试试";
                }
                C0590I.i(strOptString3);
                return "";
            }
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONObject("data").optJSONObject("save_as").optJSONArray("save_as_top_fids");
            if (jSONArrayOptJSONArray.length() > 0) {
                String strOptString4 = jSONArrayOptJSONArray.optString(0);
                this.fid = strOptString4;
                return strOptString4;
            }
            TimeUnit.SECONDS.sleep(1L);
        }
        return "";
    }

    public final boolean b(String str, boolean z) {
        return true;
    }

    public void deleteUCTempAsync() {
        deleteUCTemp();
    }

    public final String f(String str, String str2, String str3) {
        try {
            String strJ = j(str, str2, str3);
            if (TextUtils.isEmpty(strJ)) {
                return "";
            }
            if (this.s == null) {
                this.s = new ConcurrentHashMap<>();
            }
            b bVar = this.s.get(strJ);
            if (bVar != null && System.currentTimeMillis() - bVar.b < 60000) {
                String str4 = bVar.a;
                if (!TextUtils.isEmpty(str4)) {
                    t = bVar.c;
                    return str4;
                }
            }
            String strH = h();
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(strJ);
            map.put("fids", arrayList);
            JSONObject jSONObject = new JSONObject(r("https://pc-api.uc.cn/1/clouddrive/file/download?pr=UCBrowser&fr=pc&sys=win32&ve=1.8.6&ut=" + strH, map));
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
                this.s.put(strJ, bVar2);
                if (n(strOptString)) {
                    C0590I.i("UC网盘客户端机器码[" + strH + "]无效,请退出重试");
                    C0602k.c(i(), "");
                }
            }
            return strOptString;
        } catch (Exception unused) {
            return "";
        }
    }

    public final String g(String str, String str2) {
        List<C0568a> arrayList = (List) d.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            v(str, "", arrayList, "");
        }
        for (C0568a c0568a : arrayList) {
            if (str2.equals(c0568a.b())) {
                return c0568a.d();
            }
        }
        if (!d.containsKey(str)) {
            d.put(str, arrayList);
        }
        return "";
    }

    public final File i() {
        return C0602k.b("/uc_machine_code.txt");
    }

    public final File j() {
        return C0602k.b("/uc_cookie.txt");
    }

    /* JADX INFO: renamed from: j, reason: collision with other method in class */
    public final String m87j() {
        return r("cookie");
    }

    public final List<String> k(String str, String str2, String str3) {
        List<String> list;
        try {
            String strJ = j(str, str2, str3);
            if (this.f30t == null) {
                this.f30t = new ConcurrentHashMap<>();
            }
            c cVar = this.f30t.get(strJ);
            if (cVar != null && System.currentTimeMillis() - cVar.b < 60000 && (list = cVar.a) != null && !list.isEmpty()) {
                return list;
            }
            HashMap map = new HashMap();
            map.put("fid", strJ);
            map.put("resolutions", "normal,low,high,super,2k,4k");
            map.put("supports", "fmp4,m3u8");
            JSONObject jSONObject = new JSONObject(r("https://pc-api.uc.cn/1/clouddrive/file/v2/play?pr=UCBrowser&fr=pc&uc_param_str=", map));
            if (jSONObject.optString("message").contains("file not found")) {
                ArrayList arrayList = new ArrayList();
                c cVar2 = new c();
                cVar2.a = arrayList;
                cVar2.b = System.currentTimeMillis();
                this.f30t.put(strJ, cVar2);
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
            this.f30t.put(strJ, cVar3);
            return arrayList2;
        } catch (Exception e2) {
            e2.printStackTrace();
            ArrayList arrayList3 = new ArrayList();
            c cVar4 = new c();
            cVar4.a = arrayList3;
            cVar4.b = System.currentTimeMillis();
            this.f30t.put(str2, cVar4);
            return arrayList3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1095)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1049)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:358)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r11v25 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public final java.util.List<java.lang.String> kk(java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.b.C0536B.kk(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final C0571d l() {
        String strA = C0602k.a(C0602k.b("/uc_cookie.txt"));
        return strA.startsWith("{") ? C0571d.e(strA) : new C0571d(strA);
    }

    public final C0554e m(String str, String str2) {
        s(str);
        ArrayList<C0568a> arrayList = new ArrayList();
        v(str, str2, arrayList, "");
        Collections.sort(arrayList);
        List<String> uCOptions = Config.getUCOptions();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (C0568a c0568a : arrayList) {
            arrayList2.add(c0568a.c() + "$" + (c0568a.c() + "__" + c0568a.b()) + Marker.ANY_NON_NULL_MARKER + str + Marker.ANY_NON_NULL_MARKER + c0568a.d());
        }
        if (arrayList2.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            String strD = this.a.d();
            if (TextUtils.isEmpty(strD)) {
                strD = "分享文件夹为空";
            }
            sb.append(strD);
            sb.append("$0+");
            sb.append(str);
            sb.append("+0");
            arrayList2.add(sb.toString());
        }
        for (int i = 0; i < uCOptions.size(); i++) {
            arrayList3.add(TextUtils.join("#", arrayList2));
        }
        C0554e c0554e = new C0554e();
        c0554e.j(str);
        c0554e.h(str + "/" + str2);
        c0554e.l("https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/OSYH/1200X800/uc.jpg");
        c0554e.k(this.a.c() == null ? "获取视频名称失败" : this.a.c().b());
        c0554e.n(TextUtils.join("$$$", arrayList3));
        c0554e.m(TextUtils.join("$$$", uCOptions));
        return c0554e;
    }

    public final String nickname() {
        return r("nickname");
    }

    public final void p(String str, List<C0568a> list) {
        o(str, 1, list);
    }

    public final String q(String[] strArr, String str) {
        if (!l().d()) {
            C0590I.i("还未登录UC账号,请前往【配置中心】登录");
            return C0552c.l("还未登录UC账号,请前往【配置中心】登录");
        }
        d("https://pc-api.uc.cn/1/clouddrive/config?pr=UCBrowser&fr=pc&uc_param_str=", e());
        String str2 = strArr[0];
        String str3 = strArr.length > 1 ? strArr[1] : "";
        String str4 = strArr.length > 2 ? strArr[2] : "";
        String str5 = str.split("#")[0];
        if (str2.contains("__")) {
            C0603l.c("danmuvodindex", str2.split("__")[0]);
            str2 = str2.split("__")[1];
        }
        String str6 = Proxy.getUrl() + "?do=danmu&site=wangpan";
        String strA = com.github.catvod.spider.merge.F.a.a("uc", str3, str2, str4);
        List<String> listKk = Q() ? kk(str3, str2, str4) : k(str3, str2, str4);
        new Thread(new d()).start();
        if (str5.contains("原画")) {
            C0552c c0552c = new C0552c();
            c0552c.u(strA);
            if (t) {
                c0552c.hh();
            } else {
                c0552c.h();
            }
            c0552c.e(e());
            c0552c.a(str6);
            return c0552c.toString();
        }
        if (Q()) {
            C0552c c0552c2 = new C0552c();
            c0552c2.v(listKk);
            c0552c2.h();
            c0552c2.a(str6);
            return c0552c2.toString();
        }
        C0552c c0552c3 = new C0552c();
        c0552c3.v(listKk);
        c0552c3.h();
        c0552c3.e(e());
        c0552c3.a(str6);
        return c0552c3.toString();
    }

    public final String qq(String[] strArr, String str) throws JSONException, UnsupportedEncodingException {
        d("https://pc-api.uc.cn/1/clouddrive/config?pr=UCBrowser&fr=pc&uc_param_str=", e());
        String strA = com.github.catvod.spider.merge.F.a.a("uc", strArr.length > 1 ? strArr[1] : "", strArr[0], strArr.length > 2 ? strArr[2] : "");
        Map<String, String> mapE = e();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Referer", mapE.get("Referer"));
        jSONObject.put("Cookie", mapE.get("Cookie"));
        jSONObject.put("User-Agent", mapE.get("User-Agent"));
        String str2 = strA + "&header=" + URLEncoder.encode(jSONObject.toString(), "UTF-8");
        new Thread(new d()).start();
        return str2;
    }

    public final void s(String str) {
        try {
            C0570c c0570c = this.a;
            if (c0570c == null || !c0570c.a(str)) {
                String str2 = "https://pc-api.uc.cn/1/clouddrive/share/sharepage/token?__t=" + System.currentTimeMillis();
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("pwd_id", str);
                jsonObject.addProperty("passcode", "");
                String strA = C0575b.f(str2, jsonObject.toString(), e()).a();
                C0570c c0570c2 = (C0570c) new Gson().fromJson(strA, C0570c.class);
                c0570c2.f(str);
                c0570c2.g();
                this.a = c0570c2;
                if (c0570c2.c() == null) {
                    this.a.e(new JSONObject(strA).optString("message"));
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final boolean t(String str) {
        try {
            if (str.startsWith("http")) {
                str = C0575b.l(str, null).trim();
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Map<String, String> mapE = e();
            HashMap map = (HashMap) mapE;
            map.put("Cookie", str);
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
            JSONObject jSONObject = new JSONObject(d("https://pc-api.uc.cn/1/clouddrive/member?pr=UCBrowser&fr=pc", mapE));
            if (!"200".equals(jSONObject.optString("status"))) {
                throw new Exception();
            }
            C0571d c0571d = new C0571d(str);
            c0571d.g(jSONObject.optJSONObject("data").optString("member_type"));
            JSONObject jSONObject2 = new JSONObject(d("https://drive.uc.cn/account/info?fr=pc&platform=pc", mapE));
            StringBuilder sb = new StringBuilder();
            sb.append("->");
            sb.append(!jSONObject2.optBoolean("success"));
            SpiderDebug.log(sb.toString());
            c0571d.h(!jSONObject2.optBoolean("success") ? "用户名获取失败" : jSONObject2.optJSONObject("data").optString("nickname"));
            Init.run(new RunnableC0549p(c0571d, C0602k.b("/uc_cookie.txt"), 1));
            return c0571d.d();
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public final void u(String str, String str2, int i, List<C0568a> list) {
        int i2;
        if (this.a.b(str)) {
            String strD = d("https://pc-api.uc.cn/1/clouddrive/share/sharepage/detail?pr=UCBrowser&fr=pc&pwd_id=" + str + "&stoken=" + URLEncoder.encode(this.a.c().a()) + "&pdir_fid=" + str2 + "&force=0&_page=" + i + "&_size=100&_fetch_banner=0&_fetch_share=0&_fetch_total=1&_sort=file_type:asc,file_name:asc", e());
            list.addAll(((C0569b) new Gson().fromJson(strD, C0569b.class)).a().a());
            try {
                JSONObject jSONObject = new JSONObject(strD).getJSONObject("metadata");
                int i3 = jSONObject.getInt("_total");
                int i4 = jSONObject.getInt("_count");
                if (i3 <= 100 || (i2 = i * 100) >= i3 || i4 != i2) {
                    return;
                }
                u(str, str2, i + 1, list);
            } catch (Exception unused) {
            }
        }
    }

    public final void v(String str, String str2, List<C0568a> list) {
        int iA;
        ArrayList<C0568a> arrayList = new ArrayList();
        u(str, str2, 1, arrayList);
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
            v(str, ((C0568a) it.next()).b(), list);
        }
    }

    public final void v(String str, String str2, List<C0568a> list, String str3) {
        int iA;
        ArrayList<C0568a> arrayList = new ArrayList();
        u(str, str2, 1, arrayList);
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
            v(str, c0568a2.b(), list, c0568a2.c());
        }
    }
}
