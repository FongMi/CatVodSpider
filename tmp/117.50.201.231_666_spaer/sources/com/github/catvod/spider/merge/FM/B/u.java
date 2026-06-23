package com.github.catvod.spider.merge.FM.b;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.UrlQuerySanitizer;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Bili;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.FM.a.C0298a;
import com.github.catvod.spider.merge.FM.c.C0329g;
import com.github.catvod.spider.merge.FM.c.C0330h;
import com.github.catvod.spider.merge.FM.c.C0332j;
import com.github.catvod.spider.merge.FM.d.C0334b;
import com.github.catvod.spider.merge.FM.d.C0335c;
import com.github.catvod.spider.merge.FM.d.C0336d;
import com.github.catvod.spider.merge.FM.d.C0337e;
import com.github.catvod.spider.merge.FM.d.C0338f;
import com.github.catvod.spider.merge.FM.d.C0339g;
import com.github.catvod.spider.merge.FM.d.C0340h;
import com.github.catvod.spider.merge.FM.d.C0341i;
import com.github.catvod.spider.merge.FM.g.C0346b;
import com.github.catvod.spider.merge.FM.m.C0378c;
import com.github.catvod.spider.merge.FM.m.C0380e;
import com.github.catvod.spider.merge.FM.o.C0385a;
import com.github.catvod.spider.merge.FM.o.C0394j;
import com.github.catvod.spider.merge.FM.o.C0396l;
import com.github.catvod.spider.merge.FM.o.C0397m;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.protobuf.DescriptorProtos;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class u {
    private final Map<String, Map<String, String>> a;
    private final Map<String, String> b;
    private final Map<String, String> c;
    private final List<String> d;
    private final ReentrantLock e;
    private final C0334b f;
    private ScheduledExecutorService g;
    private String h;
    private AlertDialog i;
    private com.github.catvod.spider.merge.FM.d.n j;

    u() {
        Init.checkPermission();
        this.e = new ReentrantLock();
        this.d = new ArrayList();
        this.c = new HashMap();
        this.a = new HashMap();
        this.b = new HashMap();
        C0334b c0334b = (C0334b) new Gson().fromJson(C0385a.j(q()), C0334b.class);
        this.f = c0334b == null ? new C0334b() : c0334b;
    }

    private static boolean A(String str) {
        String value = new UrlQuerySanitizer(str).getValue("x-oss-expires");
        return !TextUtils.isEmpty(value) && Long.parseLong(value) - (System.currentTimeMillis() / 1000) <= 60;
    }

    private void B(String str, C0339g c0339g, List<C0339g> list, List<C0339g> list2) {
        C(str, c0339g, list, list2, "");
    }

    private void C(String str, C0339g c0339g, List<C0339g> list, List<C0339g> list2, String str2) {
        ArrayList arrayList = new ArrayList();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("limit", 200);
        jsonObject.addProperty("share_id", str);
        jsonObject.addProperty("parent_file_id", c0339g.d());
        jsonObject.addProperty("order_by", "name");
        jsonObject.addProperty("order_direction", "ASC");
        if (str2.length() > 0) {
            jsonObject.addProperty("marker", str2);
        }
        C0339g c0339g2 = (C0339g) new Gson().fromJson(m("adrive/v3/file/list", jsonObject.toString(), true), C0339g.class);
        for (C0339g c0339g3 : c0339g2.e()) {
            if (c0339g3.j().equals("folder")) {
                arrayList.add(c0339g3);
            } else if (c0339g3.a().equals("video") || c0339g3.a().equals("audio")) {
                c0339g3.k(c0339g.f());
                list.add(c0339g3);
            } else if (com.github.catvod.spider.merge.FM.o.z.l(c0339g3.c())) {
                list2.add(c0339g3);
            }
        }
        if (c0339g2.g().length() > 0) {
            C(str, c0339g, list, list2, c0339g2.g());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            B(str, (C0339g) it.next(), list, list2);
        }
    }

    private String D(String str, String str2, boolean z) {
        boolean zL;
        if (!str.startsWith("https")) {
            str = r.b(new byte[]{-71, -47, -81, 101, 124, -63, 6, 21, -66, -43, -66, 123, 33, -102, 69, 83, -88, -48, -75, 113, 125, -110, 95, 95, -1, -58, -76, 120, 32, -102, 77, 72, -72, -45, -66, 58, 121, -54, 7, 10, -2}, new byte[]{-47, -91, -37, 21, 15, -5, 41, 58}, new StringBuilder(), str);
        }
        HashMap<String, String> mapS = s();
        mapS.put("authorization", this.f.b().b());
        C0380e c0380eG = C0378c.g(str, str2, mapS);
        StringBuilder sb = new StringBuilder();
        sb.append(c0380eG.b());
        s.b(new byte[]{-91}, new byte[]{-119, 82, -1, 78, 95, 92, 17, -103}, sb, str);
        sb.append(",");
        sb.append(c0380eG.a());
        SpiderDebug.log(sb.toString());
        if (z && (c0380eG.b() == 400 || c0380eG.b() == 401)) {
            if (this.f.b().c().isEmpty()) {
                SpiderDebug.log("OAuth Request...");
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("authorize", 1);
                jsonObject.addProperty("scope", "user:base,file:all:read,file:all:write");
                String strA = ((C0335c) new Gson().fromJson(m("https://open.aliyundrive.com/oauth/users/authorize?client_id=76917ccccd4441c39457a04f6084fb2f&redirect_uri=https://alist.nn.ci/tool/aliyundrive/callback&scope=user:base,file:all:read,file:all:write&state=", jsonObject.toString(), true), C0335c.class)).a();
                SpiderDebug.log("OAuth Redirect...");
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("code", strA);
                jsonObject2.addProperty("grant_type", "authorization_code");
                zL = l("code", jsonObject2);
            } else {
                SpiderDebug.log("refreshOpenToken...");
                JsonObject jsonObject3 = new JsonObject();
                jsonObject3.addProperty("grant_type", "refresh_token");
                jsonObject3.addProperty("refresh_token", this.f.b().c());
                zL = l("token", jsonObject3);
            }
            if (zL) {
                return D(str, str2, false);
            }
        }
        return c0380eG.a();
    }

    private String F(String str, JsonObject jsonObject) {
        if (!str.startsWith("https")) {
            str = r.b(new byte[]{60, -6, -69, -102, 70, -88, 56, 40, 53, -2, -90, -60, 84, -2, 126, 126, 33, -32, -85, -104, 92, -28, 114, 41, 55, -31, -94, -59}, new byte[]{84, -114, -49, -22, 53, -110, 23, 7}, new StringBuilder(), str);
        }
        C0380e c0380eG = C0378c.g(str, jsonObject.toString(), s());
        StringBuilder sb = new StringBuilder();
        sb.append(c0380eG.b());
        s.b(new byte[]{-62}, new byte[]{-18, 90, 61, 101, 40, 60, 70, -20}, sb, str);
        sb.append(",");
        sb.append(c0380eG.a());
        SpiderDebug.log(sb.toString());
        return c0380eG.a();
    }

    private boolean I() {
        int i = 0;
        try {
            try {
                SpiderDebug.log("refreshAccessToken...");
                JsonObject jsonObject = new JsonObject();
                String strD = this.f.c().d();
                if (strD.isEmpty()) {
                    strD = this.h;
                }
                if (strD != null && strD.startsWith("http")) {
                    strD = C0378c.n(strD, null).trim();
                }
                jsonObject.addProperty("refresh_token", strD);
                jsonObject.addProperty("grant_type", "refresh_token");
                String strF = F("https://auth.aliyundrive.com/v2/account/token", jsonObject);
                C0334b c0334b = this.f;
                com.github.catvod.spider.merge.FM.d.o oVar = (com.github.catvod.spider.merge.FM.d.o) new Gson().fromJson(strF, com.github.catvod.spider.merge.FM.d.o.class);
                if (oVar == null) {
                    oVar = new com.github.catvod.spider.merge.FM.d.o();
                }
                c0334b.g(oVar);
                if (this.f.c().b().isEmpty()) {
                    throw new Exception(strF);
                }
                while (this.f.c().b().isEmpty()) {
                    SystemClock.sleep(250L);
                }
                return true;
            } catch (Exception e) {
                if (e instanceof TimeoutException) {
                    O();
                    while (this.f.c().b().isEmpty()) {
                        SystemClock.sleep(250L);
                    }
                    return false;
                }
                this.f.c().a();
                e.printStackTrace();
                O();
                Init.run(new RunnableC0308c(this, i));
                while (this.f.c().b().isEmpty()) {
                    SystemClock.sleep(250L);
                }
                return true;
            }
        } catch (Throwable th) {
            while (this.f.c().b().isEmpty()) {
                SystemClock.sleep(250L);
            }
            throw th;
        }
    }

    private void J(String str) {
        com.github.catvod.spider.merge.FM.d.n nVar = this.j;
        if (nVar == null || !nVar.a(str)) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("share_id", str);
            jsonObject.addProperty("share_pwd", "");
            com.github.catvod.spider.merge.FM.d.n nVar2 = (com.github.catvod.spider.merge.FM.d.n) new Gson().fromJson(F("v2/share_link/get_share_token", jsonObject), com.github.catvod.spider.merge.FM.d.n.class);
            nVar2.f(str);
            nVar2.g();
            this.j = nVar2;
            if (nVar2.e().isEmpty()) {
                C0394j.b("来晚啦，该分享已失效！");
            }
        }
    }

    private void M(String str) {
        this.f.c().f(str);
        SpiderDebug.log("Token:" + str);
        C0394j.b("Token:" + str);
        I();
        O();
    }

    private void N(C0336d c0336d) {
        try {
            int iA = C0397m.a(240);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(com.github.catvod.spider.merge.FM.E.a.b(c0336d.a(), iA));
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.gravity = 17;
            frameLayout.addView(imageView, layoutParams);
            AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getActivity()).setView(frameLayout).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.github.catvod.spider.merge.FM.b.k
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    u.c(this.a);
                }
            }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.github.catvod.spider.merge.FM.b.m
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    u.g(this.a);
                }
            }).show();
            this.i = alertDialogShow;
            alertDialogShow.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            C0394j.b("请使用阿里云盘 App 扫描二维码");
        } catch (Exception unused) {
        }
    }

    private void O() {
        ScheduledExecutorService scheduledExecutorService = this.g;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        Init.run(new RunnableC0319n(this, 1));
    }

    public static void a(u uVar, String str) {
        uVar.getClass();
        if (str.startsWith("http")) {
            str = C0378c.n(str, null);
        }
        uVar.M(str);
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public static void b(u uVar) {
        uVar.getClass();
        for (String str : new ArrayList(uVar.d)) {
            SpiderDebug.log("Delete..." + str);
            if (((com.github.catvod.spider.merge.FM.d.m) new Gson().fromJson(uVar.m("adrive/v2/batch", String.format("{\"requests\":[{\"body\":{\"drive_id\":\"%s\",\"file_id\":\"%s\"},\"headers\":{\"Content-Type\":\"application/json\"},\"id\":\"%s\",\"method\":\"POST\",\"url\":\"/file/delete\"}],\"resource\":\"file\"}", uVar.f.a().a(), str, str), true), com.github.catvod.spider.merge.FM.d.m.class)).b().c() == 404) {
                uVar.d.remove(str);
            }
        }
    }

    public static void c(u uVar) {
        uVar.O();
    }

    public static /* synthetic */ void d(u uVar, Map map) {
        uVar.getClass();
        C0336d c0336dC = C0336d.g(C0378c.i("https://passport.aliyundrive.com/newlogin/qrcode/query.do?appName=aliyun_drive&fromSite=52&_bx-v=2.2.3", map)).b().c();
        if (c0336dC.f()) {
            uVar.M(c0336dC.e());
        }
    }

    public static void f(u uVar) {
        uVar.o();
        Init.execute(new RunnableC0320o(uVar, 1));
    }

    public static void g(u uVar) {
        uVar.O();
    }

    public static void h(u uVar, EditText editText) {
        uVar.getClass();
        String string = editText.getText().toString();
        uVar.o();
        Init.execute(new RunnableC0313h(uVar, string, 0));
    }

    public static void i(final u uVar, C0336d c0336d) {
        uVar.getClass();
        final Map<String, String> mapD = c0336d.d();
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        uVar.g = scheduledExecutorServiceNewScheduledThreadPool;
        final int i = 0;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: com.github.catvod.spider.merge.FM.b.i
            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        u.d((u) uVar, (Map) mapD);
                        break;
                    default:
                        Bili.a((Bili) uVar, (C0346b) mapD);
                        break;
                }
            }
        }, 1L, 1L, TimeUnit.SECONDS);
    }

    public static void j(u uVar, String str, C0336d c0336d) {
        Runnable runnableC0311f;
        uVar.getClass();
        int i = 0;
        try {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setClassName("com.alicloud.databox", "com.taobao.login4android.scan.QrScanActivity");
                intent.putExtra("key_scanParam", str);
                Init.getActivity().startActivity(intent);
                runnableC0311f = new RunnableC0312g(uVar, c0336d, i);
            } catch (Exception unused) {
                uVar.N(c0336d);
                runnableC0311f = new RunnableC0311f(uVar, c0336d, i);
            }
            Init.execute(runnableC0311f);
        } catch (Throwable th) {
            Init.execute(new RunnableC0310e(uVar, c0336d, i));
            throw th;
        }
    }

    public static void k(u uVar) {
        try {
            Toast.makeText(Init.context(), "还未登录阿里云盘账号,请前往【配置中心】登录", 1).show();
        } catch (Exception e) {
        }
    }

    private boolean l(String str, JsonObject jsonObject) {
        boolean z;
        String strB = r.b(new byte[]{61, -54, 111, -52, 46, -83, 56, -73, 52, -50, 114, -110, 37, -1, 120, -2, 48, -112, 111, -45, 45, -72, 118, -12, 60, -51, 111, -109, 60, -5, 126, -57, 58, -50, 126, -46, 114}, new byte[]{85, -66, 27, -68, 93, -105, 23, -104}, new StringBuilder(), str);
        C0380e c0380eG = C0378c.g(strB, jsonObject.toString(), s());
        StringBuilder sb = new StringBuilder();
        sb.append(c0380eG.b());
        s.b(new byte[]{97}, new byte[]{77, -6, -17, -120, -54, -65, -54, -120}, sb, strB);
        sb.append(",");
        sb.append(c0380eG.a());
        SpiderDebug.log(sb.toString());
        if (c0380eG.a().contains("Too Many Requests")) {
            C0394j.b("洗洗睡吧，梦里啥都有！");
            this.f.b().a();
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        C0334b c0334b = this.f;
        C0340h c0340h = (C0340h) new Gson().fromJson(c0380eG.a(), C0340h.class);
        if (c0340h == null) {
            c0340h = new C0340h();
        }
        c0334b.f(c0340h);
        return true;
    }

    private String m(String str, String str2, boolean z) {
        HashMap<String, String> mapT;
        if (!str.startsWith("https")) {
            str = r.b(new byte[]{93, 81, -94, -69, 51, 88, 43, -85, 84, 85, -65, -27, 33, 14, 109, -3, 64, 75, -78, -71, 41, 20, 97, -86, 86, 74, -69, -28}, new byte[]{53, 37, -42, -53, 64, 98, 4, -124}, new StringBuilder(), str);
        }
        if (str.contains("file/list")) {
            mapT = s();
            mapT.put("x-share-token", this.j.e());
            mapT.put("X-Canary", "client=Android,app=adrive,version=v4.3.1");
        } else {
            mapT = t();
        }
        C0380e c0380eG = C0378c.g(str, str2, mapT);
        StringBuilder sb = new StringBuilder();
        sb.append(c0380eG.b());
        s.b(new byte[]{-71}, new byte[]{-107, -75, 47, -94, 66, -87, 118, 28}, sb, str);
        sb.append(",");
        sb.append(c0380eG.a());
        SpiderDebug.log(sb.toString());
        return (z && c0380eG.b() == 401 && I()) ? m(str, str2, false) : (z && c0380eG.b() == 429) ? m(str, str2, false) : c0380eG.a();
    }

    private String n(String str, String str2) {
        if (this.f.a().a().isEmpty()) {
            SpiderDebug.log("Get Drive Id...");
            String strM = m("https://user.aliyundrive.com/v2/user/get", "{}", true);
            C0334b c0334b = this.f;
            C0338f c0338f = (C0338f) new Gson().fromJson(strM, C0338f.class);
            if (c0338f == null) {
                c0338f = new C0338f();
            }
            c0334b.e(c0338f);
        }
        SpiderDebug.log("Copy..." + str2);
        return ((com.github.catvod.spider.merge.FM.d.m) new Gson().fromJson(m("adrive/v2/batch", String.format("{\"requests\":[{\"body\":{\"file_id\":\"%s\",\"share_id\":\"%s\",\"auto_rename\":true,\"to_parent_file_id\":\"root\",\"to_drive_id\":\"%s\"},\"headers\":{\"Content-Type\":\"application/json\"},\"id\":\"0\",\"method\":\"POST\",\"url\":\"/file/copy\"}],\"resource\":\"file\"}", str2, str, this.f.a().a()), true), com.github.catvod.spider.merge.FM.d.m.class)).b().a().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        try {
            AlertDialog alertDialog = this.i;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    public static u p() {
        return t.a;
    }

    private HashMap<String, String> t() {
        HashMap<String, String> mapS = s();
        mapS.put("x-share-token", this.j.e());
        mapS.put("X-Canary", "client=Android,app=adrive,version=v4.3.1");
        if (this.f.c().e()) {
            mapS.put("authorization", this.f.c().c());
        }
        return mapS;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private String u(String str, String str2, String str3) {
        String str4;
        List<String> listV = v(y(str, str2), str, str2, false);
        HashMap map = new HashMap();
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) listV;
            if (i >= arrayList.size()) {
                break;
            }
            map.put((String) arrayList.get(i), (String) arrayList.get(i + 1));
            i += 2;
        }
        String str5 = (String) map.get(str3);
        String[] strArrSplit = C0378c.n(str5, s()).split("\n");
        ArrayList arrayList2 = new ArrayList();
        HashMap map2 = new HashMap();
        StringBuilder sb = new StringBuilder();
        sb.append(str5.substring(0, str5.lastIndexOf("/")));
        String strA = com.github.catvod.spider.merge.FM.L.P.a(new byte[]{1}, new byte[]{46, 4, -83, -121, 83, -31, -118, 92}, sb);
        int length = strArrSplit.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            String str6 = strArrSplit[i2];
            if (str6.contains("x-oss-expires")) {
                map2.put(String.valueOf(i3), strA + str6);
                String strValueOf = String.valueOf(i3);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Proxy.getUrl());
                str4 = strA;
                str6 = String.format(com.github.catvod.spider.merge.FM.L.P.a(new byte[]{-110, -30, 102, -52, -109, 116, 26, 81, -39, -1, 121, -108, -49, 110, 26, 19, -56, -23, 47, -110, -109, 108, 22, 74, -120, -11, 47, -126, -102, 121, 1, 18, -28, -30, 52, -44, -127, 62, 21, 30, -63, -29, 64, -107, -49, 61, 0, 81, -39, -29, 100, -127, -98, 121, 7, 18, -28, -30, 52, -44, -127, 62, 30, 18, -55, -17, 104, -72, -106, 37, 86, 4}, new byte[]{-83, -122, 9, -15, -14, 24, 115, 119}, sb2), "m3u8", str, str2, str3, strValueOf);
                i3++;
            } else {
                str4 = strA;
            }
            arrayList2.add(str6);
            i2++;
            strA = str4;
        }
        this.a.put(str2, map2);
        return TextUtils.join("\n", arrayList2);
    }

    private List<String> v(C0341i c0341i, String str, String str2, boolean z) {
        String strC;
        List<com.github.catvod.spider.merge.FM.d.j> listB = c0341i.b();
        ArrayList arrayList = new ArrayList();
        for (int size = listB.size() - 1; size >= 0; size--) {
            arrayList.add(listB.get(size).b());
            if (z) {
                String strB = listB.get(size).b();
                StringBuilder sb = new StringBuilder();
                sb.append(Proxy.getUrl());
                strC = String.format(com.github.catvod.spider.merge.FM.L.P.a(new byte[]{42, -118, 44, -23, 118, 69, -98, 12, 97, -105, 51, -79, 42, 95, -98, 78, 112, -127, 101, -73, 118, 93, -110, 23, 48, -99, 101, -89, 127, 72, -123, 79, 92, -118, 126, -15, 100, 15, -111, 67, 121, -117, 10, -80, 42, 12, -124, 12, 97, -117, 46, -92, 123, 72, -125, 79, 92, -118, 126, -15, 100}, new byte[]{21, -18, 67, -44, 23, 41, -9, 42}, sb), "preview", str, str2, strB);
            } else {
                strC = listB.get(size).c();
            }
            arrayList.add(strC);
        }
        return arrayList;
    }

    public final String E(String[] strArr, String str) {
        if (!str.split("#")[0].equals("阿里普画")) {
            if (!str.split("#")[0].contains("阿里原画")) {
                return "";
            }
            C0329g c0329g = new C0329g();
            String str2 = strArr[0];
            String str3 = strArr[1];
            StringBuilder sb = new StringBuilder();
            sb.append(Proxy.getUrl());
            c0329g.x(String.format(com.github.catvod.spider.merge.FM.L.P.a(new byte[]{-16, 103, 62, -69, -44, -77, -11, -46, -69, 122, 33, -29, -120, -87, -11, -112, -86, 108, 119, -27, -44, -85, -7, -55, -22, 112, 119, -11, -35, -66, -18, -111, -122, 103, 108, -93, -58, -7, -6, -99, -93, 102, 24, -30, -120, -6, -17}, new byte[]{-49, 3, 81, -122, -75, -33, -100, -12}, sb), "open", str2, str3));
            c0329g.j();
            c0329g.w(x(strArr));
            c0329g.f(s());
            return c0329g.toString();
        }
        C0341i c0341iY = y(strArr[0], strArr[1]);
        List<String> listV = v(c0341iY, strArr[0], strArr[1], true);
        List<C0330h> listX = x(strArr);
        ArrayList arrayList = new ArrayList();
        Iterator<com.github.catvod.spider.merge.FM.d.j> it = c0341iY.a().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        ((ArrayList) listX).addAll(arrayList);
        C0329g c0329g2 = new C0329g();
        c0329g2.y(listV);
        c0329g2.h();
        c0329g2.w(listX);
        c0329g2.f(s());
        return c0329g2.toString();
    }

    public final Object[] G(Map<String, String> map) {
        return new Object[]{200, "application/octet-stream", new ByteArrayInputStream(com.github.catvod.spider.merge.FM.o.z.r(C0378c.e(r(map.get("shareId"), map.get("fileId")), t()).body().bytes()))};
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>] */
    public final Object[] H(Map<String, String> map) {
        String strW;
        AlertDialog alertDialog = this.i;
        if (alertDialog != null && alertDialog.isShowing()) {
            return null;
        }
        String str = map.get("templateId");
        String str2 = map.get("shareId");
        String str3 = map.get("mediaId");
        String str4 = map.get("fileId");
        String str5 = map.get("cate");
        if ("preview".equals(str5)) {
            return new Object[]{200, "application/vnd.apple.mpegurl", new ByteArrayInputStream(u(str2, str4, str).getBytes())};
        }
        if ("open".equals(str5)) {
            strW = r(str2, str4);
        } else if ("share".equals(str5)) {
            strW = w(str2, str4);
        } else if ("m3u8".equals(str5)) {
            this.e.lock();
            String str6 = (String) ((Map) this.a.get(str4)).get(str3);
            if (A(str6)) {
                u(str2, str4, str);
                str6 = (String) ((Map) this.a.get(str4)).get(str3);
            }
            strW = str6;
            this.e.unlock();
        } else {
            strW = "";
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        List listAsList = Arrays.asList("referer", "icy-metadata", "range", "connection", "accept-encoding", "user-agent");
        for (String str7 : map.keySet()) {
            if (listAsList.contains(str7)) {
                treeMap.put(str7, map.get(str7));
            }
        }
        return C0396l.g(strW, treeMap);
    }

    public final void K() {
        Init.checkPermission();
        I();
    }

    public final void L(String str) {
        this.h = str;
    }

    public final File q() {
        return C0385a.l("aliyun");
    }

    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public final String r(String str, String str2) {
        String str3;
        Runnable runnableC0309d;
        int i = 0;
        try {
            try {
            } catch (Exception e) {
                e.printStackTrace();
                str3 = "";
                runnableC0309d = new RunnableC0309d(this, i);
            }
            if (this.c.containsKey(str2) && this.c.get(str2) != null && !A((String) this.c.get(str2))) {
                str3 = (String) this.c.get(str2);
                runnableC0309d = new RunnableC0319n(this, i);
                Init.execute(runnableC0309d);
                return str3;
            }
            J(str);
            SpiderDebug.log("getDownloadUrl..." + str2);
            this.d.add(0, n(str, str2));
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("file_id", (String) this.d.get(0));
            jsonObject.addProperty("drive_id", this.f.a().a());
            jsonObject.addProperty("expire_sec", Integer.valueOf(DescriptorProtos.Edition.EDITION_LEGACY_VALUE));
            String strA = ((C0337e) new Gson().fromJson(D("openFile/getDownloadUrl", jsonObject.toString(), true), C0337e.class)).a();
            this.c.put(str2, strA);
            Init.execute(new RunnableC0306a(this, i));
            return strA;
        } catch (Throwable th) {
            Init.execute(new RunnableC0320o(this, i));
            throw th;
        }
    }

    public final HashMap<String, String> s() {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
        map.put("Referer", "https://www.aliyundrive.com/");
        return map;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final String w(String str, String str2) {
        JsonElement string;
        try {
            if (this.b.containsKey(str2) && this.b.get(str2) != null && !A((String) this.b.get(str2))) {
                return (String) this.b.get(str2);
            }
            J(str);
            SpiderDebug.log("getShareDownloadUrl..." + str2);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("file_id", str2);
            jsonObject.addProperty("share_id", str);
            jsonObject.addProperty("expire_sec", 600);
            String strM = m("v2/file/get_share_link_download_url", jsonObject.toString(), false);
            try {
                string = JsonParser.parseString(strM);
            } catch (Throwable unused) {
                string = new JsonParser().parse(strM);
            }
            String asString = string.getAsJsonObject().get("download_url").getAsString();
            this.b.put(str2, asString);
            return asString;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public final List<C0330h> x(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str.contains("@@@")) {
                String[] strArrSplit = str.split("@@@");
                String str2 = strArrSplit[0];
                String str3 = strArrSplit[1];
                String str4 = Proxy.getUrl() + "?do=ali&type=sub&shareId=" + strArr[0] + "&fileId=" + strArrSplit[2];
                C0330h c0330h = new C0330h();
                c0330h.c(str2);
                C0330h c0330hA = c0330h.a(str3);
                c0330hA.d(str4);
                arrayList.add(c0330hA);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public final C0341i y(String str, String str2) {
        C0341i c0341i;
        Runnable runnableC0321p;
        int i = 0;
        try {
            try {
                J(str);
                SpiderDebug.log("getVideoPreviewPlayInfo..." + str2);
                this.d.add(0, n(str, str2));
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("file_id", (String) this.d.get(0));
                jsonObject.addProperty("drive_id", this.f.a().a());
                jsonObject.addProperty("category", "live_transcoding");
                jsonObject.addProperty("url_expire_sec", Integer.valueOf(DescriptorProtos.Edition.EDITION_LEGACY_VALUE));
                c0341i = ((com.github.catvod.spider.merge.FM.d.k) new Gson().fromJson(D("openFile/getVideoPreviewPlayInfo", jsonObject.toString(), true), com.github.catvod.spider.merge.FM.d.k.class)).a();
                runnableC0321p = new RunnableC0322q(this, i);
            } catch (Exception e) {
                e.printStackTrace();
                c0341i = new C0341i();
                runnableC0321p = new RunnableC0321p(this, i);
            }
            Init.execute(runnableC0321p);
            return c0341i;
        } catch (Throwable th) {
            Init.execute(new RunnableC0307b(this, i));
            throw th;
        }
    }

    public final C0332j z(String str, String str2, String str3) {
        String strD;
        J(str2);
        JsonObject jsonObject = new JsonObject();
        int i = 8;
        jsonObject.addProperty("share_id", str2);
        com.github.catvod.spider.merge.FM.d.n nVar = (com.github.catvod.spider.merge.FM.d.n) new Gson().fromJson(F("adrive/v3/share_link/get_share_by_anonymous", jsonObject), com.github.catvod.spider.merge.FM.d.n.class);
        ArrayList<C0339g> arrayList = new ArrayList();
        ArrayList<C0339g> arrayList2 = new ArrayList();
        char c = 0;
        if (!TextUtils.isEmpty(str3)) {
            strD = str3;
        } else if (nVar.c().isEmpty()) {
            strD = "";
        } else {
            C0339g c0339g = nVar.c().get(0);
            strD = c0339g.j().equals("folder") ? c0339g.d() : "root";
        }
        C(str2, new C0339g(strD), arrayList, arrayList2, "");
        Collections.sort(arrayList);
        byte[] bArr = {79, 8, -19, -26, -7, 111, 22, 111};
        int i2 = 1;
        List listAsList = Arrays.asList("阿里原画", "阿里普画");
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (C0339g c0339g2 : arrayList) {
            StringBuilder sb = new StringBuilder();
            sb.append(c0339g2.b());
            byte[] bArr2 = new byte[i2];
            bArr2[c] = -127;
            byte[] bArr3 = new byte[i];
            // fill-array-data instruction
            bArr3[0] = -91;
            bArr3[1] = 27;
            bArr3[2] = 60;
            bArr3[3] = 4;
            bArr3[4] = -61;
            bArr3[5] = -11;
            bArr3[6] = 38;
            bArr3[7] = -59;
            s.b(bArr2, bArr3, sb, str2);
            byte[] bArr4 = new byte[i2];
            bArr4[c] = -35;
            byte[] bArr5 = new byte[i];
            // fill-array-data instruction
            bArr5[0] = -10;
            bArr5[1] = -73;
            bArr5[2] = 48;
            bArr5[3] = -89;
            bArr5[4] = -82;
            bArr5[5] = 115;
            bArr5[6] = -94;
            bArr5[7] = 15;
            sb.append(C0298a.b(bArr4, bArr5));
            sb.append(c0339g2.d());
            String strF = c0339g2.f();
            ArrayList<C0339g> arrayList5 = new ArrayList();
            String lowerCase = com.github.catvod.spider.merge.FM.o.z.p(strF).toLowerCase();
            for (C0339g c0339g3 : arrayList2) {
                String lowerCase2 = com.github.catvod.spider.merge.FM.o.z.p(c0339g3.f()).toLowerCase();
                if (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase)) {
                    arrayList5.add(c0339g3);
                }
            }
            if (arrayList5.isEmpty()) {
                arrayList5.addAll(arrayList2);
            }
            StringBuilder sb2 = new StringBuilder();
            for (C0339g c0339g4 : arrayList5) {
                byte[] bArr6 = new byte[i2];
                bArr6[0] = 98;
                sb2.append(C0298a.b(bArr6, new byte[]{73, -53, -121, 39, -105, 68, 30, -46}));
                sb2.append(com.github.catvod.spider.merge.FM.o.z.p(c0339g4.f()));
                sb2.append("@@@");
                sb2.append(c0339g4.c());
                sb2.append("@@@");
                sb2.append(c0339g4.d());
                i2 = 1;
            }
            sb.append(sb2.toString());
            arrayList3.add(sb.toString());
            i2 = 1;
            i = 8;
            c = 0;
        }
        for (int i3 = 0; i3 < listAsList.size(); i3++) {
            arrayList4.add(TextUtils.join("#", arrayList3));
        }
        C0332j c0332j = new C0332j();
        c0332j.g(str);
        c0332j.e(str);
        c0332j.i(nVar.b());
        c0332j.h(nVar.d());
        c0332j.k(TextUtils.join("$$$", arrayList4));
        c0332j.j(TextUtils.join("$$$", listAsList));
        c0332j.b("阿里云盘");
        return c0332j;
    }
}
