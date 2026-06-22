package com.github.catvod.spider.merge.l0;

import java.security.SecureRandom;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.l0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1294a {
    public static String a() {
        return b(16);
    }

    private static String b(int i) {
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder sb = new StringBuilder(i);
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(secureRandom.nextInt(64)));
        }
        return sb.toString();
    }

    public static String c() {
        return b(12);
    }

    public static JSONObject d(String str, String str2, String str3) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cpn", str);
        jSONObject.put("contentCheckOk", true);
        jSONObject.put("racyCheckOk", true);
        jSONObject.put("videoId", str3);
        jSONObject.put("disablePlayerResponse", false);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        jSONObject3.put("internalExperimentFlags", new JSONArray());
        jSONObject4.put("androidSdkVersion", 35);
        jSONObject4.put("utcOffsetMinutes", 0);
        jSONObject4.put("osVersion", "15");
        jSONObject4.put("hl", "en-GB");
        jSONObject4.put("clientName", "ANDROID");
        jSONObject4.put("gl", "GB");
        jSONObject4.put("clientScreen", "WATCH");
        jSONObject4.put("clientVersion", "19.28.35");
        jSONObject4.put("osName", "Android");
        jSONObject4.put("platform", "MOBILE");
        jSONObject4.put("visitorData", str2);
        jSONObject5.put("lockedSafetyMode", false);
        jSONObject2.put("request", jSONObject3);
        jSONObject2.put("client", jSONObject4);
        jSONObject2.put("user", jSONObject5);
        jSONObject6.put("videoId", str3);
        jSONObject.put("context", jSONObject2);
        jSONObject.put("playerRequest", jSONObject6);
        return jSONObject;
    }
}
