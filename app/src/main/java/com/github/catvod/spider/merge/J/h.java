package com.github.catvod.spider.merge.J;

import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.I.RunnableC0779u;
import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.i0.m;
import com.github.catvod.spider.merge.l.C1290c;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class h extends j {
    private static final com.github.catvod.spider.merge.N1.b d = com.github.catvod.spider.merge.N1.c.d();
    private static Gson e = new Gson();
    private static OkHttpClient f = new OkHttpClient.Builder().build();
    private static final MediaType g = MediaType.parse("application/x-www-form-urlencoded; charset=utf-8");
    private Map<String, String> a;
    public Map<String, String> b;
    public String c = "";

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public h() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f = builder.connectTimeout(15L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(15L, timeUnit).build();
        e = new Gson();
        HashMap map = new HashMap();
        this.a = map;
        map.put("User-Agent", "Mozilla/5.0 (Linux; Android 12; SM-X800) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/101.0.4951.40 Safari/537.36");
        this.a.put("Accept", "application/json, text/plain, */*");
        this.a.put("Content-Type", "application/x-www-form-urlencoded");
        this.a.put("Origin", "https://pan.baidu.com");
        this.a.put("Referer", "https://pan.baidu.com/");
        ?? r0 = this.b;
        if (r0 == 0 || r0.isEmpty()) {
            System.err.println("Warning: Baidu cookies not found in cache.");
        }
    }

    public static /* synthetic */ void b(h hVar, String str) {
        hVar.getClass();
        try {
            System.out.println("Delete thread started for: " + str + ". Waiting 2 seconds...");
            Thread.sleep(2000L);
            System.out.println("Executing delete operation for: " + str);
            hVar.c(str);
            System.out.println("Delete operation thread finished for: " + str);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            System.err.println("Delete thread interrupted for path: " + str);
        } catch (Exception e2) {
            System.err.println("Error in delete thread for path: " + str);
            e2.printStackTrace();
        }
    }

    private void c(String str) throws IOException {
        PrintStream printStream;
        StringBuilder sb;
        if (!str.startsWith("/")) {
            str = C1290c.a("/", str);
        }
        HttpUrl httpUrlBuild = HttpUrl.parse("https://pan.baidu.com/api/filemanager").newBuilder().addQueryParameter("opera", "delete").addQueryParameter("bdstoken", new JSONObject(f.newCall(new Request.Builder().url("https://pan.baidu.com/api/loginStatus?clienttype=1&web=1&channel=web&version=0").method("GET", (RequestBody) null).addHeader("Cookie", i.a(this.b)).build()).execute().body().string()).getJSONObject("login_info").getString("bdstoken")).addQueryParameter("clienttype", "1").build();
        StringBuilder sbB = t0.b("[\"");
        sbB.append(str.replace("\"", "\\\""));
        sbB.append("\"]");
        String strA = C1290c.a("filelist=", sbB.toString());
        MediaType mediaType = g;
        try {
            Response responseExecute = f.newCall(new Request.Builder().url(httpUrlBuild).header("User-Agent", "Android").header("Connection", "Keep-Alive").header("Content-Type", mediaType.toString()).header("Accept-Language", "zh-CN,zh;q=0.8").header("Cookie", i.a(this.b)).post(RequestBody.create(mediaType, strA)).build()).execute();
            try {
                String strString = responseExecute.body() != null ? responseExecute.body().string() : "";
                System.out.println("Delete File Response Code: " + responseExecute.code());
                System.out.println("Delete File Response Body: " + strString);
                if (responseExecute.isSuccessful()) {
                    try {
                        Object obj = ((Map) e.fromJson(strString, new d().getType())).get("errno");
                        if ((obj instanceof Number) && ((Number) obj).intValue() == 0) {
                            printStream = System.out;
                            sb = new StringBuilder();
                            sb.append("Successfully confirmed deletion of: ");
                            sb.append(str);
                        } else {
                            printStream = System.err;
                            sb = new StringBuilder();
                            sb.append("Deletion might have failed, errno not 0 or not found. Response: ");
                            sb.append(strString);
                        }
                        printStream.println(sb.toString());
                    } catch (JsonSyntaxException unused) {
                        System.err.println("Could not parse delete confirmation response: " + strString);
                    }
                } else {
                    System.err.println("Failed to delete file: " + str + ". Code: " + responseExecute.code());
                }
                responseExecute.close();
            } catch (Throwable th) {
                if (responseExecute != null) {
                    try {
                        responseExecute.close();
                    } catch (Throwable unused2) {
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            System.err.println("IOException during file deletion for: " + str);
            throw e2;
        }
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    private e e(com.github.catvod.spider.merge.N.f fVar) {
        String str;
        HashSet hashSet;
        Throwable th;
        StringBuilder sb;
        String str2;
        String message;
        String string;
        com.github.catvod.spider.merge.N.e eVarH;
        int i;
        HashSet hashSet2;
        int i2;
        String str3;
        e eVar;
        Iterator<com.github.catvod.spider.merge.N.b> it;
        String strD;
        String strD2;
        com.github.catvod.spider.merge.N1.b bVar;
        String str4;
        com.github.catvod.spider.merge.N.f fVar2 = fVar;
        String str5 = "Failed to list root folder content: ";
        StringBuilder sbB = t0.b("getAllVideos tokenInfo");
        sbB.append(fVar.toString());
        SpiderDebug.log(sbB.toString());
        if (fVar.a() != null) {
            return new e(fVar.a());
        }
        if (fVar.c() == null) {
            return new e("Missing randsk in token info");
        }
        e eVar2 = new e();
        LinkedList linkedList = new LinkedList();
        HashSet hashSet3 = new HashSet();
        com.github.catvod.spider.merge.N.a aVar = new com.github.catvod.spider.merge.N.a();
        aVar.m(fVar.d());
        aVar.j(fVar.c());
        String strD3 = null;
        aVar.n(null);
        aVar.l(null);
        aVar.i(1);
        aVar.k(true);
        linkedList.add(aVar);
        hashSet3.add("/");
        String strB = null;
        int i3 = 1;
        while (!linkedList.isEmpty()) {
            com.github.catvod.spider.merge.N.a aVar2 = (com.github.catvod.spider.merge.N.a) linkedList.poll();
            aVar2.n(strD3 != null ? strD3 : aVar2.f());
            aVar2.l(strB != null ? strB : aVar2.d());
            try {
                eVarH = h(aVar2);
            } catch (IOException e2) {
                str = str5;
                hashSet = hashSet3;
                if (!aVar2.g()) {
                    continue;
                } else if (aVar2.b() == 1) {
                    str2 = str;
                    th = e2;
                    sb = new StringBuilder();
                    sb.append(str2);
                    message = th.getMessage();
                    sb.append(message);
                    string = sb.toString();
                    eVar2.b = string;
                    return eVar2;
                }
            } catch (IllegalArgumentException e3) {
                str = str5;
                hashSet = hashSet3;
                th = e3;
                d.d("IllegalArgumentException for folder '{}' page {}: {}", aVar2.a(), Integer.valueOf(aVar2.b()), th.getMessage());
                if (!aVar2.g()) {
                    continue;
                } else if (aVar2.b() == 1) {
                    sb = new StringBuilder();
                    str2 = "Failed root folder listing due to invalid arguments: ";
                    sb.append(str2);
                    message = th.getMessage();
                    sb.append(message);
                    string = sb.toString();
                    eVar2.b = string;
                    return eVar2;
                }
            }
            if (eVarH.c() != null || eVarH.a() == null) {
                str = str5;
                hashSet = hashSet3;
                if (aVar2.g() && aVar2.b() == 1) {
                    sb = t0.b(str);
                    message = eVarH.c() != null ? eVarH.c() : "Null data";
                    sb.append(message);
                    string = sb.toString();
                    eVar2.b = string;
                    return eVar2;
                }
            } else {
                if (aVar2.g() && aVar2.b() == i3) {
                    if (eVarH.a().d() == null || eVarH.a().b() == null) {
                        d.a("Failed to get uk/shareid from root folder response. Aborting. Data: {}", e.toJson(eVarH.a()));
                        string = "Failed to get uk/shareid from root folder response";
                        eVar2.b = string;
                        return eVar2;
                    }
                    strD3 = eVarH.a().d();
                    strB = eVarH.a().b();
                    fVar2.k(strD3);
                    fVar2.i(strB);
                    com.github.catvod.spider.merge.N1.b bVar2 = d;
                    Object[] objArr = new Object[3];
                    objArr[0] = strD3;
                    objArr[i3] = strB;
                    objArr[2] = fVar.d();
                    bVar2.f(objArr);
                }
                if (strD3 == null || strB == null) {
                    d.a("Cannot process items in folder {} because uk/shareid are missing (should have been determined from root).", aVar2.a());
                    string = "uk/shareid missing after root folder processed";
                    eVar2.b = string;
                    return eVar2;
                }
                if (eVarH.a().a() != null) {
                    int size = eVarH.a().a().size();
                    ArrayList<Map> arrayList = new ArrayList();
                    Iterator<com.github.catvod.spider.merge.N.b> it2 = eVarH.a().a().iterator();
                    while (it2.hasNext()) {
                        com.github.catvod.spider.merge.N.b next = it2.next();
                        if (next.b() == i3) {
                            String strC = next.c();
                            if (strC == null || hashSet3.contains(strC)) {
                                bVar = d;
                                if (strC != null) {
                                    str4 = "Skipping already seen folder: {}";
                                } else {
                                    bVar.b("Folder item has null path: {}", e.toJson(next));
                                }
                            } else {
                                hashSet3.add(strC);
                                com.github.catvod.spider.merge.N.a aVar3 = new com.github.catvod.spider.merge.N.a();
                                aVar3.m(fVar.d());
                                aVar3.j(fVar.c());
                                aVar3.n(strD3);
                                aVar3.l(strB);
                                aVar3.h(strC);
                                aVar3.i(i3);
                                aVar3.k(false);
                                linkedList.add(aVar3);
                                bVar = d;
                                str4 = "Added subfolder to queue: {}";
                            }
                            bVar.e(str4, strC);
                        } else {
                            String strD4 = next.d();
                            if (strD4 == null ? false : com.github.catvod.spider.merge.P0.e.d(m.m(strD4.toLowerCase()))) {
                                hashSet2 = hashSet3;
                                i2 = size;
                                str3 = str5;
                                eVar = eVar2;
                                try {
                                    strD = d(next.e());
                                    strD2 = next.d();
                                    it = it2;
                                } catch (Exception e4) {
                                    e = e4;
                                    it = it2;
                                }
                                try {
                                    HashMap map = new HashMap();
                                    map.put("uk", strD3);
                                    map.put("sizeStr", strD);
                                    map.put("shareid", strB);
                                    map.put("fid", Long.valueOf(next.a()));
                                    map.put("qtype", "original");
                                    map.put("randsk", fVar.c());
                                    map.put("pname", strD2);
                                    map.put("shareName", this.c);
                                    arrayList.add(map);
                                    if (fVar.b() == null || fVar.b().isEmpty()) {
                                        d.e("Skipping preview data for {} because jstoken is missing.", strD2);
                                    } else {
                                        HashMap map2 = new HashMap();
                                        map2.put("uk", strD3);
                                        map2.put("fid", Long.valueOf(next.a()));
                                        map2.put("shareid", strB);
                                        map2.put("jsToken", fVar.b());
                                        map2.put("surl", fVar.e());
                                        map2.put("pname", "baidu");
                                        map2.put("qtype", "preview");
                                        Base64.encodeToString(e.toJson(map2).getBytes(), 0);
                                    }
                                } catch (Exception e5) {
                                    e = e5;
                                    d.c("Error creating video data string for {}", next.d(), e);
                                }
                                d.e("Added video: {}", next.d());
                            }
                            i3 = 1;
                            hashSet3 = hashSet2;
                            size = i2;
                            eVar2 = eVar;
                            str5 = str3;
                            it2 = it;
                        }
                        str3 = str5;
                        eVar = eVar2;
                        hashSet2 = hashSet3;
                        i2 = size;
                        it = it2;
                        i3 = 1;
                        hashSet3 = hashSet2;
                        size = i2;
                        eVar2 = eVar;
                        str5 = str3;
                        it2 = it;
                    }
                    str = str5;
                    e eVar3 = eVar2;
                    hashSet = hashSet3;
                    int i4 = size;
                    Collections.sort(arrayList, new com.github.catvod.spider.merge.N.h());
                    for (Map map3 : arrayList) {
                        eVar3.a.add(String.format("%s [%s]%s$%s", m.v((String) map3.get("pname")), map3.get("sizeStr"), m.y((String) map3.get("pname")), Base64.encodeToString(e.toJson(map3).getBytes(StandardCharsets.UTF_8), 2)));
                    }
                    eVar2 = eVar3;
                    i = i4;
                } else {
                    str = str5;
                    hashSet = hashSet3;
                    i = 0;
                }
                if (i >= 100) {
                    com.github.catvod.spider.merge.N.a aVar4 = new com.github.catvod.spider.merge.N.a();
                    aVar4.m(aVar2.e());
                    aVar4.j(aVar2.c());
                    aVar4.n(strD3);
                    aVar4.l(strB);
                    aVar4.h(aVar2.a());
                    aVar4.i(aVar2.b() + 1);
                    aVar4.k(aVar2.g());
                    linkedList.add(aVar4);
                }
            }
            i3 = 1;
            fVar2 = fVar;
            hashSet3 = hashSet;
            str5 = str;
        }
        return eVar2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:5|163|6|159|7|(3:161|9|10)(1:13)|14|15|157|16|17|153|18|(1:20)(10:148|22|(1:24)(1:25)|(2:27|(2:29|(2:31|(2:35|(2:37|(11:39|(1:41)(1:42)|43|170|44|45|172|46|146|47|175)))))(4:61|168|62|(6:64|68|165|77|178|97)(1:65)))(1:66)|67|68|165|77|178|97)|21|68|165|77|178|97) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x02c8, code lost:
    
        java.lang.System.err.println("Transfer failed after 30 attempts.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02cf, code lost:
    
        if (r6 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02d5, code lost:
    
        if (r6.isEmpty() == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02d9, code lost:
    
        r28.put("to", r6);
        r0 = new java.util.HashMap(r23.b);
        r0.put("BDCLND", r27);
        r2 = okhttp3.HttpUrl.parse("https://pan.baidu.com/api/mediainfo").newBuilder().addQueryParameter("type", "M3U8_FLV_264_480").addQueryParameter("path", "/" + r6).addQueryParameter("clienttype", "80").addQueryParameter("origin", "dlna").build();
        r3 = new okhttp3.Request.Builder().url(r2).header("User-Agent", "netdisk;1.4.2;22021211RC;android-android;12;JSbridge4.4.0;jointBridge;1.1.0;").header("Connection", "Keep-Alive").header(r26, r21).header(r25, com.github.catvod.spider.merge.J.i.a(r0)).get().build();
        java.lang.System.out.println("Requesting Media Info from: " + r2);
        r2 = java.lang.System.out;
        r4 = com.github.catvod.spider.merge.I.t0.b("Media Info Headers: ");
        r4.append(r3.headers());
        r2.println(r4.toString());
        r2 = java.lang.System.out;
        r4 = com.github.catvod.spider.merge.I.t0.b("Media Info Cookies: ");
        r4.append(com.github.catvod.spider.merge.J.i.a(r0));
        r2.println(r4.toString());
        r2 = com.github.catvod.spider.merge.J.h.f.newCall(r3).execute();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x03a0, code lost:
    
        if (r2.body() == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x03a2, code lost:
    
        r16 = r2.body().string();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x03aa, code lost:
    
        r0 = r16;
        java.lang.System.out.println("Media Info Response Code: " + r2.code());
        java.lang.System.out.println("Media Info Response Body: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x03e0, code lost:
    
        if (r2.isSuccessful() != false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x03e2, code lost:
    
        java.lang.System.err.println("Failed to get media info. Code: " + r2.code());
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x03fe, code lost:
    
        r3 = (java.util.Map) com.github.catvod.spider.merge.J.h.e.fromJson(r0, new com.github.catvod.spider.merge.J.b().getType());
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0417, code lost:
    
        if (r3.containsKey(r17) == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0419, code lost:
    
        r3 = r3.get(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x041f, code lost:
    
        if ((r3 instanceof java.util.Map) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0421, code lost:
    
        r3 = ((java.util.Map) r3).get("dlink");
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0429, code lost:
    
        if ((r3 instanceof java.lang.String) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x042b, code lost:
    
        r3 = (java.lang.String) r3;
        java.lang.System.out.println("Successfully obtained download link (dlink): " + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0443, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0446, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x044b, code lost:
    
        if (r3.containsKey("dlink") == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x044d, code lost:
    
        r3 = r3.get("dlink");
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0453, code lost:
    
        if ((r3 instanceof java.lang.String) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0455, code lost:
    
        r3 = (java.lang.String) r3;
        java.lang.System.out.println("Successfully obtained download link (top-level dlink): " + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x046d, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0470, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0471, code lost:
    
        java.lang.System.err.println("Could not parse 'dlink' from media info response: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0488, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0489, code lost:
    
        java.lang.System.err.println("JSON parsing error for media info: " + r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x04a7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x04a8, code lost:
    
        if (r2 != null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x04aa, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x04ad, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x04ae, code lost:
    
        java.lang.System.err.println("File transfer failed.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x04b5, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0281, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02c6, code lost:
    
        if (r6 != null) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x027d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String g(java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.util.Map<java.lang.String, java.lang.String> r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.J.h.g(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map):java.lang.String");
    }

    private com.github.catvod.spider.merge.N.e h(com.github.catvod.spider.merge.N.a aVar) {
        StringBuilder sbB = t0.b("getFolderContents folderInfo");
        sbB.append(aVar.toString());
        SpiderDebug.log(sbB.toString());
        HttpUrl.Builder builderNewBuilder = HttpUrl.parse("https://pan.baidu.com/share/list").newBuilder();
        if (aVar.g()) {
            builderNewBuilder.addQueryParameter("page", String.valueOf(aVar.b())).addQueryParameter("num", "100").addQueryParameter("shorturl", aVar.e()).addQueryParameter("root", "1");
        } else {
            builderNewBuilder.addQueryParameter("uk", aVar.f()).addQueryParameter("shareid", aVar.d()).addQueryParameter("page", String.valueOf(aVar.b())).addQueryParameter("num", "100").addQueryParameter("dir", aVar.a());
        }
        HttpUrl httpUrlBuild = builderNewBuilder.build();
        StringBuilder sbB2 = t0.b("BDCLND=");
        sbB2.append(aVar.c());
        Response responseExecute = f.newCall(new Request.Builder().url(httpUrlBuild).headers(Headers.of(this.a)).addHeader("Cookie", sbB2.toString()).get().build()).execute();
        try {
            if (!responseExecute.isSuccessful()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to list folder contents for ");
                sb.append(aVar.a() != null ? aVar.a() : "root");
                sb.append(": ");
                sb.append(responseExecute.code());
                sb.append(" URL: ");
                sb.append(httpUrlBuild);
                throw new IOException(sb.toString());
            }
            ResponseBody responseBodyBody = responseExecute.body();
            try {
                if (responseBodyBody == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Folder listing response body is null for ");
                    sb2.append(aVar.a() != null ? aVar.a() : "root");
                    throw new IOException(sb2.toString());
                }
                String strString = responseBodyBody.string();
                SpiderDebug.log("getFolderContents " + strString);
                com.github.catvod.spider.merge.N.e eVar = new com.github.catvod.spider.merge.N.e();
                try {
                    com.github.catvod.spider.merge.N.d dVar = (com.github.catvod.spider.merge.N.d) e.fromJson(strString, com.github.catvod.spider.merge.N.d.class);
                    if (com.github.catvod.spider.merge.P0.e.d(dVar.c()) && com.github.catvod.spider.merge.P0.e.b(this.c)) {
                        this.c = dVar.c();
                    }
                    eVar.d(dVar);
                } catch (JsonSyntaxException e2) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Failed to parse standard ShareListResponse, trying flat structure for {}. Error: {}");
                    sb3.append(aVar.a() != null ? aVar.a() : "root");
                    sb3.append(e2.getMessage());
                    SpiderDebug.log(sb3.toString());
                    try {
                        com.github.catvod.spider.merge.N.d dVar2 = (com.github.catvod.spider.merge.N.d) e.fromJson(strString, com.github.catvod.spider.merge.N.d.class);
                        com.github.catvod.spider.merge.N.e eVar2 = new com.github.catvod.spider.merge.N.e();
                        eVar2.e();
                        eVar2.d(dVar2);
                        if (eVar2.a() == null || (aVar.g() && aVar.b() == 1 && (eVar2.a().d() == null || eVar2.a().b() == null))) {
                            d.a("Parsed flat structure lacks essential data (uk/shareid?) for root: {}", strString);
                        }
                        eVar = eVar2;
                    } catch (JsonSyntaxException e3) {
                        com.github.catvod.spider.merge.N1.b bVar = d;
                        Object[] objArr = new Object[3];
                        objArr[0] = aVar.a() != null ? aVar.a() : "root";
                        objArr[1] = strString;
                        objArr[2] = e3;
                        bVar.d("Failed to parse folder contents JSON response for {} even as flat structure: {}", objArr);
                        throw new IOException("Failed to parse folder contents JSON: " + e3.getMessage());
                    }
                }
                if (eVar.b() != 0) {
                    responseBodyBody.close();
                    responseExecute.close();
                    return eVar;
                }
                responseBodyBody.close();
                responseExecute.close();
                return eVar;
            } catch (Throwable th) {
                if (responseBodyBody != null) {
                    try {
                        responseBodyBody.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (responseExecute != null) {
                try {
                    responseExecute.close();
                } catch (Throwable unused2) {
                }
            }
            throw th2;
        }
    }

    private List<String> i(String str, String str2, String str3, long j, String str4, String str5) {
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"1080P", "720P", "480P"};
        for (int i = 0; i < 3; i++) {
            String str6 = strArr[i];
            HttpUrl.Builder builderAddQueryParameter = HttpUrl.parse("https://pan.baidu.com/share/streaming").newBuilder().addQueryParameter("uk", str).addQueryParameter("fid", str2).addQueryParameter("sign", str3).addQueryParameter("timestamp", String.valueOf(j)).addQueryParameter("shareid", str4);
            StringBuilder sbB = t0.b("M3U8_AUTO_");
            sbB.append(str6.replace("P", ""));
            HttpUrl httpUrlBuild = builderAddQueryParameter.addQueryParameter("type", sbB.toString()).addQueryParameter("jsToken", str5).build();
            arrayList.add(str6);
            arrayList.add(httpUrlBuild.toString());
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    private com.github.catvod.spider.merge.N.f j(com.github.catvod.spider.merge.N.g gVar) {
        String strC;
        StringBuilder sb;
        String str;
        StringBuilder sbB = t0.b("getShareToken ");
        sbB.append(gVar.a());
        sbB.append(gVar.b());
        SpiderDebug.log(sbB.toString());
        SpiderDebug.log("getShareToken headers" + this.a);
        if (gVar.a() != null) {
            Response responseExecute = f.newCall(new Request.Builder().url(HttpUrl.parse("https://pan.baidu.com/share/verify").newBuilder().addQueryParameter("t", String.valueOf(System.currentTimeMillis())).addQueryParameter("surl", gVar.b()).build()).headers(Headers.of(this.a)).post(new FormBody.Builder().add("pwd", gVar.a()).build()).build()).execute();
            try {
                if (!responseExecute.isSuccessful()) {
                    throw new IOException("Verify request failed: " + responseExecute.code() + " for surl " + gVar.b());
                }
                ResponseBody responseBodyBody = responseExecute.body();
                try {
                    if (responseBodyBody == null) {
                        throw new IOException("Verify response body is null for surl " + gVar.b());
                    }
                    String strString = responseBodyBody.string();
                    SpiderDebug.log("Verify response for surl {}: {}" + gVar.b() + strString);
                    com.github.catvod.spider.merge.N.j jVar = (com.github.catvod.spider.merge.N.j) e.fromJson(strString, com.github.catvod.spider.merge.N.j.class);
                    if (jVar.a() == 0 && jVar.c() != null) {
                        strC = jVar.c();
                        SpiderDebug.log("Got randsk for surl {}: {}" + gVar.b() + strC);
                        responseBodyBody.close();
                        responseExecute.close();
                    }
                    d.d("Password verification failed (errno {}) for surl {}: {}", jVar.b(), gVar.b(), strString);
                    com.github.catvod.spider.merge.N.f fVar = new com.github.catvod.spider.merge.N.f();
                    fVar.f("Password verification failed: errno=" + jVar.b());
                    responseBodyBody.close();
                    responseExecute.close();
                    return fVar;
                } catch (Throwable th) {
                    if (responseBodyBody != null) {
                        try {
                            responseBodyBody.close();
                        } catch (Throwable unused) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                if (responseExecute != null) {
                    try {
                        responseExecute.close();
                    } catch (Throwable unused2) {
                    }
                }
                throw th2;
            }
        }
        StringBuilder sbB2 = t0.b("No password provided for surl {}, skipping verification and assuming public share.");
        sbB2.append(gVar.b());
        SpiderDebug.log(sbB2.toString());
        strC = "";
        HttpUrl httpUrl = HttpUrl.parse(gVar.c());
        if (httpUrl == null) {
            StringBuilder sbB3 = t0.b("Invalid page URL created for fetching jstoken: ");
            sbB3.append(gVar.c());
            throw new IllegalArgumentException(sbB3.toString());
        }
        ?? r2 = this.b;
        if (r2 == 0 || r2.isEmpty()) {
            sb = new StringBuilder();
            str = "BDCLND=";
        } else {
            sb = new StringBuilder();
            sb.append(this.b);
            str = "; BDCLND=";
        }
        String strB = C1290c.b(sb, str, strC);
        HashMap map = new HashMap(this.a);
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36");
        map.put("Connection", "Keep-Alive");
        map.put("Accept-Language", "zh-CN,zh;q=0.8");
        map.remove("Content-Type");
        map.remove("Origin");
        Response responseExecute2 = f.newCall(new Request.Builder().url(httpUrl).headers(Headers.of(map)).addHeader("Cookie", strB).get().build()).execute();
        try {
            if (!responseExecute2.isSuccessful()) {
                throw new IOException("Failed to fetch share page " + httpUrl + ": " + responseExecute2.code());
            }
            ResponseBody responseBodyBody2 = responseExecute2.body();
            try {
                if (responseBodyBody2 == null) {
                    throw new IOException("Share page response body is null for " + httpUrl);
                }
                Matcher matcher = Pattern.compile("eval\\(decodeURIComponent\\([\"']([^\"']+)[\"']\\)\\)").matcher(responseBodyBody2.string());
                com.github.catvod.spider.merge.N.f fVar2 = new com.github.catvod.spider.merge.N.f();
                fVar2.h(strC);
                fVar2.j(gVar.b());
                fVar2.l(gVar.c().substring(gVar.c().lastIndexOf(47) + 1));
                if (matcher.find()) {
                    try {
                        if (!Pattern.compile("fn\\(\"([^\"]+)\"\\)").matcher(URLDecoder.decode(matcher.group(1), "UTF-8")).find()) {
                            d.b("Could not find jsToken pattern fn(\"...\") in decoded JS for surl {}. Preview links might not work.", gVar.b());
                        }
                    } catch (Exception e2) {
                        d.c("Failed to decode JS block for surl {}: {}", gVar.b(), e2.getMessage());
                    }
                } else {
                    d.b("Could not find eval(decodeURIComponent(...)) block in page content for surl {}. Preview links might not work.", gVar.b());
                    fVar2.g();
                }
                responseBodyBody2.close();
                responseExecute2.close();
                return fVar2;
            } catch (Throwable th3) {
                if (responseBodyBody2 != null) {
                    try {
                        responseBodyBody2.close();
                    } catch (Throwable unused3) {
                    }
                }
                throw th3;
            }
        } catch (Throwable th4) {
            if (responseExecute2 != null) {
                try {
                    responseExecute2.close();
                } catch (Throwable unused4) {
                }
            }
            throw th4;
        }
    }

    private f k(String str) {
        long jLongValue;
        Response responseExecute = f.newCall(new Request.Builder().url(HttpUrl.parse("https://pan.baidu.com/share/tplconfig").newBuilder().addQueryParameter("surl", str).addQueryParameter("fields", "cfrom_id,Espace_info,card_info,sign,timestamp").build()).header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36").header("Connection", "Keep-Alive").header("Accept-Language", "zh-CN,zh;q=0.8").header("Cookie", i.a(this.b)).get().build()).execute();
        try {
            if (!responseExecute.isSuccessful()) {
                System.err.println("Failed to get sign/timestamp. Code: " + responseExecute.code());
                PrintStream printStream = System.err;
                StringBuilder sb = new StringBuilder();
                sb.append("Response: ");
                sb.append(responseExecute.body());
                printStream.println(sb.toString() != null ? responseExecute.body().string() : "null body");
                responseExecute.close();
                return null;
            }
            String strString = responseExecute.body().string();
            try {
                Map map = (Map) e.fromJson(strString, new a().getType());
                if (map.containsKey("data")) {
                    Object obj = map.get("data");
                    if (obj instanceof Map) {
                        Object obj2 = ((Map) obj).get("data");
                        if (obj2 instanceof Map) {
                            Map map2 = (Map) obj2;
                            String str2 = (String) map2.get("sign");
                            Object obj3 = map2.get("timestamp");
                            if (obj3 instanceof Number) {
                                jLongValue = ((Number) obj3).longValue();
                            } else if (obj3 instanceof String) {
                                try {
                                    jLongValue = Long.parseLong((String) obj3);
                                } catch (NumberFormatException unused) {
                                    jLongValue = -1;
                                }
                            } else {
                                jLongValue = -1;
                            }
                            if (str2 != null && jLongValue != -1) {
                                f fVar = new f(str2, jLongValue);
                                responseExecute.close();
                                return fVar;
                            }
                        }
                    }
                }
                System.err.println("Could not parse sign/timestamp from response: " + strString);
                responseExecute.close();
                return null;
            } catch (JsonSyntaxException e2) {
                System.err.println("JSON parsing error for sign/timestamp: " + e2.getMessage());
                System.err.println("Response body: " + strString);
                responseExecute.close();
                return null;
            }
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

    private com.github.catvod.spider.merge.N.g l(HttpUrl httpUrl) {
        String strQueryParameter = httpUrl.queryParameter("surl");
        if (strQueryParameter == null) {
            List listPathSegments = httpUrl.pathSegments();
            if (listPathSegments.contains("s") && listPathSegments.indexOf("s") + 1 < listPathSegments.size()) {
                strQueryParameter = (String) listPathSegments.get(listPathSegments.indexOf("s") + 1);
            } else if (listPathSegments.contains("init") && httpUrl.queryParameter("surl") != null) {
                strQueryParameter = httpUrl.queryParameter("surl");
            }
        }
        String strQueryParameter2 = httpUrl.queryParameter("pwd");
        if (strQueryParameter == null) {
            throw new IllegalArgumentException("Could not extract 'surl' from URL: " + httpUrl);
        }
        if (strQueryParameter.startsWith("1") && strQueryParameter.length() > 1) {
            strQueryParameter = strQueryParameter.substring(1);
        }
        if (strQueryParameter2 == null) {
            d.b("Password 'pwd' not found in URL parameters for surl {}. Verification might fail.", strQueryParameter);
        }
        com.github.catvod.spider.merge.N.g gVar = new com.github.catvod.spider.merge.N.g(C1290c.a("https://pan.baidu.com/s/1", strQueryParameter), strQueryParameter, strQueryParameter2);
        StringBuilder sbB = t0.b("parseFinalUrl ");
        sbB.append(gVar.b());
        SpiderDebug.log(sbB.toString());
        return gVar;
    }

    private com.github.catvod.spider.merge.N.g m(String str) {
        String strReplace = str.contains("提取码") ? str.replace("提取码:", "?pwd=") : str;
        HttpUrl httpUrl = HttpUrl.parse(strReplace);
        if (httpUrl == null) {
            throw new IllegalArgumentException(C1290c.a("Invalid URL format: ", str));
        }
        if (strReplace.contains("/wap/")) {
            return l(httpUrl);
        }
        Response responseExecute = f.newBuilder().followRedirects(false).followSslRedirects(false).build().newCall(new Request.Builder().url(httpUrl).headers(Headers.of(this.a)).get().build()).execute();
        try {
            String strHeader = responseExecute.header("Location");
            if (!responseExecute.isRedirect() || strHeader == null) {
                if (!responseExecute.isSuccessful() && !responseExecute.isRedirect()) {
                    throw new IOException("Failed to resolve URL " + str + ", status: " + responseExecute.code());
                }
                com.github.catvod.spider.merge.N.g gVarL = l(responseExecute.request().url());
                responseExecute.close();
                return gVarL;
            }
            SpiderDebug.log("Redirected from {} to {}" + str + strHeader);
            if (strHeader.startsWith("/")) {
                strHeader = "https://pan.baidu.com" + strHeader;
            }
            if (!strHeader.equals(strReplace)) {
                com.github.catvod.spider.merge.N.g gVarM = m(strHeader);
                responseExecute.close();
                return gVarM;
            }
            throw new IOException("Redirect loop detected for URL: " + str);
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

    private e o(String str) {
        try {
            SpiderDebug.log("processSingleLink1" + str);
            com.github.catvod.spider.merge.N.f fVarJ = j(m(str));
            if (fVarJ.a() != null) {
                d.c("Failed to get share token for {}: {}", str, fVarJ.a());
                return new e(fVarJ.a());
            }
            if (fVarJ.c() == null) {
                d.a("Failed to get randsk for {}", str);
                return new e("Failed to obtain randsk (password likely incorrect or cookie issue)");
            }
            if (fVarJ.b() == null) {
                d.b("JSToken not found for {}. Previews might not work.", str);
            }
            e eVarE = e(fVarJ);
            String str2 = eVarE.b;
            if (!(str2 == null)) {
                d.c("Failed to list videos for {}: {}", str, str2);
            }
            return eVarE;
        } catch (Exception e2) {
            d.c("Unexpected error processing link: {}", str, e2);
            StringBuilder sbB = t0.b("Unexpected error: ");
            sbB.append(e2.getMessage());
            return new e(sbB.toString());
        }
    }

    private void p(String str) {
        if (str.isEmpty()) {
            return;
        }
        System.out.println("Scheduling deletion for path: " + str);
        Thread thread = new Thread(new RunnableC0779u(this, str, 1));
        thread.setDaemon(false);
        thread.setName("BaiduDelete-" + str.hashCode());
        thread.start();
    }

    protected final String d(long j) {
        if (j < 0) {
            return "N/A";
        }
        if (j < 1024) {
            return j + " B";
        }
        double d2 = j;
        int iLog = (int) (Math.log(d2) / Math.log(1024.0d));
        char cCharAt = "KMGTPE".charAt(Math.min(iLog - 1, 5));
        double dPow = Math.pow(1024.0d, iLog);
        Double.isNaN(d2);
        return String.format("%.1f %sB", Double.valueOf(d2 / dPow), Character.valueOf(cCharAt));
    }

    public final Map<String, Object> f(JsonObject jsonObject) {
        String str;
        HashMap map = new HashMap();
        map.put("qtype", jsonObject.get("qtype").getAsString());
        map.put("uk", jsonObject.get("uk").getAsString());
        map.put("fid", jsonObject.get("fid").getAsString());
        map.put("shareid", jsonObject.get("shareid").getAsString());
        map.put("randsk", jsonObject.get("randsk").getAsString());
        if (!map.containsKey("qtype") || !map.containsKey("uk") || !map.containsKey("fid") || !map.containsKey("shareid") || (((String) map.get("qtype")).equals("original") && !map.containsKey("randsk"))) {
            System.err.println("Error: Missing required fields in videoData map.");
            return a("Missing required fields in videoData.");
        }
        String strValueOf = String.valueOf(map.get("qtype"));
        String strValueOf2 = String.valueOf(map.get("surl"));
        String strValueOf3 = String.valueOf(map.get("uk"));
        String strValueOf4 = String.valueOf(map.get("fid"));
        String strValueOf5 = String.valueOf(map.get("shareid"));
        String strValueOf6 = String.valueOf(map.get("jsToken"));
        String strValueOf7 = map.containsKey("randsk") ? String.valueOf(map.get("randsk")) : null;
        try {
            new ArrayList();
            HashMap map2 = new HashMap();
            if (!"original".equalsIgnoreCase(strValueOf)) {
                f fVarK = k(strValueOf2);
                if (fVarK != null) {
                    List<String> listI = i(strValueOf3, strValueOf4, fVarK.a, fVarK.b, strValueOf5, strValueOf6);
                    map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36");
                    map2.put("Cookie", i.a(this.b));
                    HashMap map3 = new HashMap();
                    map3.put("parse", 0);
                    map3.put("url", listI);
                    map3.put("header", map2);
                    return map3;
                }
                System.err.println("Failed to get sign and timestamp.");
                str = "Failed to get sign/timestamp.";
            } else if (strValueOf7 == null) {
                System.err.println("Error: 'randsk' is required for 'original' quality.");
                str = "'randsk' is required for 'original' quality.";
            } else {
                String strG = g(strValueOf3, strValueOf5, strValueOf4, strValueOf7, map);
                if (strG != null && !strG.isEmpty()) {
                    map2.put("User-Agent", "netdisk;1.4.2;22021211RC;android-android;12;JSbridge4.4.0;jointBridge;1.1.0;");
                    HashMap map4 = new HashMap();
                    map4.put("parse", 0);
                    map4.put("url", strG);
                    map4.put("header", map2);
                    String str2 = (String) map.get("to");
                    if (str2 == null || str2.isEmpty()) {
                        System.err.println("Warning: Could not find 'to' path after transfer for deletion.");
                        return map4;
                    }
                    p(str2);
                    return map4;
                }
                System.err.println("Failed to get download URL for original quality.");
                str = "Failed to get original download URL.";
            }
            return a(str);
        } catch (Exception e2) {
            PrintStream printStream = System.err;
            StringBuilder sbB = t0.b("Error getting video URL: ");
            sbB.append(e2.getMessage());
            printStream.println(sbB.toString());
            e2.printStackTrace();
            return a("Exception during get_video_url: " + e2.getMessage());
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public final g n(List<String> list) {
        if (list == null || list.isEmpty()) {
            Collections.emptyList();
            return new g(Collections.emptyList());
        }
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            try {
                e eVarO = o(str);
                String str2 = eVarO.b;
                if (str2 == null) {
                    ?? r2 = eVarO.a;
                    StringBuilder sb = new StringBuilder();
                    Iterator it = r2.iterator();
                    if (it.hasNext()) {
                        while (true) {
                            sb.append((CharSequence) it.next());
                            if (!it.hasNext()) {
                                break;
                            }
                            sb.append((CharSequence) "#");
                        }
                    }
                    arrayList.add(sb.toString());
                } else {
                    d.c("Failed to process link {}: {}", str, str2);
                }
            } catch (Exception e2) {
                d.c("Exception processing link {}", str, e2);
            }
        }
        return new g(arrayList);
    }
}
