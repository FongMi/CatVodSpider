package com.github.catvod.spider;

import android.Manifest;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.github.catvod.crawler.SpiderDebug;
import com.orhanobut.logger.BuildConfig;

import java.io.*;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Init {

    private final ExecutorService executor;
    private final Handler handler;
    private Application app;

    private volatile Socket healthSocket;
    private volatile boolean isRunning = false;
    private volatile Thread healthCheckThread;
    private static final int HEALTH_PORT = 5575;
    private static final String HEALTH_PATH = "/health";
    private static final int HEALTH_TIMEOUT = 3000; // 3秒超时
    private static final long HEALTH_INTERVAL = 1000; // 1秒间隔


    private static class Loader {
        static volatile Init INSTANCE = new Init();
    }

    public static Init get() {
        return Loader.INSTANCE;
    }

    public Init() {
        this.handler = new Handler(Looper.getMainLooper());
        this.executor = Executors.newFixedThreadPool(5);
    }

    public static Application context() {
        return get().app;
    }

    public static void init(Context context) {
        get().app = ((Application) context);
        Proxy.init();

        initGoProxy(context);

        DanmakuSpider.log("打包时间： 2026-01-03 09:51");

        DanmakuSpider.doInitWork(context,"");

        // 启动Hook监控
        DanmakuScanner.startHookMonitor();
        DanmakuSpider.log("Leo弹幕监控已启动");
    }

    private static void initGoProxy(Context context) {
        SpiderDebug.log("自定義爬蟲代碼載入成功！");

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            get().handler.post(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(context, "安卓版本过低，无法启动goProxy", Toast.LENGTH_SHORT).show();
                }
            });

            return;
        }

        List<String> abs = Arrays.asList(Build.SUPPORTED_ABIS);
        execute(new Runnable() {
            @Override
            public void run() {
                try {
                    //x86_64, arm64-v8a, x86, armeabi-v7a, armeabi
                    String goProxy = abs.contains("arm64-v8a") ? "goProxy-arm64" : "goProxy-arm";
//                String goProxy = abs.contains("arm64-v8a") ? "Omnibox-arm64" : "Omnibox-arm";
                    File file = new File(context.getCacheDir(), goProxy);

                    Process exec = Runtime.getRuntime().exec("/system/bin/sh");
                    try (DataOutputStream dos = new DataOutputStream(exec.getOutputStream())) {
                        if (!file.exists()) {
                            if (!file.createNewFile()) {
                                throw new Exception("创建文件失败 " + file);
                            }

                            try (FileOutputStream fos = new FileOutputStream(file)) {
                                try (InputStream is = Objects.requireNonNull(get().getClass().getClassLoader()).getResourceAsStream("assets/" + goProxy)) {
                                    int read;
                                    byte[] buffer = new byte[8192];
                                    while ((read = is.read(buffer)) != -1) fos.write(buffer, 0, read);
                                }
                            }

                            if (!file.setExecutable(true)) {
                                throw new Exception(goProxy + " setExecutable is false");
                            }

                            dos.writeBytes("chmod 777 " + file.getAbsolutePath() + "\n");
                            dos.flush();
                        }

                        SpiderDebug.log("启动 " + file);
                        get().handler.post(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(context, "加载：" + goProxy, Toast.LENGTH_SHORT).show();
                            }
                        });
                        dos.writeBytes("kill $(ps -ef | grep '" + goProxy + "' | grep -v grep | awk '{print $2}')\n");
                        dos.flush();

                        dos.writeBytes("nohup " + file.getAbsolutePath() + "\n");
                        dos.flush();

                        dos.writeBytes("exit\n");
                        dos.flush();
                    }

                    try (InputStream is = exec.getInputStream()) {
                        log(is, "input");
                    }
                    try (InputStream is = exec.getErrorStream()) {
                        log(is, "err");
                    }
                    SpiderDebug.log("exe ret " + exec.waitFor());

                    // 启动心跳检查
//                get().startHealthCheck(context, goProxy, abs);

                } catch (Exception ex) {
                    SpiderDebug.log("启动 goProxy异常：" + ex.getMessage());
                    get().handler.post(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(context, abs + "启动 goProxy异常：" + ex.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
        });
    }

    // 在 Init 类中添加以下方法
    // 替换原有的 startHealthCheck 方法
    private void startHealthCheck(Context context, String goProxy, List<String> abs) {
        if (isRunning) {
            return; // 已经在运行心跳检查
        }

        isRunning = true;

        // 创建长连接心跳检查线程
        healthCheckThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (isRunning) {
                    try {
                        // 建立长连接
                        if (healthSocket == null || healthSocket.isClosed() || !healthSocket.isConnected()) {
                            healthSocket = new Socket();
                            healthSocket.connect(new InetSocketAddress("127.0.0.1", HEALTH_PORT), HEALTH_TIMEOUT);
                            SpiderDebug.log("Health check connection established");
                        }

                        // 发送心跳请求
                        if (healthSocket.isConnected()) {
                            // 发送HTTP GET请求到 /health 端点
                            String request = "GET " + HEALTH_PATH + " HTTP/1.1\r\n" +
                                    "Host: 127.0.0.1:" + HEALTH_PORT + "\r\n" +
                                    "Connection: keep-alive\r\n" +
                                    "\r\n";

                            healthSocket.getOutputStream().write(request.getBytes());
                            healthSocket.getOutputStream().flush();

                            // 读取响应
                            byte[] buffer = new byte[1024];
                            int bytesRead = healthSocket.getInputStream().read(buffer);
                            String response = new String(buffer, 0, bytesRead);

                            // 检查响应状态
                            if (!response.contains("200 OK")) {
                                SpiderDebug.log("Health check failed, response: " + response);
                                closeHealthSocket();
                                restartGoProxy(context, goProxy, abs);
                            } else {
                                SpiderDebug.log("Health check OK");
                            }
                        }

                        Thread.sleep(HEALTH_INTERVAL);
                    } catch (Exception e) {
                        SpiderDebug.log("Error during health check: " + e.getMessage());
                        closeHealthSocket();
                        try {
                            Thread.sleep(HEALTH_INTERVAL);
                        } catch (InterruptedException ie) {
                            break;
                        }
                    }
                }

                // 清理资源
                closeHealthSocket();
            }
        });

        healthCheckThread.start();
    }

    // 添加关闭健康检查连接的方法
    private void closeHealthSocket() {
        try {
            if (healthSocket != null && !healthSocket.isClosed()) {
                healthSocket.close();
            }
        } catch (IOException e) {
            SpiderDebug.log("Error closing health socket: " + e.getMessage());
        } finally {
            healthSocket = null;
        }
    }

    // 添加停止心跳检查的方法
    public static void stopHealthCheck() {
        Init instance = get();
        instance.isRunning = false;
        if (instance.healthCheckThread != null && instance.healthCheckThread.isAlive()) {
            instance.healthCheckThread.interrupt();
        }
        instance.closeHealthSocket();
    }


    // 修改 restartGoProxy 方法，确保在重启前关闭健康检查连接
    private void restartGoProxy(Context context, String goProxy, List<String> abs) {
        try {
            // 关闭当前健康检查连接
            closeHealthSocket();

            // 杀死现有的 goProxy 进程
            Process killProcess = Runtime.getRuntime().exec("/system/bin/sh");
            try (DataOutputStream dos = new DataOutputStream(killProcess.getOutputStream())) {
                dos.writeBytes("kill $(ps -ef | grep '" + goProxy + "' | grep -v grep | awk '{print $2}')\n");
                dos.flush();
                dos.writeBytes("exit\n");
                dos.flush();
            }
            killProcess.waitFor();

            // 重新启动 goProxy
            File file = new File(context.getCacheDir(), goProxy);
            Process exec = Runtime.getRuntime().exec("/system/bin/sh");
            try (DataOutputStream dos = new DataOutputStream(exec.getOutputStream())) {
                SpiderDebug.log("启动 " + file);
                get().handler.post(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(context, "加载：" + goProxy, Toast.LENGTH_SHORT).show();
                    }
                });
                dos.writeBytes("kill $(ps -ef | grep '" + goProxy + "' | grep -v grep | awk '{print $2}')\n");
                dos.flush();

                dos.writeBytes("nohup " + file.getAbsolutePath() + "\n");
                dos.flush();

                dos.writeBytes("exit\n");
                dos.flush();
            }

            // 等待一段时间让服务启动
            Thread.sleep(2000);

            SpiderDebug.log("goProxy restarted successfully");
        } catch (Exception e) {
            SpiderDebug.log("Failed to restart goProxy: " + e.getMessage());
            get().handler.post(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(context, abs + "重启 goProxy 失败：" + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    public static void log(InputStream stream, String type) throws IOException {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT) {
            return;
        }

        try (InputStreamReader isr = new InputStreamReader(stream, StandardCharsets.UTF_8)) {
            try (BufferedReader br = new BufferedReader(isr)) {
                String readLine;
                while ((readLine = br.readLine()) != null) {
                    SpiderDebug.log(type + ": " + readLine);
                }
            }
        }
    }

    public static void execute(Runnable runnable) {
        get().executor.execute(runnable);
    }

    public static void run(Runnable runnable) {
        get().handler.post(runnable);
    }

    public static void run(Runnable runnable, int delay) {
        get().handler.postDelayed(runnable, delay);
    }

    public static void checkPermission() {
        try {
            Activity activity = Init.getActivity();
            if (activity == null || Build.VERSION.SDK_INT < Build.VERSION_CODES.M) return;
            if (activity.checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED)
                return;
            activity.requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 9999);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Activity getActivity() throws Exception {
        Class<?> activityThreadClass = Class.forName("android.app.ActivityThread");
        Object activityThread = activityThreadClass.getMethod("currentActivityThread").invoke(null);
        Field activitiesField = activityThreadClass.getDeclaredField("mActivities");
        activitiesField.setAccessible(true);
        Map<?, ?> activities = (Map<?, ?>) activitiesField.get(activityThread);
        for (Object activityRecord : activities.values()) {
            Class<?> activityRecordClass = activityRecord.getClass();
            Field pausedField = activityRecordClass.getDeclaredField("paused");
            pausedField.setAccessible(true);
            if (!pausedField.getBoolean(activityRecord)) {
                Field activityField = activityRecordClass.getDeclaredField("activity");
                activityField.setAccessible(true);
                Activity activity = (Activity) activityField.get(activityRecord);
                SpiderDebug.log(activity.getComponentName().getClassName());
                return activity;
            }
        }
        return null;
    }

    public static void post(Runnable runnable) {
        get().handler.post(runnable);
    }

    public static void post(Runnable runnable, int delay) {
        get().handler.postDelayed(runnable, delay);
    }
}
