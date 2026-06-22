package com.github.catvod.spider.merge.I;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.utils.server.Server;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.I.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0783y {
    private final Object a;
    private final Object b;

    public /* synthetic */ C0783y() {
        this.a = new OkHttpClient.Builder().build();
        this.b = new Gson();
    }

    public /* synthetic */ C0783y(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r11, java.util.List r12) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.I.C0783y.a(java.lang.String, java.util.List):java.lang.String");
    }

    public static C0783y b(String str) {
        return new C0783y(null, str);
    }

    public static C0783y c() {
        return C0782x.a;
    }

    private Map f() {
        HashMap mapB = com.github.catvod.spider.merge.B.e.b("User-Agent", "netdisk;1.4.2;22021211RC;android-android;12;JSbridge4.4.0;jointBridge;1.1.0;", "Accept", "application/json, text/plain, */*");
        mapB.put("Origin", "https://pan.baidu.com");
        mapB.put("Referer", "https://pan.baidu.com/disk/main");
        String strB = C0780v.a.b.b();
        if (com.github.catvod.spider.merge.P0.e.d(strB)) {
            mapB.put("Cookie", strB);
        }
        return mapB;
    }

    private void i(String str, int i, List list, List list2) {
        StringBuilder sbB = t0.b("https://pan.baidu.com/api/list?clienttype=0&app_id=250528&web=1&order=time&desc=1&dir=");
        sbB.append(URLEncoder.encode(str, "UTF-8"));
        sbB.append("&num=100&page=");
        sbB.append(i);
        Response responseExecute = ((OkHttpClient) this.a).newCall(new Request.Builder().url(sbB.toString()).headers(Headers.of(f())).build()).execute();
        try {
            if (!responseExecute.isSuccessful()) {
                responseExecute.close();
                return;
            }
            JsonObject asJsonObject = JsonParser.parseString(responseExecute.body().string()).getAsJsonObject();
            if (asJsonObject.get("errno").getAsInt() != 0) {
                responseExecute.close();
                return;
            }
            JsonArray asJsonArray = asJsonObject.getAsJsonArray("list");
            if (asJsonArray != null && asJsonArray.size() != 0) {
                Iterator it = asJsonArray.iterator();
                while (it.hasNext()) {
                    JsonObject asJsonObject2 = ((JsonElement) it.next()).getAsJsonObject();
                    int asInt = asJsonObject2.get("isdir").getAsInt();
                    String asString = asJsonObject2.get("server_filename").getAsString();
                    if (asInt == 1) {
                        if (list != null) {
                            list.add(asJsonObject2);
                        }
                    } else if (com.github.catvod.spider.merge.P0.e.d(com.github.catvod.spider.merge.i0.m.m(asString.toLowerCase()))) {
                        list2.add(asJsonObject2);
                    }
                }
                if (asJsonArray.size() == 100) {
                    i(str, i + 1, list, list2);
                }
                responseExecute.close();
                return;
            }
            responseExecute.close();
        } catch (Throwable th) {
            if (responseExecute != null) {
                try {
                    responseExecute.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    public static C0783y k(Object obj) {
        return new C0783y(obj, null);
    }

    public final Object d() {
        if (((String) this.b) == null) {
            return this.a;
        }
        throw new RuntimeException((String) this.b);
    }

    public final String e(String str) {
        Response responseExecute;
        try {
            responseExecute = ((OkHttpClient) this.a).newCall(new Request.Builder().url(HttpUrl.parse("https://pan.baidu.com/api/filemetas").newBuilder().addQueryParameter("dlink", "1").addQueryParameter("web", "5").addQueryParameter("origin", "dlna").addEncodedQueryParameter("target", URLEncoder.encode("[\"" + str + "\"]", "UTF-8")).build()).headers(Headers.of(f())).build()).execute();
            try {
            } catch (Throwable th) {
                if (responseExecute != null) {
                    try {
                        responseExecute.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            SpiderDebug.log("BaiduSelfApi getDownloadUrl error:" + e);
        }
        if (!responseExecute.isSuccessful()) {
            responseExecute.close();
            return "";
        }
        JsonObject asJsonObject = JsonParser.parseString(responseExecute.body().string()).getAsJsonObject();
        if (asJsonObject.get("errno").getAsInt() != 0) {
            responseExecute.close();
            return "";
        }
        if (asJsonObject.has("info")) {
            JsonElement jsonElement = asJsonObject.get("info");
            if (jsonElement.isJsonArray()) {
                JsonArray asJsonArray = jsonElement.getAsJsonArray();
                if (asJsonArray.size() > 0) {
                    String asString = asJsonArray.get(0).getAsJsonObject().get("dlink").getAsString();
                    responseExecute.close();
                    return asString;
                }
            } else {
                if (jsonElement.isJsonObject()) {
                    String asString2 = jsonElement.getAsJsonObject().get("dlink").getAsString();
                    responseExecute.close();
                    return asString2;
                }
                if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isString()) {
                    JsonObject asJsonObject2 = JsonParser.parseString(jsonElement.getAsString()).getAsJsonObject();
                    if (asJsonObject2.has("dlink")) {
                        String asString3 = asJsonObject2.get("dlink").getAsString();
                        responseExecute.close();
                        return asString3;
                    }
                }
            }
        }
        responseExecute.close();
        return "";
    }

    public final List g(com.github.catvod.bean.j jVar) {
        if (!NetPan.isBaidu("")) {
            return null;
        }
        String strB = com.github.catvod.spider.merge.P0.e.b(jVar.b()) ? "/" : jVar.b();
        SpiderDebug.log("BaiduSelfApi getVodFolder path=" + strB);
        ArrayList<JsonObject> arrayList = new ArrayList();
        ArrayList<JsonObject> arrayList2 = new ArrayList();
        try {
        } catch (Exception e) {
            SpiderDebug.log("BaiduSelfApi getVodFolder error:" + e);
        }
        if (com.github.catvod.spider.merge.P0.e.c(C0780v.a.b.b())) {
            com.github.catvod.spider.merge.i0.m.w("请先登录百度网盘");
            return new ArrayList();
        }
        i(strB, 1, arrayList2, arrayList);
        ArrayList arrayList3 = new ArrayList();
        for (JsonObject jsonObject : arrayList2) {
            com.github.catvod.bean.VodItem iVar = new com.github.catvod.bean.VodItem();
            StringBuilder sbB = t0.b("selfbaidu*#");
            sbB.append(jsonObject.get("path").getAsString());
            iVar.l(sbB.toString());
            iVar.m(jsonObject.get("server_filename").getAsString());
            iVar.r("folder");
            arrayList3.add(iVar);
        }
        for (JsonObject jsonObject2 : arrayList) {
            com.github.catvod.bean.VodItem iVar2 = new com.github.catvod.bean.VodItem();
            iVar2.l("selfbaidu_" + strB + "*#" + jsonObject2.get("server_filename").getAsString());
            iVar2.m(jsonObject2.get("server_filename").getAsString());
            iVar2.r("file");
            arrayList3.add(iVar2);
        }
        return arrayList3;
    }

    public final boolean h() {
        return ((String) this.b) == null;
    }

    public final String j(String str) {
        String isoDownloadUrl;
        try {
            if (BaseApi.isOk("selfbaidu")) {
                return "";
            }
            String[] strArrSplit = str.split("\\+");
            String strE = C0782x.a.e(strArrSplit[1]);
            C0781w c0781w = C0780v.a;
            c0781w.getClass();
            HashMap map = new HashMap();
            map.put("User-Agent", "netdisk;1.4.2;22021211RC;android-android;12;JSbridge4.4.0;jointBridge;1.1.0;");
            map.put("Url", strE);
            map.put("Cookie", c0781w.b.b());
            BaseApi.get().h.put(com.github.catvod.spider.merge.i0.m.c(strE), new Gson().toJson(map));
            String strZ = Server.z(strE, C0780v.a.b.a().intValue(), com.github.catvod.spider.merge.N.c.a().intValue());
            if (BaseApi.get().d.booleanValue()) {
                String str2 = strArrSplit[2] + strArrSplit[3];
                BaseApi.get().downloadFileWithDownloadManager(strZ, str2, map);
                com.github.catvod.spider.merge.i0.m.w("正在下载 " + str2);
                isoDownloadUrl = Server.B();
            } else {
                isoDownloadUrl = NetPan.getIsoDownloadUrl(strZ);
            }
            com.github.catvod.bean.g gVar = new com.github.catvod.bean.g();
            gVar.w(isoDownloadUrl);
            gVar.i();
            gVar.a(C0773p.a.t(strArrSplit));
            gVar.g(map);
            return gVar.toString();
        } catch (Exception unused) {
            return "";
        }
    }
}
