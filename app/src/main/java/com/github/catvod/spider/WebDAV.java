package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.K.VodResult;
import com.github.catvod.spider.merge.K.Subtitle;
import com.github.catvod.spider.merge.K.VodItem;
import com.github.catvod.spider.merge.i0.GeneralUtils;
import com.github.catvod.spider.merge.l.ConcatUtils;
import com.thegrizzlylabs.sardineandroid.DavResource;
import com.thegrizzlylabs.sardineandroid.Sardine;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: /tmp/decompiler/b6c77a94381e3ab8a4e2fa73d7b9922b/classes.dex */
public class WebDAV extends Spider {
    private static List<com.github.catvod.spider.merge.V.b> c;
    private List<String> a;
    private String b;

    private static com.github.catvod.spider.merge.V.VodCategory a(String str) {
        List<com.github.catvod.spider.merge.V.b> list = c;
        return list.get(list.indexOf(new com.github.catvod.spider.merge.V.b(str)));
    }

    private List<DavResource> b(com.github.catvod.spider.merge.V.VodCategory bVar, String str, List<String> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(bVar.b());
        if (!str.startsWith(bVar.d())) {
            str = bVar.d() + str;
        }
        sb.append(str);
        List<DavResource> list2 = bVar.e().list(sb.toString());
        list2.remove(0);
        Iterator<DavResource> it = list2.iterator();
        while (it.hasNext()) {
            DavResource next = it.next();
            if (!next.isDirectory() && !next.getName().contains(".")) {
                it.remove();
            }
            if (!next.isDirectory() && !list.contains(GeneralUtils.j(next.getName()))) {
                it.remove();
            }
        }
        return list2;
    }

