package com.github.catvod.utils.merge;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.utils.server.Server;
import com.google.gson.Gson;
import org.json.JSONObject;

import java.net.URLEncoder;
import java.util.*;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class Yun115Api {
    private static Map<String, String> g;
    private static Map<String, String> h;
    private final Map<String, String> a;
    private final Map<String, String> b;
    private String c;
    private String d;
    public com.github.catvod.spider.merge.b0.c e;
    private String f;

    Yun115Api() {
        try {
            com.github.catvod.spider.merge.b0.c cVar = (com.github.catvod.spider.merge.b0.c) new Gson().fromJson(com.github.catvod.spider.merge.g.b.d(com.github.catvod.spider.merge.g.b.f("115_user")), com.github.catvod.spider.merge.b0.c.class);
            this.e = cVar == null ? new com.github.catvod.spider.merge.b0.c() : cVar;
        } catch (Exception unused) {
            SpiderDebug.log("115授权初始化失败，请删除根目录TV文件夹下授权文件后重试");
        }
        StringBuilder sbB = new StringBuilder("uc QuarkPanApi constructor user:");
        sbB.append(this.e);
        SpiderDebug.log(sbB.toString());
        HashMap map = new HashMap();
        this.a = map;
        map.put("4K", "4k");
        map.put("2k", "2k");
        map.put("超清", "super");
        map.put("高清", "high");
        map.put("標清", "low");
        map.put("流暢", "normal");
        this.f = "4kz|4k|2k|super|high|low";
        HashMap map2 = new HashMap();
        this.b = map2;
        map2.put("4kz", "115原畫");
        map2.put("4k", "4K");
        map2.put("2k", "2K");
        map2.put("super", "高清");
        map2.put("high", "標清");
        map2.put("low", "流暢");
        map2.put("normal", "普通");
        map2.put("auto", "115秒传阿里");
        g = new HashMap(512);
        h = new HashMap(4096);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    private String b(String str, List<Yun115File> list) {
        ArrayList<Yun115File> arrayList = new ArrayList();
        String lowerCase = com.github.catvod.spider.merge.i0.m.x(str).toLowerCase();
        for (Yun115File c0902a : list) {
            String lowerCase2 = com.github.catvod.spider.merge.i0.m.x(c0902a.f()).toLowerCase();
            if (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase)) {
                arrayList.add(c0902a);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(list);
        }
        StringBuilder sb = new StringBuilder();
        for (Yun115File c0902a2 : arrayList) {
            h.put(c0902a2.d(), c0902a2.h());
            sb.append("+");
            sb.append(com.github.catvod.spider.merge.i0.m.x(c0902a2.f()));
            sb.append("@@@");
            sb.append(c0902a2.c());
            sb.append("@@@");
            sb.append(c0902a2.a());
        }
        return sb.toString();
    }

    public static Yun115Api c() {
        return P0.a;
    }

    private String d(String str) throws InterruptedException {
        if (!str.startsWith("https")) {
            str = C1290c.a("https://115cdn.com/webapi/", str);
        }
        HashMap map = new HashMap();
        HashMap<String, String> mapE = e();
        String strM = null;
        int i = 2;
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                break;
            }
            strM = com.github.catvod.spider.merge.f0.d.m(str, mapE, map);
            SpiderDebug.log("quark get result:" + strM);
            if (strM.length() > 10) {
                break;
            }
            Thread.sleep(500L);
            i = i2;
        }
        SpiderDebug.log("115 get url:" + str + " headers:" + mapE + " newcookie: result:" + strM);
        return strM;
    }

    private static void i(JSONObject jSONObject) {
        try {
            long j = jSONObject.getJSONObject("shareinfo").getLong("expire_time");
            if (j == -1 || new Date().getTime() / 1000 <= j) {
                return;
            }
            SpiderDebug.log("115分享链接已经过期 可能获取不到播放地址");
        } catch (Exception unused) {
        }
    }

    private void j(HashMap<String, String> map, boolean z, Yun115File c0902a, List<Yun115File> list, List<Yun115File> list2, List<Yun115File> list3) {
        if (z) {
            try {
                list3 = new ArrayList<>();
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        SpiderDebug.log("listFiles >> " + map);
        String strD = d("share/snap?share_code=" + this.c + "&offset=0&receive_code=" + this.d + "&cid=" + c0902a.g() + "&limit=9999&asc=1&o=file_name");
        StringBuilder sb = new StringBuilder();
        sb.append("listFiles >> ");
        sb.append(strD);
        SpiderDebug.log(sb.toString());
        Yun115File c0902a2 = (Yun115File) new Gson().fromJson(new JSONObject(strD).getJSONObject("data").toString(), Yun115File.class);
        try {
            if (!c0902a2.e().isEmpty()) {
                Collections.sort(c0902a2.e(), new Yun115FileComparator());
            }
        } catch (Exception e2) {
            SpiderDebug.log("listFiles error" + e2.getMessage());
        }
        for (Yun115File c0902a3 : c0902a2.e()) {
            if ("folder".equals(c0902a3.m())) {
                list3.add(c0902a3);
            } else if (c0902a3.j() != null && (BaseApi.get().d.booleanValue() || (com.github.catvod.spider.merge.i0.GeneralUtils.m(c0902a3.f()) != null && !com.github.catvod.spider.merge.i0.GeneralUtils.m(c0902a3.f()).isEmpty()))) {
                c0902a3.n(c0902a.f());
                list.add(c0902a3);
            } else if (com.github.catvod.spider.merge.i0.m.r(c0902a3.c())) {
                list2.add(c0902a3);
            }
        }
        if (z) {
            Iterator<Yun115File> it = list3.iterator();
            while (it.hasNext()) {
                j(map, z, it.next(), list, list2, null);
            }
        }
    }

    public final void a(String str) {
        if ((this.e.b == null || this.e.b.isEmpty())) {
            return;
        }
        try {
            com.github.catvod.spider.merge.f0.d.l(C0773p.a.c + "/api/clean115/?pwd=" + URLEncoder.encode(this.e.b) + "&cookie=" + URLEncoder.encode(this.e.b()) + "&fileName=" + URLEncoder.encode(str));
        } catch (Exception unused) {
        }
    }

    public final HashMap<String, String> e() {
        HashMap<String, String> mapB = com.github.catvod.spider.merge.B.e.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36", "Referer", "https://115.com/");
        mapB.put("Cookie", this.e.b());
        return mapB;
    }

    public final List<com.github.catvod.bean.h> f(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str.contains("@@@")) {
                String[] strArrSplit = str.split("@@@");
                String str2 = strArrSplit[0];
                String str3 = strArrSplit[1];
                String str4 = Proxy.getUrl() + "?do=quark&type=sub&share_id=" + strArr[0] + "&file_id=" + strArrSplit[2];
                com.github.catvod.bean.h hVar = new com.github.catvod.bean.h();
                hVar.b(str2);
                com.github.catvod.bean.h hVarA = hVar.a(str3);
                hVarA.c(str4);
                arrayList.add(hVarA);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final com.github.catvod.bean.VodItem g(String str, String str2, String str3, String str4, String str5) {
        String str6;
        ArrayList arrayList = new ArrayList();
        String[] strArrSplit = this.f.split("\\|");
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < strArrSplit.length; i++) {
            if (strArrSplit[i].equals("4k") || strArrSplit[i].equals("4kz")) {
                if (!z2) {
                    arrayList.add("115原畫");
                    z2 = true;
                }
            } else if (!z) {
                arrayList.add(((String) this.b.get("auto")) + "");
                z = true;
            }
        }
        try {
            this.d = str5;
            this.c = str2;
            JSONObject jSONObject = new JSONObject(d("share/snap?share_code=" + this.c + "&offset=0&receive_code=" + this.d + "&cid=" + str3 + "&asc=1&o=file_name")).getJSONObject("data");
            if ((str4 == null || str4.isEmpty())) {
                String strY = com.github.catvod.spider.merge.i0.GeneralUtils.y(jSONObject.getJSONObject("shareinfo").getString("share_title"));
                i(jSONObject);
                str6 = strY;
            } else {
                str6 = str4;
            }
            ArrayList<Yun115File> arrayList2 = new ArrayList();
            List<Yun115File> arrayList3 = new ArrayList<>();
            j(null, true, new Yun115File(str3), arrayList2, arrayList3, null);
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            for (Yun115File c0902a : arrayList2) {
                h.put(c0902a.d(), c0902a.h());
                arrayList4.add(c0902a.b() + "$" + str2 + "_" + this.d + '+' + c0902a.d() + '+' + com.github.catvod.spider.merge.i0.GeneralUtils.y(str6) + '+' + c0902a.f() + '+' + c0902a.i() + '+' + c0902a.h() + b(c0902a.f(), arrayList3));
                str6 = str6;
            }
            String str7 = str6;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayList4.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb.append((CharSequence) it.next());
                        if (it.hasNext()) {
                            sb.append((CharSequence) "#");
                        }
                    }
                }
                arrayList5.add(sb.toString());
            }
            com.github.catvod.bean.VodItem iVar = new com.github.catvod.bean.VodItem();
            iVar.l(str);
            iVar.j(str);
            iVar.n("https://is1-ssl.mzstatic.com/image/thumb/Purple221/v4/5f/ed/bf/5fedbfb2-1431-a324-97c5-327487d5817d/AppIcon-0-0-1x_U007emarketing-0-8-0-0-sRGB-85-220.png/350x350.png");
            iVar.m(str7);
            StringBuilder sb2 = new StringBuilder();
            Iterator it2 = arrayList5.iterator();
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
            iVar.g("115雲盤");
            return iVar;
        } catch (Exception unused) {
            return BaseApi.fakeVod(arrayList, "115雲盤");
        }
    }

    public final List<com.github.catvod.bean.VodItem> h(com.github.catvod.bean.JsonUtils jVar) {
        List<Yun115File> arrayList;
        String strD = jVar.d();
        String strC = jVar.c();
        String strF = jVar.f();
        String strE = jVar.e();
        String strB = (jVar.b() == null || jVar.b().isEmpty()) ? "0" : jVar.b();
        HashMap<String, String> mapA = jVar.a();
        List<Yun115File> arrayList2 = new ArrayList<>();
        ArrayList<Yun115File> arrayList3 = new ArrayList();
        try {
            String str = com.github.catvod.spider.merge.P0.e.c(strB) ? "0" : strB;
            this.d = strD;
            this.c = strC;
            JSONObject jSONObject = new JSONObject(d("share/snap?share_code=" + this.c + "&offset=0&receive_code=" + this.d + "&cid=" + str + "&asc=1&o=file_name")).getJSONObject("data");
            if ((strF == null || strF.isEmpty())) {
                strF = jSONObject.getJSONObject("shareinfo").getString("share_title");
                i(jSONObject);
            }
            arrayList = new ArrayList<>();
            try {
                j(mapA, false, new Yun115File(strB), arrayList, new ArrayList<>(), arrayList3);
            } catch (Exception unused) {
                arrayList2 = arrayList;
                arrayList = arrayList2;
            }
        } catch (Exception unused2) {
        }
        ArrayList arrayList4 = new ArrayList();
        for (Yun115File c0902a : arrayList3) {
            com.github.catvod.bean.VodItem iVar = new com.github.catvod.bean.VodItem();
            StringBuilder sbA = com.github.catvod.spider.merge.C1.a.a(strC, "*#");
            sbA.append(c0902a.g());
            sbA.append("*#");
            sbA.append(c0902a.f());
            iVar.l(sbA.toString());
            iVar.m(c0902a.f());
            iVar.r(c0902a.m());
            arrayList4.add(iVar);
        }
        for (Yun115File c0902a2 : arrayList) {
            com.github.catvod.bean.VodItem iVar2 = new com.github.catvod.bean.VodItem();
            iVar2.l(strE + "_" + strB + "*#" + strF);
            iVar2.m(c0902a2.b());
            iVar2.r(c0902a2.m());
            iVar2.n(c0902a2.l());
            arrayList4.add(iVar2);
        }
        return arrayList4;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final String k(String[] strArr, String str) {
        String str2;
        String isoDownloadUrl;
        try {
            if (!Server.v()) {
                Thread.sleep(2000L);
            }
            if (NetPan.isYunSelf115(strArr[0])) {
                str2 = C0773p.a.c + "/api/downloadByFileId/?fileId=" + URLEncoder.encode(strArr[1]) + "&cookie=" + URLEncoder.encode(this.e.b());
            } else {
                str2 = C0773p.a.c + "/api/downloadByShareCode/?shareId=" + URLEncoder.encode(strArr[0].split("_")[0]) + "&pwd=" + URLEncoder.encode(strArr[0].split("_")[1]) + "&fileId=" + URLEncoder.encode(strArr[1]) + "&cookie=" + URLEncoder.encode(this.e.b());
            }
            int i = 2;
            if (((CharSequence) g.get(str2) == null || ((CharSequence) g.get(str2)).length() == 0)) {
                String strL = com.github.catvod.spider.merge.f0.d.l(str2);
                String str3 = strL.split("\\*#")[0];
                String strF = strL.split("\\*#")[1];
                if (strF.startsWith("https")) {
                    if (NetPan.isYunSelf115(strArr[0])) {
                        strF = Server.F(strF);
                    }
                    g.put(str2, strF);
                    Init.execute(new RunnableC0778t(this, strArr, str3, i));
                }
            }
            String str4 = (String) g.get(str2);
            String str5 = strArr[2] + strArr[3];
            if (str.contains("阿里")) {
                if (((CharSequence) g.get("阿里" + strArr[1]) != null && ((CharSequence) g.get("阿里" + strArr[1])).length() > 0)) {
                    isoDownloadUrl = (String) g.get("阿里" + strArr[1]);
                } else {
                    isoDownloadUrl = C0773p.a.o(str5, str4, Long.valueOf((long) Double.parseDouble(strArr[4])), strArr[5]);
                    if ((isoDownloadUrl != null && !isoDownloadUrl.isEmpty())) {
                        g.put("阿里" + strArr[1], isoDownloadUrl);
                    }
                }
            } else if (BaseApi.get().d.booleanValue()) {
                BaseApi.get().downloadFileWithDownloadManager(str4, str5, e());
                SpiderDebug.log("正在下载 " + str5);
                isoDownloadUrl = Server.B();
            } else {
                isoDownloadUrl = NetPan.getIsoDownloadUrl(str4);
            }
            com.github.catvod.bean.g gVar = new com.github.catvod.bean.g();
            gVar.w(isoDownloadUrl);
            gVar.a(C0773p.a.t(strArr));
            gVar.i();
            gVar.v(f(strArr));
            gVar.g(str.contains("阿里") ? C0773p.a.x() : e());
            return gVar.toString();
        } catch (Exception e) {
            StringBuilder sbB = new StringBuilder("yun115 api error");
            sbB.append(e.getMessage());
            SpiderDebug.log(sbB.toString());
            com.github.catvod.bean.g gVar2 = new com.github.catvod.bean.g();
            gVar2.w("4234234");
            return gVar2.toString();
        }
    }

    public final void l(String str, boolean z) {
        if (com.github.catvod.spider.merge.P0.e.c(this.e.b()) || z) {
            SpiderDebug.log("set new Cookie:" + str);
            if (str != null && str.startsWith("http")) {
                str = com.github.catvod.spider.merge.f0.d.l(str).trim();
            }
            if ((str != null && !str.isEmpty())) {
                com.github.catvod.spider.merge.b0.c cVar = this.e;
                if (str.endsWith(";")) {
                    str = str.substring(0, str.length() - 1);
                }
                cVar.d(str);
                this.e.c();
                g = new HashMap(512);
                h = new HashMap(4096);
            }
        }
    }
}
