package com.github.catvod.spider.merge.I;

import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.Proxy;
import com.github.catvod.utils.server.Server;
import com.google.gson.Gson;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class J0 {
    private static final Pattern g = Pattern.compile("https://(?:www\\.123684\\.com|www\\.123865\\.com|www\\.123912\\.com|www\\.123pan\\.com|www\\.123pan\\.cn|www\\.123592\\.com)/s/([^/?]+)");
    public static final /* synthetic */ int h = 0;
    public final Map<String, String> a = new ConcurrentHashMap();
    private final OkHttpClient b = com.github.catvod.spider.merge.f0.d.a();
    private String c;
    private String d;
    private String e;
    public com.github.catvod.spider.merge.R.c f;

    public J0() {
        try {
            com.github.catvod.spider.merge.R.c cVar = (com.github.catvod.spider.merge.R.c) new Gson().fromJson(com.github.catvod.spider.merge.g.b.d(com.github.catvod.spider.merge.g.b.f("p123_user")), com.github.catvod.spider.merge.R.c.class);
            this.f = cVar == null ? new com.github.catvod.spider.merge.R.c() : cVar;
        } catch (Exception unused) {
            com.github.catvod.spider.merge.i0.m.w("p123授权初始化失败，请删除根目录TV文件夹下授权文件后重试");
        }
    }

    public static J0 a() {
        return H0.a;
    }

    private C0783y e(String str, List list) {
        try {
            Response responseExecute = this.b.newCall(new Request.Builder().url(HttpUrl.parse("https://www.123684.com/b/api/share/get").newBuilder().addQueryParameter("limit", "10000").addQueryParameter("next", String.valueOf(0)).addQueryParameter("orderBy", "file_name").addQueryParameter("orderDirection", "asc").addQueryParameter("shareKey", str).addQueryParameter("SharePwd", this.d).addQueryParameter("ParentFileId", String.valueOf(0)).addQueryParameter("Page", "1").build()).get().build()).execute();
            try {
                if (!responseExecute.isSuccessful()) {
                    C0783y c0783yB = C0783y.b("HTTP error: " + responseExecute.code());
                    responseExecute.close();
                    return c0783yB;
                }
                JSONObject jSONObject = new JSONObject(responseExecute.body().string()).getJSONObject("data");
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArray = jSONObject.getJSONArray("InfoList");
                this.e = jSONArray.getJSONObject(0).getString("FileName");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    if (jSONObject2.getInt("Category") == 0) {
                        long j = jSONObject2.getLong("FileId");
                        jSONObject.getInt("Next");
                        arrayList.add(new I0(str, j));
                    } else if (BaseApi.get().d.booleanValue() || com.github.catvod.spider.merge.P0.e.d(com.github.catvod.spider.merge.i0.m.m(jSONObject2.getString("FileName")))) {
                        list.add((com.github.catvod.spider.merge.R.a) new Gson().fromJson(jSONObject2.toString(), com.github.catvod.spider.merge.R.a.class));
                    }
                }
                if (!list.isEmpty()) {
                    Collections.sort(list, new com.github.catvod.spider.merge.R.b());
                }
                C0783y c0783yK = C0783y.k(arrayList);
                responseExecute.close();
                return c0783yK;
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
            StringBuilder sbB = t0.b("Failed to get share info: ");
            sbB.append(e.getMessage());
            return C0783y.b(sbB.toString());
        }
    }

    private C0783y f(String str, long j, Integer num) {
        try {
            Response responseExecute = this.b.newCall(new Request.Builder().url(HttpUrl.parse("https://www.123684.com/b/api/share/get").newBuilder().addQueryParameter("limit", "100").addQueryParameter("next", "0").addQueryParameter("orderBy", "file_name").addQueryParameter("orderDirection", "asc").addQueryParameter("shareKey", str).addQueryParameter("SharePwd", this.d).addQueryParameter("ParentFileId", String.valueOf(j)).addQueryParameter("Page", String.valueOf(num)).build()).get().build()).execute();
            try {
                if (!responseExecute.isSuccessful()) {
                    C0783y c0783yB = C0783y.b("HTTP error: " + responseExecute.code());
                    responseExecute.close();
                    return c0783yB;
                }
                com.github.catvod.spider.merge.R.a aVar = (com.github.catvod.spider.merge.R.a) new Gson().fromJson(new JSONObject(responseExecute.body().string()).getJSONObject("data").toString(), com.github.catvod.spider.merge.R.a.class);
                if (aVar.d().isEmpty()) {
                    C0783y c0783yB2 = C0783y.b(" file list isEmpty");
                    responseExecute.close();
                    return c0783yB2;
                }
                Collections.sort(aVar.d(), new com.github.catvod.spider.merge.R.b());
                ArrayList arrayList = new ArrayList();
                for (com.github.catvod.spider.merge.R.a aVar2 : aVar.d()) {
                    if (aVar2.i().equals("file") && (BaseApi.get().d.booleanValue() || com.github.catvod.spider.merge.P0.e.d(com.github.catvod.spider.merge.i0.m.m(aVar2.e())))) {
                        arrayList.add(aVar2);
                    } else if (aVar2.i().equals("folder")) {
                        for (int i = 1; i < Integer.MAX_VALUE; i++) {
                            C0783y c0783yF = f(str, aVar2.c().longValue(), Integer.valueOf(i));
                            if (!c0783yF.h()) {
                                break;
                            }
                            arrayList.addAll((Collection) c0783yF.d());
                        }
                    }
                }
                C0783y c0783yK = C0783y.k(arrayList);
                responseExecute.close();
                return c0783yK;
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
            StringBuilder sbB = t0.b("Failed to get file list: ");
            sbB.append(e.getMessage());
            return C0783y.b(sbB.toString());
        }
    }

    public final C0783y b(String str, long j, String str2, long j2, String str3) {
        String str4;
        try {
            h();
            Response responseExecute = this.b.newCall(new Request.Builder().url("https://www.123684.com/b/api/share/download/info").post(RequestBody.create(MediaType.parse("application/json"), new JSONObject().put("ShareKey", str).put("FileID", j).put("S3KeyFlag", str2).put("Size", j2).put("Etag", str3).toString())).addHeader("Authorization", "Bearer " + this.f.c()).addHeader("User-Agent", "Mozilla/5.0").addHeader("platform", "android").build()).execute();
            try {
                if (!responseExecute.isSuccessful()) {
                    SpiderDebug.log(responseExecute.body().string());
                    C0783y c0783yB = C0783y.b("HTTP error: " + responseExecute.code());
                    responseExecute.close();
                    return c0783yB;
                }
                String[] strArrSplit = new JSONObject(responseExecute.body().string()).getJSONObject("data").getString("DownloadURL").split("\\?")[1].split("&");
                int length = strArrSplit.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        str4 = null;
                        break;
                    }
                    String[] strArrSplit2 = strArrSplit[i].split("=");
                    if (strArrSplit2[0].equals("params")) {
                        str4 = strArrSplit2[1];
                        break;
                    }
                    i++;
                }
                C0783y c0783yK = C0783y.k(new String(Base64.decode(URLDecoder.decode(str4, "UTF-8"), 0)));
                responseExecute.close();
                return c0783yK;
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
            SpiderDebug.log(e);
            return C0783y.b("Download failed: " + e.getMessage());
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.concurrent.ConcurrentHashMap] */
    public final String c(String str, String str2) {
        try {
            return (String) H0.a.a.get(str + str2);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public final C0783y d(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            for (I0 i0 : (List) e(str, arrayList).d()) {
                for (int i = 0; i < Integer.MAX_VALUE; i++) {
                    C0783y c0783yF = f(i0.a, i0.b, Integer.valueOf(i));
                    if (!c0783yF.h()) {
                        break;
                    }
                    arrayList.addAll((Collection) c0783yF.d());
                }
            }
            return C0783y.k(arrayList);
        } catch (Exception e) {
            StringBuilder sbB = t0.b("Failed to get files: ");
            sbB.append(e.getMessage());
            return C0783y.b(sbB.toString());
        }
    }

    public final com.github.catvod.spider.merge.K.VodItem g(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("p123原畫");
        if (NetPan.containPuHua()) {
            arrayList.add("p123普畫");
        }
        try {
            String str2 = (String) H0.a.i(str).d();
            com.github.catvod.spider.merge.K.VodItem iVar = new com.github.catvod.spider.merge.K.VodItem();
            List<com.github.catvod.spider.merge.R.a> list = (List) H0.a.d(str2).d();
            ArrayList arrayList2 = new ArrayList();
            for (com.github.catvod.spider.merge.R.a aVar : list) {
                if (com.github.catvod.spider.merge.P0.e.d(com.github.catvod.spider.merge.i0.m.m(aVar.e()))) {
                    arrayList2.add(aVar);
                }
            }
            SpiderDebug.log("Comparator.comparing");
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (int i = 0; i < arrayList2.size(); i++) {
                com.github.catvod.spider.merge.R.a aVar2 = (com.github.catvod.spider.merge.R.a) arrayList2.get(i);
                arrayList3.add(aVar2.a() + "$" + str2 + "+" + this.d + "+" + com.github.catvod.spider.merge.i0.m.y(this.e) + "+" + aVar2.e() + "+" + aVar2.b() + "+" + aVar2.c() + "+" + aVar2.f() + "+" + aVar2.g());
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb.append((CharSequence) it.next());
                        if (it.hasNext()) {
                            sb.append((CharSequence) "#");
                        }
                    }
                }
                arrayList4.add(sb.toString());
            }
            iVar.l(str);
            iVar.j(str);
            iVar.n("https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/c3/2b/fa/c32bfa72-c460-e1a4-d8a1-ba175f59bbce/AppIcon-0-0-1x_U007emarketing-0-8-0-85-220.png/350x350.png");
            iVar.m(com.github.catvod.spider.merge.i0.m.y(this.e));
            StringBuilder sb2 = new StringBuilder();
            Iterator it2 = arrayList4.iterator();
            if (it2.hasNext()) {
                while (true) {
                    sb2.append((CharSequence) it2.next());
                    if (!it2.hasNext()) {
                        break;
                    }
                    sb2.append((CharSequence) "$$$");
                }
            }
            iVar.p(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            Iterator it3 = arrayList.iterator();
            if (it3.hasNext()) {
                while (true) {
                    sb3.append((CharSequence) it3.next());
                    if (!it3.hasNext()) {
                        break;
                    }
                    sb3.append((CharSequence) "$$$");
                }
            }
            iVar.o(sb3.toString());
            iVar.g("p123");
            return iVar;
        } catch (Exception e) {
            com.github.catvod.spider.merge.i0.m.w(e.getMessage());
            return BaseApi.fakeVod(arrayList, "p123");
        }
    }

    public final C0783y h() {
        C0783y c0783yK;
        try {
            if (Long.parseLong(this.f.b()) > System.currentTimeMillis() / 1000) {
                return C0783y.k("");
            }
        } catch (Exception unused) {
        }
        try {
            String strD = this.f.d();
            String strE = this.f.e();
            if (strD != null && strE != null) {
                Response responseExecute = this.b.newCall(new Request.Builder().url("https://login.123pan.com/api/user/sign_in").post(RequestBody.create(MediaType.parse("application/json"), new JSONObject().put("passport", strD).put("password", strE).put("remember", true).toString())).addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Safari/537.36").addHeader("Content-Type", "application/json").addHeader("App-Version", "43").addHeader("Referer", "https://login.123pan.com/centerlogin?redirect_url=https%3A%2F%2Fwww.123684.com&source_page=website").build()).execute();
                try {
                    if (responseExecute.isSuccessful()) {
                        JSONObject jSONObject = new JSONObject(responseExecute.body().string());
                        if (jSONObject.getInt("code") == 200) {
                            this.f.h(jSONObject.getJSONObject("data").getString("token"));
                            this.f.g(jSONObject.getJSONObject("data").getString("refresh_token_expire_time"));
                            this.f.f();
                        }
                        c0783yK = C0783y.k("");
                    } else {
                        c0783yK = C0783y.b("HTTP error: " + responseExecute.code());
                    }
                    responseExecute.close();
                    return c0783yK;
                } catch (Throwable th) {
                    if (responseExecute != null) {
                        try {
                            responseExecute.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    throw th;
                }
            }
            return C0783y.b("Credentials not found");
        } catch (Exception e) {
            StringBuilder sbB = t0.b("Login failed: ");
            sbB.append(e.getMessage());
            return C0783y.b(sbB.toString());
        }
    }

    public final C0783y i(String str) {
        String strGroup;
        try {
            String strReplace = str.replace("//123", "//www.123");
            Matcher matcher = g.matcher(strReplace);
            if (!matcher.find()) {
                return C0783y.b("Invalid share URL");
            }
            Matcher matcher2 = Pattern.compile("([A-Za-z0-9-]+)").matcher(matcher.group(1));
            if (matcher2.find()) {
                this.c = matcher2.group(1);
            }
            String strReplace2 = strReplace.replace("pwd=", "提取码:");
            int iIndexOf = strReplace2.indexOf("提取码");
            if (iIndexOf != -1) {
                Matcher matcher3 = Pattern.compile("([A-Za-z0-9]+)").matcher(strReplace2.substring(iIndexOf + 1));
                strGroup = matcher3.find() ? matcher3.group(1) : "";
                return C0783y.k(this.c);
            }
            this.d = strGroup;
            return C0783y.k(this.c);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.concurrent.ConcurrentHashMap] */
    public final String j(String[] strArr) {
        String isoDownloadUrl;
        try {
            if (!this.a.containsKey(strArr[0] + strArr[5])) {
                String str = (String) b(strArr[0], Long.parseLong(strArr[5]), strArr[6], Long.parseLong(strArr[7]), strArr[4]).d();
                SpiderDebug.log("p123 playerContent:" + str);
                this.a.put(strArr[0] + strArr[5], str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String strC = c(strArr[0], strArr[5]);
        if (BaseApi.get().d.booleanValue()) {
            String str2 = strArr[2] + strArr[3];
            BaseApi.get().downloadFileWithDownloadManager(strC, str2, com.github.catvod.spider.merge.f0.d.b());
            com.github.catvod.spider.merge.i0.m.w("正在下载 " + str2);
            isoDownloadUrl = Server.B();
        } else {
            isoDownloadUrl = NetPan.getIsoDownloadUrl(strC);
        }
        com.github.catvod.spider.merge.K.g gVar = new com.github.catvod.spider.merge.K.g();
        gVar.w(isoDownloadUrl);
        gVar.i();
        gVar.a(C0773p.a.t(strArr));
        gVar.g(com.github.catvod.spider.merge.f0.d.b());
        ArrayList arrayList = new ArrayList();
        for (String str3 : strArr) {
            if (str3.contains("@@@")) {
                String[] strArrSplit = str3.split("@@@");
                String str4 = strArrSplit[0];
                String str5 = strArrSplit[1];
                String str6 = Proxy.getUrl() + "?do=ali&type=sub&shareId=" + strArr[0] + "&fileId=" + strArrSplit[2];
                com.github.catvod.spider.merge.K.h hVar = new com.github.catvod.spider.merge.K.h();
                hVar.b(str4);
                com.github.catvod.spider.merge.K.h hVarA = hVar.a(str5);
                hVarA.c(str6);
                arrayList.add(hVarA);
            }
        }
        gVar.v(arrayList);
        return gVar.toString();
    }

    public final void k(String str, boolean z) {
        if (com.github.catvod.spider.merge.P0.e.c(this.f.d()) || z) {
            com.github.catvod.spider.merge.B.h.b("set new UserName:", str);
            if (str != null && str.startsWith("http")) {
                str = com.github.catvod.spider.merge.f0.d.l(str).trim();
            }
            if (com.github.catvod.spider.merge.P0.e.d(str)) {
                this.f.i(str.split("\\|")[0]);
                this.f.j(str.split("\\|")[1]);
                this.f.f();
            }
        }
    }
}
