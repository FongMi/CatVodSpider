package com.github.catvod.utils.merge;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.utils.merge.MergeUtils;
import com.github.catvod.utils.merge.QrCodeUtils;
import com.github.catvod.utils.merge.C1290c;
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

/* JADX INFO: renamed from: com.github.catvod.spider.merge.I.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class QuarkDriveApi {
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
    public com.github.catvod.spider.merge.S.e m;

    QuarkDriveApi() {
        try {
            this.m = com.github.catvod.spider.merge.S.e.h(com.github.catvod.spider.merge.g.b.d(com.github.catvod.spider.merge.g.b.f("quark_user")));
        } catch (Exception unused) {
            SpiderDebug.log("夸克授权初始化失败，请删除根目录TV文件夹下授权文件后重试");
        }
        t();
        SpiderDebug.log("quark QuarkPanApi constructor user:" + this.m);
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
        map2.put("4kz", "夸克原畫");
        map2.put("4k", "4K");
        map2.put("2k", "2K");
        map2.put("super", "高清");
        map2.put("high", "標清");
        map2.put("low", "流暢");
        map2.put("normal", "普通");
        map2.put("auto", "夸克普畫");
        n = new HashMap(512);
        o = new HashMap(4096);
    }

    private void A(HashMap<String, String> map, boolean z, com.github.catvod.spider.merge.S.a aVar, List<com.github.catvod.spider.merge.S.a> list, List<com.github.catvod.spider.merge.S.a> list2, List<com.github.catvod.spider.merge.S.a> list3) {
        B(map, z, aVar, list, list2, list3, 1);
    }

    private void B(HashMap<String, String> map, boolean z, com.github.catvod.spider.merge.S.a aVar, List<com.github.catvod.spider.merge.S.a> list, List<com.github.catvod.spider.merge.S.a> list2, List<com.github.catvod.spider.merge.S.a> list3, int i) {
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
        sb.append("1/clouddrive/share/sharepage/detail?pr=ucpro&fr=pc&pwd_id=");
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
        String strP = p(sb.toString());
        SpiderDebug.log("listFiles >> " + strP);
        JSONObject jSONObject = new JSONObject(strP);
        com.github.catvod.spider.merge.S.a aVarL = com.github.catvod.spider.merge.S.a.l(jSONObject.getJSONObject("data").toString());
        try {
            if (aVarL.e().size() >= 1) {
                com.github.catvod.spider.merge.S.d.a(aVarL.e());
            }
        } catch (Exception e2) {
            SpiderDebug.log("listFiles error" + e2.getMessage());
        }
        for (com.github.catvod.spider.merge.S.a aVar2 : aVarL.e()) {
            if ("folder".equals(aVar2.k())) {
                list3.add(aVar2);
            } else if (BaseApi.get().d.booleanValue() || (com.github.catvod.spider.merge.i0.GeneralUtils.m(aVar2.f()) != null && !com.github.catvod.spider.merge.i0.GeneralUtils.m(aVar2.f()).isEmpty())) {
                aVar2.m(aVar.f());
                list.add(aVar2);
            } else if (com.github.catvod.spider.merge.i0.m.r(aVar2.c())) {
                list2.add(aVar2);
            }
        }
        com.github.catvod.spider.merge.S.c cVar = (com.github.catvod.spider.merge.S.c) new Gson().fromJson(jSONObject.getJSONObject("metadata").toString(), com.github.catvod.spider.merge.S.c.class);
        if (((cVar.b() - 1) * cVar.c()) + cVar.a() < cVar.d()) {
            B(map, z, aVar, list, list2, list3, cVar.b() + 1);
        }
        if (z) {
            Iterator<com.github.catvod.spider.merge.S.a> it = list3.iterator();
            while (it.hasNext()) {
                A(map, z, it.next(), list, list2, null);
            }
        }
    }

    private com.github.catvod.spider.merge.f0.i F(String str, JSONObject jSONObject) throws InterruptedException {
        if (!str.startsWith("https")) {
            str = UrlUtils.resolveUrl("https://drive-pc.quark.cn/", str);
        }
        HashMap map = new HashMap();
        HashMap<String, String> mapS = s(str);
        com.github.catvod.spider.merge.f0.i iVar = new com.github.catvod.spider.merge.f0.i();
        int i = 2;
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                break;
            }
            iVar = com.github.catvod.spider.merge.f0.d.k(str, jSONObject.toString(), mapS, map);
            if (iVar.a().length() > 10) {
                break;
            }
            Thread.sleep(500L);
            i = i2;
        }
        SpiderDebug.log("quark post url:" + str + " headers:" + mapS + " postBody:" + jSONObject.toString() + " newcookie:" + C(map) + " result:," + iVar.a());
        return iVar;
    }

    private boolean G(String str, String str2) throws JSONException {
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
                    if (i <= 0 || !com.github.catvod.spider.merge.P0.e.c(this.m.d())) {
                        break;
                    }
                    Thread.sleep(1000L);
                    i = i2;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pwd_id", str);
                jSONObject.put("passcode", str2);
                com.github.catvod.spider.merge.f0.i iVarF = F("1/clouddrive/share/sharepage/token?pr=ucpro&fr=pc", jSONObject);
                JSONObject jSONObject2 = new JSONObject(iVarF.a());
                System.out.println("resultJson" + jSONObject2);
                if (jSONObject2.getInt("status") == 401) {
                    SpiderDebug.log("cookie is invalid:" + this.m.d());
                    SpiderDebug.log("cookie is invalid:" + this.m.d());
                    this.m.j("");
                    this.m.i();
                    this.h = "";
                    return false;
                }
                String strA = iVarF.a();
                this.h = new JSONObject(strA).getJSONObject("data").getString("stoken");
                this.i = new JSONObject(strA).getJSONObject("data").getJSONObject("author").getString("avatar_url");
                SpiderDebug.log("sToken: " + this.h);
                this.k = str;
                this.j = System.currentTimeMillis() + 3600000;
            } else {
                SpiderDebug.log("use cached SToken..." + this.h);
            }
            return true;
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        } finally {
            this.e.unlock();
        }
    }

    private void I(String str) {
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(com.github.catvod.spider.merge.i0.GeneralUtils.f(240), com.github.catvod.spider.merge.i0.GeneralUtils.f(240));
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(QrCodeUtils.generateQrCode(str, 240, 2));
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.gravity = 17;
            frameLayout.addView(imageView, layoutParams);
            AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getActivity()).setView(frameLayout).setOnCancelListener(new DialogInterfaceOnCancelListenerC0784z(this, 1)).setOnDismissListener(new A(this, 1)).show();
            this.g = alertDialogShow;
            alertDialogShow.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            SpiderDebug.log("請使用夸克 App 掃描二維碼");
        } catch (Exception unused) {
        }
    }

    private void J() {
        ScheduledExecutorService scheduledExecutorService = this.c;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        Init.run(new RunnableC0744a0(this, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x000e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(QuarkDriveApi r7) {
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
            java.lang.String r5 = "1/clouddrive/file/delete?pr=ucpro&fr=pc"
            com.github.catvod.spider.merge.f0.i r4 = r7.F(r5, r4)     // Catch: java.lang.Exception -> L76
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
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.I.C0754f0.a(com.github.catvod.spider.merge.I.f0):void");
    }

    public static void b(QuarkDriveApi c0754f0) {
        c0754f0.m();
        Init.execute(new X(c0754f0, 1));
    }

    public static void c(EditText editText) {
        QuarkDriveApi c0754f0 = C0752e0.a;
        String string = editText.getText().toString();
        c0754f0.m();
        Init.execute(new Y(c0754f0, string, 1));
    }

    public static void d(QuarkDriveApi c0754f0, String str, String str2) {
        Runnable runnableC0747c;
        c0754f0.getClass();
        try {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setClassName("com.quark.browser", "com.ucpro.MainActivity");
                intent.setData(Uri.parse(str2));
                Init.getActivity().startActivity(intent);
                runnableC0747c = new C(c0754f0, str, 1);
            } catch (Exception unused) {
                c0754f0.I(str2);
                runnableC0747c = new RunnableC0747c(c0754f0, str, 3);
            }
            Init.execute(runnableC0747c);
        } catch (Throwable th) {
            Init.execute(new D(c0754f0, str, 2));
            throw th;
        }
    }

    public static void e(QuarkDriveApi c0754f0, EditText editText) {
        c0754f0.getClass();
        String string = editText.getText().toString();
        c0754f0.m();
        Init.execute(new U(c0754f0, string, 0));
    }

    public static void f(QuarkDriveApi c0754f0) {
        c0754f0.J();
    }

    public static /* synthetic */ void g(QuarkDriveApi c0754f0, String str) {
        c0754f0.getClass();
        try {
            String strL = com.github.catvod.spider.merge.f0.d.l("https://uop.quark.cn/cas/ajax/getServiceTicketByQrcodeToken?client_id=532&v=1.2&token=" + str);
            if ("2000000".equals(new JSONObject(strL).getString("status"))) {
                String string = new JSONObject(strL).getJSONObject("data").getJSONObject("members").getString("service_ticket");
                SpiderDebug.log("serviceTicket>>" + string);
                HashMap map = new HashMap();
                String strM = com.github.catvod.spider.merge.f0.d.m("https://pan.quark.cn/account/info?st=" + string + "&lw=scan", null, map);
                StringBuilder sb = new StringBuilder();
                sb.append("respHeader");
                sb.append(map);
                SpiderDebug.log(sb.toString());
                if (new JSONObject(strM).getBoolean("success")) {
                    String string2 = c0754f0.q(map).toString();
                    HashMap map2 = new HashMap();
                    HashMap map3 = new HashMap();
                    map3.put("Cookie", string2);
                    com.github.catvod.spider.merge.f0.d.m("https://drive-pc.quark.cn/1/clouddrive/file/sort?pr=ucpro&fr=pc&uc_param_str=&pdir_fid=0&_page=1&_size=50&_fetch_total=1&_fetch_sub_dirs=0&_sort=file_type:asc,updated_at:desc", map3, map2);
                    SpiderDebug.log(map2.toString());
                    c0754f0.H(((Object) c0754f0.q(map2)) + string2, true);
                    SpiderDebug.log("请重新进入播放页。。。" + strL);
                    c0754f0.J();
                }
            }
        } catch (JSONException e) {
            c0754f0.J();
            throw new RuntimeException(e);
        }
    }

    public static void h(QuarkDriveApi c0754f0, String str) {
        c0754f0.getClass();
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        c0754f0.c = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(new Y(c0754f0, str, 0), 1L, 1L, TimeUnit.SECONDS);
    }

    public static void i(QuarkDriveApi c0754f0) {
        c0754f0.J();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    private String k(String str, String str2, boolean z) throws Exception {
        String str3 = str;
        if (com.github.catvod.spider.merge.P0.e.c(str)) {
            throw new Exception();
        }
        SpiderDebug.log("Copy ... fileId:" + str);
        String[] strArrSplit = str.split("_");
        String str4 = (String) o.get(strArrSplit[0]);
        if (!com.github.catvod.spider.merge.P0.e.c(str4)) {
            strArrSplit[1] = str4;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fid_list", new JSONArray().put(strArrSplit[0]));
        jSONObject.put("fid_token_list", new JSONArray().put(strArrSplit[1]));
        jSONObject.put("pwd_id", str2);
        jSONObject.put("stoken", this.h);
        jSONObject.put("pdir_fid", "0");
        String strA = F("1/clouddrive/share/sharepage/save?pr=ucpro&fr=pc", jSONObject).a();
        if (new JSONObject(strA).getInt("status") != 403) {
            return new JSONObject(strA).getJSONObject("data").getString("task_id");
        }
        if (z) {
            throw new Exception();
        }
        String str5 = "";
        try {
            if (!com.github.catvod.spider.merge.P0.e.c(str)) {
                if (str.contains("_")) {
                    str3 = str.split("_")[0];
                }
                JSONObject jSONObject2 = new JSONObject(p("1/clouddrive/share/sharepage/detail?pr=ucpro&fr=pc&pwd_id=" + this.k + "&stoken=" + URLEncoder.encode(this.h) + "&pdir_fid=0&force=0&_page=1&_size=50&_fetch_banner=1&_fetch_share=1&_fetch_total=1&_sort=file_type:asc,updated_at:desc")).getJSONObject("data");
                ArrayList<com.github.catvod.spider.merge.S.a> arrayList = new ArrayList();
                A(null, true, new com.github.catvod.spider.merge.S.a(u("", jSONObject2)), arrayList, new ArrayList<>(), null);
                String strA2 = "";
                for (com.github.catvod.spider.merge.S.a aVar : arrayList) {
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
        return k(str5, str2, true);
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    private String l(String str, String str2) throws Exception {
        String string;
        try {
            if ((System.currentTimeMillis() / 1000) - this.m.f() < 1800) {
                SpiderDebug.log("Obtain drive id... return cached drive");
                if (com.github.catvod.spider.merge.P0.e.c(this.l)) {
                    this.l = this.m.e();
                }
            } else {
                SpiderDebug.log("Obtain drive id...");
                String string2 = new JSONObject(p("1/clouddrive/share/sharepage/dir?pr=ucpro&fr=pc&aver=1")).getJSONObject("data").getString("pdir_fid");
                this.l = string2;
                this.m.k(string2);
                this.m.l(System.currentTimeMillis() / 1000);
                this.m.i();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String strK = k(str, str2, false);
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
            JSONObject jSONObject = new JSONObject(p("1/clouddrive/task?pr=ucpro&fr=pc&task_id=" + strK + "&retry_index=" + i));
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

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        try {
            AlertDialog alertDialog = this.g;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    private String n(String str, List<com.github.catvod.spider.merge.S.a> list) {
        ArrayList<com.github.catvod.spider.merge.S.a> arrayList = new ArrayList();
        String lowerCase = com.github.catvod.spider.merge.i0.GeneralUtils.y(str).toLowerCase();
        for (com.github.catvod.spider.merge.S.a aVar : list) {
            String lowerCase2 = com.github.catvod.spider.merge.i0.GeneralUtils.y(aVar.f()).toLowerCase();
            if (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase)) {
                arrayList.add(aVar);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(list);
        }
        StringBuilder sb = new StringBuilder();
        for (com.github.catvod.spider.merge.S.a aVar2 : arrayList) {
            o.put(aVar2.d(), aVar2.h());
            sb.append("+");
            sb.append(com.github.catvod.spider.merge.i0.GeneralUtils.y(aVar2.f()));
            sb.append("@@@");
            sb.append(aVar2.c());
            sb.append("@@@");
            sb.append(aVar2.a());
        }
        return sb.toString();
    }

    public static QuarkDriveApi o() {
        return C0752e0.a;
    }

    private String p(String str) throws InterruptedException {
        if (!str.startsWith("https")) {
            str = UrlUtils.resolveUrl("https://drive-pc.quark.cn/", str);
        }
        HashMap map = new HashMap();
        HashMap<String, String> mapS = s(str);
        String strM = null;
        int i = 2;
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                break;
            }
            strM = com.github.catvod.spider.merge.f0.d.m(str, mapS, map);
            SpiderDebug.log("quark get result:" + strM);
            if (strM.length() > 10) {
                break;
            }
            Thread.sleep(500L);
            i = i2;
        }
        SpiderDebug.log("quark get url:" + str + " headers:" + mapS + " newcookie:" + C(map) + " result:" + strM);
        return strM;
    }

    private StringBuilder q(Map<String, List<String>> map) {
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

    private String u(String str, JSONObject jSONObject) {
        try {
            if (!com.github.catvod.spider.merge.P0.e.c(str)) {
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

    private String v(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("resolutions", "normal,low,high,super,2k,4k");
            jSONObject.put("supports", "fmp4,m3u8");
            String strA = F("1/clouddrive/file/v2/play?pr=ucpro&fr=pc", jSONObject).a();
            SpiderDebug.log("getPreviewVideoInfo:" + strA);
            JSONArray jSONArray = new JSONObject(strA).getJSONObject("data").getJSONArray("video_list");
            try {
                return jSONArray.getJSONObject(0).getJSONObject("video_info").getString("url");
            } catch (Exception unused) {
                return jSONArray.getJSONObject(jSONArray.length() - 1).getJSONObject("video_info").getString("url");
            }
        } catch (Exception unused2) {
            return "";
        }
    }

    private String w(String str, String str2) {
        StringBuilder sb = new StringBuilder("quark getRealDownUrl MD5:");
        sb.append(com.github.catvod.spider.merge.i0.m.c(str2));
        SpiderDebug.log(sb.toString());
        BaseApi.get().h.put(com.github.catvod.spider.merge.i0.m.c(str2), new Gson().toJson(s(str2)));
        return str.contains("原畫") ? Server.z(str2, this.m.c().intValue(), com.github.catvod.spider.merge.S.b.a(this.m.g()).intValue()) : str2;
    }

    public final String C(Map<String, List<String>> map) {
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
        String strD = this.m.d();
        if ((strSubstring == null || strSubstring.isEmpty())) {
            return strD;
        }
        String[] strArrSplit2 = this.m.d().split("; ");
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
        this.m.j(string);
        this.m.i();
        return string;
    }

    public final String D(String[] strArr) {
        if (strArr[0].startsWith("http")) {
            com.github.catvod.bean.g gVar = new com.github.catvod.bean.g();
            gVar.w("");
            return gVar.toString();
        }
        com.github.catvod.bean.g gVar2 = new com.github.catvod.bean.g();
        QuarkDriveApi c0754f0 = C0752e0.a;
        String str = strArr[0];
        String str2 = strArr[1];
        c0754f0.getClass();
        gVar2.w(Proxy.getUrl() + "?do=quark&type=dwnz&file_id=" + str2 + "&share_id=" + str);
        gVar2.i();
        gVar2.v(x(strArr));
        gVar2.g(s(null));
        return gVar2.toString();
    }

    public final String E(String[] strArr, String str) {
        String isoDownloadUrl;
        try {
            if (strArr[0].startsWith("http")) {
                com.github.catvod.bean.g gVar = new com.github.catvod.bean.g();
                gVar.w("");
                return gVar.toString();
            }
            String strW = w(str, r(strArr[1], strArr[0], str.contains("原畫")));
            String str2 = strArr[2] + strArr[3];
            if (BaseApi.get().d.booleanValue()) {
                BaseApi.get().downloadFileWithDownloadManager(strW, str2, s(null));
                SpiderDebug.log("正在下载 " + str2);
                isoDownloadUrl = Server.B();
            } else {
                isoDownloadUrl = NetPan.getIsoDownloadUrl(strW);
            }
            com.github.catvod.bean.g gVar2 = new com.github.catvod.bean.g();
            gVar2.w(isoDownloadUrl);
            gVar2.a(C0773p.a.t(strArr));
            gVar2.i();
            gVar2.v(x(strArr));
            gVar2.g(s(null));
            return gVar2.toString();
        } catch (Exception e) {
            SpiderDebug.log("夸克 playerContent：" + e);
            com.github.catvod.bean.g gVar3 = new com.github.catvod.bean.g();
            gVar3.w("");
            return gVar3.toString();
        }
    }

    public final void H(String str, boolean z) {
        if (com.github.catvod.spider.merge.P0.e.c(this.m.d()) || z) {
            SpiderDebug.log("set new Cookie:" + str);
            if (str != null && str.startsWith("http")) {
                str = com.github.catvod.spider.merge.f0.d.l(str).trim();
            }
            this.m.j(str);
            t();
            this.m.i();
            n = new HashMap(512);
            o = new HashMap(4096);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x01c4  */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String r(java.lang.String r12, java.lang.String r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.I.C0754f0.r(java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    public final HashMap<String, String> s(String str) {
        HashMap<String, String> mapB = com.github.catvod.spider.merge.B.e.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) quark-cloud-drive/3.2.0 Chrome/100.0.4896.160 Electron/18.3.5.17-1a44cfa97d Safari/537.36 Channel/pckk_other_ch", "Referer", "https://drive.quark.cn/");
        mapB.put("Cookie", this.m.d());
        mapB.put("Url", str);
        return mapB;
    }

    public final void t() {
        try {
            HashMap map = new HashMap();
            HashMap<String, String> mapS = s("https://drive-pc.quark.cn/1/clouddrive/member?pr=ucpro&fr=pc&uc_param_str=&fetch_subscribe=true&_ch=home&fetch_identity=true");
            String str = "__pus=" + CookieUtils.extractPusFromCookie(mapS.get("Cookie"));
            mapS.put("Cookie", str);
            this.m.m(new JSONObject(com.github.catvod.spider.merge.f0.d.m("https://drive-pc.quark.cn/1/clouddrive/member?pr=ucpro&fr=pc&uc_param_str=&fetch_subscribe=true&_ch=home&fetch_identity=true", mapS, map)).getJSONObject("data").getString("member_type"));
            this.m.j(CookieUtils.mergeCookies(map, str));
        } catch (Exception unused) {
        }
    }

    public final List<com.github.catvod.bean.h> x(String[] strArr) {
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

    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final com.github.catvod.bean.VodItem y(String str, String str2, String str3, String str4) {
        String str5;
        ArrayList arrayList = new ArrayList();
        arrayList.add("夸克原畫");
        if (NetPan.containPuHua()) {
            arrayList.add("夸克普畫");
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i = 3;
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                break;
            }
            try {
                if (!com.github.catvod.spider.merge.P0.e.c(this.m.d())) {
                    if (!com.github.catvod.spider.merge.P0.e.c(this.h)) {
                        break;
                    }
                } else {
                    Thread.sleep(1000L);
                }
                i = i2;
            } catch (Exception unused) {
                str5 = "夸克雲盤";
                return BaseApi.fakeVod(arrayList, str5);
            }
        }
        G(str2, "");
        JSONObject jSONObject = new JSONObject(p("1/clouddrive/share/sharepage/detail?pr=ucpro&fr=pc&pwd_id=" + str2 + "&stoken=" + URLEncoder.encode(this.h) + "&pdir_fid=" + (com.github.catvod.spider.merge.P0.e.c(str3) ? "0" : str3) + "&force=0&_page=1&_size=50&_fetch_banner=1&_fetch_share=1&_fetch_total=1&_sort=file_type:asc,updated_at:desc")).getJSONObject("data");
        String strY = (str4 == null || str4.isEmpty()) ? com.github.catvod.spider.merge.i0.GeneralUtils.y(jSONObject.getJSONObject("share").getString("title")) : str4;
        ArrayList<com.github.catvod.spider.merge.S.a> arrayList4 = new ArrayList();
        List<com.github.catvod.spider.merge.S.a> arrayList5 = new ArrayList<>();
        com.github.catvod.spider.merge.S.a aVar = new com.github.catvod.spider.merge.S.a(u(str3, jSONObject));
        List<com.github.catvod.spider.merge.S.a> list = arrayList5;
        String str6 = strY;
        try {
            A(null, true, aVar, arrayList4, list, null);
            for (com.github.catvod.spider.merge.S.a aVar2 : arrayList4) {
                o.put(aVar2.d(), aVar2.h());
                StringBuilder sb = new StringBuilder();
                sb.append(aVar2.b());
                sb.append("$");
                sb.append(str2);
                sb.append('+');
                sb.append(aVar2.a());
                sb.append('+');
                String str7 = str6;
                sb.append(str7);
                sb.append('+');
                sb.append(aVar2.f());
                List<com.github.catvod.spider.merge.S.a> list2 = list;
                sb.append(n(aVar2.f(), list2));
                arrayList3.add(sb.toString());
                list = list2;
                str6 = str7;
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                StringBuilder sb2 = new StringBuilder();
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb2.append((CharSequence) it.next());
                        if (it.hasNext()) {
                            sb2.append((CharSequence) "#");
                        }
                    }
                }
                arrayList2.add(sb2.toString());
            }
            com.github.catvod.bean.VodItem iVar = new com.github.catvod.bean.VodItem();
            iVar.l(str);
            iVar.j(str);
            iVar.n(this.i);
            iVar.m(jSONObject.getJSONObject("share").getString("title"));
            StringBuilder sb3 = new StringBuilder();
            Iterator it2 = arrayList2.iterator();
            if (it2.hasNext()) {
                while (true) {
                    sb3.append((CharSequence) it2.next());
                    if (!it2.hasNext()) {
                        break;
                    }
                    sb3.append((CharSequence) "$$$");
                }
            }
            iVar.p(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            Iterator it3 = arrayList.iterator();
            if (it3.hasNext()) {
                while (true) {
                    sb4.append((CharSequence) it3.next());
                    if (!it3.hasNext()) {
                        break;
                    }
                    sb4.append((CharSequence) "$$$");
                }
            }
            iVar.o(sb4.toString());
            str5 = "夸克雲盤";
            try {
                iVar.g(str5);
                return iVar;
            } catch (Exception unused2) {
                return BaseApi.fakeVod(arrayList, str5);
            }
        } catch (Exception unused3) {
            str5 = "夸克雲盤";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ca A[LOOP:1: B:23:0x00c2->B:25:0x00ca, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010d A[LOOP:2: B:27:0x0107->B:29:0x010d, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.github.catvod.bean.VodItem> z(com.github.catvod.bean.JsonUtils r15) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.I.C0754f0.z(com.github.catvod.bean.j):java.util.List");
    }
}
