package com.github.catvod.spider.merge.AB.b;

import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.AB.o.c0;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class Q {
    private static final String i = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) uc-cloud-drive/1.8.5 Chrome/100.0.4896.160 Electron/18.3.5.16-b62cf9c50d Safari/537.36 Channel/ucpan_other_ch";
    private static Map<String, com.github.catvod.spider.merge.AB.k.e> j;
    private String a;
    private JSONObject b;
    private ScheduledExecutorService c;
    private String d;
    private com.github.catvod.spider.merge.AB.k.e e;
    private AlertDialog f;
    private final Map<String, String> g;
    String h;

    Q() {
        Init.checkPermission();
        new ArrayList();
        HashMap map = new HashMap();
        this.g = map;
        map.put("4k", "4K");
        map.put("2k", "2K");
        map.put("super", "超清");
        map.put("high", "高清");
        map.put("low", "流畅");
        map.put("normal", "一般");
        j = new HashMap();
        E();
        SpiderDebug.log("UcYun Init");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        try {
            this.h = System.currentTimeMillis() + "";
            String str = "https://api.open.uc.cn/cas/ajax/getTokenForQrcodeLogin?__dt=641254&__t=" + this.h;
            HashMap map = new HashMap();
            map.put("Accept", "application/json, text/plain, */*");
            map.put("Content-Type", "application/x-www-form-urlencoded");
            map.put("User-Agent", i);
            map.put("Referer", "https://broccoli.uc.cn/");
            HashMap map2 = new HashMap();
            map2.put("client_id", "381");
            map2.put("v", "1.2");
            map2.put("request_id", this.h);
            String strOptString = new JSONObject(com.github.catvod.spider.merge.AB.m.c.h(str, map2, map).a()).optJSONObject("data").optJSONObject("members").optString("token");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", "https://su.uc.cn/1_n0ZCv?uc_param_str=dsdnfrpfbivesscpgimibtbmnijblauputogpintnwktprchmt&token=" + strOptString + "&client_id=381&uc_biz_str=S%3Acustom%7CC%3Atitlebar_fix");
            jSONObject.put("token", strOptString);
            Init.run(new F(this, jSONObject, 1));
        } catch (Exception e) {
            SpiderDebug.log("getQRCode e: " + e);
        }
    }

    private String E() {
        return com.github.catvod.spider.merge.AB.m.c.b("https://pc-api.uc.cn/1/clouddrive/file", y()).a();
    }

    private void G(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("req_id", str);
            jSONObject.put("app_ver", "1.6.8");
            jSONObject.put("device_id", str2);
            jSONObject.put("device_brand", "vivo");
            jSONObject.put("platform", "tv");
            jSONObject.put("device_name", "V2238A");
            jSONObject.put("device_model", "V2238A");
            jSONObject.put("build_device", "V2238A");
            jSONObject.put("build_product", "V2238A");
            jSONObject.put("device_gpu", "Adreno (TM) 640");
            jSONObject.put("activity_rect", "{}");
            jSONObject.put("channel", "UCTVOFFICIALWEB");
            if (TextUtils.isEmpty(str3)) {
                jSONObject.put("refresh_token", this.b.optString("refresh_token"));
            } else {
                jSONObject.put("code", str3);
            }
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Linux; U; Android 12; zh-cn; V2238A Build/V417IR) AppleWebKit/533.1 (KHTML, like Gecko) Mobile Safari/533.1");
            map.put("Content-Type", "application/json; charset=utf-8");
            JSONObject jSONObject2 = new JSONObject(com.github.catvod.spider.merge.AB.m.c.g("http://api.extscreen.com/ucdrive/token", jSONObject.toString(), map).a());
            if (jSONObject2.optInt("code") == 200) {
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("data");
                jSONObjectOptJSONObject.put("start_time", System.currentTimeMillis() / 1000);
                jSONObjectOptJSONObject.put("device_id", str2);
                c0.u(".uctv", jSONObjectOptJSONObject.toString());
            }
        } catch (Exception e) {
            SpiderDebug.log("getRefreshTokenByTV e:" + e);
        }
    }

    private JSONObject H(JSONObject jSONObject, String str, String str2, Map<String, Object> map) {
        String strF;
        try {
        } catch (Exception e) {
            e.getMessage();
        }
        if (jSONObject.getInt("code") == 32003) {
            com.github.catvod.spider.merge.AB.o.E.b("夸克容量已经用完, 请手动删除");
            return null;
        }
        j = new HashMap();
        if (!TextUtils.isEmpty(N(str))) {
            O(str);
            Iterator it = this.e.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    strF = "";
                    break;
                }
                com.github.catvod.spider.merge.AB.k.a aVar = (com.github.catvod.spider.merge.AB.k.a) it.next();
                String strB = aVar.b();
                if (strB == str2 || (strB != null && strB.equals(str2))) {
                    strF = aVar.f();
                    break;
                }
            }
            map.put("stoken", this.e.b().a());
            map.put("fid_token_list", Collections.singletonList(strF));
            return new JSONObject(L("https://pc-api.uc.cn/1/clouddrive/share/sharepage/save?pr=ucpro&fr=pc&uc_param_str=&__t=" + System.currentTimeMillis(), map));
        }
        return null;
    }

    private boolean I() {
        try {
            JSONObject jSONObject = new JSONObject(com.github.catvod.spider.merge.AB.m.c.l("https://pc-api.uc.cn/1/clouddrive/member?pr=UCBrowser&fr=pc&fetch_subscribe=true&_ch=home", y()));
            if (!"200".equals(jSONObject.optString("status"))) {
                throw new Exception();
            }
            jSONObject.optJSONObject("data").optString("member_type");
            if (!TextUtils.isEmpty(c0.q(".uc"))) {
                return true;
            }
            c0.u(".uc", this.a);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private void J(String str, com.github.catvod.spider.merge.AB.k.a aVar, List<com.github.catvod.spider.merge.AB.k.a> list) {
        if (this.e.b() == null) {
            return;
        }
        String strB = aVar.b();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 1;
        while (true) {
            StringBuilder sb = new StringBuilder();
            v.a(new byte[]{40, -103, 16, 5, -119, -128, 49, 24, 48, -114, 73, 20, -118, -45, 48, 66, 35, -61, 7, 27, -43, -117, 49, 84, 44, -126, 17, 17, -98, -56, 119, 65, 37, -62, 23, 29, -101, -56, 123, 24, 51, -123, 5, 7, -97, -54, 127, 80, 37, -62, 0, 16, -114, -37, 119, 91, 127, -99, 22, 72, -81, -7, 92, 69, 47, -102, 23, 16, -120, -100, 120, 69, 125, -99, 7, 83, -118, -51, 122, 104, 41, -119, 89}, new byte[]{64, -19, 100, 117, -6, -70, 30, 55}, sb, str);
            sb.append("&stoken=");
            sb.append(URLEncoder.encode(this.e.b().a()));
            v.a(new byte[]{43, -11, -95, -112, -6, -35, 63, 82, 105, -72}, new byte[]{13, -123, -59, -7, -120, -126, 89, 59}, sb, strB);
            sb.append("&force=0&_page=");
            sb.append(i2);
            sb.append("&_size=");
            sb.append(100);
            String strU = u(t.b(new byte[]{115, -102, 124, 83, -86, 61, 108, 28, 55, -92, 116, 88, -69, 44, 57, 115, 115, -102, 124, 83, -86, 61, 108, 28, 38, -83, 123, 68, -69, 99, 52, 101, 10, -93, 127, 66, -67, 54, 91, 55, 58, -79, 123, 90, -29, 111, 34, 28, 38, -86, 104, 66, -29, 56, 109, 47, 48, -102, 110, 79, -82, 59, 62, 34, 38, -90, 54, 80, -73, 50, 97, 28, 59, -92, 119, 83, -28, 63, 119, 32}, new byte[]{85, -59, 26, 54, -34, 94, 4, 67}, sb));
            for (com.github.catvod.spider.merge.AB.k.a aVar2 : ((com.github.catvod.spider.merge.AB.k.c) s.a(strU, com.github.catvod.spider.merge.AB.k.c.class)).a().a()) {
                if (aVar2.h()) {
                    arrayList.add(aVar2);
                } else if ((aVar2.i() && aVar2.a() == 1) || (aVar2.i() && c0.l().contains(aVar2.d()))) {
                    if (!this.e.b().b().equals(aVar.c())) {
                        aVar2.k(aVar.c());
                    }
                    arrayList2.add(aVar2);
                }
            }
            if (!arrayList2.isEmpty()) {
                list.addAll(arrayList2);
                arrayList2 = new ArrayList();
            }
            try {
                JSONObject jSONObject = new JSONObject(strU).getJSONObject("metadata");
                int i3 = jSONObject.getInt("_total");
                int i4 = jSONObject.getInt("_count");
                if (i3 <= 100 || i2 * 100 == i3 || i4 != 100) {
                    break;
                } else {
                    i2++;
                }
            } catch (Exception unused) {
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            J(str, (com.github.catvod.spider.merge.AB.k.a) it.next(), list);
        }
    }

    private String L(String str, Map<String, Object> map) {
        String str2 = "";
        com.github.catvod.spider.merge.AB.m.e eVarG = com.github.catvod.spider.merge.AB.m.c.g(str, new JSONObject(map).toString(), y());
        List<String> list = eVarG.c().get("set-cookie");
        this.d = this.a;
        if (!(list == null) && list.size() > 0) {
            String str3 = this.d;
            try {
                String str4 = list.get(0).split(";")[0];
                String str5 = str4.split("=")[0];
                String str6 = str4.split("=")[1];
                String[] strArrSplit = str3.split(";");
                String string = "";
                for (String str7 : strArrSplit) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    sb.append(str7.indexOf(str5) > 0 ? str4 : str7 + ";");
                    string = sb.toString();
                }
                str2 = string.contains(str5) ? string : string + str4;
            } catch (Exception unused) {
            }
            this.d = str2;
        }
        SpiderDebug.log("playCookie1: " + this.d);
        return eVarG.a();
    }

    private void O(String str) {
        ArrayList arrayList = new ArrayList();
        com.github.catvod.spider.merge.AB.k.a aVar = new com.github.catvod.spider.merge.AB.k.a();
        aVar.j("");
        J(str, aVar, arrayList);
        this.e.d(arrayList);
    }

    private void P(String str) {
        this.a = str;
        c0.u(".uc", str);
        I();
        S();
    }

    private void S() {
        ScheduledExecutorService scheduledExecutorService = this.c;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        Init.run(new RunnableC0085f(this, 2));
    }

    public static void a(Q q) {
        q.S();
    }

    public static /* synthetic */ void b(Q q, JSONObject jSONObject) {
        q.getClass();
        String str = System.currentTimeMillis() + "";
        String strOptString = jSONObject.optString("client_id");
        String strOptString2 = jSONObject.optString("token");
        String strOptString3 = jSONObject.optString("device_id");
        String strA = c0.a(strOptString3 + str);
        StringBuilder sb = new StringBuilder();
        v.a(new byte[]{-45, -23, 15, -124, -87, 17, -38, 90, -44, -19, 30, -102, -9, 74, -123, 28, -106, -7, 9, -99, -84, 78, -37, 0, -40, -77, 24, -102, -11, 68, -108, 0, -49, -11, 84, -105, -75, 79, -112, 74, -55, -8, 10, -85, -77, 79, -56}, new byte[]{-69, -99, 123, -12, -38, 43, -11, 117}, sb, strA);
        v.a(new byte[]{103, 15, 50, 40, 16, -19, -34, 93, 53, 1, 58, 46, 27, -93, -117, 99, 49, 30, 14, 61, 16, -20, -112, 51, 111, 88, 127, 115, 83, -6, -56, 116, 40, 13, 52, 20, 28, -6, -112}, new byte[]{65, 110, 81, 75, 117, -98, -83, 2}, sb, strOptString3);
        v.a(new byte[]{-66, -57, -5, -29, 60, -3, -98, -41, -6, -47, -1, -5, 49, -93, -115, -31, -18, -52, -72, -27, 57, -1, -113, -18, -9, -47, -13, -88, 33, -24, -35, -20, -3, -43, -9, -10, 48, -63, -107, -23, -11, -58, -93, -61, 103, -84, -56, -80, -39, -123, -6, -16, 35, -9, -104, -19, -57, -50, -15, -15, 48, -14, -58, -34, -86, -111, -83, -83, 20, -72, -103, -3, -15, -49, -6, -54, 49, -5, -115, -31, -5, -58, -93, -61, 103, -84, -56, -80, -39, -123, -4, -32, 60, -14, -97, -41, -24, -47, -15, -15, 32, -3, -113, -75, -50, -111, -84, -90, 109, -33, -35, -20, -3, -43, -9, -10, 48, -63, -100, -8, -19, -98, -33, -15, 39, -5, -107, -25, -67, -111, -82, -67, 1, -45, -46, -83, -86, -109, -88, -95, 101, -72, -102, -21, -20, -54, -24, -4, 33, -25, -92, -6, -3, -64, -22, -88, 112, -87, -71, -83, -81, -25, -72, -10, 61, -1, -107, -26, -3, -49, -93, -64, 22, -54, -83, -57, -34, -27, -41, -42, 28, -33, -73, -33, -35, -31, -72, -10, 57, -9, -98, -26, -20, -4, -9, -15, 104}, new byte[]{-104, -93, -98, -107, 85, -98, -5, -120}, sb, strOptString);
        String strB = u.b(new byte[]{-54, 69, -44, 118, 54, -67, 115, -51, -119, 66, -45, 112, 53, -77, 104, -46, -103, 83, -59, 96, 25, -84, 33, -56, -119, 88, -118}, new byte[]{-20, 54, -73, 25, 70, -40, 78, -93}, sb, strOptString2);
        String strB2 = c0.b(String.format("GET&/oauth/code&%s&l3srvtd7p42l0d0x1u8d7yc8ye9kki4d", str));
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Linux; U; Android 12; zh-cn; V2238A Build/V417IR) AppleWebKit/533.1 (KHTML, like Gecko) Mobile Safari/533.1");
        map.put("x-pan-tm", str);
        map.put("host", "open-api-drive.uc.cn");
        map.put("x-pan-token", strB2);
        map.put("x-pan-client-id", strOptString);
        try {
            JSONObject jSONObject2 = new JSONObject(com.github.catvod.spider.merge.AB.m.c.l(strB, map));
            if (jSONObject2.optInt("status") == 0) {
                q.G(strA, strOptString3, jSONObject2.optString("code"));
                q.S();
            }
        } catch (Exception e) {
            SpiderDebug.log("e1: " + e);
        }
    }

    public static void d(Q q, String str) {
        q.getClass();
        if (str.startsWith("http")) {
            str = com.github.catvod.spider.merge.AB.m.c.l(str, null);
        }
        q.P(str);
    }

    public static void e(Q q, EditText editText) {
        q.getClass();
        String string = editText.getText().toString();
        q.s();
        Init.execute(new RunnableC0090k(q, string, 1));
    }

    public static void f(Q q) {
        q.s();
        Init.execute(new RunnableC0081b(q, 2));
    }

    public static void g(Q q) {
        q.S();
    }

    public static void i(Q q, JSONObject jSONObject) {
        q.getClass();
        String strOptString = jSONObject.optString("token");
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        q.c = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(new RunnableC0087h(q, strOptString, 2), 1L, 1L, TimeUnit.SECONDS);
    }

    public static void j(final Q q, JSONObject jSONObject) {
        q.getClass();
        try {
            int iA = com.github.catvod.spider.merge.AB.J.a.a(240);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(com.github.catvod.spider.merge.AB.o.I.b(jSONObject.optString("url"), iA));
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.gravity = 17;
            frameLayout.addView(imageView, layoutParams);
            AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getActivity()).setView(frameLayout).setOnCancelListener(new DialogInterface.OnCancelListener(q) { // from class: com.github.catvod.spider.merge.AB.b.K
                public final Q a;

                {
                    this.a = q;
                }

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    Q.g(this.a);
                }
            }).setOnDismissListener(new DialogInterface.OnDismissListener(q) { // from class: com.github.catvod.spider.merge.AB.b.M
                public final Q a;

                {
                    this.a = q;
                }

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    Q.a(this.a);
                }
            }).show();
            q.f = alertDialogShow;
            alertDialogShow.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            Init.execute(new RunnableC0089j(q, jSONObject, 1));
            com.github.catvod.spider.merge.AB.o.E.b("请使用UC App 扫描二维码");
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void k(Q q, String str) {
        q.getClass();
        HashMap map = new HashMap();
        map.put("client_id", "381");
        map.put("v", "1.2");
        map.put("request_id", q.h);
        map.put("token", str);
        try {
            JSONObject jSONObject = new JSONObject(com.github.catvod.spider.merge.AB.m.c.h("https://api.open.uc.cn/cas/ajax/getServiceTicketByQrcodeToken?__dt=97123&_t=" + q.h, map, q.y()).a());
            if ("ok".equals(jSONObject.optString("message"))) {
                String strOptString = jSONObject.optJSONObject("data").optJSONObject("members").optString("service_ticket");
                HashMap map2 = new HashMap();
                map2.put("Accept", "application/json, text/plain, */*");
                map2.put("Referer", "https://drive.uc.cn/");
                Iterator it = com.github.catvod.spider.merge.AB.m.c.e("https://drive.uc.cn/account/info?st=" + strOptString, map2).headers("set-cookie").iterator();
                String str2 = "";
                while (it.hasNext()) {
                    str2 = str2 + ((String) it.next()).split(";")[0] + ";";
                }
                q.P(str2);
            }
        } catch (Exception unused) {
        }
    }

    public static void l(Q q, JSONObject jSONObject) {
        q.getClass();
        try {
            int iA = com.github.catvod.spider.merge.AB.J.a.a(240);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(com.github.catvod.spider.merge.AB.o.I.b(jSONObject.optString("url"), iA));
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.gravity = 17;
            frameLayout.addView(imageView, layoutParams);
            AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getActivity()).setView(frameLayout).setOnCancelListener(new B(q, 1)).setOnDismissListener(new E(q, 1)).show();
            q.f = alertDialogShow;
            alertDialogShow.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            Init.execute(new N(q, jSONObject, 1));
            com.github.catvod.spider.merge.AB.o.E.b("请使用UC App 扫描二维码");
        } catch (Exception unused) {
        }
    }

    public static void m(Q q, JSONObject jSONObject) {
        q.getClass();
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        q.c = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(new G(q, jSONObject, 1), 1L, 1L, TimeUnit.SECONDS);
    }

    private boolean n(List list) {
        String strOptString = "";
        for (int i2 = 0; i2 < 3; i2++) {
            try {
                HashMap map = new HashMap();
                map.put("filelist", list);
                map.put("exclude_fids", new ArrayList());
                map.put("action_type", 2);
                String strL = L("https://pc-api.uc.cn/1/clouddrive/file/delete?pr=UCBrowser&fr=pc", map);
                SpiderDebug.log("deleteResult:" + strL);
                strOptString = new JSONObject(strL).optJSONObject("data").optString("task_id");
                if (!TextUtils.isEmpty(strOptString)) {
                    break;
                }
            } catch (Exception e) {
                SpiderDebug.log("delete:" + e);
                return true;
            }
        }
        if (TextUtils.isEmpty(strOptString)) {
            if (!n(list)) {
                return false;
            }
        }
        return true;
    }

    private String q(String str, String str2, String str3, Boolean bool) {
        String strF;
        try {
            List<com.github.catvod.spider.merge.AB.k.a> listC = this.e.c();
            if (listC == null || listC.size() == 0) {
                N(str);
                O(str);
                listC = this.e.c();
            }
            if (listC == null || listC.size() <= 0) {
                strF = "";
            } else {
                for (com.github.catvod.spider.merge.AB.k.a aVar : listC) {
                    if (A.a(aVar.b(), str2)) {
                        strF = aVar.f();
                        break;
                    }
                }
                strF = "";
            }
            if (strF.isEmpty()) {
                return "";
            }
            String strV = v();
            HashMap map = new HashMap();
            map.put("scene", "link");
            map.put("pdir_fid", "0");
            map.put("pwd_id", str);
            map.put("stoken", this.e.b().a());
            map.put("to_pdir_fid", strV);
            map.put("fid_list", Collections.singletonList(str2));
            map.put("fid_token_list", Collections.singletonList(strF));
            JSONObject jSONObject = new JSONObject(L("https://pc-api.uc.cn/1/clouddrive/share/sharepage/save?pr=UCBrowser&fr=pc&sys=win32&ve=1.5.2", map));
            if (jSONObject.getInt("code") == 41017) {
                return str2;
            }
            if (jSONObject.getInt("status") != 200 || jSONObject.getInt("code") != 0) {
                jSONObject = H(jSONObject, str, str2, map);
                if (jSONObject == null) {
                    return "";
                }
                if (jSONObject.getInt("code") == 41017) {
                    return str2;
                }
                jSONObject.getInt("status");
            }
            String strOptString = jSONObject.optJSONObject("data").optString("task_id");
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < 5; i2++) {
                jSONArray = new JSONObject(u("https://pc-api.uc.cn/1/clouddrive/task?pr=UCBrowser&fr=pc&sys=win32&task_id=" + strOptString + "&retry_index=" + i2 + "1&__t=" + System.currentTimeMillis())).optJSONObject("data").optJSONObject("save_as").optJSONArray("save_as_top_fids");
                if (jSONArray.length() > 0) {
                    break;
                }
                TimeUnit.SECONDS.sleep(1L);
            }
            return (bool.booleanValue() && jSONArray.length() == 0) ? q(str, str2, str3, Boolean.FALSE) : jSONArray.optString(0);
        } catch (Exception e) {
            SpiderDebug.log("uc copy e" + e);
            return "";
        }
    }

    private void r(String str) {
        int i2;
        List listSingletonList = Collections.singletonList(str);
        ArrayList arrayList = new ArrayList();
        try {
            String strV = v();
            if (strV.equals("0")) {
                return;
            }
            C();
            int i3 = 1;
            while (true) {
                JSONObject jSONObject = new JSONObject(u(String.format("https://pc-api.uc.cn/1/clouddrive/file/sort?pr=UCBrowser&fr=pc&pdir_fid=%s&_page=%s&_size=%s&_fetch_total=1&_fetch_sub_dirs=0&_sort=file_type:asc,updated_at:desc", strV, Integer.valueOf(i3), 100)));
                JSONArray jSONArray = jSONObject.getJSONObject("data").getJSONArray("list");
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    arrayList.add(jSONArray.getJSONObject(i4).getString("fid"));
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
                if (jSONObject2.getInt("_size") != jSONObject2.getInt("_count") || jSONObject2.getInt("_count") == 0) {
                    break;
                } else {
                    i3++;
                }
            }
            if (arrayList.size() == 0) {
                return;
            }
            String str2 = (String) listSingletonList.get(0);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (A.a(str2, (String) it.next())) {
                    it.remove();
                }
            }
            int size = arrayList.size();
            double d = size;
            double d2 = 50;
            Double.isNaN(d);
            Double.isNaN(d2);
            Double.isNaN(d);
            Double.isNaN(d2);
            Double.isNaN(d);
            Double.isNaN(d2);
            int iCeil = (int) Math.ceil(d / d2);
            for (i2 = 0; i2 < iCeil; i2++) {
                int i5 = i2 * 50;
                n(new ArrayList(arrayList.subList(i5, Math.min(i5 + 50, size))));
            }
        } catch (Exception e) {
            SpiderDebug.log("delete pdir list err:" + e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        try {
            AlertDialog alertDialog = this.f;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    public static Q t() {
        return P.a;
    }

    private String u(String str) {
        return com.github.catvod.spider.merge.AB.m.c.l(str, y());
    }

    private String v() {
        String string;
        try {
            JSONArray jSONArray = new JSONObject(u("https://pc-api.uc.cn/1/clouddrive/file/sort?pr=UCBrowser&fr=pc&pdir_fid=0&_page=1&_size=50&_fetch_total=1&_fetch_sub_dirs=0&_sort=file_type:asc,updated_at:desc")).getJSONObject("data").getJSONArray("list");
            int i2 = 0;
            while (true) {
                if (i2 >= jSONArray.length()) {
                    string = "";
                    break;
                }
                JSONObject jSONObject = (JSONObject) jSONArray.get(i2);
                if (jSONObject.getBoolean("dir") && jSONObject.getString("file_name").equals("tvtemp")) {
                    string = jSONObject.getString("fid");
                    break;
                }
                i2++;
            }
            if (!string.equals("")) {
                return string;
            }
            HashMap map = new HashMap();
            map.put("pdir_fid", "0");
            map.put("file_name", "tvtemp");
            map.put("dir_path", "");
            map.put("dir_init_lock", Boolean.FALSE);
            return new JSONObject(L("https://pc-api.uc.cn/1/clouddrive/file?pr=UCBrowser&fr=pc", map)).getJSONObject("data").getString("fid");
        } catch (Exception e) {
            SpiderDebug.log("getCopyPdir ex: " + e);
            return "0";
        }
    }

    private Map<String, String> y() {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(this.a)) {
            map.put("Cookie", this.a);
        }
        map.put("Referer", "https://drive.uc.cn");
        map.put("User-Agent", i);
        return map;
    }

    private Map<String, String> z() {
        String str;
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(this.d)) {
            str = this.a;
        } else {
            str = this.a + ";" + this.d;
        }
        map.put("Cookie", str);
        map.put("Referer", "https://drive.uc.cn/");
        map.put("User-Agent", i);
        return map;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final List<String> A(String str, String str2, String str3, Boolean bool) {
        try {
            try {
                N(str);
                String strQ = q(str, str2, str3, Boolean.TRUE);
                HashMap map = new HashMap();
                map.put("fid", strQ);
                map.put("resolutions", "normal,low,high,super,2k,4k");
                map.put("supports", "fmp4,m3u8");
                JSONObject jSONObject = new JSONObject(L("https://pc-api.uc.cn/1/clouddrive/file/v2/play?pr=UCBrowser&fr=pc", map));
                if (jSONObject.optString("message").contains("file not found")) {
                    ArrayList arrayList = new ArrayList();
                    if (!TextUtils.isEmpty(str)) {
                        r(strQ);
                    }
                    return arrayList;
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONObject("data").optJSONArray("video_list");
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                    if (jSONObjectOptJSONObject.optBoolean("accessable")) {
                        arrayList2.add((String) this.g.get(jSONObjectOptJSONObject.optString("resolution")));
                        arrayList2.add(jSONObjectOptJSONObject.optJSONObject("video_info").optString("url"));
                    }
                }
                List<String> listA = arrayList2;
                if (bool.booleanValue()) {
                    int size = arrayList2.size();
                    listA = arrayList2;
                    if (size == 0) {
                        listA = A(str, strQ, str3, Boolean.FALSE);
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    r(strQ);
                }
                return listA;
            } catch (Exception e) {
                e.printStackTrace();
                ArrayList arrayList3 = new ArrayList();
                if (!TextUtils.isEmpty(str)) {
                    r(str2);
                }
                return arrayList3;
            }
        } catch (Throwable th) {
            if (!TextUtils.isEmpty(str)) {
                r(str2);
            }
            throw th;
        }
    }

    public final long C() {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public final void D() {
        try {
            Init.checkPermission();
            String str = System.currentTimeMillis() + "";
            String strA = c0.a(str);
            String str2 = String.format("https://open-api-drive.uc.cn/oauth/authorize?req_id=%s&access_token=&app_ver=1.6.8&device_id=%s&device_brand=vivo&platform=tv&device_name=V2238A&device_model=V2238A&build_device=V2238A&build_product=V2238A&device_gpu=Adreno(TM)640&activity_rect=7D&channel=UCTVOFFICIALWEB&auth_type=code&client_id=%s7&scope=netdisk&qrcode=1&qr_width=460&qr_height=460", c0.a(strA + str), strA, "5acf882d27b74502b7040b0c65519aa7");
            String strB = c0.b(String.format("GET&/oauth/authorize&%s&l3srvtd7p42l0d0x1u8d7yc8ye9kki4d", str));
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Linux; U; Android 12; zh-cn; V2238A Build/V417IR) AppleWebKit/533.1 (KHTML, like Gecko) Mobile Safari/533.1");
            map.put("x-pan-tm", str);
            map.put("x-pan-token", strB);
            map.put("content-type", "text/plain;charset=UTF-8");
            map.put("x-pan-client-id", "5acf882d27b74502b7040b0c65519aa7");
            String string = new JSONObject(com.github.catvod.spider.merge.AB.m.c.l(str2, map)).getString("query_token");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", "https://su.uc.cn/9_iCI3h?uc_param_str=&token=" + string + "&uc_biz_str=S%3Acustom%7CC%3Atitlebar_fix");
            jSONObject.put("token", string);
            jSONObject.put("device_id", strA);
            jSONObject.put("client_id", "5acf882d27b74502b7040b0c65519aa7");
            Init.run(new N(this, jSONObject, 0));
        } catch (Exception e) {
            SpiderDebug.log("getQRCode e: " + e);
        }
    }

    public final com.github.catvod.spider.merge.AB.c.j F(String str, String str2, String str3) {
        if (TextUtils.isEmpty(N(str))) {
            return c0.e();
        }
        ArrayList arrayList = new ArrayList();
        com.github.catvod.spider.merge.AB.k.a aVar = new com.github.catvod.spider.merge.AB.k.a();
        aVar.j(str2);
        J(str, aVar, arrayList);
        if (arrayList.size() < 1) {
            return c0.e();
        }
        this.e.d(arrayList);
        List listAsList = Arrays.asList("UC原画", "UC普画");
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            String strB = "";
            if (!it.hasNext()) {
                break;
            }
            com.github.catvod.spider.merge.AB.k.a aVar2 = (com.github.catvod.spider.merge.AB.k.a) it.next();
            if (aVar2.e() != null && !aVar2.e().isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                sb.append(aVar2.e().trim());
                strB = t.b(new byte[]{-4}, new byte[]{-95, -109, -107, 53, -86, 26, 51, -66}, sb);
            }
            StringBuilder sbA = H.a(strB);
            sbA.append(aVar2.c());
            sbA.append(aVar2.g());
            v.a(new byte[]{8}, new byte[]{44, 64, -117, -79, 54, -98, -35, 127}, sbA, str);
            sbA.append(Marker.ANY_NON_NULL_MARKER);
            sbA.append(aVar2.b());
            sbA.append(Marker.ANY_NON_NULL_MARKER);
            sbA.append(aVar2.f());
            String string = sbA.toString();
            if (!TextUtils.isEmpty(str3) && !str3.contains("http")) {
                StringBuilder sbA2 = H.a(string);
                v.a(new byte[]{30}, new byte[]{53, 78, -13, 97, 106, 43, 103, -111}, sbA2, str3);
                sbA2.append(Marker.ANY_NON_NULL_MARKER);
                sbA2.append(aVar2.c());
                string = sbA2.toString();
            }
            arrayList2.add(string);
        }
        for (int i2 = 0; i2 < listAsList.size(); i2++) {
            arrayList3.add(TextUtils.join("#", arrayList2));
        }
        com.github.catvod.spider.merge.AB.c.j jVar = new com.github.catvod.spider.merge.AB.c.j();
        jVar.g(str);
        jVar.e(str);
        jVar.i("");
        jVar.h(this.e.b() == null ? "获取视频名称失败" : this.e.b().b());
        jVar.k(TextUtils.join("$$$", arrayList3));
        jVar.j(TextUtils.join("$$$", listAsList));
        jVar.b("UC网盘");
        return jVar;
    }

    public final String K(String[] strArr, String str) {
        List<String> listA;
        if (TextUtils.isEmpty(this.a)) {
            o();
        }
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(this.d)) {
            map.put("Cookie", this.d);
        }
        map.put("Referer", "https://drive.uc.cn");
        map.put("User-Agent", i);
        if (str.split("#")[0].contains("原画")) {
            if (com.github.catvod.spider.merge.AB.o.H.b(5).booleanValue()) {
                String strD = com.github.catvod.spider.merge.AB.o.H.d(w(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : ""), 55, 100);
                if (strArr.length <= 4) {
                    com.github.catvod.spider.merge.AB.c.g gVar = new com.github.catvod.spider.merge.AB.c.g();
                    gVar.y(strD);
                    gVar.j();
                    gVar.f(z());
                    return gVar.toString();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(Proxy.getUrl());
                sb.append("?do=danmu&vodName=");
                sb.append(strArr[3]);
                sb.append("&vodIndex=");
                sb.append(strArr[4]);
                String strB = t.b(new byte[]{104, -42, 43, -84, 110, 8, 69, 82}, new byte[]{78, -96, 68, -56, 59, 122, 41, 111}, sb);
                com.github.catvod.spider.merge.AB.c.g gVar2 = new com.github.catvod.spider.merge.AB.c.g();
                gVar2.y(strD);
                gVar2.a(strB);
                gVar2.j();
                gVar2.f(z());
                return gVar2.toString();
            }
            if (!TextUtils.isEmpty(com.github.catvod.spider.merge.AB.o.H.g())) {
                String strW = w(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "");
                if (strArr.length <= 4) {
                    com.github.catvod.spider.merge.AB.c.g gVar3 = new com.github.catvod.spider.merge.AB.c.g();
                    gVar3.y(com.github.catvod.spider.merge.AB.o.H.e(strW));
                    gVar3.j();
                    gVar3.f(z());
                    return gVar3.toString();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Proxy.getUrl());
                sb2.append("?do=danmu&vodName=");
                sb2.append(strArr[3]);
                sb2.append("&vodIndex=");
                sb2.append(strArr[4]);
                String strB2 = t.b(new byte[]{48, 14, 91, 7, -52, -1, -39, -96}, new byte[]{22, 120, 52, 99, -103, -115, -75, -99}, sb2);
                com.github.catvod.spider.merge.AB.c.g gVar4 = new com.github.catvod.spider.merge.AB.c.g();
                gVar4.y(com.github.catvod.spider.merge.AB.o.H.e(strW));
                gVar4.a(strB2);
                gVar4.j();
                gVar4.f(z());
                return gVar4.toString();
            }
        }
        if (Q()) {
            listA = x(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "");
            map.remove("Cookie");
            map.remove("Referer");
        } else {
            listA = A(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "", Boolean.TRUE);
        }
        if (!com.github.catvod.spider.merge.AB.o.H.b(5).booleanValue() || strArr.length <= 4) {
            com.github.catvod.spider.merge.AB.c.g gVar5 = new com.github.catvod.spider.merge.AB.c.g();
            gVar5.z(listA);
            gVar5.j();
            gVar5.f(map);
            return gVar5.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(Proxy.getUrl());
        sb3.append("?do=danmu&vodName=");
        sb3.append(strArr[3]);
        sb3.append("&vodIndex=");
        sb3.append(strArr[4]);
        String strB3 = t.b(new byte[]{-71, 96, 48, -82, -60, 26, 66, -112}, new byte[]{-97, 22, 95, -54, -111, 104, 46, -83}, sb3);
        com.github.catvod.spider.merge.AB.c.g gVar6 = new com.github.catvod.spider.merge.AB.c.g();
        gVar6.z(listA);
        gVar6.a(strB3);
        gVar6.j();
        gVar6.f(map);
        return gVar6.toString();
    }

    public final Object[] M(Map<String, String> map) {
        try {
            AlertDialog alertDialog = this.f;
            if (alertDialog != null && alertDialog.isShowing()) {
                return null;
            }
            map.get("templateId");
            map.get("shareId");
            map.get("mediaId");
            map.get("fileId");
            String str = map.get("cate");
            map.get("tokenId");
            String str2 = map.get("url");
            if (!"down".equals(str)) {
                str2 = "";
            }
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            List listAsList = Arrays.asList("referer", "icy-metadata", "range", "connection", "accept-encoding", "user-agent", "cookie");
            for (String str3 : map.keySet()) {
                if (listAsList.contains(str3)) {
                    treeMap.put(str3, map.get(str3));
                }
            }
            return com.github.catvod.spider.merge.AB.o.H.h(str2, treeMap);
        } catch (Exception unused) {
            return new Object[0];
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.AB.k.e>] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.AB.k.e>] */
    public final String N(String str) {
        com.github.catvod.spider.merge.AB.k.e eVar = (com.github.catvod.spider.merge.AB.k.e) j.get(str);
        this.e = eVar;
        if (eVar != null && eVar.a(str)) {
            SpiderDebug.log("uc shareToken:" + this.e.toString());
        }
        com.github.catvod.spider.merge.AB.k.e eVar2 = this.e;
        if (eVar2 != null && eVar2.a(str)) {
            return this.e.b().a();
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("pwd_id", str);
        jsonObject.addProperty("passcode", "");
        String strA = com.github.catvod.spider.merge.AB.m.c.g("https://pc-api.uc.cn/1/clouddrive/share/sharepage/token?pr=UCBrowser&fr=pc", jsonObject.toString(), y()).a();
        StringBuilder sb = new StringBuilder();
        v.a(new byte[]{-102, 38, 18, -29, 21, 116, -109, -83, -68, 13, 97, -7, 17, 96, -124, -100, -96, 14, 87, -1, 43}, new byte[]{-49, 101, 50, -111, 112, 18, -31, -56}, sb, str);
        sb.append("]...");
        sb.append(strA);
        SpiderDebug.log(sb.toString());
        try {
            com.github.catvod.spider.merge.AB.k.e eVar3 = (com.github.catvod.spider.merge.AB.k.e) new Gson().fromJson(strA, com.github.catvod.spider.merge.AB.k.e.class);
            this.e = eVar3;
            eVar3.e(str);
            eVar3.f();
            j.put(str, this.e);
            if (this.e.b() == null) {
                return "";
            }
            SpiderDebug.log("uc stToken:" + this.e.b().a());
            return this.e.b().a();
        } catch (Exception e) {
            SpiderDebug.log("refreshShareToken Uc:" + e);
            return "";
        }
    }

    public final boolean Q() {
        try {
            JSONObject jSONObject = this.b;
            if (jSONObject != null && jSONObject.optInt("status") == 0) {
                return true;
            }
            String strQ = c0.q(".uctv");
            if (TextUtils.isEmpty(strQ)) {
                throw new Exception("empty tvuc");
            }
            JSONObject jSONObject2 = new JSONObject(strQ);
            this.b = jSONObject2;
            if ((jSONObject2.optLong("start_time") + this.b.optLong("expires_in")) - (System.currentTimeMillis() / 1000) > 7200) {
                return true;
            }
            try {
                String str = System.currentTimeMillis() + "";
                String strOptString = this.b.optString("device_id");
                G(c0.a(strOptString + str), strOptString, "");
            } catch (Exception unused) {
            }
            return true;
        } catch (Exception e) {
            SpiderDebug.log("setTvObject e:" + e);
            return false;
        }
    }

    public final void R() {
        try {
            int iA = com.github.catvod.spider.merge.AB.J.a.a(16);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.setMargins(iA, iA, iA, iA);
            EditText editText = new EditText(Init.context());
            frameLayout.addView(editText, layoutParams);
            this.f = new AlertDialog.Builder(Init.getActivity()).setTitle("请输入UC Cookie【支持字符串和Http】").setView(frameLayout).setNeutralButton("点我，使用UC APP扫码", new DialogInterface.OnClickListener(this) { // from class: com.github.catvod.spider.merge.AB.b.L
                public final Q a;

                {
                    this.a = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    Q.f(this.a);
                }
            }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.ok, new com.github.catvod.spider.merge.AB.o.P(this, editText, 2)).show();
        } catch (Exception e) {
            e.printStackTrace();
            SpiderDebug.log("showInput2 ex: " + e.getMessage());
        }
    }

    public final void o() {
        try {
            try {
                String strQ = TextUtils.isEmpty(this.a) ? c0.q(".uc") : this.a;
                this.a = strQ;
                if (TextUtils.isEmpty(strQ)) {
                    throw new Exception("empty cookie");
                }
                if (!I()) {
                    throw new Exception("invalid cookie");
                }
                while (this.a.isEmpty()) {
                    SystemClock.sleep(300L);
                }
            } catch (Exception e) {
                this.a = "";
                c0.u(".uc", "");
                SystemClock.sleep(400L);
                SpiderDebug.log("checkCookie: " + e.getMessage());
                S();
                Init.run(new O(this, 0));
                while (this.a.isEmpty()) {
                    SystemClock.sleep(300L);
                }
            }
        } catch (Throwable th) {
            while (this.a.isEmpty()) {
                SystemClock.sleep(300L);
            }
            throw th;
        }
    }

    public final void p() {
        this.a = "";
        this.b = null;
        c0.d(".uc");
        c0.d(".uctv");
    }

    public final String w(String str, String str2, String str3) {
        try {
            String strE = E();
            N(str);
            str2 = q(str, str2, str3, Boolean.TRUE);
            if (TextUtils.isEmpty(str2)) {
                if (!TextUtils.isEmpty(str)) {
                    r(str2);
                }
                return "";
            }
            String str4 = "https://pc-api.uc.cn/1/clouddrive/file/download?pr=UCBrowser&fr=pc&sys=win32&ve=1.8.5&ut=" + strE;
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(str2);
            map.put("fids", arrayList);
            JSONObject jSONObject = new JSONObject(L(str4, map));
            if (jSONObject.getInt("status") == 200 && jSONObject.getInt("code") == 0) {
                String strOptString = jSONObject.optJSONArray("data").optJSONObject(0).optString("download_url");
                if (!TextUtils.isEmpty(str)) {
                    r(str2);
                }
                return strOptString;
            }
            if (!TextUtils.isEmpty(str)) {
                r(str2);
            }
            return "";
        } catch (Exception unused) {
            if (!TextUtils.isEmpty(str)) {
                r(str2);
            }
            return "";
        } catch (Throwable th) {
            if (!TextUtils.isEmpty(str)) {
                r(str2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final List<String> x(String str, String str2, String str3) {
        try {
            N(str);
            String strQ = q(str, str2, str3, Boolean.TRUE);
            if (TextUtils.isEmpty(strQ)) {
                return new ArrayList();
            }
            String str4 = System.currentTimeMillis() + "";
            String strOptString = this.b.optString("device_id");
            String strA = c0.a(strOptString + str4);
            String strOptString2 = this.b.optString("access_token");
            String strB = c0.b(String.format("GET&/file&%s&l3srvtd7p42l0d0x1u8d7yc8ye9kki4d", str4));
            String str5 = "https://open-api-drive.uc.cn/file?req_id=" + strA + "&access_token=" + strOptString2 + "&app_ver=1.6.8&device_id=" + strOptString + "&device_brand=vivo&platform=tv&device_name=V2238A&device_model=V2238A&build_device=V2238A&build_product=V2238A&device_gpu=Adreno%20(TM)%20640&activity_rect=%7B%7D&channel=UCTVOFFICIALWEB&method=streaming&group_by=source&fid=" + strQ + "&resolution=low,normal,high,super,2k,4k&support=dolby_vision";
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Linux; U; Android 12; zh-cn; V2238A Build/V417IR) AppleWebKit/533.1 (KHTML, like Gecko) Mobile Safari/533.1");
            map.put("x-pan-tm", str4);
            map.put("x-pan-token", strB);
            map.put("content-type", "text/plain;charset=UTF-8");
            map.put("x-pan-client-id", "5acf882d27b74502b7040b0c65519aa7");
            JSONObject jSONObject = new JSONObject(com.github.catvod.spider.merge.AB.m.c.l(str5, map));
            if (jSONObject.optInt("status") != 0) {
                return new ArrayList();
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONObject("data").optJSONArray("video_info");
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject.optInt("accessable") == 1) {
                    arrayList.add((String) this.g.get(jSONObjectOptJSONObject.optString("resolution")));
                    arrayList.add(jSONObjectOptJSONObject.optString("url"));
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return new ArrayList();
        }
    }
}
