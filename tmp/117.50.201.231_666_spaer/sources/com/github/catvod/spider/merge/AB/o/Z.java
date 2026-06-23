package com.github.catvod.spider.merge.AB.o;

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
import com.github.catvod.spider.merge.AB.b.DialogInterfaceOnClickListenerC0093n;
import com.github.catvod.spider.merge.AB.b.RunnableC0081b;
import com.github.catvod.spider.merge.AB.b.RunnableC0087h;
import com.github.catvod.spider.merge.AB.b.RunnableC0090k;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class Z {
    private AlertDialog a;
    private ScheduledExecutorService b;

    Z() {
    }

    private void A() {
        ScheduledExecutorService scheduledExecutorService = this.b;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.b.shutdown();
        }
    }

    public static /* synthetic */ void a(Z z, Map map, String str) {
        z.getClass();
        map.put("push", "");
        map.put("flag", z.p(str));
        map.put("button", "1");
        map.put("input", "");
        Init.execute(new X(z, map, 1));
    }

    public static /* synthetic */ void b(Z z, Map map) {
        z.A();
        map.put("button", "0");
        map.put("input", "1");
        z.u(map);
    }

    public static /* synthetic */ void c(Z z, EditText editText, EditText editText2) {
        z.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(editText.getText().toString());
        sb.append("|");
        sb.append(editText2.getText().toString());
        z.s("cloud", com.github.catvod.spider.merge.AB.b.t.b(new byte[]{-17, -127}, new byte[]{-109, -40, -36, 29, -81, 17, -102, 8}, sb));
    }

    public static void e(Z z) {
        z.getClass();
        try {
            AlertDialog alertDialog = z.a;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static /* synthetic */ void f(Z z, Map map) {
        z.A();
        map.put("push", "1");
        map.put("flag", z.p(""));
        map.put("button", "1");
        z.u(map);
    }

    public static /* synthetic */ void i(Z z, EditText editText, EditText editText2) {
        z.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(editText.getText().toString());
        sb.append("|");
        sb.append(editText2.getText().toString());
        z.s("cloud123", com.github.catvod.spider.merge.AB.b.t.b(new byte[]{-4, -125}, new byte[]{-128, -38, 11, 15, -58, -52, -16, -113}, sb));
    }

    public static /* synthetic */ void k(Z z, EditText editText) {
        z.getClass();
        z.s("ucMachineCode", editText.getText().toString());
    }

    public static /* synthetic */ void l(Z z, String str, EditText editText) {
        z.getClass();
        z.s(str, editText.getText().toString());
    }

    public static /* synthetic */ void m(Z z, Map map, String str) {
        z.getClass();
        map.put("push", "");
        map.put("flag", z.p(str));
        map.put("button", "1");
        Init.execute(new W(z, map, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(Map<String, String> map) {
        Z z;
        String str;
        String string;
        String string2;
        String str2;
        try {
            if (!"ali".equals(map.get("site"))) {
                if ("quark".equals(map.get("site"))) {
                    String strK = com.github.catvod.spider.merge.AB.m.c.k("https://uop.quark.cn/cas/ajax/getServiceTicketByQrcodeToken?client_id=532&v=1.2&token=" + new JSONObject(map.get("url")).optString("token"));
                    SpiderDebug.log(strK);
                    JSONObject jSONObject = new JSONObject(strK);
                    if (!"ok".equals(jSONObject.optString("message"))) {
                        return;
                    }
                    String strOptString = jSONObject.optJSONObject("data").optJSONObject("members").optString("service_ticket");
                    HashMap map2 = new HashMap();
                    map2.put("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/38.0.2125.122 Safari/537.36 SE 2.X MetaSr 1.0");
                    map2.put("Accept", "application/json, text/plain, */*");
                    map2.put("Referer", "https://pan.quark.cn/");
                    string2 = "";
                    for (String str3 : com.github.catvod.spider.merge.AB.m.c.e("https://pan.quark.cn/account/info?st=" + strOptString + "&lw=scan", map2).headers("set-cookie")) {
                        if (str3.contains("__pus=")) {
                            string2 = string2 + str3.split(";")[0] + ";";
                        }
                    }
                    str2 = map.get("site");
                } else {
                    String str4 = ";";
                    if ("uc".equals(map.get("site"))) {
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
                        JSONObject jSONObject2 = new JSONObject(com.github.catvod.spider.merge.AB.m.c.h("https://api.open.uc.cn/cas/ajax/getServiceTicketByQrcodeToken?__dt=18884&__t=" + str5, map4, map3).a());
                        if (!"ok".equals(jSONObject2.optString("message"))) {
                            return;
                        }
                        string2 = "";
                        for (String str6 : com.github.catvod.spider.merge.AB.m.c.e("https://drive.uc.cn/account/info?st=" + jSONObject2.optJSONObject("data").optJSONObject("members").optString("service_ticket"), map3).headers("set-cookie")) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(string2);
                            String str7 = str4;
                            sb.append(str6.split(str7)[0]);
                            sb.append(str7);
                            string2 = sb.toString();
                            str4 = str7;
                        }
                        str2 = map.get("site");
                    } else {
                        z = this;
                        if (!"bili".equals(map.get("site"))) {
                            if (!"uc_tv".equals(map.get("site")) && !"cloud".equals(map.get("site")) && "baidu".equals(map.get("site")) && com.github.catvod.spider.merge.AB.b.z.s()) {
                                z();
                                return;
                            }
                            return;
                        }
                        HashMap map5 = new HashMap();
                        map5.put("Accept", "application/json, text/plain, */*");
                        map5.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36 Edg/126.0.0.0");
                        String strO = com.github.catvod.spider.merge.AB.g.h.b(com.github.catvod.spider.merge.AB.m.c.l("https://passport.bilibili.com/x/passport-login/web/qrcode/poll?qrcode_key=" + new JSONObject(map.get("url")).optString("token") + "&source=main_mini", map5)).a().o();
                        if (TextUtils.isEmpty(strO)) {
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        for (String str8 : Uri.parse(strO).getQuery().split("&")) {
                            sb2.append(str8);
                            sb2.append(str4);
                        }
                        str = map.get("site");
                        string = sb2.toString();
                    }
                }
                s(str2, string2);
                return;
            }
            com.github.catvod.spider.merge.AB.d.d dVarC = com.github.catvod.spider.merge.AB.d.d.g(com.github.catvod.spider.merge.AB.m.c.i("https://passport.aliyundrive.com/newlogin/qrcode/query.do?appName=aliyun_drive&fromSite=52&_bx-v=2.2.3", r(new JSONObject(map.get("url")).optJSONObject("token")))).b().c();
            if (!dVarC.f()) {
                return;
            }
            str = map.get("site");
            string = dVarC.e();
            z = this;
            z.s(str, string);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Z o() {
        return I.a;
    }

    private String p(String str) {
        return "ali".equals(str) ? "请使用阿里网盘APP扫码" : "quark".equals(str) ? "请使用夸克浏览器扫码" : "uc".equals(str) ? "请使用UC浏览器扫码" : "bili".equals(str) ? "请使用哔哩哔哩APP扫码" : "cloud".equals(str) ? "请使用天翼云盘APP扫码" : "请使用浏览器或者微信扫描二维码\n(扫码设备和当前设备要在同一局域网内)";
    }

    private JSONObject q(String str) {
        String strK;
        try {
            JSONObject jSONObject = new JSONObject();
            String str2 = "token";
            if ("ali".equals(str)) {
                strK = com.github.catvod.spider.merge.AB.m.c.k("https://passport.aliyundrive.com/newlogin/qrcode/generate.do?appName=aliyun_drive&fromSite=52&appName=aliyun_drive&appEntrance=web&isMobile=false&lang=zh_CN&returnUrl=&bizParams=&_bx-v=2.2.3");
                com.github.catvod.spider.merge.AB.d.d dVarC = com.github.catvod.spider.merge.AB.d.d.g(strK).b().c();
                SpiderDebug.log(dVarC.toString());
                jSONObject.put("url", dVarC.a());
                jSONObject.put("token", new JSONObject(dVarC.d()));
                str2 = "json";
            } else if ("quark".equals(str)) {
                HashMap map = new HashMap();
                map.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) quark-cloud-drive/3.0.1 Chrome/100.0.4896.160 Electron/18.3.5.12-a038f7b798 Safari/537.36 Channel/pckk_other_ch");
                strK = new JSONObject(com.github.catvod.spider.merge.AB.m.c.l("https://uop.quark.cn/cas/ajax/getTokenForQrcodeLogin?client_id=532&v=1.2", map)).optJSONObject("data").optJSONObject("members").optString("token");
                jSONObject.put("url", "https://su.quark.cn/4_eMHBJ?token=" + strK + "&client_id=532&ssb=weblogin&uc_param_str=&uc_biz_str=S%3Acustom%7COPT%3ASAREA%400%7COPT%3AIMMERSIVE%401%7COPT%3ABACK_BTN_STYLE%400");
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
                String strOptString = new JSONObject(com.github.catvod.spider.merge.AB.m.c.h("https://api.open.uc.cn/cas/ajax/getTokenForQrcodeLogin?__dt=641254&__t=" + str3, map3, map2).a()).optJSONObject("data").optJSONObject("members").optString("token");
                jSONObject.put("url", "https://su.uc.cn/1_n0ZCv?uc_param_str=dsdnfrpfbivesscpgimibtbmnijblauputogpintnwktprchmt&token=" + strOptString + "&client_id=381&uc_biz_str=S%3Acustom%7CC%3Atitlebar_fix");
                strK = strOptString;
            } else {
                if (!"bili".equals(str)) {
                    if (!"uc_tv".equals(str) && !"cloud".equals(str) && "baidu".equals(str)) {
                        com.github.catvod.spider.merge.AB.b.z.k();
                    }
                    return jSONObject;
                }
                HashMap map4 = new HashMap();
                map4.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36 Edg/126.0.0.0");
                com.github.catvod.spider.merge.AB.g.b bVarA = com.github.catvod.spider.merge.AB.g.h.b(com.github.catvod.spider.merge.AB.m.c.l("https://passport.bilibili.com/x/passport-login/web/qrcode/generate?source=main-mini", map4)).a();
                jSONObject.put("url", bVarA.o());
                strK = bVarA.k();
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
                                str3.substring(3);
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
        layoutParams.topMargin = com.github.catvod.spider.merge.AB.J.a.a(20);
        layoutParams.gravity = 1;
        TextView textView = new TextView(Init.context());
        textView.setText(map.get("flag"));
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        linearLayout.addView(textView, layoutParams);
        int iA = com.github.catvod.spider.merge.AB.J.a.a(200);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iA, iA);
        layoutParams2.gravity = 17;
        ImageView imageView = new ImageView(Init.context());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageBitmap(com.github.catvod.spider.merge.AB.b.z.e().j());
        layoutParams2.setMargins(com.github.catvod.spider.merge.AB.J.a.a(16), com.github.catvod.spider.merge.AB.J.a.a(16), com.github.catvod.spider.merge.AB.J.a.a(16), com.github.catvod.spider.merge.AB.J.a.a(16));
        linearLayout.addView(imageView, layoutParams2);
        Init.execute(new Y(this, map, 0));
        this.a = new AlertDialog.Builder(Init.getActivity()).setView(linearLayout).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(final Map<String, String> map) {
        final EditText editText;
        DialogInterface.OnClickListener dialogInterfaceOnClickListenerC0093n;
        String str;
        try {
            final String str2 = map.get("site");
            if ("cloud123".equals(str2)) {
                v(map);
                return;
            }
            if ("cloud189".equals(str2)) {
                w(map);
                return;
            }
            if ("baidu".equals(str2)) {
                t(map);
                return;
            }
            String str3 = map.get("flag");
            boolean z = !"0".equals(map.get("button"));
            boolean z2 = !TextUtils.isEmpty(map.get("input"));
            boolean z3 = !TextUtils.isEmpty(map.get("push"));
            TextUtils.isEmpty(map.get("cloud123"));
            String strOptString = z3 ? "" : new JSONObject(map.get("url")).optString("url");
            LinearLayout linearLayout = new LinearLayout(Init.context());
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            int i = 0;
            if (z) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.topMargin = com.github.catvod.spider.merge.AB.J.a.a(20);
                layoutParams.gravity = 1;
                TextView textView = new TextView(Init.context());
                textView.setText(str3);
                textView.setGravity(17);
                textView.setTextColor(-16777216);
                linearLayout.addView(textView, layoutParams);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 17;
                ImageView imageView = new ImageView(Init.context());
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setImageBitmap(I.b(strOptString, 240));
                linearLayout.addView(imageView, layoutParams2);
                Init.execute(new W(this, map, i));
            }
            final EditText editText2 = null;
            if (z2) {
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams3.setMargins(com.github.catvod.spider.merge.AB.J.a.a(16), com.github.catvod.spider.merge.AB.J.a.a(16), com.github.catvod.spider.merge.AB.J.a.a(16), com.github.catvod.spider.merge.AB.J.a.a(16));
                editText = new EditText(Init.context());
                editText.setHint("请将已有" + ("ali".equals(str2) ? "阿里网盘32位Token" : "quark".equals(str2) ? "夸克网盘Cookie" : "uc".equals(str2) ? "UC网盘Cookie" : "哔哩哔哩Cookie") + "粘贴到此处...");
                linearLayout.addView(editText, layoutParams3);
                if ("uc".equals(str2)) {
                    editText2 = new EditText(Init.context());
                    editText2.setHint("请将已有UC网盘机器码粘贴到此处...");
                    linearLayout.addView(editText2, layoutParams3);
                }
            } else {
                editText = null;
            }
            AlertDialog.Builder view = new AlertDialog.Builder(Init.getActivity()).setView(linearLayout);
            if ("uc_tv".equals(str2) || "cloud".equals(str2)) {
                this.a = view.show();
                return;
            }
            if (z) {
                if (z3) {
                    dialogInterfaceOnClickListenerC0093n = new DialogInterface.OnClickListener(this, map, str2) { // from class: com.github.catvod.spider.merge.AB.o.V
                        public final Z a;
                        public final Map b;
                        public final String c;

                        {
                            this.a = this;
                            this.b = map;
                            this.c = str2;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            Z.m(this.a, this.b, this.c);
                        }
                    };
                    str = "扫码授权";
                } else {
                    dialogInterfaceOnClickListenerC0093n = new DialogInterfaceOnClickListenerC0093n(this, map, 1);
                    str = "远程输入";
                }
                view = view.setPositiveButton(str, dialogInterfaceOnClickListenerC0093n).setNegativeButton("手动输入", new P(this, map, i));
            }
            if (z2) {
                view = view.setNeutralButton("扫码授权", new M(this, map, str2, i)).setNegativeButton("确定", new DialogInterface.OnClickListener(this, editText, str2, editText2) { // from class: com.github.catvod.spider.merge.AB.o.S
                    public final Z a;
                    public final EditText b;
                    public final String c;
                    public final EditText d;

                    {
                        this.a = this;
                        this.b = editText;
                        this.c = str2;
                        this.d = editText2;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        Z z4 = this.a;
                        EditText editText3 = this.b;
                        String str4 = this.c;
                        EditText editText4 = this.d;
                        z4.getClass();
                        if (!TextUtils.isEmpty(editText3.getText().toString())) {
                            Init.execute(new RunnableC0108l(z4, str4, editText3, 1));
                        }
                        if (TextUtils.isEmpty(editText4.getText().toString())) {
                            return;
                        }
                        Init.execute(new RunnableC0087h(z4, editText4, 5));
                    }
                });
            }
            this.a = view.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void v(final Map<String, String> map) {
        EditText editText = new EditText(Init.context());
        EditText editText2 = new EditText(Init.context());
        String str = map.get("model");
        LinearLayout linearLayout = new LinearLayout(Init.context());
        int i = 1;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = com.github.catvod.spider.merge.AB.J.a.a(20);
        layoutParams.gravity = 1;
        TextView textView = new TextView(Init.context());
        textView.setText(map.get("flag"));
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        linearLayout.addView(textView, layoutParams);
        if (TextUtils.isEmpty(str)) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.setMargins(com.github.catvod.spider.merge.AB.J.a.a(16), com.github.catvod.spider.merge.AB.J.a.a(16), com.github.catvod.spider.merge.AB.J.a.a(16), com.github.catvod.spider.merge.AB.J.a.a(16));
            editText.setHint("请输入123云盘账号");
            linearLayout.addView(editText, layoutParams2);
            editText2.setHint("请输入123云盘密码");
            linearLayout.addView(editText2, layoutParams2);
        } else {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 17;
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(I.b("", 240));
            linearLayout.addView(imageView, layoutParams3);
        }
        AlertDialog.Builder view = new AlertDialog.Builder(Init.getActivity()).setView(linearLayout);
        this.a = (TextUtils.isEmpty(str) ? view.setNeutralButton("远程输入", new P(this, map, i)).setNegativeButton("登录", new M(this, editText, editText2, i)) : view.setNeutralButton("手动输入", new DialogInterface.OnClickListener(this, map) { // from class: com.github.catvod.spider.merge.AB.o.T
            public final Z a;
            public final Map b;

            {
                this.a = this;
                this.b = map;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                Z z = this.a;
                Map map2 = this.b;
                z.getClass();
                map2.put("model", "");
                map2.put("flag", "请输入123云盘账号密码");
                Init.execute(new Y(z, map2, 1));
            }
        })).show();
    }

    private void w(final Map<String, String> map) {
        final EditText editText = new EditText(Init.context());
        final EditText editText2 = new EditText(Init.context());
        String str = map.get("model");
        LinearLayout linearLayout = new LinearLayout(Init.context());
        int i = 1;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = com.github.catvod.spider.merge.AB.J.a.a(20);
        layoutParams.gravity = 1;
        TextView textView = new TextView(Init.context());
        textView.setText(map.get("flag"));
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        linearLayout.addView(textView, layoutParams);
        if (TextUtils.isEmpty(str)) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.setMargins(com.github.catvod.spider.merge.AB.J.a.a(16), com.github.catvod.spider.merge.AB.J.a.a(16), com.github.catvod.spider.merge.AB.J.a.a(16), com.github.catvod.spider.merge.AB.J.a.a(16));
            editText.setHint("请输入天翼云盘账号");
            linearLayout.addView(editText, layoutParams2);
            editText2.setHint("请输入天翼云盘密码");
            linearLayout.addView(editText2, layoutParams2);
        } else {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 17;
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(I.b("", 240));
            linearLayout.addView(imageView, layoutParams3);
        }
        AlertDialog.Builder view = new AlertDialog.Builder(Init.getActivity()).setView(linearLayout);
        this.a = (TextUtils.isEmpty(str) ? view.setNeutralButton("远程输入", new DialogInterface.OnClickListener(this, map) { // from class: com.github.catvod.spider.merge.AB.o.U
            public final Z a;
            public final Map b;

            {
                this.a = this;
                this.b = map;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                Z z = this.a;
                Map map2 = this.b;
                z.getClass();
                map2.put("model", "1");
                map2.put("flag", "请使用微信或者浏览器扫码下方二维码远程输入");
                Init.execute(new RunnableC0090k(z, map2, 3));
            }
        }).setNegativeButton("登录", new DialogInterface.OnClickListener(this, editText, editText2) { // from class: com.github.catvod.spider.merge.AB.o.Q
            public final Z a;
            public final EditText b;
            public final EditText c;

            {
                this.a = this;
                this.b = editText;
                this.c = editText2;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                Z z = this.a;
                EditText editText3 = this.b;
                EditText editText4 = this.c;
                z.getClass();
                Init.execute(new Runnable(z, editText3, editText4) { // from class: com.github.catvod.spider.merge.AB.o.N
                    public final Z a;
                    public final EditText b;
                    public final EditText c;

                    {
                        this.a = z;
                        this.b = editText3;
                        this.c = editText4;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Z.c(this.a, this.b, this.c);
                    }
                });
            }
        }) : view.setNeutralButton("手动输入", new com.github.catvod.spider.merge.AB.b.C(this, map, i))).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(Map<String, String> map) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.b = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(new X(this, map, 0), 1L, 1L, TimeUnit.SECONDS);
    }

    private void z() {
        A();
        Init.run(new RunnableC0081b(this, 6));
    }

    public final void x(Map<String, String> map) {
        try {
            map.put("url", q(map.get("site")).toString());
            Init.run(new RunnableC0087h(this, map, 4));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
