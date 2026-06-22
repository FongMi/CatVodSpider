package com.github.catvod.spider.merge.bY;

import com.github.catvod.crawler.SpiderDebug;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class y {
    public static String a(String str, String str2) {
        return str + str2;
    }

    public static void b(byte[] bArr, byte[] bArr2, StringBuilder sb, Exception exc) {
        sb.append(com.github.catvod.spider.merge.XI.f.a(bArr, bArr2));
        sb.append(exc);
        SpiderDebug.log(sb.toString());
    }

    public static void c(byte[] bArr, byte[] bArr2, JSONObject jSONObject, JSONObject jSONObject2, String str) throws JSONException {
        jSONObject2.put(str, jSONObject.optString(com.github.catvod.spider.merge.XI.f.a(bArr, bArr2)));
    }
}
