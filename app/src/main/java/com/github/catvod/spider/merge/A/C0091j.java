package com.github.catvod.spider.merge.a;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.net.UrlQuerySanitizer;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.A.C0019u;
import com.github.catvod.spider.merge.A.T;
import com.github.catvod.spider.merge.M.O;
import com.github.catvod.spider.merge.c.C0099c;
import com.github.catvod.spider.merge.c.C0100d;
import com.github.catvod.spider.merge.c.C0101e;
import com.github.catvod.spider.merge.c.C0102f;
import com.github.catvod.spider.merge.c.C0103g;
import com.github.catvod.spider.merge.c.C0104h;
import com.github.catvod.spider.merge.c.C0105i;
import com.github.catvod.spider.merge.c.k;
import com.github.catvod.spider.merge.c.l;
import com.github.catvod.spider.merge.c.n;
import com.github.catvod.spider.merge.c.o;
import com.github.catvod.spider.merge.c.p;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.a.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class C0091j {
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final ArrayList d;
    public final ReentrantLock e;
    public final C0099c f;
    public ScheduledExecutorService g;
    public String h;
    public AlertDialog i;
    public o j;

    public C0091j() {
        Init.checkPermission();
        this.e = new ReentrantLock();
        this.d = new ArrayList();
        this.c = new HashMap();
        this.a = new HashMap();
        this.b = new HashMap();
        C0099c c0099c = (C0099c) T.c(com.github.catvod.spider.merge.o.c.f(com.github.catvod.spider.merge.o.c.g("aliyun")), C0099c.class);
        this.f = c0099c == null ? new C0099c() : c0099c;
    }

    public static HashMap f() {
        return T.i("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36", "Referer", "https://www.aliyundrive.com/");
    }

    public static ArrayList i(com.github.catvod.spider.merge.c.j jVar, String str, String str2, boolean z) {
        List listB = jVar.b();
        ArrayList arrayList = new ArrayList();
        for (int size = listB.size() - 1; size >= 0; size--) {
            arrayList.add(((k) listB.get(size)).b());
            arrayList.add(z ? String.format(Proxy.getUrl() + "?do=ali&type=video&cate=%s&shareId=%s&fileId=%s&templateId=%s", "preview", str, str2, ((k) listB.get(size)).b()) : ((k) listB.get(size)).c());
        }
        return arrayList;
    }

    public static ArrayList j(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str.contains("@@@")) {
                String[] strArrSplit = str.split("@@@");
                String str2 = strArrSplit[0];
                String str3 = strArrSplit[1];
                String str4 = Proxy.getUrl() + "?do=ali&type=sub&shareId=" + strArr[0] + "&fileId=" + strArrSplit[2];
                com.github.catvod.spider.merge.b.h hVar = new com.github.catvod.spider.merge.b.h();
                hVar.c(str2);
                hVar.a(str3);
                hVar.d(str4);
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    public static boolean l(String str) {
        String value = new UrlQuerySanitizer(str).getValue("x-oss-expires");
        return !TextUtils.isEmpty(value) && Long.parseLong(value) - (System.currentTimeMillis() / 1000) <= 60;
    }

    public static String p(String str, JsonObject jsonObject) {
        if (!str.startsWith("https")) {
            str = "https://api.aliyundrive.com/".concat(str);
        }
        O oF = C0019u.f(str, jsonObject.toString(), f());
        SpiderDebug.log(oF.b + "," + str + "," + oF.g());
        return oF.g();
    }

    public final boolean a(String str, JsonObject jsonObject) {
        String strConcat = "https://api.xhofe.top/alist/ali_open/".concat(str);
        O oF = C0019u.f(strConcat, jsonObject.toString(), f());
        SpiderDebug.log(oF.b + "," + strConcat + "," + oF.g());
        boolean zContains = oF.g().contains("Too Many Requests");
        C0099c c0099c = this.f;
        if (zContains) {
            C0019u.j("洗洗睡吧，Too Many Requests。");
            c0099c.b().a();
            return false;
        }
        C0105i c0105i = (C0105i) T.c(oF.g(), C0105i.class);
        if (c0105i == null) {
            c0105i = new C0105i();
        }
        c0099c.e(c0105i);
        return true;
    }

    public final String b(String str, String str2, boolean z) {
        HashMap mapG;
        if (!str.startsWith("https")) {
            str = "https://api.aliyundrive.com/".concat(str);
        }
        if (str.contains("file/list")) {
            mapG = f();
            mapG.put("x-share-token", this.j.e());
            mapG.put("X-Canary", "client=Android,app=adrive,version=v4.3.1");
        } else {
            mapG = g();
        }
        O oF = C0019u.f(str, str2, mapG);
        StringBuilder sb = new StringBuilder();
        int i = oF.b;
        sb.append(i);
        sb.append(",");
        sb.append(str);
        sb.append(",");
        sb.append(oF.g());
        SpiderDebug.log(sb.toString());
        return (z && i == 401 && q()) ? b(str, str2, false) : (z && i == 429) ? b(str, str2, false) : oF.g();
    }

    public final String c(String str, String str2) {
        C0099c c0099c = this.f;
        if (c0099c.a().a().isEmpty()) {
            SpiderDebug.log("Get Drive Id...");
            C0103g c0103g = (C0103g) T.c(b("https://user.aliyundrive.com/v2/user/get", "{}", true), C0103g.class);
            if (c0103g == null) {
                c0103g = new C0103g();
            }
            c0099c.d(c0103g);
        }
        SpiderDebug.log("Copy..." + str2);
        String strA = c0099c.a().a();
        StringBuilder sb = new StringBuilder("{\"requests\":[{\"body\":{\"file_id\":\"");
        sb.append(str2);
        sb.append("\",\"share_id\":\"");
        sb.append(str);
        sb.append("\",\"auto_rename\":true,\"to_parent_file_id\":\"root\",\"to_drive_id\":\"");
        return ((n) T.c(b("adrive/v2/batch", T.h(sb, strA, "\"},\"headers\":{\"Content-Type\":\"application/json\"},\"id\":\"0\",\"method\":\"POST\",\"url\":\"/file/copy\"}],\"resource\":\"file\"}"), true), n.class)).b().a().a();
    }

    public final void d() {
        try {
            AlertDialog alertDialog = this.i;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    public final String e(String str, String str2) {
        HashMap map = this.c;
        try {
            if (map.containsKey(str2) && map.get(str2) != null && !l((String) map.get(str2))) {
                return (String) map.get(str2);
            }
            r(str);
            SpiderDebug.log("getDownloadUrl..." + str2);
            ArrayList arrayList = this.d;
            arrayList.add(0, c(str, str2));
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("file_id", (String) arrayList.get(0));
            jsonObject.addProperty("drive_id", this.f.a().a());
            jsonObject.addProperty("expire_sec", 900);
            String strA = ((C0102f) new Gson().fromJson(o("openFile/getDownloadUrl", jsonObject.toString(), true), C0102f.class)).a();
            map.put(str2, strA);
            return strA;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        } finally {
            Init.execute(new RunnableC0087f(this, 0));
        }
    }

    public final HashMap g() {
        HashMap mapF = f();
        mapF.put("x-share-token", this.j.e());
        mapF.put("X-Canary", "client=Android,app=adrive,version=v4.3.1");
        C0099c c0099c = this.f;
        p pVarC = c0099c.c();
        if (pVarC.d().length() > 0 && pVarC.b().length() > 0) {
            p pVarC2 = c0099c.c();
            mapF.put("authorization", pVarC2.d() + " " + pVarC2.b());
        }
        return mapF;
    }

    public final String h(String str, String str2, String str3) {
        ArrayList arrayListI = i(k(str, str2), str, str2, false);
        HashMap map = new HashMap();
        for (int i = 0; i < arrayListI.size(); i += 2) {
            map.put((String) arrayListI.get(i), (String) arrayListI.get(i + 1));
        }
        String str4 = (String) map.get(str3);
        String[] strArrSplit = C0019u.k(str4, f()).split("\n");
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        String str5 = str4.substring(0, str4.lastIndexOf("/")) + "/";
        int i2 = 0;
        for (String str6 : strArrSplit) {
            if (str6.contains("x-oss-expires")) {
                map2.put(String.valueOf(i2), str5 + str6);
                str6 = String.format(Proxy.getUrl() + "?do=ali&type=video&cate=%s&shareId=%s&fileId=%s&templateId=%s&mediaId=%s", "m3u8", str, str2, str3, String.valueOf(i2));
                i2++;
            }
            arrayList.add(str6);
        }
        this.a.put(str2, map2);
        return TextUtils.join("\n", arrayList);
    }

    public final com.github.catvod.spider.merge.c.j k(String str, String str2) {
        com.github.catvod.spider.merge.c.j jVar;
        RunnableC0087f runnableC0087f;
        try {
            try {
                r(str);
                SpiderDebug.log("getVideoPreviewPlayInfo..." + str2);
                ArrayList arrayList = this.d;
                arrayList.add(0, c(str, str2));
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("file_id", (String) arrayList.get(0));
                jsonObject.addProperty("drive_id", this.f.a().a());
                jsonObject.addProperty("category", "live_transcoding");
                jsonObject.addProperty("url_expire_sec", 900);
                jVar = ((l) new Gson().fromJson(o("openFile/getVideoPreviewPlayInfo", jsonObject.toString(), true), l.class)).a();
                runnableC0087f = new RunnableC0087f(this, 0);
            } catch (Exception e) {
                e.printStackTrace();
                jVar = new com.github.catvod.spider.merge.c.j();
                runnableC0087f = new RunnableC0087f(this, 0);
            }
            Init.execute(runnableC0087f);
            return jVar;
        } catch (Throwable th) {
            Init.execute(new RunnableC0087f(this, 0));
            throw th;
        }
    }

    public final void m(String str, C0104h c0104h, ArrayList arrayList, ArrayList arrayList2) {
        n(str, c0104h, arrayList, arrayList2, "");
    }

    public final void n(String str, C0104h c0104h, ArrayList arrayList, ArrayList arrayList2, String str2) {
        ArrayList arrayList3 = new ArrayList();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("limit", 200);
        jsonObject.addProperty("share_id", str);
        jsonObject.addProperty("parent_file_id", c0104h.d());
        jsonObject.addProperty("order_by", "name");
        jsonObject.addProperty("order_direction", "ASC");
        if (str2.length() > 0) {
            jsonObject.addProperty("marker", str2);
        }
        C0104h c0104h2 = (C0104h) T.c(b("adrive/v3/file/list", jsonObject.toString(), true), C0104h.class);
        for (C0104h c0104h3 : c0104h2.e()) {
            if (c0104h3.j().equals("folder")) {
                arrayList3.add(c0104h3);
            } else if (c0104h3.a().equals("video") || c0104h3.a().equals("audio")) {
                c0104h3.k(c0104h.f());
                arrayList.add(c0104h3);
            } else {
                if (com.github.catvod.spider.merge.o.d.d.contains(c0104h3.c())) {
                    arrayList2.add(c0104h3);
                }
            }
        }
        if (c0104h2.g().length() > 0) {
            n(str, c0104h, arrayList, arrayList2, c0104h2.g());
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            m(str, (C0104h) it.next(), arrayList, arrayList2);
        }
    }

    public final String o(String str, String str2, boolean z) {
        boolean zA;
        if (!str.startsWith("https")) {
            str = "https://open.aliyundrive.com/adrive/v1.0/".concat(str);
        }
        HashMap mapF = f();
        C0099c c0099c = this.f;
        mapF.put("authorization", c0099c.b().b());
        O oF = C0019u.f(str, str2, mapF);
        StringBuilder sb = new StringBuilder();
        int i = oF.b;
        sb.append(i);
        sb.append(",");
        sb.append(str);
        sb.append(",");
        sb.append(oF.g());
        SpiderDebug.log(sb.toString());
        if (z && (i == 400 || i == 401)) {
            if (c0099c.b().c().isEmpty()) {
                SpiderDebug.log("OAuth Request...");
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("authorize", 1);
                jsonObject.addProperty("scope", "user:base,file:all:read,file:all:write");
                String strA = ((C0100d) T.c(b("https://open.aliyundrive.com/oauth/users/authorize?client_id=76917ccccd4441c39457a04f6084fb2f&redirect_uri=https://alist.nn.ci/tool/aliyundrive/callback&scope=user:base,file:all:read,file:all:write&state=", jsonObject.toString(), true), C0100d.class)).a();
                SpiderDebug.log("OAuth Redirect...");
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("code", strA);
                jsonObject2.addProperty("grant_type", "authorization_code");
                zA = a("code", jsonObject2);
            } else {
                SpiderDebug.log("refreshOpenToken...");
                JsonObject jsonObject3 = new JsonObject();
                jsonObject3.addProperty("grant_type", "refresh_token");
                jsonObject3.addProperty("refresh_token", c0099c.b().c());
                zA = a("token", jsonObject3);
            }
            if (zA) {
                return o(str, str2, false);
            }
        }
        return oF.g();
    }

    public final boolean q() {
        C0099c c0099c = this.f;
        try {
            try {
                SpiderDebug.log("refreshAccessToken...");
                JsonObject jsonObject = new JsonObject();
                String strC = c0099c.c().c();
                if (strC.isEmpty()) {
                    strC = this.h;
                }
                if (strC != null && strC.startsWith("http")) {
                    strC = C0019u.k(strC, null).trim();
                }
                jsonObject.addProperty("refresh_token", strC);
                jsonObject.addProperty("grant_type", "refresh_token");
                String strP = p("https://auth.aliyundrive.com/v2/account/token", jsonObject);
                p pVar = (p) new Gson().fromJson(strP, p.class);
                if (pVar == null) {
                    pVar = new p();
                }
                c0099c.f(pVar);
                if (c0099c.c().b().isEmpty()) {
                    throw new Exception(strP);
                }
                while (c0099c.c().b().isEmpty()) {
                    SystemClock.sleep(250L);
                }
                return true;
            } catch (Exception e) {
                if (e instanceof TimeoutException) {
                    u();
                    while (c0099c.c().b().isEmpty()) {
                        SystemClock.sleep(250L);
                    }
                    return false;
                }
                c0099c.c().a();
                e.printStackTrace();
                u();
                Init.run(new RunnableC0087f(this, 1));
                while (c0099c.c().b().isEmpty()) {
                    SystemClock.sleep(250L);
                }
                return true;
            }
        } catch (Throwable th) {
            while (c0099c.c().b().isEmpty()) {
                SystemClock.sleep(250L);
            }
            throw th;
        }
    }

    public final void r(String str) {
        o oVar = this.j;
        if (oVar == null || !oVar.a(str)) {
            SpiderDebug.log("refreshShareToken...");
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("share_id", str);
            jsonObject.addProperty("share_pwd", "");
            o oVar2 = (o) T.c(p("v2/share_link/get_share_token", jsonObject), o.class);
            oVar2.f(str);
            oVar2.q = System.currentTimeMillis() + 3600000;
            this.j = oVar2;
            if (oVar2.e().isEmpty()) {
                C0019u.j("來晚啦，該分享已失效。");
            }
        }
    }

    public final void s(String str) {
        this.f.c().e(str);
        SpiderDebug.log("Token:" + str);
        C0019u.j("Token:" + str);
        q();
        u();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.github.catvod.spider.merge.a.e] */
    public final void t(C0101e c0101e) {
        try {
            int iB = com.github.catvod.spider.merge.o.c.b(240);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iB, iB);
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(com.github.catvod.spider.merge.o.c.c(iB, c0101e.b()));
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.gravity = 17;
            frameLayout.addView(imageView, layoutParams);
            AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getActivity()).setView(frameLayout).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.github.catvod.spider.merge.a.d
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.a.u();
                }
            }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.github.catvod.spider.merge.a.e
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.a.u();
                }
            }).show();
            this.i = alertDialogShow;
            alertDialogShow.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            C0019u.j("請使用阿里雲盤 App 掃描二維碼");
        } catch (Exception unused) {
        }
    }

    public final void u() {
        ScheduledExecutorService scheduledExecutorService = this.g;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        Init.run(new RunnableC0087f(this, 2));
    }
}
