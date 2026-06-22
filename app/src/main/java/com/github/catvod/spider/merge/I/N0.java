package com.github.catvod.spider.merge.I;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.a0.C0890a;
import com.github.catvod.spider.merge.a0.C0891b;
import com.github.catvod.spider.merge.a0.C0894e;
import com.github.catvod.spider.merge.a0.C0895f;
import com.github.catvod.spider.merge.l.C1290c;
import com.github.catvod.utils.server.Server;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class N0 {
    public String a;

    N0() {
    }

    public static N0 a() {
        return M0.a;
    }

    private List<C0891b> b(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        String string = jSONObject.getString("shareId");
        String string2 = jSONObject.getString("fileId");
        String string3 = jSONObject.getString("accessCode");
        if (!jSONObject.getBoolean("isFolder")) {
            C0891b c0891b = new C0891b();
            c0891b.a = string2;
            c0891b.b = jSONObject.getString("fileName");
            c0891b.e = jSONObject.getLong("fileSize");
            arrayList.add(c0891b);
        }
        String str = com.github.catvod.spider.merge.P0.e.b(string3) ? "3" : "1";
        StringBuilder sb = new StringBuilder();
        sb.append("listShareDir.action?pageNum=1&pageSize=9999&fileId=");
        sb.append(string2);
        sb.append("&isFolder=true&shareId=");
        sb.append(string);
        sb.append("&shareMode=");
        C0894e c0894e = (C0894e) com.github.catvod.spider.merge.C.u.a(c(com.github.catvod.spider.merge.y.z.b(sb, str, "&iconOption=5&orderBy=lastOpTime&descending=true&accessCode=", string3)), C0894e.class);
        SpiderDebug.log("shareMediaEntity:" + c0894e);
        List<C0891b> list = c0894e.b.c;
        if (list != null) {
            Collections.sort(list, new C0895f());
            arrayList.addAll(c0894e.b.c);
        }
        SpiderDebug.log("shareMediaEntity:" + c0894e);
        e(string, string3, arrayList, c0894e);
        return arrayList;
    }

    private String c(String str) {
        if (!str.startsWith("https")) {
            str = C1290c.a("https://cloud.189.cn/api/open/share/", str);
        }
        String strM = com.github.catvod.spider.merge.f0.d.m(str, com.github.catvod.spider.merge.B.e.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36", "accept", "application/json;charset=UTF-8"), null);
        com.github.catvod.spider.merge.B.h.b("getString:", strM);
        return strM;
    }

    private void e(String str, String str2, List<C0891b> list, C0894e c0894e) {
        List<C0890a> list2 = c0894e.b.b;
        if (list2 != null) {
            for (C0890a c0890a : list2) {
                String str3 = com.github.catvod.spider.merge.P0.e.b(str2) ? "3" : "1";
                StringBuilder sbB = t0.b("listShareDir.action?pageNum=1&pageSize=9999&fileId=");
                sbB.append(c0890a.a);
                sbB.append("&isFolder=true&shareId=");
                sbB.append(str);
                sbB.append("&shareMode=");
                C0894e c0894e2 = (C0894e) com.github.catvod.spider.merge.C.u.a(c(com.github.catvod.spider.merge.y.z.b(sbB, str3, "&iconOption=5&orderBy=lastOpTime&descending=true&accessCode=", str2)), C0894e.class);
                List<C0891b> list3 = c0894e2.b.c;
                if (list3 != null) {
                    Collections.sort(list3, new C0895f());
                    list.addAll(c0894e2.b.c);
                }
                e(str, str2, list, c0894e2);
            }
        }
    }

    public final com.github.catvod.spider.merge.K.VodItem d(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("天意原畫");
        if (NetPan.containPuHua()) {
            arrayList.add("天意普畫");
        }
        try {
            com.github.catvod.spider.merge.K.VodItem iVar = new com.github.catvod.spider.merge.K.VodItem();
            JSONObject jSONObject = new JSONObject(c("getShareInfoByCodeV2.action?shareCode=" + str2));
            List<C0891b> listB = b(jSONObject);
            SpiderDebug.log("getCoLsts(shareId)");
            ArrayList arrayList2 = new ArrayList();
            for (C0891b c0891b : (ArrayList) listB) {
                if (com.github.catvod.spider.merge.P0.e.d(com.github.catvod.spider.merge.i0.m.m(c0891b.a()))) {
                    arrayList2.add(c0891b);
                }
            }
            SpiderDebug.log("Comparator.comparing");
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (int i = 0; i < arrayList2.size(); i++) {
                C0891b c0891b2 = (C0891b) arrayList2.get(i);
                arrayList3.add(c0891b2.b() + "$" + jSONObject.getString("shareId") + "+" + c0891b2.a + "+" + com.github.catvod.spider.merge.i0.m.y(jSONObject.getString("fileName")) + "+" + c0891b2.a() + "+" + c0891b2.i);
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
            iVar.n("https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/a8/fa/f0/a8faf032-0fa4-d9c5-ac70-920d9c84dff1/AppIcon-0-0-1x_U007emarketing-0-7-0-0-sRGB-85-220.png/350x350.png");
            iVar.m(com.github.catvod.spider.merge.i0.m.y(jSONObject.getString("fileName")));
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
            iVar.g("天意");
            return iVar;
        } catch (Exception unused) {
            return BaseApi.fakeVod(arrayList, "天意雲盤");
        }
    }

    public final String f(String[] strArr) {
        String isoDownloadUrl;
        String str = strArr[0];
        String str2 = strArr[1];
        String strEncode = URLEncoder.encode(M0.a.a.split("\\|")[0]);
        String strEncode2 = URLEncoder.encode(M0.a.a.split("\\|")[1]);
        int i = Server.l;
        String strL = com.github.catvod.spider.merge.f0.d.l(String.format(C1290c.b(new StringBuilder(), C0773p.a.c, "/api/yun189GetFileInfo?do=189&type=video&cate=%s&shareId=%s&fileId=%s&userName=%s&pwd=%s"), "open", str, str2, strEncode, strEncode2));
        if (BaseApi.get().d.booleanValue()) {
            String str3 = strArr[2] + strArr[3];
            BaseApi.get().downloadFileWithDownloadManager(strL, str3, com.github.catvod.spider.merge.B.e.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36", "accept", "application/json;charset=UTF-8"));
            com.github.catvod.spider.merge.i0.m.w("正在下载 " + str3);
            isoDownloadUrl = Server.B();
        } else {
            isoDownloadUrl = NetPan.getIsoDownloadUrl(strL);
        }
        com.github.catvod.spider.merge.K.g gVar = new com.github.catvod.spider.merge.K.g();
        gVar.w(isoDownloadUrl);
        gVar.i();
        gVar.a(C0773p.a.t(strArr));
        ArrayList arrayList = new ArrayList();
        for (String str4 : strArr) {
            if (str4.contains("@@@")) {
                String[] strArrSplit = str4.split("@@@");
                String str5 = strArrSplit[0];
                String str6 = strArrSplit[1];
                String str7 = Proxy.getUrl() + "?do=ali&type=sub&shareId=" + strArr[0] + "&fileId=" + strArrSplit[2];
                com.github.catvod.spider.merge.K.h hVar = new com.github.catvod.spider.merge.K.h();
                hVar.b(str5);
                com.github.catvod.spider.merge.K.h hVarA = hVar.a(str6);
                hVarA.c(str7);
                arrayList.add(hVarA);
            }
        }
        gVar.v(arrayList);
        return gVar.toString();
    }
}
