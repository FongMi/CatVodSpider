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
import java.io.ByteArrayInputStream;
import java.net.URLEncoder;
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
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class J {
    private static final String i = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) quark-cloud-drive/3.0.1 Chrome/100.0.4896.160 Electron/18.3.5.12-a038f7b798 Safari/537.36 Channel/pckk_other_ch";
    private static Map<String, com.github.catvod.spider.merge.AB.j.e> j;
    public static final int k = 0;
    private ScheduledExecutorService a;
    private String b;
    private String c;
    private com.github.catvod.spider.merge.AB.j.e d;
    private String e;
    private AlertDialog f;
    private final Map<String, String> g;
    private com.github.catvod.spider.merge.AB.o.C h;

    J() {
        Init.checkPermission();
        this.e = com.github.catvod.spider.merge.AB.m.c.b("https://drive-pc.quark.cn/1/clouddrive/file", t()).a();
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
        SpiderDebug.log("QuarkYun Init");
    }

    private JSONObject C(JSONObject jSONObject, String str, String str2, Map<String, Object> map) {
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
        if (!TextUtils.isEmpty(K(str))) {
            L(str);
            Iterator it = this.d.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    strF = "";
                    break;
                }
                com.github.catvod.spider.merge.AB.j.a aVar = (com.github.catvod.spider.merge.AB.j.a) it.next();
                String strB = aVar.b();
                if (strB == str2 || (strB != null && strB.equals(str2))) {
                    strF = aVar.f();
                    break;
                }
            }
            map.put("stoken", this.d.b().a());
            map.put("fid_token_list", Collections.singletonList(strF));
            return new JSONObject(G("https://drive-pc.quark.cn/1/clouddrive/share/sharepage/save?pr=ucpro&fr=pc&uc_param_str=&__t=" + System.currentTimeMillis(), map));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(String str) {
        try {
            JSONObject jSONObject = new JSONObject(com.github.catvod.spider.merge.AB.m.c.k("https://uop.quark.cn/cas/ajax/getServiceTicketByQrcodeToken?client_id=532&v=1.2&token=" + str));
            if ("ok".equals(jSONObject.optString("message"))) {
                String strOptString = jSONObject.optJSONObject("data").optJSONObject("members").optString("service_ticket");
                HashMap map = new HashMap();
                map.put("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/38.0.2125.122 Safari/537.36 SE 2.X MetaSr 1.0");
                map.put("Accept", "application/json, text/plain, */*");
                map.put("Referer", "https://pan.quark.cn/");
                Iterator it = com.github.catvod.spider.merge.AB.m.c.e("https://pan.quark.cn/account/info?st=" + strOptString + "&lw=scan", map).headers("set-cookie").iterator();
                String str2 = "";
                while (it.hasNext()) {
                    str2 = str2 + ((String) it.next()).split(";")[0] + ";";
                }
                M(str2);
            }
        } catch (Exception unused) {
        }
    }

    private void E(String str, com.github.catvod.spider.merge.AB.j.a aVar, List<com.github.catvod.spider.merge.AB.j.a> list, List<com.github.catvod.spider.merge.AB.j.a> list2) {
        if (this.d.b() == null) {
            return;
        }
        String strB = aVar.b();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 1;
        while (true) {
            StringBuilder sb = new StringBuilder();
            v.a(new byte[]{23, 121, 49, 54, 125, -95, -41, 84, 27, 127, 44, 48, 107, -74, -120, 24, 81, 124, 48, 39, 124, -16, -42, 24, 17, 34, 116, 105, 109, -9, -105, 14, 27, 105, 55, 47, 120, -2, -41, 8, 23, 108, 55, 35, 33, -24, -112, 26, 13, 104, 53, 39, 105, -2, -41, 31, 26, 121, 36, 47, 98, -92, -120, 9, 66, 120, 38, 54, 124, -12, -34, 29, 13, 48, 53, 37, 40, -18, -101, 36, 15, 108, 55, 39, 99, -60, -117, 15, 13, 48, 99, 54, 121, -1, -89, 18, 27, 48}, new byte[]{127, 13, 69, 70, 14, -101, -8, 123}, sb, str);
            sb.append("&stoken=");
            sb.append(URLEncoder.encode(this.d.b().a()));
            v.a(new byte[]{-81, 6, -108, -18, -72, 69, -20, 22, -19, 75}, new byte[]{-119, 118, -16, -121, -54, 26, -118, 127}, sb, strB);
            sb.append("&force=0&_page=");
            sb.append(i2);
            sb.append("&_size=");
            sb.append(100);
            String strP = p(t.b(new byte[]{54, 50, -23, -101, 69, -122, 105, -96, 121, 1, -1, -85, 67, -117, 36, -93, 42, 12, -23, -105, 27, -108, 61, -86, 117, 50, -12, -107, 90, -105, 110, -89, 99, 14}, new byte[]{16, 109, -102, -12, 55, -14, 84, -58}, sb));
            for (com.github.catvod.spider.merge.AB.j.a aVar2 : ((com.github.catvod.spider.merge.AB.j.c) s.a(strP, com.github.catvod.spider.merge.AB.j.c.class)).a().a()) {
                if (aVar2.h()) {
                    arrayList.add(aVar2);
                } else if ((aVar2.i() && aVar2.a() == 1) || (aVar2.i() && c0.l().contains(aVar2.d()))) {
                    if (!this.d.b().b().equals(aVar.c())) {
                        aVar2.k(aVar.c());
                    }
                    arrayList2.add(aVar2);
                } else if (c0.n(c0.f(aVar2.c()))) {
                    list2.add(aVar2);
                }
            }
            list.addAll(arrayList2);
            arrayList2 = new ArrayList();
            try {
                JSONObject jSONObject = new JSONObject(strP).getJSONObject("metadata");
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
            E(str, (com.github.catvod.spider.merge.AB.j.a) it.next(), list, list2);
        }
    }

    private String G(String str, Map<String, Object> map) {
        String str2 = "";
        com.github.catvod.spider.merge.AB.m.e eVarG = com.github.catvod.spider.merge.AB.m.c.g(str, new JSONObject(map).toString(), t());
        List<String> list = eVarG.c().get("set-cookie");
        if (!(list == null) && list.size() > 0) {
            String strX = x();
            try {
                String str3 = list.get(0).split(";")[0];
                String str4 = str3.split("=")[0];
                String str5 = str3.split("=")[1];
                String[] strArrSplit = strX.split(";");
                String string = "";
                for (String str6 : strArrSplit) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    sb.append(str6.indexOf(str4) > 0 ? str3 : str6 + ";");
                    string = sb.toString();
                }
                str2 = string.contains(str4) ? string : string + str3;
            } catch (Exception unused) {
            }
            this.b = str2;
        }
        return eVarG.a();
    }

    private String J(String str, String str2, String str3, String str4, String str5) {
        try {
            if (TextUtils.isEmpty(u())) {
                this.c = "NORMAL";
            }
            HashMap<String, Integer> mapZ = z();
            int iIntValue = mapZ.get("threads").intValue();
            int iIntValue2 = mapZ.get("chunksize").intValue();
            SpiderDebug.log("proxyVideo membership name: " + this.c + " threads: " + iIntValue + " chunksize: " + iIntValue2);
            return String.format(Proxy.getUrl() + "?do=ali&type=video&site=quark&cate=%s&shareId=%s&fileId=%s&tokenId=%s&thread=%d&chunksize=%d&url=%s", str, str2, str3, str4, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), str5);
        } catch (Exception e) {
            SpiderDebug.log("proxyVideoUrl ex:" + e.getMessage());
            return "";
        }
    }

    private void L(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        com.github.catvod.spider.merge.AB.j.a aVar = new com.github.catvod.spider.merge.AB.j.a();
        aVar.j("");
        E(str, aVar, arrayList, arrayList2);
        ArrayList arrayList3 = new ArrayList(arrayList);
        arrayList3.addAll(arrayList2);
        this.d.d(arrayList3);
    }

    private void O() {
        ScheduledExecutorService scheduledExecutorService = this.a;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        Init.run(new RunnableC0080a(this, 1));
    }

    public static void a(J j2, JSONObject jSONObject) {
        j2.getClass();
        try {
            int iA = com.github.catvod.spider.merge.AB.J.a.a(240);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(com.github.catvod.spider.merge.AB.o.I.b(jSONObject.optString("url"), iA));
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.gravity = 17;
            frameLayout.addView(imageView, layoutParams);
            AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getActivity()).setView(frameLayout).setOnCancelListener(new B(j2, 0)).setOnDismissListener(new E(j2, 0)).show();
            j2.f = alertDialogShow;
            alertDialogShow.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            Init.execute(new RunnableC0088i(j2, jSONObject, 1));
            com.github.catvod.spider.merge.AB.o.E.b("请使用夸克 App 扫描二维码");
        } catch (Exception unused) {
        }
    }

    public static void b(J j2) {
        j2.O();
    }

    public static void d(J j2) {
        j2.n();
        Init.execute(new RunnableC0085f(j2, 1));
    }

    public static void e(J j2, EditText editText) {
        j2.getClass();
        String string = editText.getText().toString();
        j2.n();
        Init.execute(new F(j2, string, 0));
    }

    public static void f(J j2) {
        j2.O();
    }

    public static void g(J j2, JSONObject jSONObject) {
        j2.getClass();
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        j2.a = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new RunnableC0087h(j2, jSONObject.optString("token"), 1), 1L, 1L, TimeUnit.SECONDS);
    }

    private boolean i(List list) {
        String strOptString = "";
        for (int i2 = 0; i2 < 3; i2++) {
            try {
                HashMap map = new HashMap();
                map.put("filelist", list);
                map.put("exclude_fids", new ArrayList());
                map.put("action_type", 2);
                String strG = G("https://drive-pc.quark.cn/1/clouddrive/file/delete?pr=ucpro&fr=pc&uc_param_str=", map);
                SpiderDebug.log("deleteResult:" + strG);
                strOptString = new JSONObject(strG).optJSONObject("data").optString("task_id");
                if (!TextUtils.isEmpty(strOptString)) {
                    break;
                }
            } catch (Exception e) {
                SpiderDebug.log("delete:" + e);
                return true;
            }
        }
        if (TextUtils.isEmpty(strOptString)) {
            if (!i(list)) {
                return false;
            }
        }
        return true;
    }

    private com.github.catvod.spider.merge.AB.c.e<String> k(String str, String str2, String str3, Boolean bool) {
        String strF;
        try {
            List<com.github.catvod.spider.merge.AB.j.a> listC = this.d.c();
            if (listC == null || listC.isEmpty()) {
                K(str);
                L(str);
                listC = this.d.c();
            }
            if (listC == null || listC.isEmpty()) {
                strF = "";
            } else {
                for (com.github.catvod.spider.merge.AB.j.a aVar : listC) {
                    if (A.a(aVar.b(), str2)) {
                        strF = aVar.f();
                        break;
                    }
                }
                strF = "";
            }
            if (strF.isEmpty()) {
                return com.github.catvod.spider.merge.AB.c.e.a("fileToken empty");
            }
            String strQ = q();
            String str4 = "https://drive-pc.quark.cn/1/clouddrive/share/sharepage/save?pr=ucpro&fr=pc&uc_param_str=&__t=" + System.currentTimeMillis();
            HashMap map = new HashMap();
            map.put("pdir_fid", "0");
            map.put("pwd_id", str);
            map.put("scene", "link");
            map.put("stoken", this.d.b().a());
            map.put("to_pdir_fid", strQ);
            map.put("fid_list", Collections.singletonList(str2));
            map.put("fid_token_list", Collections.singletonList(strF));
            JSONObject jSONObject = new JSONObject(G(str4, map));
            if (jSONObject.getInt("code") == 41017) {
                return com.github.catvod.spider.merge.AB.c.e.h(str2);
            }
            if (jSONObject.getInt("status") == 200 && jSONObject.getInt("code") == 0) {
                String strOptString = jSONObject.optJSONObject("data").optString("task_id");
                JSONArray jSONArray = new JSONArray();
                int i2 = 0;
                while (i2 < 5) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("https://drive-pc.quark.cn/1/clouddrive/task?pr=ucpro&fr=pc&uc_param_str=&task_id=");
                    sb.append(strOptString);
                    sb.append("&retry_index=");
                    i2++;
                    sb.append(i2);
                    sb.append("&__t=");
                    sb.append(System.currentTimeMillis());
                    String strP = p(sb.toString());
                    if (new JSONObject(strP).optInt("code") == 32003) {
                        return com.github.catvod.spider.merge.AB.c.e.a("容量已满, 建议购买会员");
                    }
                    jSONArray = new JSONObject(strP).optJSONObject("data").optJSONObject("save_as").optJSONArray("save_as_top_fids");
                    if (jSONArray.length() > 0) {
                        break;
                    }
                    TimeUnit.SECONDS.sleep(1L);
                }
                return (bool.booleanValue() && jSONArray.length() == 0) ? k(str, str2, str3, Boolean.FALSE) : com.github.catvod.spider.merge.AB.c.e.h(jSONArray.optString(0));
            }
            JSONObject jSONObjectC = C(jSONObject, str, str2, map);
            return jSONObjectC == null ? com.github.catvod.spider.merge.AB.c.e.a("obj null") : jSONObjectC.getInt("code") == 41017 ? com.github.catvod.spider.merge.AB.c.e.h(str2) : com.github.catvod.spider.merge.AB.c.e.a(jSONObjectC.getString("message"));
        } catch (Exception e) {
            return com.github.catvod.spider.merge.AB.c.e.a(e.getMessage());
        }
    }

    private boolean l() {
        ArrayList arrayList = new ArrayList();
        try {
            String strQ = q();
            if (strQ.equals("0")) {
                return false;
            }
            long jK = c0.k();
            int i2 = 1;
            while (true) {
                JSONObject jSONObject = new JSONObject(p(String.format("https://drive-pc.quark.cn/1/clouddrive/file/sort?pr=ucpro&fr=pc&uc_param_str=&pdir_fid=%s&_page=%s&_size=%s&_fetch_total=1&_fetch_sub_dirs=0&_sort=file_type:asc,updated_at:desc", strQ, Integer.valueOf(i2), 50)));
                JSONArray jSONArray = jSONObject.getJSONObject("data").getJSONArray("list");
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                    if (u().equals("NORMAL") || jSONObject2.getLong("created_at") < jK) {
                        arrayList.add(jSONObject2.getString("fid"));
                    }
                }
                JSONObject jSONObject3 = jSONObject.getJSONObject("metadata");
                if (jSONObject3.getInt("_size") != jSONObject3.getInt("_count") || jSONObject3.getInt("_count") == 0) {
                    break;
                }
                i2++;
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
            for (int i4 = 0; i4 < iCeil; i4++) {
                int i5 = i4 * 50;
                i(new ArrayList(arrayList.subList(i5, Math.min(i5 + 50, size))));
            }
            return true;
        } catch (Exception e) {
            SpiderDebug.log("delete pdir list err:" + e);
            return false;
        }
    }

    private void m() {
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        try {
            AlertDialog alertDialog = this.f;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    public static J o() {
        return I.a;
    }

    private String p(String str) {
        return com.github.catvod.spider.merge.AB.m.c.l(str, t());
    }

    private String q() {
        String string;
        try {
            JSONArray jSONArray = new JSONObject(p("https://drive-pc.quark.cn/1/clouddrive/file/sort?pr=ucpro&fr=pc&uc_param_str=&pdir_fid=0&_page=1&_size=50&_fetch_total=1&_fetch_sub_dirs=0&_sort=file_type:asc,updated_at:desc")).getJSONObject("data").getJSONArray("list");
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
            return new JSONObject(G("https://drive-pc.quark.cn/1/clouddrive/file?pr=ucpro&fr=pc&uc_param_str=", map)).getJSONObject("data").getString("fid");
        } catch (Exception e) {
            SpiderDebug.log("getCopyPdir ex: " + e);
            return "0";
        }
    }

    private String s(String str) {
        StringBuilder sb = new StringBuilder();
        v.a(new byte[]{31, 121, 45, -52, -22, 58, -116, 21, 19, 127, 48, -54, -4, 45, -45, 89, 89, 124, 44, -35, -21, 107, -115, 89, 25, 34, 104, -109, -6, 108, -52, 79, 19, 105, 43, -43, -17, 101, -116, 92, 30, 97, 60, -109, -16, 110, -59, 85, 72, 125, 43, -127, -20, 99, -45, 72, 24, 43, 63, -50, -92, 112, -64, 28, 2, 110, 6, -52, -8, 114, -62, 87, 40, 126, 45, -50, -92, 38, -59, 83, 19, 48}, new byte[]{119, 13, 89, -68, -103, 0, -93, 58}, sb, str);
        return new JSONObject(com.github.catvod.spider.merge.AB.m.c.l(t.b(new byte[]{88, 95, -99, 91, -12, -71, -13, 56, 24, 117, -105, 82, -33, -86, -6, 19, 22, 61, -53, 24, -18, -65, -2, 3, 33, 112, -119, 81, -26, -77, -9, 2, 33, 116, -102, 89, -13, -25, -86}, new byte[]{126, 0, -5, 62, -128, -38, -101, 103}, sb), t())).optJSONObject("data").optString("file_name");
    }

    private Map<String, String> t() {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(x())) {
            map.put("Cookie", x());
        }
        map.put("Referer", "https://pan.quark.cn/");
        map.put("User-Agent", i);
        return map;
    }

    private Map<String, String> v() {
        HashMap map = new HashMap();
        map.put("Cookie", x() + ";" + this.b);
        map.put("Referer", "https://pan.quark.cn/");
        map.put("User-Agent", i);
        return map;
    }

    private HashMap<String, Integer> z() {
        HashMap<String, Integer> map = new HashMap<>();
        try {
            if (TextUtils.isEmpty(u())) {
                this.c = "NORMAL";
            }
            if (this.c.equals("EXP_SVIP")) {
                map.put("threads", 12);
            } else {
                this.c.equals("SUPER_VIP");
                map.put("threads", 12);
            }
            map.put("chunksize", 409600);
            if (this.c.equals("NORMAL")) {
                return map;
            }
            String strC = com.github.catvod.spider.merge.AB.o.F.c(com.github.catvod.spider.merge.AB.o.F.f("/.thread"));
            if (!strC.isEmpty()) {
                JSONObject jSONObject = new JSONObject(strC);
                map.put("threads", Integer.valueOf(jSONObject.optInt("threads", 12)));
                map.put("chunksize", Integer.valueOf(jSONObject.optInt("chunksize", 400) * 1024));
            }
        } catch (Exception unused) {
            map.put("threads", 12);
            map.put("chunksize", 409600);
        }
        return map;
    }

    public final String A(String str) {
        try {
            String str2 = "https://drive-social-api.quark.cn/1/clouddrive/chat/conv/msg/batch_send?pr=ucpro&fr=pc&sys=win32&ve=3.15.0&ut=" + this.e + "&guid=";
            String strS = s(str);
            if (TextUtils.isEmpty(strS)) {
                return "";
            }
            JSONObject jSONObject = new JSONObject("{\"conversations\":[{\"conversation_id\":\"300000003429402383\",\"conversation_type\":3,\"file_list\":[{\"client_extra\":{\"device_model\":\"TVBOX\",\"group_id\":\"da9d11ff-5a5b-4b02-83cc-17f6a56d99cf\",\"local_msg_id\":\"8cd8f7b2-6f60-4f2b-99b5-1e7fbead3928\"},\"content\":\"" + strS + "\",\"fid\":\"" + str + "\"}],\"merge_file\":0}],\"return_msg_as_list\":1}");
            Map<String, String> mapT = t();
            ((HashMap) mapT).put("Content-Type", "application/json");
            String strOptString = new JSONObject(com.github.catvod.spider.merge.AB.m.c.g(str2, jSONObject.toString(), mapT).a()).optJSONObject("data").optJSONArray("conversations").optJSONObject(0).optJSONArray("file_list").optJSONObject(0).optJSONObject("send_result").optString("store_msg_id");
            if (TextUtils.isEmpty(strOptString)) {
                return "";
            }
            return new JSONObject(com.github.catvod.spider.merge.AB.m.c.g("https://drive-social-api.quark.cn/1/clouddrive/chat/conv/file/acquire_dl_token?pr=ucpro&fr=pc&sys=win32&ve=3.15.0&ut=" + this.e + "&guid=", new JSONObject("{\"conversation_id\":\"300000003429402383\",\"conversation_type\":3,\"msg_id\":\"" + strOptString + "\"}").toString(), mapT).a()).optJSONObject("data").optString("token");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public final com.github.catvod.spider.merge.AB.c.j B(String str, String str2, String str3) {
        if (TextUtils.isEmpty(K(str))) {
            return c0.e();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<com.github.catvod.spider.merge.AB.j.a> arrayList2 = new ArrayList();
        com.github.catvod.spider.merge.AB.j.a aVar = new com.github.catvod.spider.merge.AB.j.a();
        aVar.j(str2);
        E(str, aVar, arrayList, arrayList2);
        int i2 = 1;
        if (arrayList.size() < 1) {
            return c0.e();
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        arrayList3.addAll(arrayList2);
        this.d.d(arrayList3);
        List listAsList = Arrays.asList("夸克原画", "夸克普画");
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            String strB = "";
            if (!it.hasNext()) {
                break;
            }
            com.github.catvod.spider.merge.AB.j.a aVar2 = (com.github.catvod.spider.merge.AB.j.a) it.next();
            if (!TextUtils.isEmpty(aVar2.e())) {
                StringBuilder sb = new StringBuilder();
                byte[] bArr = new byte[i2];
                bArr[0] = -120;
                sb.append(com.github.catvod.spider.merge.AB.a.a.a(bArr, new byte[]{-45, -94, 27, -29, 102, 114, 110, 90}));
                sb.append(aVar2.e().trim());
                byte[] bArr2 = new byte[i2];
                bArr2[0] = -124;
                strB = t.b(bArr2, new byte[]{-39, 3, -68, 97, -111, -51, 6, -13}, sb);
            }
            StringBuilder sbA = H.a(strB);
            sbA.append(aVar2.c());
            sbA.append(aVar2.g());
            byte[] bArr3 = new byte[i2];
            byte b = 105;
            bArr3[0] = 105;
            v.a(bArr3, new byte[]{77, -71, 100, -125, -60, -67, -123, -79}, sbA, str);
            byte[] bArr4 = new byte[i2];
            bArr4[0] = -49;
            sbA.append(com.github.catvod.spider.merge.AB.a.a.a(bArr4, new byte[]{-28, 60, 23, 65, 17, 99, 85, 60}));
            sbA.append(aVar2.b());
            byte[] bArr5 = new byte[i2];
            bArr5[0] = 48;
            sbA.append(com.github.catvod.spider.merge.AB.a.a.a(bArr5, new byte[]{27, -52, 101, -77, 11, 31, 36, 72}));
            sbA.append(aVar2.f());
            String string = sbA.toString();
            if (!TextUtils.isEmpty(str3) && !str3.contains("http")) {
                StringBuilder sbA2 = H.a(string);
                byte[] bArr6 = new byte[i2];
                bArr6[0] = -113;
                v.a(bArr6, new byte[]{-92, 105, -19, -128, -63, 8, -107, 25}, sbA2, str3);
                byte[] bArr7 = new byte[i2];
                bArr7[0] = 63;
                sbA2.append(com.github.catvod.spider.merge.AB.a.a.a(bArr7, new byte[]{20, 84, -103, -80, -114, -11, -33, 42}));
                sbA2.append(aVar2.c());
                string = sbA2.toString();
            }
            StringBuilder sbA3 = H.a(string);
            byte[] bArr8 = new byte[i2];
            bArr8[0] = -81;
            sbA3.append(com.github.catvod.spider.merge.AB.a.a.a(bArr8, new byte[]{-124, -115, -112, -114, 9, -2, -88, 0}));
            String strC = aVar2.c();
            ArrayList<com.github.catvod.spider.merge.AB.j.a> arrayList6 = new ArrayList();
            String lowerCase = c0.r(strC).toLowerCase();
            for (com.github.catvod.spider.merge.AB.j.a aVar3 : arrayList2) {
                String lowerCase2 = c0.r(aVar3.c()).toLowerCase();
                if (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase)) {
                    arrayList6.add(aVar3);
                }
            }
            if (arrayList6.isEmpty()) {
                arrayList6.addAll(arrayList2);
            }
            StringBuilder sb2 = new StringBuilder();
            for (com.github.catvod.spider.merge.AB.j.a aVar4 : arrayList6) {
                byte[] bArr9 = new byte[i2];
                bArr9[0] = b;
                sb2.append(com.github.catvod.spider.merge.AB.a.a.a(bArr9, new byte[]{66, 103, 43, 68, -77, 72, 6, 70}));
                sb2.append(c0.r(aVar4.c()));
                sb2.append("@@@");
                sb2.append(c0.f(aVar4.c()));
                sb2.append("@@@");
                sb2.append(aVar4.b());
                sb2.append("@@@");
                sb2.append(aVar4.f());
                i2 = 1;
                b = 105;
            }
            sbA3.append(sb2.toString());
            arrayList4.add(sbA3.toString());
            i2 = 1;
        }
        for (int i3 = 0; i3 < listAsList.size(); i3++) {
            arrayList5.add(TextUtils.join("#", arrayList4));
        }
        com.github.catvod.spider.merge.AB.c.j jVar = new com.github.catvod.spider.merge.AB.c.j();
        jVar.g(str);
        jVar.e(str);
        jVar.i("");
        jVar.h(this.d.b() == null ? "获取视频名称失败" : this.d.b().b());
        jVar.k(TextUtils.join("$$$", arrayList5));
        jVar.j(TextUtils.join("$$$", listAsList));
        jVar.b("夸克网盘");
        return jVar;
    }

    public final String F(String[] strArr, String str) {
        com.github.catvod.spider.merge.AB.c.e eVarW;
        j();
        if (str.split("#")[0].contains("原画")) {
            eVarW = r(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "");
            if (eVarW.b() == 0) {
                String str2 = (String) eVarW.c();
                if (com.github.catvod.spider.merge.AB.o.H.b(5).booleanValue()) {
                    HashMap<String, Integer> mapZ = z();
                    int iIntValue = mapZ.get("threads").intValue();
                    mapZ.get("chunksize").intValue();
                    String strD = com.github.catvod.spider.merge.AB.o.H.d(str2, iIntValue, 0);
                    if (strArr.length <= 4) {
                        com.github.catvod.spider.merge.AB.c.g gVar = new com.github.catvod.spider.merge.AB.c.g();
                        gVar.y(strD);
                        gVar.x(y(strArr));
                        gVar.j();
                        gVar.f(v());
                        return gVar.toString();
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(Proxy.getUrl());
                    sb.append("?do=danmu&vodName=");
                    sb.append(strArr[3]);
                    sb.append("&vodIndex=");
                    sb.append(strArr[4]);
                    String strB = t.b(new byte[]{-56, 117, -49, -7, 38, 103, -56, 80}, new byte[]{-18, 3, -96, -99, 115, 21, -92, 109}, sb);
                    com.github.catvod.spider.merge.AB.c.g gVar2 = new com.github.catvod.spider.merge.AB.c.g();
                    gVar2.y(strD);
                    gVar2.a(strB);
                    gVar2.x(y(strArr));
                    gVar2.j();
                    gVar2.f(v());
                    return gVar2.toString();
                }
                if (TextUtils.isEmpty(com.github.catvod.spider.merge.AB.o.H.g())) {
                    String strJ = J("down", strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "", URLEncoder.encode(str2));
                    com.github.catvod.spider.merge.AB.c.g gVar3 = new com.github.catvod.spider.merge.AB.c.g();
                    gVar3.y(strJ);
                    gVar3.x(y(strArr));
                    gVar3.j();
                    gVar3.f(t());
                    return gVar3.toString();
                }
                if (strArr.length <= 4) {
                    com.github.catvod.spider.merge.AB.c.g gVar4 = new com.github.catvod.spider.merge.AB.c.g();
                    gVar4.y(com.github.catvod.spider.merge.AB.o.H.e(str2));
                    gVar4.j();
                    gVar4.f(v());
                    return gVar4.toString();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Proxy.getUrl());
                sb2.append("?do=danmu&vodName=");
                sb2.append(strArr[3]);
                sb2.append("&vodIndex=");
                sb2.append(strArr[4]);
                String strB2 = t.b(new byte[]{-30, 61, 55, 70, 75, 86, 27, 125}, new byte[]{-60, 75, 88, 34, 30, 36, 119, 64}, sb2);
                com.github.catvod.spider.merge.AB.c.g gVar5 = new com.github.catvod.spider.merge.AB.c.g();
                gVar5.y(com.github.catvod.spider.merge.AB.o.H.e(str2));
                gVar5.a(strB2);
                gVar5.x(y(strArr));
                gVar5.j();
                gVar5.f(v());
                return gVar5.toString();
            }
        } else {
            eVarW = w(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "", Boolean.TRUE);
            if (eVarW.b() == 0) {
                List list = (List) eVarW.c();
                com.github.catvod.spider.merge.AB.c.g gVar6 = new com.github.catvod.spider.merge.AB.c.g();
                gVar6.z(list);
                gVar6.x(y(strArr));
                gVar6.j();
                gVar6.f(v());
                return gVar6.toString();
            }
        }
        return com.github.catvod.spider.merge.AB.c.g.n(eVarW.d());
    }

    public final Object[] H(Map<String, String> map) {
        com.github.catvod.spider.merge.AB.c.e<String> eVarR = r(map.get("shareId"), map.get("fileId"), map.get("fileToken"));
        if (eVarR.b() != 0) {
            return null;
        }
        return new Object[]{200, "application/octet-stream", new ByteArrayInputStream(c0.t(com.github.catvod.spider.merge.AB.m.c.e((String) eVarR.c(), t()).body().bytes()))};
    }

    public final Object[] I(Map<String, String> map) {
        try {
            map.get("shareId");
            map.get("fileId");
            String str = map.get("cate");
            map.get("tokenId");
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
            com.github.catvod.spider.merge.AB.o.C c = this.h;
            if (c != null) {
                c.c();
            }
            SpiderDebug.log("proxyVideo numThreads: " + i3 + " chunksize: " + (i2 / 1024));
            com.github.catvod.spider.merge.AB.o.C c2 = new com.github.catvod.spider.merge.AB.o.C(str2, treeMap, i3, i2);
            this.h = c2;
            return c2.f();
        } catch (Exception e) {
            SpiderDebug.log("err:::++" + e);
            return new Object[0];
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.AB.j.e>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.AB.j.e>] */
    public final String K(String str) {
        com.github.catvod.spider.merge.AB.j.e eVar = (com.github.catvod.spider.merge.AB.j.e) j.get(str);
        this.d = eVar;
        if (eVar != null && eVar.a(str)) {
            SpiderDebug.log("shareToken:" + this.d.toString());
        }
        com.github.catvod.spider.merge.AB.j.e eVar2 = this.d;
        if (eVar2 != null && eVar2.a(str)) {
            return this.d.b().a();
        }
        String str2 = "https://drive-pc.quark.cn/1/clouddrive/share/sharepage/token?__t=" + System.currentTimeMillis();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("pwd_id", str);
        jsonObject.addProperty("passcode", "");
        String strA = com.github.catvod.spider.merge.AB.m.c.g(str2, jsonObject.toString(), t()).a();
        StringBuilder sb = new StringBuilder();
        v.a(new byte[]{-51, 92, -48, 22, -120, 63, -94, 42, -6, 91, -44, 23, -117, 76, -72, 46, -18, 76, -27, 11, -120, 122, -66, 20}, new byte[]{-100, 41, -79, 100, -29, 31, -48, 79}, sb, str);
        sb.append("]...");
        sb.append(strA);
        SpiderDebug.log(sb.toString());
        try {
            this.d = (com.github.catvod.spider.merge.AB.j.e) new Gson().fromJson(strA, com.github.catvod.spider.merge.AB.j.e.class);
            SpiderDebug.log("Stoken: " + this.d.b().a());
            com.github.catvod.spider.merge.AB.j.e eVar3 = this.d;
            eVar3.e(str);
            eVar3.f();
            j.put(str, this.d);
            return this.d.b() == null ? "" : this.d.b().a();
        } catch (Exception e) {
            SpiderDebug.log("refreshShareToken Quark:" + e);
            return "";
        }
    }

    public final void M(String str) {
        SpiderDebug.log("cookie:" + str);
        SpiderDebug.log("setQuarkCookie cookie: " + str);
        try {
            if (!TextUtils.isEmpty(str)) {
                Map<String, String> mapT = t();
                ((HashMap) mapT).put("Cookie", str);
                JSONObject jSONObject = new JSONObject(com.github.catvod.spider.merge.AB.m.c.l("https://drive-pc.quark.cn/1/clouddrive/member?pr=ucpro&fr=pc&uc_param_str=&fetch_subscribe=true&_ch=home&fetch_identity=true", mapT));
                SpiderDebug.log("setQuarkCookie cookie info: " + jSONObject);
                if ("200".equals(jSONObject.optString("status"))) {
                    com.github.catvod.spider.merge.AB.o.G.c(".quarkMemberType", jSONObject.optJSONObject("data").optString("member_type"));
                    com.github.catvod.spider.merge.AB.o.G.c(".quark", str);
                }
            }
        } catch (Exception e) {
            SpiderDebug.log("setQuarkCookie err: " + e.getMessage());
        }
        O();
    }

    public final void N() {
        try {
            int iA = com.github.catvod.spider.merge.AB.J.a.a(16);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.setMargins(iA, iA, iA, iA);
            EditText editText = new EditText(Init.context());
            frameLayout.addView(editText, layoutParams);
            this.f = new AlertDialog.Builder(Init.getActivity()).setTitle("请输入夸克Cookie【支持字符串和Http】").setView(frameLayout).setNeutralButton("点我，使用夸克APP扫码", new DialogInterface.OnClickListener(this) { // from class: com.github.catvod.spider.merge.AB.b.D
                public final J a;

                {
                    this.a = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    J.d(this.a);
                }
            }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.ok, new C(this, editText, 0)).show();
        } catch (Exception e) {
            e.printStackTrace();
            SpiderDebug.log("showInput2 ex: " + e.getMessage());
        }
    }

    public final void j() {
        try {
            try {
                if (TextUtils.isEmpty(x())) {
                    throw new Exception("empty cookie");
                }
                while (TextUtils.isEmpty(x())) {
                    SystemClock.sleep(300L);
                }
            } catch (Exception e) {
                SystemClock.sleep(400L);
                SpiderDebug.log("checkCookie: " + e.getMessage());
                O();
                Init.run(new RunnableC0081b(this, 1));
                while (TextUtils.isEmpty(x())) {
                    SystemClock.sleep(300L);
                }
            }
        } catch (Throwable th) {
            while (TextUtils.isEmpty(x())) {
                SystemClock.sleep(300L);
            }
            throw th;
        }
    }

    public final com.github.catvod.spider.merge.AB.c.e<String> r(String str, String str2, String str3) {
        try {
            K(str);
            if (!TextUtils.isEmpty(str)) {
                l();
            }
            com.github.catvod.spider.merge.AB.c.e<String> eVarK = k(str, str2, str3, Boolean.TRUE);
            if (eVarK.b() != 0) {
                return eVarK;
            }
            String str4 = (String) eVarK.c();
            if (TextUtils.isEmpty(str4)) {
                return com.github.catvod.spider.merge.AB.c.e.a("fileId 转存失败");
            }
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(str4);
            map.put("fids", arrayList);
            String strA = A(str4);
            if (!TextUtils.isEmpty(strA)) {
                map.put("token", strA);
            }
            JSONObject jSONObject = new JSONObject(G("https://drive-pc.quark.cn/1/clouddrive/file/download?pr=ucpro&fr=pc", map));
            if (jSONObject.getInt("status") == 200 && jSONObject.getInt("code") == 0) {
                return com.github.catvod.spider.merge.AB.c.e.h(jSONObject.optJSONArray("data").optJSONObject(0).optString("download_url"));
            }
            return com.github.catvod.spider.merge.AB.c.e.a(jSONObject.getString("message"));
        } catch (Exception e) {
            return com.github.catvod.spider.merge.AB.c.e.a(e.getMessage());
        }
    }

    public final String u() {
        return com.github.catvod.spider.merge.AB.o.G.b(".quarkMemberType");
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final com.github.catvod.spider.merge.AB.c.e<List<String>> w(String str, String str2, String str3, Boolean bool) {
        try {
            try {
                K(str);
                com.github.catvod.spider.merge.AB.c.e<String> eVarK = k(str, str2, str3, Boolean.TRUE);
                if (eVarK.b() != 0) {
                    com.github.catvod.spider.merge.AB.c.e<List<String>> eVarA = com.github.catvod.spider.merge.AB.c.e.a((String) eVarK.c());
                    if (!TextUtils.isEmpty(str)) {
                        m();
                    }
                    return eVarA;
                }
                String str4 = (String) eVarK.c();
                HashMap map = new HashMap();
                map.put("fid", str4);
                map.put("resolutions", "normal,low,high,super,2k,4k");
                map.put("supports", "fmp4,m3u8");
                JSONObject jSONObject = new JSONObject(G("https://drive-pc.quark.cn/1/clouddrive/file/v2/play?pr=ucpro&fr=pc&uc_param_str=", map));
                if (jSONObject.optString("message").contains("file not found")) {
                    com.github.catvod.spider.merge.AB.c.e<List<String>> eVarH = com.github.catvod.spider.merge.AB.c.e.h(new ArrayList());
                    if (!TextUtils.isEmpty(str)) {
                        m();
                    }
                    return eVarH;
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONObject("data").optJSONArray("video_list");
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                    if (jSONObjectOptJSONObject.optBoolean("accessable")) {
                        arrayList.add((String) this.g.get(jSONObjectOptJSONObject.optString("resolution")));
                        arrayList.add(jSONObjectOptJSONObject.optJSONObject("video_info").optString("url"));
                    }
                }
                com.github.catvod.spider.merge.AB.c.e<List<String>> eVarW = (bool.booleanValue() && arrayList.size() == 0) ? w(str, str4, str3, Boolean.FALSE) : com.github.catvod.spider.merge.AB.c.e.h(arrayList);
                if (!TextUtils.isEmpty(str)) {
                    m();
                }
                return eVarW;
            } catch (Exception e) {
                e.printStackTrace();
                com.github.catvod.spider.merge.AB.c.e<List<String>> eVarH2 = com.github.catvod.spider.merge.AB.c.e.h(new ArrayList());
                if (!TextUtils.isEmpty(str)) {
                    m();
                }
                return eVarH2;
            }
        } catch (Throwable th) {
            if (!TextUtils.isEmpty(str)) {
                m();
            }
            throw th;
        }
    }

    public final String x() {
        String strB = com.github.catvod.spider.merge.AB.o.G.b(".quark");
        return TextUtils.isEmpty(strB) ? c0.q(".quark") : strB;
    }

    public final List<com.github.catvod.spider.merge.AB.c.h> y(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            SpiderDebug.log(str);
            if (str.contains("@@@")) {
                String[] strArrSplit = str.split("@@@");
                String str2 = strArrSplit[0];
                String str3 = strArrSplit[1];
                String str4 = Proxy.getUrl() + "?do=zimu&type=quark&shareId=" + strArr[0] + "&fileId=" + strArrSplit[2] + "&fileToken=" + strArrSplit[3];
                com.github.catvod.spider.merge.AB.c.h hVar = new com.github.catvod.spider.merge.AB.c.h();
                hVar.c(str2);
                com.github.catvod.spider.merge.AB.c.h hVarA = hVar.a(str3);
                hVarA.d(str4);
                arrayList.add(hVarA);
            }
        }
        return arrayList;
    }
}
