package com.github.catvod.spider.merge.I;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.l.C1290c;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class E0 {
    private static Map<String, com.github.catvod.spider.merge.Y.a> e;
    private static Map<String, String> f;
    private final Map<String, String> a;
    private final Map<String, String> b;
    public com.github.catvod.spider.merge.Y.c c;
    private String d;

    E0() {
        new ReentrantLock(true);
        new ReentrantLock(true);
        new ArrayList();
        com.github.catvod.spider.merge.Y.c cVar = (com.github.catvod.spider.merge.Y.c) com.github.catvod.spider.merge.C.u.a(com.github.catvod.spider.merge.g.b.d(com.github.catvod.spider.merge.g.b.f("115_user")), com.github.catvod.spider.merge.Y.c.class);
        this.c = cVar == null ? new com.github.catvod.spider.merge.Y.c() : cVar;
        StringBuilder sbB = t0.b("uc QuarkPanApi constructor user:");
        sbB.append(this.c);
        SpiderDebug.log(sbB.toString());
        HashMap map = new HashMap();
        this.a = map;
        map.put("4K", "4k");
        map.put("2k", "2k");
        map.put("超清", "super");
        map.put("高清", "high");
        map.put("標清", "low");
        map.put("流暢", "normal");
        this.d = "4kz|4k|2k|super|high|low";
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
        new HashMap(128);
        new HashMap(512);
        f = new HashMap(4096);
        e = new HashMap(4096);
    }

    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public static String a(String str, List<String> list) {
        com.github.catvod.bean.VodItem iVarFakeVod;
        String[] strArrSplit = list.get(0).trim().split("_");
        String str2 = strArrSplit[0];
        com.github.catvod.spider.merge.B.h.b("115 detailContent url:", str2);
        E0 e0 = D0.a;
        String str3 = strArrSplit.length > 1 ? strArrSplit[1] : "0";
        e0.getClass();
        ArrayList arrayList = new ArrayList();
        String[] strArrSplit2 = e0.d.split("\\|");
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < strArrSplit2.length; i++) {
            if (strArrSplit2[i].equals("4k") || strArrSplit2[i].equals("4kz")) {
                if (!z2) {
                    arrayList.add("115原畫");
                    z2 = true;
                }
            } else if (!z) {
                arrayList.add(((String) e0.b.get("auto")) + "");
                z = true;
            }
        }
        try {
            ArrayList<com.github.catvod.spider.merge.Y.a> arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            e0.f(null, true, new com.github.catvod.spider.merge.Y.a(str3), arrayList2, arrayList3, null);
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            for (com.github.catvod.spider.merge.Y.a aVar : arrayList2) {
                f.put(aVar.d(), aVar.h());
                arrayList4.add(aVar.b() + "$self115_" + ((String) null) + '+' + aVar.d() + '+' + com.github.catvod.spider.merge.i0.m.y(str) + '+' + aVar.f() + '+' + aVar.i() + '+' + aVar.h() + e0.b(aVar.f(), arrayList3));
            }
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
            iVarFakeVod = new com.github.catvod.bean.VodItem();
            iVarFakeVod.l(str2);
            iVarFakeVod.j(str2);
            iVarFakeVod.n("https://is1-ssl.mzstatic.com/image/thumb/Purple221/v4/5f/ed/bf/5fedbfb2-1431-a324-97c5-327487d5817d/AppIcon-0-0-1x_U007emarketing-0-8-0-0-sRGB-85-220.png/350x350.png");
            iVarFakeVod.m(str);
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
            iVarFakeVod.p(sb2.toString());
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
            iVarFakeVod.o(sb3.toString());
            iVarFakeVod.g("115雲盤");
        } catch (Exception unused) {
            iVarFakeVod = BaseApi.fakeVod(arrayList, "115雲盤");
        }
        return com.github.catvod.bean.g.m(iVarFakeVod);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    private String b(String str, List<com.github.catvod.spider.merge.Y.a> list) {
        ArrayList<com.github.catvod.spider.merge.Y.a> arrayList = new ArrayList();
        String lowerCase = com.github.catvod.spider.merge.i0.m.x(str).toLowerCase();
        for (com.github.catvod.spider.merge.Y.a aVar : list) {
            String lowerCase2 = com.github.catvod.spider.merge.i0.m.x(aVar.f()).toLowerCase();
            if (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase)) {
                arrayList.add(aVar);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(list);
        }
        StringBuilder sb = new StringBuilder();
        for (com.github.catvod.spider.merge.Y.a aVar2 : arrayList) {
            f.put(aVar2.d(), aVar2.h());
            sb.append("+");
            sb.append(com.github.catvod.spider.merge.i0.m.x(aVar2.f()));
            sb.append("@@@");
            sb.append(aVar2.c());
            sb.append("@@@");
            sb.append(aVar2.a());
        }
        return sb.toString();
    }

    public static E0 c() {
        return D0.a;
    }

    private String d(String str) throws InterruptedException {
        if (!str.startsWith("https")) {
            str = C1290c.a("https://webapi.115.com/", str);
        }
        HashMap map = new HashMap();
        HashMap mapB = com.github.catvod.spider.merge.B.e.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) quark-cloud-drive/3.2.0 Chrome/100.0.4896.160 Electron/18.3.5.17-1a44cfa97d Safari/537.36 Channel/pckk_other_ch", "Referer", "https://115.com/");
        mapB.put("Cookie", this.c.a());
        String strM = null;
        int i = 2;
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                break;
            }
            strM = com.github.catvod.spider.merge.f0.d.m(str, mapB, map);
            SpiderDebug.log("quark get result:" + strM);
            if (strM.length() > 10) {
                break;
            }
            Thread.sleep(500L);
            i = i2;
        }
        SpiderDebug.log("115 get url:" + str + " headers:" + mapB + " newcookie: result:" + strM);
        return strM;
    }

    /* JADX WARN: Type inference failed for: r2v19, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.Y.a>] */
    private void f(HashMap<String, String> map, boolean z, com.github.catvod.spider.merge.Y.a aVar, List<com.github.catvod.spider.merge.Y.a> list, List<com.github.catvod.spider.merge.Y.a> list2, List<com.github.catvod.spider.merge.Y.a> list3) {
        if (z) {
            try {
                list3 = new ArrayList<>();
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        SpiderDebug.log("listFiles >> " + map);
        StringBuilder sb = new StringBuilder();
        sb.append("files?files?aid=1&cid=");
        sb.append(aVar.g());
        sb.append("&o=user_ptime&asc=0&offset=0&show_dir=");
        sb.append(z ? "0" : "1");
        sb.append("&limit=40000&code=&scid=&snap=0&natsort=0&record_open_time=1&count_folders=1&type=&source=&format=json");
        String strD = d(sb.toString());
        SpiderDebug.log("listFiles >> " + strD);
        com.github.catvod.spider.merge.Y.a aVar2 = (com.github.catvod.spider.merge.Y.a) new Gson().fromJson(new JSONObject(strD).toString(), com.github.catvod.spider.merge.Y.a.class);
        try {
            if (!aVar2.e().isEmpty()) {
                Collections.sort(aVar2.e(), new com.github.catvod.spider.merge.Y.b());
            }
        } catch (Exception e3) {
            com.github.catvod.spider.merge.i0.m.w("listFiles error" + e3.getMessage());
        }
        for (com.github.catvod.spider.merge.Y.a aVar3 : aVar2.e()) {
            if ("folder".equals(aVar3.m())) {
                list3.add(aVar3);
            } else if (aVar3.j() != null && (BaseApi.get().d.booleanValue() || com.github.catvod.spider.merge.P0.e.d(com.github.catvod.spider.merge.i0.m.m(aVar3.f())))) {
                aVar3.n(aVar.d());
                e.put(aVar3.d(), aVar3);
                list.add(aVar3);
            } else if (com.github.catvod.spider.merge.i0.m.r(aVar3.c())) {
                list2.add(aVar3);
            }
        }
        if (z) {
            Iterator<com.github.catvod.spider.merge.Y.a> it = list3.iterator();
            while (it.hasNext()) {
                f(map, z, it.next(), list, list2, null);
            }
        }
    }

    public final List<com.github.catvod.bean.VodItem> e(com.github.catvod.bean.j jVar) {
        List<com.github.catvod.spider.merge.Y.a> arrayList;
        String str;
        String strC = jVar.c();
        String strE = jVar.e();
        String strB = com.github.catvod.spider.merge.P0.e.b(jVar.b()) ? "0" : jVar.b();
        HashMap<String, String> mapA = jVar.a();
        List<com.github.catvod.spider.merge.Y.a> arrayList2 = new ArrayList<>();
        ArrayList<com.github.catvod.spider.merge.Y.a> arrayList3 = new ArrayList();
        try {
            str = com.github.catvod.spider.merge.P0.e.c(strB) ? "0" : strB;
            arrayList = new ArrayList<>();
        } catch (Exception unused) {
        }
        try {
            f(mapA, false, new com.github.catvod.spider.merge.Y.a(str), arrayList, new ArrayList<>(), arrayList3);
        } catch (Exception unused2) {
            arrayList2 = arrayList;
            arrayList = arrayList2;
        }
        ArrayList arrayList4 = new ArrayList();
        for (com.github.catvod.spider.merge.Y.a aVar : arrayList3) {
            com.github.catvod.bean.VodItem iVar = new com.github.catvod.bean.VodItem();
            StringBuilder sbA = com.github.catvod.spider.merge.C1.a.a(strC, "*#");
            sbA.append(aVar.g());
            sbA.append("*#");
            sbA.append(aVar.f());
            iVar.l(sbA.toString());
            iVar.m(aVar.f());
            iVar.r(aVar.m());
            iVar.p("https://is1-ssl.mzstatic.com/image/thumb/Purple221/v4/5f/ed/bf/5fedbfb2-1431-a324-97c5-327487d5817d/AppIcon-0-0-1x_U007emarketing-0-8-0-0-sRGB-85-220.png/350x350.png");
            arrayList4.add(iVar);
        }
        for (com.github.catvod.spider.merge.Y.a aVar2 : arrayList) {
            com.github.catvod.bean.VodItem iVar2 = new com.github.catvod.bean.VodItem();
            StringBuilder sbA2 = com.github.catvod.spider.merge.C1.a.a(strE, "_");
            sbA2.append(aVar2.g());
            sbA2.append("*#");
            sbA2.append(aVar2.f());
            iVar2.l(sbA2.toString());
            iVar2.m(aVar2.b());
            iVar2.r(aVar2.m());
            iVar2.n(aVar2.l());
            iVar2.p("https://is1-ssl.mzstatic.com/image/thumb/Purple221/v4/5f/ed/bf/5fedbfb2-1431-a324-97c5-327487d5817d/AppIcon-0-0-1x_U007emarketing-0-8-0-0-sRGB-85-220.png/350x350.png");
            arrayList4.add(iVar2);
        }
        return arrayList4;
    }

    public final void g(String str) {
        if (com.github.catvod.spider.merge.P0.e.c(this.c.a())) {
            com.github.catvod.spider.merge.B.h.b("set new Cookie:", str);
            if (str != null && str.startsWith("http")) {
                str = com.github.catvod.spider.merge.f0.d.l(str).trim();
            }
            if (com.github.catvod.spider.merge.P0.e.d(str)) {
                com.github.catvod.spider.merge.Y.c cVar = this.c;
                if (str.endsWith(";")) {
                    str = str.substring(0, str.length() - 1);
                }
                cVar.b(str);
                com.github.catvod.spider.merge.Y.c cVar2 = this.c;
                cVar2.getClass();
                Init.execute(new RunnableC0744a0(cVar2, 2));
                new HashMap(512);
                f = new HashMap(4096);
            }
        }
    }
}
