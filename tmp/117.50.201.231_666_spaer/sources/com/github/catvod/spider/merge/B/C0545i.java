package com.github.catvod.spider.merge.b;

import android.os.Environment;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.a.C0531c;
import com.github.catvod.spider.merge.c.C0552c;
import com.github.catvod.spider.merge.c.C0554e;
import com.github.catvod.spider.merge.d.C0558b;
import com.github.catvod.spider.merge.d.C0559c;
import com.github.catvod.spider.merge.d.i;
import com.github.catvod.spider.merge.d.j;
import com.github.catvod.spider.merge.k.C0575b;
import com.github.catvod.spider.merge.k.C0577d;
import com.github.catvod.spider.merge.m.C0590I;
import com.github.catvod.spider.merge.m.C0602k;
import com.github.catvod.spider.merge.m.C0603l;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0545i {
    private final List<String> a = new ArrayList();
    private com.github.catvod.spider.merge.d.k b;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.b.i$a */
    private static class a {
        static volatile C0545i a = new C0545i();
    }

    C0545i() {
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public static void a(C0545i c0545i) {
        JSONObject jSONObjectOptJSONObject;
        c0545i.getClass();
        for (String str : new ArrayList(c0545i.a)) {
            String strA = c0545i.g().a().a();
            JsonObject jsonObject = new JsonObject();
            JsonArray jsonArray = new JsonArray();
            JsonObject jsonObject2 = new JsonObject();
            JsonObject jsonObject3 = new JsonObject();
            jsonObject3.addProperty("drive_id", strA);
            jsonObject3.addProperty("file_id", str);
            jsonObject2.add("body", jsonObject3);
            JsonObject jsonObject4 = new JsonObject();
            jsonObject4.addProperty("Content-Type", "application/json");
            jsonObject2.add("headers", jsonObject4);
            jsonObject2.addProperty("id", str);
            jsonObject2.addProperty("method", "POST");
            jsonObject2.addProperty("url", "/file/delete");
            jsonArray.add(jsonObject2);
            jsonObject.add("requests", jsonArray);
            jsonObject.addProperty("resource", "file");
            HashMap<String, String> mapE = c0545i.e();
            mapE.put("authorization", c0545i.g().c().a());
            mapE.put("Referer", "https://www.aliyundrive.com/");
            mapE.put("Content-Type", "application/json");
            JSONArray jSONArrayOptJSONArray = new JSONObject(C0575b.f("https://api.aliyundrive.com/adrive/v2/batch", jsonObject.toString(), mapE).a()).optJSONArray("responses");
            boolean z = false;
            if (jSONArrayOptJSONArray != null && (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) != null && jSONObjectOptJSONObject.optInt("status") == 204) {
                z = true;
            }
            if (z) {
                c0545i.a.remove(str);
            }
        }
    }

    private String b(String str, String str2, boolean z) {
        try {
            if (!str.startsWith("https")) {
                str = "https://api.aliyundrive.com/" + str;
            }
            HashMap<String, String> mapE = e();
            mapE.put("X-Canary", "client=Android,app=adrive,version=v4.3.1");
            com.github.catvod.spider.merge.d.k kVar = this.b;
            if (!(kVar == null)) {
                mapE.put("x-share-token", kVar.c());
            }
            if (g().c().d()) {
                mapE.put("authorization", g().c().a());
            }
            C0577d c0577dF = C0575b.f(str, str2, mapE);
            return (z && c0577dF.b() == 401 && s()) ? b(str, str2, false) : (z && c0577dF.b() == 429) ? b(str, str2, false) : c0577dF.a();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private String c(String str, String str2) {
        if (TextUtils.isEmpty(g().a().a())) {
            i();
        }
        j.a aVarA = ((com.github.catvod.spider.merge.d.j) new Gson().fromJson(b("adrive/v2/batch", String.format("{\"requests\":[{\"body\":{\"file_id\":\"%s\",\"share_id\":\"%s\",\"auto_rename\":true,\"to_parent_file_id\":\"root\",\"to_drive_id\":\"%s\"},\"headers\":{\"Content-Type\":\"application/json\"},\"id\":\"0\",\"method\":\"POST\",\"url\":\"/file/copy\"}],\"resource\":\"file\"}", str2, str, g().a().a()), true), com.github.catvod.spider.merge.d.j.class)).b().a();
        String strA = aVarA.a();
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String strB = aVarA.b();
        if (strB.contains("limit")) {
            C0590I.i(C0531c.a("云盘空间不足，请手动删除部分文件\r\n", strB));
        }
        SpiderDebug.log("");
        return "";
    }

    public static C0545i d() {
        return a.a;
    }

    private void n(String str, com.github.catvod.spider.merge.d.g gVar, List<com.github.catvod.spider.merge.d.g> list, String str2) {
        ArrayList arrayList = new ArrayList();
        com.github.catvod.spider.merge.d.g gVarL = l(str, gVar, str2);
        for (com.github.catvod.spider.merge.d.g gVar2 : gVarL.e()) {
            if (gVar2.k().equals("folder")) {
                arrayList.add(gVar2);
            } else if (gVar2.a().equals("video") || gVar2.a().equals("audio")) {
                if (gVar2.d().doubleValue() >= 5242880.0d) {
                    gVar2.m(gVar.f());
                    list.add(gVar2);
                }
            }
        }
        if (gVarL.g().length() > 0) {
            n(str, gVar, list, gVarL.g());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m(str, (com.github.catvod.spider.merge.d.g) it.next(), list);
        }
    }

    private String q(String str, JsonObject jsonObject) {
        if (!str.startsWith("https")) {
            str = C0531c.a("https://api.aliyundrive.com/", str);
        }
        return C0575b.f(str, jsonObject.toString(), e()).a();
    }

    private boolean q(String str) {
        if (!str.contains("Too Many Requests")) {
            return false;
        }
        C0590I.i("授权频率超过限定数,请稍候再试!");
        g().f(com.github.catvod.spider.merge.d.h.d(""));
        return true;
    }

    private String r(String str, JsonObject jsonObject, com.github.catvod.spider.merge.d.k kVar, Boolean bool) {
        if (!str.startsWith("https")) {
            str = C0531c.a("https://api.aliyundrive.com/", str);
        }
        HashMap<String, String> mapE = e();
        mapE.put("x-share-token", kVar.c());
        mapE.put("X-Canary", "client=Android,app=adrive,version=v4.3.1");
        C0577d c0577dF = C0575b.f(str, jsonObject.toString(), mapE);
        return (bool.booleanValue() && c0577dF.b() == 429) ? r(str, jsonObject, kVar, Boolean.FALSE) : c0577dF.a();
    }

    public final HashMap<String, String> e() {
        return C0544h.c("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) aDrive/6.1.0 Chrome/112.0.5615.165 Electron/24.1.3.7 Safari/537.36", "Referer", "https://www.aliyundrive.com/");
    }

    public final File f() {
        return C0602k.b("aliyun");
    }

    public final C0558b g() {
        C0558b c0558b = (C0558b) new Gson().fromJson(C0602k.a(f()), C0558b.class);
        return c0558b == null ? new C0558b() : c0558b;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public final String h(String str, String str2) {
        final int i = 0;
        try {
            try {
                if (!TextUtils.isEmpty(str)) {
                    u(str);
                    str2 = c(str, str2);
                    this.a.add(0, str2);
                }
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("file_id", str2);
                jsonObject.addProperty("expire_sec", 115200);
                jsonObject.addProperty("drive_id", g().a().a());
                HashMap<String, String> mapE = e();
                mapE.put("authorization", g().c().a());
                mapE.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36");
                mapE.put("Referer", "https://www.aliyundrive.com/");
                mapE.put("Content-Type", "application/json; charset=utf-8");
                String strA = C0575b.f("https://bj29.api.aliyunpds.com/v2/file/get_download_url", jsonObject.toString(), mapE).a();
                SpiderDebug.log("json:" + strA);
                if (!strA.contains("AccessTokenExpired") && !strA.contains("TokenVerifyFailed") && !strA.contains("AccessTokenInvalid")) {
                    String strA2 = ((com.github.catvod.spider.merge.d.e) new Gson().fromJson(strA, com.github.catvod.spider.merge.d.e.class)).a();
                    if (!TextUtils.isEmpty(str)) {
                        Init.execute(new RunnableC0543g(this, i));
                    }
                    return strA2;
                }
                String strH = p() ? h(str, str2) : "";
                if (!TextUtils.isEmpty(str)) {
                    Init.execute(new RunnableC0539c(this, i));
                }
                return strH;
            } catch (Exception e) {
                e.printStackTrace();
                if (!TextUtils.isEmpty(str)) {
                    Init.execute(new RunnableC0540d(this, 0));
                }
                return "";
            }
        } catch (Throwable th) {
            if (!TextUtils.isEmpty(str)) {
                Init.execute(new Runnable() { // from class: com.github.catvod.spider.merge.b.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                C0545i.a((C0545i) this);
                                break;
                            default:
                                ((MainActivity) this).i();
                                break;
                        }
                    }
                });
            }
            throw th;
        }
    }

    public final boolean i() {
        HashMap<String, String> mapE = e();
        mapE.put("authorization", g().c().a());
        mapE.put("X-Canary", "client=Android,app=adrive,version=v4.3.1");
        com.github.catvod.spider.merge.d.f fVar = (com.github.catvod.spider.merge.d.f) new Gson().fromJson(C0575b.f("https://user.aliyundrive.com/v2/user/get", "{}", mapE).a(), com.github.catvod.spider.merge.d.f.class);
        if (fVar == null) {
            fVar = new com.github.catvod.spider.merge.d.f();
        }
        if (fVar.a().isEmpty()) {
            return false;
        }
        g().e(fVar);
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public final List j(String str, String str2) {
        List arrayList = new ArrayList();
        final int i = 0;
        int i2 = 1;
        try {
            try {
                if (!TextUtils.isEmpty(str)) {
                    u(str);
                    str2 = c(str, str2);
                    this.a.add(0, str2);
                }
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("file_id", str2);
                jsonObject.addProperty("category", "live_transcoding");
                jsonObject.addProperty("drive_id", g().a().a());
                HashMap<String, String> mapE = e();
                mapE.put("authorization", g().b().a());
                mapE.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36");
                mapE.put("Referer", "https://www.aliyundrive.com/");
                mapE.put("Content-Type", "application/json; charset=utf-8");
                String strA = C0575b.f("https://open.aliyundrive.com/adrive/v1.0/openFile/getVideoPreviewPlayInfo", jsonObject.toString(), mapE).a();
                if (!strA.contains("AccessTokenExpired") && !strA.contains("TokenVerifyFailed") && !strA.contains("AccessTokenInvalid")) {
                    List<i.b> listA = ((com.github.catvod.spider.merge.d.i) new Gson().fromJson(strA, com.github.catvod.spider.merge.d.i.class)).a().a();
                    ArrayList arrayList2 = new ArrayList();
                    for (int size = listA.size() - 1; size >= 0; size--) {
                        if (!TextUtils.isEmpty(listA.get(size).b())) {
                            arrayList2.add(listA.get(size).a());
                            arrayList2.add(listA.get(size).b());
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        arrayList3.add((String) arrayList2.get(i3));
                    }
                    if (!TextUtils.isEmpty(str)) {
                        Init.execute(new RunnableC0542f(this, i));
                    }
                    return arrayList3;
                }
                if (p()) {
                    arrayList = j(str, str2);
                }
                if (!TextUtils.isEmpty(str)) {
                    Init.execute(new Runnable() { // from class: com.github.catvod.spider.merge.b.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i) {
                                case 0:
                                    C0545i.a((C0545i) this);
                                    break;
                                default:
                                    ((MainActivity) this).getClass();
                                    try {
                                        MainActivity.q(Init.getConfigActivity());
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                        return;
                                    }
                                    break;
                            }
                        }
                    });
                }
                return arrayList;
            } catch (Exception e) {
                e.printStackTrace();
                if (!TextUtils.isEmpty(str)) {
                    Init.execute(new Runnable() { // from class: com.github.catvod.spider.merge.b.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i) {
                                case 0:
                                    C0545i.a((C0545i) this);
                                    break;
                                default:
                                    ((MainActivity) this).n();
                                    break;
                            }
                        }
                    });
                }
                return arrayList;
            }
        } catch (Throwable th) {
            if (!TextUtils.isEmpty(str)) {
                Init.execute(new RunnableC0539c(this, i2));
            }
            throw th;
        }
    }

    public final C0554e k(String str, String str2) {
        u(str);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("share_id", str);
        com.github.catvod.spider.merge.d.k kVarD = com.github.catvod.spider.merge.d.k.d(q("adrive/v3/share_link/get_share_by_anonymous", jsonObject));
        ArrayList<com.github.catvod.spider.merge.d.g> arrayList = new ArrayList();
        n(str, new com.github.catvod.spider.merge.d.g(TextUtils.isEmpty(str2) ? "root" : str2), arrayList, "");
        Collections.sort(arrayList);
        List<String> aliOptions = Config.getAliOptions();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (com.github.catvod.spider.merge.d.g gVar : arrayList) {
            arrayList2.add(gVar.b() + "$" + (gVar.b() + "_" + gVar.c()) + Marker.ANY_NON_NULL_MARKER + str);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add("当前分享链接下无视频文件$0+" + str);
        }
        for (int i = 0; i < aliOptions.size(); i++) {
            arrayList3.add(TextUtils.join("#", arrayList2));
        }
        C0554e c0554e = new C0554e();
        c0554e.j(str);
        c0554e.h(str + "/" + str2);
        c0554e.l("https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/50zE/1200X800/aliyun.jpg");
        c0554e.k(kVarD.b());
        c0554e.n(TextUtils.join("$$$", arrayList3));
        c0554e.m(TextUtils.join("$$$", aliOptions));
        return c0554e;
    }

    public final com.github.catvod.spider.merge.d.g l(String str, com.github.catvod.spider.merge.d.g gVar, String str2) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("limit", 200);
        jsonObject.addProperty("share_id", str);
        jsonObject.addProperty("parent_file_id", gVar.c());
        jsonObject.addProperty("order_by", "name");
        jsonObject.addProperty("order_direction", "ASC");
        if (str2.length() > 0) {
            jsonObject.addProperty("marker", str2);
        }
        return (com.github.catvod.spider.merge.d.g) new Gson().fromJson(r("adrive/v3/file/list", jsonObject, this.b, Boolean.TRUE), com.github.catvod.spider.merge.d.g.class);
    }

    public final void m(String str, com.github.catvod.spider.merge.d.g gVar, List<com.github.catvod.spider.merge.d.g> list) {
        n(str, gVar, list, "");
    }

    public final String o(String str) {
        try {
            String strA = g().a().a();
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("drive_id", strA);
            jsonObject.addProperty("file_id", str);
            HashMap map = new HashMap();
            map.put("Authorization", g().c().a());
            String strA2 = C0575b.f("https://api.aliyundrive.com/adrive/v1/file/get_path", jsonObject.toString(), map).a();
            if (!strA2.contains("AccessTokenExpired") && !strA2.contains("TokenVerifyFailed") && !strA2.contains("AccessTokenInvalid")) {
                return new JSONObject(strA2).getJSONArray("items").getJSONObject(0).optString("parent_file_id");
            }
            return t() ? o(str) : "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public final boolean p() {
        String strB = g().b().b();
        if (!strB.isEmpty()) {
            try {
                HashMap map = new HashMap();
                map.put("Cookie", "driver_txt=alicloud_go; server_use=true");
                String strL = C0575b.l("https://api.oplist.org/alicloud/renewapi?client_uid=&client_key=&driver_txt=alicloud_go&server_use=true&refresh_ui=" + strB, map);
                if (q(strL)) {
                    return true;
                }
                com.github.catvod.spider.merge.d.h hVarD = com.github.catvod.spider.merge.d.h.d(strL);
                if (hVarD.d()) {
                    g().f(hVarD);
                }
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("authorize", 1);
        jsonObject.addProperty("scope", "user:base,file:all:read,file:all:write");
        try {
            String str = "https://api.oplist.org/alicloud/callback?code=" + ((C0559c) new Gson().fromJson(b("https://open.aliyundrive.com/oauth/users/authorize?client_id=c78079b71f42427b8c899f81fbe36961&redirect_uri=https%3A%2F%2Fapi.oplist.org%2Falicloud%2Fcallback&scope=user:base,file:all:read,file:all:write&response_type=code", jsonObject.toString(), true), C0559c.class)).a();
            HashMap map2 = new HashMap();
            map2.put("Cookie", "driver_txt=alicloud_go; server_use=true");
            String str2 = new String(Base64.decode(C0575b.a(str, map2).split("#")[1], 2));
            if (q(str2)) {
                return true;
            }
            com.github.catvod.spider.merge.d.h hVarD2 = com.github.catvod.spider.merge.d.h.d(str2);
            if (hVarD2.d()) {
                g().f(hVarD2);
            }
            return true;
        } catch (Exception e2) {
            return false;
        }
    }

    public String q(String[] strArr, String str) {
        String str2 = strArr.length > 1 ? strArr[1] : "";
        String str3 = strArr[0];
        if (str3.contains("_")) {
            String[] strArrSplit = str3.split("_");
            C0603l.c("danmuvodindex", strArrSplit[0]);
            str3 = strArrSplit[1];
        }
        int iLastIndexOf = str3.lastIndexOf("_");
        String strSubstring = iLastIndexOf > -1 ? str3.substring(iLastIndexOf + 1) : str3;
        if (strSubstring == null) {
            strSubstring = str3;
        }
        if (!g().c().d()) {
            C0590I.i("还未登录阿里账号,请前往【配置中心】登录");
            return C0552c.l("还未登录阿里账号,请前往【配置中心】登录");
        }
        String str4 = str.split("#")[0];
        String str5 = Proxy.getUrl() + "?do=danmu&site=wangpan";
        if (str4.contains("原画")) {
            C0552c c0552cE = new C0552c().u(com.github.catvod.spider.merge.F.a.a("ali", str2, strSubstring, "")).h().e((Map<String, String>) e());
            c0552cE.a(str5);
            return c0552cE.toString();
        }
        C0552c c0552cE2 = new C0552c().v(j(str2, strSubstring)).g().e((Map<String, String>) e());
        c0552cE2.a(str5);
        return c0552cE2.toString();
    }

    public final boolean s() {
        String strC = g().c().c();
        if (TextUtils.isEmpty(strC)) {
            return false;
        }
        return t(strC);
    }

    public final boolean t() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("refresh_token", g().c().c());
        jsonObject.addProperty("grant_type", "refresh_token");
        com.github.catvod.spider.merge.d.l lVar = (com.github.catvod.spider.merge.d.l) new Gson().fromJson(q("https://auth.aliyundrive.com/v2/account/token", jsonObject), com.github.catvod.spider.merge.d.l.class);
        if (lVar == null) {
            lVar = new com.github.catvod.spider.merge.d.l();
        }
        if (!lVar.d()) {
            return false;
        }
        g().g(lVar);
        return true;
    }

    public final boolean t(String str) {
        JsonObject jsonObject = new JsonObject();
        if (str.startsWith("http")) {
            str = C0575b.l(str, null).trim();
        }
        jsonObject.addProperty("refresh_token", str);
        jsonObject.addProperty("grant_type", "refresh_token");
        com.github.catvod.spider.merge.d.l lVar = (com.github.catvod.spider.merge.d.l) new Gson().fromJson(q("https://auth.aliyundrive.com/v2/account/token", jsonObject), com.github.catvod.spider.merge.d.l.class);
        if (lVar == null) {
            lVar = new com.github.catvod.spider.merge.d.l();
        }
        if (!lVar.d()) {
            return false;
        }
        g().g(lVar);
        p();
        i();
        C0558b c0558bG = g();
        return c0558bG.c().d() && c0558bG.b().c() && !c0558bG.a().a().isEmpty();
    }

    public final void u(String str) {
        com.github.catvod.spider.merge.d.k kVar = this.b;
        if (kVar == null || !kVar.a(str)) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("share_id", str);
            jsonObject.addProperty("share_pwd", "");
            com.github.catvod.spider.merge.d.k kVarD = com.github.catvod.spider.merge.d.k.d(q("v2/share_link/get_share_token", jsonObject));
            kVarD.e(str);
            kVarD.f();
            this.b = kVarD;
            if (kVarD.c().isEmpty()) {
                C0590I.i("来晚了，分享已经失效!");
            }
        }
    }

    public final void v(String str, String str2) {
        com.github.catvod.spider.merge.d.k kVar = this.b;
        if (kVar == null || !kVar.a(str)) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("share_id", str);
            jsonObject.addProperty("share_pwd", str2);
            com.github.catvod.spider.merge.d.k kVarD = com.github.catvod.spider.merge.d.k.d(q("v2/share_link/get_share_token", jsonObject));
            kVarD.e(str);
            kVarD.f();
            this.b = kVarD;
            if (kVarD.c().isEmpty()) {
                C0590I.i("来晚了，分享已经失效!");
            }
        }
    }

    public final String w(String str, String str2) {
        try {
            u(str);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("drive_id", "");
            jsonObject.addProperty("share_id", str);
            jsonObject.addProperty("file_id", str2);
            jsonObject.addProperty("fields", Marker.ANY_MARKER);
            return new JSONObject(r("adrive/v2/file/get_by_share", jsonObject, this.b, Boolean.TRUE)).optString("parent_file_id");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public final boolean x(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            File file = new File(new File(Environment.getExternalStorageDirectory(), "TVBox"), "diy_cookie.txt");
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            JSONObject jSONObject = new JSONObject();
            if (file.exists()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                }
                bufferedReader.close();
                inputStreamReader.close();
                fileInputStream.close();
                jSONObject = new JSONObject(sb.toString());
            }
            jSONObject.put("123panfx_cookie", str);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
            outputStreamWriter.write(jSONObject.toString());
            outputStreamWriter.close();
            fileOutputStream.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
