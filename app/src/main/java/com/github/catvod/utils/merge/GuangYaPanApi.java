package com.github.catvod.utils.merge;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.Init;
import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class GuangYaPanApi {
    private String a;
    private String b;
    private long c;
    private String d;
    private String e = UUID.randomUUID().toString().replace("-", "");
    public com.github.catvod.spider.merge.P.a f;
    private ScheduledExecutorService g;
    private AlertDialog h;

    GuangYaPanApi() {
        try {
            com.github.catvod.spider.merge.P.a aVar = (com.github.catvod.spider.merge.P.a) new Gson().fromJson(com.github.catvod.spider.merge.g.b.d(com.github.catvod.spider.merge.g.b.f("guangya_user")), com.github.catvod.spider.merge.P.a.class);
            this.f = aVar == null ? new com.github.catvod.spider.merge.P.a() : aVar;
        } catch (Exception unused) {
            this.f = new com.github.catvod.spider.merge.P.a();
        }
    }

    public static void a(GuangYaPanApi o) {
        o.k();
        Init.execute(new L(o, 0));
    }

    public static void b(GuangYaPanApi o) {
        ScheduledExecutorService scheduledExecutorService = o.g;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        Init.run(new B(o, 1));
    }

    public static void c(GuangYaPanApi o, String str) {
        o.getClass();
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        o.g = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(new D(o, str, 1), 1L, 2L, TimeUnit.SECONDS);
    }

    public static void d(final GuangYaPanApi o, String str) {
        o.getClass();
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(com.github.catvod.spider.merge.i0.GeneralUtils.f(240), com.github.catvod.spider.merge.i0.GeneralUtils.f(240));
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(QrCodeUtils.a(str, 240, 2));
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.gravity = 17;
            frameLayout.addView(imageView, layoutParams);
            AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getActivity()).setView(frameLayout).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.github.catvod.spider.merge.I.H
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    GuangYaPanApi.f(this.a);
                }
            }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.github.catvod.spider.merge.I.K
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    GuangYaPanApi.b(this.a);
                }
            }).show();
            o.h = alertDialogShow;
            alertDialogShow.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            SpiderDebug.log("請使用光鸭云盘 App 或浏览器掃描二維碼");
        } catch (Exception unused) {
        }
    }

    public static void e(GuangYaPanApi o) {
        o.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scope", "user");
            jSONObject.put("client_id", "aMe-8VSlkrbQXpUR");
            JSONObject jSONObject2 = new JSONObject(com.github.catvod.spider.merge.f0.d.j("https://account.guangyapan.com/v1/auth/device/code", jSONObject.toString(), o.p()).a());
            String string = jSONObject2.getString("verification_uri_complete");
            String string2 = jSONObject2.getString("device_code");
            Init.run(new RunnableC0755g(o, string, 2));
            Init.execute(new E(o, string2, 1));
        } catch (Exception e) {
            StringBuilder sbB = new StringBuilder("光鸭获取二维码失败: ");
            sbB.append(e.getMessage());
            SpiderDebug.log(sbB.toString());
            SpiderDebug.log("光鸭获取二维码失败");
        }
    }

    public static void f(GuangYaPanApi o) {
        ScheduledExecutorService scheduledExecutorService = o.g;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        Init.run(new B(o, 1));
    }

    public static void g(GuangYaPanApi o, EditText editText) {
        o.getClass();
        String string = editText.getText().toString();
        o.k();
        Init.execute(new RunnableC0751e(o, string, 2));
    }

    public static /* synthetic */ void i(GuangYaPanApi o, String str) {
        o.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("grant_type", "urn:ietf:params:oauth:grant-type:device_code");
            jSONObject.put("device_code", str);
            jSONObject.put("client_id", "aMe-8VSlkrbQXpUR");
            String strA = com.github.catvod.spider.merge.f0.d.j("https://account.guangyapan.com/v1/auth/token", jSONObject.toString(), o.p()).a();
            if (strA.contains("access_token") && strA.contains("refresh_token")) {
                JSONObject jSONObject2 = new JSONObject(strA);
                o.y(jSONObject2.getString("access_token"), jSONObject2.getString("refresh_token"));
            }
        } catch (Exception unused) {
        }
    }

    private com.github.catvod.bean.VodItem j(String str, String str2) {
        com.github.catvod.bean.VodItem iVar = new com.github.catvod.bean.VodItem();
        iVar.l(str);
        if (!(str2 != null && !str2.isEmpty())) {
            str2 = "光鸭云盘";
        }
        iVar.m(str2);
        iVar.j("无法获取文件列表");
        iVar.g("光鸭雲盤");
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        try {
            AlertDialog alertDialog = this.h;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    public static GuangYaPanApi l() {
        return N.a;
    }

    private String m(String str, String str2) {
        try {
            if (str.equals(this.a) && (this.b != null && !this.b.isEmpty()) && System.currentTimeMillis() < this.c) {
                return this.b;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("shareId", str);
            if ((str2 != null && !str2.isEmpty())) {
                jSONObject.put("code", str2);
            }
            String strV = v("https://api.guangyapan.com/nd.bizuserres.s/v1/get_share_access_token", jSONObject, true);
            if (!(strV != null && !strV.isEmpty())) {
                return "";
            }
            JSONObject jSONObject2 = new JSONObject(strV);
            if (!"success".equals(jSONObject2.optString("msg"))) {
                return "";
            }
            this.b = jSONObject2.getJSONObject("data").getString("accessToken");
            this.a = str;
            this.c = System.currentTimeMillis() + 3000000;
            return this.b;
        } catch (Exception e) {
            com.github.catvod.spider.merge.A.c.e(e, new StringBuilder("光鸭云盘 getAccessToken 异常: "));
            return "";
        }
    }

    private JSONArray o(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pageSize", 200);
            jSONObject.put("accessToken", str);
            jSONObject.put("parentId", str2);
            jSONObject.put("orderBy", 0);
            jSONObject.put("sortType", 0);
            String strV = v("https://api.guangyapan.com/nd.bizuserres.s/v1/get_share_page_files_list", jSONObject, true);
            if ((strV != null && !strV.isEmpty())) {
                JSONObject jSONObject2 = new JSONObject(strV);
                if ("success".equals(jSONObject2.optString("msg"))) {
                    return jSONObject2.getJSONObject("data").optJSONArray("list");
                }
            }
        } catch (Exception e) {
            com.github.catvod.spider.merge.A.c.e(e, new StringBuilder("光鸭云盘 getFilesList 异常: "));
        }
        return new JSONArray();
    }

    private Map<String, String> p() {
        HashMap mapB = com.github.catvod.spider.merge.B.e.b("Content-Type", "application/json", "User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36");
        mapB.put("Referer", "https://www.guangyapan.com/");
        mapB.put("Origin", "https://www.guangyapan.com");
        mapB.put("dt", "4");
        mapB.put("did", this.e);
        if ((this.f.b() != null && !this.f.b().isEmpty())) {
            mapB.put("Authorization", this.f.b());
        }
        return mapB;
    }

    private boolean t(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("mineType", "");
        String lowerCase = jSONObject.optString("ext", "").toLowerCase();
        if (strOptString.startsWith("video/")) {
            return true;
        }
        String[] strArr = {".mp4", ".mkv", ".avi", ".wmv", ".flv", ".mov", ".rmvb", ".rm", ".3gp", ".ts", ".m4v", ".webm", ".mpg", ".mpeg", ".m2ts"};
        for (int i = 0; i < 15; i++) {
            if (lowerCase.equals(strArr[i])) {
                return true;
            }
        }
        return false;
    }

    private void u(String str, String str2, List<JSONObject> list, String str3) {
        try {
            JSONArray jSONArrayO = o(str, str2);
            if (jSONArrayO == null) {
                return;
            }
            for (int i = 0; i < jSONArrayO.length(); i++) {
                JSONObject jSONObject = jSONArrayO.getJSONObject(i);
                if (jSONObject.optInt("resType") == 2) {
                    String string = jSONObject.getString("fileName");
                    String string2 = jSONObject.getString("fileId");
                    if ((str3 != null && !str3.isEmpty())) {
                        string = str3 + "/" + string;
                    }
                    u(str, string2, list, string);
                } else if (t(jSONObject)) {
                    jSONObject.put("_parentName", str3 != null ? str3 : "");
                    list.add(jSONObject);
                }
            }
        } catch (Exception e) {
            com.github.catvod.spider.merge.A.c.e(e, new StringBuilder("光鸭云盘 listAllVideoFiles 异常: "));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String v(java.lang.String r7, org.json.JSONObject r8, boolean r9) {
        /*
            r6 = this;
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Exception -> L76
            java.util.Map r1 = r6.p()     // Catch: java.lang.Exception -> L76
            com.github.catvod.spider.merge.f0.i r0 = com.github.catvod.spider.merge.f0.d.j(r7, r0, r1)     // Catch: java.lang.Exception -> L76
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L76
            r1.<init>()     // Catch: java.lang.Exception -> L76
            java.lang.String r2 = "光鸭云盘 POST "
            r1.append(r2)     // Catch: java.lang.Exception -> L76
            r1.append(r7)     // Catch: java.lang.Exception -> L76
            java.lang.String r2 = " body:"
            r1.append(r2)     // Catch: java.lang.Exception -> L76
            r1.append(r8)     // Catch: java.lang.Exception -> L76
            java.lang.String r2 = " result:"
            r1.append(r2)     // Catch: java.lang.Exception -> L76
            java.lang.String r2 = r0.a()     // Catch: java.lang.Exception -> L76
            r1.append(r2)     // Catch: java.lang.Exception -> L76
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L76
            com.github.catvod.crawler.SpiderDebug.log(r1)     // Catch: java.lang.Exception -> L76
            if (r9 == 0) goto L71
            int r9 = r0.b()     // Catch: java.lang.Exception -> L76
            r1 = 1
            r2 = 401(0x191, float:5.62E-43)
            r3 = 0
            if (r9 != r2) goto L41
            goto L64
        L41:
            java.lang.String r9 = r0.a()     // Catch: java.lang.Exception -> L76
            boolean r9 = (r9 != null && !r9.isEmpty())     // Catch: java.lang.Exception -> L76
            if (r9 == 0) goto L63
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: java.lang.Exception -> L63
            java.lang.String r4 = r0.a()     // Catch: java.lang.Exception -> L63
            r9.<init>(r4)     // Catch: java.lang.Exception -> L63
            java.lang.String r4 = "code"
            r5 = 200(0xc8, float:2.8E-43)
            int r9 = r9.optInt(r4, r5)     // Catch: java.lang.Exception -> L63
            if (r9 == r2) goto L64
            r2 = 207(0xcf, float:2.9E-43)
            if (r9 != r2) goto L63
            goto L64
        L63:
            r1 = 0
        L64:
            if (r1 == 0) goto L71
            boolean r9 = r6.w()     // Catch: java.lang.Exception -> L76
            if (r9 == 0) goto L71
            java.lang.String r7 = r6.v(r7, r8, r3)     // Catch: java.lang.Exception -> L76
            return r7
        L71:
            java.lang.String r7 = r0.a()     // Catch: java.lang.Exception -> L76
            return r7
        L76:
            r7 = move-exception
            java.lang.String r8 = "光鸭云盘 POST 异常: "
            java.lang.StringBuilder r8 = new java.lang.StringBuilder(r8)
            com.github.catvod.spider.merge.A.c.e(r7, r8)
            java.lang.String r7 = ""
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.I.GuangYaPanApi.v(java.lang.String, org.json.JSONObject, boolean):java.lang.String");
    }

    private void y(String str, String str2) {
        SpiderDebug.log("光鸭Token获取成功: " + str2);
        this.f.e("Bearer " + str);
        this.f.f(str2);
        this.f.d();
        ScheduledExecutorService scheduledExecutorService = this.g;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        Init.run(new B(this, 1));
    }

    public final String n(String str, String str2, String str3) {
        String strM;
        try {
            strM = m(str, str3);
        } catch (Exception e) {
            com.github.catvod.spider.merge.A.c.e(e, new StringBuilder("光鸭云盘 getDownloadUrl 异常: "));
        }
        if ((strM == null || strM.isEmpty())) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fileId", str2);
        jSONObject.put("accessToken", strM);
        String strV = v("https://api.guangyapan.com/nd.bizuserres.s/v1/get_share_download_url", jSONObject, true);
        if ((strV != null && !strV.isEmpty())) {
            JSONObject jSONObject2 = new JSONObject(strV);
            if ("success".equals(jSONObject2.optString("msg"))) {
                return jSONObject2.getJSONObject("data").optString("downloadUrl", "");
            }
            SpiderDebug.log("光鸭云盘 下载失败: " + jSONObject2.optString("msg") + " code:" + jSONObject2.optInt("code"));
            return "";
        }
        return "";
    }

    public final JSONObject q(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("shareId", str);
            if ((str2 != null && !str2.isEmpty())) {
                jSONObject.put("code", str2);
            }
            String strV = v("https://api.guangyapan.com/nd.bizuserres.s/v1/get_share_summary", jSONObject, true);
            if (!(strV != null && !strV.isEmpty())) {
                return null;
            }
            JSONObject jSONObject2 = new JSONObject(strV);
            if ("success".equals(jSONObject2.optString("msg"))) {
                return jSONObject2.optJSONObject("data");
            }
            return null;
        } catch (Exception e) {
            com.github.catvod.spider.merge.A.c.e(e, new StringBuilder("光鸭云盘 getShareSummary 异常: "));
            return null;
        }
    }

    public final com.github.catvod.bean.VodItem r(String str, String str2, String str3, String str4, String str5) {
        String strB;
        GuangYaPanApi o;
        String str6;
        String str7 = str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        try {
            String strM = m(str2, str4);
            strB = (strM == null || strM.isEmpty());
            try {
                if (strB != 0) {
                    return j(str7, str5);
                }
                String str8 = str5;
                JSONObject jSONObjectQ = q(str2, str4);
                strB = str8;
                if (jSONObjectQ != null) {
                    this.d = jSONObjectQ.optString("title", "光鸭云盘");
                    strB = str8;
                    if ((str5 == null || str5.isEmpty())) {
                        strB = this.d;
                    }
                }
                ArrayList<JSONObject> arrayList4 = new ArrayList();
                u(strM, (str3 != null && !str3.isEmpty()) ? str3 : "", arrayList4, "");
                if (arrayList4.isEmpty()) {
                    return j(str7, strB);
                }
                arrayList.add("光鸭原畫");
                for (JSONObject jSONObject : arrayList4) {
                    try {
                        String strY = com.github.catvod.spider.merge.i0.GeneralUtils.y(jSONObject.getString("fileName"));
                        String string = jSONObject.getString("fileId");
                        ArrayList arrayList5 = arrayList;
                        ArrayList arrayList6 = arrayList2;
                        double dOptDouble = jSONObject.optDouble("fileSize", jSONObject.optDouble("size", 0.0d));
                        arrayList3.add(TextUtils.join(" ", Arrays.asList(com.github.catvod.spider.merge.i0.m.v(strY), dOptDouble == 0.0d ? "" : "[" + com.github.catvod.spider.merge.i0.m.n(dOptDouble) + "]", strY)).trim() + "$" + str2 + "+" + string + "+" + str4 + "+" + strB);
                        arrayList = arrayList5;
                        arrayList2 = arrayList6;
                    } catch (Exception e) {
                        e = e;
                        o = this;
                        str7 = str;
                        com.github.catvod.spider.merge.A.c.e(e, new StringBuilder("光鸭云盘 getVod 异常: "));
                        return o.j(str7, strB);
                    }
                }
                ArrayList arrayList7 = arrayList;
                ArrayList arrayList8 = arrayList2;
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb.append((CharSequence) it.next());
                        if (!it.hasNext()) {
                            break;
                        }
                        sb.append((CharSequence) "#");
                    }
                }
                arrayList8.add(sb.toString());
                com.github.catvod.bean.VodItem iVar = new com.github.catvod.bean.VodItem();
                str7 = str;
                try {
                    iVar.l(str7);
                    iVar.j(str7);
                    if ((strB != null && !strB.isEmpty())) {
                        o = this;
                        str6 = strB;
                    } else {
                        o = this;
                        try {
                            String str9 = o.d;
                            o = o;
                            str6 = str9;
                        } catch (Exception e2) {
                            e = e2;
                            com.github.catvod.spider.merge.A.c.e(e, new StringBuilder("光鸭云盘 getVod 异常: "));
                            return o.j(str7, strB);
                        }
                    }
                    iVar.m(str6);
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it2 = arrayList8.iterator();
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
                    Iterator it3 = arrayList7.iterator();
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
                    iVar.g("光鸭雲盤");
                    return iVar;
                } catch (Exception e3) {
                    e = e3;
                    o = this;
                }
            } catch (Exception e4) {
                e = e4;
                o = this;
                com.github.catvod.spider.merge.A.c.e(e, new StringBuilder("光鸭云盘 getVod 异常: "));
                return o.j(str7, strB);
            }
        } catch (Exception e5) {
            e = e5;
            strB = str5;
        }
    }

    public final List<com.github.catvod.bean.VodItem> s(com.github.catvod.bean.j jVar) {
        JSONObject jSONObjectQ;
        String str;
        String strD = jVar.d();
        String strC = jVar.c();
        String strF = jVar.f();
        String strE = jVar.e();
        String strB = jVar.b();
        ArrayList arrayList = new ArrayList();
        try {
            String strM = m(strC, strD);
            if ((strM == null || strM.isEmpty())) {
                return arrayList;
            }
            if (((strF == null || strF.isEmpty()) || (strB == null || strB.isEmpty())) && (jSONObjectQ = q(strC, strD)) != null) {
                jSONObjectQ.optString("title", "光鸭云盘");
            }
            if ((strB == null || strB.isEmpty())) {
                strB = "";
            }
            JSONArray jSONArrayO = o(strM, strB);
            if (jSONArrayO == null) {
                return arrayList;
            }
            for (int i = 0; i < jSONArrayO.length(); i++) {
                JSONObject jSONObject = jSONArrayO.getJSONObject(i);
                com.github.catvod.bean.VodItem iVar = new com.github.catvod.bean.VodItem();
                String string = jSONObject.getString("fileName");
                String string2 = jSONObject.getString("fileId");
                if (jSONObject.optInt("resType") == 2) {
                    iVar.l(strC + "*#" + string2 + "*#" + string);
                    iVar.m(string);
                    str = "folder";
                } else if (t(jSONObject) || BaseApi.get().d.booleanValue() || (com.github.catvod.spider.merge.i0.GeneralUtils.m(string) != null && !com.github.catvod.spider.merge.i0.GeneralUtils.m(string).isEmpty())) {
                    iVar.l(strE + jSONObject.getString("parentId") + "*#" + string2 + "*#" + string);
                    iVar.m(string);
                    str = "file";
                }
                iVar.r(str);
                arrayList.add(iVar);
            }
        } catch (Exception e) {
            com.github.catvod.spider.merge.A.c.e(e, new StringBuilder("光鸭云盘 getVodFolder 异常: "));
        }
        return arrayList;
    }

    final boolean w() {
        try {
            SpiderDebug.log("光鸭云盘 refreshAccessToken...");
            String strC = this.f.c();
            if ((strC == null || strC.isEmpty())) {
                return false;
            }
            Map<String, String> mapP = p();
            ((HashMap) mapP).put("x-action", "401");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("client_id", "aMe-8VSlkrbQXpUR");
            jSONObject.put("grant_type", "refresh_token");
            jSONObject.put("refresh_token", strC);
            String strA = com.github.catvod.spider.merge.f0.d.j("https://account.guangyapan.com/v1/auth/token", jSONObject.toString(), mapP).a();
            if ((strA != null && !strA.isEmpty()) && strA.contains("access_token")) {
                JSONObject jSONObject2 = new JSONObject(strA);
                String string = jSONObject2.getString("access_token");
                String strOptString = jSONObject2.optString("refresh_token", strC);
                SpiderDebug.log("光鸭云盘 refreshAccessToken accessToken..." + string);
                y(string, strOptString);
                return true;
            }
        } catch (Exception e) {
            com.github.catvod.spider.merge.A.c.e(e, new StringBuilder("光鸭云盘 refreshAccessToken 异常: "));
        }
        return false;
    }

    public final JSONArray x(String str, String str2, String str3) {
        String strM;
        try {
            strM = m(str, str2);
        } catch (Exception e) {
            com.github.catvod.spider.merge.A.c.e(e, new StringBuilder("光鸭云盘 searchFiles 异常: "));
        }
        if ((strM == null || strM.isEmpty())) {
            return new JSONArray();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("accessToken", strM);
        jSONObject.put("keyword", str3);
        jSONObject.put("page", 0);
        jSONObject.put("pageSize", 100);
        String strV = v("https://api.guangyapan.com/nd.bizuserres.s/v1/share_page_search_files", jSONObject, true);
        if ((strV != null && !strV.isEmpty())) {
            JSONObject jSONObject2 = new JSONObject(strV);
            if ("success".equals(jSONObject2.optString("msg"))) {
                return jSONObject2.optJSONObject("data").optJSONArray("list");
            }
        }
        return new JSONArray();
    }

    public final void z(String str, boolean z) {
        if ((this.f.c() == null || this.f.c().isEmpty()) || z) {
            SpiderDebug.log("光鸭云盘 setUser: " + str);
            if (str != null && str.startsWith("http")) {
                try {
                    str = com.github.catvod.spider.merge.f0.d.l(str).trim();
                } catch (Exception e) {
                    com.github.catvod.spider.merge.A.c.e(e, new StringBuilder("光鸭云盘 setUser fetching error: "));
                }
            }
            if ((str != null && !str.isEmpty())) {
                this.f.f(str);
                this.f.d();
            }
        }
    }
}