    public static Object[] vod(Map<String, String> map) {
        String str = map.get("url");
        String strSubstring = str.contains("/") ? str.substring(0, str.indexOf("/")) : str;
        String strSubstring2 = str.substring(strSubstring.length());
        com.github.catvod.spider.merge.V.VodCategory bVarA = a(strSubstring);
        Object[] objArr = new Object[3];
        objArr[0] = 200;
        objArr[1] = "application/octet-stream";
        Sardine sardineE = bVarA.e();
        String str2 = bVarA.b() + strSubstring2;
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        List listAsList = Arrays.asList("referer", "icy-metadata", "range", "connection", "accept-encoding", "user-agent");
        for (String str3 : map.keySet()) {
            if (listAsList.contains(str3)) {
                treeMap.put(str3, map.get(str3));
            }
        }
        objArr[2] = sardineE.get(str2, treeMap);
        return objArr;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strSubstring = str.contains("/") ? str.substring(0, str.indexOf("/")) : str;
        String strSubstring2 = str.contains("/") ? str.substring(str.indexOf("/")) : "";
        String str3 = map.containsKey("order") ? map.get("order") : "";
        String str4 = map.containsKey("type") ? map.get("type") : "";
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        com.github.catvod.spider.merge.V.VodCategory bVarA = a(strSubstring);
        for (DavResource davResource : b(bVarA, strSubstring2, GeneralUtils.a)) {
            if (davResource.isDirectory()) {
                arrayList.add(davResource);
            } else {
                arrayList2.add(davResource);
            }
        }
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
            com.github.catvod.spider.merge.V.FilterValue.a(str4, str3, arrayList);
            com.github.catvod.spider.merge.V.FilterValue.a(str4, str3, arrayList2);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(bVarA.f((DavResource) it.next(), "https://s1.ax1x.com/2023/05/04/p9tgI81.png"));
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(bVarA.f((DavResource) it2.next(), "https://s1.ax1x.com/2023/05/04/p9tgogx.png"));
        }
        VodResult gVar = new VodResult();
        gVar.y(arrayList3);
        gVar.j(1, 1, 0, 1);
        return gVar.toString();
    }

    public String detailContent(List<String> list) {
        String string;
        String str = list.get(0);
        String strSubstring = str.contains("/") ? str.substring(0, str.indexOf("/")) : str;
        String strSubstring2 = str.substring(0, str.lastIndexOf("/"));
        String str2 = strSubstring2.contains("/") ? strSubstring2.substring(strSubstring2.indexOf("/")) + "/" : "";
        String strSubstring3 = strSubstring2.substring(strSubstring2.lastIndexOf("/") + 1);
        com.github.catvod.spider.merge.V.VodCategory bVarA = a(strSubstring);
        List<DavResource> listB = b(bVarA, str2, this.a);
        ArrayList<DavResource> arrayList = new ArrayList();
        for (DavResource davResource : listB) {
            if (GeneralUtils.r(davResource.getName())) {
                arrayList.add(davResource);
            }
        }
        com.github.catvod.spider.merge.V.FilterValue.a("name", "asc", listB);
        ArrayList arrayList2 = new ArrayList();
        for (DavResource davResource2 : listB) {
            if (GeneralUtils.a.contains(GeneralUtils.j(davResource2.getName()))) {
                StringBuilder sb = new StringBuilder();
                sb.append(davResource2.getName());
                sb.append("$");
                sb.append(bVarA.c());
                sb.append(davResource2.getPath());
                StringBuilder sb2 = new StringBuilder();
                for (DavResource davResource3 : arrayList) {
                    if (GeneralUtils.x(davResource3.getName()).equals(GeneralUtils.x(davResource2.getName()))) {
                        sb2.append("~~~");
                        sb2.append(davResource3.getName());
                        sb2.append("@@@");
                        sb2.append(GeneralUtils.j(davResource3.getName()));
                        sb2.append("@@@");
                        sb2.append(bVarA.c() + davResource3.getPath());
                    }
                }
                if (sb2.length() > 0) {
                    string = sb2.toString();
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    for (DavResource davResource4 : arrayList) {
                        sb3.append("~~~");
                        sb3.append(davResource4.getName());
                        sb3.append("@@@");
                        sb3.append(GeneralUtils.j(davResource4.getName()));
                        sb3.append("@@@");
                        sb3.append(bVarA.c() + davResource4.getPath());
                    }
                    string = sb3.toString();
                }
                sb.append(string);
                arrayList2.add(sb.toString());
            }
        }
        VodItem iVar = new VodItem();
        iVar.l(strSubstring3);
        iVar.m(strSubstring3);
        iVar.o(strSubstring);
        iVar.n("https://s1.ax1x.com/2023/05/04/p9tgogx.png");
        iVar.p(TextUtils.join("#", arrayList2));
        return VodResult.m(iVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (com.github.catvod.spider.merge.V.VodCategory bVar : c) {
            arrayList.add(new com.github.catvod.spider.merge.K.VodCategory(bVar.c(), bVar.c(), "1"));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String strB = ((com.github.catvod.spider.merge.K.VodCategory) it.next()).b();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new com.github.catvod.spider.merge.K.FilterGroup("type", "排序類型", Arrays.asList(new com.github.catvod.spider.merge.K.FilterValue("預設", ""), new com.github.catvod.spider.merge.K.FilterValue("名稱", "name"), new com.github.catvod.spider.merge.K.FilterValue("大小", "size"), new com.github.catvod.spider.merge.K.FilterValue("修改時間", "date"))));
            arrayList2.add(new com.github.catvod.spider.merge.K.FilterGroup("order", "排序方式", Arrays.asList(new com.github.catvod.spider.merge.K.FilterValue("預設", ""), new com.github.catvod.spider.merge.K.FilterValue("⬆", "asc"), new com.github.catvod.spider.merge.K.FilterValue("⬇", "desc"))));
            linkedHashMap.put(strB, arrayList2);
        }
        return VodResult.p(arrayList, linkedHashMap);
    }

    public void init(Context context, String str) {
        ArrayList arrayList = new ArrayList(Arrays.asList("ass", "ssa", "srt"));
        this.a = arrayList;
        arrayList.addAll(GeneralUtils.a);
        this.b = str;
        List<com.github.catvod.spider.merge.V.b> list = c;
        if (list == null || list.isEmpty()) {
            if (this.VodCategory.startsWith("http")) {
                this.b = com.github.catvod.spider.merge.f0.HttpClient.l(this.b);
            }
            c = com.github.catvod.spider.merge.V.VodCategory.a(this.b);
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String[] strArrSplit = str2.split("~~~");
        VodResult gVar = new VodResult();
        gVar.w("proxy://do=webdav&url=" + strArrSplit[0]);
        ArrayList arrayList = new ArrayList();
        for (String str3 : strArrSplit) {
            if (str3.contains("@@@")) {
                String[] strArrSplit2 = str3.split("@@@");
                String str4 = strArrSplit2[0];
                String str5 = strArrSplit2[1];
                String strA = ConcatUtils.a("proxy://do=webdav&url=", strArrSplit2[2]);
                Subtitle hVar = new Subtitle();
                hVar.b(str4);
                Subtitle hVarA = hVar.a(str5);
                hVarA.c(strA);
                arrayList.add(hVarA);
            }
        }
        gVar.v(arrayList);
        return gVar.toString();
    }
}
