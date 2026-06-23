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
import com.github.catvod.spider.merge.FM.j.C0361a;
import com.github.catvod.spider.merge.FM.m.C0378c;
import com.github.catvod.spider.merge.FM.m.C0380e;
import com.github.catvod.spider.merge.FM.o.C0385a;
import com.github.catvod.spider.merge.FM.o.C0392h;
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
public final class J {
    private static final String h = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) quark-cloud-drive/3.0.1 Chrome/100.0.4896.160 Electron/18.3.5.12-a038f7b798 Safari/537.36 Channel/pckk_other_ch";
    private static Map<String, com.github.catvod.spider.merge.FM.j.e> i;
    public static final /* synthetic */ int j = 0;
    private String a;
    private ScheduledExecutorService b;
    private String c;
    private com.github.catvod.spider.merge.FM.j.e d;
    private AlertDialog e;
    private final Map<String, String> f;
    private C0392h g;

    J() {
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
        SpiderDebug.log("QuarkYun Init");
    }

    private JSONObject A(JSONObject jSONObject, String str, String str2, Map<String, Object> map) {
        try {
            if (jSONObject.getInt("code") == 32003) {
                C0394j.b("夸克容量已经用完, 请手动删除");
                return null;
            }
            i = new HashMap();
            if (TextUtils.isEmpty(I(str))) {
                return null;
            }
            J(str);
            String strF = "";
            Iterator<C0361a> it = this.d.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C0361a next = it.next();
                String strB = next.b();
                if (strB == str2 || (strB != null && strB.equals(str2))) {
                    strF = next.f();
                    break;
                }
            }
            map.put("stoken", this.d.b().a());
            map.put("fid_token_list", Collections.singletonList(strF));
            return new JSONObject(F("https://drive-pc.quark.cn/1/clouddrive/share/sharepage/save?pr=ucpro&fr=pc&uc_param_str=&__t=" + System.currentTimeMillis(), map));
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    private boolean B() {
        try {
            JSONObject jSONObject = new JSONObject(C0378c.n("https://drive-pc.quark.cn/1/clouddrive/member?pr=ucpro&fr=pc&uc_param_str=&fetch_subscribe=true&_ch=home&fetch_identity=true", t()));
            if (!"200".equals(jSONObject.optString("status"))) {
                throw new Exception();
            }
            this.c = jSONObject.optJSONObject("data").optString("member_type");
            if (TextUtils.isEmpty(com.github.catvod.spider.merge.FM.o.z.o(".quark"))) {
                z();
                com.github.catvod.spider.merge.FM.o.z.s(".quark", this.a);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(String str) {
        try {
            JSONObject jSONObject = new JSONObject(C0378c.m("https://uop.quark.cn/cas/ajax/getServiceTicketByQrcodeToken?client_id=532&v=1.2&token=" + str));
            if ("ok".equals(jSONObject.optString("message"))) {
                String strOptString = jSONObject.optJSONObject("data").optJSONObject("members").optString("service_ticket");
                HashMap map = new HashMap();
                map.put("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/38.0.2125.122 Safari/537.36 SE 2.X MetaSr 1.0");
                map.put("Accept", "application/json, text/plain, */*");
                map.put("Referer", "https://pan.quark.cn/");
                List listHeaders = C0378c.e(C0298a.b(new byte[]{103, -23, 0, 76, -6, 123, 36, -89, 127, -4, 26, 18, -8, 52, 106, -6, 100, -77, 23, 82, -90, 32, 104, -21, 96, -24, 26, 72, -90, 40, 101, -18, 96, -94, 7, 72, -76}, new byte[]{15, -99, 116, 60, -119, 65, 11, -120}) + strOptString + "&lw=scan", map).headers("set-cookie");
                String str2 = "";
                Iterator it = listHeaders.iterator();
                while (it.hasNext()) {
                    str2 = str2 + ((String) it.next()).split(";")[0] + ";";
                }
                K(str2);
            }
        } catch (Exception unused) {
        }
    }

    private void D(String str, C0361a c0361a, List<C0361a> list) {
        if (this.d.b() == null) {
            return;
        }
        String strB = c0361a.b();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 1;
        while (true) {
            StringBuilder sb = new StringBuilder();
            s.b(new byte[]{-84, 106, 84, -51, -6, -58, -93, -119, -96, 108, 73, -53, -20, -47, -4, -59, -22, 111, 85, -36, -5, -105, -94, -59, -86, 49, 17, -110, -22, -112, -29, -45, -96, 122, 82, -44, -1, -103, -93, -43, -84, 127, 82, -40, -90, -113, -28, -57, -74, 123, 80, -36, -18, -103, -93, -62, -95, 106, 65, -44, -27, -61, -4, -44, -7, 107, 67, -51, -5, -109, -86, -64, -74, 35, 80, -34, -81, -119, -17, -7, -76, 127, 82, -36, -28, -93, -1, -46, -74, 35, 6, -51, -2, -104, -45, -49, -96, 35}, new byte[]{-60, 30, 32, -67, -119, -4, -116, -90}, sb, str);
            sb.append("&stoken=");
            sb.append(URLEncoder.encode(this.d.b().a()));
            s.b(new byte[]{122, 68, 79, -42, -46, 88, -59, -68, 56, 9}, new byte[]{92, 52, 43, -65, -96, 7, -93, -43}, sb, strB);
            sb.append("&force=0&_page=");
            sb.append(i2);
            sb.append("&_size=");
            sb.append(100);
            String strQ = q(com.github.catvod.spider.merge.FM.L.P.a(new byte[]{44, 37, -12, -121, -69, -87, -35, 126, 99, 22, -30, -73, -67, -92, -112, 125, 48, 27, -12, -117, -27, -69, -119, 116, 111, 37, -23, -119, -92, -72, -38, 121, 121, 25}, new byte[]{10, 122, -121, -24, -55, -35, -32, 24}, sb));
            for (C0361a c0361a2 : ((com.github.catvod.spider.merge.FM.j.c) new Gson().fromJson(strQ, com.github.catvod.spider.merge.FM.j.c.class)).a().a()) {
                if (c0361a2.h()) {
                    arrayList.add(c0361a2);
                } else if ((c0361a2.i() && c0361a2.a() == 1) || (c0361a2.i() && com.github.catvod.spider.merge.FM.o.z.i().contains(c0361a2.d()))) {
                    if (!this.d.b().b().equals(c0361a.c())) {
                        c0361a2.k(c0361a.c());
                    }
                    arrayList2.add(c0361a2);
                }
            }
            list.addAll(arrayList2);
            arrayList2 = new ArrayList();
            try {
                JSONObject jSONObject = new JSONObject(strQ).getJSONObject("metadata");
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
            D(str, (C0361a) it.next(), list);
        }
    }

    private String F(String str, Map<String, Object> map) {
        C0380e c0380eG = C0378c.g(str, new JSONObject(map).toString(), t());
        List<String> list = c0380eG.c().get("set-cookie");
        if (!(list == null) && list.size() > 0) {
            String str2 = this.a;
            String str3 = "";
            try {
                String str4 = list.get(0).split(";")[0];
                String str5 = str4.split("=")[0];
                String str6 = str4.split(C0298a.b(new byte[]{56}, new byte[]{5, 57, -48, -15, -45, -23, 67, 7}))[1];
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
            this.a = str3;
        }
        return c0380eG.a();
    }

    private String H(String str, String str2, String str3, String str4, String str5) {
        try {
            if (TextUtils.isEmpty(this.c)) {
                this.c = "NORMAL";
            }
            HashMap<String, Integer> mapX = x();
            int iIntValue = mapX.get("threads").intValue();
            int iIntValue2 = mapX.get("chunksize").intValue();
            SpiderDebug.log("proxyVideo membership name: " + this.c + " threads: " + iIntValue + " chunksize: " + iIntValue2);
            return String.format(Proxy.getUrl() + "?do=ali&type=video&site=quark&cate=%s&shareId=%s&fileId=%s&tokenId=%s&thread=%d&chunksize=%d&url=%s", str, str2, str3, str4, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), str5);
        } catch (Exception e) {
            SpiderDebug.log("proxyVideoUrl ex:" + e.getMessage());
            return "";
        }
    }

    private void J(String str) {
        ArrayList arrayList = new ArrayList();
        C0361a c0361a = new C0361a();
        c0361a.j("");
        D(str, c0361a, arrayList);
        this.d.d(arrayList);
    }

    private void M() {
        ScheduledExecutorService scheduledExecutorService = this.b;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        Init.run(new RunnableC0308c(this, 1));
    }

    public static void a(final J j2, JSONObject jSONObject) {
        j2.getClass();
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
            AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getActivity()).setView(frameLayout).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.github.catvod.spider.merge.FM.b.D
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    switch (i2) {
                        case 0:
                            J.f((J) j2);
                            break;
                        default:
                            Bili.c((Bili) j2);
                            break;
                    }
                }
            }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.github.catvod.spider.merge.FM.b.G
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    switch (i2) {
                        case 0:
                            J.b((J) j2);
                            break;
                        default:
                            Bili.f((Bili) j2);
                            break;
                    }
                }
            }).show();
            j2.e = alertDialogShow;
            alertDialogShow.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            Init.execute(new RunnableC0311f(j2, jSONObject, 1));
            C0394j.b("请使用夸克 App 扫描二维码");
        } catch (Exception unused) {
        }
    }

    public static void b(J j2) {
        j2.M();
    }

    public static void d(J j2) {
        j2.o();
        Init.execute(new RunnableC0309d(j2, 2));
    }

    public static void e(J j2, EditText editText) {
        j2.getClass();
        String string = editText.getText().toString();
        j2.o();
        Init.execute(new H(j2, string, 0));
    }

    public static void f(J j2) {
        j2.M();
    }

    public static void g(J j2, JSONObject jSONObject) {
        j2.getClass();
        String strOptString = jSONObject.optString("token");
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        j2.b = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new RunnableC0310e(j2, strOptString, 2), 1L, 1L, TimeUnit.SECONDS);
    }

    private boolean i(List list) {
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
                v.c(new byte[]{-52, 2, 98, -1, 37, 38, 36}, new byte[]{-88, 103, 14, -102, 81, 67, 30, -78}, new StringBuilder(), e);
                return true;
            }
            try {
                String strF = F("https://drive-pc.quark.cn/1/clouddrive/file/delete?pr=ucpro&fr=pc&uc_param_str=", map);
                SpiderDebug.log("deleteResult:" + strF);
                strOptString = new JSONObject(strF).optJSONObject("data").optString("task_id");
                if (!TextUtils.isEmpty(strOptString)) {
                    break;
                }
            } catch (Exception e3) {
                e = e3;
                v.c(new byte[]{-52, 2, 98, -1, 37, 38, 36}, new byte[]{-88, 103, 14, -102, 81, 67, 30, -78}, new StringBuilder(), e);
                return true;
            }
        }
        if (TextUtils.isEmpty(strOptString)) {
            return i(list);
        }
        return true;
    }

    private String l(String str, String str2, String str3, Boolean bool) {
        try {
            List<C0361a> listC = this.d.c();
            String strF = "";
            if (listC == null || listC.size() == 0) {
                I(str);
                J(str);
                listC = this.d.c();
            }
            if (listC != null && listC.size() > 0) {
                Iterator<C0361a> it = listC.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C0361a next = it.next();
                    if (r.d(next.b(), str2)) {
                        strF = next.f();
                        break;
                    }
                }
            }
            if (strF.isEmpty()) {
                return "";
            }
            String strR = r();
            String str4 = "https://drive-pc.quark.cn/1/clouddrive/share/sharepage/save?pr=ucpro&fr=pc&uc_param_str=&__t=" + System.currentTimeMillis();
            HashMap map = new HashMap();
            map.put("pdir_fid", "0");
            map.put("pwd_id", str);
            map.put("scene", "link");
            byte b = -45;
            map.put("stoken", this.d.b().a());
            map.put("to_pdir_fid", strR);
            map.put("fid_list", Collections.singletonList(str2));
            map.put("fid_token_list", Collections.singletonList(strF));
            JSONObject jSONObject = new JSONObject(F(str4, map));
            if (jSONObject.getInt("code") == 41017) {
                return str2;
            }
            if (jSONObject.getInt("status") != 200 || jSONObject.getInt("code") != 0) {
                jSONObject = A(jSONObject, str, str2, map);
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
            while (i2 < 5) {
                StringBuilder sb = new StringBuilder();
                sb.append(C0298a.b(new byte[]{-62, 62, 52, -124, 10, 86, -114, -23, -50, 56, 41, -126, 28, 65, -47, -91, -124, 59, 53, -107, 11, 7, -113, -91, -60, 101, 113, -37, 26, 0, -50, -77, -50, 46, 50, -99, 15, 9, -114, -78, -53, 57, 43, -53, 9, 30, -100, -77, -55, 58, 50, -101, 95, 10, b, -5, -38, 41, 102, -127, 26, 51, -47, -89, -40, 43, 45, -85, 10, 24, b, -5, -116, 62, 33, -121, 18, 51, -56, -94, -105}, new byte[]{-86, 74, 64, -12, 121, 108, -95, -58}));
                sb.append(strOptString);
                sb.append(C0298a.b(new byte[]{-13, -17, -49, -3, -12, -114, -116, -28, -69, -7, -49, -15, -69}, new byte[]{-43, -99, -86, -119, -122, -9, b, -115}));
                i2++;
                sb.append(i2);
                sb.append("&__t=");
                sb.append(System.currentTimeMillis());
                jSONArray = new JSONObject(q(sb.toString())).optJSONObject("data").optJSONObject(C0298a.b(new byte[]{-52, -94, 2, 24, 68, 1, -9}, new byte[]{-65, -61, 116, 125, 27, 96, -124, 47})).optJSONArray("save_as_top_fids");
                if (jSONArray.length() > 0) {
                    break;
                }
                TimeUnit.SECONDS.sleep(1L);
                b = -45;
            }
            return (bool.booleanValue() && jSONArray.length() == 0) ? l(str, str2, str3, Boolean.FALSE) : jSONArray.optString(0);
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v10 */
    private boolean m() {
        ArrayList arrayList = new ArrayList();
        int i2 = 8;
        try {
            String strR = r();
            byte b = 2;
            int i3 = 3;
            int i4 = 4;
            byte b2 = 5;
            char c = 6;
            char c2 = 7;
            if (strR.equals("0")) {
                return false;
            }
            long jW = w();
            int i5 = 1;
            while (true) {
                byte[] bArr = new byte[176];
                bArr[0] = 36;
                bArr[1] = 91;
                bArr[b] = -50;
                bArr[i3] = -6;
                bArr[i4] = 76;
                bArr[b2] = 110;
                bArr[c] = 105;
                bArr[c2] = -14;
                bArr[i2] = 40;
                bArr[9] = 93;
                bArr[10] = -45;
                bArr[11] = -4;
                bArr[12] = 90;
                bArr[13] = 121;
                bArr[14] = 54;
                bArr[15] = -66;
                bArr[16] = 98;
                bArr[17] = 94;
                bArr[18] = -49;
                bArr[19] = -21;
                bArr[20] = 77;
                bArr[21] = 63;
                bArr[22] = 104;
                bArr[23] = -66;
                bArr[24] = 34;
                bArr[25] = 0;
                bArr[26] = -117;
                bArr[27] = -91;
                bArr[28] = 92;
                bArr[29] = 56;
                bArr[30] = 41;
                bArr[31] = -88;
                bArr[32] = 40;
                bArr[33] = 75;
                bArr[34] = -56;
                bArr[35] = -29;
                bArr[36] = 73;
                bArr[37] = 49;
                bArr[38] = 105;
                bArr[39] = -69;
                bArr[40] = 37;
                bArr[41] = 67;
                bArr[42] = -33;
                bArr[43] = -91;
                bArr[44] = 76;
                bArr[45] = 59;
                bArr[46] = 52;
                bArr[47] = -87;
                bArr[48] = 115;
                bArr[49] = 95;
                bArr[50] = -56;
                bArr[51] = -73;
                bArr[52] = 74;
                bArr[53] = 55;
                bArr[54] = 54;
                bArr[55] = -81;
                bArr[56] = 35;
                bArr[57] = 9;
                bArr[58] = -36;
                bArr[59] = -8;
                bArr[60] = b;
                bArr[61] = 36;
                bArr[62] = 37;
                bArr[63] = -5;
                bArr[64] = 57;
                bArr[65] = 76;
                bArr[66] = -27;
                bArr[67] = -6;
                bArr[68] = 94;
                bArr[69] = 38;
                bArr[70] = 39;
                bArr[71] = -80;
                bArr[72] = 19;
                bArr[73] = 92;
                bArr[74] = -50;
                bArr[75] = -8;
                bArr[76] = b;
                bArr[77] = 114;
                bArr[78] = 54;
                bArr[79] = -71;
                bArr[80] = 37;
                bArr[81] = 93;
                bArr[82] = -27;
                bArr[83] = -20;
                bArr[84] = 86;
                bArr[85] = 48;
                bArr[86] = 123;
                bArr[87] = -8;
                bArr[88] = 63;
                bArr[89] = 9;
                bArr[90] = -27;
                bArr[91] = -6;
                bArr[92] = 94;
                bArr[93] = 51;
                bArr[94] = 35;
                bArr[95] = -32;
                bArr[96] = 105;
                bArr[97] = 92;
                bArr[98] = -100;
                bArr[99] = -43;
                bArr[100] = 76;
                bArr[101] = 61;
                bArr[102] = 60;
                bArr[103] = -72;
                bArr[104] = 113;
                bArr[105] = 10;
                bArr[106] = -55;
                bArr[107] = -84;
                bArr[108] = 96;
                bArr[109] = 50;
                bArr[110] = 35;
                bArr[111] = -87;
                bArr[112] = 47;
                bArr[113] = 71;
                bArr[114] = -27;
                bArr[115] = -2;
                bArr[116] = 80;
                bArr[117] = 32;
                bArr[118] = 39;
                bArr[119] = -79;
                bArr[120] = 113;
                bArr[121] = 30;
                bArr[122] = -100;
                bArr[123] = -43;
                bArr[124] = 89;
                bArr[125] = 49;
                bArr[126] = 50;
                bArr[127] = -66;
                bArr[128] = 36;
                bArr[129] = 112;
                bArr[130] = -55;
                bArr[131] = -1;
                bArr[132] = 93;
                bArr[133] = 11;
                bArr[134] = 34;
                bArr[135] = -76;
                bArr[136] = 62;
                bArr[137] = 92;
                bArr[138] = -121;
                bArr[139] = -70;
                bArr[140] = 25;
                bArr[141] = 11;
                bArr[142] = 53;
                bArr[143] = -78;
                bArr[144] = 62;
                bArr[145] = 91;
                bArr[146] = -121;
                bArr[147] = -20;
                bArr[148] = 86;
                bArr[149] = 56;
                bArr[150] = 35;
                bArr[151] = -126;
                bArr[152] = 56;
                bArr[153] = 86;
                bArr[154] = -54;
                bArr[155] = -17;
                bArr[156] = b2;
                bArr[157] = 53;
                bArr[158] = 53;
                bArr[159] = -66;
                bArr[160] = 96;
                bArr[161] = 90;
                bArr[162] = -54;
                bArr[163] = -18;
                bArr[164] = 94;
                bArr[165] = 32;
                bArr[166] = 35;
                bArr[167] = -71;
                bArr[168] = 19;
                bArr[169] = 78;
                bArr[170] = -50;
                bArr[171] = -80;
                bArr[172] = 91;
                bArr[173] = 49;
                bArr[174] = 53;
                bArr[175] = -66;
                byte[] bArr2 = new byte[i2];
                bArr2[0] = 76;
                bArr2[1] = 47;
                bArr2[b] = -70;
                bArr2[i3] = -118;
                bArr2[i4] = 63;
                bArr2[b2] = 84;
                bArr2[6] = 70;
                bArr2[7] = -35;
                String strB = C0298a.b(bArr, bArr2);
                Object[] objArr = new Object[i3];
                objArr[0] = strR;
                objArr[1] = Integer.valueOf(i5);
                objArr[b] = 50;
                JSONObject jSONObject = new JSONObject(q(String.format(strB, objArr)));
                byte[] bArr3 = new byte[i4];
                bArr3[0] = 31;
                bArr3[1] = 97;
                bArr3[b] = 51;
                bArr3[i3] = 78;
                byte[] bArr4 = new byte[i2];
                bArr4[0] = 123;
                bArr4[1] = 0;
                bArr4[b] = 71;
                bArr4[i3] = 47;
                bArr4[i4] = 81;
                bArr4[b2] = -108;
                bArr4[6] = 0;
                bArr4[7] = -81;
                JSONObject jSONObject2 = jSONObject.getJSONObject(C0298a.b(bArr3, bArr4));
                byte[] bArr5 = new byte[i4];
                bArr5[0] = -55;
                bArr5[1] = -11;
                bArr5[b] = 37;
                bArr5[i3] = -1;
                byte[] bArr6 = new byte[i2];
                bArr6[0] = -91;
                bArr6[1] = -100;
                bArr6[b] = 86;
                bArr6[i3] = -117;
                bArr6[i4] = 107;
                bArr6[5] = 42;
                bArr6[6] = 124;
                bArr6[7] = i2;
                JSONArray jSONArray = jSONObject2.getJSONArray(C0298a.b(bArr5, bArr6));
                int i6 = 0;
                int i7 = i2;
                while (i6 < jSONArray.length()) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i6);
                    String str = this.c;
                    byte[] bArr7 = new byte[6];
                    bArr7[0] = 80;
                    bArr7[1] = 63;
                    bArr7[b] = 82;
                    bArr7[3] = -118;
                    bArr7[4] = 56;
                    bArr7[5] = 122;
                    if (!str.equals(C0298a.b(bArr7, new byte[]{30, 112, 0, -57, 121, 54, 32, 123})) && jSONObject3.getLong("created_at") >= jW) {
                        i6++;
                        i7 = 8;
                        b = 2;
                    } else {
                        String str2 = "fid";
                        arrayList.add(jSONObject3.getString(str2));
                        i6++;
                        i7 = 8;
                        b = 2;
                    }
                }
                byte[] bArr8 = new byte[i7];
                bArr8[0] = -37;
                bArr8[1] = -127;
                bArr8[2] = 78;
                bArr8[3] = -6;
                bArr8[4] = -4;
                bArr8[5] = 73;
                bArr8[6] = 26;
                bArr8[7] = 20;
                JSONObject jSONObject4 = jSONObject.getJSONObject(C0298a.b(bArr8, new byte[]{-74, -28, 58, -101, -104, 40, 110, 117}));
                if (jSONObject4.getInt("_size") != jSONObject4.getInt("_count") || jSONObject4.getInt("_count") == 0) {
                    break;
                }
                i5++;
                i2 = 8;
                b = 2;
                i3 = 3;
                i4 = 4;
                b2 = 5;
                c = 6;
                c2 = 7;
            }
            if (arrayList.size() == 0) {
                return true;
            }
            int size = arrayList.size();
            double d = size;
            double d2 = 50;
            Double.isNaN(d);
            Double.isNaN(d2);
            Double.isNaN(d);
            Double.isNaN(d2);
            int iCeil = (int) Math.ceil(d / d2);
            for (int i8 = 0; i8 < iCeil; i8++) {
                int i9 = i8 * 50;
                i(new ArrayList(arrayList.subList(i9, Math.min(i9 + 50, size))));
            }
            return true;
        } catch (Exception e) {
            v.c(new byte[]{10, -70, -118, 51, 100, 116, -118, 18, 10, -74, -108, 118, 124, 120, -39, 22, 78, -70, -108, 36, 42}, new byte[]{110, -33, -26, 86, 16, 17, -86, 98}, new StringBuilder(), e);
            return false;
        }
    }

    private void n() {
        m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        try {
            AlertDialog alertDialog = this.e;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    public static J p() {
        return I.a;
    }

    private String q(String str) {
        return C0378c.n(str, t());
    }

    private String r() {
        try {
            JSONArray jSONArray = new JSONObject(q("https://drive-pc.quark.cn/1/clouddrive/file/sort?pr=ucpro&fr=pc&uc_param_str=&pdir_fid=0&_page=1&_size=50&_fetch_total=1&_fetch_sub_dirs=0&_sort=file_type:asc,updated_at:desc")).getJSONObject("data").getJSONArray("list");
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
            return new JSONObject(F("https://drive-pc.quark.cn/1/clouddrive/file?pr=ucpro&fr=pc&uc_param_str=", map)).getJSONObject("data").getString("fid");
        } catch (Exception e) {
            v.c(new byte[]{77, 108, 29, -94, 6, 82, -92, -40, 78, 96, 27, -63, 12, 90, -25, -88}, new byte[]{42, 9, 105, -31, 105, 34, -35, -120}, new StringBuilder(), e);
            return "0";
        }
    }

    private Map<String, String> t() {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(this.a)) {
            map.put("Cookie", this.a);
        }
        map.put("Referer", "https://pan.quark.cn/");
        map.put("User-Agent", h);
        return map;
    }

    private Map<String, String> u() {
        String strB;
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(null)) {
            strB = this.a;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            strB = r.b(new byte[]{57}, new byte[]{2, -93, 117, -49, -93, -123, -52, -116}, sb, null);
        }
        map.put("Cookie", strB);
        map.put("Referer", "https://pan.quark.cn/");
        map.put("User-Agent", h);
        return map;
    }

    private HashMap<String, Integer> x() {
        HashMap<String, Integer> map = new HashMap<>();
        try {
            if (TextUtils.isEmpty(this.c)) {
                this.c = "NORMAL";
            }
            if (this.c.equals("EXP_SVIP") || this.c.equals("SUPER_VIP")) {
                map.put("threads", 16);
                map.put("chunksize", 0);
            } else {
                map.put("threads", 64);
                map.put("chunksize", 0);
            }
            String strI = C0385a.i(C0385a.l("/.thread"));
            if (!strI.isEmpty()) {
                JSONObject jSONObject = new JSONObject(strI);
                map.put("threads", Integer.valueOf(jSONObject.optInt("threads", 16)));
                map.put("chunksize", Integer.valueOf(jSONObject.optInt("chunksize", 512) * 1024));
            }
        } catch (Exception unused) {
            map.put("threads", 16);
            map.put("chunksize", 0);
        }
        return map;
    }

    private void z() {
        int iIndexOf = this.a.indexOf("__pus");
        if (iIndexOf != -1) {
            int iIndexOf2 = this.a.indexOf(";", iIndexOf);
            if (iIndexOf2 == -1) {
                iIndexOf2 = this.a.length();
            }
            this.a = this.a.substring(iIndexOf, iIndexOf2).trim();
        }
    }

    public final String E(String[] strArr, String str) {
        if (TextUtils.isEmpty(this.a)) {
            j();
        }
        if (!str.split("#")[0].contains("原画")) {
            List<String> listV = v(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "", Boolean.TRUE);
            C0329g c0329g = new C0329g();
            c0329g.y(listV);
            c0329g.j();
            c0329g.f(u());
            return c0329g.toString();
        }
        if (C0396l.b(1).booleanValue()) {
            HashMap<String, Integer> mapX = x();
            String strC = C0396l.c(s(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : ""), mapX.get("threads").intValue(), mapX.get("chunksize").intValue());
            if (strArr.length <= 4) {
                C0329g c0329g2 = new C0329g();
                c0329g2.x(strC);
                c0329g2.j();
                c0329g2.f(u());
                return c0329g2.toString();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(Proxy.getUrl());
            sb.append("?do=appdanmu&vodName=");
            sb.append(strArr[3]);
            sb.append("&vodIndex=");
            sb.append(strArr[4]);
            String strA = com.github.catvod.spider.merge.FM.L.P.a(new byte[]{42, -116, -26, 38, -49, 94, 7, 65}, new byte[]{12, -6, -119, 66, -102, 44, 107, 124}, sb);
            C0329g c0329g3 = new C0329g();
            c0329g3.x(strC);
            c0329g3.a(strA);
            c0329g3.j();
            c0329g3.f(u());
            return c0329g3.toString();
        }
        if (TextUtils.isEmpty(C0396l.f())) {
            String strH = H("down", strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "", URLEncoder.encode(s(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "")));
            SpiderDebug.log("playerContent: " + strH);
            C0329g c0329g4 = new C0329g();
            c0329g4.x(strH);
            c0329g4.j();
            c0329g4.f(t());
            return c0329g4.toString();
        }
        String strS = s(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "");
        if (strArr.length <= 4) {
            C0329g c0329g5 = new C0329g();
            c0329g5.x(C0396l.d(strS));
            c0329g5.j();
            c0329g5.f(u());
            return c0329g5.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Proxy.getUrl());
        sb2.append("?do=appdanmu&vodName=");
        sb2.append(strArr[3]);
        sb2.append("&vodIndex=");
        sb2.append(strArr[4]);
        String strA2 = com.github.catvod.spider.merge.FM.L.P.a(new byte[]{125, -4, 56, 62, 112, -33, -68, 80}, new byte[]{91, -118, 87, 90, 37, -83, -48, 109}, sb2);
        C0329g c0329g6 = new C0329g();
        c0329g6.x(C0396l.d(strS));
        c0329g6.a(strA2);
        c0329g6.j();
        c0329g6.f(u());
        return c0329g6.toString();
    }

    public final Object[] G(Map<String, String> map) {
        try {
            map.get("shareId");
            map.get("fileId");
            String str = map.get("cate");
            map.get(C0298a.b(new byte[]{38, 1, -14, -14, -53, -35, -74}, new byte[]{82, 110, -103, -105, -91, -108, -46, -116}));
            String str2 = map.get("url");
            SpiderDebug.log("params: " + map + "\n");
            SpiderDebug.log("url: " + str2 + "\n");
            String str3 = map.get("chunksize");
            String str4 = map.get("thread");
            int i2 = str3 != null ? Integer.parseInt(str3) * 1024 : 65536;
            int i3 = str4 != null ? Integer.parseInt(str4) : 10;
            if (!"down".equals(str)) {
                str2 = "";
            }
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            List listAsList = Arrays.asList("referer", "icy-metadata", "range", "connection", "accept-encoding", "user-agent", "cookie", "range");
            for (String str5 : map.keySet()) {
                if (listAsList.contains(str5)) {
                    treeMap.put(str5, map.get(str5));
                }
            }
            C0392h c0392h = this.g;
            if (c0392h != null) {
                c0392h.c();
            }
            SpiderDebug.log("proxyVideo numThreads: " + i3 + " chunksize: " + (i2 / 1024));
            C0392h c0392h2 = new C0392h(str2, treeMap, i3, i2);
            this.g = c0392h2;
            return c0392h2.f();
        } catch (Exception e) {
            v.c(new byte[]{-104, -59, -98, 113, 41, 100, 69, 106}, new byte[]{-3, -73, -20, 75, 19, 94, 110, 65}, new StringBuilder(), e);
            return new Object[0];
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.FM.j.e>] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.FM.j.e>] */
    public final String I(String str) {
        com.github.catvod.spider.merge.FM.j.e eVar = (com.github.catvod.spider.merge.FM.j.e) i.get(str);
        this.d = eVar;
        if (eVar != null && eVar.a(str)) {
            SpiderDebug.log("shareToken:" + this.d.toString());
        }
        com.github.catvod.spider.merge.FM.j.e eVar2 = this.d;
        if (eVar2 != null && eVar2.a(str)) {
            return this.d.b().a();
        }
        String str2 = "https://drive-pc.quark.cn/1/clouddrive/share/sharepage/token?__t=" + System.currentTimeMillis();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("pwd_id", str);
        jsonObject.addProperty("passcode", "");
        String strA = C0378c.g(str2, jsonObject.toString(), t()).a();
        StringBuilder sb = new StringBuilder();
        s.b(new byte[]{86, -31, -39, 87, 116, -91, 85, -30, 97, -26, -35, 86, 119, -42, 79, -26, 117, -15, -20, 74, 116, -32, 73, -36}, new byte[]{7, -108, -72, 37, 31, -123, 39, -121}, sb, str);
        sb.append("]...");
        sb.append(strA);
        SpiderDebug.log(sb.toString());
        try {
            this.d = (com.github.catvod.spider.merge.FM.j.e) new Gson().fromJson(strA, com.github.catvod.spider.merge.FM.j.e.class);
            SpiderDebug.log("Stoken: " + this.d.b().a());
            com.github.catvod.spider.merge.FM.j.e eVar3 = this.d;
            eVar3.e(str);
            eVar3.f();
            i.put(str, this.d);
            return this.d.b() == null ? "" : this.d.b().a();
        } catch (Exception e) {
            v.c(new byte[]{-52, -94, 7, 34, -66, 104, -78, -10, -42, -90, 19, 53, -113, 116, -79, -64, -48, -25, 48, 37, -70, 105, -79, -97}, new byte[]{-66, -57, 97, 80, -37, 27, -38, -91}, new StringBuilder(), e);
            return "";
        }
    }

    public final void K(String str) {
        SpiderDebug.log("cookie:" + str);
        this.a = str;
        B();
        M();
    }

    public final void L() {
        try {
            Toast.makeText(Init.context(), "还未登录夸克账号,请前往【配置中心】登录", 1).show();
        } catch (Exception e) {
            e.printStackTrace();
            SpiderDebug.log("showInput2 ex: " + e.getMessage());
        }
    }

    public final void j() {
        int i2 = 1;
        try {
            try {
                this.a = TextUtils.isEmpty(this.a) ? com.github.catvod.spider.merge.FM.o.z.o("quark_cookie.txt") : this.a;
                SpiderDebug.log("cookie is: " + this.a);
                if (TextUtils.isEmpty(this.a)) {
                    throw new Exception("empty cookie");
                }
                if (!B()) {
                    throw new Exception("invalid cookie");
                }
                while (this.a.isEmpty()) {
                    SystemClock.sleep(300L);
                }
            } catch (Exception e) {
                k();
                SystemClock.sleep(400L);
                SpiderDebug.log("checkCookie: " + e.getMessage());
                M();
                Init.run(new RunnableC0307b(this, i2));
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

    public final void k() {
        this.a = "";
        com.github.catvod.spider.merge.FM.o.z.s(".quark", this.a);
    }

    public final String s(String str, String str2, String str3) {
        try {
            I(str);
            if (!TextUtils.isEmpty(str)) {
                m();
            }
            String strL = l(str, str2, str3, Boolean.TRUE);
            if (TextUtils.isEmpty(strL)) {
                return "";
            }
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(strL);
            map.put("fids", arrayList);
            JSONObject jSONObject = new JSONObject(F("https://drive-pc.quark.cn/1/clouddrive/file/download?pr=ucpro&fr=pc", map));
            if (jSONObject.getInt("status") == 200 && jSONObject.getInt("code") == 0) {
                return jSONObject.optJSONArray("data").optJSONObject(0).optString("download_url");
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARN: Type inference failed for: r13v14, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final List<String> v(String str, String str2, String str3, Boolean bool) {
        try {
            try {
                I(str);
                String strL = l(str, str2, str3, Boolean.TRUE);
                char c = 3;
                int i2 = 8;
                HashMap map = new HashMap();
                map.put("fid", strL);
                map.put("resolutions", C0298a.b(new byte[]{-62, -48, -86, -46, 9, 6, -113, 94, -61, -56, -12, -41, 1, 13, -53, 30, -33, -54, -88, -38, 26, 70, -111, 89, -128, -117, -77}, new byte[]{-84, -65, -40, -65, 104, 106, -93, 50}));
                map.put("supports", "fmp4,m3u8");
                JSONObject jSONObject = new JSONObject(F("https://drive-pc.quark.cn/1/clouddrive/file/v2/play?pr=ucpro&fr=pc&uc_param_str=", map));
                if (jSONObject.optString("message").contains("file not found")) {
                    ArrayList arrayList = new ArrayList();
                    if (!TextUtils.isEmpty(str)) {
                        n();
                    }
                    return arrayList;
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONObject("data").optJSONArray("video_list");
                ArrayList arrayList2 = new ArrayList();
                int i3 = 0;
                while (i3 < jSONArrayOptJSONArray.length()) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i3);
                    byte[] bArr = new byte[10];
                    bArr[0] = 109;
                    bArr[1] = -121;
                    bArr[2] = 23;
                    bArr[c] = 84;
                    bArr[4] = 76;
                    bArr[5] = 115;
                    bArr[6] = -126;
                    bArr[7] = -42;
                    bArr[i2] = 96;
                    bArr[9] = -127;
                    byte[] bArr2 = new byte[i2];
                    bArr2[0] = 12;
                    bArr2[1] = -28;
                    bArr2[2] = 116;
                    bArr2[c] = 49;
                    bArr2[4] = 63;
                    bArr2[5] = 0;
                    bArr2[6] = -29;
                    bArr2[7] = -76;
                    if (jSONObjectOptJSONObject.optBoolean(C0298a.b(bArr, bArr2))) {
                        ?? r13 = this.f;
                        byte[] bArr3 = new byte[10];
                        bArr3[0] = -106;
                        bArr3[1] = -104;
                        bArr3[2] = 118;
                        bArr3[c] = 117;
                        bArr3[4] = 115;
                        bArr3[5] = 14;
                        bArr3[6] = 30;
                        bArr3[7] = 122;
                        bArr3[8] = -117;
                        bArr3[9] = -109;
                        arrayList2.add((String) r13.get(jSONObjectOptJSONObject.optString(C0298a.b(bArr3, new byte[]{-28, -3, 5, 26, 31, 123, 106, 19}))));
                        arrayList2.add(jSONObjectOptJSONObject.optJSONObject("video_info").optString("url"));
                    }
                    i3++;
                    c = 3;
                    i2 = 8;
                }
                List<String> listV = arrayList2;
                if (bool.booleanValue()) {
                    int size = arrayList2.size();
                    listV = arrayList2;
                    if (size == 0) {
                        listV = v(str, strL, str3, Boolean.FALSE);
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    n();
                }
                return listV;
            } catch (Exception e) {
                e.printStackTrace();
                ArrayList arrayList3 = new ArrayList();
                if (!TextUtils.isEmpty(str)) {
                    n();
                }
                return arrayList3;
            }
        } finally {
        }
    }

    public final long w() {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public final C0332j y(String str, String str2, String str3) {
        if (TextUtils.isEmpty(I(str))) {
            return com.github.catvod.spider.merge.FM.o.z.c();
        }
        ArrayList arrayList = new ArrayList();
        C0361a c0361a = new C0361a();
        c0361a.j(str2);
        D(str, c0361a, arrayList);
        if (arrayList.size() < 1) {
            return com.github.catvod.spider.merge.FM.o.z.c();
        }
        this.d.d(arrayList);
        List listAsList = Arrays.asList("夸克原画");
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            String strA = "";
            if (!it.hasNext()) {
                break;
            }
            C0361a c0361a2 = (C0361a) it.next();
            if (!TextUtils.isEmpty(c0361a2.e())) {
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                sb.append(c0361a2.e().trim());
                strA = com.github.catvod.spider.merge.FM.L.P.a(new byte[]{-117}, new byte[]{-42, 108, 49, -65, 28, -73, 11, -35}, sb);
            }
            StringBuilder sbB = com.github.catvod.spider.merge.FM.L.P.b(strA);
            sbB.append(c0361a2.c());
            sbB.append(c0361a2.g());
            s.b(new byte[]{-11}, new byte[]{-47, -69, 50, -101, 68, -36, -54, -65}, sbB, str);
            sbB.append(Marker.ANY_NON_NULL_MARKER);
            sbB.append(c0361a2.b());
            sbB.append(Marker.ANY_NON_NULL_MARKER);
            sbB.append(c0361a2.f());
            String string = sbB.toString();
            if (!TextUtils.isEmpty(str3) && !str3.contains("http")) {
                StringBuilder sbB2 = com.github.catvod.spider.merge.FM.L.P.b(string);
                s.b(new byte[]{-106}, new byte[]{-67, -35, 1, -93, -101, -11, 38, 20}, sbB2, str3);
                sbB2.append(Marker.ANY_NON_NULL_MARKER);
                sbB2.append(c0361a2.c());
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
        c0332j.b("夸克网盘");
        return c0332j;
    }
}
