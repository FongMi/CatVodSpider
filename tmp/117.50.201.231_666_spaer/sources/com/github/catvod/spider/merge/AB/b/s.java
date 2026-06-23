package com.github.catvod.spider.merge.AB.b;

import com.google.gson.Gson;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class s {
    public static Object a(String str, Class cls) {
        return new Gson().fromJson(str, cls);
    }

    public static void b(byte[] bArr, byte[] bArr2, JSONObject jSONObject, JSONObject jSONObject2, String str) throws JSONException {
        jSONObject2.put(str, jSONObject.optString(com.github.catvod.spider.merge.AB.a.a.a(bArr, bArr2)));
    }
}
