package com.github.catvod.spider.merge.I;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.concurrent.ThreadLocalRandom;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class r {
    private static final OkHttpClient a = new OkHttpClient();

    public static String a() {
        return ((JsonObject) new Gson().fromJson(a.newCall(new Request.Builder().url("http://api.extscreen.com/timestamp").build()).execute().body().string(), JsonObject.class)).getAsJsonObject("data").get("timestamp").getAsString();
    }

    public static JsonObject b(String str, String str2, String str3, String str4) {
        TreeMap treeMap = new TreeMap();
        treeMap.put("akv", "2.8.1496");
        treeMap.put("apv", "1.3.8");
        treeMap.put("b", "samsung");
        treeMap.put("d", str3);
        treeMap.put("m", "SM-S908E");
        treeMap.put("mac", "");
        treeMap.put("n", "SM-S908E");
        treeMap.put("t", str2);
        treeMap.put("wifiMac", str4);
        Request.Builder builderPost = new Request.Builder().url("http://api.extscreen.com/aliyundrive/v3/token").post(new FormBody.Builder().add("code", str).build());
        HashMap mapB = com.github.catvod.spider.merge.B.e.b("token", "6733b42e28cdba32", "User-Agent", "Mozilla/5.0 (Linux; U; Android 9; zh-cn; SM-S908E Build/TP1A.220624.014) AppleWebKit/533.1 (KHTML, like Gecko) Mobile Safari/533.1");
        mapB.put("Host", "api.extscreen.com");
        mapB.putAll(treeMap);
        return (JsonObject) new Gson().fromJson(a.newCall(builderPost.headers(Headers.of(mapB)).build()).execute().body().string(), JsonObject.class);
    }

    public static String c() {
        return String.valueOf(ThreadLocalRandom.current().nextLong(100000000000L, 1000000000000L));
    }
}
