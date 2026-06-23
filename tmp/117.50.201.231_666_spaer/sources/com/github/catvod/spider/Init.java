package com.github.catvod.spider;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.QuarkPan;
import com.github.catvod.spider.UCPan;
import com.github.catvod.spider.merge.AB.o.C0120y;
import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.k.C0575b;
import com.github.catvod.spider.merge.m.C0590I;
import com.github.catvod.spider.merge.m.C0592a;
import com.github.catvod.spider.merge.m.C0602k;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class Init {
    private static final Map<String, Boolean> e = "";
    public static String v = "04.17";
    private Application c;
    private final Handler b = new Handler(Looper.getMainLooper());
    private final ExecutorService a = Executors.newFixedThreadPool(5);

    private static class Loader {
        static volatile Init a = new Init();

        private Loader() {
        }
    }

    class UP implements Runnable {
        final /* synthetic */ Context val$context;

        UP(Context context) {
            this.val$context = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(2000L);
                if ("开启".equals(new JsonParser().parse(C0602k.a(C0602k.c("/config.json"))).getAsJsonObject().get("update").getAsString())) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://ghfast.top/https://raw.githubusercontent.com/IY-CPU/IY/main/version.txt").openConnection();
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(10000);
                    httpURLConnection.connect();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                    String line = bufferedReader.readLine();
                    bufferedReader.close();
                    httpURLConnection.disconnect();
                    if (line == null || line.replaceAll("\\.", "").replaceAll(" ", "").equals(Init.v.replaceAll("\\.", "").replaceAll(" ", ""))) {
                        return;
                    }
                    C0590I.i("检测到新版本：" + line + "\n(当前版本：" + Init.v + ")");
                }
            } catch (UnknownHostException e) {
                C0590I.i("网络不可用，请检查连接");
            } catch (IOException e2) {
            } catch (Exception e3) {
            }
        }
    }

    public Init() {
        e = new HashMap();
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Boolean>] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Boolean>] */
    public static /* synthetic */ void a() throws IOException {
        BufferedReader bufferedReader;
        File file = new File(context().getFilesDir(), "string.txt");
        if (file.exists() && "8da98e38747fe1fddd1ac860064a6220".equals(d(file))) {
            bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                } else {
                    e.put(line, Boolean.TRUE);
                }
            }
        } else {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            bufferedReader = new BufferedReader(new InputStreamReader(builder.build().newCall(new Request.Builder().url("https://cik07-cos.7moor-fs2.com/im/4d2c3f00-7d4c-11e5-af15-41bf63ae4ea0/d99c254440ab0274/string.txt").addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").build()).execute().body().byteStream()));
            FileOutputStream fileOutputStream = new FileOutputStream(new File(context().getFilesDir(), "string.txt"));
            while (true) {
                String line2 = bufferedReader.readLine();
                if (line2 == null) {
                    break;
                }
                e.put(line2, Boolean.TRUE);
                fileOutputStream.write(line2.getBytes());
                fileOutputStream.write("\n".getBytes());
            }
            fileOutputStream.close();
        }
        if (bufferedReader != null) {
            bufferedReader.close();
        }
    }

    @SuppressLint({"NewApi"})
    public static void checkPermission() {
        try {
            Activity activity = getActivity();
            if (activity != null && Build.VERSION.SDK_INT >= 23) {
                String[] strArr = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE", "android.permission.INTERNET"};
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < strArr.length; i++) {
                    if (activity.checkSelfPermission(strArr[i]) != 0) {
                        arrayList.add(strArr[i]);
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                activity.requestPermissions((String[]) arrayList.toArray(new String[arrayList.size()]), 100);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static Application context() {
        return get().c;
    }

    public static String d(File file) throws NoSuchAlgorithmException {
        int i;
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int i2 = fileInputStream.read(bArr);
                if (i2 <= 0) {
                    break;
                }
                messageDigest.update(bArr, 0, i2);
            }
            fileInputStream.close();
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(Integer.toString((b & 255) + 256, 16).substring(1));
            }
            return sb.toString();
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public static void e(InputStream inputStream, String str) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return;
            }
            SpiderDebug.log(str + "  " + line);
        }
    }

    public static void execute(Runnable runnable) {
        get().a.execute(runnable);
    }

    public static Init get() {
        return Loader.a;
    }

    public static Activity getActivity() throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException {
        Class<?> cls = Class.forName("android.app.ActivityThread");
        Object objInvoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
        Field declaredField = cls.getDeclaredField("mActivities");
        declaredField.setAccessible(true);
        for (Object obj : ((Map) declaredField.get(objInvoke)).values()) {
            Class<?> cls2 = obj.getClass();
            Field declaredField2 = cls2.getDeclaredField("paused");
            declaredField2.setAccessible(true);
            if (!declaredField2.getBoolean(obj)) {
                Field declaredField3 = cls2.getDeclaredField("activity");
                declaredField3.setAccessible(true);
                return (Activity) declaredField3.get(obj);
            }
        }
        return null;
    }

    public static Activity getConfigActivity() {
        Class<?> cls = Class.forName("android.app.ActivityThread");
        Object objInvoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
        Field declaredField = cls.getDeclaredField("mActivities");
        declaredField.setAccessible(true);
        Iterator it = ((Map) declaredField.get(objInvoke)).values().iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        Field declaredField2 = next.getClass().getDeclaredField("activity");
        declaredField2.setAccessible(true);
        return (Activity) declaredField2.get(next);
    }

    public static Map<String, Boolean> getKeywordsMap() {
        return e;
    }

    public static InputStream i(String str) {
        InputStream inputStreamByteStream = null;
        try {
            Response responseC = C0575b.c(str);
            int iCode = responseC.code();
            if (iCode == 200) {
                inputStreamByteStream = responseC.body().byteStream();
            } else {
                SpiderDebug.log("Failed to download file. ServerStart returned HTTP response code: " + iCode);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return inputStreamByteStream;
    }

    public static void init(Context context) {
        String packageName = context.getPackageName();
        if (!("," + C0592a.a("CiH7mT8Z5SsWtxVyK0yesTJ7LhJ9/GNlP/hj8RNMTpFQmv7rLktoFkd+dOJadCK6WnE30Llr1P3Rg+X/zW/sG6FtW0jmb/89mN9Sb54TIGCN90OLlWCl698hcj08J8lBV7EJYKWMwCab3PzJaaHUkuMdwo2ONbV0WnABqAD1t3vq60Juy1geAbhFOhyJy8r1EN7PpCLFpb2hOqFGB//Vc/AgR6SU1sxDlzVsEWyv8dk/Hgy89WrfxMTd9gYKYHV/Sr/frus6/u2AtVYua7717pknFHWxG94MriWMehYJiHqWg6+Bzbhj3dkBURzi1v7ByHMrBWGnS4I9lgZEBA2wn1EBYD2wZLozrVHC+GAig37NteUzDS6lvB4oDH4+xlwep2q2yyTmWtkH9b7mguZ9nylD6Ql/Su0lbtpcqw1a2zeIxzNqaP2YZWcHs8ExDeEZTgu20DyfboPRy9qo+FzjVYp1ol1/5ozSbf52QWYWI4Penhhze7fa8g0q+Afm+pXHp/natSd5QuOCeYr4CXO9Mfw150a8cmwhTxUq6AZNWzS7qcekqhOHyo+ari8JPC/Fz6/DP7rnVuFartdnaHnMVJi4PkRr2ppB4Cqc0jsP1X5oivW/riI2980ekPnSqO8I0yPIDhSSNN+6mp2KQXLOe1wxEH/hyfYTM8GaTFw0JXNdIlPMWtfHFdocIl/hGpZTiM07mKtK8ceFrqq+3s7e+OS6kKa+Nr1Vqo8j6T6jol1kWLVs/EUKsFfL+ITiWD7p0Z7vmbPeO2XXXR93FtIid3lmZWt/vN93Ss+zySIEX5FLc2P4yxxv5l7jUPvaB2RsGeO1jzVcqSf7Z4u27yGtZYggET7AQYW8jHoqI7z/1VO5t3XRgTBUkvx3kW+YyGE89Gd7fz/N9JcxWOkbki5C+NP6U1jGVTJwMsL6/WVh//LDL8IVGpNUXSH61w+gJFAI1K1nEne/Q8WvSWh89kRZ5dhEtDrdhRjsr2eX4jeYyk2WSehcpxPlXUthzCRzg8W/DjITsFnVk1+MW2WMtVu9zw==", "1234123412341234", "1234123412341234") + ",").contains("," + packageName + ",")) {
            SpiderDebug.log("包名不匹配，当前包名: " + packageName);
            try {
                get().c = (Application) context;
                C0590I.i(C0592a.a("RHA7lHjpplyycuj0NAJBAUugiGCn3lZ670ML0Sehq1Tad0e+9iFnsNWwNZvyA7zAMFC/2cTVlyIrkC8MEDYL2F7iOUm50oeQWqygHI1HJ4A24Eg78wxb/0HG7wQS0SonKGjl/90/oBfNsSSJIzoIcluHOQF0arbEizGS6dmfE69RFB4/vuf9TOrFB3XEyvIU", "1234123412341234", "1234123412341234"));
                new Thread(new Runnable() { // from class: com.github.catvod.spider.Init.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            Thread.sleep(5000L);
                        } catch (InterruptedException e2) {
                            e2.printStackTrace();
                        }
                        Process.killProcess(Process.myPid());
                    }
                }).start();
                return;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        try {
            get().c = (Application) context;
            saveConfig();
            replaceCloudDiskNames();
            startFloatBall();
            if (context.checkCallingOrSelfPermission("android.permission.INTERNET") != 0) {
                SpiderDebug.log("缺少INTERNET权限，无法执行网络操作");
                return;
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                C0590I.i("网络不可用，请检查连接");
                return;
            }
            SpiderDebug.log("网络连接正常，启动所有网络任务");
            startGoProxy(context);
            new Thread(new Runnable() { // from class: com.github.catvod.spider.merge.A.aa
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        QuarkPan.checkquarkcookie();
                        QuarkPan.deletetime();
                        QuarkPan.checktime();
                    } catch (Throwable th) {
                        PrintStream printStream = System.out;
                        StringBuilder sbA = C0529a.a("捕获到异常: ");
                        sbA.append(th.getMessage());
                        printStream.println(sbA.toString());
                    }
                }
            }).start();
            new Thread(new Runnable() { // from class: com.github.catvod.spider.merge.A.ab
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        UCPan.checkuccookie();
                        UCPan.deletetime();
                        UCPan.checktime();
                    } catch (Throwable th) {
                        PrintStream printStream = System.out;
                        StringBuilder sbA = C0529a.a("捕获到异常: ");
                        sbA.append(th.getMessage());
                        printStream.println(sbA.toString());
                    }
                }
            }).start();
            new Thread(new Runnable() { // from class: com.github.catvod.spider.Init.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Init.a();
                    } catch (Exception e3) {
                        e3.printStackTrace();
                        SpiderDebug.log("Init.a()执行失败");
                    }
                }
            }).start();
            new Thread(new UP(context)).start();
        } catch (Exception e3) {
            e3.printStackTrace();
            SpiderDebug.log("初始化异常: ");
            SpiderDebug.log(e3.getMessage());
        }
    }

    public static void interceptActivityStart() throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException {
        Class<?> cls = Class.forName("android.app.ActivityThread");
        Object objInvoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
        Field declaredField = cls.getDeclaredField("mActivities");
        declaredField.setAccessible(true);
        for (Object obj : ((Map) declaredField.get(objInvoke)).values()) {
            Field declaredField2 = obj.getClass().getDeclaredField("activity");
            declaredField2.setAccessible(true);
            Activity activity = (Activity) declaredField2.get(obj);
            if (activity != null) {
                ComponentName componentName = activity.getComponentName();
                if (componentName.getClassName().contains("Video") || componentName.getClassName().contains("Detail")) {
                    activity.finish();
                }
            }
        }
    }

    public static void post(Runnable runnable) {
        get().b.post(runnable);
    }

    public static void replaceCloudDiskNames() {
        File fileC = C0602k.c("/config.json");
        String strA = C0602k.a(fileC);
        if (strA == null) {
            return;
        }
        C0602k.c(fileC, strA.replace("\"danmu\"", "\"danmuColor\"").replace("\"block\"", "\"panBlock\"").replace("\"PanSouURL\"", "\"pansouUrl\"").replace("\"pansouURL\"", "\"pansouUrl\"").replace("\"multi\"", "\"proxyMode\"").replace("夸克云盘", "夸克网盘").replace("UC云盘", "UC网盘").replace("百度云盘", "百度网盘"));
    }

    public static void run(Runnable runnable) {
        get().b.post(runnable);
    }

    public static void run(Runnable runnable, int i) {
        get().b.postDelayed(runnable, i);
    }

    private static void saveConfig() throws Exception {
        File fileC = C0602k.c("/config.json");
        String strA = C0602k.a(fileC);
        if ((!fileC.exists() || fileC.length() <= 0 || strA.isEmpty()) ? true : !new JsonParser().parse("{\"version\":\"25.0\",\"update\":\"关闭\",\"danmuColor\":\"默认\",\"aliHD\":\"阿里原画\",\"quarkHD\":\"夸克原画\",\"ucHD\":\"UC原画\",\"panBlock\":\"\",\"proxyMode\":\"Go多线程\",\"pansouUrl\":\"https://so.252035.xyz\",\"panOrder\":\"百度,夸克,UC,天翼,123,阿里,移动\",\"homePage\":\"热门电影,热播剧集,热门动漫,热播综艺,电影筛选,电视筛选,电影榜单,电视剧榜单\",\"aliThread\":\"64\",\"quarkThread\":\"16\",\"ucThread\":\"自动\"}").getAsJsonObject().get("version").getAsString().equals(new JsonParser().parse(strA).getAsJsonObject().get("version").getAsString())) {
            if (fileC.exists() && fileC.length() > 0) {
                String strA2 = C0602k.a(fileC);
                if (!strA2.isEmpty()) {
                    JsonObject asJsonObject = new JsonParser().parse(strA2).getAsJsonObject();
                    for (Map.Entry entry : new JsonParser().parse("{\"version\":\"25.0\",\"update\":\"关闭\",\"danmuColor\":\"默认\",\"aliHD\":\"阿里原画\",\"quarkHD\":\"夸克原画\",\"ucHD\":\"UC原画\",\"panBlock\":\"\",\"proxyMode\":\"Go多线程\",\"pansouUrl\":\"https://so.252035.xyz\",\"panOrder\":\"百度,夸克,UC,天翼,123,阿里,移动\",\"homePage\":\"热门电影,热播剧集,热门动漫,热播综艺,电影筛选,电视筛选,电影榜单,电视剧榜单\",\"aliThread\":\"64\",\"quarkThread\":\"16\",\"ucThread\":\"自动\"}").getAsJsonObject().entrySet()) {
                        String str = (String) entry.getKey();
                        if (!asJsonObject.has(str)) {
                            asJsonObject.add(str, (JsonElement) entry.getValue());
                        }
                    }
                    asJsonObject.addProperty("version", "25.0");
                    C0602k.c(fileC, new Gson().toJson(asJsonObject));
                    return;
                }
            }
            C0602k.c(fileC, "{\"version\":\"25.0\",\"update\":\"关闭\",\"danmuColor\":\"默认\",\"aliHD\":\"阿里原画\",\"quarkHD\":\"夸克原画\",\"ucHD\":\"UC原画\",\"panBlock\":\"\",\"proxyMode\":\"Go多线程\",\"pansouUrl\":\"https://so.252035.xyz\",\"panOrder\":\"百度,夸克,UC,天翼,123,阿里,移动\",\"homePage\":\"热门电影,热播剧集,热门动漫,热播综艺,电影筛选,电视筛选,电影榜单,电视剧榜单\",\"aliThread\":\"64\",\"quarkThread\":\"16\",\"ucThread\":\"自动\"}");
        }
    }

    public static void startFloatBall() {
        try {
            C0120y.a().b(get().c);
        } catch (Exception e2) {
            SpiderDebug.log("startFloatBall err: " + e2.getMessage());
        }
    }

    public static void startGoProxy(Context context) {
        if (context.getApplicationContext().getApplicationInfo().targetSdkVersion < 29) {
            new Thread(new Runnable() { // from class: com.github.catvod.spider.Init.1
                private void a(File file) {
                    SpiderDebug.log("正在启动代理程序...");
                    try {
                        Runtime.getRuntime().exec("pkill -f " + file.getName()).waitFor();
                        SpiderDebug.log("已尝试杀掉旧进程");
                        Thread.sleep(200L);
                    } catch (Exception e2) {
                        SpiderDebug.log("杀掉旧进程时出错");
                        e2.printStackTrace();
                    }
                    try {
                        Runtime.getRuntime().exec("chmod 755 " + file.getAbsolutePath()).waitFor();
                        SpiderDebug.log("已设置文件权限为755");
                    } catch (Exception unused) {
                    }
                    String absolutePath = file.getAbsolutePath();
                    try {
                        SpiderDebug.log("启动: " + absolutePath + " -port 1314");
                        Process processExec = Runtime.getRuntime().exec(absolutePath + " -port 1314");
                        Thread.sleep(1000L);
                        try {
                            int iExitValue = processExec.exitValue();
                            if (iExitValue == 0) {
                                SpiderDebug.log("代理程序执行完成（正常退出）");
                                return;
                            }
                            SpiderDebug.log("代理程序异常退出，错误码: " + iExitValue);
                        } catch (IllegalThreadStateException unused2) {
                            SpiderDebug.log("代理程序启动成功（后台运行中）");
                        }
                    } catch (Exception e3) {
                        SpiderDebug.log("启动代理程序时出错");
                        e3.printStackTrace();
                    }
                }

                @Override // java.lang.Runnable
                public void run() throws NoSuchAlgorithmException, IOException {
                    String[] strArr = new String[0];
                    if (Build.VERSION.SDK_INT >= 21) {
                        strArr = Build.SUPPORTED_ABIS;
                    }
                    String string = Arrays.toString(strArr);
                    String str = string.contains("x86") ? "pvideo-x86_64" : string.contains("arm64") ? "pvideo-arm64-v8a" : "pvideo-armeabi-v7a";
                    File file = new File(Init.context().getFilesDir().getAbsolutePath() + "/" + str);
                    SpiderDebug.log("开始检查本地文件...");
                    SpiderDebug.log("开始下载JSON配置获取下载链接和MD5...");
                    try {
                        try {
                            JSONObject jSONObject = new JSONObject(C0575b.l("https://pizazz.s3.bitiful.net/pvideo.json", null));
                            String string2 = jSONObject.getString(str);
                            SpiderDebug.log("从JSON获取到的下载链接: " + string2);
                            String string3 = jSONObject.getString(str + ".md5");
                            SpiderDebug.log("从JSON获取到的MD5: " + string3);
                            if (file.exists()) {
                                SpiderDebug.log("计算本地文件MD5...");
                                String strD = Init.d(file);
                                SpiderDebug.log("本地文件MD5: " + strD);
                                SpiderDebug.log("期望MD5(从JSON获取): " + string3);
                                if (string3.equals(strD)) {
                                    SpiderDebug.log("本地文件MD5校验通过，直接执行");
                                    a(file);
                                    return;
                                }
                            }
                            SpiderDebug.log("本地文件MD5不匹配或文件不存在，需要下载最新文件...");
                            if (file.exists()) {
                                if (!file.delete()) {
                                    SpiderDebug.log("无法删除已存在的文件，可能是文件被占用或无权限");
                                    return;
                                }
                                SpiderDebug.log("已删除旧文件，准备下载新文件");
                            }
                            Init.write(file, Init.i(string2));
                            file.setExecutable(true);
                            SpiderDebug.log("文件下载完成，开始校验从JSON获取的MD5...");
                            if (string3.equals(Init.d(file))) {
                                SpiderDebug.log("文件下载并校验成功");
                                a(file);
                            } else {
                                SpiderDebug.log("文件校验失败！下载的文件MD5与JSON中的MD5不匹配");
                                file.delete();
                            }
                        } catch (JSONException e2) {
                            SpiderDebug.log("JSON解析错误，无法获取MD5或下载链接");
                            e2.printStackTrace();
                        } catch (Exception e3) {
                            SpiderDebug.log("网络请求失败");
                            e3.printStackTrace();
                        }
                    } catch (Exception e4) {
                        SpiderDebug.log("网络请求失败，无法获取JSON配置");
                        e4.printStackTrace();
                    }
                }
            }).start();
        }
    }

    public static void write(File file, InputStream inputStream) throws IOException {
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] bArr = new byte[65536];
        while (true) {
            int i = inputStream.read(bArr);
            if (i <= 0) {
                fileOutputStream.close();
                inputStream.close();
                return;
            }
            fileOutputStream.write(bArr, 0, i);
        }
    }
}
