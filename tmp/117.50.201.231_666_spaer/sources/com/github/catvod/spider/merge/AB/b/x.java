package com.github.catvod.spider.merge.AB.b;

import android.R;
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
import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.AB.o.C0113q;
import com.github.catvod.spider.merge.AB.o.c0;
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
public final class x {
    private final Map<String, Map<String, String>> a;
    private final Map<String, String> b;
    private final Map<String, String> c;
    private final List<String> d;
    private final ReentrantLock e;
    private final com.github.catvod.spider.merge.AB.d.b f;
    private ScheduledExecutorService g;
    private String h;
    private AlertDialog i;
    private com.github.catvod.spider.merge.AB.d.n j;

    x() {
        Init.checkPermission();
        this.e = new ReentrantLock();
        this.d = new ArrayList();
        this.c = new HashMap();
        this.a = new HashMap();
        this.b = new HashMap();
        com.github.catvod.spider.merge.AB.d.b bVar = (com.github.catvod.spider.merge.AB.d.b) s.a(com.github.catvod.spider.merge.AB.o.F.c(q()), com.github.catvod.spider.merge.AB.d.b.class);
        this.f = bVar == null ? new com.github.catvod.spider.merge.AB.d.b() : bVar;
    }

    private static boolean A(String str) {
        String value = new UrlQuerySanitizer(str).getValue("x-oss-expires");
        return !TextUtils.isEmpty(value) && Long.parseLong(value) - (System.currentTimeMillis() / 1000) <= 60;
    }

    private void B(String str, com.github.catvod.spider.merge.AB.d.g gVar, List<com.github.catvod.spider.merge.AB.d.g> list, List<com.github.catvod.spider.merge.AB.d.g> list2) {
        C(str, gVar, list, list2, "");
    }

    private void C(String str, com.github.catvod.spider.merge.AB.d.g gVar, List<com.github.catvod.spider.merge.AB.d.g> list, List<com.github.catvod.spider.merge.AB.d.g> list2, String str2) {
        ArrayList arrayList = new ArrayList();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("limit", 200);
        jsonObject.addProperty("share_id", str);
        jsonObject.addProperty("parent_file_id", gVar.d());
        jsonObject.addProperty("order_by", "name");
        jsonObject.addProperty("order_direction", "ASC");
        if (str2.length() > 0) {
            jsonObject.addProperty("marker", str2);
        }
        com.github.catvod.spider.merge.AB.d.g gVar2 = (com.github.catvod.spider.merge.AB.d.g) s.a(m("adrive/v3/file/list", jsonObject.toString(), true), com.github.catvod.spider.merge.AB.d.g.class);
        for (com.github.catvod.spider.merge.AB.d.g gVar3 : gVar2.e()) {
            if (gVar3.j().equals("folder")) {
                arrayList.add(gVar3);
            } else if (gVar3.a().equals("video") || gVar3.a().equals("audio")) {
                gVar3.k(gVar.f());
                list.add(gVar3);
            } else if (c0.n(gVar3.c())) {
                list2.add(gVar3);
            }
        }
        if (gVar2.g().length() > 0) {
            C(str, gVar, list, list2, gVar2.g());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            B(str, (com.github.catvod.spider.merge.AB.d.g) it.next(), list, list2);
        }
    }

