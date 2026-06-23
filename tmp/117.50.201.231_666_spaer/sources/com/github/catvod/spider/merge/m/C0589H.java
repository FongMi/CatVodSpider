package com.github.catvod.spider.merge.m;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.widget.Toast;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.k.C0575b;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.m.H, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0589H {
    private static File a;
    private static File b;
    private static JSONObject c;

    public static void backupsConfig() {
        C0602k.c(C0602k.c("./config.json"), new JSONObject("{\"version\":\"25.0\",\"update\":\"关闭\",\"danmuColor\":\"默认\",\"aliHD\":\"阿里原画\",\"quarkHD\":\"夸克原画\",\"ucHD\":\"UC原画\",\"panBlock\":\"\",\"proxyMode\":\"Go多线程\",\"pansouUrl\":\"https://so.252035.xyz\",\"panOrder\":\"百度,夸克,UC,天翼,123,阿里,移动\",\"homePage\":\"热门电影,热播剧集,热门动漫,热播综艺,电影筛选,电视筛选,电影榜单,电视剧榜单\",\"aliThread\":\"64\",\"quarkThread\":\"16\",\"ucThread\":\"自动\"}").toString());
        SpiderDebug.log("Config files updated successfully");
        new Handler(Looper.getMainLooper()).post(new HH$1(Init.context()));
    }

    @Throws({Exception.class})
    public static void goProxy() throws JSONException, IOException {
        final Application applicationContext = Init.context();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.github.catvod.spider.merge.m.H.2
            @Override // java.lang.Runnable
            public void run() {
                Toast.makeText(applicationContext, "正在下载GO，下载完成后应用会自动重启。", 1).show();
            }
        });
        SpiderDebug.log("正在下载代理文件...");
        String[] strArr = new String[0];
        if (Build.VERSION.SDK_INT >= 21) {
            strArr = Build.SUPPORTED_ABIS;
        }
        String string = Arrays.toString(strArr);
        String str = string.contains("x86") ? "pvideo-x86_64" : string.contains("arm64") ? "pvideo-arm64-v8a" : "pvideo-armeabi-v7a";
        try {
            String strL = C0575b.l("https://pizazz.s3.bitiful.net/pvideo.json", null);
            SpiderDebug.log("配置文件下载成功");
            JSONObject jSONObject = new JSONObject(strL);
            File file = new File(Init.context().getFilesDir().getAbsolutePath() + "/" + str);
            if (file.exists() && file.delete()) {
                SpiderDebug.log("已删除旧文件");
            }
            String str2 = str;
            if (!jSONObject.has(str2)) {
                SpiderDebug.log("配置文件中不存在该架构的文件: " + str);
                return;
            }
            String string2 = jSONObject.getString(str2);
            if (string2 == null || string2.isEmpty()) {
                SpiderDebug.log("文件URL为空");
            } else {
                SpiderDebug.log("开始下载文件: " + str);
                Init.write(file, Init.i(string2));
            }
            if (file.exists()) {
                file.setExecutable(true);
                SpiderDebug.log("文件下载完成，准备重启");
            } else {
                SpiderDebug.log("文件下载失败: 文件不存在");
            }
            final Application applicationContext2 = Init.context();
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.github.catvod.spider.merge.m.H.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Thread.sleep(3000L);
                    } catch (InterruptedException unused) {
                    }
                    try {
                        Context context = applicationContext2;
                        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                        launchIntentForPackage.addFlags(268468224);
                        context.startActivity(launchIntentForPackage);
                        Thread.sleep(200L);
                        Process.killProcess(Process.myPid());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        } catch (Exception e) {
            SpiderDebug.log("下载配置文件失败: " + e.getMessage());
        }
    }

    public static void toggleUpdateCheck() {
        String str;
        File fileC = C0602k.c("config.json");
        JsonObject jsonObject = new JsonObject();
        if (fileC.exists()) {
            jsonObject = new JsonParser().parse(C0602k.a(fileC)).getAsJsonObject();
        }
        if ("true".equals(jsonObject.has("update") ? jsonObject.get("update").getAsString() : "true")) {
            str = "检查更新已关闭";
            jsonObject.addProperty("update", "false");
        } else {
            str = "检查更新已开启";
            jsonObject.addProperty("update", "true");
        }
        C0602k.c(fileC, jsonObject.toString());
        C0590I.i(str);
        SpiderDebug.log("配置已更新: " + jsonObject.toString());
    }
}
