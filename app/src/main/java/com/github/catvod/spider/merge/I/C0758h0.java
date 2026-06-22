package com.github.catvod.spider.merge.I;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.l.C1290c;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.I.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0758h0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0758h0() {
        this(0);
        this.a = 0;
    }

    public /* synthetic */ C0758h0(int i) {
        this.a = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0758h0(com.github.catvod.spider.merge.B.e eVar) {
        this(1);
        this.a = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r4, java.util.List r5) {
        /*
            r0 = 0
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = r5.trim()
            java.lang.String r0 = "_"
            boolean r1 = r5.contains(r0)
            if (r1 == 0) goto L29
            r1 = 2
            java.lang.String[] r0 = r5.split(r0, r1)
            int r1 = r0.length
            r2 = 1
            if (r1 <= r2) goto L29
            r1 = r0[r2]
            java.lang.String r3 = "root"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L29
            r0 = r0[r2]
            goto L2b
        L29:
            java.lang.String r0 = "0"
        L2b:
            com.github.catvod.spider.merge.I.h0 r1 = com.github.catvod.spider.merge.I.C0756g0.a
            java.lang.String r2 = "selfquark"
            com.github.catvod.spider.merge.K.VodItem r4 = r1.j(r5, r2, r0, r4)
            java.lang.String r4 = com.github.catvod.spider.merge.K.g.m(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.I.C0758h0.a(java.lang.String, java.util.List):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(java.lang.String r4, java.util.List r5) {
        /*
            r0 = 0
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = r5.trim()
            java.lang.String r0 = "_"
            boolean r1 = r5.contains(r0)
            if (r1 == 0) goto L29
            r1 = 2
            java.lang.String[] r0 = r5.split(r0, r1)
            int r1 = r0.length
            r2 = 1
            if (r1 <= r2) goto L29
            r1 = r0[r2]
            java.lang.String r3 = "root"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L29
            r0 = r0[r2]
            goto L2b
        L29:
            java.lang.String r0 = "0"
        L2b:
            com.github.catvod.spider.merge.I.h0 r1 = com.github.catvod.spider.merge.I.w0.a
            java.lang.String r2 = "selfuc"
            com.github.catvod.spider.merge.K.VodItem r4 = r1.j(r5, r2, r0, r4)
            java.lang.String r4 = com.github.catvod.spider.merge.K.g.m(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.I.C0758h0.b(java.lang.String, java.util.List):java.lang.String");
    }

    private String c(String str, List list) {
        ArrayList<com.github.catvod.spider.merge.S.a> arrayList = new ArrayList();
        String lowerCase = com.github.catvod.spider.merge.i0.m.x(str).toLowerCase();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.github.catvod.spider.merge.S.a aVar = (com.github.catvod.spider.merge.S.a) it.next();
            String lowerCase2 = com.github.catvod.spider.merge.i0.m.x(aVar.f()).toLowerCase();
            if (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase)) {
                arrayList.add(aVar);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(list);
        }
        StringBuilder sb = new StringBuilder();
        for (com.github.catvod.spider.merge.S.a aVar2 : arrayList) {
            sb.append("+");
            sb.append(com.github.catvod.spider.merge.i0.m.x(aVar2.f()));
            sb.append("@@@");
            sb.append(aVar2.c());
            sb.append("@@@");
            sb.append(aVar2.d());
        }
        return sb.toString();
    }

    private String d(String str, List list) {
        ArrayList<com.github.catvod.spider.merge.S.a> arrayList = new ArrayList();
        String lowerCase = com.github.catvod.spider.merge.i0.m.x(str).toLowerCase();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.github.catvod.spider.merge.S.a aVar = (com.github.catvod.spider.merge.S.a) it.next();
            String lowerCase2 = com.github.catvod.spider.merge.i0.m.x(aVar.f()).toLowerCase();
            if (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase)) {
                arrayList.add(aVar);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(list);
        }
        StringBuilder sb = new StringBuilder();
        for (com.github.catvod.spider.merge.S.a aVar2 : arrayList) {
            sb.append("+");
            sb.append(com.github.catvod.spider.merge.i0.m.x(aVar2.f()));
            sb.append("@@@");
            sb.append(aVar2.c());
            sb.append("@@@");
            sb.append(aVar2.d());
        }
        return sb.toString();
    }

    public static C0758h0 e() {
        return C0756g0.a;
    }

    private String f(String str) throws InterruptedException {
        if (!str.startsWith("https")) {
            str = C1290c.a("https://drive-pc.quark.cn/", str);
        }
        HashMap<String, String> mapS = C0752e0.a.s("");
        int i = 2;
        String strM = null;
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                break;
            }
            strM = com.github.catvod.spider.merge.f0.d.m(str, mapS, null);
            SpiderDebug.log("quarkSelf get result:" + strM);
            if (strM.length() > 10) {
                break;
            }
            Thread.sleep(500L);
            i = i2;
        }
        SpiderDebug.log("quarkSelf get url:" + str + " result:" + strM);
        return strM;
    }

    public static C0758h0 g() {
        return w0.a;
    }

    private String h(String str) throws InterruptedException {
        if (!str.startsWith("https")) {
            str = C1290c.a("https://drive-pc.quark.cn/", str);
        }
        HashMap<String, String> mapV = u0.a.v("");
        int i = 2;
        String strM = null;
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                break;
            }
            strM = com.github.catvod.spider.merge.f0.d.m(str, mapV, null);
            SpiderDebug.log("ucSelf get result:" + strM);
            if (strM.length() > 10) {
                break;
            }
            Thread.sleep(500L);
            i = i2;
        }
        SpiderDebug.log("ucSelf get url:" + str + " result:" + strM);
        return strM;
    }

    private void l(HashMap map, boolean z, com.github.catvod.spider.merge.S.a aVar, List list, List list2, List list3, int i) {
        if (z && list3 == null) {
            try {
                list3 = new ArrayList();
            } catch (Exception e) {
                SpiderDebug.log("quarkSelf listFiles error:" + e);
                e.printStackTrace();
                return;
            }
        }
        String str = "updated_at";
        if (map == null || !"updated_at".equals(map.get("type"))) {
            str = "file_type:asc,file_name";
        }
        String strF = f("1/clouddrive/file/sort?pr=ucpro&fr=pc&uc_param_str=&pdir_fid=" + aVar.d() + "&_page=" + i + "&_size=50&_fetch_total=1&_fetch_sub_dirs=0&_sort=" + str + ":" + ((map == null || map.get("order") == null) ? "asc" : ((String) map.get("order")).toLowerCase()));
        StringBuilder sb = new StringBuilder();
        sb.append("quarkSelf listFiles >> ");
        sb.append(strF);
        SpiderDebug.log(sb.toString());
        JSONObject jSONObject = new JSONObject(strF);
        if (jSONObject.getInt("status") == 401) {
            com.github.catvod.spider.merge.i0.m.w("夸克 cookie 已失效，请重新配置");
            return;
        }
        com.github.catvod.spider.merge.S.a aVarL = com.github.catvod.spider.merge.S.a.l(jSONObject.getJSONObject("data").toString());
        try {
            if (!aVarL.e().isEmpty()) {
                com.github.catvod.spider.merge.S.d.a(aVarL.e());
            }
        } catch (Exception e2) {
            SpiderDebug.log("quarkSelf listFiles sort error:" + e2.getMessage());
        }
        for (com.github.catvod.spider.merge.S.a aVar2 : aVarL.e()) {
            if ("folder".equals(aVar2.k())) {
                list3.add(aVar2);
            } else if (BaseApi.get().d.booleanValue() || com.github.catvod.spider.merge.P0.e.d(com.github.catvod.spider.merge.i0.m.m(aVar2.f()))) {
                aVar2.m(aVar.f());
                list.add(aVar2);
            } else if (com.github.catvod.spider.merge.i0.m.r(aVar2.c())) {
                list2.add(aVar2);
            }
        }
        com.github.catvod.spider.merge.S.c cVar = (com.github.catvod.spider.merge.S.c) new Gson().fromJson(jSONObject.getJSONObject("metadata").toString(), com.github.catvod.spider.merge.S.c.class);
        if (((cVar.b() - 1) * cVar.c()) + cVar.a() < cVar.d()) {
            l(map, z, aVar, list, list2, list3, cVar.b() + 1);
        }
        if (z) {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                l(map, z, (com.github.catvod.spider.merge.S.a) it.next(), list, list2, null, 1);
            }
        }
    }

    private void m(HashMap map, boolean z, com.github.catvod.spider.merge.S.a aVar, List list, List list2, List list3, int i) {
        if (z && list3 == null) {
            try {
                list3 = new ArrayList();
            } catch (Exception e) {
                SpiderDebug.log("ucSelf listFiles error:" + e);
                e.printStackTrace();
                return;
            }
        }
        String str = "updated_at";
        if (map == null || !"updated_at".equals(map.get("type"))) {
            str = "file_type:asc,file_name";
        }
        String strH = h("1/clouddrive/file/sort?pr=UCBrowser&fr=pc&uc_param_str=&pdir_fid=" + aVar.d() + "&_page=" + i + "&_size=50&_fetch_total=1&_fetch_sub_dirs=0&_sort=" + str + ":" + ((map == null || map.get("order") == null) ? "asc" : ((String) map.get("order")).toLowerCase()));
        StringBuilder sb = new StringBuilder();
        sb.append("ucSelf listFiles >> ");
        sb.append(strH);
        SpiderDebug.log(sb.toString());
        JSONObject jSONObject = new JSONObject(strH);
        if (jSONObject.getInt("status") == 401) {
            com.github.catvod.spider.merge.i0.m.w("UC cookie 已失效，请重新配置");
            return;
        }
        com.github.catvod.spider.merge.S.a aVarL = com.github.catvod.spider.merge.S.a.l(jSONObject.getJSONObject("data").toString());
        try {
            if (!aVarL.e().isEmpty()) {
                com.github.catvod.spider.merge.S.d.a(aVarL.e());
            }
        } catch (Exception e2) {
            SpiderDebug.log("ucSelf listFiles sort error:" + e2.getMessage());
        }
        for (com.github.catvod.spider.merge.S.a aVar2 : aVarL.e()) {
            if ("folder".equals(aVar2.k())) {
                list3.add(aVar2);
            } else if (BaseApi.get().d.booleanValue() || com.github.catvod.spider.merge.P0.e.d(com.github.catvod.spider.merge.i0.m.m(aVar2.f()))) {
                aVar2.m(aVar.f());
                list.add(aVar2);
            } else if (com.github.catvod.spider.merge.i0.m.r(aVar2.c())) {
                list2.add(aVar2);
            }
        }
        com.github.catvod.spider.merge.S.c cVar = (com.github.catvod.spider.merge.S.c) new Gson().fromJson(jSONObject.getJSONObject("metadata").toString(), com.github.catvod.spider.merge.S.c.class);
        if (((cVar.b() - 1) * cVar.c()) + cVar.a() < cVar.d()) {
            m(map, z, aVar, list, list2, list3, cVar.b() + 1);
        }
        if (z) {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                m(map, z, (com.github.catvod.spider.merge.S.a) it.next(), list, list2, null, 1);
            }
        }
    }

    public final List i() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                arrayList.add("夸克原畫");
                if (NetPan.containPuHua()) {
                    arrayList.add("夸克普畫");
                }
                return arrayList;
            default:
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add("UC原畫");
                if (NetPan.containPuHua()) {
                    arrayList2.add("UC普畫");
                }
                return arrayList2;
        }
    }

    public final com.github.catvod.spider.merge.K.VodItem j(String str, String str2, String str3, String str4) {
        List list;
        List list2;
        String str5;
        CharSequence charSequence;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i;
        switch (this.a) {
            case 0:
                List listI = i();
                try {
                    ArrayList<com.github.catvod.spider.merge.S.a> arrayList3 = new ArrayList();
                    List arrayList4 = new ArrayList();
                    com.github.catvod.spider.merge.S.a aVar = new com.github.catvod.spider.merge.S.a(str3);
                    List list3 = arrayList4;
                    list2 = listI;
                    charSequence = "#";
                    try {
                        l(null, true, aVar, arrayList3, list3, null, 1);
                        arrayList = new ArrayList();
                        arrayList2 = new ArrayList();
                        for (com.github.catvod.spider.merge.S.a aVar2 : arrayList3) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(aVar2.b());
                            sb.append("$");
                            sb.append(str2);
                            sb.append('+');
                            sb.append(aVar2.d());
                            sb.append('+');
                            sb.append(com.github.catvod.spider.merge.i0.m.y(str4));
                            sb.append('+');
                            sb.append(aVar2.f());
                            List list4 = list3;
                            sb.append(c(aVar2.f(), list4));
                            arrayList.add(sb.toString());
                            list3 = list4;
                        }
                        i = 0;
                    } catch (Exception e) {
                        e = e;
                        str5 = "夸克雲盤";
                    }
                } catch (Exception e2) {
                    e = e2;
                    list2 = listI;
                    str5 = "夸克雲盤";
                }
                while (true) {
                    ArrayList arrayList5 = (ArrayList) list2;
                    if (i < arrayList5.size()) {
                        StringBuilder sb2 = new StringBuilder();
                        Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            while (true) {
                                sb2.append((CharSequence) it.next());
                                if (it.hasNext()) {
                                    CharSequence charSequence2 = charSequence;
                                    sb2.append(charSequence2);
                                    charSequence = charSequence2;
                                }
                            }
                        }
                        arrayList2.add(sb2.toString());
                        i++;
                        charSequence = charSequence;
                    } else {
                        com.github.catvod.spider.merge.K.VodItem iVar = new com.github.catvod.spider.merge.K.VodItem();
                        iVar.l(str);
                        iVar.j(str);
                        iVar.n("https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/c7/6c/55/c76c5544-64a5-882a-3862-c68b28f16299/AppIcon-0-0-1x_U007ephone-0-11-0-0-85-220.png/350x350.png");
                        iVar.m(str4);
                        StringBuilder sb3 = new StringBuilder();
                        Iterator it2 = arrayList2.iterator();
                        if (it2.hasNext()) {
                            while (true) {
                                sb3.append((CharSequence) it2.next());
                                if (it2.hasNext()) {
                                    sb3.append((CharSequence) "$$$");
                                }
                            }
                        }
                        iVar.p(sb3.toString());
                        StringBuilder sb4 = new StringBuilder();
                        Iterator it3 = arrayList5.iterator();
                        if (it3.hasNext()) {
                            while (true) {
                                sb4.append((CharSequence) it3.next());
                                if (it3.hasNext()) {
                                    sb4.append((CharSequence) "$$$");
                                }
                            }
                        }
                        iVar.o(sb4.toString());
                        str5 = "夸克雲盤";
                        try {
                            iVar.g(str5);
                            return iVar;
                        } catch (Exception e3) {
                            e = e3;
                        }
                    }
                    SpiderDebug.log("quarkSelf getVod error:" + e);
                    return BaseApi.fakeVod(list2, str5);
                }
            default:
                List listI2 = i();
                try {
                    ArrayList<com.github.catvod.spider.merge.S.a> arrayList6 = new ArrayList();
                    List arrayList7 = new ArrayList();
                    com.github.catvod.spider.merge.S.a aVar3 = new com.github.catvod.spider.merge.S.a(str3);
                    List list5 = arrayList7;
                    CharSequence charSequence3 = "#";
                    try {
                        m(null, true, aVar3, arrayList6, arrayList7, null, 1);
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        for (com.github.catvod.spider.merge.S.a aVar4 : arrayList6) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(aVar4.b());
                            sb5.append("$");
                            sb5.append(str2);
                            sb5.append('+');
                            sb5.append(aVar4.d());
                            sb5.append('+');
                            sb5.append(com.github.catvod.spider.merge.i0.m.y(str4));
                            sb5.append('+');
                            sb5.append(aVar4.f());
                            List list6 = list5;
                            sb5.append(d(aVar4.f(), list6));
                            arrayList8.add(sb5.toString());
                            list5 = list6;
                            break;
                        }
                        list = listI2;
                        int i2 = 0;
                        while (true) {
                            try {
                                ArrayList arrayList10 = (ArrayList) list;
                                if (i2 >= arrayList10.size()) {
                                    com.github.catvod.spider.merge.K.VodItem iVar2 = new com.github.catvod.spider.merge.K.VodItem();
                                    iVar2.l(str);
                                    iVar2.j(str);
                                    iVar2.n("https://ts1.cn.mm.bing.net/th/id/R-C.421c96e47df7c9719403654ee4f7c281?rik=yiiEoGCTgDDc3w&riu=http%3a%2f%2fpic.9663.com%2fupload%2f2023-5%2f20235111411256277.png&ehk=R81N%2flXMrl%2bxpRlST8DtHXDfab6rzaMb83gihuD71Fk%3d&risl=&pid=ImgRaw&r=0");
                                    iVar2.m(str4);
                                    StringBuilder sb6 = new StringBuilder();
                                    Iterator it4 = arrayList9.iterator();
                                    if (it4.hasNext()) {
                                        while (true) {
                                            sb6.append((CharSequence) it4.next());
                                            if (it4.hasNext()) {
                                                sb6.append((CharSequence) "$$$");
                                            }
                                        }
                                    }
                                    iVar2.p(sb6.toString());
                                    StringBuilder sb7 = new StringBuilder();
                                    Iterator it5 = arrayList10.iterator();
                                    if (it5.hasNext()) {
                                        while (true) {
                                            sb7.append((CharSequence) it5.next());
                                            if (it5.hasNext()) {
                                                sb7.append((CharSequence) "$$$");
                                            }
                                        }
                                    }
                                    iVar2.o(sb7.toString());
                                    iVar2.g("UC雲盤");
                                    return iVar2;
                                }
                                StringBuilder sb8 = new StringBuilder();
                                Iterator it6 = arrayList8.iterator();
                                if (it6.hasNext()) {
                                    while (true) {
                                        sb8.append((CharSequence) it6.next());
                                        if (it6.hasNext()) {
                                            CharSequence charSequence4 = charSequence3;
                                            sb8.append(charSequence4);
                                            charSequence3 = charSequence4;
                                        }
                                    }
                                }
                                arrayList9.add(sb8.toString());
                                i2++;
                                charSequence3 = charSequence3;
                            } catch (Exception e4) {
                                e = e4;
                                SpiderDebug.log("ucSelf getVod error:" + e);
                                return BaseApi.fakeVod(list, "UC雲盤");
                            }
                        }
                    } catch (Exception e5) {
                        e = e5;
                        list = listI2;
                    }
                } catch (Exception e6) {
                    e = e6;
                    list = listI2;
                }
                break;
        }
    }

    public final List k(com.github.catvod.spider.merge.K.JsonUtils jVar) {
        String strB;
        switch (this.a) {
            case 0:
                String strC = jVar.c();
                String strF = jVar.f();
                String strE = jVar.e();
                strB = com.github.catvod.spider.merge.P0.e.b(jVar.b()) ? "0" : jVar.b();
                HashMap mapA = jVar.a();
                ArrayList<com.github.catvod.spider.merge.S.a> arrayList = new ArrayList();
                ArrayList<com.github.catvod.spider.merge.S.a> arrayList2 = new ArrayList();
                try {
                } catch (Exception e) {
                    SpiderDebug.log("quarkSelf getVodFolder error:" + e);
                }
                if (com.github.catvod.spider.merge.P0.e.c(C0752e0.a.m.d())) {
                    com.github.catvod.spider.merge.i0.m.w("请先配置夸克 cookie");
                } else {
                    l(mapA, false, new com.github.catvod.spider.merge.S.a(strB), arrayList, new ArrayList(), arrayList2, 1);
                    ArrayList arrayList3 = new ArrayList();
                    for (com.github.catvod.spider.merge.S.a aVar : arrayList2) {
                        com.github.catvod.spider.merge.K.VodItem iVar = new com.github.catvod.spider.merge.K.VodItem();
                        StringBuilder sbA = com.github.catvod.spider.merge.C1.a.a(strC, "*#");
                        sbA.append(aVar.d());
                        sbA.append("*#");
                        sbA.append(aVar.f());
                        iVar.l(sbA.toString());
                        iVar.m(aVar.f());
                        iVar.r(aVar.k());
                        arrayList3.add(iVar);
                    }
                    for (com.github.catvod.spider.merge.S.a aVar2 : arrayList) {
                        com.github.catvod.spider.merge.K.VodItem iVar2 = new com.github.catvod.spider.merge.K.VodItem();
                        StringBuilder sbA2 = com.github.catvod.spider.merge.C1.a.a(strE, "_");
                        sbA2.append(aVar2.g());
                        sbA2.append("*#");
                        sbA2.append(strF);
                        iVar2.l(sbA2.toString());
                        iVar2.m(aVar2.b());
                        iVar2.r(aVar2.k());
                        iVar2.n(aVar2.j());
                        arrayList3.add(iVar2);
                    }
                }
                break;
            default:
                String strC2 = jVar.c();
                String strF2 = jVar.f();
                String strE2 = jVar.e();
                strB = com.github.catvod.spider.merge.P0.e.b(jVar.b()) ? "0" : jVar.b();
                HashMap mapA2 = jVar.a();
                ArrayList<com.github.catvod.spider.merge.S.a> arrayList4 = new ArrayList();
                ArrayList<com.github.catvod.spider.merge.S.a> arrayList5 = new ArrayList();
                try {
                } catch (Exception e2) {
                    SpiderDebug.log("ucSelf getVodFolder error:" + e2);
                }
                if (com.github.catvod.spider.merge.P0.e.c(u0.a.m.c())) {
                    com.github.catvod.spider.merge.i0.m.w("请先配置UC cookie");
                } else {
                    m(mapA2, false, new com.github.catvod.spider.merge.S.a(strB), arrayList4, new ArrayList(), arrayList5, 1);
                    ArrayList arrayList6 = new ArrayList();
                    for (com.github.catvod.spider.merge.S.a aVar3 : arrayList5) {
                        com.github.catvod.spider.merge.K.VodItem iVar3 = new com.github.catvod.spider.merge.K.VodItem();
                        StringBuilder sbA3 = com.github.catvod.spider.merge.C1.a.a(strC2, "*#");
                        sbA3.append(aVar3.d());
                        sbA3.append("*#");
                        sbA3.append(aVar3.f());
                        iVar3.l(sbA3.toString());
                        iVar3.m(aVar3.f());
                        iVar3.r(aVar3.k());
                        arrayList6.add(iVar3);
                    }
                    for (com.github.catvod.spider.merge.S.a aVar4 : arrayList4) {
                        com.github.catvod.spider.merge.K.VodItem iVar4 = new com.github.catvod.spider.merge.K.VodItem();
                        StringBuilder sbA4 = com.github.catvod.spider.merge.C1.a.a(strE2, "_");
                        sbA4.append(aVar4.g());
                        sbA4.append("*#");
                        sbA4.append(strF2);
                        iVar4.l(sbA4.toString());
                        iVar4.m(aVar4.b());
                        iVar4.r(aVar4.k());
                        iVar4.n(aVar4.j());
                        arrayList6.add(iVar4);
                    }
                }
                break;
        }
        return new ArrayList();
    }
}
