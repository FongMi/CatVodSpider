package com.github.catvod.spider.merge.b;

import com.github.catvod.spider.merge.a.C0098a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final /* synthetic */ class v {
    public static void a(byte[] bArr, byte[] bArr2, StringBuilder sb, String str) {
        sb.append(C0098a.a(bArr, bArr2));
        sb.append(str);
    }

    public static void b(byte[] bArr, byte[] bArr2, JSONObject jSONObject, JSONObject jSONObject2, String str) throws JSONException {
        jSONObject2.put(str, jSONObject.optString(C0098a.a(bArr, bArr2)));
    }

    public static /* synthetic */ boolean c(Object obj) {
        return obj == null;
    }
}
