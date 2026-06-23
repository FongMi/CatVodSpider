package com.github.catvod.spider.merge.FM.b;

import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.FM.a.C0298a;
import com.github.catvod.spider.merge.FM.c.C0329g;
import com.github.catvod.spider.merge.FM.c.C0332j;
import com.github.catvod.spider.merge.FM.i.C0359b;
import com.github.catvod.spider.merge.FM.i.C0360c;
import com.github.catvod.spider.merge.FM.m.C0378c;
import com.github.catvod.spider.merge.FM.o.C0394j;
import com.github.catvod.spider.merge.FM.o.C0397m;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.b.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0301C {
    private static final String d = "https://login.123pan.com/api/user/sign_in";
    private static final String e = "https://www.123pan.com";
    private static final String f = "UserInfo";
    private String a;
    private AlertDialog b;
    private boolean c = false;

    C0301C() {
        Init.checkPermission();
        SpiderDebug.log("Pan123 Init");
    }

    public static void a(C0301C c0301c, String[] strArr) {
        c0301c.getClass();
        String str = strArr[0];
        String str2 = strArr[1];
        String str3 = strArr[2];
        String str4 = strArr[3];
        String str5 = strArr[5];
        try {
            int iM = c0301c.m();
            c0301c.h(iM);
            JsonArray jsonArray = new JsonArray();
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("file_id", str2);
            jsonObject.addProperty("size", str5);
            jsonObject.addProperty("etag", str4);
            jsonObject.addProperty("type", 0);
            jsonObject.addProperty("parent_file_id", Integer.valueOf(iM));
            jsonObject.addProperty("file_name", str3);
            jsonObject.addProperty("drive_id", 0);
            jsonArray.add(jsonObject);
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.add("file_list", jsonArray);
            jsonObject2.addProperty("share_key", str);
            jsonObject2.addProperty("current_level", 1);
            jsonObject2.addProperty("event", "transfer");
            jsonObject2.addProperty("fileNum", 1);
            jsonObject2.addProperty("operatePlace", 1);
            C0378c.g("https://www.123pan.com/b/api/file/copy/async", jsonObject2.toString(), c0301c.l());
        } catch (Exception e2) {
            v.c(new byte[]{-104, 13, -123, -115, 97, -37, -121, -105, -104, 66, -112, -122, 82}, new byte[]{-5, 98, -11, -12, 32, -88, -2, -7}, new StringBuilder(), e2);
        }
    }

    public static void c(C0301C c0301c, EditText editText, EditText editText2) {
        c0301c.getClass();
        String string = editText.getText().toString();
        String string2 = editText2.getText().toString();
        c0301c.i();
        Init.execute(new RunnableC0299A(c0301c, string, string2, 0));
    }

    public static /* synthetic */ void d(C0301C c0301c, String str, String str2) {
        c0301c.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("username", str);
            jSONObject.put("password", str2);
            com.github.catvod.spider.merge.FM.o.z.s(f, jSONObject.toString());
            if (c0301c.q(true)) {
                return;
            }
            c0301c.o();
        } catch (Exception e2) {
            v.c(new byte[]{-67, -7, 51, 28, -120, -100, -83, -94, -92, -14, 67, 22, -119, -121, -29, -21}, new byte[]{-46, -105, 99, 115, -5, -11, -39, -53}, new StringBuilder(), e2);
        }
    }

    public static /* synthetic */ void e(C0301C c0301c) {
        c0301c.getClass();
        while (c0301c.c) {
            try {
                String strO = com.github.catvod.spider.merge.FM.o.z.o(f);
                SpiderDebug.log("userInfo: " + strO);
                if (!TextUtils.isEmpty(strO)) {
                    C0394j.b("登录成功, 请退出重新进来");
                    c0301c.q(false);
                    c0301c.b.dismiss();
                    return;
                }
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
                SpiderDebug.log("");
                return;
            }
        }
    }

    public static long g(String str) {
        String strReplace = str.replace("+08:00", "+0800");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZZZ");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            return simpleDateFormat.parse(strReplace).getTime();
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    private void h(int i) {
        char c = 16;
        try {
            long jH = com.github.catvod.spider.merge.FM.o.z.h();
            JsonArray jsonArray = new JsonArray();
            Gson gson = new Gson();
            while (true) {
                StringBuilder sb = new StringBuilder();
                byte[] bArr = new byte[59];
                bArr[0] = 104;
                bArr[1] = 56;
                bArr[2] = -125;
                bArr[3] = -13;
                bArr[4] = -116;
                bArr[5] = -100;
                bArr[6] = -5;
                bArr[7] = 84;
                bArr[8] = 119;
                bArr[9] = 59;
                bArr[10] = -128;
                bArr[11] = -83;
                bArr[12] = -50;
                bArr[13] = -108;
                bArr[14] = -25;
                bArr[15] = 11;
                bArr[c] = 97;
                bArr[17] = 34;
                bArr[18] = -39;
                bArr[19] = -32;
                bArr[20] = -112;
                bArr[21] = -53;
                bArr[22] = -5;
                bArr[23] = 25;
                bArr[24] = 47;
                bArr[25] = 45;
                bArr[26] = -121;
                bArr[27] = -22;
                bArr[28] = -48;
                bArr[29] = -64;
                bArr[30] = -67;
                bArr[31] = 23;
                bArr[32] = 101;
                bArr[33] = 99;
                bArr[34] = -101;
                bArr[35] = -22;
                bArr[36] = -116;
                bArr[37] = -46;
                bArr[38] = -5;
                bArr[39] = 21;
                bArr[40] = 101;
                bArr[41] = 59;
                bArr[42] = -56;
                bArr[43] = -25;
                bArr[44] = -115;
                bArr[45] = -49;
                bArr[46] = -94;
                bArr[47] = 30;
                bArr[48] = 73;
                bArr[49] = 40;
                bArr[50] = -54;
                bArr[51] = -77;
                bArr[52] = -39;
                bArr[53] = -54;
                bArr[54] = -67;
                bArr[55] = 22;
                bArr[56] = 105;
                bArr[57] = 56;
                bArr[58] = -54;
                sb.append(C0298a.b(bArr, new byte[]{0, 76, -9, -125, -1, -90, -44, 123}));
                sb.append(100);
                sb.append("&next=0&orderBy=update_time&orderDirection=desc&parentFileId=");
                sb.append(i);
                sb.append("&trashed=false&SearchData=&Page=");
                sb.append(1);
                sb.append("&event=homeListFile&operateType=1&inDirectSpace=false");
                C0360c c0360cB = C0360c.b(C0378c.n(sb.toString(), l()));
                for (C0359b c0359b : c0360cB.a().a()) {
                    if (g(c0359b.b()) < jH) {
                        jsonArray.add(gson.toJsonTree(c0359b).getAsJsonObject());
                    }
                }
                if (c0360cB.a().b() < 100) {
                    break;
                } else {
                    c = 16;
                }
            }
            if (jsonArray.size() == 0) {
                return;
            }
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("driveId", 0);
            jsonObject.addProperty("operation", Boolean.TRUE);
            jsonObject.addProperty("event", "intoRecycle");
            jsonObject.addProperty("operatePlace", 1);
            jsonObject.add("fileTrashInfoList", jsonArray);
            SpiderDebug.log("deleteItems res: " + C0378c.g("https://www.123pan.com/b/api/file/trash", jsonObject.toString(), l()).toString());
        } catch (Exception e2) {
            v.c(new byte[]{-107, 55, -25, -99, 101, 55, -3, -69, -108, 63, -1, -40, 116, 32, -58, -11}, new byte[]{-15, 82, -116, -8, 17, 82, -76, -49}, new StringBuilder(), e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        try {
            this.c = false;
            AlertDialog alertDialog = this.b;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    public static C0301C j() {
        return C0300B.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String k(java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.FM.b.C0301C.k(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    private Map<String, String> l() {
        HashMap map = new HashMap();
        map.put("origin", e);
        map.put("referer", "https://www.123pan.com/");
        map.put("user-agent", "Dart/2.19(dart:io)-alist");
        map.put("platform", "android");
        map.put("app-version", "3");
        if (!TextUtils.isEmpty(this.a)) {
            map.put("Authorization", "Bearer " + this.a);
        }
        return map;
    }

    private int m() {
        for (int i = 0; i <= 2; i++) {
            try {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("driveId", 0);
                jsonObject.addProperty("fileName", "tangsantvtmp");
                jsonObject.addProperty("parentFileId", 0);
                jsonObject.addProperty("size", 0);
                jsonObject.addProperty("type", 1);
                jsonObject.addProperty("duplicate", 0);
                jsonObject.addProperty("NotReuse", Boolean.FALSE);
                jsonObject.addProperty("event", "newCreateFolder");
                jsonObject.addProperty("operateType", 1);
                JSONObject jSONObject = new JSONObject(C0378c.g("https://www.123pan.com/b/api/file/upload_request", jsonObject.toString(), l()).a());
                if (jSONObject.optInt("code") != 401) {
                    return jSONObject.optJSONObject("data").optJSONObject("Info").optInt("FileId");
                }
                try {
                    q(true);
                } catch (Exception e2) {
                    e = e2;
                }
                e = e2;
            } catch (Exception e3) {
                e = e3;
            }
            v.c(new byte[]{51, -96, 107, -27, -10, -16, -123, 99, 61, -73, 89, -34, -11, -6, -107, 110, 48, -27, 122, -59, -21, -91, -47}, new byte[]{84, -59, 31, -73, -103, -97, -15, 39}, new StringBuilder(), e);
            return 0;
        }
        return 0;
    }

    private void p(String str, C0359b c0359b, List<C0359b> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 1;
        while (true) {
            StringBuilder sb = new StringBuilder();
            sb.append("https://www.123pan.com/b/api/share/get?limit=");
            sb.append(100);
            sb.append("&Page=");
            sb.append(i);
            sb.append("&next=0&orderBy=file_name&orderDirection=asc&parentFileId=");
            sb.append(c0359b.d());
            s.b(new byte[]{-76, 8, -113, -33, -126, -95, -22, -65, -21, 70}, new byte[]{-110, 123, -25, -66, -16, -60, -95, -38}, sb, str);
            C0360c c0360c = (C0360c) new Gson().fromJson(C0378c.n(com.github.catvod.spider.merge.FM.L.P.a(new byte[]{21, -124, 76, -37, -105, 42, -42, -105, 87}, new byte[]{51, -41, 36, -70, -27, 79, -122, -32}, sb), l()), C0360c.class);
            for (C0359b c0359b2 : c0360c.a().a()) {
                if (c0359b2.a() == 0) {
                    arrayList.add(c0359b2);
                } else if (c0359b2.a() == 2) {
                    if (!TextUtils.isEmpty(c0359b.e())) {
                        c0359b2.j(c0359b.e());
                    }
                    arrayList2.add(c0359b2);
                }
            }
            list.addAll(arrayList2);
            arrayList2 = new ArrayList();
            try {
                if (c0360c.a().a().isEmpty()) {
                    break;
                }
                String strC = c0360c.a().c();
                boolean z = false;
                if (strC == "-1" || (strC != null && strC.equals("-1"))) {
                    z = true;
                }
                if (z) {
                    break;
                } else {
                    i++;
                }
            } catch (Exception unused) {
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p(str, (C0359b) it.next(), list);
        }
    }

    private boolean q(boolean z) {
        try {
            String str = f;
            String strO = com.github.catvod.spider.merge.FM.o.z.o(str);
            if (TextUtils.isEmpty(strO)) {
                return false;
            }
            JSONObject jSONObject = new JSONObject(strO);
            String strOptString = jSONObject.optString("username");
            String strOptString2 = jSONObject.optString("password");
            String strOptString3 = jSONObject.optString("access_token");
            this.a = strOptString3;
            if (!TextUtils.isEmpty(strOptString3) && !z) {
                return true;
            }
            JsonObject jsonObject = new JsonObject();
            if (com.github.catvod.spider.merge.FM.o.z.k(strOptString)) {
                jsonObject.addProperty("mail", strOptString);
                jsonObject.addProperty("password", strOptString2);
                jsonObject.addProperty("type", 2);
            } else {
                jsonObject.addProperty("passport", strOptString);
                jsonObject.addProperty("password", strOptString2);
                jsonObject.addProperty("remember", Boolean.TRUE);
            }
            Map<String, String> mapL = l();
            ((HashMap) mapL).put("platform", "web");
            JSONObject jSONObject2 = new JSONObject(C0378c.g(d, jsonObject.toString(), mapL).a());
            if (jSONObject2.optInt("code") != 200) {
                com.github.catvod.spider.merge.FM.o.z.m25b(str);
                C0394j.b(jSONObject2.optString("message"));
                throw new Exception(jSONObject2.optString("message"));
            }
            this.a = jSONObject2.optJSONObject("data").optString("token");
            jSONObject.put("access_token", this.a);
            com.github.catvod.spider.merge.FM.o.z.s(str, jSONObject.toString());
            return true;
        } catch (Exception e2) {
            v.c(new byte[]{-41, 111, -66, 26, 4, 16, -98, -81, -101}, new byte[]{-69, 0, -39, 115, 106, 48, -5, -107}, new StringBuilder(), e2);
            return false;
        }
    }

    public final C0332j n(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        p(str, new C0359b(), arrayList);
        if (arrayList.size() < 1) {
            return com.github.catvod.spider.merge.FM.o.z.c();
        }
        List listSingletonList = Collections.singletonList("123云盘原画");
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            String strA = "";
            if (!it.hasNext()) {
                break;
            }
            C0359b c0359b = (C0359b) it.next();
            if (!TextUtils.isEmpty(c0359b.f())) {
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                sb.append(c0359b.f().trim());
                strA = com.github.catvod.spider.merge.FM.L.P.a(new byte[]{-123}, new byte[]{-40, 48, 102, -86, -85, 68, -42, -35}, sb);
            }
            StringBuilder sbB = com.github.catvod.spider.merge.FM.L.P.b(strA);
            sbB.append(c0359b.e());
            sbB.append(c0359b.i());
            s.b(new byte[]{-19}, new byte[]{-55, -88, 106, -74, -102, 99, -111, 122}, sbB, str);
            sbB.append(Marker.ANY_NON_NULL_MARKER);
            sbB.append(c0359b.d());
            sbB.append(Marker.ANY_NON_NULL_MARKER);
            sbB.append(c0359b.e());
            sbB.append(Marker.ANY_NON_NULL_MARKER);
            sbB.append(c0359b.c());
            sbB.append(Marker.ANY_NON_NULL_MARKER);
            sbB.append(c0359b.g());
            sbB.append(Marker.ANY_NON_NULL_MARKER);
            sbB.append(c0359b.h());
            String string = sbB.toString();
            if (!TextUtils.isEmpty(str2) && !str2.contains("http")) {
                StringBuilder sbB2 = com.github.catvod.spider.merge.FM.L.P.b(string);
                s.b(new byte[]{-37}, new byte[]{-16, -26, 15, -74, -64, -10, -79, -9}, sbB2, str2);
                sbB2.append(Marker.ANY_NON_NULL_MARKER);
                sbB2.append(c0359b.e());
                string = sbB2.toString();
            }
            arrayList2.add(string);
        }
        for (int i = 0; i < listSingletonList.size(); i++) {
            arrayList3.add(TextUtils.join("#", arrayList2));
        }
        C0332j c0332j = new C0332j();
        c0332j.g(str);
        c0332j.e(str);
        c0332j.i("");
        c0332j.h("123");
        c0332j.k(TextUtils.join("$$$", arrayList3));
        c0332j.j(TextUtils.join("$$$", listSingletonList));
        c0332j.b("123云盘");
        return c0332j;
    }

    public final void o() {
        int i = 1;
        try {
            try {
                SystemClock.sleep(400L);
                Init.run(new RunnableC0306a(this, i));
                Init.run(new RunnableC0309d(this, i));
                while (TextUtils.isEmpty(this.a)) {
                    SystemClock.sleep(400L);
                }
            } catch (Exception e2) {
                Init.run(new RunnableC0306a(this, i));
                SpiderDebug.log("handleUserInfo: " + e2);
                while (TextUtils.isEmpty(this.a)) {
                    SystemClock.sleep(400L);
                }
            }
        } catch (Throwable th) {
            while (TextUtils.isEmpty(this.a)) {
                SystemClock.sleep(400L);
            }
            throw th;
        }
    }

    public final String r(String[] strArr) {
        if (TextUtils.isEmpty(this.a) && !q(false)) {
            o();
        }
        new Thread(new RunnableC0310e(this, strArr, 1)).start();
        String strK = k(strArr[1], strArr[2], strArr[3], strArr[4], strArr[5]);
        StringBuilder sb = new StringBuilder();
        sb.append(Proxy.getUrl());
        sb.append("?do=appdanmu&vodName=");
        sb.append(strArr[3]);
        sb.append("&vodIndex=");
        sb.append(strArr[4]);
        String strA = com.github.catvod.spider.merge.FM.L.P.a(new byte[]{6, -10, 12, -30, -17, 100, 114, 67}, new byte[]{32, -128, 99, -122, -70, 22, 30, 126}, sb);
        C0329g c0329g = new C0329g();
        c0329g.x(strK);
        c0329g.a(strA);
        c0329g.j();
        c0329g.f(l());
        return c0329g.toString();
    }

    public final void s() {
        try {
            LinearLayout linearLayout = new LinearLayout(Init.getActivity());
            final int i = 0;
            linearLayout.setOrientation(0);
            linearLayout.setPadding(16, 16, 16, 16);
            linearLayout.setBackgroundColor(-1);
            ImageView imageView = new ImageView(Init.getActivity());
            int iA = C0397m.a(120);
            imageView.setLayoutParams(new LinearLayout.LayoutParams(iA, iA));
            int i2 = 1;
            imageView.setContentDescription("二维码");
            try {
                imageView.setImageBitmap(com.github.catvod.spider.merge.FM.E.a.b(String.format(C0298a.b(new byte[]{-18, -3, 125, 87, 74, -88, -119, 7, -11, -77, 48, 30, 71, -65, -119, 82, -12, -26, 113, 94, 79, -29, -55, 31, -10, -4, 122, 79, 25, -23, -64, 77}, new byte[]{-122, -119, 9, 39, 112, -121, -90, 34}), com.github.catvod.spider.merge.FM.o.z.e(Init.context())), iA));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            LinearLayout linearLayout2 = new LinearLayout(Init.getActivity());
            linearLayout2.setOrientation(1);
            linearLayout2.setPadding(16, 0, 0, 0);
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            final EditText editText = new EditText(Init.getActivity());
            editText.setHint("请输入账号");
            editText.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            final EditText editText2 = new EditText(Init.getActivity());
            editText2.setHint("请输入密码");
            editText2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout2.addView(editText);
            linearLayout2.addView(editText2);
            linearLayout.addView(imageView);
            linearLayout.addView(linearLayout2);
            this.b = new AlertDialog.Builder(Init.getActivity()).setTitle("请输入123云盘的密码或者扫描下面的二维码进行填写").setView(linearLayout).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.FM.b.y
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    switch (i) {
                        case 0:
                            ((C0301C) this).c = false;
                            break;
                        default:
                            Q.i((Q) this);
                            break;
                    }
                }
            }).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.FM.b.z
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    C0301C.c(this.a, editText, editText2);
                }
            }).show();
            this.c = true;
            new Thread(new RunnableC0321p(this, i2)).start();
        } catch (Exception e3) {
            i();
            e3.printStackTrace();
            SpiderDebug.log("showInput2 ex: " + e3.getMessage());
        }
    }
}
