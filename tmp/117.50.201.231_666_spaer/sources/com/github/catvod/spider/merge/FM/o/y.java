package com.github.catvod.spider.merge.FM.o;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.FM.L.P;
import com.github.catvod.spider.merge.FM.b.H;
import com.github.catvod.spider.merge.FM.b.RunnableC0312g;
import com.github.catvod.spider.merge.FM.b.RunnableC0322q;
import com.github.catvod.spider.merge.FM.d.C0336d;
import com.github.catvod.spider.merge.FM.g.C0346b;
import com.github.catvod.spider.merge.FM.g.C0352h;
import com.github.catvod.spider.merge.FM.m.C0378c;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class y {
    private AlertDialog a;
    private ScheduledExecutorService b;

    y() {
    }

    private void A() {
        ScheduledExecutorService scheduledExecutorService = this.b;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.b.shutdown();
        }
    }

    public static /* synthetic */ void a(y yVar, Map map, String str) {
        yVar.getClass();
        map.put("push", "");
        map.put("flag", yVar.p(str));
        map.put("button", "1");
        map.put("input", "");
        Init.execute(new w(yVar, map, 1));
    }

    public static /* synthetic */ void b(y yVar, Map map) {
        yVar.A();
        map.put("button", "0");
        map.put("input", "1");
        yVar.u(map);
    }

    public static /* synthetic */ void c(y yVar, EditText editText, EditText editText2) {
        yVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(editText.getText().toString());
        sb.append("|");
        sb.append(editText2.getText().toString());
        yVar.s("cloud", P.a(new byte[]{-65, 114}, new byte[]{-61, 43, 94, 103, 81, 6, -22, 122}, sb));
    }

    public static void e(y yVar) {
        yVar.getClass();
        try {
            AlertDialog alertDialog = yVar.a;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static /* synthetic */ void f(y yVar, Map map) {
        yVar.A();
        map.put("push", "1");
        map.put("flag", yVar.p(""));
        map.put("button", "1");
        yVar.u(map);
    }

    public static /* synthetic */ void i(y yVar, EditText editText, EditText editText2) {
        yVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(editText.getText().toString());
        sb.append("|");
        sb.append(editText2.getText().toString());
        yVar.s("cloud123", P.a(new byte[]{-50, 98}, new byte[]{-78, 59, -104, 102, -31, 91, -118, -50}, sb));
    }

    public static /* synthetic */ void k(y yVar, EditText editText) {
        yVar.getClass();
        yVar.s("ucMachineCode", editText.getText().toString());
    }

    public static /* synthetic */ void l(y yVar, String str, EditText editText) {
        yVar.getClass();
        yVar.s(str, editText.getText().toString());
    }

    public static /* synthetic */ void m(y yVar, Map map, String str) {
        yVar.getClass();
        map.put("push", "");
        map.put("flag", yVar.p(str));
        map.put("button", "1");
        Init.execute(new v(yVar, map, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(Map<String, String> map) {
        String str;
        String string;
        String str2;
        String str3;
        try {
            if (!"ali".equals(map.get("site"))) {
                if ("quark".equals(map.get("site"))) {
                    String strM = C0378c.m("https://uop.quark.cn/cas/ajax/getServiceTicketByQrcodeToken?client_id=532&v=1.2&token=" + new JSONObject(map.get("url")).optString("token"));
                    SpiderDebug.log(strM);
                    JSONObject jSONObject = new JSONObject(strM);
                    if (!"ok".equals(jSONObject.optString("message"))) {
                        return;
                    }
                    String strOptString = jSONObject.optJSONObject("data").optJSONObject("members").optString("service_ticket");
                    HashMap map2 = new HashMap();
                    map2.put("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/38.0.2125.122 Safari/537.36 SE 2.X MetaSr 1.0");
                    map2.put("Accept", "application/json, text/plain, */*");
                    map2.put("Referer", "https://pan.quark.cn/");
                    str2 = "";
                    for (String str4 : C0378c.e("https://pan.quark.cn/account/info?st=" + strOptString + "&lw=scan", map2).headers("set-cookie")) {
                        if (str4.contains("__pus=")) {
                            str2 = str2 + str4.split(";")[0] + ";";
                        }
                    }
                    str3 = map.get("site");
                } else if ("uc".equals(map.get("site"))) {
                    HashMap map3 = new HashMap();
                    map3.put("Accept", "application/json, text/plain, */*");
                    map3.put("Content-Type", "application/x-www-form-urlencoded");
                    map3.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36 Edg/126.0.0.0");
                    map3.put("Referer", "https://broccoli.uc.cn/");
                    String str5 = System.currentTimeMillis() + "";
                    HashMap map4 = new HashMap();
                    map4.put("client_id", "381");
                    map4.put("v", "1.2");
                    map4.put("request_id", str5);
                    map4.put("token", new JSONObject(map.get("url")).optString("token"));
                    JSONObject jSONObject2 = new JSONObject(C0378c.h("https://api.open.uc.cn/cas/ajax/getServiceTicketByQrcodeToken?__dt=18884&__t=" + str5, map4, map3).a());
                    if (!"ok".equals(jSONObject2.optString("message"))) {
                        return;
                    }
                    str2 = "";
                    Iterator it = C0378c.e("https://drive.uc.cn/account/info?st=" + jSONObject2.optJSONObject("data").optJSONObject("members").optString("service_ticket"), map3).headers("set-cookie").iterator();
                    while (it.hasNext()) {
                        str2 = str2 + ((String) it.next()).split(";")[0] + ";";
                    }
                    str3 = map.get("site");
                } else {
                    if (!"bili".equals(map.get("site"))) {
                        if (!"uc_tv".equals(map.get("site")) && !"cloud".equals(map.get("site")) && "baidu".equals(map.get("site")) && com.github.catvod.spider.merge.FM.b.x.s()) {
                            z();
                            return;
                        }
                        return;
                    }
                    HashMap map5 = new HashMap();
                    map5.put("Accept", "application/json, text/plain, */*");
                    map5.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36 Edg/126.0.0.0");
                    String strO = C0352h.b(C0378c.n("https://passport.bilibili.com/x/passport-login/web/qrcode/poll?qrcode_key=" + new JSONObject(map.get("url")).optString("token") + "&source=main_mini", map5)).a().o();
                    if (TextUtils.isEmpty(strO)) {
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    for (String str6 : Uri.parse(strO).getQuery().split("&")) {
                        sb.append(str6);
                        sb.append(";");
                    }
                    str = map.get("site");
                    string = sb.toString();
                }
                s(str3, str2);
                return;
            }
            C0336d c0336dC = C0336d.g(C0378c.i("https://passport.aliyundrive.com/newlogin/qrcode/query.do?appName=aliyun_drive&fromSite=52&_bx-v=2.2.3", r(new JSONObject(map.get("url")).optJSONObject("token")))).b().c();
            if (!c0336dC.f()) {
                return;
            }
            str = map.get("site");
            string = c0336dC.e();
            s(str, string);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static y o() {
        return C0393i.b;
    }

    private String p(String str) {
        return "ali".equals(str) ? "请使用阿里云盘APP扫码" : "quark".equals(str) ? "请使用夸克浏览器扫码" : "uc".equals(str) ? "请使用UC浏览器扫码" : "bili".equals(str) ? "请使用哔哩哔哩APP扫码" : "cloud".equals(str) ? "请使用天翼云盘APP扫码" : "请使用浏览器或者微信扫描二维码\n(扫码设备和当前设备要在同一局域网内)";
    }

    private JSONObject q(String str) {
        String str2;
        String strK;
        try {
            JSONObject jSONObject = new JSONObject();
            if ("ali".equals(str)) {
                strK = C0378c.m("https://passport.aliyundrive.com/newlogin/qrcode/generate.do?appName=aliyun_drive&fromSite=52&appName=aliyun_drive&appEntrance=web&isMobile=false&lang=zh_CN&returnUrl=&bizParams=&_bx-v=2.2.3");
                C0336d c0336dC = C0336d.g(strK).b().c();
                SpiderDebug.log(c0336dC.toString());
                jSONObject.put("url", c0336dC.a());
                jSONObject.put("token", new JSONObject(c0336dC.d()));
                str2 = "json";
            } else if ("quark".equals(str)) {
                HashMap map = new HashMap();
                map.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) quark-cloud-drive/3.0.1 Chrome/100.0.4896.160 Electron/18.3.5.12-a038f7b798 Safari/537.36 Channel/pckk_other_ch");
                strK = new JSONObject(C0378c.n("https://uop.quark.cn/cas/ajax/getTokenForQrcodeLogin?client_id=532&v=1.2", map)).optJSONObject("data").optJSONObject("members").optString("token");
                jSONObject.put("url", "https://su.quark.cn/4_eMHBJ?token=" + strK + "&client_id=532&ssb=weblogin&uc_param_str=&uc_biz_str=S%3Acustom%7COPT%3ASAREA%400%7COPT%3AIMMERSIVE%401%7COPT%3ABACK_BTN_STYLE%400");
                str2 = "token";
            } else if ("uc".equals(str)) {
                HashMap map2 = new HashMap();
                map2.put("Accept", "application/json, text/plain, */*");
                map2.put("Content-Type", "application/x-www-form-urlencoded");
                map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36 Edg/126.0.0.0");
                map2.put("Referer", "https://broccoli.uc.cn/");
                String str3 = System.currentTimeMillis() + "";
                HashMap map3 = new HashMap();
                map3.put("client_id", "381");
                map3.put("v", "1.2");
                map3.put("request_id", str3);
                strK = new JSONObject(C0378c.h("https://api.open.uc.cn/cas/ajax/getTokenForQrcodeLogin?__dt=641254&__t=" + str3, map3, map2).a()).optJSONObject("data").optJSONObject("members").optString("token");
                jSONObject.put("url", "https://su.uc.cn/1_n0ZCv?uc_param_str=dsdnfrpfbivesscpgimibtbmnijblauputogpintnwktprchmt&token=" + strK + "&client_id=381&uc_biz_str=S%3Acustom%7CC%3Atitlebar_fix");
                str2 = "token";
            } else {
                if (!"bili".equals(str)) {
                    if (!"uc_tv".equals(str) && !"cloud".equals(str) && "baidu".equals(str)) {
                        com.github.catvod.spider.merge.FM.b.x.k();
                    }
                    return jSONObject;
                }
                HashMap map4 = new HashMap();
                map4.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36 Edg/126.0.0.0");
                C0346b c0346bA = C0352h.b(C0378c.n("https://passport.bilibili.com/x/passport-login/web/qrcode/generate?source=main-mini", map4)).a();
                jSONObject.put("url", c0346bA.o());
                str2 = "token";
                strK = c0346bA.k();
            }
            jSONObject.put(str2, strK);
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    private Map<String, String> r(JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, jSONObject.optString(next));
        }
        return map;
    }

    private String s(String str, String str2) {
        try {
            if (!"ali".equals(str) && !"quark".equals(str) && !"uc".equals(str) && !"bili".equals(str)) {
                if ("cloud123".equals(str)) {
                    str2.split("\\|");
                    z();
                    return "";
                }
                if ("ucMachineCode".equals(str)) {
                    if (str2.startsWith("http")) {
                        String[] strArrSplit = new URL(str2).getQuery().split("&");
                        int length = strArrSplit.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            String str3 = strArrSplit[i];
                            if (str3.startsWith("ut=")) {
                                str3.substring("ut=".length());
                                break;
                            }
                            i++;
                        }
                    }
                } else if ("cloud".equals(str)) {
                    str2.split("\\|");
                    z();
                    return "";
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            z();
            throw th;
        }
        z();
        return "推送成功,请在设备上查看";
    }

    private void t(Map<String, String> map) {
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = C0397m.a(20);
        layoutParams.gravity = 1;
        TextView textView = new TextView(Init.context());
        textView.setText(map.get("flag"));
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        linearLayout.addView(textView, layoutParams);
        int iA = C0397m.a(200);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iA, iA);
        layoutParams2.gravity = 17;
        ImageView imageView = new ImageView(Init.context());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageBitmap(com.github.catvod.spider.merge.FM.b.x.e().j());
        layoutParams2.setMargins(C0397m.a(16), C0397m.a(16), C0397m.a(16), C0397m.a(16));
        linearLayout.addView(imageView, layoutParams2);
        Init.execute(new x(this, map, 0));
        this.a = new AlertDialog.Builder(Init.getActivity()).setView(linearLayout).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01bb A[Catch: Exception -> 0x01df, TryCatch #0 {Exception -> 0x01df, blocks: (B:3:0x0004, B:5:0x0016, B:7:0x001a, B:9:0x0022, B:11:0x0026, B:13:0x002e, B:15:0x0032, B:19:0x004b, B:23:0x005c, B:27:0x006d, B:31:0x0091, B:33:0x00a7, B:35:0x00f6, B:45:0x013f, B:47:0x0163, B:50:0x0177, B:52:0x018c, B:57:0x019a, B:59:0x01aa, B:58:0x01a2, B:61:0x01bb, B:62:0x01d1, B:63:0x01d8, B:38:0x0125, B:41:0x0131, B:30:0x007e), top: B:68:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void u(final java.util.Map<java.lang.String, java.lang.String> r38) {
        /*
            Method dump skipped, instruction units count: 485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.FM.o.y.u(java.util.Map):void");
    }

    private void v(final Map<String, String> map) {
        EditText editText = new EditText(Init.context());
        EditText editText2 = new EditText(Init.context());
        String str = map.get("model");
        LinearLayout linearLayout = new LinearLayout(Init.context());
        final int i = 1;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = C0397m.a(20);
        layoutParams.gravity = 1;
        TextView textView = new TextView(Init.context());
        textView.setText(map.get("flag"));
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        linearLayout.addView(textView, layoutParams);
        if (TextUtils.isEmpty(str)) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.setMargins(C0397m.a(16), C0397m.a(16), C0397m.a(16), C0397m.a(16));
            editText.setHint("请输入123云盘账号");
            linearLayout.addView(editText, layoutParams2);
            editText2.setHint("请输入123云盘密码");
            linearLayout.addView(editText2, layoutParams2);
        } else {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 17;
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(com.github.catvod.spider.merge.FM.E.a.b("", 240));
            linearLayout.addView(imageView, layoutParams3);
        }
        AlertDialog.Builder view = new AlertDialog.Builder(Init.getActivity()).setView(linearLayout);
        this.a = (TextUtils.isEmpty(str) ? view.setNeutralButton("远程输入", new p(this, map, i)).setNegativeButton("登录", new DialogInterfaceOnClickListenerC0398n(this, editText, editText2, i)) : view.setNeutralButton("手动输入", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.FM.b.L
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                switch (i) {
                    case 0:
                        Q.c((Q) this, (EditText) map);
                        break;
                    default:
                        com.github.catvod.spider.merge.FM.o.y yVar = (com.github.catvod.spider.merge.FM.o.y) this;
                        Map map2 = (Map) map;
                        yVar.getClass();
                        map2.put("model", "");
                        map2.put("flag", "请输入123云盘账号密码");
                        Init.execute(new com.github.catvod.spider.merge.FM.o.x(yVar, map2, 1));
                        break;
                }
            }
        })).show();
    }

    private void w(final Map<String, String> map) {
        final EditText editText = new EditText(Init.context());
        final EditText editText2 = new EditText(Init.context());
        String str = map.get("model");
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = C0397m.a(20);
        layoutParams.gravity = 1;
        TextView textView = new TextView(Init.context());
        textView.setText(map.get("flag"));
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        linearLayout.addView(textView, layoutParams);
        if (TextUtils.isEmpty(str)) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.setMargins(C0397m.a(16), C0397m.a(16), C0397m.a(16), C0397m.a(16));
            editText.setHint("请输入天翼云盘账号");
            linearLayout.addView(editText, layoutParams2);
            editText2.setHint("请输入天翼云盘密码");
            linearLayout.addView(editText2, layoutParams2);
        } else {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 17;
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(com.github.catvod.spider.merge.FM.E.a.b("", 240));
            linearLayout.addView(imageView, layoutParams3);
        }
        AlertDialog.Builder view = new AlertDialog.Builder(Init.getActivity()).setView(linearLayout);
        this.a = (TextUtils.isEmpty(str) ? view.setNeutralButton("远程输入", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.FM.o.t
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                y yVar = this.a;
                Map map2 = map;
                yVar.getClass();
                map2.put("model", "1");
                map2.put("flag", "请使用微信或者浏览器扫码下方二维码远程输入");
                Init.execute(new H(yVar, map2, 3));
            }
        }).setNegativeButton("登录", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.FM.o.q
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                final y yVar = this.a;
                final EditText editText3 = editText;
                final EditText editText4 = editText2;
                yVar.getClass();
                Init.execute(new Runnable() { // from class: com.github.catvod.spider.merge.FM.o.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        y.c(yVar, editText3, editText4);
                    }
                });
            }
        }) : view.setNeutralButton("手动输入", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.FM.o.s
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                y yVar = this.a;
                Map map2 = map;
                yVar.getClass();
                map2.put("model", "");
                map2.put("flag", "请输入天翼云盘账号密码");
                Init.execute(new v(yVar, map2, 2));
            }
        })).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(Map<String, String> map) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.b = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(new w(this, map, 0), 1L, 1L, TimeUnit.SECONDS);
    }

    private void z() {
        A();
        Init.run(new RunnableC0322q(this, 3));
    }

    public final void x(Map<String, String> map) {
        try {
            map.put("url", q(map.get("site")).toString());
            Init.run(new RunnableC0312g(this, map, 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
