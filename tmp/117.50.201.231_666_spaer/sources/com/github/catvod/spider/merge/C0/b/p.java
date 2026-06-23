package com.github.catvod.spider.merge.C0.b;

import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.google.gson.Gson;
import com.google.net.cronet.okhttptransport.CronetInterceptor;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class p {
    public static JSONObject l;
    private final Map<String, String> a;
    private AlertDialog c;
    private String d;
    private String e;
    private String f;
    private com.github.catvod.spider.merge.C0.d.f g;
    private com.github.catvod.spider.merge.C0.d.g h;
    private String i = "2K";
    private boolean j = false;
    private String k = "";
    private final List<String> b = new ArrayList();

    p() {
        String strE;
        String strE2;
        try {
            strE = com.github.catvod.spider.merge.C0.j.l.e(new FileInputStream(s()));
        } catch (Exception e) {
            strE = "";
        }
        this.g = com.github.catvod.spider.merge.C0.d.f.d(strE);
        try {
            strE2 = com.github.catvod.spider.merge.C0.j.l.e(new FileInputStream(x()));
        } catch (Exception e2) {
            strE2 = "";
        }
        this.h = com.github.catvod.spider.merge.C0.d.g.f(strE2);
        HashMap map = new HashMap();
        this.a = map;
        map.put(">2K<", "QHD");
        map.put(">超清<", "FHD");
    }

    private void A(com.github.catvod.spider.merge.C0.d.e eVar, List<com.github.catvod.spider.merge.C0.d.e> list, List<com.github.catvod.spider.merge.C0.d.e> list2) throws JSONException {
        B(eVar, list, list2, "");
    }

    private void B(com.github.catvod.spider.merge.C0.d.e eVar, List<com.github.catvod.spider.merge.C0.d.e> list, List<com.github.catvod.spider.merge.C0.d.e> list2, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList();
        jSONObject.put("limit", 200);
        jSONObject.put("share_id", this.f);
        jSONObject.put("parent_file_id", eVar.d());
        jSONObject.put("order_by", "name");
        jSONObject.put("order_direction", "ASC");
        if (str.length() > 0) {
            jSONObject.put("marker", str);
        }
        com.github.catvod.spider.merge.C0.d.e eVar2 = (com.github.catvod.spider.merge.C0.d.e) new Gson().fromJson(l("adrive/v3/file/list", jSONObject.toString(), true), com.github.catvod.spider.merge.C0.d.e.class);
        for (com.github.catvod.spider.merge.C0.d.e eVar3 : eVar2.e()) {
            if (eVar3.h().equals("folder")) {
                arrayList.add(eVar3);
            } else if (eVar3.a().equals("video") || eVar3.a().equals("audio")) {
                eVar3.i(eVar.f());
                list.add(eVar3);
            } else if (com.github.catvod.spider.merge.C0.j.o.d(eVar3.c())) {
                list2.add(eVar3);
            }
        }
        if (eVar2.g().length() > 0) {
            B(eVar, list, list2, eVar2.g());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A((com.github.catvod.spider.merge.C0.d.e) it.next(), list, list2);
        }
    }

    private String C(String str, String str2, boolean z) {
        boolean zK;
        if (!str.startsWith("https")) {
            str = n.a("https://open.aliyundrive.com/adrive/v1.0/", str);
        }
        HashMap<String, String> mapQ = q();
        mapQ.put("authorization", this.g.b());
        com.github.catvod.spider.merge.C0.h.d dVarF = com.github.catvod.spider.merge.C0.h.b.f(str, str2, mapQ);
        SpiderDebug.log(dVarF.b() + "," + str + "," + dVarF.a());
        if (z && (dVarF.b() == 400 || dVarF.b() == 401)) {
            try {
                if (this.g.c().isEmpty()) {
                    zK = E();
                } else {
                    SpiderDebug.log("refreshOpenToken...");
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("grant_type", "refresh_token");
                    jSONObject.put("refresh_token", this.g.c());
                    zK = k("https://api-cf.nn.ci/alist/ali_open/token", jSONObject);
                }
            } catch (Exception e) {
                e.printStackTrace();
                com.github.catvod.spider.merge.C0.d.f fVar = this.g;
                fVar.a();
                fVar.e();
                zK = false;
            }
            if (zK) {
                return C(str, str2, false);
            }
        }
        return dVarF.a();
    }

    private boolean D(String str) {
        try {
            SpiderDebug.log("OAuth Redirect...");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", str);
            jSONObject.put("grant_type", "authorization_code");
            return k("https://api-cf.nn.ci/alist/ali_open/code", jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
            com.github.catvod.spider.merge.C0.d.f fVar = this.g;
            fVar.a();
            fVar.e();
            return false;
        }
    }

    private boolean E() {
        try {
            SpiderDebug.log("OAuth Request...");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("authorize", 1);
            jSONObject.put("scope", "user:base,file:all:read,file:all:write");
            return D(((com.github.catvod.spider.merge.C0.d.b) new Gson().fromJson(l("https://open.aliyundrive.com/oauth/users/authorize?client_id=76917ccccd4441c39457a04f6084fb2f&redirect_uri=https://alist.nn.ci/tool/aliyundrive/callback&scope=user:base,file:all:read,file:all:write&state=", jSONObject.toString(), true), com.github.catvod.spider.merge.C0.d.b.class)).a());
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private String G(String str, JSONObject jSONObject) {
        if (!str.startsWith("https")) {
            str = n.a("https://api.aliyundrive.com/", str);
        }
        com.github.catvod.spider.merge.C0.h.d dVarF = com.github.catvod.spider.merge.C0.h.b.f(str, jSONObject.toString(), q());
        SpiderDebug.log(dVarF.b() + "," + str + "," + dVarF.a());
        return dVarF.a();
    }

    private boolean I() {
        try {
            SpiderDebug.log("refreshAccessToken...");
            JSONObject jSONObject = new JSONObject();
            String strTrim = this.d;
            if (strTrim.isEmpty()) {
                strTrim = this.h.e();
            }
            if (strTrim.startsWith("http")) {
                strTrim = com.github.catvod.spider.merge.C0.h.b.h(strTrim, null, null).trim();
            }
            jSONObject.put("refresh_token", strTrim);
            jSONObject.put("grant_type", "refresh_token");
            String strG = G("https://auth.aliyundrive.com/v2/account/token", jSONObject);
            com.github.catvod.spider.merge.C0.d.g gVarF = com.github.catvod.spider.merge.C0.d.g.f(strG);
            gVarF.g();
            this.h = gVarF;
            if (gVarF.b().isEmpty()) {
                throw new Exception(strG);
            }
            this.d = strTrim;
            return true;
        } catch (Exception e) {
            if (this.d.length() > 0 && this.h.e().length() > 0 && !this.d.equals(this.h.e())) {
                this.d = "";
                if (I()) {
                    return true;
                }
            }
            if (this.k.length() < 1) {
                if (this.j) {
                    Init.show("配置的token无效！");
                }
                String string = Init.d.getString("ali_tk", "");
                this.d = string;
                if (string.length() > 0) {
                    this.k = "sp";
                    if (I()) {
                        if (this.j) {
                            Init.show("使用缓存token成功！");
                        }
                        return true;
                    }
                }
            }
            if ("成功".equals(this.k)) {
                Init.show("扫码的token未起作用，请重试！");
            }
            if ("".equals(this.k) || "sp".equals(this.k)) {
                if ("sp".equals(this.k)) {
                    Init.show("缓存token失效!");
                }
                if ("".equals(this.k)) {
                    this.k = "sp";
                }
                com.github.catvod.spider.merge.C0.d.g gVar = this.h;
                gVar.a();
                gVar.g();
                this.d = "";
                N();
                int i = com.github.catvod.spider.merge.C0.j.o.a;
                if (Init.context().getPackageManager().hasSystemFeature("android.hardware.camera.any") && Init.context().getPackageManager().hasSystemFeature("android.hardware.telephony") && Init.context().getPackageManager().hasSystemFeature("android.hardware.bluetooth")) {
                    Init.run(new Runnable(this) { // from class: com.github.catvod.spider.merge.C0.b.a
                        public final p c;

                        {
                            this.c = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            p.h(this.c);
                        }
                    });
                } else {
                    M();
                }
                if ("成功".equals(this.k) && I()) {
                    if (this.j) {
                        Init.show("Token有效！");
                    }
                    return true;
                }
            }
            return false;
        }
    }

    private void L(String str) {
        if (str.length() > 0) {
            SharedPreferences.Editor editorEdit = Init.d.edit();
            editorEdit.putString("ali_tk", str);
            editorEdit.apply();
            this.d = str;
            this.h.h(str);
        }
        N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        final com.github.catvod.spider.merge.C0.d.c cVarC = com.github.catvod.spider.merge.C0.d.c.g(com.github.catvod.spider.merge.C0.h.b.h("https://passport.aliyundrive.com/newlogin/qrcode/generate.do?appName=aliyun_drive&fromSite=52&appName=aliyun_drive&appEntrance=web&isMobile=false&lang=zh_CN&returnUrl=&bizParams=&_bx-v=2.2.3", null, null)).b().c();
        Init.run(new Runnable(this, cVarC) { // from class: com.github.catvod.spider.merge.C0.b.b
            public final p c;
            public final com.github.catvod.spider.merge.C0.d.c d;

            {
                this.c = this;
                this.d = cVarC;
            }

            @Override // java.lang.Runnable
            public final void run() {
                p.b(this.c, this.d);
            }
        });
        while (this.d.length() < 1 && "sp".equals(this.k)) {
            SystemClock.sleep(500L);
        }
    }

    private void N() {
        Init.run(new Runnable(this) { // from class: com.github.catvod.spider.merge.C0.b.m
            public final p c;

            {
                this.c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.c.n();
            }
        });
    }

    public static void b(final p pVar, final com.github.catvod.spider.merge.C0.d.c cVar) {
        pVar.getClass();
        try {
            LinearLayout linearLayout = new LinearLayout(Init.context());
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            linearLayout.setGravity(17);
            TextView textView = new TextView(Init.context());
            textView.setText("阿里云盘APP扫码登录");
            textView.setLayoutParams(new LinearLayout.LayoutParams(com.github.catvod.spider.merge.C0.j.o.a(240), com.github.catvod.spider.merge.C0.j.o.a(25)));
            textView.setBackgroundColor(-1);
            textView.setGravity(17);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(com.github.catvod.spider.merge.C0.j.o.a(240), com.github.catvod.spider.merge.C0.j.o.a(240));
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(com.github.catvod.spider.merge.C0.N.a.c(cVar.a()));
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.gravity = 17;
            frameLayout.addView(imageView, layoutParams);
            linearLayout.addView(frameLayout);
            linearLayout.addView(textView);
            AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getActivity()).setView(linearLayout).setOnCancelListener(new DialogInterface.OnCancelListener(pVar, cVar) { // from class: com.github.catvod.spider.merge.C0.b.e
                public final p a;
                public final com.github.catvod.spider.merge.C0.d.c b;

                {
                    this.a = pVar;
                    this.b = cVar;
                }

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    p pVar2 = this.a;
                    com.github.catvod.spider.merge.C0.d.c cVar2 = this.b;
                    pVar2.getClass();
                    Init.execute(new Runnable(pVar2, cVar2) { // from class: com.github.catvod.spider.merge.C0.b.c
                        public final p c;
                        public final com.github.catvod.spider.merge.C0.d.c d;

                        {
                            this.c = pVar2;
                            this.d = cVar2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            p.g(this.c, this.d);
                        }
                    });
                }
            }).setOnDismissListener(new DialogInterface.OnDismissListener(pVar) { // from class: com.github.catvod.spider.merge.C0.b.h
                public final p a;

                {
                    this.a = pVar;
                }

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    p.i(this.a);
                }
            }).show();
            pVar.c = alertDialogShow;
            alertDialogShow.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        } catch (Exception e) {
        }
    }

    public static void c(final p pVar, EditText editText) {
        pVar.getClass();
        final String string = editText.getText().toString();
        pVar.n();
        Init.execute(new Runnable(pVar, string) { // from class: com.github.catvod.spider.merge.C0.b.d
            public final p c;
            public final String d;

            {
                this.c = pVar;
                this.d = string;
            }

            @Override // java.lang.Runnable
            public final void run() {
                p.e(this.c, this.d);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public static void d(p pVar) {
        boolean z;
        pVar.getClass();
        for (String str : new ArrayList(pVar.b)) {
            try {
                SpiderDebug.log("Delete..." + str);
                z = pVar.l("adrive/v2/batch", String.format("{\"requests\":[{\"body\":{\"drive_id\":\"%s\",\"file_id\":\"%s\"},\"headers\":{\"Content-Type\":\"application/json\"},\"id\":\"%s\",\"method\":\"POST\",\"url\":\"/file/delete\"}],\"resource\":\"file\"}", pVar.h.d(), str, str), true).length() == 211;
            } catch (Exception e) {
                z = false;
            }
            if (z) {
                pVar.b.remove(str);
            }
        }
    }

    public static void e(p pVar, String str) {
        pVar.getClass();
        if (str.startsWith("http")) {
            str = com.github.catvod.spider.merge.C0.h.b.h(str, null, null);
        } else if (str.length() != 32) {
            if (!str.contains(":")) {
                return;
            }
            str = "http://" + str + "/proxy?do=ali&type=token";
            str = com.github.catvod.spider.merge.C0.h.b.h(str, null, null);
        }
        pVar.L(str);
    }

    public static void g(p pVar, com.github.catvod.spider.merge.C0.d.c cVar) {
        String str;
        pVar.getClass();
        com.github.catvod.spider.merge.C0.d.c cVarC = com.github.catvod.spider.merge.C0.d.c.g(com.github.catvod.spider.merge.C0.h.b.e(cVar.d())).b().c();
        if (cVarC == null || !cVarC.f()) {
            pVar.L("");
            str = "失败";
        } else {
            String strE = cVarC.e();
            pVar.L(strE);
            Init.show(Init.d.getString("ali_tk", "").equals(strE) ? "token缓存成功！" : "token缓存失败！");
            str = "成功";
        }
        pVar.k = str;
    }

    public static void h(final p pVar) {
        pVar.getClass();
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(com.github.catvod.spider.merge.C0.j.o.a(16), com.github.catvod.spider.merge.C0.j.o.a(16), com.github.catvod.spider.merge.C0.j.o.a(16), com.github.catvod.spider.merge.C0.j.o.a(16));
            FrameLayout frameLayout = new FrameLayout(Init.context());
            final EditText editText = new EditText(Init.context());
            frameLayout.addView(editText, layoutParams);
            pVar.c = new AlertDialog.Builder(Init.getActivity()).setTitle("请输入Token").setView(frameLayout).setNeutralButton("扫码", new DialogInterface.OnClickListener(pVar) { // from class: com.github.catvod.spider.merge.C0.b.f
                public final p a;

                {
                    this.a = pVar;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    p.j(this.a);
                }
            }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener(pVar, editText) { // from class: com.github.catvod.spider.merge.C0.b.g
                public final p a;
                public final EditText b;

                {
                    this.a = pVar;
                    this.b = editText;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    p.c(this.a, this.b);
                }
            }).show();
        } catch (Exception e) {
        }
    }

    public static void i(p pVar) {
        pVar.N();
    }

    public static void j(p pVar) {
        pVar.n();
        Init.execute(new i(pVar, 1));
    }

    private boolean k(String str, JSONObject jSONObject) {
        boolean z;
        com.github.catvod.spider.merge.C0.h.d dVarF = com.github.catvod.spider.merge.C0.h.b.f(str, jSONObject.toString(), q());
        SpiderDebug.log(dVarF.b() + "," + str + "," + dVarF.a());
        if (dVarF.a().contains("Too Many Requests")) {
            Init.show("洗洗睡吧，Too Many Requests。");
            com.github.catvod.spider.merge.C0.d.f fVar = this.g;
            fVar.a();
            fVar.e();
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        com.github.catvod.spider.merge.C0.d.f fVarD = com.github.catvod.spider.merge.C0.d.f.d(dVarF.a());
        fVarD.e();
        this.g = fVarD;
        return true;
    }

    private String l(String str, String str2, boolean z) {
        if (!str.startsWith("https")) {
            str = n.a("https://api.aliyundrive.com/", str);
        }
        com.github.catvod.spider.merge.C0.h.d dVarF = com.github.catvod.spider.merge.C0.h.b.f(str, str2, r());
        SpiderDebug.log(dVarF.b() + "," + str + "," + dVarF.a());
        return (z && (dVarF.b() == 400 || dVarF.b() == 401) && I()) ? l(str, str2, false) : (z && dVarF.b() == 429) ? l(str, str2, false) : dVarF.a();
    }

    private String m(String str) {
        SpiderDebug.log("Copy..." + str);
        String strL = l("adrive/v2/batch", String.format("{\"requests\":[{\"body\":{\"file_id\":\"%s\",\"share_id\":\"%s\",\"auto_rename\":true,\"to_parent_file_id\":\"root\",\"to_drive_id\":\"%s\"},\"headers\":{\"Content-Type\":\"application/json\"},\"id\":\"0\",\"method\":\"POST\",\"url\":\"/file/copy\"}],\"resource\":\"file\"}", str, this.f, this.h.d()), true);
        return strL.contains("ForbiddenNoPermission.File") ? m(str) : new JSONObject(strL).getJSONArray("responses").getJSONObject(0).getJSONObject("body").getString("file_id");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        try {
            AlertDialog alertDialog = this.c;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception e) {
        }
    }

    public static p o() {
        return o.a;
    }

    private HashMap<String, String> r() {
        HashMap<String, String> mapQ = q();
        mapQ.put("authorization", this.h.c());
        mapQ.put("x-share-token", this.e);
        mapQ.put("X-Canary", "client=Android,app=adrive,version=v4.3.1");
        return mapQ;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    private String t(JSONObject jSONObject, String str) throws JSONException {
        if (!jSONObject.has("live_transcoding_task_list")) {
            return "";
        }
        JSONArray jSONArray = jSONObject.getJSONArray("live_transcoding_task_list");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (jSONObject2.getString("template_id").equals(this.a.get(str))) {
                return jSONObject2.getString("url");
            }
        }
        return str.equals(">2K<") ? t(jSONObject, ">超清<") : jSONArray.getJSONObject(0).getString("url");
    }

    private List<com.github.catvod.spider.merge.C0.c.e> u(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has("live_transcoding_subtitle_task_list")) {
            return Collections.emptyList();
        }
        JSONArray jSONArray = jSONObject.getJSONArray("live_transcoding_subtitle_task_list");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString("language");
            String string2 = jSONObject2.getString("url");
            com.github.catvod.spider.merge.C0.c.e eVar = new com.github.catvod.spider.merge.C0.c.e();
            eVar.d(string2);
            eVar.c(string);
            eVar.b(string);
            arrayList.add(eVar.a("vtt"));
        }
        return arrayList;
    }

    public final String F(String[] strArr, String str) {
        try {
            JSONObject jSONObjectY = y(strArr[0]);
            String strT = t(jSONObjectY, str);
            List<com.github.catvod.spider.merge.C0.c.e> listV = v(strArr);
            ((ArrayList) listV).addAll(u(jSONObjectY));
            com.github.catvod.spider.merge.C0.c.d dVar = new com.github.catvod.spider.merge.C0.c.d();
            dVar.i(strT);
            dVar.h(listV);
            dVar.a(q());
            return dVar.toString();
        } catch (Exception e) {
            e.printStackTrace();
            com.github.catvod.spider.merge.C0.c.d dVar2 = new com.github.catvod.spider.merge.C0.c.d();
            dVar2.i("");
            return dVar2.toString();
        }
    }

    public final Object[] H(Map<String, String> map) throws UnsupportedEncodingException {
        byte[] bArrBytes = com.github.catvod.spider.merge.C0.h.b.b(p(map.get("file_id")), r()).body().bytes();
        int i = com.github.catvod.spider.merge.C0.j.o.a;
        Charset charsetForName = Charset.forName("GBK");
        if (Arrays.equals(bArrBytes, new String(bArrBytes, charsetForName).getBytes(charsetForName))) {
            bArrBytes = new String(bArrBytes, Charset.forName("GBK")).getBytes("UTF-8");
        }
        return new Object[]{200, "application/octet-stream", new ByteArrayInputStream(bArrBytes)};
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(java.lang.String r6) {
        /*
            r5 = this;
            r4 = 0
            boolean r0 = r6.isEmpty()
            java.lang.String r1 = ""
            if (r0 == 0) goto L1d
            java.lang.String r0 = "https://cat.colamint.club/ali-tokent"
        Lb:
            java.lang.String r0 = com.github.catvod.spider.merge.C0.h.b.h(r0, r4, r4)
            java.lang.String r2 = "[^A-Za-z0-9]"
            java.lang.String r3 = ""
            java.lang.String r0 = r0.replaceAll(r2, r3)
        L17:
            if (r0 != 0) goto L1a
            r0 = r1
        L1a:
            r5.d = r0
            return
        L1d:
            java.lang.String r0 = "原画"
            boolean r0 = r6.contains(r0)
            if (r0 != 0) goto L2d
            java.lang.String r0 = ">原画<"
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L75
        L2d:
            java.lang.String r0 = "原画"
            r5.i = r0
        L31:
            java.lang.String r0 = "调试模式"
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L3c
            r0 = 1
            r5.j = r0
        L3c:
            java.lang.String r0 = "超清"
            java.lang.String r2 = ""
            java.lang.String r0 = r6.replace(r0, r2)
            java.lang.String r2 = "原画"
            java.lang.String r3 = ""
            java.lang.String r0 = r0.replace(r2, r3)
            java.lang.String r2 = ">2K<"
            java.lang.String r3 = ""
            java.lang.String r0 = r0.replace(r2, r3)
            java.lang.String r2 = "><"
            java.lang.String r3 = ""
            java.lang.String r0 = r0.replace(r2, r3)
            java.lang.String r2 = "普画"
            java.lang.String r3 = ""
            java.lang.String r0 = r0.replace(r2, r3)
            java.lang.String r2 = "调试模式"
            java.lang.String r3 = ""
            java.lang.String r0 = r0.replace(r2, r3)
            java.lang.String r2 = "http"
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L17
            goto Lb
        L75:
            java.lang.String r0 = "超清"
            boolean r0 = r6.contains(r0)
            if (r0 != 0) goto L85
            java.lang.String r0 = ">超清<"
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L31
        L85:
            java.lang.String r0 = "超清"
            r5.i = r0
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0.b.p.J(java.lang.String):void");
    }

    public final void K(String str) {
        if (!s().exists()) {
            com.github.catvod.spider.merge.C0.d.f fVar = this.g;
            fVar.a();
            fVar.e();
        }
        if (!x().exists()) {
            com.github.catvod.spider.merge.C0.d.g gVar = this.h;
            gVar.a();
            gVar.g();
        }
        this.f = str;
        try {
            SpiderDebug.log("refreshShareToken...");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("share_id", this.f);
            jSONObject.put("share_pwd", "");
            this.e = new JSONObject(G("v2/share_link/get_share_token", jSONObject)).getString("share_token");
        } catch (Exception e) {
            e.printStackTrace();
            Init.show("来晚啦，该分享已失效！");
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public final String p(String str) {
        String string;
        l lVar;
        final int i = 0;
        try {
            try {
                SpiderDebug.log("getDownloadUrl..." + str);
                this.b.add(0, m(str));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("file_id", this.b.get(0));
                jSONObject.put("drive_id", this.h.d());
                string = new JSONObject(C("openFile/getDownloadUrl", jSONObject.toString(), true)).getString("url");
                lVar = new l(this);
            } catch (Exception e) {
                e.printStackTrace();
                string = "";
                lVar = new l(this);
            }
            Init.execute(lVar);
            return string;
        } catch (Throwable th) {
            Init.execute(new Runnable(this, i) { // from class: com.github.catvod.spider.merge.C0.b.j
                public final int c;
                public final Object d;

                {
                    this.c = i;
                    this.d = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.c) {
                        case 0:
                            p.d((p) this.d);
                            break;
                        default:
                            CronetInterceptor.a((CronetInterceptor) this.d);
                            break;
                    }
                }
            });
            throw th;
        }
    }

    public final HashMap<String, String> q() {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
        map.put("Referer", "https://www.aliyundrive.com/");
        return map;
    }

    public final File s() {
        return new File(Init.context().getCacheDir(), "aliyundrive_oauth");
    }

    public final List<com.github.catvod.spider.merge.C0.c.e> v(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str.contains("@@@")) {
                String[] strArrSplit = str.split("@@@");
                String str2 = strArrSplit[0];
                String str3 = strArrSplit[1];
                String str4 = Proxy.getUrl() + "?do=ali&type=sub&file_id=" + strArrSplit[2];
                com.github.catvod.spider.merge.C0.c.e eVar = new com.github.catvod.spider.merge.C0.c.e();
                eVar.c(str2);
                com.github.catvod.spider.merge.C0.c.e eVarA = eVar.a(str3);
                eVarA.d(str4);
                arrayList.add(eVarA);
            }
        }
        return arrayList;
    }

    public final Object[] w() {
        return new Object[]{200, "text/plain", new ByteArrayInputStream(this.h.e().getBytes())};
    }

    public final File x() {
        return new File(Init.context().getCacheDir(), "aliyundrive_user");
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public final JSONObject y(String str) {
        JSONObject jSONObject;
        final int i = 0;
        try {
            try {
                SpiderDebug.log("getVideoPreviewPlayInfo..." + str);
                this.b.add(0, m(str));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("file_id", this.b.get(0));
                jSONObject2.put("drive_id", this.h.d());
                jSONObject2.put("category", "live_transcoding");
                jSONObject2.put("url_expire_sec", "14400");
                jSONObject = new JSONObject(C("openFile/getVideoPreviewPlayInfo", jSONObject2.toString(), true)).getJSONObject("video_preview_play_info");
                Init.execute(new l(this));
            } catch (Exception e) {
                e.printStackTrace();
                jSONObject = new JSONObject();
                Init.execute(new Runnable(this, i) { // from class: com.github.catvod.spider.merge.C0.b.k
                    public final int c;
                    public final Object d;

                    {
                        this.c = i;
                        this.d = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (this.c) {
                            case 0:
                                p.d((p) this.d);
                                break;
                            default:
                                Toast.makeText(Init.context(), (String) this.d, 1).show();
                                break;
                        }
                    }
                });
            }
            return jSONObject;
        } catch (Throwable th) {
            Init.execute(new i(this, i));
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0293  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.github.catvod.spider.merge.C0.c.g z(java.lang.String r17, java.lang.String r18) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 764
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0.b.p.z(java.lang.String, java.lang.String):com.github.catvod.spider.merge.C0.c.g");
    }
}