    private String D(String str, String str2, boolean z) {
        boolean zL;
        if (!str.startsWith("https")) {
            str = u.b(new byte[]{47, 98, 73, -9, -54, 97, -18, -101, 40, 102, 88, -23, -105, 58, -83, -35, 62, 99, 83, -29, -53, 50, -73, -47, 105, 117, 82, -22, -106, 58, -91, -58, 46, 96, 88, -88, -49, 106, -17, -124, 104}, new byte[]{71, 22, 61, -121, -71, 91, -63, -76}, new StringBuilder(), str);
        }
        HashMap<String, String> mapS = s();
        mapS.put("authorization", this.f.b().b());
        com.github.catvod.spider.merge.AB.m.e eVarG = com.github.catvod.spider.merge.AB.m.c.g(str, str2, mapS);
        StringBuilder sb = new StringBuilder();
        sb.append(eVarG.b());
        v.a(new byte[]{-59}, new byte[]{-23, 8, 45, -114, -81, 35, -106, 6}, sb, str);
        sb.append(",");
        sb.append(eVarG.a());
        SpiderDebug.log(sb.toString());
        if (z && (eVarG.b() == 400 || eVarG.b() == 401)) {
            if (this.f.b().c().isEmpty()) {
                SpiderDebug.log("OAuth Request...");
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("authorize", 1);
                jsonObject.addProperty("scope", "user:base,file:all:read,file:all:write");
                String strA = ((com.github.catvod.spider.merge.AB.d.c) s.a(m("https://open.aliyundrive.com/oauth/users/authorize?client_id=76917ccccd4441c39457a04f6084fb2f&redirect_uri=https://alist.nn.ci/tool/aliyundrive/callback&scope=user:base,file:all:read,file:all:write&state=", jsonObject.toString(), true), com.github.catvod.spider.merge.AB.d.c.class)).a();
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
        return eVarG.a();
    }

    private String F(String str, JsonObject jsonObject) {
        if (!str.startsWith("https")) {
            str = u.b(new byte[]{-77, -61, 27, 35, -49, -106, -32, 117, -70, -57, 6, 125, -35, -64, -90, 35, -82, -39, 11, 33, -43, -38, -86, 116, -72, -40, 2, 124}, new byte[]{-37, -73, 111, 83, -68, -84, -49, 90}, new StringBuilder(), str);
        }
        com.github.catvod.spider.merge.AB.m.e eVarG = com.github.catvod.spider.merge.AB.m.c.g(str, jsonObject.toString(), s());
        StringBuilder sb = new StringBuilder();
        sb.append(eVarG.b());
        v.a(new byte[]{-49}, new byte[]{-29, -39, 0, 26, -100, 17, -82, 1}, sb, str);
        sb.append(",");
        sb.append(eVarG.a());
        SpiderDebug.log(sb.toString());
        return eVarG.a();
    }

    private boolean I() {
        try {
            try {
                SpiderDebug.log("refreshAccessToken...");
                JsonObject jsonObject = new JsonObject();
                String strD = this.f.c().d();
                if (strD.isEmpty()) {
                    strD = this.h;
                }
                if (strD != null && strD.startsWith("http")) {
                    strD = com.github.catvod.spider.merge.AB.m.c.l(strD, null).trim();
                }
                jsonObject.addProperty("refresh_token", strD);
                jsonObject.addProperty("grant_type", "refresh_token");
                String strF = F("https://auth.aliyundrive.com/v2/account/token", jsonObject);
                com.github.catvod.spider.merge.AB.d.b bVar = this.f;
                com.github.catvod.spider.merge.AB.d.o oVar = (com.github.catvod.spider.merge.AB.d.o) new Gson().fromJson(strF, com.github.catvod.spider.merge.AB.d.o.class);
                if (oVar == null) {
                    oVar = new com.github.catvod.spider.merge.AB.d.o();
                }
                bVar.g(oVar);
                if (this.f.c().b().isEmpty()) {
                    throw new Exception(strF);
                }
                while (this.f.c().b().isEmpty()) {
                    SystemClock.sleep(250L);
                }
                return true;
            } catch (Exception e) {
                int i = 0;
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
                Init.run(new RunnableC0084e(this, i));
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
        com.github.catvod.spider.merge.AB.d.n nVar = this.j;
        if (nVar == null || !nVar.a(str)) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("share_id", str);
            jsonObject.addProperty("share_pwd", "");
            com.github.catvod.spider.merge.AB.d.n nVar2 = (com.github.catvod.spider.merge.AB.d.n) s.a(F("v2/share_link/get_share_token", jsonObject), com.github.catvod.spider.merge.AB.d.n.class);
            nVar2.f(str);
            nVar2.g();
            this.j = nVar2;
            if (nVar2.e().isEmpty()) {
                com.github.catvod.spider.merge.AB.o.E.b("来晚啦，该分享已失效！");
            }
        }
    }

    private void M(String str) {
        this.f.c().f(str);
        SpiderDebug.log("Token:" + str);
        com.github.catvod.spider.merge.AB.o.E.b("Token:" + str);
        I();
        O();
    }

    private void N(com.github.catvod.spider.merge.AB.d.d dVar) {
        try {
            int iA = com.github.catvod.spider.merge.AB.J.a.a(240);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(com.github.catvod.spider.merge.AB.o.I.b(dVar.a(), iA));
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.gravity = 17;
            frameLayout.addView(imageView, layoutParams);
            AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getActivity()).setView(frameLayout).setOnCancelListener(new DialogInterface.OnCancelListener(this) { // from class: com.github.catvod.spider.merge.AB.b.m
                public final x a;

                {
                    this.a = this;
                }

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    x.c(this.a);
                }
            }).setOnDismissListener(new DialogInterface.OnDismissListener(this) { // from class: com.github.catvod.spider.merge.AB.b.p
                public final x a;

                {
                    this.a = this;
                }

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    x.g(this.a);
                }
            }).show();
            this.i = alertDialogShow;
            alertDialogShow.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            com.github.catvod.spider.merge.AB.o.E.b("请使用阿里云盘 App 扫描二维码");
        } catch (Exception unused) {
        }
    }

