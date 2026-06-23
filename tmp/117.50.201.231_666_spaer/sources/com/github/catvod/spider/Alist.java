package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.A0.ax;
import com.github.catvod.spider.merge.A0.bw;
import com.github.catvod.spider.merge.A0.cg;
import com.github.catvod.spider.merge.A0.dg;
import com.github.catvod.spider.merge.A0.ed;
import com.github.catvod.spider.merge.A0.mr;
import com.github.catvod.spider.merge.A0.oa;
import com.github.catvod.spider.merge.A0.oj;
import com.github.catvod.spider.merge.A0.ov;
import com.github.catvod.spider.merge.A0.sm;
import com.github.catvod.spider.merge.A0.wh;
import com.github.catvod.spider.merge.A0.wo;
import com.github.catvod.spider.merge.A0.xd;
import com.github.catvod.spider.merge.A0.ya;
import com.github.catvod.spider.merge.A0.yi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Response;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class Alist extends Spider {
    public static final /* synthetic */ int a = 0;
    public List b;
    public String c;
    public String d;

    /* JADX INFO: renamed from: com.github.catvod.spider.Alist$1, reason: invalid class name */
    class AnonymousClass1 extends ya {
        @Override // com.github.catvod.spider.merge.A0.xh
        public final void onFailure(Call call, Exception exc) {
        }

        @Override // com.github.catvod.spider.merge.A0.xh
        public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.Alist$2, reason: invalid class name */
    class AnonymousClass2 extends ya {
        @Override // com.github.catvod.spider.merge.A0.xh
        public final void onFailure(Call call, Exception exc) {
        }

        @Override // com.github.catvod.spider.merge.A0.xh
        public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        }
    }

    class Job implements Callable<List<wo>> {
        public final mr a;
        public final String b;

        public Job(mr mrVar, String str) {
            this.a = mrVar;
            this.b = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List<com.github.catvod.spider.merge.A0.wo>] */
        /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
        @Override // java.util.concurrent.Callable
        public List<wo> call() {
            ?? EmptyList;
            String str = this.b;
            mr mrVar = this.a;
            Alist alist = Alist.this;
            try {
                EmptyList = new ArrayList();
                StringBuilder sb = new StringBuilder();
                sb.append(mrVar.e());
                sb.append(mrVar.k() ? "/api/fs/search" : "/api/public/search");
                String string = sb.toString();
                String strL = mrVar.l(str);
                int i = Alist.a;
                alist.getClass();
                String strH = Alist.h(mrVar, string, strL, true);
                for (cg cgVar : cg.a(mrVar.k() ? new JSONObject(strH).getJSONObject("data").getJSONArray("content").toString() : new JSONObject(strH).getJSONArray("data").toString())) {
                    if (!cgVar.i(mrVar.k())) {
                        EmptyList.add(cgVar.f(mrVar, alist.c));
                    }
                }
            } catch (Exception unused) {
                EmptyList = Collections.emptyList();
            }
            if (EmptyList.size() <= 0) {
                EmptyList = new ArrayList();
                Iterator it = oj.a(yi.k(mrVar.e() + "/search?box=" + str + "&url=&type=video", null)).ah("ul > a").iterator();
                while (it.hasNext()) {
                    String[] strArrSplit = ((ed) it.next()).ak().split("#");
                    if (strArrSplit[0].contains("/")) {
                        int iLastIndexOf = strArrSplit[0].lastIndexOf("/");
                        String strSubstring = strArrSplit[0];
                        List list = wh.a;
                        if (strSubstring.contains(".")) {
                            strSubstring = strSubstring.substring(strSubstring.lastIndexOf(".") + 1);
                        }
                        boolean zContains = wh.a.contains(strSubstring.toLowerCase());
                        cg cgVar2 = new cg();
                        cgVar2.o(!zContains ? 1 : 0);
                        cgVar2.n(strArrSplit.length > 3 ? strArrSplit[4] : "");
                        cgVar2.m("/" + strArrSplit[0].substring(0, iLastIndexOf));
                        cgVar2.l(strArrSplit[0].substring(iLastIndexOf + 1));
                        EmptyList.add(cgVar2.f(mrVar, alist.c));
                    }
                }
            }
            return EmptyList;
        }
    }

    public static String e(String str, List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cg cgVar = (cg) it.next();
            String strC = cgVar.c();
            List list2 = wh.a;
            if (strC.contains(".")) {
                strC = strC.substring(strC.lastIndexOf(".") + 1);
            }
            if (wh.b.contains(strC)) {
                sb.append("~~~");
                sb.append(cgVar.c());
                sb.append("@@@");
                String strC2 = cgVar.c();
                if (strC2.contains(".")) {
                    strC2 = strC2.substring(strC2.lastIndexOf(".") + 1);
                }
                sb.append(strC2);
                sb.append("@@@");
                sb.append(cgVar.h(str));
            }
        }
        return sb.toString();
    }

    public static ArrayList f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ax("type", "排序类型", Arrays.asList(new bw("预设", ""), new bw("名称", "name"), new bw("大小", "size"), new bw("修改时间", "date"))));
        arrayList.add(new ax("order", "排序方式", Arrays.asList(new bw("预设", ""), new bw("⬆", "asc"), new bw("⬇", "desc"))));
        return arrayList;
    }

    public static boolean g(mr mrVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("username", mrVar.f().b());
            jSONObject.put("password", mrVar.f().a());
            AnonymousClass2 anonymousClass2 = new AnonymousClass2();
            yi.j(yi.f(), mrVar.e() + "/api/auth/login", jSONObject.toString(), null, anonymousClass2);
            mrVar.n(new JSONObject(((Response) anonymousClass2.getResult()).body().string()).getJSONObject("data").getString("token"));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String h(mr mrVar, String str, String str2, boolean z) {
        try {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            yi.j(yi.f(), str, str2, mrVar.d(), anonymousClass1);
            String strString = ((Response) anonymousClass1.getResult()).body().string();
            SpiderDebug.log(strString);
            return (z && strString.contains("Guest user is disabled") && g(mrVar)) ? h(mrVar, str, str2, false) : strString;
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            i();
            String str3 = map.containsKey("type") ? map.get("type") : "";
            String str4 = map.containsKey("order") ? map.get("order") : "";
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (cg cgVar : l(str, true)) {
                if (cgVar.j()) {
                    arrayList.add(cgVar);
                } else {
                    arrayList2.add(cgVar);
                }
            }
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                Collections.sort(arrayList, new ov(str3, str4));
                Collections.sort(arrayList2, new ov(str3, str4));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(((cg) it.next()).g(str, this.c));
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((cg) it2.next()).g(str, this.c));
            }
            xd xdVar = new xd();
            xdVar.h(arrayList3);
            xdVar.e();
            return xdVar.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String detailContent(List<String> list) {
        try {
            i();
            String str = list.get(0);
            String strSubstring = str.contains("/") ? str.substring(0, str.indexOf("/")) : str;
            String strSubstring2 = str.substring(0, str.lastIndexOf("/"));
            String strSubstring3 = strSubstring2.substring(strSubstring2.lastIndexOf("/") + 1);
            mr mrVarK = k(strSubstring);
            wo woVar = new wo();
            woVar.d(strSubstring);
            woVar.a(str);
            woVar.b(strSubstring3);
            woVar.c(this.c);
            ArrayList arrayList = new ArrayList();
            List<cg> listL = l(strSubstring2, false);
            for (cg cgVar : listL) {
                if (cgVar.k(mrVarK.k())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(cgVar.c());
                    sb.append("$");
                    String strReplace = cgVar.h(strSubstring2) + e(strSubstring2, listL);
                    if (strReplace.contains("#")) {
                        strReplace = strReplace.replace("#", "***");
                    }
                    sb.append(strReplace);
                    arrayList.add(sb.toString());
                }
            }
            woVar.e(TextUtils.join("#", arrayList));
            return xd.a(woVar);
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String homeContent(boolean z) {
        try {
            i();
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (mr mrVar : this.b) {
                if (!mrVar.j().booleanValue()) {
                    arrayList.add(new sm(mrVar.g(), mrVar.g()));
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedHashMap.put(((sm) it.next()).a(), f());
            }
            return xd.c(arrayList, linkedHashMap);
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public final void i() {
        List list = this.b;
        if (list == null || list.isEmpty()) {
            if (this.d.startsWith("http")) {
                this.d = yi.k(this.d, null);
            }
            mr mrVar = (mr) new oa().z(this.d, mr.class);
            this.b = mrVar.c();
            this.c = mrVar.i();
        }
    }

    public void init(Context context, String str) {
        try {
            this.d = str;
            i();
        } catch (Exception unused) {
        }
    }

    public final cg j(String str) {
        try {
            String strSubstring = str.contains("/") ? str.substring(0, str.indexOf("/")) : str;
            String strSubstring2 = str.contains("/") ? str.substring(str.indexOf("/")) : "";
            mr mrVarK = k(strSubstring);
            if (!strSubstring2.startsWith(mrVarK.h())) {
                strSubstring2 = mrVarK.h() + strSubstring2;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("path", strSubstring2);
            jSONObject.put("password", mrVarK.b(strSubstring2));
            StringBuilder sb = new StringBuilder();
            sb.append(mrVarK.e());
            sb.append(mrVarK.k() ? "/api/fs/get" : "/api/public/path");
            String strH = h(mrVarK, sb.toString(), jSONObject.toString(), true);
            return (cg) new oa().z(mrVarK.k() ? new JSONObject(strH).getJSONObject("data").toString() : new JSONObject(strH).getJSONObject("data").getJSONArray("files").getJSONObject(0).toString(), cg.class);
        } catch (Exception unused) {
            return new cg();
        }
    }

    public final mr k(String str) {
        List list = this.b;
        mr mrVar = (mr) list.get(list.indexOf(new mr(str)));
        mrVar.a();
        return mrVar;
    }

    public final List l(String str, boolean z) {
        try {
            String strSubstring = str.contains("/") ? str.substring(0, str.indexOf("/")) : str;
            String strSubstring2 = str.contains("/") ? str.substring(str.indexOf("/")) : "";
            mr mrVarK = k(strSubstring);
            if (!strSubstring2.startsWith(mrVarK.h())) {
                strSubstring2 = mrVarK.h() + strSubstring2;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("path", strSubstring2);
            jSONObject.put("password", mrVarK.b(strSubstring2));
            StringBuilder sb = new StringBuilder();
            sb.append(mrVarK.e());
            sb.append(mrVarK.k() ? "/api/fs/list" : "/api/public/path");
            String strH = h(mrVarK, sb.toString(), jSONObject.toString(), true);
            List listA = cg.a(mrVarK.k() ? new JSONObject(strH).getJSONObject("data").getJSONArray("content").toString() : new JSONObject(strH).getJSONObject("data").getJSONArray("files").toString());
            Iterator it = listA.iterator();
            if (z) {
                while (it.hasNext()) {
                    if (((cg) it.next()).i(mrVarK.k())) {
                        it.remove();
                    }
                }
            }
            return listA;
        } catch (Exception unused) {
            return Collections.emptyList();
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        HashMap map;
        if (str2.contains("***")) {
            str2 = str2.replace("***", "#");
        }
        String[] strArrSplit = str2.split("~~~");
        String strE = j(strArrSplit[0]).e();
        xd xdVar = new xd();
        xdVar.g(strE);
        try {
            Uri uri = Uri.parse(strE);
            map = new HashMap();
            if (uri.getHost().contains("115")) {
                map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Safari/537.36");
            }
            if (uri.getHost().contains("baidupcs.com")) {
                map.put("User-Agent", "pan.baidu.com");
            }
        } catch (Exception unused) {
            map = new HashMap();
        }
        xdVar.d(map);
        ArrayList arrayList = new ArrayList();
        for (String str3 : strArrSplit) {
            if (str3.contains("@@@")) {
                String[] strArrSplit2 = str3.split("@@@");
                String str4 = strArrSplit2[0];
                String str5 = strArrSplit2[1];
                String strE2 = j(strArrSplit2[2]).e();
                dg dgVar = new dg();
                dgVar.b(str4);
                dgVar.a(str5);
                dgVar.c(strE2);
                arrayList.add(dgVar);
            }
        }
        xdVar.f(arrayList);
        return xdVar.toString();
    }

    public String searchContent(String str, boolean z) {
        try {
            i();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
            for (mr mrVar : this.b) {
                if (mrVar.m().booleanValue()) {
                    mrVar.a();
                    arrayList2.add(new Job(mrVar, str));
                }
            }
            Iterator it = executorServiceNewCachedThreadPool.invokeAll(arrayList2, 15L, TimeUnit.SECONDS).iterator();
            while (it.hasNext()) {
                arrayList.addAll((Collection) ((Future) it.next()).get());
            }
            return xd.b(arrayList);
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
