package com.github.catvod.spider;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.*;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.merge.I.*;
import com.github.catvod.spider.merge.g0.RunnableC1210f;
import com.github.catvod.spider.merge.g0.RunnableC1214j;

import com.github.catvod.utils.server.ServerStart;
import org.json.JSONObject;

import java.io.*;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class Init {
    private static String libStubPath = "";
    public static String goProxyBinary = "";
    public static String singBoxBinary = "";
    public static String extraBinary = "";
    public static String allinOneBinary = "";
    public static String tgSouGoBinary = "";
    public static String alistBinary = "";
    public static String fileBrowserBinary = "";
    public Application application;
    public String baseUrl = "";
    public String proxyUrl = "";
    public final AtomicBoolean isRunning = new AtomicBoolean(false);
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    public final ExecutorService threadPool = Executors.newFixedThreadPool(5);

    class AnonymousClass1 extends WebViewClient {
        @Override
        public void onLoadResource(WebView webView, String url) {
            if (url.contains(".mp3")) {
                Log.w("Spider", "url:mp4" + url);
                System.out.println("url:mp4" + url);
                throw null;
            }
        }

        @Override
        public void onPageFinished(WebView webView, String url) {
            System.out.println("onPageFinished url:" + url);
            webView.evaluateJavascript("this.localStorage['vid']", new ValueCallback<String>() {
                @Override
                public void onReceiveValue(String value) {
                    if (value == null || value.isEmpty()) {
                        return;
                    }
                    System.out.println("result" + value);
                }
            });
        }

        @Override
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            String requestUrl = webResourceRequest.getUrl().toString();
            SpiderDebug.log("url:" + requestUrl);
            if (!requestUrl.contains("mp4")) {
                return null;
            }
            String method = webResourceRequest.getMethod();
            Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
            if ("POST".equalsIgnoreCase(webResourceRequest.getMethod())) {
                try {
                    InputStream responseStream = webView.getContext().getContentResolver().openInputStream(webResourceRequest.getUrl());
                    byte[] buffer = new byte[1024];
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        int bytesRead = responseStream.read(buffer);
                        if (bytesRead == -1) {
                            break;
                        }
                        sb.append(new String(buffer, 0, bytesRead));
                    }
                    responseStream.close();
                    System.out.println("POST Request URL: " + requestUrl);
                    System.out.println("POST Request Body: " + sb.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Request URL: " + requestUrl);
            System.out.println("Request Method: " + method);
            System.out.println("Request Headers: " + requestHeaders);
            return null;
        }
    }

    class Loader {
        static volatile Init instance = new Init();

        private Loader() {
        }
    }

    public static void execTgSou(Init init, boolean showOutput, JSONObject jsonObj) {
        try {
            String binaryName = init.getArchBinary("tgsou-linux", "tgsou-arm64", "tgsou-armV7");
            init.extractBinary(binaryName, new File(context().getFilesDir().getAbsolutePath() + "/" + binaryName));
            String cmd;
            if (jsonObj != null && jsonObj.has("proxy") && (jsonObj.getString("proxy") != null && !jsonObj.getString("proxy".isEmpty())) {
                cmd = "nohup ./" + binaryName + " -proxy " + jsonObj.getString("proxy");
            } else {
                cmd = "nohup ./" + binaryName;
            }
            init.execCommand(binaryName, cmd, "my_tgsou.log", showOutput);
        } catch (Exception e) {
            SpiderDebug.log("Error occurred");
            SpiderDebug.log("extract assets fail");
        }
    }

    public static void execGoProxyFallback(Init init, Context context, boolean showOutput) {
        init.execGoProxy(context, showOutput, "goProxy_arm64");
        String pingResult = OkHttpUtil.string(AliDriveApi.r().c + "/api/ping", new HashMap<>());
        if (pingResult == null || pingResult.isEmpty()) {
            init.execGoProxy(context, showOutput, "goProxy_armV7");
        }
    }

    public static void execAlist(Init init, Boolean enabled) {
        init.getClass();
        try {
            alistBinary = init.getArchBinary("alist-linux", "alist-arm64", "alist-armV7");
            init.extractBinary(alistBinary, new File(context().getFilesDir().getAbsolutePath() + "/" + alistBinary));
            String setAdminCmd = "nohup ./" + alistBinary + " admin set admin";
            String serverCmd = "nohup ./" + alistBinary + " server";
            init.execCommand(alistBinary, setAdminCmd, "my_alist.log", enabled.booleanValue());
            init.execCommand(alistBinary, serverCmd, "my_alist.log", enabled.booleanValue());
        } catch (Exception e) {
            SpiderDebug.log("Error occurred");
            SpiderDebug.log("extract assets fail");
        }
    }

    public static void checkPermission() {
        try {
            Activity activity = getActivity();
            if (activity == null || Build.VERSION.SDK_INT < 23 || activity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                return;
            }
            activity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 9999);
        } catch (Exception e) {
            SpiderDebug.log("Error occurred");
        }
    }

    public static Application context() {
        return get().application;
    }

    public static void execFileBrowser(Init init, Boolean enabled) {
        init.getClass();
        try {
            fileBrowserBinary = init.getArchBinary("filebrowser-linux", "filebrowser-arm64", "filebrowser-armV7");
            File file = new File(context().getFilesDir().getAbsolutePath() + "/" + fileBrowserBinary);
            init.extractBinary(fileBrowserBinary, file);
            init.execCommand(fileBrowserBinary, "HOME=/Users/my_username " + file.getAbsolutePath() + " -a 0.0.0.0 -r /storage/emulated/0", "my_filebrowser.log", enabled.booleanValue());
        } catch (Exception e) {
            SpiderDebug.log("Error occurred");
            SpiderDebug.log("extract assets fail");
        }
    }

    public static void execAllInOne(Init init, Boolean enabled) {
        init.getClass();
        try {
            allinOneBinary = init.getArchBinary("allinone-linux", "allinone-arm64", "allinone-armV7");
            init.extractBinary(allinOneBinary, new File(context().getFilesDir().getAbsolutePath() + "/" + allinOneBinary));
            StringBuilder sb = new StringBuilder();
            sb.append("nohup ./");
            sb.append(allinOneBinary);
            init.execCommand(allinOneBinary, sb.toString(), "my_allinoneutput.log", enabled.booleanValue());
        } catch (Exception e) {
            SpiderDebug.log("Error occurred");
            SpiderDebug.log("extract assets fail");
        }
    }

    public static void execute(Runnable runnable) {
        get().FilterGroup.execute(runnable);
    }

    public static void execTgSouGo(Init init, JSONObject jsonObj, Boolean enabled) {
        String cmd;
        init.getClass();
        try {
            if (new File(context().getFilesDir().getAbsolutePath() + "/tv/.tgsou_api_session").exists()) {
                return;
            }
            tgSouGoBinary = init.getArchBinary("tgsou-go-linux-amd64", "tgsou-go-linux-arm64", "tgsou-go-linux-arm");
            init.extractBinary(tgSouGoBinary, new File(context().getFilesDir().getAbsolutePath() + "/" + tgSouGoBinary));
            if (jsonObj.has("proxy") && (jsonObj.getString("proxy") != null && !jsonObj.getString("proxy".isEmpty())) {
                cmd = "nohup ./" + tgSouGoBinary + " -proxy " + jsonObj.getString("proxy");
            } else {
                cmd = "nohup ./" + tgSouGoBinary;
            }
            init.execCommand(tgSouGoBinary, cmd, "my_tgsou-go.log", enabled.booleanValue());
        } catch (Exception e) {
            SpiderDebug.log("Error occurred");
            SpiderDebug.log("extract assets fail");
        }
    }

    public static void execSingBox(Init init) {
        init.getClass();
        try {
            if (new File(BaseApi.get().a).exists()) {
                singBoxBinary = init.getArchBinary("sing-box-linux", "sing-box-arm64", "sing-box-armV7");
                init.extractBinary(singBoxBinary, new File(context().getFilesDir().getAbsolutePath() + "/" + singBoxBinary));
                init.execCommand(singBoxBinary, "nohup ./" + singBoxBinary + " run ", "my_singboxoutput.log", true);
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("singbox start fail ");
            sb.append(e.getMessage());
            Log.w("Spider", sb.toString());
        }
    }

    public static Init get() {
        return Loader.instance;
    }

    public static Activity getActivity() throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException {
        Class<?> cls = Class.forName("android.app.ActivityThread");
        Object activityThread = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
        Field activitiesField = cls.getDeclaredField("mActivities");
        activitiesField.setAccessible(true);
        for (Object obj : ((Map) activitiesField.get(activityThread)).values()) {
            Class<?> itemClass = obj.getClass();
            Field pausedField = itemClass.getDeclaredField("paused");
            pausedField.setAccessible(true);
            if (!pausedField.getBoolean(obj)) {
                Field activityField = itemClass.getDeclaredField("activity");
                activityField.setAccessible(true);
                Activity activity = (Activity) activityField.get(obj);
                StringBuilder sb = new StringBuilder("getActivity:");
                sb.append(activity.getComponentName().getClassName());
                SpiderDebug.log(sb.toString());
                return activity;
            }
        }
        return null;
    }

    public static Activity getConfigActivity() throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException {
        Class<?> cls = Class.forName("android.app.ActivityThread");
        Object activityThread = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
        Field activitiesField = cls.getDeclaredField("mActivities");
        activitiesField.setAccessible(true);
        for (Object obj : ((Map) activitiesField.get(activityThread)).values()) {
            Field activityField = obj.getClass().getDeclaredField("activity");
            activityField.setAccessible(true);
            Activity activity = (Activity) activityField.get(obj);
            if (activity.getComponentName().getClassName().contains("Home") || activity.getComponentName().getClassName().contains("Main")) {
                return activity;
            }
        }
        return null;
    }

    private String getArchBinary(String x86Binary, String arm64Binary, String armBinary) {
        String supportedAbis = Arrays.toString(Build.VERSION.SDK_INT >= 21 ? Build.SUPPORTED_ABIS : new String[0]);
        return supportedAbis.contains("x86") ? x86Binary : supportedAbis.contains("arm64") ? arm64Binary : armBinary;
    }

    private void execGoProxy(Context context, boolean showOutput, String binaryName) {
        try {
            if (!(binaryName) != null && !binaryName.isEmpty()) {
                binaryName = getArchBinary("goProxy_linux", "goProxy_arm64", "goProxy_armV7");
            }
            goProxyBinary = binaryName;
            File file = new File(context().getFilesDir().getAbsolutePath() + "/" + goProxyBinary);
            String localPath = context().getFilesDir().getAbsolutePath() + "/tv/lib/goProxy55";
            boolean existsLocally = new File(localPath).exists();
            if (existsLocally) {
                write(file, new FileInputStream(localPath));
                file.setExecutable(true);
            } else {
                extractBinary(goProxyBinary, file);
            }
            String cmd = "nohup " + file.getAbsolutePath() + " --md5=ajdadywekgjjbwdasdasiwqcbbdg";
            if ((this.proxyUrl) != null && !this.proxyUrl.isEmpty()) {
                cmd = cmd + " --proxy=" + this.proxyUrl;
            }
            String fullCmd = cmd + " --appPath=" + context.getPackageResourcePath();
            SpiderDebug.log("goProxy command: " + fullCmd);
            execCommand(goProxyBinary, fullCmd, existsLocally ? "goProxy.log" : "", showOutput);
        } catch (Exception e) {
            SpiderDebug.log("doGoProxy error:" + e);
        }
    }

    public static void init(Context context) {
        get().application = (Application) context;
        SpiderDebug.log("自定義爬蟲代碼載入成功！");
        get().exeLibStub();
        startProxyServer();
        new Thread(RunnableC1210f.f).start();
    }

    public static void interceptActivitySch() {
        Executors.newScheduledThreadPool(1).scheduleWithFixedDelay(RunnableC1214j.g, 1L, 1L, TimeUnit.SECONDS);
    }

    public static void interceptActivityStart() throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException {
        Class<?> cls = Class.forName("android.app.ActivityThread");
        Object activityThread = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
        Field activitiesField = cls.getDeclaredField("mActivities");
        activitiesField.setAccessible(true);
        for (Object obj : ((Map) activitiesField.get(activityThread)).values()) {
            Field activityField = obj.getClass().getDeclaredField("activity");
            activityField.setAccessible(true);
            Activity activity = (Activity) activityField.get(obj);
            if (activity != null) {
                ComponentName componentName = activity.getComponentName();
                if (componentName.getClassName().contains("Video") || componentName.getClassName().contains("Detail")) {
                    activity.finish();
                }
            }
        }
    }

    private void extractBinary(String binaryName, File targetFile) throws NoSuchAlgorithmException, IOException {
        StringBuilder logMsg;
        InputStream fileInputStream;
        String localPath = context().getFilesDir().getAbsolutePath() + "/tv/lib/" + binaryName;
        if (new File(localPath).exists()) {
            fileInputStream = new FileInputStream(localPath);
        } else {
            String remoteUrl = new StringBuilder().append(this.baseUrl).append(binaryName).append("").toString();
            String md5Url = new StringBuilder().append(this.baseUrl).append(binaryName).append(".md5").toString();
            if (targetFile.exists()) {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                FileInputStream fis = new FileInputStream(targetFile);
                try {
                    byte[] buffer = new byte[8192];
                    while (true) {
                        int bytesRead = fis.read(buffer);
                        if (bytesRead <= 0) {
                            break;
                        } else {
                            messageDigest.update(buffer, 0, bytesRead);
                        }
                    }
                    fis.close();
                    byte[] digest = messageDigest.digest();
                    StringBuilder sb = new StringBuilder();
                    for (byte b : digest) {
                        sb.append(Integer.toString((b & 255) + 256, 16).substring(1));
                    }
                    String localMd5 = sb.toString();
                    SpiderDebug.log(binaryName + ":localMd5:" + localMd5);
                    if (OkHttpUtil.string(md5Url, new HashMap<>()).contains(localMd5)) {
                        SpiderDebug.log(binaryName + ":与线上一致:");
                        fileInputStream = new FileInputStream(targetFile);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(binaryName);
                        sb2.append(":重新下载:");
                        sb2.append(localMd5);
                        logMsg = sb2;
                    }
                } catch (Throwable th) {
                    try {
                        fis.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } else {
                logMsg = new StringBuilder(binaryName).append(":不存在:");
            }
            SpiderDebug.log(logMsg.toString());
            fileInputStream = OkHttpUtil.downloadStream(remoteUrl);
        }
        write(targetFile, fileInputStream);
        targetFile.setExecutable(true);
    }

    private void execCommand(String binaryName, String command, String logFile, boolean showOutput) throws InterruptedException, IOException {
        String fullCmd;
        File file = new File(context().getFilesDir().getAbsolutePath() + "/" + binaryName);
        Process process = Runtime.getRuntime().exec("/system/bin/sh\n");
        DataOutputStream outputStream = new DataOutputStream(process.getOutputStream());
        StringBuilder sb = new StringBuilder("cd ");
        sb.append(file.getParent());
        sb.append("\n");
        outputStream.writeBytes(sb.toString());
        outputStream.writeBytes("chmod 777 " + file.getParent() + "\n");
        outputStream.writeBytes("chmod 777 " + file.getAbsolutePath() + "\n");
        boolean hasLogFile = false;
        CharSequence[] logFileArr = {logFile};
        // unused constant removed
        if (!(Array.getLength(logFileArr) == 0)) {
            int idx = 0;
            while (true) {
                if (idx >= 1) {
                    break;
                }
                if ((logFileArr[idx]) == null || logFileArr[idx].isEmpty()) {
                    hasLogFile = true;
                    break;
                }
                idx++;
            }
        }
        if (true ^ hasLogFile) {
            String logPath = context().getFilesDir().getAbsolutePath() + "/tv/log/" + logFile;
            StringBuilder cmdSb = new StringBuilder();
            cmdSb.append("killall -9 ");
            cmdSb.append(binaryName);
            cmdSb.append(";");
            cmdSb.append(command);
            cmdSb.append(" > ");
            fullCmd = cmdSb.append(logPath).append(" 2>&1\n").toString();
        } else {
            fullCmd = "killall -9 " + binaryName + ";" + command + "\n";
        }
        outputStream.writeBytes(fullCmd);
        outputStream.flush();
        outputStream.writeBytes("exit\n");
        outputStream.flush();
        readProcessOutput(process.getInputStream(), "Output", showOutput);
        readProcessOutput(process.getErrorStream(), "Error", showOutput);
        process.waitFor();
    }

    @SuppressLint({"UnsafeDynamicallyLoadedCode"})
    private void loadNativeLib() throws IOException {
        File file = new File(context().getCacheDir().getAbsolutePath() + "/libstub.so" + UUID.randomUUID());
        if (file.exists()) {
            file.delete();
        }
        ClassLoader classLoader = getClass().getClassLoader();
        StringBuilder sb = new StringBuilder("assets/libs/");
        sb.append(libStubPath);
        write(file, classLoader.getResourceAsStream(sb.toString()));
        try {
            SpiderDebug.log(libStubPath + " length:" + file.length());
            System.load(file.getAbsolutePath());
        } catch (Throwable th) {
            SpiderDebug.log(libStubPath + "libstubExtracted error：" + th.getMessage());
            throw th;
        }
    }

    private static void readProcessOutput(InputStream inputStream, String tag, boolean showOutput) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        Subtitle.b(tag, ":");
        while (true) {
            String line = reader.readLine();
            if (line == null) {
                return;
            }
            if (!(line.contains("not found") || line.contains("killall") || line.contains("sing-box") || line.contains("goProxy") || line.contains("Killed"))) {
                SpiderDebug.log(line);
                if (showOutput) {
                    Log.w("Spider", line);
                }
            }
        }
    }

    public static void run(Runnable runnable) {
        get().StringUtils.post(runnable);
    }

    public static void run(Runnable runnable, int delayMs) {
        get().StringUtils.postDelayed(runnable, delayMs);
    }

    public static void show(String message) {
        get().StringUtils.post(new RunnableC0746b0(message, 2));
    }

    public static void startProxyServer() {
        try {
            ServerStart.a().c();
        } catch (Exception e) {
            SpiderDebug.log("ailProxyDanmuServer error");
            Log.w("Spider", "請使用 " + e.getMessage());
            SpiderDebug.log("Error occurred");
        }
    }

    public static void write(File file, InputStream inputStream) throws IOException {
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] buffer = new byte[65536];
                while (true) {
                    int bytesRead = inputStream.read(buffer);
                    if (bytesRead <= 0) {
                        fileOutputStream.close();
                        inputStream.close();
                        return;
                    }
                    fileOutputStream.write(buffer, 0, bytesRead);
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th2;
        }
    }

    public void exeAListProxy(Context context, Boolean enabled) {
        if (context.getApplicationContext().getApplicationInfo().targetSdkVersion >= 29) {
            return;
        }
        this.FilterGroup.execute(new RunnableC0755g(this, enabled, 4));
    }

    public void exeAllInOneProxy(Context context, Boolean enabled) {
        if (context.getApplicationContext().getApplicationInfo().targetSdkVersion >= 29) {
            return;
        }
        this.FilterGroup.execute(new C(this, enabled, 2));
    }

    public void exeFileProxy(Context context, Boolean enabled) {
        if (context.getApplicationContext().getApplicationInfo().targetSdkVersion >= 29) {
            return;
        }
        this.FilterGroup.execute(new RunnableC0747c(this, enabled, 5));
    }

    public void exeGoProxy(final Context context, final boolean showOutput) {
        if (context.getApplicationContext().getApplicationInfo().targetSdkVersion >= 29) {
            return;
        }
        new Thread(new Runnable() {
            @Override
            public final void run() {
                Init.execGoProxyFallback(this.b, context, showOutput);
            }
        }).start();
    }

    public void exeLibStub() {
        try {
            libStubPath = "arm64-v8a/libstub.so";
            loadNativeLib();
        } catch (Throwable unused) {
            libStubPath = "armeabi-v7a/libstub.so";
            try {
                loadNativeLib();
            } catch (Throwable th) {
                Log.w("Spider", libStubPath + " load fail ex" + th.getMessage());
            }
        }
    }

    public void exeSingBoxProxy(Context context) {
        if (context.getApplicationContext().getApplicationInfo().targetSdkVersion >= 29) {
            return;
        }
        this.FilterGroup.execute(new B(this, 5));
    }

    public void exeTgProxy(final boolean showOutput, final JSONObject jsonObj, Context context) {
        if (context.getApplicationContext().getApplicationInfo().targetSdkVersion >= 29) {
            return;
        }
        this.FilterGroup.execute(new Runnable() {
            @Override
            public final void run() {
                Init.execTgSou(this.b, showOutput, jsonObj);
            }
        });
    }

    public void exeTgSouGoProxy(Context context, Boolean enabled, JSONObject jsonObj) {
        if (context.getApplicationContext().getApplicationInfo().targetSdkVersion >= 29) {
            return;
        }
        this.FilterGroup.execute(new RunnableC0750d0(this, jsonObj, enabled, 1));
    }
}
