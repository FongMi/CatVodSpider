package com.github.catvod.spider.merge.FM.b;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
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
import com.github.catvod.spider.merge.FM.c.C0332j;
import com.github.catvod.spider.merge.FM.g.C0346b;
import com.github.catvod.spider.merge.FM.k.C0363a;
import com.github.catvod.spider.merge.FM.k.C0365c;
import com.github.catvod.spider.merge.FM.k.C0367e;
import com.github.catvod.spider.merge.FM.m.C0378c;
import com.github.catvod.spider.merge.FM.m.C0380e;
import com.github.catvod.spider.merge.FM.o.C0394j;
import com.github.catvod.spider.merge.FM.o.C0396l;
import com.github.catvod.spider.merge.FM.o.C0397m;
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
    private static final String h = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) uc-cloud-drive/1.8.5 Chrome/100.0.4896.160 Electron/18.3.5.16-b62cf9c50d Safari/537.36 Channel/ucpan_other_ch";
    private static Map<String, C0367e> i;
    private String a;
    private ScheduledExecutorService b;
    private String c;
    private C0367e d;
    private AlertDialog e;
    private final Map<String, String> f;
    String g;

    Q() {
        Init.checkPermission();
        new ArrayList();
        HashMap map = new HashMap();
        this.f = map;
        map.put("4k", "4K");
        map.put("2k", "2K");
        map.put("super", "超清");
        map.put("high", "高清");
        map.put("low", "流畅");
        map.put("normal", "一般");
        i = new HashMap();
        z();
        SpiderDebug.log("UcYun Init");
    }

    private JSONObject B(JSONObject jSONObject, String str, String str2, Map<String, Object> map) {
        try {
            if (jSONObject.getInt("code") == 32003) {
                C0394j.b("夸克容量已经用完, 请手动删除");
                return null;
            }
            i = new HashMap();
            if (TextUtils.isEmpty(H(str))) {
                return null;
            }
            I(str);
            String strF = "";
            Iterator<C0363a> it = this.d.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C0363a next = it.next();
                String strB = next.b();
                if (strB == str2 || (strB != null && strB.equals(str2))) {
                    strF = next.f();
                    break;
                }
            }
            map.put("stoken", this.d.b().a());
            map.put("fid_token_list", Collections.singletonList(strF));
            return new JSONObject(F("https://pc-api.uc.cn/1/clouddrive/share/sharepage/save?pr=ucpro&fr=pc&uc_param_str=&__t=" + System.currentTimeMillis(), map));
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    private boolean C() {
        try {
            JSONObject jSONObject = new JSONObject(C0378c.n("https://pc-api.uc.cn/1/clouddrive/member?pr=UCBrowser&fr=pc&fetch_subscribe=true&_ch=home", u()));
            if (!"200".equals(jSONObject.optString("status"))) {
                throw new Exception();
            }
            jSONObject.optJSONObject("data").optString("member_type");
            if (TextUtils.isEmpty(com.github.catvod.spider.merge.FM.o.z.o(".uc"))) {
                com.github.catvod.spider.merge.FM.o.z.s(".uc", this.a);
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private void D(String str, C0363a c0363a, List<C0363a> list) {
        if (this.d.b() == null) {
            return;
        }
        String strB = c0363a.b();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 1;
        while (true) {
            StringBuilder sb = new StringBuilder();
            s.b(new byte[]{113, -56, -123, -9, -77, -105, 111, -35, 105, -33, -36, -26, -80, -60, 110, -121, 122, -110, -110, -23, -17, -100, 111, -111, 117, -45, -124, -29, -92, -33, 41, -124, 124, -109, -126, -17, -95, -33, 37, -35, 106, -44, -112, -11, -91, -35, 33, -107, 124, -109, -107, -30, -76, -52, 41, -98, 38, -52, -125, -70, -107, -18, 2, -128, 118, -53, -126, -30, -78, -117, 38, -128, 36, -52, -110, -95, -80, -38, 36, -83, 112, -40, -52}, new byte[]{25, -68, -15, -121, -64, -83, 64, -14}, sb, str);
            sb.append("&stoken=");
            sb.append(URLEncoder.encode(this.d.b().a()));
            s.b(new byte[]{-66, -71, -106, 21, -2, 57, -19, 24, -4, -12}, new byte[]{-104, -55, -14, 124, -116, 102, -117, 113}, sb, strB);
            sb.append("&force=0&_page=");
            sb.append(i2);
            sb.append("&_size=");
            sb.append(100);
            String strR = r(com.github.catvod.spider.merge.FM.L.P.a(new byte[]{18, 34, 119, -47, -88, 22, 75, -39, 86, 28, 127, -38, -71, 7, 30, -74, 18, 34, 119, -47, -88, 22, 75, -39, 71, 21, 112, -58, -71, 72, 19, -96, 107, 27, 116, -64, -65, 29, 124, -14, 91, 9, 112, -40, -31, 68, 5, -39, 71, 18, 99, -64, -31, 19, 74, -22, 81, 34, 101, -51, -84, 16, 25, -25, 71, 30, 61, -46, -75, 25, 70, -39, 90, 28, 124, -47, -26, 20, 80, -27}, new byte[]{52, 125, 17, -76, -36, 117, 35, -122}, sb));
            for (C0363a c0363a2 : ((C0365c) new Gson().fromJson(strR, C0365c.class)).a().a()) {
                if (c0363a2.h()) {
                    arrayList.add(c0363a2);
                } else if ((c0363a2.i() && c0363a2.a() == 1) || (c0363a2.i() && com.github.catvod.spider.merge.FM.o.z.i().contains(c0363a2.d()))) {
                    if (!this.d.b().b().equals(c0363a.c())) {
                        c0363a2.k(c0363a.c());
                    }
                    arrayList2.add(c0363a2);
                }
            }
            if (!arrayList2.isEmpty()) {
                list.addAll(arrayList2);
                arrayList2 = new ArrayList();
            }
            try {
                JSONObject jSONObject = new JSONObject(strR).getJSONObject("metadata");
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
            D(str, (C0363a) it.next(), list);
        }
    }

    private String F(String str, Map<String, Object> map) {
        C0380e c0380eG = C0378c.g(str, new JSONObject(map).toString(), u());
        List<String> list = c0380eG.c().get("set-cookie");
        this.c = this.a;
        if (!(list == null) && list.size() > 0) {
            String str2 = this.c;
            String str3 = "";
            try {
                String str4 = list.get(0).split(";")[0];
                String str5 = str4.split("=")[0];
                String str6 = str4.split("=")[1];
                String string = "";
                for (String str7 : str2.split(";")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    sb.append(str7.indexOf(str5) > 0 ? str4 : str7 + ";");
                    string = sb.toString();
                }
                str3 = string.contains(str5) ? string : string + str4;
            } catch (Exception unused) {
            }
            this.c = str3;
        }
        SpiderDebug.log("playCookie1: " + this.c);
        return c0380eG.a();
    }

    private void I(String str) {
        ArrayList arrayList = new ArrayList();
        C0363a c0363a = new C0363a();
        c0363a.j("");
        D(str, c0363a, arrayList);
        this.d.d(arrayList);
    }

    private void J(String str) {
        this.a = str;
        com.github.catvod.spider.merge.FM.o.z.s(".uc", this.a);
        C();
        L();
    }

    private void L() {
        ScheduledExecutorService scheduledExecutorService = this.b;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        Init.run(new RunnableC0309d(this, 3));
    }

    public static void a(Q q) {
        q.L();
    }

    public static void b(final Q q, final JSONObject jSONObject) {
        q.getClass();
        try {
            int iA = C0397m.a(240);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            final int i2 = 0;
            imageView.setImageBitmap(com.github.catvod.spider.merge.FM.E.a.b(jSONObject.optString("url"), iA));
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.gravity = 17;
            frameLayout.addView(imageView, layoutParams);
            AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getActivity()).setView(frameLayout).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.github.catvod.spider.merge.FM.b.K
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    Q.g(this.a);
                }
            }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.github.catvod.spider.merge.FM.b.M
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    Q.a(this.a);
                }
            }).show();
            q.e = alertDialogShow;
            alertDialogShow.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            Init.execute(new Runnable() { // from class: com.github.catvod.spider.merge.FM.b.O
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i2) {
                        case 0:
                            Q.j((Q) q, (JSONObject) jSONObject);
                            break;
                        default:
                            Bili.d((Bili) q, (C0346b) jSONObject);
                            break;
                    }
                }
            });
            C0394j.b("请使用UC App 扫描二维码");
        } catch (Exception unused) {
        }
    }

    public static void c(Q q, EditText editText) {
        q.getClass();
        String string = editText.getText().toString();
        q.p();
        Init.execute(new N(q, string, 0));
    }

    public static void d(Q q, String str) {
        q.getClass();
        if (str.startsWith("http")) {
            str = C0378c.n(str, null);
        }
        q.J(str);
    }

    public static /* synthetic */ void f(Q q, String str) {
        q.getClass();
        HashMap map = new HashMap();
        map.put("client_id", "381");
        map.put("v", "1.2");
        map.put("request_id", q.g);
        map.put("token", str);
        try {
            JSONObject jSONObject = new JSONObject(C0378c.h("https://api.open.uc.cn/cas/ajax/getServiceTicketByQrcodeToken?__dt=97123&_t=" + q.g, map, q.u()).a());
            if ("ok".equals(jSONObject.optString("message"))) {
                String strOptString = jSONObject.optJSONObject("data").optJSONObject("members").optString("service_ticket");
                HashMap map2 = new HashMap();
                map2.put("Accept", "application/json, text/plain, */*");
                map2.put("Referer", "https://drive.uc.cn/");
                String str2 = "";
                Iterator it = C0378c.e("https://drive.uc.cn/account/info?st=" + strOptString, map2).headers("set-cookie").iterator();
                while (it.hasNext()) {
                    str2 = str2 + ((String) it.next()).split(";")[0] + ";";
                }
                q.J(str2);
            }
        } catch (Exception unused) {
        }
    }

    public static void g(Q q) {
        q.L();
    }

    public static void i(Q q) {
        q.p();
        Init.execute(new RunnableC0307b(q, 2));
    }

    public static void j(Q q, JSONObject jSONObject) {
        q.getClass();
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        q.b = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(new H(q, jSONObject.optString("token"), 1), 1L, 1L, TimeUnit.SECONDS);
    }

    private boolean k(List list) {
        Exception e;
        HashMap map;
        String strOptString = "";
        for (int i2 = 0; i2 < 3; i2++) {
            try {
                map = new HashMap();
                map.put("filelist", list);
                map.put("exclude_fids", new ArrayList());
                map.put("action_type", 2);
            } catch (Exception e2) {
                e = e2;
                v.c(new byte[]{-3, -121, 118, 8, -8, -33, 36}, new byte[]{-103, -30, 26, 109, -116, -70, 30, -90}, new StringBuilder(), e);
                return true;
            }
            try {
                String strF = F("https://pc-api.uc.cn/1/clouddrive/file/delete?pr=UCBrowser&fr=pc", map);
                SpiderDebug.log("deleteResult:" + strF);
                strOptString = new JSONObject(strF).optJSONObject("data").optString("task_id");
                if (!TextUtils.isEmpty(strOptString)) {
                    break;
                }
            } catch (Exception e3) {
                e = e3;
                v.c(new byte[]{-3, -121, 118, 8, -8, -33, 36}, new byte[]{-103, -30, 26, 109, -116, -70, 30, -90}, new StringBuilder(), e);
                return true;
            }
        }
        if (TextUtils.isEmpty(strOptString)) {
            return k(list);
        }
        return true;
    }

    private String n(String str, String str2, String str3, Boolean bool) {
        String strF;
        try {
            List<C0363a> listC = this.d.c();
            if (listC == null || listC.size() == 0) {
                H(str);
                I(str);
                listC = this.d.c();
            }
            if (listC == null || listC.size() <= 0) {
                strF = "";
            } else {
                for (C0363a c0363a : listC) {
                    if (r.d(c0363a.b(), str2)) {
                        strF = c0363a.f();
                        break;
                    }
                }
                strF = "";
            }
            if (strF.isEmpty()) {
                return "";
            }
            String strS = s();
            byte b = 1;
            HashMap map = new HashMap();
            map.put("scene", "link");
            map.put("pdir_fid", "0");
            map.put("pwd_id", str);
            map.put(C0298a.b(new byte[]{115, 108, -57, -56, 119, -107}, new byte[]{0, 24, -88, -93, 18, -5, 116, 40}), this.d.b().a());
            byte b2 = -62;
            map.put("to_pdir_fid", strS);
            map.put("fid_list", Collections.singletonList(str2));
            map.put("fid_token_list", Collections.singletonList(strF));
            JSONObject jSONObject = new JSONObject(F("https://pc-api.uc.cn/1/clouddrive/share/sharepage/save?pr=UCBrowser&fr=pc&sys=win32&ve=1.5.2", map));
            if (jSONObject.getInt("code") == 41017) {
                return str2;
            }
            if (jSONObject.getInt("status") != 200 || jSONObject.getInt("code") != 0) {
                jSONObject = B(jSONObject, str, str2, map);
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
            int i2 = 0;
            int i3 = 5;
            while (i2 < i3) {
                StringBuilder sb = new StringBuilder();
                byte[] bArr = new byte[76];
                bArr[0] = 81;
                bArr[b] = -67;
                bArr[2] = -16;
                bArr[3] = -14;
                bArr[4] = b2;
                bArr[5] = 36;
                bArr[6] = -50;
                bArr[7] = 114;
                bArr[8] = 73;
                bArr[9] = -86;
                bArr[10] = -87;
                bArr[11] = -29;
                bArr[12] = -63;
                bArr[13] = 119;
                bArr[14] = -49;
                bArr[15] = 40;
                bArr[16] = 90;
                bArr[17] = -25;
                bArr[18] = -25;
                bArr[19] = -20;
                bArr[20] = -98;
                bArr[21] = 47;
                bArr[22] = -50;
                bArr[23] = 62;
                bArr[24] = 85;
                bArr[25] = -90;
                bArr[26] = -15;
                bArr[27] = -26;
                bArr[28] = -43;
                bArr[29] = 108;
                bArr[30] = -120;
                bArr[31] = 43;
                bArr[32] = 92;
                bArr[33] = -26;
                bArr[34] = -16;
                bArr[35] = -29;
                bArr[36] = b2;
                bArr[37] = 117;
                bArr[38] = -34;
                bArr[39] = 45;
                bArr[40] = 75;
                bArr[41] = -12;
                bArr[42] = -47;
                bArr[43] = -63;
                bArr[44] = -13;
                bArr[45] = 108;
                bArr[46] = -114;
                bArr[47] = 42;
                bArr[48] = 74;
                bArr[49] = -84;
                bArr[50] = -10;
                bArr[51] = -92;
                bArr[52] = -41;
                bArr[53] = 108;
                bArr[54] = -36;
                bArr[55] = 45;
                bArr[56] = 90;
                bArr[57] = -17;
                bArr[58] = -9;
                bArr[59] = -5;
                bArr[60] = b2;
                bArr[61] = 35;
                bArr[62] = -106;
                bArr[63] = 52;
                bArr[64] = 87;
                bArr[65] = -6;
                bArr[66] = -74;
                bArr[67] = -92;
                bArr[68] = -59;
                bArr[69] = 127;
                bArr[70] = -110;
                bArr[71] = 54;
                bArr[72] = 102;
                bArr[73] = -96;
                bArr[74] = -32;
                bArr[75] = -65;
                byte[] bArr2 = new byte[8];
                bArr2[0] = 57;
                bArr2[b] = -55;
                bArr2[2] = -124;
                bArr2[3] = -126;
                bArr2[4] = -79;
                bArr2[5] = 30;
                bArr2[6] = -31;
                bArr2[7] = 93;
                sb.append(C0298a.b(bArr, bArr2));
                sb.append(strOptString);
                byte[] bArr3 = new byte[13];
                bArr3[0] = 14;
                bArr3[b] = 40;
                bArr3[2] = -34;
                bArr3[3] = 121;
                bArr3[4] = -69;
                bArr3[5] = -3;
                bArr3[6] = 123;
                bArr3[7] = 86;
                bArr3[8] = 70;
                bArr3[9] = 62;
                bArr3[10] = -34;
                bArr3[11] = 117;
                bArr3[12] = -12;
                byte[] bArr4 = new byte[8];
                bArr4[0] = 40;
                bArr4[b] = 90;
                bArr4[2] = -69;
                bArr4[3] = 13;
                bArr4[4] = -55;
                bArr4[5] = -124;
                bArr4[6] = 36;
                bArr4[7] = 63;
                sb.append(C0298a.b(bArr3, bArr4));
                sb.append(i2);
                sb.append((int) b);
                byte[] bArr5 = new byte[5];
                bArr5[0] = 39;
                bArr5[b] = 36;
                bArr5[2] = 56;
                bArr5[3] = -46;
                bArr5[4] = 98;
                byte[] bArr6 = new byte[8];
                bArr6[0] = b;
                bArr6[b] = 123;
                bArr6[2] = 103;
                bArr6[3] = -90;
                bArr6[4] = 95;
                bArr6[5] = 9;
                bArr6[6] = -67;
                bArr6[7] = -7;
                sb.append(C0298a.b(bArr5, bArr6));
                sb.append(System.currentTimeMillis());
                JSONObject jSONObject2 = new JSONObject(r(sb.toString()));
                byte[] bArr7 = new byte[4];
                bArr7[0] = 3;
                bArr7[b] = -2;
                bArr7[2] = 70;
                bArr7[3] = 112;
                byte[] bArr8 = new byte[8];
                bArr8[0] = 103;
                bArr8[b] = -97;
                bArr8[2] = 50;
                bArr8[3] = 17;
                bArr8[4] = 82;
                bArr8[5] = -33;
                bArr8[6] = -43;
                bArr8[7] = 51;
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(C0298a.b(bArr7, bArr8));
                byte[] bArr9 = new byte[7];
                bArr9[0] = -93;
                bArr9[b] = -121;
                bArr9[2] = 7;
                bArr9[3] = -30;
                bArr9[4] = -8;
                bArr9[5] = 94;
                bArr9[6] = 19;
                byte[] bArr10 = new byte[8];
                bArr10[0] = -48;
                bArr10[b] = -26;
                bArr10[2] = 113;
                bArr10[3] = -121;
                bArr10[4] = -89;
                bArr10[5] = 63;
                bArr10[6] = 96;
                bArr10[7] = 35;
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(C0298a.b(bArr9, bArr10));
                byte[] bArr11 = new byte[16];
                bArr11[0] = -88;
                bArr11[b] = -86;
                bArr11[2] = 81;
                bArr11[3] = 71;
                bArr11[4] = 62;
                bArr11[5] = -42;
                bArr11[6] = 117;
                bArr11[7] = 80;
                bArr11[8] = -81;
                bArr11[9] = -92;
                bArr11[10] = 87;
                bArr11[11] = 125;
                bArr11[12] = 7;
                bArr11[13] = -34;
                bArr11[14] = 98;
                bArr11[15] = 124;
                byte[] bArr12 = new byte[8];
                bArr12[0] = -37;
                bArr12[b] = -53;
                bArr12[2] = 39;
                bArr12[3] = 34;
                bArr12[4] = 97;
                bArr12[5] = -73;
                bArr12[6] = 6;
                bArr12[7] = 15;
                jSONArray = jSONObjectOptJSONObject2.optJSONArray(C0298a.b(bArr11, bArr12));
                if (jSONArray.length() > 0) {
                    break;
                }
                TimeUnit.SECONDS.sleep(1L);
                i2++;
                i3 = 5;
                b = 1;
                b2 = -62;
            }
            return (bool.booleanValue() && jSONArray.length() == 0) ? n(str, str2, str3, Boolean.FALSE) : jSONArray.optString(0);
        } catch (Exception e) {
            v.c(new byte[]{-9, 37, -67, -90, -109, -32, -104, 33, -25}, new byte[]{-126, 70, -99, -59, -4, -112, -31, 1}, new StringBuilder(), e);
            return "";
        }
    }

    private void o(String str) {
        List listSingletonList = Collections.singletonList(str);
        ArrayList arrayList = new ArrayList();
        try {
            String strS = s();
            byte b = -19;
            int i2 = 4;
            char c = 5;
            byte b2 = -98;
            char c2 = 6;
            if (strS.equals("0")) {
                return;
            }
            y();
            int i3 = 1;
            while (true) {
                byte[] bArr = new byte[161];
                bArr[0] = -16;
                bArr[1] = 111;
                bArr[2] = -1;
                bArr[3] = 19;
                bArr[i2] = 99;
                bArr[c] = 20;
                bArr[c2] = 80;
                bArr[7] = -57;
                bArr[8] = -24;
                bArr[9] = 120;
                bArr[10] = -90;
                bArr[11] = 2;
                bArr[12] = 96;
                bArr[13] = 71;
                bArr[14] = 81;
                bArr[15] = -99;
                bArr[16] = -5;
                bArr[17] = 53;
                bArr[18] = -24;
                bArr[19] = 13;
                bArr[20] = 63;
                bArr[21] = 31;
                bArr[22] = 80;
                bArr[23] = -117;
                bArr[24] = -12;
                bArr[25] = 116;
                bArr[26] = -2;
                bArr[27] = 7;
                bArr[28] = 116;
                bArr[29] = 92;
                bArr[30] = 22;
                bArr[31] = b2;
                bArr[32] = -3;
                bArr[33] = 52;
                bArr[34] = b;
                bArr[35] = 10;
                bArr[36] = 124;
                bArr[37] = 75;
                bArr[38] = 80;
                bArr[39] = -101;
                bArr[40] = -9;
                bArr[41] = 105;
                bArr[42] = -1;
                bArr[43] = 92;
                bArr[44] = 96;
                bArr[45] = 92;
                bArr[46] = 66;
                bArr[47] = -67;
                bArr[48] = -37;
                bArr[49] = 89;
                bArr[50] = -7;
                bArr[51] = 12;
                bArr[52] = 103;
                bArr[53] = 93;
                bArr[54] = 26;
                bArr[55] = -102;
                bArr[56] = -66;
                bArr[57] = 125;
                bArr[58] = -7;
                bArr[59] = 94;
                bArr[60] = 96;
                bArr[61] = 77;
                bArr[62] = 89;
                bArr[63] = -104;
                bArr[64] = -4;
                bArr[65] = 114;
                bArr[66] = -7;
                bArr[67] = 60;
                bArr[68] = 118;
                bArr[69] = 71;
                bArr[70] = 27;
                bArr[71] = -43;
                bArr[72] = -67;
                bArr[73] = 104;
                bArr[74] = -83;
                bArr[75] = 60;
                bArr[76] = 96;
                bArr[77] = 79;
                bArr[78] = 24;
                bArr[79] = -115;
                bArr[80] = -91;
                bArr[81] = 62;
                bArr[82] = -8;
                bArr[83] = 69;
                bArr[84] = 79;
                bArr[85] = 93;
                bArr[86] = 22;
                bArr[87] = -110;
                bArr[88] = -3;
                bArr[89] = 38;
                bArr[90] = -82;
                bArr[91] = 16;
                bArr[92] = 54;
                bArr[93] = 113;
                bArr[94] = 25;
                bArr[95] = -115;
                bArr[96] = -20;
                bArr[97] = 120;
                bArr[98] = -29;
                bArr[99] = 60;
                bArr[100] = 100;
                bArr[101] = 65;
                bArr[102] = 11;
                bArr[103] = -119;
                bArr[104] = -12;
                bArr[105] = 38;
                bArr[106] = -70;
                bArr[107] = 69;
                bArr[108] = 79;
                bArr[109] = 72;
                bArr[110] = 26;
                bArr[111] = -100;
                bArr[112] = -5;
                bArr[113] = 115;
                bArr[114] = -44;
                bArr[115] = 16;
                bArr[116] = 101;
                bArr[117] = 76;
                bArr[118] = 32;
                bArr[119] = -116;
                bArr[120] = -15;
                bArr[121] = 105;
                bArr[122] = -8;
                bArr[123] = 94;
                bArr[124] = 32;
                bArr[125] = 8;
                bArr[126] = 32;
                bArr[127] = -101;
                bArr[128] = -9;
                bArr[129] = 105;
                bArr[130] = -1;
                bArr[131] = 94;
                bArr[132] = 118;
                bArr[133] = 71;
                bArr[134] = 19;
                bArr[135] = -115;
                bArr[136] = -57;
                bArr[137] = 111;
                bArr[138] = -14;
                bArr[139] = 19;
                bArr[140] = 117;
                bArr[141] = 20;
                bArr[142] = 30;
                bArr[143] = -101;
                bArr[144] = -5;
                bArr[145] = 55;
                bArr[146] = -2;
                bArr[147] = 19;
                bArr[148] = 116;
                bArr[149] = 79;
                bArr[150] = 11;
                bArr[151] = -115;
                bArr[152] = -4;
                bArr[153] = 68;
                bArr[154] = -22;
                bArr[155] = 23;
                bArr[156] = 42;
                bArr[157] = 74;
                bArr[158] = 26;
                bArr[159] = -101;
                bArr[160] = -5;
                byte[] bArr2 = new byte[8];
                bArr2[0] = -104;
                bArr2[1] = 27;
                bArr2[2] = -117;
                bArr2[3] = 99;
                bArr2[i2] = 16;
                bArr2[c] = 46;
                bArr2[c2] = 127;
                bArr2[7] = -24;
                JSONObject jSONObject = new JSONObject(r(String.format(C0298a.b(bArr, bArr2), strS, Integer.valueOf(i3), 100)));
                byte[] bArr3 = new byte[i2];
                bArr3[0] = b2;
                bArr3[1] = 125;
                bArr3[2] = 101;
                bArr3[3] = -16;
                byte[] bArr4 = new byte[8];
                bArr4[0] = -6;
                bArr4[1] = 28;
                bArr4[2] = 17;
                bArr4[3] = -111;
                bArr4[i2] = 38;
                bArr4[c] = -31;
                bArr4[c2] = -4;
                bArr4[7] = 34;
                JSONObject jSONObject2 = jSONObject.getJSONObject(C0298a.b(bArr3, bArr4));
                byte[] bArr5 = new byte[i2];
                bArr5[0] = -76;
                bArr5[1] = -86;
                bArr5[2] = -98;
                bArr5[3] = -75;
                byte[] bArr6 = new byte[8];
                bArr6[0] = -40;
                bArr6[1] = -61;
                bArr6[2] = -19;
                bArr6[3] = -63;
                bArr6[i2] = -62;
                bArr6[c] = -80;
                bArr6[6] = -23;
                bArr6[7] = 80;
                JSONArray jSONArray = jSONObject2.getJSONArray(C0298a.b(bArr5, bArr6));
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    arrayList.add(jSONArray.getJSONObject(i4).getString("fid"));
                }
                b2 = -98;
                JSONObject jSONObject3 = jSONObject.getJSONObject("metadata");
                if (jSONObject3.getInt("_size") != jSONObject3.getInt("_count") || jSONObject3.getInt("_count") == 0) {
                    break;
                }
                i3++;
                b = -19;
                i2 = 4;
                c = 5;
                c2 = 6;
            }
            if (arrayList.size() == 0) {
                return;
            }
            String str2 = (String) listSingletonList.get(0);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (r.d(str2, (String) it.next())) {
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
            for (int i5 = 0; i5 < iCeil; i5++) {
                int i6 = i5 * 50;
                k(new ArrayList(arrayList.subList(i6, Math.min(i6 + 50, size))));
            }
        } catch (Exception e) {
            v.c(new byte[]{-60, 86, -27, 119, 59, 1, 17, -67, -60, 90, -5, 50, 35, 13, 66, -71, -128, 86, -5, 96, 117}, new byte[]{-96, 51, -119, 18, 79, 100, 49, -51}, new StringBuilder(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        try {
            AlertDialog alertDialog = this.e;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    public static Q q() {
        return P.a;
    }

    private String r(String str) {
        return C0378c.n(str, u());
    }

    private String s() {
        try {
            JSONArray jSONArray = new JSONObject(r("https://pc-api.uc.cn/1/clouddrive/file/sort?pr=UCBrowser&fr=pc&pdir_fid=0&_page=1&_size=50&_fetch_total=1&_fetch_sub_dirs=0&_sort=file_type:asc,updated_at:desc")).getJSONObject("data").getJSONArray("list");
            String string = "";
            int i2 = 0;
            while (true) {
                if (i2 >= jSONArray.length()) {
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
            return new JSONObject(F("https://pc-api.uc.cn/1/clouddrive/file?pr=UCBrowser&fr=pc", map)).getJSONObject("data").getString("fid");
        } catch (Exception e) {
            v.c(new byte[]{95, -22, -66, 43, -40, -63, -127, 55, 92, -26, -72, 72, -46, -55, -62, 71}, new byte[]{56, -113, -54, 104, -73, -79, -8, 103}, new StringBuilder(), e);
            return "0";
        }
    }

    private Map<String, String> u() {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(this.a)) {
            map.put("Cookie", this.a);
        }
        map.put("Referer", "https://drive.uc.cn");
        map.put("User-Agent", h);
        return map;
    }

    private Map<String, String> v() {
        String str;
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(this.c)) {
            str = this.a;
        } else {
            str = this.a + ";" + this.c;
        }
        map.put("Cookie", str);
        map.put("Referer", "https://drive.uc.cn/");
        map.put("User-Agent", h);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        try {
            this.g = System.currentTimeMillis() + "";
            String str = "https://api.open.uc.cn/cas/ajax/getTokenForQrcodeLogin?__dt=641254&__t=" + this.g;
            HashMap map = new HashMap();
            map.put("Accept", C0298a.b(new byte[]{93, -48, -29, -14, -101, 26, 4, 12, 85, -49, -3, -79, -104, 10, 10, 22, 16, -128, -25, -5, -118, 13, 74, 8, 80, -63, -6, -16, -34, 89, 79, 87, 22}, new byte[]{60, -96, -109, -98, -14, 121, 101, 120}));
            map.put("Content-Type", "application/x-www-form-urlencoded");
            map.put("User-Agent", h);
            map.put("Referer", "https://broccoli.uc.cn/");
            HashMap map2 = new HashMap();
            map2.put("client_id", "381");
            map2.put("v", "1.2");
            map2.put("request_id", this.g);
            String strOptString = new JSONObject(C0378c.h(str, map2, map).a()).optJSONObject("data").optJSONObject("members").optString(C0298a.b(new byte[]{-58, 1, 35, 28, 19}, new byte[]{-78, 110, 72, 121, 125, 83, 123, 17}));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0298a.b(new byte[]{0, 81, 77}, new byte[]{117, 35, 33, 80, -98, 106, 56, 94}), "https://su.uc.cn/1_n0ZCv?uc_param_str=dsdnfrpfbivesscpgimibtbmnijblauputogpintnwktprchmt&token=" + strOptString + "&client_id=381&uc_biz_str=S%3Acustom%7CC%3Atitlebar_fix");
            jSONObject.put("token", strOptString);
            Init.run(new RunnableC0311f(this, jSONObject, 2));
        } catch (Exception e) {
            v.c(new byte[]{-35, -82, 73, -100, 106, 73, -36, 53, -33, -21, 88, -9, 24}, new byte[]{-70, -53, 61, -51, 56, 10, -77, 81}, new StringBuilder(), e);
        }
    }

    private String z() {
        return C0378c.b("https://pc-api.uc.cn/1/clouddrive/file", u()).a();
    }

    public final C0332j A(String str, String str2, String str3) {
        if (TextUtils.isEmpty(H(str))) {
            return com.github.catvod.spider.merge.FM.o.z.c();
        }
        ArrayList arrayList = new ArrayList();
        C0363a c0363a = new C0363a();
        c0363a.j(str2);
        D(str, c0363a, arrayList);
        if (arrayList.size() < 1) {
            return com.github.catvod.spider.merge.FM.o.z.c();
        }
        this.d.d(arrayList);
        List listAsList = Arrays.asList("UC原画");
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            String strA = "";
            if (!it.hasNext()) {
                break;
            }
            C0363a c0363a2 = (C0363a) it.next();
            if (c0363a2.e() != null && !c0363a2.e().isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                sb.append(c0363a2.e().trim());
                strA = com.github.catvod.spider.merge.FM.L.P.a(new byte[]{-73}, new byte[]{-22, -33, -67, 55, -111, 97, 64, -67}, sb);
            }
            StringBuilder sbB = com.github.catvod.spider.merge.FM.L.P.b(strA);
            sbB.append(c0363a2.c());
            sbB.append(c0363a2.g());
            s.b(new byte[]{123}, new byte[]{95, 125, 125, 42, 107, -48, 97, 18}, sbB, str);
            sbB.append(Marker.ANY_NON_NULL_MARKER);
            sbB.append(c0363a2.b());
            sbB.append(Marker.ANY_NON_NULL_MARKER);
            sbB.append(c0363a2.f());
            String string = sbB.toString();
            if (!TextUtils.isEmpty(str3) && !str3.contains("http")) {
                StringBuilder sbB2 = com.github.catvod.spider.merge.FM.L.P.b(string);
                s.b(new byte[]{98}, new byte[]{73, 19, -17, -111, 38, 103, -38, -2}, sbB2, str3);
                sbB2.append(Marker.ANY_NON_NULL_MARKER);
                sbB2.append(c0363a2.c());
                string = sbB2.toString();
            }
            arrayList2.add(string);
        }
        for (int i2 = 0; i2 < listAsList.size(); i2++) {
            arrayList3.add(TextUtils.join("#", arrayList2));
        }
        C0332j c0332j = new C0332j();
        c0332j.g(str);
        c0332j.e(str);
        c0332j.i("");
        c0332j.h(this.d.b() == null ? "获取视频名称失败" : this.d.b().b());
        c0332j.k(TextUtils.join("$$$", arrayList3));
        c0332j.j(TextUtils.join("$$$", listAsList));
        c0332j.b("UC网盘");
        return c0332j;
    }

    public final String E(String[] strArr, String str) throws Throwable {
        if (TextUtils.isEmpty(this.a)) {
            l();
        }
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(this.c)) {
            map.put("Cookie", this.c);
        }
        map.put("Referer", "https://drive.uc.cn");
        map.put("User-Agent", h);
        if (C0396l.b(1).booleanValue()) {
            String strC = C0396l.c(t(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : ""), 60, 100);
            if (strArr.length <= 4) {
                C0329g c0329g = new C0329g();
                c0329g.x(strC);
                c0329g.j();
                c0329g.f(v());
                return c0329g.toString();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(Proxy.getUrl());
            sb.append("?do=appdanmu&vodName=");
            sb.append(strArr[3]);
            sb.append("&vodIndex=");
            sb.append(strArr[4]);
            String strA = com.github.catvod.spider.merge.FM.L.P.a(new byte[]{86, 67, 5, -31, 75, 7, -84, 30}, new byte[]{112, 53, 106, -123, 30, 117, -64, 35}, sb);
            C0329g c0329g2 = new C0329g();
            c0329g2.x(strC);
            c0329g2.a(strA);
            c0329g2.j();
            c0329g2.f(v());
            return c0329g2.toString();
        }
        if (!str.split("#")[0].contains("原画")) {
            List<String> listW = w(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "", Boolean.TRUE);
            if (strArr.length <= 4) {
                C0329g c0329g3 = new C0329g();
                c0329g3.y(listW);
                c0329g3.j();
                c0329g3.f(map);
                return c0329g3.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Proxy.getUrl());
            sb2.append("?do=appdanmu&vodName=");
            sb2.append(strArr[3]);
            sb2.append("&vodIndex=");
            sb2.append(strArr[4]);
            String strA2 = com.github.catvod.spider.merge.FM.L.P.a(new byte[]{-12, 124, 52, 21, 88, 69, -62, 8}, new byte[]{-46, 10, 91, 113, 13, 55, -82, 53}, sb2);
            C0329g c0329g4 = new C0329g();
            c0329g4.y(listW);
            c0329g4.a(strA2);
            c0329g4.j();
            c0329g4.f(map);
            return c0329g4.toString();
        }
        if (!TextUtils.isEmpty(C0396l.f())) {
            String strT = t(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "");
            if (strArr.length <= 4) {
                C0329g c0329g5 = new C0329g();
                c0329g5.x(C0396l.d(strT));
                c0329g5.j();
                c0329g5.f(v());
                return c0329g5.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Proxy.getUrl());
            sb3.append("?do=appdanmu&vodName=");
            sb3.append(strArr[3]);
            sb3.append("&vodIndex=");
            sb3.append(strArr[4]);
            String strA3 = com.github.catvod.spider.merge.FM.L.P.a(new byte[]{-110, -10, 27, -23, -79, 40, 66, 89}, new byte[]{-76, -128, 116, -115, -28, 90, 46, 100}, sb3);
            C0329g c0329g6 = new C0329g();
            c0329g6.x(C0396l.d(strT));
            c0329g6.a(strA3);
            c0329g6.j();
            c0329g6.f(v());
            return c0329g6.toString();
        }
        String strT2 = t(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "");
        String str2 = strArr[0];
        String str3 = strArr[1];
        String str4 = strArr.length > 2 ? strArr[2] : "";
        String strEncode = URLEncoder.encode(strT2);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(Proxy.getUrl());
        String str5 = String.format(com.github.catvod.spider.merge.FM.L.P.a(new byte[]{73, -45, 89, -126, 82, 69, -128, -43, 2, -50, 70, -38, 14, 95, -128, -105, 19, -40, 16, -52, 90, 93, -116, -50, 3, -44, 16, -36, 82, 93, -116, -50, 83, -60, 16, -52, 91, 72, -101, -106, 63, -45, 11, -102, 64, 15, -113, -102, 26, -46, 127, -37, 14, 12, -102, -43, 2, -40, 93, -38, 93, 96, -115, -50, 83, -60, 16, -54, 65, 69, -44, -42, 5}, new byte[]{118, -73, 54, -65, 51, 41, -23, -13}, sb4), "down", str2, str3, str4, strEncode);
        if (strArr.length <= 4) {
            C0329g c0329g7 = new C0329g();
            c0329g7.x(str5);
            c0329g7.j();
            c0329g7.f(map);
            return c0329g7.toString();
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(Proxy.getUrl());
        sb5.append("?do=appdanmu&vodName=");
        sb5.append(strArr[3]);
        sb5.append("&vodIndex=");
        sb5.append(strArr[4]);
        String strA4 = com.github.catvod.spider.merge.FM.L.P.a(new byte[]{21, -39, -114, 14, -59, -103, 30, -123}, new byte[]{51, -81, -31, 106, -112, -21, 114, -72}, sb5);
        C0329g c0329g8 = new C0329g();
        c0329g8.x(str5);
        c0329g8.a(strA4);
        c0329g8.j();
        c0329g8.f(map);
        return c0329g8.toString();
    }

    public final Object[] G(Map<String, String> map) {
        try {
            AlertDialog alertDialog = this.e;
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
            return C0396l.g(str2, treeMap);
        } catch (Exception unused) {
            return new Object[0];
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.FM.k.e>] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.FM.k.e>] */
    public final String H(String str) {
        C0367e c0367e = (C0367e) i.get(str);
        this.d = c0367e;
        if (c0367e != null && c0367e.a(str)) {
            SpiderDebug.log("uc shareToken:" + this.d.toString());
        }
        C0367e c0367e2 = this.d;
        if (c0367e2 != null && c0367e2.a(str)) {
            return this.d.b().a();
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("pwd_id", str);
        jsonObject.addProperty("passcode", "");
        String strA = C0378c.g("https://pc-api.uc.cn/1/clouddrive/share/sharepage/token?pr=UCBrowser&fr=pc", jsonObject.toString(), u()).a();
        StringBuilder sb = new StringBuilder();
        s.b(new byte[]{55, -37, 16, 110, -30, 109, 10, 119, 17, -16, 99, 116, -26, 121, 29, 70, 13, -13, 85, 114, -36}, new byte[]{98, -104, 48, 28, -121, 11, 120, 18}, sb, str);
        sb.append("]...");
        sb.append(strA);
        SpiderDebug.log(sb.toString());
        try {
            C0367e c0367e3 = (C0367e) new Gson().fromJson(strA, C0367e.class);
            this.d = c0367e3;
            c0367e3.e(str);
            c0367e3.f();
            i.put(str, this.d);
            if (this.d.b() == null) {
                return "";
            }
            SpiderDebug.log("uc stToken:" + this.d.b().a());
            return this.d.b().a();
        } catch (Exception e) {
            v.c(new byte[]{-3, 109, 15, 39, -108, 66, -69, 29, -25, 105, 27, 48, -91, 94, -72, 43, -31, 40, 60, 54, -53}, new byte[]{-113, 8, 105, 85, -15, 49, -45, 78}, new StringBuilder(), e);
            return "";
        }
    }

    public final void K() {
        try {
            Toast.makeText(Init.context(), "还未登录UC账号,请前往【配置中心】登录", 1).show();
        } catch (Exception e) {
            e.printStackTrace();
            SpiderDebug.log("showInput2 ex: " + e.getMessage());
        }
    }

    public final void l() {
        int i2 = 2;
        try {
            try {
                String strO = TextUtils.isEmpty(this.a) ? com.github.catvod.spider.merge.FM.o.z.o("uc_cookie.txt") : this.a;
                this.a = strO;
                if (TextUtils.isEmpty(strO)) {
                    throw new Exception("empty cookie");
                }
                if (!C()) {
                    throw new Exception("invalid cookie");
                }
                while (this.a.isEmpty()) {
                    SystemClock.sleep(300L);
                }
            } catch (Exception e) {
                m();
                SystemClock.sleep(400L);
                SpiderDebug.log("checkCookie: " + e.getMessage());
                L();
                Init.run(new RunnableC0306a(this, i2));
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

    public final void m() {
        this.a = "";
        com.github.catvod.spider.merge.FM.o.z.s(".uc", this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String t(java.lang.String r29, java.lang.String r30, java.lang.String r31) throws java.lang.Throwable {
        /*
            r28 = this;
            r1 = r28
            java.lang.String r0 = ""
            java.lang.String r2 = r28.z()     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L9e
            r28.H(r29)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L9e
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L9e
            r4 = r29
            r5 = r30
            r6 = r31
            java.lang.String r3 = r1.n(r4, r5, r6, r3)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> La0
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> La1
            if (r5 == 0) goto L27
            boolean r2 = android.text.TextUtils.isEmpty(r29)
            if (r2 != 0) goto L26
            r1.o(r3)
        L26:
            return r0
        L27:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> La1
            r5.<init>()     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> La1
            r8 = 0
            java.lang.String r6 = "https://pc-api.uc.cn/1/clouddrive/file/download?pr=UCBrowser&fr=pc&sys=win32&ve=1.8.5&ut="
            r5.append(r6)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> La1
            r5.append(r2)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> La1
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> La1
            java.util.HashMap r5 = new java.util.HashMap     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> La1
            r5.<init>()     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> La1
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> La1
            r6.<init>()     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> La1
            r6.add(r3)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> La1
            java.lang.String r7 = "fids"
            r5.put(r7, r6)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> La1
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> La1
            java.lang.String r2 = r1.F(r2, r5)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> La1
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> La1
            java.lang.String r2 = "status"
            int r2 = r6.getInt(r2)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> La1
            r5 = 200(0xc8, float:2.8E-43)
            if (r2 != r5) goto L82
            java.lang.String r2 = "code"
            int r2 = r6.getInt(r2)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> La1
            if (r2 == 0) goto L68
            goto L82
        L68:
            java.lang.String r2 = "data"
            org.json.JSONArray r2 = r6.optJSONArray(r2)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> La1
            org.json.JSONObject r2 = r2.optJSONObject(r8)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> La1
            java.lang.String r5 = "download_url"
            java.lang.String r0 = r2.optString(r5)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> La1
            boolean r2 = android.text.TextUtils.isEmpty(r29)
            if (r2 != 0) goto L81
            r1.o(r3)
        L81:
            return r0
        L82:
            boolean r2 = android.text.TextUtils.isEmpty(r29)
            if (r2 != 0) goto L8b
            r1.o(r3)
        L8b:
            return r0
        L8c:
            r0 = move-exception
            goto L94
        L8e:
            r0 = move-exception
            goto L93
        L90:
            r0 = move-exception
            r5 = r30
        L93:
            r3 = r5
        L94:
            boolean r2 = android.text.TextUtils.isEmpty(r29)
            if (r2 != 0) goto L9d
            r1.o(r3)
        L9d:
            throw r0
        L9e:
            r5 = r30
        La0:
            r3 = r5
        La1:
            boolean r2 = android.text.TextUtils.isEmpty(r29)
            if (r2 != 0) goto Laa
            r1.o(r3)
        Laa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.FM.b.Q.t(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.String> w(java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.Boolean r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.FM.b.Q.w(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):java.util.List");
    }

    public final long y() {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }
}
