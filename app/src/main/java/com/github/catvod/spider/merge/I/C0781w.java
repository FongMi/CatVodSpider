package com.github.catvod.spider.merge.I;

import android.util.Base64;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.Proxy;
import com.github.catvod.utils.server.Server;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.I.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0781w {
    public com.github.catvod.spider.merge.N.i b;
    public com.github.catvod.spider.merge.J.h c = new com.github.catvod.spider.merge.J.h();
    public final Map<String, String> a = new ConcurrentHashMap();

    public C0781w() {
        com.github.catvod.spider.merge.f0.d.a();
        try {
            com.github.catvod.spider.merge.N.i iVar = (com.github.catvod.spider.merge.N.i) new Gson().fromJson(com.github.catvod.spider.merge.g.b.d(com.github.catvod.spider.merge.g.b.f("baidu_user")), com.github.catvod.spider.merge.N.i.class);
            this.b = iVar == null ? new com.github.catvod.spider.merge.N.i() : iVar;
        } catch (Exception unused) {
            com.github.catvod.spider.merge.i0.m.w("摆渡授权初始化失败，请删除根目录TV文件夹下授权文件后重试");
        }
    }

    public static C0781w a() {
        return C0780v.a;
    }

    public static HashMap<String, String> b(String str) {
        return com.github.catvod.spider.merge.B.e.b("User-Agent", "netdisk;1.4.2;22021211RC;android-android;12;JSbridge4.4.0;jointBridge;1.1.0;", "Url", str);
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.concurrent.ConcurrentHashMap] */
    public final String c(String[] strArr) {
        JsonObject jsonObject;
        String str;
        String isoDownloadUrl;
        try {
            jsonObject = com.github.catvod.spider.merge.B.j.c(new String(Base64.decode(strArr[0], 2))).getAsJsonObject();
            if (jsonObject == null) {
                jsonObject = new JsonObject();
            }
        } catch (Throwable unused) {
            jsonObject = new JsonObject();
        }
        Map<String, Object> mapF = this.c.f(jsonObject);
        try {
            if (!this.a.containsKey(strArr[0])) {
                this.a.put(strArr[0], (String) mapF.get("url"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String[] strArr2 = new String[4];
        strArr2[2] = jsonObject.get("shareName").getAsString();
        strArr2[3] = jsonObject.get("pname").getAsString();
        try {
            str = (String) C0780v.a.a.get(strArr[0]);
        } catch (Exception e2) {
            e2.printStackTrace();
            str = "";
        }
        BaseApi.get().h.put(com.github.catvod.spider.merge.i0.m.c(str), new Gson().toJson(b(str)));
        String strZ = Server.z(str, this.b.a().intValue(), com.github.catvod.spider.merge.N.c.a().intValue());
        if (BaseApi.get().d.booleanValue()) {
            String str2 = strArr[2] + strArr[3];
            BaseApi.get().downloadFileWithDownloadManager(strZ, str2, b(strZ));
            com.github.catvod.spider.merge.i0.m.w("正在下载 " + str2);
            isoDownloadUrl = Server.B();
        } else {
            isoDownloadUrl = NetPan.getIsoDownloadUrl(strZ);
        }
        com.github.catvod.spider.merge.K.g gVar = new com.github.catvod.spider.merge.K.g();
        gVar.w(isoDownloadUrl);
        gVar.i();
        gVar.a(C0773p.a.t(strArr2));
        gVar.g(b(isoDownloadUrl));
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
}
