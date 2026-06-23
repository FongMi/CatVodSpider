package com.github.catvod.utils.merge;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.github.catvod.bean.quark.QuarkFile;
import com.github.catvod.bean.quark.QuarkMetadata;
import com.github.catvod.bean.quark.QuarkQuality;
import com.github.catvod.bean.quark.QuarkSorter;
import com.github.catvod.bean.uc.UcQuality;
import com.github.catvod.bean.uc.UcUser;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.utils.MapHelper;
import com.github.catvod.utils.PanHttpClient;
import com.github.catvod.utils.PanStringUtils;
import com.github.catvod.utils.PanTextUtils;
import com.github.catvod.utils.server.Server;
import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.URLEncoder;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public final class UcDriveApi {
    private static class Holder { static final UcDriveApi INSTANCE = new UcDriveApi(); }
    private static Map<String, String> n;
    private static Map<String, String> o;
    private final Map<String, String> a;
    private final Map<String, String> b;
    private ScheduledExecutorService c;
    private final ReentrantLock d = new ReentrantLock(true);
    private final ReentrantLock e = new ReentrantLock(true);
    private final List<String> f = new ArrayList();
    private AlertDialog g;
    private String h;
    private String i;
    private long j;
    private String k;
    private String l;
    public UcUser m;

    UcDriveApi() {
        try {
            this.m = UcUser.fromJson(LocalStorage.readJson("uc_user"));
        } catch (Exception unused) {
            SpiderDebug.log("uc授权初始化失败，请删除根目录TV文件夹下授权文件后重试");
        }
        w();
        SpiderDebug.log("uc QuarkPanApi constructor user:" + this.m);
        HashMap map = new HashMap();
        this.a = map;
        map.put("4K", "4k");
        map.put("2k", "2k");
        map.put("超清", "super");
        map.put("高清", "high");
        map.put("標清", "low");
        map.put("流暢", "normal");
        HashMap map2 = new HashMap();
        this.b = map2;
        map2.put("4kz", "UC原畫");
        map2.put("4k", "4K");
        map2.put("2k", "2K");
        map2.put("super", "高清");
        map2.put("high", "標清");
        map2.put("low", "流暢");
        map2.put("normal", "普通");
        map2.put("auto", "UC預覽畫質");
        new HashMap(128);
        n = new HashMap(512);
        o = new HashMap(4096);
    }

    private void C(HashMap<String, String> map, boolean z, QuarkFile aVar, List<QuarkFile> list, List<QuarkFile> list2, List<QuarkFile> list3) {
        D(map, z, aVar, list, list2, list3, 1);
    }

    private void D(HashMap<String, String> map, boolean z, QuarkFile aVar, List<QuarkFile> list, List<QuarkFile> list2, List<QuarkFile> list3, int i) {
        if (z) {
            try {
                list3 = new ArrayList<>();
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        SpiderDebug.log("listFiles >> " + map);
        StringBuilder sb = new StringBuilder();
        sb.append("1/clouddrive/share/sharepage/detail?pr=UCBrowser&fr=pc&pwd_id=");
        sb.append(this.k);
        sb.append("&stoken=");
        sb.append(URLEncoder.encode(this.h));
        sb.append("&pdir_fid=");
        sb.append(aVar.d());
        sb.append("&force=0&_page=");
        sb.append(i);
        sb.append("&_size=50&_fetch_banner=1&_fetch_share=1&_fetch_total=1&_sort=");
        sb.append((map == null || !"updated_at".equals(map.get("type"))) ? "file_name" : map.get("type"));
        sb.append(":");
        sb.append((map == null || map.get("order") == null) ? "asc" : map.get("order").toLowerCase());
        String strS = s(sb.toString());
        SpiderDebug.log("listFiles >> " + strS);
        JSONObject jSONObject = new JSONObject(strS);
        QuarkFile aVarL = QuarkFile.l(jSONObject.getJSONObject("data").toString());
        try {
            if (aVarL.e().size() >= 1) {
                QuarkSorter.a(aVarL.e());
            }
        } catch (Exception e2) {
            SpiderDebug.log("listFiles error" + e2.getMessage());
        }
        for (QuarkFile aVar2 : aVarL.e()) {
            if ("folder".equals(aVar2.k())) {
                list3.add(aVar2);
            } else if (BaseApi.get().d.booleanValue() || PanStringUtils.isVideoFile(aVar2.f())) {
                aVar2.m(aVar.f());
                list.add(aVar2);
            } else if (PanStringUtils.isSubtitleExtension(aVar2.c())) {
                list2.add(aVar2);
            }
        }
        QuarkMetadata cVar = QuarkMetadata.fromJson(jSONObject.getJSONObject("metadata").toString());
        if (((cVar.getPage() - 1) * cVar.getPageSize()) + cVar.getCount() < cVar.getTotal()) {
            D(map, z, aVar, list, list2, list3, cVar.getPage() + 1);
        }
        if (z) {
            Iterator<QuarkFile> it = list3.iterator();
            while (it.hasNext()) {
                C(map, z, it.next(), list, list2, null);
            }
        }
    }

    private PanHttpClient.HttpResponse H(String str, JSONObject jSONObject) throws InterruptedException {
        if (!str.startsWith("https")) {
            str = UrlUtils.resolveUrl("https://pc-api.uc.cn/", str);
        }
        HashMap map = new HashMap();
        HashMap<String, String> mapV = v(str);
        PanHttpClient.HttpResponse iVar = new PanHttpClient.HttpResponse();
        int i = 2;
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                break;
            }
            iVar = PanHttpClient.post(str, jSONObject.toString(), mapV, map);
            if (iVar.a().length() > 10) {
                break;
            }
            Thread.sleep(500L);
            i = i2;
        }
        E(map);
        SpiderDebug.log("quark post url:" + str + " headers:" + mapV + " postBody:" + jSONObject.toString() + " newcookie: result:," + iVar.a());
        return iVar;
    }

    private boolean I(String str, String str2) {
        try {
            if (!this.e.tryLock()) {
                return false;
            }
            try {
            } catch (Exception e) {
                e.printStackTrace();
                SpiderDebug.log("來晚啦，該分享已失效。");
            }
            if (!str.equals(this.k) || System.currentTimeMillis() >= this.j) {
                SpiderDebug.log("refreshSToken...");
                int i = 3;
                while (true) {
                    int i2 = i - 1;
                    if (i <= 0 || !PanTextUtils.isEmpty(this.m.getCookie())) {
                        break;
                    }
                    Thread.sleep(1000L);
                    i = i2;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pwd_id", str);
                jSONObject.put("passcode", str2);
                PanHttpClient.HttpResponse iVarH = H("1/clouddrive/share/sharepage/token?pr=UCBrowser&fr=pc", jSONObject);
                JSONObject jSONObject2 = new JSONObject(iVarH.a());
                System.out.println("resultJson" + jSONObject2);
                if (jSONObject2.getInt("status") == 401) {
                    SpiderDebug.log("cookie is invalid:" + this.m.getCookie());
                    SpiderDebug.log("cookie is invalid:" + this.m.getCookie());
                    this.m.setCookie("");
                    this.m.save();
                    this.h = "";
                    return false;
                }
                String strA = iVarH.a();
                this.h = new JSONObject(strA).getJSONObject("data").getString("stoken");
                this.i = new JSONObject(strA).getJSONObject("data").getJSONObject("author").getString("avatar_url");
                SpiderDebug.log("sToken: " + this.h);
                this.k = str;
                this.j = System.currentTimeMillis() + 3600000;
            } else {
                SpiderDebug.log("use cached SToken..." + this.h);
            }
            return true;
        } finally {
            this.e.unlock();
        }
    }

    private void K() {
        String strL = PanHttpClient.get(AliDriveHelper.getProxyBaseUrl() + "/api/ucGetRefreshToken");
        if ((strL != null && !strL.isEmpty())) {
            this.m.setToken(strL);
            this.m.save();
            O();
        }
    }

    private void N(String str) {
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(PanStringUtils.dpToPx(240), PanStringUtils.dpToPx(240));
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(QrCodeUtils.generateQrCode(str, 240, 2));
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.gravity = 17;
            frameLayout.addView(imageView, layoutParams);
            AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getActivity()).setView(frameLayout).setOnCancelListener(new DialogInterfaceOnCancelListenerC0784z(this, 2)).setOnDismissListener(new A(this, 2)).show();
            this.g = alertDialogShow;
            alertDialogShow.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            SpiderDebug.log("請使用UC App 掃描二維碼");
        } catch (Exception unused) {
        }
    }

    private void O() {
        ScheduledExecutorService scheduledExecutorService = this.c;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        Init.run(new RunnableC0768m0(this, 1));
    }

    public static void a(UcDriveApi v0Var) {
        v0Var.p();
        Init.execute(new RunnableC0774p0(v0Var, false));
    }

    public static void b(UcDriveApi v0Var) {
        v0Var.p();
        Init.execute(new RunnableC0774p0(v0Var, true));
    }

    public static void d(final UcDriveApi v0Var, final boolean z, final String str) {
        v0Var.getClass();
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        v0Var.c = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(new Runnable() {
            @Override // java.lang.Runnable
            public final void run() {
                UcDriveApi.e(this.b, z, str);
            }
        }, 1L, 1L, TimeUnit.SECONDS);
    }

    public static /* synthetic */ void e(UcDriveApi v0Var, boolean z, String str) {
        v0Var.getClass();
        try {
            if (z) {
                v0Var.K();
            } else {
                String strL = PanHttpClient.get("https://api.open.uc.cn/cas/ajax/getServiceTicketByQrcodeToken?client_id=381&v=1.2&token=" + str);
                String string = new JSONObject(strL).getString("status");
                SpiderDebug.log("params " + str);
                if ("2000000".equals(string)) {
                    String string2 = new JSONObject(strL).getJSONObject("data").getJSONObject("members").getString("service_ticket");
                    SpiderDebug.log("serviceTicket>>" + string2);
                    HashMap map = new HashMap();
                    String strM = PanHttpClient.get("https://drive.uc.cn/account/info?st=" + string2 + "&lw=scan", null, map);
                    StringBuilder sb = new StringBuilder();
                    sb.append("string");
                    sb.append(strM);
                    SpiderDebug.log(sb.toString());
                    SpiderDebug.log("respHeader" + map);
                    if (new JSONObject(strM).getBoolean("success")) {
                        String string3 = v0Var.t(map).toString();
                        HashMap map2 = new HashMap();
                        HashMap map3 = new HashMap();
                        map3.put("Cookie", string3);
                        SpiderDebug.log("string1" + PanHttpClient.get("https://pc-api.uc.cn/1/clouddrive/file/sort?pr=UCBrowser&fr=pc&uc_param_str=&pdir_fid=0&_page=1&_size=50&_fetch_total=1&_fetch_sub_dirs=0&_sort=file_type:asc,updated_at:desc", map3, map2));
                        v0Var.J(((Object) v0Var.t(map2)) + string3, true);
                        SpiderDebug.log("请重新进入播放页。。。" + strL);
                        v0Var.O();
                    }
                }
            }
        } catch (JSONException e) {
            v0Var.O();
            throw new RuntimeException(e);
        }
    }

    public static void f(EditText editText) {
        UcDriveApi v0Var = u0.a;
        String string = editText.getText().toString();
        v0Var.p();
        Init.execute(new RunnableC0753f(v0Var, string, 1));
    }

    public static void g(UcDriveApi v0Var) {
        v0Var.O();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x000e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void h(UcDriveApi r7) throws org.json.JSONException, java.lang.InterruptedException {
        /*
            r7.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<java.lang.String> r1 = r7.f
            r0.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7f
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r2 = 0
            r3 = 1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L76
            r4.<init>()     // Catch: java.lang.Exception -> L76
            java.lang.String r5 = "Delete..."
            r4.append(r5)     // Catch: java.lang.Exception -> L76
            r4.append(r1)     // Catch: java.lang.Exception -> L76
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L76
            com.github.catvod.crawler.SpiderDebug.log(r4)     // Catch: java.lang.Exception -> L76
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L76
            r4.<init>()     // Catch: java.lang.Exception -> L76
            java.lang.String r5 = "action_type"
            r6 = 2
            r4.put(r5, r6)     // Catch: java.lang.Exception -> L76
            java.lang.String r5 = "filelist"
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch: java.lang.Exception -> L76
            r6.<init>()     // Catch: java.lang.Exception -> L76
            org.json.JSONArray r6 = r6.put(r1)     // Catch: java.lang.Exception -> L76
            r4.put(r5, r6)     // Catch: java.lang.Exception -> L76
            java.lang.String r5 = "exclude_fids"
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch: java.lang.Exception -> L76
            r6.<init>()     // Catch: java.lang.Exception -> L76
            r4.put(r5, r6)     // Catch: java.lang.Exception -> L76
            java.lang.String r5 = "1/clouddrive/file/delete?pr=UCBrowser&fr=pc"
            PanHttpClient.HttpResponse r4 = r7.H(r5, r4)     // Catch: java.lang.Exception -> L76
            java.lang.String r4 = r4.a()     // Catch: java.lang.Exception -> L76
            java.lang.String r5 = "文件已经删除"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Exception -> L76
            if (r5 == 0) goto L66
            goto L77
        L66:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> L76
            r5.<init>(r4)     // Catch: java.lang.Exception -> L76
            java.lang.String r4 = "status"
            int r4 = r5.getInt(r4)     // Catch: java.lang.Exception -> L76
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 != r5) goto L76
            r2 = 1
        L76:
            r3 = r2
        L77:
            if (r3 == 0) goto Le
            java.util.List<java.lang.String> r2 = r7.f
            r2.remove(r1)
            goto Le
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: UcDriveApi.h(UcDriveApi):void");
    }

    public static void i(EditText editText) {
        UcDriveApi v0Var = u0.a;
        String string = editText.getText().toString();
        v0Var.p();
        Init.execute(new RunnableC0749d(v0Var, string, 1));
    }

    public static void j(UcDriveApi v0Var) {
        v0Var.O();
    }

    public static void k(final UcDriveApi v0Var, final boolean z, final String str, String str2) {
        Runnable runnable;
        v0Var.getClass();
        try {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setClassName("com.UCMobile", "com.UCMobile.main.UCMobile");
                intent.setData(Uri.parse(str2));
                Init.getActivity().startActivity(intent);
                runnable = new Runnable() {
                    @Override // java.lang.Runnable
                    public final void run() {
                        UcDriveApi.d(this.b, z, str);
                    }
                };
            } catch (Exception unused) {
                v0Var.N(str2);
                runnable = new Runnable() {
                    @Override // java.lang.Runnable
                    public final void run() {
                        UcDriveApi.d(this.b, z, str);
                    }
                };
            }
            Init.execute(runnable);
        } catch (Throwable th) {
            Init.execute(new Runnable() {
                @Override // java.lang.Runnable
                public final void run() {
                    UcDriveApi.d(this.b, z, str);
                }
            });
            throw th;
        }
    }

    public static void l(UcDriveApi v0Var, EditText editText) {
        v0Var.getClass();
        String string = editText.getText().toString();
        v0Var.p();
        Init.execute(new D(v0Var, string, 3));
    }

    public static void m(UcDriveApi v0Var, EditText editText) {
        v0Var.getClass();
        String string = editText.getText().toString();
        v0Var.p();
        Init.execute(new RunnableC0747c(v0Var, string, 4));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    private String n(String str, String str2, boolean z) throws Exception {
        String str3 = str;
        if (PanTextUtils.isEmpty(str)) {
            throw new Exception();
        }
        SpiderDebug.log("Copy ... fileId:" + str);
        String[] strArrSplit = str.split("_");
        String str4 = (String) o.get(strArrSplit[0]);
        if (!PanTextUtils.isEmpty(str4)) {
            strArrSplit[1] = str4;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fid_list", new JSONArray().put(strArrSplit[0]));
        jSONObject.put("fid_token_list", new JSONArray().put(strArrSplit[1]));
        jSONObject.put("pwd_id", str2);
        jSONObject.put("stoken", this.h);
        jSONObject.put("pdir_fid", "0");
        String strA = H("1/clouddrive/share/sharepage/save?pr=UCBrowser&fr=pc", jSONObject).a();
        if (new JSONObject(strA).getInt("status") != 403) {
            return new JSONObject(strA).getJSONObject("data").getString("task_id");
        }
        if (z) {
            throw new Exception();
        }
        String str5 = "";
        try {
            if (!PanTextUtils.isEmpty(str)) {
                if (str.contains("_")) {
                    str3 = str.split("_")[0];
                }
                JSONObject jSONObject2 = new JSONObject(s("1/clouddrive/share/sharepage/detail?pr=UCBrowser&fr=pc&pwd_id=" + this.k + "&stoken=" + URLEncoder.encode(this.h) + "&pdir_fid=0&force=0&_page=1&_size=50&_fetch_banner=1&_fetch_share=1&_fetch_total=1&_sort=file_type:asc,updated_at:desc")).getJSONObject("data");
                ArrayList<QuarkFile> arrayList = new ArrayList();
                C(null, true, new QuarkFile(x("", jSONObject2)), arrayList, new ArrayList<>(), null);
                String strA2 = "";
                for (QuarkFile aVar : arrayList) {
                    o.put(aVar.d(), aVar.h());
                    if (aVar.d().equals(str3)) {
                        strA2 = aVar.a();
                    }
                }
                str5 = strA2;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return n(str5, str2, true);
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    private String o(String str, String str2) throws Exception {
        String string;
        try {
            if ((System.currentTimeMillis() / 1000) - this.m.getCacheTime() < 1800) {
                SpiderDebug.log("Obtain drive id... return cached drive");
                if (PanTextUtils.isEmpty(this.l)) {
                    this.l = this.m.getDriveId();
                }
            } else {
                SpiderDebug.log("Obtain drive id...");
                String string2 = new JSONObject(s("1/clouddrive/share/sharepage/dir?pr=UCBrowser&fr=pc&aver=1")).getJSONObject("data").getString("pdir_fid");
                this.l = string2;
                this.m.setDriveId(string2);
                this.m.setCacheTime(System.currentTimeMillis() / 1000);
                this.m.save();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String strN = n(str, str2, false);
        int i = 0;
        while (true) {
            if (i >= 3) {
                string = "";
                break;
            }
            int i2 = i + 1;
            try {
                Thread.sleep(i2 * 500);
            } catch (Exception unused) {
            }
            JSONObject jSONObject = new JSONObject(s("1/clouddrive/task?pr=UCBrowser&fr=pc&task_id=" + strN + "&retry_index=" + i));
            if (jSONObject.getInt("status") == 200) {
                if (jSONObject.getJSONObject("data").getInt("status") == 2) {
                    string = jSONObject.getJSONObject("data").getJSONObject("save_as").getJSONArray("save_as_top_fids").getString(0);
                    break;
                }
                i = i2;
            }
        }
        this.f.add(0, string);
        return string;
    }

    public void p() {
        try {
            AlertDialog alertDialog = this.g;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    private String q(String str, List<QuarkFile> list) {
        ArrayList<QuarkFile> arrayList = new ArrayList();
        String lowerCase = PanStringUtils.cleanFilename(str).toLowerCase();
        for (QuarkFile aVar : list) {
            String lowerCase2 = PanStringUtils.cleanFilename(aVar.f()).toLowerCase();
            if (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase)) {
                arrayList.add(aVar);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(list);
        }
        StringBuilder sb = new StringBuilder();
        for (QuarkFile aVar2 : arrayList) {
            o.put(aVar2.d(), aVar2.h());
            sb.append("+");
            sb.append(PanStringUtils.cleanFilename(aVar2.f()));
            sb.append("@@@");
            sb.append(aVar2.c());
            sb.append("@@@");
            sb.append(aVar2.a());
        }
        return sb.toString();
    }

    public static UcDriveApi r() {
        return Holder.INSTANCE;
    }

    private String s(String str) throws InterruptedException {
        if (!str.startsWith("https")) {
            str = UrlUtils.resolveUrl("https://drive-pc.quark.cn/", str);
        }
        HashMap map = new HashMap();
        HashMap<String, String> mapV = v(str);
        String strM = null;
        int i = 2;
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                break;
            }
            strM = PanHttpClient.get(str, mapV, map);
            SpiderDebug.log("quark get result:" + strM);
            if (strM.length() > 10) {
                break;
            }
            Thread.sleep(500L);
            i = i2;
        }
        E(map);
        SpiderDebug.log("quark get url:" + str + " headers:" + mapV + " newcookie: result:" + strM);
        return strM;
    }

    private StringBuilder t(Map<String, List<String>> map) {
        List<String> list = map.get("Set-Cookie");
        if (list == null || list.size() == 0) {
            list = map.get("set-cookie");
        }
        StringBuilder sb = new StringBuilder();
        if (list.size() > 0) {
            for (String str : list) {
                if (!str.contains("ctoken")) {
                    sb.append(str.split(";")[0]);
                    sb.append("; ");
                }
            }
        }
        return sb;
    }

    private String x(String str, JSONObject jSONObject) {
        try {
            if (!PanTextUtils.isEmpty(str)) {
                return str;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("list");
            if (jSONArray.length() == 0) {
                return "";
            }
            JSONObject jSONObject2 = jSONArray.getJSONObject(0);
            return jSONObject2.getBoolean("dir") ? jSONObject2.getString("fid") : (jSONObject2.getBoolean("file") && jSONObject2.getString("obj_category").equals("video")) ? "0" : "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final com.github.catvod.bean.VodItem A(String str, String str2, String str3, String str4) {
        String str5;
        ArrayList arrayList = new ArrayList();
        arrayList.add("UC原畫");
        if (NetPan.containPuHua()) {
            arrayList.add("UC普畫");
        }
        int i = 3;
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                break;
            }
            try {
                if (!PanTextUtils.isEmpty(this.m.getCookie())) {
                    if (!PanTextUtils.isEmpty(this.h)) {
                        break;
                    }
                } else {
                    Thread.sleep(1000L);
                }
                i = i2;
            } catch (Exception unused) {
                str5 = "UC雲盤";
                return BaseApi.fakeVod(arrayList, str5);
            }
        }
        I(str2, "");
        JSONObject jSONObject = new JSONObject(s("1/clouddrive/share/sharepage/detail?pr=UCBrowser&fr=pc&pwd_id=" + str2 + "&stoken=" + URLEncoder.encode(this.h) + "&pdir_fid=" + (PanTextUtils.isEmpty(str3) ? "0" : str3) + "&force=0&_page=1&_size=50&_fetch_banner=1&_fetch_share=1&_fetch_total=1&_sort=file_type:asc,updated_at:desc")).getJSONObject("data");
        String strY = (str4 == null || str4.isEmpty()) ? PanStringUtils.cleanFilename(jSONObject.getJSONObject("share").getString("title")) : str4;
        ArrayList<QuarkFile> arrayList2 = new ArrayList();
        List<QuarkFile> arrayList3 = new ArrayList<>();
        try {
            C(null, true, new QuarkFile(x(str3, jSONObject)), arrayList2, arrayList3, null);
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            for (QuarkFile aVar : arrayList2) {
                o.put(aVar.d(), aVar.h());
                arrayList4.add(aVar.b() + "$" + str2 + '+' + aVar.a() + '+' + strY + '+' + aVar.f() + q(aVar.f(), arrayList3));
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayList4.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb.append((CharSequence) it.next());
                        if (it.hasNext()) {
                            sb.append((CharSequence) "#");
                        }
                    }
                }
                arrayList5.add(sb.toString());
            }
            com.github.catvod.bean.VodItem iVar = new com.github.catvod.bean.VodItem();
            iVar.l(str);
            iVar.j(str);
            iVar.n(this.i);
            iVar.m(jSONObject.getJSONObject("share").getString("title"));
            StringBuilder sb2 = new StringBuilder();
            Iterator it2 = arrayList5.iterator();
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
            str5 = "UC雲盤";
            try {
                iVar.g(str5);
                return iVar;
            } catch (Exception unused2) {
                return BaseApi.fakeVod(arrayList, str5);
            }
        } catch (Exception unused3) {
            str5 = "UC雲盤";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ca A[LOOP:1: B:23:0x00c2->B:25:0x00ca, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010d A[LOOP:2: B:27:0x0107->B:29:0x010d, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.github.catvod.bean.VodItem> B(com.github.catvod.bean.JsonUtils r15) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: UcDriveApi.B(JsonUtils):List");
    }

    public final String E(Map<String, List<String>> map) {
        List<String> list = map.get("Set-Cookie");
        if (list == null || list.isEmpty()) {
            list = map.get("set-cookie");
        }
        String strSubstring = "";
        if (list == null || list.isEmpty()) {
            return "";
        }
        String[] strArrSplit = list.get(0).split(";");
        int length = strArrSplit.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            String str = strArrSplit[i];
            if (str.startsWith("__puus=")) {
                strSubstring = str.substring(str.indexOf("__puus=") + 7);
                break;
            }
            i++;
        }
        String strC = this.m.getCookie();
        if ((strSubstring == null || strSubstring.isEmpty())) {
            return strC;
        }
        String[] strArrSplit2 = this.m.getCookie().split("; ");
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrSplit2) {
            if (str2.startsWith("__puus=")) {
                sb.append("__puus=");
                sb.append(strSubstring);
            } else {
                sb.append(str2);
            }
            sb.append("; ");
        }
        String string = new StringBuilder(sb.substring(0, sb.length() - 2)).toString();
        this.m.setCookie(string);
        this.m.save();
        return string;
    }

    public final String F(String[] strArr) {
        if (strArr[0].startsWith("http")) {
            PlayResult gVar = new PlayResult();
            gVar.setUrl("");
            return gVar.toString();
        }
        PlayResult gVar2 = new PlayResult();
        UcDriveApi v0Var = u0.a;
        String str = strArr[0];
        String str2 = strArr[1];
        v0Var.getClass();
        gVar2.setUrl(Proxy.getUrl() + "?do=quark&type=dwnz&file_id=" + str2 + "&share_id=" + str);
        gVar2.setOctetStream();
        gVar2.setSubtitles(z(strArr));
        gVar2.setHeaders(v(null));
        return gVar2.toString();
    }

    public final String G(String[] strArr, String str) {
        String isoDownloadUrl;
        try {
            if (strArr[0].startsWith("http")) {
                PlayResult gVar = new PlayResult();
                gVar.setUrl("");
                return gVar.toString();
            }
            String strU = u(strArr[1], strArr[0], str.contains("原畫"));
            SpiderDebug.log("uc getRealDownUrl MD5:" + PanStringUtils.md5(strU));
            BaseApi.get().h.put(PanStringUtils.md5(strU), new Gson().toJson(v(strU)));
            if (str.contains("原畫")) {
                strU = Server.z(strU, this.m.b().intValue(), UcQuality.a(this.m.getMemberType()).intValue());
            }
            if (BaseApi.get().d.booleanValue()) {
                String str2 = strArr[2] + strArr[3];
                BaseApi.get().downloadFileWithDownloadManager(strU, str2, v(null));
                SpiderDebug.log("正在下载 " + str2);
                isoDownloadUrl = Server.B();
            } else {
                isoDownloadUrl = NetPan.getIsoDownloadUrl(strU);
            }
            PlayResult gVar2 = new PlayResult();
            gVar2.setUrl(isoDownloadUrl);
            gVar2.setExtra(AliDriveHelper.getDanmakuUrl(strArr));
            gVar2.setOctetStream();
            gVar2.setSubtitles(z(strArr));
            gVar2.setHeaders(v(null));
            return gVar2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e.getMessage());
            PlayResult gVar3 = new PlayResult();
            gVar3.setUrl("");
            return gVar3.toString();
        }
    }

    public final void J(String str, boolean z) {
        if (PanTextUtils.isEmpty(this.m.getCookie()) || z) {
            SpiderDebug.log("set new Cookie:" + str);
            if (str != null && str.startsWith("http")) {
                str = PanHttpClient.get(str).trim();
            }
            this.m.setCookie(str);
            w();
            this.m.save();
            n = new HashMap(512);
            o = new HashMap(4096);
        }
    }

    public final void L(String str, boolean z) {
        if (PanTextUtils.isEmpty(this.m.getToken()) || z) {
            SpiderDebug.log("set new Token:" + str);
            if (str != null && str.startsWith("http")) {
                str = PanHttpClient.get(str).trim();
            }
            this.m.setToken(str);
            this.m.save();
            n = new HashMap(512);
            o = new HashMap(4096);
        }
    }

    public final void M(String str) {
        if (PanTextUtils.isEmpty(this.m.getUt())) {
            SpiderDebug.log("setUt:" + str);
            if (str != null && str.startsWith("http")) {
                str = PanHttpClient.get(str).trim();
            }
            this.m.setUt(str);
            this.m.save();
            n = new HashMap(512);
            o = new HashMap(4096);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final String u(String str, String str2, boolean z) {
        Runnable runnableC0770n0;
        String string;
        int i = 0;
        try {
            try {
                this.d.lock();
                SpiderDebug.log("getDownloadUrl... fileId:" + str + " shareId:" + str2);
                String str3 = str.split("_")[0];
                Map<String, String> r5 = n;
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(z ? "#DL" : "#VI");
                String str4 = (String) r5.get(sb.toString());
                if (str4 != null && !str4.isEmpty()) {
                    this.d.unlock();
                    Init.execute(new RunnableC0768m0(this, i));
                    return str4;
                }
                if (!"selfuc".equals(str2)) {
                    I(str2, "");
                    str = o(str, str2);
                }
                if (this.m.getToken() != null && !this.m.getToken().isEmpty()) {
                    string = PanHttpClient.get(AliDriveHelper.getProxyBaseUrl() + "/api/uclink?fid=" + str + "&refreshToken=" + this.m.getToken());
                    K();
                } else {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("fids", new JSONArray().put(str));
                    String utValue = (this.m.getUt() != null && !this.m.getUt().isEmpty()) ? this.m.getUt() : "Nk2oZFe20xVMub17UQTOKJdg4CHccNwuJJuwVL1gaHZIlw==";
                    String strA = H("1/clouddrive/file/download?pr=UCBrowser&fr=pc&sys=win32&ve=1.8.5&ut=" + utValue, jSONObject).a();
                    SpiderDebug.log("getDownloadUrl:" + str4);
                    string = new JSONObject(strA).getJSONArray("data").getJSONObject(0).getString("download_url");
                }
                SpiderDebug.log("downloadUrl:" + string.contains("Expires="));
                SpiderDebug.log("downloadUrl:" + string);
                if (string.contains("Expires=")) {
                    SpiderDebug.log("getDownloadUrl timeshift:0");
                }
                n.put(str3 + "#DL", string);
                String strY = y(str);
                n.put(str3 + "#VI", strY);
                if (!z) {
                    string = strY;
                }
                this.d.unlock();
                Init.execute(new B(this, 3));
                return string;
            } catch (Exception unused) {
                HashMap map = new HashMap();
                map.put("Cookie", this.m.getCookie());
                String strM = PanHttpClient.get("https://drive-pc.quark.cn/1/clouddrive/file/sort?pr=UCBrowser&fr=pc&uc_param_str=&pdir_fid=0&_page=1&_size=50&_fetch_total=1&_fetch_sub_dirs=0&_sort=file_type:asc,updated_at:desc", map, null);
                SpiderDebug.log("playerContent> " + strM);
                if (new JSONObject(strM).getInt("status") == 401) {
                    SpiderDebug.log("到配置中心配置UC cookie");
                    this.d.unlock();
                    runnableC0770n0 = new L(this, 2);
                } else {
                    this.d.unlock();
                    runnableC0770n0 = new RunnableC0770n0(this, i);
                }
                Init.execute(runnableC0770n0);
                return "";
            }
        } catch (Throwable th) {
            this.d.unlock();
            Init.execute(new RunnableC0772o0(this, i));
            throw th;
        }
        this.d.unlock();
        Init.execute(new RunnableC0772o0(this, i));
        throw th;
    }

    public final HashMap<String, String> v(String str) {
        HashMap<String, String> mapC = MapHelper.of("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) uc-cloud-drive/1.8.5 Chrome/100.0.4896.160 Electron/18.3.5.16-b62cf9c50d Safari/537.36 Channel/ucpan_other_ch");
        mapC.put("Cookie", this.m.getCookie());
        mapC.put("Url", str);
        return mapC;
    }

    public final void w() {
        try {
            HashMap map = new HashMap();
            HashMap<String, String> mapV = v("https://pc-api.uc.cn/1/clouddrive/member?pr=UCBrowser&fr=pc&fetch_subscribe=true&_ch=home");
            String str = "__pus=" + PanStringUtils.extractPusFromCookie(mapV.get("Cookie"));
            mapV.put("Cookie", str);
            this.m.setMemberType(new JSONObject(PanHttpClient.get("https://pc-api.uc.cn/1/clouddrive/member?pr=UCBrowser&fr=pc&fetch_subscribe=true&_ch=home", mapV, map)).getJSONObject("data").getString("member_type"));
            this.m.setCookie(PanStringUtils.mergeCookies(map, str));
        } catch (Exception unused) {
            UcUser bVar = this.m;
            UcQuality aVar = UcQuality.NORMAL;
            bVar.n("NORMAL");
        }
    }

    public final String y(String str) {
        JSONObject jSONObject;
        try {
            if (this.m.getToken() != null && !this.m.getToken().isEmpty()) {
                String strL = PanHttpClient.get(AliDriveHelper.getProxyBaseUrl() + "/api/ucPre?fid=" + str + "&refreshToken=" + this.m.getToken());
                K();
                StringBuilder sb = new StringBuilder();
                sb.append("getPreviewVideoInfo:");
                sb.append(strL);
                SpiderDebug.log(sb.toString());
                JSONArray jSONArray = new JSONObject(strL).getJSONObject("data").getJSONArray("video_info");
                try {
                    return jSONArray.getJSONObject(0).getString("url");
                } catch (Exception unused) {
                    jSONObject = jSONArray.getJSONObject(jSONArray.length() - 1);
                }
            } else {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("fid", str);
                jSONObject2.put("resolutions", "normal,low,high,super,2k,4k");
                jSONObject2.put("supports", "fmp4,m3u8");
                String strA = H("1/clouddrive/file/v2/play?pr=UCBrowser&fr=pc", jSONObject2).a();
                SpiderDebug.log("getPreviewVideoInfo:" + strA);
                JSONArray jSONArray2 = new JSONObject(strA).getJSONObject("data").getJSONArray("video_list");
                try {
                    return jSONArray2.getJSONObject(0).getJSONObject("video_info").getString("url");
                } catch (Exception unused2) {
                    jSONObject = jSONArray2.getJSONObject(jSONArray2.length() - 1).getJSONObject("video_info");
                }
            }
            return jSONObject.getString("url");
        } catch (Exception unused3) {
            return "";
        }
    }

    public final List<com.github.catvod.bean.h> z(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str.contains("@@@")) {
                String[] strArrSplit = str.split("@@@");
                String str2 = strArrSplit[0];
                String str3 = strArrSplit[1];
                String str4 = Proxy.getUrl() + "?do=quark&type=sub&share_id=" + strArr[0] + "&file_id=" + strArrSplit[2];
                com.github.catvod.bean.h hVar = new com.github.catvod.bean.h();
                hVar.b(str2);
                com.github.catvod.bean.h hVarA = hVar.a(str3);
                hVarA.c(str4);
                arrayList.add(hVarA);
            }
        }
        return arrayList;
    }
}
