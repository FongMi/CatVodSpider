package com.github.catvod.utils.merge;

import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.Proxy;
import com.github.catvod.utils.merge.C1290c;
import com.github.catvod.utils.server.Server;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class Yun139Api {
    public String a;

    Yun139Api() {
    }

    public static Yun139Api a() {
        return K0.a;
    }

    private List<com.github.catvod.spider.merge.Z.b> b(String str, com.github.catvod.bean.VodItem iVar) {
        String strH = h("yun-share/richlifeApp/devapp/IOutLink/getOutLinkInfoV6", String.format("{\"getOutLinkInfoReq\":{\"account\":\"\",\"linkID\":\"%s\",\"passwd\":\"\",\"caSrt\":0,\"coSrt\":0,\"srtDr\":1,\"bNum\":1,\"pCaID\":\"root\",\"eNum\":200}}", str), false);
        ArrayList arrayList = new ArrayList();
        com.github.catvod.spider.merge.Z.e eVar = (com.github.catvod.spider.merge.Z.e) com.github.catvod.spider.merge.C.u.a(strH, com.github.catvod.spider.merge.Z.e.class);
        iVar.m(eVar.c.h);
        SpiderDebug.log("shareMediaEntity:" + eVar);
        List<com.github.catvod.spider.merge.Z.b> list = eVar.c.c;
        if (list != null) {
            Collections.sort(list, new com.github.catvod.spider.merge.Z.f());
            arrayList.addAll(eVar.c.c);
        }
        SpiderDebug.log("shareMediaEntity:" + eVar);
        f(str, arrayList, eVar);
        return arrayList;
    }

    private void f(String str, List<com.github.catvod.spider.merge.Z.b> list, com.github.catvod.spider.merge.Z.e eVar) {
        List<com.github.catvod.spider.merge.Z.a> list2 = eVar.c.b;
        if (list2 != null) {
            Iterator<com.github.catvod.spider.merge.Z.a> it = list2.iterator();
            while (it.hasNext()) {
                com.github.catvod.spider.merge.Z.e eVar2 = (com.github.catvod.spider.merge.Z.e) com.github.catvod.spider.merge.C.u.a(h("yun-share/richlifeApp/devapp/IOutLink/getOutLinkInfoV6", String.format("{\"getOutLinkInfoReq\":{\"extInfo\":{\"isReturnCdnDownloadUrl\":\"1\"},\"account\":\"\",\"linkID\":\"%s\",\"passwd\":\"\",\"caSrt\":0,\"coSrt\":0,\"srtDr\":1,\"bNum\":1,\"pCaID\":\"%s\",\"eNum\":200}}", str, it.next().f), false), com.github.catvod.spider.merge.Z.e.class);
                List<com.github.catvod.spider.merge.Z.b> list3 = eVar2.c.c;
                if (list3 != null) {
                    Collections.sort(list3, new com.github.catvod.spider.merge.Z.f());
                    list.addAll(eVar2.c.c);
                }
                f(str, list, eVar2);
            }
        }
    }

    private String h(String str, String str2, boolean z) {
        HashMap<String, String> mapD;
        String str3;
        if (!str.startsWith("https")) {
            str = C1290c.a("https://caiyun.139.com/", str);
        }
        com.github.catvod.spider.merge.i0.m.g(str2);
        String strG = com.github.catvod.spider.merge.i0.m.g(str2);
        if (z) {
            mapD = new HashMap<>();
            StringBuilder sbB = new StringBuilder("Authorization ");
            sbB.append(this.a);
            SpiderDebug.log(sbB.toString());
            mapD.put("Authorization", "Basic " + this.a);
            mapD.put("Content-Type", "application/json;charset=UTF-8");
            mapD.put("hcy-cool-flag", "1");
            mapD.put("x-DeviceInfo", "||9|12.27.0|chrome|120.0.0.0|||windows 10|746X932|zh-CN|||");
        } else {
            mapD = d();
        }
        com.github.catvod.spider.merge.f0.i iVarJ = com.github.catvod.spider.merge.f0.d.j(str, strG, mapD);
        byte[] bArrA = com.github.catvod.spider.merge.X0.a.a(iVarJ.a());
        byte[] bytes = "PVGDwmcvfs1uV3d1".getBytes();
        byte[] bArr = new byte[16];
        System.arraycopy(bArrA, 0, bArr, 0, 16);
        com.github.catvod.spider.merge.V0.a aVar = new com.github.catvod.spider.merge.V0.a(new com.github.catvod.spider.merge.U0.a(new com.github.catvod.spider.merge.T0.a()));
        aVar.e(false, new com.github.catvod.spider.merge.W0.b(new com.github.catvod.spider.merge.W0.a(bytes), bArr));
        byte[] bArr2 = new byte[aVar.d(bArrA.length - 16)];
        int iF = aVar.f(bArrA, 16, bArrA.length - 16, bArr2, 0);
        try {
            str3 = new String(bArr2, 0, iF + aVar.c(bArr2, iF), "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
            str3 = null;
        }
        SpiderDebug.log(iVarJ.b() + "," + str + "," + str3);
        return str3;
    }

    public final String c(String str, String str2) {
        try {
            Object[] objArr = new Object[3];
            String[] strArrSplit = new String(Base64.decode(this.a, 0)).split(":", 3);
            if (strArrSplit.length < 2) {
                throw new IllegalArgumentException("Authorization is invalid, splits < 2");
            }
            SpiderDebug.log(strArrSplit[1]);
            objArr[0] = strArrSplit[1];
            objArr[1] = str;
            objArr[2] = str2;
            return new JSONObject(h("yun-share/richlifeApp/devapp/IOutLink/dlFromOutLinkV3", String.format("{\"dlFromOutLinkReqV3\":{\"account\":\"%s\",\"linkID\":\"%s\",\"coIDLst\":{\"item\":[\"%s\"]},\"extInfo\":{\"isReturnCdnDownloadUrl\":\"1\"}}}", objArr), true)).getJSONObject("data").getString("redrUrl");
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public final HashMap<String, String> d() {
        HashMap<String, String> mapB = com.github.catvod.spider.merge.B.e.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36", "Content-Type", "application/json;charset=UTF-8");
        mapB.put("hcy-cool-flag", "1");
        mapB.put("x-DeviceInfo", "||9|12.27.0|chrome|120.0.0.0|||windows 10|746X932|zh-CN|||");
        return mapB;
    }

    public final com.github.catvod.bean.VodItem e(String str, String str2, String str3) {
        List listAsList = Arrays.asList("异动普畫", "异动原畫");
        try {
            com.github.catvod.bean.VodItem iVar = new com.github.catvod.bean.VodItem();
            List<com.github.catvod.spider.merge.Z.b> listB = b(str3, iVar);
            SpiderDebug.log("getCoLsts(shareId)");
            ArrayList arrayList = new ArrayList();
            for (com.github.catvod.spider.merge.Z.b bVar : (ArrayList) listB) {
                if ((com.github.catvod.spider.merge.i0.GeneralUtils.m(bVar.a()) != null && !com.github.catvod.spider.merge.i0.GeneralUtils.m(bVar.a()).isEmpty())) {
                    arrayList.add(bVar);
                }
            }
            SpiderDebug.log("Comparator.comparing");
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (int i = 0; i < arrayList.size(); i++) {
                com.github.catvod.spider.merge.Z.b bVar2 = (com.github.catvod.spider.merge.Z.b) arrayList.get(i);
                arrayList2.add(bVar2.b() + "$" + str3 + "+" + bVar2.p + "+" + str + "+" + bVar2.a() + "+" + bVar2.i);
            }
            for (int i2 = 0; i2 < listAsList.size(); i2++) {
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayList2.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb.append((CharSequence) it.next());
                        if (it.hasNext()) {
                            sb.append((CharSequence) "#");
                        }
                    }
                }
                arrayList3.add(sb.toString());
            }
            iVar.l(str2);
            iVar.j(str2);
            iVar.n(((com.github.catvod.spider.merge.Z.b) arrayList.get(0)).h);
            StringBuilder sb2 = new StringBuilder();
            Iterator it2 = arrayList3.iterator();
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
            Iterator it3 = listAsList.iterator();
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
            iVar.g("异动");
            return iVar;
        } catch (Exception unused) {
            return BaseApi.fakeVod(listAsList, "异动雲盤");
        }
    }

    public final String g(String[] strArr, boolean z) {
        String isoDownloadUrl;
        if (!z) {
            try {
                com.github.catvod.bean.g gVar = new com.github.catvod.bean.g();
                gVar.w(strArr[4]);
                gVar.g(d());
                return gVar.toString();
            } catch (Exception e) {
                e.printStackTrace();
                com.github.catvod.bean.g gVar2 = new com.github.catvod.bean.g();
                gVar2.w("");
                return gVar2.toString();
            }
        }
        try {
            System.out.println("https://danmu.lxian74a.repl.co/danmuku/?vodName=" + strArr[2] + "&jishu=" + strArr[3]);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        String strW = Server.w(strArr[0], strArr[1]);
        if (BaseApi.get().d.booleanValue()) {
            String str = strArr[2] + strArr[3];
            BaseApi.get().downloadFileWithDownloadManager(strW, str, d());
            SpiderDebug.log("正在下载 " + str);
            isoDownloadUrl = Server.B();
        } else {
            isoDownloadUrl = NetPan.getIsoDownloadUrl(strW);
        }
        com.github.catvod.bean.g gVar3 = new com.github.catvod.bean.g();
        gVar3.w(isoDownloadUrl);
        gVar3.i();
        gVar3.a(C0773p.a.t(strArr));
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArr) {
            if (str2.contains("@@@")) {
                String[] strArrSplit = str2.split("@@@");
                String str3 = strArrSplit[0];
                String str4 = strArrSplit[1];
                String str5 = Proxy.getUrl() + "?do=ali&type=sub&shareId=" + strArr[0] + "&fileId=" + strArrSplit[2];
                com.github.catvod.bean.h hVar = new com.github.catvod.bean.h();
                hVar.b(str3);
                com.github.catvod.bean.h hVarA = hVar.a(str4);
                hVarA.c(str5);
                arrayList.add(hVarA);
            }
        }
        gVar3.v(arrayList);
        gVar3.g(d());
        return gVar3.toString();
    }
}
