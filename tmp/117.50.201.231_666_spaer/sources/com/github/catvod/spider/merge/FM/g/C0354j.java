package com.github.catvod.spider.merge.FM.g;

import com.github.catvod.spider.merge.FM.a.C0298a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.g.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class C0354j {
    public static String a(String str, long j) {
        return str + j;
    }

    public static String b(String str, String str2) {
        return str + str2;
    }

    public static void c(byte[] bArr, byte[] bArr2, JSONObject jSONObject, JSONObject jSONObject2, String str) throws JSONException {
        jSONObject2.put(str, jSONObject.optString(C0298a.b(bArr, bArr2)));
    }
}
