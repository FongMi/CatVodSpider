package com.github.catvod.spider;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Environment;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.A.m;
import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.a.C0531c;
import com.github.catvod.spider.merge.b.C0545i;
import com.github.catvod.spider.merge.b.RunnableC0539c;
import com.github.catvod.spider.merge.b.RunnableC0543g;
import com.github.catvod.spider.merge.b.RunnableC0549p;
import com.github.catvod.spider.merge.b.v;
import com.github.catvod.spider.merge.c.C0550a;
import com.github.catvod.spider.merge.c.C0552c;
import com.github.catvod.spider.merge.c.C0554e;
import com.github.catvod.spider.merge.k.C0575b;
import com.github.catvod.spider.merge.m.C0588G;
import com.github.catvod.spider.merge.m.C0589H;
import com.github.catvod.spider.merge.m.C0590I;
import com.github.catvod.spider.merge.m.C0591J;
import com.github.catvod.spider.merge.m.C0602k;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class Config extends Spider {
    public static long lastResetClickTime;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String e$1;
    private String f;
    private String g;
    private String h;
    private boolean i;
    private C0591J k;

    /* JADX INFO: renamed from: com.github.catvod.spider.Config$1, reason: invalid class name */
    public class AnonymousClass1 {
        private String nickname;
        private String pl_username;
        private Map user;
        private String userAccount;
        private String userName;
        private String username;

        public String getAliNickname() {
            Map map = this.user;
            return (map == null || map.get("nick_name") == null) ? "" : (String) map.get("nick_name");
        }

        public String getNickname() {
            return this.nickname;
        }

        public String getuserAccount() {
            return this.userAccount;
        }

        public String getuserName() {
            return this.username;
        }

        public String getuserName$1() {
            return this.userName;
        }

        public String pl_username() {
            return this.pl_username;
        }
    }

    private String a(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                return "";
            }
            Gson gson = new Gson();
            FileReader fileReader = new FileReader(file);
            String nickname = ((AnonymousClass1) gson.fromJson(fileReader, AnonymousClass1.class)).getNickname();
            fileReader.close();
            return nickname;
        } catch (Exception e) {
            return "";
        }
    }

    public static /* synthetic */ void a(Config config) {
        String str = config.h;
        config.r(1);
    }

    private String b(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                return "";
            }
            Gson gson = new Gson();
            FileReader fileReader = new FileReader(file);
            String str2 = ((AnonymousClass1) gson.fromJson(fileReader, AnonymousClass1.class)).getuserName();
            fileReader.close();
            return str2;
        } catch (Exception e) {
            return "";
        }
    }

    public static /* synthetic */ void b(Config config) {
        config.getClass();
        try {
            config.l(config.h);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String c(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                return "";
            }
            Gson gson = new Gson();
            FileReader fileReader = new FileReader(file);
            String str2 = ((AnonymousClass1) gson.fromJson(fileReader, AnonymousClass1.class)).getuserAccount();
            fileReader.close();
            return str2;
        } catch (Exception e) {
            return "";
        }
    }

    public static /* synthetic */ void c(Config config) {
        config.getClass();
        try {
            config.o(config.h);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String d(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                return "";
            }
            Gson gson = new Gson();
            FileReader fileReader = new FileReader(file);
            String aliNickname = ((AnonymousClass1) gson.fromJson(fileReader, AnonymousClass1.class)).getAliNickname();
            fileReader.close();
            return aliNickname;
        } catch (Exception e) {
            return "";
        }
    }

    public static void disableUpdateCheck() {
        try {
            File fileC = C0602k.c("/config.json");
            JsonObject jsonObject = new JsonObject();
            if (fileC.exists()) {
                String strA = C0602k.a(fileC);
                if (!strA.isEmpty()) {
                    jsonObject = new JsonParser().parse(strA).getAsJsonObject();
                }
            }
            if ("关闭".equals(jsonObject.has("update") ? jsonObject.get("update").getAsString() : "开启")) {
                C0590I.i("已是关闭状态");
                return;
            }
            jsonObject.addProperty("update", "关闭");
            C0602k.c(fileC, jsonObject.toString());
            C0590I.i("检查更新已关闭");
            SpiderDebug.log("配置已更新: " + jsonObject.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String e(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                return "";
            }
            Gson gson = new Gson();
            FileReader fileReader = new FileReader(file);
            String str2 = ((AnonymousClass1) gson.fromJson(fileReader, AnonymousClass1.class)).getuserName$1();
            fileReader.close();
            return str2;
        } catch (Exception e) {
            return "";
        }
    }

    public static /* synthetic */ void e(Config config) {
        String str = config.h;
        config.r(2);
    }

    public static void enableUpdateCheck() {
        try {
            File fileC = C0602k.c("/config.json");
            JsonObject jsonObject = new JsonObject();
            if (fileC.exists()) {
                String strA = C0602k.a(fileC);
                if (!strA.isEmpty()) {
                    jsonObject = new JsonParser().parse(strA).getAsJsonObject();
                }
            }
            if ("开启".equals(jsonObject.has("update") ? jsonObject.get("update").getAsString() : "开启")) {
                C0590I.i("已是开启状态");
                return;
            }
            jsonObject.addProperty("update", "开启");
            C0602k.c(fileC, jsonObject.toString());
            C0590I.i("检查更新已开启");
            SpiderDebug.log("配置已更新: " + jsonObject.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String f(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                return "";
            }
            Gson gson = new Gson();
            FileReader fileReader = new FileReader(file);
            String strPl_username = ((AnonymousClass1) gson.fromJson(fileReader, AnonymousClass1.class)).pl_username();
            fileReader.close();
            return strPl_username;
        } catch (Exception e) {
            return "";
        }
    }

    public static List<String> get123Options() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("123原画");
        return arrayList;
    }

    public static List<String> getAliOptions() {
        ArrayList arrayList = new ArrayList();
        try {
            Gson gson = new Gson();
            String strA = C0602k.a(C0602k.c("/config.json"));
            if (strA.length() > 0) {
                String asString = ((JsonObject) gson.fromJson(strA, JsonObject.class)).get("aliHD").getAsString();
                if ("阿里原画".equals(asString)) {
                    arrayList.add("阿里原画");
                } else if ("阿里普画".equals(asString)) {
                    arrayList.add("阿里普画");
                } else if ("阿里原画|阿里普画".equals(asString)) {
                    arrayList.add("阿里原画");
                    arrayList.add("阿里普画");
                } else if ("阿里普画|阿里原画".equals(asString)) {
                    arrayList.add("阿里普画");
                    arrayList.add("阿里原画");
                } else {
                    arrayList.add("阿里原画");
                }
            } else {
                arrayList.add("阿里原画");
            }
        } catch (Exception e) {
            arrayList.add("阿里原画");
        }
        return arrayList;
    }

    public static List<String> getBaiduOptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("百度原画");
        return arrayList;
    }

    public static List<String> getMobileOptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("移动普画");
        return arrayList;
    }

    public static List<String> getQuarkOptions() {
        ArrayList arrayList = new ArrayList();
        try {
            Gson gson = new Gson();
            String strA = C0602k.a(C0602k.c("/config.json"));
            if (strA.length() > 0) {
                String asString = ((JsonObject) gson.fromJson(strA, JsonObject.class)).get("quarkHD").getAsString();
                if ("夸克原画".equals(asString)) {
                    arrayList.add("夸克原画");
                } else if ("夸克普画".equals(asString)) {
                    arrayList.add("夸克普画");
                } else if ("夸克智能".equals(asString)) {
                    arrayList.add("夸克智能");
                } else if ("夸克原画|夸克普画".equals(asString)) {
                    arrayList.add("夸克原画");
                    arrayList.add("夸克普画");
                } else if ("夸克普画|夸克原画".equals(asString)) {
                    arrayList.add("夸克普画");
                    arrayList.add("夸克原画");
                } else {
                    arrayList.add("夸克原画");
                }
            } else {
                arrayList.add("夸克原画");
            }
        } catch (Exception e) {
            arrayList.add("夸克原画");
        }
        return arrayList;
    }

    public static List<String> getTianyiOptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("天翼原画");
        return arrayList;
    }

    public static List<String> getUCOptions() {
        ArrayList arrayList = new ArrayList();
        try {
            Gson gson = new Gson();
            String strA = C0602k.a(C0602k.c("/config.json"));
            if (strA.length() > 0) {
                String asString = ((JsonObject) gson.fromJson(strA, JsonObject.class)).get("ucHD").getAsString();
                if ("UC原画".equals(asString)) {
                    arrayList.add("UC原画");
                } else if ("UC普画".equals(asString)) {
                    arrayList.add("UC普画");
                } else if ("UC原画|UC普画".equals(asString)) {
                    arrayList.add("UC原画");
                    arrayList.add("UC普画");
                } else if ("UC普画|UC原画".equals(asString)) {
                    arrayList.add("UC普画");
                    arrayList.add("UC原画");
                } else {
                    arrayList.add("UC原画");
                }
            } else {
                arrayList.add("UC原画");
            }
        } catch (Exception e) {
            arrayList.add("UC原画");
        }
        return arrayList;
    }

    public static String inputStreamToString(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                return sb.toString();
            }
            sb.append(line);
            sb.append("\n");
        }
    }

    public static boolean is1314GoProxyActive() {
        String strL = C0575b.l("http://127.0.0.1:1314/api/ping", new HashMap());
        return strL != null && strL.equals("ok");
    }

    private boolean l(String str) {
        String string;
        JsonObject jsonObject = new JsonObject();
        String strA = C0602k.a(C0545i.d().f());
        if (!TextUtils.isEmpty(strA)) {
            jsonObject.addProperty("ali", strA);
        }
        String strA2 = C0602k.a(C0602k.b("/quark_cookie.txt"));
        if (!TextUtils.isEmpty(strA2)) {
            jsonObject.addProperty("quark", strA2);
        }
        String strA3 = C0602k.a(C0602k.b("/uc_cookie.txt"));
        if (!TextUtils.isEmpty(strA3)) {
            jsonObject.addProperty("uc", strA3);
        }
        String strA4 = C0602k.a(C0602k.b("/uc_token.txt"));
        if (!TextUtils.isEmpty(strA4)) {
            jsonObject.addProperty("uc_tv", strA4);
        }
        String strA5 = C0602k.a(C0602k.b("/bili_cookie.txt"));
        if (!TextUtils.isEmpty(strA5)) {
            jsonObject.addProperty("bili", strA5);
        }
        String strA6 = C0602k.a(C0602k.b("/cloud189.txt"));
        if (!TextUtils.isEmpty(strA6)) {
            jsonObject.addProperty("cloud189", strA6);
        }
        String strA7 = C0602k.a(C0602k.b("/cloud123.txt"));
        if (!TextUtils.isEmpty(strA7)) {
            jsonObject.addProperty("cloud123", strA7);
        }
        String strA8 = C0602k.a(C0602k.b("/uc_machine_code.txt"));
        if (!TextUtils.isEmpty(strA8)) {
            jsonObject.addProperty("ucMachineCode", strA8);
        }
        String strA9 = C0602k.a(C0602k.b("/baidu.txt"));
        if (!TextUtils.isEmpty(strA9)) {
            jsonObject.addProperty("baidu", strA9);
        }
        if (jsonObject.size() > 0) {
            String strA10 = C0531c.a(str, "/add");
            HashMap mapB = v.b("username", "");
            mapB.put("data", this.k.c(jsonObject.toString()));
            JSONObject jSONObject = new JSONObject(C0575b.h(strA10, new JSONObject(mapB).toString()));
            if (jSONObject.optInt("code") == 200) {
                C0590I.i("登录信息已成功上传至云端");
                return true;
            }
            StringBuilder sbA = C0529a.a("上传登录信息失败:");
            sbA.append(jSONObject.optString("msg"));
            string = sbA.toString();
        } else {
            string = "当前设备无登录信息,请先扫码登录";
        }
        C0590I.i(string);
        return false;
    }

    private String n(String str) {
        return str.startsWith("quark") ? "夸克" : str.startsWith("uc") ? "UC" : "阿里";
    }

    private boolean o(String str) {
        String str2;
        String strH = C0575b.h(C0531c.a(str, "/get"), new JSONObject(v.b("username", "")).toString());
        SpiderDebug.log(strH);
        JSONObject jSONObject = new JSONObject(strH);
        SpiderDebug.log(jSONObject.toString());
        if (jSONObject.optInt("code") == 200) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("token");
            if (jSONArrayOptJSONArray.length() > 0) {
                JSONObject jSONObject2 = new JSONObject(this.k.b(jSONArrayOptJSONArray.optString(0)));
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strOptString = jSONObject2.optString(next);
                    if (!TextUtils.isEmpty(strOptString)) {
                        if ("ali".equals(next)) {
                            C0602k.c(C0602k.b("aliyun"), strOptString);
                        }
                        if ("quark".equals(next)) {
                            C0602k.c(C0602k.b("/quark_cookie.txt"), strOptString);
                        }
                        if ("uc".equals(next)) {
                            C0602k.c(C0602k.b("/uc_cookie.txt"), strOptString);
                        }
                        if ("uc_tv".equals(next)) {
                            C0602k.c(C0602k.b("/uc_token.txt"), strOptString);
                        }
                        if ("bili".equals(next)) {
                            C0602k.c(C0602k.b("/bili_cookie.txt"), strOptString);
                        }
                        if ("cloud189".equals(next)) {
                            C0602k.c(C0602k.b("/cloud189.txt"), strOptString);
                        }
                        if ("cloud123".equals(next)) {
                            C0602k.c(C0602k.b("/cloud123.txt"), strOptString);
                        }
                        if ("ucMachineCode".equals(next)) {
                            C0602k.c(C0602k.b("/uc_machine_code.txt"), strOptString);
                        }
                        if ("baidu".equals(next)) {
                            C0602k.c(C0602k.b("/baidu.txt"), strOptString);
                        }
                    }
                }
                C0590I.i("从云端获取登录信息成功");
                return true;
            }
            str2 = "云端没有数据";
        } else {
            str2 = "从云端获取登录信息出现异常";
        }
        C0590I.i(str2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(String str) {
        String str2;
        String str3;
        String str4;
        HashMap map = new HashMap();
        if ("100".equals(str)) {
            map.put("site", "ali");
            str4 = "请使用阿里云盘APP扫码";
        } else if ("300".equals(str)) {
            map.put("site", "quark");
            str4 = "请使用夸克浏览器APP扫码";
        } else if ("500".equals(str)) {
            map.put("site", "uc");
            str4 = "请使用UC浏览器APP扫码";
        } else if ("700".equals(str)) {
            map.put("site", "bili");
            str4 = "请使用哔哩哔哩APP扫码";
        } else if ("b300".equals(str)) {
            map.put("site", "baidu");
            str4 = "请使用百度网盘APP扫码";
        } else if ("c500".equals(str)) {
            map.put("site", "cloud189");
            str4 = "请输入天翼云盘账号密码";
        } else if ("p300".equals(str)) {
            map.put("site", "cloud123");
            str4 = "请输入123云盘账号密码";
        } else if ("quarktip".equals(str)) {
            map.put("site", "quarktip");
            str4 = "夸克网盘帮助";
        } else if ("uctip".equals(str)) {
            map.put("site", "uctip");
            str4 = "UC网盘帮助";
        } else if ("189tip".equals(str)) {
            map.put("site", "189tip");
            str4 = "天翼账号无法登录？";
        } else {
            if (!"123panfxck".equals(str)) {
                if ("BlockAli".equals(str)) {
                    str3 = "阿里云盘";
                } else if ("BlockQuark".equals(str)) {
                    str3 = "夸克网盘";
                } else if ("BlockUC".equals(str)) {
                    str3 = "UC网盘";
                } else if ("Block189".equals(str)) {
                    str3 = "天翼云盘";
                } else if ("Block123".equals(str)) {
                    str3 = "123云盘";
                } else if ("BlockBaidu".equals(str)) {
                    str3 = "百度网盘";
                } else {
                    if (!"Block139".equals(str)) {
                        if ("homePage".equals(str) || "danmuColor".equals(str) || "panOrder".equals(str) || "pansou".equals(str) || "proxyMode".equals(str) || "backup".equals(str) || "aliThread".equals(str) || "quarkThread".equals(str) || "ucThread".equals(str) || "aliHD".equals(str) || "quarkHD".equals(str) || "ucHD".equals(str) || "update".equals(str) || "newaliyun".equals(str) || "newquark".equals(str) || "newuc".equals(str) || "newbaidu".equals(str) || "new189".equals(str) || "new123".equals(str) || "newbili".equals(str)) {
                            map.put("site", str);
                            map.put("flag", "");
                            C0588G.q().z(map);
                        }
                        if ("200".equals(str)) {
                            str2 = "aliyun";
                        } else if ("400".equals(str)) {
                            str2 = "/quark_cookie.txt";
                        } else if ("c400".equals(str)) {
                            C0602k.c(C0602k.b("/189_cookie.txt"), "");
                            str2 = "/cloud189.txt";
                        } else if ("p400".equals(str)) {
                            str2 = "/cloud123.txt";
                        } else if ("b400".equals(str)) {
                            str2 = "/baidu.txt";
                        } else if ("600".equals(str)) {
                            str2 = "/uc_cookie.txt";
                        } else if ("600token".equals(str)) {
                            str2 = "/uc_token.txt";
                        } else {
                            if (!"800".equals(str)) {
                                if ("uctoken".equals(str)) {
                                    m.t().D();
                                    return;
                                }
                                if ("recovery".equals(str)) {
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    if (jCurrentTimeMillis - lastResetClickTime < 500) {
                                        lastResetClickTime = 0L;
                                        C0589H.backupsConfig();
                                        return;
                                    } else {
                                        lastResetClickTime = jCurrentTimeMillis;
                                        C0590I.i("⚠️ 为防止误操作，请双击确认重置");
                                        return;
                                    }
                                }
                                return;
                            }
                            str2 = "/bili_cookie.txt";
                        }
                        File fileB = C0602k.b(str2);
                        C0602k.c(fileB, "");
                        C0590I.i(fileB.getName());
                        return;
                    }
                    str3 = "移动云盘";
                }
                map.put("site", str3);
                map.put("flag", "");
                C0588G.q().z(map);
            }
            map.put("site", "123panfxck");
            str4 = "请输入123云盘社区Cookie";
        }
        map.put("flag", str4);
        C0588G.q().z(map);
    }

    private void r(final int i) {
        try {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.i ? Init.getConfigActivity() : Init.getActivity());
            builder.setTitle("提示");
            builder.setMessage(i == 1 ? "将当前设备的云盘、B站登录信息上传至云端" : "从云端下载云盘、B站登录信息,并覆盖已有的");
            builder.setNegativeButton("确定", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.l.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    Config config = this.a;
                    int i3 = i;
                    config.getClass();
                    Init.execute(i3 == 1 ? new RunnableC0539c(config, 2) : new RunnableC0543g(config, 2));
                }
            });
            builder.setPositiveButton("取消", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.l.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                }
            });
            builder.create().show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String action(String str) {
        Init.execute(new RunnableC0549p(this, str, 2));
        return "";
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        C0554e c0554e;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        try {
            ArrayList arrayList = new ArrayList();
            if ("alipan".equals(str)) {
                if (new JsonParser().parse(C0602k.a(C0602k.c("/config.json"))).getAsJsonObject().get("panBlock").getAsString().contains("阿里云盘")) {
                    str21 = "阿里云盘";
                    str22 = "当前状态:已关闭";
                } else {
                    str21 = "阿里云盘";
                    str22 = "当前状态:已开启";
                }
                arrayList.add(new C0554e("BlockAli", str21, "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/50zE/1200X800/aliyun.jpg", str22, this.i ? "BlockAli" : ""));
                String strD = d(Environment.getExternalStorageDirectory().getAbsolutePath() + "/TVBox/.aliyun");
                arrayList.add(new C0554e("newaliyun", "阿里个人中心", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/50zE/1200X800/aliyun.jpg", TextUtils.isEmpty(strD) ? "未登录" : strD, this.i ? "newaliyun" : ""));
                arrayList.add(new C0554e("100", "设置阿里Token", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/50zE/1200X800/aliyun.jpg", "点击设置", this.i ? "100" : ""));
                arrayList.add(new C0554e("200", "清除阿里Token", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/50zE/1200X800/aliyun.jpg", "点击清除", this.i ? "200" : ""));
                arrayList.add(new C0554e("aliHD", "阿里云盘画质", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/50zE/1200X800/aliyun.jpg", new JsonParser().parse(C0602k.a(C0602k.c("/config.json"))).getAsJsonObject().get("aliHD").getAsString(), this.i ? "aliHD" : ""));
                c0554e = new C0554e("aliThread", "阿里云盘线程", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/50zE/1200X800/aliyun.jpg", "当前线程:" + new JsonParser().parse(C0602k.a(C0602k.c("/config.json"))).getAsJsonObject().get("aliThread").getAsString(), this.i ? "aliThread" : "");
            } else if ("quark".equals(str)) {
                if (new JsonParser().parse(C0602k.a(C0602k.c("/config.json"))).getAsJsonObject().get("panBlock").getAsString().contains("夸克网盘")) {
                    str19 = "夸克网盘";
                    str20 = "当前状态:已关闭";
                } else {
                    str19 = "夸克网盘";
                    str20 = "当前状态:已开启";
                }
                arrayList.add(new C0554e("BlockQuark", str19, "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/El1L/1200X800/quark.jpg", str20, this.i ? "BlockQuark" : ""));
                String strA = a(Environment.getExternalStorageDirectory().getAbsolutePath() + "/TVBox/quark_cookie.txt");
                arrayList.add(new C0554e("newquark", "夸克个人中心", "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/El1L/1200X800/quark.jpg", TextUtils.isEmpty(strA) ? "未登录" : strA, this.i ? "newquark" : ""));
                arrayList.add(new C0554e("300", "设置夸克Cookie", "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/El1L/1200X800/quark.jpg", "点击设置", this.i ? "300" : ""));
                arrayList.add(new C0554e("400", "清除夸克Cookie", "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/El1L/1200X800/quark.jpg", "点击清除", this.i ? "400" : ""));
                arrayList.add(new C0554e("quarkHD", "夸克网盘画质", "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/El1L/1200X800/quark.jpg", new JsonParser().parse(C0602k.a(C0602k.c("/config.json"))).getAsJsonObject().get("quarkHD").getAsString(), this.i ? "quarkHD" : ""));
                arrayList.add(new C0554e("quarkThread", "夸克网盘线程", "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/El1L/1200X800/quark.jpg", "当前线程:" + new JsonParser().parse(C0602k.a(C0602k.c("/config.json"))).getAsJsonObject().get("quarkThread").getAsString(), this.i ? "quarkThread" : ""));
                c0554e = new C0554e("quarktip", "夸克网盘帮助", "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/El1L/1200X800/quark.jpg", "点击查看", this.i ? "quarktip" : "");
            } else if ("uc".equals(str)) {
                if (new JsonParser().parse(C0602k.a(C0602k.c("/config.json"))).getAsJsonObject().get("panBlock").getAsString().contains("UC网盘")) {
                    str17 = "UC网盘";
                    str18 = "当前状态:已关闭";
                } else {
                    str17 = "UC网盘";
                    str18 = "当前状态:已开启";
                }
                arrayList.add(new C0554e("BlockUC", str17, "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/OSYH/1200X800/uc.jpg", str18, this.i ? "BlockUC" : ""));
                String strA2 = a(Environment.getExternalStorageDirectory().getAbsolutePath() + "/TVBox/uc_cookie.txt");
                arrayList.add(new C0554e("newuc", "UC个人中心", "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/OSYH/1200X800/uc.jpg", TextUtils.isEmpty(strA2) ? "未登录" : strA2, this.i ? "newuc" : ""));
                arrayList.add(new C0554e("500", "设置UC Cookie", "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/OSYH/1200X800/uc.jpg", "点击设置", this.i ? "500" : ""));
                arrayList.add(new C0554e("uctoken", "设置UC TV Token", "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/OSYH/1200X800/uc.jpg", "点击设置", this.i ? "uctoken" : ""));
                arrayList.add(new C0554e("600", "清除UC Cookie", "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/OSYH/1200X800/uc.jpg", "点击清除", this.i ? "600" : ""));
                arrayList.add(new C0554e("600token", "清除UC TV Token", "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/OSYH/1200X800/uc.jpg", "点击清除", this.i ? "600token" : ""));
                arrayList.add(new C0554e("ucHD", "UC网盘画质", "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/OSYH/1200X800/uc.jpg", new JsonParser().parse(C0602k.a(C0602k.c("/config.json"))).getAsJsonObject().get("ucHD").getAsString(), this.i ? "ucHD" : ""));
                arrayList.add(new C0554e("ucThread", "UC网盘线程", "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/OSYH/1200X800/uc.jpg", "当前线程:" + new JsonParser().parse(C0602k.a(C0602k.c("/config.json"))).getAsJsonObject().get("ucThread").getAsString(), this.i ? "ucThread" : ""));
                c0554e = new C0554e("uctip", "UC网盘帮助", "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/OSYH/1200X800/uc.jpg", "点击查看", this.i ? "uctip" : "");
            } else if ("cloud189".equals(str)) {
                if (new JsonParser().parse(C0602k.a(C0602k.c("/config.json"))).getAsJsonObject().get("panBlock").getAsString().contains("天翼云盘")) {
                    str15 = "天翼云盘";
                    str16 = "当前状态:已关闭";
                } else {
                    str15 = "天翼云盘";
                    str16 = "当前状态:已开启";
                }
                arrayList.add(new C0554e("Block189", str15, "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/xiFH/1200X800/189.jpg", str16, this.i ? "Block189" : ""));
                String strC = c(Environment.getExternalStorageDirectory().getAbsolutePath() + "/TVBox/cloud189.txt");
                arrayList.add(new C0554e("new189", "天翼个人中心", "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/xiFH/1200X800/189.jpg", TextUtils.isEmpty(strC) ? "未登录" : strC, this.i ? "new189" : ""));
                arrayList.add(new C0554e("c500", "设置天翼账号密码", "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/xiFH/1200X800/189.jpg", "点击设置", this.i ? "c500" : ""));
                arrayList.add(new C0554e("c400", "清除天翼Cookie", "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/xiFH/1200X800/189.jpg", "点击清除", this.i ? "c400" : ""));
                c0554e = new C0554e("189tip", "天翼云盘帮助", "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/xiFH/1200X800/189.jpg", "点击查看", this.i ? "189tip" : "");
            } else if ("cloud123".equals(str)) {
                if (new JsonParser().parse(C0602k.a(C0602k.c("/config.json"))).getAsJsonObject().get("panBlock").getAsString().contains("123云盘")) {
                    str13 = "123云盘";
                    str14 = "当前状态:已关闭";
                } else {
                    str13 = "123云盘";
                    str14 = "当前状态:已开启";
                }
                arrayList.add(new C0554e("Block123", str13, "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/wF1k/1200X800/123.jpg", str14, this.i ? "Block123" : ""));
                String strA3 = a(Environment.getExternalStorageDirectory().getAbsolutePath() + "/TVBox/cloud123.txt");
                arrayList.add(new C0554e("new123", "123个人中心", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/wF1k/1200X800/123.jpg", TextUtils.isEmpty(strA3) ? "未登录" : strA3, this.i ? "new123" : ""));
                arrayList.add(new C0554e("p300", "设置123账号密码", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/wF1k/1200X800/123.jpg", "点击设置", this.i ? "p300" : ""));
                arrayList.add(new C0554e("p400", "清除123 Cookie", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/wF1k/1200X800/123.jpg", "点击清除", this.i ? "p400" : ""));
                c0554e = new C0554e("123panfxck", "设置123云盘社区Cookie", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/wF1k/1200X800/123.jpg", "点击设置", this.i ? "123panfxck" : "");
            } else if ("baidu".equals(str)) {
                if (new JsonParser().parse(C0602k.a(C0602k.c("/config.json"))).getAsJsonObject().get("panBlock").getAsString().contains("百度网盘")) {
                    str11 = "百度网盘";
                    str12 = "当前状态:已关闭";
                } else {
                    str11 = "百度网盘";
                    str12 = "当前状态:已开启";
                }
                arrayList.add(new C0554e("BlockBaidu", str11, "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/0rBz/1200X800/baidu.jpg", str12, this.i ? "BlockBaidu" : ""));
                String strB = b(Environment.getExternalStorageDirectory().getAbsolutePath() + "/TVBox/baidu.txt");
                arrayList.add(new C0554e("newbaidu", "百度个人中心", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/0rBz/1200X800/baidu.jpg", TextUtils.isEmpty(strB) ? "未登录" : strB, this.i ? "newbaidu" : ""));
                arrayList.add(new C0554e("b300", "设置百度Cookie", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/0rBz/1200X800/baidu.jpg", "点击设置", this.i ? "b300" : ""));
                c0554e = new C0554e("b400", "清除百度Cookie", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/0rBz/1200X800/baidu.jpg", "点击清除", this.i ? "b400" : "");
            } else if ("cloud139".equals(str)) {
                if (new JsonParser().parse(C0602k.a(C0602k.c("/config.json"))).getAsJsonObject().get("panBlock").getAsString().contains("移动云盘")) {
                    str9 = "移动云盘";
                    str10 = "当前状态:已关闭";
                } else {
                    str9 = "移动云盘";
                    str10 = "当前状态:已开启";
                }
                c0554e = new C0554e("Block139", str9, "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/cZvf/1200X800/139.jpg", str10, this.i ? "Block139" : "");
            } else if ("bili".equals(str)) {
                String strA4 = a(Environment.getExternalStorageDirectory().getAbsolutePath() + "/TVBox/bili_cookie.txt");
                arrayList.add(new C0554e("newbili", "哔哩个人中心", "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/fv7c/1200X800/bili.jpg", TextUtils.isEmpty(strA4) ? "未登录" : strA4, this.i ? "newbili" : ""));
                arrayList.add(new C0554e("700", "设置哔哩Cookie", "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/fv7c/1200X800/bili.jpg", "点击设置", this.i ? "700" : ""));
                c0554e = new C0554e("800", "清除哔哩Cookie", "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/fv7c/1200X800/bili.jpg", "点击清除", this.i ? "800" : "");
            } else {
                if (!"other".equals(str)) {
                    if ("recovery".equals(str)) {
                        c0554e = new C0554e("recovery", "重置配置中心", "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/DbIX/1200X800/recovery.jpg", "双击重置", this.i ? "recovery" : "");
                    }
                    C0552c c0552c = new C0552c();
                    c0552c.i(1, 1, 1, 1);
                    c0552c.w(arrayList);
                    return c0552c.toString();
                }
                arrayList.add(new C0554e("homePage", "主页管理", "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/CPZm/1200X800/home.jpg", "点击设置", this.i ? "homePage" : ""));
                if ("默认".equals(new JsonParser().parse(C0602k.a(C0602k.c("/config.json"))).getAsJsonObject().get("danmuColor").getAsString())) {
                    str3 = "弹幕颜色";
                    str4 = "当前颜色:默认";
                } else {
                    str3 = "弹幕颜色";
                    str4 = "当前颜色:彩色";
                }
                arrayList.add(new C0554e("danmuColor", str3, "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/r0mE/1600X1068/danmu%241.jpg", str4, this.i ? "danmuColor" : ""));
                arrayList.add(new C0554e("panOrder", "云盘排序", "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/yuC2/1200X800/yunpan.jpg", "点击设置", this.i ? "panOrder" : ""));
                arrayList.add(new C0554e("pansou", "盘搜域名", "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/LOXz/1200X800/pansou.jpg", new JsonParser().parse(C0602k.a(C0602k.c("/config.json"))).getAsJsonObject().get("pansouUrl").getAsString(), this.i ? "pansou" : ""));
                if ("Go多线程".equals(new JsonParser().parse(C0602k.a(C0602k.c("/config.json"))).getAsJsonObject().get("proxyMode").getAsString())) {
                    str5 = "当前模式:GO多线程";
                    str6 = "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/v1Ln/1200X800/go.jpg";
                } else {
                    str5 = "当前模式:Java多线程";
                    str6 = "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/xVwA/1200X800/java.jpg";
                }
                arrayList.add(new C0554e("proxyMode", "多线程代理模式", str6, str5, this.i ? "proxyMode" : ""));
                arrayList.add(new C0554e("backup", "数据备份", "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/pNxQ/1200X800/backup.jpg", "点击设置", this.i ? "backup" : ""));
                if ("开启".equals(new JsonParser().parse(C0602k.a(C0602k.c("/config.json"))).getAsJsonObject().get("update").getAsString())) {
                    str7 = "检查更新";
                    str8 = "当前状态:已开启";
                } else {
                    str7 = "检查更新";
                    str8 = "当前状态:已关闭";
                }
                c0554e = new C0554e("update", str7, "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/q3uW/1200X800/update.jpg", str8, this.i ? "update" : "");
            }
            arrayList.add(c0554e);
            C0552c c0552c2 = new C0552c();
            c0552c2.i(1, 1, 1, 1);
            c0552c2.w(arrayList);
            return c0552c2.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String detailContent(List<String> list) {
        try {
            Init.interceptActivityStart();
            p(list.get(0));
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String homeContent(boolean z) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject("{\"综合配置\":\"other\",\"夸克网盘配置\":\"quark\",\"UC网盘配置\":\"uc\",\"百度网盘配置\":\"baidu\",\"天翼云盘配置\":\"cloud189\",\"123云盘配置\":\"cloud123\",\"阿里云盘配置\":\"alipan\",\"移动云盘配置\":\"cloud139\",\"哔哩配置\":\"bili\",\"重置配置\":\"recovery\"}");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                arrayList.add(new C0550a(jSONObject.optString(next), next, null));
            }
            return C0552c.p(arrayList, new ArrayList());
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public void init(Context context, String str) {
        Init.checkPermission();
        try {
            this.i = C0590I.f();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
