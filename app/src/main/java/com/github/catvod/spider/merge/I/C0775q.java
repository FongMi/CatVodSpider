package com.github.catvod.spider.merge.I;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.c.C0936b;
import com.github.catvod.spider.merge.g.C1201a;
import com.github.catvod.spider.merge.l.C1290c;
import com.github.catvod.utils.server.Server;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.I.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class AliDriveApi {
    public int b;
    private ScheduledExecutorService g;
    private AlertDialog i;
    private String j;
    private com.github.catvod.spider.merge.L.k k;
    private com.github.catvod.spider.merge.L.g l;
    private com.github.catvod.spider.merge.L.e m;
    public Boolean a = Boolean.FALSE;
    public String c = "http://127.0.0.1:9966";
    private final List<String> h = new ArrayList();
    private final Map<String, String> q = new HashMap();
    private final ReentrantLock o = new ReentrantLock();
    private final Map<String, Map<String, String>> d = new HashMap();
    private Map<String, String> p = new HashMap();
    private Map<String, String> e = new HashMap();
    private final Map<String, JSONObject> f = new HashMap();
    public String r = "";
    public com.github.catvod.spider.merge.L.m n = com.github.catvod.spider.merge.L.m.j(com.github.catvod.spider.merge.g.b.e(com.github.catvod.spider.merge.g.b.f("aliyundrive_user")));

    AliDriveApi() {
        this.b = 4;
        if (com.github.catvod.spider.merge.P0.e.d(com.github.catvod.spider.merge.g.b.e(K()))) {
            this.b = Integer.parseInt(com.github.catvod.spider.merge.g.b.e(K()));
        }
        this.l = com.github.catvod.spider.merge.L.g.d(com.github.catvod.spider.merge.g.b.e(com.github.catvod.spider.merge.g.b.f("aliyundrive_oauth")));
        this.m = com.github.catvod.spider.merge.L.e.c(com.github.catvod.spider.merge.g.b.e(com.github.catvod.spider.merge.g.b.f("aliyundrive_drive")));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private String A(String str, String str2) {
        try {
            String strD = D(L(str, str2), str, str2, false);
            HashMap map = new HashMap();
            String strM = com.github.catvod.spider.merge.f0.d.m(strD, x(), map);
            SpiderDebug.log("getM3u8  m3u8Url:" + strD);
            SpiderDebug.log("getM3u8  respHeader:" + map);
            String[] strArrSplit = strM.split("\n");
            ArrayList arrayList = new ArrayList();
            HashMap map2 = new HashMap();
            String str3 = strD.substring(0, strD.lastIndexOf("/")) + "/";
            int i = 0;
            for (String strE : strArrSplit) {
                SpiderDebug.log("mediaId:" + i);
                if (strE.contains("x-oss-expires")) {
                    map2.put(String.valueOf(i), str3 + strE);
                    strE = Server.E(str, str2, String.valueOf(i));
                    i++;
                }
                arrayList.add(strE);
            }
            this.d.put(str2, map2);
            String strJoin = TextUtils.join("\n", arrayList);
            com.github.catvod.spider.merge.B.h.b("join:", strJoin);
            return strJoin;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private String C(String str, com.github.catvod.spider.merge.L.k kVar) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        if (kVar.e().isEmpty()) {
            return kVar.m() ? "root" : "";
        }
        com.github.catvod.spider.merge.L.f fVar = kVar.e().get(0);
        return fVar.m().equals("folder") ? fVar.d() : "root";
    }

    private String D(JSONObject jSONObject, String str, String str2, boolean z) {
        if (jSONObject.has("live_transcoding_task_list")) {
            return z ? Server.D(str, str2) : G(jSONObject.getJSONArray("live_transcoding_task_list"));
        }
        return "";
    }

    private String E(String[] strArr) {
        String strU = u(strArr[0], strArr[1]);
        ConcurrentHashMap<String, String> concurrentHashMap = BaseApi.get().h;
        String strC = com.github.catvod.spider.merge.i0.m.c(strU);
        Gson gson = new Gson();
        HashMap mapB = com.github.catvod.spider.merge.B.e.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36", "Referer", "https://www.aliyundrive.com/");
        mapB.put("Url", strU);
        concurrentHashMap.put(strC, gson.toJson(mapB));
        String strZ = Server.z(strU, C0773p.a.b, 500);
        if (!BaseApi.get().d.booleanValue()) {
            return NetPan.getIsoDownloadUrl(strZ);
        }
        String str = strArr[2] + strArr[3];
        BaseApi.get().downloadFileWithDownloadManager(strZ, str, x());
        com.github.catvod.spider.merge.i0.m.w("正在下载 " + str);
        return Server.B();
    }

    private static String G(JSONArray jSONArray) throws JSONException {
        for (int length = jSONArray.length() - 1; length >= 0; length--) {
            JSONObject jSONObject = jSONArray.getJSONObject(length);
            if (com.github.catvod.spider.merge.P0.e.d(jSONObject.getString("url"))) {
                return jSONObject.getString("url");
            }
        }
        return "";
    }

    private static boolean O(String str) {
        String value = new UrlQuerySanitizer(str).getValue("x-oss-expires");
        return TextUtils.isEmpty(value) || Long.parseLong(value) - (System.currentTimeMillis() / 1000) <= 60;
    }

    private static boolean P(JSONObject jSONObject) {
        try {
            SpiderDebug.log("playInfo:" + jSONObject);
            String value = new UrlQuerySanitizer(G(jSONObject.getJSONArray("live_transcoding_task_list"))).getValue("x-oss-expires");
            return !TextUtils.isEmpty(value) && Long.parseLong(value) - (System.currentTimeMillis() / 1000) <= 60;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    private void Q(HashMap<String, String> map, String str, com.github.catvod.spider.merge.L.f fVar, List<com.github.catvod.spider.merge.L.f> list, List<com.github.catvod.spider.merge.L.f> list2, List<com.github.catvod.spider.merge.L.f> list3, String str2, boolean z) {
        List<com.github.catvod.spider.merge.L.f> arrayList = z ? new ArrayList() : list;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("limit", 200);
        jsonObject.addProperty("share_id", str);
        jsonObject.addProperty("parent_file_id", fVar.d());
        jsonObject.addProperty("order_by", map != null ? map.get("type") : "name");
        jsonObject.addProperty("order_direction", map != null ? map.get("order") : "ASC");
        if (!str2.isEmpty()) {
            jsonObject.addProperty("marker", str2);
        }
        com.github.catvod.spider.merge.L.f fVar2 = (com.github.catvod.spider.merge.L.f) com.github.catvod.spider.merge.C.u.a(l("adrive/v2/file/list_by_share", jsonObject.toString(), true), com.github.catvod.spider.merge.L.f.class);
        try {
            if (fVar2.e().size() >= 1) {
                Collections.sort(fVar2.e(), new com.github.catvod.spider.merge.L.l());
            }
        } catch (Exception e) {
            StringBuilder sbB = t0.b("listFiles error");
            sbB.append(e.getMessage());
            com.github.catvod.spider.merge.i0.m.w(sbB.toString());
        }
        for (com.github.catvod.spider.merge.L.f fVar3 : fVar2.e()) {
            if (fVar3.m().equals("folder")) {
                arrayList.add(fVar3);
            } else if (fVar3.a().equals("video") || fVar3.a().equals("audio") || BaseApi.get().d.booleanValue()) {
                fVar3.n(fVar.f());
                list2.add(fVar3);
            } else if (com.github.catvod.spider.merge.i0.m.r(fVar3.c())) {
                list3.add(fVar3);
            }
        }
        if (!fVar2.g().isEmpty()) {
            Q(map, str, fVar, arrayList, list2, list3, fVar2.g(), z);
        }
        if (z) {
            Iterator<com.github.catvod.spider.merge.L.f> it = arrayList.iterator();
            while (it.hasNext()) {
                R(map, str, it.next(), arrayList, list2, list3, z);
            }
        }
    }

    private void R(HashMap<String, String> map, String str, com.github.catvod.spider.merge.L.f fVar, List<com.github.catvod.spider.merge.L.f> list, List<com.github.catvod.spider.merge.L.f> list2, List<com.github.catvod.spider.merge.L.f> list3, boolean z) {
        Q(map, str, fVar, list, list2, list3, "", z);
    }

    private String S(String str, String str2, boolean z) {
        if (!str.startsWith("https")) {
            str = C1290c.a("https://open.aliyundrive.com/adrive/v1.0/", str);
        }
        HashMap<String, String> mapX = x();
        mapX.put("authorization", this.l.c());
        com.github.catvod.spider.merge.f0.i iVarJ = com.github.catvod.spider.merge.f0.d.j(str, str2, mapX);
        SpiderDebug.log(iVarJ.b() + "," + str + "," + iVarJ.a());
        if (!z || (iVarJ.b() != 400 && iVarJ.b() != 401)) {
            return iVarJ.a();
        }
        try {
            SpiderDebug.log("oauthRequestAlitv Request...");
            String string = new JSONObject(com.github.catvod.spider.merge.f0.d.f("http://api.extscreen.com/aliyundrive/qrcode", "{\"scopes\":\"user:base,file:all:read,file:all:write\"}", null).a()).getJSONObject("data").getString("sid");
            l("https://open.aliyundrive.com/oauth/users/qrcode/authorize?sid=" + string, "{\"scope\":\"user:base,file:all:read,file:all:write\",\"authorize\":1,\"drives\":[\"backup\",\"resource\"],\"sid\":\"" + string + "\",\"scopes\":[\"user:base\",\"file:all:read\",\"file:all:write\"]}", true);
            String strL = com.github.catvod.spider.merge.f0.d.l("https://openapi.alipan.com/oauth/qrcode/" + string + "/status");
            String strA = r.a();
            String strReplace = UUID.randomUUID().toString().replace("-", "");
            String strC = r.c();
            JsonObject jsonObjectB = r.b(new JSONObject(strL).getString("authCode"), strA, strReplace, strC);
            String str3 = C0773p.a.c + "/api/getAliTvToken/?ciphertext=" + URLEncoder.encode(jsonObjectB.getAsJsonObject("data").get("ciphertext").getAsString()) + "&iv=" + URLEncoder.encode(jsonObjectB.getAsJsonObject("data").get("iv").getAsString()) + "&t=" + strA + "&uniqueID=" + strReplace + "&wifiMac=" + strC;
            com.github.catvod.spider.merge.L.g gVar = new com.github.catvod.spider.merge.L.g();
            String strL2 = com.github.catvod.spider.merge.f0.d.l(str3);
            gVar.f(strL2);
            SpiderDebug.log("oauthRequestAlitv Request accessToken..." + strL2);
            gVar.g();
            gVar.e();
            this.l = gVar;
        } catch (Exception e) {
            StringBuilder sbB = t0.b("oauthRequestAlitv error");
            sbB.append(e.getMessage());
            com.github.catvod.spider.merge.i0.m.w(sbB.toString());
            SpiderDebug.log("oauthRequestWebDav Request...");
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("authorize", 1);
            jsonObject.addProperty("scope", "user:base,file:all:read,file:all:write");
            String strL3 = l("https://open.aliyundrive.com/oauth/users/authorize?client_id=641d844e426841ea90cf6f3f933e0af7&redirect_uri=https://adrive.xdow.net/oauth/access_token?redirect_uri=http://127.0.0.1:8081&scope=file:all:write,file:all:read,user:base", jsonObject.toString(), true);
            SpiderDebug.log("OAuth Redirect...");
            com.github.catvod.spider.merge.L.g gVarD = com.github.catvod.spider.merge.L.g.d(com.github.catvod.spider.merge.f0.d.l("https://adrive.xdow.net/oauth/access_token?code=" + ((com.github.catvod.spider.merge.L.b) com.github.catvod.spider.merge.C.u.a(strL3, com.github.catvod.spider.merge.L.b.class)).a()));
            gVarD.e();
            this.l = gVarD;
        }
        return S(str, str2, false);
    }

    private String V(String str, JsonObject jsonObject) {
        if (!str.startsWith("https")) {
            str = C1290c.a("https://api.aliyundrive.com/", str);
        }
        com.github.catvod.spider.merge.f0.i iVarJ = com.github.catvod.spider.merge.f0.d.j(str, jsonObject.toString(), x());
        SpiderDebug.log(iVarJ.b() + "," + str + "," + iVarJ.a());
        return iVarJ.a();
    }

    private boolean Y() {
        try {
            SpiderDebug.log("refreshAccessToken...");
            JsonObject jsonObject = new JsonObject();
            String strF = this.n.f();
            if (strF.isEmpty()) {
                strF = this.j;
            }
            if (strF != null && strF.startsWith("http")) {
                strF = com.github.catvod.spider.merge.f0.d.l(strF).trim();
            }
            jsonObject.addProperty("refresh_token", strF);
            jsonObject.addProperty("grant_type", "refresh_token");
            String strV = V("https://auth.aliyundrive.com/v2/account/token", jsonObject);
            com.github.catvod.spider.merge.L.m mVarJ = com.github.catvod.spider.merge.L.m.j(strV);
            mVarJ.k();
            this.n = mVarJ;
            if (mVarJ.b().isEmpty()) {
                throw new Exception(strV);
            }
            return true;
        } catch (Exception e) {
            if (e instanceof TimeoutException) {
                f0();
                return false;
            }
            e.printStackTrace();
            com.github.catvod.spider.merge.L.m mVar = this.n;
            mVar.a();
            mVar.k();
            f0();
            com.github.catvod.spider.merge.i0.m.w("到配置中心配置阿里 token");
            return true;
        }
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public static void a(AliDriveApi aliDriveApi) {
        aliDriveApi.getClass();
        for (String str : new ArrayList(aliDriveApi.h)) {
            com.github.catvod.spider.merge.B.h.b("Delete...", str);
            if (((com.github.catvod.spider.merge.L.i) com.github.catvod.spider.merge.C.u.a(aliDriveApi.l("adrive/v2/batch", String.format("{\"requests\":[{\"body\":{\"drive_id\":\"%s\",\"file_id\":\"%s\"},\"headers\":{\"Content-Type\":\"application/json\"},\"id\":\"%s\",\"method\":\"POST\",\"url\":\"/file/delete\"}],\"resource\":\"file\"}", aliDriveApi.m.b(), str, str), true), com.github.catvod.spider.merge.L.i.class)).b().c() == 404) {
                aliDriveApi.h.remove(str);
            }
        }
    }

    private boolean a0() {
        try {
            com.github.catvod.spider.merge.F0.c cVar = new com.github.catvod.spider.merge.F0.c();
            StringBuilder sb = new StringBuilder();
            sb.append("04");
            com.github.catvod.spider.merge.F0.a aVar = cVar.a;
            com.github.catvod.spider.merge.F0.b bVarG = C1201a.g(aVar.d, cVar.b, aVar.c, aVar.a, aVar.b);
            com.github.catvod.spider.merge.G0.a aVarG = com.github.catvod.spider.merge.L1.l.g(bVarG.a, (aVar.c.toString(16).length() + 1) / 2);
            aVarG.d(com.github.catvod.spider.merge.L1.l.g(bVarG.b, (aVar.c.toString(16).length() + 1) / 2).a());
            sb.append(com.github.catvod.spider.merge.L1.l.d(aVarG.a()));
            String string = sb.toString();
            try {
                String strD = com.github.catvod.spider.merge.L1.l.d(C0936b.b("5dde4e1bdf9e4966b387ba58f4b3fdc3:" + this.n.d() + ":" + this.n.h() + ":0", cVar, MessageDigest.getInstance("SHA-256")).a().a());
                this.n.m(strD.substring(strD.length() - 128) + "01");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("deviceName", "samsung");
                jSONObject.put("modelName", "SM-G9810");
                jSONObject.put("nonce", 0);
                jSONObject.put("pubKey", string);
                jSONObject.put("refreshToken", this.n.f());
                JSONObject jSONObject2 = new JSONObject(e0("users/v1/users/device/create_session", jSONObject.toString(), false));
                if (jSONObject2.getBoolean("success")) {
                    return true;
                }
                throw new Exception(jSONObject2.toString());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("Could not find SHA-256 message digest in provided java environment");
            }
        } catch (Exception e) {
            this.n.m("");
            e.printStackTrace();
            return false;
        }
    }

    public static void b(AliDriveApi aliDriveApi, com.github.catvod.spider.merge.L.c cVar) {
        aliDriveApi.getClass();
        Map<String, String> mapD = cVar.d();
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        aliDriveApi.g = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(new RunnableC0755g(aliDriveApi, mapD, 0), 1L, 1L, TimeUnit.SECONDS);
    }

    public static void c(AliDriveApi aliDriveApi) {
        aliDriveApi.f0();
    }

    private void c0(String str) {
        com.github.catvod.spider.merge.L.m mVar = this.n;
        mVar.a();
        mVar.k();
        com.github.catvod.spider.merge.L.g gVar = this.l;
        gVar.a();
        gVar.e();
        com.github.catvod.spider.merge.L.e eVar = this.m;
        eVar.a();
        Init.execute(new RunnableC0748c0(eVar, 1));
        SpiderDebug.log("Token:" + str);
        com.github.catvod.spider.merge.i0.m.w("Token:" + str);
        this.p = new HashMap();
        this.e = new HashMap();
        this.n.l(str);
        Y();
        f0();
    }

    public static void d(AliDriveApi aliDriveApi, String str, com.github.catvod.spider.merge.L.c cVar) {
        Runnable runnableC0751e;
        aliDriveApi.getClass();
        int i = 0;
        try {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setClassName("com.alicloud.databox", "com.taobao.login4android.scan.QrScanActivity");
                intent.setData(Uri.parse(str));
                Init.getActivity().startActivity(intent);
                runnableC0751e = new RunnableC0753f(aliDriveApi, cVar, i);
            } catch (Exception unused) {
                aliDriveApi.d0(cVar);
                runnableC0751e = new RunnableC0751e(aliDriveApi, cVar, i);
            }
            Init.execute(runnableC0751e);
        } catch (Throwable th) {
            Init.execute(new RunnableC0749d(aliDriveApi, cVar, i));
            throw th;
        }
    }

    private void d0(com.github.catvod.spider.merge.L.c cVar) {
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(com.github.catvod.spider.merge.i0.m.f(240), com.github.catvod.spider.merge.i0.m.f(240));
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(C1201a.a(cVar.a(), 240, 2));
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.gravity = 17;
            frameLayout.addView(imageView, layoutParams);
            AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getActivity()).setView(frameLayout).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.github.catvod.spider.merge.I.j
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    AliDriveApi.c(this.a);
                }
            }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.github.catvod.spider.merge.I.n
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    AliDriveApi.h(this.a);
                }
            }).show();
            this.i = alertDialogShow;
            alertDialogShow.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            com.github.catvod.spider.merge.i0.m.w("請使用阿里雲盤 App 掃描二維碼");
        } catch (Exception unused) {
        }
    }

    private String e0(String str, String str2, boolean z) {
        if (this.n.d().isEmpty()) {
            Y();
        }
        if (this.n.g().isEmpty()) {
            a0();
        }
        if (!str.startsWith("https")) {
            str = C1290c.a("https://api.aliyundrive.com/", str);
        }
        StringBuilder sbB = t0.b("getHeaderSign():");
        sbB.append(z());
        sbB.append(",");
        sbB.append(str2);
        SpiderDebug.log(sbB.toString());
        String strA = com.github.catvod.spider.merge.f0.d.j(str, str2.toString(), z()).a();
        SpiderDebug.log(str + "," + strA);
        return (z && m(strA)) ? e0(str, str2, false) : strA;
    }

    public static void f(AliDriveApi aliDriveApi, Map map) {
        aliDriveApi.getClass();
        com.github.catvod.spider.merge.L.c cVarC = com.github.catvod.spider.merge.L.c.g(com.github.catvod.spider.merge.f0.d.g("https://passport.aliyundrive.com/newlogin/qrcode/query.do?appName=aliyun_drive&fromSite=52&_bx-v=2.2.3", map, null)).b().c();
        if (cVarC.f()) {
            aliDriveApi.c0(cVarC.e());
        }
    }

    private void f0() {
        ScheduledExecutorService scheduledExecutorService = this.g;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        Init.run(new RunnableC0743a(this, 1));
    }

    public static /* synthetic */ void g(AliDriveApi aliDriveApi, String str) {
        aliDriveApi.getClass();
        if (str.startsWith("http")) {
            str = com.github.catvod.spider.merge.f0.d.l(str);
        } else if (str.length() != 32) {
            if (!str.contains(":")) {
                return;
            }
            str = t0.a("http://", str, "/proxy?do=ali&type=token");
            str = com.github.catvod.spider.merge.f0.d.l(str);
        }
        aliDriveApi.c0(str);
    }

    public static void h(AliDriveApi aliDriveApi) {
        aliDriveApi.f0();
    }

    public static void i(AliDriveApi aliDriveApi, EditText editText) {
        aliDriveApi.getClass();
        String string = editText.getText().toString();
        aliDriveApi.p();
        Init.execute(new RunnableC0755g(aliDriveApi, string, 1));
    }

    public static void j(AliDriveApi aliDriveApi) {
        aliDriveApi.p();
        Init.execute(new RunnableC0745b(aliDriveApi, 2));
    }

    public static void k(AliDriveApi aliDriveApi, EditText editText) {
        aliDriveApi.getClass();
        String string = editText.getText().toString();
        aliDriveApi.p();
        Init.execute(new RunnableC0747c(aliDriveApi, string, 1));
    }

    private String l(String str, String str2, boolean z) {
        if (!str.startsWith("https")) {
            str = C1290c.a("https://api.aliyundrive.com/", str);
        }
        com.github.catvod.spider.merge.f0.i iVarJ = com.github.catvod.spider.merge.f0.d.j(str, str2, y());
        SpiderDebug.log(iVarJ.b() + "," + str + "," + iVarJ.a());
        return (z && iVarJ.b() == 401 && Y()) ? l(str, str2, false) : (z && iVarJ.b() == 429) ? l(str, str2, false) : iVarJ.a();
    }

    private boolean m(String str) {
        if (str.contains("AccessTokenInvalid")) {
            return Y();
        }
        if (str.contains("UserDeviceOffline") || str.contains("UserDeviceIllegality") || str.contains("DeviceSessionSignatureInvalid")) {
            return a0();
        }
        return false;
    }

    private String n(String str, String str2) {
        if (this.m.b().isEmpty()) {
            v();
        }
        com.github.catvod.spider.merge.B.h.b("Copy...", str2);
        return ((com.github.catvod.spider.merge.L.i) com.github.catvod.spider.merge.C.u.a(l("adrive/v2/batch", String.format("{\"requests\":[{\"body\":{\"file_id\":\"%s\",\"share_id\":\"%s\",\"auto_rename\":true,\"to_parent_file_id\":\"root\",\"to_drive_id\":\"%s\"},\"headers\":{\"Content-Type\":\"application/json\"},\"id\":\"0\",\"method\":\"POST\",\"url\":\"/file/copy\"}],\"resource\":\"file\"}", str2, str, this.m.b()), true), com.github.catvod.spider.merge.L.i.class)).b().a().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        try {
            AlertDialog alertDialog = this.i;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    private String q(String str, List<com.github.catvod.spider.merge.L.f> list) {
        ArrayList<com.github.catvod.spider.merge.L.f> arrayList = new ArrayList();
        String lowerCase = com.github.catvod.spider.merge.i0.m.x(str).toLowerCase();
        for (com.github.catvod.spider.merge.L.f fVar : list) {
            String lowerCase2 = com.github.catvod.spider.merge.i0.m.x(fVar.f()).toLowerCase();
            if (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase)) {
                arrayList.add(fVar);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(list);
        }
        StringBuilder sb = new StringBuilder();
        for (com.github.catvod.spider.merge.L.f fVar2 : arrayList) {
            sb.append("+");
            sb.append(com.github.catvod.spider.merge.i0.m.x(fVar2.f()));
            sb.append("@@@");
            sb.append(fVar2.c());
            sb.append("@@@");
            sb.append(fVar2.d());
        }
        return sb.toString();
    }

    public static AliDriveApi r() {
        return C0773p.a;
    }

    private void v() {
        SpiderDebug.log("Get Drive Id...");
        com.github.catvod.spider.merge.L.e eVarC = com.github.catvod.spider.merge.L.e.c(l("https://user.aliyundrive.com/v2/user/get", "{}", true));
        Init.execute(new RunnableC0748c0(eVarC, 1));
        this.m = eVarC;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    private void w(String str) {
        try {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("file_id", (String) this.h.get(0));
            jsonObject.addProperty("drive_id", this.m.b());
            String strS = S("openFile/get", jsonObject.toString(), true);
            String string = new JSONObject(strS).getString("size");
            String string2 = new JSONObject(strS).getString("content_hash");
            String string3 = new JSONObject(strS).getString("name");
            this.e.put(str + "contentHash", string2);
            this.e.put(str + "size", string);
            this.e.put(str + "name", string3);
        } catch (JSONException unused) {
        }
    }

    private HashMap<String, String> y() {
        HashMap<String, String> mapX = x();
        com.github.catvod.spider.merge.L.k kVar = this.k;
        if (!(kVar == null)) {
            mapX.put("x-share-token", kVar.k());
        }
        mapX.put("X-Canary", "client=Android,app=adrive,version=v4.3.1");
        if (this.n.i()) {
            mapX.put("authorization", this.n.c());
        }
        return mapX;
    }

    private HashMap<String, String> z() {
        HashMap<String, String> mapX = x();
        mapX.put("X-Canary", "client=Android,app=adrive,version=v4.3.1");
        if (this.n.i()) {
            mapX.put("authorization", this.n.c());
        }
        mapX.put("x-device-id", this.n.d());
        mapX.put("x-signature", this.n.g());
        return mapX;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>] */
    public final String B(String str, String str2, String str3, String str4) {
        this.o.lock();
        String str5 = (String) ((Map) this.d.get(str4)).get(str3);
        SpiderDebug.log("fileId:" + str4 + " " + str3);
        if (O(str5)) {
            A(str2, str4);
            str5 = (String) ((Map) this.d.get(str4)).get(str3);
        }
        this.o.unlock();
        SpiderDebug.log("getM3u8Proxy:" + str5);
        return str5;
    }

    public final String F(String str, String str2) {
        String str3 = null;
        if (!C0773p.a.a.booleanValue()) {
            return null;
        }
        try {
            str3 = "http://127.0.0.1:9975/api/danmu/?do=danmuku&vodName=" + URLEncoder.encode(str) + "&jishu=" + URLEncoder.encode(str2);
            SpiderDebug.log("danmuUrl:" + str3);
            return str3;
        } catch (Exception e) {
            e.printStackTrace();
            return str3;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final String H(String str, String str2) {
        try {
            if (this.p.containsKey(str2) && this.p.get(str2) != null && !O((String) this.p.get(str2))) {
                return (String) this.p.get(str2);
            }
            Z(str, "");
            SpiderDebug.log("getShareDownloadUrl..." + str2);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("file_id", str2);
            jsonObject.addProperty("share_id", str);
            jsonObject.addProperty("expire_sec", 600);
            String asString = JsonParser.parseString(l("v2/file/get_share_link_download_url", jsonObject.toString(), false)).getAsJsonObject().get("download_url").getAsString();
            this.p.put(str2, asString);
            return asString;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public final String I(String str, String str2) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("share_id", str);
        jsonObject.addProperty("share_pwd", str2);
        SpiderDebug.log("get_share_token" + jsonObject);
        return V("v2/share_link/get_share_token", jsonObject);
    }

    public final List<com.github.catvod.spider.merge.K.h> J(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str.contains("@@@")) {
                String[] strArrSplit = str.split("@@@");
                String str2 = strArrSplit[0];
                String str3 = strArrSplit[1];
                String str4 = Proxy.getUrl() + "?do=ali&type=sub&shareId=" + strArr[0] + "&fileId=" + strArrSplit[2];
                com.github.catvod.spider.merge.K.h hVar = new com.github.catvod.spider.merge.K.h();
                hVar.b(str2);
                com.github.catvod.spider.merge.K.h hVarA = hVar.a(str3);
                hVarA.c(str4);
                arrayList.add(hVarA);
            }
        }
        return arrayList;
    }

    public final File K() {
        return com.github.catvod.spider.merge.g.b.f("aliyundrive_threadNum");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<java.lang.String, org.json.JSONObject>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.HashMap, java.util.Map<java.lang.String, org.json.JSONObject>] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.HashMap, java.util.Map<java.lang.String, org.json.JSONObject>] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.HashMap, java.util.Map<java.lang.String, org.json.JSONObject>] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.HashMap, java.util.Map<java.lang.String, org.json.JSONObject>] */
    public final JSONObject L(String str, String str2) {
        JSONObject jSONObject;
        Runnable runnableC0771o;
        int i = 1;
        try {
            try {
                if (!this.f.containsKey(str2) || this.f.get(str2) == null || P((JSONObject) this.f.get(str2))) {
                    Z(str, "");
                    SpiderDebug.log("getVideoPreviewPlayInfo1..." + str2);
                    this.h.add(0, n(str, str2));
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("file_id", this.h.get(0));
                    jSONObject2.put("drive_id", this.n.e());
                    jSONObject2.put("category", "live_transcoding");
                    jSONObject2.put("url_expire_sec", "14400");
                    String strS = S("openFile/getVideoPreviewPlayInfo", jSONObject2.toString(), true);
                    String strE0 = e0("v2/file/get_video_preview_play_info", jSONObject2.toString(), true);
                    JSONArray jSONArray = new JSONObject(strE0).getJSONObject("video_preview_play_info").getJSONArray("live_transcoding_task_list");
                    if (com.github.catvod.spider.merge.P0.e.d(jSONArray.getJSONObject(jSONArray.length() - 1).getString("url"))) {
                        strS = strE0;
                    }
                    jSONObject = new JSONObject(strS).getJSONObject("video_preview_play_info");
                    this.f.put(str2, jSONObject);
                    runnableC0771o = new RunnableC0771o(this, 1);
                } else {
                    jSONObject = (JSONObject) this.f.get(str2);
                    runnableC0771o = new RunnableC0745b(this, i);
                }
            } catch (Exception e) {
                e.printStackTrace();
                jSONObject = new JSONObject();
                runnableC0771o = new RunnableC0771o(this, 1);
            }
            Init.execute(runnableC0771o);
            return jSONObject;
        } catch (Throwable th) {
            Init.execute(new RunnableC0771o(this, 1));
            throw th;
        }
    }

    public final com.github.catvod.spider.merge.K.VodItem M(String str, String str2, String str3, String str4, String str5) {
        String str6;
        ArrayList arrayList = new ArrayList();
        arrayList.add("代理原畫");
        arrayList.add("原畫");
        if (NetPan.containPuHua()) {
            arrayList.add("普畫");
        }
        try {
            Z(str4, str);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("share_id", str4);
            com.github.catvod.spider.merge.L.k kVarN = com.github.catvod.spider.merge.L.k.n(V("adrive/v3/share_link/get_share_by_anonymous", jsonObject));
            String strY = com.github.catvod.spider.merge.P0.e.b(str2) ? com.github.catvod.spider.merge.i0.m.y(kVarN.i()) : str2;
            if (com.github.catvod.spider.merge.P0.e.b(kVarN.d())) {
                return BaseApi.fakeVod(arrayList, "ali雲盤");
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = arrayList2;
            str6 = "ali雲盤";
            String str7 = strY;
            try {
                R(null, str4, new com.github.catvod.spider.merge.L.f(C(str5, kVarN)), new ArrayList(), arrayList2, arrayList3, true);
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                int i = 0;
                while (i < arrayList4.size()) {
                    SpiderDebug.log("getVod" + str7);
                    ArrayList arrayList7 = arrayList4;
                    com.github.catvod.spider.merge.L.f fVar = (com.github.catvod.spider.merge.L.f) arrayList7.get(i);
                    StringBuilder sb = new StringBuilder();
                    sb.append(fVar.b());
                    sb.append("$");
                    sb.append(str4);
                    sb.append("+");
                    sb.append(fVar.d());
                    sb.append("+");
                    sb.append(com.github.catvod.spider.merge.i0.m.y(str7));
                    sb.append("+");
                    sb.append(fVar.f());
                    ArrayList arrayList8 = arrayList3;
                    sb.append(q(fVar.f(), arrayList8));
                    arrayList5.add(sb.toString());
                    i++;
                    arrayList4 = arrayList7;
                    arrayList3 = arrayList8;
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    arrayList6.add(TextUtils.join("#", arrayList5));
                }
                com.github.catvod.spider.merge.K.VodItem iVar = new com.github.catvod.spider.merge.K.VodItem();
                iVar.l(str3);
                iVar.j(str3);
                iVar.n(kVarN.c());
                iVar.m(kVarN.i());
                iVar.p(TextUtils.join("$$$", arrayList6));
                iVar.o(TextUtils.join("$$$", arrayList));
                iVar.g("阿里雲盤");
                return iVar;
            } catch (Exception unused) {
                return BaseApi.fakeVod(arrayList, str6);
            }
        } catch (Exception unused2) {
            str6 = "ali雲盤";
        }
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final List<com.github.catvod.spider.merge.K.VodItem> N(com.github.catvod.spider.merge.K.j jVar) {
        String strF;
        String strD = jVar.d();
        String strC = jVar.c();
        String strF2 = jVar.f();
        String strE = jVar.e();
        String strB = jVar.b();
        HashMap<String, String> mapA = jVar.a();
        Z(strC, strD);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("share_id", strC);
        com.github.catvod.spider.merge.L.k kVarN = com.github.catvod.spider.merge.L.k.n(V("adrive/v3/share_link/get_share_by_anonymous", jsonObject));
        if (com.github.catvod.spider.merge.P0.e.b(strF2)) {
            kVarN.i();
        }
        ArrayList<com.github.catvod.spider.merge.L.f> arrayList = new ArrayList();
        List<com.github.catvod.spider.merge.L.f> arrayList2 = new ArrayList<>();
        ArrayList<com.github.catvod.spider.merge.L.f> arrayList3 = new ArrayList();
        R(mapA, strC, new com.github.catvod.spider.merge.L.f(C(strB, kVarN)), arrayList3, arrayList, arrayList2, false);
        ArrayList arrayList4 = new ArrayList();
        for (com.github.catvod.spider.merge.L.f fVar : arrayList3) {
            com.github.catvod.spider.merge.K.VodItem iVar = new com.github.catvod.spider.merge.K.VodItem();
            iVar.l(fVar.j() + "*#" + fVar.d());
            iVar.m(fVar.b());
            iVar.r(fVar.m());
            arrayList4.add(iVar);
        }
        for (com.github.catvod.spider.merge.L.f fVar2 : arrayList) {
            com.github.catvod.spider.merge.K.VodItem iVar2 = new com.github.catvod.spider.merge.K.VodItem();
            StringBuilder sbA = com.github.catvod.spider.merge.C1.a.a(strE, "/folder/");
            sbA.append(fVar2.i());
            sbA.append("*#");
            if (this.q.get(fVar2.i()) != null) {
                strF = (String) this.q.get(fVar2.i());
            } else {
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("file_id", fVar2.i());
                jsonObject2.addProperty("fields", "");
                jsonObject2.addProperty("drive_id", "");
                jsonObject2.addProperty("share_id", strC);
                com.github.catvod.spider.merge.L.f fVar3 = (com.github.catvod.spider.merge.L.f) com.github.catvod.spider.merge.C.u.a(l("adrive/v2/file/get_by_share", jsonObject2.toString(), true), com.github.catvod.spider.merge.L.f.class);
                this.q.put(fVar2.i(), fVar3.f());
                strF = fVar3.f();
            }
            sbA.append(strF);
            iVar2.l(sbA.toString());
            iVar2.m(fVar2.b());
            iVar2.r(fVar2.m());
            iVar2.n(fVar2.l());
            arrayList4.add(iVar2);
        }
        return arrayList4;
    }

    public final String T(String[] strArr) {
        try {
            String strD = D(L(strArr[0], strArr[1]), strArr[0], strArr[1], true);
            List<com.github.catvod.spider.merge.K.h> listJ = J(strArr);
            ArrayList arrayList = (ArrayList) listJ;
            arrayList.addAll(arrayList);
            com.github.catvod.spider.merge.K.g gVar = new com.github.catvod.spider.merge.K.g();
            gVar.w(strD);
            gVar.a(t(strArr));
            gVar.v(listJ);
            gVar.g(x());
            return gVar.toString();
        } catch (Exception e) {
            e.printStackTrace();
            com.github.catvod.spider.merge.K.g gVar2 = new com.github.catvod.spider.merge.K.g();
            gVar2.w("");
            return gVar2.toString();
        }
    }

    public final String U(String[] strArr, String str) {
        try {
            if (str.split("#")[0].equals("原畫")) {
                u(strArr[0], strArr[1]);
                s(strArr[1]);
                com.github.catvod.spider.merge.K.g gVar = new com.github.catvod.spider.merge.K.g();
                gVar.w(Server.x(strArr[0], strArr[1]));
                gVar.i();
                gVar.a(t(strArr));
                gVar.v(J(strArr));
                HashMap map = new HashMap();
                map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
                map.put("Referer", "https://cdnfhnfile.115.com/");
                gVar.g(map);
                return gVar.toString();
            }
            if (str.split("#")[0].equals("普畫")) {
                return T(strArr);
            }
            if (str.split("#")[0].equals("分享原畫")) {
                com.github.catvod.spider.merge.K.g gVar2 = new com.github.catvod.spider.merge.K.g();
                gVar2.w(Server.z(H(strArr[0], strArr[1]), 10, 480));
                gVar2.i();
                gVar2.a(t(strArr));
                gVar2.v(J(strArr));
                gVar2.g(x());
                return gVar2.toString();
            }
            if (!str.split("#")[0].equals("代理原畫")) {
                com.github.catvod.spider.merge.K.g gVar3 = new com.github.catvod.spider.merge.K.g();
                gVar3.w("");
                return gVar3.toString();
            }
            String strE = E(strArr);
            com.github.catvod.spider.merge.K.g gVar4 = new com.github.catvod.spider.merge.K.g();
            gVar4.w(strE);
            gVar4.i();
            gVar4.a(t(strArr));
            gVar4.v(J(strArr));
            gVar4.g(x());
            return gVar4.toString();
        } catch (Exception unused) {
            com.github.catvod.spider.merge.K.g gVar5 = new com.github.catvod.spider.merge.K.g();
            gVar5.w("");
            return gVar5.toString();
        }
    }

    public final Object[] W(String str, String str2, String str3) {
        String strA = A(str, str2);
        return new Object[]{200, "audio/x-mpegurl", strA, Integer.valueOf(strA.getBytes().length)};
    }

    public final Object[] X(Map<String, String> map) throws UnsupportedEncodingException {
        byte[] bArrBytes = com.github.catvod.spider.merge.f0.d.e(u(map.get("shareId"), map.get("fileId")), y()).body().bytes();
        List<String> list = com.github.catvod.spider.merge.i0.m.a;
        Charset charsetForName = Charset.forName("GBK");
        if (Arrays.equals(bArrBytes, new String(bArrBytes, charsetForName).getBytes(charsetForName))) {
            bArrBytes = new String(bArrBytes, Charset.forName("GBK")).getBytes("UTF-8");
        }
        return new Object[]{200, "application/octet-stream", new ByteArrayInputStream(bArrBytes)};
    }

    public final void Z(String str, String str2) {
        com.github.catvod.spider.merge.L.k kVar = this.k;
        if (kVar == null || !kVar.a(str)) {
            SpiderDebug.log("refreshShareToken..." + str + "sharePwd:" + str2);
            com.github.catvod.spider.merge.L.k kVarN = com.github.catvod.spider.merge.L.k.n(I(str, str2));
            kVarN.o(str);
            kVarN.q();
            this.k = kVarN;
            if (kVarN.k().isEmpty()) {
                com.github.catvod.spider.merge.i0.m.w("來晚啦，該分享已失效。");
            }
        }
    }

    public final void b0(String str) {
        this.j = str;
    }

    public final String o(String str, String str2, Long l, String str3) {
        try {
            if (this.m.b().isEmpty()) {
                v();
            }
            SpiderDebug.log("createFile..." + str);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("drive_id", this.m.b());
            jsonObject.addProperty("parent_file_id", "root");
            jsonObject.addProperty("type", "file");
            jsonObject.addProperty("name", str);
            jsonObject.addProperty("size", l);
            jsonObject.addProperty("content_hash", str3);
            jsonObject.addProperty("content_hash_name", "sha1");
            String str4 = C0773p.a.c + "/api/getAliCalProofCode/?size=" + URLEncoder.encode(String.valueOf(l)) + "&accessToken=" + URLEncoder.encode(this.l.b()) + "&url=" + URLEncoder.encode(str2);
            SpiderDebug.log("createFile param：" + jsonObject);
            SpiderDebug.log("createFile proofCodeUrl：" + str4);
            String strL = com.github.catvod.spider.merge.f0.d.l(str4);
            SpiderDebug.log("createFile proofCode：" + strL);
            jsonObject.addProperty("proof_code", strL);
            jsonObject.addProperty("check_name_mode", "ignore");
            String strS = S("openFile/create", jsonObject.toString(), true);
            SpiderDebug.log("createFile res：" + strS);
            if (!new JSONObject(strS).getBoolean("rapid_upload")) {
                com.github.catvod.spider.merge.i0.m.w(str + " 秒传阿里失败:");
                return null;
            }
            String[] strArr = {"", new JSONObject(strS).getString("file_id"), str, ""};
            com.github.catvod.spider.merge.i0.m.w(str + " 秒传阿里成功:");
            return E(strArr);
        } catch (Exception e) {
            StringBuilder sbA = com.github.catvod.spider.merge.C1.a.a(str, " 秒传阿里失败:");
            sbA.append(e.getMessage());
            com.github.catvod.spider.merge.i0.m.w(sbA.toString());
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final String s(String str) {
        String str2;
        Q0 q0;
        Map<String, String> map;
        StringBuilder sb;
        try {
        } catch (Exception unused) {
            str2 = "";
            q0 = P0.a;
            map = this.e;
            sb = new StringBuilder();
        } catch (Throwable th) {
            P0.a.a((String) this.e.get(str + "name"));
            throw th;
        }
        if (this.e.get(str + "115") != null) {
            str2 = (String) this.e.get(str + "115");
            q0 = P0.a;
            map = this.e;
            sb = new StringBuilder();
            sb.append(str);
            sb.append("name");
            q0.a(map.get(sb.toString()));
            return str2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C0773p.a.c);
        sb2.append("/api/yun115/?totalHash=");
        sb2.append(URLEncoder.encode((String) this.e.get(str + "contentHash")));
        sb2.append("&size=");
        sb2.append(URLEncoder.encode((String) this.e.get(str + "size")));
        sb2.append("&path=");
        sb2.append(URLEncoder.encode((String) this.e.get(str)));
        sb2.append("&name=");
        sb2.append(URLEncoder.encode((String) this.e.get(str + "name")));
        sb2.append("&cookie=");
        sb2.append(URLEncoder.encode(P0.a.e.b()));
        String strL = com.github.catvod.spider.merge.f0.d.l(sb2.toString());
        if (NetPan.isYun115(strL)) {
            this.e.put(str + "115", strL);
        }
        P0.a.a((String) this.e.get(str + "name"));
        return strL;
    }

    public final String t(String[] strArr) {
        try {
            SpiderDebug.log("danmumPushUrl" + this.r);
            if (!com.github.catvod.spider.merge.P0.e.d(this.r)) {
                return F(strArr[2], strArr[3]);
            }
            String str = this.r;
            this.r = "";
            return str;
        } catch (Exception e) {
            SpiderDebug.log("getDanmuUrl " + e);
            return "";
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public final String u(String str, String str2) {
        String strA;
        Runnable runnableC0771o;
        int i = 0;
        try {
            try {
                if (!this.e.containsKey(str2) || this.e.get(str2) == null || O((String) this.e.get(str2))) {
                    SpiderDebug.log("getDownloadUrl..." + str2);
                    if (com.github.catvod.spider.merge.P0.e.d(str)) {
                        Z(str, "");
                        this.h.add(0, n(str, str2));
                    } else {
                        this.h.add(0, str2);
                    }
                    JsonObject jsonObject = new JsonObject();
                    jsonObject.addProperty("file_id", (String) this.h.get(0));
                    jsonObject.addProperty("drive_id", this.m.b());
                    jsonObject.addProperty("expire_sec", 14400);
                    String strE0 = e0("https://bj29.api.aliyunpds.com/v2/file/get_download_url", jsonObject.toString(), true);
                    strA = com.github.catvod.spider.merge.P0.e.d(com.github.catvod.spider.merge.L.d.c(strE0).a()) ? com.github.catvod.spider.merge.L.d.c(strE0).a() : com.github.catvod.spider.merge.L.d.c(strE0).b();
                    this.e.put(str2, strA);
                    w(str2);
                    runnableC0771o = new RunnableC0771o(this, 0);
                } else {
                    strA = (String) this.e.get(str2);
                    runnableC0771o = new RunnableC0745b(this, i);
                }
                Init.execute(runnableC0771o);
                return strA;
            } catch (Exception e) {
                com.github.catvod.spider.merge.i0.m.w("ali getDownloadUrl error" + e.getMessage());
                Init.execute(new RunnableC0771o(this, 0));
                return "";
            }
        } catch (Throwable th) {
            Init.execute(new RunnableC0771o(this, 0));
            throw th;
        }
    }

    public final HashMap<String, String> x() {
        return com.github.catvod.spider.merge.B.e.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36", "Referer", "https://www.aliyundrive.com/");
    }
}
