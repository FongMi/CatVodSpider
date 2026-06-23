package com.github.catvod.utils.merge;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.Proxy;
import com.github.catvod.utils.server.Server;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class Yun189Api {
    public String a;

    Yun189Api() {
    }

    public static Yun189Api a() {
        return com.github.catvod.spider.merge.M.M0.M0.a;
    }

    private List<Yun189File> b(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        String string = jSONObject.getString("shareId");
        String string2 = jSONObject.getString("fileId");
        String string3 = jSONObject.getString("accessCode");
        if (!jSONObject.getBoolean("isFolder")) {
            Yun189File c0891b = new Yun189File();
            c0891b.fileId = string2;
            c0891b.fileName = jSONObject.getString("fileName");
            c0891b.fileSize = jSONObject.getLong("fileSize");
            arrayList.add(c0891b);
        }
        String str = (string3 == null || string3.isEmpty()) ? "3" : "1";
        StringBuilder sb = new StringBuilder();
        sb.append("listShareDir.action?pageNum=1&pageSize=9999&fileId=");
        sb.append(string2);
        sb.append("&isFolder=true&shareId=");
        sb.append(string);
        sb.append("&shareMode=");
        sb.append(str);
        sb.append("&iconOption=5&orderBy=lastOpTime&descending=true&accessCode=");
        sb.append(string3);
        Yun189Response c0894e = (Yun189Response) com.github.catvod.spider.merge.C.u.a(c(sb.toString()), Yun189Response.class);
        SpiderDebug.log("shareMediaEntity:" + c0894e);
        List<Yun189File> list = c0894e.data.fileList;
        if (list != null) {
            Collections.sort(list, new Yun189FileComparator());
            arrayList.addAll(c0894e.data.fileList);
        }
        SpiderDebug.log("shareMediaEntity:" + c0894e);
        e(string, string3, arrayList, c0894e);
        return arrayList;
    }

    private String c(String str) {
        if (!str.startsWith("https")) {
            str = UrlUtils.resolveUrl("https://cloud.189.cn/api/open/share/", str);
        }
        String strM = com.github.catvod.spider.merge.f0.d.m(str, com.github.catvod.spider.merge.B.e.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36", "accept", "application/json;charset=UTF-8"), null);
        SpiderDebug.log("getString:" + strM);
        return strM;
    }

    private void e(String str, String str2, List<Yun189File> list, Yun189Response c0894e) {
        List<Yun189Folder> list2 = c0894e.data.folderList;
        if (list2 != null) {
            for (Yun189Folder c0890a : list2) {
                String str3 = (str2 == null || str2.isEmpty()) ? "3" : "1";
                StringBuilder sbB = new StringBuilder("listShareDir.action?pageNum=1&pageSize=9999&fileId=");
                sbB.append(c0890a.folderId);
                sbB.append("&isFolder=true&shareId=");
                sbB.append(str);
                sbB.append("&shareMode=");
                sbB.append(str3);
                sbB.append("&iconOption=5&orderBy=lastOpTime&descending=true&accessCode=");
                sbB.append(str2);
                Yun189Response c0894e2 = (Yun189Response) com.github.catvod.spider.merge.C.u.a(c(sbB.toString()), Yun189Response.class);
                List<Yun189File> list3 = c0894e2.data.fileList;
                if (list3 != null) {
                    Collections.sort(list3, new Yun189FileComparator());
                    list.addAll(c0894e2.data.fileList);
                }
                e(str, str2, list, c0894e2);
            }
        }
    }

    public final com.github.catvod.bean.VodItem d(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("天意原畫");
        if (NetPan.containPuHua()) {
            arrayList.add("天意普畫");
        }
        try {
            com.github.catvod.bean.VodItem iVar = new com.github.catvod.bean.VodItem();
            JSONObject jSONObject = new JSONObject(c("getShareInfoByCodeV2.action?shareCode=" + str2));
            List<Yun189File> listB = b(jSONObject);
            SpiderDebug.log("getCoLsts(shareId)");
            ArrayList arrayList2 = new ArrayList();
            for (Yun189File c0891b : (ArrayList) listB) {
                String ext = com.github.catvod.spider.merge.i0.GeneralUtils.m(c0891b.fileId());
                if (ext != null && !ext.isEmpty()) {
                    arrayList2.add(c0891b);
                }
            }
            SpiderDebug.log("Comparator.comparing");
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (int i = 0; i < arrayList2.size(); i++) {
                Yun189File c0891b2 = (Yun189File) arrayList2.get(i);
                String fileName = com.github.catvod.spider.merge.i0.GeneralUtils.y(jSONObject.getString("fileName"));
                arrayList3.add(c0891b2.fileName() + "$" + jSONObject.getString("shareId") + "+" + c0891b2.fileId + "+" + fileName + "+" + c0891b2.fileId() + "+" + c0891b2.presentUrl);
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb.append((CharSequence) it.next());
                        if (it.hasNext()) {
                            sb.append((CharSequence) "#");
                        } else {
                            break;
                        }
                    }
                }
                arrayList4.add(sb.toString());
            }
            iVar.l(str);
            iVar.j(str);
            iVar.n("https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/a8/fa/f0/a8faf032-0fa4-d9c5-ac70-920d9c84dff1/AppIcon-0-0-1x_U007emarketing-0-7-0-0-sRGB-85-220.png/350x350.png");
            String title = com.github.catvod.spider.merge.i0.GeneralUtils.y(jSONObject.getString("fileName"));
            iVar.m(title);
            StringBuilder sb2 = new StringBuilder();
            Iterator it2 = arrayList4.iterator();
            if (it2.hasNext()) {
                while (true) {
                    sb2.append((CharSequence) it2.next());
                    if (!it2.hasNext()) break;
                    sb2.append((CharSequence) "$$$");
                }
            }
            iVar.p(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            Iterator it3 = arrayList.iterator();
            if (it3.hasNext()) {
                while (true) {
                    sb3.append((CharSequence) it3.next());
                    if (!it3.hasNext()) break;
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
        String strEncode = URLEncoder.encode(com.github.catvod.spider.merge.M.M0.M0.a.a.split("\\|")[0]);
        String strEncode2 = URLEncoder.encode(com.github.catvod.spider.merge.M.M0.M0.a.a.split("\\|")[1]);
        int i = Server.l;
        String apiUrl = UrlUtils.resolveUrl(com.github.catvod.spider.merge.I.C0773p.a.c,
                "/api/yun189GetFileInfo?do=189&type=video&cate=open&shareId=" + str + "&fileId=" + str2 + "&userName=" + strEncode + "&pwd=" + strEncode2);
        String strL = com.github.catvod.spider.merge.f0.d.l(apiUrl);
        if (BaseApi.get().d.booleanValue()) {
            String str3 = strArr[2] + strArr[3];
            BaseApi.get().downloadFileWithDownloadManager(strL, str3, com.github.catvod.spider.merge.B.e.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36", "accept", "application/json;charset=UTF-8"));
            SpiderDebug.log("正在下载 " + str3);
            isoDownloadUrl = Server.B();
        } else {
            isoDownloadUrl = NetPan.getIsoDownloadUrl(strL);
        }
        com.github.catvod.bean.g gVar = new com.github.catvod.bean.g();
        gVar.w(isoDownloadUrl);
        gVar.i();
        gVar.a(com.github.catvod.spider.merge.I.C0773p.a.t(strArr));
        ArrayList arrayList = new ArrayList();
        for (String str4 : strArr) {
            if (str4.contains("@@@")) {
                String[] strArrSplit = str4.split("@@@");
                String str5 = strArrSplit[0];
                String str6 = strArrSplit[1];
                String str7 = Proxy.getUrl() + "?do=ali&type=sub&shareId=" + strArr[0] + "&fileId=" + strArrSplit[2];
                com.github.catvod.bean.h hVar = new com.github.catvod.bean.h();
                hVar.b(str5);
                com.github.catvod.bean.h hVarA = hVar.a(str6);
                hVarA.c(str7);
                arrayList.add(hVarA);
            }
        }
        gVar.v(arrayList);
        return gVar.toString();
    }
}