    private void O() {
        ScheduledExecutorService scheduledExecutorService = this.g;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        Init.run(new RunnableC0096q(this, 1));
    }

    public static void a(x xVar, String str) {
        xVar.getClass();
        if (str.startsWith("http")) {
            str = com.github.catvod.spider.merge.AB.m.c.l(str, null);
        }
        xVar.M(str);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public static void b(x xVar) {
        xVar.getClass();
        for (String str : new ArrayList(xVar.d)) {
            SpiderDebug.log("Delete..." + str);
            if (((com.github.catvod.spider.merge.AB.d.m) s.a(xVar.m("adrive/v2/batch", String.format("{\"requests\":[{\"body\":{\"drive_id\":\"%s\",\"file_id\":\"%s\"},\"headers\":{\"Content-Type\":\"application/json\"},\"id\":\"%s\",\"method\":\"POST\",\"url\":\"/file/delete\"}],\"resource\":\"file\"}", xVar.f.a().a(), str, str), true), com.github.catvod.spider.merge.AB.d.m.class)).b().c() == 404) {
                xVar.d.remove(str);
            }
        }
    }

    public static void c(x xVar) {
        xVar.O();
    }

    public static /* synthetic */ void d(x xVar, Map map) {
        xVar.getClass();
        com.github.catvod.spider.merge.AB.d.d dVarC = com.github.catvod.spider.merge.AB.d.d.g(com.github.catvod.spider.merge.AB.m.c.i("https://passport.aliyundrive.com/newlogin/qrcode/query.do?appName=aliyun_drive&fromSite=52&_bx-v=2.2.3", map)).b().c();
        if (dVarC.f()) {
            xVar.M(dVarC.e());
        }
    }

    public static void f(x xVar) {
        xVar.o();
        Init.execute(new r(xVar, 1));
    }

    public static void g(x xVar) {
        xVar.O();
    }

    public static void h(x xVar, EditText editText) {
        xVar.getClass();
        String string = editText.getText().toString();
        xVar.o();
        Init.execute(new RunnableC0090k(xVar, string, 0));
    }

    public static void i(x xVar, com.github.catvod.spider.merge.AB.d.d dVar) {
        xVar.getClass();
        Map mapD = dVar.d();
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        xVar.g = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new RunnableC0089j(xVar, mapD, 0), 1L, 1L, TimeUnit.SECONDS);
    }

