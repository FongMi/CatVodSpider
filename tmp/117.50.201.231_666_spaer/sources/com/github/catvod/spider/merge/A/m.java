package com.github.catvod.spider.merge.A;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.FM.o.z;
import com.github.catvod.spider.merge.k.C0575b;
import com.github.catvod.spider.merge.m.C0590I;
import com.github.catvod.spider.merge.m.C0604m;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class m {
    private JSONObject b;
    private ScheduledExecutorService c;
    private AlertDialog f;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.A.m$1, reason: invalid class name */
    final class AnonymousClass1 {
        static volatile m a = new m();
    }

    m() {
    }

    private void G(String str, String str2, String str3) {
        String str4;
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
                str4 = "refresh_token";
                try {
                    str3 = this.b.optString("refresh_token");
                } catch (Exception e) {
                    e = e;
                    SpiderDebug.log("getRefreshTokenByTV e:" + e);
                    return;
                }
            } else {
                str4 = "code";
            }
            jSONObject.put(str4, str3);
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Linux; U; Android 12; zh-cn; V2238A Build/V417IR) AppleWebKit/533.1 (KHTML, like Gecko) Mobile Safari/533.1");
            map.put("Content-Type", "application/json; charset=utf-8");
            JSONObject jSONObject2 = new JSONObject(C0575b.f("http://api.extscreen.com/ucdrive/token", jSONObject.toString(), map).a());
            if (jSONObject2.optInt("code") == 200) {
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("data");
                jSONObjectOptJSONObject.put("start_time", System.currentTimeMillis() / 1000);
                jSONObjectOptJSONObject.put("device_id", str2);
                n.u("uc_token.txt", jSONObjectOptJSONObject.toString());
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    private void S() {
        ScheduledExecutorService scheduledExecutorService = this.c;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        Init.run(new Runnable(this) { // from class: com.github.catvod.spider.merge.A.s
            public final Object b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ((m) this.b).s();
            }
        });
    }

    public static /* synthetic */ void b(m mVar, JSONObject jSONObject) {
        mVar.getClass();
        String str = System.currentTimeMillis() + "";
        String strOptString = jSONObject.optString("client_id");
        String strOptString2 = jSONObject.optString("token");
        String strOptString3 = jSONObject.optString("device_id");
        String strA = C0590I.a(strOptString3 + str);
        String str2 = "https://open-api-drive.uc.cn/oauth/code?req_id=" + strA + "&access_token=&app_ver=1.6.8&device_id=" + strOptString3 + "&device_brand=vivo&platform=tv&device_name=V2238A&device_model=V2238A&build_device=V2238A&build_product=V2238A&device_gpu=Adreno%20(TM)%20640&activity_rect=%7B%7D&channel=UCTVOFFICIALWEB&client_id=" + strOptString + "&scope=netdisk&query_token=" + strOptString2;
        String strM5b = a.m5b(String.format("GET&/oauth/code&%s&l3srvtd7p42l0d0x1u8d7yc8ye9kki4d", str));
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Linux; U; Android 12; zh-cn; V2238A Build/V417IR) AppleWebKit/533.1 (KHTML, like Gecko) Mobile Safari/533.1");
        map.put("x-pan-tm", str);
        map.put("host", "open-api-drive.uc.cn");
        map.put("x-pan-token", strM5b);
        map.put("x-pan-client-id", strOptString);
        try {
            JSONObject jSONObject2 = new JSONObject(C0575b.l(str2, map));
            if (jSONObject2.optInt("status") == 0) {
                C0590I.i("UC TV授权成功");
                mVar.G(strA, strOptString3, jSONObject2.optString("code"));
                mVar.S();
            }
        } catch (Exception e) {
            SpiderDebug.log("e1: " + e);
        }
    }

    public static void g(m mVar) {
        mVar.s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v20, types: [android.view.View$OnClickListener, com.github.catvod.spider.merge.A.m$2] */
    public static void j(final m mVar, final JSONObject jSONObject) {
        try {
            LinearLayout linearLayout = new LinearLayout(Init.context());
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            linearLayout.setBackgroundColor(-1);
            int iC = C0590I.c(20);
            linearLayout.setPadding(iC, 0, iC, 0);
            TextView textView = new TextView(Init.context());
            textView.setText("请使用UC浏览器APP扫码");
            textView.setGravity(17);
            textView.setTextColor(-16777216);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = C0590I.c(20);
            layoutParams.bottomMargin = C0590I.c(0);
            linearLayout.addView(textView, layoutParams);
            int iC2 = C0590I.c(200);
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            if (!TextUtils.isEmpty(jSONObject.optString("url"))) {
                imageView.setImageBitmap(C0604m.a(jSONObject.optString("url")));
            }
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iC2, iC2);
            layoutParams2.gravity = 17;
            int iC3 = C0590I.c(0);
            layoutParams2.topMargin = iC3;
            layoutParams2.bottomMargin = iC3;
            linearLayout.addView(imageView, layoutParams2);
            AlertDialog.Builder cancelable = new AlertDialog.Builder(Init.getActivity()).setView(linearLayout).setOnCancelListener(new DialogInterface.OnCancelListener(mVar) { // from class: com.github.catvod.spider.merge.A.o
                public final m a;

                {
                    this.a = mVar;
                }

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    m.g(this.a);
                }
            }).setCancelable(true);
            if (Init.context().getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                mVar.f = cancelable.show();
            } else {
                cancelable.setNeutralButton("APP授权", (DialogInterface.OnClickListener) null);
                mVar.f = cancelable.show();
                Button button = mVar.f.getButton(-3);
                if (button != 0) {
                    ?? r1 = new View.OnClickListener(mVar, jSONObject) { // from class: com.github.catvod.spider.merge.A.m.2
                        private Dialog dialog;
                        final m this$0;
                        final JSONObject val$jsonObject;

                        {
                            this.this$0 = mVar;
                            this.val$jsonObject = jSONObject;
                        }

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            Dialog dialog = this.dialog;
                            if (dialog != null && dialog.isShowing()) {
                                dialog.dismiss();
                            }
                            String strOptString = this.val$jsonObject.optString("url");
                            if (TextUtils.isEmpty(strOptString)) {
                                SpiderDebug.log("URL为空");
                                return;
                            }
                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(strOptString));
                            intent.setComponent(new ComponentName("com.UCMobile", "com.UCMobile.main.UCMobile"));
                            Init.getActivity().startActivity(intent);
                        }

                        public void setDialog(Dialog dialog) {
                            this.dialog = dialog;
                        }
                    };
                    r1.setDialog(mVar.f);
                    button.setOnClickListener(r1);
                }
            }
            Init.execute(new Runnable(mVar, jSONObject) { // from class: com.github.catvod.spider.merge.A.r
                public final m a;
                public final JSONObject b;

                {
                    this.a = mVar;
                    this.b = jSONObject;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    m.m(this.a, this.b);
                }
            });
        } catch (Exception e) {
        }
    }

    public static void m(final m mVar, final JSONObject jSONObject) {
        mVar.getClass();
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        mVar.c = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(new Runnable(mVar, jSONObject) { // from class: com.github.catvod.spider.merge.A.p
            public final Object b;
            public final Object c;

            {
                this.b = mVar;
                this.c = jSONObject;
            }

            @Override // java.lang.Runnable
            public final void run() {
                m.b((m) this.b, (JSONObject) this.c);
            }
        }, 1L, 1L, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        try {
            AlertDialog alertDialog = this.f;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
            ScheduledExecutorService scheduledExecutorService = this.c;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
            }
        } catch (Exception e) {
        }
    }

    public static m t() {
        return AnonymousClass1.a;
    }

    public final void D() {
        final JSONObject jSONObject;
        try {
            Init.checkPermission();
            String str = System.currentTimeMillis() + "";
            String strA = C0590I.a(str);
            String str2 = String.format("https://open-api-drive.uc.cn/oauth/authorize?req_id=%s&access_token=&app_ver=1.6.8&device_id=%s&device_brand=vivo&platform=tv&device_name=V2238A&device_model=V2238A&build_device=V2238A&build_product=V2238A&device_gpu=Adreno(TM)640&activity_rect=7D&channel=UCTVOFFICIALWEB&auth_type=code&client_id=%s7&scope=netdisk&qrcode=1&qr_width=460&qr_height=460", C0590I.a(strA + str), strA, "5acf882d27b74502b7040b0c65519aa7");
            String strM5b = a.m5b(String.format("GET&/oauth/authorize&%s&l3srvtd7p42l0d0x1u8d7yc8ye9kki4d", str));
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Linux; U; Android 12; zh-cn; V2238A Build/V417IR) AppleWebKit/533.1 (KHTML, like Gecko) Mobile Safari/533.1");
            map.put("x-pan-tm", str);
            map.put("x-pan-token", strM5b);
            map.put("content-type", "text/plain;charset=UTF-8");
            map.put("x-pan-client-id", "5acf882d27b74502b7040b0c65519aa7");
            String string = new JSONObject(C0575b.l(str2, map)).getString("query_token");
            jSONObject = new JSONObject();
            jSONObject.put("url", "https://su.uc.cn/9_iCI3h?uc_param_str=&token=" + string + "&uc_biz_str=S%3Acustom%7CC%3Atitlebar_fix");
            jSONObject.put("token", string);
            jSONObject.put("device_id", strA);
            jSONObject.put("client_id", "5acf882d27b74502b7040b0c65519aa7");
        } catch (Exception e) {
            e = e;
        }
        try {
            Init.run(new Runnable(this, jSONObject) { // from class: com.github.catvod.spider.merge.A.q
                public final m b;
                public final JSONObject c;

                {
                    this.b = this;
                    this.c = jSONObject;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    m.j(this.b, this.c);
                }
            });
        } catch (Exception e2) {
            e = e2;
            SpiderDebug.log("getQRCode e: " + e);
        }
    }

    public final boolean Q() {
        try {
            JSONObject jSONObject = this.b;
            if (jSONObject != null && jSONObject.optInt("status") == 0) {
                return true;
            }
            String strC = z.c("uc_token.txt");
            if (TextUtils.isEmpty(strC)) {
                throw new Exception("empty tvuc");
            }
            JSONObject jSONObject2 = new JSONObject(strC);
            this.b = jSONObject2;
            if ((jSONObject2.optLong("start_time") + this.b.optLong("expires_in")) - (System.currentTimeMillis() / 1000) > 7200) {
                return true;
            }
            try {
                String str = System.currentTimeMillis() + "";
                String strOptString = this.b.optString("device_id");
                G(C0590I.a(strOptString + str), strOptString, "");
                return true;
            } catch (Exception e) {
                return true;
            }
        } catch (Exception e2) {
            SpiderDebug.log("setTvObject e:" + e2);
            return false;
        }
    }
}