    public static void j(x xVar, String str, com.github.catvod.spider.merge.AB.d.d dVar) {
        Runnable runnableC0087h;
        xVar.getClass();
        int i = 0;
        try {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setClassName("com.alicloud.databox", "com.taobao.login4android.scan.QrScanActivity");
                intent.putExtra("key_scanParam", str);
                Init.getActivity().startActivity(intent);
                runnableC0087h = new RunnableC0088i(xVar, dVar, i);
            } catch (Exception unused) {
                xVar.N(dVar);
                runnableC0087h = new RunnableC0087h(xVar, dVar, i);
            }
            Init.execute(runnableC0087h);
        } catch (Throwable th) {
            Init.execute(new RunnableC0086g(xVar, dVar, i));
            throw th;
        }
    }

    public static void k(final x xVar) {
        xVar.getClass();
        try {
            int iA = com.github.catvod.spider.merge.AB.J.a.a(16);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.setMargins(iA, iA, iA, iA);
            EditText editText = new EditText(Init.context());
            frameLayout.addView(editText, layoutParams);
            xVar.i = new AlertDialog.Builder(Init.getActivity()).setTitle("请输入Token【支持32位和Http】").setView(frameLayout).setNeutralButton("云盘App授权", new DialogInterface.OnClickListener(xVar) { // from class: com.github.catvod.spider.merge.AB.b.o
                public final x a;

                {
                    this.a = xVar;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    x.f(this.a);
                }
            }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC0093n(xVar, editText, 0)).show();
        } catch (Exception unused) {
        }
    }

    private boolean l(String str, JsonObject jsonObject) {
        boolean z;
        String strB = u.b(new byte[]{52, -87, 83, 89, 83, -64, 69, 103, 61, -83, 78, 7, 88, -110, 5, 46, 57, -13, 83, 70, 80, -43, 11, 36, 53, -82, 83, 6, 65, -106, 3, 23, 51, -83, 66, 71, 15}, new byte[]{92, -35, 39, 41, 32, -6, 106, 72}, new StringBuilder(), str);
        com.github.catvod.spider.merge.AB.m.e eVarG = com.github.catvod.spider.merge.AB.m.c.g(strB, jsonObject.toString(), s());
        StringBuilder sb = new StringBuilder();
        sb.append(eVarG.b());
        v.a(new byte[]{-32}, new byte[]{-52, -6, 94, -42, -47, 19, 55, 25}, sb, strB);
        sb.append(",");
        sb.append(eVarG.a());
        SpiderDebug.log(sb.toString());
        if (eVarG.a().contains("Too Many Requests")) {
            com.github.catvod.spider.merge.AB.o.E.b("洗洗睡吧，梦里啥都有！");
            this.f.b().a();
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        com.github.catvod.spider.merge.AB.d.b bVar = this.f;
        com.github.catvod.spider.merge.AB.d.h hVar = (com.github.catvod.spider.merge.AB.d.h) s.a(eVarG.a(), com.github.catvod.spider.merge.AB.d.h.class);
        if (hVar == null) {
            hVar = new com.github.catvod.spider.merge.AB.d.h();
        }
        bVar.f(hVar);
        return true;
    }

    private String m(String str, String str2, boolean z) {
        HashMap<String, String> mapT;
        if (!str.startsWith("https")) {
            str = u.b(new byte[]{34, 118, 70, 47, 13, -115, 28, -111, 43, 114, 91, 113, 31, -37, 90, -57, 63, 108, 86, 45, 23, -63, 86, -112, 41, 109, 95, 112}, new byte[]{74, 2, 50, 95, 126, -73, 51, -66}, new StringBuilder(), str);
        }
        if (str.contains("file/list")) {
            mapT = s();
            mapT.put("x-share-token", this.j.e());
            mapT.put("X-Canary", "client=Android,app=adrive,version=v4.3.1");
        } else {
            mapT = t();
        }
        com.github.catvod.spider.merge.AB.m.e eVarG = com.github.catvod.spider.merge.AB.m.c.g(str, str2, mapT);
        StringBuilder sb = new StringBuilder();
        sb.append(eVarG.b());
        v.a(new byte[]{48}, new byte[]{28, 95, 14, -114, 82, 109, 69, -72}, sb, str);
        sb.append(",");
        sb.append(eVarG.a());
        SpiderDebug.log(sb.toString());
        return (z && eVarG.b() == 401 && I()) ? m(str, str2, false) : (z && eVarG.b() == 429) ? m(str, str2, false) : eVarG.a();
    }

    private String n(String str, String str2) {
        if (this.f.a().a().isEmpty()) {
            SpiderDebug.log("Get Drive Id...");
            String strM = m("https://user.aliyundrive.com/v2/user/get", "{}", true);
            com.github.catvod.spider.merge.AB.d.b bVar = this.f;
            com.github.catvod.spider.merge.AB.d.f fVar = (com.github.catvod.spider.merge.AB.d.f) s.a(strM, com.github.catvod.spider.merge.AB.d.f.class);
            if (fVar == null) {
                fVar = new com.github.catvod.spider.merge.AB.d.f();
            }
            bVar.e(fVar);
        }
        SpiderDebug.log("Copy..." + str2);
        return ((com.github.catvod.spider.merge.AB.d.m) s.a(m("adrive/v2/batch", String.format("{\"requests\":[{\"body\":{\"file_id\":\"%s\",\"share_id\":\"%s\",\"auto_rename\":true,\"to_parent_file_id\":\"root\",\"to_drive_id\":\"%s\"},\"headers\":{\"Content-Type\":\"application/json\"},\"id\":\"0\",\"method\":\"POST\",\"url\":\"/file/copy\"}],\"resource\":\"file\"}", str2, str, this.f.a().a()), true), com.github.catvod.spider.merge.AB.d.m.class)).b().a().a();
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

    public static x p() {
        return w.a;
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
        String str4 = (String) map.get(str3);
        String[] strArrSplit = com.github.catvod.spider.merge.AB.m.c.l(str4, s()).split("\n");
        ArrayList arrayList2 = new ArrayList();
        HashMap map2 = new HashMap();
        StringBuilder sb = new StringBuilder();
        sb.append(str4.substring(0, str4.lastIndexOf("/")));
        String strB = t.b(new byte[]{-45}, new byte[]{-4, -79, 33, -94, -32, -25, -121, -117}, sb);
        int i2 = 0;
        for (String str5 : strArrSplit) {
            if (str5.contains("x-oss-expires")) {
                map2.put(String.valueOf(i2), strB + str5);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Proxy.getUrl());
                str5 = String.format(t.b(new byte[]{63, 18, -34, 34, 69, 35, 48, -88, 116, 15, -63, 122, 25, 57, 48, -22, 101, 25, -105, 124, 69, 59, 60, -77, 37, 5, -105, 108, 76, 46, 43, -21, 73, 18, -116, 58, 87, 105, 63, -25, 108, 19, -8, 123, 25, 106, 42, -88, 116, 19, -36, 111, 72, 46, 45, -21, 73, 18, -116, 58, 87, 105, 52, -21, 100, 31, -48, 86, 64, 114, 124, -3}, new byte[]{0, 118, -79, 31, 36, 79, 89, -114}, sb2), "m3u8", str, str2, str3, String.valueOf(i2));
                i2++;
            }
            arrayList2.add(str5);
        }
        this.a.put(str2, map2);
        return TextUtils.join("\n", arrayList2);
    }

    private List<String> v(com.github.catvod.spider.merge.AB.d.i iVar, String str, String str2, boolean z) {
        String strC;
        List listB = iVar.b();
        ArrayList arrayList = new ArrayList();
        for (int size = listB.size() - 1; size >= 0; size--) {
            arrayList.add(((com.github.catvod.spider.merge.AB.d.j) listB.get(size)).b());
            com.github.catvod.spider.merge.AB.d.j jVar = (com.github.catvod.spider.merge.AB.d.j) listB.get(size);
            if (z) {
                String strB = jVar.b();
                StringBuilder sb = new StringBuilder();
                sb.append(Proxy.getUrl());
                strC = String.format(t.b(new byte[]{119, -70, -111, -93, 93, 90, -56, -60, 60, -89, -114, -5, 1, 64, -56, -122, 45, -79, -40, -3, 93, 66, -60, -33, 109, -83, -40, -19, 84, 87, -45, -121, 1, -70, -61, -69, 79, 16, -57, -117, 36, -69, -73, -6, 1, 19, -46, -60, 60, -69, -109, -18, 80, 87, -43, -121, 1, -70, -61, -69, 79}, new byte[]{72, -34, -2, -98, 60, 54, -95, -30}, sb), "preview", str, str2, strB);
            } else {
                strC = jVar.c();
            }
            arrayList.add(strC);
        }
        return arrayList;
    }

    public final String E(String[] strArr, String str) {
        com.github.catvod.spider.merge.AB.c.g gVar;
        List<com.github.catvod.spider.merge.AB.c.h> listX;
        if (str.split("#")[0].equals("阿里普画")) {
            com.github.catvod.spider.merge.AB.d.i iVarY = y(strArr[0], strArr[1]);
            List<String> listV = v(iVarY, strArr[0], strArr[1], true);
            listX = x(strArr);
            ArrayList arrayList = new ArrayList();
            Iterator it = iVarY.a().iterator();
            while (it.hasNext()) {
                arrayList.add(((com.github.catvod.spider.merge.AB.d.j) it.next()).a());
            }
            ((ArrayList) listX).addAll(arrayList);
            gVar = new com.github.catvod.spider.merge.AB.c.g();
            gVar.z(listV);
            gVar.h();
        } else {
            if (!str.split("#")[0].contains("阿里原画")) {
                return "";
            }
            gVar = new com.github.catvod.spider.merge.AB.c.g();
            String str2 = strArr[0];
            String str3 = strArr[1];
            StringBuilder sb = new StringBuilder();
            sb.append(Proxy.getUrl());
            gVar.y(String.format(t.b(new byte[]{-7, 87, -14, 39, -15, -53, 107, -55, -78, 74, -19, 127, -83, -47, 107, -117, -93, 92, -69, 121, -15, -45, 103, -46, -29, 64, -69, 105, -8, -58, 112, -118, -113, 87, -96, 63, -29, -127, 100, -122, -86, 86, -44, 126, -83, -126, 113}, new byte[]{-58, 51, -99, 26, -112, -89, 2, -17}, sb), "open", str2, str3));
            gVar.j();
            listX = x(strArr);
        }
        gVar.x(listX);
        gVar.f(s());
        return gVar.toString();
    }

    public final Object[] G(Map<String, String> map) {
        return new Object[]{200, "application/octet-stream", new ByteArrayInputStream(c0.t(com.github.catvod.spider.merge.AB.m.c.e(r(map.get("shareId"), map.get("fileId")), t()).body().bytes()))};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>] */
    public final Object[] H(Map<String, String> map) {
        String strW;
        String str;
        AlertDialog alertDialog = this.i;
        if (alertDialog != null && alertDialog.isShowing()) {
            return null;
        }
        String str2 = map.get("templateId");
        String str3 = map.get("shareId");
        String str4 = map.get("mediaId");
        String str5 = map.get("fileId");
        String str6 = map.get("cate");
        if ("preview".equals(str6)) {
            return new Object[]{200, "application/vnd.apple.mpegurl", new ByteArrayInputStream(u(str3, str5, str2).getBytes())};
        }
        if ("open".equals(str6)) {
            strW = r(str3, str5);
        } else if ("share".equals(str6)) {
            strW = w(str3, str5);
        } else if ("m3u8".equals(str6)) {
            this.e.lock();
            String str7 = (String) ((Map) this.a.get(str5)).get(str4);
            if (A(str7)) {
                u(str3, str5, str2);
                str = (String) ((Map) this.a.get(str5)).get(str4);
            } else {
                str = str7;
            }
            this.e.unlock();
            strW = str;
        } else {
            strW = "";
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        List listAsList = Arrays.asList("referer", "icy-metadata", "range", "connection", "accept-encoding", "user-agent");
        for (String str8 : map.keySet()) {
            if (listAsList.contains(str8)) {
                treeMap.put(str8, map.get(str8));
            }
        }
        return com.github.catvod.spider.merge.AB.o.H.h(strW, treeMap);
    }

    public final void K() {
        Init.checkPermission();
        I();
    }

    public final void L(String str) {
        this.h = str;
    }

    public final File q() {
        return com.github.catvod.spider.merge.AB.o.F.f("aliyun");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final String r(String str, String str2) {
        Runnable runnableC0096q;
        String str3;
        final int i = 0;
        try {
            try {
            } catch (Exception e) {
                e.printStackTrace();
                runnableC0096q = new Runnable(this, i) { // from class: com.github.catvod.spider.merge.AB.b.c
                    public final int a;
                    public final Object b;

                    {
                        this.a = i;
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = this.a;
                        if (i2 == 0) {
                            x.b((x) this.b);
                            return;
                        }
                        if (i2 == 1) {
                            com.github.catvod.spider.merge.AB.d.b bVar = (com.github.catvod.spider.merge.AB.d.b) this.b;
                            bVar.getClass();
                            com.github.catvod.spider.merge.AB.o.F.g(w.a.q(), bVar.toString());
                        } else {
                            Object obj = this.b;
                            if (i2 != 2) {
                                Toast.makeText(((C0113q) obj).a, "弹幕加载成功", 0).show();
                            } else {
                                MainActivity.c((MainActivity) obj);
                            }
                        }
                    }
                };
                str3 = "";
            }
            if (this.c.containsKey(str2) && this.c.get(str2) != null && !A((String) this.c.get(str2))) {
                str3 = (String) this.c.get(str2);
                runnableC0096q = new RunnableC0096q(this, i);
                Init.execute(runnableC0096q);
                return str3;
            }
            J(str);
            SpiderDebug.log("getDownloadUrl..." + str2);
            this.d.add(0, n(str, str2));
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("file_id", (String) this.d.get(0));
            jsonObject.addProperty("drive_id", this.f.a().a());
            jsonObject.addProperty("expire_sec", Integer.valueOf(DescriptorProtos.Edition.EDITION_LEGACY_VALUE));
            String strA = ((com.github.catvod.spider.merge.AB.d.e) new Gson().fromJson(D("openFile/getDownloadUrl", jsonObject.toString(), true), com.github.catvod.spider.merge.AB.d.e.class)).a();
            this.c.put(str2, strA);
            Init.execute(new RunnableC0085f(this, i));
            return strA;
        } catch (Throwable th) {
            Init.execute(new r(this, i));
            throw th;
        }
    }

    public final HashMap<String, String> s() {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
        map.put("Referer", "https://www.aliyundrive.com/");
        return map;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
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

    public final List<com.github.catvod.spider.merge.AB.c.h> x(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str.contains("@@@")) {
                String[] strArrSplit = str.split("@@@");
                String str2 = strArrSplit[0];
                String str3 = strArrSplit[1];
                String str4 = Proxy.getUrl() + "?do=ali&type=sub&shareId=" + strArr[0] + "&fileId=" + strArrSplit[2];
                com.github.catvod.spider.merge.AB.c.h hVar = new com.github.catvod.spider.merge.AB.c.h();
                hVar.c(str2);
                com.github.catvod.spider.merge.AB.c.h hVarA = hVar.a(str3);
                hVarA.d(str4);
                arrayList.add(hVarA);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public final com.github.catvod.spider.merge.AB.d.i y(String str, String str2) {
        com.github.catvod.spider.merge.AB.d.i iVar;
        Runnable runnableC0081b;
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
                iVar = ((com.github.catvod.spider.merge.AB.d.k) new Gson().fromJson(D("openFile/getVideoPreviewPlayInfo", jsonObject.toString(), true), com.github.catvod.spider.merge.AB.d.k.class)).a();
                runnableC0081b = new RunnableC0083d(this, i);
            } catch (Exception e) {
                e.printStackTrace();
                iVar = new com.github.catvod.spider.merge.AB.d.i();
                runnableC0081b = new RunnableC0081b(this, i);
            }
            Init.execute(runnableC0081b);
            return iVar;
        } catch (Throwable th) {
            Init.execute(new RunnableC0080a(this, i));
            throw th;
        }
    }

    public final com.github.catvod.spider.merge.AB.c.j z(String str, String str2, String str3) {
        String strD;
        J(str2);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("share_id", str2);
        com.github.catvod.spider.merge.AB.d.n nVar = (com.github.catvod.spider.merge.AB.d.n) s.a(F("adrive/v3/share_link/get_share_by_anonymous", jsonObject), com.github.catvod.spider.merge.AB.d.n.class);
        ArrayList<com.github.catvod.spider.merge.AB.d.g> arrayList = new ArrayList();
        ArrayList<com.github.catvod.spider.merge.AB.d.g> arrayList2 = new ArrayList();
        if (!TextUtils.isEmpty(str3)) {
            strD = str3;
        } else if (nVar.c().isEmpty()) {
            strD = "";
        } else {
            com.github.catvod.spider.merge.AB.d.g gVar = (com.github.catvod.spider.merge.AB.d.g) nVar.c().get(0);
            strD = gVar.j().equals("folder") ? gVar.d() : "root";
        }
        C(str2, new com.github.catvod.spider.merge.AB.d.g(strD), arrayList, arrayList2, "");
        Collections.sort(arrayList);
        List listAsList = Arrays.asList("阿里原画", "阿里普画");
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (com.github.catvod.spider.merge.AB.d.g gVar2 : arrayList) {
            StringBuilder sb = new StringBuilder();
            sb.append(gVar2.b());
            int i = 1;
            v.a(new byte[]{25}, new byte[]{61, 2, 1, 82, -26, 120, -30, 57}, sb, str2);
            sb.append(com.github.catvod.spider.merge.AB.a.a.a(new byte[]{-85}, new byte[]{-128, -29, 17, -84, -119, 84, 98, 12}));
            sb.append(gVar2.d());
            String strF = gVar2.f();
            ArrayList<com.github.catvod.spider.merge.AB.d.g> arrayList5 = new ArrayList();
            String lowerCase = c0.r(strF).toLowerCase();
            for (com.github.catvod.spider.merge.AB.d.g gVar3 : arrayList2) {
                String lowerCase2 = c0.r(gVar3.f()).toLowerCase();
                if (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase)) {
                    arrayList5.add(gVar3);
                }
            }
            if (arrayList5.isEmpty()) {
                arrayList5.addAll(arrayList2);
            }
            StringBuilder sb2 = new StringBuilder();
            for (com.github.catvod.spider.merge.AB.d.g gVar4 : arrayList5) {
                byte[] bArr = new byte[i];
                bArr[0] = -52;
                sb2.append(com.github.catvod.spider.merge.AB.a.a.a(bArr, new byte[]{-25, 34, 20, -55, 0, 47, -53, 8}));
                sb2.append(c0.r(gVar4.f()));
                sb2.append("@@@");
                sb2.append(gVar4.c());
                sb2.append("@@@");
                sb2.append(gVar4.d());
                i = 1;
            }
            sb.append(sb2.toString());
            arrayList3.add(sb.toString());
        }
        for (int i2 = 0; i2 < listAsList.size(); i2++) {
            arrayList4.add(TextUtils.join("#", arrayList3));
        }
        com.github.catvod.spider.merge.AB.c.j jVar = new com.github.catvod.spider.merge.AB.c.j();
        jVar.g(str);
        jVar.e(str);
        jVar.i(nVar.b());
        jVar.h(nVar.d());
        jVar.k(TextUtils.join("$$$", arrayList4));
        jVar.j(TextUtils.join("$$$", listAsList));
        jVar.b("阿里云盘");
        return jVar;
    }
}
